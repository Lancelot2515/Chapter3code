package git_demo.第十一章课后题;

import java.util.ArrayList;

public class code11_13 {
	public static void main(String[] args) {
	    ArrayList<Integer> list = new ArrayList<>();
	    list.add(34);
	    list.add(5);
	    list.add(3);
	    list.add(5);
	    list.add(6);
	    list.add(4);
	    list.add(33);
	    list.add(2);
	    list.add(2);
	    list.add(4);
	    System.out.print("Enter ten integers: ");
	    for(Integer as:list) 
	        System.out.print(as+" ");
	    System.out.print("\n");
	    removeDuplicate(list);
	    System.out.print("The distinct integers are  ");
	    for(Integer as:list) 
	        System.out.print(as+" ");
	}
	 
	public static void removeDuplicate(ArrayList<Integer> list) {
	    int size = list.size();
	    int remove = 0;
	    for(int i = 0; i < size - remove;i++) {
	        for(int j = 1+i; j < size - remove;j++) {
	            if(list.get(i) == list.get(j)) {
	                list.remove(j); 
	                   remove++;
	                   j=j-1;
	            }
	      }
	    }
	}
	
	
}
