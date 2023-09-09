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
  private long __start_thread_24;//sysj\conveyor_plant.sysj line: 137, column: 7
  private int S40525 = 1;
  private int S40448 = 1;
  private int S39788 = 1;
  private int S39849 = 1;
  private int S39852 = 1;
  private int S40523 = 1;
  private int S40457 = 1;
  private int S40465 = 1;
  private int S40473 = 1;
  private int S40481 = 1;
  private int S40489 = 1;
  private int S40497 = 1;
  private int S40505 = 1;
  private int S40513 = 1;
  private int S40521 = 1;
  
  private int[] ends = new int[38];
  private int[] tdone = new int[38];
  
  public void thread40613(int [] tdone, int [] ends){
        switch(S40521){
      case 0 : 
        active[37]=0;
        ends[37]=0;
        tdone[37]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_plant.sysj line: 191, column: 35
          gripperTurnFinalPosE.setPresent();//sysj\conveyor_plant.sysj line: 191, column: 56
          currsigs.addElement(gripperTurnFinalPosE);
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
        else {
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
        break;
      
    }
  }

  public void thread40612(int [] tdone, int [] ends){
        switch(S40513){
      case 0 : 
        active[36]=0;
        ends[36]=0;
        tdone[36]=1;
        break;
      
      case 1 : 
        if(gripperTurnHomePos.getprestatus()){//sysj\conveyor_plant.sysj line: 189, column: 35
          gripperTurnHomePosE.setPresent();//sysj\conveyor_plant.sysj line: 189, column: 55
          currsigs.addElement(gripperTurnHomePosE);
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        else {
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        break;
      
    }
  }

  public void thread40611(int [] tdone, int [] ends){
        switch(S40505){
      case 0 : 
        active[35]=0;
        ends[35]=0;
        tdone[35]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_plant.sysj line: 187, column: 35
          gripperZAxisLiftedE.setPresent();//sysj\conveyor_plant.sysj line: 187, column: 55
          currsigs.addElement(gripperZAxisLiftedE);
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

  public void thread40610(int [] tdone, int [] ends){
        switch(S40497){
      case 0 : 
        active[34]=0;
        ends[34]=0;
        tdone[34]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLowered.getprestatus()){//sysj\conveyor_plant.sysj line: 185, column: 35
          gripperZAxisLoweredE.setPresent();//sysj\conveyor_plant.sysj line: 185, column: 56
          currsigs.addElement(gripperZAxisLoweredE);
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

  public void thread40609(int [] tdone, int [] ends){
        switch(S40489){
      case 0 : 
        active[33]=0;
        ends[33]=0;
        tdone[33]=1;
        break;
      
      case 1 : 
        if(cylClampBottleExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 183, column: 35
          cylClampBottleExtendE.setPresent();//sysj\conveyor_plant.sysj line: 183, column: 57
          currsigs.addElement(cylClampBottleExtendE);
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

  public void thread40608(int [] tdone, int [] ends){
        switch(S40481){
      case 0 : 
        active[32]=0;
        ends[32]=0;
        tdone[32]=1;
        break;
      
      case 1 : 
        if(capGripperPos5Extend.getprestatus()){//sysj\conveyor_plant.sysj line: 181, column: 35
          capGripperPos5ExtendE.setPresent();//sysj\conveyor_plant.sysj line: 181, column: 57
          currsigs.addElement(capGripperPos5ExtendE);
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

  public void thread40607(int [] tdone, int [] ends){
        switch(S40473){
      case 0 : 
        active[31]=0;
        ends[31]=0;
        tdone[31]=1;
        break;
      
      case 1 : 
        if(gripperTurnExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 179, column: 35
          gripperTurnExtendE.setPresent();//sysj\conveyor_plant.sysj line: 179, column: 54
          currsigs.addElement(gripperTurnExtendE);
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

  public void thread40606(int [] tdone, int [] ends){
        switch(S40465){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        if(gripperTurnRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 177, column: 35
          gripperTurnRetractE.setPresent();//sysj\conveyor_plant.sysj line: 177, column: 55
          currsigs.addElement(gripperTurnRetractE);
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

  public void thread40605(int [] tdone, int [] ends){
        switch(S40457){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        if(cylPos5ZaxisExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 175, column: 35
          cylPos5ZaxisExtendE.setPresent();//sysj\conveyor_plant.sysj line: 175, column: 55
          currsigs.addElement(cylPos5ZaxisExtendE);
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

  public void thread40604(int [] tdone, int [] ends){
        switch(S40523){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        thread40605(tdone,ends);
        thread40606(tdone,ends);
        thread40607(tdone,ends);
        thread40608(tdone,ends);
        thread40609(tdone,ends);
        thread40610(tdone,ends);
        thread40611(tdone,ends);
        thread40612(tdone,ends);
        thread40613(tdone,ends);
        int biggest40614 = 0;
        if(ends[29]>=biggest40614){
          biggest40614=ends[29];
        }
        if(ends[30]>=biggest40614){
          biggest40614=ends[30];
        }
        if(ends[31]>=biggest40614){
          biggest40614=ends[31];
        }
        if(ends[32]>=biggest40614){
          biggest40614=ends[32];
        }
        if(ends[33]>=biggest40614){
          biggest40614=ends[33];
        }
        if(ends[34]>=biggest40614){
          biggest40614=ends[34];
        }
        if(ends[35]>=biggest40614){
          biggest40614=ends[35];
        }
        if(ends[36]>=biggest40614){
          biggest40614=ends[36];
        }
        if(ends[37]>=biggest40614){
          biggest40614=ends[37];
        }
        if(biggest40614 == 1){
          active[28]=1;
          ends[28]=1;
          tdone[28]=1;
        }
        //FINXME code
        if(biggest40614 == 0){
          S40523=0;
          active[28]=0;
          ends[28]=0;
          tdone[28]=1;
        }
        break;
      
    }
  }

  public void thread40603(int [] tdone, int [] ends){
        active[27]=0;
    ends[27]=0;
    tdone[27]=1;
  }

  public void thread40601(int [] tdone, int [] ends){
        switch(S39852){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        if(gripperTurnExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 157, column: 17
          S39852=0;
          active[26]=0;
          ends[26]=0;
          tdone[26]=1;
        }
        else {
          active[26]=1;
          ends[26]=1;
          tdone[26]=1;
        }
        break;
      
    }
  }

  public void thread40600(int [] tdone, int [] ends){
        switch(S39849){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        if(capGripperPos5Extend.getprestatus()){//sysj\conveyor_plant.sysj line: 155, column: 17
          S39849=0;
          active[25]=0;
          ends[25]=0;
          tdone[25]=1;
        }
        else {
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
        break;
      
    }
  }

  public void thread40598(int [] tdone, int [] ends){
        S39852=1;
    active[26]=1;
    ends[26]=1;
    tdone[26]=1;
  }

  public void thread40597(int [] tdone, int [] ends){
        S39849=1;
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread40596(int [] tdone, int [] ends){
        switch(S40448){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        switch(S39788){
          case 0 : 
            if(gripperTurnRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 140, column: 15
              S39788=1;
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            else {
              gripperZAxisLifted.setPresent();//sysj\conveyor_plant.sysj line: 142, column: 10
              currsigs.addElement(gripperZAxisLifted);
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            break;
          
          case 1 : 
            if(gripperTurnRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 145, column: 16
              S39788=2;
              __start_thread_24 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 137, column: 7
              if(com.systemj.Timer.getMs() - __start_thread_24 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 137, column: 7
                ends[24]=2;
                ;//sysj\conveyor_plant.sysj line: 137, column: 7
                gripperTurnHomePos.setPresent();//sysj\conveyor_plant.sysj line: 147, column: 9
                currsigs.addElement(gripperTurnHomePos);
                S39788=3;
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
            if(com.systemj.Timer.getMs() - __start_thread_24 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 137, column: 7
              ends[24]=2;
              ;//sysj\conveyor_plant.sysj line: 137, column: 7
              gripperTurnHomePos.setPresent();//sysj\conveyor_plant.sysj line: 147, column: 9
              currsigs.addElement(gripperTurnHomePos);
              S39788=3;
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
            S39788=3;
            S39788=4;
            active[24]=1;
            ends[24]=1;
            tdone[24]=1;
            break;
          
          case 4 : 
            if(cylPos5ZaxisExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 150, column: 16
              S39788=5;
              __start_thread_24 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 137, column: 7
              if(com.systemj.Timer.getMs() - __start_thread_24 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 137, column: 7
                ends[24]=2;
                ;//sysj\conveyor_plant.sysj line: 137, column: 7
                gripperZAxisLowered.setPresent();//sysj\conveyor_plant.sysj line: 152, column: 9
                currsigs.addElement(gripperZAxisLowered);
                S39788=6;
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
            if(com.systemj.Timer.getMs() - __start_thread_24 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 137, column: 7
              ends[24]=2;
              ;//sysj\conveyor_plant.sysj line: 137, column: 7
              gripperZAxisLowered.setPresent();//sysj\conveyor_plant.sysj line: 152, column: 9
              currsigs.addElement(gripperZAxisLowered);
              S39788=6;
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
            S39788=6;
            S39788=7;
            thread40597(tdone,ends);
            thread40598(tdone,ends);
            int biggest40599 = 0;
            if(ends[25]>=biggest40599){
              biggest40599=ends[25];
            }
            if(ends[26]>=biggest40599){
              biggest40599=ends[26];
            }
            if(biggest40599 == 1){
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            break;
          
          case 7 : 
            thread40600(tdone,ends);
            thread40601(tdone,ends);
            int biggest40602 = 0;
            if(ends[25]>=biggest40602){
              biggest40602=ends[25];
            }
            if(ends[26]>=biggest40602){
              biggest40602=ends[26];
            }
            if(biggest40602 == 1){
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            //FINXME code
            if(biggest40602 == 0){
              S39788=8;
              __start_thread_24 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 137, column: 7
              if(com.systemj.Timer.getMs() - __start_thread_24 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 137, column: 7
                ends[24]=2;
                ;//sysj\conveyor_plant.sysj line: 137, column: 7
                gripperTurnFinalPos.setPresent();//sysj\conveyor_plant.sysj line: 161, column: 9
                currsigs.addElement(gripperTurnFinalPos);
                S39788=9;
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
            break;
          
          case 8 : 
            if(com.systemj.Timer.getMs() - __start_thread_24 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 137, column: 7
              ends[24]=2;
              ;//sysj\conveyor_plant.sysj line: 137, column: 7
              gripperTurnFinalPos.setPresent();//sysj\conveyor_plant.sysj line: 161, column: 9
              currsigs.addElement(gripperTurnFinalPos);
              S39788=9;
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
          
          case 9 : 
            S39788=9;
            S39788=10;
            __start_thread_24 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 137, column: 7
            if(com.systemj.Timer.getMs() - __start_thread_24 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 137, column: 7
              ends[24]=2;
              ;//sysj\conveyor_plant.sysj line: 137, column: 7
              gripperZAxisLifted.setPresent();//sysj\conveyor_plant.sysj line: 165, column: 9
              currsigs.addElement(gripperZAxisLifted);
              S39788=0;
              gripperZAxisLifted.setPresent();//sysj\conveyor_plant.sysj line: 142, column: 10
              currsigs.addElement(gripperZAxisLifted);
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
          
          case 10 : 
            if(com.systemj.Timer.getMs() - __start_thread_24 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 137, column: 7
              ends[24]=2;
              ;//sysj\conveyor_plant.sysj line: 137, column: 7
              gripperZAxisLifted.setPresent();//sysj\conveyor_plant.sysj line: 165, column: 9
              currsigs.addElement(gripperZAxisLifted);
              S39788=0;
              gripperZAxisLifted.setPresent();//sysj\conveyor_plant.sysj line: 142, column: 10
              currsigs.addElement(gripperZAxisLifted);
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
          
        }
        break;
      
    }
  }

  public void thread40593(int [] tdone, int [] ends){
        S40521=1;
    if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_plant.sysj line: 191, column: 35
      gripperTurnFinalPosE.setPresent();//sysj\conveyor_plant.sysj line: 191, column: 56
      currsigs.addElement(gripperTurnFinalPosE);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
  }

  public void thread40592(int [] tdone, int [] ends){
        S40513=1;
    if(gripperTurnHomePos.getprestatus()){//sysj\conveyor_plant.sysj line: 189, column: 35
      gripperTurnHomePosE.setPresent();//sysj\conveyor_plant.sysj line: 189, column: 55
      currsigs.addElement(gripperTurnHomePosE);
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
  }

  public void thread40591(int [] tdone, int [] ends){
        S40505=1;
    if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_plant.sysj line: 187, column: 35
      gripperZAxisLiftedE.setPresent();//sysj\conveyor_plant.sysj line: 187, column: 55
      currsigs.addElement(gripperZAxisLiftedE);
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

  public void thread40590(int [] tdone, int [] ends){
        S40497=1;
    if(gripperZAxisLowered.getprestatus()){//sysj\conveyor_plant.sysj line: 185, column: 35
      gripperZAxisLoweredE.setPresent();//sysj\conveyor_plant.sysj line: 185, column: 56
      currsigs.addElement(gripperZAxisLoweredE);
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

  public void thread40589(int [] tdone, int [] ends){
        S40489=1;
    if(cylClampBottleExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 183, column: 35
      cylClampBottleExtendE.setPresent();//sysj\conveyor_plant.sysj line: 183, column: 57
      currsigs.addElement(cylClampBottleExtendE);
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

  public void thread40588(int [] tdone, int [] ends){
        S40481=1;
    if(capGripperPos5Extend.getprestatus()){//sysj\conveyor_plant.sysj line: 181, column: 35
      capGripperPos5ExtendE.setPresent();//sysj\conveyor_plant.sysj line: 181, column: 57
      currsigs.addElement(capGripperPos5ExtendE);
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

  public void thread40587(int [] tdone, int [] ends){
        S40473=1;
    if(gripperTurnExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 179, column: 35
      gripperTurnExtendE.setPresent();//sysj\conveyor_plant.sysj line: 179, column: 54
      currsigs.addElement(gripperTurnExtendE);
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

  public void thread40586(int [] tdone, int [] ends){
        S40465=1;
    if(gripperTurnRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 177, column: 35
      gripperTurnRetractE.setPresent();//sysj\conveyor_plant.sysj line: 177, column: 55
      currsigs.addElement(gripperTurnRetractE);
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

  public void thread40585(int [] tdone, int [] ends){
        S40457=1;
    if(cylPos5ZaxisExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 175, column: 35
      cylPos5ZaxisExtendE.setPresent();//sysj\conveyor_plant.sysj line: 175, column: 55
      currsigs.addElement(cylPos5ZaxisExtendE);
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

  public void thread40584(int [] tdone, int [] ends){
        S40523=1;
    thread40585(tdone,ends);
    thread40586(tdone,ends);
    thread40587(tdone,ends);
    thread40588(tdone,ends);
    thread40589(tdone,ends);
    thread40590(tdone,ends);
    thread40591(tdone,ends);
    thread40592(tdone,ends);
    thread40593(tdone,ends);
    int biggest40594 = 0;
    if(ends[29]>=biggest40594){
      biggest40594=ends[29];
    }
    if(ends[30]>=biggest40594){
      biggest40594=ends[30];
    }
    if(ends[31]>=biggest40594){
      biggest40594=ends[31];
    }
    if(ends[32]>=biggest40594){
      biggest40594=ends[32];
    }
    if(ends[33]>=biggest40594){
      biggest40594=ends[33];
    }
    if(ends[34]>=biggest40594){
      biggest40594=ends[34];
    }
    if(ends[35]>=biggest40594){
      biggest40594=ends[35];
    }
    if(ends[36]>=biggest40594){
      biggest40594=ends[36];
    }
    if(ends[37]>=biggest40594){
      biggest40594=ends[37];
    }
    if(biggest40594 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread40583(int [] tdone, int [] ends){
        active[27]=0;
    ends[27]=0;
    tdone[27]=1;
  }

  public void thread40582(int [] tdone, int [] ends){
        S40448=1;
    S39788=0;
    gripperZAxisLifted.setPresent();//sysj\conveyor_plant.sysj line: 142, column: 10
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
      switch(S40525){
        case 0 : 
          S40525=0;
          break RUN;
        
        case 1 : 
          S40525=2;
          S40525=2;
          thread40582(tdone,ends);
          thread40583(tdone,ends);
          thread40584(tdone,ends);
          int biggest40595 = 0;
          if(ends[24]>=biggest40595){
            biggest40595=ends[24];
          }
          if(ends[27]>=biggest40595){
            biggest40595=ends[27];
          }
          if(ends[28]>=biggest40595){
            biggest40595=ends[28];
          }
          if(biggest40595 == 1){
            active[23]=1;
            ends[23]=1;
            break RUN;
          }
        
        case 2 : 
          thread40596(tdone,ends);
          thread40603(tdone,ends);
          thread40604(tdone,ends);
          int biggest40615 = 0;
          if(ends[24]>=biggest40615){
            biggest40615=ends[24];
          }
          if(ends[27]>=biggest40615){
            biggest40615=ends[27];
          }
          if(ends[28]>=biggest40615){
            biggest40615=ends[28];
          }
          if(biggest40615 == 1){
            active[23]=1;
            ends[23]=1;
            break RUN;
          }
          //FINXME code
          if(biggest40615 == 0){
            S40525=0;
            active[23]=0;
            ends[23]=0;
            S40525=0;
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
