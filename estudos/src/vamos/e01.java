package vamos;

public class e01 {
    public static void main(String[] args) {
        int[] s = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int indice = binario(s, 6);
        System.out.println(indice + 1);
    }

    private static int binario(int[] s, int x) {
        int meio = 0;
        int inicio, fim;
        inicio = 0;
        fim = s.length - 1;
        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (s[meio] == x) {
                return meio;
            } else if (s[meio] < x) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return 0;
    }
}
