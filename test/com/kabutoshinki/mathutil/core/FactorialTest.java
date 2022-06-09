/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.kabutoshinki.mathutil.core;

import org.junit.Assert;
import org.junit.Test;

 

/**
 *
 * @author SE151464
 */
public class FactorialTest {
    
     @Test
     public void checkFactorialGivenRightArgumentReturnsWell(){
         long expected =120;
         long actual = MathUtil.getFactorial(5);
         
         Assert.assertEquals(expected, actual);
         Assert.assertEquals(720, MathUtil.getFactorial(6)); 
         Assert.assertEquals(1, MathUtil.getFactorial(0));         
     }
     
     @Test(expected = IllegalArgumentException.class)
     public void checkFactorialGivenWrongArgumentThrowsException(){
         //ta ko dùng hàm assertEquals(2 value so sánh)
         // Exception ko so sánh dc
         MathUtil.getFactorial(-5);
         
     }
     
     
     @Test
     public void checkFactorialGivenWrongArgument_ThrowsException(){
         Assert.assertThrows(IllegalArgumentException.class, ()-> MathUtil.getFactorial(-5));
     }
     
     
     //check exception
     @Test
     public void checkFactorialGivenWrongArgument__ThrowsException(){
         //ta ko dùng hàm assertEquals(2 value so sánh)
         // Exception ko so sánh dc
         try{
             MathUtil.getFactorial(-5);
         }catch(Exception e){
             
             Assert.assertEquals("n much be between 0 ... 20", e.getMessage());
         }
         
     }
    
}
