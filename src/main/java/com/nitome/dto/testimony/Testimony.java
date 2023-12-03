package com.nitome.dto.testimony;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Testimony {

    /*
    Description of testimony
     */
    String testimony;

    /*
     * Full name of the person.
     */
    String custName;

    /*
     * rating out of 5.
     */
    float rating;

    /*
    location of the person
    e.g. <City>, <country> Pune, India
     */
    String location;

    /*
    description of the person who has given the testimony.
    e.g. Head teacher at XYZ school
     */
    String custProfile;
}
