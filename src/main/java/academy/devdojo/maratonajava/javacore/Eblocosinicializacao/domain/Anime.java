package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.domain;

public class Anime {
    private String name;
    private int[] episodios;
    // 1- Eh alocado espaco em memoria
    // 2-Cada atributo de classe eh criado e inicializado com valores default ou oque foi passado (exemplo: int idade = 10;)
    // 3- Bloco de inicializacao eh executado
    // 4 - Construtor eh executado




    // bloco de inicializacao vai executar primeiro
    {
        System.out.println("Dentro do bloco de inicializacao");
        episodios = new int[100];

        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }


    public Anime(String name) {
        this.name = name;
    }

    public Anime() {
        for (int ep : this.episodios) {
            System.out.println(ep + ": ");
        }
    }

    public String getName() {
        return name;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
