package cr.ac.ulead.algoritmos.dijkstra;

public class Dijkstra {

    private static final int NO_PARENT = -1;

    public Dijkstra(int[][] matriz, int i) {

        int n = matriz[0].length;
        int[] shortestDistances = new int[n];
        boolean[] added = new boolean[n];
        for (int j = 0; j < n; j++) {
            shortestDistances[j] = Integer.MAX_VALUE;
            added[j] = false;
        }


        shortestDistances[i] = 0;
        int[] parents = new int[n];

        parents[i] = NO_PARENT;
        for (int t = 1; t < n; t++) {

            int nearestVertex = -1;
            int shortestDistance = Integer.MAX_VALUE;
            for (int vertexIndex = 0; vertexIndex < n; vertexIndex++) {
                if (!added[vertexIndex] && shortestDistances[vertexIndex] < shortestDistance) {
                    nearestVertex = vertexIndex;
                    shortestDistance = shortestDistances[vertexIndex];
                }
            }
            added[nearestVertex] = true;

            for (int vertexIndex = 0;
                 vertexIndex < n;
                 vertexIndex++) {
                int edgeDistance = matriz[nearestVertex][vertexIndex];

                if (edgeDistance > 0
                        && ((shortestDistance + edgeDistance) <
                        shortestDistances[vertexIndex])) {
                    parents[vertexIndex] = nearestVertex;
                    shortestDistances[vertexIndex] = shortestDistance +
                            edgeDistance;
                }
            }
        }

        printSolution(i, shortestDistances, parents);
    }

    private void printSolution(int startVertex, int[] distances, int[] parents) {

        int nVertices = distances.length;
        System.out.print("Vertex\t Distance\tPath");

        for (int vertexIndex = 0;
             vertexIndex < nVertices;
             vertexIndex++) {
            if (vertexIndex != startVertex) {
                System.out.print("\n" + startVertex + " -> ");
                System.out.print(vertexIndex + " \t\t ");
                System.out.print(distances[vertexIndex] + "\t\t");
                printPath(vertexIndex, parents);
            }
        }
    }

    private void printPath(int currentVertex, int[] parents) {

        if (currentVertex == NO_PARENT) {
            return;
        }
        printPath(parents[currentVertex], parents);
        System.out.print(currentVertex + " ");
    }
}


