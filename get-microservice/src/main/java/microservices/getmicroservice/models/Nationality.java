package microservices.getmicroservice.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Nationality implements Serializable {

    @Id
    protected Long id;

    @NotBlank(message = "Nationality name can not be blank.")
    @Column
    private String nationalityName;

    @NotBlank(message = "Nationality abbreviation can not be blank.")
    @Column
    private String abbreviation;

    @OneToMany(mappedBy="nationality")
    @JsonIgnore
    private List<Player> players;
}
