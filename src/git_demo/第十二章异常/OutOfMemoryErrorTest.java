package git_demo.第十二章异常;

import java.util.ArrayList;

public class OutOfMemoryErrorTest {
	public static void main(String[] args)
    {
        ArrayList<Double> h = new ArrayList<Double>();
        double i = 114514;
        while(true){
            i++;
            try{
                h.add(i);
            }
            catch(OutOfMemoryError e){
                System.exit(0);
            }
        }
    }
}
