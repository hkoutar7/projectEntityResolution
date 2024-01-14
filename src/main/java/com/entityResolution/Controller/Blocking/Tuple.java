package com.entityResolution.Controller.Blocking;

public class Tuple {
    private int first;
    private  String second;
    private  String third;
    private  String fourth;

    public Tuple(int first, String second, String third, String fourth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
    }

    public int getFirst() {
        return first;
    }

    public String getSecond() {
        return second;
    }

    public String getThird() {
        return third;
    }

    public String getFourth() {
        return fourth;
    }
    public String getRequist(int Colonne){
        if(Colonne == 1){
            return getSecond();
        }
        else if(Colonne == 2){
            return getThird();
        }
        else if(Colonne == 3){
            return getFourth();
        }
        return null;
    }

    @Override
    public String toString() {
        return "(" + first + ", \"" + second + "\", \"" + third + "\", \"" + fourth + "\")";
    }
}