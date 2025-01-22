package com.test.RealtimeExample.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeImplementing {
	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee(1, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(2, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(3, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(4, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(5, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(6, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(7, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(8, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(9, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(10, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(11, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(12, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(13, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(14, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(15, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(16, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(17, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
		retriveAllEmployeesData(employeeList);
		retriveGenderCount(employeeList);
		retrieveAllDepartments(employeeList);
		retrieveAverageMaleAndFemaleEmployees(employeeList);
		retrieveHighestPaidEmployee(employeeList);
		retrieveAllEmployessJoinedAfter(employeeList);// 2015
		retrieveNoOfEmployeesWorkingEachDepartment(employeeList);
		retrieveAverageSalaryOfEachDepartment(employeeList);
		retrieveYoungestMaleEmployeeInProductDevelopmentDepartment(employeeList);
		retrieveSeniorEmployee(employeeList);
		retrieveGenderCountInSalesAndMarketingDepartment(employeeList);
		retrieveAllEmployeeListByDepartment(employeeList);
		retrieveEmployeeSalaryStatistics(employeeList);// TOTAL SALARY
	}

	private static void retrieveEmployeeSalaryStatistics(List<Employee> employeeList) {

		DoubleSummaryStatistics employeeSalaryStatistics = employeeList.stream()
				.collect(Collectors.summarizingDouble(Employee::getSalary));

		System.out.println("Average Salary = " + employeeSalaryStatistics.getAverage());

		System.out.println("Total Salary = " + employeeSalaryStatistics.getSum());
	}

	private static void retrieveAllEmployeeListByDepartment(List<Employee> employeeList) {

		Map<String, List<Employee>> employeeListByDepartment = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));

		Set<Entry<String, List<Employee>>> entrySet = employeeListByDepartment.entrySet();

		for (Entry<String, List<Employee>> entry : entrySet) {
			System.out.println("--------------------------------------");

			System.out.println("Employees In " + entry.getKey() + " : ");

			System.out.println("--------------------------------------");

			List<Employee> list = entry.getValue();

			for (Employee e : list) {
				System.out.println(e.getName());
			}
		}

	}

	private static void retrieveGenderCountInSalesAndMarketingDepartment(List<Employee> employeeList) {
		Map<String, Long> countMaleFemaleEmployeesInSalesMarketing = employeeList.stream()
				.filter(e -> e.getDepartment() == "Sales And Marketing")
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

		System.out.println(countMaleFemaleEmployeesInSalesMarketing);

	}

	private static void retrieveSeniorEmployee(List<Employee> employeeList) {
		Optional<Employee> seniorMostEmployeeWrapper = employeeList.stream()
				.sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();

		Employee seniorMostEmployee = seniorMostEmployeeWrapper.get();

		System.out.println("Senior Most Employee Details :");

		System.out.println("----------------------------");

		System.out.println("ID : " + seniorMostEmployee.getId());

		System.out.println("Name : " + seniorMostEmployee.getName());

		System.out.println("Age : " + seniorMostEmployee.getAge());

		System.out.println("Gender : " + seniorMostEmployee.getGender());

		System.out.println("Age : " + seniorMostEmployee.getDepartment());

		System.out.println("Year Of Joinging : " + seniorMostEmployee.getYearOfJoining());

		System.out.println("Salary : " + seniorMostEmployee.getSalary());

	}

	private static void retrieveYoungestMaleEmployeeInProductDevelopmentDepartment(List<Employee> employeeList) {
		Optional<Employee> youngestMaleEmployeeInProductDevelopmentWrapper = employeeList.stream()
				.filter(e -> e.getGender() == "Male" && e.getDepartment() == "Product Development")
				.min(Comparator.comparingInt(Employee::getAge));

		Employee youngestMaleEmployeeInProductDevelopment = youngestMaleEmployeeInProductDevelopmentWrapper.get();

		System.out.println("Details Of Youngest Male Employee In Product Development");

		System.out.println("----------------------------------------------");

		System.out.println("ID : " + youngestMaleEmployeeInProductDevelopment.getId());

		System.out.println("Name : " + youngestMaleEmployeeInProductDevelopment.getName());

		System.out.println("Age : " + youngestMaleEmployeeInProductDevelopment.getAge());

		System.out.println("Year Of Joinging : " + youngestMaleEmployeeInProductDevelopment.getYearOfJoining());

		System.out.println("Salary : " + youngestMaleEmployeeInProductDevelopment.getSalary());

	}

	private static void retrieveAverageSalaryOfEachDepartment(List<Employee> employeeList) {
		Map<String, Double> avgSalaryOfDepartments = employeeList.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

		Set<Entry<String, Double>> entrySet = avgSalaryOfDepartments.entrySet();

		for (Entry<String, Double> entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

	private static void retrieveNoOfEmployeesWorkingEachDepartment(List<Employee> employeeList) {
		Map<String, Long> employeeCountByDepartment = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

		Set<Entry<String, Long>> entrySet = employeeCountByDepartment.entrySet();

		for (Entry<String, Long> entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

	private static void retrieveAllEmployessJoinedAfter(List<Employee> employeeList) {
		employeeList.stream().filter(e -> e.getYearOfJoining() > 2015).map(Employee::getName)
				.forEach(System.out::println);

	}

	private static void retrieveHighestPaidEmployee(List<Employee> employeeList) {

		Optional<Employee> highestPaidEmployeeWrapper = employeeList.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));

		Employee highestPaidEmployee = highestPaidEmployeeWrapper.get();

		System.out.println("Details Of Highest Paid Employee : ");

		System.out.println("==================================");

		System.out.println("ID : " + highestPaidEmployee.getId());

		System.out.println("Name : " + highestPaidEmployee.getName());

		System.out.println("Age : " + highestPaidEmployee.getAge());

		System.out.println("Gender : " + highestPaidEmployee.getGender());

		System.out.println("Department : " + highestPaidEmployee.getDepartment());

		System.out.println("Year Of Joining : " + highestPaidEmployee.getYearOfJoining());

		System.out.println("Salary : " + highestPaidEmployee.getSalary());

	}

	private static void retrieveAverageMaleAndFemaleEmployees(List<Employee> employeeList) {
		Map<String, Double> avgAgeOfMaleAndFemaleEmployees = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));

		System.out.println(avgAgeOfMaleAndFemaleEmployees);

	}

	private static void retrieveAllDepartments(List<Employee> employeeList) {
		employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

	}

	private static void retriveGenderCount(List<Employee> employeeList) {
		Map<String, Long> noOfMaleAndFemaleEmployees = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

		System.out.println("male and female count  :" + noOfMaleAndFemaleEmployees);
	}

	private static void retriveAllEmployeesData(List<Employee> employeeList) {
		for (Employee employee : employeeList) {
			System.out.println(employee);
		}

	}

}
