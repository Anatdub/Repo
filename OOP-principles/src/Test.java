
public class Test {

	public static void main(String[] args) {
		AbstractPhone firstPhone = new ThomasEdisonPhone(1879);
		AbstractPhone phone = new Phone(1984);
		AbstractPhone videoPhone=new VideoPhone(2018);
		User user = new User("������");
		user.callAnotherUser(224466,firstPhone);
		// �������� �����
		//�������� ����� ��������, ���
		user.callAnotherUser(224466,phone);
		//������� ����� 224466
		user.callAnotherUser(224466,videoPhone);
		//��������� ���������� ��� �������� 224466
		user.ringFromAnotherUser(45555, videoPhone);
		// � ��� �������� ����������...45555
	}

}
