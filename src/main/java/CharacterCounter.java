public class CharacterCounter {
    public static int letterAppearance(String word, char letter) {
        int characterCounter = 0;
        char character;
        for (int i = 0; i < word.length(); i++) {
            character = word.charAt(i);
            if (character == letter) {
                characterCounter++;
            }
        }
        return characterCounter;
    }

    public static void main (String[] args) {
    String exampleWord = "programowanie jest trudne";
    System.out.println(letterAppearance(exampleWord, 'r'));
    }
}