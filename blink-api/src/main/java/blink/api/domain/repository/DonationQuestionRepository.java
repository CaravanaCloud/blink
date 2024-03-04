package blink.api.domain.repository;

import blink.api.domain.model.DonationQuestion;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DonationQuestionRepository implements PanacheRepository<DonationQuestion> {
}
