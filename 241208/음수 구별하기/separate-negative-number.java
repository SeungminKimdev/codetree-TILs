import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(input);
        if (input < 0) { 
            System.out.println("minus");
        }
    }
}