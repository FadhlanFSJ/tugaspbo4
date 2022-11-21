/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tgspbo4;

public class animal {
    public static void main(String[] args) {
       ikan i = new ikan();
       kucing k = new kucing();
       monyet m = new monyet();
       beruang b = new beruang();
       
       i.eat();
       i.sleep();
       i.move();
       System.out.println("===========");
       k.eat();
       k.sleep();
       k.move();
       System.out.println("===========");
       m.eat();
       m.sleep();
       m.move();
       System.out.println("===========");
       b.eat();
       b.sleep();
       b.move();
       System.out.println("===========");
    }
}
