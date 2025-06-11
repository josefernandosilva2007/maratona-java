package academy.devdojo.maratonajava.javacore.Kenum.domain;

public enum TipoCliente {
    PESSOA_JURIDICA(1, "Pessoa Fisica"),
    PESSOA_FISICA(2, "Pessoa Juridica");

    private int valor;
    private String relatorio;

    TipoCliente(int valor, String relatorio) {
        this.valor = valor;
        this.relatorio = relatorio;
    }

    public static TipoCliente tipoClientePorNomeRelatorio(String relatorio) {
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.getRelatorio().equals(relatorio)) {
                return tipoCliente;
            }

        }
        return null;
    }

    public int getValor() {
        return valor;
    }

    public String getRelatorio() {
        return relatorio;
    }
}
