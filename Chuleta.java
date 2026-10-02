public class Chuleta {

    // 1. Metoda za sabiranje (popravljeni tipovi parametara int n1, int n2)
    public static int sumar(int n1, int n2) {
        System.out.println("Sumando numeros...");
        return n1 + n2;
    }

    // 2. Metoda za igru Kamen, Papir, Makaze (Juego: Piedra, Papel, Tijera)
    public static void juega(String jugador1, String jugador2) {
        System.out.println("Jugador 1 eligio: " + jugador1);
        System.out.println("Jugador 2 eligio: " + jugador2);

        // Provera da li je nerešeno
        if (jugador1.equalsIgnoreCase(jugador2)) {
            System.out.println("Resultado: ¡Empate!");
        } 
        // Logika kada POBEĐUJE Jugador 1
        else if ((jugador1.equalsIgnoreCase("piedra") && jugador2.equalsIgnoreCase("tijera")) ||
                 (jugador1.equalsIgnoreCase("papel") && jugador2.equalsIgnoreCase("piedra")) ||
                 (jugador1.equalsIgnoreCase("tijera") && jugador2.equalsIgnoreCase("papel"))) {
            System.out.println("Resultado: ¡Gana Jugador 1!");
        } 
        // U svim ostalim slučajevima POBEĐUJE Jugador 2
        else {
            System.out.println("Resultado: ¡Gana Jugador 2!");
        }
    }

    // 3. Glavni main metod (popravljena sintaksa: String[] args)
    public static void main(String[] args) {
        System.out.println("=== PRINTER & SUMA ===");
        System.out.println("Suma je: " + sumar(7, 8));

        System.out.println("\n=== KAMEN, PAPIR, MAKAZE ===");
        
        // Primeri pokretanja igre sa različitim potezima:
        juega("papel", "tijera");   // Pobeđuje Tijera (Jugador 2)
        System.out.println("---");
        juega("piedra", "tijera");  // Pobeđuje Piedra (Jugador 1)
        System.out.println("---");
        juega("papel", "papel");    // Nerešeno (Empate)
    }
}