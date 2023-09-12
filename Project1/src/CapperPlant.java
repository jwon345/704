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
  private int S213894 = 1;
  private int S213817 = 1;
  private int S213537 = 1;
  private int S213892 = 1;
  private int S213826 = 1;
  private int S213834 = 1;
  private int S213842 = 1;
  private int S213850 = 1;
  private int S213858 = 1;
  private int S213866 = 1;
  private int S213874 = 1;
  private int S213882 = 1;
  private int S213890 = 1;
  
  private int[] ends = new int[49];
  private int[] tdone = new int[49];
  
  public void thread214640(int [] tdone, int [] ends){
        switch(S213890){
      case 0 : 
        active[35]=0;
        ends[35]=0;
        tdone[35]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_plant.sysj line: 189, column: 35
          gripperTurnFinalPosE.setPresent();//sysj\conveyor_plant.sysj line: 189, column: 56
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

  public void thread214639(int [] tdone, int [] ends){
        switch(S213882){
      case 0 : 
        active[34]=0;
        ends[34]=0;
        tdone[34]=1;
        break;
      
      case 1 : 
        if(gripperTurnHomePos.getprestatus()){//sysj\conveyor_plant.sysj line: 187, column: 35
          gripperTurnHomePosE.setPresent();//sysj\conveyor_plant.sysj line: 187, column: 55
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

  public void thread214638(int [] tdone, int [] ends){
        switch(S213874){
      case 0 : 
        active[33]=0;
        ends[33]=0;
        tdone[33]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_plant.sysj line: 185, column: 35
          gripperZAxisLiftedE.setPresent();//sysj\conveyor_plant.sysj line: 185, column: 55
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

  public void thread214637(int [] tdone, int [] ends){
        switch(S213866){
      case 0 : 
        active[32]=0;
        ends[32]=0;
        tdone[32]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLowered.getprestatus()){//sysj\conveyor_plant.sysj line: 183, column: 35
          gripperZAxisLoweredE.setPresent();//sysj\conveyor_plant.sysj line: 183, column: 56
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

  public void thread214636(int [] tdone, int [] ends){
        switch(S213858){
      case 0 : 
        active[31]=0;
        ends[31]=0;
        tdone[31]=1;
        break;
      
      case 1 : 
        if(cylClampBottleExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 181, column: 35
          cylClampBottleExtendE.setPresent();//sysj\conveyor_plant.sysj line: 181, column: 57
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

  public void thread214635(int [] tdone, int [] ends){
        switch(S213850){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        if(capGripperPos5Extend.getprestatus()){//sysj\conveyor_plant.sysj line: 179, column: 35
          capGripperPos5ExtendE.setPresent();//sysj\conveyor_plant.sysj line: 179, column: 57
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

  public void thread214634(int [] tdone, int [] ends){
        switch(S213842){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        if(gripperTurnExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 177, column: 35
          gripperTurnExtendE.setPresent();//sysj\conveyor_plant.sysj line: 177, column: 54
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

  public void thread214633(int [] tdone, int [] ends){
        switch(S213834){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        if(gripperTurnRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 175, column: 35
          gripperTurnRetractE.setPresent();//sysj\conveyor_plant.sysj line: 175, column: 55
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

  public void thread214632(int [] tdone, int [] ends){
        switch(S213826){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        if(cylPos5ZaxisExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 173, column: 35
          cylPos5ZaxisExtendE.setPresent();//sysj\conveyor_plant.sysj line: 173, column: 55
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

  public void thread214631(int [] tdone, int [] ends){
        switch(S213892){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        thread214632(tdone,ends);
        thread214633(tdone,ends);
        thread214634(tdone,ends);
        thread214635(tdone,ends);
        thread214636(tdone,ends);
        thread214637(tdone,ends);
        thread214638(tdone,ends);
        thread214639(tdone,ends);
        thread214640(tdone,ends);
        int biggest214641 = 0;
        if(ends[27]>=biggest214641){
          biggest214641=ends[27];
        }
        if(ends[28]>=biggest214641){
          biggest214641=ends[28];
        }
        if(ends[29]>=biggest214641){
          biggest214641=ends[29];
        }
        if(ends[30]>=biggest214641){
          biggest214641=ends[30];
        }
        if(ends[31]>=biggest214641){
          biggest214641=ends[31];
        }
        if(ends[32]>=biggest214641){
          biggest214641=ends[32];
        }
        if(ends[33]>=biggest214641){
          biggest214641=ends[33];
        }
        if(ends[34]>=biggest214641){
          biggest214641=ends[34];
        }
        if(ends[35]>=biggest214641){
          biggest214641=ends[35];
        }
        if(biggest214641 == 1){
          active[26]=1;
          ends[26]=1;
          tdone[26]=1;
        }
        //FINXME code
        if(biggest214641 == 0){
          S213892=0;
          active[26]=0;
          ends[26]=0;
          tdone[26]=1;
        }
        break;
      
    }
  }

  public void thread214630(int [] tdone, int [] ends){
        active[25]=0;
    ends[25]=0;
    tdone[25]=1;
  }

  public void thread214629(int [] tdone, int [] ends){
        switch(S213817){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        switch(S213537){
          case 0 : 
            if(gripperTurnRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 142, column: 15
              S213537=1;
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
              S213537=2;
              __start_thread_24 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 139, column: 7
              if(com.systemj.Timer.getMs() - __start_thread_24 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 139, column: 7
                ends[24]=2;
                ;//sysj\conveyor_plant.sysj line: 139, column: 7
                gripperTurnHomePos.setPresent();//sysj\conveyor_plant.sysj line: 149, column: 9
                currsigs.addElement(gripperTurnHomePos);
                S213537=3;
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
              S213537=3;
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
            S213537=3;
            S213537=4;
            active[24]=1;
            ends[24]=1;
            tdone[24]=1;
            break;
          
          case 4 : 
            if(cylPos5ZaxisExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 152, column: 16
              S213537=5;
              __start_thread_24 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 139, column: 7
              if(com.systemj.Timer.getMs() - __start_thread_24 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 139, column: 7
                ends[24]=2;
                ;//sysj\conveyor_plant.sysj line: 139, column: 7
                gripperZAxisLowered.setPresent();//sysj\conveyor_plant.sysj line: 154, column: 9
                currsigs.addElement(gripperZAxisLowered);
                S213537=6;
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
              S213537=6;
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
            S213537=6;
            S213537=7;
            active[24]=1;
            ends[24]=1;
            tdone[24]=1;
            break;
          
          case 7 : 
            if(gripperTurnExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 157, column: 16
              S213537=8;
              __start_thread_24 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 139, column: 7
              if(com.systemj.Timer.getMs() - __start_thread_24 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 139, column: 7
                ends[24]=2;
                ;//sysj\conveyor_plant.sysj line: 139, column: 7
                gripperTurnFinalPos.setPresent();//sysj\conveyor_plant.sysj line: 159, column: 9
                currsigs.addElement(gripperTurnFinalPos);
                S213537=9;
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
          
          case 8 : 
            if(com.systemj.Timer.getMs() - __start_thread_24 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 139, column: 7
              ends[24]=2;
              ;//sysj\conveyor_plant.sysj line: 139, column: 7
              gripperTurnFinalPos.setPresent();//sysj\conveyor_plant.sysj line: 159, column: 9
              currsigs.addElement(gripperTurnFinalPos);
              S213537=9;
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
            S213537=9;
            gripperZAxisLifted.setPresent();//sysj\conveyor_plant.sysj line: 163, column: 9
            currsigs.addElement(gripperZAxisLifted);
            S213537=0;
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

  public void thread214626(int [] tdone, int [] ends){
        S213890=1;
    if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_plant.sysj line: 189, column: 35
      gripperTurnFinalPosE.setPresent();//sysj\conveyor_plant.sysj line: 189, column: 56
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

  public void thread214625(int [] tdone, int [] ends){
        S213882=1;
    if(gripperTurnHomePos.getprestatus()){//sysj\conveyor_plant.sysj line: 187, column: 35
      gripperTurnHomePosE.setPresent();//sysj\conveyor_plant.sysj line: 187, column: 55
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

  public void thread214624(int [] tdone, int [] ends){
        S213874=1;
    if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_plant.sysj line: 185, column: 35
      gripperZAxisLiftedE.setPresent();//sysj\conveyor_plant.sysj line: 185, column: 55
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

  public void thread214623(int [] tdone, int [] ends){
        S213866=1;
    if(gripperZAxisLowered.getprestatus()){//sysj\conveyor_plant.sysj line: 183, column: 35
      gripperZAxisLoweredE.setPresent();//sysj\conveyor_plant.sysj line: 183, column: 56
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

  public void thread214622(int [] tdone, int [] ends){
        S213858=1;
    if(cylClampBottleExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 181, column: 35
      cylClampBottleExtendE.setPresent();//sysj\conveyor_plant.sysj line: 181, column: 57
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

  public void thread214621(int [] tdone, int [] ends){
        S213850=1;
    if(capGripperPos5Extend.getprestatus()){//sysj\conveyor_plant.sysj line: 179, column: 35
      capGripperPos5ExtendE.setPresent();//sysj\conveyor_plant.sysj line: 179, column: 57
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

  public void thread214620(int [] tdone, int [] ends){
        S213842=1;
    if(gripperTurnExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 177, column: 35
      gripperTurnExtendE.setPresent();//sysj\conveyor_plant.sysj line: 177, column: 54
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

  public void thread214619(int [] tdone, int [] ends){
        S213834=1;
    if(gripperTurnRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 175, column: 35
      gripperTurnRetractE.setPresent();//sysj\conveyor_plant.sysj line: 175, column: 55
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

  public void thread214618(int [] tdone, int [] ends){
        S213826=1;
    if(cylPos5ZaxisExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 173, column: 35
      cylPos5ZaxisExtendE.setPresent();//sysj\conveyor_plant.sysj line: 173, column: 55
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

  public void thread214617(int [] tdone, int [] ends){
        S213892=1;
    thread214618(tdone,ends);
    thread214619(tdone,ends);
    thread214620(tdone,ends);
    thread214621(tdone,ends);
    thread214622(tdone,ends);
    thread214623(tdone,ends);
    thread214624(tdone,ends);
    thread214625(tdone,ends);
    thread214626(tdone,ends);
    int biggest214627 = 0;
    if(ends[27]>=biggest214627){
      biggest214627=ends[27];
    }
    if(ends[28]>=biggest214627){
      biggest214627=ends[28];
    }
    if(ends[29]>=biggest214627){
      biggest214627=ends[29];
    }
    if(ends[30]>=biggest214627){
      biggest214627=ends[30];
    }
    if(ends[31]>=biggest214627){
      biggest214627=ends[31];
    }
    if(ends[32]>=biggest214627){
      biggest214627=ends[32];
    }
    if(ends[33]>=biggest214627){
      biggest214627=ends[33];
    }
    if(ends[34]>=biggest214627){
      biggest214627=ends[34];
    }
    if(ends[35]>=biggest214627){
      biggest214627=ends[35];
    }
    if(biggest214627 == 1){
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread214616(int [] tdone, int [] ends){
        active[25]=0;
    ends[25]=0;
    tdone[25]=1;
  }

  public void thread214615(int [] tdone, int [] ends){
        S213817=1;
    S213537=0;
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
      switch(S213894){
        case 0 : 
          S213894=0;
          break RUN;
        
        case 1 : 
          S213894=2;
          S213894=2;
          thread214615(tdone,ends);
          thread214616(tdone,ends);
          thread214617(tdone,ends);
          int biggest214628 = 0;
          if(ends[24]>=biggest214628){
            biggest214628=ends[24];
          }
          if(ends[25]>=biggest214628){
            biggest214628=ends[25];
          }
          if(ends[26]>=biggest214628){
            biggest214628=ends[26];
          }
          if(biggest214628 == 1){
            active[23]=1;
            ends[23]=1;
            break RUN;
          }
        
        case 2 : 
          thread214629(tdone,ends);
          thread214630(tdone,ends);
          thread214631(tdone,ends);
          int biggest214642 = 0;
          if(ends[24]>=biggest214642){
            biggest214642=ends[24];
          }
          if(ends[25]>=biggest214642){
            biggest214642=ends[25];
          }
          if(ends[26]>=biggest214642){
            biggest214642=ends[26];
          }
          if(biggest214642 == 1){
            active[23]=1;
            ends[23]=1;
            break RUN;
          }
          //FINXME code
          if(biggest214642 == 0){
            S213894=0;
            active[23]=0;
            ends[23]=0;
            S213894=0;
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
