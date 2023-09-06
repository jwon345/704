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
  private int S4214 = 1;
  private int S4130 = 1;
  private int S4124 = 1;
  private int S4167 = 1;
  private int S4138 = 1;
  private int S4132 = 1;
  private int S4146 = 1;
  private int S4154 = 1;
  private int S4165 = 1;
  
  private int[] ends = new int[8];
  private int[] tdone = new int[8];
  
  public void thread4229(int [] tdone, int [] ends){
        switch(S4165){
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

  public void thread4228(int [] tdone, int [] ends){
        switch(S4154){
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

  public void thread4227(int [] tdone, int [] ends){
        switch(S4146){
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

  public void thread4226(int [] tdone, int [] ends){
        switch(S4138){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S4132){
          case 0 : 
            S4132=0;
            if(tableAlignedWithSensor.getprestatus()){//sysj\rotary_plant.sysj line: 22, column: 30
              tableAlignedWithSensorE.setPresent();//sysj\rotary_plant.sysj line: 22, column: 54
              currsigs.addElement(tableAlignedWithSensorE);
              S4132=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S4132=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            S4132=1;
            S4132=0;
            if(tableAlignedWithSensor.getprestatus()){//sysj\rotary_plant.sysj line: 22, column: 30
              tableAlignedWithSensorE.setPresent();//sysj\rotary_plant.sysj line: 22, column: 54
              currsigs.addElement(tableAlignedWithSensorE);
              S4132=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S4132=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread4225(int [] tdone, int [] ends){
        switch(S4167){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread4226(tdone,ends);
        thread4227(tdone,ends);
        thread4228(tdone,ends);
        thread4229(tdone,ends);
        int biggest4230 = 0;
        if(ends[4]>=biggest4230){
          biggest4230=ends[4];
        }
        if(ends[5]>=biggest4230){
          biggest4230=ends[5];
        }
        if(ends[6]>=biggest4230){
          biggest4230=ends[6];
        }
        if(ends[7]>=biggest4230){
          biggest4230=ends[7];
        }
        if(biggest4230 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest4230 == 0){
          S4167=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread4224(int [] tdone, int [] ends){
        switch(S4130){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S4124){
          case 0 : 
            if(rotaryTableTrigger.getprestatus()){//sysj\rotary_plant.sysj line: 14, column: 10
              S4124=1;
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
            S4124=1;
            tableAlignedWithSensor.setPresent();//sysj\rotary_plant.sysj line: 16, column: 4
            currsigs.addElement(tableAlignedWithSensor);
            System.out.println("*Recieved*");//sysj\rotary_plant.sysj line: 17, column: 13
            S4124=0;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread4221(int [] tdone, int [] ends){
        S4165=1;
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

  public void thread4220(int [] tdone, int [] ends){
        S4154=1;
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

  public void thread4219(int [] tdone, int [] ends){
        S4146=1;
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

  public void thread4218(int [] tdone, int [] ends){
        S4138=1;
    S4132=0;
    if(tableAlignedWithSensor.getprestatus()){//sysj\rotary_plant.sysj line: 22, column: 30
      tableAlignedWithSensorE.setPresent();//sysj\rotary_plant.sysj line: 22, column: 54
      currsigs.addElement(tableAlignedWithSensorE);
      S4132=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S4132=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread4217(int [] tdone, int [] ends){
        S4167=1;
    thread4218(tdone,ends);
    thread4219(tdone,ends);
    thread4220(tdone,ends);
    thread4221(tdone,ends);
    int biggest4222 = 0;
    if(ends[4]>=biggest4222){
      biggest4222=ends[4];
    }
    if(ends[5]>=biggest4222){
      biggest4222=ends[5];
    }
    if(ends[6]>=biggest4222){
      biggest4222=ends[6];
    }
    if(ends[7]>=biggest4222){
      biggest4222=ends[7];
    }
    if(biggest4222 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread4216(int [] tdone, int [] ends){
        S4130=1;
    S4124=0;
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
      switch(S4214){
        case 0 : 
          S4214=0;
          break RUN;
        
        case 1 : 
          S4214=2;
          S4214=2;
          new Thread(new GUI()).start();//sysj\rotary_plant.sysj line: 10, column: 5
          thread4216(tdone,ends);
          thread4217(tdone,ends);
          int biggest4223 = 0;
          if(ends[2]>=biggest4223){
            biggest4223=ends[2];
          }
          if(ends[3]>=biggest4223){
            biggest4223=ends[3];
          }
          if(biggest4223 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread4224(tdone,ends);
          thread4225(tdone,ends);
          int biggest4231 = 0;
          if(ends[2]>=biggest4231){
            biggest4231=ends[2];
          }
          if(ends[3]>=biggest4231){
            biggest4231=ends[3];
          }
          if(biggest4231 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest4231 == 0){
            S4214=0;
            active[1]=0;
            ends[1]=0;
            S4214=0;
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
