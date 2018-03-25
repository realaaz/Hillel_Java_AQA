public class L041_counterSymbolsInString {

    public static void main(String[] args) {

        // 2. Принимает строку, возвращает количество раз латинская буква “e” встречается в строке, вне зависимости от регистра
        System.out.print(counterSymbolsWithinString("qwertyQWERTY"));

    }

    public static int counterSymbolsWithinString(String inputString) {

        int entryCounter = 0;

        String inputStringLoverCase = inputString.toLowerCase();

        for (char entry : inputStringLoverCase.toCharArray()) {
            if (entry == 'e') entryCounter++;
        }

        return entryCounter;
    }

}
