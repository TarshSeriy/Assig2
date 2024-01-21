package models;

public class Employer extends Person{
    String position;
    double salary;
    public Employer(){
        super();
        position = "Position";
        salary = 0;
    }
    public Employer(String name , String surname, String position, double salary){
        super(name, surname);
        this.position = position;
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }
    public void setPosition(String position){
        this.position = position;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    @Override
    public String toString(){
        return "Employer:" + super.toString();
    }
    @Override
    public double getPaymentAmount(){
        return salary;
    }
    @Override
    public int compareTo(Person person){
        return Double.compare(salary, person.getPaymentAmount());
    }

    public String getPosition(){
        return postion;
    }





}
