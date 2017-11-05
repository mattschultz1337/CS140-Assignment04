package assignment04;

public class Person{
    
    //Instance Fields
    private String lastName;
    private String firstName;
    private char middleInitial;
    
    //Constructor
    public Person(String lName, String fName, char midInit){
        lastName = lName;
        firstName = fName;
        middleInitial = midInit;
    }
    
    //Get Methods
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public char getMiddleInitial(){
        return middleInitial;
    }
}