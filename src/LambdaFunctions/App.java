package LambdaFunctions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class Addition{
    public Integer rechne(Integer a, Integer b){
      return a+b;
    }

}
@FunctionalInterface
interface  LambdaMathe{
    Integer rechne(Integer x, Integer z);

}
@FunctionalInterface
interface  Test{
    void info();
}
public class App {

    public static void main(String[] args) {
        Object zahl = 4711;
        Object str = "Hallo";
        var str2="Pause";

        Addition obj= new Addition();
        System.out.println(obj.rechne(4,6));
        System.out.println(new Addition().rechne(5,9));
        Integer a = 4 ,b=23;
        LambdaMathe  r= (m,n)->m+n;
        System.out.println(r.rechne(a,b));
        r= (m,h)->m-h;
        System.out.println(r.rechne(a,b));
        r= (m,n)->m*n;
        System.out.println(r.rechne(a,b));
        //Object fn (e,z)->z+e;
        //System.out.println((k,l)->k+l);
        Test t =()-> System.out.println("Pause");
        t.info();
        List<Integer> lstInt = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            lstInt.add(i);
        }
        lstInt.forEach((bb)-> System.out.println(bb));
        lstInt.forEach(System.out::println);
        Consumer<Integer> cs = (ac)-> System.out.println("Der Wert ist " + ac);
        lstInt.forEach(cs);

    }
}
