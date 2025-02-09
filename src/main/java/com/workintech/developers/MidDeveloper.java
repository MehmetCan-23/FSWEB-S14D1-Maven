package com.workintech.developers;

public class MidDeveloper extends Employee {

    public MidDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void works() {
        System.out.println(getName() + " mid developer starts to working");
    }
}
