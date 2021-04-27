import java.util.Scanner;
public class Japanese {
    public static void main(String[] args) {
        // プログラム実行時の入出力文字コードを表示
        System.out.println(System.getProperty("file.encoding"));
        // 入力ストリームを開く
        Scanner scanner = new Scanner(System.in);
        // 入力値を受け取って表示
        String str = scanner.nextLine();
        System.out.printf("入力値：%s です\n", str);
        // 入力ストリームを閉じる
        scanner.close();
    }
}
