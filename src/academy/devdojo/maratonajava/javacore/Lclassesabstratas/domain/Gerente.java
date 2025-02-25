package academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain;

public class Gerente extends Funcionario{
    public Gerente(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void bonus() {
        this.salary = this.salary + this.salary * 0.05;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }


    @Override
    public void imprime() {
        System.out.println("system.out.println('Hello World')");
    }
}
