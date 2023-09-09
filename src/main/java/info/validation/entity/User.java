package info.validation.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")
public class User {
    @Id
    @GeneratedValue
    private int userId;
    private String name;
    private String email;
    private String mobile;
    private int age;
    private String gender;
    private String nationality;

}
