package com.entityResolution.Controller.Alignment;

import com.entityResolution.Model.*;
import com.entityResolution.Dao.Alignment.*;

import java.util.*;

public class DsDataLoader implements IDsDataLoader {
    private List<IDs>  entities;

    public DsDataLoader() {
        entities = new ArrayList<>();
    }
    @Override
    public void setEntities() {
        com.entityResolution.Dao.Alignment.DsDataLoader dsDataLoader = new com.entityResolution.Dao.Alignment.DsDataLoader();
        entities = dsDataLoader.chargeEntitiesFromDb();
    }
    @Override
    public List<IDs> getEntities() {
        return entities;
    }

}
