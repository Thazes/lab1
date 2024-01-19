public class Vehicle {
    String type,numberPassengers,engineCapacity;

    public Vehicle(String type, String numberPassengers, String engineCapacity) {
        this.type = type;
        this.numberPassengers = numberPassengers;
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNumberPassengers() {
        return numberPassengers;
    }

    public void setNumberPassengers(String numberPassengers) {
        this.numberPassengers = numberPassengers;
    }

    public String getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(String engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public void vehicleCharacteristics(){
        System.out.println("Type: "+type+ " Number of passengers: "+numberPassengers+" Engine capacity: "+engineCapacity);
    }
}
