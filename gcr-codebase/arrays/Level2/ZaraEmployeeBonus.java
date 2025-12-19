//Java program to find employee bonus.
import java.util.Scanner;

public class ZaraEmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 10;
        double[] salary = new double[size];
        double[] yearsOfService = new double[size];
        double[] bonusAmount = new double[size];
        double[] newSalary = new double[size];
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Taking input for 10 employees
        for (int i = 0; i < size; i++) {
            System.out.println("Enter details for Employee " + (i + 1));
            System.out.print("Salary: ");
            salary[i] = sc.nextDouble();
            System.out.print("Years of Service: ");
            yearsOfService[i] = sc.nextDouble();
            // Validation check
            if (salary[i] <= 0 || yearsOfService[i] < 0) {
                System.out.println("Invalid input...\n");
                i--; // for re-entering the data
                continue;
            }
        }

        // Calculating bonus and new salary
        for (int i = 0; i < size; i++) {
            if (yearsOfService[i] > 5) {
                bonusAmount[i] = salary[i] * 0.05; // 5% bonus
            } else {
                bonusAmount[i] = salary[i] * 0.02; // 2% bonus
            }

            newSalary[i] = salary[i] + bonusAmount[i];
            totalBonus += bonusAmount[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("Total Old Salary of Employees : " + totalOldSalary);
        System.out.println("Total Bonus Paid by Zara      : " + totalBonus);
        System.out.println("Total New Salary of Employees : " + totalNewSalary);
    }
}
