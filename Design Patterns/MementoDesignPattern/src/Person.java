import java.time.LocalDate;
import java.util.Date;

//Originator - responsible for creating and managing the state of a memento
public class Person {
    private String name;
    private String aadhar;
    private LocalDate lastUpdated;
    private Integer weight;

    Person(String name,String aadhar,LocalDate lastUpdated,Integer weight){
        this.name = name;
        this.aadhar = aadhar;
        this.lastUpdated = lastUpdated;
        this.weight = weight;
    }

    public PersonMemento createMemento(){
        PersonMemento currentPersonMemento = new PersonMemento(lastUpdated,weight);
        return currentPersonMemento;
    }

    //Restore data from a particular memento(snapshot)
    public void restoreFromMemento(PersonMemento memento){
        this.lastUpdated = memento.getLastUpdated();
        this.weight = memento.getWeight();
    }

    public void setWeight(Integer weight){
        this.weight = weight;
    }

    public void setLastUpdated(LocalDate lastUpdated){
        this.lastUpdated = lastUpdated;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", aadhar='" + aadhar + '\'' +
                ", lastUpdated=" + lastUpdated +
                ", weight=" + weight +
                '}';
    }
}
