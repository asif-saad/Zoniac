package com.example.data;

public class Random_File {

    int val;
    String name;
    double result;

    public Random_File(int val, String name, double result) {
        this.val = val;
        this.name = name;
        this.result = result;
    }

    public int getVal() {
        return val;
    }

    public String getName() {
        return name;
    }

    public double getResult() {
        return result;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
