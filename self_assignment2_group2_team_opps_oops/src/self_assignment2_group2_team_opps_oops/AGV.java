package self_assignment2_group2_team_opps_oops;

public class AGV {
    private String id;
    private double batteryLoad;
    private double consumption;
    private double chargingTime;
    private String position;
    private float maxSpeed;
    private float actSpeed;

    // Constructor
    public AGV(String id, double batteryLoad, double consumption,
            double chargingTime, String position, float maxSpeed, float actSpeed) {
        this.id = id;
        this.batteryLoad = batteryLoad;
        this.consumption = consumption;
        this.chargingTime = chargingTime;
        this.position = position;
        this.maxSpeed = maxSpeed;
        this.actSpeed = actSpeed;
    }

    // --- Getters and Setters ---
    public String getId() {
        return id;
    }

    public double getBatteryLoad() {
        return batteryLoad;
    }

    public double getConsumption() {
        return consumption;
    }

    public double getChargingTime() {
        return chargingTime;
    }

    public String getPosition() {
        return position;
    }

    public float getMaxSpeed() {
        return maxSpeed;
    }

    public float getActSpeed() {
        return actSpeed;
    }

    public void setData(String id, double batteryLoad, double consumption,
            double chargingTime, String position, float maxSpeed, float actSpeed) {
        this.id = id;
        this.batteryLoad = batteryLoad;
        this.consumption = consumption;
        this.chargingTime = chargingTime;
        this.position = position;
        this.maxSpeed = maxSpeed;
        this.actSpeed = actSpeed;
    }

    public String getData() {
        return String.format("AGV[%s]: Battery=%.2f kWh, Consumption=%.2f kW, Pos=%s, Speed=%.1f/%.1f",
                id, batteryLoad, consumption, position, actSpeed, maxSpeed);
    }

    public void perform(double hours) {
        double used = hours * consumption;
        batteryLoad = Math.max(0, batteryLoad - used);
    }
}
