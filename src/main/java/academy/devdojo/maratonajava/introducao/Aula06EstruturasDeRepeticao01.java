package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        int count1 = 0;
        int count2 = 0;
        while (count1 < 10) {
            System.out.println("Dentro do While n:" + ++count1);

        }

        do {
            System.out.println("Dentro do do-while n: " + ++count2);
        } while (count2 < 10);

        for (int i=1;i<=10;++i){
            System.out.println("For n: "+ i);
        }
    }
}
