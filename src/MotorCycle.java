public class MotorCycle extends Vehicle{

    String fuelCapacity,engineCapacity,trafficNavigation,drivingProcess;

    public MotorCycle(String type, String fuelCapacity, String engineCapacity, String trafficNavigation, String drivingProcess) {
        super(type);
        this.fuelCapacity = fuelCapacity;
        this.engineCapacity = engineCapacity;
        this.trafficNavigation = trafficNavigation;
        this.drivingProcess = drivingProcess;
    }

    public String getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(String fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public String getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(String engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getTrafficNavigation() {
        return trafficNavigation;
    }

    public void setTrafficNavigation(String trafficNavigation) {
        this.trafficNavigation = trafficNavigation;
    }

    public String getDrivingProcess() {
        return drivingProcess;
    }

    public void setDrivingProcess(String drivingProcess) {
        this.drivingProcess = drivingProcess;
    }

    @Override
    public void vehicleCharacteristics() {
        super.vehicleCharacteristics();

        System.out.println("Fuel Capacity: "+fuelCapacity+" Engine Capacity: "+engineCapacity+" Traffic Navigation: "+trafficNavigation+" Driving process: "+drivingProcess);

    }
}
