package Java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Graph2 {

    Hashtable<Graph2.Node, ArrayList<Graph2.Node>> adjList = new Hashtable<Graph2.Node, ArrayList<Graph2.Node>>();
    ArrayList<Graph2.Node> nodes = new ArrayList<Graph2.Node>();
    LinkedList<Graph2.Node> topoSorted;
    private static int iterCount = 0;
    private int count = 1;
    private int line = 1;

    public ArrayList<Graph2.Node> getNodes() {
        return this.nodes;
    }

    public void setNodes(final ArrayList<Graph2.Node> nodes) {
        this.nodes = nodes;
    }

    public Graph2() {
    }

    public void add(Graph2.Node node) {
        if (adjList.contains(node)) {
            return;
        } else {
            adjList.put(node, new ArrayList<Graph2.Node>());
            nodes.add(node);
        }
    }

    public void addNeighbor(Graph2.Node from, ArrayList<Graph2.Node> list) {
        for (Graph2.Node to : list) {
            addNeighbor(from, to);
        }
    }

    public void addNeighbor(Graph2.Node from, Graph2.Node to) {
        if (!adjList.containsKey(from)) {
            add(from);
        }
        if (!adjList.containsKey(to)) {
            add(to);
        }
        adjList.get(from).add(to);
        to.inDegree++;
        to.inNodes.add(from);
    }

    public void remove(Graph2.Node node) {
        for (Graph2.Node n : nodes) {
            for (Graph2.Node x : adjList.get(n)) {
                if (x.equals(node)) removeNeighbor(n, x);
            }
        }
        adjList.remove(node);
        nodes.remove(node);
    }

    public void removeNeighbor(Graph2.Node from, Graph2.Node to) {
        adjList.get(from).remove(to);
        to.inDegree--;
        to.inNodes.remove(from);
    }

    public void resetVisited() {
        for (Graph2.Node node : nodes) {
            node.visited = false;
        }
    }

    public boolean hasEdge(Graph2.Node from, Graph2.Node to) {
        return adjList.get(from).contains(to) ? true : false;
    }

    /**
     * for DAGS only
     *
     * @throws Exception
     */
    public void topologicalSort() throws Exception {
        /* L <-- Empty list that will contain the sorted elements */
        topoSorted = new LinkedList<Graph2.Node>();
        int k = nodes.size();
        /* Use set to keep track of permanently visited nodes
         * in constant time. Does have pointer overhead */
        HashSet<Graph2.Node> visited = new HashSet<Graph2.Node>();
        ArrayList<Node> nodes  = getNodes();
        /* while there are unmarked nodes do */
        for (Graph2.Node n : nodes) {
            iterCount++;
            /* select an unmarked node n
             * visit(n)
             */
            if (!visited.contains(n)) {
                visit(n, visited);

            }
        }
    }

    /* function: visit(node n) */
    public void visit(Graph2.Node node, HashSet<Graph2.Node> set) throws Exception {
        /* if n has a temporary mark then stop (not a DAG) */
        if (node.visited) {
            throw new Exception("graph cyclic");

            /* if n is not marked (i.e. has not been visited) then... */
        } else {

            /* mark n temporarily [using boolean field in node]*/
            node.visited = true;

            /* for each node m with an edge n to m do... */
            for (Graph2.Node m : adjList.get(node)) {

                /* visit(m) */
                if (!set.contains(m)) visit(m, set);
            }

            /* mark n permanently */
            set.add(node);

            /* unmark n temporarily */
            node.visited = false;

            /* add n to head of L */
            topoSorted.addFirst(node);
        }
    }

    public void printGraph() {
        for (Graph2.Node node : nodes) {
            System.out.print("from: " + node.value + " |  to: ");
            for (Graph2.Node m : adjList.get(node)) {
                System.out.print(m.value + " ");
            }
            System.out.println();
        }
    }

    public void instantiateGraph() throws Exception {
        GraphGenerator graphGenerator = new GraphGenerator(500);
        int countvertexes = GraphGenerator.getCountOfVertexes();
        try {
            graphGenerator.generator();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner sc = new Scanner(new FileInputStream("Data.txt"));
        while (sc.hasNextInt()) {
            int value = sc.nextInt();
            if (value == 0) {
                count++;
            } else if (value == 1) {
                Graph2.Node from = new Graph2.Node("" + line);
                Graph2.Node to = new Graph2.Node("" + count);
                addNeighbor(from,to);
                count++;
            }
            if (count == countvertexes) {
                line++;
                count = 1;
            }

        }
        System.out.println("Following is a Topological " +
                "sort of the given graph");
        long x = System.currentTimeMillis();
        topologicalSort();
        long k = System.currentTimeMillis();
        System.out.println();
        System.out.println('\n' + (double) (k - x) + " msec");
        System.out.println('\n' + "Количество итераций = " + iterCount);

        // TODO Auto-generated catch block


        for (Graph2.Node node : topoSorted) {
            System.out.print(node.value + " ");
        }
    }

    public LinkedList<Graph2.Node> getTopoSorted() {
        return this.topoSorted;
    }

    public class Node {
        String value;
        boolean visited = false;
        int inDegree = 0;
        ArrayList<Graph2.Node> inNodes = new ArrayList<Graph2.Node>();


        public Node(String value) {
            this.value = value;
        }
    }

    public static void main(String[] args) throws Exception {
        Graph2 g = new Graph2();
        g.instantiateGraph();
        System.out.println();


    }
}

