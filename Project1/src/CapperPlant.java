import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.GUI;//sysj\conveyor_plant.sysj line: 1, column: 1

public class CapperPlant extends ClockDomain{
  public CapperPlant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal cylPos5ZaxisExtend = new Signal("cylPos5ZaxisExtend", Signal.INPUT);
  public Signal gripperTurnRetract = new Signal("gripperTurnRetract", Signal.INPUT);
  public Signal gripperTurnExtend = new Signal("gripperTurnExtend", Signal.INPUT);
  public Signal capGripperPos5Extend = new Signal("capGripperPos5Extend", Signal.INPUT);
  public Signal cylClampBottleExtend = new Signal("cylClampBottleExtend", Signal.INPUT);
  public Signal gripperZAxisLowered = new Signal("gripperZAxisLowered", Signal.OUTPUT);
  public Signal gripperZAxisLifted = new Signal("gripperZAxisLifted", Signal.OUTPUT);
  public Signal gripperTurnHomePos = new Signal("gripperTurnHomePos", Signal.OUTPUT);
  public Signal gripperTurnFinalPos = new Signal("gripperTurnFinalPos", Signal.OUTPUT);
  public Signal cylPos5ZaxisExtendE = new Signal("cylPos5ZaxisExtendE", Signal.OUTPUT);
  public Signal gripperTurnRetractE = new Signal("gripperTurnRetractE", Signal.OUTPUT);
  public Signal gripperTurnExtendE = new Signal("gripperTurnExtendE", Signal.OUTPUT);
  public Signal capGripperPos5ExtendE = new Signal("capGripperPos5ExtendE", Signal.OUTPUT);
  public Signal cylClampBottleExtendE = new Signal("cylClampBottleExtendE", Signal.OUTPUT);
  public Signal gripperZAxisLoweredE = new Signal("gripperZAxisLoweredE", Signal.OUTPUT);
  public Signal gripperZAxisLiftedE = new Signal("gripperZAxisLiftedE", Signal.OUTPUT);
  public Signal gripperTurnHomePosE = new Signal("gripperTurnHomePosE", Signal.OUTPUT);
  public Signal gripperTurnFinalPosE = new Signal("gripperTurnFinalPosE", Signal.OUTPUT);
  private long __start_thread_24;//sysj\conveyor_plant.sysj line: 139, column: 7
  private int S48683 = 1;
  private int S48606 = 1;
  private int S48332 = 1;
  private int S48681 = 1;
  private int S48615 = 1;
  private int S48623 = 1;
  private int S48631 = 1;
  private int S48639 = 1;
  private int S48647 = 1;
  private int S48655 = 1;
  private int S48663 = 1;
  private int S48671 = 1;
  private int S48679 = 1;
  
  private int[] ends = new int[49];
  private int[] tdone = new int[49];
  
