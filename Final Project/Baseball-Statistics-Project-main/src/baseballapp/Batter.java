package baseballapp;

public class Batter 
{
    private String lastName;
    private String firstName;
    private String position;
    private int ab;
    private int r; 
    private int h; 
    private int rbi; 
    private int bb; 
    private int so; 
    private int po; 
    private int a; 
    private int lob; 

    public Batter(){
        this("","","",0,0,0,0,0,0,0,0,0);
    }


    public Batter(String lastName,String firstName,String position,int ab,int r,int h,int rbi,int bb, int so, int po, int a, int lob){
        this.lastName = lastName;
        this.firstName = firstName;
        this.position = position;
        this.ab = ab;
        this.r = r;
        this.h = h;
        this.rbi = rbi;
        this.bb = bb; 
        this.so = so;
        this.po = po;
        this.a = a;
        this.lob = lob;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }
    public String getPosition()
    {
        return position;
    }

}