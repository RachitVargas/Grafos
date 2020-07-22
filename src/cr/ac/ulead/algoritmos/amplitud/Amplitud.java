package cr.ac.ulead.algoritmos.amplitud;

import java.util.LinkedList;
import java.util.Queue;

public class Amplitud {

    private int [] recorrido;
    private int con;
    public Amplitud (int [][]matriz){
        this.recorrido = new int[matriz.length];
        this.con = 0;
    }

    void BSF(int[][] matrizAdyadcencia, int s) {
        boolean[] visited = new boolean[matrizAdyadcencia.length];
        visited[s] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        while (queue.size() != 0) {
            this.recorrido[this.con++] = queue.peek();
            int j = queue.poll();
            for (int i = 0; i < matrizAdyadcencia.length; i++) {
                if (matrizAdyadcencia[j][i] == 1 && visited[i] == false) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    public String getRecorrido(int i) {
        return this.recorrido[i] + " ";
    }
}