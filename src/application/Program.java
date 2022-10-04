package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter departament`s name: " );
		String departmentName = sc.nextLine();
		System.out.print("Enter worker data: "); 
		System.out.println("Name: ");
		String workerName = sc.nextLine();
		System.out.println("Level: ");
		String workLevel = sc.nextLine();
		System.out.print("Base salary");
		double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workLevel), baseSalary, Department);	
		
		
		
		
		sc.close();
	}

}
