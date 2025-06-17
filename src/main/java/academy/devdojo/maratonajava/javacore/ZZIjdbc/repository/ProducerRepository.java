package academy.devdojo.maratonajava.javacore.ZZIjdbc.repository;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.domain.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


@Log4j2
public class ProducerRepository {
    public static void save(Producer producer) {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s')".formatted(producer.getName());
        try (Connection conn = ConnectionFactory.getConnection();
             Statement smt = conn.createStatement()) {
            int rows = smt.executeUpdate(sql);
            log.info("Insert producer '{}' Rows Affected {}", producer.getName(), rows);
        } catch (SQLException e) {
            log.error("Error while trying to insert producer '{}'", producer.getName(), e);
        }
    }

    public static void saveTransaction(List<Producer> producers) {
        try (Connection conn = ConnectionFactory.getConnection()) {
            conn.setAutoCommit(false);
            preparedStatementSaveTransaction(conn, producers);
            conn.commit();
        } catch (SQLException e) {
            log.error("Error while trying to updated producer '{}'", producers, e);
        }
    }

    private static void preparedStatementSaveTransaction(Connection conn, List<Producer> producers) throws SQLException {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES (?);";

        for (Producer p : producers){
            try(PreparedStatement ps = conn.prepareStatement(sql);){
                log.info("Save Producer: '{}'",p);
                ps.setString(1, p.getName());
                ps.execute();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }

    public static void delete(int id) {
        String sql = "DELETE FROM `anime_store`.`producer` WHERE (`producer_id` = '%d');".formatted(id);
        try (Connection conn = ConnectionFactory.getConnection();
             Statement smt = conn.createStatement()) {
            int rows = smt.executeUpdate(sql);
            log.info("Deleted producer '{}' Rows Affected {}", id, rows);
        } catch (SQLException e) {
            log.error("Error while trying to delete producer '{}'", id, e);
        }
    }

    public static void update(Producer producer) {
        String sql = "UPDATE `anime_store`.`producer` SET `name` = '%s' WHERE (`producer_id` = '%d');"
                .formatted(producer.getName(), producer.getProducer_id());
        try (Connection conn = ConnectionFactory.getConnection();
             Statement smt = conn.createStatement()) {
            int rows = smt.executeUpdate(sql);
            log.info("Updated producer '{}' Rows Affected {}", producer.getProducer_id(), rows);
        } catch (SQLException e) {
            log.error("Error while trying to updated producer '{}'", producer.getProducer_id(), e);
        }
    }



    public static void updatePreparedStatement(Producer producer) {
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = preparedStatementUpdate(conn,producer)) {
            int rows = ps.executeUpdate();
            log.info("Updated producer '{}' Rows Affected {}", producer.getProducer_id(), rows);
        } catch (SQLException e) {
            log.error("Error while trying to updated producer '{}'", producer.getProducer_id(), e);
        }
    }

    private static PreparedStatement preparedStatementUpdate(Connection conn, Producer producer) throws SQLException {
        String sql = "UPDATE `anime_store`.`producer` SET `name` = ? WHERE (`producer_id` = ?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, producer.getName());
        ps.setInt(2, producer.getProducer_id());
        return ps;
    }

    public static List<Producer> findAll() {
        log.info("Finding All producers");
        return findByName("");

//        String sql = "SELECT producer_id,name FROM producer;";
//        List<Producer> producers = new ArrayList<>();
//
//        try(Connection conn = ConnectionFactory.getConnection();
//            Statement smt = conn.createStatement();
//            ResultSet rs = smt.executeQuery(sql)){
//            while (rs.next()){
//                Producer producer = Producer.builder()
//                        .producer_id(rs.getInt("producer_id"))
//                        .name(rs.getString("name"))
//                        .build();
//                producers.add(producer);
//            }
//
//        } catch (SQLException e) {
//            log.error("Error while trying to finding all producer");
//        }
//        return producers;
    }

    public static List<Producer> findByName(String nameSearch) {
        log.info("Finding producers by name");
        String sql = "SELECT producer_id, name FROM producer WHERE name LIKE '%%%s%%';"
                .formatted(nameSearch);
        List<Producer> producers = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection();
             Statement smt = conn.createStatement();
             ResultSet rs = smt.executeQuery(sql)) {
            while (rs.next()) {
                Producer producer = Producer.builder()
                        .producer_id(rs.getInt("producer_id"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);
            }

        } catch (SQLException e) {
            log.error("Error while trying to finding all producer", e);
        }
        return producers;
    }

    public static void showProducerMetaData() {
        log.info("Showing Producer Metadata");
        String sql = "SELECT * FROM producer;";
        try (Connection conn = ConnectionFactory.getConnection();
             Statement smt = conn.createStatement();
             ResultSet rs = smt.executeQuery(sql)) {
            ResultSetMetaData rsMetaData = rs.getMetaData();
            int columnCount = rsMetaData.getColumnCount();
            log.info("Columns count '{}'", columnCount);
            for (int i = 1; i <= columnCount; i++) {
                log.info("Table name '{}'", rsMetaData.getTableName(i));
                log.info("Column name '{}'", rsMetaData.getColumnName(i));
                log.info("Column size '{}'", rsMetaData.getColumnDisplaySize(i));
                log.info("Column type '{}'", rsMetaData.getColumnTypeName(i));

            }


        } catch (SQLException e) {
            log.error("Error while trying to finding all producer", e);
        }
    }

    public static void showDriverMetaData() {
        log.info("Showing Driver MetaData");
        try (Connection conn = ConnectionFactory.getConnection()) {
            DatabaseMetaData dbMetaData = conn.getMetaData();
            if (dbMetaData.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
                log.info("SUPPORTS TYPE_FORWARD_ONLY");
                if (dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
                    log.info(" AND SUPPORTS CONCUR_UPDATABLE");
                }
            }
            if (dbMetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
                log.info("SUPPORTS TYPE_SCROLL_INSENSITIVE");
                if (dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    log.info(" AND SUPPORTS CONCUR_UPDATABLE");
                }
            }
            if (dbMetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {
                log.info("SUPPORTS TYPE_SCROLL_SENSITIVE");
                if (dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    log.info(" AND SUPPORTS CONCUR_UPDATABLE");
                }
            }
        } catch (SQLException e) {
            log.error("Error while trying to finding all producer", e);
        }
    }

    public static void showTypeScrollWorking() {
        String sql = "SELECT * FROM producer;";
        try (Connection conn = ConnectionFactory.getConnection();
             Statement smt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = smt.executeQuery(sql)) {
            log.info("Last row? '{}'", rs.last());
            log.info("Row number? '{}'", rs.getRow());
            log.info(Producer.builder()
                    .producer_id(rs.getInt("producer_id"))
                    .name(rs.getString("name"))
                    .build());
            log.info("First row? '{}'", rs.first());
            log.info("Row number? '{}'", rs.getRow());
            log.info(Producer.builder()
                    .producer_id(rs.getInt("producer_id"))
                    .name(rs.getString("name"))
                    .build());


        } catch (SQLException e) {
            log.error("Error while trying to finding all producer", e);
        }
    }

    public static List<Producer> findByNameAndUpdateToUpperCase(String nameSearch) {
        log.info("Finding producers by name");
        String sql = "SELECT producer_id, name FROM producer WHERE name LIKE '%%%s%%';"
                .formatted(nameSearch);
        List<Producer> producers = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection();
             Statement smt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = smt.executeQuery(sql)) {
            while (rs.next()) {
                rs.updateString("name", rs.getString("name").toUpperCase());
                rs.updateRow();
                Producer producer = Producer.builder()
                        .producer_id(rs.getInt("producer_id"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);
            }

        } catch (SQLException e) {
            log.error("Error while trying to finding all producer", e);
        }
        return producers;
    }

    public static List<Producer> findByNameAndInsertWhenNotFound(String nameSearch) {
        log.info("Finding producers by name");
        String sql = "SELECT producer_id, name FROM producer WHERE name LIKE '%%%s%%';"
                .formatted(nameSearch);
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             Statement smt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = smt.executeQuery(sql)) {
            if (rs.next()) return producers;
            insertNewProducer(nameSearch, rs);
            producers.add(getProducer(rs));

        } catch (SQLException e) {
            log.error("Error while trying to finding all producer", e);
        }
        return producers;
    }

    public static void findByNameAndDelete(String nameSearch) {
        log.info("Finding producers by name");
        String sql = "SELECT producer_id, name FROM producer WHERE name LIKE '%%%s%%';"
                .formatted(nameSearch);
        try (Connection conn = ConnectionFactory.getConnection();
             Statement smt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = smt.executeQuery(sql)) {
            while (rs.next()) {
                log.info("Deleting '{}'", rs.getString("name"));
                rs.deleteRow();
            }

        } catch (SQLException e) {
            log.error("Error while trying to finding all producer", e);
        }
    }


    public static List<Producer> findByNamePreparedStatement(String nameSearch) {
        log.info("Finding producers by name");
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = preparedStatementFindByName(conn,nameSearch);
             ResultSet rs = ps.executeQuery()){
            while (rs.next()) {
                Producer producer = Producer.builder()
                        .producer_id(rs.getInt("producer_id"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);
            }

        } catch (SQLException e) {
            log.error("Error while trying to finding all producer", e);
        }
        return producers;
    }
    public static List<Producer> findByNameCallableStatement(String nameSearch) {
        log.info("Finding producers by name");
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = callableStatementFindByName(conn,nameSearch);
             ResultSet rs = ps.executeQuery()){
            while (rs.next()) {
                Producer producer = Producer.builder()
                        .producer_id(rs.getInt("producer_id"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);
            }

        } catch (SQLException e) {
            log.error("Error while trying to finding all producer", e);
        }
        return producers;
    }

    private static CallableStatement callableStatementFindByName(Connection conn, String name) throws SQLException {
        String sql = "CALL `anime_store`.`sp_getProducer_byName`(?);";
        CallableStatement cs = conn.prepareCall(sql);
        cs.setString(1, String.format("%%%s%%", name));
        return cs;
    }
    private static PreparedStatement preparedStatementFindByName(Connection conn, String name) throws SQLException {
        String sql = "SELECT producer_id, name FROM producer WHERE name LIKE ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, "%" + name + "%");
        return ps;
    }

    private static void insertNewProducer(String nameSearch, ResultSet rs) throws SQLException {
        rs.moveToInsertRow();
        rs.updateString("name", nameSearch);
        rs.insertRow();
    }

    private static Producer getProducer(ResultSet rs) throws SQLException {
        rs.beforeFirst();
        rs.next();
        return Producer.builder()
                .producer_id(rs.getInt("producer_id"))
                .name(rs.getString("name"))
                .build();
    }
}
