package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Carro;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.CarroRentavelService;

public class ClassesGenericasTest01 {
    public static void main(String[] args) {
        CarroRentavelService cr = new CarroRentavelService();
        Carro carro = cr.buscarCarroDisponivel();
        System.out.println("Usando...");
        cr.retornarCarro(carro);

    }
}
