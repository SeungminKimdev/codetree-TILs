import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        int length = sc.nextInt();
        width += 8;
        length *= 3;
        System.out.println(width);
        System.out.println(length);
        System.out.println(width * length);
    }
}