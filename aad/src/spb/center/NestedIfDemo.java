package spb.center;

public class NestedIfDemo {
    public static void main(String[] args) {
        A.NestedIf nif = new B();
        if (nif.isNotNegative(10)) {
            System.out.println("����� 10 �� �������������.");
        }
        if (nif.isNotNegative(-12)) {
            System.out.println("��o �� ����� ��������.");
        }
    }
}