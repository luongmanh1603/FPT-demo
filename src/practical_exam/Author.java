package practical_exam;

public class Author {
    String firstName;
    String lastName;
    public Author(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Author() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String toString(){
        System.out.println("Author's name: "+ firstName +  lastName);

        return null;
    }
}
