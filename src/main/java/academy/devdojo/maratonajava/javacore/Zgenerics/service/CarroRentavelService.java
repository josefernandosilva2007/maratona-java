package academy.devdojo.maratonajava.javacore.Zgenerics.service;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {
    private List<Carro> carroDisponivel = new ArrayList<>(List.of(new Carro("Golf"), new Carro("Parati")));


    public Carro buscarCarroDisponivel(){
        System.out.println("Buscando carro...");
        Carro carro = carroDisponivel.remove(0);
        System.out.println("Alugando carro: " + carro);
        System.out.println("Carros Disponiveis");
        System.out.println(carroDisponivel);
        return carro;
    }

    public void retornarCarro(Carro carro){
        System.out.println("Devolvendo Carro");
        carroDisponivel.add(carro);
        System.out.println("Carros Disponiveis");
        System.out.println(carroDisponivel);
    }
}
