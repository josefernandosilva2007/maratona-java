package vamos;

import java.util.Scanner;

public class e03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vM = input.nextInt();
        for (int i = 1; i <= vM ; i++) {
            if (i > 25) break;
            System.out.println(i);
        }
    }
}
