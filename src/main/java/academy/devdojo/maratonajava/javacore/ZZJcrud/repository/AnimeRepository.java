package academy.devdojo.maratonajava.javacore.ZZJcrud.repository;

import academy.devdojo.maratonajava.javacore.ZZJcrud.domain.Producer;
import academy.devdojo.maratonajava.javacore.ZZJcrud.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZJcrud.domain.Anime;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Log4j2
public class AnimeRepository {
    public static List<Anime> findByName(String nameSearch) {
        log.info("Finding producers by name '{}'", nameSearch);
        List<Anime> animes = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = preparedStatementFindByName(conn, nameSearch);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Producer producer = Producer.builder()
                        .name("producer_name")
                        .producer_id(rs.getInt("producer_id"))
                        .build();
                Anime anime = Anime.builder()
                        .id(rs.getInt("producer_id"))
                        .name(rs.getString("name"))
                        .episodes(rs.getInt("episodes"))
                        .producer(producer)
                        .build();
                animes.add(anime);
            }

        } catch (SQLException e) {
            log.error("Error while trying to finding all anime", e);
        }
        return animes;
    }

    private static PreparedStatement preparedStatementFindByName(Connection conn, String name) throws SQLException {
        String sql = """
                SELECT a.id,a.name,a.episodes,p.producer_id,p.name as "producer_name" FROM anime_store.anime a
                INNER JOIN anime_store.producer p on a.producer_id = p.producer_id
                WHERE a.name LIKE ?;
                """;
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, String.format("%%%s%%", name));
        return ps;
    }



    public static Optional<Anime> findById(Integer id) {
        log.info("Finding producers by id '{}'", id);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = preparedStatementFindById(conn, id);
             ResultSet rs = ps.executeQuery()) {
            if (!rs.next()) return Optional.empty();

            while (rs.next()) {
                Producer producer = Producer.builder()
                        .name("producer_name")
                        .producer_id(rs.getInt("producer_id"))
                        .build();
                Anime anime = Anime.builder()
                        .id(rs.getInt("producer_id"))
                        .name(rs.getString("name"))
                        .episodes(rs.getInt("episodes"))
                        .producer(producer)
                        .build();
                return Optional.of(anime);
            }

        } catch (SQLException e) {
            log.error("Error while trying to finding all anime", e);
        }
        return Optional.empty();
    }

    private static PreparedStatement preparedStatementFindById(Connection conn, Integer id) throws SQLException {
        String sql = """
                SELECT a.id,a.name,a.episodes,p.producer_id,p.name as "producer_name" FROM anime_store.anime a
                INNER JOIN anime_store.producer p on a.producer_id = p.producer_id
                WHERE a.id = ?;
                """;
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1,id);
        return ps;
    }



    public static void delete(int id) {
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = preparedStatementDelete(conn, id)) {
            ps.execute();
            log.info("Deleted anime '{}'", id);
        } catch (SQLException e) {
            log.error("Error while trying to delete anime '{}'", id, e);
        }
    }

    private static PreparedStatement preparedStatementDelete(Connection conn, Integer id) throws SQLException {
        String sql = "DELETE FROM `anime_store`.`anime` WHERE (`producer_id` = ?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }
    public static void save(Anime anime){
        log.info("Saving anime '{}'", anime);
        try(Connection conn = ConnectionFactory.getConnection();
        PreparedStatement ps = preparedStatementSave(conn, anime)){
        ps.execute();
        } catch (SQLException e) {
            log.error("Error trying to save anime '{}'",anime.getName(), e);
        }


    }

    private static PreparedStatement preparedStatementSave(Connection conn,Anime anime) throws SQLException {
        String sql = "INSERT INTO `anime_store`.`anime` (`name`, `episodes`, `producer_id`) VALUES (?, ?, ?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, anime.getName());
        ps.setInt(2, anime.getEpisodes());
        ps.setInt(3, anime.getProducer().getProducer_id());
        return ps;
    }


    public static void update(Anime anime) {
        log.info("Updating anime '{}'",anime);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = preparedStatementUpdate(conn,anime)) {
           ps.execute();
            log.info("Updated anime '{}'", anime.getId());
        } catch (SQLException e) {
            log.error("Error while trying to updated anime '{}'", anime.getId(), e);
        }
    }

    private static PreparedStatement preparedStatementUpdate(Connection conn, Anime anime) throws SQLException {
        String sql = "UPDATE `anime_store`.`anime` SET `name` = ?,`episodes` = ? WHERE (`producer_id` = ?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, anime.getName());
        ps.setInt(2, anime.getEpisodes());
        ps.setInt(3, anime.getId());
        return ps;
    }
}
