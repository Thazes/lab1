public class Boat extends Vehicle{

    String competitiveSport,propulsionTechnology,movementMode,relativeSpeed;

    public Boat(String type, String competitiveSport, String propulsionTechnology, String movementMode, String relativeSpeed) {
        super(type);
        this.competitiveSport = competitiveSport;
        this.propulsionTechnology = propulsionTechnology;
        this.movementMode = movementMode;
        this.relativeSpeed = relativeSpeed;
    }

    public Boat(String type, String competitiveSport, String propulsionTechnology, String movementMode) {
        super(type);
        this.competitiveSport = competitiveSport;
        this.propulsionTechnology = propulsionTechnology;
        this.movementMode = movementMode;
    }

    public String getCompetitiveSport() {
        return competitiveSport;
    }

    public void setCompetitiveSport(String competitiveSport) {
        this.competitiveSport = competitiveSport;
    }

    public String getPropulsionTechnology() {
        return propulsionTechnology;
    }

    public void setPropulsionTechnology(String propulsionTechnology) {
        this.propulsionTechnology = propulsionTechnology;
    }

    public String getMovementMode() {
        return movementMode;
    }

    public void setMovementMode(String movementMode) {
        this.movementMode = movementMode;
    }

    public String getRelativeSpeed() {
        return relativeSpeed;
    }

    public void setRelativeSpeed(String relativeSpeed) {
        this.relativeSpeed = relativeSpeed;
    }

    @Override
    public void vehicleCharacteristics() {
        super.vehicleCharacteristics();

        System.out.println("Competitive Sport: "+competitiveSport+" Propulsion Technology: "+propulsionTechnology+" Mode of Movement: "+movementMode+" Relative Speed: "+relativeSpeed);

    }
}
