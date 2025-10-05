package self_assignment_3_group_2_team_oops_owlz;

public class HardwareResource extends NonHumanResource {
    public String serialNumber;

    public HardwareResource(String name, String type, String serialNumber) {
        super(name, type);
        this.serialNumber = serialNumber;
    }

    public void start() {
        System.out.printf("Hardware Resource -> %s is starting%n", name);
    }

    public void stop() {
        System.out.printf("Hardware Resource -> %s is stopping%n", name);
    }

    @Override
    public void use() {
        System.out.printf("Hardware Resource -> %s is being used%n", name);
    }

    @Override
    public void showInfo() {
        System.out.printf("Hardware Resource -> Name: %s, Type: %s, Serial Number: %s%n", name, type, serialNumber);
    }
}
