/*Write a program that prints the numbers from 1 to 100 
and for multiples of 3 print Fizz instead of the number 
and for the multiples of 5 print Buzz. If both FizzBuzz*/

// Kaj naloga zeli od nas

public class FizzBuzz{

	// v main bomo napisali to kar zelimo, da se izvede
	// https://www.javatpoint.com/java-main-method
	public static void main(String[] args) {

		for (int i = 1; i <=100 ; i++) {
			if (i % 15 == 0){
				System.out.println("FizzBuzz");
			}else if(i % 5 == 0){
				System.out.println("Buzz");
			}else if(i % 3 == 0){
				System.out.println("Fizz");
			}else {
				System.out.println(i);

			}
		}
			


		
		
	}

}