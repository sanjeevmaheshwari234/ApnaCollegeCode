import java.util.*;

public class TwoD_Arr {
    public static void inPut(int metrix[][]){
        int startRow =  0 ;
        int startCol = 0 ;
        int endRow = metrix.length-1;
        int endCol = metrix[0].length-1;
        

        while(startRow <= endRow && startCol <= endCol){
            // top
            for(int j=startCol;j<=endCol;j++){
                System.out.print(metrix[startRow][j]+" ");
            }

            // right 

            for(int i=startRow+1; i<=endRow; i++){
                System.out.print(metrix[i][endCol]+" ");
            }


            //bottom
            for(int j=endCol-1; j>=startCol; j--){
                if(startCol == endCol){
                    return ;
                }
                System.out.print(metrix[endRow][j]+" ");
            }


            // left
            for(int i=endRow-1; i>=startRow+1; i--){
                if(startRow == endRow){
                    break ;
                }
                System.out.print(metrix[i][startCol]+" ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;

        }
        System.out.println();
        }
        public static int diagonalSum(int metrix[][]){
            int sum = 0;

            // for(int i=0; i<metrix.length;i++){
            //     for(int j=0; j<metrix.length; j++){
            //        // primeri diagonal 
            //         if(i == j ){
            //             sum += metrix[i][j];
            //            // System.out.print();
            //         }else if(i+j == metrix.length-1){
            //             sum += metrix[i][j];
            //         }
            //     }
            // }
                    // O(n) time complixity 
            for(int i=0; i<metrix.length;i++){
                //prim diagonal 
                sum += metrix[i][i];
                //secod digonal
                if(i != metrix.length-1-i){  
                sum += metrix[i][metrix.length-i-1];
            }
        }


            return sum ;

        }
        public static Boolean staircaseSearch(int matrix[][],int key){
            int row=0 , col = matrix.length-1;


            while(row < matrix.length && col >= 0){
                if(matrix[row][col]  == key){
                    System.out.println("found key at (" + row + ","+ col + ")");
                    return true ;
                }else if(key < matrix [row][col]) {
                         col-- ;
                }else {
                    row++;
                }
            }
            System.out.println("key not found  : ! ");
            return false ;
        }
        public static void main(String[] args) {
        int metrix [][] = {{1,  2, 3, 4},
                           {5,  6, 7, 8},
                           {9, 10,11,12},
                           {13,14,15,16}};
           // inPut(metrix); 
           int matrix[][] = {{10,20,30,40 },
                             {15,25,35,45 },
                             {27,29,37,48 },
                             {32,33,39,50 }} ; 
            int key = 33 ;                 
           System.out.println(staircaseSearch(matrix,key));            
    }
}
