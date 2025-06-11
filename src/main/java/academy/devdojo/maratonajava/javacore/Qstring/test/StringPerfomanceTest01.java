package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringPerfomanceTest01 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concat(100_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto: "+ (fim-inicio)+ "ms");


        long inicioSb = System.currentTimeMillis();
        concatStringBuilder(100_000);
        long fimSb = System.currentTimeMillis();
        System.out.println("Tempo gasto: "+ (fimSb-inicioSb)+ "ms");
    }

    public static void concat(int tamanho){
        String texto = "";
        for (int i = 0; i <= tamanho ; i++) {
            texto += i;
        }
    }
    public static void concatStringBuilder(int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i <= tamanho ; i++) {
            sb.append(i);
        }
    }
    public static void concatStringBuffer(int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i <= tamanho ; i++) {
            sb.append(i);
        }
    }
}
