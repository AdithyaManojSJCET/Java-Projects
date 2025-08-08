class Vehicle{
	String brand;
	String model;
	Vehicle(String brand,String model){
		this.brand=brand;
		this.model=model;
	}
	void displayinfo() {
		System.out.println("Brand: "+brand);
		System.out.println("Model: "+model);
	}
}
class Car extends Vehicle{
	String fuelType;
	Car(String brand, String model, String fuelType){
		super(brand, model);
		this.fuelType=fuelType;
	}
	public void displayInfo() {
		super.displayinfo();
		System.out.println("Fuel Type: "+fuelType);
	}
}
class ElectricCar extends Car{
	double batteryCapacity;
	ElectricCar(String brand, String model, String fuelType, double batteryCapacity) {
		super(brand,model,fuelType);
		this.batteryCapacity=batteryCapacity;
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Battery Capacity(kWh): "+batteryCapacity);
	}
}
public class Vandi {
	public static void main(String[] args) {
		ElectricCar Ev1 = new ElectricCar("Tesla", "S", "Electric", 100);
		Ev1.displayInfo();
	}
}





