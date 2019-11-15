package classesandmethods;

public class ClassDemo {

	public String empName;
	public int age;
	static String clas;
	
	public void setData(String x,int y,String z)
	{
		empName=x;
		age=y;
		clas=z;
		
	}
	public void setDisplay()
	{
		System.out.println(empName+" "+age+" "+clas);
	}
}
