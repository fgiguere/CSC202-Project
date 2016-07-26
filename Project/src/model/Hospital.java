package model;

import java.io.Serializable;

/**
 * Hospital Class
 */
public class Hospital implements Serializable, Comparable<Hospital> {

    private String name;
    private String streetAddress;
    private String city;
    private String state;
    private String zip;
    private String latitude;
    private String longitude;
    private String number;
    private String photo;

    public Hospital(String name, String streetAddress, String city, String state, String zip, String latitude, String longitude, String number, String photo) {
        this.name = name;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.latitude = latitude;
        this.longitude = longitude;
        this.number = number;
        this.photo = photo;
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getStreetAddress() {return streetAddress;}

    public void setstreetAddress(String streetAddress) {this.streetAddress = streetAddress;}

    public String getCity() {return city;}

    public void setCity(String city) {this.city = city;}

    public String getState() {return state;}

    public void setState(String state) {this.state = state;}

    public String getZip() {return zip;}

    public void setZip(String zip) {this.zip = zip;}

    public String getLatitude() {return latitude;}

    public void setLatitude(String latitude) {this.latitude = latitude;}

    public String getLongitude() {return longitude;}

    public void setLongitude(String longitude) {this.longitude = longitude;}

    public String getNumber() {return number;}

    public void setNumber(String number) {this.number = number;}

    public String getPhoto() {return photo;}

    public void setPhoto(String photo) {this.photo = photo;}

    public String toString() {return "Hospital name:" + this.name;}

    /**
     *
     * @param o Hospital
     * @return int
     */
    @Override
    public int compareTo(Hospital o) {
        int compare = this.latitude.compareTo(o.getLatitude());
        return (compare==0)?this.longitude.compareTo(o.getLongitude()):compare;
    }
}
