package mission;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        //별 찍기 단계 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.println("별찍기 단계(1~9)를 입력해주세요.");
        int Stage = sc.nextInt();

        //별 찍기 개수 입력받기
        System.out.println("별찍기 크기를 입력해주세요.");
        int Size = sc.nextInt();

        //Stage 1단계
        if(Stage == 1){
            for(int i = 1; i <= Size; i++){
                for(int j = 1; j <= i; j++){
                    System.out.print("*");
                }
                System.out.println("");
            }
        }

        //Stage 2단계
        else if(Stage == 2){
            for (int i = 1; i <= Size; i++){
                for(int j = Size; j >= i; j--){
                    System.out.print("*");
                }
                System.out.println("");
            }
        }

        //Stage 3단계
        else if (Stage == 3){
            for(int i = Size; i >= 1; i--){
                for (int j = Size; j > i; j--) {
                    System.out.print(" ");//빈칸 생성
                }
                for(int k = 1; k <= 2 * i -1; k++){
                    System.out.print("*"); //별찍기
                }
                System.out.println(""); //줄바꿈
            }
        }

        //Stage 4단계
        else if(Stage == 4){
            //윗부분
            for (int i = 1; i < Size; i++){
                for(int j = Size; j > i; j--){
                    System.out.print(" ");
                }
                for(int k = 1; k <= 2*i-1; k++){
                    System.out.print("*");
                }
                System.out.println("");
            }
            //아랫부분
            for(int i = Size; i >= 1; i--){
                for (int j = Size; j > i; j--) {
                    System.out.print(" ");
                }
                for(int k = 1; k <= 2 * i -1; k++){
                    System.out.print("*");
                }
                System.out.println("");
            }
        }

        //Stage 5단계
        else if(Stage == 5){
            for(int i = 1; i <= Size * 2; i++){
                if(i % 2 == 0) {
                    for (int j = 1; j <= Size; j++) {
                        if (j % 2 == 0) {
                            System.out.print("*");
                        }
                        else {
                            System.out.print(" ");
                        }
                    }
                }
                else{
                    for (int k = 1; k <= Size; k++){
                        if(k % 2 == 0){
                            System.out.print(" ");
                        }
                        else{
                            System.out.print("*");
                        }
                    }
                }
                System.out.println("");
            }
        }

        //Stage 6단계
        else if (Stage == 6){
            for(int i = 1; i <= Size; i++){
                for (int j = Size; j >= i; j--){
                    System.out.print(" ");
                }
                for(int k = 1; k <= i; k++){
                    System.out.print("*");
                    System.out.print(" ");
                }
                System.out.println("");
            }
        }
    }
}
