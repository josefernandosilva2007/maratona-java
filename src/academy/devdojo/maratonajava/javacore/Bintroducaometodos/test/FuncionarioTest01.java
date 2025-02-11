package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Funcionario;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.MediaSalario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        MediaSalario mediaSalario = new MediaSalario();
        funcionario.setName("Haerin");
        funcionario.setAge(18);
        funcionario.setSalary(new double[]{5000,7000,20000});
        funcionario.imprime();






    }
}
