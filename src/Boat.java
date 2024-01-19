public class Boat extends Vehicle{

    String competitiveSport,engineCapacity,computerGame;

    public Boat(String type, String numberPassengers, String propulsionTechnology, String competitiveSport, String engineCapacity, String computerGame) {
        super(type, numberPassengers, propulsionTechnology);
        this.competitiveSport = competitiveSport;
        this.engineCapacity = engineCapacity;
        this.computerGame = computerGame;
    }

    public String getCompetitiveSport() {
        return competitiveSport;
    }

    public void setCompetitiveSport(String competitiveSport) {
        this.competitiveSport = competitiveSport;
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

        System.out.println("Competitive Sport: "+competitiveSport+" Engine Capacity: "+engineCapacity+" Computer Game: "+computerGame);

    }
}
