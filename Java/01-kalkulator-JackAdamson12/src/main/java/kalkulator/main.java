package kalkulator;

import java.util.Scanner;

public class main 
{
    public static void main(String[] args) 
    {
        Calculator cal = new Calculator();
        
        int a, b;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your data: ");
        a = input.nextInt();
        b = input.nextInt();

        
        cal.setState(a);

        cal.add(b);
        cal.minus(b);
        cal.mult(b);
        cal.dele(b);

        if(a == 0 || b == 0)
            {
                System.err.println("Blad wprowadzienia. Niemozliwe dzielenie przez 0");
            }

        
    }
}