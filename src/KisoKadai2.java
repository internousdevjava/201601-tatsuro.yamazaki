public class KisoKadai2 {

	public static void main(String[] args) {
		int answer;
		int input;
		int counter = 0;

		System.out.println("-- 数当てゲーム --");

		answer=0+(int)(Math.random()*100.0);

		while(true){
			System.out.println("《0～100までの半角数字を入力してください》");
			counter ++;
			input= new java.util.Scanner(System.in).nextInt();

			if(input < answer) {
				System.out.println(input + "よりは大きい");
			} else if(input > answer) {
				System.out.println(input + "よりは小さい");
			} else {
				System.out.println("正解!～Congratulation～");
				break;
					}
				}
		System.out.println("正解までに " + counter + "回かかりました。");
			}



	}