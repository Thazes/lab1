public class Boat extends Vehicle{

    String recreationActivity,propulsionTechnology,movementMode,relativeSpeed;

    public Boat(String type, String recreationActivity, String propulsionTechnology, String movementMode, String relativeSpeed) {
        super(type);
        this.recreationActivity = recreationActivity;
        this.propulsionTechnology = propulsionTechnology;
        this.movementMode = movementMode;
        this.relativeSpeed = relativeSpeed;
    }



    public String getRecreationActivity() {
        return recreationActivity;
    }

    public void setRecreationActivity(String recreationActivity) {
        this.recreationActivity = recreationActivity;
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

        System.out.println("Reacreation Activity Carried out: "+recreationActivity+" Propulsion Technology: "+propulsionTechnology+" Mode of Movement: "+movementMode+" Relative Speed: "+relativeSpeed);

    }
}
