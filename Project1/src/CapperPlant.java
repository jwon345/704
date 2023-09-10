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
  private int S36864 = 1;
  private int S36787 = 1;
  private int S36513 = 1;
  private int S36862 = 1;
  private int S36796 = 1;
  private int S36804 = 1;
  private int S36812 = 1;
  private int S36820 = 1;
  private int S36828 = 1;
  private int S36836 = 1;
  private int S36844 = 1;
  private int S36852 = 1;
  private int S36860 = 1;
  
  private int[] ends = new int[36];
  private int[] tdone = new int[36];
  
  public void thread36946(int [] tdone, int [] ends){
        switch(S36860){
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

  public void thread36945(int [] tdone, int [] ends){
        switch(S36852){
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

  public void thread36944(int [] tdone, int [] ends){
        switch(S36844){
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

  public void thread36943(int [] tdone, int [] ends){
        switch(S36836){
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

  public void thread36942(int [] tdone, int [] ends){
        switch(S36828){
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

  public void thread36941(int [] tdone, int [] ends){
        switch(S36820){
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

  public void thread36940(int [] tdone, int [] ends){
        switch(S36812){
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

  public void thread36939(int [] tdone, int [] ends){
        switch(S36804){
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

  public void thread36938(int [] tdone, int [] ends){
        switch(S36796){
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

  public void thread36937(int [] tdone, int [] ends){
        switch(S36862){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        thread36938(tdone,ends);
        thread36939(tdone,ends);
        thread36940(tdone,ends);
        thread36941(tdone,ends);
        thread36942(tdone,ends);
        thread36943(tdone,ends);
        thread36944(tdone,ends);
        thread36945(tdone,ends);
        thread36946(tdone,ends);
        int biggest36947 = 0;
        if(ends[27]>=biggest36947){
          biggest36947=ends[27];
        }
        if(ends[28]>=biggest36947){
          biggest36947=ends[28];
        }
        if(ends[29]>=biggest36947){
          biggest36947=ends[29];
        }
        if(ends[30]>=biggest36947){
          biggest36947=ends[30];
        }
        if(ends[31]>=biggest36947){
          biggest36947=ends[31];
        }
        if(ends[32]>=biggest36947){
          biggest36947=ends[32];
        }
        if(ends[33]>=biggest36947){
          biggest36947=ends[33];
        }
        if(ends[34]>=biggest36947){
          biggest36947=ends[34];
        }
        if(ends[35]>=biggest36947){
          biggest36947=ends[35];
        }
        if(biggest36947 == 1){
          active[26]=1;
          ends[26]=1;
          tdone[26]=1;
        }
        //FINXME code
        if(biggest36947 == 0){
          S36862=0;
          active[26]=0;
          ends[26]=0;
          tdone[26]=1;
        }
        break;
      
    }
  }

  public void thread36936(int [] tdone, int [] ends){
        active[25]=0;
    ends[25]=0;
    tdone[25]=1;
  }

  public void thread36935(int [] tdone, int [] ends){
        switch(S36787){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        switch(S36513){
          case 0 : 
            if(gripperTurnRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 142, column: 15
              S36513=1;
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
              S36513=2;
              __start_thread_24 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 139, column: 7
              if(com.systemj.Timer.getMs() - __start_thread_24 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 139, column: 7
                ends[24]=2;
                ;//sysj\conveyor_plant.sysj line: 139, column: 7
                gripperTurnHomePos.setPresent();//sysj\conveyor_plant.sysj line: 149, column: 9
                currsigs.addElement(gripperTurnHomePos);
                S36513=3;
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
              S36513=3;
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
            S36513=3;
            S36513=4;
            active[24]=1;
            ends[24]=1;
            tdone[24]=1;
            break;
          
          case 4 : 
            if(cylPos5ZaxisExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 152, column: 16
              S36513=5;
              __start_thread_24 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 139, column: 7
              if(com.systemj.Timer.getMs() - __start_thread_24 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 139, column: 7
                ends[24]=2;
                ;//sysj\conveyor_plant.sysj line: 139, column: 7
                gripperZAxisLowered.setPresent();//sysj\conveyor_plant.sysj line: 154, column: 9
                currsigs.addElement(gripperZAxisLowered);
                S36513=6;
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
              S36513=6;
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
            S36513=6;
            S36513=7;
            __start_thread_24 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 139, column: 7
            if(com.systemj.Timer.getMs() - __start_thread_24 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 139, column: 7
              ends[24]=2;
              ;//sysj\conveyor_plant.sysj line: 139, column: 7
              gripperTurnFinalPos.setPresent();//sysj\conveyor_plant.sysj line: 158, column: 9
              currsigs.addElement(gripperTurnFinalPos);
              S36513=8;
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
              S36513=8;
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
            S36513=8;
            gripperZAxisLifted.setPresent();//sysj\conveyor_plant.sysj line: 162, column: 9
            currsigs.addElement(gripperZAxisLifted);
            S36513=0;
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

  public void thread36932(int [] tdone, int [] ends){
        S36860=1;
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

  public void thread36931(int [] tdone, int [] ends){
        S36852=1;
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

  public void thread36930(int [] tdone, int [] ends){
        S36844=1;
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

  public void thread36929(int [] tdone, int [] ends){
        S36836=1;
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

  public void thread36928(int [] tdone, int [] ends){
        S36828=1;
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

  public void thread36927(int [] tdone, int [] ends){
        S36820=1;
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

  public void thread36926(int [] tdone, int [] ends){
        S36812=1;
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

  public void thread36925(int [] tdone, int [] ends){
        S36804=1;
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

  public void thread36924(int [] tdone, int [] ends){
        S36796=1;
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

  public void thread36923(int [] tdone, int [] ends){
        S36862=1;
    thread36924(tdone,ends);
    thread36925(tdone,ends);
    thread36926(tdone,ends);
    thread36927(tdone,ends);
    thread36928(tdone,ends);
    thread36929(tdone,ends);
    thread36930(tdone,ends);
    thread36931(tdone,ends);
    thread36932(tdone,ends);
    int biggest36933 = 0;
    if(ends[27]>=biggest36933){
      biggest36933=ends[27];
    }
    if(ends[28]>=biggest36933){
      biggest36933=ends[28];
    }
    if(ends[29]>=biggest36933){
      biggest36933=ends[29];
    }
    if(ends[30]>=biggest36933){
      biggest36933=ends[30];
    }
    if(ends[31]>=biggest36933){
      biggest36933=ends[31];
    }
    if(ends[32]>=biggest36933){
      biggest36933=ends[32];
    }
    if(ends[33]>=biggest36933){
      biggest36933=ends[33];
    }
    if(ends[34]>=biggest36933){
      biggest36933=ends[34];
    }
    if(ends[35]>=biggest36933){
      biggest36933=ends[35];
    }
    if(biggest36933 == 1){
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread36922(int [] tdone, int [] ends){
        active[25]=0;
    ends[25]=0;
    tdone[25]=1;
  }

  public void thread36921(int [] tdone, int [] ends){
        S36787=1;
    S36513=0;
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
      switch(S36864){
        case 0 : 
          S36864=0;
          break RUN;
        
        case 1 : 
          S36864=2;
          S36864=2;
          thread36921(tdone,ends);
          thread36922(tdone,ends);
          thread36923(tdone,ends);
          int biggest36934 = 0;
          if(ends[24]>=biggest36934){
            biggest36934=ends[24];
          }
          if(ends[25]>=biggest36934){
            biggest36934=ends[25];
          }
          if(ends[26]>=biggest36934){
            biggest36934=ends[26];
          }
          if(biggest36934 == 1){
            active[23]=1;
            ends[23]=1;
            break RUN;
          }
        
        case 2 : 
          thread36935(tdone,ends);
          thread36936(tdone,ends);
          thread36937(tdone,ends);
          int biggest36948 = 0;
          if(ends[24]>=biggest36948){
            biggest36948=ends[24];
          }
          if(ends[25]>=biggest36948){
            biggest36948=ends[25];
          }
          if(ends[26]>=biggest36948){
            biggest36948=ends[26];
          }
          if(biggest36948 == 1){
            active[23]=1;
            ends[23]=1;
            break RUN;
          }
          //FINXME code
          if(biggest36948 == 0){
            S36864=0;
            active[23]=0;
            ends[23]=0;
            S36864=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
