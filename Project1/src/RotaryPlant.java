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
  public Signal capOnBottleAtPos1E = new Signal("capOnBottleAtPos1E", Signal.OUTPUT);
  private int S213287 = 1;
  private int S213267 = 1;
  private int S213261 = 1;
  private int S213285 = 1;
  private int S213275 = 1;
  private int S213283 = 1;
  
  private int[] ends = new int[49];
  private int[] tdone = new int[49];
  
  public void thread214592(int [] tdone, int [] ends){
        switch(S213283){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(capOnBottleAtPos1.getprestatus()){//sysj\conveyor_plant.sysj line: 75, column: 31
          capOnBottleAtPos1E.setPresent();//sysj\conveyor_plant.sysj line: 75, column: 50
          currsigs.addElement(capOnBottleAtPos1E);
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

  public void thread214591(int [] tdone, int [] ends){
        switch(S213275){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(tableAlignedWithSensor.getprestatus()){//sysj\conveyor_plant.sysj line: 73, column: 31
          tableAlignedWithSensorE.setPresent();//sysj\conveyor_plant.sysj line: 73, column: 55
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

  public void thread214590(int [] tdone, int [] ends){
        switch(S213285){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        thread214591(tdone,ends);
        thread214592(tdone,ends);
        int biggest214593 = 0;
        if(ends[12]>=biggest214593){
          biggest214593=ends[12];
        }
        if(ends[13]>=biggest214593){
          biggest214593=ends[13];
        }
        if(biggest214593 == 1){
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        //FINXME code
        if(biggest214593 == 0){
          S213285=0;
          active[11]=0;
          ends[11]=0;
          tdone[11]=1;
        }
        break;
      
    }
  }

  public void thread214589(int [] tdone, int [] ends){
        switch(S213267){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S213261){
          case 0 : 
            if(rotaryTableTrigger.getprestatus()){//sysj\conveyor_plant.sysj line: 65, column: 11
              tableAlignedWithSensor.setPresent();//sysj\conveyor_plant.sysj line: 66, column: 5
              currsigs.addElement(tableAlignedWithSensor);
              System.out.println("*Recieved*");//sysj\conveyor_plant.sysj line: 67, column: 14
              S213261=1;
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
            S213261=1;
            S213261=0;
            active[10]=1;
            ends[10]=1;
            tdone[10]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread214586(int [] tdone, int [] ends){
        S213283=1;
    if(capOnBottleAtPos1.getprestatus()){//sysj\conveyor_plant.sysj line: 75, column: 31
      capOnBottleAtPos1E.setPresent();//sysj\conveyor_plant.sysj line: 75, column: 50
      currsigs.addElement(capOnBottleAtPos1E);
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

  public void thread214585(int [] tdone, int [] ends){
        S213275=1;
    if(tableAlignedWithSensor.getprestatus()){//sysj\conveyor_plant.sysj line: 73, column: 31
      tableAlignedWithSensorE.setPresent();//sysj\conveyor_plant.sysj line: 73, column: 55
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

  public void thread214584(int [] tdone, int [] ends){
        S213285=1;
    thread214585(tdone,ends);
    thread214586(tdone,ends);
    int biggest214587 = 0;
    if(ends[12]>=biggest214587){
      biggest214587=ends[12];
    }
    if(ends[13]>=biggest214587){
      biggest214587=ends[13];
    }
    if(biggest214587 == 1){
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread214583(int [] tdone, int [] ends){
        S213267=1;
    S213261=0;
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
      switch(S213287){
        case 0 : 
          S213287=0;
          break RUN;
        
        case 1 : 
          S213287=2;
          S213287=2;
          thread214583(tdone,ends);
          thread214584(tdone,ends);
          int biggest214588 = 0;
          if(ends[10]>=biggest214588){
            biggest214588=ends[10];
          }
          if(ends[11]>=biggest214588){
            biggest214588=ends[11];
          }
          if(biggest214588 == 1){
            active[9]=1;
            ends[9]=1;
            break RUN;
          }
        
        case 2 : 
          thread214589(tdone,ends);
          thread214590(tdone,ends);
          int biggest214594 = 0;
          if(ends[10]>=biggest214594){
            biggest214594=ends[10];
          }
          if(ends[11]>=biggest214594){
            biggest214594=ends[11];
          }
          if(biggest214594 == 1){
            active[9]=1;
            ends[9]=1;
            break RUN;
          }
          //FINXME code
          if(biggest214594 == 0){
            S213287=0;
            active[9]=0;
            ends[9]=0;
            S213287=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
