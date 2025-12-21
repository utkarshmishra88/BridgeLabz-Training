// Program to generate a six-digit OTP number

public class OtpGenerator {

    // Method to generate a 6-digit OTP using Math.random()
    public static int generateOTP() {
        // Generates numbers between 100000 and 999999
        return (int) (Math.random() * 900000) + 100000;
    }

    // Method to check whether all OTPs are unique
    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false; 
                }
            }
        }
        return true; 
    }

    // Main method
    public static void main(String[] args) {

        // Array to store 10 OTP numbers
        int[] otps = new int[10];

        // Generate OTPs 10 times
        System.out.println("Generated OTPs:");
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
            System.out.println("OTP " + (i + 1) + ": " + otps[i]);
        }

        // Validate uniqueness
        if (areOTPsUnique(otps)) {
            System.out.println("\nAll generated OTPs are UNIQUE");
        } else {
            System.out.println("\nDuplicate OTPs found");
        }
    }
}
