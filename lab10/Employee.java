package lab10;


public class Employee{
    //---------------------Task 1--------------------------
    String name ;
    int ssn ;
    int id;
    String department;
    String email;
    int year;
    int salary;

    public Employee(String name, int ssn, int id, String department, String email, int year, int salary) {
        this.name = name;
        this.ssn = ssn;
        this.id = id;
        this.department = department;
        this.email = email;
        this.year = year;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

public String toString(){
    return String.format (" Name: %s,  ssn: %d, ID:%d, email: %s salary: %d " , name, ssn , id, email,salary);
}
                      //---------------------Task 2--------------------------

                      
  //----------------------------------------------------------
  //1- insertion sort for salary
  // Employee : (A,8020),(S,9090),(A,8070),(I,9300),(K,8050),(M,8000)
  // Sorted list (A,8020),(),(),(),(),()
  public static void sortBySalary(Employee [] employees){

    for (int i = 1; i < employees.length; ++i) { 
        Employee emp1 = employees[i];
        int key = employees[i].getSalary(); 
        int j = i ; 

        while (j > 0 && employees[j-1].getSalary() > key) { 
            employees[j] = employees[j-1]; 
            j --; 
        } 
        employees[j] = emp1; 
       
    } 
}
//----------------------------------------------------------
//2- quick sorT for id
public static void sortById(Employee []employees, int start , int end){
     if (start >= end ){
         return;}

         int left = start;
         int right = end-1;
         Employee pivot = employees[end];
       
         while (left<=right){
            while (left <= right && employees[left].getId()< pivot.getId()){
                left++;
            }
            while (left <= right && employees[right].getId()> pivot.getId()){
                right--;
            }
            if (left <= right){
                Employee temp = employees[right];
                employees[right]=employees[left];
                employees[left]=temp;
                left++;
                right--;
            }
         }
         employees[end]=employees[left];
         employees[left]=pivot;

         sortById(employees,start, left-1);
         sortById(employees, left+1, end);
}

//----------------------------------------------------------
//3- binary search for id
public static void	PrintEmployee(Employee[] employees, int low , int high, int emp_id) {
    if (low <=  high) { 
        int mid = (low + high) / 2; 

        // If the element is present at the 
        // middle itself 
        if (employees[mid].getId() == emp_id) {
        System.out.println (employees[mid]);
        }

        // If element is smaller than mid, then 
        // it can only be present in left subarray 
        if (employees[mid].getId() > emp_id) 
         PrintEmployee(employees, low, mid - 1, emp_id); 

        // Else the element can only be present 
        // in right subarray  

         PrintEmployee(employees, mid + 1, high, emp_id); 
    } 
return;
}
    

}