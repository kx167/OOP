
import java.util.Scanner;

public class Encapsulation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n========== ENCAPSULATION PROJECT ==========");
            System.out.println("1. Student Information");
            System.out.println("2. Employee Management");
            System.out.println("3. Bank Account Management");
            System.out.println("4. ATM Simulation");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    // STUDENT SECTION

                    System.out.println("\n===== STUDENT INFORMATION =====");

                    System.out.print("Enter student name: ");
                    String studentName = sc.nextLine();

                    System.out.print("Enter roll number: ");
                    int rollNo = sc.nextInt();

                    System.out.print("Enter marks: ");
                    int marks = sc.nextInt();

                    Student s1 = new Student(studentName, rollNo, marks);

                    System.out.println("\n----- Student Details -----");
                    System.out.println("Name: " + s1.getName());
                    System.out.println("Roll No: " + s1.getRollNo());
                    System.out.println("Marks: " + s1.getMarks());

                    break;


                case 2:

                    // EMPLOYEE SECTION

                    System.out.println("\n===== EMPLOYEE MANAGEMENT =====");

                    System.out.print("Enter employee name: ");
                    String empName = sc.nextLine();

                    System.out.print("Enter employee ID: ");
                    int empId = sc.nextInt();

                    System.out.print("Enter salary: ");
                    double salary = sc.nextDouble();

                    Employee emp = new Employee(empName, empId, salary);

                    System.out.println("\n----- Employee Details -----");
                    System.out.println("Name: " + emp.getName());
                    System.out.println("Employee ID: " + emp.getEmployeeId());
                    System.out.println("Salary: " + emp.getSalary());

                    System.out.print("\nEnter salary increment percentage: ");
                    double percentage = sc.nextDouble();

                    emp.increaseSalary(percentage);

                    System.out.println("Updated Salary: " + emp.getSalary());

                    break;


                case 3:

                    // BANK ACCOUNT SECTION

                    System.out.println("\n===== BANK ACCOUNT MANAGEMENT =====");

                    System.out.print("Enter account holder name: ");
                    String holderName = sc.nextLine();

                    System.out.print("Enter account number: ");
                    int accountNo = sc.nextInt();

                    System.out.print("Enter initial balance: ");
                    double initialBalance = sc.nextDouble();

                    BankAccount bank = new BankAccount(holderName, accountNo, initialBalance);

                    System.out.println("\n----- Account Details -----");
                    System.out.println("Account Holder: " + bank.getAccountHolderName());
                    System.out.println("Account Number: " + bank.getAccountNumber());
                    System.out.println("Balance: " + bank.getBalance());

                    System.out.print("\nEnter amount to deposit: ");
                    double depositAmount = sc.nextDouble();

                    bank.deposit(depositAmount);

                    System.out.print("\nEnter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();

                    bank.withdraw(withdrawAmount);

                    System.out.println("Final Balance: " + bank.getBalance());

                    break;


                case 4:

                    // ATM SECTION

                    System.out.println("\n===== ATM SIMULATION =====");

                    System.out.print("Enter account holder name: ");
                    String atmName = sc.nextLine();

                    System.out.print("Set 4-digit PIN: ");
                    int atmPin = sc.nextInt();

                    System.out.print("Enter initial balance: ");
                    double atmBalance = sc.nextDouble();

                    ATM atm = new ATM(atmName, atmPin, atmBalance);

                    int atmChoice;

                    do {

                        System.out.println("\n--------- ATM MENU ---------");
                        System.out.println("1. Check Balance");
                        System.out.println("2. Withdraw Money");
                        System.out.println("3. Deposit Money");
                        System.out.println("4. Change PIN");
                        System.out.println("5. Exit ATM");

                        System.out.print("Enter your choice: ");
                        atmChoice = sc.nextInt();

                        switch (atmChoice) {

                            case 1:
                                atm.checkBalance(sc);
                                break;

                            case 2:

                                System.out.print("Enter withdrawal amount: ");
                                double atmWithdraw = sc.nextDouble();

                                atm.withdraw(sc, atmWithdraw);
                                break;

                            case 3:

                                System.out.print("Enter deposit amount: ");
                                double atmDeposit = sc.nextDouble();

                                atm.deposit(sc, atmDeposit);
                                break;

                            case 4:
                                atm.changePin(sc);
                                break;

                            case 5:
                                System.out.println("Thank you for using ATM!");
                                break;

                            default:
                                System.out.println("Invalid ATM choice!");
                        }

                    } while (atmChoice != 5);

                    break;


                case 5:

                    System.out.println("Thank you! Program closed.");
                    break;


                default:

                    System.out.println("Invalid choice! Please try again.");

            }

        } while (choice != 5);

        sc.close();
    }
}


// ==========================================
// 1. STUDENT CLASS
// ==========================================

class Student {

    private String name;
    private int rollNo;
    private int marks;

