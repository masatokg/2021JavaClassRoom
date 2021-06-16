public class DrSystem2 {
    public static void main(String[] args){
        
        // 病院名はKarteクラス共通
        Karte.hospitalName = "福岡病院";
        Karte.hospitalTel = "092-1234-5678";
        // Karte型変数の要素数30個の配列を作る
        ???????????????????

        int cnt=100; // 患者番号の連番
        // ループして値を代入、表示
        for(Karte karte: karteArray){
            ??????????????????
            karte.id = cnt++; karte.name="患者"+cnt;

            System.out.printf("病院名:%s 電話番号:%s id: %d 名前: %s \n", 
                Karte.hospitalName, Karte.hospitalTel, karte.id, karte.name);
        }
    }    
}
