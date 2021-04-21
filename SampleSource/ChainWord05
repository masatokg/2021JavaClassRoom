import java.util.Scanner;
public class ChainWord05 {
    public static void main(String args[]) {
        // カウンター変数は「cnt」とし、0で初期化する
        int cnt=0, max=5;
        String lastWord= "";
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        for(cnt=0; cnt<max; cnt++){
            if(str.endsWith("m") || ????????? ){
                System.out.printf("%sで終わっていますよ！", str.charAt(str.length()-1));
                // ループを中断
                break;
            }else{
                if( cnt != 0 && !str.startsWith( ?????????  ) ){
                    System.out.printf("%sで始まっていません！", lastWord);
                    // ループを中断
                    break;
                }
                System.out.printf("%d回目OK！\n",(cnt+1));
            }
            lastWord = str.charAt(str.length()-1)+"";
            str = scanner.nextLine();
        }
        scanner.close();
        System.out.printf("%d回しりとりできました！",cnt);
    }
}


