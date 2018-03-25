public class L040_arrayToAverage {

    public static void main(String[] args) {

        // 1. Принимает массив целых чисел, возвращает среднее арифметическое всех элементов
        int[] someArray = {1, 2};
        System.out.println(arrayToAverage(someArray));

    }


    public static float arrayToAverage(int[] inArray) {

        int sum = 0;

        for (int i = 0; i < inArray.length; i++) {
            sum += inArray[i];
        }

        return (float) sum / inArray.length;
    }


}
