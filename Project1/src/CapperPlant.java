import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.GUI;//sysj\conveyor_plant.sysj line: 1, column: 1
import run.socketListener;//sysj\conveyor_plant.sysj line: 2, column: 1

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
  private long __start_thread_25;//sysj\conveyor_plant.sysj line: 139, column: 11
  private long __start_thread_26;//sysj\conveyor_plant.sysj line: 146, column: 13
  private long __start_thread_27;//sysj\conveyor_plant.sysj line: 153, column: 13
  private int S193399 = 1;
  private int S193322 = 1;
  private int S193029 = 1;
  private int S193060 = 1;
  private int S193059 = 1;
  private int S193091 = 1;
  private int S193090 = 1;
  private int S193122 = 1;
  private int S193121 = 1;
  private int S193397 = 1;
  private int S193331 = 1;
  private int S193339 = 1;
  private int S193347 = 1;
  private int S193355 = 1;
  private int S193363 = 1;
  private int S193371 = 1;
  private int S193379 = 1;
  private int S193387 = 1;
  private int S193395 = 1;
  
  private int[] ends = new int[52];
  private int[] tdone = new int[52];
  
  public void thread194158(int [] tdone, int [] ends){
        switch(S193395){
      case 0 : 
        active[38]=0;
        ends[38]=0;
        tdone[38]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_plant.sysj line: 187, column: 35
          gripperTurnFinalPosE.setPresent();//sysj\conveyor_plant.sysj line: 187, column: 56
          currsigs.addElement(gripperTurnFinalPosE);
          active[38]=1;
          ends[38]=1;
          tdone[38]=1;
        }
        else {
          active[38]=1;
          ends[38]=1;
          tdone[38]=1;
        }
        break;
      
    }
  }

  public void thread194157(int [] tdone, int [] ends){
        switch(S193387){
      case 0 : 
        active[37]=0;
        ends[37]=0;
        tdone[37]=1;
        break;
      
      case 1 : 
        if(gripperTurnHomePos.getprestatus()){//sysj\conveyor_plant.sysj line: 185, column: 35
          gripperTurnHomePosE.setPresent();//sysj\conveyor_plant.sysj line: 185, column: 55
          currsigs.addElement(gripperTurnHomePosE);
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

  public void thread194156(int [] tdone, int [] ends){
        switch(S193379){
      case 0 : 
        active[36]=0;
        ends[36]=0;
        tdone[36]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_plant.sysj line: 183, column: 35
          gripperZAxisLiftedE.setPresent();//sysj\conveyor_plant.sysj line: 183, column: 55
          currsigs.addElement(gripperZAxisLiftedE);
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

  public void thread194155(int [] tdone, int [] ends){
        switch(S193371){
      case 0 : 
        active[35]=0;
        ends[35]=0;
        tdone[35]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLowered.getprestatus()){//sysj\conveyor_plant.sysj line: 181, column: 35
          gripperZAxisLoweredE.setPresent();//sysj\conveyor_plant.sysj line: 181, column: 56
          currsigs.addElement(gripperZAxisLoweredE);
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

  public void thread194154(int [] tdone, int [] ends){
        switch(S193363){
      case 0 : 
        active[34]=0;
        ends[34]=0;
        tdone[34]=1;
        break;
      
      case 1 : 
        if(cylClampBottleExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 179, column: 35
          cylClampBottleExtendE.setPresent();//sysj\conveyor_plant.sysj line: 179, column: 57
          currsigs.addElement(cylClampBottleExtendE);
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

  public void thread194153(int [] tdone, int [] ends){
        switch(S193355){
      case 0 : 
        active[33]=0;
        ends[33]=0;
        tdone[33]=1;
        break;
      
      case 1 : 
        if(capGripperPos5Extend.getprestatus()){//sysj\conveyor_plant.sysj line: 177, column: 35
          capGripperPos5ExtendE.setPresent();//sysj\conveyor_plant.sysj line: 177, column: 57
          currsigs.addElement(capGripperPos5ExtendE);
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

  public void thread194152(int [] tdone, int [] ends){
        switch(S193347){
      case 0 : 
        active[32]=0;
        ends[32]=0;
        tdone[32]=1;
        break;
      
      case 1 : 
        if(gripperTurnExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 175, column: 35
          gripperTurnExtendE.setPresent();//sysj\conveyor_plant.sysj line: 175, column: 54
          currsigs.addElement(gripperTurnExtendE);
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

  public void thread194151(int [] tdone, int [] ends){
        switch(S193339){
      case 0 : 
        active[31]=0;
        ends[31]=0;
        tdone[31]=1;
        break;
      
      case 1 : 
        if(gripperTurnRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 173, column: 35
          gripperTurnRetractE.setPresent();//sysj\conveyor_plant.sysj line: 173, column: 55
          currsigs.addElement(gripperTurnRetractE);
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

  public void thread194150(int [] tdone, int [] ends){
        switch(S193331){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        if(cylPos5ZaxisExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 171, column: 35
          cylPos5ZaxisExtendE.setPresent();//sysj\conveyor_plant.sysj line: 171, column: 55
          currsigs.addElement(cylPos5ZaxisExtendE);
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

  public void thread194149(int [] tdone, int [] ends){
        switch(S193397){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        thread194150(tdone,ends);
        thread194151(tdone,ends);
        thread194152(tdone,ends);
        thread194153(tdone,ends);
        thread194154(tdone,ends);
        thread194155(tdone,ends);
        thread194156(tdone,ends);
        thread194157(tdone,ends);
        thread194158(tdone,ends);
        int biggest194159 = 0;
        if(ends[30]>=biggest194159){
          biggest194159=ends[30];
        }
        if(ends[31]>=biggest194159){
          biggest194159=ends[31];
        }
        if(ends[32]>=biggest194159){
          biggest194159=ends[32];
        }
        if(ends[33]>=biggest194159){
          biggest194159=ends[33];
        }
        if(ends[34]>=biggest194159){
          biggest194159=ends[34];
        }
        if(ends[35]>=biggest194159){
          biggest194159=ends[35];
        }
        if(ends[36]>=biggest194159){
          biggest194159=ends[36];
        }
        if(ends[37]>=biggest194159){
          biggest194159=ends[37];
        }
        if(ends[38]>=biggest194159){
          biggest194159=ends[38];
        }
        if(biggest194159 == 1){
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
        //FINXME code
        if(biggest194159 == 0){
          S193397=0;
          active[29]=0;
          ends[29]=0;
          tdone[29]=1;
        }
        break;
      
    }
  }

  public void thread194148(int [] tdone, int [] ends){
        active[28]=0;
    ends[28]=0;
    tdone[28]=1;
  }

  public void thread194146(int [] tdone, int [] ends){
        S193122=1;
    S193121=0;
    active[27]=1;
    ends[27]=1;
    tdone[27]=1;
  }

  public void thread194145(int [] tdone, int [] ends){
        S193091=1;
    S193090=0;
    active[26]=1;
    ends[26]=1;
    tdone[26]=1;
  }

  public void thread194144(int [] tdone, int [] ends){
        S193060=1;
    S193059=0;
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread194143(int [] tdone, int [] ends){
        S193029=1;
    gripperZAxisLifted.setPresent();//sysj\conveyor_plant.sysj line: 134, column: 21
    currsigs.addElement(gripperZAxisLifted);
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread194141(int [] tdone, int [] ends){
        switch(S193122){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        switch(S193121){
          case 0 : 
            if(gripperTurnExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 154, column: 24
              S193121=1;
              __start_thread_27 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 153, column: 13
              if(com.systemj.Timer.getMs() - __start_thread_27 >= 500){//sysj\conveyor_plant.sysj line: 153, column: 13
                ends[27]=2;
                ;//sysj\conveyor_plant.sysj line: 153, column: 13
                gripperTurnFinalPos.setPresent();//sysj\conveyor_plant.sysj line: 156, column: 17
                currsigs.addElement(gripperTurnFinalPos);
                S193121=2;
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
            else {
              active[27]=1;
              ends[27]=1;
              tdone[27]=1;
            }
            break;
          
          case 1 : 
            if(com.systemj.Timer.getMs() - __start_thread_27 >= 500){//sysj\conveyor_plant.sysj line: 153, column: 13
              ends[27]=2;
              ;//sysj\conveyor_plant.sysj line: 153, column: 13
              gripperTurnFinalPos.setPresent();//sysj\conveyor_plant.sysj line: 156, column: 17
              currsigs.addElement(gripperTurnFinalPos);
              S193121=2;
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
          
          case 2 : 
            S193121=2;
            gripperZAxisLifted.setPresent();//sysj\conveyor_plant.sysj line: 158, column: 17
            currsigs.addElement(gripperZAxisLifted);
            S193121=3;
            active[27]=1;
            ends[27]=1;
            tdone[27]=1;
            break;
          
          case 3 : 
            S193121=3;
            S193122=0;
            active[27]=0;
            ends[27]=0;
            tdone[27]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread194140(int [] tdone, int [] ends){
        switch(S193091){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        switch(S193090){
          case 0 : 
            if(cylPos5ZaxisExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 147, column: 24
              S193090=1;
              __start_thread_26 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 146, column: 13
              if(com.systemj.Timer.getMs() - __start_thread_26 >= 500){//sysj\conveyor_plant.sysj line: 146, column: 13
                ends[26]=2;
                ;//sysj\conveyor_plant.sysj line: 146, column: 13
                gripperZAxisLowered.setPresent();//sysj\conveyor_plant.sysj line: 149, column: 17
                currsigs.addElement(gripperZAxisLowered);
                S193090=2;
                active[26]=1;
                ends[26]=1;
                tdone[26]=1;
              }
              else {
                active[26]=1;
                ends[26]=1;
                tdone[26]=1;
              }
            }
            else {
              active[26]=1;
              ends[26]=1;
              tdone[26]=1;
            }
            break;
          
          case 1 : 
            if(com.systemj.Timer.getMs() - __start_thread_26 >= 500){//sysj\conveyor_plant.sysj line: 146, column: 13
              ends[26]=2;
              ;//sysj\conveyor_plant.sysj line: 146, column: 13
              gripperZAxisLowered.setPresent();//sysj\conveyor_plant.sysj line: 149, column: 17
              currsigs.addElement(gripperZAxisLowered);
              S193090=2;
              active[26]=1;
              ends[26]=1;
              tdone[26]=1;
            }
            else {
              active[26]=1;
              ends[26]=1;
              tdone[26]=1;
            }
            break;
          
          case 2 : 
            S193090=2;
            S193091=0;
            active[26]=0;
            ends[26]=0;
            tdone[26]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread194139(int [] tdone, int [] ends){
        switch(S193060){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        switch(S193059){
          case 0 : 
            if(gripperTurnRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 140, column: 24
              S193059=1;
              __start_thread_25 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 139, column: 11
              if(com.systemj.Timer.getMs() - __start_thread_25 >= 500){//sysj\conveyor_plant.sysj line: 139, column: 11
                ends[25]=2;
                ;//sysj\conveyor_plant.sysj line: 139, column: 11
                gripperTurnHomePos.setPresent();//sysj\conveyor_plant.sysj line: 142, column: 17
                currsigs.addElement(gripperTurnHomePos);
                S193059=2;
                active[25]=1;
                ends[25]=1;
                tdone[25]=1;
              }
              else {
                active[25]=1;
                ends[25]=1;
                tdone[25]=1;
              }
            }
            else {
              active[25]=1;
              ends[25]=1;
              tdone[25]=1;
            }
            break;
          
          case 1 : 
            if(com.systemj.Timer.getMs() - __start_thread_25 >= 500){//sysj\conveyor_plant.sysj line: 139, column: 11
              ends[25]=2;
              ;//sysj\conveyor_plant.sysj line: 139, column: 11
              gripperTurnHomePos.setPresent();//sysj\conveyor_plant.sysj line: 142, column: 17
              currsigs.addElement(gripperTurnHomePos);
              S193059=2;
              active[25]=1;
              ends[25]=1;
              tdone[25]=1;
            }
            else {
              active[25]=1;
              ends[25]=1;
              tdone[25]=1;
            }
            break;
          
          case 2 : 
            S193059=2;
            S193060=0;
            active[25]=0;
            ends[25]=0;
            tdone[25]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread194138(int [] tdone, int [] ends){
        switch(S193029){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        if(gripperTurnRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 133, column: 23
          S193029=0;
          active[24]=0;
          ends[24]=0;
          tdone[24]=1;
        }
        else {
          gripperZAxisLifted.setPresent();//sysj\conveyor_plant.sysj line: 134, column: 21
          currsigs.addElement(gripperZAxisLifted);
          active[24]=1;
          ends[24]=1;
          tdone[24]=1;
        }
        break;
      
    }
  }

  public void thread194137(int [] tdone, int [] ends){
        switch(S193322){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        thread194138(tdone,ends);
        thread194139(tdone,ends);
        thread194140(tdone,ends);
        thread194141(tdone,ends);
        int biggest194142 = 0;
        if(ends[24]>=biggest194142){
          biggest194142=ends[24];
        }
        if(ends[25]>=biggest194142){
          biggest194142=ends[25];
        }
        if(ends[26]>=biggest194142){
          biggest194142=ends[26];
        }
        if(ends[27]>=biggest194142){
          biggest194142=ends[27];
        }
        if(biggest194142 == 1){
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
        //FINXME code
        if(biggest194142 == 0){
          thread194143(tdone,ends);
          thread194144(tdone,ends);
          thread194145(tdone,ends);
          thread194146(tdone,ends);
          int biggest194147 = 0;
          if(ends[24]>=biggest194147){
            biggest194147=ends[24];
          }
          if(ends[25]>=biggest194147){
            biggest194147=ends[25];
          }
          if(ends[26]>=biggest194147){
            biggest194147=ends[26];
          }
          if(ends[27]>=biggest194147){
            biggest194147=ends[27];
          }
          if(biggest194147 == 1){
            active[23]=1;
            ends[23]=1;
            tdone[23]=1;
          }
        }
        break;
      
    }
  }

  public void thread194134(int [] tdone, int [] ends){
        S193395=1;
    if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_plant.sysj line: 187, column: 35
      gripperTurnFinalPosE.setPresent();//sysj\conveyor_plant.sysj line: 187, column: 56
      currsigs.addElement(gripperTurnFinalPosE);
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread194133(int [] tdone, int [] ends){
        S193387=1;
    if(gripperTurnHomePos.getprestatus()){//sysj\conveyor_plant.sysj line: 185, column: 35
      gripperTurnHomePosE.setPresent();//sysj\conveyor_plant.sysj line: 185, column: 55
      currsigs.addElement(gripperTurnHomePosE);
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

  public void thread194132(int [] tdone, int [] ends){
        S193379=1;
    if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_plant.sysj line: 183, column: 35
      gripperZAxisLiftedE.setPresent();//sysj\conveyor_plant.sysj line: 183, column: 55
      currsigs.addElement(gripperZAxisLiftedE);
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

  public void thread194131(int [] tdone, int [] ends){
        S193371=1;
    if(gripperZAxisLowered.getprestatus()){//sysj\conveyor_plant.sysj line: 181, column: 35
      gripperZAxisLoweredE.setPresent();//sysj\conveyor_plant.sysj line: 181, column: 56
      currsigs.addElement(gripperZAxisLoweredE);
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

  public void thread194130(int [] tdone, int [] ends){
        S193363=1;
    if(cylClampBottleExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 179, column: 35
      cylClampBottleExtendE.setPresent();//sysj\conveyor_plant.sysj line: 179, column: 57
      currsigs.addElement(cylClampBottleExtendE);
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

  public void thread194129(int [] tdone, int [] ends){
        S193355=1;
    if(capGripperPos5Extend.getprestatus()){//sysj\conveyor_plant.sysj line: 177, column: 35
      capGripperPos5ExtendE.setPresent();//sysj\conveyor_plant.sysj line: 177, column: 57
      currsigs.addElement(capGripperPos5ExtendE);
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

  public void thread194128(int [] tdone, int [] ends){
        S193347=1;
    if(gripperTurnExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 175, column: 35
      gripperTurnExtendE.setPresent();//sysj\conveyor_plant.sysj line: 175, column: 54
      currsigs.addElement(gripperTurnExtendE);
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

  public void thread194127(int [] tdone, int [] ends){
        S193339=1;
    if(gripperTurnRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 173, column: 35
      gripperTurnRetractE.setPresent();//sysj\conveyor_plant.sysj line: 173, column: 55
      currsigs.addElement(gripperTurnRetractE);
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

  public void thread194126(int [] tdone, int [] ends){
        S193331=1;
    if(cylPos5ZaxisExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 171, column: 35
      cylPos5ZaxisExtendE.setPresent();//sysj\conveyor_plant.sysj line: 171, column: 55
      currsigs.addElement(cylPos5ZaxisExtendE);
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

  public void thread194125(int [] tdone, int [] ends){
        S193397=1;
    thread194126(tdone,ends);
    thread194127(tdone,ends);
    thread194128(tdone,ends);
    thread194129(tdone,ends);
    thread194130(tdone,ends);
    thread194131(tdone,ends);
    thread194132(tdone,ends);
    thread194133(tdone,ends);
    thread194134(tdone,ends);
    int biggest194135 = 0;
    if(ends[30]>=biggest194135){
      biggest194135=ends[30];
    }
    if(ends[31]>=biggest194135){
      biggest194135=ends[31];
    }
    if(ends[32]>=biggest194135){
      biggest194135=ends[32];
    }
    if(ends[33]>=biggest194135){
      biggest194135=ends[33];
    }
    if(ends[34]>=biggest194135){
      biggest194135=ends[34];
    }
    if(ends[35]>=biggest194135){
      biggest194135=ends[35];
    }
    if(ends[36]>=biggest194135){
      biggest194135=ends[36];
    }
    if(ends[37]>=biggest194135){
      biggest194135=ends[37];
    }
    if(ends[38]>=biggest194135){
      biggest194135=ends[38];
    }
    if(biggest194135 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread194124(int [] tdone, int [] ends){
        active[28]=0;
    ends[28]=0;
    tdone[28]=1;
  }

  public void thread194122(int [] tdone, int [] ends){
        S193122=1;
    S193121=0;
    active[27]=1;
    ends[27]=1;
    tdone[27]=1;
  }

  public void thread194121(int [] tdone, int [] ends){
        S193091=1;
    S193090=0;
    active[26]=1;
    ends[26]=1;
    tdone[26]=1;
  }

  public void thread194120(int [] tdone, int [] ends){
        S193060=1;
    S193059=0;
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread194119(int [] tdone, int [] ends){
        S193029=1;
    gripperZAxisLifted.setPresent();//sysj\conveyor_plant.sysj line: 134, column: 21
    currsigs.addElement(gripperZAxisLifted);
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread194118(int [] tdone, int [] ends){
        S193322=1;
    thread194119(tdone,ends);
    thread194120(tdone,ends);
    thread194121(tdone,ends);
    thread194122(tdone,ends);
    int biggest194123 = 0;
    if(ends[24]>=biggest194123){
      biggest194123=ends[24];
    }
    if(ends[25]>=biggest194123){
      biggest194123=ends[25];
    }
    if(ends[26]>=biggest194123){
      biggest194123=ends[26];
    }
    if(ends[27]>=biggest194123){
      biggest194123=ends[27];
    }
    if(biggest194123 == 1){
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S193399){
        case 0 : 
          S193399=0;
          break RUN;
        
        case 1 : 
          S193399=2;
          S193399=2;
          thread194118(tdone,ends);
          thread194124(tdone,ends);
          thread194125(tdone,ends);
          int biggest194136 = 0;
          if(ends[23]>=biggest194136){
            biggest194136=ends[23];
          }
          if(ends[28]>=biggest194136){
            biggest194136=ends[28];
          }
          if(ends[29]>=biggest194136){
            biggest194136=ends[29];
          }
          if(biggest194136 == 1){
            active[22]=1;
            ends[22]=1;
            break RUN;
          }
        
        case 2 : 
          thread194137(tdone,ends);
          thread194148(tdone,ends);
          thread194149(tdone,ends);
          int biggest194160 = 0;
          if(ends[23]>=biggest194160){
            biggest194160=ends[23];
          }
          if(ends[28]>=biggest194160){
            biggest194160=ends[28];
          }
          if(ends[29]>=biggest194160){
            biggest194160=ends[29];
          }
          if(biggest194160 == 1){
            active[22]=1;
            ends[22]=1;
            break RUN;
          }
          //FINXME code
          if(biggest194160 == 0){
            S193399=0;
            active[22]=0;
            ends[22]=0;
            S193399=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[22] != 0){
      int index = 22;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[22]!=0 || suspended[22]!=0 || active[22]!=1);
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
      if(paused[22]!=0 || suspended[22]!=0 || active[22]!=1);
      else{
        cylPos5ZaxisExtend.gethook();
        gripperTurnRetract.gethook();
        gripperTurnExtend.gethook();
        capGripperPos5Extend.gethook();
        cylClampBottleExtend.gethook();
      }
      runFinisher();
      if(active[22] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
