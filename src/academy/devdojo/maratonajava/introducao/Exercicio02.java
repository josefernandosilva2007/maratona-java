package academy.devdojo.maratonajava.introducao;

public class Exercicio02 {
    public static void main(String[] args) {

        double salarioAnual = 80000;
        double taxas =0;
        String resultado = "Seu total de taxas eh ";
        if (salarioAnual <= 34712) {
            taxas = (salarioAnual * 0.970);
            taxas = taxas += salarioAnual;
        } else if (salarioAnual <= 68507) {
            taxas = (salarioAnual * 0.3735);
            taxas = taxas += salarioAnual;
        } else {
            taxas = (salarioAnual*0.4950);
            taxas = taxas += salarioAnual;
        }
        System.out.println(resultado + taxas);
    }
}
