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
  private int S108268 = 1;
  private int S108194 = 1;
  private int S108202 = 1;
  private int S108210 = 1;
  private int S108218 = 1;
  private int S108226 = 1;
  
  private int[] ends = new int[23];
  private int[] tdone = new int[23];
  
  public void thread108405(int [] tdone, int [] ends){
        switch(S108226){
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

  public void thread108404(int [] tdone, int [] ends){
        switch(S108218){
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

  public void thread108403(int [] tdone, int [] ends){
        switch(S108210){
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

  public void thread108402(int [] tdone, int [] ends){
        switch(S108202){
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

  public void thread108401(int [] tdone, int [] ends){
        switch(S108194){
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

  public void thread108399(int [] tdone, int [] ends){
        S108226=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread108398(int [] tdone, int [] ends){
        S108218=1;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread108397(int [] tdone, int [] ends){
        S108210=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread108396(int [] tdone, int [] ends){
        S108202=1;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread108395(int [] tdone, int [] ends){
        S108194=1;
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
      switch(S108268){
        case 0 : 
          S108268=0;
          break RUN;
        
        case 1 : 
          S108268=2;
          S108268=2;
          new Thread(new ECS_GUI()).start();//sysj\ECS_plant.sysj line: 11, column: 4
          thread108395(tdone,ends);
          thread108396(tdone,ends);
          thread108397(tdone,ends);
          thread108398(tdone,ends);
          thread108399(tdone,ends);
          int biggest108400 = 0;
          if(ends[2]>=biggest108400){
            biggest108400=ends[2];
          }
          if(ends[3]>=biggest108400){
            biggest108400=ends[3];
          }
          if(ends[4]>=biggest108400){
            biggest108400=ends[4];
          }
          if(ends[5]>=biggest108400){
            biggest108400=ends[5];
          }
          if(ends[6]>=biggest108400){
            biggest108400=ends[6];
          }
          if(biggest108400 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread108401(tdone,ends);
          thread108402(tdone,ends);
          thread108403(tdone,ends);
          thread108404(tdone,ends);
          thread108405(tdone,ends);
          int biggest108406 = 0;
          if(ends[2]>=biggest108406){
            biggest108406=ends[2];
          }
          if(ends[3]>=biggest108406){
            biggest108406=ends[3];
          }
          if(ends[4]>=biggest108406){
            biggest108406=ends[4];
          }
          if(ends[5]>=biggest108406){
            biggest108406=ends[5];
          }
          if(ends[6]>=biggest108406){
            biggest108406=ends[6];
          }
          if(biggest108406 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest108406 == 0){
            S108268=0;
            active[1]=0;
            ends[1]=0;
            S108268=0;
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
