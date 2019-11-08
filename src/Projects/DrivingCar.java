package Projects;

public class DrivingCar {
/*	A car has certain fuel efficiency or mileage and amount of fuel in the gas thank.
 * Initial fuel level is 0 liters.
 * Simulate driving the car for a certain distance, reducing the amount of gasoline in the fuel tank.
 * Also find a way to get the current amount of fuel in the gas thank and also fill gas in the tank.
 * Ensure you take the mileage into account for all calculation.
 */
	
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.fuelCapacity = 20;
		myCar.amountOfFuel = 12;
		myCar.milage = 20;						// drive 20km per liter
		myCar.addGas (2);
		myCar.drive (300);
		System.out.println("There is "+ myCar.amountOfFuel+" liters total gasoline in the tank.");
		
	}

}
class Car
{
	double milage;
	double amountOfFuel;
	double fuelCapacity;
	
	public void drive(double distance) {
		/*
		 * Ask for how many km is the distance for the destination.
		 * Calculate for fuel needs
		 * if fuel id deficient drive and reduce the fuel in the tank
		 * If fuel is not sufficient. Make the commend for not enough fuel level.
		 * calculate the amount of fuel needed.
		 * 
		 */
		
		
		double fuelNeeded = distance / milage ;
		if (amountOfFuel>fuelNeeded) {
			System.out.println("There is enough fuel in the tank to make that "+distance+"km trip.");
			System.out.println("There will be "+ (amountOfFuel - fuelNeeded) +" liter fuel in the tank after the trip.");
		}
		else {
			double	amount = fuelNeeded-amountOfFuel;
			System.out.println("You shoul have at least "+ amount +" liter more fuel to make that trip.");
			
		}
		
		
	
	}
	public void addGas(double amount){		
	/* I already have some gas in the tank. 
	 * Fuel capacity is 60 liters. 
	 * Find remaining capacity in the tank.
	 * Check if the amount of gas you are trying to add exceeds the remaining capacity.
	 * 		if yes fill the thank till its capacity.
	 * 		if No fill the thank with the amount specified  
	 */
		double emtySpace = fuelCapacity - amountOfFuel;
			if (emtySpace>=amount) {
				amountOfFuel = amountOfFuel + amount;
				System.out.println(amount +" liters gasoline added successufuly.");
			}
			else {
			amountOfFuel = fuelCapacity;
			amount = emtySpace;
			System.out.println(amount +" liters gasoline added successufuly.");
			}
	}
	public double getFuelLevel() {
		return amountOfFuel;
	}

	
}	
