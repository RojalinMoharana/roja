 package pkj1;

public class student 
{
int age;
int roll_no;
public void abc()
{
	System.out.println("welcome to all of you");
}
public void abcd()
{
	System.out.println("automation is very easy");
}

public static void main(String[] args) 
	{
		student dc=new student();
	
			dc.abc();
			dc.abcd();
			dc.age=123;
		System.out.println(dc.age);
		dc.roll_no=443;
		
		System.out.println(dc.roll_no);
	}
}


