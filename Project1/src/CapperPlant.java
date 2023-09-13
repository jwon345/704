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
  private int S192991 = 1;
  private int S192914 = 1;
  private int S192621 = 1;
  private int S192652 = 1;
  private int S192651 = 1;
  private int S192683 = 1;
  private int S192682 = 1;
  private int S192714 = 1;
  private int S192713 = 1;
  private int S192989 = 1;
  private int S192923 = 1;
  private int S192931 = 1;
  private int S192939 = 1;
  private int S192947 = 1;
  private int S192955 = 1;
  private int S192963 = 1;
  private int S192971 = 1;
  private int S192979 = 1;
  private int S192987 = 1;
  
  private int[] ends = new int[52];
  private int[] tdone = new int[52];
  
  public void thread193750(int [] tdone, int [] ends){
        switch(S192987){
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

  public void thread193749(int [] tdone, int [] ends){
        switch(S192979){
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

  public void thread193748(int [] tdone, int [] ends){
        switch(S192971){
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

  public void thread193747(int [] tdone, int [] ends){
        switch(S192963){
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

  public void thread193746(int [] tdone, int [] ends){
        switch(S192955){
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

  public void thread193745(int [] tdone, int [] ends){
        switch(S192947){
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

  public void thread193744(int [] tdone, int [] ends){
        switch(S192939){
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

  public void thread193743(int [] tdone, int [] ends){
        switch(S192931){
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

  public void thread193742(int [] tdone, int [] ends){
        switch(S192923){
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

  public void thread193741(int [] tdone, int [] ends){
        switch(S192989){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        thread193742(tdone,ends);
        thread193743(tdone,ends);
        thread193744(tdone,ends);
        thread193745(tdone,ends);
        thread193746(tdone,ends);
        thread193747(tdone,ends);
        thread193748(tdone,ends);
        thread193749(tdone,ends);
        thread193750(tdone,ends);
        int biggest193751 = 0;
        if(ends[30]>=biggest193751){
          biggest193751=ends[30];
        }
        if(ends[31]>=biggest193751){
          biggest193751=ends[31];
        }
        if(ends[32]>=biggest193751){
          biggest193751=ends[32];
        }
        if(ends[33]>=biggest193751){
          biggest193751=ends[33];
        }
        if(ends[34]>=biggest193751){
          biggest193751=ends[34];
        }
        if(ends[35]>=biggest193751){
          biggest193751=ends[35];
        }
        if(ends[36]>=biggest193751){
          biggest193751=ends[36];
        }
        if(ends[37]>=biggest193751){
          biggest193751=ends[37];
        }
        if(ends[38]>=biggest193751){
          biggest193751=ends[38];
        }
        if(biggest193751 == 1){
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
        //FINXME code
        if(biggest193751 == 0){
          S192989=0;
          active[29]=0;
          ends[29]=0;
          tdone[29]=1;
        }
        break;
      
    }
  }

  public void thread193740(int [] tdone, int [] ends){
        active[28]=0;
    ends[28]=0;
    tdone[28]=1;
  }

  public void thread193738(int [] tdone, int [] ends){
        S192714=1;
    S192713=0;
    active[27]=1;
    ends[27]=1;
    tdone[27]=1;
  }

  public void thread193737(int [] tdone, int [] ends){
        S192683=1;
    S192682=0;
    active[26]=1;
    ends[26]=1;
    tdone[26]=1;
  }

  public void thread193736(int [] tdone, int [] ends){
        S192652=1;
    S192651=0;
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread193735(int [] tdone, int [] ends){
        S192621=1;
    gripperZAxisLifted.setPresent();//sysj\conveyor_plant.sysj line: 134, column: 21
    currsigs.addElement(gripperZAxisLifted);
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread193733(int [] tdone, int [] ends){
        switch(S192714){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        switch(S192713){
          case 0 : 
            if(gripperTurnExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 154, column: 24
              S192713=1;
              __start_thread_27 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 153, column: 13
              if(com.systemj.Timer.getMs() - __start_thread_27 >= 500){//sysj\conveyor_plant.sysj line: 153, column: 13
                ends[27]=2;
                ;//sysj\conveyor_plant.sysj line: 153, column: 13
                gripperTurnFinalPos.setPresent();//sysj\conveyor_plant.sysj line: 156, column: 17
                currsigs.addElement(gripperTurnFinalPos);
                S192713=2;
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
              S192713=2;
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
            S192713=2;
            gripperZAxisLifted.setPresent();//sysj\conveyor_plant.sysj line: 158, column: 17
            currsigs.addElement(gripperZAxisLifted);
            S192713=3;
            active[27]=1;
            ends[27]=1;
            tdone[27]=1;
            break;
          
          case 3 : 
            S192713=3;
            S192714=0;
            active[27]=0;
            ends[27]=0;
            tdone[27]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread193732(int [] tdone, int [] ends){
        switch(S192683){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        switch(S192682){
          case 0 : 
            if(cylPos5ZaxisExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 147, column: 24
              S192682=1;
              __start_thread_26 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 146, column: 13
              if(com.systemj.Timer.getMs() - __start_thread_26 >= 500){//sysj\conveyor_plant.sysj line: 146, column: 13
                ends[26]=2;
                ;//sysj\conveyor_plant.sysj line: 146, column: 13
                gripperZAxisLowered.setPresent();//sysj\conveyor_plant.sysj line: 149, column: 17
                currsigs.addElement(gripperZAxisLowered);
                S192682=2;
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
              S192682=2;
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
            S192682=2;
            S192683=0;
            active[26]=0;
            ends[26]=0;
            tdone[26]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread193731(int [] tdone, int [] ends){
        switch(S192652){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        switch(S192651){
          case 0 : 
            if(gripperTurnRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 140, column: 24
              S192651=1;
              __start_thread_25 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 139, column: 11
              if(com.systemj.Timer.getMs() - __start_thread_25 >= 500){//sysj\conveyor_plant.sysj line: 139, column: 11
                ends[25]=2;
                ;//sysj\conveyor_plant.sysj line: 139, column: 11
                gripperTurnHomePos.setPresent();//sysj\conveyor_plant.sysj line: 142, column: 17
                currsigs.addElement(gripperTurnHomePos);
                S192651=2;
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
              S192651=2;
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
            S192651=2;
            S192652=0;
            active[25]=0;
            ends[25]=0;
            tdone[25]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread193730(int [] tdone, int [] ends){
        switch(S192621){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        if(gripperTurnRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 133, column: 23
          S192621=0;
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

  public void thread193729(int [] tdone, int [] ends){
        switch(S192914){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        thread193730(tdone,ends);
        thread193731(tdone,ends);
        thread193732(tdone,ends);
        thread193733(tdone,ends);
        int biggest193734 = 0;
        if(ends[24]>=biggest193734){
          biggest193734=ends[24];
        }
        if(ends[25]>=biggest193734){
          biggest193734=ends[25];
        }
        if(ends[26]>=biggest193734){
          biggest193734=ends[26];
        }
        if(ends[27]>=biggest193734){
          biggest193734=ends[27];
        }
        if(biggest193734 == 1){
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
        //FINXME code
        if(biggest193734 == 0){
          thread193735(tdone,ends);
          thread193736(tdone,ends);
          thread193737(tdone,ends);
          thread193738(tdone,ends);
          int biggest193739 = 0;
          if(ends[24]>=biggest193739){
            biggest193739=ends[24];
          }
          if(ends[25]>=biggest193739){
            biggest193739=ends[25];
          }
          if(ends[26]>=biggest193739){
            biggest193739=ends[26];
          }
          if(ends[27]>=biggest193739){
            biggest193739=ends[27];
          }
          if(biggest193739 == 1){
            active[23]=1;
            ends[23]=1;
            tdone[23]=1;
          }
        }
        break;
      
    }
  }

  public void thread193726(int [] tdone, int [] ends){
        S192987=1;
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

  public void thread193725(int [] tdone, int [] ends){
        S192979=1;
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

  public void thread193724(int [] tdone, int [] ends){
        S192971=1;
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

  public void thread193723(int [] tdone, int [] ends){
        S192963=1;
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

  public void thread193722(int [] tdone, int [] ends){
        S192955=1;
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

  public void thread193721(int [] tdone, int [] ends){
        S192947=1;
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

  public void thread193720(int [] tdone, int [] ends){
        S192939=1;
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

  public void thread193719(int [] tdone, int [] ends){
        S192931=1;
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

  public void thread193718(int [] tdone, int [] ends){
        S192923=1;
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

  public void thread193717(int [] tdone, int [] ends){
        S192989=1;
    thread193718(tdone,ends);
    thread193719(tdone,ends);
    thread193720(tdone,ends);
    thread193721(tdone,ends);
    thread193722(tdone,ends);
    thread193723(tdone,ends);
    thread193724(tdone,ends);
    thread193725(tdone,ends);
    thread193726(tdone,ends);
    int biggest193727 = 0;
    if(ends[30]>=biggest193727){
      biggest193727=ends[30];
    }
    if(ends[31]>=biggest193727){
      biggest193727=ends[31];
    }
    if(ends[32]>=biggest193727){
      biggest193727=ends[32];
    }
    if(ends[33]>=biggest193727){
      biggest193727=ends[33];
    }
    if(ends[34]>=biggest193727){
      biggest193727=ends[34];
    }
    if(ends[35]>=biggest193727){
      biggest193727=ends[35];
    }
    if(ends[36]>=biggest193727){
      biggest193727=ends[36];
    }
    if(ends[37]>=biggest193727){
      biggest193727=ends[37];
    }
    if(ends[38]>=biggest193727){
      biggest193727=ends[38];
    }
    if(biggest193727 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread193716(int [] tdone, int [] ends){
        active[28]=0;
    ends[28]=0;
    tdone[28]=1;
  }

  public void thread193714(int [] tdone, int [] ends){
        S192714=1;
    S192713=0;
    active[27]=1;
    ends[27]=1;
    tdone[27]=1;
  }

  public void thread193713(int [] tdone, int [] ends){
        S192683=1;
    S192682=0;
    active[26]=1;
    ends[26]=1;
    tdone[26]=1;
  }

  public void thread193712(int [] tdone, int [] ends){
        S192652=1;
    S192651=0;
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread193711(int [] tdone, int [] ends){
        S192621=1;
    gripperZAxisLifted.setPresent();//sysj\conveyor_plant.sysj line: 134, column: 21
    currsigs.addElement(gripperZAxisLifted);
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread193710(int [] tdone, int [] ends){
        S192914=1;
    thread193711(tdone,ends);
    thread193712(tdone,ends);
    thread193713(tdone,ends);
    thread193714(tdone,ends);
    int biggest193715 = 0;
    if(ends[24]>=biggest193715){
      biggest193715=ends[24];
    }
    if(ends[25]>=biggest193715){
      biggest193715=ends[25];
    }
    if(ends[26]>=biggest193715){
      biggest193715=ends[26];
    }
    if(ends[27]>=biggest193715){
      biggest193715=ends[27];
    }
    if(biggest193715 == 1){
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
      switch(S192991){
        case 0 : 
          S192991=0;
          break RUN;
        
        case 1 : 
          S192991=2;
          S192991=2;
          thread193710(tdone,ends);
          thread193716(tdone,ends);
          thread193717(tdone,ends);
          int biggest193728 = 0;
          if(ends[23]>=biggest193728){
            biggest193728=ends[23];
          }
          if(ends[28]>=biggest193728){
            biggest193728=ends[28];
          }
          if(ends[29]>=biggest193728){
            biggest193728=ends[29];
          }
          if(biggest193728 == 1){
            active[22]=1;
            ends[22]=1;
            break RUN;
          }
        
        case 2 : 
          thread193729(tdone,ends);
          thread193740(tdone,ends);
          thread193741(tdone,ends);
          int biggest193752 = 0;
          if(ends[23]>=biggest193752){
            biggest193752=ends[23];
          }
          if(ends[28]>=biggest193752){
            biggest193752=ends[28];
          }
          if(ends[29]>=biggest193752){
            biggest193752=ends[29];
          }
          if(biggest193752 == 1){
            active[22]=1;
            ends[22]=1;
            break RUN;
          }
          //FINXME code
          if(biggest193752 == 0){
            S192991=0;
            active[22]=0;
            ends[22]=0;
            S192991=0;
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
