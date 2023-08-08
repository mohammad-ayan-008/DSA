package org.dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ArrAlgos {

  public int equilibrium_Index (int arr[]){
    int left_sum,Right_sum=0;
    int Total= sum(arr);
    int sum=arr[0];
    if(arr.length==0){
      return arr[0];
    }
    if(arr.length==1){
      return -1;
    }
    
    for (int j=1;j<(arr.length-1);j++){
      sum+=arr[j];
      left_sum=sum-arr[j];
      Right_sum=Total-sum;
      
      if(left_sum==Right_sum){
        return j;
      }
    }
    return -1;
  }
  
  public   int sum(int arr[]){
    int sum=0;
    for (int i:arr){
      sum+=i;
    }
    return sum;
  }
  
  //Sorting algos
  
  public void BubbleSort(int arr[]){
     for(int i=0;i<arr.length;i++){
       for(int j=1;j<arr.length-i;j++){
          if(arr[j]<arr[j-1]){
            swap(arr,j,j-1);
          }
       }
     }
  }
  public void swap(int arr[],int a,int b){
    int temp=arr[a];
    arr[a]=arr[b];
    arr[b]=temp;
  }
  
  public void swap(String arr[],int a,int b){
    String temp=arr[a];
    arr[a]=arr[b];
    arr[b]=temp;
  }
  
  
  //To rotate Array K times
  public void rotate_Array(int arr[],int k){
    ReverseArr(arr,0,arr.length-1);
    ReverseArr(arr,0,k-1);
    ReverseArr(arr,k,arr.length-1);
  }
  
  public void ReverseArr(int arr[],int s,int end){
     while(s<end){
       swap(arr,s,end);
       s++;
       end--;
     }
  }
  public void ReverseArr(String arr[],int s,int end){
     while(s<end){
       swap(arr,s,end);
       s++;
       end--;
     }
  }
  
  public int getLargest(int arr[]){
    int l= Integer.MIN_VALUE;
    for(int elm:arr){
        if(elm>l)
           l=elm;
    }
    return l;
  }
  
  public int getSecondLargest(int arr[]){
    int largest=getLargest(arr);
    int s_large=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
      if(arr[i]!=largest){
        if(arr[i]>s_large){
            s_large=arr[i];
        }
      }
    }
    if(s_large!=Integer.MIN_VALUE){
       return s_large;
    }else{
       return -1;
    }
    
  }
  //Dutch National Flag
  public void Sort_0_1_2(int arr[]){
    int l=0;
    int m=0;
    int h=arr.length-1;
    while(m<=h){
       if(arr[m]==0){
        swap(arr,l,m);
        l++;
        m++;
      }
      else if(arr[m]==1){
         m++;
      }
      else if(arr[m]==2){
        swap(arr,m,h);
        h--;
      }
    }
    
  }
  
  //Select Sort
  public void Select_Sort(int arr[]){
    for(int i=0;i<arr.length;i++){
      int last_index = arr.length-1-i;
      int max_Index= getMax_Index(arr,0,last_index);
      swap(arr,last_index,max_Index);
    }
  }
  
  public int getMax_Index(int arr[],int s,int e){
    int i=0;
    for(int j=s;j<=e;j++){
      if(arr[j]>arr[i]){
         i=j;
      }
    }
    return i;
  }
  
  public void InsertSort(int arr[]){
    for(int i=0;i<arr.length-1;i++){
      for(int j=i+1;j>0;j--){
        if(arr[j]<arr[j-1]){
          swap(arr,j,j-1);
        }else{
          break;
        }
      }
    }
  }
  
  public List<List<Integer>> getSum(int arr[],int sum){
    Arrays.sort(arr);
    List<List<Integer>> lst= new ArrayList<>();
    int i=0;
    int j=arr.length-1;
    while(i<=j){
      int s=arr[i]+arr[j];
      if(s>sum){
        j--;
      }else if(s<sum){
        i++;
      }else{
        List<Integer> l= new ArrayList<>();
        l.add(arr[i]);
        l.add(arr[j]);
        lst.add(l);
        j--;
      }
    }
    return lst;
    
  }
  
  public void Cyclic_Sort(int arr[]){
    int i=0;
    while(i<arr.length){
      int correct=arr[i]-1;
      if(arr[i]!=arr[correct]){
        swap(arr,i,correct);
      }else{
        i++;
      }
    }
  }
  
   
  public int Missing_0_to_N(int arr[]){
    int i=0;
    while(i<arr.length){
      int correct=arr[i];
      if(arr[i]<arr.length&&arr[i]!=arr[correct]){
        swap(arr,i,correct);
      }else{
        i++;
      }
    }
    for(int j=0;j<arr.length;j++){
      if(arr[j]!=j){
        return j;
      }
    }
    return -1;
  }
  
  //First Missing Positive
  public int FirstMissing(int arr[]){
    int i=0;
    while(i<arr.length){
      if(arr[i]>0&&arr[i]<=arr.length&&arr[i]!=arr[arr[i]-1]){
         swap(arr,i,i-1);
      }else{
        i++;
      }
    }
    for(int index=0;index<arr.length;index++){
      if(arr[index]!=index+1){
        return index+1;
      }
    }
    return arr.length+1;
  }
  
}
