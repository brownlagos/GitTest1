

	import java.util.Scanner; //imports the Scanner

	public class Calculus{

public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("m: ");
	int m = input.nextInt();
	
	
	if(m > 0){
	System.out.print("n = 1");
}

		else if(m == 0){
		System.out.print("n = 0");
}

			else{
			System.out.print("n = -1");
}
	}

}