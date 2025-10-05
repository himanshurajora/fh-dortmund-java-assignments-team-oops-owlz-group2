package self_assignment_3_group_2_team_oops_owlz;

import java.util.List;

public class ManagementProcess extends Process {
    public ManagementProcess(String name, List<Operation> operations) {
        super(name, operations);

    }

    public void addOperation(Operation operation) {
        getOperations().add(operation);
    }

    @Override
    public void perform() {
        for (Operation operation : getOperations()) {
            operation.perform();
        }
    }
}
