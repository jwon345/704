import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.ECS_GUI;//sysj\ECS_plant.sysj line: 1, column: 1

public class ECS_HVAC_Plant extends ClockDomain{
  public ECS_HVAC_Plant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal zoneOneSevenFanONOFF = new Signal("zoneOneSevenFanONOFF", Signal.INPUT);
  public Signal zoneOneSevenHeaterONOFF = new Signal("zoneOneSevenHeaterONOFF", Signal.INPUT);
  public Signal zoneTwoThreeFanONOFF = new Signal("zoneTwoThreeFanONOFF", Signal.INPUT);
  public Signal zoneTwoThreeHeaterONOFF = new Signal("zoneTwoThreeHeaterONOFF", Signal.INPUT);
  public Signal zoneFourFiveSixACONOFF = new Signal("zoneFourFiveSixACONOFF", Signal.INPUT);
  public Signal zoneOneSevenAtTempHumid = new Signal("zoneOneSevenAtTempHumid", Signal.OUTPUT);
  public Signal zoneTwoThreeAtTempHumid = new Signal("zoneTwoThreeAtTempHumid", Signal.OUTPUT);
  public Signal zoneFourFiveSixAtTempHumid = new Signal("zoneFourFiveSixAtTempHumid", Signal.OUTPUT);
  private int S109656 = 1;
  private int S109582 = 1;
  private int S109590 = 1;
  private int S109598 = 1;
  private int S109606 = 1;
  private int S109614 = 1;
  
  private int[] ends = new int[23];
  private int[] tdone = new int[23];
  
