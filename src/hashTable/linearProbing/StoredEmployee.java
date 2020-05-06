package src.hashTable.linearProbing;


//we are using a StoredEmployee for linear probing
public class StoredEmployee {
    //this is the raw key
    public String key;
    public Employee employee;

    public StoredEmployee(String key, Employee employee) {
        this.key = key;
        this.employee = employee;
    }
}
