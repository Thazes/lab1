public class Bus extends Vehicle{

    String usefullness,numberOfWheels,numberofPassengers;

    public Bus(String type,String usefullness,String numberOfWheels,String numberofPassengers) {
        super(type);

        this.usefullness=usefullness;
        this.numberOfWheels=numberOfWheels;
        this.numberofPassengers=numberofPassengers;
    }

    public String getUsefullness() {
        return usefullness;
    }

    public void setUsefullness(String usefullness) {
        this.usefullness = usefullness;
    }

    public String getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(String numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getNumberofPassengers() {
        return numberofPassengers;
    }

    public void setNumberofPassengers(String numberofPassengers) {
        this.numberofPassengers = numberofPassengers;
    }

    @Override
    public void vehicleCharacteristics() {
        super.vehicleCharacteristics();

        System.out.println("Uses: "+usefullness+" Number of wheels: "+numberOfWheels+" Number of passengers: "+numberofPassengers);
    }
}
