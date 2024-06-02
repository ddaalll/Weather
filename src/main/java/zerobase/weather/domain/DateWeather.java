package zerobase.weather.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "date_weather")
public class DateWeather {

    @Id
    private LocalDate date;
    private String weather;
    private String icon;
    private double temperature;

}