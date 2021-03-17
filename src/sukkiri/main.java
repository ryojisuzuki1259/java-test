package sukkiri;

public class main{
	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		int c = a * b;
		System.out.println("縦幅" + a + "横幅" + b + "の長方形の面積は、" + c);

		boolean isError = true;
		char j = '駆'; // charで一文字の代入の場合は、シングルクォーテーションを使う！
		double pie = 3.14;
		long yen = 314159265853979L;
		String bun = "ミナトの攻撃！敵に１５ポイントのダメージを与えた。";

		int x = 5;
		int y =10;
		int z = x + y;
		String ans = "x+yは" + z;
		System.out.println(ans);
		ans = "x+yは" + (x + y); // 変数の更新。また、()で計算の評価順位を上げている
		System.out.println(ans);

		// 練習２−３
		System.out.println("ようこそ占い館へ");
		System.out.println("あなたの名前を入力してください");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください");
		String ageString = new java.util.Scanner(System.in).nextLine();
		int age = Integer.parseInt(ageString);
		int fortune = new java.util.Random().nextInt(4);
		fortune ++;
		System.out.println("占いの結果が出ました！");
		System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です");
		System.out.println("1:大吉 2:中吉 3:大吉 4:凶");

		// 3-1
//		if(weight == 60)
//		if((age1+age2)*2 > 60)
//		if(age%=2 == 1) // 奇数の条件式
//		if(name.equals("湊"))

		// 3-3
		int isHungry = 0;
		String food = "鍋";
		System.out.println("こんにちは");
		if(isHungry == 0) {
			System.out.println("お腹がいっぱいです");
		}else {
			System.out.println("はらぺこです");
		}
		if(isHungry == 1) {
			System.out.println(food + "をいただきます");
		}
		System.out.println("ごちそうさまでした");

		// 3-5
		System.out.print("[メニュー]1:検索 2:登録 3:削除 4:変更>");
		int selected = new java.util.Scanner(System.in).nextInt();
		switch(selected) {
			case 1:
				System.out.println("検索します");
				break;
			case 2:
				System.out.println("登録します");
				break;
			case 3:
				System.out.println("削除します");
				break;
			case 4:
				System.out.println("変更します");
				break;
		}
	}
}