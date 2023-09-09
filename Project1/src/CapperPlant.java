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
  private int S26015 = 1;
  private int S25938 = 1;
  private int S25880 = 1;
  private int S25885 = 1;
  private int S25888 = 1;
  private int S26013 = 1;
  private int S25947 = 1;
  private int S25955 = 1;
  private int S25963 = 1;
  private int S25971 = 1;
  private int S25979 = 1;
  private int S25987 = 1;
  private int S25995 = 1;
  private int S26003 = 1;
  private int S26011 = 1;
  
  private int[] ends = new int[42];
  private int[] tdone = new int[42];
  
  public void thread26119(int [] tdone, int [] ends){
        switch(S26011){
      case 0 : 
        active[41]=0;
        ends[41]=0;
        tdone[41]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_plant.sysj line: 201, column: 35
          gripperTurnFinalPosE.setPresent();//sysj\conveyor_plant.sysj line: 201, column: 56
          currsigs.addElement(gripperTurnFinalPosE);
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
        else {
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
        break;
      
    }
  }

  public void thread26118(int [] tdone, int [] ends){
        switch(S26003){
      case 0 : 
        active[40]=0;
        ends[40]=0;
        tdone[40]=1;
        break;
      
      case 1 : 
        if(gripperTurnHomePos.getprestatus()){//sysj\conveyor_plant.sysj line: 199, column: 35
          gripperTurnHomePosE.setPresent();//sysj\conveyor_plant.sysj line: 199, column: 55
          currsigs.addElement(gripperTurnHomePosE);
          active[40]=1;
          ends[40]=1;
          tdone[40]=1;
        }
        else {
          active[40]=1;
          ends[40]=1;
          tdone[40]=1;
        }
        break;
      
    }
  }

  public void thread26117(int [] tdone, int [] ends){
        switch(S25995){
      case 0 : 
        active[39]=0;
        ends[39]=0;
        tdone[39]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_plant.sysj line: 197, column: 35
          gripperZAxisLiftedE.setPresent();//sysj\conveyor_plant.sysj line: 197, column: 55
          currsigs.addElement(gripperZAxisLiftedE);
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
        else {
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
        break;
      
    }
  }

  public void thread26116(int [] tdone, int [] ends){
        switch(S25987){
      case 0 : 
        active[38]=0;
        ends[38]=0;
        tdone[38]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLowered.getprestatus()){//sysj\conveyor_plant.sysj line: 195, column: 35
          gripperZAxisLoweredE.setPresent();//sysj\conveyor_plant.sysj line: 195, column: 56
          currsigs.addElement(gripperZAxisLoweredE);
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

  public void thread26115(int [] tdone, int [] ends){
        switch(S25979){
      case 0 : 
        active[37]=0;
        ends[37]=0;
        tdone[37]=1;
        break;
      
      case 1 : 
        if(cylClampBottleExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 193, column: 35
          cylClampBottleExtendE.setPresent();//sysj\conveyor_plant.sysj line: 193, column: 57
          currsigs.addElement(cylClampBottleExtendE);
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

  public void thread26114(int [] tdone, int [] ends){
        switch(S25971){
      case 0 : 
        active[36]=0;
        ends[36]=0;
        tdone[36]=1;
        break;
      
      case 1 : 
        if(capGripperPos5Extend.getprestatus()){//sysj\conveyor_plant.sysj line: 191, column: 35
          capGripperPos5ExtendE.setPresent();//sysj\conveyor_plant.sysj line: 191, column: 57
          currsigs.addElement(capGripperPos5ExtendE);
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

  public void thread26113(int [] tdone, int [] ends){
        switch(S25963){
      case 0 : 
        active[35]=0;
        ends[35]=0;
        tdone[35]=1;
        break;
      
      case 1 : 
        if(gripperTurnExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 189, column: 35
          gripperTurnExtendE.setPresent();//sysj\conveyor_plant.sysj line: 189, column: 54
          currsigs.addElement(gripperTurnExtendE);
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

  public void thread26112(int [] tdone, int [] ends){
        switch(S25955){
      case 0 : 
        active[34]=0;
        ends[34]=0;
        tdone[34]=1;
        break;
      
      case 1 : 
        if(gripperTurnRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 187, column: 35
          gripperTurnRetractE.setPresent();//sysj\conveyor_plant.sysj line: 187, column: 55
          currsigs.addElement(gripperTurnRetractE);
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

  public void thread26111(int [] tdone, int [] ends){
        switch(S25947){
      case 0 : 
        active[33]=0;
        ends[33]=0;
        tdone[33]=1;
        break;
      
      case 1 : 
        if(cylPos5ZaxisExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 185, column: 35
          cylPos5ZaxisExtendE.setPresent();//sysj\conveyor_plant.sysj line: 185, column: 55
          currsigs.addElement(cylPos5ZaxisExtendE);
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

  public void thread26110(int [] tdone, int [] ends){
        switch(S26013){
      case 0 : 
        active[32]=0;
        ends[32]=0;
        tdone[32]=1;
        break;
      
      case 1 : 
        thread26111(tdone,ends);
        thread26112(tdone,ends);
        thread26113(tdone,ends);
        thread26114(tdone,ends);
        thread26115(tdone,ends);
        thread26116(tdone,ends);
        thread26117(tdone,ends);
        thread26118(tdone,ends);
        thread26119(tdone,ends);
        int biggest26120 = 0;
        if(ends[33]>=biggest26120){
          biggest26120=ends[33];
        }
        if(ends[34]>=biggest26120){
          biggest26120=ends[34];
        }
        if(ends[35]>=biggest26120){
          biggest26120=ends[35];
        }
        if(ends[36]>=biggest26120){
          biggest26120=ends[36];
        }
        if(ends[37]>=biggest26120){
          biggest26120=ends[37];
        }
        if(ends[38]>=biggest26120){
          biggest26120=ends[38];
        }
        if(ends[39]>=biggest26120){
          biggest26120=ends[39];
        }
        if(ends[40]>=biggest26120){
          biggest26120=ends[40];
        }
        if(ends[41]>=biggest26120){
          biggest26120=ends[41];
        }
        if(biggest26120 == 1){
          active[32]=1;
          ends[32]=1;
          tdone[32]=1;
        }
        //FINXME code
        if(biggest26120 == 0){
          S26013=0;
          active[32]=0;
          ends[32]=0;
          tdone[32]=1;
        }
        break;
      
    }
  }

  public void thread26109(int [] tdone, int [] ends){
        active[31]=0;
    ends[31]=0;
    tdone[31]=1;
  }

  public void thread26107(int [] tdone, int [] ends){
        switch(S25888){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        if(gripperTurnExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 169, column: 17
          S25888=0;
          active[30]=0;
          ends[30]=0;
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

  public void thread26106(int [] tdone, int [] ends){
        switch(S25885){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        if(capGripperPos5Extend.getprestatus()){//sysj\conveyor_plant.sysj line: 167, column: 17
          S25885=0;
          active[29]=0;
          ends[29]=0;
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

  public void thread26104(int [] tdone, int [] ends){
        S25888=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread26103(int [] tdone, int [] ends){
        S25885=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread26102(int [] tdone, int [] ends){
        switch(S25938){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        switch(S25880){
          case 0 : 
            if(gripperTurnRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 154, column: 15
              S25880=1;
              active[28]=1;
              ends[28]=1;
              tdone[28]=1;
            }
            else {
              gripperZAxisLifted.setPresent();//sysj\conveyor_plant.sysj line: 156, column: 10
              currsigs.addElement(gripperZAxisLifted);
              active[28]=1;
              ends[28]=1;
              tdone[28]=1;
            }
            break;
          
          case 1 : 
            if(gripperTurnRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 159, column: 16
              gripperTurnHomePos.setPresent();//sysj\conveyor_plant.sysj line: 160, column: 9
              currsigs.addElement(gripperTurnHomePos);
              S25880=2;
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
          
          case 2 : 
            S25880=2;
            S25880=3;
            active[28]=1;
            ends[28]=1;
            tdone[28]=1;
            break;
          
          case 3 : 
            if(cylPos5ZaxisExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 163, column: 16
              gripperZAxisLowered.setPresent();//sysj\conveyor_plant.sysj line: 164, column: 9
              currsigs.addElement(gripperZAxisLowered);
              S25880=4;
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
          
          case 4 : 
            S25880=4;
            S25880=5;
            thread26103(tdone,ends);
            thread26104(tdone,ends);
            int biggest26105 = 0;
            if(ends[29]>=biggest26105){
              biggest26105=ends[29];
            }
            if(ends[30]>=biggest26105){
              biggest26105=ends[30];
            }
            if(biggest26105 == 1){
              active[28]=1;
              ends[28]=1;
              tdone[28]=1;
            }
            break;
          
          case 5 : 
            thread26106(tdone,ends);
            thread26107(tdone,ends);
            int biggest26108 = 0;
            if(ends[29]>=biggest26108){
              biggest26108=ends[29];
            }
            if(ends[30]>=biggest26108){
              biggest26108=ends[30];
            }
            if(biggest26108 == 1){
              active[28]=1;
              ends[28]=1;
              tdone[28]=1;
            }
            //FINXME code
            if(biggest26108 == 0){
              gripperTurnFinalPos.setPresent();//sysj\conveyor_plant.sysj line: 172, column: 9
              currsigs.addElement(gripperTurnFinalPos);
              S25880=6;
              active[28]=1;
              ends[28]=1;
              tdone[28]=1;
            }
            break;
          
          case 6 : 
            S25880=6;
            gripperZAxisLifted.setPresent();//sysj\conveyor_plant.sysj line: 175, column: 9
            currsigs.addElement(gripperZAxisLifted);
            S25880=0;
            gripperZAxisLifted.setPresent();//sysj\conveyor_plant.sysj line: 156, column: 10
            currsigs.addElement(gripperZAxisLifted);
            active[28]=1;
            ends[28]=1;
            tdone[28]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread26099(int [] tdone, int [] ends){
        S26011=1;
    if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_plant.sysj line: 201, column: 35
      gripperTurnFinalPosE.setPresent();//sysj\conveyor_plant.sysj line: 201, column: 56
      currsigs.addElement(gripperTurnFinalPosE);
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
    else {
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread26098(int [] tdone, int [] ends){
        S26003=1;
    if(gripperTurnHomePos.getprestatus()){//sysj\conveyor_plant.sysj line: 199, column: 35
      gripperTurnHomePosE.setPresent();//sysj\conveyor_plant.sysj line: 199, column: 55
      currsigs.addElement(gripperTurnHomePosE);
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
  }

  public void thread26097(int [] tdone, int [] ends){
        S25995=1;
    if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_plant.sysj line: 197, column: 35
      gripperZAxisLiftedE.setPresent();//sysj\conveyor_plant.sysj line: 197, column: 55
      currsigs.addElement(gripperZAxisLiftedE);
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
  }

  public void thread26096(int [] tdone, int [] ends){
        S25987=1;
    if(gripperZAxisLowered.getprestatus()){//sysj\conveyor_plant.sysj line: 195, column: 35
      gripperZAxisLoweredE.setPresent();//sysj\conveyor_plant.sysj line: 195, column: 56
      currsigs.addElement(gripperZAxisLoweredE);
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

  public void thread26095(int [] tdone, int [] ends){
        S25979=1;
    if(cylClampBottleExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 193, column: 35
      cylClampBottleExtendE.setPresent();//sysj\conveyor_plant.sysj line: 193, column: 57
      currsigs.addElement(cylClampBottleExtendE);
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

  public void thread26094(int [] tdone, int [] ends){
        S25971=1;
    if(capGripperPos5Extend.getprestatus()){//sysj\conveyor_plant.sysj line: 191, column: 35
      capGripperPos5ExtendE.setPresent();//sysj\conveyor_plant.sysj line: 191, column: 57
      currsigs.addElement(capGripperPos5ExtendE);
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

  public void thread26093(int [] tdone, int [] ends){
        S25963=1;
    if(gripperTurnExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 189, column: 35
      gripperTurnExtendE.setPresent();//sysj\conveyor_plant.sysj line: 189, column: 54
      currsigs.addElement(gripperTurnExtendE);
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

  public void thread26092(int [] tdone, int [] ends){
        S25955=1;
    if(gripperTurnRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 187, column: 35
      gripperTurnRetractE.setPresent();//sysj\conveyor_plant.sysj line: 187, column: 55
      currsigs.addElement(gripperTurnRetractE);
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

  public void thread26091(int [] tdone, int [] ends){
        S25947=1;
    if(cylPos5ZaxisExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 185, column: 35
      cylPos5ZaxisExtendE.setPresent();//sysj\conveyor_plant.sysj line: 185, column: 55
      currsigs.addElement(cylPos5ZaxisExtendE);
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

  public void thread26090(int [] tdone, int [] ends){
        S26013=1;
    thread26091(tdone,ends);
    thread26092(tdone,ends);
    thread26093(tdone,ends);
    thread26094(tdone,ends);
    thread26095(tdone,ends);
    thread26096(tdone,ends);
    thread26097(tdone,ends);
    thread26098(tdone,ends);
    thread26099(tdone,ends);
    int biggest26100 = 0;
    if(ends[33]>=biggest26100){
      biggest26100=ends[33];
    }
    if(ends[34]>=biggest26100){
      biggest26100=ends[34];
    }
    if(ends[35]>=biggest26100){
      biggest26100=ends[35];
    }
    if(ends[36]>=biggest26100){
      biggest26100=ends[36];
    }
    if(ends[37]>=biggest26100){
      biggest26100=ends[37];
    }
    if(ends[38]>=biggest26100){
      biggest26100=ends[38];
    }
    if(ends[39]>=biggest26100){
      biggest26100=ends[39];
    }
    if(ends[40]>=biggest26100){
      biggest26100=ends[40];
    }
    if(ends[41]>=biggest26100){
      biggest26100=ends[41];
    }
    if(biggest26100 == 1){
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread26089(int [] tdone, int [] ends){
        active[31]=0;
    ends[31]=0;
    tdone[31]=1;
  }

  public void thread26088(int [] tdone, int [] ends){
        S25938=1;
    S25880=0;
    gripperZAxisLifted.setPresent();//sysj\conveyor_plant.sysj line: 156, column: 10
    currsigs.addElement(gripperZAxisLifted);
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S26015){
        case 0 : 
          S26015=0;
          break RUN;
        
        case 1 : 
          S26015=2;
          S26015=2;
          thread26088(tdone,ends);
          thread26089(tdone,ends);
          thread26090(tdone,ends);
          int biggest26101 = 0;
          if(ends[28]>=biggest26101){
            biggest26101=ends[28];
          }
          if(ends[31]>=biggest26101){
            biggest26101=ends[31];
          }
          if(ends[32]>=biggest26101){
            biggest26101=ends[32];
          }
          if(biggest26101 == 1){
            active[27]=1;
            ends[27]=1;
            break RUN;
          }
        
        case 2 : 
          thread26102(tdone,ends);
          thread26109(tdone,ends);
          thread26110(tdone,ends);
          int biggest26121 = 0;
          if(ends[28]>=biggest26121){
            biggest26121=ends[28];
          }
          if(ends[31]>=biggest26121){
            biggest26121=ends[31];
          }
          if(ends[32]>=biggest26121){
            biggest26121=ends[32];
          }
          if(biggest26121 == 1){
            active[27]=1;
            ends[27]=1;
            break RUN;
          }
          //FINXME code
          if(biggest26121 == 0){
            S26015=0;
            active[27]=0;
            ends[27]=0;
            S26015=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[27] != 0){
      int index = 27;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[27]!=0 || suspended[27]!=0 || active[27]!=1);
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
      if(paused[27]!=0 || suspended[27]!=0 || active[27]!=1);
      else{
        cylPos5ZaxisExtend.gethook();
        gripperTurnRetract.gethook();
        gripperTurnExtend.gethook();
        capGripperPos5Extend.gethook();
        cylClampBottleExtend.gethook();
      }
      runFinisher();
      if(active[27] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
