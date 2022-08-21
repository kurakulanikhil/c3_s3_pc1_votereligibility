package com.election;

public class Voter {
    private int age;
    private String name;
    static final int voter_eligible_age = 18;
    String eligiblity = "";

    Voter(){
        int age;
        String name;

    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;


    }
    public String getName(){
        return name;
    }
    public String getAgeCriteria(){
        if(age>=18){
            String eligiblity = name.concat(" is eligible to vote");
            System.out.println(eligiblity);


        }
        if (age<18){
            String eligiblity = name.concat(" is not eligible to vote");
            System.out.println(eligiblity);

        }
        if (age<0){
           String eligiblity = name.concat(" age can't be zero or negative");
            System.out.println(eligiblity);
        }

        return eligiblity;

    }
}
