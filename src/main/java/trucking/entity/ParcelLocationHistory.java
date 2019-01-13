package trucking.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class ParcelLocationHistory {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    private List<ParcelLocationNode> locationNodes;

    public ParcelLocationHistory(){}

}
