package academy.devdojo.maratonajava.javacore.ZZIjdbc.repository;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.domain.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.listener.CustowRowSetListener;
import lombok.extern.log4j.Log4j2;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


@Log4j2
public class ProducerRepositoryRowSet {

    public static List<Producer> findByNameJdbcRowSet(String name){
        String sql = "SELECT producer_id, name FROM producer WHERE name LIKE ?;";
        List<Producer> producers = new ArrayList<>();
        try(JdbcRowSet jrs = ConnectionFactory.getJdbcRowSet()){
            jrs.addRowSetListener(new CustowRowSetListener());
            jrs.setCommand(sql);
            jrs.setString(1, String.format("%%%s%%", name));
            jrs.execute();
            while(jrs.next()){
                Producer producer = Producer.builder()
                        .producer_id(jrs.getInt("producer_id"))
                        .name(jrs.getString("name"))
                        .build();
                producers.add(producer);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return producers;
    }

//    public static void updateJdbcRowSet(Producer producer){
//        String sql = "UPDATE `anime_store`.`producer` SET `name` = ? WHERE (`producer_id` = ?);";
//
//        try(JdbcRowSet jrs = ConnectionFactory.getJdbcRowSet()){
//            jrs.setCommand(sql);
//            jrs.setString(1, producer.getName());
//            jrs.setInt(1, producer.getProducer_id());
//            jrs.execute();
//
//        }catch (SQLException e){
//            e.printStackTrace();
//        }
//    }

    public static void updateJdbcRowSet(Producer producer){
        String sql = "SELECT * FROM producer WHERE (`producer_id` = ?);";

        try(JdbcRowSet jrs = ConnectionFactory.getJdbcRowSet()){
            jrs.addRowSetListener(new CustowRowSetListener());
            jrs.setCommand(sql);
            jrs.setInt(1, producer.getProducer_id());
            jrs.execute();
            if (!jrs.next()) return;
            jrs.updateString("name", producer.getName());
            jrs.updateRow();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static void updateCachedRowSet(Producer producer){
        String sql = "SELECT * FROM producer WHERE (`producer_id` = ?);";

        try(CachedRowSet crs = ConnectionFactory.getCachedRowSet()
        ;Connection conn = ConnectionFactory.getConnection()){
            conn.setAutoCommit(false);
            crs.setCommand(sql);
            crs.setInt(1, producer.getProducer_id());
            crs.execute(conn);
            if (!crs.next()) return;
            crs.updateString("name", producer.getName());
            crs.updateRow();
            crs.acceptChanges();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
