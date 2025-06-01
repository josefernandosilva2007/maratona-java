package academy.devdojo.maratonajava.javacore.ZZEstreams.domain;

public class LightNovel {
    private String title;
    private int price;

    public LightNovel(String title, int price) {
        this.title = title;
        this.price = price;
    }


    @Override
    public String toString() {
        return "LightNovel{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }
}
