package edai.tema1.ejercicio4;
import java.util.Calendar;


public class Person {
    String name;
    String lastName;
    Calendar birthday;
    String country;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Calendar getBirthday() {
        return birthday;
    }
    public void setBirthday(Calendar birthday) {
        this.birthday = birthday;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getFullName() {
        return (name + " " + lastName);
    }
    public int getAgeAtDate(Calendar date) {
        int time = date.get(Calendar.YEAR) - birthday.get(Calendar.YEAR);
        if( (birthday.get(Calendar.DATE) > date.get(Calendar.DATE)) && (birthday.get(Calendar.MONTH) > date.get(Calendar.MONTH)) ){
            time -= 1;
        }
        return time;
    }
}
