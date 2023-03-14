import java.util.Objects;

public class Customer {

    private String name;

    private Status status;

    public Customer(String name, Status status2) {
        this.name = name;
        this.status = status2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus2() {
        return status;
    }

    public void setStatus2(Status status2) {
        this.status = status2;
    }


    /*Override == Sobreescribir
    * Sirve para sobreescribir un comportamiento ya establecido en otro clase*/

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", status=" + status +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(name, customer.name) && status == customer.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, status);
    }
}
