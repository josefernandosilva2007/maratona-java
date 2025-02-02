package academy.devdojo.maratonajava.introducao;

import java.sql.SQLOutput;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros2 = {1,2,20,30};
        int[] numeros3 = new int[]{1,2,4};

        for (int i = 0; i < numeros3.length ; i++) {
            System.out.println(numeros3[i]);

        }
        for(int num: numeros3){
            System.out.println(num);
        }
    }
}
