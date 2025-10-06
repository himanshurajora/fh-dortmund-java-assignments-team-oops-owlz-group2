package self_assignment_3_group_2_team_oops_owlz;

import java.util.ArrayList;
import java.util.List;

public class IndustrialProcess {
    private final String name;
    private final List<Operation> operations = new ArrayList<>();

    public IndustrialProcess(String name) {
        this.name = name;
    }

    public void addOperation(Operation op) {
        operations.add(op);
    }

    public ProcessResult simulate() {
        double totalTime = 0.0;
        double totalEnergy = 0.0;
        int maxAGVs = 0;

        for (Operation op : operations) {
            op.perform(); // AGVs use energy
            totalTime += op.getUnitDurationEnergyConsumption();
            totalEnergy += op.energyConsumed();
            maxAGVs = Math.max(maxAGVs, op.getAgvs().size());
        }

        return new ProcessResult(name, totalTime, maxAGVs, totalEnergy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(name + ":\n");
        for (Operation op : operations) {
            sb.append("  - ").append(op).append("\n");
        }
        return sb.toString();
    }
}
