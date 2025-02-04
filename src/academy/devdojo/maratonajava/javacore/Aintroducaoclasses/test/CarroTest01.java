package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 =new Carro();

        carro.name = "Corsa";
        carro.marca = "Chevrolet";
        carro.ano = 2010;

        carro2.name = "Uno";
        carro2.marca = "Fiat";
        carro2.ano = 2000;

        System.out.println("----Primeiro carro-----");
        System.out.println( "Name: "  +carro.name);
        System.out.println(  "Marca: " +carro.marca);
        System.out.println( "Ano: " +carro.ano);


        System.out.println("----Segundo carro-----");
        System.out.println("Name: " + carro2.name);
        System.out.println("Marca: " + carro2.marca);
        System.out.println("Ano: " + carro2.ano);


    }
}
