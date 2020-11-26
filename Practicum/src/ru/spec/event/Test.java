package ru.spec.event;

import static java.lang.System.out;
public class Test {

		public static void main(String[] args) {
		Switch sw = new Switch();
		Lamp lamp = new  Lamp();
		Radio radio = new  Radio();
		sw.addElectricityListener(lamp);
		sw.addElectricityListener(radio);
		// ���� ��� ���� �����, �� �� ����������� ��������������
		sw.addElectricityListener( // ������ ���������
				new ElectricityConsumer() {// ��������� ()

					@Override
					public void electricityOn() {
						System.out.println("Fire");
					}			
				}
					
			); // ���������� ��������� �����, ��� �������� ����� ����� �� ������������

		
		sw.addElectricityListener( () ->System.out.println("�����")	); // ���������� ������-���������

		sw.switchOn();
	}
}

