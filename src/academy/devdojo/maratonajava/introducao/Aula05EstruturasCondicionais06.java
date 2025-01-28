package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
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

        //outra maneira de se fazer
        switch (day){
            case 1:
            case 7:
                resultado = finalDeSemana;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                resultado = diaUtil;
                break;
        }
        System.out.println(resultado);
    }
}
