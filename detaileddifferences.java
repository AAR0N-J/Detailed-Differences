import java.util.Scanner;

public class detaileddifferences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < numberOfCases; i++) {
            String original = sc.nextLine();
            String other = sc.nextLine();
            System.out.println(original);
            System.out.println(other);
            System.out.println(getDifference(original, other)+"\n");
        }

    }
    public static String getDifference(String original, String other){
        String difference = "";
        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) == other.charAt(i)){
                difference += ".";
            } else {
                difference += "*";
            }
        }
        return difference;
    }
}
