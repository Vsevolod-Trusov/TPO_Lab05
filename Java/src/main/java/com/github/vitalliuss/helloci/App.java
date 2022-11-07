package com.github.vitalliuss.helloci;

/**
 * Hello CI!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Calculator calculator = new Calculator();
        System.out.println( "Hello CI!" );
        System.out.println( "2 + 3 = " + calculator.getAmount(2, 3) );
        System.out.println( "2 - 3 = " + calculator.getDifference(2, 3) );
        System.out.println( "2 * 3 = " + calculator.getProduct(2, 3) );
        System.out.println( "2 / 3 = " + calculator.getQuotient(2, 3) );
        System.out.println( "2 % 3 = " + calculator.getRemainder(2, 3) );

    }
}
