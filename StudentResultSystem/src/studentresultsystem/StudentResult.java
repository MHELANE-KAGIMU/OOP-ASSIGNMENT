package studentresultsystem;
import java.util.Scanner;
public class StudentResult {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		char choice;
		do {
			
			
			System.out.println("Enter student name:");
			String studentName = scanner.next();
			
			System.out.println("Enter number of subjects");
			int numberOfSubjects = scanner.nextInt();
			int total = 0;
			
			// FOR LOOP
			for (int i = 1 ; i <= numberOfSubjects; i++) {
				System.out.println("Enter marks for subject" + i + ":");
				int mark = scanner.nextInt();
				total = total + mark;
			}
			double average = (double) total / numberOfSubjects;
			System.out.println("Student Name:" + studentName);
				System.out.println("Total Marks:" + total);
				System.out.println("Number of Subjects:" + numberOfSubjects);
				
				if (average >= 50) {
					System.out.println("The student has passed");
				} else {
					System.out.println("The student has failed");
				}
				String result = (average >= 50)? "Pass"  : "Fail";
				System.out.println(result);
				
				int i =1;
				
				while (i <= 5){
					System.out.println("Enter number of subjects" + i + ":");
					i++;
				}
				
				System.out.println("Do you want to continue? (y/n)");
				choice = scanner.next() .charAt(0);
		} while (choice == 'y' || choice == 'Y');
		scanner.close();
				
						
			
				
			
	}
 
}
