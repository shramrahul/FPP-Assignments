package prob1;

import java.util.Arrays;

class Person {
    private final int INITIAL_LENGTH = 2;
    private Person [] persons;
    private String lastName;
    private String firstName;
    private int age;
    private int size;
    // --------------------------------------------------------------
    public Person(String last, String first, int a) { // constructor
        lastName = last;
        firstName = first;
        age = a;
    }

    public Person(){
        persons=new Person[INITIAL_LENGTH];
        size=0;
    }
    // --------------------------------------------------------------
    public String getLast() // get last name
    {
        return lastName;
    }

    public String getFirst() // get last name
    {
        return firstName;
    }

    @Override
    public String toString() {
        StringBuilder sb= new StringBuilder();
        for(Person p:persons){
            sb.append(p+", ");
        }

           return sb.toString();

    }


    public String getName(String key){
        for (Person p:persons) {
            if (key.equalsIgnoreCase(p.getLast()))return p.getFirst()+" "+p.getLast()+" "+p.age;
        }
       return null;
    }

    public void add(Person s){
        if(size == persons.length) resize();
        persons[size++] = s;
    }

    private void resize(){
        System.out.println("resizing"+persons.length);
        int len = persons.length;
        int newlen = 2*len;
        Person[] temp = new Person[newlen];
        System.arraycopy(persons,0,temp,0,len);
        persons = temp;
    }

    public static void main(String [] args){
        Person persons=new Person();
        persons.add(new Person("Shreeram","Chaulagain",24));
        persons.add(new Person("Sima","Chand",26));
        persons.add(new Person("Paul","tony",32));
        persons.add(new Person("harry","paul",32));
        persons.add(new Person("Tony","clarke",32));
        persons.add(new Person("pari","pari",32));

       System.out.println(persons.getName("Sima"));
        System.out.println(persons.getName("shreeram"));
        System.out.println(persons.getName("sima").toString());
        System.out.println(".............................");
      // System.out.println(persons);
    }
}