package academy.devdojo.maratonajava.javacore.ZZIjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.domain.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.service.ProducerServiceRowSet;
import lombok.extern.log4j.Log4j2;

import java.util.List;


@Log4j2
public class ConnectionFactoryTest02 {
    public static void main(String[] args) {


        Producer producerToUpdate = Producer.builder().producer_id(1).name("MADHOUSE").build();
        ProducerServiceRowSet.updateRowSet(producerToUpdate);
        log.info("-------------------------------------");
//        List<Producer> producer = ProducerServiceRowSet.findByNameRowSet("");
//        log.info("Producers founded '{}'", producer);
        ProducerServiceRowSet.updateCachedRowSet(producerToUpdate);


    }
}
