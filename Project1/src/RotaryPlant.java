import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.GUI;//sysj\conveyor_plant.sysj line: 1, column: 1

public class RotaryPlant extends ClockDomain{
  public RotaryPlant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal rotaryTableTrigger = new Signal("rotaryTableTrigger", Signal.INPUT);
  public Signal tableAlignedWithSensor = new Signal("tableAlignedWithSensor", Signal.OUTPUT);
  public Signal bottleAtPos5 = new Signal("bottleAtPos5", Signal.OUTPUT);
  public Signal capOnBottleAtPos1 = new Signal("capOnBottleAtPos1", Signal.OUTPUT);
  public Signal tableAlignedWithSensorE = new Signal("tableAlignedWithSensorE", Signal.OUTPUT);
  public Signal capOnBottleAtPos1E = new Signal("capOnBottleAtPos1E", Signal.OUTPUT);
  private int S36133 = 1;
  private int S36113 = 1;
  private int S36107 = 1;
  private int S36131 = 1;
  private int S36121 = 1;
  private int S36129 = 1;
  
  private int[] ends = new int[36];
  private int[] tdone = new int[36];
  
  public void thread36898(int [] tdone, int [] ends){
        switch(S36129){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(capOnBottleAtPos1.getprestatus()){//sysj\conveyor_plant.sysj line: 75, column: 31
          capOnBottleAtPos1E.setPresent();//sysj\conveyor_plant.sysj line: 75, column: 50
          currsigs.addElement(capOnBottleAtPos1E);
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        else {
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        break;
      
    }
  }

  public void thread36897(int [] tdone, int [] ends){
        switch(S36121){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(tableAlignedWithSensor.getprestatus()){//sysj\conveyor_plant.sysj line: 73, column: 31
          tableAlignedWithSensorE.setPresent();//sysj\conveyor_plant.sysj line: 73, column: 55
          currsigs.addElement(tableAlignedWithSensorE);
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        else {
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        break;
      
    }
  }

  public void thread36896(int [] tdone, int [] ends){
        switch(S36131){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        thread36897(tdone,ends);
        thread36898(tdone,ends);
        int biggest36899 = 0;
        if(ends[12]>=biggest36899){
          biggest36899=ends[12];
        }
        if(ends[13]>=biggest36899){
          biggest36899=ends[13];
        }
        if(biggest36899 == 1){
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        //FINXME code
        if(biggest36899 == 0){
          S36131=0;
          active[11]=0;
          ends[11]=0;
          tdone[11]=1;
        }
        break;
      
    }
  }

  public void thread36895(int [] tdone, int [] ends){
        switch(S36113){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S36107){
          case 0 : 
            if(rotaryTableTrigger.getprestatus()){//sysj\conveyor_plant.sysj line: 65, column: 11
              tableAlignedWithSensor.setPresent();//sysj\conveyor_plant.sysj line: 66, column: 5
              currsigs.addElement(tableAlignedWithSensor);
              System.out.println("*Recieved*");//sysj\conveyor_plant.sysj line: 67, column: 14
              S36107=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 1 : 
            S36107=1;
            S36107=0;
            active[10]=1;
            ends[10]=1;
            tdone[10]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread36892(int [] tdone, int [] ends){
        S36129=1;
    if(capOnBottleAtPos1.getprestatus()){//sysj\conveyor_plant.sysj line: 75, column: 31
      capOnBottleAtPos1E.setPresent();//sysj\conveyor_plant.sysj line: 75, column: 50
      currsigs.addElement(capOnBottleAtPos1E);
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
    else {
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread36891(int [] tdone, int [] ends){
        S36121=1;
    if(tableAlignedWithSensor.getprestatus()){//sysj\conveyor_plant.sysj line: 73, column: 31
      tableAlignedWithSensorE.setPresent();//sysj\conveyor_plant.sysj line: 73, column: 55
      currsigs.addElement(tableAlignedWithSensorE);
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
    else {
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread36890(int [] tdone, int [] ends){
        S36131=1;
    thread36891(tdone,ends);
    thread36892(tdone,ends);
    int biggest36893 = 0;
    if(ends[12]>=biggest36893){
      biggest36893=ends[12];
    }
    if(ends[13]>=biggest36893){
      biggest36893=ends[13];
    }
    if(biggest36893 == 1){
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread36889(int [] tdone, int [] ends){
        S36113=1;
    S36107=0;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S36133){
        case 0 : 
          S36133=0;
          break RUN;
        
        case 1 : 
          S36133=2;
          S36133=2;
          thread36889(tdone,ends);
          thread36890(tdone,ends);
          int biggest36894 = 0;
          if(ends[10]>=biggest36894){
            biggest36894=ends[10];
          }
          if(ends[11]>=biggest36894){
            biggest36894=ends[11];
          }
          if(biggest36894 == 1){
            active[9]=1;
            ends[9]=1;
            break RUN;
          }
        
        case 2 : 
          thread36895(tdone,ends);
          thread36896(tdone,ends);
          int biggest36900 = 0;
          if(ends[10]>=biggest36900){
            biggest36900=ends[10];
          }
          if(ends[11]>=biggest36900){
            biggest36900=ends[11];
          }
          if(biggest36900 == 1){
            active[9]=1;
            ends[9]=1;
            break RUN;
          }
          //FINXME code
          if(biggest36900 == 0){
            S36133=0;
            active[9]=0;
            ends[9]=0;
            S36133=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[9] != 0){
      int index = 9;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[9]!=0 || suspended[9]!=0 || active[9]!=1);
      else{
        if(!df){
          rotaryTableTrigger.gethook();
          df = true;
        }
        runClockDomain();
      }
      rotaryTableTrigger.setpreclear();
      tableAlignedWithSensor.setpreclear();
      bottleAtPos5.setpreclear();
      capOnBottleAtPos1.setpreclear();
      tableAlignedWithSensorE.setpreclear();
      capOnBottleAtPos1E.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = rotaryTableTrigger.getStatus() ? rotaryTableTrigger.setprepresent() : rotaryTableTrigger.setpreclear();
      rotaryTableTrigger.setpreval(rotaryTableTrigger.getValue());
      rotaryTableTrigger.setClear();
      tableAlignedWithSensor.sethook();
      tableAlignedWithSensor.setClear();
      bottleAtPos5.sethook();
      bottleAtPos5.setClear();
      capOnBottleAtPos1.sethook();
      capOnBottleAtPos1.setClear();
      tableAlignedWithSensorE.sethook();
      tableAlignedWithSensorE.setClear();
      capOnBottleAtPos1E.sethook();
      capOnBottleAtPos1E.setClear();
      if(paused[9]!=0 || suspended[9]!=0 || active[9]!=1);
      else{
        rotaryTableTrigger.gethook();
      }
      runFinisher();
      if(active[9] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
