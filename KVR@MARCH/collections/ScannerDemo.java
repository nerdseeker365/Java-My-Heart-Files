import java.util.*;
import java.io.*;

class ScannerDemo 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		System.out.println("First Number	:	");
		String s1 = s.nextLine();

		System.out.println("Second Number	:	");
		String s2 = s.nextLine();

		int res = Integer.parseInt(s1) + Integer.parseInt(s2); 

		System.out.println("SUM		:		"+res);
	}
}
