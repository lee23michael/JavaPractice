import java.util.InputMismatchException;
import java.util.Scanner;
public class test
{
    private static boolean check(int[] arr, int toCheckValue)
    {
        boolean test =false;
        for (int element : arr)
        {
            if (element == toCheckValue)
            {
                test = true;
            }
            else
            {
                test = false;
            }
        }
        return test;
    }
    static class MonthOf30Exception extends Exception{}
    static class MonthOf28Exception extends Exception{}

    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        int month = 0;
        int day = 0;
        int[] month30 = {4,6,9,11};
        String [] months = {"January","February","March","April","May", "June","July",
                "August","September","October","November","December"};

       System.out.println("Please enter the Month");
        boolean input = false;

        while (!input)
        {
            input =true;
          try
          {
                month = scan.nextInt();
                if (month <= 0 || month > 12)
                {
                    throw new InputMismatchException();
                }
          }
            catch (InputMismatchException e)
            {
                System.out.println("Please enter a valid Month(1-12)");
                input = false;
            }
        }

        boolean input2 = true;
        System.out.println("Please enter the Day");
        while (input2)
        {
            input2 =false;
            try
            {
                day = scan.nextInt();
                if (day == 0)
                {
                    System.exit(0);
                }
                else if(day <= 0 || day > 31)
                {
                    throw new InputMismatchException();
                }
                else if (check(month30,month) && day > 30)
                {
                    throw new MonthOf30Exception();
                }
                else if (month == 2 && day >28)
                {
                    throw new MonthOf28Exception();
                }
            }
            catch (InputMismatchException e)
            {
                System.out.println("Please enter a valid Day(1-31)");
                input2 = true;
            }
            catch (MonthOf30Exception ex)
            {
                System.out.println("Please enter a valid Day (1-30)");
                input2 = true;
            }
            catch (MonthOf28Exception e)
            {
                System.out.println("Please enter a valid Day (1- 28)");
                input2 = true;
            }
        }
        System.out.println("You enter the day: " + months[month-1]+" "+ day);
    }
}
