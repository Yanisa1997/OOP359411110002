package LAP6;

import java.util.StringTokenizer;

public class ExStringToken {

    public static void main(String[] args) {

        StringTokenizer tokenizer = new StringTokenizer("I Live int Thungsong.");
        System.out.println(tokenizer.countTokens());

        while (tokenizer.hasMoreElements()) {
            System.out.println(tokenizer.nextToken());
            // สลับตัวอักษรในแต่ละคำ โดยใช้ StringBuilder
            StringBuilder str = new StringBuilder(tokenizer.nextToken());
            System.out.println(str.reverse());

        } //while

    } //main

} //class
