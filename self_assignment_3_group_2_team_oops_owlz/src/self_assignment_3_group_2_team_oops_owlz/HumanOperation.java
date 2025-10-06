package self_assignment_3_group_2_team_oops_owlz;

import java.util.List;

public class HumanOperation extends IOperation {

    private final double workHoursPerUnit;

    public HumanOperation(String name, double duration, List<AGV> agvs, double workHoursPerUnit) {
        super(name, agvs, duration);
        this.workHoursPerUnit = workHoursPerUnit;
    }

    public double workHoursConsumed() {
        return getAgvs().size() * workHoursPerUnit;
    }

    @Override
    public double energyConsumed() {
        return this.workHoursConsumed();
    }

    @Override
    public void perform() {
        for (AGV agv : getAgvs()) {
            agv.perform(getName());
        }
    }
}
