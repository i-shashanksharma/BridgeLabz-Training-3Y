import java.util.Random;
import java.util.HashSet;
public class OTPGenerator {
    public static int generateOTP() {
        Random random = new Random();
        int otp = 100000 + random.nextInt(900000);
        return otp;
    }

    public static boolean validateUnique(int[] otps) {
        HashSet<Integer> uniqueOtps = new HashSet<>();
        for (int otp : otps) {
            if (!uniqueOtps.add(otp)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] generatedOtps = new int[10];
        for (int i = 0; i < 10; i++) {
            generatedOtps[i] = generateOTP();
        }

        System.out.println("Generated OTPs:");
        for (int otp : generatedOtps) {
            System.out.println(otp);
        }

        boolean isUnique = validateUnique(generatedOtps);
        System.out.println("\nAre the generated OTPs unique? " + (isUnique ? "Yes" : "No"));
    }
}
