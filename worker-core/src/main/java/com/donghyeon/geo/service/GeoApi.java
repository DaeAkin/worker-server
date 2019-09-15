package com.donghyeon.geo.service;

import java.util.List;

@Deprecated
public interface GeoApi {
    List<String> getNearby(String x,String y);
}
