package mission;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("별찍기 단계(1~9)를 입력해주세요.");
        int level = sc.nextInt();

        System.out.println("별찍기 크기를 입력해주세요.");
        int size = sc.nextInt();

        switch (level) {
            case 1:
                pattern1(size);
                break;
            case 2:
                pattern2(size);
                break;
            case 3:
                pattern3(size);
                break;
            case 4:
                pattern4(size);
                break;
            case 5:
                pattern5(size);
                break;
           case 6:
                pattern6(size);
                break;
            case 7:
                pattern7(size);
                break;
            case 8:
                pattern8(size);
                break;
            case 9:
                pattern9(size);
                break;
            default:
                System.out.println("지원되지 않는 단계입니다.");
        }

        sc.close();
    }
    public static void pattern1(int size) {
        for(int i = 0; i <= size; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern2(int size) {
        for (int i = size; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern3(int size) {
        for (int i = 0; i < size; i++){
            for (int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < (2*(size-i)-1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern4(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = size-2; i >= 0; i--){
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern5(int size) {
        for(int i = 1; i <= 2*size; i++){
            // 홀수 행
            if(i % 2 == 1){
                for(int j = 1; j <= size; j++){
                    // 홀수 번째
                    if(j % 2 == 1){
                        System.out.print("*");
                    }
                    // 짝수 번째
                    else{
                        System.out.print(" ");
                    }
                }
            }
            // 짝수 행
            else{
                for(int j = 1; j <= size; j++){
                    // 홀수 번째
                    if(j % 2 == 1){
                        System.out.print(" ");
                    }
                    // 짝수 번째
                    else{
                        System.out.print("*");
                    }
                }
            }
            System.out.print("\n");
        }
    }

    public static void pattern6(int size) {
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size-i-1; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < i+1; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern7(int size) {
        int n = (int)Math.pow(3, size);
        char[][] map = new char [n][n];
        for (int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                map[i][j] = '*';
            }
        }

        for(int mapsize = 1; mapsize < n; mapsize *= 3){
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    if((i / mapsize) % 3 == 1 && (j / mapsize) % 3 == 1){
                        map[i][j] = ' ';
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }

    }

    public static void pattern8(int n) {
        int width = 1;
        int height = 1;
        int four = 4;
        int two = 2;

        // 너비와 높이 계산
        for (int i = 0; i < n - 1; i++) {
            width += four;
            four *= 2;
        }
        for (int i = 0; i < n - 1; i++) {
            height += two;
            two *= 2;
        }

        char[][] map = new char[height][width]; // 배열 선언 및 초기화
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                map[i][j] = ' '; // 배열을 공백으로 초기화
            }
        }

        drawStar(map, 0, 0, height, width, n); // 별 그리기

        // 결과 출력
        StringBuilder sb = new StringBuilder();
        if (n % 2 == 0) {
            int k = 0;
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width - k; j++) {
                    sb.append(map[i][j]); // 해당 줄의 별 출력
                }
                sb.append("\n");
                k++;
            }
        } else {
            int k = 1;
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width / 2 + k; j++) {
                    sb.append(map[i][j]); // 해당 줄의 별 출력
                }
                sb.append("\n");
                k++;
            }
        }
        System.out.println(sb.toString()); // 최종 결과 출력
    }

    public static void drawStar(char[][] map, int s, int e, int hlen, int wlen, int seq) {
        if (seq <= 0) return; // 종료 조건

        int mid = (s + s + wlen) / 2; // 중간 위치
        int left = s;
        int right = s + wlen;

        if (seq % 2 == 1) { // 삼각형
            int innerLeft = mid;
            int innerRight = mid;
            for (int i = e; i < e + hlen; i++) {
                for (int j = innerLeft; j <= innerRight; j++) {
                    if (i == e || i == e + hlen - 1 || j == innerLeft || j == innerRight)
                        map[i][j] = '*'; // 별 그리기
                }
                innerLeft--;
                innerRight++;
            }
        } else { // 역삼각형
            int innerLeft = left;
            int innerRight = right;
            for (int i = e; i < e + hlen; i++) {
                for (int j = innerLeft; j < innerRight; j++) {
                    if (i == e || i == e + hlen - 1 || j == innerLeft || j == innerRight - 1)
                        map[i][j] = '*'; // 별 그리기
                }
                innerLeft++;
                innerRight--;
            }
        }

        // 다음 단계 재귀 호출
        int moveRight = s + (int) Math.pow(2, seq - 1);
        if (seq % 2 == 1)
            drawStar(map, moveRight, e + hlen / 2, hlen / 2, wlen - (int) Math.pow(2, seq), seq - 1);
        else
            drawStar(map, moveRight, e + 1, hlen / 2, wlen - (int) Math.pow(2, seq), seq - 1);
    }


    public static void pattern9(int size) {
        int a = 0; int b = size-1; int c = 3*size-3; int d = 4*size-4;
        for(int i = 0; i < size*2-1; i++){
            if (i == 0 || i == size*2-2){
                for (int j = 0; j < size; j++)System.out.print('*');
                for (int j = 0; j < size*2-3; j++)System.out.print(' ');
                for (int j = 0; j < size; j++)System.out.print('*');

            }else{
                for(int j = 0; j < a; j++)System.out.print(' ');
                System.out.print('*');
                for(int j = a+1; j < b; j++)System.out.print(' ');
                System.out.print('*');
                for (int j = b + 1; j < c; j++) System.out.print(' ');
                if(b != c)System.out.print('*');
                for (int j = c + 1; j < d; j++) System.out.print(' ');
                System.out.print("*");
            }
            System.out.println();
            if(i < size-1){
                a++;
                b++;
                c--;
                d--;
            }else{
                a--;
                b--;
                c++;
                d++;
            }
        }
    }

}
