package in.com.capgemini.com.test;

import java.io.Serializable;

public class MyClass implements Serializable{

	private static final long serialVersionUID = 2051938466570389875L;
	private String Name;
	private int Id;
	protected String getName() {
		return Name;
	}
	protected void setName(String name) {
		Name = name;
	}
	protected int getId() {
		return Id;
	}
	protected void setId(int id) {
		Id = id;
	}
	public MyClass(String name, int id) {
		super();
		Name = name;
		Id = id;
	}
	@Override
	public String toString() {
		return "MyClass [Name=" + Name + ", Id=" + Id + "]";
	}
}
