import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Algos {
    private Algos(){}

    public static int[] bellmanFord(int[][] edges, int n, int start) {
        int[] dists = new int[n];
        Arrays.fill(dists, 6000);

        dists[start - 1] = 0;
        boolean isFinished = false;

        while (!isFinished) {
            isFinished = true;

            for (int[] edge : edges) {
                if (edge[2] + dists[edge[0] - 1] < dists[edge[1] - 1]) {
                    dists[edge[1] - 1] = edge[2] + dists[edge[0] - 1];
                    isFinished = false;
                }
            }
        }

        return dists;
    }
}
