package randomerror;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Banana {

    @Id
    @GeneratedValue
    private long id;
    private int weight;
    private String name;
}
