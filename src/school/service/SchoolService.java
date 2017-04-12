package school.service;

import school.model.School;

import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-12.
 */
public class SchoolService implements ISchoolService{

    public List<School> GetNewList(List<School> list){

        School school = new School();
        List<School> newList = new ArrayList<>();

        for(School e: list){
            if(e.getSchoolId().length() >= 6){
                newList.add(
                        new School((e.getSchoolId().substring(0,5) + "..."),
                                e.getNameFull(), e.getCity(), e.getState(), e.getCountry()));
            }
            else{
                newList.add(new School(e.getSchoolId(), e.getNameFull(), e.getCity(), e.getState(), e.getCountry()));
            }
        }

        return newList;
    }
}
