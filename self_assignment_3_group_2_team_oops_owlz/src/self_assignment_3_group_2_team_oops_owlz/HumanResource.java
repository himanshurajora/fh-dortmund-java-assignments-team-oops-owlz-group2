package self_assignment_3_group_2_team_oops_owlz;

public class HumanResource extends Resource {
    public String name;
    public String role;

    @Override
    public void showInfo() {
        System.out.printf("Human Resource -> Name: %s and Role: %s%n", name, role);
    }
}
