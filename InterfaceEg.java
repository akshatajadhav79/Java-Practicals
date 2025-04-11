// InterfaceEg.java
interface Drawable {
    void draw();
}

class Line implements Drawable {
    public void draw() {
        System.out.println("Drawing a line.");
    }
}

public class InterfaceEg {
    public static void main(String[] args) {
        Drawable d = new Line();
        d.draw();
    }
}
