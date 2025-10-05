package self_assignment2_group2_team_opps_oops;


public class ProcessResult {
    private final String processName;
    private final double totalTime;
    private final int maxAGVs;
    private final double totalEnergy;

    public ProcessResult(String processName, double totalTime, int maxAGVs, double totalEnergy) {
        this.processName = processName;
        this.totalTime = totalTime;
        this.maxAGVs = maxAGVs;
        this.totalEnergy = totalEnergy;
    }

    @Override
    public String toString() {
        return String.format("%s -> Time: %.2f h | Max AGVs: %d | Energy: %.2f kWh",
                processName, totalTime, maxAGVs, totalEnergy);
    }
}
