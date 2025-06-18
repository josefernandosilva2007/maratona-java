package academy.devdojo.maratonajava.javacore.ZZJcrud.service;

import academy.devdojo.maratonajava.javacore.ZZJcrud.domain.Producer;
import academy.devdojo.maratonajava.javacore.ZZJcrud.repository.ProducerRepository;
import lombok.extern.log4j.Log4j2;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;
@Log4j2
public class ProducerService {
        private static final Scanner SCANNER = new Scanner(System.in);


        public static void menu(int op){
            switch (op) {
                case 1 -> findByName();
                case 2 -> delete();
                case 3 -> save();
                case 4 -> update();
                default -> throw new IllegalArgumentException("Invalid option");
            }
        }

    private static void findByName(){
        System.out.println("Type name or empty to all");
        String name = SCANNER.nextLine();
        List<Producer> producers = ProducerRepository.findByName(name);
        if (producers.isEmpty()) {
            System.out.printf("Not founded '%s'%n", name);
        }
        producers.forEach(p->System.out.printf("[%d] - %s%n",p.getProducer_id(),p.getName()));
    }

    private static void delete(){
        System.out.println("Delete producer by ID");
        int id = Integer.parseInt(SCANNER.nextLine());
        if (id <= 0){
            log.warn("Argument Invalid. Id must be > than 0");
            return;
        }
        System.out.println("Are you sure? Y/N");
        String choice = SCANNER.nextLine();
        if ("y".equalsIgnoreCase(choice)) {
            ProducerRepository.delete(id);
        } else  System.out.println("Nothing to delete");

    }

    private static void save(){
        System.out.println("Type the name of the producer");
        String name = SCANNER.nextLine();
        if (name.isEmpty()) return;
        Producer build = Producer.builder().name(name).build();
        ProducerRepository.save(build);

    }

    private static void update(){
        System.out.println("Type the id of object you want to update");
        Optional<Producer> producerOptional = ProducerRepository.findById(Integer.parseInt(SCANNER.nextLine()));
        if (producerOptional.isEmpty()){
            System.out.println("Producer not Found");
            return;
        }
        Producer producer = producerOptional.get();
        System.out.println("Type the new name or enter to keep same");
        String name = SCANNER.nextLine();
        name = name.isEmpty() ? producer.getName() : name;
        Producer build = Producer.builder().producer_id(producer.getProducer_id()).name(name).build();
        ProducerRepository.update(build);


    }
}
