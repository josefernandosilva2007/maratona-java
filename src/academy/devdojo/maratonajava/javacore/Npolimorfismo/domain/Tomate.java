package academy.devdojo.maratonajava.javacore.Npolimorfismo.domain;

public class Tomate extends Produto{
    private static final double IMPOSTO_PORCENTO = 0.06;
    private String dataValidade;
    public Tomate(String name, double valor) {
        super(name, valor);
    }

    @Override
    public double taxa() {
        System.out.println("Calculando Imposto...");
        return this.valor * IMPOSTO_PORCENTO;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
