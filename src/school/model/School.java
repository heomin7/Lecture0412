package school.model;

/**
 * Created by danawacomputer on 2017-04-12.
 */
public class School {
    private String schoolId;
    private String nameFull;
    private String city;
    private String state;
    private String country;

    public School() {
    }

    public School(String schoolId, String nameFull, String city, String state, String country) {
        this.schoolId = schoolId;
        this.nameFull = nameFull;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    public String getNameFull() {
        return nameFull;
    }

    public void setNameFull(String nameFull) {
        this.nameFull = nameFull;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolId='" + schoolId + '\'' +
                ", nameFull='" + nameFull + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
