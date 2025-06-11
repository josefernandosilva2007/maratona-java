package academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void bonus() {
        this.salary = this.salary + this.salary * 0.1;
    }

    @Override
    public void imprime() {
        System.out.println("Imprimindo...");
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
