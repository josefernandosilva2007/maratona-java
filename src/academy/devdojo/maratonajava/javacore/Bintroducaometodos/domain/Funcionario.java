package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

public class Funcionario {
    public String name;
    public int age;
    public double salary[];

    public void imprime(){
        System.out.println(this.name);
        System.out.println(this.age);
        for(double salario: salary){
            System.out.println (salario + " ");
        }
    }
}
