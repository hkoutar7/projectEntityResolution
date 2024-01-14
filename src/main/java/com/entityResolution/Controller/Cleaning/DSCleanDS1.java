package com.entityResolution.Controller.Cleaning;

import com.entityResolution.Controller.Alignment.IDsDataLoader;
import com.entityResolution.Model.IDS2;
import com.entityResolution.Model.IDs;
import com.entityResolution.Model.IDsParent;

import java.util.*;

public class DSCleanDS1 extends DsClean {

    @Override
    public List<IDs> createDSClean (IDsDataLoader iDsDataLoader) {

        List<IDs> entities;
        iDsDataLoader.setEntities();
        entities = iDsDataLoader.getEntities();

        IClean cleaner;

        for (IDs ds1 : entities) {
            cleaner = new PersonNameCleaning();

            cleaner.setter(ds1.getFirstName());
            ds1.setFirstName(cleaner.getter());

            cleaner.setter(ds1.getLastName());
            ds1.setLastName(cleaner.getter());

            cleaner = new PhoneFormatCleaning();
            cleaner.setter(ds1.getPhoneNumber());
            ds1.setPhoneNumber(cleaner.getter());

            cleaner = new GeneralNameCleaning();
            cleaner.setter(ds1.getAddress());
            ds1.setAddress(cleaner.getter());
        }

        return  entities;
    }




}
