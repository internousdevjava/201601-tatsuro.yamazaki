public class KisoKadai1
{
	  public static void main(String args[])
	  {
		    int hyou[][] = new int[9][9];

		    for( int i=0; i<9; i++ ) {
		      for( int j=0; j<9; j++ ){
		    	  hyou[i][j] = (i+1) * (j+1);
		      }
		    }

		    for( int i=0; i<9; i++ ) {
		      for( int j=0; j<9; j++ ) {
		    	  System.out.print(hyou[i][j] + " ");
		      }
		      	  System.out.println();
		    }
	  }
}