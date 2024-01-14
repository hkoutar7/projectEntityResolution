package com.entityResolution.View.ViewDsEntity;

import com.entityResolution.Controller.Alignment.*;
import com.entityResolution.Model.*;

import java.util.*;

public class VisualizeDs1 implements IVisualizeDS {
    private IDsDataLoader dsDataLoader;
    private List<IDs> entities;



    public VisualizeDs1(IDsDataLoaderFactory dataLoaderFactory) {

        dsDataLoader = dataLoaderFactory.createLoader();
        dsDataLoader.setEntities();
        entities = dsDataLoader.getEntities();
    }
    @Override
    public List<IDs> getEntities() {
        return entities;
    }
    @Override
    public void printEntityTable() {
        System.out.println("------------------------------ Entity DS1 ------------------------------");
        System.out.printf("%-6s| %-12s| %-12s| %-15s| %-30s%n", "id", "firstName", "lastName", "phoneNumber", "address");
        System.out.println("------------------------------------------------------------------------");

        for (IDs entity : entities) {
            System.out.printf("%-6s| %-12s| %-12s| %-15s| %-30s%n",
                    entity.getId(), entity.getFirstName(), entity.getLastName(),
                    entity.getPhoneNumber(), entity.getAddress());
        }
    }

}
