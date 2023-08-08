package org.dsa.StringQues;

public class Algos {
  
  public StringBuilder getReplaces(String P,String up){
  if (up.isEmpty()){
    return new StringBuilder(P);
  }
  if(up.charAt(0)==' '){
    return getReplaces(P+"@40",up.substring(1));
  }
  return getReplaces(P+up.charAt(0),up.substring(1));
    
  }

}
