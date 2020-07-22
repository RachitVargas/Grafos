package cr.ac.ulead.algoritmos.profundidad;

public class Profundidad {

    private int[] recorrido;
    private int con;

    public Profundidad(int[][] matriz) {
        this.recorrido = new int[matriz.length];
        this.con = 0;
    }

    void DFSUtil(int v, boolean[] visited, int[][] matrixAdyacencia) {
        if (!visited[v]) {
            visited[v] = true;
            this.recorrido[con++] = v;
            for (int j = 0; j < matrixAdyacencia[v].length; j++) {
                if (matrixAdyacencia[v][j] == 1 && !visited[j]) {
                    DFSUtil(j, visited, matrixAdyacencia);
                }
            }
        }
    }

    void DFS(int v, int[][] matrixAdyacencia) {
        boolean[] visited = new boolean[matrixAdyacencia.length];
        for (int i = 0; i < matrixAdyacencia.length; i++) {
            if (!visited[v]) {
                DFSUtil(v, visited, matrixAdyacencia);
            }
        }
    }

    public String getRecorrido(int i) {
        return this.recorrido[i] + " ";
    }
}