package academy.devdojo.maratonajava.javacore.Minterface.domain;

public class FileLoader implements DataLoader, DataRemover{

    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo...");
    }

    @Override
    public void remover() {
        System.out.println("Removendo dados de um arquivo...");
    }
}
