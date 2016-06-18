import java.util.Scanner;

class Hcf
{
	public static int computeLcm(int num1,int num2,int hcf)
	{
		return ((num1*num2)/hcf);
	}
	public static void main(String[] args) {
	int a,b,num1,num2,temp;
	Scanner scan = new Scanner(System.in);

	System.out.println("Enter the two numbers\n");
	a = scan.nextInt();
	b = scan.nextInt();
	num1=a;
	num2=b;
	while((b%a!=0))
	{
		temp = a;
		a = b%a;
		b = temp;
	}
	int lcm  = computeLcm(num1,num2,a);
	System.out.println("The gcd and lcm of given two numbers is : "+a+" and "+lcm);

	}
}