import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class KisoKadai3 {



	  public static void main(String args[]){

			    InputStreamReader a = new InputStreamReader(System.in);

			    BufferedReader br = new BufferedReader(a);

                int z;
                int q=0;
                int h=0;
			    String k;
				String y;
				String j;
				File nf;
while(q==0){
                z=0;
				while(z==0){
		            try{
		            	System.out.println("操作メニュー");
		                System.out.println("新規作成:1    上書き:2    追記:3    読み込み:4    終了:5");

		                    String b = br.readLine();
		                    h = Integer.parseInt(b);
		                    if(h<6){z=1;}else{System.out.println("正しく数値を入力してください。");
		                    }
		                    }catch(Exception e){
			                    System.out.println("エラー");z=0;
		    	            }

   int w = h;


switch(w){

case 1:


    try{
 	   		System.out.println("新規ファイルを作ります。フォルダの場所を指定してください。");
 	   			k=br.readLine();






 	   		System.out.println("ファイル名を入力");
 	   			y = br.readLine();
 	   			nf = new File(y);

 	   			if (nf.createNewFile()){
 	   				System.out.println("ファイルの作成に成功しました");
 	   					}else{
 	   				System.out.println("ファイルの作成に失敗しました");
 	   					}

 	   			FileWriter fr = new FileWriter(k+"/"+y);

 	   			System.out.println("内容を入力");
 	   			   j=br.readLine();
 	   			   fr.write(j);
 	   			System.out.println("成功");
 	   			   fr.close();
    }catch(IOException e){
 	   	System.out.println("エラー");
    }
    break;


case 2:   try{
	            System.out.println("既存のファイルに上書きします。フォルダのパスを入力");
                       k=br.readLine();

                FileWriter fr = new FileWriter(k);


                System.out.println("内容を入力");
                       j=br.readLine();
                       fr.write(j);
                System.out.println("成功");
                       fr.close();
          }catch(IOException e){
                System.out.println("エラー");
              }
        break;

case 3:    try{

  	            System.out.println("追記するファイルのパスを入力");
                    k=br.readLine();
  	            FileWriter fr = new FileWriter(k,true);


                System.out.println("内容を入力");
                    j=br.readLine();
	                fr.write(j);
                System.out.println("成功");
	                fr.close();

            }catch(IOException e){
                System.out.println("エラー");}

             break;


case 4:    try{

                     y=br.readLine();

                File f = new File(y);
                FileReader ee = new FileReader(f);

                  int ch = ee.read();
                 while(ch != -1){
                 System.out.print((char)ch);
                                      ch=ee.read();
                                  }
                 ee.close();
          }catch(FileNotFoundException n){
                               System.out.println(n);
          }catch(IOException n){
                               System.out.println(n);
          }

        break;
case 5:  System.out.println("プログラムを終了します");q=1;
        break;

		  }

	          }



	  }
	  }
}