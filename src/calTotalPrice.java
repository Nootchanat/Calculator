import java.util.Scanner;

public class calTotalPrice {

	public static void main(String args[]) {
		
		@SuppressWarnings("resource")
		Scanner Keyboard = new Scanner (System.in) ;
		
		System.out.print("please enter Number  1 : ");
		int number1 = Keyboard.nextInt();
		
		System.out.print("please enter Number  2 : ");
		int number2 = Keyboard.nextInt();
		
		System.out.print("please enter Number  3 : ");
		int number3 = Keyboard.nextInt();
		
		int multiply_Number = number1 + number2 + number3;
		System.out.println("multiplyNumber = "+ number1+" + "+number2+" + "+number3+" = "+multiply_Number);
		
		int price = 1000;
		double calVat7 = (price/100)*7 ;
		System.out.println("Vat = "+calVat7);
		
		double calTotalPrice = price + calVat7;
		System.out.println("TotalPrice = " +calTotalPrice);
		
	}

}