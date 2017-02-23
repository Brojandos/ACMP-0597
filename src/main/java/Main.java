import java.util.Scanner;

/**
 * @author: Brojandos.
 * @creation_date: 23.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(input.nextLong() - input.nextLong() >= input.nextLong() ? "YES" : "NO");
    }
}
