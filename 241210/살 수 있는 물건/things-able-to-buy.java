import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int book = 3000;
        int mask = 1000;
        int money = sc.nextInt();
        if (money >= book) {
            System.out.println("book");
        } else if (money >= mask) {
            System.out.println("mask");
        } else {
            System.out.println("no");
        }
    }
}