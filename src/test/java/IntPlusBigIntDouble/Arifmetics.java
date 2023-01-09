package IntPlusBigIntDouble;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Arifmetics {
    public static void main(String[] args) {
        System.out.println("Привет");
        BigInteger num1 = new BigInteger("12456987458793654128");
        BigInteger num2 = new BigInteger("89547635412896357459");
        BigInteger resultPlus = num1.add(num2);
        BigInteger resultMinus = num1.subtract(num2);
        BigInteger resultUmnozheniya = num1.multiply(num2);
        BigInteger resultDelenia = num2.divide(num1);
        BigInteger resultOstatokOtDelenia = num2.remainder(num1);
        System.out.println("Сложение целых числел равно: " + resultPlus);
        System.out.println("Разница целых числел равна: " + resultMinus);
        System.out.println("Произведение целых числел равно: " + resultUmnozheniya);
        System.out.println("Деление целых числел равно: " + resultDelenia);
        System.out.println("Остаток от деления целых числел равен: " + resultOstatokOtDelenia);
        System.out.println();
        BigDecimal num3 = new BigDecimal("12456987458793654128.231");
        BigDecimal num4 = new BigDecimal("89547635412896357459.423");
        BigDecimal resultPlusDecimal = num3.add(num4);
        BigDecimal resultMinusDecimal = num3.subtract(num4);
        BigDecimal resultUmnozheniyaDecimal = num3.multiply(num4);
        BigDecimal resultDeleniaDecimal = num4.divide(num3, 9, RoundingMode.DOWN);
        BigDecimal resultOstatokOtDeleniaDecimal = num4.remainder(num3);
        System.out.println("Сложение дробных числел равно: " + resultPlusDecimal);
        System.out.println("Разница дробных числел равна: " + resultMinusDecimal);
        System.out.println("Умножение дробных числел равно: " + resultUmnozheniyaDecimal);
        System.out.println("Деление дробных числел равно: " + resultDeleniaDecimal);
        System.out.println("Остаток от деления дробных числел равен: " + resultOstatokOtDeleniaDecimal);

        System.out.println();

        byte b1 = 125;
        byte b2 = 125;
        byte b3 = (byte) (b2 + b1);
        System.out.println("Сложение типа Byte: " + b3); // -4 Произошло переполнение и пошло по кругу
        byte b4 = (byte) (b2 - b1);
        System.out.println("Вычитание типа Byte: " + b4);
        byte b5 = (byte) (b2 * b1);
        System.out.println("Умножение типа Byte: " + b5);
        byte b6 = (byte) (b2 / b1);
        System.out.println("Деление типа Byte: " + b6);

        System.out.println();

        short s1 = 32765;
        short s2 = 32765;
        short s3 = (short) (s2 + s1);
        System.out.println("Сложение типа Short: " + s3);
        short s4 = (short) (s2 - s1);
        System.out.println("Вычитание типа Short: " + s4);
        short s5 = (short) (s2 * s1);
        System.out.println("Умножение типа Short: " + s5);
        short s6 = (short) (s2 / s1);
        System.out.println("Деление типа Short: " + s6);

        System.out.println();

        int i1 = 2147483647;
        int i2 = 2147483647;
        int i3 = i2 + i1;
        System.out.println("Сложение типа Int: " + i3);
        int i4 = i2 - i1;
        System.out.println("Вычитание типа Int: " + i4);
        int i5 = i2 * i1;
        System.out.println("Умножение типа Int: " + i5);
        int i6 = i2 / i1;
        System.out.println("Деление типа Int: " + i6);

        System.out.println();

        long l1 = 9223372036854775805L;
        long l2 = 9223372036854775805L;
        long l3 = l1 + l2;
        System.out.println("Сложение типа Long: " + l3);
        long l4 = l2 - l1;
        System.out.println("Вычитание типа Long: " + l4);
        long l5 = l2 * l1;
        System.out.println("Умножение типа Long: " + l5);
        long l6 = l2 / l1;
        System.out.println("Деление типа Long: " + l6);

        System.out.println();

        float f1 = 9223372036854775805.8f;
        float f2 = 9223372036854775805.1243456F;
        float f3 = f1 + f2;
        System.out.println("Сложение типа Float: " + f3);
        float f4 = f2 - f1;
        System.out.println("Вычитание типа Float: " + f4);
        float f5 = f2 * f1;
        System.out.println("Умножение типа Float: " + f5);
        float f6 = f2 / f1;
        System.out.println("Деление типа Float: " + f6);

        System.out.println();

        double d1 = 9464589659223372036854775805.8D;
        double d2 = 98456879877989223372036854775805.1243456d;
        double d3 = d1 + d2;
        System.out.println("Сложение типа Double: " + d3);
        double d4 = d2 - d1;
        System.out.println("Вычитание типа Double: " + d4);
        double d5 = d2 * d1;
        System.out.println("Умножение типа Double: " + d5);
        double d6 = d2 / d1;
        System.out.println("Деление типа Double: " + d6);

        //При выполнении арифметических операций примитивных типов происходит переполнение типа
        // (оно переходит через верхнюю\нижнюю границу и продолжает свою арифметическую операцию по кругу)
        // BigInteger ограничен только памятью....
    }
}
