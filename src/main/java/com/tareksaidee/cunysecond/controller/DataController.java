package com.tareksaidee.cunysecond.controller;

import io.swagger.annotations.ApiOperation;
import net.thegreshams.firebase4j.error.FirebaseException;
import net.thegreshams.firebase4j.error.JacksonUtilityException;
import net.thegreshams.firebase4j.service.Firebase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;


@RestController
public class DataController {

    private static String firebase_baseUrl = "https://cunysecond.firebaseio.com";

    @RequestMapping(value = "/getClasses", method = RequestMethod.GET, produces = "application/json")
    @ApiOperation(value = "Get all classes from school", notes = "Get all classes from a particular school")
    public String getClasses(@RequestParam(value = "School") Schools school) throws FirebaseException, Exception,JacksonUtilityException {
        Firebase firebase = new Firebase(firebase_baseUrl);
        return firebase.get(school.getName()).getRawBody();
    }

    @RequestMapping(value = "/getAllSchools", method = RequestMethod.GET, produces = "application/json")
    @ApiOperation(value = "Get schools with info", notes = "Get all all CUNY schools with info on each")
    public String getAllSchools() throws FirebaseException, Exception,JacksonUtilityException {
        Firebase firebase = new Firebase(firebase_baseUrl);
        return firebase.get("schools_extra").getRawBody();
    }

    @RequestMapping(value = "/getSchoolInfo", method = RequestMethod.GET, produces = "application/json")
    @ApiOperation(value = "Get schools with info", notes = "Get all all CUNY schools with info on each")
    public String GetSchoolInfo(@RequestParam(value = "School") Schools school) throws FirebaseException, Exception,JacksonUtilityException {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        URI uri = new URIBuilder()
                .setScheme("https")
                .setHost("cunysecond.firebaseio.com")
                .setPath("/schools_extra.json")
                .setParameter("orderBy", "\"$key\"")
                .setParameter("equalTo", "\""+ school.getName() +"\"")
                .build();
        HttpGet httpget = new HttpGet(uri);
        return EntityUtils.toString(httpclient.execute(httpget).getEntity(), "UTF-8");
    }

    private enum Schools {
        Borough_Of_Manhattan_Community_College("borough_of_manhattan"),
        Bronx_Community_College("bronx_community"),
        Guttman_Community_College("guttman_community"),
        Hostos_Community_College("hostos_community"),
        Kingsborough_Community_College("kingsborough_community"),
        LaGuardia_Community_College("laguardia_community"),
        Queensborough_Community_College("queensborough_community"),
        Baruch_College("baruch_college"),
        Brooklyn_College("brooklyn_college"),
        College_of_Staten_Island("staten_island"),
        Hunter_College("hunter_college"),
        John_Jay_College_Of_Criminal_Justice("john_jay"),
        Lehman_College("lehman_college"),
        Medgar_Evers_College("medgar_evers"),
        New_York_City_College_Of_Technology("city_college_of_tech"),
        Queens_College("queens_college"),
        The_City_College_Of_New_York("city_college"),
        CUNY_Graduate_Center("graduate_center"),
        CUNY_Graduate_School_Of_Journalism("school_of_journalism"),
        CUNY_Graduate_School_Of_Public_Health_And_Health_Policy("school_of_public_health"),
        CUNY_School_Of_Law("school_of_law"),
        CUNY_School_Of_Professional_Studies("school_of_professional_studies"),
        Macaulay_Honors_College("macaulay_honors");

        private String str;

        Schools(String str){
            this.str = str;
        }

        public String getName() {
            return str;
        }
    }
}
