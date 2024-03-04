package blink.api.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import lombok.Data;

@Entity
@Data
@NamedQuery(name = "DonationCenter.byLatLng", query = "SELECT d FROM DonationCenter d ORDER BY (d.longitude-:longitude)*(d.longitude-:longitude) + (d.latitude-:latitude)*(d.latitude-:latitude)")
public class DonationCenter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private Long latitude;
    private Long longitude;
    



}
