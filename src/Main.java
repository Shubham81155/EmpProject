import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	ArrayList<Emp> al= new ArrayList<Emp>();
	Scanner sc= new Scanner(System.in);
	
	
	void addEmp()
	{
	System.out.println("Enter the eno");
	int eno=sc.nextInt();
	
	System.out.println("Enter the name");
	String ename =sc.next();
	
	System.out.println("Enter the salary");
	double sal= sc.nextDouble();
	
	System.out.println("Enter the desgination");
	String desg= sc.next();
	
	Emp e=new Emp(eno,ename,sal,desg);
	al.add(e);
	System.out.println("Employee added successfully");
	}
	void viewEmp()
	{
		System.out.println("The available employees with us ");
		for(Emp e1:al)
		{
			System.out.println(e1.getEno()+""+e1.getEname()+""+e1.getSal()+""+e1.getDesg());
		}
		System.out.println("===========================");
	}
	void updateEmp()
	{
		
	}
	void deleteEmp()
	{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to Emp Application");
		System.out.println("===========================");
		Scanner sc =new Scanner(System.in);
		int ch;
		Main m=new Main();
		do {
			System.out.println("1.Addemp\n2.ViewEmp \n3.UpdateEmp\n 4.DeleteEmp \n5.Exit");
			ch =sc.nextInt();
			switch (ch)
			{
			case 1: 
				m.addEmp();
				break;
			case 2:
				m.viewEmp();
				break;
			case 3: 
				
				break;
			case 4:
				
				break;
			case 5:
				System.out.println("Thank you for using our services");
				break;
			default:
				System.out.println("Wrong choice");
				break;
			}
		} while	(ch!=5);
	}

}
