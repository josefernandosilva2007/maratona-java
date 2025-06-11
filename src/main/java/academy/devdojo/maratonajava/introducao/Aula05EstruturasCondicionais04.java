package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        int dia = 10;
        char sexo ='M';
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Seg");
                break;
            case 3:
                System.out.println("Ter");
                break;
            case 4:
                System.out.println("Qua");
                break;
            case 5:
                System.out.println("Qui");
                break;
            case 6:
                System.out.println("Sex");
                break;
            case 7:
                System.out.println("Sab");
                break;
            default:
                System.out.println("Opcao Invalida");
                break;
        }
        switch (sexo){
            case 'M' :
                System.out.println("Homem");
                break;
            case 'F' :
                System.out.println("Mulher");
                break;
            default:
                System.out.println("Invalido");
                break;
        }
    }
}
