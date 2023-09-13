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
  private int S193111 = 1;
  private int S193034 = 1;
  private int S192741 = 1;
  private int S192772 = 1;
  private int S192771 = 1;
  private int S192803 = 1;
  private int S192802 = 1;
  private int S192834 = 1;
  private int S192833 = 1;
  private int S193109 = 1;
  private int S193043 = 1;
  private int S193051 = 1;
  private int S193059 = 1;
  private int S193067 = 1;
  private int S193075 = 1;
  private int S193083 = 1;
  private int S193091 = 1;
  private int S193099 = 1;
  private int S193107 = 1;
  
  private int[] ends = new int[52];
  private int[] tdone = new int[52];
  
  public void thread193870(int [] tdone, int [] ends){
        switch(S193107){
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

  public void thread193869(int [] tdone, int [] ends){
        switch(S193099){
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

  public void thread193868(int [] tdone, int [] ends){
        switch(S193091){
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

  public void thread193867(int [] tdone, int [] ends){
        switch(S193083){
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

  public void thread193866(int [] tdone, int [] ends){
        switch(S193075){
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

  public void thread193865(int [] tdone, int [] ends){
        switch(S193067){
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

  public void thread193864(int [] tdone, int [] ends){
        switch(S193059){
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

  public void thread193863(int [] tdone, int [] ends){
        switch(S193051){
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

  public void thread193862(int [] tdone, int [] ends){
        switch(S193043){
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

  public void thread193861(int [] tdone, int [] ends){
        switch(S193109){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        thread193862(tdone,ends);
        thread193863(tdone,ends);
        thread193864(tdone,ends);
        thread193865(tdone,ends);
        thread193866(tdone,ends);
        thread193867(tdone,ends);
        thread193868(tdone,ends);
        thread193869(tdone,ends);
        thread193870(tdone,ends);
        int biggest193871 = 0;
        if(ends[30]>=biggest193871){
          biggest193871=ends[30];
        }
        if(ends[31]>=biggest193871){
          biggest193871=ends[31];
        }
        if(ends[32]>=biggest193871){
          biggest193871=ends[32];
        }
        if(ends[33]>=biggest193871){
          biggest193871=ends[33];
        }
        if(ends[34]>=biggest193871){
          biggest193871=ends[34];
        }
        if(ends[35]>=biggest193871){
          biggest193871=ends[35];
        }
        if(ends[36]>=biggest193871){
          biggest193871=ends[36];
        }
        if(ends[37]>=biggest193871){
          biggest193871=ends[37];
        }
        if(ends[38]>=biggest193871){
          biggest193871=ends[38];
        }
        if(biggest193871 == 1){
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
        //FINXME code
        if(biggest193871 == 0){
          S193109=0;
          active[29]=0;
          ends[29]=0;
          tdone[29]=1;
        }
        break;
      
    }
  }

  public void thread193860(int [] tdone, int [] ends){
        active[28]=0;
    ends[28]=0;
    tdone[28]=1;
  }

  public void thread193858(int [] tdone, int [] ends){
        S192834=1;
    S192833=0;
    active[27]=1;
    ends[27]=1;
    tdone[27]=1;
  }

  public void thread193857(int [] tdone, int [] ends){
        S192803=1;
    S192802=0;
    active[26]=1;
    ends[26]=1;
    tdone[26]=1;
  }

  public void thread193856(int [] tdone, int [] ends){
        S192772=1;
    S192771=0;
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread193855(int [] tdone, int [] ends){
        S192741=1;
    gripperZAxisLifted.setPresent();//sysj\conveyor_plant.sysj line: 134, column: 21
    currsigs.addElement(gripperZAxisLifted);
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread193853(int [] tdone, int [] ends){
        switch(S192834){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        switch(S192833){
          case 0 : 
            if(gripperTurnExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 154, column: 24
              S192833=1;
              __start_thread_27 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 153, column: 13
              if(com.systemj.Timer.getMs() - __start_thread_27 >= 500){//sysj\conveyor_plant.sysj line: 153, column: 13
                ends[27]=2;
                ;//sysj\conveyor_plant.sysj line: 153, column: 13
                gripperTurnFinalPos.setPresent();//sysj\conveyor_plant.sysj line: 156, column: 17
                currsigs.addElement(gripperTurnFinalPos);
                S192833=2;
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
              S192833=2;
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
            S192833=2;
            gripperZAxisLifted.setPresent();//sysj\conveyor_plant.sysj line: 158, column: 17
            currsigs.addElement(gripperZAxisLifted);
            S192833=3;
            active[27]=1;
            ends[27]=1;
            tdone[27]=1;
            break;
          
          case 3 : 
            S192833=3;
            S192834=0;
            active[27]=0;
            ends[27]=0;
            tdone[27]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread193852(int [] tdone, int [] ends){
        switch(S192803){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        switch(S192802){
          case 0 : 
            if(cylPos5ZaxisExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 147, column: 24
              S192802=1;
              __start_thread_26 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 146, column: 13
              if(com.systemj.Timer.getMs() - __start_thread_26 >= 500){//sysj\conveyor_plant.sysj line: 146, column: 13
                ends[26]=2;
                ;//sysj\conveyor_plant.sysj line: 146, column: 13
                gripperZAxisLowered.setPresent();//sysj\conveyor_plant.sysj line: 149, column: 17
                currsigs.addElement(gripperZAxisLowered);
                S192802=2;
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
              S192802=2;
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
            S192802=2;
            S192803=0;
            active[26]=0;
            ends[26]=0;
            tdone[26]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread193851(int [] tdone, int [] ends){
        switch(S192772){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        switch(S192771){
          case 0 : 
            if(gripperTurnRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 140, column: 24
              S192771=1;
              __start_thread_25 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 139, column: 11
              if(com.systemj.Timer.getMs() - __start_thread_25 >= 500){//sysj\conveyor_plant.sysj line: 139, column: 11
                ends[25]=2;
                ;//sysj\conveyor_plant.sysj line: 139, column: 11
                gripperTurnHomePos.setPresent();//sysj\conveyor_plant.sysj line: 142, column: 17
                currsigs.addElement(gripperTurnHomePos);
                S192771=2;
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
              S192771=2;
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
            S192771=2;
            S192772=0;
            active[25]=0;
            ends[25]=0;
            tdone[25]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread193850(int [] tdone, int [] ends){
        switch(S192741){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        if(gripperTurnRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 133, column: 23
          S192741=0;
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

  public void thread193849(int [] tdone, int [] ends){
        switch(S193034){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        thread193850(tdone,ends);
        thread193851(tdone,ends);
        thread193852(tdone,ends);
        thread193853(tdone,ends);
        int biggest193854 = 0;
        if(ends[24]>=biggest193854){
          biggest193854=ends[24];
        }
        if(ends[25]>=biggest193854){
          biggest193854=ends[25];
        }
        if(ends[26]>=biggest193854){
          biggest193854=ends[26];
        }
        if(ends[27]>=biggest193854){
          biggest193854=ends[27];
        }
        if(biggest193854 == 1){
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
        //FINXME code
        if(biggest193854 == 0){
          thread193855(tdone,ends);
          thread193856(tdone,ends);
          thread193857(tdone,ends);
          thread193858(tdone,ends);
          int biggest193859 = 0;
          if(ends[24]>=biggest193859){
            biggest193859=ends[24];
          }
          if(ends[25]>=biggest193859){
            biggest193859=ends[25];
          }
          if(ends[26]>=biggest193859){
            biggest193859=ends[26];
          }
          if(ends[27]>=biggest193859){
            biggest193859=ends[27];
          }
          if(biggest193859 == 1){
            active[23]=1;
            ends[23]=1;
            tdone[23]=1;
          }
        }
        break;
      
    }
  }

  public void thread193846(int [] tdone, int [] ends){
        S193107=1;
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

  public void thread193845(int [] tdone, int [] ends){
        S193099=1;
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

  public void thread193844(int [] tdone, int [] ends){
        S193091=1;
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

  public void thread193843(int [] tdone, int [] ends){
        S193083=1;
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

  public void thread193842(int [] tdone, int [] ends){
        S193075=1;
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

  public void thread193841(int [] tdone, int [] ends){
        S193067=1;
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

  public void thread193840(int [] tdone, int [] ends){
        S193059=1;
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

  public void thread193839(int [] tdone, int [] ends){
        S193051=1;
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

  public void thread193838(int [] tdone, int [] ends){
        S193043=1;
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

  public void thread193837(int [] tdone, int [] ends){
        S193109=1;
    thread193838(tdone,ends);
    thread193839(tdone,ends);
    thread193840(tdone,ends);
    thread193841(tdone,ends);
    thread193842(tdone,ends);
    thread193843(tdone,ends);
    thread193844(tdone,ends);
    thread193845(tdone,ends);
    thread193846(tdone,ends);
    int biggest193847 = 0;
    if(ends[30]>=biggest193847){
      biggest193847=ends[30];
    }
    if(ends[31]>=biggest193847){
      biggest193847=ends[31];
    }
    if(ends[32]>=biggest193847){
      biggest193847=ends[32];
    }
    if(ends[33]>=biggest193847){
      biggest193847=ends[33];
    }
    if(ends[34]>=biggest193847){
      biggest193847=ends[34];
    }
    if(ends[35]>=biggest193847){
      biggest193847=ends[35];
    }
    if(ends[36]>=biggest193847){
      biggest193847=ends[36];
    }
    if(ends[37]>=biggest193847){
      biggest193847=ends[37];
    }
    if(ends[38]>=biggest193847){
      biggest193847=ends[38];
    }
    if(biggest193847 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread193836(int [] tdone, int [] ends){
        active[28]=0;
    ends[28]=0;
    tdone[28]=1;
  }

  public void thread193834(int [] tdone, int [] ends){
        S192834=1;
    S192833=0;
    active[27]=1;
    ends[27]=1;
    tdone[27]=1;
  }

  public void thread193833(int [] tdone, int [] ends){
        S192803=1;
    S192802=0;
    active[26]=1;
    ends[26]=1;
    tdone[26]=1;
  }

  public void thread193832(int [] tdone, int [] ends){
        S192772=1;
    S192771=0;
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread193831(int [] tdone, int [] ends){
        S192741=1;
    gripperZAxisLifted.setPresent();//sysj\conveyor_plant.sysj line: 134, column: 21
    currsigs.addElement(gripperZAxisLifted);
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread193830(int [] tdone, int [] ends){
        S193034=1;
    thread193831(tdone,ends);
    thread193832(tdone,ends);
    thread193833(tdone,ends);
    thread193834(tdone,ends);
    int biggest193835 = 0;
    if(ends[24]>=biggest193835){
      biggest193835=ends[24];
    }
    if(ends[25]>=biggest193835){
      biggest193835=ends[25];
    }
    if(ends[26]>=biggest193835){
      biggest193835=ends[26];
    }
    if(ends[27]>=biggest193835){
      biggest193835=ends[27];
    }
    if(biggest193835 == 1){
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
      switch(S193111){
        case 0 : 
          S193111=0;
          break RUN;
        
        case 1 : 
          S193111=2;
          S193111=2;
          thread193830(tdone,ends);
          thread193836(tdone,ends);
          thread193837(tdone,ends);
          int biggest193848 = 0;
          if(ends[23]>=biggest193848){
            biggest193848=ends[23];
          }
          if(ends[28]>=biggest193848){
            biggest193848=ends[28];
          }
          if(ends[29]>=biggest193848){
            biggest193848=ends[29];
          }
          if(biggest193848 == 1){
            active[22]=1;
            ends[22]=1;
            break RUN;
          }
        
        case 2 : 
          thread193849(tdone,ends);
          thread193860(tdone,ends);
          thread193861(tdone,ends);
          int biggest193872 = 0;
          if(ends[23]>=biggest193872){
            biggest193872=ends[23];
          }
          if(ends[28]>=biggest193872){
            biggest193872=ends[28];
          }
          if(ends[29]>=biggest193872){
            biggest193872=ends[29];
          }
          if(biggest193872 == 1){
            active[22]=1;
            ends[22]=1;
            break RUN;
          }
          //FINXME code
          if(biggest193872 == 0){
            S193111=0;
            active[22]=0;
            ends[22]=0;
            S193111=0;
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
