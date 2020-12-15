package git_demo.第十二章异常;

import java.util.Scanner;

public class TestBin2DecUseBinaryFormatException
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        try
        {
            System.out.print("Enter a bin string: ");
            Bin2DecUseBinaryFormatException bin = new
                 Bin2DecUseBinaryFormatException(input.next());
            System.out.println("The binary value for decimal number " +
                bin.getBinString() + " is " + bin.bin2Dec());
        }
        catch (BinaryFormatException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}