package academy.devdojo.maratonajava.javacore.ZZDoptional.domain;

public class Manga {
    private Integer id;
    private String title;
    private int caps;

    public Manga(Integer id, String title, int caps) {
        this.id = id;
        this.title = title;
        this.caps = caps;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", caps=" + caps +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getCaps() {
        return caps;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCaps(int caps) {
        this.caps = caps;
    }
}
