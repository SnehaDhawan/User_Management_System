package Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;


    @Column(name ="first_Name")
    private String firstName;

    @Column(name ="last_Name")
    private String lastName;

    @Column(name ="email_Id")
    private String emailId;



}
