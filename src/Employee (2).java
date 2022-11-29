public class Employee {

    private int id;
    private String title;
    private String firstName;
    private String lastName;
    private String jobTitle;
    private String department;

    public Employee(){

    }

    public Employee(int id, String jobTitle){
        this.id = id;
        this.jobTitle = jobTitle;
    }

    public Employee(int id, String title, String firstName, String lastName, String jobTitle, String department) {
        this.id = id;
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
        this.department = department;
    }
//method overloading - one method with no parameters and with parameters
    public String getMailingName(){
        return title + " " + firstName + " " + lastName;
    }

    public String getMailingName(boolean firstInitialOnly){
        if(firstInitialOnly){
            return title + " " + firstName.substring(0,1) + " " + lastName;
        }
        else{
            return title + " " + lastName;

        }
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() < 2) {
            System.out.println("error --- first name characters must be greater than 2");
        } else {
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
