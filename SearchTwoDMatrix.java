package LeetcodeSolvingProblems;

public class SearchTwoDMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {

        int row = matrix.length;
        int col = matrix[0].length;
        int left = 0;
        int right = row * col - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int midinmatrix = matrix[mid / col][mid % col];
            if (target == midinmatrix) return true;
            if (midinmatrix < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
