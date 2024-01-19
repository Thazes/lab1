public class Vehicle {
    String type,numberPassengers,propulsionTechnology;

    public Vehicle(String type, String numberPassengers, String propulsionTechnology) {
        this.type = type;
        this.numberPassengers = numberPassengers;
        this.propulsionTechnology = propulsionTechnology;
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

    public String getPropulsionTechnology() {
        return propulsionTechnology;
    }

    public void setPropulsionTechnology(String propulsionTechnology) {
        this.propulsionTechnology = propulsionTechnology;
    }

    public void vehicleCharacteristics(){
        System.out.println("Type: "+type+ " Number of passengers: "+numberPassengers+" Propulsion Technology: "+propulsionTechnology);
    }
}
