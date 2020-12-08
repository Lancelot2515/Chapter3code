package git_demo.集合;

public class Student implements Comparable<Student>
{
    private Integer num;
    private String name;
    private Integer age;
    
    public Student(Integer num, String name, Integer age) {
		super();
		this.num = num;
		this.name = name;
		this.age = age;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public int compareTo(Student stu)
    {
        return this.age - stu.age;
    }
    public String toString()
    {
        return "Student [age=" + age + ", name=" + name
                + ", num=" + num + "]";
    }
}