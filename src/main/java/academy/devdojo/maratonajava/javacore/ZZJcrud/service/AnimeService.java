package academy.devdojo.maratonajava.javacore.ZZJcrud.service;

import academy.devdojo.maratonajava.javacore.ZZJcrud.domain.Anime;
import academy.devdojo.maratonajava.javacore.ZZJcrud.domain.Producer;
import academy.devdojo.maratonajava.javacore.ZZJcrud.repository.AnimeRepository;
import lombok.extern.log4j.Log4j2;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

@Log4j2
public class AnimeService {
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
        List<Anime> animes = AnimeRepository.findByName(name);
        if (animes.isEmpty()) {
            System.out.printf("Not founded '%s'%n", name);
        }
        animes.forEach(p->System.out.printf("[%d] - %s%n",p.getId(),p.getName()));
    }

    private static void delete(){
        System.out.println("Delete anime by ID");
        int id = Integer.parseInt(SCANNER.nextLine());
        if (id <= 0){
            log.warn("Argument Invalid. Id must be > than 0");
            return;
        }
        System.out.println("Are you sure? Y/N");
        String choice = SCANNER.nextLine();
        if ("y".equalsIgnoreCase(choice)) {
            AnimeRepository.delete(id);
        } else  System.out.println("Nothing to delete");

    }

    private static void save(){
        System.out.println("Type the name of the anime");
        String name = SCANNER.nextLine();
        System.out.println("Type the number of the episodes");
        Integer episodes = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Type the id of the producer");
        int producerId = Integer.parseInt(SCANNER.nextLine());
        if (name.isEmpty()) return;
        Anime build = Anime.builder()
                .name(name)
                .episodes(episodes)
                .producer(Producer.builder().producer_id(producerId).build())
                .build();
        AnimeRepository.save(build);
    }

    private static void update(){
        System.out.println("Type the id of object you want to update");
        Optional<Anime> animeOptional = AnimeRepository.findById(Integer.parseInt(SCANNER.nextLine()));
        if (animeOptional.isEmpty()){
            System.out.println("Anime not Found");
            return;
        }
        Anime anime = animeOptional.get();
        System.out.println("Type the new name or enter to keep same");
        String name = SCANNER.nextLine();
        name = name.isEmpty() ? anime.getName() : name;
        System.out.println("Type the number of the episodes or enter to keep same");
        Integer episodes = Integer.parseInt(SCANNER.nextLine());
        episodes = episodes.toString().isEmpty() ? anime.getEpisodes() : episodes;
        System.out.println("Type the id of the producer or enter to keep same");
        Integer producerId = Integer.parseInt(SCANNER.nextLine());
        producerId = producerId.toString().isEmpty() ? anime.getProducer().getProducer_id() : producerId;
        Anime build = Anime.builder()
                .name(name)
                .episodes(episodes)
                .producer(Producer.builder().producer_id(producerId).build())
                .build();
        AnimeRepository.update(build);


    }
}
