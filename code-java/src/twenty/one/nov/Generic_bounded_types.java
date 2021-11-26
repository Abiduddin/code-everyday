package twenty.one.nov;

public class Generic_bounded_types {

    public static class Stats<T> {
        T[] nums;
        public Stats(T[] nums) {
            this.nums = nums;
        }
        // Return type double in all cases.
        double average() {
            double sum = 0.0;
            for (T num : nums) {
                sum += (int)num; // Error!!!
            }
            return sum / nums.length;
        }
    }

    public static void main(String[] args)
    {
        Integer[] a = {1,2,3};
        Stats<Integer> inn = new Stats<Integer>(a);
    }
}
