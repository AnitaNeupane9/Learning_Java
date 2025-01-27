public class MultiDimensionalArrayExample {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{2,4,5},{4,4,5}};   
        // int[][] matrix = new int[3][3];   // row, column
        // matrix[0][1] = 3;

        
        
        for(int[] i: arr) {  // iterate over row
            for(int j: i) {  
                System.out.print(j+ " ");
            }
            System.out.println(" ");
        }
    }
}
