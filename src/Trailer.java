public class Trailer extends Vehicle{

    String usefullness,maximumLoadCapacity,numberOfAxles;

    public Trailer(String type, String usefullness, String maximumLoadCapacity, String numberOfAxles) {
        super(type);
        this.usefullness = usefullness;
        this.maximumLoadCapacity = maximumLoadCapacity;
        this.numberOfAxles = numberOfAxles;
    }


    public String getUsefullness() {
        return usefullness;
    }

    public void setUsefullness(String usefullness) {
        this.usefullness = usefullness;
    }

    public String getMaximumLoadCapacity() {
        return maximumLoadCapacity;
    }

    public void setMaximumLoadCapacity(String maximumLoadCapacity) {
        this.maximumLoadCapacity = maximumLoadCapacity;
    }

    public String getNumberOfAxles() {
        return numberOfAxles;
    }

    public void setNumberOfAxles(String numberOfAxles) {
        this.numberOfAxles = numberOfAxles;
    }

    @Override
    public void vehicleCharacteristics() {
        super.vehicleCharacteristics();

        System.out.println("Uses: "+usefullness+" Maximum Load Capacity: "+maximumLoadCapacity+" Number of axles: "+numberOfAxles);

    }
}