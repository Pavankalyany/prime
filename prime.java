import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
System.out.println("Enter a number");
int num=in.nextInt();
boolean isPrime = true;
for(int i=2;i<num;i++)
{
	if(num%i==0) {
	isPrime=false;
	break;
	}
	}
if(isPrime) {
	System.out.println(num+"  is a prime number");
}
	
else{
	System.out.println(num+"  not a prime number");
}
	}
}
