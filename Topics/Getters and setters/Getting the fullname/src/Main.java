
class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        // write your code here
        if (firstName == null || firstName.equals("")) {
            return;
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        // write your code here
        if (lastName == null || lastName.equals("")) {
            return;
        }
        this.lastName = lastName;

    }

    public String getFullName() {
        if (firstName == null) {
            return lastName;
        } else if (lastName == null) {
            return firstName;
        } else if (firstName == null && lastName == null || firstName.equals("")  && lastName.equals("")) {
            return "Unknown";
        } else {
            return firstName + " " + lastName; // write your code here
        }
    }
}
