package pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name = "artist")
@XmlAccessorType(XmlAccessType.FIELD)
public class Artist implements Serializable {
    @XmlElement
    private String firstName;
    @XmlElement
    private String lastName;
    @XmlElement
    private String nickName;
    @XmlElement
    private String bio;
    public Artist(){

    }
    public Artist(String firstName, String lastName, String nickName, String bio) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickName = nickName;
        this.bio = bio;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
    public String toString() {
        return "First name: " + firstName + ", " +
                "Last name: " + lastName + ", " +
                " Nickname: " + nickName + ", Bio: " + bio + ".";

    }
}
