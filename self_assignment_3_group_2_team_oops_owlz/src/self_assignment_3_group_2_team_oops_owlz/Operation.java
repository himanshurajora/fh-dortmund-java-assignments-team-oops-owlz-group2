package self_assignment_3_group_2_team_oops_owlz;

import java.util.List;

public class Operation {
    private final String name;
    private final double duration;
    private final List<AGV> agvs;

    public Operation(String name, double duration, List<AGV> agvs) {
        this.name = name;
        this.duration = duration;
        this.agvs = agvs;
    }

    public String getName() {
        return name;
    }

    public double getDuration() {
        return duration;
    }

    public List<AGV> getAgvs() {
        return agvs;
    }

    public double energyConsumed() {
        double total = 0.0;
        for (AGV agv : agvs) {
            total += agv.getConsumption() * duration;
        }
        return total;
    }

    public void perform() {
        for (AGV agv : agvs) {
            agv.perform(duration);
        }
    }

    @Override
    public String toString() {
        return String.format("%s (%.2f h, AGVs=%d)", name, duration, agvs.size());
    }
}
