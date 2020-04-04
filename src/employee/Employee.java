package employee;

import java.util.Scanner;

public class Employee {
    private String id;
    private String name;
    private double salary;

    public Employee(){

    }
    public Employee(String newId, String newName, double newSalary){
        this.id = newId;
        this.name = newName;
        this.salary = newSalary;
    }
    public String getId(){
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public double getSalary() {
        return this.salary;
    }
    public void setName(String newName) {
        this.name = newName;
    }
    public void setSalary(double newSalary) {
        this.salary = newSalary;
    }
    public void setId(String newId){
        this.id = newId;
    }

    public double getThuNhap(){
        return salary;
    }
    public double getThueTN(){
        if (getThuNhap() < 9000000){
            return 0;
        }else if (getThuNhap() < 15000000){
            return getThuNhap() * 0.1;
        }else {
            return getThuNhap() * 0.12;
        }
    }
    public void nhapThongTin(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id : ");
        this.id = scanner.nextLine();
        System.out.println("Nhap name : ");
        this.name = scanner.nextLine();
        System.out.println("Nhap salary : ");
        this.salary = scanner.nextDouble();
        scanner.nextLine();
    }
    public void xuatThongTin(){
        System.out.println("id : "+id);
        System.out.println("name : "+name);
        System.out.println("salary : "+salary);
    }
}
