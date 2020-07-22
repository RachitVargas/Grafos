package cr.ac.ulead.algoritmos.TopologicalSort;

public class MainTopological {

    public static void main(String args[]) {

        int[][] matriz = {
                {0, 0, 0, 0, 1, 1},
                {0, 0, 0, 1, 1, 0},
                {0, 0, 0, 0, 1, 0},
                {0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}
        };

        TopologicalSort topologicalSort = new TopologicalSort(matriz.length);

        System.out.println("Ordenamiento topologico del grafo: ");
        topologicalSort.topologicalSort(matriz);
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(topologicalSort.getRecorrido(i));
        }
    }
}