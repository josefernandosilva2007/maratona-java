package academy.devdojo.maratonajava.javacore.Minterface.domain;

public interface DataLoader {
    void load();
    default void checkPermission(){
        System.out.println("Checando permissao");
    }
}
