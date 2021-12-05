package generic;

class Tuple<X, Y> {
    private X x;
    private Y y;

    public Tuple(X x, Y y) {
        this.x = x;
        this.y = y;
    }

    public X getX() {
        return x;
    }

    public Y getY() {
        return y;
    }

    public void showTypes() {
        System.out.println("Type of T is " +
                x.getClass().getName() + " and Value: " + x);
        System.out.println("Type of V is " +
                y.getClass().getName() + " and Value: " + y);
    }


}

public class Generic2 {
    public static void main(String[] args) {
        Tuple<String, String> tuple = new Tuple<String, String>("Hello", "world");
        tuple.showTypes();

        Tuple<String, Integer> person = new Tuple<>("Rahim", 45);
        person.showTypes();
    }
}
