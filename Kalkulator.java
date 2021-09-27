import java.util.*;

public class Kalkulator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// max 
		// min
		
		int a = sc.nextInt();
		int b = sc.nextInt();


		// postevanko napisite - v obliki %d * %d = %d
		postevanka(a, b);
		System.out.println();
		postevanka(b, a);
		System.out.println();
		postevanka(10, 5);

		/* podaj dolzino in zapisi toliko stevil
			in zapisi povprecje
		*/
	}

	public static void postevanka(int x, int y){
		for (int i = 1; i <= y ; i++ ) {
			System.out.printf("%d * %d = %d\n", x, i, x * i);
			
		}
	}

}