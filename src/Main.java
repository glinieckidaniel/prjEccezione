import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws MessaggioTroppoLungoException {

        try{
            System.out.println(MessaggioTroppoLungoException.frase());
        }catch(MessaggioTroppoLungoException e){
            System.err.println(e.getMessage());

        }finally{
            System.out.println("\nCodice eseguito");
        }
        System.out.println("\ncontinua");

    }

}