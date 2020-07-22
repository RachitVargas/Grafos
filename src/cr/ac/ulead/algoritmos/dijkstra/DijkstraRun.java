package cr.ac.ulead.algoritmos.dijkstra;
public class DijkstraRun {

    public static void main(String[] args){

        int matriz[][] = {

                {0, 10, 15, 0, 0, 0},
                {0, 0, 0, 12, 0, 15},
                {0, 0, 0, 0, 10, 0},
                {0, 0, 0, 0, 2, 1},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 5, 0}
        };
        int vertices = matriz.length;

        Dijkstra graph = new Dijkstra(vertices);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] != 0) {
                    graph.addEdge(i, j, matriz[i][j]);
                }
            }
        }

        graph.dijkstra_GetMinDistances(0);
        try {
            for (int i = 0; i < matriz.length; i++) {
                System.out.println(graph.getRecorrido(i));
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("¡Lo sentimos, ha ocurrido un error!");
        }
    }
}
