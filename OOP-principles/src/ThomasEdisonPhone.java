public class ThomasEdisonPhone extends AbstractPhone {

public ThomasEdisonPhone(int year) {
    super(year);
}
    @Override
    public void call(int outputNumber) {
        System.out.println("�������� �����");
        System.out.println("�������� ����� ��������, ���");
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("������� ������");
    }
}
