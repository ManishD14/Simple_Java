
public class Fibonacci {

	public static void main(String[] args) {
		
		int n1=0;
		int n2=1;
		int n3;
		int n=10-2;
		System.out.print(n1+" "+n2+" ");
		for(int i=0;i<n;i++)
		{
			n3=n1+n2;
	        System.out.print(n3+" ");
	        n1=n2;
	        n2=n3;
	        n3=0;
		}

	}

}
