package academy.devdojo.maratonajava.javacore.Npolimorfismo.domain;

public abstract class Produto implements Tax {
    protected String name;
    protected double valor;

    public Produto(String name, double valor) {
        this.name = name;
        this.valor = valor;
    }

    public String getName() {
        return name;
    }

    public double getValor() {
        return valor;
    }
}
