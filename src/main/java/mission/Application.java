package mission;
import java.util.Scanner;

class PrintingStar {
    private int size;

    public PrintingStar(int size) {
        this.size = size;
    }

    public void level_1() {
        for (int i = 1; i <= size; i++) {
            System.out.println("*".repeat(i));
        }
    }

    public void level_2(){
        for (int i = size; i >= 0; i--){
            System.out.println("*".repeat(i));
        }
    }

    public void level_3(){
        for (int i = 0; i < size; i++) {
            System.out.print(" ".repeat(i));
            System.out.println("*".repeat(2*size-(2*i+1)));
        }
    }

    public void level_4(){
        for (int i = 1; i < size; i++){
            System.out.println(" ".repeat(size-i) + "*".repeat(2*i-1));
        }
        for (int j = 0; j < size; j++){
            System.out.println(" ".repeat(j) + "*".repeat((2*size-1) - (2*j)));
        }
    }


    //가로 n, 세로 2n, 좌표합 짝수에만 별을 찍는다.
    public void level_5(){
        for (int i = 0; i < 2*size; i++){
            for (int j = 0; j < size; j++){
                if ((i+j)%2==0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void level_6(){
        for (int i = 0; i < size; i++){
            System.out.print(" ".repeat(size-i-1));
            System.out.print("* ".repeat(i+1));
            System.out.println();
        }
    }


    public void print_star(int lv){
        switch (lv){
            case 1 -> level_1();
            case 2 -> level_2();
            case 3 -> level_3();
            case 4 -> level_4();
            case 5 -> level_5();
            case 6 -> level_6();
            default -> throw new RuntimeException("잘못된 레벨의 번호입니다.");
        }
    }
}
public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("별찍기 단계(1~9)를 입력해주세요");
        int level = sc.nextInt();

        System.out.println("별찍기 크기를 입력해주세요");
        int size = sc.nextInt();

        PrintingStar star = new PrintingStar(size);
        star.print_star(level);

        sc.close();
    }
}
