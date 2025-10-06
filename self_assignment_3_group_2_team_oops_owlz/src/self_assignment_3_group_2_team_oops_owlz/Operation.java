package self_assignment_3_group_2_team_oops_owlz;

import java.util.List;

public class Operation extends IOperation {
    private final double unitDurationEnergyConsumption;
    private final double duration;

    public Operation(String name, double duration, List<AGV> agvs, double unitDurationEnergyConsumption) {
        super(name, agvs);
        this.duration = duration;
        this.unitDurationEnergyConsumption = unitDurationEnergyConsumption;
    }

    public double getUnitDurationEnergyConsumption() {
        return unitDurationEnergyConsumption;
    }

    public double energyConsumed() {
        double total = 0.0;
        for (AGV agv : getAgvs()) {
            total += agv.getConsumption() * duration * unitDurationEnergyConsumption;
        }
        return total;
    }

    @Override
    public void perform() {
        for (AGV agv : getAgvs()) {
            agv.perform(getName());
        }
    }

    @Override
    public String toString() {
        return String.format("%s (%.2f h, AGVs=%d)", getName(), duration, getAgvs().size());
    }
}
