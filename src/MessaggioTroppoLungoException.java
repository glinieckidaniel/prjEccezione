import java.util.Scanner;

public class MessaggioTroppoLungoException extends Exception {


    public MessaggioTroppoLungoException(String messaggio) {
        super(messaggio);
    }

    public MessaggioTroppoLungoException(){
        super("Messaggio troppo lungo");
    }

    public static String frase() throws MessaggioTroppoLungoException{
        String fr;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Inserisci una stringa di 20 caratteri : ");
        fr = s1.nextLine();
        s1.close();
        if(fr.length() > 20){
            throw new MessaggioTroppoLungoException("Stringa troppo lunga");
        }else{
            System.out.println("Hai inserito : " + fr);
        }

        return fr;
    }
}
