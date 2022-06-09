/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.kabutoshinki.mathutil.core;

import static com.kabutoshinki.mathutil.core.MathUtil.getFactorial;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author SE151464
 */
 
//DDT: data driven testing 
//tham sô1 hóa 
//tách data ra khoi3 va loi goi ham
@RunWith(value = Parameterized.class)
public class AdvancedFactorialTest {
   // chuan bi data trc , excel, txt
    // new file ngoai thi code add vao
    @Parameters
    public static Object[][] initData(){
        return new Integer[][]{
            {0,1},
            {1,1},
            {2,2},
            {3,6},
            {4,24},
            {5,120},
        };
    }
    @Parameterized.Parameter(value = 0)
    public int n; //ban muon may giai thua
    
    @Parameter(value = 1)
    public long expected;// ban ki vong giai thua tra ve
    
    
    @Test
    public void checkFactorialGivenRightArgumentReturnsWell(){ 
         Assert.assertEquals(expected, getFactorial(n));         
     }
     
}
