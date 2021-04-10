package site.renjeka.carmanager;

import java.util.ArrayList;
import java.util.List;

public class CarManager {

	public static void main(String[] args) throws Throwable {

		Car prius = new PassengerCar("Toyota Prius", 2008, 15000, 1200, Color.GREEN);

		Car renault = new Bus("Renault Laguna", 2000, 9700, 1600, Color.WHITE);
		Car renault2 = new Bus("Renault Laguna", 2000, 9700, 1600, Color.WHITE);
		
		List<Car> cars = new ArrayList<Car>();
		
		cars.add(prius);
		cars.add(renault);
		cars.add(renault2);
		
		System.out.println(cars);
		
		System.out.println(prius.toString());
		System.out.println(renault.toString());
		// System.out.println(renault == renault2);
		// System.out.println(renault.equals(renault2));
		// System.out.println("renault distance = " + renault.getDistance());
		
		renault.addDistance(1000);
		renault.addDistance(2000);
		renault.addDistance(12.99);
		prius.addDistance(15000);
		renault.addDistance(15000);
		
		System.out.println("renault distance = " + renault.getDistance());
		System.out.println(renault.toString());
		System.out.println(prius.isReadyToService());
		System.out.println(renault.isReadyToService());
	}

}
