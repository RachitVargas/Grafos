package cr.ac.ulead.algoritmos.dijkstra;

import java.util.ArrayList;

public class Dijkstra {

    int vertices;
    int matriz[][];
    private ArrayList<int[]> a;

    public Dijkstra(int vertices) {
        this.vertices = vertices;
        this.matriz = new int[this.vertices][this.vertices];
        this.a = new ArrayList<int[]>();
    }

    public void addEdge(int source, int destination, int weight) {
        this.matriz[source][destination] = weight;
    }

    int getMinimumVertex(boolean[] mst, int[] key) {
        int minKey = Integer.MAX_VALUE;
        int vertex = -1;
        for (int i = 0; i < vertices; i++) {
            if (mst[i] == false && minKey > key[i]) {
                minKey = key[i];
                vertex = i;
            }
        }
        return vertex;
    }

    public void dijkstra_GetMinDistances(int sourceVertex) {
        boolean[] spt = new boolean[this.matriz.length];
        int[] distance = new int[this.matriz.length];
        int INFINITY = Integer.MAX_VALUE;

        for (int i = 0; i < vertices; i++) {
            distance[i] = INFINITY;
        }

        distance[sourceVertex] = 0;
        for (int i = 0; i < this.matriz.length; i++) {
            int vertex_U = getMinimumVertex(spt, distance);
            spt[vertex_U] = true;
            for (int vertex_V = 0; vertex_V < this.matriz.length; vertex_V++) {
                if (this.matriz[vertex_U][vertex_V] > 0) {
                    if (spt[vertex_V] == false && this.matriz[vertex_U][vertex_V] != INFINITY) {
                        int newKey = this.matriz[vertex_U][vertex_V] + distance[vertex_U];
                        if (newKey < distance[vertex_V])
                            distance[vertex_V] = newKey;
                    }
                }
            }
        }

        printDijkstra(sourceVertex, distance);
    }


    public void printDijkstra(int sourceVertex, int[] key) {
        System.out.println("Dijkstra Algorithm: (Adjacency Matrix)");
        for (int i = 0; i < vertices; i++) {
            int arreglo[] = new int[3];
            arreglo[0] = sourceVertex;
            arreglo[1] = i;
            arreglo[2] = key[i];

            this.a.add(arreglo);

        }
    }

    public String getRecorrido (int i){
        return "Source Vertex: " + this.a.get(i)[0] + " to vertex " +
                this.a.get(i)[1] + " distance: " + this.a.get(i)[2];
    }
}
