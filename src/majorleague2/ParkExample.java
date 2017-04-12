package majorleague2;

import majorleague2.model.Park;
import majorleague2.service.ParkService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-10.
 */
public class ParkExample {
    public static void main(String[] args) throws Exception{

        String fileName = "src\\Parks.csv";

        FileReader fr = new FileReader(fileName);

        BufferedReader br = new BufferedReader(fr); //조금 더 파일을 쉽게 조작 가능함.

 //       String line = br.readLine();//readline을 쓰기 위해 BufferedReader을 사용함

/*
        while(true){
            String line = br.readLine();//readline을 쓰기 위해 BufferedReader을 사용함
            String[] splitted = line.split(",");
            for(String e: splitted){
                System.out.println(e);
            }
            if(line == null) break;
            System.out.println(line);
        }
 */
        String line = "";

        br.readLine();

        List<Park> parkList = new ArrayList<>();
        while((line = br.readLine()) != null) {
            String[] splitted = line.split(",");

            Park park = new Park(splitted[0], splitted[1] ,splitted[2] ,splitted[3] ,splitted[4] ,splitted[5]);

            parkList.add(park);

        }


        ParkService ps = new ParkService();

        int countryCnt = ps.NotUsCountry(parkList);
        int nickNameCount = ps.NickNameCount(parkList);
        double parkNameAverage = ps.ParkNameAverage(parkList);

        System.out.println("국가가 US가 아닌 볼파크수?: " + countryCnt);
        System.out.println("별명이 있는 볼 파크 수는?: " + nickNameCount);
        System.out.println("볼 파크 이름의 글자 평균은?: " + parkNameAverage);

        /*
        for(Park e: parkList){
            System.out.print(e.getParkKey());
            System.out.print(": ");
            System.out.print(e.getParkName());
            System.out.print(": ");
            System.out.print(e.getParkAlias());
            System.out.print(": ");
            System.out.print(e.getCity());
            System.out.print(": ");
            System.out.print(e.getState());
            System.out.print(": ");
            System.out.print(e.getCountry());
            System.out.print(": ");
            System.out.println();

        }
         */


    }
}
