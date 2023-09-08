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
  private int S16656 = 1;
  private int S16617 = 1;
  private int S16611 = 1;
  private int S16654 = 1;
  private int S16625 = 1;
  private int S16633 = 1;
  private int S16641 = 1;
  private int S16652 = 1;
  
  private int[] ends = new int[28];
  private int[] tdone = new int[28];
  
  public void thread16792(int [] tdone, int [] ends){
        switch(S16652){
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

  public void thread16791(int [] tdone, int [] ends){
        switch(S16641){
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

  public void thread16790(int [] tdone, int [] ends){
        switch(S16633){
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

  public void thread16789(int [] tdone, int [] ends){
        switch(S16625){
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

  public void thread16788(int [] tdone, int [] ends){
        switch(S16654){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        thread16789(tdone,ends);
        thread16790(tdone,ends);
        thread16791(tdone,ends);
        thread16792(tdone,ends);
        int biggest16793 = 0;
        if(ends[14]>=biggest16793){
          biggest16793=ends[14];
        }
        if(ends[15]>=biggest16793){
          biggest16793=ends[15];
        }
        if(ends[16]>=biggest16793){
          biggest16793=ends[16];
        }
        if(ends[17]>=biggest16793){
          biggest16793=ends[17];
        }
        if(biggest16793 == 1){
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        //FINXME code
        if(biggest16793 == 0){
          S16654=0;
          active[13]=0;
          ends[13]=0;
          tdone[13]=1;
        }
        break;
      
    }
  }

  public void thread16787(int [] tdone, int [] ends){
        switch(S16617){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S16611){
          case 0 : 
            if(rotaryTableTrigger.getprestatus()){//sysj\conveyor_plant.sysj line: 75, column: 11
              S16611=1;
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
            S16611=1;
            tableAlignedWithSensor.setPresent();//sysj\conveyor_plant.sysj line: 77, column: 5
            currsigs.addElement(tableAlignedWithSensor);
            System.out.println("*Recieved*");//sysj\conveyor_plant.sysj line: 78, column: 14
            S16611=0;
            active[12]=1;
            ends[12]=1;
            tdone[12]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread16784(int [] tdone, int [] ends){
        S16652=1;
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

  public void thread16783(int [] tdone, int [] ends){
        S16641=1;
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

  public void thread16782(int [] tdone, int [] ends){
        S16633=1;
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

  public void thread16781(int [] tdone, int [] ends){
        S16625=1;
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

  public void thread16780(int [] tdone, int [] ends){
        S16654=1;
    thread16781(tdone,ends);
    thread16782(tdone,ends);
    thread16783(tdone,ends);
    thread16784(tdone,ends);
    int biggest16785 = 0;
    if(ends[14]>=biggest16785){
      biggest16785=ends[14];
    }
    if(ends[15]>=biggest16785){
      biggest16785=ends[15];
    }
    if(ends[16]>=biggest16785){
      biggest16785=ends[16];
    }
    if(ends[17]>=biggest16785){
      biggest16785=ends[17];
    }
    if(biggest16785 == 1){
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread16779(int [] tdone, int [] ends){
        S16617=1;
    S16611=0;
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
      switch(S16656){
        case 0 : 
          S16656=0;
          break RUN;
        
        case 1 : 
          S16656=2;
          S16656=2;
          thread16779(tdone,ends);
          thread16780(tdone,ends);
          int biggest16786 = 0;
          if(ends[12]>=biggest16786){
            biggest16786=ends[12];
          }
          if(ends[13]>=biggest16786){
            biggest16786=ends[13];
          }
          if(biggest16786 == 1){
            active[11]=1;
            ends[11]=1;
            break RUN;
          }
        
        case 2 : 
          thread16787(tdone,ends);
          thread16788(tdone,ends);
          int biggest16794 = 0;
          if(ends[12]>=biggest16794){
            biggest16794=ends[12];
          }
          if(ends[13]>=biggest16794){
            biggest16794=ends[13];
          }
          if(biggest16794 == 1){
            active[11]=1;
            ends[11]=1;
            break RUN;
          }
          //FINXME code
          if(biggest16794 == 0){
            S16656=0;
            active[11]=0;
            ends[11]=0;
            S16656=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
