package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        abreConexao2();

    }

    private static String abreConexao(){
        try{
            System.out.println("Abrindo Arquivo");
            System.out.println("Escrevendo dados no Arquivo");
            return "Conexao Aberta";
        }catch (RuntimeException e){
            e.printStackTrace();
        }finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
        return null;
    }

    private static String abreConexao2(){
        try{
            System.out.println("Abrindo Arquivo");
            System.out.println("Escrevendo dados no Arquivo");
            throw new RuntimeException();
        }finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
    }
}

