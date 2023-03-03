package arrays;

public class ArraysVarargs {
    public static double average(int... values){
 //   public static double average(int[] values){   //альтернативная версия
        System.out.println("value length is " + values.length);
        if(values.length == 0)
            return 0.0;
        double sum = 0.0;
        for (int i = 0; i < values.length; i ++)
            sum += values[i];
        return sum / values.length;
    }

    private static void varargMethod(int values, int ... others){

    }

    private static void method3333(int ...a){}


    private static void method(int a, double b, boolean c, int... d) {}


    public static void main(String[] args) {
        double valuesAverage = average(1, 2, 3, 5);
  //      double valuesAverage = average(new int[]{1, 2, 3, 5}); //альтернативная версия
        System.out.println(valuesAverage);
        System.out.println(average()); //при использовании ... можно создавать массив 0 длины

        varargMethod(1, 2, 3);

        int[]sadsda = {1, 2, 3, 4};




    }
}
