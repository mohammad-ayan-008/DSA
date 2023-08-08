package org.dsa.arrays;

import java.util.Arrays;
import java.util.List;
import org.dsa.arrays.ArrAlgos;


public class questions {

  public static void main(String[] args) {


    ArrAlgos algo= new ArrAlgos();
    int arr[]={ -7, 1, 5, 2, -4, 3, 0 };
     
    int arrT[]={0,0,1,2,1,2,1};
    algo.Sort_0_1_2(arrT);
    String and= Arrays.toString(arrT);
    System.out.println(and); 
     
    int index= algo.equilibrium_Index(arr);
    System.out.println(index);
    
  /*  int arrS[]={5,4,3,2,1};
    algo.BubbleSort(arrS);
    String ans=  Arrays.toString(arrS);
    System.out.println(ans);
    */
    int arrK[]={1,2,3,4,5,6,7};
    algo.rotate_Array(arrK,3);
    String ans2=  Arrays.toString(arrK);
    System.out.println(ans2);
    
    
    int arrL[]= {-1,-2,-3,-4,-5,-4};
    Arrays.sort(arrL);
    System.out.println(algo.getLargest(arrL));
    System.out.println(algo.getSecondLargest(arrL));
    
   
   String word="Welcome to Coding Ninjas";
   String arrS[] = word.split(" ");
   algo.ReverseArr(arrS,0,arrS.length-1);
   System.out.println(Arrays.toString(arrS));
     
     int arrLst[]={5,4,3,2,1};
     //algo.Select_Sort(arrLst); 
     algo.Cyclic_Sort(arrLst);
     System.out.println(Arrays.toString(arrLst));
    
     int M[]={0,3,1};
     int ansd= algo.Missing_0_to_N(M);
     System.out.println(ansd+" isMissing in "+ Arrays.toString(M));
    
     int S[] ={2,-6,2,5,2};
     List<List<Integer>>k= algo.getSum(S,4);
     System.out.println(k);
     
     int Missing[]={1,2,0};
     int ans= algo.FirstMissing(Missing);
     System.out.println(ans);
     
        
  }
  
  

}
