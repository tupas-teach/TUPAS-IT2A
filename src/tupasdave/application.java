
package tupasdave;

import java.util.Scanner;

class Application {
    String name;
    double gpa;
    double annualFamilyIncome;
    int communityServiceHours;
    String scholarshipStatus;

    public Application(String name, double gpa, double annualFamilyIncome, int communityServiceHours) {
        this.name = name;
        this.gpa = gpa;
        this.annualFamilyIncome = annualFamilyIncome;
        this.communityServiceHours = communityServiceHours;
        this.scholarshipStatus = determineScholarshipStatus();
    }

    private String determineScholarshipStatus() {
        if (gpa >= 3.5 && communityServiceHours >= 50) {
            return "Approved";
        } else {
            return "Denied";
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nGPA: " + gpa + "\nAnnual Family Income: " + annualFamilyIncome +
               "\nCommunity Service Hours: " + communityServiceHours + "\nScholarship Status: " + scholarshipStatus + "\n";
    }
}

public class ScholarshipApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     
        
        System.out.print("Enter number of Applications: ");
        int numberOfApplications = Integer.parseInt(scanner.nextLine());
        
        for (int i = 0; i < numberOfApplications; i++) {
            System.out.println("Enter details of application " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("GPA: ");
            double gpa = Double.parseDouble(scanner.nextLine());
            System.out.print("Annual Family Income: ");
            double annualFamilyIncome = Double.parseDouble(scanner.nextLine());
            System.out.print("Community Service Hours: ");
            int communityServiceHours = Integer.parseInt(scanner.nextLine());
            
            applications.add(new Application(name, gpa, annualFamilyIncome, communityServiceHours));
        }
        
        System.out.println("\nApplication Results:");
        for (Application application : applications) {
            System.out.println(application);
        }
        
        scanner.close();
    }
}
}
