public class Employee {
    private String name;
    private String email = "не задан";
    private int phone;

    public Employee (String name, int phone){
        this.name = name;
        this.phone = phone;
    }

    public Employee (String name, String email){
        this.name = name;
        this.email = email;
    }

    public Employee (String name, int phone, String email){
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public void printInfo(){
        System.out.printf("Nмя: %s\nE-mail: %s\nТелефон: %d\n", name, email, phone);
    }
}
