package javaprogrms;

public class RotationString {

    public static boolean isRotation(String str, String str2) {

        if (str.length() != str2.length()) {
            return false;
        }

        int n = str.length();

        for (int shift = 0; shift < n; shift++) {

            boolean match = true;

            for (int j = 0; j < n; j++) {

                if (str.charAt((shift + j) % n) != str2.charAt(j)) {
                    match = false;
                    break;
                }
            }

            if (match) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String str = "Khushbu";
        String str2 = "ushbuKh";

        System.out.println(isRotation(str, str2));
    }
}