class Solution {
    public int dayOfYear(String date) {
        int days=0;
        int[] months={
            0,31,28,31,30,31,30,31,31,30,31,30,31
        };
        int year=Integer.parseInt(date.substring(0,4));
        int month=Integer.parseInt(date.substring(5,7));
        int day=Integer.parseInt(date.substring(8,10));
        System.out.println(day);
        System.out.println(month);
        System.out.println(year);
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))months[2]=29;
        for(int i=0;i<months.length;i++){
            if(i==month)break;
            days+=months[i];
        }
        return days+day;
    }
}