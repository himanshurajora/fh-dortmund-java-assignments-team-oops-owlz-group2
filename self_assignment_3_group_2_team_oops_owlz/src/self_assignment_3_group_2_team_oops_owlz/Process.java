package self_assignment_3_group_2_team_oops_owlz;

import java.util.List;

abstract public class Process {
    private final String name;
    private final List<IOperation> operations;

    public Process(String name, List<IOperation> operations) {
        this.name = name;
        this.operations = operations;
    }

    public String getName() {
        return name;
    }

    public List<IOperation> getOperations() {
        return operations;
    }

    abstract public void perform();
}
