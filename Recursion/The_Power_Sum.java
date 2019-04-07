import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the powerSum function below.
    static int powerSum(int X, int N) 
    {
        return util_function(X, N , 1);
    }

    static int util_function(int X, int N, int num1)
    {
        int value = (int) ( X - Math.pow(num1, N));

        // Base case
        if (value == 0)
        {
            return 1;
        }
        if( value < 0)
        {
            return 0;
        }
        // Here the num1 is not lncluded first and then
        return util_function(X, N, num1 + 1) + util_function(value, N, num1 + 1);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int X = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = powerSum(X, N);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
