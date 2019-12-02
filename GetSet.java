package com.app.getsetmethodactivity;

public class GetSet {

    private static String mobilenumber = "";
    private static String message = "";



    public static String getMessage() {return message;}

    public static void setMessage(String message) { GetSet.message = message;}

    public static String getMobilenumber(){ return mobilenumber; }

    public static void setMobilenumber(String mobilenumber) { GetSet.mobilenumber = mobilenumber; }


    public static void reset() {
        GetSet.setMobilenumber(null);
        GetSet.setMessage(null);
    }




}
