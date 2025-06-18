package academy.devdojo.maratonajava.javacore.ZZIjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.domain.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.service.ProducerService;

import java.util.List;

public class ConnectionFactoryTest03 {
    public static void main(String[] args) {
        Producer p1 = Producer.builder().name("Toei").build();
        Producer p2 = Producer.builder().name("Wit").build();
        Producer p3 = Producer.builder().name("White Fox").build();
        ProducerService.saveTransaction(List.of(p1,p2,p3));
    }
}
