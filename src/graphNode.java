import java.util.ArrayList;

public class graphNode {
    public int value;
    public int graphIn; // 入度
    public int graphOut;  // 出度
    public ArrayList<graphNode> nexts;
    public ArrayList<Edge> edges;

    public graphNode(int value) {
        this.value = value;
        graphIn = 0;
        graphOut = 0;
        nexts = new ArrayList<>();
        edges = new ArrayList<>();
    }

}
