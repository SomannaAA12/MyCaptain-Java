import java.util.Scanner;
class Prime{
   public static void main(String args[]){		
	int temp;
	boolean isPrime=true;
	Scanner scan= new Scanner(System.in);
	System.out.println("Please insert any number:");
	int num=scan.nextInt();
        scan.close();
	int i=2;
while(i<= num/2){
   if(num % i == 0){
	isPrime = false;
	break;
}
   i++;
}
	//If isPrime is true then the number is prime else not
	if(isPrime)
	   System.out.println(num + " is a Prime Number");
	else
	   System.out.println(num + " is not a Prime Number");
}
}