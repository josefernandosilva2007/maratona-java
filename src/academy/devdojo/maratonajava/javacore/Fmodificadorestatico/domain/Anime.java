package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain;

public class Anime {
    private  String name;
    private static int[] episodios;
    // 0 - Bloco de inicializacao eh executado quando a JVM carregar a class
    // 1- Eh alocado espaco em memoria
    // 2-Cada atributo de classe eh criado e inicializado com valores default ou oque foi passado (exemplo: int idade = 10;)
    // 3- Bloco de inicializacao eh executado
    // 4 - Construtor eh executado


    // bloco de inicializacao vai executar primeiro
    static {

        System.out.println("Dentro do bloco de inicializacao");
        episodios = new int[100];

        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicializacao 2 ");
    }

    static {
        System.out.println("Dentro do bloco de inicializacao 3 ");
    }

    {
        System.out.println("Dentro do bloco de inicializacao nao estatico");
    }


    public Anime(String name) {
        this.name = name;
    }

    public Anime() {
        for (int ep : Anime.episodios) {
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
