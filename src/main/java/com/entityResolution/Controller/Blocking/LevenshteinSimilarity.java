package com.entityResolution.Controller.Blocking;

public class LevenshteinSimilarity  implements ISimilarityMeasureAlgo {

    public int mesureSimilarityAlgo(String s1, String s2) {
        int tailleS1 = s1.length();
        int tailleS2 = s2.length();

        if (tailleS1 < tailleS2)
            return mesureSimilarityAlgo(s2, s1);

        if (tailleS2 == 0)
            return tailleS1;


        int[] previousRow = new int[tailleS2 + 1];
        for (int i = 0; i <= tailleS2; i++)
            previousRow[i] = i;

        for (int i = 0; i < tailleS1; i++) {
            int[] currentRow = new int[tailleS2 + 1];
            currentRow[0] = i + 1;

            for (int j = 0; j < tailleS2; j++) {
                int insertions = previousRow[j + 1] + 1;
                int deletions = currentRow[j] + 1;
                int substitutions = previousRow[j] + (s1.charAt(i) != s2.charAt(j) ? 1 : 0);
                currentRow[j + 1] = Math.min(Math.min(insertions, deletions), substitutions);
            }
            previousRow = currentRow;
        }
        return previousRow[tailleS2];
    }

    public double similarityPercentage(String s1, String s2) {
        int distance = mesureSimilarityAlgo(s1, s2);
        int maxLength = Math.max(s1.length(), s2.length());
        return 1 - (double) distance / maxLength;
    }


}
