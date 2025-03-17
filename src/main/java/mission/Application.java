package mission;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        //Todo: 프로그램 구현
        Scanner scanner = new Scanner(System.in);

        System.out.print("별찍기 단계(1~9)를 입력해주세요.");
        int Stage = scanner.nextInt(); //Stage 입력

        System.out.print("별찍기 크기를 입력해주세요.");
        int Size = scanner.nextInt(); //Size 입력

        if (Stage == 1) {
            for (int i = 1; i <= Size; i++){
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else if (Stage == 2) {
            for (int i = Size; i > 0; i--){
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else if (Stage == 3) {
            for (int i = Size; i > 0; i--){
                for (int k = Size; k > i; k--){
                    System.out.print(" ");
                }
                for (int j = 0; j < 2*i-1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else if (Stage == 4) {
            for (int i = 1; i < Size; i++){
                for (int k = Size; k >= i; k--){
                    System.out.print(" ");
                }
                for (int j = 0; j < 2*i-1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = Size; i >= 1; i--){
                for (int k = Size; k >= i; k--){
                    System.out.print(" ");
                }
                for (int j = 0; j < 2*i-1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else if (Stage == 5) {
            for (int n = 0; n < 2*Size; n++) { //세로줄 반복
                if(n%2 == 0) { //세로가 짝수 일때
                    for (int i = 1; i <= Size; i++) {
                        if (i % 2 != 0) { //가로가 홀수 일때
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
                else { //세로가 홀수 일때
                    for (int i = 1; i <= Size; i++) {
                        if (i % 2 != 0) { //가로가 짝수 일때
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                    }
                }
                System.out.println();
            }
        }
        else if (Stage == 6) {
            for (int n = 0; n < Size; n++){
                for (int k = Size; k > n; k--){
                    System.out.print(" ");
                }
                for (int j = 0; j <= n; j++) {
                    System.out.print("*");
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
