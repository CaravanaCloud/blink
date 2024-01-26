package blink.api.rest;

import blink.api.domain.repository.DonationCenterRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;


@Path("/centers")
public class DonationCenterResource {

    private final DonationCenterRepository donationCenterRepository;

    @Inject
    public DonationCenterResource(DonationCenterRepository donationCenterRepository) {
        this.donationCenterRepository = donationCenterRepository;
    }

    @GET
    @Path("/nearest")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getNearestDonationCenter(@QueryParam("longitude") Double longitude,
                                             @QueryParam("latitude") Double latitude){

        var donationCenterList = donationCenterRepository.findNearestDonationCenter(longitude, latitude);
        return Response.ok(donationCenterList).build();

    }


}
