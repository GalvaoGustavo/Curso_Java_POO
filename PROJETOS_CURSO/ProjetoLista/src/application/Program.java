package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) { 
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		
		System.out.print("How many employess will be registered?");
		int n = sc.nextInt();
		
		for (int i=0;i<n;i++) {
			System.out.println();
			System.out.println("Emplyoee #" + (i+1)+ ":");
			System.out.print("ID: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee emp = new Employee(id,name,salary);
			
			list.add(emp);
		}
		
		System.out.println("Enter the employee id that will have salary increase: ");
		int idsalary =  sc.nextInt();
		
		Integer pos = position(list, idsalary);
		if(pos == null) {
			System.out.println("This is does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			list.get(pos).increaseSalary(percent);
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		for(Employee emp : list) {
			System.out.println(emp);
		}
		
		sc.close();
	}
		
		private static Integer position(List<Employee> list, int idsalary) {
		// TODO Auto-generated method stub
		return null;
	}

		public static Integer hasID(List<Employee> list,int id) {
			 for(int i=0;i<list.size();i++) {
				 if(list.get(i).getId() == id) {
					 return i; 
				 }			
			 }
			 return null;
		} 
	}
