public class Person{
// prepare a Person Data With Getters and Setters,Constructor,ToString and Override HashCode & Equals Methods in it
private String name;
private int id;
private int sal;
private String desg;
public String getName() {
    return name;
}
@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + id;
    result = prime * result + sal;
    result = prime * result + ((desg == null) ? 0 : desg.hashCode());
    return result;
}
@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Person other = (Person) obj;
    if (name == null) {
        if (other.name != null)
            return false;
    } else if (!name.equals(other.name))
        return false;
    if (id != other.id)
        return false;
    if (sal != other.sal)
        return false;
    if (desg == null) {
        if (other.desg != null)
            return false;
    } else if (!desg.equals(other.desg))
        return false;
    return true;
}
public void setName(String name) {
    this.name = name;
}
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public int getSal() {
    return sal;
}
public void setSal(int sal) {
    this.sal = sal;
}
public String getDesg() {
    return desg;
}
@Override
public String toString() {
    return "Person [name=" + name + ", id=" + id + ", sal=" + sal + ", desg=" + desg + "]";
}
public void setDesg(String desg) {
    this.desg = desg;
}
public Person(String name, int id, int sal, String desg) {
    this.name = name;
    this.id = id;
    this.sal = sal;
    this.desg = desg;
}
}
