package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.*;

public class PathMatcherTest01 {
    public static void main(String[] args) {
        Path path1 = Paths.get("pasta/subpasta/file.java");
        Path path2 = Paths.get("pasta/subpasta/file.txt");
        Path path3 = Paths.get("pasta/subpasta/file.jpeg");




        //resultado vai ser false por que um * desconsidera os diretorios
        matcher(path3, "glob:*.jpeg");
        //dois * considera todos os diretorios
        matcher(path3, "glob:**.jpeg");
        //da o mesmo resultado mas da pra alterar o * depois da / e continua ignorando todos os diretorios
        matcher(path3, "glob:**/*.jpeg");

        // aqui eh pra checar todos os arquivos dentro do {}
        matcher(path1, "glob:**/*.{jpeg, txt, java}"); // ele conta os espacos em branco entao cuidado
        matcher(path2, "glob:**/*.{jpeg,txt,java}");
        matcher(path3, "glob:**/*.{jpeg,txt,java}");

        //nao importa o tipo do arquivo contanto que ele tenha a quantidade de ???(no caso 3, voce pode colocar quantos quiser)
        matcher(path3, "glob:**/*.???");

        // voce pode trocar o * por qualquer nome para encontrar o arquivo
        matcher(path3, "glob:**/file.???");


    }

    private static void matcher(Path path, String glob){
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ":" + matcher.matches(path));
    }


}
