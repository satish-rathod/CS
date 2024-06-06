import java.util.*;

public class B_Symmetric_Encoding{

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int testCases = inputScanner.nextInt();
        
        for (int testCase = 0; testCase < testCases; testCase++) {
            int length = inputScanner.nextInt();
            String encodedString = inputScanner.next();
            System.out.println(getDecodedString(encodedString));
        }
    }

    private static String getDecodedString(String encoded) {
        // Create a set to store unique characters
        Set<Character> uniqueCharSet = new TreeSet<>();
        for (char character : encoded.toCharArray()) {
            uniqueCharSet.add(character);
        }

        // Convert the set to a list
        List<Character> uniqueCharList = new ArrayList<>(uniqueCharSet);
        StringBuilder uniqueCharString = new StringBuilder();
        for (char character : uniqueCharList) {
            uniqueCharString.append(character);
        }

        // Create a map for symmetric characters
        Map<Character, Character> symmetricCharacterMap = new HashMap<>();
        int uniqueCharLength = uniqueCharString.length();
        for (int i = 0; i < uniqueCharLength; i++) {
            char frontChar = uniqueCharString.charAt(i);
            char backChar = uniqueCharString.charAt(uniqueCharLength - 1 - i);
            symmetricCharacterMap.put(frontChar, backChar);
            symmetricCharacterMap.put(backChar, frontChar);
        }

        // Build the decoded string
        StringBuilder decodedString = new StringBuilder();
        for (char character : encoded.toCharArray()) {
            decodedString.append(symmetricCharacterMap.get(character));
        }
        
        return decodedString.toString();
    }
}