package academy.devdojo.maratonajava.javacore.Hheranca.domain;

public class Pessoa {
    protected String name;
    protected String cpf;
    protected Endereco endereco;

    //todas as classe sao subclasses de Object

    public void imprime(){
        System.out.println(this.name);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua()+ " "+ this.endereco.getCep());
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {

        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
