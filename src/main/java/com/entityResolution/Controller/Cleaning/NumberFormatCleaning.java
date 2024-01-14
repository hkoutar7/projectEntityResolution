package com.entityResolution.Controller.Cleaning;

public class NumberFormatCleaning implements IClean {
    private double number;

    public NumberFormatCleaning(double number) {
        this.number = number;
    }
    public double getNumber() {
        return number;
    }
    public void setNumber(double number) {
        this.number = number;
    }

    @Override
    public void clean() {
        String cleanNumberStr = "";
        cleanNumberStr = String.valueOf(number);

        cleanNumberStr = cleanNumberStr.replaceAll("[^0-9]", "");
        cleanNumberStr = cleanNumberStr.replaceFirst("^0+", "");
       this.number = Double.parseDouble(cleanNumberStr);
    }
    @Override
    public String getter() {
        return String.valueOf(getNumber());
    }
    @Override
    public void setter(String str){
        setNumber(Double.valueOf(str));
        clean();
    }
}
