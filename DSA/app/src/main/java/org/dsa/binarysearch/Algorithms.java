package org.dsa.binarysearch;

import org.dsa.arrays.ArrAlgos;


public class Algorithms {

  public int[] getAccurance(int arr[],int t){
    int [] pos={-1,-1};
    pos[0]=search(arr,t,true);
    pos[1]=search(arr,t,false);
    return pos;
  }
  
  private int search(int arr[],int t,boolean isfirst){
    int s=0;
    int e=arr.length-1;
    int ans=-1;
    while(s<=e){
      int mid= s+(e-s)/2;
      if(arr[mid]<t){
        s=mid+1;
      }else if(arr[mid]>t){
        e=mid-1;
      }else{
        ans= mid;
        if(isfirst){
          e=mid-1;
        }else{
          s=mid+1;
        }
      }
    }
    return ans;
  }
  
  public int mountainArray(int arr[]){
    int s=0;
    int e=arr.length-1;
    while(s<e){
    int mid= s+(e-s)/2;
    if(arr[mid]>arr[mid+1]){
           e = mid;
    }else{
           s= mid+1;
       } 
    }
      return s;
  }
  
  public  int BinarySearch_Asc(int arr[],int target){
    int s=0;
    int end =arr.length-1;
   
    while(s<=end){
      int mid = s+(end-s)/2;
      if(arr[mid]>target){
        end = mid-1;
      }else if(arr[mid]<target){
        s= mid+1;
      }else{
        return mid;
      }
    }
    return -1;
  }
 
  public  int BinarySearch_Asc(int arr[],int target,int s,int end){
    while(s<=end){
      int mid = s+(end-s)/2;
      if(arr[mid]>target){
        end = mid-1;
      }else if(arr[mid]<target){
        s= mid+1;
      }else{
        return mid;
      }
    }
    return -1;
  }
  
  
  
  
  
  public  int OrderAgnostic(int arr[],int t){
    if(arr[0]<arr[arr.length-1]){
       return BinarySearch_Asc(arr,t);
    }else{
       return BinarySearch_Des(arr,t);
    }
  }
 
  
 
   public  int BinarySearch_Des(int arr[],int target){
    int s=0;
    int end =arr.length-1;
   
    while(s<=end){
      int mid = s+(end-s)/2;
      if(arr[mid]<target){
        end = mid-1;
      }else if(arr[mid]>target){
        s= mid+1;
      }else{
        return mid;
      }
    }
    return -1;
  }
  
  public  int BinarySearch_Des(int arr[],int target,int s,int end){
    
    while(s<=end){
      int mid = s+(end-s)/2;
      if(arr[mid]<target){
        end = mid-1;
      }else if(arr[mid]>target){
        s= mid+1;
      }else{
        return mid;
      }
    }
    return -1;
  }
  
  public  int FloorOfNum(int arr[],int target){
    int s=0;
    int end =arr.length-1;
   
    while(s<=end){
      int mid = s+(end-s)/2;
      if(arr[mid]>target){
        end = mid-1;
      }else if(arr[mid]<target){
        s= mid+1;
      }
    }
    return end;
  }
  
  
  public int getPivot(int arr[]){
    int s=0;
    int e=arr.length-1;
    while(s<=e){
      int mid= s+(e-s)/2;
      if(mid>s&&arr[mid]> arr[mid+1]){
        return mid;
      }else {
        if(mid<e&&arr[mid]<arr[mid-1]){
          return mid-1;
        }
      }
      if(arr[s]>arr[mid]){
         e= mid-1;
      }else{
         s= mid+1;
      }
    }
    
    return -1;
  }
 
  public  char FindChar(char arr[],char target){
    int s=0;
    int end =arr.length-1;
   
    while(s<=end){
      int mid = s+(end-s)/2;

      if(arr[mid]>target){
        end = mid-1;
      }else{
        s= mid+1;
      }
      
    }
    
    return arr[s%arr.length];
  }
  
  public int getMountainPeak(int arr[]){
   int s=0;
   int e=arr.length-1;
   while(s<e){
     int mid= s+(e-s)/2;
     if(arr[mid]>arr[mid+1]){
       e=mid;
     }else if(arr[mid]<arr[mid+1]){
       s=mid+1;
     }
     
   }
   return s;
  }
  
  public int findInMountainArray(int arr[],int target){
       int peak = getMountainPeak(arr);
       System.out.println(peak);
       if( BinarySearch_Asc(arr,target,0,peak)==-1){
        return  BinarySearch_Des(arr,target,peak+1,arr.length-1);
        }else{
          return BinarySearch_Asc(arr,target,0,peak);
        }
       
       }
       
  public int[] row_Coln_matrix(int arr[][],int t){
    int s=0;
    int end=arr.length-1;
    
    while(s<arr.length&&end>=0){
      if(arr[s][end]==t){
        return new int[]{s,end};
      }
      if(arr[s][end]<t){
        s++;
      }else{
        end--;
      }
    }
    return new int[]{-1,-1};
  }
 
  public double Perfect_Square(int a){
    int s=0;
    int end=a;
    double ans=0.0;
    
    while(s<=end){
      int mid =s+(end-s)/2;
      if(mid*mid==a){
        return (double) mid;
      }
      
      if(mid*mid>a){
        end= mid-1;
      }else{
        ans=mid;
        s = mid +1;
      }
     
    }   
   
    double decimals=0.1;
    for(int j=0;j<3;j++){
      while((ans*ans)<(a)){
        ans+=decimals;
      }
       ans-=decimals;
       decimals/=10;
    }
    return ans;
  }
  
  
  // Important Question Book Allocation
   
  public int getAllocated_min(int arr[],int Students){
    int s=0;
    int end= new ArrAlgos().sum(arr);
    int ans=-1;
    while(s<=end){
      int mid=s+(end-s)/2;
      if(isVaild(arr,mid,Students)){
        ans=mid;
        end= mid-1;
      }else{
        s= mid+1;
      }
    }
    return ans;
  }
  
  public boolean isVaild(int arr[],int mid,int std){
    int s=1;
    int sum=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]+sum <= mid){
        sum +=arr[i];
      }else{
        s++;
        if(s>std){
          return false;
        }
      }
    }
    return true;
  }
}



