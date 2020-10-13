package git_demo.第七章;

import java.util.Scanner;

public class code7_5 {
	public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] temp = new int[12];
        int ptr = 0;
        System.out.print("Enter 10 numbers: ");
        for(int i=0;i<10;i++)
        {
            int tmp=input.nextInt();
            boolean in = false;
            for(int j=0;j<ptr;j++)
            {
                if(temp[j]==tmp)
                {
                    in=true;
                    break;
                }
            }
            if(!in)
            {
            	temp[ptr]=tmp;
                ptr++;
            }
        }
        System.out.println("The number of distinct number is "+ptr);
        System.out.print("The distinct numbers are: ");
        for(int i=0;i<ptr;i++)
            System.out.print(temp[i]+" ");
    }

}
