package com.entityResolution.View.ViewDsEntity;

import com.entityResolution.Controller.Alignment.DsDataLoader;
import com.entityResolution.Controller.Alignment.IDsDataLoader;
import com.entityResolution.Controller.Cleaning.DSCleanDS1;
import com.entityResolution.Controller.Cleaning.DsClean;
import com.entityResolution.Model.IDs;

import java.util.List;

public class VisualizeDSCleaned implements IVisualizeDS {

    private IDsDataLoader dsDataLoader;
    private List<IDs> entities;


    public VisualizeDSCleaned(IDsCleanedFactory iDsCleanedFactory) {

        IDsDataLoader iDsDataLoader = new DsDataLoader();
        DsClean dsClean = iDsCleanedFactory.createDSClean();

        entities = dsClean.createDSClean(iDsDataLoader);
    }

    @Override
    public List<IDs> getEntities() {
        return entities;
    }

    @Override
    public void printEntityTable() {


        System.out.println("--------------------------- Entity DS1 After Cleaning  ---------------------------");
        System.out.printf("%-6s| %-12s| %-12s| %-15s| %-30s%n", "id", "firstName", "lastName", "phoneNumber", "address");
        System.out.println("------------------------------------------------------------------------");

        for (IDs entity : entities) {
            System.out.printf("%-6s| %-12s| %-12s| %-15s| %-30s%n",
                    entity.getId(), entity.getFirstName(), entity.getLastName(),
                    entity.getPhoneNumber(), entity.getAddress());
        }

    }


}
