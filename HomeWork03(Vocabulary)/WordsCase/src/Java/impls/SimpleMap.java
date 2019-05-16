package Java.impls;

import Java.interfaces.Map;
import Java.interfaces.Reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SimpleMap<K, V> implements Map<K, V> {
    private static final int SIZE = 2;
    private Entry<K, V>[] entries;
    private int count;
    private final float KOEF = (float) 1.5;

    public SimpleMap() {
        this.entries = new Entry[SIZE];
        this.count = 0;
    }

    class Entry<I, E> {
        I key;
        E value;

        public Entry(I key, E value) {
            this.key = key;
            this.value = value;
        }
    }

    @Override
    public void put(K key, V value) {
        for (int i = 0; i < count; i++) {
            if (entries[i].key.equals(key)) {
                entries[i].value = value;
                return;
            }
        }
        if (count >= SIZE) {
            expand();
        }
        entries[count++] = new Entry<K, V>(key, value);
    }

    private void expand() {
        //entries = Arrays.copyOf(entries, (int) (count + 1));
        int x = entries.length;
        Entry[] entr = new Entry[(int) (x * KOEF)];
        for (int i = 0; i < x; i++) {
            entr[i] = entries[i];
        }
        entries = entr;
    }

    @Override
    public V get(K key) {
        for (int i = 0; i < count; i++) {
            if (entries[i].key.equals(key)) {
                return (V) entries[i].value;//Или дописать в Entry<K,V>[]
            }
        }
        return null;
    }

    public void print(Map map) {
        ReaderImpl reader = new ReaderImpl();
        reader.read(map);
        for (int i = 0; i < count; i++) {
            System.out.println("Количество слов " + entries[i].key + " = " + entries[i].value);
        }
    }
}
