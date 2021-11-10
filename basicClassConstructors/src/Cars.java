
import java.util.Scanner;

public class Cars {
    public String carModel ;
    public double fuel ;
    public double speed;
    public String licence  ;

    Cars(String carModel)
    {
        System.out.println("Enter the car model = " +carModel );
    }
    Cars(double f)
    {
        System.out.println("The fuel is ="+ f);
    }
    Cars(String model, double s,double f, String l)
    {
        System.out.println("The current model,speed, fuel and Licence are = "+model+" "+s+" "+f+" "+l);
        this.fuel= f;
    }
        public double getFuel () {
            return fuel;
        }

        public void setFuel ( double fuel){
            this.fuel = this.fuel+ fuel;
        }

        public double getSpeed () {
            return speed;
        }

        public void setSpeed ( double speed){
            this.speed = speed;
        }

        public String getCarModel() {
        return carModel;
        }

        public void setCarModel(String carModel) {
        this.carModel = carModel;
        }

        public String getLicence () {
            return licence;
        }

        public void setLicence (String licence){
            this.licence = licence;
        }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter the model, speed, fuel and licence one by one");
        Cars car= new Cars(scan.next(),scan.nextDouble(), scan.nextDouble(), scan.next());
        System.out.println("Set the new car licence");
        car.setLicence(scan.next());
        System.out.println("Add Fuel = ");
        car.setFuel(scan.nextDouble());
        System.out.println("Current Fuel is now = "+ car.getFuel());
        System.out.println("New licence is = "+ car.getLicence());
        System.out.println("Enter the new car's model, fuel, speed and licence one by one");
        Cars car2= new Cars(scan.next(), scan.nextDouble(), scan.nextDouble(), scan.next());
        System.out.println("Add Fuel = ");
        car2.setFuel(scan.nextDouble());
        System.out.println("Current Fuel is now = "+ car2.getFuel());
    }
}
