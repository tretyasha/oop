package notebook.model;

public class User {
    private Long id;
    private String firstName;
    private String lastName;
    private String phone;

    public User(String firstName, String lastName, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    public User(Long id, String firstName, String lastName, String phone) {
        this(firstName, lastName, phone);
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override // Изменил формат вывода информации в консоль  
    public String toString() {
        return String.format("User id: %s\nName: %s\nLast name: %s\nPhone number: %s\n--------------", 
        id, firstName, lastName, phone);
    }
}
