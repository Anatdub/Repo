package ru.spec.event;

import java.util.ArrayList;
import java.util.List;

public class Switch {
	
	private List<ElectricityConsumer> listeners = new ArrayList<>();
	public void addElectricityListener(ElectricityConsumer listener) {
		listeners.add(listener);
	}
	public void removeElectricityListener(ElectricityConsumer listener) {
		listeners.remove(listener);
	}
	public void switchOn() {
		System.out.println("����������� �������");
	//	if (consumer !=null)
	//		consumer.electricityOn();
		for(ElectricityConsumer c:listeners) {
			c.electricityOn(c);
		}
	}
}
