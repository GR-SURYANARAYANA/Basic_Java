package com.massiveJogger.calculator;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTesting {

    Calculator cal=new Calculator();

 @Test
    public void canZeroPlusZero(){
   int sum=cal.add(0,0);
   assertEquals(0,sum,"Are they are right?");
  }
 @Test
  public void canOnePlusOne(){
     assertEquals(2,cal.add(1,1));
  }
  @Test
  public void edgeCase(){
     assertEquals(Integer.MAX_VALUE+1L,cal.addLarger(Integer.MAX_VALUE,1));
  }
  @Test
  public void annualityExample(){
      String calResult = cal.annualityCal("22000", 7, ".06", 1);
//      String result=String.format("$,3.2%s");
     assertEquals("$184,664.43",calResult);
  }
}