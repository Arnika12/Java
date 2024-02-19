/*Write a Java program to create a super class Vehicle having members Company and Price. 
Derive two different classes LightMotorVehicle (mileage) and HeavyMotorVehicle (capacity_in_tons). 
Accept the information for “n” vehicles and display the information in appropriate form. 
While taking data, ask user about the type of vehicle first*/


import java.util.Scanner;

class Vehicle {
    String company;
    double price;

    public Vehicle() {
        company = "TATA";
        price = 90000;
    }

    public Vehicle(String company, double price) {
        this.company = company;
        this.price = price;
    }

    public void getInput() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Vehicle Company: ");
        this.company = s.next();
        System.out.print("Enter Vehicle Price: ");
        this.price = s.nextDouble();
    }

    public void display() {
        System.out.println("\nVehicle Company: " + company);
        System.out.println("Vehicle Price: " + price);
    }
}

class LightMotorVehicle extends Vehicle 
{
    protected double mileage;

public LightMotorVehicle(String company, double price, double mileage) 
{
        super(company, price);
        this.mileage = mileage;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Mileage: " + mileage);
    }
}

class HeavyMotorVehicle extends Vehicle {
    protected double capacity_in_tons;

    public HeavyMotorVehicle(String company, double price, double capacity_in_tons) {
        super(company, price);
        this.capacity_in_tons = capacity_in_tons;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Capacity in tons: " + capacity_in_tons);
    }
}

public class Vehicle1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of Vehicles: ");
        int n = s.nextInt();
        Vehicle[] vehicles = new Vehicle[n];

        for (int i = 0; i < n; i++) 
        {
            	System.out.print("\nEnter the type of vehicle (light or heavy): ");
            	String type = s.next();
            	if (type.equals("light")) 
	{
                		System.out.print("Enter the mileage: ");
                		double mileage = s.nextDouble();
                		vehicles[i] = new LightMotorVehicle("", 0, mileage);
            	} 
	else if (type.equals("heavy")) 
	{
                		System.out.print("Enter the capacity in tons: ");
                		double capacity_in_tons = s.nextDouble();
                		vehicles[i] = new HeavyMotorVehicle("", 0, capacity_in_tons);
            	}
                   vehicles[i].getInput();
        }

        System.out.println("\nThe vehicle information is as follows: ");
        for (Vehicle vehicle : vehicles) {
            vehicle.display();
        }
    }
}



