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
  private long __start_thread_24;//sysj\conveyor_plant.sysj line: 140, column: 7
  private int S203249 = 1;
  private int S203172 = 1;
  private int S202892 = 1;
  private int S203247 = 1;
  private int S203181 = 1;
  private int S203189 = 1;
  private int S203197 = 1;
  private int S203205 = 1;
  private int S203213 = 1;
  private int S203221 = 1;
  private int S203229 = 1;
  private int S203237 = 1;
  private int S203245 = 1;
  
  private int[] ends = new int[49];
  private int[] tdone = new int[49];
  
  public void thread203995(int [] tdone, int [] ends){
        switch(S203245){
      case 0 : 
        active[35]=0;
        ends[35]=0;
        tdone[35]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_plant.sysj line: 190, column: 35
          gripperTurnFinalPosE.setPresent();//sysj\conveyor_plant.sysj line: 190, column: 56
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

  public void thread203994(int [] tdone, int [] ends){
        switch(S203237){
      case 0 : 
        active[34]=0;
        ends[34]=0;
        tdone[34]=1;
        break;
      
      case 1 : 
        if(gripperTurnHomePos.getprestatus()){//sysj\conveyor_plant.sysj line: 188, column: 35
          gripperTurnHomePosE.setPresent();//sysj\conveyor_plant.sysj line: 188, column: 55
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

  public void thread203993(int [] tdone, int [] ends){
        switch(S203229){
      case 0 : 
        active[33]=0;
        ends[33]=0;
        tdone[33]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_plant.sysj line: 186, column: 35
          gripperZAxisLiftedE.setPresent();//sysj\conveyor_plant.sysj line: 186, column: 55
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

  public void thread203992(int [] tdone, int [] ends){
        switch(S203221){
      case 0 : 
        active[32]=0;
        ends[32]=0;
        tdone[32]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLowered.getprestatus()){//sysj\conveyor_plant.sysj line: 184, column: 35
          gripperZAxisLoweredE.setPresent();//sysj\conveyor_plant.sysj line: 184, column: 56
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

  public void thread203991(int [] tdone, int [] ends){
        switch(S203213){
      case 0 : 
        active[31]=0;
        ends[31]=0;
        tdone[31]=1;
        break;
      
      case 1 : 
        if(cylClampBottleExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 182, column: 35
          cylClampBottleExtendE.setPresent();//sysj\conveyor_plant.sysj line: 182, column: 57
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

  public void thread203990(int [] tdone, int [] ends){
        switch(S203205){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        if(capGripperPos5Extend.getprestatus()){//sysj\conveyor_plant.sysj line: 180, column: 35
          capGripperPos5ExtendE.setPresent();//sysj\conveyor_plant.sysj line: 180, column: 57
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

  public void thread203989(int [] tdone, int [] ends){
        switch(S203197){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        if(gripperTurnExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 178, column: 35
          gripperTurnExtendE.setPresent();//sysj\conveyor_plant.sysj line: 178, column: 54
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

  public void thread203988(int [] tdone, int [] ends){
        switch(S203189){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        if(gripperTurnRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 176, column: 35
          gripperTurnRetractE.setPresent();//sysj\conveyor_plant.sysj line: 176, column: 55
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

  public void thread203987(int [] tdone, int [] ends){
        switch(S203181){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        if(cylPos5ZaxisExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 174, column: 35
          cylPos5ZaxisExtendE.setPresent();//sysj\conveyor_plant.sysj line: 174, column: 55
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

  public void thread203986(int [] tdone, int [] ends){
        switch(S203247){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        thread203987(tdone,ends);
        thread203988(tdone,ends);
        thread203989(tdone,ends);
        thread203990(tdone,ends);
        thread203991(tdone,ends);
        thread203992(tdone,ends);
        thread203993(tdone,ends);
        thread203994(tdone,ends);
        thread203995(tdone,ends);
        int biggest203996 = 0;
        if(ends[27]>=biggest203996){
          biggest203996=ends[27];
        }
        if(ends[28]>=biggest203996){
          biggest203996=ends[28];
        }
        if(ends[29]>=biggest203996){
          biggest203996=ends[29];
        }
        if(ends[30]>=biggest203996){
          biggest203996=ends[30];
        }
        if(ends[31]>=biggest203996){
          biggest203996=ends[31];
        }
        if(ends[32]>=biggest203996){
          biggest203996=ends[32];
        }
        if(ends[33]>=biggest203996){
          biggest203996=ends[33];
        }
        if(ends[34]>=biggest203996){
          biggest203996=ends[34];
        }
        if(ends[35]>=biggest203996){
          biggest203996=ends[35];
        }
        if(biggest203996 == 1){
          active[26]=1;
          ends[26]=1;
          tdone[26]=1;
        }
        //FINXME code
        if(biggest203996 == 0){
          S203247=0;
          active[26]=0;
          ends[26]=0;
          tdone[26]=1;
        }
        break;
      
    }
  }

  public void thread203985(int [] tdone, int [] ends){
        active[25]=0;
    ends[25]=0;
    tdone[25]=1;
  }

  public void thread203984(int [] tdone, int [] ends){
        switch(S203172){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        switch(S202892){
          case 0 : 
            if(gripperTurnRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 143, column: 15
              S202892=1;
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            else {
              gripperZAxisLifted.setPresent();//sysj\conveyor_plant.sysj line: 145, column: 10
              currsigs.addElement(gripperZAxisLifted);
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            break;
          
          case 1 : 
            if(gripperTurnRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 148, column: 16
              S202892=2;
              __start_thread_24 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 140, column: 7
              if(com.systemj.Timer.getMs() - __start_thread_24 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 140, column: 7
                ends[24]=2;
                ;//sysj\conveyor_plant.sysj line: 140, column: 7
                gripperTurnHomePos.setPresent();//sysj\conveyor_plant.sysj line: 150, column: 9
                currsigs.addElement(gripperTurnHomePos);
                S202892=3;
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
            if(com.systemj.Timer.getMs() - __start_thread_24 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 140, column: 7
              ends[24]=2;
              ;//sysj\conveyor_plant.sysj line: 140, column: 7
              gripperTurnHomePos.setPresent();//sysj\conveyor_plant.sysj line: 150, column: 9
              currsigs.addElement(gripperTurnHomePos);
              S202892=3;
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
            S202892=3;
            S202892=4;
            active[24]=1;
            ends[24]=1;
            tdone[24]=1;
            break;
          
          case 4 : 
            if(cylPos5ZaxisExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 153, column: 16
              S202892=5;
              __start_thread_24 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 140, column: 7
              if(com.systemj.Timer.getMs() - __start_thread_24 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 140, column: 7
                ends[24]=2;
                ;//sysj\conveyor_plant.sysj line: 140, column: 7
                gripperZAxisLowered.setPresent();//sysj\conveyor_plant.sysj line: 155, column: 9
                currsigs.addElement(gripperZAxisLowered);
                S202892=6;
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
            if(com.systemj.Timer.getMs() - __start_thread_24 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 140, column: 7
              ends[24]=2;
              ;//sysj\conveyor_plant.sysj line: 140, column: 7
              gripperZAxisLowered.setPresent();//sysj\conveyor_plant.sysj line: 155, column: 9
              currsigs.addElement(gripperZAxisLowered);
              S202892=6;
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
            S202892=6;
            S202892=7;
            active[24]=1;
            ends[24]=1;
            tdone[24]=1;
            break;
          
          case 7 : 
            if(gripperTurnExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 158, column: 16
              S202892=8;
              __start_thread_24 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 140, column: 7
              if(com.systemj.Timer.getMs() - __start_thread_24 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 140, column: 7
                ends[24]=2;
                ;//sysj\conveyor_plant.sysj line: 140, column: 7
                gripperTurnFinalPos.setPresent();//sysj\conveyor_plant.sysj line: 160, column: 9
                currsigs.addElement(gripperTurnFinalPos);
                S202892=9;
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
            if(com.systemj.Timer.getMs() - __start_thread_24 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 140, column: 7
              ends[24]=2;
              ;//sysj\conveyor_plant.sysj line: 140, column: 7
              gripperTurnFinalPos.setPresent();//sysj\conveyor_plant.sysj line: 160, column: 9
              currsigs.addElement(gripperTurnFinalPos);
              S202892=9;
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
            S202892=9;
            gripperZAxisLifted.setPresent();//sysj\conveyor_plant.sysj line: 164, column: 9
            currsigs.addElement(gripperZAxisLifted);
            S202892=0;
            gripperZAxisLifted.setPresent();//sysj\conveyor_plant.sysj line: 145, column: 10
            currsigs.addElement(gripperZAxisLifted);
            active[24]=1;
            ends[24]=1;
            tdone[24]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread203981(int [] tdone, int [] ends){
        S203245=1;
    if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_plant.sysj line: 190, column: 35
      gripperTurnFinalPosE.setPresent();//sysj\conveyor_plant.sysj line: 190, column: 56
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

  public void thread203980(int [] tdone, int [] ends){
        S203237=1;
    if(gripperTurnHomePos.getprestatus()){//sysj\conveyor_plant.sysj line: 188, column: 35
      gripperTurnHomePosE.setPresent();//sysj\conveyor_plant.sysj line: 188, column: 55
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

  public void thread203979(int [] tdone, int [] ends){
        S203229=1;
    if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_plant.sysj line: 186, column: 35
      gripperZAxisLiftedE.setPresent();//sysj\conveyor_plant.sysj line: 186, column: 55
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

  public void thread203978(int [] tdone, int [] ends){
        S203221=1;
    if(gripperZAxisLowered.getprestatus()){//sysj\conveyor_plant.sysj line: 184, column: 35
      gripperZAxisLoweredE.setPresent();//sysj\conveyor_plant.sysj line: 184, column: 56
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

  public void thread203977(int [] tdone, int [] ends){
        S203213=1;
    if(cylClampBottleExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 182, column: 35
      cylClampBottleExtendE.setPresent();//sysj\conveyor_plant.sysj line: 182, column: 57
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

  public void thread203976(int [] tdone, int [] ends){
        S203205=1;
    if(capGripperPos5Extend.getprestatus()){//sysj\conveyor_plant.sysj line: 180, column: 35
      capGripperPos5ExtendE.setPresent();//sysj\conveyor_plant.sysj line: 180, column: 57
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

  public void thread203975(int [] tdone, int [] ends){
        S203197=1;
    if(gripperTurnExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 178, column: 35
      gripperTurnExtendE.setPresent();//sysj\conveyor_plant.sysj line: 178, column: 54
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

  public void thread203974(int [] tdone, int [] ends){
        S203189=1;
    if(gripperTurnRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 176, column: 35
      gripperTurnRetractE.setPresent();//sysj\conveyor_plant.sysj line: 176, column: 55
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

  public void thread203973(int [] tdone, int [] ends){
        S203181=1;
    if(cylPos5ZaxisExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 174, column: 35
      cylPos5ZaxisExtendE.setPresent();//sysj\conveyor_plant.sysj line: 174, column: 55
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

  public void thread203972(int [] tdone, int [] ends){
        S203247=1;
    thread203973(tdone,ends);
    thread203974(tdone,ends);
    thread203975(tdone,ends);
    thread203976(tdone,ends);
    thread203977(tdone,ends);
    thread203978(tdone,ends);
    thread203979(tdone,ends);
    thread203980(tdone,ends);
    thread203981(tdone,ends);
    int biggest203982 = 0;
    if(ends[27]>=biggest203982){
      biggest203982=ends[27];
    }
    if(ends[28]>=biggest203982){
      biggest203982=ends[28];
    }
    if(ends[29]>=biggest203982){
      biggest203982=ends[29];
    }
    if(ends[30]>=biggest203982){
      biggest203982=ends[30];
    }
    if(ends[31]>=biggest203982){
      biggest203982=ends[31];
    }
    if(ends[32]>=biggest203982){
      biggest203982=ends[32];
    }
    if(ends[33]>=biggest203982){
      biggest203982=ends[33];
    }
    if(ends[34]>=biggest203982){
      biggest203982=ends[34];
    }
    if(ends[35]>=biggest203982){
      biggest203982=ends[35];
    }
    if(biggest203982 == 1){
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread203971(int [] tdone, int [] ends){
        active[25]=0;
    ends[25]=0;
    tdone[25]=1;
  }

  public void thread203970(int [] tdone, int [] ends){
        S203172=1;
    S202892=0;
    gripperZAxisLifted.setPresent();//sysj\conveyor_plant.sysj line: 145, column: 10
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
      switch(S203249){
        case 0 : 
          S203249=0;
          break RUN;
        
        case 1 : 
          S203249=2;
          S203249=2;
          thread203970(tdone,ends);
          thread203971(tdone,ends);
          thread203972(tdone,ends);
          int biggest203983 = 0;
          if(ends[24]>=biggest203983){
            biggest203983=ends[24];
          }
          if(ends[25]>=biggest203983){
            biggest203983=ends[25];
          }
          if(ends[26]>=biggest203983){
            biggest203983=ends[26];
          }
          if(biggest203983 == 1){
            active[23]=1;
            ends[23]=1;
            break RUN;
          }
        
        case 2 : 
          thread203984(tdone,ends);
          thread203985(tdone,ends);
          thread203986(tdone,ends);
          int biggest203997 = 0;
          if(ends[24]>=biggest203997){
            biggest203997=ends[24];
          }
          if(ends[25]>=biggest203997){
            biggest203997=ends[25];
          }
          if(ends[26]>=biggest203997){
            biggest203997=ends[26];
          }
          if(biggest203997 == 1){
            active[23]=1;
            ends[23]=1;
            break RUN;
          }
          //FINXME code
          if(biggest203997 == 0){
            S203249=0;
            active[23]=0;
            ends[23]=0;
            S203249=0;
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
