import java.util.Scanner;

public class MessaggioTroppoLungoException extends Exception {


    public MessaggioTroppoLungoException(String messaggio) {
        super(messaggio);
    }

    public MessaggioTroppoLungoException(){
        super("Messaggio troppo lungo");
    }


}
