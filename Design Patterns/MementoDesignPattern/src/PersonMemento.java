import java.time.LocalDate;
import java.util.Date;

/*
-> Memento Class - stores the snapshot of the originator at a particular point of time
-> Data of memento should not be modifiable, but can only be retrieved
*/
public class PersonMemento {
    private LocalDate lastUpdated;
    private Integer weight;
    public PersonMemento(LocalDate lastUpdated,Integer weight){
        this.lastUpdated = lastUpdated;
        this.weight = weight;
    }
    public LocalDate getLastUpdated(){
        return lastUpdated;
    }
    public Integer getWeight(){
        return weight;
    }
}
