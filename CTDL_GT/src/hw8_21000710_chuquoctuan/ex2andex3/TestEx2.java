package hw8_21000710_chuquoctuan.ex2andex3;


public class TestEx2 {
    public static void main(String[] args) {
        GraphHasDirection graph = new HasDirectionGraphMatrix();

        int vertex0 = graph.insertVertex();
        int vertex1 = graph.insertVertex();
        int vertex2 = graph.insertVertex();
        int vertex3 = graph.insertVertex();
        int vertex4 = graph.insertVertex();


        // Insert edges
        graph.insertEdge(vertex1, vertex0 ,5);
        graph.insertEdge(vertex1, vertex2 ,6);

        graph.insertEdge(vertex2, vertex3 ,7);

        graph.insertEdge(vertex3, vertex4 ,9);

        GraphHasDirection.Edge edge =  graph.insertEdge(vertex4, vertex2 ,8);

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

        System.out.println("\nOpposite of Edge and vertex : " + graph.opposite(2 ,edge));

        System.out.println("Degree vertex : " + graph.outDegree(0));

        System.out.println("Edge of a vertex : ");
        graph.outGoingEges(2);

        graph.print();
    }

}
