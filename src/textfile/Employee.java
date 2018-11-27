package textfile;

import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Employee {

	private String name;
	private Double salary;
	private Date hireDay;

	public Employee(String name, Double salary, int year, int month, int day) {
		this.name = name;
		this.salary = salary;
		hireDay = new GregorianCalendar(year, month, day).getTime();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Date getHireDay() {
		return hireDay;
	}

	public void setHireDay(Date hireDay) {
		this.hireDay = hireDay;
	}

	/**
	 * 向文档中写入对象
	 * 
	 * @param out
	 */
	public void writeData(PrintWriter out) {
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(hireDay);
		out.println(name + "|" + salary + "|" + calendar.get(Calendar.YEAR) + "|" + (calendar.get(Calendar.MONTH) + 1)
				+ "|" + calendar.get(Calendar.DAY_OF_MONTH));

	}
	
	/**
	 * 从文档中读取对象
	 * @param in
	 */
	public void readData(Scanner in){
		
		String line = in.nextLine();
		String[] tokens = line.split("\\|");
		name = tokens[0];
		salary = Double.parseDouble(tokens[1]);
		int y = Integer.parseInt(tokens[2]);
		int m = Integer.parseInt(tokens[3]);
		int d = Integer.parseInt(tokens[4]);
		GregorianCalendar calendar = new GregorianCalendar(y,m-1,d);
		hireDay = calendar.getTime();
		
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", hireDay=" + hireDay + "]";
	}

}
