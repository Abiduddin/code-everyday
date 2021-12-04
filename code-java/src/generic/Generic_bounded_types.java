package generic;

class Stats<T> {
    T[] nums;
    public Stats(T[] nums) {
        this.nums = nums;
    }
    // Return type double in all cases.
    double average() {
        double sum = 0.0;
        for (T num : nums) {
            sum += (int) num;
        }
        return sum / nums.length;
    }
}

public class Generic_bounded_types {

    public static void main(String[] args)
    {
        Integer[] a = {1,2,3,89};
        Stats<Integer> inn = new Stats<Integer>(a);
        System.out.println(inn.average());
    }
}
