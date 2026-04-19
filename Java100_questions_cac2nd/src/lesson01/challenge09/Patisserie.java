/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */
//問題
package lesson01.challenge09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {

		System.out.println("たいへんお待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");

		int citronStock = 30;
		int chocolatStock = 30;
		int pistacheStock = 30;

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン      \\250 ・・・ 残り" + citronStock + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + chocolatStock + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + pistacheStock + "個");

		System.out.println("\nそれぞれ何個ずつ買いますか？（最大30個まで）\n");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("シトロン       >");
		String citron = reader.readLine();
		double citronCount = Double.parseDouble(citron);

		System.out.print("ショコラ       >");
		String chocolat = reader.readLine();
		double chocolatCount = Double.parseDouble(chocolat);

		System.out.print("ピスターシュ   >");
		String pistache = reader.readLine();
		double pistacheCount = Double.parseDouble(pistache);

		System.out.println("\nシトロン      " + citronCount + "個");
		System.out.println("ショコラ      " + chocolatCount + "個");
		System.out.println("ピスターシュ  " + pistacheCount + "個");

		double totalCount = citronCount + chocolatCount + pistacheCount;
		int totalPrice = (int) (citronCount * 250 + chocolatCount * 280 + pistacheCount * 320);

		System.out.println("\n合計個数      " + totalCount + "個");
		System.out.println("合計金額     " + totalPrice + "円");

		System.out.println("\nをお買いあげですね。\n承りました。");

		citronStock = (int) (30 - citronCount);
		chocolatStock = (int) (30 - chocolatCount);
		pistacheStock = (int) (30 - pistacheCount);

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン      \\250 ・・・ 残り" + citronStock + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + chocolatStock + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + pistacheStock + "個");

		System.out.println("\n閉店時間となりました。\nまたのお越しをお待ちしております。\n");
		System.out.println("売上の割合");
		System.out.println("売上合計    \\" + totalPrice);

		System.out.println("\n内訳");
		System.out.println("シトロン     \\" + (int) (citronCount * 250) + "・・・"
				+ (int) ((citronCount * 250) / totalPrice * 100) + "%");
		System.out.println("シトロン     \\" + (int) (chocolatCount * 280) + "・・・"
				+ (int) ((chocolatCount * 280) / totalPrice * 100) + "%");
		System.out.println("ピスターシュ \\" + (int) (pistacheCount * 320) + "・・・"
				+ (int) ((pistacheCount * 320) / totalPrice * 100) + "%");

		System.out.println("\n明日の三色マカロンの配合率が決まりました！\n");
		System.out.println("シトロンの味    ・・・" + (int) ((citronCount * 250) / totalPrice * 100) + "%");
		System.out.println("ショコラの味    ・・・" + (int) ((chocolatCount * 280) / totalPrice * 100) + "%");
		System.out.println("ピスターシュの味・・・" + (int) ((pistacheCount * 320) / totalPrice * 100) + "%");
		System.out.println("\nが楽しめます！\n");
		System.out.println("値段は\\" + (totalPrice / (int) totalCount) / 10 * 10 + "です。");
	}

}
