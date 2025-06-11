package academy.devdojo.maratonajava.javacore.Xserializacao.domain;

import java.io.Serializable;
import java.nio.file.Paths;

public class Aluno implements Serializable {
    private int uid;
    private String name;
    private String password;

    public Aluno(int uid, String name, String password) {
        this.uid = uid;
        this.name = name;
        this.password = password;
    }


    @Override
    public String toString() {
        return "Aluno{" +
                "uid=" + uid +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
