package blink.api.domain.repository;

import blink.api.domain.model.DonationCenter;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.panache.common.Parameters;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class DonationCenterRepository implements PanacheRepository<DonationCenter> {
    public List<DonationCenter> findNearestDonationCenter(Double longitude, Double latitude) {
        return find(
                "SELECT d FROM DonationCenter d ORDER BY (d.longitude-:longitude)*(d.longitude-:longitude) + (d.latitude-:latitude)*(d.latitude-:latitude)",
                        Parameters.with("longitude", longitude).and("latitude", latitude)).list();

    }
}
