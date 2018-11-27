package textfile;

import java.io.FileInputStream;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class TextFileTest {
	
	public static void main(String[] args) throws Exception {
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Carl Cracker", 75000.0, 1987, 12, 15);
		staff[1] = new Employee("Harry Hacker", 50000.0, 1989, 10, 1);
		staff[2] = new Employee("Tony Tester", 40000.0, 1990, 3, 15);
		
		try(PrintWriter out=new PrintWriter("D:\\test\\employee.dat","UTF-8")){
			writeData(staff, out);
		}
		
//		//RandomAccess
//		try(RandomAccessFile in = new RandomAccessFile("D:\\test\\employee.dat","r")){
//			int n = (int) in.length() ;
//			System.out.println(n);
//			
//		}
		
//		try(Scanner in = new Scanner(new FileInputStream("D:\\test\\employee.dat"),"UTF-8")){
//			Employee[] newStaff = readData(in);
//			for (Employee e : newStaff) {
//				System.out.println(e);
//			}
//		}
	}
	
	private static Employee[] readData(Scanner in) {
		int n = in.nextInt();
		in.nextLine();
		
		Employee[] employees = new Employee[n];
		for (int i = 0; i < n; i++) {
			employees[i] = readEmployee(in);
		}
		return employees;
	}

	/**
	 * 读取单个Employee对象
	 * @param in
	 * @return
	 */
	private static Employee readEmployee(Scanner in) {
		String line = in.nextLine();
		String[] tokens = line.split("\\|");
		String name = tokens[0];
		double salary = Double.parseDouble(tokens[1]);
		int y = Integer.parseInt(tokens[2]);
		int m = Integer.parseInt(tokens[3]);
		int d = Integer.parseInt(tokens[4]);
		return new Employee(name,salary,y,m,d);
		
	}

	/**
	 * 
	 * @param employees
	 * @param out
	 */
	private static void writeData(Employee[] employees,PrintWriter out){
		out.println(employees.length);
		
		for (Employee e: employees) {
			writeEmployee(out,e);
		}
	}

	/**
	 * 写入单个对象
	 * @param out
	 * @param e
	 */
	private static void writeEmployee(PrintWriter out, Employee e) {
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(e.getHireDay());
//		out.println(e.getName()+"|"+e.getSalary()+"|"+calendar.get(Calendar.YEAR)+"|"+(calendar.get(Calendar.MONTH)+1)+"|"
//				+ calendar.get(Calendar.DAY_OF_MONTH));
		out.println(e);
	}
	
	
	
}