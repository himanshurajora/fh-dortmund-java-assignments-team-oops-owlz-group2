package class_assignments;

public class car {
    private double milesDriven;
    private double gasInTank;
    private double milesPerGallon;

    public car(double mpg) {
        milesDriven = 0;
        gasInTank = 0;
        milesPerGallon = mpg;
    }

    public car() {
        milesDriven = 0;
        gasInTank = 25;
        milesPerGallon = 75;
    }

    public car(double milesDriven, double gasInTank, double milesPerGallon) {
        this.milesDriven = milesDriven;
        this.gasInTank = gasInTank;
        this.milesPerGallon = milesPerGallon;
    }

    public double getM() {
        return milesPerGallon;
    }

    public void getAll() {
        System.out.print("Miles Driven = ");
        System.out.println(milesDriven);
        System.out.print("GasInTank = ");
        System.out.println(gasInTank);
        System.out.print("Miles per Gallon = ");
        System.out.println(milesPerGallon);
    }

    public void drive(double distance) {
        double GasConsumed = distance / milesPerGallon;
        milesDriven = milesDriven + distance;
        gasInTank = gasInTank - GasConsumed;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // car mySmart = new car(50);
        // System.out.println(mySmart.getM());
        // mySmart.getAll();

        // car secondOne = new car();
        // secondOne.drive(15);
        // secondOne.getAll();

        int garageCapacity = 100;

        car[] garage = new car[garageCapacity];

        for (int i = 0; i < garageCapacity; i++) {
            garage[i] = new car(0, 25, 75);
        }

        for (int i = 0; i < garageCapacity; i++) {
            garage[i].getAll();
        }
    }
}
