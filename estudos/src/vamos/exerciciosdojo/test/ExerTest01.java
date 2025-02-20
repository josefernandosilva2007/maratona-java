package vamos.exerciciosdojo.test;

import vamos.exerciciosdojo.domain.Aluno;
import vamos.exerciciosdojo.domain.Local;
import vamos.exerciciosdojo.domain.Professor;
import vamos.exerciciosdojo.domain.Seminario;

public class ExerTest01 {
    public static void main(String[] args) {
        Local local = new Local("USP");

        Aluno aluno1 = new Aluno("Cha Hae-in", 20);
        Aluno aluno2 = new Aluno("Sun Jin Woo", 24);
        Aluno aluno3 = new Aluno("Choi Jong-In", 28);
        Aluno aluno4 = new Aluno("Liu Zhigang", 20);
        Aluno aluno5 = new Aluno("Baek Yoonho", 23);
        Aluno aluno6 = new Aluno("Lim Tae-Gyu", 22);
        Aluno[] alunoG1 = {aluno1, aluno2, aluno3};
        Aluno[] alunoG2 = {aluno4, aluno5, aluno6};
        Seminario seminario1 = new Seminario("Inteligência Artificial e o Futuro do Trabalho",local,alunoG2);
        Seminario seminario2 = new Seminario("Energias Renováveis e Sustentabilidade",local,alunoG1);
        Seminario[] seminarios = {seminario1, seminario2};
        Professor professor = new Professor("Go Gunhee", "Historia",seminarios);
        professor.imprime();



    }
}
