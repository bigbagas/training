package com.bagas;

import java.util.ArrayList;
import java.util.List;

public class SumOfString {

    // input string example "100+1-20+5"
    // and sum it with output integer

    public static void main(String[] args) {
        String str = "100+1-20+5";
        String tempString= str;
        char tempSymbol;
        int total=0;
        int tempInt;
        String strLength;
        String temporaryStr = "";

        String[] splitStr= str.split("[+-]");
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < splitStr.length; i++) {
            System.out.println(splitStr[i]);

            list.add(Integer.parseInt(splitStr[i]));

        }

        for (int i = 0; i < list.size(); i++) {
            tempInt = list.get(i);
            strLength = String.valueOf(tempInt);
            System.out.println("strLength"+strLength);
            System.out.println("tempString"+tempString);

            tempString =tempString.substring(strLength.length());
            System.out.println("tempString2"+tempString);
            if (tempString.equals("")){
                System.out.println("total "+total);
                return;
            }
            tempSymbol = tempString.charAt(0);

            System.out.println("tempSymbol: "+tempSymbol);
            temporaryStr += tempSymbol;

            if (temporaryStr.equals("+")){
                total += tempInt;
                System.out.println(tempInt);
            }


            if (temporaryStr.equals("-")){
                total -= tempInt;
            }

            tempString= tempString.substring(1);

            temporaryStr = "";



        }

        System.out.println(total);




    }
}
