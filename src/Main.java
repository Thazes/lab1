public class Main {
    public static void main(String[] args) {
        Boat yatch=new Boat("Yatch","","Turbines","sailing","slow");
        Bus passengerBus=new Bus("School Bus","Ferrying children to school","6","64");
        MotorCycle motorCycle=new MotorCycle("Boxer","20 Litres","180cc","");
        Trailer trailer=new Trailer("Scania S Series","Carrying large loads","40 tonnes","10");

        yatch.vehicleCharacteristics();
        passengerBus.vehicleCharacteristics();
        motorCycle.vehicleCharacteristics();
        trailer.vehicleCharacteristics();
    }
}
