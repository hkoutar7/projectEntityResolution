package com.entityResolution.Controller.Cleaning;

public class GeneralNameCleaning implements IClean {
    private String name;

    public GeneralNameCleaning() {
    }

    public GeneralNameCleaning(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void clean() {
        if (name != null && !name.isEmpty()) {
            this.name = name.toLowerCase()
                    .replaceAll("[^a-z0-9]", " ")
                    .replaceAll(" +", " ")
                    .trim();
        }
    }
    @Override
    public String getter() {
        return getName();
    }
    @Override
    public void setter(String str){
        setName(str);
        clean();
    }


}
