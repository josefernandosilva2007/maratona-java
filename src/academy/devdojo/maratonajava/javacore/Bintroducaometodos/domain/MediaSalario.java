package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

public class MediaSalario {
    public void mediaSalario(double... salary){
        double media = 0;
        double soma = 0;
        for(double num:salary){
            soma += num;
        }
        media = soma/ salary.length;
        System.out.println(media);


    }
}
