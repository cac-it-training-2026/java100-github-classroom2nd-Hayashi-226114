/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

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
		int citronCount = Integer.parseInt(citron);

		System.out.print("ショコラ       >");
		String chocolat = reader.readLine();
		int chocolatCount = Integer.parseInt(chocolat);

		System.out.print("ピスターシュ   >");
		String pistache = reader.readLine();
		int pistacheCount = Integer.parseInt(pistache);

		System.out.println("\nシトロン      " + citronCount + "個");
		System.out.println("ショコラ      " + chocolatCount + "個");
		System.out.println("ピスターシュ  " + pistacheCount + "個");

		int totalCount = citronCount + chocolatCount + pistacheCount;
		int totalPrice = citronCount * 250 + chocolatCount * 280 + pistacheCount * 320;

		System.out.println("\n合計個数     " + totalCount + "個");
		System.out.println("合計金額   " + totalPrice + "円");

		System.out.println("\nをお買いあげですね。\n承りました。");

		citronStock = 30 - citronCount;
		chocolatStock = 30 - chocolatCount;
		pistacheStock = 30 - pistacheCount;

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン      \\250 ・・・ 残り" + citronStock + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + chocolatStock + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + pistacheStock + "個");

	}
}
