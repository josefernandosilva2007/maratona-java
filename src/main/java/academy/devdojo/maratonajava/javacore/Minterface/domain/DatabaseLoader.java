package academy.devdojo.maratonajava.javacore.Minterface.domain;

public class DatabaseLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Carregando dados no banco de dados...");
    }

    @Override
    public void remover() {
        System.out.println("Removendo dados no banco de dados...");
    }
}
