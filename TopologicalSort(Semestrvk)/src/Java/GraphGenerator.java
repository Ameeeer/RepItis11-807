package Java;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class GraphGenerator {
    public static final int INFINITY = 10000000;
    public static final int COUNT_OF_GRAPHS = 1;
    public static int countOfVertexes;

//    public static void main(String[] args) throws FileNotFoundException {
//        generator();
//    }

    public GraphGenerator(int countOfVertexes) {
        this.countOfVertexes = countOfVertexes;
    }

    public static int getCountOfVertexes() {
        return countOfVertexes;
    }

    public void generator() throws FileNotFoundException {
        PrintWriter pw1 = new PrintWriter("Data.txt");
        int[][] vert = new int[countOfVertexes][countOfVertexes];
        for (int j = 0; j < countOfVertexes; j++) {
            for (int l = 0; l < countOfVertexes; l++) {
                if (j == l) {
                    vert[l][l] = 0;
                    pw1.print(0);
                    pw1.print(" ");
                } else {
                    int weight = (int) ((Math.random() * (2 + 1)) - 1);
                    vert[j][l] = weight;
                    pw1.print(vert[j][l]);
                    pw1.print(" ");
                }
            }
            pw1.print('\n');
        }
        pw1.close();
        PrintWriter pw2 = new PrintWriter("Data.txt");
        for (int j = 0; j < countOfVertexes; j++) {
            for (int l = 0; l < countOfVertexes; l++) {
                if (vert[j][l] == 1 && vert[j][l] == vert[l][j]) {
                    vert[l][j] = 0;
                } else if (vert[j][l] == 0 && vert[j][l] == vert[l][j]) {
                    vert[l][j] = 1;
                    vert[l][l] = 0;
                }
                pw2.print(vert[j][l]);
                pw2.print(" ");
            }
            pw2.print('\n');
        }
        pw2.print("-");
        pw2.close();
    }
}

