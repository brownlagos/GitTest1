//PrimeDetect.class
/**This program will collect numbers from
user and determine weather it is a Prime number
or not
*/

    import java.util.Scanner;

        public class PrimeDetect{

            public static void main(String[] args){

                int temp;
                boolean isPrime=true;
                Scanner input= new Scanner(System.in);
                System.out.print("Enter any number: ");

                int num= input.nextInt();//Capture the input in an integer
                input.close();

                    for(int i=2;i<=num/2; i++){
                        temp=num%i;
                    
                    if(temp==0){
                        isPrime=false;
                         break;
                    }
                }
                if(isPrime)
                    System.out.print(num + " is a Prime Number");
                else
                    System.out.print(num + " is not a Prime Number");

            }
    }