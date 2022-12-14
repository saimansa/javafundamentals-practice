public class ExpenseClaim {
    private int id;
    private int employeeId;
    private String dateOfClaim;
    private double totalAmount;
    private boolean approved;
    private boolean paid;

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public void setPaid(boolean paid) {
        if (paid && !approved) {
            System.out.println("this item cannot be paid as it is not approved");
    }
        else{
            this.paid = paid;
        }

    }
    public ExpenseClaim(int id, int employeeId, String dateOfClaim, double totalAmount) {
        this.id = id;
        this.employeeId = employeeId;
        this.dateOfClaim = dateOfClaim;
        this.totalAmount = totalAmount;
        this.paid = false;
        this.approved = false;
    }

    public int getId() {
        return id;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getDateOfClaim() {
        return dateOfClaim;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public boolean isApproved() {
        return approved;
    }

    public boolean isPaid() {
        return paid;
    }
}
