package Java;

public class Truck {
    int weight;
    int height;
    int width;
    int lenght;
    int occupiedPlaces;
    int capacityOfcars;

    public Truck(int weight, int height, int width, int lenght, int occupiedPlaces, int capacityOfcars) {
        this.weight = weight;
        this.height = height;
        this.width = width;
        this.lenght = lenght;
        this.occupiedPlaces = 0;
        this.capacityOfcars = 8;

    }
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getOccupiedPlaces() {
        return occupiedPlaces;
    }

    public void setOccupiedPlaces(int occupiedPlaces) {
        this.occupiedPlaces = occupiedPlaces;
    }

    public int getCapacityOfcars() {
        return capacityOfcars;
    }


    public void setCapacityOfcars(int capacityOfcars) {
        this.capacityOfcars = capacityOfcars;
    }

    void load(TransportableCar transportableCar) {
        if (occupiedPlaces == capacityOfcars) {
            System.err.println("Busy");
        } else {
            String[] cars = new String[capacityOfcars];
            cars[occupiedPlaces] = transportableCar.getEngNum();
            System.out.println("Loaded");
            occupiedPlaces++;
        }
    }
}

