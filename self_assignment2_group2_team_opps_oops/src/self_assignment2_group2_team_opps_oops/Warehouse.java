package self_assignment2_group2_team_opps_oops;

import java.util.ArrayList;
import java.util.List;



public class Warehouse {
    private String name;
    private List<AGV> agvs = new ArrayList<>();
    private List<IndustrialProcess> processes = new ArrayList<>();

    // Constructor
    public Warehouse(String name) {
        this.name = name;
    }

   
    public void addAGV(AGV agv) {
        agvs.add(agv);
    }

    
    public void addProcess(IndustrialProcess process) {
        processes.add(process);
    }

    
    public void listAGVs() {
        System.out.println("AGVs in " + name + ":");
        for (AGV agv : agvs) {
            System.out.println("  - " + agv.getData());
        }
    }

    
    public void runProcesses() {
        System.out.println("\nRunning processes in " + name + "...");
        for (IndustrialProcess process : processes) {
            System.out.println(process.simulate());
        }
    }
}
