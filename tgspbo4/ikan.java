
package tgspbo4;

public class ikan extends animal {
    interface animal {
        public void eat();
        public void sleep();
        public void move();
    }
    public void eat(){
        System.out.println("ikan memakan plankton");
    }
    public void sleep(){
        System.out.println("Ikan tidur disekitar karang laut");
    }
    public void move(){
        System.out.println("Ikan bergerak menggunakan sirip");
    }
}
