package com.example.faisal.oassriderapp.Common;

import com.example.faisal.oassriderapp.Remote.FCMClient;
import com.example.faisal.oassriderapp.Remote.GoogleMapAPI;
import com.example.faisal.oassriderapp.Remote.IFCMService;
import com.example.faisal.oassriderapp.Remote.IGoogleAPI;

public class Common {
    public static final String driver_tbl="Drivers";
    public static final String user_driver_tbl="DriversInformation";
    public static final String user_rider_tbl="RidersInformation";
    public static final String pickup_request_tbl="PickupRequest";
     public static final String token_tbl="Tokens";
    public static final String fcmURL="https://fcm.googleapis.com";
    public static final String googleAPIUrl="https://maps.googleapis.com";

    public static final String user_field="rider_usr";
    public static final String pwd_field="rider_pwd";





    public static double base_fare=2.55;
    public static double time_rate=0.35;
    public  static  double distance_rate=1.75;

    public static double getPrice(double km,int min){
        return (base_fare+(time_rate*min)+(distance_rate*km));
    }

    public static IFCMService getFCMService(){
        return FCMClient.getClient(fcmURL).create(IFCMService.class);
    }
    public static IGoogleAPI getGoogleService()
    {
        return GoogleMapAPI.getClient(googleAPIUrl).create(IGoogleAPI.class);
    }


}
