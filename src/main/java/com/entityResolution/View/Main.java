package com.entityResolution.View;

import com.entityResolution.Dao.DaoDs;
import com.entityResolution.Dao.SingletonConnection;
import com.entityResolution.Model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

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




    }

}