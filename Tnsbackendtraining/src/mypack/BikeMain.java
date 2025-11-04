package mypack;

public class BikeMain {
	public static void main(String[] args) {
        Bike myBike = new Bike();
        myBike.brand = "Yamaha";
        myBike.model = "R15";
        myBike.mileage = 45;

        myBike.showDetails();
    }
}
