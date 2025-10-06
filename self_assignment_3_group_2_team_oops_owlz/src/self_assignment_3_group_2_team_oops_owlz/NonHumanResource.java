package self_assignment_3_group_2_team_oops_owlz;

abstract public class NonHumanResource extends Resource {
    public String name;
    public String type;

    public NonHumanResource(String name, String type) {
        this.name = name;
        this.type = type;
    }

    abstract public void use();
}