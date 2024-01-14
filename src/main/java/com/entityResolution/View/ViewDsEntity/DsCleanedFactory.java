package com.entityResolution.View.ViewDsEntity;

import com.entityResolution.Controller.Cleaning.DSCleanDS1;
import com.entityResolution.Controller.Cleaning.DsClean;

public class DsCleanedFactory implements IDsCleanedFactory{
    @Override
    public DsClean createDSClean() {
        return  new DSCleanDS1();
    }
}
