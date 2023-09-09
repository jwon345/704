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
  private long __start_thread_26;//sysj\conveyor_plant.sysj line: 145, column: 7
  private int S31568 = 1;
  private int S31491 = 1;
  private int S30831 = 1;
  private int S30892 = 1;
  private int S30895 = 1;
  private int S31566 = 1;
  private int S31500 = 1;
  private int S31508 = 1;
  private int S31516 = 1;
  private int S31524 = 1;
  private int S31532 = 1;
  private int S31540 = 1;
  private int S31548 = 1;
  private int S31556 = 1;
  private int S31564 = 1;
  
  private int[] ends = new int[40];
  private int[] tdone = new int[40];
  
  public void thread31660(int [] tdone, int [] ends){
        switch(S31564){
      case 0 : 
        active[39]=0;
        ends[39]=0;
        tdone[39]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_plant.sysj line: 199, column: 35
          gripperTurnFinalPosE.setPresent();//sysj\conveyor_plant.sysj line: 199, column: 56
          currsigs.addElement(gripperTurnFinalPosE);
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

  public void thread31659(int [] tdone, int [] ends){
        switch(S31556){
      case 0 : 
        active[38]=0;
        ends[38]=0;
        tdone[38]=1;
        break;
      
      case 1 : 
        if(gripperTurnHomePos.getprestatus()){//sysj\conveyor_plant.sysj line: 197, column: 35
          gripperTurnHomePosE.setPresent();//sysj\conveyor_plant.sysj line: 197, column: 55
          currsigs.addElement(gripperTurnHomePosE);
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

  public void thread31658(int [] tdone, int [] ends){
        switch(S31548){
      case 0 : 
        active[37]=0;
        ends[37]=0;
        tdone[37]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_plant.sysj line: 195, column: 35
          gripperZAxisLiftedE.setPresent();//sysj\conveyor_plant.sysj line: 195, column: 55
          currsigs.addElement(gripperZAxisLiftedE);
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

  public void thread31657(int [] tdone, int [] ends){
        switch(S31540){
      case 0 : 
        active[36]=0;
        ends[36]=0;
        tdone[36]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLowered.getprestatus()){//sysj\conveyor_plant.sysj line: 193, column: 35
          gripperZAxisLoweredE.setPresent();//sysj\conveyor_plant.sysj line: 193, column: 56
          currsigs.addElement(gripperZAxisLoweredE);
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

  public void thread31656(int [] tdone, int [] ends){
        switch(S31532){
      case 0 : 
        active[35]=0;
        ends[35]=0;
        tdone[35]=1;
        break;
      
      case 1 : 
        if(cylClampBottleExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 191, column: 35
          cylClampBottleExtendE.setPresent();//sysj\conveyor_plant.sysj line: 191, column: 57
          currsigs.addElement(cylClampBottleExtendE);
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

  public void thread31655(int [] tdone, int [] ends){
        switch(S31524){
      case 0 : 
        active[34]=0;
        ends[34]=0;
        tdone[34]=1;
        break;
      
      case 1 : 
        if(capGripperPos5Extend.getprestatus()){//sysj\conveyor_plant.sysj line: 189, column: 35
          capGripperPos5ExtendE.setPresent();//sysj\conveyor_plant.sysj line: 189, column: 57
          currsigs.addElement(capGripperPos5ExtendE);
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

  public void thread31654(int [] tdone, int [] ends){
        switch(S31516){
      case 0 : 
        active[33]=0;
        ends[33]=0;
        tdone[33]=1;
        break;
      
      case 1 : 
        if(gripperTurnExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 187, column: 35
          gripperTurnExtendE.setPresent();//sysj\conveyor_plant.sysj line: 187, column: 54
          currsigs.addElement(gripperTurnExtendE);
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

  public void thread31653(int [] tdone, int [] ends){
        switch(S31508){
      case 0 : 
        active[32]=0;
        ends[32]=0;
        tdone[32]=1;
        break;
      
      case 1 : 
        if(gripperTurnRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 185, column: 35
          gripperTurnRetractE.setPresent();//sysj\conveyor_plant.sysj line: 185, column: 55
          currsigs.addElement(gripperTurnRetractE);
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

  public void thread31652(int [] tdone, int [] ends){
        switch(S31500){
      case 0 : 
        active[31]=0;
        ends[31]=0;
        tdone[31]=1;
        break;
      
      case 1 : 
        if(cylPos5ZaxisExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 183, column: 35
          cylPos5ZaxisExtendE.setPresent();//sysj\conveyor_plant.sysj line: 183, column: 55
          currsigs.addElement(cylPos5ZaxisExtendE);
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

  public void thread31651(int [] tdone, int [] ends){
        switch(S31566){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        thread31652(tdone,ends);
        thread31653(tdone,ends);
        thread31654(tdone,ends);
        thread31655(tdone,ends);
        thread31656(tdone,ends);
        thread31657(tdone,ends);
        thread31658(tdone,ends);
        thread31659(tdone,ends);
        thread31660(tdone,ends);
        int biggest31661 = 0;
        if(ends[31]>=biggest31661){
          biggest31661=ends[31];
        }
        if(ends[32]>=biggest31661){
          biggest31661=ends[32];
        }
        if(ends[33]>=biggest31661){
          biggest31661=ends[33];
        }
        if(ends[34]>=biggest31661){
          biggest31661=ends[34];
        }
        if(ends[35]>=biggest31661){
          biggest31661=ends[35];
        }
        if(ends[36]>=biggest31661){
          biggest31661=ends[36];
        }
        if(ends[37]>=biggest31661){
          biggest31661=ends[37];
        }
        if(ends[38]>=biggest31661){
          biggest31661=ends[38];
        }
        if(ends[39]>=biggest31661){
          biggest31661=ends[39];
        }
        if(biggest31661 == 1){
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
        //FINXME code
        if(biggest31661 == 0){
          S31566=0;
          active[30]=0;
          ends[30]=0;
          tdone[30]=1;
        }
        break;
      
    }
  }

  public void thread31650(int [] tdone, int [] ends){
        active[29]=0;
    ends[29]=0;
    tdone[29]=1;
  }

  public void thread31648(int [] tdone, int [] ends){
        switch(S30895){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        if(gripperTurnExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 165, column: 17
          S30895=0;
          active[28]=0;
          ends[28]=0;
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

  public void thread31647(int [] tdone, int [] ends){
        switch(S30892){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        if(capGripperPos5Extend.getprestatus()){//sysj\conveyor_plant.sysj line: 163, column: 17
          S30892=0;
          active[27]=0;
          ends[27]=0;
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

  public void thread31645(int [] tdone, int [] ends){
        S30895=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread31644(int [] tdone, int [] ends){
        S30892=1;
    active[27]=1;
    ends[27]=1;
    tdone[27]=1;
  }

  public void thread31643(int [] tdone, int [] ends){
        switch(S31491){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        switch(S30831){
          case 0 : 
            if(gripperTurnRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 148, column: 15
              S30831=1;
              active[26]=1;
              ends[26]=1;
              tdone[26]=1;
            }
            else {
              gripperZAxisLifted.setPresent();//sysj\conveyor_plant.sysj line: 150, column: 10
              currsigs.addElement(gripperZAxisLifted);
              active[26]=1;
              ends[26]=1;
              tdone[26]=1;
            }
            break;
          
          case 1 : 
            if(gripperTurnRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 153, column: 16
              S30831=2;
              __start_thread_26 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 145, column: 7
              if(com.systemj.Timer.getMs() - __start_thread_26 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 145, column: 7
                ends[26]=2;
                ;//sysj\conveyor_plant.sysj line: 145, column: 7
                gripperTurnHomePos.setPresent();//sysj\conveyor_plant.sysj line: 155, column: 9
                currsigs.addElement(gripperTurnHomePos);
                S30831=3;
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
          
          case 2 : 
            if(com.systemj.Timer.getMs() - __start_thread_26 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 145, column: 7
              ends[26]=2;
              ;//sysj\conveyor_plant.sysj line: 145, column: 7
              gripperTurnHomePos.setPresent();//sysj\conveyor_plant.sysj line: 155, column: 9
              currsigs.addElement(gripperTurnHomePos);
              S30831=3;
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
          
          case 3 : 
            S30831=3;
            S30831=4;
            active[26]=1;
            ends[26]=1;
            tdone[26]=1;
            break;
          
          case 4 : 
            if(cylPos5ZaxisExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 158, column: 16
              S30831=5;
              __start_thread_26 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 145, column: 7
              if(com.systemj.Timer.getMs() - __start_thread_26 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 145, column: 7
                ends[26]=2;
                ;//sysj\conveyor_plant.sysj line: 145, column: 7
                gripperZAxisLowered.setPresent();//sysj\conveyor_plant.sysj line: 160, column: 9
                currsigs.addElement(gripperZAxisLowered);
                S30831=6;
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
          
          case 5 : 
            if(com.systemj.Timer.getMs() - __start_thread_26 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 145, column: 7
              ends[26]=2;
              ;//sysj\conveyor_plant.sysj line: 145, column: 7
              gripperZAxisLowered.setPresent();//sysj\conveyor_plant.sysj line: 160, column: 9
              currsigs.addElement(gripperZAxisLowered);
              S30831=6;
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
          
          case 6 : 
            S30831=6;
            S30831=7;
            thread31644(tdone,ends);
            thread31645(tdone,ends);
            int biggest31646 = 0;
            if(ends[27]>=biggest31646){
              biggest31646=ends[27];
            }
            if(ends[28]>=biggest31646){
              biggest31646=ends[28];
            }
            if(biggest31646 == 1){
              active[26]=1;
              ends[26]=1;
              tdone[26]=1;
            }
            break;
          
          case 7 : 
            thread31647(tdone,ends);
            thread31648(tdone,ends);
            int biggest31649 = 0;
            if(ends[27]>=biggest31649){
              biggest31649=ends[27];
            }
            if(ends[28]>=biggest31649){
              biggest31649=ends[28];
            }
            if(biggest31649 == 1){
              active[26]=1;
              ends[26]=1;
              tdone[26]=1;
            }
            //FINXME code
            if(biggest31649 == 0){
              S30831=8;
              __start_thread_26 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 145, column: 7
              if(com.systemj.Timer.getMs() - __start_thread_26 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 145, column: 7
                ends[26]=2;
                ;//sysj\conveyor_plant.sysj line: 145, column: 7
                gripperTurnFinalPos.setPresent();//sysj\conveyor_plant.sysj line: 169, column: 9
                currsigs.addElement(gripperTurnFinalPos);
                S30831=9;
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
            break;
          
          case 8 : 
            if(com.systemj.Timer.getMs() - __start_thread_26 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 145, column: 7
              ends[26]=2;
              ;//sysj\conveyor_plant.sysj line: 145, column: 7
              gripperTurnFinalPos.setPresent();//sysj\conveyor_plant.sysj line: 169, column: 9
              currsigs.addElement(gripperTurnFinalPos);
              S30831=9;
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
          
          case 9 : 
            S30831=9;
            S30831=10;
            __start_thread_26 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 145, column: 7
            if(com.systemj.Timer.getMs() - __start_thread_26 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 145, column: 7
              ends[26]=2;
              ;//sysj\conveyor_plant.sysj line: 145, column: 7
              gripperZAxisLifted.setPresent();//sysj\conveyor_plant.sysj line: 173, column: 9
              currsigs.addElement(gripperZAxisLifted);
              S30831=0;
              gripperZAxisLifted.setPresent();//sysj\conveyor_plant.sysj line: 150, column: 10
              currsigs.addElement(gripperZAxisLifted);
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
          
          case 10 : 
            if(com.systemj.Timer.getMs() - __start_thread_26 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 145, column: 7
              ends[26]=2;
              ;//sysj\conveyor_plant.sysj line: 145, column: 7
              gripperZAxisLifted.setPresent();//sysj\conveyor_plant.sysj line: 173, column: 9
              currsigs.addElement(gripperZAxisLifted);
              S30831=0;
              gripperZAxisLifted.setPresent();//sysj\conveyor_plant.sysj line: 150, column: 10
              currsigs.addElement(gripperZAxisLifted);
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
        break;
      
    }
  }

  public void thread31640(int [] tdone, int [] ends){
        S31564=1;
    if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_plant.sysj line: 199, column: 35
      gripperTurnFinalPosE.setPresent();//sysj\conveyor_plant.sysj line: 199, column: 56
      currsigs.addElement(gripperTurnFinalPosE);
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

  public void thread31639(int [] tdone, int [] ends){
        S31556=1;
    if(gripperTurnHomePos.getprestatus()){//sysj\conveyor_plant.sysj line: 197, column: 35
      gripperTurnHomePosE.setPresent();//sysj\conveyor_plant.sysj line: 197, column: 55
      currsigs.addElement(gripperTurnHomePosE);
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

  public void thread31638(int [] tdone, int [] ends){
        S31548=1;
    if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_plant.sysj line: 195, column: 35
      gripperZAxisLiftedE.setPresent();//sysj\conveyor_plant.sysj line: 195, column: 55
      currsigs.addElement(gripperZAxisLiftedE);
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

  public void thread31637(int [] tdone, int [] ends){
        S31540=1;
    if(gripperZAxisLowered.getprestatus()){//sysj\conveyor_plant.sysj line: 193, column: 35
      gripperZAxisLoweredE.setPresent();//sysj\conveyor_plant.sysj line: 193, column: 56
      currsigs.addElement(gripperZAxisLoweredE);
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

  public void thread31636(int [] tdone, int [] ends){
        S31532=1;
    if(cylClampBottleExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 191, column: 35
      cylClampBottleExtendE.setPresent();//sysj\conveyor_plant.sysj line: 191, column: 57
      currsigs.addElement(cylClampBottleExtendE);
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

  public void thread31635(int [] tdone, int [] ends){
        S31524=1;
    if(capGripperPos5Extend.getprestatus()){//sysj\conveyor_plant.sysj line: 189, column: 35
      capGripperPos5ExtendE.setPresent();//sysj\conveyor_plant.sysj line: 189, column: 57
      currsigs.addElement(capGripperPos5ExtendE);
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

  public void thread31634(int [] tdone, int [] ends){
        S31516=1;
    if(gripperTurnExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 187, column: 35
      gripperTurnExtendE.setPresent();//sysj\conveyor_plant.sysj line: 187, column: 54
      currsigs.addElement(gripperTurnExtendE);
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

  public void thread31633(int [] tdone, int [] ends){
        S31508=1;
    if(gripperTurnRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 185, column: 35
      gripperTurnRetractE.setPresent();//sysj\conveyor_plant.sysj line: 185, column: 55
      currsigs.addElement(gripperTurnRetractE);
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

  public void thread31632(int [] tdone, int [] ends){
        S31500=1;
    if(cylPos5ZaxisExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 183, column: 35
      cylPos5ZaxisExtendE.setPresent();//sysj\conveyor_plant.sysj line: 183, column: 55
      currsigs.addElement(cylPos5ZaxisExtendE);
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

  public void thread31631(int [] tdone, int [] ends){
        S31566=1;
    thread31632(tdone,ends);
    thread31633(tdone,ends);
    thread31634(tdone,ends);
    thread31635(tdone,ends);
    thread31636(tdone,ends);
    thread31637(tdone,ends);
    thread31638(tdone,ends);
    thread31639(tdone,ends);
    thread31640(tdone,ends);
    int biggest31641 = 0;
    if(ends[31]>=biggest31641){
      biggest31641=ends[31];
    }
    if(ends[32]>=biggest31641){
      biggest31641=ends[32];
    }
    if(ends[33]>=biggest31641){
      biggest31641=ends[33];
    }
    if(ends[34]>=biggest31641){
      biggest31641=ends[34];
    }
    if(ends[35]>=biggest31641){
      biggest31641=ends[35];
    }
    if(ends[36]>=biggest31641){
      biggest31641=ends[36];
    }
    if(ends[37]>=biggest31641){
      biggest31641=ends[37];
    }
    if(ends[38]>=biggest31641){
      biggest31641=ends[38];
    }
    if(ends[39]>=biggest31641){
      biggest31641=ends[39];
    }
    if(biggest31641 == 1){
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
  }

  public void thread31630(int [] tdone, int [] ends){
        active[29]=0;
    ends[29]=0;
    tdone[29]=1;
  }

  public void thread31629(int [] tdone, int [] ends){
        S31491=1;
    S30831=0;
    gripperZAxisLifted.setPresent();//sysj\conveyor_plant.sysj line: 150, column: 10
    currsigs.addElement(gripperZAxisLifted);
    active[26]=1;
    ends[26]=1;
    tdone[26]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S31568){
        case 0 : 
          S31568=0;
          break RUN;
        
        case 1 : 
          S31568=2;
          S31568=2;
          thread31629(tdone,ends);
          thread31630(tdone,ends);
          thread31631(tdone,ends);
          int biggest31642 = 0;
          if(ends[26]>=biggest31642){
            biggest31642=ends[26];
          }
          if(ends[29]>=biggest31642){
            biggest31642=ends[29];
          }
          if(ends[30]>=biggest31642){
            biggest31642=ends[30];
          }
          if(biggest31642 == 1){
            active[25]=1;
            ends[25]=1;
            break RUN;
          }
        
        case 2 : 
          thread31643(tdone,ends);
          thread31650(tdone,ends);
          thread31651(tdone,ends);
          int biggest31662 = 0;
          if(ends[26]>=biggest31662){
            biggest31662=ends[26];
          }
          if(ends[29]>=biggest31662){
            biggest31662=ends[29];
          }
          if(ends[30]>=biggest31662){
            biggest31662=ends[30];
          }
          if(biggest31662 == 1){
            active[25]=1;
            ends[25]=1;
            break RUN;
          }
          //FINXME code
          if(biggest31662 == 0){
            S31568=0;
            active[25]=0;
            ends[25]=0;
            S31568=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[25] != 0){
      int index = 25;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[25]!=0 || suspended[25]!=0 || active[25]!=1);
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
      if(paused[25]!=0 || suspended[25]!=0 || active[25]!=1);
      else{
        cylPos5ZaxisExtend.gethook();
        gripperTurnRetract.gethook();
        gripperTurnExtend.gethook();
        capGripperPos5Extend.gethook();
        cylClampBottleExtend.gethook();
      }
      runFinisher();
      if(active[25] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
