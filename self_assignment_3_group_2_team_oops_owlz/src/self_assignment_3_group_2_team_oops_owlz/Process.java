package self_assignment_3_group_2_team_oops_owlz;

import java.util.List;

abstract public class Process {
    private final String name;
    private final List<Operation> operations;

    public Process(String name, List<Operation> operations) {
        this.name = name;
        this.operations = operations;
    }

    public String getName() {
        return name;
    }

    public List<Operation> getOperations() {
        return operations;
    }

    abstract public void perform();
}
