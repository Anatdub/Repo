package ru.spec.event;

public class Switcher2 {
	public ElectricityConsumer consumer;
	public void switchOn() {
		System.out.println("����������� �������");
		if (consumer !=null)
			consumer.electricityOn();
	}
}
