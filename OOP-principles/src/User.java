public class User {
    private String name;

    public User(String name) {
        this.name = name;
            }

    public void callAnotherUser(int number, AbstractPhone phone){
// ��� �� ����������� - ������������� � ���� ����������� ���� AbstractPhone phone!
        phone.call(number);
    }
    public void ringFromAnotherUser(int number, AbstractPhone phone) {
    	phone.ring(number);
    }
}
