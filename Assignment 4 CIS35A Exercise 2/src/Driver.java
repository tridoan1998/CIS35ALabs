/*
Name: Tri Doan
Class and Section: CIS 35A Monday and Wednesday 6:00pm class / in class 
Assignment 4
Due Date: 02/27/2019
Date Submitted: 02/27/2019

Exercise 2:
Design a Ship, CargoShip and CruiseShip class being mindful of behavior of each. Demonstrate the classes 
in a program that has a Ship array. Assign various Ships, CruiseShip and CargoShip to the array elements.
CargoShip and CruiseShip are a child of Ship class.
 */
public class Driver {

	public static void main(String[] args) {
		//create array hold objects of size 3 
		Ship [] ShipObjectsArray = new Ship[3];
		
		//declare three objects and assign it to the array
		//apply polymorphism - calling super() method in the constructor to make grabs variables from the parent class and assign data to it.
		ShipObjectsArray[0] = new Ship(true, 240, 5000, "CA", "14/02/2019");
		ShipObjectsArray[1] = new CargoShip(true, 1000, 4000, "NY", "11/2/2019", "small", 12, "mini", 500, "use small car to push containers");
		ShipObjectsArray[2] =  new CruiseShip(true, 3000, 7329, "TX", "16/02/2019", 10, 210, "round", "carry food", "carry automobile");
		
		System.out.printf("\t<This program print out data for the Ship, CargoShip, and CruiseShip>\n");
		System.out.printf("\t---------------------------------------------------------------------\n");
				
		System.out.println("\nShip object with variable overriding from the Ship class");

		//call the method print() in all three classes - overriding
		//polymorphism: run print() in all three Ship Objects
		for(int i = 0; i < 3; i++)
			ShipObjectsArray[i].print();
	}
}
//All test run should print out the same result since constructors automatically taken in the same parameters by default  
//											TEST RUN #1 
/*
	<This program print out data for the Ship, CargoShip, and CruiseShip>
	---------------------------------------------------------------------

Ship object with variable overriding from the Ship class
Ship is floating: true 
Ship capacity: 240 
Ship length: 5000.00 
Ship name: CA 
Ship departure date: 14/02/2019 

CargoShip object with variable overriding from the Ship class
Ship is floating: true 
Ship capacity: 1000 
Ship length: 4000.00 
Ship name: NY 
Ship departure date: 11/2/2019 
Ship type: small 
Ship number of cranes: 12 
Ship contraband: mini 
Ship cargo value: $500.00 
Ship loading method: use small car to push containers 

CruiseShip object with variable overriding from the Ship class
Ship is floating: true 
Ship capacity: 3000 
Ship length: 7329.00 
Ship name: TX 
Ship departure date: 16/02/2019 
Ticket price is: 10.00 
Number of rooms is: 210 
Cruise type is: round 
Ship services included: carry food and carry automobile 

*/

//											TEST RUN #2
/*
<This program print out data for the Ship, CargoShip, and CruiseShip>
---------------------------------------------------------------------

Ship object with variable overriding from the Ship class
Ship is floating: true 
Ship capacity: 240 
Ship length: 5000.00 
Ship name: CA 
Ship departure date: 14/02/2019 

CargoShip object with variable overriding from the Ship class
Ship is floating: true 
Ship capacity: 1000 
Ship length: 4000.00 
Ship name: NY 
Ship departure date: 11/2/2019 
Ship type: small 
Ship number of cranes: 12 
Ship contraband: mini 
Ship cargo value: $500.00 
Ship loading method: use small car to push containers 

CruiseShip object with variable overriding from the Ship class
Ship is floating: true 
Ship capacity: 3000 
Ship length: 7329.00 
Ship name: TX 
Ship departure date: 16/02/2019 
Ticket price is: 10.00 
Number of rooms is: 210 
Cruise type is: round 
Ship services included: carry food and carry automobile 

*/
