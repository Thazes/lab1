public class Main {
    public static void main(String[] args) {
        Boat yatch=new Boat("Yatch","Snorkeling","Turbines","sailing","slow");
        Bus passengerBus=new Bus("School Bus","Ferrying children to school","6","64","Fairly predictable as it has a unique route schedule");
        MotorCycle motorCycle=new MotorCycle("Boxer","20 Litres","180cc","Easy to navigate traffic due to the small size","Riding");
        Trailer trailer=new Trailer("Scania S Series","Carrying large loads","40 tonnes","10","Trucking");

        yatch.vehicleCharacteristics();
        passengerBus.vehicleCharacteristics();
        motorCycle.vehicleCharacteristics();
        trailer.vehicleCharacteristics();
    }
}
