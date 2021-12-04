package generic;

class Stat<T extends Number> {
    T[] nums;
    public Stat(T[] nums) {
        this.nums = nums;
    }
    // Return type double in all cases.
    double average() {
        double sum = 0.0;
        for (T num : nums) {
            sum += num.doubleValue(); // Error!!!
        }
        return sum / nums.length;
    }
}

public class GenericBoundedType {
    public static void main(String[] args)
    {
        Integer[] a = {1,2,3,89};
        Stat<Integer> inn = new Stat<Integer>(a);
        System.out.println(inn.average());
    }
}

