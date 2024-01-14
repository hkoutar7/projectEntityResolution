package com.entityResolution.View;

import com.entityResolution.Controller.Alignment.Ds1DataLoaderFactory;
import com.entityResolution.Controller.Utilities.*;
import com.entityResolution.Model.IDs;
import com.entityResolution.View.ViewDsEntity.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void comparaisonEntre2String(String s1,String s2){
        s1 = MethodeComparaison2STRING.toLowercase(s1);
        s2 = MethodeComparaison2STRING.toLowercase(s2);
        double Porcentage = MethodeComparaison2STRING.similarityPercentage(s1, s2);
        if(Porcentage >= 60){
            System.out.println("Comparable" + Porcentage);
        }
        else if(Porcentage >= 0){
            System.out.println("NON_Comparable" + Porcentage);
        }
    }
    public static void comparaisonEntrePlusieursString(String s1,String... s2){
        String a1=MethodeComparaison2STRING.concatenateStrings(s2);
        s1 = MethodeComparaison2STRING.toLowercase(s1);
        a1 = MethodeComparaison2STRING.toLowercase(a1);
        double Porcentage = MethodeComparaison2STRING.similarityPercentage(s1, a1);
        if(Porcentage >= 60){
            System.out.println("Comparable " + Porcentage);
        }
        else if(Porcentage >= 0){
            System.out.println("NON_Comparable " + Porcentage);
        }
    }



    public static  void main(String [] argv){

        List <IDs> entities = new ArrayList<>();
        IVisualizeDS visual ;

        visual = new VisualizeDs1(new Ds1DataLoaderFactory());
        visual.printEntityTable();

        visual = new VisualizeDSCleaned(new DsCleanedFactory());
        visual.printEntityTable();;

    }


}