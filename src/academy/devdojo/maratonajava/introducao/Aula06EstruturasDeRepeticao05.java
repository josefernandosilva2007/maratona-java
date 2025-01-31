package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        float valorCarro=50000F;
        for (int parcela = (int)valorCarro; parcela >=1 ; parcela--) {
            float valorParcela = valorCarro/parcela;
            if (valorParcela < 1000){
            continue;
            }
            System.out.println("Em "+ parcela+"x de R$ "+valorParcela);
        }


    }
}
