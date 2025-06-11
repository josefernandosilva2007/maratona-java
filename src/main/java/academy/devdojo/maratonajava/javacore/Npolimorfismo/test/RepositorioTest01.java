package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repository.Repository;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.service.RepositorioArquivo;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.service.RepositorioBancoDeDados;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.service.RepositorioMemoria;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RepositorioTest01 {
    public static void main(String[] args) {
        Repository repository = new RepositorioMemoria();
        repository.salvar();
        List<String> list = new LinkedList<>();
        list.add("Bulma");
        list.add("Sakura");
        list.add("Hinata");
        list.add("Yor");
        System.out.println(list);
    }
}
