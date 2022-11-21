
package tgspbo4;
public class monyet extends animal {
    interface animal {
        public void eat();
        public void sleep();
        public void move();
    }
    public void eat(){
        System.out.println("Monyet memakan pisang");
    }
    public void sleep(){
        System.out.println("Monyet tidur diatas pohon");
    }
    public void move(){
        System.out.println("Monyet bergerak menggunakan 4 kaki");
    }
}
