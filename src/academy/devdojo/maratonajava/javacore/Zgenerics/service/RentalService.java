package academy.devdojo.maratonajava.javacore.Zgenerics.service;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Carro;

import java.util.List;

public class RentalService<T> {
    private List<T> veiculosDisponiveis;

    public RentalService(List<T> veiculosDisponiveis) {
        this.veiculosDisponiveis = veiculosDisponiveis;
    }


    public T buscarVeiculoDisponivel(){
        System.out.println("Buscando veiculo...");
        T t = veiculosDisponiveis.remove(0);
        System.out.println("Alugando veiculo: " + t);
        System.out.println("Veiculos Disponiveis");
        System.out.println(veiculosDisponiveis);
        return t;
    }

    public void retornarVeiculo(T t){
        System.out.println("Devolvendo veiculo");
        veiculosDisponiveis.add(t);
        System.out.println("Veiculos Disponiveis");
        System.out.println(veiculosDisponiveis);
    }

}
