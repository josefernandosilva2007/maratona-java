package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {

        //IF tem que recebre boolean (true or false)

        int idade = 17;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // ! negacao
        if (isAutorizadoComprarBebida) {
            System.out.println("Maior de Idade");
        } else {
            System.out.println("Menor de Idade");
        }


        if (!isAutorizadoComprarBebida) {
            System.out.println("Menor de Idade");
        }

        boolean c = false;
        if (c = true) {
            System.out.println("Jamais fazer isso");
        }
    }
}
