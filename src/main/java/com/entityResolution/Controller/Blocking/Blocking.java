package com.entityResolution.Controller.Blocking;

import java.util.ArrayList;

public class Blocking {

    public static ArrayList<ArrayList<Tuple>> blocking(int index, int column, ArrayList<ArrayList<Tuple>> objetRec) {
        ArrayList<ArrayList<Tuple>> table = new ArrayList<>();
        ArrayList<Tuple> tableLocal = new ArrayList<>();
        ISimilarityMeasureAlgo levenshteinSimilarity = new LevenshteinSimilarity();
        int i = 0;
        int j;
        while (i < objetRec.get(index).size()) {
            Tuple obj = objetRec.get(index).get(i);
            j = i + 1;

            while (j < objetRec.get(index).size() ){
                Tuple obj1 = objetRec.get(index).get(j);

                if (levenshteinSimilarity.mesureSimilarityAlgo(obj.getRequist(column), obj1.getRequist(column)) >= 0.60) {
                    tableLocal.add(obj1);
                    objetRec.get(index).remove(j);
                }
                j++;
            }
            tableLocal.add(objetRec.get(index).get(i));
            table.add(tableLocal);
            tableLocal = new ArrayList<>();
            i++;
        }
        return table;
    }



}
