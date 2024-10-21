import java.util.*;
public class islandstuck {
    public static int choco(int E,int D,int n){
        int count=E*D;
        int week=D/7;
        int extraday=D%7;
        int totalsun=week;
        if(extraday>=7){
            totalsun++;
        }
        else if(extraday>0){
            totalsun++;
        }
        int lesakte=D-totalsun;
        int boxneeded=(int)Math.ceil(count/n);
        if(boxneeded>lesakte){
            return -1;
        }
        return boxneeded;


    }
    
}
