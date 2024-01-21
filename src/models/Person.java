package models;
import interfaces.Payable;

public abstract class Person implements Payable, Comparable<Person> {
    protected static int     idCounter = 1;
    protected int id;
    protected String name;
    protected String surname;


    public Person(){
        this.id = idCounter++;
        this.name = "Name";
        this.surname = "Surname";

    }
    public Person(String name, String surname){
        this.id = idCounter++;
        this.name = name;
        this.surname =  surname;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    @Override public String toString(){
        return id + " " + name + " " + surname;

    }
    public absrtact String getPosition();
    public String printData(){
        return toString() + "earns" + getPaymentAmount() + "tenge";

    }

}

