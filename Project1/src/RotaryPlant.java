import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

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
  private int S209287 = 1;
  private int S209267 = 1;
  private int S209261 = 1;
  private int S209285 = 1;
  private int S209275 = 1;
  private int S209283 = 1;
  
  private int[] ends = new int[36];
  private int[] tdone = new int[36];
  
  public void thread209859(int [] tdone, int [] ends){
        switch(S209283){
      case 0 : 
        active[35]=0;
        ends[35]=0;
        tdone[35]=1;
        break;
      
      case 1 : 
        if(capOnBottleAtPos1.getprestatus()){//sysj\rotary.sysj line: 270, column: 36
          capOnBottleAtPos1E.setPresent();//sysj\rotary.sysj line: 270, column: 55
          currsigs.addElement(capOnBottleAtPos1E);
          active[35]=1;
          ends[35]=1;
          tdone[35]=1;
        }
        else {
          active[35]=1;
          ends[35]=1;
          tdone[35]=1;
        }
        break;
      
    }
  }

  public void thread209858(int [] tdone, int [] ends){
        switch(S209275){
      case 0 : 
        active[34]=0;
        ends[34]=0;
        tdone[34]=1;
        break;
      
      case 1 : 
        if(tableAlignedWithSensor.getprestatus()){//sysj\rotary.sysj line: 268, column: 36
          tableAlignedWithSensorE.setPresent();//sysj\rotary.sysj line: 268, column: 60
          currsigs.addElement(tableAlignedWithSensorE);
          active[34]=1;
          ends[34]=1;
          tdone[34]=1;
        }
        else {
          active[34]=1;
          ends[34]=1;
          tdone[34]=1;
        }
        break;
      
    }
  }

  public void thread209857(int [] tdone, int [] ends){
        switch(S209285){
      case 0 : 
        active[33]=0;
        ends[33]=0;
        tdone[33]=1;
        break;
      
      case 1 : 
        thread209858(tdone,ends);
        thread209859(tdone,ends);
        int biggest209860 = 0;
        if(ends[34]>=biggest209860){
          biggest209860=ends[34];
        }
        if(ends[35]>=biggest209860){
          biggest209860=ends[35];
        }
        if(biggest209860 == 1){
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
        //FINXME code
        if(biggest209860 == 0){
          S209285=0;
          active[33]=0;
          ends[33]=0;
          tdone[33]=1;
        }
        break;
      
    }
  }

  public void thread209856(int [] tdone, int [] ends){
        switch(S209267){
      case 0 : 
        active[32]=0;
        ends[32]=0;
        tdone[32]=1;
        break;
      
      case 1 : 
        switch(S209261){
          case 0 : 
            if(rotaryTableTrigger.getprestatus()){//sysj\rotary.sysj line: 261, column: 16
              tableAlignedWithSensor.setPresent();//sysj\rotary.sysj line: 262, column: 10
              currsigs.addElement(tableAlignedWithSensor);
              S209261=1;
              active[32]=1;
              ends[32]=1;
              tdone[32]=1;
            }
            else {
              active[32]=1;
              ends[32]=1;
              tdone[32]=1;
            }
            break;
          
          case 1 : 
            S209261=1;
            S209261=0;
            active[32]=1;
            ends[32]=1;
            tdone[32]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread209853(int [] tdone, int [] ends){
        S209283=1;
    if(capOnBottleAtPos1.getprestatus()){//sysj\rotary.sysj line: 270, column: 36
      capOnBottleAtPos1E.setPresent();//sysj\rotary.sysj line: 270, column: 55
      currsigs.addElement(capOnBottleAtPos1E);
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    else {
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread209852(int [] tdone, int [] ends){
        S209275=1;
    if(tableAlignedWithSensor.getprestatus()){//sysj\rotary.sysj line: 268, column: 36
      tableAlignedWithSensorE.setPresent();//sysj\rotary.sysj line: 268, column: 60
      currsigs.addElement(tableAlignedWithSensorE);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread209851(int [] tdone, int [] ends){
        S209285=1;
    thread209852(tdone,ends);
    thread209853(tdone,ends);
    int biggest209854 = 0;
    if(ends[34]>=biggest209854){
      biggest209854=ends[34];
    }
    if(ends[35]>=biggest209854){
      biggest209854=ends[35];
    }
    if(biggest209854 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
  }

  public void thread209850(int [] tdone, int [] ends){
        S209267=1;
    S209261=0;
    active[32]=1;
    ends[32]=1;
    tdone[32]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S209287){
        case 0 : 
          S209287=0;
          break RUN;
        
        case 1 : 
          S209287=2;
          S209287=2;
          thread209850(tdone,ends);
          thread209851(tdone,ends);
          int biggest209855 = 0;
          if(ends[32]>=biggest209855){
            biggest209855=ends[32];
          }
          if(ends[33]>=biggest209855){
            biggest209855=ends[33];
          }
          if(biggest209855 == 1){
            active[31]=1;
            ends[31]=1;
            break RUN;
          }
        
        case 2 : 
          thread209856(tdone,ends);
          thread209857(tdone,ends);
          int biggest209861 = 0;
          if(ends[32]>=biggest209861){
            biggest209861=ends[32];
          }
          if(ends[33]>=biggest209861){
            biggest209861=ends[33];
          }
          if(biggest209861 == 1){
            active[31]=1;
            ends[31]=1;
            break RUN;
          }
          //FINXME code
          if(biggest209861 == 0){
            S209287=0;
            active[31]=0;
            ends[31]=0;
            S209287=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[31] != 0){
      int index = 31;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[31]!=0 || suspended[31]!=0 || active[31]!=1);
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
      if(paused[31]!=0 || suspended[31]!=0 || active[31]!=1);
      else{
        rotaryTableTrigger.gethook();
      }
      runFinisher();
      if(active[31] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
