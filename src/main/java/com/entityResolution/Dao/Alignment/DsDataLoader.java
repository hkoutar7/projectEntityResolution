package com.entityResolution.Dao.Alignment;

import com.entityResolution.Dao.*;
import com.entityResolution.Model.*;

import java.sql.*;
import java.util.*;

public class DsDataLoader implements IDsDataLoader<IDs>  {
    private List<IDs> entities;
    private final String SELECT_ALL_ENTITIES_DS = "SELECT * FROM ds1";

    public DsDataLoader() {
        entities = new ArrayList<>();
    }
    public List<IDs> getEntities() {
        return entities;
    }
    public void setEntities(List<IDs> entities) {
        this.entities = entities;
    }


    @Override
    public List<IDs> chargeEntitiesFromDb() {
        SingletonConnection connection = null;

        try {
            connection = SingletonConnection.getInstance();
        } catch (Exception error) {
            System.out.println("Error when establishing connection " + error);
        }

        try {
            PreparedStatement pst = connection.getConnection().prepareStatement(SELECT_ALL_ENTITIES_DS);
            ResultSet entityData = pst.executeQuery();

            while (entityData.next()) {
                int id = entityData.getInt("id");
                String firstName = entityData.getString("firstName");
                String lastName = entityData.getString("lastName");
                String phoneNumber = entityData.getString("phoneNumber");
                String address = entityData.getString("address");

                Ds1 entity = new Ds1(id, firstName, lastName, phoneNumber, address);
                entities.add(entity);
            }
        } catch(Exception error){
            error.printStackTrace();
        }
        return entities;
    }

}
