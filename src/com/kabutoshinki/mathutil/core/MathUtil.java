/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.kabutoshinki.mathutil.core;

/**
 *
 * @author SE151464
 */
public class MathUtil {

  //viet hàm tính n!= 1.2.3.4.5...n
  // 0!=1!=1
  //21! kieu long
  //< 0! ko tính dc, ko có giai thua cho so am  
  public static long getFactorial(int n){
      if(n<0 || n>20){
          throw new IllegalArgumentException("n much be between 0 ... 20");
      }
      if(n==0 || n==1 ){
          return 1;
      }
      long product =1;
      for(int i=2;i<=n;i++){
          product*=i;
      }
      return product;
  } 
    
    
}
