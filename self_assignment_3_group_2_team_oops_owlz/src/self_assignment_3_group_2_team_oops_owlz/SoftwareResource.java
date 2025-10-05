package self_assignment_3_group_2_team_oops_owlz;

public class SoftwareResource extends NonHumanResource {
    public String version;

    public SoftwareResource(String name, String type, String version) {
        super(name, type);
        this.version = version;
    }

    public void execute() {
        System.out.printf("Software Resource -> %s is being used%n", name);
    }

    @Override
    public void use() {
        this.execute();
    }

    @Override
    public void showInfo() {
        System.out.printf("Software Resource -> Name: %s, Type: %s, Version: %s%n", name, type, version);
    }
}
