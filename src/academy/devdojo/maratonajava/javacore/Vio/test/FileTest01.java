package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.text");
        try {
            System.out.println("Created " +file.createNewFile());
            System.out.println("Path " + file.getPath());
            System.out.println("AbsolutePath " + file.getAbsolutePath());
            System.out.println("Is Directory " + file.isDirectory());
            System.out.println("Is File " + file.isFile());
            System.out.println("Is Hidden " + file.isHidden());
            System.out.println("last modified " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()).toLocalDate() );
            if (file.exists()){
                System.out.println("Deleted " +file.delete());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
