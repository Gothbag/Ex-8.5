
/*
 * created by Gothbag <josemariacagigalso@gmail.com>
 * this represents a list of cars in which no element can be repeated
 * 
 */

import java.util.HashSet;
import java.util.Iterator;

public class CarHashSet {
	

	public static void main(String[] args) {
		//1
		//declarations
		HashSet<Car> cars = new HashSet<Car>(5);
		
		//2
		//we add the cars
		cars.add(new Car("Alfa Romeo", "Giulia", 2900, 6));
		Car dacii = new Car("Dacia", "Sandero", 1200, 4);
		cars.add(dacii);
		cars.add(new Car("Ford", "Focus", 2000, 4));
		cars.add(new Car("Opel", "Insignia", 2200, 4));
		Car ibizi = new Car("Seat", "Ibiza", 1600, 4);
		cars.add(ibizi);
		//3
		//if the Dacia can be found in the list, we obtain its fiscal horsepower
		if (cars.contains(dacii)) {
			for (Car c : cars) {
				if ( c == dacii ) {
					c.setFiscalHorsepower(0);
					System.out.println(c.getFiscalHorsepower());
					
				}
				
			}
		}
		
		//4
		//the Hyundai is added to the list
		Car hyundi = new Car("Hyundai", "Atos", 1500, 3);
		cars.add(hyundi);
		Car focci = new Car("Ford", "Focus", 2000, 4);
		//the Ford Focus is appended to the list
		cars.add(focci);
		
		//5
		System.out.println("We attempt to add a new \"focci\" object, a new Ford Focus like the one we added before");
		if (cars.add(focci)) {
			System.out.println("It worked!");
		} else {
			System.out.println("I'm sorry, bro, the car couldn't be added.");
		}
		
		//6
		Car audii = new Car("Audi", "A8", 4600, 8);
		//it looks like the HashSet class doesn't allow one to insert an item into a particular position
		
		//7
		Car miito = new Car("Seat", "Mii", 1000, 3);
		//We can only do that by removing the car we want out first and then adding the new one. the new car
		//won't necessarily go to the former's position. we cannot "replace" an element per se
		if (cars.contains(ibizi)) {
			cars.add(miito);
			cars.remove(ibizi);
		}
		
		//8
		//we go over the array to print out the details of each car in it using a "for each" loop
		System.out.println("******* FOR EACH *******");
		for (Car c : cars) {
			c.setFiscalHorsepower(0);
			System.out.println(c.toString());
		}
		System.out.println("******* ITERATOR *******");
		//now we employ an iterator
		Iterator<Car> carIt = cars.iterator();
		while (carIt.hasNext()) {
			Car c = carIt.next();
			System.out.println(c.toString());
		}
		//No, they're not sorted
		
	}

}
