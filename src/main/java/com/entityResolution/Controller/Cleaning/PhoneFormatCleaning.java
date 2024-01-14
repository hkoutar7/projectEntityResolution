package com.entityResolution.Controller.Cleaning;

public class PhoneFormatCleaning implements IClean {
    private String phoneNumber;

    public PhoneFormatCleaning() {
    }

    public PhoneFormatCleaning(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void clean() {
        String cleanedNumber = "";

        cleanedNumber = phoneNumber.replaceAll("[^0-9]", "");
        cleanedNumber = cleanedNumber.replaceFirst("^0+", "0");

        if (cleanedNumber.length() > 10 && cleanedNumber.startsWith("21"))
            cleanedNumber = "0" + cleanedNumber.substring(3);
        if (cleanedNumber.length() > 10)
            cleanedNumber = cleanedNumber.substring(0, 10);

        this.phoneNumber = cleanedNumber;
    }

    @Override
    public String getter() {
        return getPhoneNumber();
    }

    @Override
    public void setter(String str){
        setPhoneNumber(str);
        clean();
    }

}
