import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.GUI;//sysj\capper_plant.sysj line: 1, column: 1

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
  private int S592 = 1;
  private int S514 = 1;
  private int S448 = 1;
  private int S442 = 1;
  private int S456 = 1;
  private int S464 = 1;
  private int S472 = 1;
  private int S480 = 1;
  private int S488 = 1;
  private int S496 = 1;
  private int S504 = 1;
  private int S512 = 1;
  
  private int[] ends = new int[14];
  private int[] tdone = new int[14];
  
  public void thread619(int [] tdone, int [] ends){
        switch(S512){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\capper_plant.sysj line: 44, column: 32
          gripperTurnFinalPosE.setPresent();//sysj\capper_plant.sysj line: 44, column: 53
          currsigs.addElement(gripperTurnFinalPosE);
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        else {
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        break;
      
    }
  }

  public void thread618(int [] tdone, int [] ends){
        switch(S504){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(gripperTurnHomePos.getprestatus()){//sysj\capper_plant.sysj line: 42, column: 32
          gripperTurnHomePosE.setPresent();//sysj\capper_plant.sysj line: 42, column: 52
          currsigs.addElement(gripperTurnHomePosE);
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        else {
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        break;
      
    }
  }

  public void thread617(int [] tdone, int [] ends){
        switch(S496){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLifted.getprestatus()){//sysj\capper_plant.sysj line: 40, column: 32
          gripperZAxisLiftedE.setPresent();//sysj\capper_plant.sysj line: 40, column: 52
          currsigs.addElement(gripperZAxisLiftedE);
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        else {
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        break;
      
    }
  }

  public void thread616(int [] tdone, int [] ends){
        switch(S488){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLowered.getprestatus()){//sysj\capper_plant.sysj line: 38, column: 32
          gripperZAxisLoweredE.setPresent();//sysj\capper_plant.sysj line: 38, column: 53
          currsigs.addElement(gripperZAxisLoweredE);
          active[10]=1;
          ends[10]=1;
          tdone[10]=1;
        }
        else {
          active[10]=1;
          ends[10]=1;
          tdone[10]=1;
        }
        break;
      
    }
  }

  public void thread615(int [] tdone, int [] ends){
        switch(S480){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(cylClampBottleExtend.getprestatus()){//sysj\capper_plant.sysj line: 36, column: 32
          cylClampBottleExtendE.setPresent();//sysj\capper_plant.sysj line: 36, column: 54
          currsigs.addElement(cylClampBottleExtendE);
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        else {
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        break;
      
    }
  }

  public void thread614(int [] tdone, int [] ends){
        switch(S472){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(capGripperPos5Extend.getprestatus()){//sysj\capper_plant.sysj line: 34, column: 32
          capGripperPos5ExtendE.setPresent();//sysj\capper_plant.sysj line: 34, column: 54
          currsigs.addElement(capGripperPos5ExtendE);
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        else {
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        break;
      
    }
  }

  public void thread613(int [] tdone, int [] ends){
        switch(S464){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(gripperTurnExtend.getprestatus()){//sysj\capper_plant.sysj line: 32, column: 32
          gripperTurnExtendE.setPresent();//sysj\capper_plant.sysj line: 32, column: 51
          currsigs.addElement(gripperTurnExtendE);
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        else {
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        break;
      
    }
  }

  public void thread612(int [] tdone, int [] ends){
        switch(S456){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(gripperTurnRetract.getprestatus()){//sysj\capper_plant.sysj line: 30, column: 32
          gripperTurnRetractE.setPresent();//sysj\capper_plant.sysj line: 30, column: 52
          currsigs.addElement(gripperTurnRetractE);
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        else {
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread611(int [] tdone, int [] ends){
        switch(S448){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S442){
          case 0 : 
            S442=0;
            if(cylPos5ZaxisExtend.getprestatus()){//sysj\capper_plant.sysj line: 28, column: 32
              cylPos5ZaxisExtendE.setPresent();//sysj\capper_plant.sysj line: 28, column: 52
              currsigs.addElement(cylPos5ZaxisExtendE);
              S442=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S442=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            S442=1;
            S442=0;
            if(cylPos5ZaxisExtend.getprestatus()){//sysj\capper_plant.sysj line: 28, column: 32
              cylPos5ZaxisExtendE.setPresent();//sysj\capper_plant.sysj line: 28, column: 52
              currsigs.addElement(cylPos5ZaxisExtendE);
              S442=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S442=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread610(int [] tdone, int [] ends){
        switch(S514){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        thread611(tdone,ends);
        thread612(tdone,ends);
        thread613(tdone,ends);
        thread614(tdone,ends);
        thread615(tdone,ends);
        thread616(tdone,ends);
        thread617(tdone,ends);
        thread618(tdone,ends);
        thread619(tdone,ends);
        int biggest620 = 0;
        if(ends[5]>=biggest620){
          biggest620=ends[5];
        }
        if(ends[6]>=biggest620){
          biggest620=ends[6];
        }
        if(ends[7]>=biggest620){
          biggest620=ends[7];
        }
        if(ends[8]>=biggest620){
          biggest620=ends[8];
        }
        if(ends[9]>=biggest620){
          biggest620=ends[9];
        }
        if(ends[10]>=biggest620){
          biggest620=ends[10];
        }
        if(ends[11]>=biggest620){
          biggest620=ends[11];
        }
        if(ends[12]>=biggest620){
          biggest620=ends[12];
        }
        if(ends[13]>=biggest620){
          biggest620=ends[13];
        }
        if(biggest620 == 1){
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        //FINXME code
        if(biggest620 == 0){
          S514=0;
          active[4]=0;
          ends[4]=0;
          tdone[4]=1;
        }
        break;
      
    }
  }

  public void thread609(int [] tdone, int [] ends){
        active[3]=0;
    ends[3]=0;
    tdone[3]=1;
  }

  public void thread608(int [] tdone, int [] ends){
        active[2]=0;
    ends[2]=0;
    tdone[2]=1;
  }

  public void thread605(int [] tdone, int [] ends){
        S512=1;
    if(gripperTurnFinalPos.getprestatus()){//sysj\capper_plant.sysj line: 44, column: 32
      gripperTurnFinalPosE.setPresent();//sysj\capper_plant.sysj line: 44, column: 53
      currsigs.addElement(gripperTurnFinalPosE);
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
    else {
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread604(int [] tdone, int [] ends){
        S504=1;
    if(gripperTurnHomePos.getprestatus()){//sysj\capper_plant.sysj line: 42, column: 32
      gripperTurnHomePosE.setPresent();//sysj\capper_plant.sysj line: 42, column: 52
      currsigs.addElement(gripperTurnHomePosE);
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
    else {
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread603(int [] tdone, int [] ends){
        S496=1;
    if(gripperZAxisLifted.getprestatus()){//sysj\capper_plant.sysj line: 40, column: 32
      gripperZAxisLiftedE.setPresent();//sysj\capper_plant.sysj line: 40, column: 52
      currsigs.addElement(gripperZAxisLiftedE);
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
    else {
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread602(int [] tdone, int [] ends){
        S488=1;
    if(gripperZAxisLowered.getprestatus()){//sysj\capper_plant.sysj line: 38, column: 32
      gripperZAxisLoweredE.setPresent();//sysj\capper_plant.sysj line: 38, column: 53
      currsigs.addElement(gripperZAxisLoweredE);
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread601(int [] tdone, int [] ends){
        S480=1;
    if(cylClampBottleExtend.getprestatus()){//sysj\capper_plant.sysj line: 36, column: 32
      cylClampBottleExtendE.setPresent();//sysj\capper_plant.sysj line: 36, column: 54
      currsigs.addElement(cylClampBottleExtendE);
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread600(int [] tdone, int [] ends){
        S472=1;
    if(capGripperPos5Extend.getprestatus()){//sysj\capper_plant.sysj line: 34, column: 32
      capGripperPos5ExtendE.setPresent();//sysj\capper_plant.sysj line: 34, column: 54
      currsigs.addElement(capGripperPos5ExtendE);
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread599(int [] tdone, int [] ends){
        S464=1;
    if(gripperTurnExtend.getprestatus()){//sysj\capper_plant.sysj line: 32, column: 32
      gripperTurnExtendE.setPresent();//sysj\capper_plant.sysj line: 32, column: 51
      currsigs.addElement(gripperTurnExtendE);
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread598(int [] tdone, int [] ends){
        S456=1;
    if(gripperTurnRetract.getprestatus()){//sysj\capper_plant.sysj line: 30, column: 32
      gripperTurnRetractE.setPresent();//sysj\capper_plant.sysj line: 30, column: 52
      currsigs.addElement(gripperTurnRetractE);
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread597(int [] tdone, int [] ends){
        S448=1;
    S442=0;
    if(cylPos5ZaxisExtend.getprestatus()){//sysj\capper_plant.sysj line: 28, column: 32
      cylPos5ZaxisExtendE.setPresent();//sysj\capper_plant.sysj line: 28, column: 52
      currsigs.addElement(cylPos5ZaxisExtendE);
      S442=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S442=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread596(int [] tdone, int [] ends){
        S514=1;
    thread597(tdone,ends);
    thread598(tdone,ends);
    thread599(tdone,ends);
    thread600(tdone,ends);
    thread601(tdone,ends);
    thread602(tdone,ends);
    thread603(tdone,ends);
    thread604(tdone,ends);
    thread605(tdone,ends);
    int biggest606 = 0;
    if(ends[5]>=biggest606){
      biggest606=ends[5];
    }
    if(ends[6]>=biggest606){
      biggest606=ends[6];
    }
    if(ends[7]>=biggest606){
      biggest606=ends[7];
    }
    if(ends[8]>=biggest606){
      biggest606=ends[8];
    }
    if(ends[9]>=biggest606){
      biggest606=ends[9];
    }
    if(ends[10]>=biggest606){
      biggest606=ends[10];
    }
    if(ends[11]>=biggest606){
      biggest606=ends[11];
    }
    if(ends[12]>=biggest606){
      biggest606=ends[12];
    }
    if(ends[13]>=biggest606){
      biggest606=ends[13];
    }
    if(biggest606 == 1){
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread595(int [] tdone, int [] ends){
        active[3]=0;
    ends[3]=0;
    tdone[3]=1;
  }

  public void thread594(int [] tdone, int [] ends){
        active[2]=0;
    ends[2]=0;
    tdone[2]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S592){
        case 0 : 
          S592=0;
          break RUN;
        
        case 1 : 
          S592=2;
          S592=2;
          new Thread(new GUI()).start();//sysj\capper_plant.sysj line: 17, column: 4
          thread594(tdone,ends);
          thread595(tdone,ends);
          thread596(tdone,ends);
          int biggest607 = 0;
          if(ends[2]>=biggest607){
            biggest607=ends[2];
          }
          if(ends[3]>=biggest607){
            biggest607=ends[3];
          }
          if(ends[4]>=biggest607){
            biggest607=ends[4];
          }
          if(biggest607 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread608(tdone,ends);
          thread609(tdone,ends);
          thread610(tdone,ends);
          int biggest621 = 0;
          if(ends[2]>=biggest621){
            biggest621=ends[2];
          }
          if(ends[3]>=biggest621){
            biggest621=ends[3];
          }
          if(ends[4]>=biggest621){
            biggest621=ends[4];
          }
          if(biggest621 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest621 == 0){
            S592=0;
            active[1]=0;
            ends[1]=0;
            S592=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[1] != 0){
      int index = 1;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
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
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        cylPos5ZaxisExtend.gethook();
        gripperTurnRetract.gethook();
        gripperTurnExtend.gethook();
        capGripperPos5Extend.gethook();
        cylClampBottleExtend.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
