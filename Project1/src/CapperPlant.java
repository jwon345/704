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
  private long __start_thread_25;//sysj\conveyor_plant.sysj line: 140, column: 11
  private long __start_thread_26;//sysj\conveyor_plant.sysj line: 147, column: 13
  private long __start_thread_27;//sysj\conveyor_plant.sysj line: 154, column: 13
  private int S193086 = 1;
  private int S193009 = 1;
  private int S192716 = 1;
  private int S192747 = 1;
  private int S192746 = 1;
  private int S192778 = 1;
  private int S192777 = 1;
  private int S192809 = 1;
  private int S192808 = 1;
  private int S193084 = 1;
  private int S193018 = 1;
  private int S193026 = 1;
  private int S193034 = 1;
  private int S193042 = 1;
  private int S193050 = 1;
  private int S193058 = 1;
  private int S193066 = 1;
  private int S193074 = 1;
  private int S193082 = 1;
  
  private int[] ends = new int[52];
  private int[] tdone = new int[52];
  
  public void thread193845(int [] tdone, int [] ends){
        switch(S193082){
      case 0 : 
        active[38]=0;
        ends[38]=0;
        tdone[38]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_plant.sysj line: 188, column: 35
          gripperTurnFinalPosE.setPresent();//sysj\conveyor_plant.sysj line: 188, column: 56
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

  public void thread193844(int [] tdone, int [] ends){
        switch(S193074){
      case 0 : 
        active[37]=0;
        ends[37]=0;
        tdone[37]=1;
        break;
      
      case 1 : 
        if(gripperTurnHomePos.getprestatus()){//sysj\conveyor_plant.sysj line: 186, column: 35
          gripperTurnHomePosE.setPresent();//sysj\conveyor_plant.sysj line: 186, column: 55
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

  public void thread193843(int [] tdone, int [] ends){
        switch(S193066){
      case 0 : 
        active[36]=0;
        ends[36]=0;
        tdone[36]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_plant.sysj line: 184, column: 35
          gripperZAxisLiftedE.setPresent();//sysj\conveyor_plant.sysj line: 184, column: 55
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

  public void thread193842(int [] tdone, int [] ends){
        switch(S193058){
      case 0 : 
        active[35]=0;
        ends[35]=0;
        tdone[35]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLowered.getprestatus()){//sysj\conveyor_plant.sysj line: 182, column: 35
          gripperZAxisLoweredE.setPresent();//sysj\conveyor_plant.sysj line: 182, column: 56
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

  public void thread193841(int [] tdone, int [] ends){
        switch(S193050){
      case 0 : 
        active[34]=0;
        ends[34]=0;
        tdone[34]=1;
        break;
      
      case 1 : 
        if(cylClampBottleExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 180, column: 35
          cylClampBottleExtendE.setPresent();//sysj\conveyor_plant.sysj line: 180, column: 57
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

  public void thread193840(int [] tdone, int [] ends){
        switch(S193042){
      case 0 : 
        active[33]=0;
        ends[33]=0;
        tdone[33]=1;
        break;
      
      case 1 : 
        if(capGripperPos5Extend.getprestatus()){//sysj\conveyor_plant.sysj line: 178, column: 35
          capGripperPos5ExtendE.setPresent();//sysj\conveyor_plant.sysj line: 178, column: 57
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

  public void thread193839(int [] tdone, int [] ends){
        switch(S193034){
      case 0 : 
        active[32]=0;
        ends[32]=0;
        tdone[32]=1;
        break;
      
      case 1 : 
        if(gripperTurnExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 176, column: 35
          gripperTurnExtendE.setPresent();//sysj\conveyor_plant.sysj line: 176, column: 54
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

  public void thread193838(int [] tdone, int [] ends){
        switch(S193026){
      case 0 : 
        active[31]=0;
        ends[31]=0;
        tdone[31]=1;
        break;
      
      case 1 : 
        if(gripperTurnRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 174, column: 35
          gripperTurnRetractE.setPresent();//sysj\conveyor_plant.sysj line: 174, column: 55
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

  public void thread193837(int [] tdone, int [] ends){
        switch(S193018){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        if(cylPos5ZaxisExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 172, column: 35
          cylPos5ZaxisExtendE.setPresent();//sysj\conveyor_plant.sysj line: 172, column: 55
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

  public void thread193836(int [] tdone, int [] ends){
        switch(S193084){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        thread193837(tdone,ends);
        thread193838(tdone,ends);
        thread193839(tdone,ends);
        thread193840(tdone,ends);
        thread193841(tdone,ends);
        thread193842(tdone,ends);
        thread193843(tdone,ends);
        thread193844(tdone,ends);
        thread193845(tdone,ends);
        int biggest193846 = 0;
        if(ends[30]>=biggest193846){
          biggest193846=ends[30];
        }
        if(ends[31]>=biggest193846){
          biggest193846=ends[31];
        }
        if(ends[32]>=biggest193846){
          biggest193846=ends[32];
        }
        if(ends[33]>=biggest193846){
          biggest193846=ends[33];
        }
        if(ends[34]>=biggest193846){
          biggest193846=ends[34];
        }
        if(ends[35]>=biggest193846){
          biggest193846=ends[35];
        }
        if(ends[36]>=biggest193846){
          biggest193846=ends[36];
        }
        if(ends[37]>=biggest193846){
          biggest193846=ends[37];
        }
        if(ends[38]>=biggest193846){
          biggest193846=ends[38];
        }
        if(biggest193846 == 1){
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
        //FINXME code
        if(biggest193846 == 0){
          S193084=0;
          active[29]=0;
          ends[29]=0;
          tdone[29]=1;
        }
        break;
      
    }
  }

  public void thread193835(int [] tdone, int [] ends){
        active[28]=0;
    ends[28]=0;
    tdone[28]=1;
  }

  public void thread193833(int [] tdone, int [] ends){
        S192809=1;
    S192808=0;
    active[27]=1;
    ends[27]=1;
    tdone[27]=1;
  }

  public void thread193832(int [] tdone, int [] ends){
        S192778=1;
    S192777=0;
    active[26]=1;
    ends[26]=1;
    tdone[26]=1;
  }

  public void thread193831(int [] tdone, int [] ends){
        S192747=1;
    S192746=0;
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread193830(int [] tdone, int [] ends){
        S192716=1;
    gripperZAxisLifted.setPresent();//sysj\conveyor_plant.sysj line: 135, column: 21
    currsigs.addElement(gripperZAxisLifted);
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread193828(int [] tdone, int [] ends){
        switch(S192809){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        switch(S192808){
          case 0 : 
            if(gripperTurnExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 155, column: 24
              S192808=1;
              __start_thread_27 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 154, column: 13
              if(com.systemj.Timer.getMs() - __start_thread_27 >= 500){//sysj\conveyor_plant.sysj line: 154, column: 13
                ends[27]=2;
                ;//sysj\conveyor_plant.sysj line: 154, column: 13
                gripperTurnFinalPos.setPresent();//sysj\conveyor_plant.sysj line: 157, column: 17
                currsigs.addElement(gripperTurnFinalPos);
                S192808=2;
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
            if(com.systemj.Timer.getMs() - __start_thread_27 >= 500){//sysj\conveyor_plant.sysj line: 154, column: 13
              ends[27]=2;
              ;//sysj\conveyor_plant.sysj line: 154, column: 13
              gripperTurnFinalPos.setPresent();//sysj\conveyor_plant.sysj line: 157, column: 17
              currsigs.addElement(gripperTurnFinalPos);
              S192808=2;
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
            S192808=2;
            gripperZAxisLifted.setPresent();//sysj\conveyor_plant.sysj line: 159, column: 17
            currsigs.addElement(gripperZAxisLifted);
            S192808=3;
            active[27]=1;
            ends[27]=1;
            tdone[27]=1;
            break;
          
          case 3 : 
            S192808=3;
            S192809=0;
            active[27]=0;
            ends[27]=0;
            tdone[27]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread193827(int [] tdone, int [] ends){
        switch(S192778){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        switch(S192777){
          case 0 : 
            if(cylPos5ZaxisExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 148, column: 24
              S192777=1;
              __start_thread_26 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 147, column: 13
              if(com.systemj.Timer.getMs() - __start_thread_26 >= 500){//sysj\conveyor_plant.sysj line: 147, column: 13
                ends[26]=2;
                ;//sysj\conveyor_plant.sysj line: 147, column: 13
                gripperZAxisLowered.setPresent();//sysj\conveyor_plant.sysj line: 150, column: 17
                currsigs.addElement(gripperZAxisLowered);
                S192777=2;
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
            if(com.systemj.Timer.getMs() - __start_thread_26 >= 500){//sysj\conveyor_plant.sysj line: 147, column: 13
              ends[26]=2;
              ;//sysj\conveyor_plant.sysj line: 147, column: 13
              gripperZAxisLowered.setPresent();//sysj\conveyor_plant.sysj line: 150, column: 17
              currsigs.addElement(gripperZAxisLowered);
              S192777=2;
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
            S192777=2;
            S192778=0;
            active[26]=0;
            ends[26]=0;
            tdone[26]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread193826(int [] tdone, int [] ends){
        switch(S192747){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        switch(S192746){
          case 0 : 
            if(gripperTurnRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 141, column: 24
              S192746=1;
              __start_thread_25 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 140, column: 11
              if(com.systemj.Timer.getMs() - __start_thread_25 >= 500){//sysj\conveyor_plant.sysj line: 140, column: 11
                ends[25]=2;
                ;//sysj\conveyor_plant.sysj line: 140, column: 11
                gripperTurnHomePos.setPresent();//sysj\conveyor_plant.sysj line: 143, column: 17
                currsigs.addElement(gripperTurnHomePos);
                S192746=2;
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
            if(com.systemj.Timer.getMs() - __start_thread_25 >= 500){//sysj\conveyor_plant.sysj line: 140, column: 11
              ends[25]=2;
              ;//sysj\conveyor_plant.sysj line: 140, column: 11
              gripperTurnHomePos.setPresent();//sysj\conveyor_plant.sysj line: 143, column: 17
              currsigs.addElement(gripperTurnHomePos);
              S192746=2;
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
            S192746=2;
            S192747=0;
            active[25]=0;
            ends[25]=0;
            tdone[25]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread193825(int [] tdone, int [] ends){
        switch(S192716){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        if(gripperTurnRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 134, column: 23
          S192716=0;
          active[24]=0;
          ends[24]=0;
          tdone[24]=1;
        }
        else {
          gripperZAxisLifted.setPresent();//sysj\conveyor_plant.sysj line: 135, column: 21
          currsigs.addElement(gripperZAxisLifted);
          active[24]=1;
          ends[24]=1;
          tdone[24]=1;
        }
        break;
      
    }
  }

  public void thread193824(int [] tdone, int [] ends){
        switch(S193009){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        thread193825(tdone,ends);
        thread193826(tdone,ends);
        thread193827(tdone,ends);
        thread193828(tdone,ends);
        int biggest193829 = 0;
        if(ends[24]>=biggest193829){
          biggest193829=ends[24];
        }
        if(ends[25]>=biggest193829){
          biggest193829=ends[25];
        }
        if(ends[26]>=biggest193829){
          biggest193829=ends[26];
        }
        if(ends[27]>=biggest193829){
          biggest193829=ends[27];
        }
        if(biggest193829 == 1){
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
        //FINXME code
        if(biggest193829 == 0){
          thread193830(tdone,ends);
          thread193831(tdone,ends);
          thread193832(tdone,ends);
          thread193833(tdone,ends);
          int biggest193834 = 0;
          if(ends[24]>=biggest193834){
            biggest193834=ends[24];
          }
          if(ends[25]>=biggest193834){
            biggest193834=ends[25];
          }
          if(ends[26]>=biggest193834){
            biggest193834=ends[26];
          }
          if(ends[27]>=biggest193834){
            biggest193834=ends[27];
          }
          if(biggest193834 == 1){
            active[23]=1;
            ends[23]=1;
            tdone[23]=1;
          }
        }
        break;
      
    }
  }

  public void thread193821(int [] tdone, int [] ends){
        S193082=1;
    if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_plant.sysj line: 188, column: 35
      gripperTurnFinalPosE.setPresent();//sysj\conveyor_plant.sysj line: 188, column: 56
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

  public void thread193820(int [] tdone, int [] ends){
        S193074=1;
    if(gripperTurnHomePos.getprestatus()){//sysj\conveyor_plant.sysj line: 186, column: 35
      gripperTurnHomePosE.setPresent();//sysj\conveyor_plant.sysj line: 186, column: 55
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

  public void thread193819(int [] tdone, int [] ends){
        S193066=1;
    if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_plant.sysj line: 184, column: 35
      gripperZAxisLiftedE.setPresent();//sysj\conveyor_plant.sysj line: 184, column: 55
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

  public void thread193818(int [] tdone, int [] ends){
        S193058=1;
    if(gripperZAxisLowered.getprestatus()){//sysj\conveyor_plant.sysj line: 182, column: 35
      gripperZAxisLoweredE.setPresent();//sysj\conveyor_plant.sysj line: 182, column: 56
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

  public void thread193817(int [] tdone, int [] ends){
        S193050=1;
    if(cylClampBottleExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 180, column: 35
      cylClampBottleExtendE.setPresent();//sysj\conveyor_plant.sysj line: 180, column: 57
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

  public void thread193816(int [] tdone, int [] ends){
        S193042=1;
    if(capGripperPos5Extend.getprestatus()){//sysj\conveyor_plant.sysj line: 178, column: 35
      capGripperPos5ExtendE.setPresent();//sysj\conveyor_plant.sysj line: 178, column: 57
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

  public void thread193815(int [] tdone, int [] ends){
        S193034=1;
    if(gripperTurnExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 176, column: 35
      gripperTurnExtendE.setPresent();//sysj\conveyor_plant.sysj line: 176, column: 54
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

  public void thread193814(int [] tdone, int [] ends){
        S193026=1;
    if(gripperTurnRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 174, column: 35
      gripperTurnRetractE.setPresent();//sysj\conveyor_plant.sysj line: 174, column: 55
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

  public void thread193813(int [] tdone, int [] ends){
        S193018=1;
    if(cylPos5ZaxisExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 172, column: 35
      cylPos5ZaxisExtendE.setPresent();//sysj\conveyor_plant.sysj line: 172, column: 55
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

  public void thread193812(int [] tdone, int [] ends){
        S193084=1;
    thread193813(tdone,ends);
    thread193814(tdone,ends);
    thread193815(tdone,ends);
    thread193816(tdone,ends);
    thread193817(tdone,ends);
    thread193818(tdone,ends);
    thread193819(tdone,ends);
    thread193820(tdone,ends);
    thread193821(tdone,ends);
    int biggest193822 = 0;
    if(ends[30]>=biggest193822){
      biggest193822=ends[30];
    }
    if(ends[31]>=biggest193822){
      biggest193822=ends[31];
    }
    if(ends[32]>=biggest193822){
      biggest193822=ends[32];
    }
    if(ends[33]>=biggest193822){
      biggest193822=ends[33];
    }
    if(ends[34]>=biggest193822){
      biggest193822=ends[34];
    }
    if(ends[35]>=biggest193822){
      biggest193822=ends[35];
    }
    if(ends[36]>=biggest193822){
      biggest193822=ends[36];
    }
    if(ends[37]>=biggest193822){
      biggest193822=ends[37];
    }
    if(ends[38]>=biggest193822){
      biggest193822=ends[38];
    }
    if(biggest193822 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread193811(int [] tdone, int [] ends){
        active[28]=0;
    ends[28]=0;
    tdone[28]=1;
  }

  public void thread193809(int [] tdone, int [] ends){
        S192809=1;
    S192808=0;
    active[27]=1;
    ends[27]=1;
    tdone[27]=1;
  }

  public void thread193808(int [] tdone, int [] ends){
        S192778=1;
    S192777=0;
    active[26]=1;
    ends[26]=1;
    tdone[26]=1;
  }

  public void thread193807(int [] tdone, int [] ends){
        S192747=1;
    S192746=0;
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread193806(int [] tdone, int [] ends){
        S192716=1;
    gripperZAxisLifted.setPresent();//sysj\conveyor_plant.sysj line: 135, column: 21
    currsigs.addElement(gripperZAxisLifted);
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread193805(int [] tdone, int [] ends){
        S193009=1;
    thread193806(tdone,ends);
    thread193807(tdone,ends);
    thread193808(tdone,ends);
    thread193809(tdone,ends);
    int biggest193810 = 0;
    if(ends[24]>=biggest193810){
      biggest193810=ends[24];
    }
    if(ends[25]>=biggest193810){
      biggest193810=ends[25];
    }
    if(ends[26]>=biggest193810){
      biggest193810=ends[26];
    }
    if(ends[27]>=biggest193810){
      biggest193810=ends[27];
    }
    if(biggest193810 == 1){
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
      switch(S193086){
        case 0 : 
          S193086=0;
          break RUN;
        
        case 1 : 
          S193086=2;
          S193086=2;
          thread193805(tdone,ends);
          thread193811(tdone,ends);
          thread193812(tdone,ends);
          int biggest193823 = 0;
          if(ends[23]>=biggest193823){
            biggest193823=ends[23];
          }
          if(ends[28]>=biggest193823){
            biggest193823=ends[28];
          }
          if(ends[29]>=biggest193823){
            biggest193823=ends[29];
          }
          if(biggest193823 == 1){
            active[22]=1;
            ends[22]=1;
            break RUN;
          }
        
        case 2 : 
          thread193824(tdone,ends);
          thread193835(tdone,ends);
          thread193836(tdone,ends);
          int biggest193847 = 0;
          if(ends[23]>=biggest193847){
            biggest193847=ends[23];
          }
          if(ends[28]>=biggest193847){
            biggest193847=ends[28];
          }
          if(ends[29]>=biggest193847){
            biggest193847=ends[29];
          }
          if(biggest193847 == 1){
            active[22]=1;
            ends[22]=1;
            break RUN;
          }
          //FINXME code
          if(biggest193847 == 0){
            S193086=0;
            active[22]=0;
            ends[22]=0;
            S193086=0;
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
