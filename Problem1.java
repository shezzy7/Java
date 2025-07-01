import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        // Initialize input reader
        Scanner inputReader = new Scanner(System.in);
        
        // Read input strings and convert to lowercase
        String text = inputReader.nextLine().toLowerCase();
        String searchPattern = inputReader.nextLine().toLowerCase();
        
        // Get lengths for bounds checking
        int textLength = text.length();
        int patternLength = searchPattern.length();
        
        // Store match positions and count
        StringBuilder matchIndices = new StringBuilder();
        int matchCount = 0;
        
        // Iterate through possible starting points in text
        for (int pos = 0; pos <= textLength - patternLength; pos++) {
            if (isPatternMatch(text, searchPattern, pos)) {
                matchCount++;
                matchIndices.append(pos).append(" ");
            }
        }
        
        // Output total number of matches
        System.out.println(matchCount);
        
        // Output indices or empty line if no matches
        System.out.println(matchCount > 0 ? matchIndices.toString().trim() : "");
        
        // Clean up
        inputReader.close();
    }
    
    // Helper method to check if pattern matches at a given position
    private static boolean isPatternMatch(String text, String pattern, int startPos) {
        for (int i = 0; i < pattern.length(); i++) {
            char patternChar = pattern.charAt(i);
            char textChar = text.charAt(startPos + i);
            // Skip match check for wildcard, otherwise compare characters
            if (patternChar != '?' && patternChar != textChar) {
                return false;
            }
        }
        return true;
    }
}