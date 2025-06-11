package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro do IndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("Dentro do IllegalArgumentException");
        } catch (IllegalAccessError e) {
            System.out.println("Dentro do IllegalAccessError");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
        }
        try {
            Exception();
        } catch (Exception e) {

        }

    }

    private static void Exception() throws SQLException, FileNotFoundException {

    }

}
