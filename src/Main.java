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

        ExpenseClaim expenseClaim1 = new ExpenseClaim(12 , 4455 , "2022-11-02", 30.12);
        System.out.println(expenseClaim1.getDateOfClaim());
        System.out.println(expenseClaim1.getId());
        System.out.println(expenseClaim1.getEmployeeId());
       expenseClaim1.setPaid(true);

        ExpenseItem expenseItem = new ExpenseItem(2 , 2234 , "hotel" , "the grand hotel of hilton" , 250);
        System.out.println(expenseItem.getDescription());


    }
}