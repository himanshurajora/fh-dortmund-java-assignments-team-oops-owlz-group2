package self_assignment_3_group_2_team_oops_owlz;

import java.util.List;

public class TransportOperation extends IOperation {

    private final double distance;

    public TransportOperation(String name, double duration, List<AGV> agvs, double distance) {
        super(name, agvs, duration);
        this.distance = distance;
    }

    @Override
    public void perform() {
        for (AGV agv : getAgvs()) {
            agv.perform(getName());
        }
    }

    @Override
    public double energyConsumed() {
        double total = 0.0;
        for (AGV agv : getAgvs()) {
            total += agv.getConsumption() * getDuration();
        }
        return total;
    }

    public double getDistance() {
        return distance;
    }
}
