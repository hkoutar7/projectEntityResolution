package com.entityResolution.Dao;

import com.entityResolution.Model.*;

import java.sql.*;
import java.util.*;

public class DaoDs {

    final private String SELECT_ALL_ENTITIES_DS = "SELECT * FROM ds1";


    public List<IDs> getDuplicateSetData(IDs object) {

        List<IDs> entities = new ArrayList<>();

        SingletonConnection connection = null;
        try {
            connection = SingletonConnection.getInstance();
        } catch (Exception error) {
            System.out.println("Error when establishing connection " + error);
        }

        try {
            if (object instanceof Ds1) {
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
            }
            else if (object instanceof Ds2){
                System.out.println("DS2");
            }

        } catch(Exception error){
            error.printStackTrace();
        }

        return entities;
    }

}
