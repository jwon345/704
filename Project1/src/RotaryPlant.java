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
  public Signal bottleAtPos5E = new Signal("bottleAtPos5E", Signal.OUTPUT);
  public Signal capOnBottleAtPos1E = new Signal("capOnBottleAtPos1E", Signal.OUTPUT);
  public Signal rotaryTableTriggerE = new Signal("rotaryTableTriggerE", Signal.OUTPUT);
  private int S32059 = 1;
  private int S32020 = 1;
  private int S32014 = 1;
  private int S32057 = 1;
  private int S32028 = 1;
  private int S32036 = 1;
  private int S32044 = 1;
  private int S32055 = 1;
  
  private int[] ends = new int[40];
  private int[] tdone = new int[40];
  
  public void thread32612(int [] tdone, int [] ends){
        switch(S32055){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(rotaryTableTrigger.getprestatus()){//sysj\conveyor_plant.sysj line: 83, column: 31
          ;//sysj\conveyor_plant.sysj line: 83, column: 51
          rotaryTableTriggerE.setPresent();//sysj\conveyor_plant.sysj line: 83, column: 52
          currsigs.addElement(rotaryTableTriggerE);
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        else {
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        break;
      
    }
  }

  public void thread32611(int [] tdone, int [] ends){
        switch(S32044){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(capOnBottleAtPos1.getprestatus()){//sysj\conveyor_plant.sysj line: 81, column: 31
          capOnBottleAtPos1E.setPresent();//sysj\conveyor_plant.sysj line: 81, column: 50
          currsigs.addElement(capOnBottleAtPos1E);
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        else {
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        break;
      
    }
  }

  public void thread32610(int [] tdone, int [] ends){
        switch(S32036){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(bottleAtPos5.getprestatus()){//sysj\conveyor_plant.sysj line: 79, column: 31
          bottleAtPos5E.setPresent();//sysj\conveyor_plant.sysj line: 79, column: 45
          currsigs.addElement(bottleAtPos5E);
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

  public void thread32609(int [] tdone, int [] ends){
        switch(S32028){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(tableAlignedWithSensor.getprestatus()){//sysj\conveyor_plant.sysj line: 77, column: 31
          tableAlignedWithSensorE.setPresent();//sysj\conveyor_plant.sysj line: 77, column: 55
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

  public void thread32608(int [] tdone, int [] ends){
        switch(S32057){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        thread32609(tdone,ends);
        thread32610(tdone,ends);
        thread32611(tdone,ends);
        thread32612(tdone,ends);
        int biggest32613 = 0;
        if(ends[12]>=biggest32613){
          biggest32613=ends[12];
        }
        if(ends[13]>=biggest32613){
          biggest32613=ends[13];
        }
        if(ends[14]>=biggest32613){
          biggest32613=ends[14];
        }
        if(ends[15]>=biggest32613){
          biggest32613=ends[15];
        }
        if(biggest32613 == 1){
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        //FINXME code
        if(biggest32613 == 0){
          S32057=0;
          active[11]=0;
          ends[11]=0;
          tdone[11]=1;
        }
        break;
      
    }
  }

  public void thread32607(int [] tdone, int [] ends){
        switch(S32020){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S32014){
          case 0 : 
            if(rotaryTableTrigger.getprestatus()){//sysj\conveyor_plant.sysj line: 69, column: 11
              S32014=1;
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
            S32014=1;
            tableAlignedWithSensor.setPresent();//sysj\conveyor_plant.sysj line: 71, column: 5
            currsigs.addElement(tableAlignedWithSensor);
            System.out.println("*Recieved*");//sysj\conveyor_plant.sysj line: 72, column: 14
            S32014=0;
            active[10]=1;
            ends[10]=1;
            tdone[10]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread32604(int [] tdone, int [] ends){
        S32055=1;
    if(rotaryTableTrigger.getprestatus()){//sysj\conveyor_plant.sysj line: 83, column: 31
      ;//sysj\conveyor_plant.sysj line: 83, column: 51
      rotaryTableTriggerE.setPresent();//sysj\conveyor_plant.sysj line: 83, column: 52
      currsigs.addElement(rotaryTableTriggerE);
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    else {
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread32603(int [] tdone, int [] ends){
        S32044=1;
    if(capOnBottleAtPos1.getprestatus()){//sysj\conveyor_plant.sysj line: 81, column: 31
      capOnBottleAtPos1E.setPresent();//sysj\conveyor_plant.sysj line: 81, column: 50
      currsigs.addElement(capOnBottleAtPos1E);
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread32602(int [] tdone, int [] ends){
        S32036=1;
    if(bottleAtPos5.getprestatus()){//sysj\conveyor_plant.sysj line: 79, column: 31
      bottleAtPos5E.setPresent();//sysj\conveyor_plant.sysj line: 79, column: 45
      currsigs.addElement(bottleAtPos5E);
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

  public void thread32601(int [] tdone, int [] ends){
        S32028=1;
    if(tableAlignedWithSensor.getprestatus()){//sysj\conveyor_plant.sysj line: 77, column: 31
      tableAlignedWithSensorE.setPresent();//sysj\conveyor_plant.sysj line: 77, column: 55
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

  public void thread32600(int [] tdone, int [] ends){
        S32057=1;
    thread32601(tdone,ends);
    thread32602(tdone,ends);
    thread32603(tdone,ends);
    thread32604(tdone,ends);
    int biggest32605 = 0;
    if(ends[12]>=biggest32605){
      biggest32605=ends[12];
    }
    if(ends[13]>=biggest32605){
      biggest32605=ends[13];
    }
    if(ends[14]>=biggest32605){
      biggest32605=ends[14];
    }
    if(ends[15]>=biggest32605){
      biggest32605=ends[15];
    }
    if(biggest32605 == 1){
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread32599(int [] tdone, int [] ends){
        S32020=1;
    S32014=0;
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
      switch(S32059){
        case 0 : 
          S32059=0;
          break RUN;
        
        case 1 : 
          S32059=2;
          S32059=2;
          thread32599(tdone,ends);
          thread32600(tdone,ends);
          int biggest32606 = 0;
          if(ends[10]>=biggest32606){
            biggest32606=ends[10];
          }
          if(ends[11]>=biggest32606){
            biggest32606=ends[11];
          }
          if(biggest32606 == 1){
            active[9]=1;
            ends[9]=1;
            break RUN;
          }
        
        case 2 : 
          thread32607(tdone,ends);
          thread32608(tdone,ends);
          int biggest32614 = 0;
          if(ends[10]>=biggest32614){
            biggest32614=ends[10];
          }
          if(ends[11]>=biggest32614){
            biggest32614=ends[11];
          }
          if(biggest32614 == 1){
            active[9]=1;
            ends[9]=1;
            break RUN;
          }
          //FINXME code
          if(biggest32614 == 0){
            S32059=0;
            active[9]=0;
            ends[9]=0;
            S32059=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
      bottleAtPos5E.setpreclear();
      capOnBottleAtPos1E.setpreclear();
      rotaryTableTriggerE.setpreclear();
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
      bottleAtPos5E.sethook();
      bottleAtPos5E.setClear();
      capOnBottleAtPos1E.sethook();
      capOnBottleAtPos1E.setClear();
      rotaryTableTriggerE.sethook();
      rotaryTableTriggerE.setClear();
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
