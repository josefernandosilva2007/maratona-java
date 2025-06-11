package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDiretory = new File("pasta");
        boolean isDiretoryCreated = fileDiretory.mkdir();
        System.out.println(isDiretoryCreated);
        File file = new File(fileDiretory, "arquivo.txt");
        boolean isFileCreated = file.createNewFile();
        System.out.println(isFileCreated);

        File fileRenamed = new File(fileDiretory,"arquivo_renomeado.txt");
        boolean isFileRenamed = file.renameTo(fileRenamed);
        System.out.println(isFileRenamed);

        File diretoryRenamed = new File("pasta2");
        boolean isDiretoryRenamed = fileDiretory.renameTo(diretoryRenamed);
        System.out.println(isDiretoryRenamed);


    }
}
