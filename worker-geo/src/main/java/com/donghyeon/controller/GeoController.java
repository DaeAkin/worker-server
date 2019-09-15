package com.donghyeon.controller;

import com.donghyeon.geo.GeoLocationNearByRequest;
import com.donghyeon.geo.service.GeoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/geo")
public class GeoController {

    @Autowired
    GeoService geoService;

    @GetMapping
    public void getLocationsNearby(@RequestBody GeoLocationNearByRequest geoLocationNearByRequest) {
        geoService.getNearby(geoLocationNearByRequest.getX(),geoLocationNearByRequest.getY());
    }
}
