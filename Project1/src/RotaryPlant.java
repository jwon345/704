import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.GUI;//sysj\rotary_plant.sysj line: 1, column: 1

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
  private int S5128 = 1;
  private int S5044 = 1;
  private int S5038 = 1;
  private int S5081 = 1;
  private int S5052 = 1;
  private int S5046 = 1;
  private int S5060 = 1;
  private int S5068 = 1;
  private int S5079 = 1;
  
  private int[] ends = new int[8];
  private int[] tdone = new int[8];
  
  public void thread5143(int [] tdone, int [] ends){
        switch(S5079){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(rotaryTableTrigger.getprestatus()){//sysj\rotary_plant.sysj line: 28, column: 30
          ;//sysj\rotary_plant.sysj line: 28, column: 50
          rotaryTableTriggerE.setPresent();//sysj\rotary_plant.sysj line: 28, column: 51
          currsigs.addElement(rotaryTableTriggerE);
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
      
    }
  }

  public void thread5142(int [] tdone, int [] ends){
        switch(S5068){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(capOnBottleAtPos1.getprestatus()){//sysj\rotary_plant.sysj line: 26, column: 30
          capOnBottleAtPos1E.setPresent();//sysj\rotary_plant.sysj line: 26, column: 49
          currsigs.addElement(capOnBottleAtPos1E);
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

  public void thread5141(int [] tdone, int [] ends){
        switch(S5060){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(bottleAtPos5.getprestatus()){//sysj\rotary_plant.sysj line: 24, column: 30
          bottleAtPos5E.setPresent();//sysj\rotary_plant.sysj line: 24, column: 44
          currsigs.addElement(bottleAtPos5E);
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

  public void thread5140(int [] tdone, int [] ends){
        switch(S5052){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S5046){
          case 0 : 
            S5046=0;
            if(tableAlignedWithSensor.getprestatus()){//sysj\rotary_plant.sysj line: 22, column: 30
              tableAlignedWithSensorE.setPresent();//sysj\rotary_plant.sysj line: 22, column: 54
              currsigs.addElement(tableAlignedWithSensorE);
              S5046=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S5046=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            S5046=1;
            S5046=0;
            if(tableAlignedWithSensor.getprestatus()){//sysj\rotary_plant.sysj line: 22, column: 30
              tableAlignedWithSensorE.setPresent();//sysj\rotary_plant.sysj line: 22, column: 54
              currsigs.addElement(tableAlignedWithSensorE);
              S5046=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S5046=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread5139(int [] tdone, int [] ends){
        switch(S5081){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread5140(tdone,ends);
        thread5141(tdone,ends);
        thread5142(tdone,ends);
        thread5143(tdone,ends);
        int biggest5144 = 0;
        if(ends[4]>=biggest5144){
          biggest5144=ends[4];
        }
        if(ends[5]>=biggest5144){
          biggest5144=ends[5];
        }
        if(ends[6]>=biggest5144){
          biggest5144=ends[6];
        }
        if(ends[7]>=biggest5144){
          biggest5144=ends[7];
        }
        if(biggest5144 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest5144 == 0){
          S5081=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread5138(int [] tdone, int [] ends){
        switch(S5044){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S5038){
          case 0 : 
            if(rotaryTableTrigger.getprestatus()){//sysj\rotary_plant.sysj line: 14, column: 10
              S5038=1;
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
          
          case 1 : 
            S5038=1;
            tableAlignedWithSensor.setPresent();//sysj\rotary_plant.sysj line: 16, column: 4
            currsigs.addElement(tableAlignedWithSensor);
            System.out.println("*Recieved*");//sysj\rotary_plant.sysj line: 17, column: 13
            S5038=0;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread5135(int [] tdone, int [] ends){
        S5079=1;
    if(rotaryTableTrigger.getprestatus()){//sysj\rotary_plant.sysj line: 28, column: 30
      ;//sysj\rotary_plant.sysj line: 28, column: 50
      rotaryTableTriggerE.setPresent();//sysj\rotary_plant.sysj line: 28, column: 51
      currsigs.addElement(rotaryTableTriggerE);
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread5134(int [] tdone, int [] ends){
        S5068=1;
    if(capOnBottleAtPos1.getprestatus()){//sysj\rotary_plant.sysj line: 26, column: 30
      capOnBottleAtPos1E.setPresent();//sysj\rotary_plant.sysj line: 26, column: 49
      currsigs.addElement(capOnBottleAtPos1E);
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread5133(int [] tdone, int [] ends){
        S5060=1;
    if(bottleAtPos5.getprestatus()){//sysj\rotary_plant.sysj line: 24, column: 30
      bottleAtPos5E.setPresent();//sysj\rotary_plant.sysj line: 24, column: 44
      currsigs.addElement(bottleAtPos5E);
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread5132(int [] tdone, int [] ends){
        S5052=1;
    S5046=0;
    if(tableAlignedWithSensor.getprestatus()){//sysj\rotary_plant.sysj line: 22, column: 30
      tableAlignedWithSensorE.setPresent();//sysj\rotary_plant.sysj line: 22, column: 54
      currsigs.addElement(tableAlignedWithSensorE);
      S5046=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S5046=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread5131(int [] tdone, int [] ends){
        S5081=1;
    thread5132(tdone,ends);
    thread5133(tdone,ends);
    thread5134(tdone,ends);
    thread5135(tdone,ends);
    int biggest5136 = 0;
    if(ends[4]>=biggest5136){
      biggest5136=ends[4];
    }
    if(ends[5]>=biggest5136){
      biggest5136=ends[5];
    }
    if(ends[6]>=biggest5136){
      biggest5136=ends[6];
    }
    if(ends[7]>=biggest5136){
      biggest5136=ends[7];
    }
    if(biggest5136 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread5130(int [] tdone, int [] ends){
        S5044=1;
    S5038=0;
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
      switch(S5128){
        case 0 : 
          S5128=0;
          break RUN;
        
        case 1 : 
          S5128=2;
          S5128=2;
          new Thread(new GUI()).start();//sysj\rotary_plant.sysj line: 10, column: 5
          thread5130(tdone,ends);
          thread5131(tdone,ends);
          int biggest5137 = 0;
          if(ends[2]>=biggest5137){
            biggest5137=ends[2];
          }
          if(ends[3]>=biggest5137){
            biggest5137=ends[3];
          }
          if(biggest5137 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread5138(tdone,ends);
          thread5139(tdone,ends);
          int biggest5145 = 0;
          if(ends[2]>=biggest5145){
            biggest5145=ends[2];
          }
          if(ends[3]>=biggest5145){
            biggest5145=ends[3];
          }
          if(biggest5145 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest5145 == 0){
            S5128=0;
            active[1]=0;
            ends[1]=0;
            S5128=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0};
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
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        rotaryTableTrigger.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
