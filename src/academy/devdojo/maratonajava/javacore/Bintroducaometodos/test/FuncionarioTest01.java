package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Funcionario;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.MediaSalario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        MediaSalario mediaSalario = new MediaSalario();
        funcionario.name ="Jose Fernando";
        funcionario.age = 18;
        funcionario.salary = new double[]{1450,2000,3450};
        funcionario.imprime();
        System.out.println("---------------");
        mediaSalario.mediaSalario(funcionario.salary);




    }
}
