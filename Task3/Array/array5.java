package Array;

public class array5 {
    public static void main(String[] args) {
        int grid[][] = new int [12][8];
        grid[0][0]=8;
        grid [1][1]=5;
        System.out.println(grid.length);
        System.out.println(grid[0].length);
        System.out.println(grid[11].length);
        //
        int numRows = grid.length;
        int numCols = grid[0].length;
        //fill in grid
        for (int row =0;row<numRows;++row){
            for (int col=0;col<numCols;col++){
                grid[row][col] = row*numCols + col +1;
            }
        }
        //print grid
        for (int row=0;row<numRows;++row){
            for (int col=0;col<numCols;++col){
                System.out.printf("%3d",grid[row][col]);
            }
            System.out.println();
        }
    }
}
