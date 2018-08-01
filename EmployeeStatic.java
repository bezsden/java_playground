public class EmployeeStatic{
    // salary(зарплата) переменная private static
    private static double salary;

    // DEPARTMENT(отдел) — это константа
    public static final String DEPARTMENT = "Разработка ";

    public static void main(String args[]){
        salary = 1000;

        System.out.println(DEPARTMENT+"средняя зарплата: "+salary);
    }
}