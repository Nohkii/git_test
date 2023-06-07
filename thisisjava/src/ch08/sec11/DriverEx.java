package ch08.sec11;

public class DriverEx {

	public static void main(String[] args) {
		Driver driver = new Driver();

		Bus bus = new Bus();

		Taxi taxi = new Taxi();

		driver.drive(bus);
		driver.drive(taxi);
		
		//버스5대, 택시5대
		/*Bus[] bus = new Bus[5];
		Taxi[] taxi= new Taxi[5];
		Vehicle[] v = {new Bus(), new Taxi(), new Bus(), new Taxi()};
		
		for (Object ve: v){
		ve.run} 
		*/
	}

}
