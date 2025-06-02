package academy.devdojo.maratonajava.javacore.ZZEstreams.domain;

public class LightNovel {
    private String title;
    private int price;
    private Category category;

    public LightNovel(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public LightNovel(String title, int price, Category category) {
        this.title = title;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return "LightNovel{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }

    public Category getCategory() {
        return category;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }
}
