package exception;

public class ExceptionFirstExample {

	public static void main(String[] args) {
		try
		{
		int i=10;
		int y=10/0;
		System.out.println(y);
		//error without exception handling
		/* Exception in thread "main" java.lang.ArithmeticException: / by zero
		at exception.ExceptionFirstExample.main(ExceptionFirstExample.java:8)*/

		}catch(ArithmeticException e){
			System.out.println("integer cannot divide By 0");
		}
	}

}
