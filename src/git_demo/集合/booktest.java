	package git_demo.集合;

import java.util.ArrayList;
import java.util.List;

public class booktest {
	
	public static void main(String[] args) {
	book books1 = new book(1001, "Java", 888.0, "Sun出版社");
	book books2 = new book(1002, "Python", 257.0, "Python出版社");
	book books3 = new book(1003, "C++", 155.0, "C++出版社");
	List<book> books=new ArrayList<book>();
	books.add(books1);
	books.add(books2);
	books.add(books3);
	for(book b:books) {
		System.out.println(b.getNum()+"\t"+b.getName()+"\t"+b.getPrice()+"\t"+b.getPress());
	}
	}
	
}
