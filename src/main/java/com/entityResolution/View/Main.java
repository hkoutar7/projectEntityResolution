package com.entityResolution.View;

import com.entityResolution.Controller.Utilities.*;
import com.entityResolution.Dao.DaoDs;
import com.entityResolution.Dao.SingletonConnection;
import com.entityResolution.Model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void comparaisonEntre2String(String s1,String s2){
        s1 = MethodeComparaison2STRING.toLowercase(s1);
        s2 = MethodeComparaison2STRING.toLowercase(s2);
        double Porcentage = MethodeComparaison2STRING.similarityPercentage(s1, s2);
        if(Porcentage >= 60){
            System.out.printf("Comparable");
        }
        else if(Porcentage >= 0){
            System.out.printf("NON_Comparable");
        }
    }
    public static void comparaisonEntrePlusieursString(String s1,String... s2){
        String a1=MethodeComparaison2STRING.concatenateStrings(s2);
        s1 = MethodeComparaison2STRING.toLowercase(s1);
        a1 = MethodeComparaison2STRING.toLowercase(a1);
        double Porcentage = MethodeComparaison2STRING.similarityPercentage(s1, a1);
        if(Porcentage >= 60){
            System.out.printf("Comparable");
        }
        else if(Porcentage >= 0){
            System.out.printf("NON_Comparable");
        }
    }
    public static  void main(String [] argv){

        List<IDs> entities = new ArrayList<>();
        DaoDs daods = new DaoDs();
        IDs obj = new Ds1();

        entities = daods.getDuplicateSetData(obj);

        for (IDs entity : entities) {
            if (entity instanceof Ds1) {
                Ds1 ds1Entity = (Ds1) entity;
                System.out.println(ds1Entity);
            }
        }
        comparaisonEntre2String("0610719939","+212610719939");
        comparaisonEntrePlusieursString("12 Rue Fidia Berrechid", "rue al fidia","BERRECHID");
    }


}