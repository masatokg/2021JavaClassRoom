import java.util.Scanner;
public class DogYear {
    public static void main(String args[]) {
        // 入力された正の整数の0以上の倍数を数える
        int manYear=0, dogYear=0;
        Scanner scanner = new Scanner(System.in);
        int dmax=7, max=scanner.nextInt();
        for( int i=0; i<max; i++){

            System.out.printf("犬は%d歳\n", dogYear++);

            System.out.printf("人間は%d歳\n", manYear++);
        }
        System.out.printf("人間が%d歳になる間に犬は%d歳になります\n", manYear, dogYear);
        scanner.close();
    }
}
