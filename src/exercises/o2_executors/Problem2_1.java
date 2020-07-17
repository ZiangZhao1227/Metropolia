package exercises.o2_executors;

import java.util.concurrent.ThreadLocalRandom;

public class Problem2_1
{
  public static void main(String[] args)
  {
    String value = "Hello Metropolia";
    
    System.out.println("Hashcode of >>Hello Metropolia<< : " + value.hashCode() );
        
    long start = System.currentTimeMillis();
    while(true)
    {
      String candidate = value + ThreadLocalRandom.current().nextLong();
      if( candidate.hashCode() >= 0 &&  candidate.hashCode() < 10 )
      {
        String hashStr = String.format ("%010d",  candidate.hashCode() );
        System.out.println("Candidate: " + candidate + " => " + hashStr );
        break;
      }
    }
    long end = System.currentTimeMillis();
    System.out.println("Duration " + (end-start) + "[ms]");
  }
}
