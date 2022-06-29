public class EmployeeMain {
    public static void main(String[] args){
        // obje oluşturma
        Employee employee = new Employee();
        /* Employee employee2 = employee; */ // yeni bir referansı diğer refaransın saklandığı veriye yönlendirebiliyorum.

        employee.id = 1;
        employee.name = "Oğuzhan Bahadır";
        employee.email= "oguzhanbbayram@gmail.com";

        /*System.out.println("Employee Name1:" + employee.name);
        System.out.println("Name:" + employee2.name); */

        employee.showInfos();

    }
}
