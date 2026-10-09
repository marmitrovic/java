/*
- ZADATAK 1: Površina i obim pravougaonika
- ------------------------------------------------
- Tekst zadatka:
- Izračunaj površinu i obim pravougaonika na osnovu njegove osnovice i visine
- i prikaži rezultat na ekranu.
 *
- Očekivani izlaz sa primerima vrednosti (osnovica = 8.5, visina = 4.0):
-   Osnovica: 8.5
-   Visina: 4.0
-   Povrsina: 34.0
-   Obim: 25.0
 *
 */
public class ejercicio1 {

    public static void main(String[] args) {

        double base = 8.5;
        double altura = 4.0;

        // TODO 1: Deklariši promenljivu tipa double pod nazivom "povrsina"
        //         i sačuvaj u njoj rezultat množenja osnovice i visine
		double area = base * altura;

        // TODO 2: Deklariši promenljivu tipa double pod nazivom "obim"
        //         i sačuvaj u njoj odgovarajuću vrednost

		double perimetro = 2  * (base + altura);
        // TODO 3: Prikaži na ekranu sve četiri vrednosti, svaku u novom redu,
        //         u formatu iz "Očekivanog izlaza" iznad.
        //         Pomoć: System.out.println("Osnovica: " + osnovica);
		System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);

        // IZAZOV: Deklariši promenljivu "povrsinaTrougla" sa površinom
        //         trougla koji ima istu tu osnovicu i visinu, i prikaži je takođe.
        //         Zapamti: Površina trougla je (osnovica * visina) / 2

		double  areaTriangulo = (base * altura) / 2;

		System.out.println("Area triangulo: " + areaTriangulo);

    }
}