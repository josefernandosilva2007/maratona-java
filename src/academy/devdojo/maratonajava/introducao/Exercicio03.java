package academy.devdojo.maratonajava.introducao;

public class Exercicio03 {
    public static void main(String[] args) {
        int day = 1;
        String finalDeSemana = "Final de Semana";
        String diaUtil = "Dia Util";
        String resultado= "";

        switch (day) {
            case 1:
                resultado = finalDeSemana;
                break;
            case 2:
                resultado = diaUtil;
                break;
            case 3:
                resultado = diaUtil;
                break;
            case 4:
                resultado = diaUtil;
                break;
            case 5:
                resultado = diaUtil;
                break;
            case 6:
                resultado = diaUtil;
                break;
            case 7:
                resultado = finalDeSemana;
                break;
            default:
                System.out.println("Invalido");

        }
        System.out.println(resultado);
    }
}
