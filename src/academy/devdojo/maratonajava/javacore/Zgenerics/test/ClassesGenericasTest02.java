package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Carro;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClassesGenericasTest02 {
    public static void main(String[] args) {
        List<Carro> carroDisponivel = new ArrayList<>(List.of(new Carro("Golf"), new Carro("Parati")));
        RentalService<Carro> rentalService = new RentalService<>(carroDisponivel);
        Carro carro = rentalService.buscarVeiculoDisponivel();
        System.out.println("Usando...");
        rentalService.retornarVeiculo(carro);
    }
}
