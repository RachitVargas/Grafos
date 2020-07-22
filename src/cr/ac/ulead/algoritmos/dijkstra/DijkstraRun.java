package cr.ac.ulead.algoritmos.dijkstra;

public class DijkstraRun {

    public static void main(String[] args) {

        int matriz[][] = {
                {0, 10, 15, 0, 0, 0},
                {0, 0, 0, 12, 0, 15},
                {0, 0, 0, 0, 10, 0},
                {0, 0, 0, 0, 2, 1},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 5, 0}
        };

        Dijkstra dijkstra = new Dijkstra(matriz,0);

    }
}

//
//-D
//        --A at: 0
//        --B at: 10
//        ------------
//        -E
//        --A at: 0
//        --B at: 10
//        --D at: 22
//        ------------
//        -C
//        --A at: 0
//        ------------
//        -B
//        --A at: 0
//        ------------
//        -F
//        --A at: 0
//        --B at: 10
//        --D at: 22
//        ------------
//        -A
//        ------------
