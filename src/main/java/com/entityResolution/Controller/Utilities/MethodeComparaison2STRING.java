package com.entityResolution.Controller.Utilities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@NoArgsConstructor
//@AllArgsConstructor
@Getter
@Setter
public class MethodeComparaison2STRING implements MethodComparaison{

    public MethodeComparaison2STRING() {
        // Default constructor
    }
    public static String toLowercase(String input) {
        return input.toLowerCase();
    }

    public static String concatenateStrings(String... strings) {
        StringBuilder result = new StringBuilder();

        for (String str : strings) {
            result.append(str);
        }

        return result.toString();
    }

    public static int levenshteinDistance(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        if (m < n) {
            return levenshteinDistance(s2, s1);
        }

        if (n == 0) {
            return m;
        }

        int[] previousRow = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            previousRow[i] = i;
        }

        for (int i = 0; i < m; i++) {
            int[] currentRow = new int[n + 1];
            currentRow[0] = i + 1;

            for (int j = 0; j < n; j++) {
                int insertions = previousRow[j + 1] + 1;
                int deletions = currentRow[j] + 1;
                int substitutions = previousRow[j] + (s1.charAt(i) != s2.charAt(j)? 1 : 0);

                currentRow[j + 1] = Math.min(Math.min(insertions, deletions), substitutions);
            }

            previousRow = currentRow;
        }

        return previousRow[n];
    }

    public static double similarityPercentage(String s1, String s2) {
        int distance = levenshteinDistance(s1, s2);
        int maxLength = Math.max(s1.length(), s2.length());
        double similarity = 1 - (double) distance / maxLength;
        return similarity * 100;
    }





}
