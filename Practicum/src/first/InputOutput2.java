package first;

import java.util.Scanner;

public class InputOutput2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int x; 					/* ���������� ����������*/
		int a, b;   
		System.out.println("������� a � b:\\n ");   /* ����� ����������� */
		a  = in.nextInt();    			/* ���� � ���������� �������� a */
		b = in.nextInt();    			/* ���� � ���������� �������� b */
		x = a + b;     			 		/* ���������� �������� x */ 
		System.out.println("x= "+x );
		
		System.exit(0);

	       
	}

}
