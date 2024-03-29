package project.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.OffsetDateTime;


@Data
@Entity(name = "registered_car")
@AllArgsConstructor
@NoArgsConstructor
public class RegisteredCar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "registered_car_seq")
    private long id;
    private String carNumber;
    private OffsetDateTime timestamp;

    public RegisteredCar(String carNumber, OffsetDateTime timestamp) {
        this.carNumber = carNumber;
        this.timestamp = timestamp;
    }
}
