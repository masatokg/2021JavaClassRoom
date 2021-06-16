public class DrSystem {
    public static void main(String[] args){
        
        // 病院名はKarteクラス共通
        Karte.hospitalName = "福岡病院";
        Karte.hospitalTel = "092-1234-5678";

        // Karte型変数を宣言してインスタンス領域を確保する
        Karte karte1 = new Karte();
        Karte karte2 = new Karte();

        // １人目の患者のカルテ
        karte1.id = 1123; karte1.name = "太郎";
        // ２人目の患者のカルテ
        karte2.id = 1124; karte2.name = "次郎";

        System.out.printf("病院名:%s 電話番号:%s id: %d 名前: %s \n", 
            Karte.hospitalName, Karte.hospitalTel, karte1.id, karte1.name);
            
        System.out.printf("病院名:%s 電話番号:%s id: %d 名前: %s \n", 
            Karte.hospitalName, Karte.hospitalTel, karte2.id, karte2.name);
    }    
}
