package com.cg.java.info;

import java.util.Scanner;

public class MangoTree_Problem {
	public static void main(String args[]) {

        Scanner s = new Scanner(System.in);

        s.nextInt();

        s.nextInt();

        int c = s.nextInt();

        if (c==1||c==2||c==3||c==4||c==5||c==6||c==10||c==11||c==15||c==16||c==20||c==21||c==25)

        {

            System.out.println("there is a mango tree");

        }

        else

        {

            System.out.println("there is a no mango tree");
            s.close();

        }
    }

}
