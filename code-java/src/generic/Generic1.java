package generic;

class Gen<T>{
    T ob;

    public Gen(T o) {
        ob = o;
    }

    public T getOb() {
        return ob;
    }

    public void showType() {
        System.out.println("Type is: " + ob.getClass().getName());
    }
}

public class Generic1 {

    public static void main(String[] args) {
        Gen<Integer> num = new Gen<Integer>(1);
        System.out.println(num.getOb());
        num.showType();

        Gen<String> str = new Gen<String>("hello");
        System.out.println(str.getOb());
        str.showType();


//        Gen<int> dbl = new Gen<int>(22);    // only reference type

    }
}
