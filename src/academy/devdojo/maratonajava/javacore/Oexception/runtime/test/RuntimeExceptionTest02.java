package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        division(10,5);


    }

    /**
     *
     * @param a
     * @param b
     * @return a/b
     * @throws IllegalArgumentException se b for 0
     */
    private static int division(int a, int b){
        if (b == 0){
            throw new IllegalArgumentException("Argumento Invalido");
        }
        return a/b;
    }
}
