package Week_8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab08Q1CircleWithException
{
    private double Radius;

    public  Lab08Q1CircleWithException()
    {

    }

    public Lab08Q1CircleWithException(double radius)
    {
        try {
            if (radius >= 0){
                this.Radius = radius;
            }
            else
            {
                throw new IllegalArgumentException("Invalid input: Should be 0 or positive");
            }
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }

    }

    public double getRadius()
    {
        return Radius;
    }

    public void setRadius(double radius)
    {
        Radius = radius;
    }

    public double getArea()
    {
        double output = 0;
        try {
            double check = Math.PI * this.Radius * this.Radius;
            if (check <= 1000){
                output = check;
                return output;
            }
            else
            {
                throw new Exception("Area of the input is too large");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return output;
    }

    public double getDiameter()
    {
        return 2 * Radius;
    }


    public static void main(String[] args)
    {
        float radius;
        try{
            System.out.println("Enter a radius value: ");
            Scanner scanner = new Scanner(System.in);
            radius = scanner.nextInt();
            Lab08Q1CircleWithException test = new Lab08Q1CircleWithException(radius);

            if (test.getArea() != 0){
                System.out.println("The area is " + test.getArea());
            }

        }
        catch (InputMismatchException e)
        {
            System.out.println("Please enter a number: " + e.getMessage());
        }

    }

}
