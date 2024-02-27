import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.UUID;

public abstract class IDisplay {
    private UUID uuid;
    abstract void displayData();
    IDisplay(){
        this.uuid = UUID.randomUUID();
    }

    @Override
    public boolean equals(Object obj) {
        IDisplay displayObj = (IDisplay) obj;
        return this.uuid.equals(displayObj.uuid);
    }
}
