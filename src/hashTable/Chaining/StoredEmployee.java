package src.hashTable.Chaining;


import src.hashTable.linearProbing.Employee;

//we are using a StoredEmployee for linear probing
public class StoredEmployee {
    //this is the raw key
    public String key;
    public Employee employee;

    public StoredEmployee(String key, Employee employee) {
        this.key = key;
        this.employee = employee;
    }

    public StoredEmployee(String key, src.hashTable.Chaining.Employee employee) {

    }
}
