package self_assignment_3_group_2_team_oops_owlz;

import java.util.List;

public class ManagementProcess extends Process {
    public ManagementProcess(String name, List<IOperation> operations) {
        super(name, operations);
    }

    @Override
    public void perform() {
        for (IOperation operation : this.getOperations()) {
            operation.perform();
        }
    }
}
