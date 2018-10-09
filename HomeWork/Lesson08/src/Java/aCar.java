package Java;

public class aCar {

    public static void main(String[] args) {
        Truck truck = new Truck(8000,6,3,40,6,0);
        TransportableCar lexus= new TransportableCar(4000,2,2,5,"AB12312551","A180BC");
        TransportableCar lada = new TransportableCar(1000,2,2,5,"AVX1251616","A222CB");
        truck.load(lexus);
        System.out.println(truck.getOccupiedPlaces());
        System.out.println();
    }
}
