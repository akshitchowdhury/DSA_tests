public class Diagonal_sum {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;

        int i = 0;
        while (i < n) {
            sum += mat[i][i];  // Add the main diagonal element

            if (i != n - 1 - i) {
                // Add the anti-diagonal element if it is not on the same row as the main diagonal
                sum += mat[i][n - 1 - i];
            }

            i++;
        }

        return sum;
    }

}
