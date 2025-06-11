package academy.devdojo.maratonajava.introducao;

import java.sql.SQLOutput;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] nums = new int[3];
        int[] num2 = {1,2,20,30};
        int[] nums3 = new int[]{1,2,4};

        for (int i = 0; i < nums3.length ; i++) {
            System.out.println(nums3[i]);

        }
        for(int num: nums3){
            System.out.println(num);
        }
    }
}
