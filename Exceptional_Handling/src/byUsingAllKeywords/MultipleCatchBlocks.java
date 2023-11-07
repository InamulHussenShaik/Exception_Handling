package byUsingAllKeywords;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchBlocks {
	public static void main(String[] args) {
		try {

			Scanner scan =new Scanner(System.in);
			System.out.println("Enter one integer");
			int s=scan.nextInt();
			System.out.println(s);
			System.out.println("Enter two elements to perform dividion operation");
			int a =scan.nextInt();
			int b=scan.nextInt();
			int c =a/b;
			System.out.println(c);
			System.out.println("Enter array length");

			int arr[]=new int[scan.nextInt()];
			System.out.println("Enter Array Elements");
			for(int i=0; i<arr.length; i++)
			{
				arr[i]=scan.nextInt();
			}
			System.out.println("Enter the element to insert the array");
			int element=scan.nextInt();
			System.out.println("Enter position to insert an array");
			int pos=scan.nextInt();
			arr[pos]=element;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arthemetic Exception");
		}
		catch(NegativeArraySizeException e)
		{
			System.out.println("Negative Array Exception");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		catch(InputMismatchException e)
		{
			System.out.println("InputMismatchException");
		}
		catch(Exception e)
		{
			System.out.println("Dear programmer please check the program once some exception has been occured.");
		}
		finally {
			System.out.println("finally should be execute at end of execution");
		}

	}
}
