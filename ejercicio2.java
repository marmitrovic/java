/*
- ZADATAK 2: Kartica / Ficha učenika
- ------------------------------------------------
- Tekst zadatka:
- Na osnovu podataka o učeniku, prikaži njegovu kompletnu karticu na ekranu
- i neke podatke izračunate na osnovu njih.
 *
- Očekivani izlaz sa primerima vrednosti:
-   ===== FICHA DEL ALUMNO =====
-   Nombre: Lucia
-   Edad: 19 anios
-   Altura: 1.68 m
-   Matriculado: true
-   Grupo: B
-   Ano de nacimiento aproximado: 2007
-   Altura en centimetros: 168.0
-   Lucia tiene 19 anios y mide 1.68 m
-   Nota media: 7.5 (redondeada hacia abajo: 7)   <- vidi TODO 6
 *
- (Koristimo "anio" bez slova nj / ñ da bismo izbegli probleme sa kodiranjem u konzoli.)
 */
public class ejercicio2 {

    public static void main(String[] args) {

        // Deklariši podatke učenika (sa prevodom u komentarima)
        String nombre = "Lucia";        // Ime
        int edad = 19;                  // Godine / Starost
        double altura = 1.68;           // Visina (u metrima)
        boolean matriculado = true;     // Upisan / Status upisa
        char grupo = 'B';               // Odeljenje / Grupa

        // Deklariši tekuću godinu kao konstantu, pošto se tekuća godina ne menja tokom programa
        // Pista / Pomoć: ključna reč 'final'
        final int anioActual = 2026;    // Tekuća godina (trenutna godina: 2026)

        // Ocene sa dva testa / ispita
        double nota1 = 7.0;             // Ocena 1
        double nota2 = 8.0;             // Ocena 2

        // TODO 1: Prikaži naslov "===== FICHA DEL ALUMNO =====" koristeći println
        System.out.println("FICHA DEL ALUMNO");

        // TODO 2: Prikaži svaki podatak (ime, godine, visina, upisan, grupa)
        //         u svom sopstvenom redu, u formatu očekivanog izlaza.
        //         Pomoć: System.out.println("Nombre: " + nombre);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " anios");
        System.out.println("Altura: " + altura + " m");
        System.out.println("Matriculado: " + matriculado);
        System.out.println("Grupo: " + grupo);

        // TODO 3: Deklariši promenljivu "anioNacimiento" (int) koja se računa na osnovu tekuće godine i godina (starosti)
        //         i prikaži je sa odgovarajućim tekstom.
        int anioNacimiento = anioActual - edad;
        System.out.println("Ano de nacimiento aproximado: " + anioNacimiento);

        // TODO 4: Deklariši promenljivu "alturaCm" (double) koja pretvara visinu
        //         u centimetre i prikaži je.
        double alturaCm = altura * 100;
        System.out.println("Altura en centimetros: " + alturaCm);

        // TODO 5: Prikaži u JEDNOM JEDINOM REDU rečenicu:
        //         "Lucia tiene 19 anios y mide 1.68 m"
        //         koristeći promenljive (nemoj pisati vrednosti ručno).
        //         Uradi to jednom koristeći samo println, a drugi put koristeći
        //         nekoliko System.out.print praćenih jednim finalnim println-om.
        
        // Način 1 (samo println):
        System.out.println(nombre + " tiene " + edad + " anios y mide " + altura + " m");

        // Način 2 (više print praćenih sa println):
        System.out.print(nombre);
        System.out.print(" tiene ");
        System.out.print(edad);
        System.out.print(" anios y mide ");
        System.out.print(altura);
        System.out.println(" m");

        // TODO 6: Deklariši promenljivu "notaMedia" sa prosekom ocene1 i ocene2
        //         i prikaži je.
        double notaMedia = (nota1 + nota2) / 2.0;
        System.out.println("Nota media: " + notaMedia);
 
        // Nakon toga, izračunaj i celobrojni deo proseka koristeći isključivo tip int i deljenje:
        int sumaNotas = (int)(nota1 + nota2); // Zbir ocena (ili 7 + 8)
        int notaMediaEntera = sumaNotas / 2;    // Celobrojni prosek / Ceo deo proseka
        
        System.out.println("Nota media entera (redondeada hacia abajo): " + notaMediaEntera);
        // Prikaži oba rezultata i razmisli zašto ne daju isto (zato što deljenje celih brojeva u Javi odbacuje decimale, dok double čuva tačan zarez).
    }
}