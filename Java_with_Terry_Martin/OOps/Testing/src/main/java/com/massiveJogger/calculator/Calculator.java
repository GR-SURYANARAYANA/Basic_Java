package com.massiveJogger.calculator;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Calculator {
    NumberFormat moneyFormat=NumberFormat.getCurrencyInstance(Locale.US);
    NumberFormat percentageFormat=NumberFormat.getPercentInstance();
    public int add(int a, int b) {
        return a+b;
    }

    /**
     * @param a
     * @param b
     * Here we can't use BigDecimal cuz we are comparing only the int or long
     * If we are really needed in bigDecimal we need to cast or convert the expected result in BigDecimal
     * @return a+b
     */

    public long addLarger(long a, long b) {
        return a+b;
    }


    /**
     Formula: F=p*[(1+r/n)^nt -1]/(r/n)]
     * @param p
     * @param t
     * @param r
     * @param n
     * @return
     */
    public String annualityCal(String p ,int t, String r,int n) {
        MathContext mc=new MathContext(20);
        BigDecimal a=new BigDecimal(r).divide(new BigDecimal(n),mc);//(r/n)
        BigDecimal b=a.add(BigDecimal.ONE);//(1+r/n)
        BigDecimal c=b.pow(n*t,mc);//[(1+r/n)^nt -1]
        BigDecimal d=c.subtract(BigDecimal.ONE);
        BigDecimal e=d.divide(a,mc);
        BigDecimal f=e.multiply(new BigDecimal(p));
        NumberFormat moneyFormat=NumberFormat.getCurrencyInstance(Locale.US);
        return moneyFormat.format(f);
    }

}
