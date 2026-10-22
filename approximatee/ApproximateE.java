package approximatee;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ApproximateE {
    public static void main(String[] args) {
        BigDecimal e = BigDecimal.ONE;
        BigDecimal item = BigDecimal.ONE;

        System.out.println("i\t Yaklaşık e Değeri");
        System.out.println("---------------------------------------------------------");

        for (int i = 1; i <= 1000; i++) {
            item = item.divide(new BigDecimal(i), 25, RoundingMode.HALF_UP);
            e = e.add(item);

            if (i % 100 == 0) {
                System.out.println(i + "\t " + e);
            }
        }
    }
}