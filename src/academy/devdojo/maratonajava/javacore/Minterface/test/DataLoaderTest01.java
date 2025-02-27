package academy.devdojo.maratonajava.javacore.Minterface.test;

import academy.devdojo.maratonajava.javacore.Minterface.domain.DatabaseLoader;
import academy.devdojo.maratonajava.javacore.Minterface.domain.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        databaseLoader.remover();
        fileLoader.load();
        fileLoader.remover();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();
    }
}
