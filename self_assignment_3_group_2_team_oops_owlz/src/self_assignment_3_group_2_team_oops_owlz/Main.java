package self_assignment_3_group_2_team_oops_owlz;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        AGV agv1 = new AGV("AGV-1", 50.0, 5.0, 2.0, "Dock", 10.0f, 5.0f, "AGV-1", "Hardware", "1234567890");
        AGV agv2 = new AGV("AGV-2", 40.0, 4.0, 1.5, "Aisle-1", 8.0f, 4.0f, "AGV-2", "Hardware", "1234567890");
        AGV agv3 = new AGV("AGV-3", 60.0, 6.0, 2.5, "Storage", 12.0f, 6.0f, "AGV-3", "Hardware", "1234567890");

        // Create operations
        Operation unload = new Operation("Unload", 1.0, Arrays.asList(agv1, agv2), 1.0);
        Operation transport = new Operation("Transport", 0.5, Arrays.asList(agv2,
                agv3), 2.0);
        Operation store = new Operation("Store", 2.0, Arrays.asList(agv1), 2.5);

        IndustrialProcess process = new IndustrialProcess("Warehouse-Process");
        process.addOperation(unload);
        process.addOperation(transport);
        process.addOperation(store);

        Warehouse warehouse = new Warehouse("Main Warehouse");
        warehouse.addAGV(agv1);
        warehouse.addAGV(agv2);
        warehouse.addAGV(agv3);
        warehouse.addProcess(process);

        warehouse.listAGVs();

        warehouse.runProcesses();

        agv1.showInfo();

        System.out.println("\nAGV states after simulation:");
        warehouse.listAGVs();
    }
}
