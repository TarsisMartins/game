/*
* Written in memory of the owner of shoujoai.com,
* who helped me realize I was gay.
* Rest in Peace, stranger.
*/

import java.io.*;

public class Game{

	public static void main(String[] args){

		System.out.println("How old are ya?");

		Reader r = new BufferedReader(new InputStreamReader(System.in));
   		StreamTokenizer st = new StreamTokenizer(r);


		try{
		while(st.nextToken() != StreamTokenizer.TT_EOF){

    			if(st.ttype == StreamTokenizer.TT_WORD) {
				if(st.sval.equals("quit")){break;}
        			System.out.println(st.sval);
    			} else if(st.ttype == StreamTokenizer.TT_NUMBER) {
        			System.out.println(st.nval);
    			} else if(st.ttype == StreamTokenizer.TT_EOL) {
        			System.out.println();
    			}

		}//end while
		}catch(IOException e){System.out.println("You fucked up, kid.");}

		//st.close();

	}//end main

}//end class
