package cr.ac.ulead.algoritmos.dijkstra;

public class DijkstraRun {

    public static void main(String[] args) {

        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");
        Node nodeE = new Node("E");
        Node nodeF = new Node("F");

        nodeA.addDestination(nodeB, 10);
        nodeA.addDestination(nodeC, 15);

        nodeB.addDestination(nodeD, 12);
        nodeB.addDestination(nodeF, 15);

        nodeC.addDestination(nodeE, 10);

        nodeD.addDestination(nodeE, 2);
        nodeD.addDestination(nodeF, 1);

        nodeF.addDestination(nodeE, 5);

        Graph graph = new Graph();

        graph.addNode(nodeA);
        graph.addNode(nodeB);
        graph.addNode(nodeC);
        graph.addNode(nodeD);
        graph.addNode(nodeE);
        graph.addNode(nodeF);

        graph = Dijkstra.calculateShortestPathFromSource(graph, nodeA);

        for (Node currentNode : graph.getNodes()) {
            System.out.println("-" + currentNode.getName());
            for (Node oneAdjacent : currentNode.getShortestPath()) {
                System.out.println("--" + oneAdjacent.getName() + " at: " + oneAdjacent.getDistance());
            }
            System.out.println("------------");
        }
    }

    //-D
    //--A at: 0
    //--B at: 10
    //------------
    //-E
    //--A at: 0
    //--B at: 10
    //--D at: 22
    //------------
    //-C
    //--A at: 0
    //------------
    //-B
    //--A at: 0
    //------------
    //-F
    //--A at: 0
    //--B at: 10
    //--D at: 22
    //------------
    //-A
    //------------

}