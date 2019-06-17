package microservices.getmicroservice.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Player implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Player first name can not be blank.")
    @Column
    private String firstName;

    @NotBlank(message = "Player last name can not be blank.")
    @Column
    private String lastName;

    @NotBlank(message = "Player height can not be blank.")
    @Column
    private Integer height;

    @NotBlank(message = "Player registration number can not be blank.")
    @Column
    private String regNumber;

    @NotBlank(message = "Player date of birth can not be blank.")
    @Temporal(TemporalType.DATE)
    @Column
    private Date dateOfBirth;

    @ManyToOne
    @JoinColumn
    private Nationality nationality;

    @ManyToOne
    @JoinColumn
    private Team team;
}
