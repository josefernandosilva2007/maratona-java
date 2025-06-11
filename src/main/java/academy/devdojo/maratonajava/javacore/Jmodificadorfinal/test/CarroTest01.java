package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.test;

import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.domain.Carro;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.domain.Comprador;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        Comprador comp = new Comprador();
        c1.setName("Corsa");
        System.out.println(c1.getName());
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(c1.COMPRADOR);
        c1.COMPRADOR.setName("Guts");
        System.out.println(c1.COMPRADOR);
    }
}
