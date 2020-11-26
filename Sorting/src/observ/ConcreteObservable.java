package observ;

import java.util.LinkedList;
import java.util.List;
//import java.util.Observable;

public class ConcreteObservable implements Observable{

    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private int pressure;
    
    public ConcreteObservable() {
        observers = new LinkedList<>();
    }
    
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer observer : observers)
            observer.update(temperature, humidity, pressure);
    }

    public void setMeasurements(float temperature, float humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }

	
}
class CurrentConditionsDisplay implements Observer {
    private float temperature;
    private float humidity;
    private int pressure;

    @Override
    public void update(float temperature, float humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.printf("������ ��������:%.1f �������� ������� � %.1f %% ���������. �������� %d �� ��. ��.\n", temperature, humidity, pressure);
    }
}
