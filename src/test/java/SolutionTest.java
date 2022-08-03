import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void check1() {
        int[][] edges = new int[][]{{1,2,-1},{1,3,4},{2,3,3},
                {2,4,2},{2,5,2},{4,2,1},{5,4,-3}};
        int n = 5;
        int start = 1;

        Assert.assertArrayEquals(Solution.bellmanFord(edges, n, start),
                new int[]{0,-1,2,-2,1});
    }
}
