public class College {
    public String Name;
    public Address addr;

    public College(String name, Address addr) {
        Name = name;
        this.addr = addr;
    }
    public void displaycol(Address addr)
    {
        System.out.println(Name+"\t\t"+addr.streetnum+"\t\t"+addr.city+"\t\t"+addr.state+"\t\t"+addr.country);
    }
}
