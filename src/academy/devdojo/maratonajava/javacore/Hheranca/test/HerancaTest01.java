package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.domain.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.domain.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setCep("07179-098");
        endereco.setRua("Rua 9");
        Pessoa pessoa = new Pessoa();
        pessoa.setName("Annie Leonhart");
        pessoa.setCpf("111221212-32");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario();
        funcionario.setName("Shikamaru Nara");
        funcionario.setCpf("112121212121-121");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(1000);
        funcionario.imprime();
    }
}
