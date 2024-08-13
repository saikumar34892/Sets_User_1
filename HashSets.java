import java.util.HashSet;

public class HashSets{
// Prepare Hashset object here and add person class objects in them iterate it by using for each
public static void main(String[] args) {
    

HashSet<Person> h=new HashSet<>();
h.add(new Person("sai",23,3455,"dev"));
h.add(new Person("Fayaz", 21, 1234, "hr"));
h.add(new Person("karthik", 034,4321, "manager"));
for (Person person : h) {
    System.out.println(person);
    
}

}
}