  public void thread109793(int [] tdone, int [] ends){
        switch(S109614){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(zoneFourFiveSixACONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 65, column: 11
          System.out.println("Zone(2,3) Heater - On");//sysj\ECS_plant.sysj line: 67, column: 6
          zoneFourFiveSixAtTempHumid.setPresent();//sysj\ECS_plant.sysj line: 68, column: 6
          currsigs.addElement(zoneFourFiveSixAtTempHumid);
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        else {
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread109792(int [] tdone, int [] ends){
        switch(S109606){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(zoneTwoThreeHeaterONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 52, column: 10
          System.out.println("Zone(2,3) Heater - On");//sysj\ECS_plant.sysj line: 54, column: 5
          zoneTwoThreeAtTempHumid.setPresent();//sysj\ECS_plant.sysj line: 55, column: 5
          currsigs.addElement(zoneTwoThreeAtTempHumid);
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

  public void thread109791(int [] tdone, int [] ends){
        switch(S109598){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(zoneTwoThreeFanONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 40, column: 13
          System.out.println("Zone(2,3) Fan - On");//sysj\ECS_plant.sysj line: 42, column: 7
          zoneTwoThreeAtTempHumid.setPresent();//sysj\ECS_plant.sysj line: 43, column: 7
          currsigs.addElement(zoneTwoThreeAtTempHumid);
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

  public void thread109790(int [] tdone, int [] ends){
        switch(S109590){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        if(zoneOneSevenHeaterONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 28, column: 13
          System.out.println("Zone(1,7) Heater - On");//sysj\ECS_plant.sysj line: 30, column: 7
          zoneOneSevenAtTempHumid.setPresent();//sysj\ECS_plant.sysj line: 31, column: 7
          currsigs.addElement(zoneOneSevenAtTempHumid);
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

  public void thread109789(int [] tdone, int [] ends){
        switch(S109582){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        if(zoneOneSevenFanONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 16, column: 13
          System.out.println("Zone(1,7) Fan - On");//sysj\ECS_plant.sysj line: 18, column: 8
          zoneOneSevenAtTempHumid.setPresent();//sysj\ECS_plant.sysj line: 19, column: 8
          currsigs.addElement(zoneOneSevenAtTempHumid);
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
        else {
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
        break;
      
    }
  }

  public void thread109787(int [] tdone, int [] ends){
        S109614=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread109786(int [] tdone, int [] ends){
        S109606=1;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread109785(int [] tdone, int [] ends){
        S109598=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread109784(int [] tdone, int [] ends){
        S109590=1;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread109783(int [] tdone, int [] ends){
        S109582=1;
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
      switch(S109656){
        case 0 : 
          S109656=0;
          break RUN;
        
        case 1 : 
          S109656=2;
          S109656=2;
          new Thread(new ECS_GUI()).start();//sysj\ECS_plant.sysj line: 11, column: 4
          thread109783(tdone,ends);
          thread109784(tdone,ends);
          thread109785(tdone,ends);
          thread109786(tdone,ends);
          thread109787(tdone,ends);
          int biggest109788 = 0;
          if(ends[2]>=biggest109788){
            biggest109788=ends[2];
          }
          if(ends[3]>=biggest109788){
            biggest109788=ends[3];
          }
          if(ends[4]>=biggest109788){
            biggest109788=ends[4];
          }
          if(ends[5]>=biggest109788){
            biggest109788=ends[5];
          }
          if(ends[6]>=biggest109788){
            biggest109788=ends[6];
          }
          if(biggest109788 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread109789(tdone,ends);
          thread109790(tdone,ends);
          thread109791(tdone,ends);
          thread109792(tdone,ends);
          thread109793(tdone,ends);
          int biggest109794 = 0;
          if(ends[2]>=biggest109794){
            biggest109794=ends[2];
          }
          if(ends[3]>=biggest109794){
            biggest109794=ends[3];
          }
          if(ends[4]>=biggest109794){
            biggest109794=ends[4];
          }
          if(ends[5]>=biggest109794){
            biggest109794=ends[5];
          }
          if(ends[6]>=biggest109794){
            biggest109794=ends[6];
          }
          if(biggest109794 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest109794 == 0){
            S109656=0;
            active[1]=0;
            ends[1]=0;
            S109656=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
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
          zoneOneSevenFanONOFF.gethook();
          zoneOneSevenHeaterONOFF.gethook();
          zoneTwoThreeFanONOFF.gethook();
          zoneTwoThreeHeaterONOFF.gethook();
          zoneFourFiveSixACONOFF.gethook();
          df = true;
        }
        runClockDomain();
      }
      zoneOneSevenFanONOFF.setpreclear();
      zoneOneSevenHeaterONOFF.setpreclear();
      zoneTwoThreeFanONOFF.setpreclear();
      zoneTwoThreeHeaterONOFF.setpreclear();
      zoneFourFiveSixACONOFF.setpreclear();
      zoneOneSevenAtTempHumid.setpreclear();
      zoneTwoThreeAtTempHumid.setpreclear();
      zoneFourFiveSixAtTempHumid.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = zoneOneSevenFanONOFF.getStatus() ? zoneOneSevenFanONOFF.setprepresent() : zoneOneSevenFanONOFF.setpreclear();
      zoneOneSevenFanONOFF.setpreval(zoneOneSevenFanONOFF.getValue());
      zoneOneSevenFanONOFF.setClear();
      dummyint = zoneOneSevenHeaterONOFF.getStatus() ? zoneOneSevenHeaterONOFF.setprepresent() : zoneOneSevenHeaterONOFF.setpreclear();
      zoneOneSevenHeaterONOFF.setpreval(zoneOneSevenHeaterONOFF.getValue());
      zoneOneSevenHeaterONOFF.setClear();
      dummyint = zoneTwoThreeFanONOFF.getStatus() ? zoneTwoThreeFanONOFF.setprepresent() : zoneTwoThreeFanONOFF.setpreclear();
      zoneTwoThreeFanONOFF.setpreval(zoneTwoThreeFanONOFF.getValue());
      zoneTwoThreeFanONOFF.setClear();
      dummyint = zoneTwoThreeHeaterONOFF.getStatus() ? zoneTwoThreeHeaterONOFF.setprepresent() : zoneTwoThreeHeaterONOFF.setpreclear();
      zoneTwoThreeHeaterONOFF.setpreval(zoneTwoThreeHeaterONOFF.getValue());
      zoneTwoThreeHeaterONOFF.setClear();
      dummyint = zoneFourFiveSixACONOFF.getStatus() ? zoneFourFiveSixACONOFF.setprepresent() : zoneFourFiveSixACONOFF.setpreclear();
      zoneFourFiveSixACONOFF.setpreval(zoneFourFiveSixACONOFF.getValue());
      zoneFourFiveSixACONOFF.setClear();
      zoneOneSevenAtTempHumid.sethook();
      zoneOneSevenAtTempHumid.setClear();
      zoneTwoThreeAtTempHumid.sethook();
      zoneTwoThreeAtTempHumid.setClear();
      zoneFourFiveSixAtTempHumid.sethook();
      zoneFourFiveSixAtTempHumid.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        zoneOneSevenFanONOFF.gethook();
        zoneOneSevenHeaterONOFF.gethook();
        zoneTwoThreeFanONOFF.gethook();
        zoneTwoThreeHeaterONOFF.gethook();
        zoneFourFiveSixACONOFF.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
