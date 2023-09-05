/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ortega_quiz1;

import java.util.Arrays;
import java.util.Scanner;
import javax.xml.transform.Source;

/**
 *
 * @author home
 */
public class ORTEGA_Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        /jokokok
  
//        No.1
//            int [] array = {82, 44, 96, 7, 13, 56, 74, 14, 98, 36};
//             System.out.println("Arrays: " + Arrays.toString(array));


//       No2

//    Scanner scanner = new Scanner(System.in);
//         int arr =  scanner.nextInt();
//    
//        System.out.println("Enter the elements of the arrays: ");
//        int array = scanner.nextInt();
//        
//        System.out.println("Enter the number: ");
//           for (int i =0; i < array.length; i++){
//            array [ i -1] = array[i];
//        }
//        int elementToDelete= 2;
//        
//        int [] newArray = [arr.length - 1];
//        newArray [2] = elementToDelete;
//        int [] array = int [num];
//        System.arraycopy ( array,0,newArray,0, array.length );
//        
//         System.out.println("Original Array: " + Arrays.toString (array));
//         System.out.println("elementToDelete " + elementToDelete);
//        System.out.println("Updated Array:" + Arrays.toString(newArray));



//    No3   
    
   Scanner scan = new Scanner(System.in);
        
         System.out.println("Enter the elements of the array");
        int number = scan.nextInt();
        int[] array = new int [number];
        
        System.out.println("Enter the number");
        for (int i = 0; i < number; i++){
            array [i] = scan.nextInt();
            
        }
        
        System.out.println("Original Array: ");
        printArray(array);
        
        insertionsort(array);
        
        System.out.println("Sorted Array: ");
        printArray(array);
        
        scan.close();
    
    }
    
        public static void insertionsort(int arr[]){
        int n = arr.length;
        for (int i = 1; i < n; i++){
            int insert = arr [i];
            int k = i - 1;
            
            while (k >= 0 && arr[k] > insert){
                arr [k + 1] = arr[k];
                k  = k-1;
            }
            
            arr [k + 1 ] = insert;
        }
    }
    
    public static  void printArray (int arr[]){
        for (int num : arr){
            System.out.println(num + "");
        }
    
    }
            
    

}
