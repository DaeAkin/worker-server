package com.donghyeon.controller;

import com.donghyeon.TestConfiguration;
import com.donghyeon.geo.GeoLocationNearByRequest;
import com.donghyeon.geo.service.GeoService;
import com.netflix.discovery.converters.Auto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.ConfigFileApplicationContextInitializer;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;
@ContextConfiguration(initializers = ConfigFileApplicationContextInitializer.class)
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestConfiguration.class)
@Transactional
@ActiveProfiles(profiles = "test")

public class GeoControllerTest {

    @Autowired
    GeoController geoController;


    @Test
    public void getLocationsNearby() {
        //길동
        GeoLocationNearByRequest geoLocationNearByRequest = new GeoLocationNearByRequest("127.144756","37.539968");
        geoController.getLocationsNearby(geoLocationNearByRequest);
    }
}