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
  private int S19394 = 1;
  private int S19355 = 1;
  private int S19349 = 1;
  private int S19392 = 1;
  private int S19363 = 1;
  private int S19371 = 1;
  private int S19379 = 1;
  private int S19390 = 1;
  
  private int[] ends = new int[27];
  private int[] tdone = new int[27];
  
  public void thread19817(int [] tdone, int [] ends){
        switch(S19390){
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

  public void thread19816(int [] tdone, int [] ends){
        switch(S19379){
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

  public void thread19815(int [] tdone, int [] ends){
        switch(S19371){
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

  public void thread19814(int [] tdone, int [] ends){
        switch(S19363){
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

  public void thread19813(int [] tdone, int [] ends){
        switch(S19392){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        thread19814(tdone,ends);
        thread19815(tdone,ends);
        thread19816(tdone,ends);
        thread19817(tdone,ends);
        int biggest19818 = 0;
        if(ends[14]>=biggest19818){
          biggest19818=ends[14];
        }
        if(ends[15]>=biggest19818){
          biggest19818=ends[15];
        }
        if(ends[16]>=biggest19818){
          biggest19818=ends[16];
        }
        if(ends[17]>=biggest19818){
          biggest19818=ends[17];
        }
        if(biggest19818 == 1){
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        //FINXME code
        if(biggest19818 == 0){
          S19392=0;
          active[13]=0;
          ends[13]=0;
          tdone[13]=1;
        }
        break;
      
    }
  }

  public void thread19812(int [] tdone, int [] ends){
        switch(S19355){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S19349){
          case 0 : 
            if(rotaryTableTrigger.getprestatus()){//sysj\conveyor_plant.sysj line: 75, column: 11
              S19349=1;
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
            S19349=1;
            tableAlignedWithSensor.setPresent();//sysj\conveyor_plant.sysj line: 77, column: 5
            currsigs.addElement(tableAlignedWithSensor);
            System.out.println("*Recieved*");//sysj\conveyor_plant.sysj line: 78, column: 14
            S19349=0;
            active[12]=1;
            ends[12]=1;
            tdone[12]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread19809(int [] tdone, int [] ends){
        S19390=1;
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

  public void thread19808(int [] tdone, int [] ends){
        S19379=1;
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

  public void thread19807(int [] tdone, int [] ends){
        S19371=1;
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

  public void thread19806(int [] tdone, int [] ends){
        S19363=1;
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

  public void thread19805(int [] tdone, int [] ends){
        S19392=1;
    thread19806(tdone,ends);
    thread19807(tdone,ends);
    thread19808(tdone,ends);
    thread19809(tdone,ends);
    int biggest19810 = 0;
    if(ends[14]>=biggest19810){
      biggest19810=ends[14];
    }
    if(ends[15]>=biggest19810){
      biggest19810=ends[15];
    }
    if(ends[16]>=biggest19810){
      biggest19810=ends[16];
    }
    if(ends[17]>=biggest19810){
      biggest19810=ends[17];
    }
    if(biggest19810 == 1){
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread19804(int [] tdone, int [] ends){
        S19355=1;
    S19349=0;
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
      switch(S19394){
        case 0 : 
          S19394=0;
          break RUN;
        
        case 1 : 
          S19394=2;
          S19394=2;
          thread19804(tdone,ends);
          thread19805(tdone,ends);
          int biggest19811 = 0;
          if(ends[12]>=biggest19811){
            biggest19811=ends[12];
          }
          if(ends[13]>=biggest19811){
            biggest19811=ends[13];
          }
          if(biggest19811 == 1){
            active[11]=1;
            ends[11]=1;
            break RUN;
          }
        
        case 2 : 
          thread19812(tdone,ends);
          thread19813(tdone,ends);
          int biggest19819 = 0;
          if(ends[12]>=biggest19819){
            biggest19819=ends[12];
          }
          if(ends[13]>=biggest19819){
            biggest19819=ends[13];
          }
          if(biggest19819 == 1){
            active[11]=1;
            ends[11]=1;
            break RUN;
          }
          //FINXME code
          if(biggest19819 == 0){
            S19394=0;
            active[11]=0;
            ends[11]=0;
            S19394=0;
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
