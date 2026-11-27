import java.util.Scanner;   // Za čitanje ulaza sa tastature
import java.util.ArrayList; // Dinamički niz (kao lista)

public class java{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
        System.out.print("Su nombre: ");
        String ime = scanner.nextLine();
        System.out.println("HOLA, " + ime);
	}
}

