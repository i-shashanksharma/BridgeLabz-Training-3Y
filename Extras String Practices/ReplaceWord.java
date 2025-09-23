public class ReplaceWord {
    public static String replace(String sentence, String oldWord, String newWord) {
        String[] words = sentence.split(" ");
        String result = "";
        for (String word : words) {
            if (word.equals(oldWord)) {
                result += newWord + " ";
            } else {
                result += word + " ";
            }
        }
        return result.trim();
    }
    public static void main(String[] args) {
        String sentence = "Java is fun and Java is powerful";
        String modified = replace(sentence, "Java", "Python");
        System.out.println("Modified Sentence: " + modified);
    }
}