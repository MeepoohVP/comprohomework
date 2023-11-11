package work02;
import work01.Utilitor;

public class Person {
    private static int nextId = 1;
    private final int id;
    private String firstname, lastname;
    public Person(String firstname, String lastname){
        this.firstname = Utilitor.testString(firstname);
        this.lastname = Utilitor.testString(lastname);
        this.id = this.nextId;
        nextId++;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        if (!Utilitor.testString(firstname).equals(firstname)) Utilitor.testString(firstname);
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        if (!Utilitor.testString(lastname).equals(lastname)) Utilitor.testString(lastname);
        this.lastname = lastname;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        return false;
    }



    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person(");
        sb.append(id);
        sb.append(",").append(firstname);
        sb.append(",").append(lastname);
        sb.append(')');
        return sb.toString();
    }
}
