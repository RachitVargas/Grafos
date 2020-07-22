package cr.ac.ulead.algoritmos.Kruskal;

public class MainKruskal {

    public static void main(String[] args) {

        int V = 4;
        int E = 5;
        int[][] matriz = {
                {0, 10, 6, 5, 0},
                {0, 0, 0, 15, 0},
                {0, 0, 0, 4, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
        };

        Kruskal graph = new Kruskal(V, E, matriz);
        System.out.println("El recorrido del algoritmo Kruskal es:");
        try {
            for (int indice = 0; indice < (E - 2); indice++) {
                System.out.println(graph.KruskalMST(indice));
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("¡Lo sentimos ha ocurrido un error!");
        }
    }
}