public class RotateMatrix {
    static int[][] rotateNXNMatrix(int[][] matrix) {
        int[][] result = new int[matrix.length][matrix[0].length];
        int column = matrix[0].length;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                result[i][j] = matrix[j][column-1];
            }
            column-=1;
        }
        System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
        int[][] y = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] x = rotateNXNMatrix(y);
        for(int i = 0; i < x.length; i++) {
            for(int j = 0; j < x[0].length; j++) {
                System.out.println(x[i][j]);
            }
        }
        System.out.println(x);
        
    }
    
}