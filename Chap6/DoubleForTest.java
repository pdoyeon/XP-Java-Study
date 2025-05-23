package Chap6;

public class DoubleForTest {
    public static void main(String[] args) {
        // 1. 이중 for문을 이용하여 구구단을 2단부터 9단까지 출력
        for (int i = 2; i <= 9; i++) {
            System.out.println(i + "단");
            for (int j = 1; j <= 9; j++) {
                int gap = i * j;
                System.out.println(i + " x " + j + " = " + gap);
            }
        }

        // 2. 이중 for문과 * 하나를 출력하는 명령어를 사용하여 다음 패턴을 화면에 출력하는 프로그램을 작성항라
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
