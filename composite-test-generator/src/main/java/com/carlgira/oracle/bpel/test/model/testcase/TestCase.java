package com.carlgira.oracle.bpel.test.model.testcase;

import java.util.ArrayList;
import java.util.List;

public class TestCase {
    public String name;
    public String wsdl;
    public String description = "TestCase description";
    public Long timeout = 180000L;
    public List<HumanTask> humanTaskList = new ArrayList<HumanTask>();

    public TestCase(){
    }
    public TestCase(String name){
        this.name = name;
    }
}
