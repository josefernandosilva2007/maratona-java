package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(10+15);
    }

    public void subtraiDoisNumeros(){
        System.out.println(50-5);
    }

    public void multiplicaDoisNumeros(int n1, int n2){
        System.out.println(n1 * n2);
    }

    public double divideDoisNumeros (double n1, double n2){
        if (n2 == 0 ){
            return 0;
        }
        return n1/n2;
    }

    public void alteraDoisNumeros(int n1, int n2) {

        System.out.println("N1 " + n1);
        System.out.println("N2 " + n2);

    }

    public void somaArray(int[] numeros){
        int soma= 0;
        for(int num : numeros){
           soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs (int... numeros){
        int soma= 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println(soma);

    }
}
