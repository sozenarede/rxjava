package soze.rx204;

import java.util.ArrayList;
import java.util.List;

public class Person implements Comparable<Person> {
    enum SEX {
        MALE, FEMALE, SHE_MALE
    }

    String name;
    int age;
    SEX sex;

    Person(String name, int age, SEX sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public int compareTo(Person o) {
        if (o.sex.equals(SEX.FEMALE)) {
            return 0;
        }
        else {
            return 1;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return this.sex.equals(SEX.FEMALE);
        }
        else {
            return false;
        }
    }

    @Override
    public int hashCode() {
      return 0;
    }
  

    public static List<Person> gerList() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Jose Soares Junior", 46, Person.SEX.MALE));
        personList.add(new Person("Marcia Dias Soares", 43, Person.SEX.FEMALE));
        personList.add(new Person("Sofia Dias Soares", 12, Person.SEX.FEMALE));
        return personList;

    }
}
