package com.tareksaidee.cunysecond.controller;

import net.thegreshams.firebase4j.error.FirebaseException;
import net.thegreshams.firebase4j.service.Firebase;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DataController {

    private static String firebase_baseUrl = "https://cunysecond.firebaseio.com/";

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
    public String index() throws FirebaseException, Exception {
        Firebase firebase = new Firebase(firebase_baseUrl);
        return firebase.get("brooklyn_college").getRawBody();
    }
}
