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
  private int S31739 = 1;
  private int S31700 = 1;
  private int S31694 = 1;
  private int S31737 = 1;
  private int S31708 = 1;
  private int S31716 = 1;
  private int S31724 = 1;
  private int S31735 = 1;
  
  private int[] ends = new int[40];
  private int[] tdone = new int[40];
  
  public void thread32894(int [] tdone, int [] ends){
        switch(S31735){
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

  public void thread32893(int [] tdone, int [] ends){
        switch(S31724){
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

  public void thread32892(int [] tdone, int [] ends){
        switch(S31716){
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

  public void thread32891(int [] tdone, int [] ends){
        switch(S31708){
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

  public void thread32890(int [] tdone, int [] ends){
        switch(S31737){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        thread32891(tdone,ends);
        thread32892(tdone,ends);
        thread32893(tdone,ends);
        thread32894(tdone,ends);
        int biggest32895 = 0;
        if(ends[12]>=biggest32895){
          biggest32895=ends[12];
        }
        if(ends[13]>=biggest32895){
          biggest32895=ends[13];
        }
        if(ends[14]>=biggest32895){
          biggest32895=ends[14];
        }
        if(ends[15]>=biggest32895){
          biggest32895=ends[15];
        }
        if(biggest32895 == 1){
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        //FINXME code
        if(biggest32895 == 0){
          S31737=0;
          active[11]=0;
          ends[11]=0;
          tdone[11]=1;
        }
        break;
      
    }
  }

  public void thread32889(int [] tdone, int [] ends){
        switch(S31700){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S31694){
          case 0 : 
            if(rotaryTableTrigger.getprestatus()){//sysj\conveyor_plant.sysj line: 69, column: 11
              S31694=1;
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
            S31694=1;
            tableAlignedWithSensor.setPresent();//sysj\conveyor_plant.sysj line: 71, column: 5
            currsigs.addElement(tableAlignedWithSensor);
            System.out.println("*Recieved*");//sysj\conveyor_plant.sysj line: 72, column: 14
            S31694=0;
            active[10]=1;
            ends[10]=1;
            tdone[10]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread32886(int [] tdone, int [] ends){
        S31735=1;
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

  public void thread32885(int [] tdone, int [] ends){
        S31724=1;
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

  public void thread32884(int [] tdone, int [] ends){
        S31716=1;
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

  public void thread32883(int [] tdone, int [] ends){
        S31708=1;
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

  public void thread32882(int [] tdone, int [] ends){
        S31737=1;
    thread32883(tdone,ends);
    thread32884(tdone,ends);
    thread32885(tdone,ends);
    thread32886(tdone,ends);
    int biggest32887 = 0;
    if(ends[12]>=biggest32887){
      biggest32887=ends[12];
    }
    if(ends[13]>=biggest32887){
      biggest32887=ends[13];
    }
    if(ends[14]>=biggest32887){
      biggest32887=ends[14];
    }
    if(ends[15]>=biggest32887){
      biggest32887=ends[15];
    }
    if(biggest32887 == 1){
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread32881(int [] tdone, int [] ends){
        S31700=1;
    S31694=0;
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
      switch(S31739){
        case 0 : 
          S31739=0;
          break RUN;
        
        case 1 : 
          S31739=2;
          S31739=2;
          thread32881(tdone,ends);
          thread32882(tdone,ends);
          int biggest32888 = 0;
          if(ends[10]>=biggest32888){
            biggest32888=ends[10];
          }
          if(ends[11]>=biggest32888){
            biggest32888=ends[11];
          }
          if(biggest32888 == 1){
            active[9]=1;
            ends[9]=1;
            break RUN;
          }
        
        case 2 : 
          thread32889(tdone,ends);
          thread32890(tdone,ends);
          int biggest32896 = 0;
          if(ends[10]>=biggest32896){
            biggest32896=ends[10];
          }
          if(ends[11]>=biggest32896){
            biggest32896=ends[11];
          }
          if(biggest32896 == 1){
            active[9]=1;
            ends[9]=1;
            break RUN;
          }
          //FINXME code
          if(biggest32896 == 0){
            S31739=0;
            active[9]=0;
            ends[9]=0;
            S31739=0;
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
