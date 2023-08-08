package org.dsa.StringQues;

import org.dsa.StringQues.Algos;


public class TestCases {

  public static void main(String[] args) {


   Algos al= new Algos();
   String s="Codain ais fun.        ";
   String d=s;
   StringBuilder b= al.getReplaces("",d);
   System.out.println(b);
   
  }

}
