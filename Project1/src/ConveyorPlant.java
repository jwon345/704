import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.GUI;//sysj\conveyor_plant.sysj line: 1, column: 1

public class ConveyorPlant extends ClockDomain{
  public ConveyorPlant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal motConveyorOnOff = new Signal("motConveyorOnOff", Signal.INPUT);
  public Signal bottleAtPos1 = new Signal("bottleAtPos1", Signal.OUTPUT);
  public Signal bottleLeftPos5 = new Signal("bottleLeftPos5", Signal.OUTPUT);
  public Signal motConveyorOnOffE = new Signal("motConveyorOnOffE", Signal.OUTPUT);
  public Signal bottleAtPos1E = new Signal("bottleAtPos1E", Signal.OUTPUT);
  public Signal bottleLeftPos5E = new Signal("bottleLeftPos5E", Signal.OUTPUT);
  private long __start_thread_7;//sysj\conveyor_plant.sysj line: 38, column: 26
  private int S39033 = 1;
  private int S38839 = 1;
  private int S38833 = 1;
  private int S38931 = 1;
  private int S38847 = 1;
  private int S38841 = 1;
  private int S38921 = 1;
  private int S38871 = 1;
  private int S38852 = 1;
  private int S38868 = 1;
  private int S38929 = 1;
  
  private int[] ends = new int[38];
  private int[] tdone = new int[38];
  
