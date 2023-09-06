import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

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
  public Signal bottleAtPos4 = new Signal("bottleAtPos4", Signal.OUTPUT);
  public Signal gripperZAxisLowered = new Signal("gripperZAxisLowered", Signal.OUTPUT);
  public Signal gripperZAxisLifted = new Signal("gripperZAxisLifted", Signal.OUTPUT);
  public Signal gripperTurnHomePos = new Signal("gripperTurnHomePos", Signal.OUTPUT);
  public Signal gripperTurnFinalPos = new Signal("gripperTurnFinalPos", Signal.OUTPUT);
  public Signal cylPos5ZaxisExtendE = new Signal("cylPos5ZaxisExtendE", Signal.OUTPUT);
  public Signal gripperTurnRetractE = new Signal("gripperTurnRetractE", Signal.OUTPUT);
  public Signal gripperTurnExtendE = new Signal("gripperTurnExtendE", Signal.OUTPUT);
  public Signal capGripperPos5ExtendE = new Signal("capGripperPos5ExtendE", Signal.OUTPUT);
  public Signal cylClampBottleExtendE = new Signal("cylClampBottleExtendE", Signal.OUTPUT);
  public Signal bottleAtPos4E = new Signal("bottleAtPos4E", Signal.OUTPUT);
  public Signal gripperZAxisLoweredE = new Signal("gripperZAxisLoweredE", Signal.OUTPUT);
  public Signal gripperZAxisLiftedE = new Signal("gripperZAxisLiftedE", Signal.OUTPUT);
  public Signal gripperTurnHomePosE = new Signal("gripperTurnHomePosE", Signal.OUTPUT);
  public Signal gripperTurnFinalPosE = new Signal("gripperTurnFinalPosE", Signal.OUTPUT);
  private int S379 = 1;
  private int S294 = 1;
  private int S282 = 1;
  private int S377 = 1;
  private int S303 = 1;
  private int S297 = 1;
  private int S311 = 1;
  private int S319 = 1;
  private int S327 = 1;
  private int S335 = 1;
  private int S343 = 1;
  private int S351 = 1;
  private int S359 = 1;
  private int S367 = 1;
  private int S375 = 1;
  
  private int[] ends = new int[15];
  private int[] tdone = new int[15];
  
  public void thread408(int [] tdone, int [] ends){
        switch(S375){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\capper_plant.sysj line: 51, column: 32
          gripperTurnFinalPosE.setPresent();//sysj\capper_plant.sysj line: 51, column: 53
          currsigs.addElement(gripperTurnFinalPosE);
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        else {
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        break;
      
    }
  }

  public void thread407(int [] tdone, int [] ends){
        switch(S367){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(gripperTurnHomePos.getprestatus()){//sysj\capper_plant.sysj line: 49, column: 32
          gripperTurnHomePosE.setPresent();//sysj\capper_plant.sysj line: 49, column: 52
          currsigs.addElement(gripperTurnHomePosE);
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

  public void thread406(int [] tdone, int [] ends){
        switch(S359){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLifted.getprestatus()){//sysj\capper_plant.sysj line: 47, column: 32
          gripperZAxisLiftedE.setPresent();//sysj\capper_plant.sysj line: 47, column: 52
          currsigs.addElement(gripperZAxisLiftedE);
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

  public void thread405(int [] tdone, int [] ends){
        switch(S351){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLowered.getprestatus()){//sysj\capper_plant.sysj line: 45, column: 32
          gripperZAxisLoweredE.setPresent();//sysj\capper_plant.sysj line: 45, column: 53
          currsigs.addElement(gripperZAxisLoweredE);
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

  public void thread404(int [] tdone, int [] ends){
        switch(S343){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(bottleAtPos4.getprestatus()){//sysj\capper_plant.sysj line: 43, column: 32
          bottleAtPos4E.setPresent();//sysj\capper_plant.sysj line: 43, column: 46
          currsigs.addElement(bottleAtPos4E);
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

  public void thread403(int [] tdone, int [] ends){
        switch(S335){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(cylClampBottleExtend.getprestatus()){//sysj\capper_plant.sysj line: 41, column: 32
          cylClampBottleExtendE.setPresent();//sysj\capper_plant.sysj line: 41, column: 54
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

  public void thread402(int [] tdone, int [] ends){
        switch(S327){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(capGripperPos5Extend.getprestatus()){//sysj\capper_plant.sysj line: 39, column: 32
          capGripperPos5ExtendE.setPresent();//sysj\capper_plant.sysj line: 39, column: 54
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

  public void thread401(int [] tdone, int [] ends){
        switch(S319){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(gripperTurnExtend.getprestatus()){//sysj\capper_plant.sysj line: 37, column: 32
          gripperTurnExtendE.setPresent();//sysj\capper_plant.sysj line: 37, column: 51
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

  public void thread400(int [] tdone, int [] ends){
        switch(S311){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(gripperTurnRetract.getprestatus()){//sysj\capper_plant.sysj line: 35, column: 32
          gripperTurnRetractE.setPresent();//sysj\capper_plant.sysj line: 35, column: 52
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

  public void thread399(int [] tdone, int [] ends){
        switch(S303){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S297){
          case 0 : 
            S297=0;
            if(cylPos5ZaxisExtend.getprestatus()){//sysj\capper_plant.sysj line: 33, column: 32
              cylPos5ZaxisExtendE.setPresent();//sysj\capper_plant.sysj line: 33, column: 52
              currsigs.addElement(cylPos5ZaxisExtendE);
              S297=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S297=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            S297=1;
            S297=0;
            if(cylPos5ZaxisExtend.getprestatus()){//sysj\capper_plant.sysj line: 33, column: 32
              cylPos5ZaxisExtendE.setPresent();//sysj\capper_plant.sysj line: 33, column: 52
              currsigs.addElement(cylPos5ZaxisExtendE);
              S297=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S297=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread398(int [] tdone, int [] ends){
        switch(S377){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        thread399(tdone,ends);
        thread400(tdone,ends);
        thread401(tdone,ends);
        thread402(tdone,ends);
        thread403(tdone,ends);
        thread404(tdone,ends);
        thread405(tdone,ends);
        thread406(tdone,ends);
        thread407(tdone,ends);
        thread408(tdone,ends);
        int biggest409 = 0;
        if(ends[5]>=biggest409){
          biggest409=ends[5];
        }
        if(ends[6]>=biggest409){
          biggest409=ends[6];
        }
        if(ends[7]>=biggest409){
          biggest409=ends[7];
        }
        if(ends[8]>=biggest409){
          biggest409=ends[8];
        }
        if(ends[9]>=biggest409){
          biggest409=ends[9];
        }
        if(ends[10]>=biggest409){
          biggest409=ends[10];
        }
        if(ends[11]>=biggest409){
          biggest409=ends[11];
        }
        if(ends[12]>=biggest409){
          biggest409=ends[12];
        }
        if(ends[13]>=biggest409){
          biggest409=ends[13];
        }
        if(ends[14]>=biggest409){
          biggest409=ends[14];
        }
        if(biggest409 == 1){
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        //FINXME code
        if(biggest409 == 0){
          S377=0;
          active[4]=0;
          ends[4]=0;
          tdone[4]=1;
        }
        break;
      
    }
  }

  public void thread397(int [] tdone, int [] ends){
        active[3]=0;
    ends[3]=0;
    tdone[3]=1;
  }

  public void thread396(int [] tdone, int [] ends){
        switch(S294){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S282){
          case 0 : 
            if(gripperTurnRetract.getprestatus()){//sysj\capper_plant.sysj line: 16, column: 12
              gripperTurnHomePos.setPresent();//sysj\capper_plant.sysj line: 17, column: 6
              currsigs.addElement(gripperTurnHomePos);
              S282=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              gripperZAxisLifted.setPresent();//sysj\capper_plant.sysj line: 16, column: 32
              currsigs.addElement(gripperZAxisLifted);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            S282=1;
            gripperZAxisLowered.setPresent();//sysj\capper_plant.sysj line: 19, column: 6
            currsigs.addElement(gripperZAxisLowered);
            S282=2;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
          case 2 : 
            S282=2;
            gripperTurnFinalPos.setPresent();//sysj\capper_plant.sysj line: 21, column: 6
            currsigs.addElement(gripperTurnFinalPos);
            S282=3;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
          case 3 : 
            S282=3;
            gripperZAxisLifted.setPresent();//sysj\capper_plant.sysj line: 23, column: 6
            currsigs.addElement(gripperZAxisLifted);
            S282=0;
            gripperZAxisLifted.setPresent();//sysj\capper_plant.sysj line: 16, column: 32
            currsigs.addElement(gripperZAxisLifted);
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread393(int [] tdone, int [] ends){
        S375=1;
    if(gripperTurnFinalPos.getprestatus()){//sysj\capper_plant.sysj line: 51, column: 32
      gripperTurnFinalPosE.setPresent();//sysj\capper_plant.sysj line: 51, column: 53
      currsigs.addElement(gripperTurnFinalPosE);
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread392(int [] tdone, int [] ends){
        S367=1;
    if(gripperTurnHomePos.getprestatus()){//sysj\capper_plant.sysj line: 49, column: 32
      gripperTurnHomePosE.setPresent();//sysj\capper_plant.sysj line: 49, column: 52
      currsigs.addElement(gripperTurnHomePosE);
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

  public void thread391(int [] tdone, int [] ends){
        S359=1;
    if(gripperZAxisLifted.getprestatus()){//sysj\capper_plant.sysj line: 47, column: 32
      gripperZAxisLiftedE.setPresent();//sysj\capper_plant.sysj line: 47, column: 52
      currsigs.addElement(gripperZAxisLiftedE);
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

  public void thread390(int [] tdone, int [] ends){
        S351=1;
    if(gripperZAxisLowered.getprestatus()){//sysj\capper_plant.sysj line: 45, column: 32
      gripperZAxisLoweredE.setPresent();//sysj\capper_plant.sysj line: 45, column: 53
      currsigs.addElement(gripperZAxisLoweredE);
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

  public void thread389(int [] tdone, int [] ends){
        S343=1;
    if(bottleAtPos4.getprestatus()){//sysj\capper_plant.sysj line: 43, column: 32
      bottleAtPos4E.setPresent();//sysj\capper_plant.sysj line: 43, column: 46
      currsigs.addElement(bottleAtPos4E);
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

  public void thread388(int [] tdone, int [] ends){
        S335=1;
    if(cylClampBottleExtend.getprestatus()){//sysj\capper_plant.sysj line: 41, column: 32
      cylClampBottleExtendE.setPresent();//sysj\capper_plant.sysj line: 41, column: 54
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

  public void thread387(int [] tdone, int [] ends){
        S327=1;
    if(capGripperPos5Extend.getprestatus()){//sysj\capper_plant.sysj line: 39, column: 32
      capGripperPos5ExtendE.setPresent();//sysj\capper_plant.sysj line: 39, column: 54
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

  public void thread386(int [] tdone, int [] ends){
        S319=1;
    if(gripperTurnExtend.getprestatus()){//sysj\capper_plant.sysj line: 37, column: 32
      gripperTurnExtendE.setPresent();//sysj\capper_plant.sysj line: 37, column: 51
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

  public void thread385(int [] tdone, int [] ends){
        S311=1;
    if(gripperTurnRetract.getprestatus()){//sysj\capper_plant.sysj line: 35, column: 32
      gripperTurnRetractE.setPresent();//sysj\capper_plant.sysj line: 35, column: 52
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

  public void thread384(int [] tdone, int [] ends){
        S303=1;
    S297=0;
    if(cylPos5ZaxisExtend.getprestatus()){//sysj\capper_plant.sysj line: 33, column: 32
      cylPos5ZaxisExtendE.setPresent();//sysj\capper_plant.sysj line: 33, column: 52
      currsigs.addElement(cylPos5ZaxisExtendE);
      S297=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S297=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread383(int [] tdone, int [] ends){
        S377=1;
    thread384(tdone,ends);
    thread385(tdone,ends);
    thread386(tdone,ends);
    thread387(tdone,ends);
    thread388(tdone,ends);
    thread389(tdone,ends);
    thread390(tdone,ends);
    thread391(tdone,ends);
    thread392(tdone,ends);
    thread393(tdone,ends);
    int biggest394 = 0;
    if(ends[5]>=biggest394){
      biggest394=ends[5];
    }
    if(ends[6]>=biggest394){
      biggest394=ends[6];
    }
    if(ends[7]>=biggest394){
      biggest394=ends[7];
    }
    if(ends[8]>=biggest394){
      biggest394=ends[8];
    }
    if(ends[9]>=biggest394){
      biggest394=ends[9];
    }
    if(ends[10]>=biggest394){
      biggest394=ends[10];
    }
    if(ends[11]>=biggest394){
      biggest394=ends[11];
    }
    if(ends[12]>=biggest394){
      biggest394=ends[12];
    }
    if(ends[13]>=biggest394){
      biggest394=ends[13];
    }
    if(ends[14]>=biggest394){
      biggest394=ends[14];
    }
    if(biggest394 == 1){
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread382(int [] tdone, int [] ends){
        active[3]=0;
    ends[3]=0;
    tdone[3]=1;
  }

  public void thread381(int [] tdone, int [] ends){
        S294=1;
    S282=0;
    gripperZAxisLifted.setPresent();//sysj\capper_plant.sysj line: 16, column: 32
    currsigs.addElement(gripperZAxisLifted);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S379){
        case 0 : 
          S379=0;
          break RUN;
        
        case 1 : 
          S379=2;
          S379=2;
          thread381(tdone,ends);
          thread382(tdone,ends);
          thread383(tdone,ends);
          int biggest395 = 0;
          if(ends[2]>=biggest395){
            biggest395=ends[2];
          }
          if(ends[3]>=biggest395){
            biggest395=ends[3];
          }
          if(ends[4]>=biggest395){
            biggest395=ends[4];
          }
          if(biggest395 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread396(tdone,ends);
          thread397(tdone,ends);
          thread398(tdone,ends);
          int biggest410 = 0;
          if(ends[2]>=biggest410){
            biggest410=ends[2];
          }
          if(ends[3]>=biggest410){
            biggest410=ends[3];
          }
          if(ends[4]>=biggest410){
            biggest410=ends[4];
          }
          if(biggest410 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest410 == 0){
            S379=0;
            active[1]=0;
            ends[1]=0;
            S379=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
      bottleAtPos4.setpreclear();
      gripperZAxisLowered.setpreclear();
      gripperZAxisLifted.setpreclear();
      gripperTurnHomePos.setpreclear();
      gripperTurnFinalPos.setpreclear();
      cylPos5ZaxisExtendE.setpreclear();
      gripperTurnRetractE.setpreclear();
      gripperTurnExtendE.setpreclear();
      capGripperPos5ExtendE.setpreclear();
      cylClampBottleExtendE.setpreclear();
      bottleAtPos4E.setpreclear();
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
      bottleAtPos4.sethook();
      bottleAtPos4.setClear();
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
      bottleAtPos4E.sethook();
      bottleAtPos4E.setClear();
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
