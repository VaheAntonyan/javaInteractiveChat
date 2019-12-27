package model;

public class Member {

    private String name;

    public Member() {
    }

    public String getName() {
        return name;
    }

    public Member name(String name){
        this.name = name;
        return this;
    }
}