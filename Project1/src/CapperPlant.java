import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

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
  private long __start_thread_18;//sysj\capper.sysj line: 164, column: 11
  private long __start_thread_19;//sysj\capper.sysj line: 171, column: 13
  private long __start_thread_20;//sysj\capper.sysj line: 178, column: 13
  private int S6141 = 1;
  private int S6064 = 1;
  private int S5771 = 1;
  private int S5802 = 1;
  private int S5801 = 1;
  private int S5833 = 1;
  private int S5832 = 1;
  private int S5864 = 1;
  private int S5863 = 1;
  private int S6139 = 1;
  private int S6073 = 1;
  private int S6081 = 1;
  private int S6089 = 1;
  private int S6097 = 1;
  private int S6105 = 1;
  private int S6113 = 1;
  private int S6121 = 1;
  private int S6129 = 1;
  private int S6137 = 1;
  
  private int[] ends = new int[32];
  private int[] tdone = new int[32];
  
  public void thread6258(int [] tdone, int [] ends){
        switch(S6137){
      case 0 : 
        active[31]=0;
        ends[31]=0;
        tdone[31]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\capper.sysj line: 212, column: 35
          gripperTurnFinalPosE.setPresent();//sysj\capper.sysj line: 212, column: 56
          currsigs.addElement(gripperTurnFinalPosE);
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

  public void thread6257(int [] tdone, int [] ends){
        switch(S6129){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        if(gripperTurnHomePos.getprestatus()){//sysj\capper.sysj line: 210, column: 35
          gripperTurnHomePosE.setPresent();//sysj\capper.sysj line: 210, column: 55
          currsigs.addElement(gripperTurnHomePosE);
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

  public void thread6256(int [] tdone, int [] ends){
        switch(S6121){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLifted.getprestatus()){//sysj\capper.sysj line: 208, column: 35
          gripperZAxisLiftedE.setPresent();//sysj\capper.sysj line: 208, column: 55
          currsigs.addElement(gripperZAxisLiftedE);
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

  public void thread6255(int [] tdone, int [] ends){
        switch(S6113){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLowered.getprestatus()){//sysj\capper.sysj line: 206, column: 35
          gripperZAxisLoweredE.setPresent();//sysj\capper.sysj line: 206, column: 56
          currsigs.addElement(gripperZAxisLoweredE);
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

  public void thread6254(int [] tdone, int [] ends){
        switch(S6105){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        if(cylClampBottleExtend.getprestatus()){//sysj\capper.sysj line: 204, column: 35
          cylClampBottleExtendE.setPresent();//sysj\capper.sysj line: 204, column: 57
          currsigs.addElement(cylClampBottleExtendE);
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

  public void thread6253(int [] tdone, int [] ends){
        switch(S6097){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        if(capGripperPos5Extend.getprestatus()){//sysj\capper.sysj line: 202, column: 35
          capGripperPos5ExtendE.setPresent();//sysj\capper.sysj line: 202, column: 57
          currsigs.addElement(capGripperPos5ExtendE);
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
      
    }
  }

  public void thread6252(int [] tdone, int [] ends){
        switch(S6089){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        if(gripperTurnExtend.getprestatus()){//sysj\capper.sysj line: 200, column: 35
          gripperTurnExtendE.setPresent();//sysj\capper.sysj line: 200, column: 54
          currsigs.addElement(gripperTurnExtendE);
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
      
    }
  }

  public void thread6251(int [] tdone, int [] ends){
        switch(S6081){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        if(gripperTurnRetract.getprestatus()){//sysj\capper.sysj line: 198, column: 35
          gripperTurnRetractE.setPresent();//sysj\capper.sysj line: 198, column: 55
          currsigs.addElement(gripperTurnRetractE);
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
  }

  public void thread6250(int [] tdone, int [] ends){
        switch(S6073){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        if(cylPos5ZaxisExtend.getprestatus()){//sysj\capper.sysj line: 196, column: 35
          cylPos5ZaxisExtendE.setPresent();//sysj\capper.sysj line: 196, column: 55
          currsigs.addElement(cylPos5ZaxisExtendE);
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
        else {
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
        break;
      
    }
  }

  public void thread6249(int [] tdone, int [] ends){
        switch(S6139){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        thread6250(tdone,ends);
        thread6251(tdone,ends);
        thread6252(tdone,ends);
        thread6253(tdone,ends);
        thread6254(tdone,ends);
        thread6255(tdone,ends);
        thread6256(tdone,ends);
        thread6257(tdone,ends);
        thread6258(tdone,ends);
        int biggest6259 = 0;
        if(ends[23]>=biggest6259){
          biggest6259=ends[23];
        }
        if(ends[24]>=biggest6259){
          biggest6259=ends[24];
        }
        if(ends[25]>=biggest6259){
          biggest6259=ends[25];
        }
        if(ends[26]>=biggest6259){
          biggest6259=ends[26];
        }
        if(ends[27]>=biggest6259){
          biggest6259=ends[27];
        }
        if(ends[28]>=biggest6259){
          biggest6259=ends[28];
        }
        if(ends[29]>=biggest6259){
          biggest6259=ends[29];
        }
        if(ends[30]>=biggest6259){
          biggest6259=ends[30];
        }
        if(ends[31]>=biggest6259){
          biggest6259=ends[31];
        }
        if(biggest6259 == 1){
          active[22]=1;
          ends[22]=1;
          tdone[22]=1;
        }
        //FINXME code
        if(biggest6259 == 0){
          S6139=0;
          active[22]=0;
          ends[22]=0;
          tdone[22]=1;
        }
        break;
      
    }
  }

  public void thread6248(int [] tdone, int [] ends){
        active[21]=0;
    ends[21]=0;
    tdone[21]=1;
  }

  public void thread6246(int [] tdone, int [] ends){
        S5864=1;
    S5863=0;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread6245(int [] tdone, int [] ends){
        S5833=1;
    S5832=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread6244(int [] tdone, int [] ends){
        S5802=1;
    S5801=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread6243(int [] tdone, int [] ends){
        S5771=1;
    gripperZAxisLifted.setPresent();//sysj\capper.sysj line: 159, column: 21
    currsigs.addElement(gripperZAxisLifted);
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread6241(int [] tdone, int [] ends){
        switch(S5864){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        switch(S5863){
          case 0 : 
            if(gripperTurnExtend.getprestatus()){//sysj\capper.sysj line: 179, column: 24
              S5863=1;
              __start_thread_20 = com.systemj.Timer.getMs();//sysj\capper.sysj line: 178, column: 13
              if(com.systemj.Timer.getMs() - __start_thread_20 >= 500){//sysj\capper.sysj line: 178, column: 13
                ends[20]=2;
                ;//sysj\capper.sysj line: 178, column: 13
                gripperTurnFinalPos.setPresent();//sysj\capper.sysj line: 181, column: 17
                currsigs.addElement(gripperTurnFinalPos);
                S5863=2;
                active[20]=1;
                ends[20]=1;
                tdone[20]=1;
              }
              else {
                active[20]=1;
                ends[20]=1;
                tdone[20]=1;
              }
            }
            else {
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            break;
          
          case 1 : 
            if(com.systemj.Timer.getMs() - __start_thread_20 >= 500){//sysj\capper.sysj line: 178, column: 13
              ends[20]=2;
              ;//sysj\capper.sysj line: 178, column: 13
              gripperTurnFinalPos.setPresent();//sysj\capper.sysj line: 181, column: 17
              currsigs.addElement(gripperTurnFinalPos);
              S5863=2;
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            else {
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            break;
          
          case 2 : 
            S5863=2;
            gripperZAxisLifted.setPresent();//sysj\capper.sysj line: 183, column: 17
            currsigs.addElement(gripperZAxisLifted);
            S5863=3;
            active[20]=1;
            ends[20]=1;
            tdone[20]=1;
            break;
          
          case 3 : 
            S5863=3;
            S5864=0;
            active[20]=0;
            ends[20]=0;
            tdone[20]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread6240(int [] tdone, int [] ends){
        switch(S5833){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        switch(S5832){
          case 0 : 
            if(cylPos5ZaxisExtend.getprestatus()){//sysj\capper.sysj line: 172, column: 24
              S5832=1;
              __start_thread_19 = com.systemj.Timer.getMs();//sysj\capper.sysj line: 171, column: 13
              if(com.systemj.Timer.getMs() - __start_thread_19 >= 500){//sysj\capper.sysj line: 171, column: 13
                ends[19]=2;
                ;//sysj\capper.sysj line: 171, column: 13
                gripperZAxisLowered.setPresent();//sysj\capper.sysj line: 174, column: 17
                currsigs.addElement(gripperZAxisLowered);
                S5832=2;
                active[19]=1;
                ends[19]=1;
                tdone[19]=1;
              }
              else {
                active[19]=1;
                ends[19]=1;
                tdone[19]=1;
              }
            }
            else {
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            break;
          
          case 1 : 
            if(com.systemj.Timer.getMs() - __start_thread_19 >= 500){//sysj\capper.sysj line: 171, column: 13
              ends[19]=2;
              ;//sysj\capper.sysj line: 171, column: 13
              gripperZAxisLowered.setPresent();//sysj\capper.sysj line: 174, column: 17
              currsigs.addElement(gripperZAxisLowered);
              S5832=2;
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            else {
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            break;
          
          case 2 : 
            S5832=2;
            S5833=0;
            active[19]=0;
            ends[19]=0;
            tdone[19]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread6239(int [] tdone, int [] ends){
        switch(S5802){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        switch(S5801){
          case 0 : 
            if(gripperTurnRetract.getprestatus()){//sysj\capper.sysj line: 165, column: 24
              S5801=1;
              __start_thread_18 = com.systemj.Timer.getMs();//sysj\capper.sysj line: 164, column: 11
              if(com.systemj.Timer.getMs() - __start_thread_18 >= 500){//sysj\capper.sysj line: 164, column: 11
                ends[18]=2;
                ;//sysj\capper.sysj line: 164, column: 11
                gripperTurnHomePos.setPresent();//sysj\capper.sysj line: 167, column: 17
                currsigs.addElement(gripperTurnHomePos);
                S5801=2;
                active[18]=1;
                ends[18]=1;
                tdone[18]=1;
              }
              else {
                active[18]=1;
                ends[18]=1;
                tdone[18]=1;
              }
            }
            else {
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            break;
          
          case 1 : 
            if(com.systemj.Timer.getMs() - __start_thread_18 >= 500){//sysj\capper.sysj line: 164, column: 11
              ends[18]=2;
              ;//sysj\capper.sysj line: 164, column: 11
              gripperTurnHomePos.setPresent();//sysj\capper.sysj line: 167, column: 17
              currsigs.addElement(gripperTurnHomePos);
              S5801=2;
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            else {
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            break;
          
          case 2 : 
            S5801=2;
            S5802=0;
            active[18]=0;
            ends[18]=0;
            tdone[18]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread6238(int [] tdone, int [] ends){
        switch(S5771){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(gripperTurnRetract.getprestatus()){//sysj\capper.sysj line: 158, column: 23
          S5771=0;
          active[17]=0;
          ends[17]=0;
          tdone[17]=1;
        }
        else {
          gripperZAxisLifted.setPresent();//sysj\capper.sysj line: 159, column: 21
          currsigs.addElement(gripperZAxisLifted);
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
        break;
      
    }
  }

  public void thread6237(int [] tdone, int [] ends){
        switch(S6064){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        thread6238(tdone,ends);
        thread6239(tdone,ends);
        thread6240(tdone,ends);
        thread6241(tdone,ends);
        int biggest6242 = 0;
        if(ends[17]>=biggest6242){
          biggest6242=ends[17];
        }
        if(ends[18]>=biggest6242){
          biggest6242=ends[18];
        }
        if(ends[19]>=biggest6242){
          biggest6242=ends[19];
        }
        if(ends[20]>=biggest6242){
          biggest6242=ends[20];
        }
        if(biggest6242 == 1){
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
        //FINXME code
        if(biggest6242 == 0){
          thread6243(tdone,ends);
          thread6244(tdone,ends);
          thread6245(tdone,ends);
          thread6246(tdone,ends);
          int biggest6247 = 0;
          if(ends[17]>=biggest6247){
            biggest6247=ends[17];
          }
          if(ends[18]>=biggest6247){
            biggest6247=ends[18];
          }
          if(ends[19]>=biggest6247){
            biggest6247=ends[19];
          }
          if(ends[20]>=biggest6247){
            biggest6247=ends[20];
          }
          if(biggest6247 == 1){
            active[16]=1;
            ends[16]=1;
            tdone[16]=1;
          }
        }
        break;
      
    }
  }

  public void thread6234(int [] tdone, int [] ends){
        S6137=1;
    if(gripperTurnFinalPos.getprestatus()){//sysj\capper.sysj line: 212, column: 35
      gripperTurnFinalPosE.setPresent();//sysj\capper.sysj line: 212, column: 56
      currsigs.addElement(gripperTurnFinalPosE);
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

  public void thread6233(int [] tdone, int [] ends){
        S6129=1;
    if(gripperTurnHomePos.getprestatus()){//sysj\capper.sysj line: 210, column: 35
      gripperTurnHomePosE.setPresent();//sysj\capper.sysj line: 210, column: 55
      currsigs.addElement(gripperTurnHomePosE);
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

  public void thread6232(int [] tdone, int [] ends){
        S6121=1;
    if(gripperZAxisLifted.getprestatus()){//sysj\capper.sysj line: 208, column: 35
      gripperZAxisLiftedE.setPresent();//sysj\capper.sysj line: 208, column: 55
      currsigs.addElement(gripperZAxisLiftedE);
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

  public void thread6231(int [] tdone, int [] ends){
        S6113=1;
    if(gripperZAxisLowered.getprestatus()){//sysj\capper.sysj line: 206, column: 35
      gripperZAxisLoweredE.setPresent();//sysj\capper.sysj line: 206, column: 56
      currsigs.addElement(gripperZAxisLoweredE);
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

  public void thread6230(int [] tdone, int [] ends){
        S6105=1;
    if(cylClampBottleExtend.getprestatus()){//sysj\capper.sysj line: 204, column: 35
      cylClampBottleExtendE.setPresent();//sysj\capper.sysj line: 204, column: 57
      currsigs.addElement(cylClampBottleExtendE);
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

  public void thread6229(int [] tdone, int [] ends){
        S6097=1;
    if(capGripperPos5Extend.getprestatus()){//sysj\capper.sysj line: 202, column: 35
      capGripperPos5ExtendE.setPresent();//sysj\capper.sysj line: 202, column: 57
      currsigs.addElement(capGripperPos5ExtendE);
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

  public void thread6228(int [] tdone, int [] ends){
        S6089=1;
    if(gripperTurnExtend.getprestatus()){//sysj\capper.sysj line: 200, column: 35
      gripperTurnExtendE.setPresent();//sysj\capper.sysj line: 200, column: 54
      currsigs.addElement(gripperTurnExtendE);
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

  public void thread6227(int [] tdone, int [] ends){
        S6081=1;
    if(gripperTurnRetract.getprestatus()){//sysj\capper.sysj line: 198, column: 35
      gripperTurnRetractE.setPresent();//sysj\capper.sysj line: 198, column: 55
      currsigs.addElement(gripperTurnRetractE);
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

  public void thread6226(int [] tdone, int [] ends){
        S6073=1;
    if(cylPos5ZaxisExtend.getprestatus()){//sysj\capper.sysj line: 196, column: 35
      cylPos5ZaxisExtendE.setPresent();//sysj\capper.sysj line: 196, column: 55
      currsigs.addElement(cylPos5ZaxisExtendE);
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
  }

  public void thread6225(int [] tdone, int [] ends){
        S6139=1;
    thread6226(tdone,ends);
    thread6227(tdone,ends);
    thread6228(tdone,ends);
    thread6229(tdone,ends);
    thread6230(tdone,ends);
    thread6231(tdone,ends);
    thread6232(tdone,ends);
    thread6233(tdone,ends);
    thread6234(tdone,ends);
    int biggest6235 = 0;
    if(ends[23]>=biggest6235){
      biggest6235=ends[23];
    }
    if(ends[24]>=biggest6235){
      biggest6235=ends[24];
    }
    if(ends[25]>=biggest6235){
      biggest6235=ends[25];
    }
    if(ends[26]>=biggest6235){
      biggest6235=ends[26];
    }
    if(ends[27]>=biggest6235){
      biggest6235=ends[27];
    }
    if(ends[28]>=biggest6235){
      biggest6235=ends[28];
    }
    if(ends[29]>=biggest6235){
      biggest6235=ends[29];
    }
    if(ends[30]>=biggest6235){
      biggest6235=ends[30];
    }
    if(ends[31]>=biggest6235){
      biggest6235=ends[31];
    }
    if(biggest6235 == 1){
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread6224(int [] tdone, int [] ends){
        active[21]=0;
    ends[21]=0;
    tdone[21]=1;
  }

  public void thread6222(int [] tdone, int [] ends){
        S5864=1;
    S5863=0;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread6221(int [] tdone, int [] ends){
        S5833=1;
    S5832=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread6220(int [] tdone, int [] ends){
        S5802=1;
    S5801=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread6219(int [] tdone, int [] ends){
        S5771=1;
    gripperZAxisLifted.setPresent();//sysj\capper.sysj line: 159, column: 21
    currsigs.addElement(gripperZAxisLifted);
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread6218(int [] tdone, int [] ends){
        S6064=1;
    thread6219(tdone,ends);
    thread6220(tdone,ends);
    thread6221(tdone,ends);
    thread6222(tdone,ends);
    int biggest6223 = 0;
    if(ends[17]>=biggest6223){
      biggest6223=ends[17];
    }
    if(ends[18]>=biggest6223){
      biggest6223=ends[18];
    }
    if(ends[19]>=biggest6223){
      biggest6223=ends[19];
    }
    if(ends[20]>=biggest6223){
      biggest6223=ends[20];
    }
    if(biggest6223 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S6141){
        case 0 : 
          S6141=0;
          break RUN;
        
        case 1 : 
          S6141=2;
          S6141=2;
          thread6218(tdone,ends);
          thread6224(tdone,ends);
          thread6225(tdone,ends);
          int biggest6236 = 0;
          if(ends[16]>=biggest6236){
            biggest6236=ends[16];
          }
          if(ends[21]>=biggest6236){
            biggest6236=ends[21];
          }
          if(ends[22]>=biggest6236){
            biggest6236=ends[22];
          }
          if(biggest6236 == 1){
            active[15]=1;
            ends[15]=1;
            break RUN;
          }
        
        case 2 : 
          thread6237(tdone,ends);
          thread6248(tdone,ends);
          thread6249(tdone,ends);
          int biggest6260 = 0;
          if(ends[16]>=biggest6260){
            biggest6260=ends[16];
          }
          if(ends[21]>=biggest6260){
            biggest6260=ends[21];
          }
          if(ends[22]>=biggest6260){
            biggest6260=ends[22];
          }
          if(biggest6260 == 1){
            active[15]=1;
            ends[15]=1;
            break RUN;
          }
          //FINXME code
          if(biggest6260 == 0){
            S6141=0;
            active[15]=0;
            ends[15]=0;
            S6141=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[15] != 0){
      int index = 15;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[15]!=0 || suspended[15]!=0 || active[15]!=1);
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
      if(paused[15]!=0 || suspended[15]!=0 || active[15]!=1);
      else{
        cylPos5ZaxisExtend.gethook();
        gripperTurnRetract.gethook();
        gripperTurnExtend.gethook();
        capGripperPos5Extend.gethook();
        cylClampBottleExtend.gethook();
      }
      runFinisher();
      if(active[15] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
