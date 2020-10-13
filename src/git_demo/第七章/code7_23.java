package git_demo.第七章;

public class code7_23 {
	public static void main(String[] args)
    {
        boolean[] temp = new boolean[101];
        for(boolean dick:temp)dick=false;
        for(int i=1;i<=100;i++)
        {
            int base=i;
            while(base<=100)
            {
            	temp[base]=!temp[base];
                base+=i;
            }
        }
        for(int i=1;i<=100;i++)
        {
            if(temp[i])
                System.out.print(i+" ");
        }
    }
}
