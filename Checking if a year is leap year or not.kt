fun main(args: Array<String>) 
{
 val year :Int = 2024
 if((year %4==0 && year %100!=0)||year%400==0)
 {
 println ("The year $year is leap year ")
 }
 else 
 {
 println ("The year $year is not leap year ")
 }
}
