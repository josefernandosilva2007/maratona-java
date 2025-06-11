package academy.devdojo.maratonajava.javacore.Npolimorfismo.domain;

public class Televisao extends Produto{
    private static final double IMPOSTO_PORCENTO = 0.2;
    public Televisao(String name, double valor) {
        super(name, valor);
    }

    @Override
    public double taxa() {
        return this.valor * IMPOSTO_PORCENTO;
    }
}
