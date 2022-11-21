
package tgspbo4;

public class beruang extends animal {
    interface animal {
        public void eat();
        public void sleep();
        public void move();
    }
    public void eat(){
        System.out.println("Beruang memakan daging");
    }
    public void sleep(){
        System.out.println("Beruang tidur dibawah pohon");
    }
    public void move(){
        System.out.println("Beruang bergerak menggunakan 4 kaki");
    }
}
