import java.io.Serializable;

interface Abteilung {
   final  String abteilung="EDV";// Nur konstanten
  abstract String getAbteilung();

 }

 abstract class  Mitarbeiter implements Abteilung, Serializable, Cloneable ,Comparable{
    static Integer perNr =1000;
    Integer personalNr;
    String name;
    Mitarbeiter(){
        this.personalNr=Mitarbeiter.perNr;
        ++perNr;
    }
    void einstellung(){ }

}
class Azubi extends Mitarbeiter{


    @Override
    public String getAbteilung() {
        return null;
    }




    @Override
     public int compareTo(Object o) {
        return 0;
    }
}
class Chef extends Mitarbeiter{

    @Override
    void einstellung() {

    }

    @Override
    public String getAbteilung() {
        return null;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

public class Main {


    public static void main(String[] args) {
	    // Abstrakte Klasse versus Interface
       // Mitarbeiter m = new Mitarbeiter();
        Chef c = new Chef();
        System.out.println("Chef " + c.personalNr);
        Azubi a= new Azubi();
        System.out.println("Azubi " + a.personalNr);
    }
}
