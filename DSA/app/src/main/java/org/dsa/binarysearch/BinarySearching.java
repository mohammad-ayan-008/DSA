package org.dsa.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import org.dsa.binarysearch.Algorithms;


public class BinarySearching {

  public static void main(String[] args) {
   Algorithms algos= new Algorithms();
   
   int arr[] = {1,2,3,5,7,8};  
  
  
   int index=algos.OrderAgnostic(arr,3);
   System.out.println(index);
  
  
  
   int arr2[] = {1,2,3,5,7,8};  
   int ans= arr2[algos.FloorOfNum(arr2,6)];
   System.out.println(ans);
  
   
   int arr3[]={1,7,7,7,79};
   System.out.println(Arrays.toString(algos.getAccurance(arr3,7)));
   
   int arr4[]={5,6,1,2,3,4};
   int index2= algos.getPivot(arr4);
   System.out.println(index2);
  
  
   char[] carr={'c','f','j'};
   char cr= algos.FindChar(carr,'j');
   System.out.println(cr);
   
  
   int arrM[]={1,4,6,7,3,2};
   int ind=algos.findInMountainArray(arrM,3);
   System.out.println(ind);
   
   int arr_2D[][]={
     {10,20,30,40},
     {11,25,35,45},
     {28,29,37,49},
     {33,34,38,50}
   };
   
  String ansd=Arrays.toString(algos.row_Coln_matrix(arr_2D,33));
   System.out.println(ansd);
   
   
  System.out.println(algos.Perfect_Square(40));
  
  
  int anf= algos.getAllocated_min(new int[]{10,20,30,40},2);
  System.out.println(anf);
  
  
  
  
  }
  
  
  
  
}
