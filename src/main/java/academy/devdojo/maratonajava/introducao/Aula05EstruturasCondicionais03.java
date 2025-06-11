package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 7;
        String possoDoar = "Dale ";
        String naoPossoDoar= "que pena";
        String resultado = salario > 5000 ? possoDoar : naoPossoDoar;

        System.out.println(resultado);
    }
}
