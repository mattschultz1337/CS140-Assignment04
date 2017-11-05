package assignment04;

public class Employee{
    private Person person;
    private double salary;
    
    public Employee(Person p){
        person = p;
    }
    
    public Person getPerson(){
        return person;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double s){
        salary = s;
    }
    public String toString(){
        StringBuilder retVal = new StringBuilder();
        retVal.append((person.getFirstName()));
        retVal.append(" " + person.getLastName());
        retVal.append(": " + salary);
        return retVal.toString();
    }
}