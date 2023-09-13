import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.GUI;//sysj\conveyor_plant.sysj line: 1, column: 1
import run.socketListener;//sysj\conveyor_plant.sysj line: 2, column: 1

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
  private int S192486 = 1;
  private int S192466 = 1;
  private int S192460 = 1;
  private int S192484 = 1;
  private int S192474 = 1;
  private int S192482 = 1;
  
  private int[] ends = new int[52];
  private int[] tdone = new int[52];
  
  public void thread193798(int [] tdone, int [] ends){
        switch(S192482){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(capOnBottleAtPos1.getprestatus()){//sysj\conveyor_plant.sysj line: 57, column: 31
          capOnBottleAtPos1E.setPresent();//sysj\conveyor_plant.sysj line: 57, column: 50
          currsigs.addElement(capOnBottleAtPos1E);
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
      
    }
  }

  public void thread193797(int [] tdone, int [] ends){
        switch(S192474){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(tableAlignedWithSensor.getprestatus()){//sysj\conveyor_plant.sysj line: 55, column: 31
          tableAlignedWithSensorE.setPresent();//sysj\conveyor_plant.sysj line: 55, column: 55
          currsigs.addElement(tableAlignedWithSensorE);
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        else {
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        break;
      
    }
  }

  public void thread193796(int [] tdone, int [] ends){
        switch(S192484){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        thread193797(tdone,ends);
        thread193798(tdone,ends);
        int biggest193799 = 0;
        if(ends[9]>=biggest193799){
          biggest193799=ends[9];
        }
        if(ends[10]>=biggest193799){
          biggest193799=ends[10];
        }
        if(biggest193799 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        //FINXME code
        if(biggest193799 == 0){
          S192484=0;
          active[8]=0;
          ends[8]=0;
          tdone[8]=1;
        }
        break;
      
    }
  }

  public void thread193795(int [] tdone, int [] ends){
        switch(S192466){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S192460){
          case 0 : 
            if(rotaryTableTrigger.getprestatus()){//sysj\conveyor_plant.sysj line: 48, column: 11
              tableAlignedWithSensor.setPresent();//sysj\conveyor_plant.sysj line: 49, column: 5
              currsigs.addElement(tableAlignedWithSensor);
              S192460=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            S192460=1;
            S192460=0;
            active[7]=1;
            ends[7]=1;
            tdone[7]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread193792(int [] tdone, int [] ends){
        S192482=1;
    if(capOnBottleAtPos1.getprestatus()){//sysj\conveyor_plant.sysj line: 57, column: 31
      capOnBottleAtPos1E.setPresent();//sysj\conveyor_plant.sysj line: 57, column: 50
      currsigs.addElement(capOnBottleAtPos1E);
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread193791(int [] tdone, int [] ends){
        S192474=1;
    if(tableAlignedWithSensor.getprestatus()){//sysj\conveyor_plant.sysj line: 55, column: 31
      tableAlignedWithSensorE.setPresent();//sysj\conveyor_plant.sysj line: 55, column: 55
      currsigs.addElement(tableAlignedWithSensorE);
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread193790(int [] tdone, int [] ends){
        S192484=1;
    thread193791(tdone,ends);
    thread193792(tdone,ends);
    int biggest193793 = 0;
    if(ends[9]>=biggest193793){
      biggest193793=ends[9];
    }
    if(ends[10]>=biggest193793){
      biggest193793=ends[10];
    }
    if(biggest193793 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread193789(int [] tdone, int [] ends){
        S192466=1;
    S192460=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S192486){
        case 0 : 
          S192486=0;
          break RUN;
        
        case 1 : 
          S192486=2;
          S192486=2;
          thread193789(tdone,ends);
          thread193790(tdone,ends);
          int biggest193794 = 0;
          if(ends[7]>=biggest193794){
            biggest193794=ends[7];
          }
          if(ends[8]>=biggest193794){
            biggest193794=ends[8];
          }
          if(biggest193794 == 1){
            active[6]=1;
            ends[6]=1;
            break RUN;
          }
        
        case 2 : 
          thread193795(tdone,ends);
          thread193796(tdone,ends);
          int biggest193800 = 0;
          if(ends[7]>=biggest193800){
            biggest193800=ends[7];
          }
          if(ends[8]>=biggest193800){
            biggest193800=ends[8];
          }
          if(biggest193800 == 1){
            active[6]=1;
            ends[6]=1;
            break RUN;
          }
          //FINXME code
          if(biggest193800 == 0){
            S192486=0;
            active[6]=0;
            ends[6]=0;
            S192486=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[6] != 0){
      int index = 6;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[6]!=0 || suspended[6]!=0 || active[6]!=1);
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
      if(paused[6]!=0 || suspended[6]!=0 || active[6]!=1);
      else{
        rotaryTableTrigger.gethook();
      }
      runFinisher();
      if(active[6] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
