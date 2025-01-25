package jan25;

/*
create a Box<T,R> class which
        length
                width

                create object of it.
*/

public class Employee<T,R> {
    T name;
    R salary;

    public Employee(T name, R salary) {
        this.name = name;
        this.salary = salary;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public R getEmail() {
        return salary;
    }

    public void setEmail(R email) {
        this.salary = salary;
    }
}
