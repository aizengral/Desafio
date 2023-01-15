import java.util.Arrays;
import java.util.List;

public class Desafio_1 {
    public static void main(String[] args){

        //Print dos valores que serao utilizados
        System.out.println("Os valores inseridos foram: 88.00, 130.00, 54.90, 293.30, 44.80.");

        //Cria a lista com os valores
        List<Double> lista = Arrays.asList(88.00, 130.00, 54.90, 293.30, 44.80);

        //Cria o contrutor de string
        StringBuilder str = new StringBuilder("Remessa gerada: ");

        //Cria a variavel que somara os valores da lista
        double somador = 0;

        //For para percorrer a lista
        for(int i = 0; i < lista.size(); i++){
            String strd = Double.toString(lista.get(i));
            str.append( " " + (i + 1) + " cujo valor é R$ ");
            str.append(strd + ",");
            somador = lista.get(i) +  somador;
        }

        //Acresenta os valores somados a variavel str
        str.append(". Total = " + somador);

        //Print dos resultados
        System.out.println(str);
    }
}