package academy.devdojo.maratonajava.javacore.Npolimorfismo.domain;

public class Computador extends Produto{
    private static final double IMPOSTO_PORCENTO = 0.21;
    public Computador(String name, double valor) {
        super(name, valor);
    }

    @Override
    public double taxa() {
        System.out.println("Calculando Imposto...");
        return this.valor * IMPOSTO_PORCENTO;
    }
}
