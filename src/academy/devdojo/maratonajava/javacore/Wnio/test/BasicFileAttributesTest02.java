package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta2/new.txt");

        BasicFileAttributes basic = Files.readAttributes(path, BasicFileAttributes.class);
        FileTime creationTime = basic.creationTime();
        FileTime lastModifiedTime = basic.lastModifiedTime();
        FileTime lastAccessTime = basic.lastAccessTime();

        System.out.println("creationTime      "+ creationTime);
        System.out.println("lastModifiedTime  "+ lastModifiedTime);
        System.out.println("lastAccessTime    "+ lastAccessTime);


        BasicFileAttributeView view = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime current = FileTime.fromMillis(System.currentTimeMillis());
        view.setTimes(lastModifiedTime,current,creationTime);
        creationTime = view.readAttributes().creationTime();
        lastModifiedTime = view.readAttributes().lastModifiedTime();
        lastAccessTime = view.readAttributes().lastAccessTime();

        System.out.println("-------VIEW-----------");

        System.out.println("creationTime      "+ creationTime);
        System.out.println("lastModifiedTime  "+ lastModifiedTime);
        System.out.println("lastAccessTime    "+ lastAccessTime);


    }
}
