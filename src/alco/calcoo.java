package alco;

import java.util.Scanner;

public class calcoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner r = new Scanner (System.in);
a=r.nextInt();
b=r.nextInt();
div (a,b);
add (a,b);
	}

	public static int add (int a , int b)
	
	{ int c = a+b;
		return c;   }
	
public static int div (int a , int b)
	
	{ int c = a/b;
		return c;   }
	
}
