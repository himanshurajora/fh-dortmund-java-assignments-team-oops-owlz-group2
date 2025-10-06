package self_assignment_3_group_2_team_oops_owlz;

import java.util.List;

abstract public class IOperation {

    private final String name;
    private final List<AGV> agvs;
    private final double duration;

    public IOperation(String name, List<AGV> agvs, double duration) {
        this.name = name;
        this.agvs = agvs;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public List<AGV> getAgvs() {
        return agvs;
    }

    public double getDuration() {
        return duration;
    }

    abstract public void perform();

    abstract public double energyConsumed();
}
