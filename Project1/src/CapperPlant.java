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
  private int S32574 = 1;
  private int S32497 = 1;
  private int S32439 = 1;
  private int S32444 = 1;
  private int S32447 = 1;
  private int S32572 = 1;
  private int S32506 = 1;
  private int S32514 = 1;
  private int S32522 = 1;
  private int S32530 = 1;
  private int S32538 = 1;
  private int S32546 = 1;
  private int S32554 = 1;
  private int S32562 = 1;
  private int S32570 = 1;
  
  private int[] ends = new int[40];
  private int[] tdone = new int[40];
  
  public void thread32666(int [] tdone, int [] ends){
        switch(S32570){
      case 0 : 
        active[39]=0;
        ends[39]=0;
        tdone[39]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_plant.sysj line: 195, column: 35
          gripperTurnFinalPosE.setPresent();//sysj\conveyor_plant.sysj line: 195, column: 56
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

  public void thread32665(int [] tdone, int [] ends){
        switch(S32562){
      case 0 : 
        active[38]=0;
        ends[38]=0;
        tdone[38]=1;
        break;
      
      case 1 : 
        if(gripperTurnHomePos.getprestatus()){//sysj\conveyor_plant.sysj line: 193, column: 35
          gripperTurnHomePosE.setPresent();//sysj\conveyor_plant.sysj line: 193, column: 55
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

  public void thread32664(int [] tdone, int [] ends){
        switch(S32554){
      case 0 : 
        active[37]=0;
        ends[37]=0;
        tdone[37]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_plant.sysj line: 191, column: 35
          gripperZAxisLiftedE.setPresent();//sysj\conveyor_plant.sysj line: 191, column: 55
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

  public void thread32663(int [] tdone, int [] ends){
        switch(S32546){
      case 0 : 
        active[36]=0;
        ends[36]=0;
        tdone[36]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLowered.getprestatus()){//sysj\conveyor_plant.sysj line: 189, column: 35
          gripperZAxisLoweredE.setPresent();//sysj\conveyor_plant.sysj line: 189, column: 56
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

  public void thread32662(int [] tdone, int [] ends){
        switch(S32538){
      case 0 : 
        active[35]=0;
        ends[35]=0;
        tdone[35]=1;
        break;
      
      case 1 : 
        if(cylClampBottleExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 187, column: 35
          cylClampBottleExtendE.setPresent();//sysj\conveyor_plant.sysj line: 187, column: 57
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

  public void thread32661(int [] tdone, int [] ends){
        switch(S32530){
      case 0 : 
        active[34]=0;
        ends[34]=0;
        tdone[34]=1;
        break;
      
      case 1 : 
        if(capGripperPos5Extend.getprestatus()){//sysj\conveyor_plant.sysj line: 185, column: 35
          capGripperPos5ExtendE.setPresent();//sysj\conveyor_plant.sysj line: 185, column: 57
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

  public void thread32660(int [] tdone, int [] ends){
        switch(S32522){
      case 0 : 
        active[33]=0;
        ends[33]=0;
        tdone[33]=1;
        break;
      
      case 1 : 
        if(gripperTurnExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 183, column: 35
          gripperTurnExtendE.setPresent();//sysj\conveyor_plant.sysj line: 183, column: 54
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

  public void thread32659(int [] tdone, int [] ends){
        switch(S32514){
      case 0 : 
        active[32]=0;
        ends[32]=0;
        tdone[32]=1;
        break;
      
      case 1 : 
        if(gripperTurnRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 181, column: 35
          gripperTurnRetractE.setPresent();//sysj\conveyor_plant.sysj line: 181, column: 55
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

  public void thread32658(int [] tdone, int [] ends){
        switch(S32506){
      case 0 : 
        active[31]=0;
        ends[31]=0;
        tdone[31]=1;
        break;
      
      case 1 : 
        if(cylPos5ZaxisExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 179, column: 35
          cylPos5ZaxisExtendE.setPresent();//sysj\conveyor_plant.sysj line: 179, column: 55
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

  public void thread32657(int [] tdone, int [] ends){
        switch(S32572){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        thread32658(tdone,ends);
        thread32659(tdone,ends);
        thread32660(tdone,ends);
        thread32661(tdone,ends);
        thread32662(tdone,ends);
        thread32663(tdone,ends);
        thread32664(tdone,ends);
        thread32665(tdone,ends);
        thread32666(tdone,ends);
        int biggest32667 = 0;
        if(ends[31]>=biggest32667){
          biggest32667=ends[31];
        }
        if(ends[32]>=biggest32667){
          biggest32667=ends[32];
        }
        if(ends[33]>=biggest32667){
          biggest32667=ends[33];
        }
        if(ends[34]>=biggest32667){
          biggest32667=ends[34];
        }
        if(ends[35]>=biggest32667){
          biggest32667=ends[35];
        }
        if(ends[36]>=biggest32667){
          biggest32667=ends[36];
        }
        if(ends[37]>=biggest32667){
          biggest32667=ends[37];
        }
        if(ends[38]>=biggest32667){
          biggest32667=ends[38];
        }
        if(ends[39]>=biggest32667){
          biggest32667=ends[39];
        }
        if(biggest32667 == 1){
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
        //FINXME code
        if(biggest32667 == 0){
          S32572=0;
          active[30]=0;
          ends[30]=0;
          tdone[30]=1;
        }
        break;
      
    }
  }

  public void thread32656(int [] tdone, int [] ends){
        active[29]=0;
    ends[29]=0;
    tdone[29]=1;
  }

  public void thread32654(int [] tdone, int [] ends){
        switch(S32447){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        if(gripperTurnExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 163, column: 17
          S32447=0;
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

  public void thread32653(int [] tdone, int [] ends){
        switch(S32444){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        if(capGripperPos5Extend.getprestatus()){//sysj\conveyor_plant.sysj line: 161, column: 17
          S32444=0;
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

  public void thread32651(int [] tdone, int [] ends){
        S32447=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread32650(int [] tdone, int [] ends){
        S32444=1;
    active[27]=1;
    ends[27]=1;
    tdone[27]=1;
  }

  public void thread32649(int [] tdone, int [] ends){
        switch(S32497){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        switch(S32439){
          case 0 : 
            if(gripperTurnRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 148, column: 15
              S32439=1;
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
              gripperTurnHomePos.setPresent();//sysj\conveyor_plant.sysj line: 154, column: 9
              currsigs.addElement(gripperTurnHomePos);
              S32439=2;
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
            S32439=2;
            S32439=3;
            active[26]=1;
            ends[26]=1;
            tdone[26]=1;
            break;
          
          case 3 : 
            if(cylPos5ZaxisExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 157, column: 16
              gripperZAxisLowered.setPresent();//sysj\conveyor_plant.sysj line: 158, column: 9
              currsigs.addElement(gripperZAxisLowered);
              S32439=4;
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
          
          case 4 : 
            S32439=4;
            S32439=5;
            thread32650(tdone,ends);
            thread32651(tdone,ends);
            int biggest32652 = 0;
            if(ends[27]>=biggest32652){
              biggest32652=ends[27];
            }
            if(ends[28]>=biggest32652){
              biggest32652=ends[28];
            }
            if(biggest32652 == 1){
              active[26]=1;
              ends[26]=1;
              tdone[26]=1;
            }
            break;
          
          case 5 : 
            thread32653(tdone,ends);
            thread32654(tdone,ends);
            int biggest32655 = 0;
            if(ends[27]>=biggest32655){
              biggest32655=ends[27];
            }
            if(ends[28]>=biggest32655){
              biggest32655=ends[28];
            }
            if(biggest32655 == 1){
              active[26]=1;
              ends[26]=1;
              tdone[26]=1;
            }
            //FINXME code
            if(biggest32655 == 0){
              gripperTurnFinalPos.setPresent();//sysj\conveyor_plant.sysj line: 166, column: 9
              currsigs.addElement(gripperTurnFinalPos);
              S32439=6;
              active[26]=1;
              ends[26]=1;
              tdone[26]=1;
            }
            break;
          
          case 6 : 
            S32439=6;
            gripperZAxisLifted.setPresent();//sysj\conveyor_plant.sysj line: 169, column: 9
            currsigs.addElement(gripperZAxisLifted);
            S32439=0;
            gripperZAxisLifted.setPresent();//sysj\conveyor_plant.sysj line: 150, column: 10
            currsigs.addElement(gripperZAxisLifted);
            active[26]=1;
            ends[26]=1;
            tdone[26]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread32646(int [] tdone, int [] ends){
        S32570=1;
    if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_plant.sysj line: 195, column: 35
      gripperTurnFinalPosE.setPresent();//sysj\conveyor_plant.sysj line: 195, column: 56
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

  public void thread32645(int [] tdone, int [] ends){
        S32562=1;
    if(gripperTurnHomePos.getprestatus()){//sysj\conveyor_plant.sysj line: 193, column: 35
      gripperTurnHomePosE.setPresent();//sysj\conveyor_plant.sysj line: 193, column: 55
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

  public void thread32644(int [] tdone, int [] ends){
        S32554=1;
    if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_plant.sysj line: 191, column: 35
      gripperZAxisLiftedE.setPresent();//sysj\conveyor_plant.sysj line: 191, column: 55
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

  public void thread32643(int [] tdone, int [] ends){
        S32546=1;
    if(gripperZAxisLowered.getprestatus()){//sysj\conveyor_plant.sysj line: 189, column: 35
      gripperZAxisLoweredE.setPresent();//sysj\conveyor_plant.sysj line: 189, column: 56
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

  public void thread32642(int [] tdone, int [] ends){
        S32538=1;
    if(cylClampBottleExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 187, column: 35
      cylClampBottleExtendE.setPresent();//sysj\conveyor_plant.sysj line: 187, column: 57
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

  public void thread32641(int [] tdone, int [] ends){
        S32530=1;
    if(capGripperPos5Extend.getprestatus()){//sysj\conveyor_plant.sysj line: 185, column: 35
      capGripperPos5ExtendE.setPresent();//sysj\conveyor_plant.sysj line: 185, column: 57
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

  public void thread32640(int [] tdone, int [] ends){
        S32522=1;
    if(gripperTurnExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 183, column: 35
      gripperTurnExtendE.setPresent();//sysj\conveyor_plant.sysj line: 183, column: 54
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

  public void thread32639(int [] tdone, int [] ends){
        S32514=1;
    if(gripperTurnRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 181, column: 35
      gripperTurnRetractE.setPresent();//sysj\conveyor_plant.sysj line: 181, column: 55
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

  public void thread32638(int [] tdone, int [] ends){
        S32506=1;
    if(cylPos5ZaxisExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 179, column: 35
      cylPos5ZaxisExtendE.setPresent();//sysj\conveyor_plant.sysj line: 179, column: 55
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

  public void thread32637(int [] tdone, int [] ends){
        S32572=1;
    thread32638(tdone,ends);
    thread32639(tdone,ends);
    thread32640(tdone,ends);
    thread32641(tdone,ends);
    thread32642(tdone,ends);
    thread32643(tdone,ends);
    thread32644(tdone,ends);
    thread32645(tdone,ends);
    thread32646(tdone,ends);
    int biggest32647 = 0;
    if(ends[31]>=biggest32647){
      biggest32647=ends[31];
    }
    if(ends[32]>=biggest32647){
      biggest32647=ends[32];
    }
    if(ends[33]>=biggest32647){
      biggest32647=ends[33];
    }
    if(ends[34]>=biggest32647){
      biggest32647=ends[34];
    }
    if(ends[35]>=biggest32647){
      biggest32647=ends[35];
    }
    if(ends[36]>=biggest32647){
      biggest32647=ends[36];
    }
    if(ends[37]>=biggest32647){
      biggest32647=ends[37];
    }
    if(ends[38]>=biggest32647){
      biggest32647=ends[38];
    }
    if(ends[39]>=biggest32647){
      biggest32647=ends[39];
    }
    if(biggest32647 == 1){
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
  }

  public void thread32636(int [] tdone, int [] ends){
        active[29]=0;
    ends[29]=0;
    tdone[29]=1;
  }

  public void thread32635(int [] tdone, int [] ends){
        S32497=1;
    S32439=0;
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
      switch(S32574){
        case 0 : 
          S32574=0;
          break RUN;
        
        case 1 : 
          S32574=2;
          S32574=2;
          thread32635(tdone,ends);
          thread32636(tdone,ends);
          thread32637(tdone,ends);
          int biggest32648 = 0;
          if(ends[26]>=biggest32648){
            biggest32648=ends[26];
          }
          if(ends[29]>=biggest32648){
            biggest32648=ends[29];
          }
          if(ends[30]>=biggest32648){
            biggest32648=ends[30];
          }
          if(biggest32648 == 1){
            active[25]=1;
            ends[25]=1;
            break RUN;
          }
        
        case 2 : 
          thread32649(tdone,ends);
          thread32656(tdone,ends);
          thread32657(tdone,ends);
          int biggest32668 = 0;
          if(ends[26]>=biggest32668){
            biggest32668=ends[26];
          }
          if(ends[29]>=biggest32668){
            biggest32668=ends[29];
          }
          if(ends[30]>=biggest32668){
            biggest32668=ends[30];
          }
          if(biggest32668 == 1){
            active[25]=1;
            ends[25]=1;
            break RUN;
          }
          //FINXME code
          if(biggest32668 == 0){
            S32574=0;
            active[25]=0;
            ends[25]=0;
            S32574=0;
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
