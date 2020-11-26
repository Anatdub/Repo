
//��������� Java ��� �����������
//������� ����� Aggregation � Composition. 

//����� Engine, ������� ����� ����������� � ������.  
//����� 'Car' ����� ����� ���� ���� Engine . 
class Engine {
	// ����������� engine.
	public void work() {

		System.out.println("Engine of car has been started ");

	}

} // Engine class

final class Car {

	// ��� �������� car ���������� ����� gine.
	private final Engine engine; // Composition
	// private Engine engine; // Aggregation

	Car(Engine engine) {
		this.engine = engine;
	}

	// ������ �������� ��������, �������� engine
	public void move() {

		// if(engine != null)
		{
			engine.work();
			System.out.println("Car is moving ");
		}
	}
}

class TestDifference {
	public static void main(String[] args) {

		// ������ ��������� ����� ��������
		// ���������� ������ Engine.
		Engine engine = new Engine();

		// ������ car � engine,
		// �������  �������� ��������� engine
		//  ��� �������� ���
		// �������� ���������� Car.
		Car car = new Car(engine);
		car.move();

	}
}
