package self_assignment_3_group_2_team_oops_owlz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- 1. Initializing Warehouse Resources ---");

        AGV agv1 = new AGV("AGV-1", 50.0, 5.0, 2.0, "Dock", 10.0f, 5.0f, "AGV-1", "Hardware", "SN-HW-001");
        AGV agv2 = new AGV("AGV-2", 40.0, 4.0, 1.5, "Aisle-1", 8.0f, 4.0f, "AGV-2", "Hardware", "SN-HW-002");
        AGV agv3 = new AGV("AGV-3", 60.0, 6.0, 2.5, "Storage", 12.0f, 6.0f, "AGV-3", "Hardware", "SN-HW-003");

        // Human Resources
        HumanResource operator = new HumanResource("John Doe", "Warehouse Operator");

        // Software Resources
        SoftwareResource wms = new SoftwareResource("WMS", "Control Software", "v2.1.3");

        // Material Resources
        MaterialResource goods = new MaterialResource("Palletized Goods", "Inventory", "100 units");

        // Display info for all resources
        System.out.println("Available Resources:");
        agv1.showInfo();
        agv2.showInfo();
        agv3.showInfo();
        operator.showInfo();
        wms.showInfo();
        goods.showInfo();
        System.out.println();

        System.out.println("--- 2. Setting up Warehouse ---");
        Warehouse warehouse = new Warehouse("Main Warehouse");
        warehouse.addAGV(agv1);
        warehouse.addAGV(agv2);
        warehouse.addAGV(agv3);
        System.out.println("Warehouse '" + warehouse.getName() + "' is operational.");
        System.out.println();

        System.out.println("--- 3. Defining and Running Industrial Process ---");
        // Create industrial operations
        HumanOperation unload = new HumanOperation("Unload", 1.0, Arrays.asList(agv1, agv2), 2.0);

        TransportOperation transport = new TransportOperation("Transport", 0.5, Arrays.asList(agv2, agv3), 0.5);
        HumanOperation store = new HumanOperation("Store", 2.0, Arrays.asList(agv1), 2.5);

        IndustrialProcess receivingProcess = new IndustrialProcess("Goods Receiving Process");
        receivingProcess.addOperation((IOperation) unload);
        receivingProcess.addOperation((IOperation) transport);
        receivingProcess.addOperation((IOperation) store);
        warehouse.addProcess(receivingProcess);

        System.out.println("Initial AGV states:");
        warehouse.listAGVs();
        warehouse.runProcesses();
        System.out.println("\nAGV states after industrial process:");
        warehouse.listAGVs();
        System.out.println();

        System.out.println("--- 4. Performing a Human-involved Operation ---");
        HumanOperation inspection = new HumanOperation("Quality Inspection", 0.5, Arrays.asList(agv1), 1.2);
        System.out.println("Performing operation: " + inspection.getName());
        inspection.perform();
        System.out.printf("Work hours consumed for inspection: %.2f hours%n", inspection.workHoursConsumed());
        System.out.println();

        System.out.println("--- 5. Defining and Running Management Process ---");
        HumanOperation maintenance = new HumanOperation("AGV Maintenance", 4.0, Arrays.asList(agv2), 0.5);
        HumanOperation softwareUpdate = new HumanOperation("WMS Software Update", 2.0, new ArrayList<>(), 0.1); // No
                                                                                                                // AGV
                                                                                                                // needed

        List<IOperation> managementOps = new ArrayList<>(Arrays.asList(maintenance, softwareUpdate));
        ManagementProcess annualReview = new ManagementProcess("Annual Maintenance Review", managementOps);
        System.out.println("Performing management process: " + annualReview.getName());
        annualReview.perform();
        System.out.println();

        System.out.println("--- 6. Defining a Task for a Human Resource ---");
        Task chargeTask = new Task("Charge all AGVs for next shift", 3.0, operator);
        System.out.println("New task assigned to " + operator.name + " (" + operator.role + "):");
        System.out.println(chargeTask.toString());
        System.out.println();

        System.out.println("--- End of Simulation ---");
    }
}
