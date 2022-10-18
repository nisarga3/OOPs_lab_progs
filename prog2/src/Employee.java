public class Employee {
    public String EmpID, Name;
    Address addr;

    public Employee(String empID, String name, Address addr) {
        EmpID = empID;
        Name = name;
        this.addr = addr;
    }
    public void displayemp(Address addr)
    {
        System.out.println(EmpID+"\t\t"+Name+"\t\t"+addr.streetnum+"\t\t"+addr.city+"\t\t"+addr.state+"\t\t"+addr.country);
    }
}
