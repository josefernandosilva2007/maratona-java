package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTest01 {
    public static void main(String[] args) {
        Path fileZip = Paths.get("pasta/file.zip");
        Path filesToZip = Paths.get("pasta/subpasta1/subsubpasta1");
        zip(fileZip, filesToZip);
    }
    private static void zip(Path fileZip, Path filesToZip){
        try( ZipOutputStream zipStream=new ZipOutputStream(Files.newOutputStream(fileZip));
             DirectoryStream<Path> dirStream = Files.newDirectoryStream(filesToZip)) {

            for (Path path:dirStream){

                ZipEntry zipEntry = new ZipEntry(path.getFileName().toString());
                zipStream.putNextEntry(zipEntry);
                Files.copy(path, zipStream);

                zipStream.closeEntry();
            }


        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