  public void thread40200(int [] tdone, int [] ends){
        switch(S38929){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(bottleLeftPos5.getprestatus()){//sysj\conveyor_plant.sysj line: 48, column: 31
          bottleLeftPos5E.setPresent();//sysj\conveyor_plant.sysj line: 48, column: 47
          currsigs.addElement(bottleLeftPos5E);
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        else {
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        break;
      
    }
  }

  public void thread40198(int [] tdone, int [] ends){
        S38868=1;
    __start_thread_7 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 38, column: 26
    if(com.systemj.Timer.getMs() - __start_thread_7 >= 500){//sysj\conveyor_plant.sysj line: 38, column: 26
      ends[7]=3;
      ;//sysj\conveyor_plant.sysj line: 38, column: 26
      ends[7]=2;
      tdone[7]=1;
    }
    else {
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread40197(int [] tdone, int [] ends){
        S38852=1;
    bottleAtPos1E.setPresent();//sysj\conveyor_plant.sysj line: 35, column: 30
    currsigs.addElement(bottleAtPos1E);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread40195(int [] tdone, int [] ends){
        switch(S38868){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_7 >= 500){//sysj\conveyor_plant.sysj line: 38, column: 26
          ends[7]=3;
          ;//sysj\conveyor_plant.sysj line: 38, column: 26
          ends[7]=2;
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

  public void thread40194(int [] tdone, int [] ends){
        switch(S38852){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        bottleAtPos1E.setPresent();//sysj\conveyor_plant.sysj line: 35, column: 30
        currsigs.addElement(bottleAtPos1E);
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
        break;
      
    }
  }

  public void thread40193(int [] tdone, int [] ends){
        switch(S38921){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S38871){
          case 0 : 
            thread40194(tdone,ends);
            thread40195(tdone,ends);
            int biggest40196 = 0;
            if(ends[6]>=biggest40196){
              biggest40196=ends[6];
            }
            if(ends[7]>=biggest40196){
              biggest40196=ends[7];
            }
            if(biggest40196 == 1){
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            if(biggest40196 == 2){
              ends[5]=2;
              ;//sysj\conveyor_plant.sysj line: 33, column: 22
              S38871=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            //FINXME code
            if(biggest40196 == 0){
              S38871=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            S38871=1;
            S38871=0;
            if(bottleAtPos1.getprestatus()){//sysj\conveyor_plant.sysj line: 32, column: 26
              thread40197(tdone,ends);
              thread40198(tdone,ends);
              int biggest40199 = 0;
              if(ends[6]>=biggest40199){
                biggest40199=ends[6];
              }
              if(ends[7]>=biggest40199){
                biggest40199=ends[7];
              }
              if(biggest40199 == 1){
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              if(biggest40199 == 2){
                ends[5]=2;
                ;//sysj\conveyor_plant.sysj line: 33, column: 22
                S38871=1;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
            }
            else {
              S38871=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread40192(int [] tdone, int [] ends){
        switch(S38847){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S38841){
          case 0 : 
            S38841=0;
            if(motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 28, column: 31
              motConveyorOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 28, column: 49
              currsigs.addElement(motConveyorOnOffE);
              S38841=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S38841=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            S38841=1;
            S38841=0;
            if(motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 28, column: 31
              motConveyorOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 28, column: 49
              currsigs.addElement(motConveyorOnOffE);
              S38841=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S38841=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread40191(int [] tdone, int [] ends){
        switch(S38931){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread40192(tdone,ends);
        thread40193(tdone,ends);
        thread40200(tdone,ends);
        int biggest40201 = 0;
        if(ends[4]>=biggest40201){
          biggest40201=ends[4];
        }
        if(ends[5]>=biggest40201){
          biggest40201=ends[5];
        }
        if(ends[8]>=biggest40201){
          biggest40201=ends[8];
        }
        if(biggest40201 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest40201 == 0){
          S38931=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread40190(int [] tdone, int [] ends){
        switch(S38839){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S38833){
          case 0 : 
            if(motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 15, column: 16
              bottleAtPos1.setPresent();//sysj\conveyor_plant.sysj line: 17, column: 10
              currsigs.addElement(bottleAtPos1);
              S38833=1;
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
            S38833=1;
            S38833=0;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread40187(int [] tdone, int [] ends){
        S38929=1;
    if(bottleLeftPos5.getprestatus()){//sysj\conveyor_plant.sysj line: 48, column: 31
      bottleLeftPos5E.setPresent();//sysj\conveyor_plant.sysj line: 48, column: 47
      currsigs.addElement(bottleLeftPos5E);
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread40185(int [] tdone, int [] ends){
        S38868=1;
    __start_thread_7 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 38, column: 26
    if(com.systemj.Timer.getMs() - __start_thread_7 >= 500){//sysj\conveyor_plant.sysj line: 38, column: 26
      ends[7]=3;
      ;//sysj\conveyor_plant.sysj line: 38, column: 26
      ends[7]=2;
      tdone[7]=1;
    }
    else {
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread40184(int [] tdone, int [] ends){
        S38852=1;
    bottleAtPos1E.setPresent();//sysj\conveyor_plant.sysj line: 35, column: 30
    currsigs.addElement(bottleAtPos1E);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread40183(int [] tdone, int [] ends){
        S38921=1;
    S38871=0;
    if(bottleAtPos1.getprestatus()){//sysj\conveyor_plant.sysj line: 32, column: 26
      thread40184(tdone,ends);
      thread40185(tdone,ends);
      int biggest40186 = 0;
      if(ends[6]>=biggest40186){
        biggest40186=ends[6];
      }
      if(ends[7]>=biggest40186){
        biggest40186=ends[7];
      }
      if(biggest40186 == 1){
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
      if(biggest40186 == 2){
        ends[5]=2;
        ;//sysj\conveyor_plant.sysj line: 33, column: 22
        S38871=1;
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
    }
    else {
      S38871=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread40182(int [] tdone, int [] ends){
        S38847=1;
    S38841=0;
    if(motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 28, column: 31
      motConveyorOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 28, column: 49
      currsigs.addElement(motConveyorOnOffE);
      S38841=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S38841=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread40181(int [] tdone, int [] ends){
        S38931=1;
    thread40182(tdone,ends);
    thread40183(tdone,ends);
    thread40187(tdone,ends);
    int biggest40188 = 0;
    if(ends[4]>=biggest40188){
      biggest40188=ends[4];
    }
    if(ends[5]>=biggest40188){
      biggest40188=ends[5];
    }
    if(ends[8]>=biggest40188){
      biggest40188=ends[8];
    }
    if(biggest40188 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread40180(int [] tdone, int [] ends){
        S38839=1;
    S38833=0;
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
      switch(S39033){
        case 0 : 
          S39033=0;
          break RUN;
        
        case 1 : 
          S39033=2;
          S39033=2;
          new Thread(new GUI()).start();//sysj\conveyor_plant.sysj line: 11, column: 2
          thread40180(tdone,ends);
          thread40181(tdone,ends);
          int biggest40189 = 0;
          if(ends[2]>=biggest40189){
            biggest40189=ends[2];
          }
          if(ends[3]>=biggest40189){
            biggest40189=ends[3];
          }
          if(biggest40189 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread40190(tdone,ends);
          thread40191(tdone,ends);
          int biggest40202 = 0;
          if(ends[2]>=biggest40202){
            biggest40202=ends[2];
          }
          if(ends[3]>=biggest40202){
            biggest40202=ends[3];
          }
          if(biggest40202 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest40202 == 0){
            S39033=0;
            active[1]=0;
            ends[1]=0;
            S39033=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
          motConveyorOnOff.gethook();
          df = true;
        }
        runClockDomain();
      }
      motConveyorOnOff.setpreclear();
      bottleAtPos1.setpreclear();
      bottleLeftPos5.setpreclear();
      motConveyorOnOffE.setpreclear();
      bottleAtPos1E.setpreclear();
      bottleLeftPos5E.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = motConveyorOnOff.getStatus() ? motConveyorOnOff.setprepresent() : motConveyorOnOff.setpreclear();
      motConveyorOnOff.setpreval(motConveyorOnOff.getValue());
      motConveyorOnOff.setClear();
      bottleAtPos1.sethook();
      bottleAtPos1.setClear();
      bottleLeftPos5.sethook();
      bottleLeftPos5.setClear();
      motConveyorOnOffE.sethook();
      motConveyorOnOffE.setClear();
      bottleAtPos1E.sethook();
      bottleAtPos1E.setClear();
      bottleLeftPos5E.sethook();
      bottleLeftPos5E.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        motConveyorOnOff.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
