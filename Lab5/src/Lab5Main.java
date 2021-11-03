import java.util.*;

public class Lab5Main {
    // Проверка является ли строка палиндромом
    public static void isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        String s1 = sb.toString();
        String s2 = sb.reverse().toString();
        if (s1.equals(s2)) {
            System.out.println(s1 + " - палиндром");
        } else {
            System.out.println(s1 + " - не палиндром");
        }
    }

    public static String removeRepeating(String s) {
        StringBuilder sb = new StringBuilder();
        char[] cArray = s.toCharArray();
        boolean repeating = false;
        for (int i = 0; i<s.length()-1; i++) {
            if (cArray[i] == cArray[i+1]) {
                repeating = true;
            } else {
                if (!repeating) {
                    sb.append(cArray[i]);
                } else {
                    repeating = false;
                }
            }
        }
        return sb.toString();
    }

    public static void isAnagramme(String s1, String s2) {
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        String sortedS1 = new String(chars1);
        String sortedS2 = new String(chars2);
        if (sortedS1.equals(sortedS2)) {
            System.out.println("Строки являются анаграммами");
        } else {
            System.out.println("Строки не являются анаграммами");
        }
    }

    public static char getSecondMostPopularChar(String s) {
        HashSet<Character> charSet = new HashSet<>();
        for (char c: s.toCharArray()) charSet.add(c);
        int mostPopular = 0;
        int secondMostPopular = 0;
        char secondMostPopularChar = ' ';
        for (char c: charSet) {
            int count = s.length() - s.replace("" + c, "" ).length();
            if (count > mostPopular) {
                mostPopular = count;
            } else if (count > secondMostPopular) {
                secondMostPopular = count;
                secondMostPopularChar = c;
            }
        }

        return secondMostPopularChar;
    }

    public static String getOrderedNonRepeatingCharacters(String s) {
        char[] chars = s.toCharArray();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i<chars.length-1; i++) {
           if (chars[i] != chars[i+1]) {
               res.append(chars[i]);
           }
           if (i+1 == chars.length-1) res.append(chars[i+1]);
        }
        return res.toString();
    }

    public static char getFirstNonRepeatingChar(String s) {
        HashSet<Character> charSet = new HashSet<>();
        HashSet<Character> removedChars = new HashSet<>();
        for (char c: s.toCharArray()) {
            if (!removedChars.contains(c)) {
                boolean isAdded = charSet.add(c);
                if (!isAdded) {
                    removedChars.add(c);
                    charSet.remove(c);
                }
            }
        }
        for (char c: charSet) return c;

        return ' ';
    }

    public static int getTripleCharCount(String s) {
        char[] chars = s.toCharArray();
        int count = 0;
        int curr_count = 0;
        for (int i = 0; i<chars.length-1; i++) {
            curr_count += 1;
            if (chars[i] != chars[i + 1]) {
                if (curr_count == 3)
                    count++;
                curr_count = 0;
            } else if (i+1 == chars.length-1) {
                curr_count += 1;
                if (curr_count == 3)
                    count++;
            }
        }
        return count;
    }

    public static int getDigitSum(String s) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) sum += Integer.parseInt(""+c);
        }
        return sum;
    }

    public static void main(String[] args) {
        // Проверка, что строка - палиндром
        isPalindrome("tenet");
        isPalindrome("netenet");
        // Удаление повторяющихся символов в строке
        System.out.println(removeRepeating("aaboatccc"));
        // Проверка, что две строки анаграммы
        isAnagramme("abcd", "dbac");
        isAnagramme("abcd", "dbxxww");
        // Лексографическое сравнение двух строк
        String s1 = "str";
        String s2 = "Str";
        String result = (s1.compareTo(s2) == 0) ? "равны" : "не равны";
        System.out.println("Строки " + result);
        // Лексографическое сравнение двух строк без учета регистра
        String s3 = "str";
        String s4 = "Str";
        String result2 = (s3.compareToIgnoreCase(s4) == 0) ? "равны" : "не равны";
        System.out.println("Строки " + result2);
        // Объединение строк
        String s5 = "someString";
        StringBuilder sb = new StringBuilder(s5);
        sb.append("newend");
        System.out.println("Результат: " + sb.toString());
        // Сранение строки с последовательностью символов
        char[] chars = {'a', 'b', 'c'};
        String s6 = "abc";
        String result3 = (s6.compareTo(new String(chars)) == 0) ? "равны" : "не равны";
        System.out.println("Строки " + result3);
        // Строка заканчивается другой строкой
        String s7 = "VeryBigStringWhichEndsWithWordStutter";
        String s8 = "Stutter";
        String result4 = (s7.endsWith(s8)) ? "заканчивается на " + s8 : "не заканчивается на " + s8;
        System.out.println(s7 + " " + result4);
        // Содержат ли два String одинаковые данные
        String s9 = "Data1";
        String s10 = "Data1";
        System.out.println(s9.equals(s10));
        // Длина строки
        System.out.println(s9.length());
        // В нижний регистр
        System.out.println(s7.toLowerCase(Locale.ROOT));
        // В верхний регистр
        System.out.println(s7.toUpperCase(Locale.ROOT));
        // Второй по популярности символ
        System.out.println(getSecondMostPopularChar("sssttr"));
        // Первый неповторяющийся символ
        System.out.println(getFirstNonRepeatingChar("sssttraaab"));
        // Без дубликатов
        System.out.println(getOrderedNonRepeatingCharacters("sssttraaaass"));
        // Первые два появляются в конце
        String s = "stringst";
        String part1 = s.substring(0,2);
        System.out.println(s.endsWith(part1));
        // Кол-во тройных символов
        System.out.println(getTripleCharCount("sssttaaapppss"));
        // Сумма цифр
        System.out.println(getDigitSum("a2dgg532"));
    }
}
