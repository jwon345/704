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
  private int S30451 = 1;
  private int S30412 = 1;
  private int S30406 = 1;
  private int S30449 = 1;
  private int S30420 = 1;
  private int S30428 = 1;
  private int S30436 = 1;
  private int S30447 = 1;
  
  private int[] ends = new int[40];
  private int[] tdone = new int[40];
  
  public void thread31606(int [] tdone, int [] ends){
        switch(S30447){
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

  public void thread31605(int [] tdone, int [] ends){
        switch(S30436){
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

  public void thread31604(int [] tdone, int [] ends){
        switch(S30428){
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

  public void thread31603(int [] tdone, int [] ends){
        switch(S30420){
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

  public void thread31602(int [] tdone, int [] ends){
        switch(S30449){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        thread31603(tdone,ends);
        thread31604(tdone,ends);
        thread31605(tdone,ends);
        thread31606(tdone,ends);
        int biggest31607 = 0;
        if(ends[12]>=biggest31607){
          biggest31607=ends[12];
        }
        if(ends[13]>=biggest31607){
          biggest31607=ends[13];
        }
        if(ends[14]>=biggest31607){
          biggest31607=ends[14];
        }
        if(ends[15]>=biggest31607){
          biggest31607=ends[15];
        }
        if(biggest31607 == 1){
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        //FINXME code
        if(biggest31607 == 0){
          S30449=0;
          active[11]=0;
          ends[11]=0;
          tdone[11]=1;
        }
        break;
      
    }
  }

  public void thread31601(int [] tdone, int [] ends){
        switch(S30412){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S30406){
          case 0 : 
            if(rotaryTableTrigger.getprestatus()){//sysj\conveyor_plant.sysj line: 69, column: 11
              S30406=1;
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
            S30406=1;
            tableAlignedWithSensor.setPresent();//sysj\conveyor_plant.sysj line: 71, column: 5
            currsigs.addElement(tableAlignedWithSensor);
            System.out.println("*Recieved*");//sysj\conveyor_plant.sysj line: 72, column: 14
            S30406=0;
            active[10]=1;
            ends[10]=1;
            tdone[10]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread31598(int [] tdone, int [] ends){
        S30447=1;
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

  public void thread31597(int [] tdone, int [] ends){
        S30436=1;
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

  public void thread31596(int [] tdone, int [] ends){
        S30428=1;
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

  public void thread31595(int [] tdone, int [] ends){
        S30420=1;
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

  public void thread31594(int [] tdone, int [] ends){
        S30449=1;
    thread31595(tdone,ends);
    thread31596(tdone,ends);
    thread31597(tdone,ends);
    thread31598(tdone,ends);
    int biggest31599 = 0;
    if(ends[12]>=biggest31599){
      biggest31599=ends[12];
    }
    if(ends[13]>=biggest31599){
      biggest31599=ends[13];
    }
    if(ends[14]>=biggest31599){
      biggest31599=ends[14];
    }
    if(ends[15]>=biggest31599){
      biggest31599=ends[15];
    }
    if(biggest31599 == 1){
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread31593(int [] tdone, int [] ends){
        S30412=1;
    S30406=0;
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
      switch(S30451){
        case 0 : 
          S30451=0;
          break RUN;
        
        case 1 : 
          S30451=2;
          S30451=2;
          thread31593(tdone,ends);
          thread31594(tdone,ends);
          int biggest31600 = 0;
          if(ends[10]>=biggest31600){
            biggest31600=ends[10];
          }
          if(ends[11]>=biggest31600){
            biggest31600=ends[11];
          }
          if(biggest31600 == 1){
            active[9]=1;
            ends[9]=1;
            break RUN;
          }
        
        case 2 : 
          thread31601(tdone,ends);
          thread31602(tdone,ends);
          int biggest31608 = 0;
          if(ends[10]>=biggest31608){
            biggest31608=ends[10];
          }
          if(ends[11]>=biggest31608){
            biggest31608=ends[11];
          }
          if(biggest31608 == 1){
            active[9]=1;
            ends[9]=1;
            break RUN;
          }
          //FINXME code
          if(biggest31608 == 0){
            S30451=0;
            active[9]=0;
            ends[9]=0;
            S30451=0;
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
