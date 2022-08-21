package com.election;

import java.sql.SQLOutput;

public class VoterImpl {
    public static void main(String[] args){
        Voter object = new Voter();
        object.setAge(10);

        object.setName("nikhil");

        String voting = object.getAgeCriteria();
        System.out.println(voting);
    }
}
