import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.ECS_GUI;//sysj\ECS.sysj line: 1, column: 1

public class ECS_HVACController extends ClockDomain{
  public ECS_HVACController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal currentTime = new Signal("currentTime", Signal.INPUT);
  public Signal zoneOneSevenTemp = new Signal("zoneOneSevenTemp", Signal.INPUT);
  public Signal zoneTwoThreeTemp = new Signal("zoneTwoThreeTemp", Signal.INPUT);
  public Signal zoneFourFiveSixTemp = new Signal("zoneFourFiveSixTemp", Signal.INPUT);
  public Signal zoneOneSevenHumid = new Signal("zoneOneSevenHumid", Signal.INPUT);
  public Signal zoneTwoThreeHumid = new Signal("zoneTwoThreeHumid", Signal.INPUT);
  public Signal zoneFourFiveSixHumid = new Signal("zoneFourFiveSixHumid", Signal.INPUT);
  public Signal zoneOneSevenFanONOFF = new Signal("zoneOneSevenFanONOFF", Signal.OUTPUT);
  public Signal zoneTwoThreeFanONOFF = new Signal("zoneTwoThreeFanONOFF", Signal.OUTPUT);
  public Signal zoneFourFiveSixACONOFF = new Signal("zoneFourFiveSixACONOFF", Signal.OUTPUT);
  public Signal zoneOneSevenHeaterONOFF = new Signal("zoneOneSevenHeaterONOFF", Signal.OUTPUT);
  public Signal zoneTwoThreeHeaterONOFF = new Signal("zoneTwoThreeHeaterONOFF", Signal.OUTPUT);
  private Signal workhrs_1;
  private Signal afterhrs_1;
  private int currentTemp_thread_1;//sysj\ECS.sysj line: 16, column: 2
  private int previousHour_thread_1;//sysj\ECS.sysj line: 18, column: 2
  private int currentTemp_thread_3;//sysj\ECS.sysj line: 36, column: 2
  private int currentHumidity_thread_3;//sysj\ECS.sysj line: 37, column: 2
  private int currentTemp_thread_4;//sysj\ECS.sysj line: 74, column: 2
  private int currentHumidity_thread_4;//sysj\ECS.sysj line: 75, column: 2
  private int currentTemp_thread_5;//sysj\ECS.sysj line: 111, column: 2
  private int currentHumidity_thread_5;//sysj\ECS.sysj line: 112, column: 2
  private int currentHour_thread_2;//sysj\ECS.sysj line: 22, column: 6
  private int tempZoneOneSeven_thread_3;//sysj\ECS.sysj line: 42, column: 7
  private int humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 43, column: 7
  private int tempzoneTwoThree_thread_4;//sysj\ECS.sysj line: 81, column: 7
  private int humidityzoneTwoThree_thread_4;//sysj\ECS.sysj line: 82, column: 7
  private int tempzoneFourFiveSixTemp_thread_5;//sysj\ECS.sysj line: 118, column: 7
  private int humidityzoneFourFiveSix_thread_5;//sysj\ECS.sysj line: 119, column: 7
  private int S97607 = 1;
  private int S97504 = 1;
  private int S97488 = 1;
  private int S97518 = 1;
  private int S97532 = 1;
  private int S97546 = 1;
  
  private int[] ends = new int[12];
  private int[] tdone = new int[12];
  
