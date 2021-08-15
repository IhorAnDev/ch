package Work.Inheritanse;

import java.util.Objects;

public class British extends Cat {
    private String name;

    public British(int age, String owner, String name) {
        super(age, owner);
        this.name = name;
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat name: " + name + " Age: " + getAge() + " Owner: " + getOwner();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        British british = (British) o;
        return name.equals(british.name);
    }

}
