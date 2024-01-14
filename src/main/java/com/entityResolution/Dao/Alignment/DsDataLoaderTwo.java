package com.entityResolution.Dao.Alignment;

import com.entityResolution.Dao.*;
import com.entityResolution.Model.*;

import java.sql.*;
import java.util.*;

public class DsDataLoaderTwo implements IDsDataLoader<IDS2>  {

    private List<IDS2> entities;
    private final String SELECT_ALL_ENTITIES_DS = "SELECT * FROM ds2";

    public DsDataLoaderTwo() {
        entities = new ArrayList<>();
    }
    public List<IDS2> getEntities() {
        return entities;
    }
    public void setEntities(List<IDS2> entities) {
        this.entities = entities;
    }

    @Override
    public List<IDS2> chargeEntitiesFromDb() {
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
                String phone = entityData.getString("phone");
                String street = entityData.getString("Street");
                String city = entityData.getString("city");

                IDS2 entity = new Ds2(id,firstName, lastName,phone, street, city);
                entities.add(entity);
            }
        } catch(Exception error){
            error.printStackTrace();
        }
        return entities;
    }


}
