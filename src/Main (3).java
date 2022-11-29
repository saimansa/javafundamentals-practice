public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setId(1);
        employee1.setFirstName("Manasa");
        employee1.setLastName("sai");
        employee1.setTitle("Ms");

        System.out.println(employee1.getMailingName());
        System.out.println(employee1.getMailingName(true));
        System.out.println(employee1.getMailingName(false));

        Department financeDepartment = new Department("Finance" , "Manasa");
        financeDepartment.getManagerName();

        AlternateDepartment personalDetails = new AlternateDepartment("personal" , "Bill");
        personalDetails.managerName();

    }
}