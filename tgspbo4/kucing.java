
package tgspbo4;


public class kucing extends animal {
    interface animal {
        public void eat();
        public void sleep();
        public void move();
    }
    public void eat(){
        System.out.println("kucing memakan daging");
    }
    public void sleep(){
        System.out.println("kucing tidur ditempat yang lembut");
    }
    public void move(){
        System.out.println("kucing bergerak menggunakan 4 kaki");
    }
}
