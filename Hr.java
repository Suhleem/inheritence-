
package vu.hr;


public class Hr {
//Fields
    public String name;
    public int age;
    public String role;
    
    //Constructor
    public Hr(String name,int age,String role){
        this.name = name;
        this.age = age;
        this.role = role;
    }
    //Method of displaying Hr details
    public void showDetails(){
        System.out.println(name + " is our Employee aged "+age+ " years old " + " works as " +role);
    }
}
//sub-class: admin class
class admin extends Hr{
    String dept;
    String adminID;
    
    //Constructor for admin class
    public admin(String name,int age,String role,String dept,String adminID){
        super(name,age,role);//parameters extended from upper class
        this.dept = dept;
        this.adminID = adminID;
    }
    @Override
    public void showDetails(){
        super.showDetails();
        System.out.println("The admin works in " +dept+ " department with an ID of "+adminID);
    }
}
 //sub-class: nonAdmin class
class nonAdmin extends Hr{
    String salary;
    String nonAdminID;
    
    //Constructor for admin class
    public nonAdmin(String name,int age,String role,String salary,String nonAdminID){
        super(name,age,role);//parameters extended from upper class
        this.salary = salary;
        this.nonAdminID = nonAdminID;
    }
    @Override
    public void showDetails(){
        super.showDetails();
        System.out.println("The NonAdmin earns UGX " +salary+ " with an ID of "+nonAdminID);
    }
}

