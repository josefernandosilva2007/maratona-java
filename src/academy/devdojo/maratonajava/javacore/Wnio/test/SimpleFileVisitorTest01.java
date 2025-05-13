package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;


class ListJavaFiles extends SimpleFileVisitor<Path> {


    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {

        if (file.toString().endsWith(".java")) {
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }


}


public class SimpleFileVisitorTest01 {
    public static void main(String[] args) throws IOException {
        ListAllFiles list = new ListAllFiles();


        Path path = Paths.get(".");
        Files.walkFileTree(path, list);


    }
}
