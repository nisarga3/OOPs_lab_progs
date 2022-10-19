public class Student {
    public String USN,Name;
    Address addr;

    public Student(String USN, String name, Address addr) {
        this.USN = USN;
        Name = name;
        this.addr = addr;
    }
    public void displaystud(Address addr)
    {
        System.out.println(USN+"\t\t"+Name+"\t\t"+addr.streetnum+"\t\t"+addr.city+"\t\t"+addr.state+"\t\t"+addr.country);
    }
}
