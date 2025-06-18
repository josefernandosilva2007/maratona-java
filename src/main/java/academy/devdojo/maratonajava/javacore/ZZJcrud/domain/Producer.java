package academy.devdojo.maratonajava.javacore.ZZJcrud.domain;

import lombok.Builder;
import lombok.Value;


@Value // deixa imutavel
@Builder // adiciona um builder
public class Producer {
    Integer producer_id;
    String name;

}
