package academy.devdojo.maratonajava.javacore.Wnio.test;


import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

import static academy.devdojo.maratonajava.javacore.Wnio.test.PathMatcherTest02.matcher;

class ListTestFiles extends SimpleFileVisitor<Path>{

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        String regex = "glob:**Test*.{java,class}";

        if (matcher(file, regex)) {
            System.out.println(file.getFileName());
        }

        return FileVisitResult.CONTINUE;
    }
}

public class PathMatcherTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get(".");
        Files.walkFileTree(path, new ListTestFiles());
    }

    public static boolean matcher(Path path, String glob){
        PathMatcher match = FileSystems.getDefault().getPathMatcher(glob);
        boolean matchResult = match.matches(path);
        return matchResult;
    }
}
