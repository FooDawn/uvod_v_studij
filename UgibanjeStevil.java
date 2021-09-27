import java.util.Scanner;
import java.util.Random;


public class UgibanjeStevil {
	
	public static void main(String[] args) {
		// uporabnik vnese stevilo in mu program pove ali je to stevilo previsoko ali prenizko
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		int iskanoStevilo = rd.nextInt(50) + 1;
		int vnos;
		boolean nismoNasli = true;

		while (nismoNasli){
			System.out.println("vpisi cifro:");
			vnos = sc.nextInt();
			if (vnos == iskanoStevilo){
				System.out.println("Cestitke");
				nismoNasli = false;
			} else if (vnos < iskanoStevilo) {
				System.out.println("Prenizko stevilo ste izbrali");
			}else {
				System.out.println("Previsoko stevilo ste izbrali");

			}

		}

		// System.out.println(iskanoStevilo);
		
	}
}