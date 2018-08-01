
public class DemoJuice {
    public static void main(String args[]){
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
        System.out.println("Размер: " + juice.size);


        Employee empOne = new Employee("Олег");
        empOne.setSalary(1000);
        empOne.printEmp();
        System.out.println(empOne.name);
    }
}
