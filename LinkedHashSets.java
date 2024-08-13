import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSets{
public static void main(String[]args){
  // Preapre LinkedHashSets Object and Load Person Objects in it and iterate it using Iterator and While Loop
LinkedHashSet<Person> h=new LinkedHashSet<>();
h.add(new Person("sai",23,3455,"dev"));
h.add(new Person("Fayaz", 21, 1234, "hr"));
h.add(new Person("karthik", 034,4321, "manager"));
Iterator<Person> i=h.iterator();
while(i.hasNext()){
System.out.println(i.next());
}
}
}
