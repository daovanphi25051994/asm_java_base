package employee;

import java.util.Scanner;

public class TiepThi extends Employee {
    private double doanhSo;
    private double hoaHong;

    public TiepThi(){

    }
    public TiepThi(String newId, String newName, double newSalary, double newDoanhSo, double newHoaHong){
        super(newId, newName, newSalary);
        this.doanhSo = newDoanhSo;
        this.hoaHong = newHoaHong;
    }

    public double getDoanhSo() {
        return doanhSo;
    }

    public double getHoaHong() {
        return hoaHong;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public void setHoaHong(double hoaHong) {
        this.hoaHong = hoaHong;
    }
    @Override
    public void nhapThongTin(){
        Scanner scanner = new Scanner(System.in);
        super.nhapThongTin();
        System.out.println("doanh so : ");
        this.doanhSo = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("hoa hong : ");
        this.hoaHong = scanner.nextDouble();
        scanner.nextLine();
    }
    @Override
    public void xuatThongTin(){
        super.xuatThongTin();
        System.out.println("doanh so : " + doanhSo);
        System.out.println("hoa hong : " + hoaHong);
    }
    @Override
    public double getThuNhap(){
        return super.getSalary() + (doanhSo * hoaHong);
    }
}
