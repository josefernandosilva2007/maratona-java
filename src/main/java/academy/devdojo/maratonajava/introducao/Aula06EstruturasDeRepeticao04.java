package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    //Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    //valorParcela >= 1000
    public static void main(String[] args) {
        float valorCarro=50000F;
        for (int parcela = 1; parcela <=valorCarro ; parcela++) {
            float valorParcela = valorCarro/parcela;
            if (valorParcela<1000){
//                break;

            }
            System.out.println("Em "+ parcela+"x de R$ "+valorParcela);

        }


    }
}
