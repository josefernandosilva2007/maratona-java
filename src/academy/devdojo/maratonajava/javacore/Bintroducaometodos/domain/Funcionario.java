package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

public class Funcionario {
    private String name;
    private int age;
    private double[] salary;
    private double media;

    public void imprime() {
        System.out.println(this.name);
        System.out.println(this.age);
        for (double salario : salary) {
            System.out.println(salario + " ");
        }

        for (double num : salary) {
            media += num;
        }
        media = media / salary.length;
        System.out.println(media);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double[] getSalary() {
        return salary;
    }

    public void setSalary(double[] salary) {
        this.salary = salary;
    }

    public double getMedia() {
        return media;
    }


}
