package Java;

import Java.impls.SimpleMap;
import Java.interfaces.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> map = new SimpleMap<String, Integer>();
        ((SimpleMap<String, Integer>) map).print(map);
    }
}
