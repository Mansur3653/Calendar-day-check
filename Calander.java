import java.util.*;
class Calander
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        String days[] = {"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
        boolean bbb = true;
        int d=0,m=0,y=0,yd=0,ydf=0,day=0;
        while(bbb)
        {
            System.out.print("Enter year: ");
            int year = sc.nextInt();
            if ((year < 1000 || year > 9999) && year!=0000) 
            {
                System.out.println("Please enter a valid 4-digit year.");
                bbb = true;
            } 
            else 
            {
                int yfp = year / 100;
                yd = year % 100;
                ydf = yd/4;
                if(yfp%4==0)
                {
                    y = 6;
                }
                else if(yfp%4==1)
                {
                    y = 4;
                }
                else if(yfp%4==2)
                {
                    y = 2;
                }
                else if(yfp%4==3)
                {
                    y = 0;
                }
                bbb = false;
        }
            boolean b = true;
            if((year%400==0 && year%100!=0) || year%4==0)
            {
                String months[] = {"","January","February","March","April","May","June","July","August","September","October","November","December"};
                for(int i=1;i<months.length;i++)
                {
                    System.out.println(i+". "+months[i]);
                }
                while(b)
                {
                    b = false;
                    boolean bb = true;
                    System.out.print("Enter month (month num): ");
                    int month = sc.nextInt();
                    if(month==1)
                    {
                        m = 1;
                    }
                    else if(month==2)
                    {
                        m = 4;
                    }
                    else if(month==3)
                    {
                        m = 4;
                    }
                    else if(month==4)
                    {
                        m = 0;
                    }
                    else if(month==5)
                    {
                        m = 2;
                    }
                    else if(month==6)
                    {
                        m = 5;
                    }
                    else if(month==7)
                    {
                        m = 0;
                    }
                    else if(month==8)
                    {
                        m = 3;
                    }
                    else if(month==9)
                    {
                        m = 6;
                    }
                    else if(month==10)
                    {
                        m = 1;
                    }
                    else if(month==11)
                    {
                        m = 4;
                    }
                    else if(month==12)
                    {
                        m = 6;
                    }
                    if(month>=1 && month<=12)
                    {
                        while(bb)
                        {
                            System.out.print("Enter date: ");
                            int date = sc.nextInt();
                            if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
                            {
                                if(date>=1 && date<=31)
                                {
                                    d = date;
                                    bb = false;
                                }
                                else 
                                {
                                    System.out.println("Selected month contains 31 days.");
                                    bb = true;
                                }
                            }
                            else if(month==2)
                            {
                                if(date>=1 && date<=29)
                                {
                                    d = date;
                                    bb = false;
                                }
                                else 
                                {
                                    System.out.println("Selected month contains 29 days.");
                                    bb = true;
                                }
                            }
                            else
                            {
                                if(date>=1 && date<=30)
                                {
                                    d = date;
                                    bb = false;
                                }
                                else 
                                {
                                    System.out.println("Selected month contains 30 days.");
                                    bb = true;
                                }
                            }
                        }
                        if(month==1 || month==2)
                        {
                            day = ((d+m+y+yd+ydf)%7)-1;
                        }
                        else
                        {
                            day = (d+m+y+yd+ydf)%7;
                        }
                        System.out.println("-----------------------------------");
                        System.out.println("The day ("+d+"-"+month+"-"+year+") is: "+days[day]);
                        System.out.println("-----------------------------------");
                    }
                    else
                    {
                        System.out.println("Enter the month number between 1 and 12");
                        b = true;
                    }
                }
            }
            else
            {
                String months[] = {"","January","February","March","April","May","June","July","August","September","October","November","December"};
                for(int i=1;i<months.length;i++)
                {
                    System.out.println(i+". "+months[i]);
                }
                while(b)
                {
                    b = false;
                    boolean bb = true;
                    System.out.print("Enter month (month num): ");
                    int month = sc.nextInt();
                    if(month==1)
                    {
                        m = 1;
                    }
                    else if(month==2)
                    {
                        m = 4;
                    }
                    else if(month==3)
                    {
                        m = 4;
                    }
                    else if(month==4)
                    {
                        m = 0;
                    }
                    else if(month==5)
                    {
                        m = 2;
                    }
                    else if(month==6)
                    {
                        m = 5;
                    }
                    else if(month==7)
                    {
                        m = 0;
                    }
                    else if(month==8)
                    {
                        m = 3;
                    }
                    else if(month==9)
                    {
                        m = 6;
                    }
                    else if(month==10)
                    {
                        m = 1;
                    }
                    else if(month==11)
                    {
                        m = 4;
                    }
                    else if(month==12)
                    {
                        m = 6;
                    }
                    if(month>=1 && month<=12)
                    {
                        while(bb)
                        {
                            System.out.print("Enter date: ");
                            int date = sc.nextInt();
                            if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
                            {
                                if(date>=1 && date<=31)
                                {
                                    d = date;
                                    bb = false;
                                }
                                else 
                                {
                                    System.out.println("Selected month contains 31 days.");
                                    bb = true;
                                }
                            }
                            else if(month==2)
                            {
                                if(date>=1 && date<=28)
                                {
                                    d = date;
                                    bb = false;
                                }
                                else 
                                {
                                    System.out.println("Selected month contains 28 days.");
                                    bb = true;
                                }
                            }
                            else
                            {
                                if(date>=1 && date<=30)
                                {
                                    d = date;
                                    bb = false;
                                }
                                else 
                                {
                                    System.out.println("Selected month contains 30 days.");
                                    bb = true;
                                }
                            }
                        }
                        day = (d+m+y+yd+ydf)%7;
                        System.out.println("-----------------------------------");
                        System.out.println("The day ("+d+"-"+month+"-"+year+") is: "+days[day]);
                        System.out.println("-----------------------------------");
                    }
                    else
                    {
                        System.out.println("Enter the month number between 1 and 12");
                        b = true;
                    }
                }
            }
        }
    }
}