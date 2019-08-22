/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg00001.quicksort.algoritma;

/**
 *
 * @author Brama Hendra Mahendra
 */
public class QuickSortAlgoritma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QuickSort QS = new QuickSort();
        int[] array = {10,3,6,7,2};
        QS.quickSort(array, 0, 4);
        
        for (double element: array) {
         System.out.println(element);
      }
    }
    
}
