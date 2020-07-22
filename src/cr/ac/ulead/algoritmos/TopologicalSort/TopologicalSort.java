package cr.ac.ulead.algoritmos.TopologicalSort;
import java.util.*;

public class TopologicalSort {

    int[] recorrido;
    int cont;

    public TopologicalSort(int length) {
        this.recorrido = new int[length];
    }


    void topologicalSortUtil(int v, boolean[] visited, Stack stack, int[][] matriz) {
        visited[v] = true;
        for (int j = 0; j < matriz[v].length; j++) {
            if (matriz[j][v] == 1 && !visited[j])
                topologicalSortUtil(j, visited, stack, matriz);
        }
        stack.push(new Integer(v));
    }

    void topologicalSort(int[][] matriz) {
        Stack stack = new Stack();

        boolean visited[] = new boolean[matriz.length];
        for (int i = 0; i < matriz.length; i++)
            visited[i] = false;

        for (int i = 0; i < matriz.length; i++)
            if (visited[i] == false)
                topologicalSortUtil(i, visited, stack, matriz);

        while (stack.empty() == false)
            this.recorrido[cont++] = (int) stack.pop();
    }

    public String getRecorrido(int i) {
        return this.recorrido[i] + " ";
    }
}