  public void thread97678(int [] tdone, int [] ends){
        switch(S97546){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(zoneFourFiveSixTemp.getprestatus()){//sysj\ECS.sysj line: 117, column: 13
          tempzoneFourFiveSixTemp_thread_5 = (Integer)(zoneFourFiveSixTemp.getpreval() == null ? 0 : ((Integer)zoneFourFiveSixTemp.getpreval()).intValue());//sysj\ECS.sysj line: 118, column: 7
          humidityzoneFourFiveSix_thread_5 = (Integer)(zoneFourFiveSixHumid.getpreval() == null ? 0 : ((Integer)zoneFourFiveSixHumid.getpreval()).intValue());//sysj\ECS.sysj line: 119, column: 7
          if(tempzoneFourFiveSixTemp_thread_5 > currentTemp_thread_5) {//sysj\ECS.sysj line: 121, column: 50
            System.out.println("Turning ON Heater to Heat Up for Zone 4,5,6");//sysj\ECS.sysj line: 122, column: 8
            currentTemp_thread_5 = tempzoneFourFiveSixTemp_thread_5;//sysj\ECS.sysj line: 123, column: 8
            System.out.println("Current Temp:" + currentTemp_thread_5);//sysj\ECS.sysj line: 124, column: 8
          }
          if(tempzoneFourFiveSixTemp_thread_5 < currentTemp_thread_5) {//sysj\ECS.sysj line: 127, column: 50
            System.out.println("Turning ON Fan to Cool Down for Zone 4,5,6");//sysj\ECS.sysj line: 128, column: 8
            currentTemp_thread_5 = tempzoneFourFiveSixTemp_thread_5;//sysj\ECS.sysj line: 129, column: 8
            System.out.println("Current Temp:" + currentTemp_thread_5);//sysj\ECS.sysj line: 130, column: 8
          }
          if(humidityzoneFourFiveSix_thread_5 > currentHumidity_thread_5) {//sysj\ECS.sysj line: 133, column: 54
            System.out.println("Turning ON Heater to increase humidity for Zone 4,5,6");//sysj\ECS.sysj line: 134, column: 14
            currentHumidity_thread_5 = humidityzoneFourFiveSix_thread_5;//sysj\ECS.sysj line: 135, column: 14
            System.out.println("Current Humidity For Zone 4,5,6: " + currentHumidity_thread_5);//sysj\ECS.sysj line: 136, column: 14
          }
          else {//sysj\ECS.sysj line: 133, column: 7
            if(humidityzoneFourFiveSix_thread_5 < currentHumidity_thread_5) {//sysj\ECS.sysj line: 137, column: 64
              System.out.println("Turning ON Fan to reduce humidity for Zone 4,5,6");//sysj\ECS.sysj line: 138, column: 14
              currentHumidity_thread_5 = humidityzoneFourFiveSix_thread_5;//sysj\ECS.sysj line: 139, column: 14
              System.out.println("Current Humidity For Zone 4,5,6: " + currentHumidity_thread_5);//sysj\ECS.sysj line: 140, column: 14
            }
          }
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        else {
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        break;
      
    }
  }

  public void thread97677(int [] tdone, int [] ends){
        switch(S97532){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(zoneTwoThreeTemp.getprestatus()){//sysj\ECS.sysj line: 80, column: 13
          tempzoneTwoThree_thread_4 = (Integer)(zoneTwoThreeTemp.getpreval() == null ? 0 : ((Integer)zoneTwoThreeTemp.getpreval()).intValue());//sysj\ECS.sysj line: 81, column: 7
          humidityzoneTwoThree_thread_4 = (Integer)(zoneTwoThreeHumid.getpreval() == null ? 0 : ((Integer)zoneTwoThreeHumid.getpreval()).intValue());//sysj\ECS.sysj line: 82, column: 7
          if(tempzoneTwoThree_thread_4 > currentTemp_thread_4) {//sysj\ECS.sysj line: 84, column: 43
            System.out.println("Turning ON Heater to Heat Up for Zone 2,3");//sysj\ECS.sysj line: 85, column: 8
            currentTemp_thread_4 = tempzoneTwoThree_thread_4;//sysj\ECS.sysj line: 86, column: 8
            System.out.println("Current Temp:" + currentTemp_thread_4);//sysj\ECS.sysj line: 87, column: 8
          }
          if(tempzoneTwoThree_thread_4 < currentTemp_thread_4) {//sysj\ECS.sysj line: 90, column: 43
            System.out.println("Turning ON Fan to Cool Down for Zone 2,3");//sysj\ECS.sysj line: 91, column: 8
            currentTemp_thread_4 = tempzoneTwoThree_thread_4;//sysj\ECS.sysj line: 92, column: 8
            System.out.println("Current Temp:" + currentTemp_thread_4);//sysj\ECS.sysj line: 93, column: 8
          }
          if(humidityzoneTwoThree_thread_4 > currentHumidity_thread_4) {//sysj\ECS.sysj line: 96, column: 51
            System.out.println("Turning ON Heater to increase humidity for Zone 2,3");//sysj\ECS.sysj line: 97, column: 14
            currentHumidity_thread_4 = humidityzoneTwoThree_thread_4;//sysj\ECS.sysj line: 98, column: 14
            System.out.println("Current Humidity For Zone 2,3: " + currentHumidity_thread_4);//sysj\ECS.sysj line: 99, column: 14
          }
          else {//sysj\ECS.sysj line: 96, column: 7
            if(humidityzoneTwoThree_thread_4 < currentHumidity_thread_4) {//sysj\ECS.sysj line: 100, column: 61
              System.out.println("Turning ON Fan to reduce humidity for Zone 2,3");//sysj\ECS.sysj line: 101, column: 14
              currentHumidity_thread_4 = humidityzoneTwoThree_thread_4;//sysj\ECS.sysj line: 102, column: 14
              System.out.println("Current Humidity For Zone 2,3: " + currentHumidity_thread_4);//sysj\ECS.sysj line: 103, column: 14
            }
          }
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        else {
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        break;
      
    }
  }

  public void thread97676(int [] tdone, int [] ends){
        switch(S97518){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        if(zoneOneSevenTemp.getprestatus()){//sysj\ECS.sysj line: 41, column: 13
          tempZoneOneSeven_thread_3 = (Integer)(zoneOneSevenTemp.getpreval() == null ? 0 : ((Integer)zoneOneSevenTemp.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 7
          humidityZoneOneSeven_thread_3 = (Integer)(zoneOneSevenHumid.getpreval() == null ? 0 : ((Integer)zoneOneSevenHumid.getpreval()).intValue());//sysj\ECS.sysj line: 43, column: 7
          if(tempZoneOneSeven_thread_3 > currentTemp_thread_3) {//sysj\ECS.sysj line: 45, column: 43
            System.out.println("Turning ON AC to Heat Up for Zone 1,7");//sysj\ECS.sysj line: 46, column: 8
            currentTemp_thread_3 = tempZoneOneSeven_thread_3;//sysj\ECS.sysj line: 47, column: 8
            System.out.println("Current Temp For Zone 1,7:" + currentTemp_thread_3);//sysj\ECS.sysj line: 48, column: 8
          }
          if(tempZoneOneSeven_thread_3 < currentTemp_thread_3) {//sysj\ECS.sysj line: 51, column: 43
            System.out.println("Turning ON AC to Cool Down for Zone 1,7");//sysj\ECS.sysj line: 52, column: 8
            currentTemp_thread_3 = tempZoneOneSeven_thread_3;//sysj\ECS.sysj line: 53, column: 8
            System.out.println("Current Temp For Zone 1,7:" + currentTemp_thread_3);//sysj\ECS.sysj line: 54, column: 8
          }
          if(humidityZoneOneSeven_thread_3 > currentHumidity_thread_3) {//sysj\ECS.sysj line: 57, column: 51
            System.out.println("Turning ON Heater to increase humidity for Zone 1,7");//sysj\ECS.sysj line: 58, column: 14
            currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 59, column: 14
            System.out.println("Current Humidity For Zone 1,7:" + currentHumidity_thread_3);//sysj\ECS.sysj line: 60, column: 14
          }
          else {//sysj\ECS.sysj line: 57, column: 7
            if(humidityZoneOneSeven_thread_3 < currentHumidity_thread_3) {//sysj\ECS.sysj line: 61, column: 61
              System.out.println("Turning ON Fan to reduce humidity for Zone 1,7");//sysj\ECS.sysj line: 62, column: 14
              currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 63, column: 14
              System.out.println("Current Humidity For Zone 1,7:" + currentHumidity_thread_3);//sysj\ECS.sysj line: 64, column: 14
            }
          }
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        else {
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread97675(int [] tdone, int [] ends){
        switch(S97504){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S97488){
          case 0 : 
            if(currentTime.getprestatus()){//sysj\ECS.sysj line: 21, column: 12
              currentHour_thread_2 = (Integer)(currentTime.getpreval() == null ? 0 : ((Integer)currentTime.getpreval()).intValue());//sysj\ECS.sysj line: 22, column: 6
              S97488=1;
              if(currentHour_thread_2 >= 9 && currentHour_thread_2 < 17){//sysj\ECS.sysj line: 24, column: 14
                workhrs_1.setPresent();//sysj\ECS.sysj line: 25, column: 14
                currsigs.addElement(workhrs_1);
                S97488=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                afterhrs_1.setPresent();//sysj\ECS.sysj line: 27, column: 14
                currsigs.addElement(afterhrs_1);
                S97488=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            S97488=0;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread97673(int [] tdone, int [] ends){
        S97546=1;
    currentTemp_thread_5 = 30;//sysj\ECS.sysj line: 111, column: 2
    currentHumidity_thread_5 = 50;//sysj\ECS.sysj line: 112, column: 2
    System.out.println("Current Temp For Zone 4,5,6:" + currentTemp_thread_5);//sysj\ECS.sysj line: 113, column: 2
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread97672(int [] tdone, int [] ends){
        S97532=1;
    currentTemp_thread_4 = 30;//sysj\ECS.sysj line: 74, column: 2
    currentHumidity_thread_4 = 50;//sysj\ECS.sysj line: 75, column: 2
    System.out.println("Current Temp For Zone 2,3:" + currentTemp_thread_4);//sysj\ECS.sysj line: 76, column: 2
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread97671(int [] tdone, int [] ends){
        S97518=1;
    currentTemp_thread_3 = 30;//sysj\ECS.sysj line: 36, column: 2
    currentHumidity_thread_3 = 50;//sysj\ECS.sysj line: 37, column: 2
    System.out.println("Current Temp For Zone 1,7:" + currentTemp_thread_3);//sysj\ECS.sysj line: 38, column: 2
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread97670(int [] tdone, int [] ends){
        S97504=1;
    S97488=0;
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S97607){
        case 0 : 
          S97607=0;
          break RUN;
        
        case 1 : 
          S97607=2;
          S97607=2;
          workhrs_1.setClear();//sysj\ECS.sysj line: 14, column: 2
          afterhrs_1.setClear();//sysj\ECS.sysj line: 14, column: 2
          currentTemp_thread_1 = 30;//sysj\ECS.sysj line: 16, column: 2
          new Thread(new ECS_GUI()).start();//sysj\ECS.sysj line: 17, column: 2
          previousHour_thread_1 = 8;//sysj\ECS.sysj line: 18, column: 2
          thread97670(tdone,ends);
          thread97671(tdone,ends);
          thread97672(tdone,ends);
          thread97673(tdone,ends);
          int biggest97674 = 0;
          if(ends[2]>=biggest97674){
            biggest97674=ends[2];
          }
          if(ends[3]>=biggest97674){
            biggest97674=ends[3];
          }
          if(ends[4]>=biggest97674){
            biggest97674=ends[4];
          }
          if(ends[5]>=biggest97674){
            biggest97674=ends[5];
          }
          if(biggest97674 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          workhrs_1.setClear();//sysj\ECS.sysj line: 14, column: 2
          afterhrs_1.setClear();//sysj\ECS.sysj line: 14, column: 2
          thread97675(tdone,ends);
          thread97676(tdone,ends);
          thread97677(tdone,ends);
          thread97678(tdone,ends);
          int biggest97679 = 0;
          if(ends[2]>=biggest97679){
            biggest97679=ends[2];
          }
          if(ends[3]>=biggest97679){
            biggest97679=ends[3];
          }
          if(ends[4]>=biggest97679){
            biggest97679=ends[4];
          }
          if(ends[5]>=biggest97679){
            biggest97679=ends[5];
          }
          if(biggest97679 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest97679 == 0){
            S97607=0;
            active[1]=0;
            ends[1]=0;
            S97607=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    workhrs_1 = new Signal();
    afterhrs_1 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[1] != 0){
      int index = 1;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        if(!df){
          currentTime.gethook();
          zoneOneSevenTemp.gethook();
          zoneTwoThreeTemp.gethook();
          zoneFourFiveSixTemp.gethook();
          zoneOneSevenHumid.gethook();
          zoneTwoThreeHumid.gethook();
          zoneFourFiveSixHumid.gethook();
          df = true;
        }
        runClockDomain();
      }
      currentTime.setpreclear();
      zoneOneSevenTemp.setpreclear();
      zoneTwoThreeTemp.setpreclear();
      zoneFourFiveSixTemp.setpreclear();
      zoneOneSevenHumid.setpreclear();
      zoneTwoThreeHumid.setpreclear();
      zoneFourFiveSixHumid.setpreclear();
      zoneOneSevenFanONOFF.setpreclear();
      zoneTwoThreeFanONOFF.setpreclear();
      zoneFourFiveSixACONOFF.setpreclear();
      zoneOneSevenHeaterONOFF.setpreclear();
      zoneTwoThreeHeaterONOFF.setpreclear();
      workhrs_1.setpreclear();
      afterhrs_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = currentTime.getStatus() ? currentTime.setprepresent() : currentTime.setpreclear();
      currentTime.setpreval(currentTime.getValue());
      currentTime.setClear();
      dummyint = zoneOneSevenTemp.getStatus() ? zoneOneSevenTemp.setprepresent() : zoneOneSevenTemp.setpreclear();
      zoneOneSevenTemp.setpreval(zoneOneSevenTemp.getValue());
      zoneOneSevenTemp.setClear();
      dummyint = zoneTwoThreeTemp.getStatus() ? zoneTwoThreeTemp.setprepresent() : zoneTwoThreeTemp.setpreclear();
      zoneTwoThreeTemp.setpreval(zoneTwoThreeTemp.getValue());
      zoneTwoThreeTemp.setClear();
      dummyint = zoneFourFiveSixTemp.getStatus() ? zoneFourFiveSixTemp.setprepresent() : zoneFourFiveSixTemp.setpreclear();
      zoneFourFiveSixTemp.setpreval(zoneFourFiveSixTemp.getValue());
      zoneFourFiveSixTemp.setClear();
      dummyint = zoneOneSevenHumid.getStatus() ? zoneOneSevenHumid.setprepresent() : zoneOneSevenHumid.setpreclear();
      zoneOneSevenHumid.setpreval(zoneOneSevenHumid.getValue());
      zoneOneSevenHumid.setClear();
      dummyint = zoneTwoThreeHumid.getStatus() ? zoneTwoThreeHumid.setprepresent() : zoneTwoThreeHumid.setpreclear();
      zoneTwoThreeHumid.setpreval(zoneTwoThreeHumid.getValue());
      zoneTwoThreeHumid.setClear();
      dummyint = zoneFourFiveSixHumid.getStatus() ? zoneFourFiveSixHumid.setprepresent() : zoneFourFiveSixHumid.setpreclear();
      zoneFourFiveSixHumid.setpreval(zoneFourFiveSixHumid.getValue());
      zoneFourFiveSixHumid.setClear();
      zoneOneSevenFanONOFF.sethook();
      zoneOneSevenFanONOFF.setClear();
      zoneTwoThreeFanONOFF.sethook();
      zoneTwoThreeFanONOFF.setClear();
      zoneFourFiveSixACONOFF.sethook();
      zoneFourFiveSixACONOFF.setClear();
      zoneOneSevenHeaterONOFF.sethook();
      zoneOneSevenHeaterONOFF.setClear();
      zoneTwoThreeHeaterONOFF.sethook();
      zoneTwoThreeHeaterONOFF.setClear();
      workhrs_1.setClear();
      afterhrs_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        currentTime.gethook();
        zoneOneSevenTemp.gethook();
        zoneTwoThreeTemp.gethook();
        zoneFourFiveSixTemp.gethook();
        zoneOneSevenHumid.gethook();
        zoneTwoThreeHumid.gethook();
        zoneFourFiveSixHumid.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
