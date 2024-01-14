package com.entityResolution.Controller.Cleaning;

public class PersonNameCleaning implements IClean {
    private String name;

    public PersonNameCleaning() {
    }

    public PersonNameCleaning(String name) {
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
                    .replaceAll("[^a-z]", " ")
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
