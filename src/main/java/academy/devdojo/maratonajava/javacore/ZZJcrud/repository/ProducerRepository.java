package academy.devdojo.maratonajava.javacore.ZZJcrud.repository;

import academy.devdojo.maratonajava.javacore.ZZJcrud.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZJcrud.domain.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Log4j2
public class ProducerRepository {
    public static List<Producer> findByName(String nameSearch) {
        log.info("Finding producers by name '{}'", nameSearch);
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = preparedStatementFindByName(conn, nameSearch);
             ResultSet rs = ps.executeQuery()) {
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

    private static PreparedStatement preparedStatementFindByName(Connection conn, String name) throws SQLException {
        String sql = "SELECT producer_id, name FROM producer WHERE name LIKE ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, String.format("%%%s%%", name));
        return ps;
    }



    public static Optional<Producer> findById(Integer id) {
        log.info("Finding producers by id '{}'", id);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = preparedStatementFindById(conn, id);
             ResultSet rs = ps.executeQuery()) {
            if (!rs.next()) return Optional.empty();

            while (rs.next()) {
                return Optional.of(Producer.builder()
                        .producer_id(rs.getInt("producer_id"))
                        .name(rs.getString("name"))
                        .build());
            }

        } catch (SQLException e) {
            log.error("Error while trying to finding all producer", e);
        }
        return Optional.empty();
    }

    private static PreparedStatement preparedStatementFindById(Connection conn, Integer id) throws SQLException {
        String sql = "SELECT producer_id, name FROM producer WHERE name LIKE ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1,id);
        return ps;
    }



    public static void delete(int id) {
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = preparedStatementDelete(conn, id)) {
            ps.execute();
            log.info("Deleted producer '{}'", id);
        } catch (SQLException e) {
            log.error("Error while trying to delete producer '{}'", id, e);
        }
    }

    private static PreparedStatement preparedStatementDelete(Connection conn, Integer id) throws SQLException {
        String sql = "DELETE FROM `anime_store`.`producer` WHERE (`producer_id` = ?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }
    public static void save(Producer producer){
        log.info("Saving producer '{}'", producer);
        try(Connection conn = ConnectionFactory.getConnection();
        PreparedStatement ps = preparedStatementSave(conn, producer)){
        ps.execute();
        } catch (SQLException e) {
            log.error("Error trying to save producer '{}'",producer.getName(), e);
        }


    }

    private static PreparedStatement preparedStatementSave(Connection conn,Producer producer) throws SQLException {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES (?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, producer.getName());
        return ps;
    }


    public static void update(Producer producer) {
        log.info("Updating producer '{}'",producer);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = preparedStatementUpdate(conn,producer)) {
           ps.execute();
            log.info("Updated producer '{}'", producer.getProducer_id());
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
}
