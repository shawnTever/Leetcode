import java.util.LinkedList;
import java.util.Queue;

public class _847_shortestPathLength {
    public int shortestPathLength(int[][] graph) {
        int n = graph.length;
        final int endKey = (1 << n) - 1;

        Queue<int[]> queue = new LinkedList<>();
        boolean[][] seen = new boolean[n][1 << n];

        for (int i = 0; i < graph.length; i++) {
            final int cover = 1 << i;
            queue.offer(new int[]{i, cover});
            seen[i][cover] = true;
        }

        int level = 0;
        while (!queue.isEmpty()) {
            final int currentSize = queue.size();
            for (int size = 0; size < currentSize; size++) {
                final int[] current = queue.poll();
                if (current[1] == endKey)
                    return level;
                for (int next : graph[current[0]]) {
                    final int nextState = (1 << next) | current[1];
                    if (!seen[next][nextState]) {
                        queue.offer(new int[]{next, nextState});
                        seen[next][nextState] = true;
                    }
                }
            }
            level ++;
        }

        return -1;
    }

    public static void main(String[] args) {
        _847_shortestPathLength shortestPathLength = new _847_shortestPathLength();
        int[][] g = new int[][]{{1},{0,2,4},{1,3,4},{2},{1,2}};
        System.out.println(shortestPathLength.shortestPathLength(g));

    }

}
