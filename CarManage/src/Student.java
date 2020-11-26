
// ��������� Java ��� �����������  
// ��������� ���������. 
import java.util.*; 
  
// student class 
class Student  
{ 
    String name; 
    int id ; 
    String dept; 
      
    Student(String name, int id, String dept)  
    { 
          
        this.name = name; 
        this.id = id; 
        this.dept = dept; 
          
    } 
} 
  
/* ����� Department �������� ������ �������� ������ Student.
�� ������ � ������� Student ����� ���� ������� 
*/
class Department  
{ 
      
    String name; 
    private ArrayList<Student> students; 
    Department(String name, ArrayList<Student> students)  
    { 
          
        this.name = name; 
        this.students = students; 
          
    } 
      
    public ArrayList<Student> getStudents()  
    { 
        return students; 
    } 
} 
  
/* ����� Institute �������� ������ �������� Department.
 *  �� ������ � �������   Department 
����� ���� �������.*/
class Institute  
{ 
      
    String instituteName; 
    private ArrayList<Department> departments; 
      
    Institute(String instituteName, ArrayList<Department> departments) 
    { 
        this.instituteName = instituteName; 
        this.departments = (ArrayList<Department>) departments; 
    } 
      
    // ����� ���������� ��������� ���� ������������� 
    // � ������ ���������  
    public int getTotalStudentsInInstitute() 
    { 
        int noOfStudents = 0; 
        ArrayList<Student> students;  
        for(Department dept : departments) 
        { 
            students = dept.getStudents(); 
            for(Student s : students) 
            { 
                System.out.println(s.name+" "+ s.dept);
            	noOfStudents++; 
            } 
        } 
        return noOfStudents; 
    } 
      
}  
  
// ����� main  
class Test 
{ 
    public static void main (String[] args)  
    { 
        Student s1 = new Student("Ivanov", 1, "CSE"); 
        Student s2 = new Student("Petrov", 2, "CSE"); 
        Student s3 = new Student("Sidoroff", 1, "EE"); 
        Student s4 = new Student("Vasiliev", 2, "EE"); 
      
        // �������� ������ ArrayList ��������� CSE . 
        ArrayList <Student> cse_students = new ArrayList<Student>(); 
        cse_students.add(s1); 
        cse_students.add(s2); 
          
        // �������� ������ ArrayList ��������� EE  
        ArrayList <Student> ee_students = new ArrayList<Student>(); 
        ee_students.add(s3); 
        ee_students.add(s4); 
          
        Department CSE = new Department("CSE", cse_students); 
        Department EE = new Department("EE", ee_students); 
          
        ArrayList <Department> departments = new ArrayList<Department>(); 
        departments.add(CSE); 
        departments.add(EE); 
          
        // creating an instance of Institute. 
        Institute institute = new Institute("University ITMO", departments); 
        System.out.println("List students in institute of "+ institute.instituteName);   
        System.out.print(institute.getTotalStudentsInInstitute()); 
        System.out.print(" - Total students in institute"); 
        
    } 
} 
