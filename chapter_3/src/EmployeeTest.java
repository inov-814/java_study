//2018113732	�赿��
//������ �� �ҽ������� �ٸ� ����� �ҽ��� �������� �ʰ� ���� �ۼ��Ͽ����ϴ�.
import java.util.Scanner;

public class EmployeeTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String firstName;
		String lastName;
		double monthlySalary;
		
		System.out.print("Enter first name: ");
		firstName = input.next();
		System.out.print("Enter last name: ");
		lastName = input.next();
		System.out.print("Enter monthly salary: ");
		monthlySalary = input.nextDouble();
		Employee employee1 = new Employee( firstName, lastName, monthlySalary);
		
		System.out.println();
		System.out.print("Enter first name: ");
		
		//Ű���� ���� clear
		if(input.hasNextLine())
			input.nextLine();
		
		firstName = input.nextLine();
		System.out.print("Enter last name: ");
		lastName = input.next();
		System.out.print("Enter monthly salary: ");
		monthlySalary = input.nextDouble();
		
		Employee employee2 = new Employee( firstName, lastName, monthlySalary);
		
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
