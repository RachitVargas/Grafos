package cr.ac.ulead.algoritmos.profundidad;

public class MainProfundidad {

    public static void main(String args[]) {

        int[][] matrixAdyacencia = {
                {0, 1, 0, 1, 0, 0, 0},
                {1, 0, 1, 1, 1, 0, 0},
                {0, 1, 0, 0, 1, 0, 0},
                {1, 1, 0, 0, 1, 1, 0},
                {0, 1, 1, 1, 0, 1, 1},
                {0, 0, 0, 1, 1, 0, 1},
                {0, 0, 0, 0, 1, 1, 0}
        };

        Profundidad profundidad = new Profundidad(matrixAdyacencia);

        try {
            profundidad.DFS(6, matrixAdyacencia);
            System.out.println("El recorrido del DFS según la posición seleccionada:");
            for (int i = 0; i < matrixAdyacencia.length; i++) {
                System.out.print(profundidad.getRecorrido(i));
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Lo sentimos, ese nodo no existe en el presente grafo.");
        }
    }
}
