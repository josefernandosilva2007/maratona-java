package academy.devdojo.maratonajava.javacore.ZZIjdbc.domain;

import lombok.Builder;
import lombok.Value;

import java.util.Objects;



@Value // deixa imutavel
@Builder // adiciona um builder


public class Producer {
    Integer producer_id;
    String name;

}
