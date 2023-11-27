package hw8_21000710_chuquoctuan.ex1;

public class TestEx1 {
    public static void main(String[] args) {
        GraphNoHasDirection graph = new NoHasDirectionMatrixGraph();

        int vertex0 = graph.insertVertex();
        int vertex1 = graph.insertVertex();
        int vertex2 = graph.insertVertex();
        int vertex3 = graph.insertVertex();
        int vertex4 = graph.insertVertex();
        int vertex5 = graph.insertVertex();
        int vertex6 = graph.insertVertex();

        // Insert edges
        graph.insertEdge(vertex0, vertex1);
        graph.insertEdge(vertex0, vertex2);

        graph.insertEdge(vertex1, vertex0);
        graph.insertEdge(vertex1, vertex2);
        graph.insertEdge(vertex1, vertex3);

        graph.insertEdge(vertex2, vertex0);
        graph.insertEdge(vertex2, vertex1);
        graph.insertEdge(vertex2, vertex4);

        graph.insertEdge(vertex3, vertex4);
        graph.insertEdge(vertex3, vertex1);

        graph.insertEdge(vertex4, vertex2);
        graph.insertEdge(vertex4, vertex3);
        graph.insertEdge(vertex4, vertex5);

        graph.insertEdge(vertex5, vertex4);
        graph.insertEdge(vertex5, vertex6);

        GraphNoHasDirection.Edge edge = graph.insertEdge(vertex6, vertex5);

        // Print the graph
        graph.print();

        System.out.println("Number edge : " + graph.numEdges());

        System.out.println("Edge is : ");
        graph.edges();

        System.out.print("\nVertices of edge :");
        int[] endVertices = graph.endVertices(edge);
        for (int i = 0; i < endVertices.length; i++) {
            System.out.print(endVertices[i] + " ");
        }

        System.out.println("\nOpposite of Edge and vertex : " + graph.opposite(6 ,edge));

        System.out.println("Degree vertex : " + graph.outDegree(0));

        System.out.println("Edge of a vertex : ");
        graph.outGoingEges(2);

        graph.print();
    }
}
