package microservices.deletemicroservice.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class League implements Serializable {

    @Id
    private Long id;

    @NotBlank(message = "Team name can not be blank.")
    @Column
    private String leagueName;

    @Column
    private String label;

    @OneToMany(mappedBy = "league")
    @JsonIgnore
    private List<Team> teams;

}
