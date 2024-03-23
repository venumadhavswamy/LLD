import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

//Caretaker - responsible for managing and storing the history of mementos
public class PersonCareTaker {
    private ArrayList<PersonMemento> personMementos;
    PersonCareTaker(){
        this.personMementos = new ArrayList<>();
    }
    public void addMemento(PersonMemento personMemento){
        personMementos.add(personMemento);
    }
    public void getMemento(int index){
        personMementos.get(index);
    }
    public PersonMemento getMemento(LocalDate lastUpdated){
        Optional<PersonMemento> personMementoOptional = personMementos.stream().
                filter((memento)->memento.getLastUpdated().equals(lastUpdated))
                .findFirst();
        return personMementoOptional.get();
    }
}
