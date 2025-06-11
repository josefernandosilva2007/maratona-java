package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain.Carro;

public class CarroTest01 {



    public static void main(String[] args) {


        Carro c1 = new Carro("BMW",300);
        Carro c2 = new Carro("FERRARI", 275);
        Carro c3 = new Carro("NISSAN", 255);

        Carro.setSpeedLimit(176);
        c1.imprime();
        c2.imprime();
        c3.imprime();

    }
}
