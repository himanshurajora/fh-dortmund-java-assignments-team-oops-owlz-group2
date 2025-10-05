package self_assignment_3_group_2_team_oops_owlz;

public class NonHumanResource extends Resource {
    public String name;
    public String type;

    public void use() {
    }

    @Override
    public void showInfo() {
        System.out.printf("Non Human Resource -> Name: {%s} and Type: {%s}", name, type);
    }
}