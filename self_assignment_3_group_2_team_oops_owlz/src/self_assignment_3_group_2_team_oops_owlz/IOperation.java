package self_assignment_3_group_2_team_oops_owlz;

import java.util.List;

abstract public class IOperation {

    private final String name;
    private final List<AGV> agvs;

    public IOperation(String name, List<AGV> agvs) {
        this.name = name;
        this.agvs = agvs;
    }

    public String getName() {
        return name;
    }

    public List<AGV> getAgvs() {
        return agvs;
    }

    abstract public void perform();
}
