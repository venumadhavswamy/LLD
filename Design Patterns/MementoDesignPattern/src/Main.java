import java.time.LocalDate;
import java.util.Date;

//Consider Main class as Client
public class Main {
    public static void main(String[] args) {
        Person rocky = new Person("rocky","12345", LocalDate.of(2015,1,1),60);
        PersonCareTaker careTaker = new PersonCareTaker();

        rocky.setWeight(62);
        rocky.setLastUpdated(LocalDate.of(2016,1,1));
        PersonMemento memento16 = rocky.createMemento();//memento of 2016
        careTaker.addMemento(memento16);
        System.out.println("2016: "+rocky);

        rocky.setWeight(63);
        rocky.setWeight(65);
        rocky.setLastUpdated(LocalDate.of(2017,1,1));
        PersonMemento memento17 = rocky.createMemento();//memento of 2017
        careTaker.addMemento(memento17);
        System.out.println("2017: "+rocky);

        //KGF Movie started, he gained weight like hell
        rocky.setWeight(80);
        rocky.setLastUpdated(LocalDate.of(2019,1,1));
        PersonMemento memento19 = rocky.createMemento();
        careTaker.addMemento(memento19);
        System.out.println("2019: "+rocky);

        //Restore rocky to the physique of 2017
        PersonMemento memento_17 = careTaker.getMemento(LocalDate.of(2017,1,1));
        rocky.restoreFromMemento(memento_17);
        System.out.println("Restored 2017: "+rocky);

    }
}