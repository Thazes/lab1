public class MotorCycle extends Vehicle{

    String fuelCapacity,engineCapacity,computerGame;

    public MotorCycle(String type, String fuelCapacity, String engineCapacity, String computerGame) {
        super(type);
        this.fuelCapacity = fuelCapacity;
        this.engineCapacity = engineCapacity;
        this.computerGame = computerGame;
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

    public String getComputerGame() {
        return computerGame;
    }

    public void setComputerGame(String computerGame) {
        this.computerGame = computerGame;
    }

    @Override
    public void vehicleCharacteristics() {
        super.vehicleCharacteristics();

        System.out.println("Fuel Capacity: "+fuelCapacity+" Engine Capacity: "+engineCapacity+" Computer Game: "+computerGame);

    }
}
