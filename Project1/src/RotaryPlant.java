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
  private int S192461 = 1;
  private int S192441 = 1;
  private int S192435 = 1;
  private int S192459 = 1;
  private int S192449 = 1;
  private int S192457 = 1;
  
  private int[] ends = new int[52];
  private int[] tdone = new int[52];
  
  public void thread193773(int [] tdone, int [] ends){
        switch(S192457){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(capOnBottleAtPos1.getprestatus()){//sysj\conveyor_plant.sysj line: 58, column: 31
          capOnBottleAtPos1E.setPresent();//sysj\conveyor_plant.sysj line: 58, column: 50
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

  public void thread193772(int [] tdone, int [] ends){
        switch(S192449){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(tableAlignedWithSensor.getprestatus()){//sysj\conveyor_plant.sysj line: 56, column: 31
          tableAlignedWithSensorE.setPresent();//sysj\conveyor_plant.sysj line: 56, column: 55
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

  public void thread193771(int [] tdone, int [] ends){
        switch(S192459){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        thread193772(tdone,ends);
        thread193773(tdone,ends);
        int biggest193774 = 0;
        if(ends[9]>=biggest193774){
          biggest193774=ends[9];
        }
        if(ends[10]>=biggest193774){
          biggest193774=ends[10];
        }
        if(biggest193774 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        //FINXME code
        if(biggest193774 == 0){
          S192459=0;
          active[8]=0;
          ends[8]=0;
          tdone[8]=1;
        }
        break;
      
    }
  }

  public void thread193770(int [] tdone, int [] ends){
        switch(S192441){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S192435){
          case 0 : 
            if(rotaryTableTrigger.getprestatus()){//sysj\conveyor_plant.sysj line: 48, column: 11
              tableAlignedWithSensor.setPresent();//sysj\conveyor_plant.sysj line: 49, column: 5
              currsigs.addElement(tableAlignedWithSensor);
              System.out.println("*Recieved*");//sysj\conveyor_plant.sysj line: 50, column: 14
              S192435=1;
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
            S192435=1;
            S192435=0;
            active[7]=1;
            ends[7]=1;
            tdone[7]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread193767(int [] tdone, int [] ends){
        S192457=1;
    if(capOnBottleAtPos1.getprestatus()){//sysj\conveyor_plant.sysj line: 58, column: 31
      capOnBottleAtPos1E.setPresent();//sysj\conveyor_plant.sysj line: 58, column: 50
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

  public void thread193766(int [] tdone, int [] ends){
        S192449=1;
    if(tableAlignedWithSensor.getprestatus()){//sysj\conveyor_plant.sysj line: 56, column: 31
      tableAlignedWithSensorE.setPresent();//sysj\conveyor_plant.sysj line: 56, column: 55
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

  public void thread193765(int [] tdone, int [] ends){
        S192459=1;
    thread193766(tdone,ends);
    thread193767(tdone,ends);
    int biggest193768 = 0;
    if(ends[9]>=biggest193768){
      biggest193768=ends[9];
    }
    if(ends[10]>=biggest193768){
      biggest193768=ends[10];
    }
    if(biggest193768 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread193764(int [] tdone, int [] ends){
        S192441=1;
    S192435=0;
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
      switch(S192461){
        case 0 : 
          S192461=0;
          break RUN;
        
        case 1 : 
          S192461=2;
          S192461=2;
          thread193764(tdone,ends);
          thread193765(tdone,ends);
          int biggest193769 = 0;
          if(ends[7]>=biggest193769){
            biggest193769=ends[7];
          }
          if(ends[8]>=biggest193769){
            biggest193769=ends[8];
          }
          if(biggest193769 == 1){
            active[6]=1;
            ends[6]=1;
            break RUN;
          }
        
        case 2 : 
          thread193770(tdone,ends);
          thread193771(tdone,ends);
          int biggest193775 = 0;
          if(ends[7]>=biggest193775){
            biggest193775=ends[7];
          }
          if(ends[8]>=biggest193775){
            biggest193775=ends[8];
          }
          if(biggest193775 == 1){
            active[6]=1;
            ends[6]=1;
            break RUN;
          }
          //FINXME code
          if(biggest193775 == 0){
            S192461=0;
            active[6]=0;
            ends[6]=0;
            S192461=0;
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
