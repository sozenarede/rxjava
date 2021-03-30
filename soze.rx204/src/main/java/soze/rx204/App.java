package soze.rx204;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import io.reactivex.Observable;

/**
 * Hello world!
 *
 */

import io.reactivex.observers.DefaultObserver;

public class App 
{
    public static void main( String[] args )
    {
        //Observable<String> helloWorldObservable = Observable.just("Opa Soze");

        /*
        *   Sobrescrição sem função lambida 
        */
        /*
        helloWorldObservable.subscribe(new DefaultObserver<String>()
        {
            @Override
            public void onNext(String s)
            {
                System.out.println(s);
            }
            @Override
            public void onError(Throwable e)
            {
                // TODO 
                e.printStackTrace();
            }
            @Override
            public void onComplete() {
                // TODO Auto-generated method stub
                System.out.println("Final do observável!");
            }
        });
        */

        /*
        *   Sobrescrição com função lambida 
        */
        /*
        helloWorldObservable.subscribe(s ->  System.out.println(s),
                                       throwable -> throwable.printStackTrace(),
                                       () -> System.out.println("Fim da transmissão!!!"));
       */

        /*
        String strings[] = new String[]{"Opa", "Soze"};
        Observable.fromArray(strings).subscribe(s ->  System.out.println(s),
                                                throwable -> throwable.printStackTrace(),
                                                () -> System.out.println("Fim da transmissão!!!"));
        */

        List<Integer> intergerList = Arrays.asList(54,12,10,78,69,33,66,99,84);

        Observable.fromIterable(intergerList)
          .filter(i -> i % 2 == 0)
          .sorted()
          .subscribe(i -> System.out.println(i),
                     throwable -> throwable.printStackTrace(),
                     () -> System.out.println("Emittion completes"));
    }
}
