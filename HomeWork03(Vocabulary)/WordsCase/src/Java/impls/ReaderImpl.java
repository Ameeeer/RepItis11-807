package Java.impls;

import Java.interfaces.Map;
import Java.interfaces.Reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReaderImpl implements Reader {
    @Override
    public void read(Map map) {
        int value = 1;
        Scanner sc = null;
        try {
            sc = new Scanner(new File("/Users/a.marselevicloud.com/Desktop/HWBitBuck807/karimullin_11_807/HomeWork03(Vocabulary)/WordsCase/Text.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (sc.hasNext()) {
            String s = sc.next().toLowerCase();
            if (map.get(s) == null) {
                map.put(s, value);
            } else {
                map.put(s, (int) map.get(s) + value);
            }
        }
    }
}
