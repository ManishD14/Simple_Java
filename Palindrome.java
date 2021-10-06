
public class Palindrome {
	public static void check(int a)
	{
		int n=a;
		int r=0;
		int j=0;
		
		while(n!=0)
		{
			r=n%10;
			j=(j*10)+r;
			n=n/10;
		}
		System.out.println("a "+a+ "is j"+j);
	}

	public static void main(String[] args) {
		int a=121;
		check(a);

	}

}
