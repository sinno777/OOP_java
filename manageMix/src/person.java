import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class person {
    protected String name = "";
    protected String address = "";
    protected String id = "";
    protected String email = "";

    // get and set method
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // constructor
    public person() {

    }

    public person(String name, String address, String id, String email) {
        this.name = name;
        this.address = address;
        this.id = id;
        this.email = email;
    }

    // input and output method

    public void im(Scanner scan) {
        System.out.println("Name: ");
        this.name = scan.nextLine();
        System.out.println("Address: ");
        this.address = scan.nextLine();
        System.out.println("Email: ");
        this.email = scan.nextLine();
    }

    public void ex() {
        System.out.println("Name: " + this.name + "\tAddress: " + this.address + "\tEmail: " + this.email);
    }

    // business method

}
