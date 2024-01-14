package com.entityResolution.View;


import java.util.ArrayList;
import java.util.List;

public class EntityResolution {

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
                int substitutions = previousRow[j] + (s1.charAt(i) != s2.charAt(j) ? 1 : 0);

                currentRow[j + 1] = Math.min(Math.min(insertions, deletions), substitutions);
            }

            previousRow = currentRow;
        }

        return previousRow[n];
    }

    public static double similarityPercentage(String s1, String s2) {
        int distance = levenshteinDistance(s1, s2);
        int maxLength = Math.max(s1.length(), s2.length());
        return 1 - (double) distance / maxLength;
    }

    public static List<List<Object>> blocking(int index, int column, List<List<Object>> objetRec) {
        List<List<Object>> table = new ArrayList<>();
        int i = 0;

        while (i < objetRec.size()) {
            List<Object> obj = objetRec.get(i);
            int j = i + 1;

            while (j < objetRec.size()) {
                List<Object> obj1 = objetRec.get(j);

                if (similarityPercentage(obj.get(column).toString(), obj1.get(column).toString()) >= 0.60) {
                    objetRec.remove(j);
                } else {
                    j++;
                }
            }

            table.add(new ArrayList<>(obj));
            i++;
        }
        return table;
    }

    public static List<List<Object>> matching(int column, int maxColumn, List<List<Object>> objetRec) {
        List<List<Object>> table = new ArrayList<>(objetRec);

        for (int d = column; d < maxColumn; d++) {
            for (int i = 0; i < table.size(); i++) {
                table.addAll(blocking(i, d, table));
            }
        }

        return table;
    }

    public static void main(String[] args) {
        List<List<Object>> objetRec = new ArrayList<>();
        objetRec.add(List.of(1, "badr", "test", "occuperutrhfhgffhfh"));
        objetRec.add(List.of(2, "badr", "testoccupation tizre", "occuper"));
        objetRec.add(List.of(4, "badr", "testoc", "occuper"));
        objetRec.add(List.of(10, "badr", "testocsqfedfqedqed", "occuperppppkklklklklk"));
        objetRec.add(List.of(100, "badr", "testocsqfedfqedqed", "occuper"));
        objetRec.add(List.of(1156, "badr", "testocsqfedfqedqed", "occuper"));
        objetRec.add(List.of(110, "badr", "testocsqfedfqedqed", "occuperutrhfhgffhfh"));
        objetRec.add(List.of(22, "badr", "testoccupation tizre", "occuper"));
        objetRec.add(List.of(10099, "badr", "testocsqfedfqedqed", "occuperppppkklklklklk"));
        objetRec.add(List.of(11, "badr", "testocsqfedfqedqed", "occuperppppkklklklklk"));
        System.out.println(objetRec);
        List<List<Object>> result = matching(1, 4, objetRec);

        for (List<Object> innerList : result) {
            System.out.println(innerList);
        }
    }
}