  public void thread49429(int [] tdone, int [] ends){
        switch(S48679){
      case 0 : 
        active[35]=0;
        ends[35]=0;
        tdone[35]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_plant.sysj line: 188, column: 35
          gripperTurnFinalPosE.setPresent();//sysj\conveyor_plant.sysj line: 188, column: 56
          currsigs.addElement(gripperTurnFinalPosE);
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

  public void thread49428(int [] tdone, int [] ends){
        switch(S48671){
      case 0 : 
        active[34]=0;
        ends[34]=0;
        tdone[34]=1;
        break;
      
      case 1 : 
        if(gripperTurnHomePos.getprestatus()){//sysj\conveyor_plant.sysj line: 186, column: 35
          gripperTurnHomePosE.setPresent();//sysj\conveyor_plant.sysj line: 186, column: 55
          currsigs.addElement(gripperTurnHomePosE);
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

  public void thread49427(int [] tdone, int [] ends){
        switch(S48663){
      case 0 : 
        active[33]=0;
        ends[33]=0;
        tdone[33]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_plant.sysj line: 184, column: 35
          gripperZAxisLiftedE.setPresent();//sysj\conveyor_plant.sysj line: 184, column: 55
          currsigs.addElement(gripperZAxisLiftedE);
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
        else {
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
        break;
      
    }
  }

  public void thread49426(int [] tdone, int [] ends){
        switch(S48655){
      case 0 : 
        active[32]=0;
        ends[32]=0;
        tdone[32]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLowered.getprestatus()){//sysj\conveyor_plant.sysj line: 182, column: 35
          gripperZAxisLoweredE.setPresent();//sysj\conveyor_plant.sysj line: 182, column: 56
          currsigs.addElement(gripperZAxisLoweredE);
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
      
    }
  }

  public void thread49425(int [] tdone, int [] ends){
        switch(S48647){
      case 0 : 
        active[31]=0;
        ends[31]=0;
        tdone[31]=1;
        break;
      
      case 1 : 
        if(cylClampBottleExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 180, column: 35
          cylClampBottleExtendE.setPresent();//sysj\conveyor_plant.sysj line: 180, column: 57
          currsigs.addElement(cylClampBottleExtendE);
          active[31]=1;
          ends[31]=1;
          tdone[31]=1;
        }
        else {
          active[31]=1;
          ends[31]=1;
          tdone[31]=1;
        }
        break;
      
    }
  }

  public void thread49424(int [] tdone, int [] ends){
        switch(S48639){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        if(capGripperPos5Extend.getprestatus()){//sysj\conveyor_plant.sysj line: 178, column: 35
          capGripperPos5ExtendE.setPresent();//sysj\conveyor_plant.sysj line: 178, column: 57
          currsigs.addElement(capGripperPos5ExtendE);
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
        else {
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
        break;
      
    }
  }

  public void thread49423(int [] tdone, int [] ends){
        switch(S48631){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        if(gripperTurnExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 176, column: 35
          gripperTurnExtendE.setPresent();//sysj\conveyor_plant.sysj line: 176, column: 54
          currsigs.addElement(gripperTurnExtendE);
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
        else {
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
        break;
      
    }
  }

  public void thread49422(int [] tdone, int [] ends){
        switch(S48623){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        if(gripperTurnRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 174, column: 35
          gripperTurnRetractE.setPresent();//sysj\conveyor_plant.sysj line: 174, column: 55
          currsigs.addElement(gripperTurnRetractE);
          active[28]=1;
          ends[28]=1;
          tdone[28]=1;
        }
        else {
          active[28]=1;
          ends[28]=1;
          tdone[28]=1;
        }
        break;
      
    }
  }

  public void thread49421(int [] tdone, int [] ends){
        switch(S48615){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        if(cylPos5ZaxisExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 172, column: 35
          cylPos5ZaxisExtendE.setPresent();//sysj\conveyor_plant.sysj line: 172, column: 55
          currsigs.addElement(cylPos5ZaxisExtendE);
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
        else {
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
        break;
      
    }
  }

  public void thread49420(int [] tdone, int [] ends){
        switch(S48681){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        thread49421(tdone,ends);
        thread49422(tdone,ends);
        thread49423(tdone,ends);
        thread49424(tdone,ends);
        thread49425(tdone,ends);
        thread49426(tdone,ends);
        thread49427(tdone,ends);
        thread49428(tdone,ends);
        thread49429(tdone,ends);
        int biggest49430 = 0;
        if(ends[27]>=biggest49430){
          biggest49430=ends[27];
        }
        if(ends[28]>=biggest49430){
          biggest49430=ends[28];
        }
        if(ends[29]>=biggest49430){
          biggest49430=ends[29];
        }
        if(ends[30]>=biggest49430){
          biggest49430=ends[30];
        }
        if(ends[31]>=biggest49430){
          biggest49430=ends[31];
        }
        if(ends[32]>=biggest49430){
          biggest49430=ends[32];
        }
        if(ends[33]>=biggest49430){
          biggest49430=ends[33];
        }
        if(ends[34]>=biggest49430){
          biggest49430=ends[34];
        }
        if(ends[35]>=biggest49430){
          biggest49430=ends[35];
        }
        if(biggest49430 == 1){
          active[26]=1;
          ends[26]=1;
          tdone[26]=1;
        }
        //FINXME code
        if(biggest49430 == 0){
          S48681=0;
          active[26]=0;
          ends[26]=0;
          tdone[26]=1;
        }
        break;
      
    }
  }

  public void thread49419(int [] tdone, int [] ends){
        active[25]=0;
    ends[25]=0;
    tdone[25]=1;
  }

  public void thread49418(int [] tdone, int [] ends){
        switch(S48606){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        switch(S48332){
          case 0 : 
            if(gripperTurnRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 142, column: 15
              S48332=1;
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            else {
              gripperZAxisLifted.setPresent();//sysj\conveyor_plant.sysj line: 144, column: 10
              currsigs.addElement(gripperZAxisLifted);
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            break;
          
          case 1 : 
            if(gripperTurnRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 147, column: 16
              S48332=2;
              __start_thread_24 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 139, column: 7
              if(com.systemj.Timer.getMs() - __start_thread_24 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 139, column: 7
                ends[24]=2;
                ;//sysj\conveyor_plant.sysj line: 139, column: 7
                gripperTurnHomePos.setPresent();//sysj\conveyor_plant.sysj line: 149, column: 9
                currsigs.addElement(gripperTurnHomePos);
                S48332=3;
                active[24]=1;
                ends[24]=1;
                tdone[24]=1;
              }
              else {
                active[24]=1;
                ends[24]=1;
                tdone[24]=1;
              }
            }
            else {
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            break;
          
          case 2 : 
            if(com.systemj.Timer.getMs() - __start_thread_24 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 139, column: 7
              ends[24]=2;
              ;//sysj\conveyor_plant.sysj line: 139, column: 7
              gripperTurnHomePos.setPresent();//sysj\conveyor_plant.sysj line: 149, column: 9
              currsigs.addElement(gripperTurnHomePos);
              S48332=3;
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            else {
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            break;
          
          case 3 : 
            S48332=3;
            S48332=4;
            active[24]=1;
            ends[24]=1;
            tdone[24]=1;
            break;
          
          case 4 : 
            if(cylPos5ZaxisExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 152, column: 16
              S48332=5;
              __start_thread_24 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 139, column: 7
              if(com.systemj.Timer.getMs() - __start_thread_24 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 139, column: 7
                ends[24]=2;
                ;//sysj\conveyor_plant.sysj line: 139, column: 7
                gripperZAxisLowered.setPresent();//sysj\conveyor_plant.sysj line: 154, column: 9
                currsigs.addElement(gripperZAxisLowered);
                S48332=6;
                active[24]=1;
                ends[24]=1;
                tdone[24]=1;
              }
              else {
                active[24]=1;
                ends[24]=1;
                tdone[24]=1;
              }
            }
            else {
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            break;
          
          case 5 : 
            if(com.systemj.Timer.getMs() - __start_thread_24 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 139, column: 7
              ends[24]=2;
              ;//sysj\conveyor_plant.sysj line: 139, column: 7
              gripperZAxisLowered.setPresent();//sysj\conveyor_plant.sysj line: 154, column: 9
              currsigs.addElement(gripperZAxisLowered);
              S48332=6;
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            else {
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            break;
          
          case 6 : 
            S48332=6;
            S48332=7;
            __start_thread_24 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 139, column: 7
            if(com.systemj.Timer.getMs() - __start_thread_24 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 139, column: 7
              ends[24]=2;
              ;//sysj\conveyor_plant.sysj line: 139, column: 7
              gripperTurnFinalPos.setPresent();//sysj\conveyor_plant.sysj line: 158, column: 9
              currsigs.addElement(gripperTurnFinalPos);
              S48332=8;
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            else {
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            break;
          
          case 7 : 
            if(com.systemj.Timer.getMs() - __start_thread_24 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 139, column: 7
              ends[24]=2;
              ;//sysj\conveyor_plant.sysj line: 139, column: 7
              gripperTurnFinalPos.setPresent();//sysj\conveyor_plant.sysj line: 158, column: 9
              currsigs.addElement(gripperTurnFinalPos);
              S48332=8;
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            else {
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            break;
          
          case 8 : 
            S48332=8;
            gripperZAxisLifted.setPresent();//sysj\conveyor_plant.sysj line: 162, column: 9
            currsigs.addElement(gripperZAxisLifted);
            S48332=0;
            gripperZAxisLifted.setPresent();//sysj\conveyor_plant.sysj line: 144, column: 10
            currsigs.addElement(gripperZAxisLifted);
            active[24]=1;
            ends[24]=1;
            tdone[24]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread49415(int [] tdone, int [] ends){
        S48679=1;
    if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_plant.sysj line: 188, column: 35
      gripperTurnFinalPosE.setPresent();//sysj\conveyor_plant.sysj line: 188, column: 56
      currsigs.addElement(gripperTurnFinalPosE);
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

  public void thread49414(int [] tdone, int [] ends){
        S48671=1;
    if(gripperTurnHomePos.getprestatus()){//sysj\conveyor_plant.sysj line: 186, column: 35
      gripperTurnHomePosE.setPresent();//sysj\conveyor_plant.sysj line: 186, column: 55
      currsigs.addElement(gripperTurnHomePosE);
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

  public void thread49413(int [] tdone, int [] ends){
        S48663=1;
    if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_plant.sysj line: 184, column: 35
      gripperZAxisLiftedE.setPresent();//sysj\conveyor_plant.sysj line: 184, column: 55
      currsigs.addElement(gripperZAxisLiftedE);
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
  }

  public void thread49412(int [] tdone, int [] ends){
        S48655=1;
    if(gripperZAxisLowered.getprestatus()){//sysj\conveyor_plant.sysj line: 182, column: 35
      gripperZAxisLoweredE.setPresent();//sysj\conveyor_plant.sysj line: 182, column: 56
      currsigs.addElement(gripperZAxisLoweredE);
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
    else {
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread49411(int [] tdone, int [] ends){
        S48647=1;
    if(cylClampBottleExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 180, column: 35
      cylClampBottleExtendE.setPresent();//sysj\conveyor_plant.sysj line: 180, column: 57
      currsigs.addElement(cylClampBottleExtendE);
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
    else {
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
  }

  public void thread49410(int [] tdone, int [] ends){
        S48639=1;
    if(capGripperPos5Extend.getprestatus()){//sysj\conveyor_plant.sysj line: 178, column: 35
      capGripperPos5ExtendE.setPresent();//sysj\conveyor_plant.sysj line: 178, column: 57
      currsigs.addElement(capGripperPos5ExtendE);
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
  }

  public void thread49409(int [] tdone, int [] ends){
        S48631=1;
    if(gripperTurnExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 176, column: 35
      gripperTurnExtendE.setPresent();//sysj\conveyor_plant.sysj line: 176, column: 54
      currsigs.addElement(gripperTurnExtendE);
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
    else {
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread49408(int [] tdone, int [] ends){
        S48623=1;
    if(gripperTurnRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 174, column: 35
      gripperTurnRetractE.setPresent();//sysj\conveyor_plant.sysj line: 174, column: 55
      currsigs.addElement(gripperTurnRetractE);
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    else {
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread49407(int [] tdone, int [] ends){
        S48615=1;
    if(cylPos5ZaxisExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 172, column: 35
      cylPos5ZaxisExtendE.setPresent();//sysj\conveyor_plant.sysj line: 172, column: 55
      currsigs.addElement(cylPos5ZaxisExtendE);
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
    else {
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread49406(int [] tdone, int [] ends){
        S48681=1;
    thread49407(tdone,ends);
    thread49408(tdone,ends);
    thread49409(tdone,ends);
    thread49410(tdone,ends);
    thread49411(tdone,ends);
    thread49412(tdone,ends);
    thread49413(tdone,ends);
    thread49414(tdone,ends);
    thread49415(tdone,ends);
    int biggest49416 = 0;
    if(ends[27]>=biggest49416){
      biggest49416=ends[27];
    }
    if(ends[28]>=biggest49416){
      biggest49416=ends[28];
    }
    if(ends[29]>=biggest49416){
      biggest49416=ends[29];
    }
    if(ends[30]>=biggest49416){
      biggest49416=ends[30];
    }
    if(ends[31]>=biggest49416){
      biggest49416=ends[31];
    }
    if(ends[32]>=biggest49416){
      biggest49416=ends[32];
    }
    if(ends[33]>=biggest49416){
      biggest49416=ends[33];
    }
    if(ends[34]>=biggest49416){
      biggest49416=ends[34];
    }
    if(ends[35]>=biggest49416){
      biggest49416=ends[35];
    }
    if(biggest49416 == 1){
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread49405(int [] tdone, int [] ends){
        active[25]=0;
    ends[25]=0;
    tdone[25]=1;
  }

  public void thread49404(int [] tdone, int [] ends){
        S48606=1;
    S48332=0;
    gripperZAxisLifted.setPresent();//sysj\conveyor_plant.sysj line: 144, column: 10
    currsigs.addElement(gripperZAxisLifted);
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S48683){
        case 0 : 
          S48683=0;
          break RUN;
        
        case 1 : 
          S48683=2;
          S48683=2;
          thread49404(tdone,ends);
          thread49405(tdone,ends);
          thread49406(tdone,ends);
          int biggest49417 = 0;
          if(ends[24]>=biggest49417){
            biggest49417=ends[24];
          }
          if(ends[25]>=biggest49417){
            biggest49417=ends[25];
          }
          if(ends[26]>=biggest49417){
            biggest49417=ends[26];
          }
          if(biggest49417 == 1){
            active[23]=1;
            ends[23]=1;
            break RUN;
          }
        
        case 2 : 
          thread49418(tdone,ends);
          thread49419(tdone,ends);
          thread49420(tdone,ends);
          int biggest49431 = 0;
          if(ends[24]>=biggest49431){
            biggest49431=ends[24];
          }
          if(ends[25]>=biggest49431){
            biggest49431=ends[25];
          }
          if(ends[26]>=biggest49431){
            biggest49431=ends[26];
          }
          if(biggest49431 == 1){
            active[23]=1;
            ends[23]=1;
            break RUN;
          }
          //FINXME code
          if(biggest49431 == 0){
            S48683=0;
            active[23]=0;
            ends[23]=0;
            S48683=0;
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
    while(active[23] != 0){
      int index = 23;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[23]!=0 || suspended[23]!=0 || active[23]!=1);
      else{
        if(!df){
          cylPos5ZaxisExtend.gethook();
          gripperTurnRetract.gethook();
          gripperTurnExtend.gethook();
          capGripperPos5Extend.gethook();
          cylClampBottleExtend.gethook();
          df = true;
        }
        runClockDomain();
      }
      cylPos5ZaxisExtend.setpreclear();
      gripperTurnRetract.setpreclear();
      gripperTurnExtend.setpreclear();
      capGripperPos5Extend.setpreclear();
      cylClampBottleExtend.setpreclear();
      gripperZAxisLowered.setpreclear();
      gripperZAxisLifted.setpreclear();
      gripperTurnHomePos.setpreclear();
      gripperTurnFinalPos.setpreclear();
      cylPos5ZaxisExtendE.setpreclear();
      gripperTurnRetractE.setpreclear();
      gripperTurnExtendE.setpreclear();
      capGripperPos5ExtendE.setpreclear();
      cylClampBottleExtendE.setpreclear();
      gripperZAxisLoweredE.setpreclear();
      gripperZAxisLiftedE.setpreclear();
      gripperTurnHomePosE.setpreclear();
      gripperTurnFinalPosE.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = cylPos5ZaxisExtend.getStatus() ? cylPos5ZaxisExtend.setprepresent() : cylPos5ZaxisExtend.setpreclear();
      cylPos5ZaxisExtend.setpreval(cylPos5ZaxisExtend.getValue());
      cylPos5ZaxisExtend.setClear();
      dummyint = gripperTurnRetract.getStatus() ? gripperTurnRetract.setprepresent() : gripperTurnRetract.setpreclear();
      gripperTurnRetract.setpreval(gripperTurnRetract.getValue());
      gripperTurnRetract.setClear();
      dummyint = gripperTurnExtend.getStatus() ? gripperTurnExtend.setprepresent() : gripperTurnExtend.setpreclear();
      gripperTurnExtend.setpreval(gripperTurnExtend.getValue());
      gripperTurnExtend.setClear();
      dummyint = capGripperPos5Extend.getStatus() ? capGripperPos5Extend.setprepresent() : capGripperPos5Extend.setpreclear();
      capGripperPos5Extend.setpreval(capGripperPos5Extend.getValue());
      capGripperPos5Extend.setClear();
      dummyint = cylClampBottleExtend.getStatus() ? cylClampBottleExtend.setprepresent() : cylClampBottleExtend.setpreclear();
      cylClampBottleExtend.setpreval(cylClampBottleExtend.getValue());
      cylClampBottleExtend.setClear();
      gripperZAxisLowered.sethook();
      gripperZAxisLowered.setClear();
      gripperZAxisLifted.sethook();
      gripperZAxisLifted.setClear();
      gripperTurnHomePos.sethook();
      gripperTurnHomePos.setClear();
      gripperTurnFinalPos.sethook();
      gripperTurnFinalPos.setClear();
      cylPos5ZaxisExtendE.sethook();
      cylPos5ZaxisExtendE.setClear();
      gripperTurnRetractE.sethook();
      gripperTurnRetractE.setClear();
      gripperTurnExtendE.sethook();
      gripperTurnExtendE.setClear();
      capGripperPos5ExtendE.sethook();
      capGripperPos5ExtendE.setClear();
      cylClampBottleExtendE.sethook();
      cylClampBottleExtendE.setClear();
      gripperZAxisLoweredE.sethook();
      gripperZAxisLoweredE.setClear();
      gripperZAxisLiftedE.sethook();
      gripperZAxisLiftedE.setClear();
      gripperTurnHomePosE.sethook();
      gripperTurnHomePosE.setClear();
      gripperTurnFinalPosE.sethook();
      gripperTurnFinalPosE.setClear();
      if(paused[23]!=0 || suspended[23]!=0 || active[23]!=1);
      else{
        cylPos5ZaxisExtend.gethook();
        gripperTurnRetract.gethook();
        gripperTurnExtend.gethook();
        capGripperPos5Extend.gethook();
        cylClampBottleExtend.gethook();
      }
      runFinisher();
      if(active[23] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
