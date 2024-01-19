public class Main {
    public static void main(String[] args) {
        Boat speedBoat=new Boat("Speed Boat","2","Turbine","Main Sail","200hp","Top Boat: Racing Simulator 3D");
        Bus passengerBus=new Bus("School Bus","64","Engine","School Bus Rodeo","400hp","Fern Bus Simulator");
        MotorCycle motorCycle=new MotorCycle("Ducati Panigale V4","1","Engine","Moto GP","280hp","Moto GP 23");
        Trailer trailer=new Trailer("Scania S Series","3","Engine","Top truck challenge","350hp","Euro truck simulator 2");

        speedBoat.vehicleCharacteristics();
        passengerBus.vehicleCharacteristics();
        motorCycle.vehicleCharacteristics();
        trailer.vehicleCharacteristics();
    }
}
