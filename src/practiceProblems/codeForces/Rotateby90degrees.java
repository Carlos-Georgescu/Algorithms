package src.practiceProblems.codeForces;

public class Rotateby90degrees {
    //Given a two-dimensional square matrix, rotate it 90 degrees counter-clockwise.
    public int[][] solve(int[][] matrix) {
        int[][] newMat = new int[matrix.length][matrix.length];
        int counter = 0;
        for(int j=matrix.length-1;j>=0;j--){
            for(int i=0;i<matrix.length;i++)
            {
                newMat[counter][i] = matrix[i][j];
            }
            counter++;
        }
        return newMat;
    }
}
