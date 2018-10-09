
package Java;
public class TransportableCar {
    int weight;
    int height;
    int width;
    int lenght;
    String engNum;
    String regNum;

    public TransportableCar(int weight, int height, int width, int lenght, String engNum, String regNum) {
        this.weight = weight;
        this.height = height;
        this.width = width;
        this.lenght = lenght;
        this.engNum = engNum;
        this.regNum = regNum;
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

    public String getEngNum() {
        return engNum;
    }

    public void setEngNum(String engNum) {
        this.engNum = engNum;
    }

    public String getRegNum() {
        return regNum;
    }

    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }
}
