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
    private int V;   // Количество вершин
    private LinkedList<Integer> adj[]; // Список смежности

    //Конструктор
    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
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
            if (!visited[i])
                topologicalSortUtil(i, visited, stack);
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
            if (visited[i] == false)
                topologicalSortUtil(i, visited, stack);

        // Распечатать содержимое стека
        while (stack.empty() == false)
            System.out.print(stack.pop() + " ");
    }

    // A Java Program to detect cycle in an undirected graph
    // A recursive function that uses visited[] and parent to detect
    // cycle in subgraph reachable from vertex v.
    Boolean isCyclicUtil(int v, Boolean visited[], int parent) {
        // Mark the current node as visited
        visited[v] = true;
        Integer i;

        // Recur for all the vertices adjacent to this vertex
        Iterator<Integer> it = adj[v].iterator();
        while (it.hasNext()) {
            i = it.next();

            // If an adjacent is not visited, then recur for that
            // adjacent
            if (!visited[i]) {
                if (isCyclicUtil(i, visited, v))
                    return true;
            }

            // If an adjacent is visited and not parent of current
            // vertex, then there is a cycle.
            else if (i != parent)
                return true;
        }
        return false;
    }

    // Returns true if the graph contains a cycle, else false.
    Boolean isCyclic() {
        // Mark all the vertices as not visited and not part of
        // recursion stack
        Boolean visited[] = new Boolean[V];
        for (int i = 0; i < V; i++)
            visited[i] = false;

        // Call the recursive helper function to detect cycle in
        // different DFS trees
        for (int u = 0; u < V; u++)
            if (!visited[u]) // Don't recur for u if already visited
                if (isCyclicUtil(u, visited, -1))
                    return true;

        return false;
    }


    public static void main(String args[]) throws FileNotFoundException {
        GraphGenerator graphGenerator = new GraphGenerator();
        graphGenerator.generator();
        Graph g = new Graph(GraphGenerator.getCountOfVertexes());
        Scanner sc = new Scanner(new FileInputStream("Data.txt"));
        for (int i = 0; i < GraphGenerator.getCountOfVertexes(); i++) {
            int line = 1;
            int value = sc.nextInt();
            if (value == 0) {

            } else if (value == 1) {
                g.addEdge(line, i);
            }
            if (i == 9) {
                line++;
            }
        }
        if (g.isCyclic()) {
            System.out.println("Cyclic");
        } else {

            System.out.println("Following is a Topological " +
                    "sort of the given graph");
            long x = System.nanoTime();
            g.topologicalSort();
            long k = System.nanoTime();
            System.out.println();
            System.out.println('\n' + (double) (k - x) / 1000000000.0 + " msec");

        }
    }
}
