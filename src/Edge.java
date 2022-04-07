public class Edge {
    public int weight;
    public graphNode from;
    public graphNode to;

    public Edge(int weight, graphNode from, graphNode to) {
        this.weight = weight;
        this.from = from;
        this.to = to;
    }
}
