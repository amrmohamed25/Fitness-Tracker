package fitness;

public class Activity {

//Variables used for time
    private int time;
//Variable used for Calories
    private final int constcalories;//constant calories 
    private int caloriesburnt;//calories that every sport burns
//Variables used for heartrate
    private static double heartrate;
    private final double heartrateconstant;//heartrate constant ratio
    private double sportheartrateinc;//Heartrate increase for each sport
//Variable used for printing results
    private final String objname;

    public Activity(String objname, int constcalories, double heartrateconstant) {
        this.heartrateconstant = heartrateconstant;
        this.constcalories = constcalories;
        heartrate = 80;
        caloriesburnt = 0;
        sportheartrateinc = 0;
        this.objname = objname;
    }

    public String getObjname() {
        return objname;
    }

    public double getHrinc() {
        sportheartrateinc = (double) Math.round(sportheartrateinc * 1000d) / 1000.0d;
        return sportheartrateinc;
    }
     public static int getTotalcalories(Activity []arr) {
        return arr[0].caloriesburnt+arr[1].caloriesburnt+arr[2].caloriesburnt+arr[3].caloriesburnt;
    }

    public int getCaloriesburnt() {
        return caloriesburnt;
    }

    public static double getTotalheartrate() {
        heartrate = (double) Math.round(heartrate * 1000d) / 1000d;
        return heartrate;
    }

    public void setTime(int time) {
        this.time = time;
        caloriesburnt += constcalories * time;
        double old=heartrate;
        heartrate = heartrate + (heartrate * time * heartrateconstant);
        sportheartrateinc += heartrate - old;
    }
}