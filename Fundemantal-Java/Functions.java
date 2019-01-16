import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
  /*      String isim ="Asaf";

        System.out.println("Hello "+isim);
        int a =1;
        int b=5 ;
        int c;
        c= 3*a + 5*b;
        System.out.println(c);
*/

        Scanner scan = new Scanner(System.in);
        int buff;
        int [] dizi;
        for(int i=0;i<10;i++) {
            System.out.println("Enter " + (i + 1) + "th element");
            buff=scan.nextInt();
            dizi[i]=buff;
        }
/*
        Scanner scan = new Scanner(System.in);

        String isim,sen;
        sen="Asaf";
        System.out.print("Ýsim giriniz: ");
        isim = scan.nextLine();

        if(isim.equals(sen))
            System.out.println("Vaaay gardaþýmmm");
        else
            System.out.println("Eslesme saglanamadi");
        seslen("AsafReis"," POLAT");
        }
        public static void seslen(String isim,String soyisim){
        System.out.println(isim+soyisim);
*/
        }
}
