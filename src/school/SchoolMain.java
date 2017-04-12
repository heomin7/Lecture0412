package school;

import school.model.School;
import school.service.SchoolService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-12.
 */
public class SchoolMain {
    public static void main(String[] args) throws Exception{

        //0. read file
        BufferedReader br = new BufferedReader(new FileReader("src\\Schools.csv"));


        String line = "";
        List<School> schools = new ArrayList<>();
        br.readLine();
        while((line = br.readLine()) != null){
            String[] splitted = line.split(",");
            schools.add(new School(splitted[0], splitted[1],
                    splitted[2], splitted[3], splitted[4]));

        }

        SchoolService ss = new SchoolService();
        List<School> newList = ss.GetNewList(schools);

        for(School e: newList){
            System.out.println(e);
        }

    }
}
