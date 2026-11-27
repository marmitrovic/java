/*
- EXERCISE 5: Days of the week with switch
- ------------------------------------------------
*
- Statement:
- The day of the week is represented by a number: 1 = Monday, 2 = Tuesday ... 7 = Sunday.
- The program must print the day corresponding to the indicated number.
*
*
- If you change dia to 9, part C must show: Invalid day ("Dia no valido")
*
*/

import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {
        // Declare and initialize the variable "dia" from terminal input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce the day: ");
        String dia = scanner.nextLine(); // Alternative to get 'dia' as an integer: "int dia = Integer.parseInt(scanner.nextLine());"
		System.out.print("Introduce the mes: ");
		String Mes = scanner.nextLine(); 
        // ---------- A) WITH IF-ELSE ----------
        System.out.println("===== A) if-else =====");

        // TODO 1: Use a chain of if / else if / else to show the name of the day
        //         (1 -> Monday, 2 -> Tuesday ... 7 -> Sunday).
        //         If the number is not between 1 and 7, show "Invalid day" ("Dia no valido").
		if (dia.equals("1")){
			System.out.println("lunes");
		}else if(dia.equals("2")){
			System.out.println("martes");
		}else if(dia.equals("3")){
			System.out.println("miercoles");
		}else if(dia.equals("4")){
			System.out.println("jueves");
		}else if(dia.equals("5")){
			System.out.println("viernes");
		}else if(dia.equals("6")){
			System.out.println("sabado");
		}else if(dia.equals("7")){
			System.out.println("domingo");
	}else {
		System.out.println("Dia no valido");
	}

        // ---------- B) BASIC SWITCH ----------
        System.out.println("===== B) basic switch =====");

        // TODO 2: Write the same with a switch. Each case must end with a break;
        //         Hint: switch (X) {
        //                     case X:
        //                         System.out.println("XXX");
        //                         break;
        //                     case X:
        //                     ...
        //                 }
		switch (dia) {
            case "1":
                System.out.println("Lunes");
                break;
			case "2":
                System.out.println("Martes");
                break;
			case "3":
                System.out.println("Miercoles");
                break;
			case "4":
                System.out.println("Jueves");
                break;
			case "5":
                System.out.println("Viernes");
                break;
			case "6":
                System.out.println("Sabado");
                break;
			case "7":
                System.out.println("Domingo");
                break;

		}

        // TODO 3: Test with dia 9. 
        //         What does the if-else in part A show now?:
        //         And the switch in part B?:
        // Write the answer in the comments.
	// Both are showing Miercoles!
        // ---------- C) SWITCH WITH DEFAULT ----------
        System.out.println("===== C) switch with default =====");

        // TODO 4: Copy the switch from part B and add a "default:" block at the end
        //         that shows "Invalid day" ("Dia no valido"). Test with dia = 3 and dia = 9.

		switch (dia) {
            case "1":
                System.out.println("Lunes");
                break;
			case "2":
                System.out.println("Martes");
                break;
			case "3":
                System.out.println("Miercoles");
                break;
			case "4":
                System.out.println("Jueves");
                break;
			case "5":
                System.out.println("Viernes");
                break;
			case "6":
                System.out.println("Sabado");
                break;
			case "7":
                System.out.println("Domingo");
                break;
			default:
				System.out.println("Dia no valido");
				break;

		}


        // ---------- D) SWITCH WITHOUT BREAK ----------
        System.out.println("===== D) switch WITHOUT break =====");

        // TODO 5: Write a switch that shows all the remaining days of the week from the current day until Sunday
        //         Example: With dia = 3 it should show Wednesday, Thursday, Friday, Saturday, Sunday



        // ---------- E) GROUPED CASES ----------
        System.out.println("===== E) grouped cases =====");

        // TODO 7: Write a switch where cases 1 to 5 share the same code
        //         (show "Working day" / "Dia laborable") and cases 6 and 7 share another ("Weekend" / "Fin de semana").
        //         Use a single break per group and add a default for invalid days.



		switch (dia) {
			case "1":
			case "2":
			case "3":
			case "4":
			case "5":
				System.out.println("Working day / Dia laborale");
				break;
			case "6":
			case "7":
				System.out.println("Weekend / Finde");
				break;
			default:
				System.out.println("Dia no valido");
				break;
		}


		System.out.println("===== AMPLIACIÓN =====");

		switch (Mes) {
            case "1" -> System.out.println("Enero tiene: 31");
            case "2" -> System.out.println("febrero tiene: 28");
			case "3" -> System.out.println("Marzo tiene: 31");
			case "4" -> System.out.println("Abril tiene: 30");
			case "5" -> System.out.println("Mayo tiene: 31");
			case "6" -> {
				System.out.println("Junio tiene: 30"); 
				System.out.println("Mes de cumpleano");
			}
			case "7" -> System.out.println("julio tiene: 31");
			default -> System.out.println("Mes no valido");
		}

 
        // Ampliación2: Busca la sintaxis moderna del switch con flecha (->), disponible
        //              desde Java 14, y reescribe la parte C usando esa sintaxis.
 
        // Ampliación3: Reescribe la ampliación1 utilizando el switch con flecha, de la forma más compacta posible


    }
}





        