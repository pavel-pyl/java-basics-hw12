import java.util.Arrays;

public class StreamTask {

  public static int getSumSquareEven(int[] numbers) {
    int res = Arrays.stream(numbers).filter(n -> n % 2 == 0).reduce(0, (acc, elem) -> acc + elem * elem);
    return res;
  }

  public static int[] getSortedOddsArray(int[] numbers) {
    int[] res = Arrays.stream(numbers).sorted().filter(n -> n % 2 != 0).toArray();
    return res;
  }
}
