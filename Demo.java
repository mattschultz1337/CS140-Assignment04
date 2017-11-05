package assignment04;

public class Demo{
    public static void main(String[] args){
        System.out.println("<*****Testing Constructor*****>");
        FlexibleChoiceQuestion test = new FlexibleChoiceQuestion("Did this work?");
        System.out.println();
        System.out.println("<*****Testing addChoice*****>");
        test.addChoice("Yes");
        test.addChoice("No");
        test.addChoice("Maybe");
        test.addChoice("so");
        System.out.println();
        System.out.println("<*****Testing addAnswer*****>");
        test.addAnswer(1);
        test.addAnswer(3);
        System.out.println();
        System.out.println("<*****Testing presentQuestion & checkQuesiton*****>");
        System.out.println("Answer [1,3] for correctness");
        test.presentQuestion();
        System.out.println();
        
        System.out.println("<*****Testing Manager/Employee*****>\n");
        Person p1Man = new Person("Gabriel","Tyler",'j');
        Person p2Man = new Person("Sotolongo","Alessandra",'S');
        Person p3Emp = new Person("White","Jesse",'s');
        Person p4Emp = new Person("Schultz","Matthew",'J');
        Person p5Emp = new Person("Harron","Jake",'M');
        Person p6Emp = new Person("Bruce","Spencer",'G');
        Person p7Emp = new Person("Gorilla","Magilla",'B');
        Manager man1 = new Manager(p1Man);
        Manager man2 = new Manager(p2Man);
        Employee emp1 = new Employee(p3Emp);
        Employee emp2 = new Employee(p4Emp);
        Employee emp3 = new Employee(p5Emp);
        Employee emp4 = new Employee(p6Emp);
        Employee emp5 = new Employee(p7Emp);
        
        emp1.setSalary(80000.00);
        emp2.setSalary(800000.00);
        emp3.setSalary(75000.00);
        emp4.setSalary(100000.00);
        emp5.setSalary(80.00);
        man1.setSalary(1000000000.0);
        man2.setSalary(770000000.0);
        
        man1.setDepartment("Accounting");
        man2.setDepartment("\"Herb Sales\"");
        man1.addToTeam(emp1);
        man1.addToTeam(emp3);
        man2.addToTeam(emp2);
        man2.addToTeam(emp4);
        man2.addToTeam(emp5);
        
        System.out.println(man1);
        System.out.println();
        System.out.println(man2 + "\n");
        
        System.out.println("<*****Testing ResonantCircuit*****>");
        ResonantCircuit r1 = new ResonantCircuit(10, 3, 70);
        r1.display();
        ResonantCircuit r2 = new ParallelResonantCircuit(70,.05,.07);
        r2.display();
        ResonantCircuit r3 = new SeriesResonantCircuit(70,.05,.07);
        r3.display();
        
    }
}
