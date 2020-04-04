package employee;

import java.util.*;


public class ListEmployee {
    static ArrayList<Employee> listEmployee = new ArrayList<>();

    public ListEmployee() {
    }

    public void nhapThongTin(){
        Scanner scanner = new Scanner(System.in);
        String check;
        do {
            Employee employee = new Employee();
            employee.nhapThongTin();
            listEmployee.add(employee);
            System.out.println("co muon nhap nua khong ? Y/N");
            check = scanner.nextLine();
        }while(check.equals("y"));
    }
    public void xuatThongTin() {
        for (Employee nv : listEmployee) {
            nv.xuatThongTin();
        }
    }
    public void timNhanVien(double luong){
        for (int i = 0; i < listEmployee.size(); i++){
           // if (listEmployee.get(i).getId().equals(id)){
                //listEmployee.get(i).xuatThongTin();
                //listEmployee.remove(i);
//                Scanner scanner = new Scanner(System.in);
//                System.out.println("nhap id :");
//                String id = scanner.nextLine();
//                listEmployee.get(i).setId(id);
//                System.out.println("nhap name :");
//                String name = scanner.nextLine();
//                listEmployee.get(i).setName(name);
                if (listEmployee.get(i).getSalary() > luong){
                    listEmployee.get(i).xuatThongTin();
                }
            }
        }
       public void sortEmployeeBySalary(){
           Collections.sort(listEmployee, new Comparator<Employee>() {
               @Override
               public int compare(Employee employee1, Employee employee2) {
                   if (employee1.getSalary() < employee2.getSalary()) {
                       return 1;
                   } else {
                       if (employee1.getSalary() == employee2.getSalary()) {
                           return 0;
                       } else {
                           return -1;
                       }
                   }
               }
           });
       }
       public void sortEmployeeByName(){
        Collections.sort(listEmployee, new Comparator<Employee>() {
            @Override
            public int compare(Employee employee1, Employee employee2) {
                return employee1.getName().compareTo(employee2.getName());
            }
        });
       }

       public void getFiveEmployeesBySalary(){
        sortEmployeeBySalary();
        for (int i = 0; i < 5; i++){
            listEmployee.get(i).xuatThongTin();
        }
       }
    }

