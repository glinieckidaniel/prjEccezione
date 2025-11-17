//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int d = 5;
        int s = 0;

        try {
            int h = d / s;
        } catch (Exception e) {
            System.out.println("Eccezione gestita");
        }
    }

}