package assignment04;
import java.util.*;
public class Manager extends Employee{
    private String department;
    private ArrayList<Employee> team = new ArrayList<Employee>();
    
    public Manager(Person p){
        super(p);
    }
    public void setDepartment(String d){
        department = d;
    }
    public void addToTeam(Employee e){
        team.add(e);
    }
    public String toString(){
        StringBuilder retVal = new StringBuilder();
        retVal.append(super.toString());
        String newLine = "\n";
        String tab = "\t";
         retVal.append(newLine + department);
        for(int i=0;i<team.size();i++){
            retVal.append(newLine + tab + team.get(i));
        }
        return retVal.toString();
    }
}