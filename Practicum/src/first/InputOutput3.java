package first;

import java.util.Scanner;

public class InputOutput3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double p; 					/* ���������� ����������*/
		int a, b;   
		System.out.println("������� ��������:\n");   /* ����� ����������� */
		p  = in.nextDouble();    			/* ���� � ���������� �������� p */
		double st = p/3;     			 /* ���������� �������� st */ 
		// ���������� �������
		double s = Math.sqrt(p/2*(p/2-st)*(p/2-st)*(p/2-st));
		System.out.println("s = "+ s );
	       
	}

}
