package com.example.android_wei30;

public class Member {
    private String name;
    public Boolean isVIP=false;
    public Member(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setVIP(boolean isVIP){
        this.isVIP=isVIP;
    }
    public boolean getVIP(){
        return isVIP;
    }
}
