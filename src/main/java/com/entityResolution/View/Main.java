package com.entityResolution.View;

import com.entityResolution.Controller.Alignment.Ds1DataLoaderFactory;
import com.entityResolution.Controller.Utilities.*;
import com.entityResolution.Model.IDs;
import com.entityResolution.View.ViewDsEntity.*;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static  void main(String [] argv){

        List <IDs> entities = new ArrayList<>();
        IVisualizeDS visual ;

        visual = new VisualizeDs1(new Ds1DataLoaderFactory());
        visual.printEntityTable();

        visual = new VisualizeDSCleaned(new DsCleanedFactory());
        visual.printEntityTable();;

    }


}