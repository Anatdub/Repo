public class VideoPhone extends AbstractPhone {

    public VideoPhone(int year) {
        super(year);
    }
    @Override
    public void call(int outputNumber) {
        System.out.println("��������� ���������� ��� �������� " + outputNumber );
    }
    @Override
    public void ring(int inputNumber) {
        System.out.println("� ��� �������� ����������..." + inputNumber);
    }
  }
