import java.util.Scanner;

public class ConstantVariable {
	static final float RATE = 1.5f;
	static final int MIN_PRICE = 1000;
	
	public static void main(String[] args) {
//		String name = null;
//		//Nullpointer exception error
//		System.out.println(name.length());
		Scanner input = new Scanner(System.in);
		System.out.print("Enter price: ");
		int price = input.nextInt();
		if(price < MIN_PRICE) {
			price = MIN_PRICE;
		}
		System.out.print("price: "+ price);
		System.out.println("Expense: " + (price * RATE));
		
	}

}
