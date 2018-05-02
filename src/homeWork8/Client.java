package homeWork8;

public class Client extends Person {
    private String pass;

    public Client() {
        super();
        this.pass = "noPass";
    }

    public Client(String name, String surname, String number, String pass) {
        super(name, surname, number);
        this.pass = pass;
    }



    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return super.toString()+"," + pass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Client client = (Client) o;

        return pass != null ? pass.equals(client.pass) : client.pass == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (pass != null ? pass.hashCode() : 0);
        return result;
    }
}
