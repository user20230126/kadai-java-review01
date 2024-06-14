
public class Review01 {

    public static void main(String[] args) {
        // 変数priceを宣言し、1500を代入
        int price = 1500;
        // 変数sales_taxを宣言し、10を代入
        int sales_tax = 10;
        // 変数resultを宣言
        int result;
        // taxメソッドを呼び出す（右辺）その際に、price(中身は1500)とsales_tax(中身は10)を引数に入れる
        result = tax(price,sales_tax);
        // 最後に出力する
        System.out.println(price + "円の商品の税込価格は" + (price + result) + "円（消費税は" + result + ")円です。");
    }
    
    public static int tax(int price,int sales_tax) {
        int result = (int) (price * (int)sales_tax / (1000 * 0.1));
        // メソッドの戻り値
        return result;
    }

}
