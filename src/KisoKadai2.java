import java.io.BufferedReader;
import java.io.InputStreamReader;
public class KisoKadai2 {

	public static void main(String[] args) {

		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        int answer;



System.out.println("☆数当てゲーム☆");
System.out.print("1～100までの数字を入力してください ");
		answer=1+(int)(Math.random()*100.0);
        while(true){

	    	  int i;
              try{
                      String buf = br.readLine();
                      i = Integer.parseInt(buf);

                      if(i >=101){System.out.println("1～100までの数字を入力してください");
                      		}else if(i<1){System.out.println("1～100までの数字を入力してください");
                      		}else if(answer>i){System.out.println(i +"よりは大きい");
                      		}else if(answer < i){System.out.println(i +"よりは小さい");
                      		}else if(answer==i){System.out.println("正解です! ～おめでとうございます～");
                      		break;}
              }catch(Exception e){

            	  System.out.println("※1～100までの半角数字で入力してください");
            }
        }
	}
}