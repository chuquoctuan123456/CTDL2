package hw8_21000710_chuquoctuan.ex1andex3;

public interface GraphNoHasDirection {
    public class Edge {
        private int vertex1;
        private int vertex2;

        public Edge(int vextex1, int vextex2) {
            this.vertex1 = vextex1;
            this.vertex2 = vextex2;
        }

        public int getVertex1() {
            return vertex1;
        }

        public int getVertex2() {
            return vertex2;
        }
    }
    // trả về số đỉnh
    public int numVertices();
    // duyệt các đỉnh
    public void vertices();
    // trả về số cạnh
    public int numEdges();
    // duyệt các cạnh
    public void edges();
    // trả về cạnh
    public Edge getEdge(int vertex1 ,int vertex2);
    // trả về mảng các đỉnh
    public int[] endVertices(Edge e);
    // trả về đỉnh còn lại của cạnh
    public int opposite(int vertex ,Edge e);
    // trả về số cạnh xuất phát từ đỉnh
    public int outDegree(int vertice);
    // trả về cạnh xuất phát từ đỉnh
    public void outGoingEges(int vertex1);
    // tạo và trả về 1 đỉnh mới
    public int insertVertex();
    // tạo và trả về 1 cạnh mới
    public Edge insertEdge(int vertexStart ,int vertexEnd);
    // xóa 1 đỉnh và các cạnh liên quan đến đồ thị
    public int removeVertex(int vertex);
    // xóa 1 cạnh của đồ thị
    public Edge removeEdge(Edge edge);
    public void print();
}
