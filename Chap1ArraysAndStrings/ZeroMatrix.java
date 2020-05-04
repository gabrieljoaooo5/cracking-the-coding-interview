
import java.util.stream.IntStream;
public class ZeroMatrix {
    static int[][] zeroMatrix(int[][] matrix) {
        for(int[] array: matrix){
            if(IntStream.of(array) 
            .anyMatch(x -> x == 0)) {
                return new int[matrix.length][matrix[0].length];
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        int[][] y = {{1, 2, 3, 4}, {4, 5, 6, 6}, {7, 8, 9, 0}};
        int[][] x = zeroMatrix(y);
        for(int i = 0; i < x.length; i++) {
            for(int j = 0; j < x[0].length; j++) {
                System.out.println(x[i][j]);
            }
        }
    }


}
