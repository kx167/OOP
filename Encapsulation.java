/*its contain all encapsulation program for create base */

public class Encapsulation {
    public static void main(String[]args){

        student s1 = new student();
        s1.setName("KISHAN");
        s1.setRollno(101);
        s1.setMarks(900);

        System.out.println("Name: "+s1.getName());
        System.out.println("Rollno: "+s1.getRollno());
        System.out.println("Marks: "+s1.getMarks());

        student s2 = new student("Rohit",102,850);

        System.out.println("Name: "+s2.getName());
        System.out.println("Rollno: "+s2.getRollno());
        System.out.println("Marks: "+s2.getMarks());

        /*BankAccount class object create and use */
        BankAccount b1 = new BankAccount("KISHAN",123456,10000);

        System.out.println("Account Holder Name: "+b1.getAccountHolderName());
        System.out.println("Account Number: "+b1.getAccountNumber());
        System.out.println("Balance: "+b1.getBalance());
        System.out.println("Deposit 5000");
        b1.deposit(5000);
        System.out.println("Balance: "+b1.getBalance());
        System.out.println("Withdraw 2000");
        b1.withdraw(2000);
        System.out.println("Balance: "+b1.getBalance());

        /*Employee class object create and use */
        Employee e1 = new Employee("KISHAN",101,50000);
        System.out.println("Employee Name: "+e1.getname());
        System.out.println("Employee Id: "+e1.getemployeeId());
        System.out.println("Employee Salary: "+e1.getsalary());
        System.out.println("Increase Salary by 10%");
        e1.increaseSalary(10);
        System.out.println("Employee Salary: "+e1.getsalary());




    }
}

class student{
   private String name;
   private int Rollno;
   private int marks;
/*Constructor for student class(DEFAULT) */
    public student(){
        this.name = "";
        this.Rollno = 0;
        this.marks = 0;
    }

    /*Constructor for student class(PARAMETERIZED) */
    public student(String name, int Rollno, int marks){
        setName(name);
        setRollno(Rollno);
        setMarks(marks);
    }
    /*Set all data */

    public void setName(String name){
        this.name=name;
    }

    public void setRollno(int Rollno){
        if(Rollno>0){
            this.Rollno=Rollno;
        }
        else{
            System.out.println("Rollno should be greater than 0");
        }
    }

    public void setMarks(int marks){
        if(marks>=0 && marks<=100){
            this.marks=marks;
        }
        else{
            System.out.println("Marks should be between 0 to 100");
        }
    }

    /*Get all data */

    public String getName(){
        return name;
    }

    public int getRollno(){
        return Rollno;
    }

    public int getMarks(){
        return marks;
    }

}
/*BankAccount class for encapsulation program */
class BankAccount{
    private String AccountHolderName;
    private int AccountNumber;
    private double Balance;

    public BankAccount(String AccountHolderName, int AccountNumber, double Balance){
        setAccountHolderName(AccountHolderName);
        setAccountNumber(AccountNumber);
        if (Balance>=0){
            this.Balance=Balance;
        }
        else{
            System.out.println("Balance should be greater than or equal to 0");
        }
        
    }

    public void setAccountHolderName(String AccountHolderName){
        this.AccountHolderName=AccountHolderName;
    }

    public void setAccountNumber(int AccountNumber){
        if(AccountNumber>0){
            this.AccountNumber=AccountNumber;
        }
        else{
            System.out.println("Account Number should be greater than 0");
        }
    }

    public void deposit(double amount){
        if(amount>0){
            Balance+=amount;
        }
        else{
            System.out.println("Deposit amount should be greater than 0");
        }
    }

    public void withdraw(double amount){
        if(amount>0 && amount<=Balance){
            Balance-=amount;
        }
        else{
            System.out.println("Withdraw amount should be greater than 0 and less than or equal to balance");
        }
    }

    public String getAccountHolderName(){
        return AccountHolderName;
    }

    public int getAccountNumber(){
        return AccountNumber;
    }

    public double getBalance(){
        return Balance;
    }
}

/*Employee salary management */

class Employee{
    private String name;
    private int employeeId;
    private double salary;

    public Employee(String name, int employeeId, double salary){
        setname(name);
        setemployeeId(employeeId);
        if(salary>=0){
            this.salary=salary;
        }
        else{
            System.out.println("Salary should be greater than or equal to 0");
        }

    }

    public void setname(String name) {
    if(name != null && !name.trim().isEmpty()) {
        this.name = name;
    } else {
        System.out.println("Invalid employee name");
    }
}

    public void setemployeeId(int employeeId){
        if(employeeId>0){
            this.employeeId=employeeId;
        }
        else{
            System.out.println("Employee Id should be greater than 0");
        }
    }

    public void increaseSalary(double amount){
        if(amount>0){
            salary +=salary *amount/100;
            System.out.println("Salary increased by "+amount+"%");
        }
        else{
            System.out.println("Increase amount should be greater than 0");
        }
    }

    public String getname(){
        return name;
    }

    public int getemployeeId(){
        return employeeId;
    }

    public double getsalary(){
        return salary;
    }
}