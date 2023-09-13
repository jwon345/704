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
  private int S202769 = 1;
  private int S202692 = 1;
  private int S202399 = 1;
  private int S202430 = 1;
  private int S202429 = 1;
  private int S202461 = 1;
  private int S202460 = 1;
  private int S202492 = 1;
  private int S202491 = 1;
  private int S202767 = 1;
  private int S202701 = 1;
  private int S202709 = 1;
  private int S202717 = 1;
  private int S202725 = 1;
  private int S202733 = 1;
  private int S202741 = 1;
  private int S202749 = 1;
  private int S202757 = 1;
  private int S202765 = 1;
  
  private int[] ends = new int[52];
  private int[] tdone = new int[52];
  
  public void thread203528(int [] tdone, int [] ends){
        switch(S202765){
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

  public void thread203527(int [] tdone, int [] ends){
        switch(S202757){
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

  public void thread203526(int [] tdone, int [] ends){
        switch(S202749){
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

  public void thread203525(int [] tdone, int [] ends){
        switch(S202741){
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

  public void thread203524(int [] tdone, int [] ends){
        switch(S202733){
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

  public void thread203523(int [] tdone, int [] ends){
        switch(S202725){
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

  public void thread203522(int [] tdone, int [] ends){
        switch(S202717){
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

  public void thread203521(int [] tdone, int [] ends){
        switch(S202709){
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

  public void thread203520(int [] tdone, int [] ends){
        switch(S202701){
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

  public void thread203519(int [] tdone, int [] ends){
        switch(S202767){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        thread203520(tdone,ends);
        thread203521(tdone,ends);
        thread203522(tdone,ends);
        thread203523(tdone,ends);
        thread203524(tdone,ends);
        thread203525(tdone,ends);
        thread203526(tdone,ends);
        thread203527(tdone,ends);
        thread203528(tdone,ends);
        int biggest203529 = 0;
        if(ends[30]>=biggest203529){
          biggest203529=ends[30];
        }
        if(ends[31]>=biggest203529){
          biggest203529=ends[31];
        }
        if(ends[32]>=biggest203529){
          biggest203529=ends[32];
        }
        if(ends[33]>=biggest203529){
          biggest203529=ends[33];
        }
        if(ends[34]>=biggest203529){
          biggest203529=ends[34];
        }
        if(ends[35]>=biggest203529){
          biggest203529=ends[35];
        }
        if(ends[36]>=biggest203529){
          biggest203529=ends[36];
        }
        if(ends[37]>=biggest203529){
          biggest203529=ends[37];
        }
        if(ends[38]>=biggest203529){
          biggest203529=ends[38];
        }
        if(biggest203529 == 1){
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
        //FINXME code
        if(biggest203529 == 0){
          S202767=0;
          active[29]=0;
          ends[29]=0;
          tdone[29]=1;
        }
        break;
      
    }
  }

  public void thread203518(int [] tdone, int [] ends){
        active[28]=0;
    ends[28]=0;
    tdone[28]=1;
  }

  public void thread203516(int [] tdone, int [] ends){
        S202492=1;
    S202491=0;
    active[27]=1;
    ends[27]=1;
    tdone[27]=1;
  }

  public void thread203515(int [] tdone, int [] ends){
        S202461=1;
    S202460=0;
    active[26]=1;
    ends[26]=1;
    tdone[26]=1;
  }

  public void thread203514(int [] tdone, int [] ends){
        S202430=1;
    S202429=0;
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread203513(int [] tdone, int [] ends){
        S202399=1;
    gripperZAxisLifted.setPresent();//sysj\conveyor_plant.sysj line: 134, column: 21
    currsigs.addElement(gripperZAxisLifted);
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread203511(int [] tdone, int [] ends){
        switch(S202492){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        switch(S202491){
          case 0 : 
            if(gripperTurnExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 154, column: 24
              S202491=1;
              __start_thread_27 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 153, column: 13
              if(com.systemj.Timer.getMs() - __start_thread_27 >= 500){//sysj\conveyor_plant.sysj line: 153, column: 13
                ends[27]=2;
                ;//sysj\conveyor_plant.sysj line: 153, column: 13
                gripperTurnFinalPos.setPresent();//sysj\conveyor_plant.sysj line: 156, column: 17
                currsigs.addElement(gripperTurnFinalPos);
                S202491=2;
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
              S202491=2;
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
            S202491=2;
            gripperZAxisLifted.setPresent();//sysj\conveyor_plant.sysj line: 158, column: 17
            currsigs.addElement(gripperZAxisLifted);
            S202491=3;
            active[27]=1;
            ends[27]=1;
            tdone[27]=1;
            break;
          
          case 3 : 
            S202491=3;
            S202492=0;
            active[27]=0;
            ends[27]=0;
            tdone[27]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread203510(int [] tdone, int [] ends){
        switch(S202461){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        switch(S202460){
          case 0 : 
            if(cylPos5ZaxisExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 147, column: 24
              S202460=1;
              __start_thread_26 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 146, column: 13
              if(com.systemj.Timer.getMs() - __start_thread_26 >= 500){//sysj\conveyor_plant.sysj line: 146, column: 13
                ends[26]=2;
                ;//sysj\conveyor_plant.sysj line: 146, column: 13
                gripperZAxisLowered.setPresent();//sysj\conveyor_plant.sysj line: 149, column: 17
                currsigs.addElement(gripperZAxisLowered);
                S202460=2;
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
              S202460=2;
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
            S202460=2;
            S202461=0;
            active[26]=0;
            ends[26]=0;
            tdone[26]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread203509(int [] tdone, int [] ends){
        switch(S202430){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        switch(S202429){
          case 0 : 
            if(gripperTurnRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 140, column: 24
              S202429=1;
              __start_thread_25 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 139, column: 11
              if(com.systemj.Timer.getMs() - __start_thread_25 >= 500){//sysj\conveyor_plant.sysj line: 139, column: 11
                ends[25]=2;
                ;//sysj\conveyor_plant.sysj line: 139, column: 11
                gripperTurnHomePos.setPresent();//sysj\conveyor_plant.sysj line: 142, column: 17
                currsigs.addElement(gripperTurnHomePos);
                S202429=2;
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
              S202429=2;
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
            S202429=2;
            S202430=0;
            active[25]=0;
            ends[25]=0;
            tdone[25]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread203508(int [] tdone, int [] ends){
        switch(S202399){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        if(gripperTurnRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 133, column: 23
          S202399=0;
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

  public void thread203507(int [] tdone, int [] ends){
        switch(S202692){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        thread203508(tdone,ends);
        thread203509(tdone,ends);
        thread203510(tdone,ends);
        thread203511(tdone,ends);
        int biggest203512 = 0;
        if(ends[24]>=biggest203512){
          biggest203512=ends[24];
        }
        if(ends[25]>=biggest203512){
          biggest203512=ends[25];
        }
        if(ends[26]>=biggest203512){
          biggest203512=ends[26];
        }
        if(ends[27]>=biggest203512){
          biggest203512=ends[27];
        }
        if(biggest203512 == 1){
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
        //FINXME code
        if(biggest203512 == 0){
          thread203513(tdone,ends);
          thread203514(tdone,ends);
          thread203515(tdone,ends);
          thread203516(tdone,ends);
          int biggest203517 = 0;
          if(ends[24]>=biggest203517){
            biggest203517=ends[24];
          }
          if(ends[25]>=biggest203517){
            biggest203517=ends[25];
          }
          if(ends[26]>=biggest203517){
            biggest203517=ends[26];
          }
          if(ends[27]>=biggest203517){
            biggest203517=ends[27];
          }
          if(biggest203517 == 1){
            active[23]=1;
            ends[23]=1;
            tdone[23]=1;
          }
        }
        break;
      
    }
  }

  public void thread203504(int [] tdone, int [] ends){
        S202765=1;
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

  public void thread203503(int [] tdone, int [] ends){
        S202757=1;
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

  public void thread203502(int [] tdone, int [] ends){
        S202749=1;
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

  public void thread203501(int [] tdone, int [] ends){
        S202741=1;
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

  public void thread203500(int [] tdone, int [] ends){
        S202733=1;
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

  public void thread203499(int [] tdone, int [] ends){
        S202725=1;
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

  public void thread203498(int [] tdone, int [] ends){
        S202717=1;
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

  public void thread203497(int [] tdone, int [] ends){
        S202709=1;
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

  public void thread203496(int [] tdone, int [] ends){
        S202701=1;
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

  public void thread203495(int [] tdone, int [] ends){
        S202767=1;
    thread203496(tdone,ends);
    thread203497(tdone,ends);
    thread203498(tdone,ends);
    thread203499(tdone,ends);
    thread203500(tdone,ends);
    thread203501(tdone,ends);
    thread203502(tdone,ends);
    thread203503(tdone,ends);
    thread203504(tdone,ends);
    int biggest203505 = 0;
    if(ends[30]>=biggest203505){
      biggest203505=ends[30];
    }
    if(ends[31]>=biggest203505){
      biggest203505=ends[31];
    }
    if(ends[32]>=biggest203505){
      biggest203505=ends[32];
    }
    if(ends[33]>=biggest203505){
      biggest203505=ends[33];
    }
    if(ends[34]>=biggest203505){
      biggest203505=ends[34];
    }
    if(ends[35]>=biggest203505){
      biggest203505=ends[35];
    }
    if(ends[36]>=biggest203505){
      biggest203505=ends[36];
    }
    if(ends[37]>=biggest203505){
      biggest203505=ends[37];
    }
    if(ends[38]>=biggest203505){
      biggest203505=ends[38];
    }
    if(biggest203505 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread203494(int [] tdone, int [] ends){
        active[28]=0;
    ends[28]=0;
    tdone[28]=1;
  }

  public void thread203492(int [] tdone, int [] ends){
        S202492=1;
    S202491=0;
    active[27]=1;
    ends[27]=1;
    tdone[27]=1;
  }

  public void thread203491(int [] tdone, int [] ends){
        S202461=1;
    S202460=0;
    active[26]=1;
    ends[26]=1;
    tdone[26]=1;
  }

  public void thread203490(int [] tdone, int [] ends){
        S202430=1;
    S202429=0;
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread203489(int [] tdone, int [] ends){
        S202399=1;
    gripperZAxisLifted.setPresent();//sysj\conveyor_plant.sysj line: 134, column: 21
    currsigs.addElement(gripperZAxisLifted);
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread203488(int [] tdone, int [] ends){
        S202692=1;
    thread203489(tdone,ends);
    thread203490(tdone,ends);
    thread203491(tdone,ends);
    thread203492(tdone,ends);
    int biggest203493 = 0;
    if(ends[24]>=biggest203493){
      biggest203493=ends[24];
    }
    if(ends[25]>=biggest203493){
      biggest203493=ends[25];
    }
    if(ends[26]>=biggest203493){
      biggest203493=ends[26];
    }
    if(ends[27]>=biggest203493){
      biggest203493=ends[27];
    }
    if(biggest203493 == 1){
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
      switch(S202769){
        case 0 : 
          S202769=0;
          break RUN;
        
        case 1 : 
          S202769=2;
          S202769=2;
          thread203488(tdone,ends);
          thread203494(tdone,ends);
          thread203495(tdone,ends);
          int biggest203506 = 0;
          if(ends[23]>=biggest203506){
            biggest203506=ends[23];
          }
          if(ends[28]>=biggest203506){
            biggest203506=ends[28];
          }
          if(ends[29]>=biggest203506){
            biggest203506=ends[29];
          }
          if(biggest203506 == 1){
            active[22]=1;
            ends[22]=1;
            break RUN;
          }
        
        case 2 : 
          thread203507(tdone,ends);
          thread203518(tdone,ends);
          thread203519(tdone,ends);
          int biggest203530 = 0;
          if(ends[23]>=biggest203530){
            biggest203530=ends[23];
          }
          if(ends[28]>=biggest203530){
            biggest203530=ends[28];
          }
          if(ends[29]>=biggest203530){
            biggest203530=ends[29];
          }
          if(biggest203530 == 1){
            active[22]=1;
            ends[22]=1;
            break RUN;
          }
          //FINXME code
          if(biggest203530 == 0){
            S202769=0;
            active[22]=0;
            ends[22]=0;
            S202769=0;
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
