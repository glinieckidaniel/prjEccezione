import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws MessaggioTroppoLungoException {

        Scanner s2 = new Scanner(System.in);
        boolean b = false;


        while(!b) {
            try {
                System.out.println(frase());
            } catch (MessaggioTroppoLungoException e) {
                System.err.println(e.getMessage());

            } finally {
                int i = 0;
                System.out.println("\nVuoi continuare\n1-Si\n2-No");
                i = s2.nextInt();

                if(i != 1){
                    b = true;
                }


            }
        }





    }


    public static String frase() throws MessaggioTroppoLungoException{
        String fr;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Inserisci una stringa di 20 caratteri : ");
        fr = s1.nextLine();
        if(fr.length() > 20){
            throw new MessaggioTroppoLungoException("Stringa troppo lunga");
        }else{
            System.out.println("Hai inserito : " + fr);
        }


        return fr;
    }





}