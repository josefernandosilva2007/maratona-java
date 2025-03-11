package vamos.exerciciosdojo.domain;

import java.util.Arrays;

public class Professor {
    private String name;
    private String schoolSubjects;
    private Seminario[] seminarios;

    public Professor(String name, String schoolSubjects) {
        this.name = name;
        this.schoolSubjects = schoolSubjects;
    }

    public Professor(String name, String schoolSubjects, Seminario[] seminarios) {
        this.name = name;
        this.schoolSubjects = schoolSubjects;
        this.seminarios = seminarios;
    }

    public void imprime(){
        System.out.println("------------------");
        System.out.println("NOME: "+ this.name);
        System.out.println("MATERIA: "+ this.schoolSubjects);
        if (this.seminarios== null) return;
        System.out.println("---SEMINARIOS---");
        for (Seminario seminario : seminarios) {
            System.out.println(seminario.getTitle());
            System.out.println("LOCAL: "+ seminario.getAddress().getAddress());
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("Aluno: "+ aluno.getName()+ " IDADE: "+ aluno.getAge());

            }
            System.out.println("-----------------");

        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolSubjects() {
        return schoolSubjects;
    }

    public void setSchoolSubjects(String schoolSubjects) {
        this.schoolSubjects = schoolSubjects;
    }


    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
