package polymorphism;

/**
 * Create by leonardo on 2018/11/13
 */
public class PolyConstructors {

    public static void main(String[] args) {
        new RoundGlyph(5);
    }
}

class Plyph {
    void draw() {
        System.out.println("Plyph.draw()");
    }

    public Plyph() {
        System.out.println("Plyph before draw()");
        draw();
        System.out.println("Plyph after draw()");
    }

}

class RoundGlyph extends Plyph {
    private int radius = 1;

    public RoundGlyph(int radius) {
        this.radius = radius;
        System.out.println("RoundGlyph(){} ,radius = " + radius);
    }

    void draw() {
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }

}