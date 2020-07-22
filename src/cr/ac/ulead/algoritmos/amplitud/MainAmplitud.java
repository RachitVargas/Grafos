package cr.ac.ulead.algoritmos.amplitud;

public class MainAmplitud {

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

        Amplitud amplitud = new Amplitud(matrixAdyacencia);

        try {
            amplitud.BSF(matrixAdyacencia, 2);
            System.out.println("El recorrido del BSF queda según el punto seleccionado:");
            for (int i = 0; i < matrixAdyacencia.length; i++)
                System.out.print(amplitud.getRecorrido(i));

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Lo sentimos, el nodo seleccionado no está en el presente grafo");

        }
    }
}
