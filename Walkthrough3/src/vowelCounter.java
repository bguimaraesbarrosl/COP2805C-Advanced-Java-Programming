public class vowelCounter {
    public static int countVowels(String word) {
        int vowels = 0; // track the number of vowels in word

        for (int i = 0; i < word.length() ; i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' ||
                word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                    vowels++; // increment the counter
            }
        }
        return vowels;
    }
}
