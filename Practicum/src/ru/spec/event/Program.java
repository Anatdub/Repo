package ru.spec.event;
import static java.lang.System.out;
public class Program {

	public static void fire(Object sender) {
		out.println("Message fire");
	}
	public static void main(String[] args) {
		Switcher sw = new Switcher();
		Lamp lamp = new  Lamp();
		Radio radio = new Radio();
		// Event subscribe
	//	sw.consumer = lamp;
		sw.addElectricityListener(lamp);
		sw.addElectricityListener(radio);
		String message = "�����";
	
				sw.addElectricityListener(
				new ElectricityConsumer() {// ��������� ()

					public void electricityOn(Object sender) {
						System.out.println(message);
					}			
				}
				
		);
		sw.addElectricityListener( (Object sender) ->System.out.println(message)	); // ���������� ������-���������
		
		sw.addElectricityListener(// �� ��������� ���������, �.�. ��������
			  s -> Program.fire(s) ); // Lambda - ���������

	sw.addElectricityListener(s->Program.fire(s));	
	sw.addElectricityListener(Program::fire);	
		sw.switchOn();
	}

}
