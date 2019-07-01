package com.lb.java.thread.dome02;

public class Target {
    private String targetName;
    private int targetNum;

    public Target(String targetName, int targetNum){
        this.targetName = targetName;
        this.targetNum = targetNum;
    }

    public void setTargetName(String targetName){
        this.targetName = targetName;
    }
    public String getTargetName(){
        return this.targetName;
    }

    public void setTargetNum(int targetNum) {
        this.targetNum = targetNum;
    }

    public int getTargetNum() {
        return targetNum;
    }
}
