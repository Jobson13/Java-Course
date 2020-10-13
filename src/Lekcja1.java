import java.util.Scanner;

public class Lekcja1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.print("Podaj swoje imię: ");
        name = scanner.next();
        System.out.print("Hello " + name );
    }
}
