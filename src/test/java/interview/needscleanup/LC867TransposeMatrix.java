package interview.needscleanup;

import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.api.Int2DArrayAssert;
import org.testng.annotations.Test;

//https://leetcode.com/problems/transpose-matrix/
@Test(enabled = false)
public class LC867TransposeMatrix {

    @Test(enabled = false)
    public void testName() {
//        Int2DArrayAssert contains = assertThat(transpose(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})).contains(new int[][]{{1, 4, 7}, {2, 5, 8}, {3, 6, 9}});
//        assertThat(transpose(new int[][]{{1, 2, 3}, {4, 5, 6}})).contains(new int[][]{{1, 4}, {2, 5}, {3, 6}});
//        assertThat(transpose(new int[][]{{1, 4}, {2, 5}, {3, 6}})).contains(new int[][]{{1, 2, 3}, {4, 5, 6}});
    }

    public int[][] transpose(int[][] A) {
        final int M = A[0].length;
        final int N = A.length;
        int[][] B = new int[M][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                B[j][i] = A[i][j];
            }
        }

        return B;
    }
}
