package com.asaf;

public class Main {

    public static void main(String[] args) {
	Outer show=new Outer();
	show.test();
    }
}


public class Outer {
int outer_x=100;
void test(){
    Inner ınner=new Inner();
    ınner.display();

}

}


public class Inner extends Outer {
    void display(){
        System.out.println("Display : outer_x="+outer_x);

    }
}
