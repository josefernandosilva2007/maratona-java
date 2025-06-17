package academy.devdojo.maratonajava.javacore.ZZIjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.domain.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;
import java.util.Scanner;

@Log4j2
public class ConnectionFactoryTest01 {

    public static void main(String[] args) {
        // Nome do producer
//        Scanner input = new Scanner(System.in);
//        System.out.println("DIGITA O PRODUCER");
//        String s = input.nextLine();
//        // Construindo um Producer
//        Producer producer = Producer.builder()
//                .name(s)
//                .build();

//        Producer producerToUpdate = Producer.builder().producer_id(1).name("BONES").build();
//        ProducerService.save(producer);
//        ProducerService.delete(0);
//        ProducerService.update(producerToUpdate);

//        List<Producer> all = ProducerService.findAll();
//        log.info("Producers '{}'", all);
//        List<Producer> findByName = ProducerService.findByName(s);
//        log.info("Producers '{}'", findByName);

//        ProducerService.showProducerMetaData();
//        ProducerService.showDriverMetaData();
//        ProducerService.showTypeScrollWorking();
//        ProducerService.findByNameAndUpdateToUpperCase(s);
//        List<Producer> producers = ProducerService.findByNameAndInsertWhenNotFound(s);
//        log.info("Producers '{}'", producers);
//        ProducerService.findByNameAndDelete(s);

//        ProducerService.updatePreparedStatement(producerToUpdate);
        List<Producer> producers = ProducerService.findByNameCallableStatement("K");
        log.info("Producers '{}'", producers);

    }
}
