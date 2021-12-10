
package DevJ120_Lab2;

public class Main {
    private static final int  size=5;
    private static String [] as = new String[size];
    static boolean dir;
    
    public static void main(String[] args) {
        StringService ss = new StringService();
        as[0]="BBB";
        as[1]="AAA";
        as[2]="CCC";
        as[3]="EEE";
        as[4]="DDD";
        
        System.out.println("Unsort array: "+ss.showArray(as));
        
        try {
            dir=true;
            ss.sort(as, dir);
            System.out.println("If we have dir = "+dir+", we used alphabetically sort: "+ss.showArray(as));
            dir=false;
            ss.sort(as, dir);
            System.out.println("If we have dir = "+dir+", we used reverse alhabetically sort: "+ss.showArray(as));
        } catch (StringArrayException ex) {
            System.out.println(ex.getMessage());
        }
        
        System.out.println("");
        
        String sOrigin = "Present Perfect 2022";
        System.out.println("Origin string: "+sOrigin);
        System.out.println("Uniq array: "+ss.showArray(ss.getCharStat(sOrigin)));
    }
    
}
