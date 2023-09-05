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
  private int S3331 = 1;
  private int S3253 = 1;
  private int S3287 = 1;
  private int S3261 = 1;
  private int S3255 = 1;
  private int S3269 = 1;
  private int S3277 = 1;
  private int S3285 = 1;
  
  private int[] ends = new int[8];
  private int[] tdone = new int[8];
  
  public void thread3346(int [] tdone, int [] ends){
        switch(S3285){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(rotaryTableTrigger.getprestatus()){//sysj\rotary_plant.sysj line: 26, column: 30
          rotaryTableTriggerE.setPresent();//sysj\rotary_plant.sysj line: 26, column: 50
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

  public void thread3345(int [] tdone, int [] ends){
        switch(S3277){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(capOnBottleAtPos1.getprestatus()){//sysj\rotary_plant.sysj line: 24, column: 30
          capOnBottleAtPos1E.setPresent();//sysj\rotary_plant.sysj line: 24, column: 49
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

  public void thread3344(int [] tdone, int [] ends){
        switch(S3269){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(bottleAtPos5.getprestatus()){//sysj\rotary_plant.sysj line: 22, column: 30
          bottleAtPos5E.setPresent();//sysj\rotary_plant.sysj line: 22, column: 44
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

  public void thread3343(int [] tdone, int [] ends){
        switch(S3261){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S3255){
          case 0 : 
            S3255=0;
            if(tableAlignedWithSensor.getprestatus()){//sysj\rotary_plant.sysj line: 20, column: 30
              tableAlignedWithSensorE.setPresent();//sysj\rotary_plant.sysj line: 20, column: 54
              currsigs.addElement(tableAlignedWithSensorE);
              S3255=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S3255=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            S3255=1;
            S3255=0;
            if(tableAlignedWithSensor.getprestatus()){//sysj\rotary_plant.sysj line: 20, column: 30
              tableAlignedWithSensorE.setPresent();//sysj\rotary_plant.sysj line: 20, column: 54
              currsigs.addElement(tableAlignedWithSensorE);
              S3255=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S3255=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread3342(int [] tdone, int [] ends){
        switch(S3287){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread3343(tdone,ends);
        thread3344(tdone,ends);
        thread3345(tdone,ends);
        thread3346(tdone,ends);
        int biggest3347 = 0;
        if(ends[4]>=biggest3347){
          biggest3347=ends[4];
        }
        if(ends[5]>=biggest3347){
          biggest3347=ends[5];
        }
        if(ends[6]>=biggest3347){
          biggest3347=ends[6];
        }
        if(ends[7]>=biggest3347){
          biggest3347=ends[7];
        }
        if(biggest3347 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest3347 == 0){
          S3287=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread3341(int [] tdone, int [] ends){
        switch(S3253){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        if(rotaryTableTrigger.getprestatus()){//sysj\rotary_plant.sysj line: 14, column: 10
          tableAlignedWithSensor.setPresent();//sysj\rotary_plant.sysj line: 15, column: 4
          currsigs.addElement(tableAlignedWithSensor);
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
      
    }
  }

  public void thread3338(int [] tdone, int [] ends){
        S3285=1;
    if(rotaryTableTrigger.getprestatus()){//sysj\rotary_plant.sysj line: 26, column: 30
      rotaryTableTriggerE.setPresent();//sysj\rotary_plant.sysj line: 26, column: 50
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

  public void thread3337(int [] tdone, int [] ends){
        S3277=1;
    if(capOnBottleAtPos1.getprestatus()){//sysj\rotary_plant.sysj line: 24, column: 30
      capOnBottleAtPos1E.setPresent();//sysj\rotary_plant.sysj line: 24, column: 49
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

  public void thread3336(int [] tdone, int [] ends){
        S3269=1;
    if(bottleAtPos5.getprestatus()){//sysj\rotary_plant.sysj line: 22, column: 30
      bottleAtPos5E.setPresent();//sysj\rotary_plant.sysj line: 22, column: 44
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

  public void thread3335(int [] tdone, int [] ends){
        S3261=1;
    S3255=0;
    if(tableAlignedWithSensor.getprestatus()){//sysj\rotary_plant.sysj line: 20, column: 30
      tableAlignedWithSensorE.setPresent();//sysj\rotary_plant.sysj line: 20, column: 54
      currsigs.addElement(tableAlignedWithSensorE);
      S3255=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S3255=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread3334(int [] tdone, int [] ends){
        S3287=1;
    thread3335(tdone,ends);
    thread3336(tdone,ends);
    thread3337(tdone,ends);
    thread3338(tdone,ends);
    int biggest3339 = 0;
    if(ends[4]>=biggest3339){
      biggest3339=ends[4];
    }
    if(ends[5]>=biggest3339){
      biggest3339=ends[5];
    }
    if(ends[6]>=biggest3339){
      biggest3339=ends[6];
    }
    if(ends[7]>=biggest3339){
      biggest3339=ends[7];
    }
    if(biggest3339 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread3333(int [] tdone, int [] ends){
        S3253=1;
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
      switch(S3331){
        case 0 : 
          S3331=0;
          break RUN;
        
        case 1 : 
          S3331=2;
          S3331=2;
          new Thread(new GUI()).start();//sysj\rotary_plant.sysj line: 10, column: 5
          thread3333(tdone,ends);
          thread3334(tdone,ends);
          int biggest3340 = 0;
          if(ends[2]>=biggest3340){
            biggest3340=ends[2];
          }
          if(ends[3]>=biggest3340){
            biggest3340=ends[3];
          }
          if(biggest3340 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread3341(tdone,ends);
          thread3342(tdone,ends);
          int biggest3348 = 0;
          if(ends[2]>=biggest3348){
            biggest3348=ends[2];
          }
          if(ends[3]>=biggest3348){
            biggest3348=ends[3];
          }
          if(biggest3348 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest3348 == 0){
            S3331=0;
            active[1]=0;
            ends[1]=0;
            S3331=0;
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
