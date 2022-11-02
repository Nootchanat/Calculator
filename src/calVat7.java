import java.util.Scanner;
public class calVat7 {

	 public static void main(String[] args) {
		 int Count = 0;
		 double Price = 1000;
		 double Vat = 1.5;
		 System.out.print("�ӹǹ : ");
		 Scanner Keyboard = new Scanner(System.in);
		 
		 Count = Keyboard.nextInt();
		 
		 System.out.println(Price / Vat);
	 }
}
