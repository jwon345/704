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
  private int S19642 = 1;
  private int S19603 = 1;
  private int S19597 = 1;
  private int S19640 = 1;
  private int S19611 = 1;
  private int S19619 = 1;
  private int S19627 = 1;
  private int S19638 = 1;
  
  private int[] ends = new int[27];
  private int[] tdone = new int[27];
  
  public void thread20065(int [] tdone, int [] ends){
        switch(S19638){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(rotaryTableTrigger.getprestatus()){//sysj\conveyor_plant.sysj line: 89, column: 31
          ;//sysj\conveyor_plant.sysj line: 89, column: 51
          rotaryTableTriggerE.setPresent();//sysj\conveyor_plant.sysj line: 89, column: 52
          currsigs.addElement(rotaryTableTriggerE);
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
        else {
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
        break;
      
    }
  }

  public void thread20064(int [] tdone, int [] ends){
        switch(S19627){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(capOnBottleAtPos1.getprestatus()){//sysj\conveyor_plant.sysj line: 87, column: 31
          capOnBottleAtPos1E.setPresent();//sysj\conveyor_plant.sysj line: 87, column: 50
          currsigs.addElement(capOnBottleAtPos1E);
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
        else {
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
        break;
      
    }
  }

  public void thread20063(int [] tdone, int [] ends){
        switch(S19619){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(bottleAtPos5.getprestatus()){//sysj\conveyor_plant.sysj line: 85, column: 31
          bottleAtPos5E.setPresent();//sysj\conveyor_plant.sysj line: 85, column: 45
          currsigs.addElement(bottleAtPos5E);
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

  public void thread20062(int [] tdone, int [] ends){
        switch(S19611){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(tableAlignedWithSensor.getprestatus()){//sysj\conveyor_plant.sysj line: 83, column: 31
          tableAlignedWithSensorE.setPresent();//sysj\conveyor_plant.sysj line: 83, column: 55
          currsigs.addElement(tableAlignedWithSensorE);
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

  public void thread20061(int [] tdone, int [] ends){
        switch(S19640){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        thread20062(tdone,ends);
        thread20063(tdone,ends);
        thread20064(tdone,ends);
        thread20065(tdone,ends);
        int biggest20066 = 0;
        if(ends[14]>=biggest20066){
          biggest20066=ends[14];
        }
        if(ends[15]>=biggest20066){
          biggest20066=ends[15];
        }
        if(ends[16]>=biggest20066){
          biggest20066=ends[16];
        }
        if(ends[17]>=biggest20066){
          biggest20066=ends[17];
        }
        if(biggest20066 == 1){
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        //FINXME code
        if(biggest20066 == 0){
          S19640=0;
          active[13]=0;
          ends[13]=0;
          tdone[13]=1;
        }
        break;
      
    }
  }

  public void thread20060(int [] tdone, int [] ends){
        switch(S19603){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S19597){
          case 0 : 
            if(rotaryTableTrigger.getprestatus()){//sysj\conveyor_plant.sysj line: 75, column: 11
              S19597=1;
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
          
          case 1 : 
            S19597=1;
            tableAlignedWithSensor.setPresent();//sysj\conveyor_plant.sysj line: 77, column: 5
            currsigs.addElement(tableAlignedWithSensor);
            System.out.println("*Recieved*");//sysj\conveyor_plant.sysj line: 78, column: 14
            S19597=0;
            active[12]=1;
            ends[12]=1;
            tdone[12]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread20057(int [] tdone, int [] ends){
        S19638=1;
    if(rotaryTableTrigger.getprestatus()){//sysj\conveyor_plant.sysj line: 89, column: 31
      ;//sysj\conveyor_plant.sysj line: 89, column: 51
      rotaryTableTriggerE.setPresent();//sysj\conveyor_plant.sysj line: 89, column: 52
      currsigs.addElement(rotaryTableTriggerE);
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
    else {
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
  }

  public void thread20056(int [] tdone, int [] ends){
        S19627=1;
    if(capOnBottleAtPos1.getprestatus()){//sysj\conveyor_plant.sysj line: 87, column: 31
      capOnBottleAtPos1E.setPresent();//sysj\conveyor_plant.sysj line: 87, column: 50
      currsigs.addElement(capOnBottleAtPos1E);
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
    else {
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread20055(int [] tdone, int [] ends){
        S19619=1;
    if(bottleAtPos5.getprestatus()){//sysj\conveyor_plant.sysj line: 85, column: 31
      bottleAtPos5E.setPresent();//sysj\conveyor_plant.sysj line: 85, column: 45
      currsigs.addElement(bottleAtPos5E);
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

  public void thread20054(int [] tdone, int [] ends){
        S19611=1;
    if(tableAlignedWithSensor.getprestatus()){//sysj\conveyor_plant.sysj line: 83, column: 31
      tableAlignedWithSensorE.setPresent();//sysj\conveyor_plant.sysj line: 83, column: 55
      currsigs.addElement(tableAlignedWithSensorE);
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

  public void thread20053(int [] tdone, int [] ends){
        S19640=1;
    thread20054(tdone,ends);
    thread20055(tdone,ends);
    thread20056(tdone,ends);
    thread20057(tdone,ends);
    int biggest20058 = 0;
    if(ends[14]>=biggest20058){
      biggest20058=ends[14];
    }
    if(ends[15]>=biggest20058){
      biggest20058=ends[15];
    }
    if(ends[16]>=biggest20058){
      biggest20058=ends[16];
    }
    if(ends[17]>=biggest20058){
      biggest20058=ends[17];
    }
    if(biggest20058 == 1){
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread20052(int [] tdone, int [] ends){
        S19603=1;
    S19597=0;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S19642){
        case 0 : 
          S19642=0;
          break RUN;
        
        case 1 : 
          S19642=2;
          S19642=2;
          thread20052(tdone,ends);
          thread20053(tdone,ends);
          int biggest20059 = 0;
          if(ends[12]>=biggest20059){
            biggest20059=ends[12];
          }
          if(ends[13]>=biggest20059){
            biggest20059=ends[13];
          }
          if(biggest20059 == 1){
            active[11]=1;
            ends[11]=1;
            break RUN;
          }
        
        case 2 : 
          thread20060(tdone,ends);
          thread20061(tdone,ends);
          int biggest20067 = 0;
          if(ends[12]>=biggest20067){
            biggest20067=ends[12];
          }
          if(ends[13]>=biggest20067){
            biggest20067=ends[13];
          }
          if(biggest20067 == 1){
            active[11]=1;
            ends[11]=1;
            break RUN;
          }
          //FINXME code
          if(biggest20067 == 0){
            S19642=0;
            active[11]=0;
            ends[11]=0;
            S19642=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[11] != 0){
      int index = 11;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[11]!=0 || suspended[11]!=0 || active[11]!=1);
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
      if(paused[11]!=0 || suspended[11]!=0 || active[11]!=1);
      else{
        rotaryTableTrigger.gethook();
      }
      runFinisher();
      if(active[11] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
