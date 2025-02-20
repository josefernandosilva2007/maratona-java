package vamos.exerciciosdojo.domain;


import java.util.Arrays;

public class Seminario {
    private String title;
    private Local address;
    private Aluno[] alunos;
    private Professor professor;


    public Seminario(String title) {
        this.title = title;
    }

    public Seminario(String title, Local address, Aluno[] aluno) {
        this(title);
        this.address = address;
        this.alunos = aluno;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Local getAddress() {
        return address;
    }

    public void setAddress(Local address) {
        this.address = address;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }


}
