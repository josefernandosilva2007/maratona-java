package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String directory = "home/fernando/dev";
        String arquivoTxt = "../../arquivo.txt";
        Path p1 = Paths.get(directory, arquivoTxt);
        System.out.println(p1);
        System.out.println(p1.normalize());

        Path p2 = Paths.get("home/./fernando/./dev");
        System.out.println(p2);
        System.out.println(p2.normalize());

        }
}
