package employee;

import java.util.Scanner;

public class TruongPhong extends Employee {
    private double trachNghiem;

    public TruongPhong() {
    }

    public TruongPhong(String newId, String newName, double newSalary, double newTrachNghiem) {
        super(newId, newName, newSalary);
        this.trachNghiem = newTrachNghiem;
    }

    public double getTrachNghiem() {
        return trachNghiem;
    }

    public void setTrachNghiem(double trachNghiem) {
        this.trachNghiem = trachNghiem;
    }
    @Override
    public void nhapThongTin(){
        Scanner scanner = new Scanner(System.in);
        super.nhapThongTin();
        System.out.println("luong trach nghiem : ");
       this.trachNghiem = scanner.nextDouble();
       scanner.nextLine();
    }
    @Override
    public void xuatThongTin(){
        super.xuatThongTin();
        System.out.println("luong trach nghiem : "+trachNghiem);
    }
    public double getThuNhap(){
        return super.getSalary() + this.trachNghiem;
    }

}
