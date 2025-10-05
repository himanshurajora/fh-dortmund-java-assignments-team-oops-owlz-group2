package self_assignment_3_group_2_team_oops_owlz;

public class MaterialResource extends NonHumanResource {
    public String quantity;

    public MaterialResource(String name, String type, String quantity) {
        super(name, type);
        this.quantity = quantity;
    }

    public void use() {
        System.out.printf("Material Resource -> %s is being used%n", name);
    }

    @Override
    public void showInfo() {
        System.out.printf("Material Resource -> Name: %s, Type: %s, Quantity: %s%n", name, type, quantity);
    }
}
