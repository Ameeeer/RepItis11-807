package Java;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class GraphGenerator {
    public static final int INFINITY = 10000000;
    public static final int COUNT_OF_GRAPHS = 1;
    public static final int COUNT_OF_VERTEXES = 10;
    public static int interations = 0;
    public static PrintWriter pw1;
    public static PrintWriter pw2;

//    public static void main(String[] args) throws FileNotFoundException {
//        generator();
//    }

    public static void alogrithmForArray() {

    }

    public void infArray(int[] d) {
        d[0] = 0;
        for (int i = 1; i < d.length; i++) {
            d[i] = INFINITY;
        }
    }

    public static int getCountOfVertexes() {
        return COUNT_OF_VERTEXES;
    }

    public void generator() throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("Data.txt");
        for (int i = 0; i < COUNT_OF_GRAPHS; i++) {
            for (int j = 0; j < COUNT_OF_VERTEXES; j++) {
                for (int l = 0; l < COUNT_OF_VERTEXES; l++) {
                    if (j == l) {
                        pw.print(0);
                        pw.print(" ");
                    } else {
                        Random random = new Random();
                        int weight = (int) ((Math.random() * (2 + 1)) - 1);
                        pw.print(weight);
                        pw.print(" ");
                    }
                }
                pw.print('\n');
            }
            pw.print("-");
            pw.print('\n');
        }
        pw.close();

    }
}

