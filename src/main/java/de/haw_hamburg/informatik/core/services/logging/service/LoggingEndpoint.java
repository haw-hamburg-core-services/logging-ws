package de.haw_hamburg.informatik.core.services.logging.service;

import de.haw_hamburg.informatik.core.services.logging.Message;
import de.haw_hamburg.informatik.core.services.logging.PutMessageRequest;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;

/**
 * Created by skrec on 08.12.2016.
 */
@Endpoint
public class LoggingEndpoint {
    private static final String NAMESPACE_URI = "http://core.informatik.haw-hamburg.de/services/logging";


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "putMessageRequest")
    public void getCountry(@RequestPayload PutMessageRequest request) {
        //extract message
        Message message = request.getMessage();
        //forward to logger!
        //TODO implement!
    }

}

