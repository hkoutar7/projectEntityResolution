package com.entityResolution.Controller.Alignment;

public class Ds1DataLoaderFactory implements IDsDataLoaderFactory {
    @Override
    public IDsDataLoader createLoader() {
        return new DsDataLoader();
    }
}
