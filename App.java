public class App {
    public static void main(String[] args) {
        Truck truck = new Truck(80.0f, 80.0f, 6.0f, 4.5f, 10, 1);
        Ambulance ambulance = new Ambulance(100.0f, 60.0f, 6.5f, 6, 8);
        PatrolCar patrolCar = new PatrolCar(110.0f, 70.0f, 5.5f, 4, 4);

        System.out.println(truck);
        while (!truck.isEmpty()) truck.drive();

        System.out.println();

        System.out.println(ambulance);
        while (!ambulance.isEmpty()) ambulance.drive();
        ambulance.soundSiren();

        System.out.println();

        System.out.println(patrolCar);
        while (!patrolCar.isEmpty()) patrolCar.drive();
        patrolCar.soundSiren();
    }
}
