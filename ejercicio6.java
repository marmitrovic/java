import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {

        System.out.println("===== A) while: cuenta atras =====");
int contador_a = 5;
while (contador_a > 0)
{
	System.out.println("Brojac: " + contador_a);
	contador_a--;
}
System.out.println("BUM!");

        System.out.println("===== B) while con condicion: ahorro =====");
int saldo = 0;
        int ahorroMensual = 50;
        int objetivo = 400;
        int meses = 0;

while (saldo < objetivo) {
            saldo += ahorroMensual;
            meses++;
        }
System.out.println("Potrebno meseci: " + meses);
        System.out.println("Konacno stanje: " + saldo + " evra");

        // ---------- C) WHILE vs DO-WHILE ----------
        System.out.println("===== C) while vs do-while =====");
        
		int contador_c = 10;
        while (contador_c < 5) {
            System.out.println("(while) Brojac: " + contador_c);
            contador_c++;
        }

		contador_c = 10; // Vracamo vrednost na 10
        do {
            System.out.println("(do-while) Brojac: " + contador_c);
            contador_c++;
        } while (contador_c < 5);

        System.out.println("===== D) for: tabla de multiplicar =====");

Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite broj za tablicu mnozenja: ");
        int numero = scanner.nextInt();

for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        // ---------- E) FOR ANIDADO ----------
        System.out.println("===== E) for anidado: figuras =====");
        System.out.println("Pravougaonik:");
        for (int i = 1; i <= 3; i++) { // Spoljasnja petlja broji redove
            for (int j = 1; j <= 5; j++) { // Unutrasnja petlja crta zvezdice u tom redu
                System.out.print("*"); // print() ne prelazi u novi red
            }
            System.out.println(); // Kada zavrsi red, predji u novi red (enter)
        }

        System.out.println("Rectángulo:" );


System.out.println("\nTrougao:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) { // Granica je 'i', pa ispisuje onoliko zvezdica koji je to red
                System.out.print("*");
            }
            System.out.println();
        }
		
// ---------- DODATAK 3: PRAZAN PRAVOUGAONIK ----------
        System.out.println("\nPravougaonik sa prazninom unutra (Ampliacion 3):");
        int redoviPravougaonika = 4;
        int kolonePravougaonika = 6;
        for (int i = 1; i <= redoviPravougaonika; i++) {
            for (int j = 1; j <= kolonePravougaonika; j++) {
                // Stampa zvezdicu samo ako je prvi red, poslednji red, prva kolona ili poslednja kolona
                if (i == 1 || i == redoviPravougaonika || j == 1 || j == kolonePravougaonika) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); // U suprotnom ostavlja prazno mesto
                }
            }
            System.out.println();
			}

			System.out.println("\nPiramida (Ampliacion 4):");
        int visinaPiramide = 5;
        for (int i = 1; i <= visinaPiramide; i++) {
            // Unutrasnja petlja 1: Stampa razmake pre zvezdica kako bi centrirala vrh
            for (int j = 1; j <= visinaPiramide - i; j++) {
                System.out.print(" ");
            }
            // Unutrasnja petlja 2: Stampa same zvezdice
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println(); // Prelazi u novi red
        }

        scanner.close();
	}
}
 
 
   
 
 