    public Student(String name, int rollNo, int marks) {

        setName(name);
        setRollNo(rollNo);
        setMarks(marks);
    }

    public void setName(String name) {

        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            this.name = "Unknown";
            System.out.println("Invalid student name!");
        }
    }

    public void setRollNo(int rollNo) {

        if (rollNo > 0) {
            this.rollNo = rollNo;
        } else {
            System.out.println("Invalid roll number!");
        }
    }

    public void setMarks(int marks) {

        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Marks must be between 0 and 100!");
        }
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public int getMarks() {
        return marks;
    }
}


// ==========================================
// 2. EMPLOYEE CLASS
// ==========================================

class Employee {

    private String name;
    private int employeeId;
    private double salary;

    public Employee(String name, int employeeId, double salary) {

        setName(name);
        setEmployeeId(employeeId);

        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary!");
        }
    }

    public void setName(String name) {

        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid employee name!");
        }
    }

    public void setEmployeeId(int employeeId) {

        if (employeeId > 0) {
            this.employeeId = employeeId;
        } else {
            System.out.println("Invalid employee ID!");
        }
    }

    public void increaseSalary(double percentage) {

        if (percentage > 0) {

            salary += salary * percentage / 100;

            System.out.println("Salary increased successfully!");

        } else {
            System.out.println("Invalid increment percentage!");
        }
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }
}


// ==========================================
// 3. BANK ACCOUNT CLASS
// ==========================================

class BankAccount {

    private String accountHolderName;
    private int accountNumber;
    private double balance;

    public BankAccount(String accountHolderName, int accountNumber, double balance) {

        setAccountHolderName(accountHolderName);
        setAccountNumber(accountNumber);

        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid initial balance!");
        }
    }

    public void setAccountHolderName(String accountHolderName) {

        if (accountHolderName != null && !accountHolderName.trim().isEmpty()) {
            this.accountHolderName = accountHolderName;
        } else {
            System.out.println("Invalid account holder name!");
        }
    }

    public void setAccountNumber(int accountNumber) {

        if (accountNumber > 0) {
            this.accountNumber = accountNumber;
        } else {
            System.out.println("Invalid account number!");
        }
    }

    public void deposit(double amount) {

        if (amount > 0) {

            balance += amount;

            System.out.println("Deposit successful!");
            System.out.println("Updated Balance: " + balance);

        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {

        if (amount > 0 && amount <= balance) {

            balance -= amount;

            System.out.println("Withdrawal successful!");
            System.out.println("Remaining Balance: " + balance);

        } else {
            System.out.println("Invalid amount or insufficient balance!");
        }
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}


// ==========================================
// 4. ATM CLASS
// ==========================================

class ATM {

    private String accountHolderName;
    private int pin;
    private double balance;

    public ATM(String accountHolderName, int pin, double balance) {

        if (accountHolderName != null && !accountHolderName.trim().isEmpty()) {
            this.accountHolderName = accountHolderName;
        } else {
            this.accountHolderName = "Unknown";
        }

        if (pin >= 1000 && pin <= 9999) {
            this.pin = pin;
        } else {
            this.pin = 1234;
            System.out.println("Invalid PIN! Default PIN set to 1234.");
        }

        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
            System.out.println("Invalid balance! Balance set to zero.");
        }
    }

    private boolean verifyPin(Scanner sc) {

        while (true) {

            System.out.print("Enter your 4-digit PIN: ");
            int enteredPin = sc.nextInt();

            if (enteredPin == pin) {

                System.out.println("Correct PIN!");
                return true;

            } else {

                System.out.println("Incorrect PIN! Please try again.");

            }
        }
    }

    public void checkBalance(Scanner sc) {

        if (verifyPin(sc)) {

            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Available Balance: " + balance);

        }
    }

    public void withdraw(Scanner sc, double amount) {

        if (verifyPin(sc)) {

            if (amount > 0 && amount <= balance) {

                balance -= amount;

                System.out.println("Withdrawal successful!");
                System.out.println("Remaining Balance: " + balance);

            } else {

                System.out.println("Invalid amount or insufficient balance!");

            }
        }
    }

    public void deposit(Scanner sc, double amount) {

        if (verifyPin(sc)) {

            if (amount > 0) {

                balance += amount;

                System.out.println("Deposit successful!");
                System.out.println("Updated Balance: " + balance);

            } else {

                System.out.println("Invalid deposit amount!");

            }
        }
    }

    public void changePin(Scanner sc) {

        if (verifyPin(sc)) {

            System.out.print("Enter new 4-digit PIN: ");
            int newPin = sc.nextInt();

            if (newPin >= 1000 && newPin <= 9999) {

                pin = newPin;

                System.out.println("PIN changed successfully!");

            } else {

                System.out.println("PIN must contain exactly 4 digits!");

            }
        }
    }
}
