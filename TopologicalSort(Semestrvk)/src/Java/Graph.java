package Java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
// Java-программа для печати топологической сортировки DAG

// Этот класс представляет ориентированный граф с использованием смежности
// представление списка
public class Graph {
    private static int iterCount;
    private int V;   // Количество вершин
    private LinkedList<Integer> adj[]; // Список смежности
    private static int[][] vertexes;

    public static int[][] getVertexes() {
        return vertexes;
    }

    //Конструктор
    Graph(int v) {
        this.iterCount = 0;
        V = v;
        adj = new LinkedList[v];
        vertexes = new int[v][v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    // Функция для добавления ребра в график
    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    // Рекурсивная функция, используемая topologicalSort
    void topologicalSortUtil(int v, boolean visited[],
                             Stack stack) {
        // Пометить текущий узел как посещенный.
        visited[v] = true;
        Integer i;

        // Повторить для всех смежных вершин
        // Вершина
        Iterator<Integer> it = adj[v].iterator();
        while (it.hasNext()) {
            i = it.next();
            if (!visited[i]) {
                topologicalSortUtil(i, visited, stack);
                iterCount++;
            }
        }

        // Вставить текущую вершину в стек, в котором хранится результат
        stack.push(new Integer(v));
    }

    // Функция для топологической сортировки. Оно использует
    // рекурсию topologicalSortUtil()
    void topologicalSort() {
        Stack stack = new Stack();

        // Отметить все вершины как не посещенные
        boolean visited[] = new boolean[V];
        for (int i = 0; i < V; i++)
            visited[i] = false;

        // Вызовите рекурсивную вспомогательную функцию для сохранения
        // Топологическая сортировка, начиная со всех вершин
        // по одному
        for (int i = 0; i < V; i++)
            if (visited[i] == false) {
                iterCount++;
                topologicalSortUtil(i, visited, stack);
            }

        // Распечатать содержимое стека
        while (stack.empty() == false) {
            System.out.print(1 + ((int) stack.pop()) + " ");
        }
    }

    public static void main(String args[]) throws FileNotFoundException {
        GraphGenerator graphGenerator = new GraphGenerator(100);
        int countvertexes = GraphGenerator.getCountOfVertexes();
        graphGenerator.generator();
        Graph g = new Graph(countvertexes);
        Scanner sc = new Scanner(new FileInputStream("Data.txt"));
        int count = 1;
        while (sc.hasNextInt()) {
            int value = sc.nextInt();
            int line = 1;
            if (value == 0) {
                count++;
            } else if (value == 1) {
                g.addEdge(line, count);
                count++;
            }
            if (count == countvertexes) {
                line++;
                count = 1;
            };
        }
        System.out.println("Following is a Topological " +
                "sort of the given graph");
        long x = System.currentTimeMillis();
        g.topologicalSort();
        long k = System.currentTimeMillis();
        System.out.println();
        System.out.println('\n' + (double) (k - x) + " msec");
        System.out.println('\n' + "Количество итераций = " + iterCount);
    }

}


