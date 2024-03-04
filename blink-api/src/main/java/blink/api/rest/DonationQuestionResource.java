package blink.api.rest;

import blink.api.domain.model.DonationQuestion;
import blink.api.domain.repository.DonationQuestionRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.awt.*;
import java.util.List;

@Path("/questions")
public class DonationQuestionResource {

    private final DonationQuestionRepository donationQuestionRepository;

    @Inject
    public DonationQuestionResource(DonationQuestionRepository donationQuestionRepository){
        this.donationQuestionRepository = donationQuestionRepository;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getQuestions(){
        List<DonationQuestion> donationQuestions = donationQuestionRepository.listAll();
        return Response.ok(donationQuestions).build();
    }
}
