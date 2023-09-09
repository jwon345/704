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
  private int S32856 = 1;
  private int S32779 = 1;
  private int S32119 = 1;
  private int S32180 = 1;
  private int S32183 = 1;
  private int S32854 = 1;
  private int S32788 = 1;
  private int S32796 = 1;
  private int S32804 = 1;
  private int S32812 = 1;
  private int S32820 = 1;
  private int S32828 = 1;
  private int S32836 = 1;
  private int S32844 = 1;
  private int S32852 = 1;
  
  private int[] ends = new int[40];
  private int[] tdone = new int[40];
  
  public void thread32948(int [] tdone, int [] ends){
        switch(S32852){
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

  public void thread32947(int [] tdone, int [] ends){
        switch(S32844){
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

  public void thread32946(int [] tdone, int [] ends){
        switch(S32836){
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

  public void thread32945(int [] tdone, int [] ends){
        switch(S32828){
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

  public void thread32944(int [] tdone, int [] ends){
        switch(S32820){
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

  public void thread32943(int [] tdone, int [] ends){
        switch(S32812){
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

  public void thread32942(int [] tdone, int [] ends){
        switch(S32804){
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

  public void thread32941(int [] tdone, int [] ends){
        switch(S32796){
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

  public void thread32940(int [] tdone, int [] ends){
        switch(S32788){
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

  public void thread32939(int [] tdone, int [] ends){
        switch(S32854){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        thread32940(tdone,ends);
        thread32941(tdone,ends);
        thread32942(tdone,ends);
        thread32943(tdone,ends);
        thread32944(tdone,ends);
        thread32945(tdone,ends);
        thread32946(tdone,ends);
        thread32947(tdone,ends);
        thread32948(tdone,ends);
        int biggest32949 = 0;
        if(ends[31]>=biggest32949){
          biggest32949=ends[31];
        }
        if(ends[32]>=biggest32949){
          biggest32949=ends[32];
        }
        if(ends[33]>=biggest32949){
          biggest32949=ends[33];
        }
        if(ends[34]>=biggest32949){
          biggest32949=ends[34];
        }
        if(ends[35]>=biggest32949){
          biggest32949=ends[35];
        }
        if(ends[36]>=biggest32949){
          biggest32949=ends[36];
        }
        if(ends[37]>=biggest32949){
          biggest32949=ends[37];
        }
        if(ends[38]>=biggest32949){
          biggest32949=ends[38];
        }
        if(ends[39]>=biggest32949){
          biggest32949=ends[39];
        }
        if(biggest32949 == 1){
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
        //FINXME code
        if(biggest32949 == 0){
          S32854=0;
          active[30]=0;
          ends[30]=0;
          tdone[30]=1;
        }
        break;
      
    }
  }

  public void thread32938(int [] tdone, int [] ends){
        active[29]=0;
    ends[29]=0;
    tdone[29]=1;
  }

  public void thread32936(int [] tdone, int [] ends){
        switch(S32183){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        if(gripperTurnExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 165, column: 17
          S32183=0;
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

  public void thread32935(int [] tdone, int [] ends){
        switch(S32180){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        if(capGripperPos5Extend.getprestatus()){//sysj\conveyor_plant.sysj line: 163, column: 17
          S32180=0;
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

  public void thread32933(int [] tdone, int [] ends){
        S32183=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread32932(int [] tdone, int [] ends){
        S32180=1;
    active[27]=1;
    ends[27]=1;
    tdone[27]=1;
  }

  public void thread32931(int [] tdone, int [] ends){
        switch(S32779){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        switch(S32119){
          case 0 : 
            if(gripperTurnRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 148, column: 15
              S32119=1;
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
              S32119=2;
              __start_thread_26 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 145, column: 7
              if(com.systemj.Timer.getMs() - __start_thread_26 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 145, column: 7
                ends[26]=2;
                ;//sysj\conveyor_plant.sysj line: 145, column: 7
                gripperTurnHomePos.setPresent();//sysj\conveyor_plant.sysj line: 155, column: 9
                currsigs.addElement(gripperTurnHomePos);
                S32119=3;
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
              S32119=3;
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
            S32119=3;
            S32119=4;
            active[26]=1;
            ends[26]=1;
            tdone[26]=1;
            break;
          
          case 4 : 
            if(cylPos5ZaxisExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 158, column: 16
              S32119=5;
              __start_thread_26 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 145, column: 7
              if(com.systemj.Timer.getMs() - __start_thread_26 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 145, column: 7
                ends[26]=2;
                ;//sysj\conveyor_plant.sysj line: 145, column: 7
                gripperZAxisLowered.setPresent();//sysj\conveyor_plant.sysj line: 160, column: 9
                currsigs.addElement(gripperZAxisLowered);
                S32119=6;
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
              S32119=6;
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
            S32119=6;
            S32119=7;
            thread32932(tdone,ends);
            thread32933(tdone,ends);
            int biggest32934 = 0;
            if(ends[27]>=biggest32934){
              biggest32934=ends[27];
            }
            if(ends[28]>=biggest32934){
              biggest32934=ends[28];
            }
            if(biggest32934 == 1){
              active[26]=1;
              ends[26]=1;
              tdone[26]=1;
            }
            break;
          
          case 7 : 
            thread32935(tdone,ends);
            thread32936(tdone,ends);
            int biggest32937 = 0;
            if(ends[27]>=biggest32937){
              biggest32937=ends[27];
            }
            if(ends[28]>=biggest32937){
              biggest32937=ends[28];
            }
            if(biggest32937 == 1){
              active[26]=1;
              ends[26]=1;
              tdone[26]=1;
            }
            //FINXME code
            if(biggest32937 == 0){
              S32119=8;
              __start_thread_26 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 145, column: 7
              if(com.systemj.Timer.getMs() - __start_thread_26 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 145, column: 7
                ends[26]=2;
                ;//sysj\conveyor_plant.sysj line: 145, column: 7
                gripperTurnFinalPos.setPresent();//sysj\conveyor_plant.sysj line: 169, column: 9
                currsigs.addElement(gripperTurnFinalPos);
                S32119=9;
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
              S32119=9;
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
            S32119=9;
            S32119=10;
            __start_thread_26 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 145, column: 7
            if(com.systemj.Timer.getMs() - __start_thread_26 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 145, column: 7
              ends[26]=2;
              ;//sysj\conveyor_plant.sysj line: 145, column: 7
              gripperZAxisLifted.setPresent();//sysj\conveyor_plant.sysj line: 173, column: 9
              currsigs.addElement(gripperZAxisLifted);
              S32119=0;
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
              S32119=0;
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

  public void thread32928(int [] tdone, int [] ends){
        S32852=1;
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

  public void thread32927(int [] tdone, int [] ends){
        S32844=1;
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

  public void thread32926(int [] tdone, int [] ends){
        S32836=1;
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

  public void thread32925(int [] tdone, int [] ends){
        S32828=1;
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

  public void thread32924(int [] tdone, int [] ends){
        S32820=1;
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

  public void thread32923(int [] tdone, int [] ends){
        S32812=1;
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

  public void thread32922(int [] tdone, int [] ends){
        S32804=1;
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

  public void thread32921(int [] tdone, int [] ends){
        S32796=1;
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

  public void thread32920(int [] tdone, int [] ends){
        S32788=1;
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

  public void thread32919(int [] tdone, int [] ends){
        S32854=1;
    thread32920(tdone,ends);
    thread32921(tdone,ends);
    thread32922(tdone,ends);
    thread32923(tdone,ends);
    thread32924(tdone,ends);
    thread32925(tdone,ends);
    thread32926(tdone,ends);
    thread32927(tdone,ends);
    thread32928(tdone,ends);
    int biggest32929 = 0;
    if(ends[31]>=biggest32929){
      biggest32929=ends[31];
    }
    if(ends[32]>=biggest32929){
      biggest32929=ends[32];
    }
    if(ends[33]>=biggest32929){
      biggest32929=ends[33];
    }
    if(ends[34]>=biggest32929){
      biggest32929=ends[34];
    }
    if(ends[35]>=biggest32929){
      biggest32929=ends[35];
    }
    if(ends[36]>=biggest32929){
      biggest32929=ends[36];
    }
    if(ends[37]>=biggest32929){
      biggest32929=ends[37];
    }
    if(ends[38]>=biggest32929){
      biggest32929=ends[38];
    }
    if(ends[39]>=biggest32929){
      biggest32929=ends[39];
    }
    if(biggest32929 == 1){
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
  }

  public void thread32918(int [] tdone, int [] ends){
        active[29]=0;
    ends[29]=0;
    tdone[29]=1;
  }

  public void thread32917(int [] tdone, int [] ends){
        S32779=1;
    S32119=0;
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
      switch(S32856){
        case 0 : 
          S32856=0;
          break RUN;
        
        case 1 : 
          S32856=2;
          S32856=2;
          thread32917(tdone,ends);
          thread32918(tdone,ends);
          thread32919(tdone,ends);
          int biggest32930 = 0;
          if(ends[26]>=biggest32930){
            biggest32930=ends[26];
          }
          if(ends[29]>=biggest32930){
            biggest32930=ends[29];
          }
          if(ends[30]>=biggest32930){
            biggest32930=ends[30];
          }
          if(biggest32930 == 1){
            active[25]=1;
            ends[25]=1;
            break RUN;
          }
        
        case 2 : 
          thread32931(tdone,ends);
          thread32938(tdone,ends);
          thread32939(tdone,ends);
          int biggest32950 = 0;
          if(ends[26]>=biggest32950){
            biggest32950=ends[26];
          }
          if(ends[29]>=biggest32950){
            biggest32950=ends[29];
          }
          if(ends[30]>=biggest32950){
            biggest32950=ends[30];
          }
          if(biggest32950 == 1){
            active[25]=1;
            ends[25]=1;
            break RUN;
          }
          //FINXME code
          if(biggest32950 == 0){
            S32856=0;
            active[25]=0;
            ends[25]=0;
            S32856=0;
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
