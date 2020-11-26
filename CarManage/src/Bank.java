
// ����� Bank 
class Bank  
{ 
    private String name; 
      
    // ��� ����� 
    Bank(String name) 
    { 
        this.name = name; 
    } 
      
    public String getBankName() 
    { 
        return this.name; 
    } 
}  
  
// ����� Employee 
class Employee 
{ 
    private String name; 
      
    // ��� employee 
    Employee(String name)  
    { 
        this.name = name; 
    } 
      
    public String getEmployeeName() 
    { 
        return this.name; 
    }  
} 
  
// ����������  ����� ����� ��������  
// � ������ main 
class Association  
{ 
    public static void main (String[] args)  
    { 
        Bank bank = new Bank("Axis"); 
        Employee emp = new Employee("Ivanov"); 
          
        System.out.println(emp.getEmployeeName() +  
               " is employee of " + bank.getBankName()); 
    } 
}
