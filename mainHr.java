
package vu.hr;


public class mainHr {
    //Main Method
    public static void main(String[]args){
        admin qa = new admin("Salim Ahmed " ,29,"Asst QA","QA and Compliance","suhleem@gmail.com");
        System.out.println("Admin Details");
        System.out.println("_______________________");
        qa.showDetails();
        
        nonAdmin qb = new nonAdmin("Zurah Malkan ",32,"Chief Operation Officer"," 2,500,000 ","malkan@gmail.com");
        System.out.println("nonAdmin Details");
        System.out.println("_______________________");
        qb.showDetails();
    }
}
