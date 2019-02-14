package com.asaf;

public class Main {

    public static void main(String[] args) {
        //xxxValue()  method.
        Integer x=1012111;
        System.out.println(x);
        System.out.println("Byte value of x is : " +x.byteValue());
        System.out.println("Float value of x is : "+x.floatValue());

        // compareTo() method
        Integer y=5;
        System.out.println(y.compareTo(5));//if equal       : 0
        System.out.println(y.compareTo(2));//if y greater   : 1
        System.out.println(y.compareTo(9));//if y smaller   : -1

        //equals() method
        Integer z=10;
        System.out.println(z.equals(10));//it returns true
        System.out.println(z.equals(5)); //it returns false
        System.out.println(z.equals(20));//it returns false

        //valueOf()
        Integer a= Integer.valueOf(15);
        System.out.println(a);
        Float b=Float.valueOf("21.5");
        System.out.println(b);
        Integer c=Integer.valueOf("15",16);//16lık tabanda 15 sayısı : c=21
        System.out.println(c);

        //toString()
        Integer w=1515;
        System.out.println(w.toString());//it returns string
        System.out.println(w.toString()+15);//it returns string and result = 151515.

        //parseInt()
        Integer val=Integer.parseInt("21212");
        System.out.println(val);
        Integer val2=Integer.parseInt("11",16);//11 at base16 is 17
        System.out.println(val2);

        //abs()
        Integer deger=-100;
        System.out.println(Math.abs(deger));
        Integer deger2=Math.abs(-1500);
        System.out.println(deger2);

        //ceil() -> aşağı yuvarla
        //floor() -> yukarı yuvarla
        //rint() -> en yakın yere yuvarlar (sayı x.5 ise aşağı =x.0)

        //Unicode shown
        char ch='\u1A0F';      //it is unicode representation
        System.out.println(ch);

        //getNumericValue()
        Integer ass=Character.getNumericValue('5');
        System.out.println(ass);

        System.out.println("Asaf\bReis");// \b means backspace at this point. Silecek nerdeyse bir tane silecek.
        System.out.println("Asaf\'Reis");

        //Character methods.
        Character ch1='A';
        System.out.println(Character.isLetter(ch1));    //it returns boolean true
        System.out.println(Character.isUpperCase(ch1)); //it returns boolean true
        System.out.println(Character.isLowerCase(ch1)); //it returns boolean false

        Character ch2=Character.toLowerCase(ch1);       //this letter turn 'A' to 'a'
        System.out.println(ch2);

    

    }
}
