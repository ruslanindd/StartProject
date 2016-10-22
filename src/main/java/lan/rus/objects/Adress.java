package lan.rus.objects;

/**
 * Created by ruslan on 22.10.2016.
 */
public class Adress {
    private String street;
    private String city;
    private String house;

    public Adress(String city,String street,String house){
        setStreet(street);
        setCity(city);
        setHouse(house);
    }

    public void print(){
        Utils.print("city["+getCity()+"] street["+getStreet()+"] house["+getHouse()+"]");
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }
}
