//2018113732	김동욱
//본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.
public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee1 = new Employee( "Bob", "Jones", 34500.00/12);
		Employee employee2 = new Employee( "Susan", "Baker", 37809.00/12);
		
		System.out.printf("Employee 1: %s %s ; Yearly Salary: %.2f%n",
				employee1.getFirstName(), employee1.getLastName(), 12*employee1.getMonthlySalary());
		System.out.printf("Employee 2: %s %s ; Yearly Salary: %.2f%n",
				employee2.getFirstName(), employee2.getLastName(), 12*employee2.getMonthlySalary());
		
		System.out.println();
		System.out.println("Increasing employee salaries by 10%");
		
		employee1.setMonthlySalary(1.1*employee1.getMonthlySalary());
		employee2.setMonthlySalary(1.1*employee2.getMonthlySalary());
		
		System.out.printf("Employee 1: %s %s ; Yearly Salary: %.2f%n",
				employee1.getFirstName(), employee1.getLastName(), 12*employee1.getMonthlySalary());
		System.out.printf("Employee 2: %s %s ; Yearly Salary: %.2f%n",
				employee2.getFirstName(), employee2.getLastName(), 12*employee2.getMonthlySalary());
	}

}
