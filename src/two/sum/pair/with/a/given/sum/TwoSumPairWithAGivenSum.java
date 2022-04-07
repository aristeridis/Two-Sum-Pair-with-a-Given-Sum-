/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package two.sum.pair.with.a.given.sum;
import java.util.*;

/**
 *
 * @author alexandrosaristeridis
 */
public class TwoSumPairWithAGivenSum {
    public Boolean sumsToTarget(Integer[] arr, Integer target) {
        Boolean b=false;
        int j=0;
        for(int i=0;i<arr.length-1;i++){
            for(j+=i;j<arr.length;j++){
                 if ((arr[i]+arr[j])==target){
                b=true;
                break;
            }
        }
        }
    return b;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         TwoSumPairWithAGivenSum obj=new TwoSumPairWithAGivenSum();
        Scanner s = new Scanner(System.in);
        
        System.out.println("dose arraylength");

        int l=s.nextInt();

        System.out.println("Enter the elements of the array: ");  
          Integer[] array = new Integer[l];  
    for(int i=0; i<l; i++)  
{  
//reading array elements from the user   
    array[i]=s.nextInt();  
} 
        System.out.println("dose target");

        int k=s.nextInt();

        
        System.out.println(obj.sumsToTarget(array,k));
    }
    
}
