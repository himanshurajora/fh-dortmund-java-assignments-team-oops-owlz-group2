package self_assignment_3_group_2_team_oops_owlz;

public class Task {
    public String name;
    public double duration;

    @Override
    public String toString() {
        return String.format("Task info -> Task :[%s], and it runs for the following duration: [.2%f]", this.name,
                this.duration);
    }
}
