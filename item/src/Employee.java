/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ayanda
 */
public class Employee {
   private String name;
   private String empID;
   private String address;
   public Employee(){
       String name = "";
       String empID = "";
       String address = "";
       
   }
   public Employee (String name,String empID,String address){
       this.name = name;
       this.empID = empID;
       this.address = address;
   }
   public String getname(){
       return name;
   }
   public void setname(String name){
       this.name = name;
   }
   public String getempID(){
       return empID;
   }
   public void setempID(String empID){
       this.empID = empID;
   }
   public String getaddress(){
       return address;
   }
   public void setaddress(String address){
       this.address = address;
   }

    /**
     *
     * @param hours
     * @return
     */
    public double calcSalary(int hours){
        double salary = 0;
        if (hours <= 40)
                salary = 2000;
        if (hours > 40)
                salary = 2000+(10/100*salary);
        
     
       return 0;
     
   }
   public String toString(String name,String empID,String address){
       
   }
}
