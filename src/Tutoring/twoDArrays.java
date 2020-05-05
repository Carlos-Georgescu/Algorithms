package Tutoring;

public class twoDArrays {
    public static void main(String args[])
    {

        int[][] newArray = new int[5][5];

        for(int row=0;row<newArray.length;row++)
            for(int col=0;col<newArray[0].length;col++){
                newArray[row][col] = row*col;
            }

        for(int i=0;i<newArray.length;i++) {
            for (int j = 0; j < newArray[0].length; j++) {
                System.out.print(newArray[i][j]+" ");
            }
            System.out.println();
        }
    }
}
