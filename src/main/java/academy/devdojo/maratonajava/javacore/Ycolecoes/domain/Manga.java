package academy.devdojo.maratonajava.javacore.Ycolecoes.domain;

import java.util.Objects;

public class Manga implements Comparable<Manga> {
    private Long id;
    private String name;
    private int price;
    private int qntd;


    public Manga(Long id, String name, int price) {
        Objects.requireNonNull(id, "ID nao pode ser nulo");
        Objects.requireNonNull(name, "Nome nao pode ser nulo");
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Manga(Long id, String name, int price, int qntd) {
        this(id, name, price);
        this.qntd = qntd;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return price == manga.price && Objects.equals(id, manga.id) && Objects.equals(name, manga.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", qntd=" + qntd +
                '}';
    }

    public int getQntd() {
        return qntd;
    }

    public void setQntd(int qntd) {
        this.qntd = qntd;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Manga outroManga) {
        //negativo se this < outroManga;
        //retorna 0 se this == outroManga;
        //positivo se this> outroManga;
//        if (this.id < outroManga.getId()){
//            return -1;
//        } else if (this.id > outroManga.getId()) {
//            return 1;
//        } else return 0;

        // Como o ID eh um Wrapper de long, ele ja tem um compareTo dentro dele
        return this.id.compareTo(outroManga.getId());
        // Sort por nome
//        return name.compareTo(outroManga.getName());
        //Sort por preco
        // price eh uma variavel de tipo primitivo entao usamos o Intenger que tem o metodo Compare
//            return Integer.compare(price, outroManga.getPrice());
    }
}
