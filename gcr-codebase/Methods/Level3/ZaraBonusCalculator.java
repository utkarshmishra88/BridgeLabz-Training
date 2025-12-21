// Program to find the bonus of 10 employees

public class ZaraBonusCalculator {

    // Method to generate salary and years of service
    public static int[][] generateEmployeeData(int employees) {
        int[][] data = new int[employees][2]; // [salary, yearsOfService]

        for (int i = 0; i < employees; i++) {
            data[i][0] = (int)(Math.random() * 90000) + 10000;

            // Years of service (1 to 10)
            data[i][1] = (int)(Math.random() * 10) + 1;
        }
        return data;
    }

    // Method to calculate bonus and new salary
    public static double[][] calculateBonus(int[][] employeeData) {
        double[][] result = new double[employeeData.length][2]; 
        // [bonus, newSalary]

        for (int i = 0; i < employeeData.length; i++) {
            int salary = employeeData[i][0];
            int years = employeeData[i][1];

            double bonus;
            if (years > 5) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }

            result[i][0] = bonus;
            result[i][1] = salary + bonus;
        }
        return result;
    }

    // Method to display details and totals
    public static void displaySummary(int[][] employeeData, double[][] bonusData) {

        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("   ");
        System.out.println("Emp\tOld Salary\tYears\tBonus\t\tNew Salary");
        System.out.println("   ");
		
		for (int i = 0; i < employeeData.length; i++) {
            int oldSalary = employeeData[i][0];
            int years = employeeData[i][1];
            double bonus = bonusData[i][0];
            double newSalary = bonusData[i][1];

            totalOldSalary += oldSalary;
            totalBonus += bonus;
            totalNewSalary += newSalary;

            System.out.printf("%d\t%d\t\t%d\t%.2f\t\t%.2f\n",
                    (i + 1), oldSalary, years, bonus, newSalary);
        }

        System.out.println("--------------------------------------------------------------");
        System.out.printf("TOTAL\t%.2f\t\t\t%.2f\t\t%.2f\n",
                totalOldSalary, totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {

        int employees = 10;

        int[][] employeeData = generateEmployeeData(employees);
        double[][] bonusData = calculateBonus(employeeData);
        displaySummary(employeeData, bonusData);
    }
}
