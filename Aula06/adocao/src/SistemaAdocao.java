import java.sql.SQLOutput;
import java.util.Date;

public class SistemaAdocao {

    public static void main(String[] args) {
        Date data = new Date("20/08/2018") ;

        Cachorros cachorro = new Cachorros("pitbull",data,20.8,true,false,"chavesBob");

        System.out.println("Idade do cachorro:" + " "+ cachorro.getIdade());
        System.out.println("Nome do cachorro:" + " " + cachorro.getNome());
        System.out.println("Nome da raça do cachorro:" + " " + cachorro.getRaca());
        System.out.println("Peso do cachorro:" + " " + cachorro.getPeso());
        System.out.println("O cachorro está tem ferido?:" + " " + cachorro.isFerimento());
        System.out.println("O cachorro chip ?:" + " " + cachorro.isChip());
        System.out.println("Animal rastreado com chip"+ " "+ cachorro.animalRastreavel());
        System.out.println("Disponível para adoção:"+ " " + cachorro.adocao());


    }


}
