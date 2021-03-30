package soze.rx204;

import io.reactivex.Observable;

public class App 
{
    public static void main( String[] args )
    {
        Observable.fromIterable(Person.gerList())
        .filter(person -> person.sex.equals(Person.SEX.FEMALE))
        .sorted()
        .subscribe(person -> System.out.println(person.name + ", " + person.age + ", " + person.sex),
                    Throwable::printStackTrace,
                    () -> System.out.println("Emittion complete"));
    }
}
