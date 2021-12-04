package exception;

public class Exception_array_loop {
    public static void main(String[] args) {
        String[] strings = {"1", "2", "3", "four", "5", "6"};
        System.out.println(new Exception_array_loop().getSum(strings));
    }

    public int getSum(String[] strings){
        int result  = 0;
        try {
            for (String string : strings) {
                result += (Integer.valueOf(string));
            }
        } catch (NumberFormatException e) {
            System.err.println(e);
        }
        return result;
    }

    public int getSum1(String[] strings) {
        int result = 0;

        for (String string : strings) {
            try {
                result += (Integer.valueOf(string));
            } catch (NumberFormatException e) {
                System.err.println(e);
            }
        }

        return result;
    }
}
