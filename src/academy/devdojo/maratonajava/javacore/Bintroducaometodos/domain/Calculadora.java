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
}
