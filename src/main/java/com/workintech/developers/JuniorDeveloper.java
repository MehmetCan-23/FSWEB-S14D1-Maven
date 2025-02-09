package com.workintech.developers;

public class JuniorDeveloper extends Employee{

    public JuniorDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void works() {
        System.out.println(getName() + " junior developer starts to working");
    }
}
