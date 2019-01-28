package com.asaf;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        Yigin yigin=new Yigin();
        //Integer yigin[]=new Integer[10];


        System.out.println("İfadeyi PostFix olarak giriniz.");
        String ifade=scan.nextLine();
        int lengthifade=ifade.length();

        //int yiginindex=0;
        for(int i=0;i<lengthifade;i++){

            if(ifade.charAt(i)<='9'&&ifade.charAt(i)>='1'){
                Integer k=Character.getNumericValue(ifade.charAt(i));
                yigin.push(k);


            }else if(ifade.charAt(i)=='+'){
             Integer k=yigin.pop();
             Integer l=yigin.pop();

             k=k+l;
             yigin.push(k);

            }else if(ifade.charAt(i)=='-'){
                Integer k=yigin.pop();
                Integer l=yigin.pop();

                k=l-k;
                yigin.push(k);

            }else if(ifade.charAt(i)=='/'){
                Integer k=yigin.pop();
                Integer l=yigin.pop();

                k=l/k;
                yigin.push(k);


            }else if(ifade.charAt(i)=='*'){
                Integer k=yigin.pop();
                Integer l=yigin.pop();

                k=k*l;
                yigin.push(k);

            }

        }
        System.out.println("Sonuç :"+yigin.yigin[0]);


    }
}



public class Yigin {
    Integer[]yigin=new Integer[25];
    Integer yiginindex=0;
    public void push(Integer a){
        yigin[yiginindex]=a;
        yiginindex++;

    }

    public Integer pop(){
        yiginindex--;
        Integer b=yigin[yiginindex];

        return b;
    }

}
