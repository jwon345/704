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
  private int S211809 = 1;
  private int S211732 = 1;
  private int S211452 = 1;
  private int S211807 = 1;
  private int S211741 = 1;
  private int S211749 = 1;
  private int S211757 = 1;
  private int S211765 = 1;
  private int S211773 = 1;
  private int S211781 = 1;
  private int S211789 = 1;
  private int S211797 = 1;
  private int S211805 = 1;
  
  private int[] ends = new int[49];
  private int[] tdone = new int[49];
  
  public void thread212555(int [] tdone, int [] ends){
        switch(S211805){
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

  public void thread212554(int [] tdone, int [] ends){
        switch(S211797){
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

  public void thread212553(int [] tdone, int [] ends){
        switch(S211789){
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

  public void thread212552(int [] tdone, int [] ends){
        switch(S211781){
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

  public void thread212551(int [] tdone, int [] ends){
        switch(S211773){
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

  public void thread212550(int [] tdone, int [] ends){
        switch(S211765){
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

  public void thread212549(int [] tdone, int [] ends){
        switch(S211757){
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

  public void thread212548(int [] tdone, int [] ends){
        switch(S211749){
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

  public void thread212547(int [] tdone, int [] ends){
        switch(S211741){
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

  public void thread212546(int [] tdone, int [] ends){
        switch(S211807){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        thread212547(tdone,ends);
        thread212548(tdone,ends);
        thread212549(tdone,ends);
        thread212550(tdone,ends);
        thread212551(tdone,ends);
        thread212552(tdone,ends);
        thread212553(tdone,ends);
        thread212554(tdone,ends);
        thread212555(tdone,ends);
        int biggest212556 = 0;
        if(ends[27]>=biggest212556){
          biggest212556=ends[27];
        }
        if(ends[28]>=biggest212556){
          biggest212556=ends[28];
        }
        if(ends[29]>=biggest212556){
          biggest212556=ends[29];
        }
        if(ends[30]>=biggest212556){
          biggest212556=ends[30];
        }
        if(ends[31]>=biggest212556){
          biggest212556=ends[31];
        }
        if(ends[32]>=biggest212556){
          biggest212556=ends[32];
        }
        if(ends[33]>=biggest212556){
          biggest212556=ends[33];
        }
        if(ends[34]>=biggest212556){
          biggest212556=ends[34];
        }
        if(ends[35]>=biggest212556){
          biggest212556=ends[35];
        }
        if(biggest212556 == 1){
          active[26]=1;
          ends[26]=1;
          tdone[26]=1;
        }
        //FINXME code
        if(biggest212556 == 0){
          S211807=0;
          active[26]=0;
          ends[26]=0;
          tdone[26]=1;
        }
        break;
      
    }
  }

  public void thread212545(int [] tdone, int [] ends){
        active[25]=0;
    ends[25]=0;
    tdone[25]=1;
  }

  public void thread212544(int [] tdone, int [] ends){
        switch(S211732){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        switch(S211452){
          case 0 : 
            if(gripperTurnRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 142, column: 15
              S211452=1;
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
              S211452=2;
              __start_thread_24 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 139, column: 7
              if(com.systemj.Timer.getMs() - __start_thread_24 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 139, column: 7
                ends[24]=2;
                ;//sysj\conveyor_plant.sysj line: 139, column: 7
                gripperTurnHomePos.setPresent();//sysj\conveyor_plant.sysj line: 149, column: 9
                currsigs.addElement(gripperTurnHomePos);
                S211452=3;
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
              S211452=3;
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
            S211452=3;
            S211452=4;
            active[24]=1;
            ends[24]=1;
            tdone[24]=1;
            break;
          
          case 4 : 
            if(cylPos5ZaxisExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 152, column: 16
              S211452=5;
              __start_thread_24 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 139, column: 7
              if(com.systemj.Timer.getMs() - __start_thread_24 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 139, column: 7
                ends[24]=2;
                ;//sysj\conveyor_plant.sysj line: 139, column: 7
                gripperZAxisLowered.setPresent();//sysj\conveyor_plant.sysj line: 154, column: 9
                currsigs.addElement(gripperZAxisLowered);
                S211452=6;
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
              S211452=6;
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
            S211452=6;
            S211452=7;
            active[24]=1;
            ends[24]=1;
            tdone[24]=1;
            break;
          
          case 7 : 
            if(gripperTurnExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 157, column: 16
              S211452=8;
              __start_thread_24 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 139, column: 7
              if(com.systemj.Timer.getMs() - __start_thread_24 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 139, column: 7
                ends[24]=2;
                ;//sysj\conveyor_plant.sysj line: 139, column: 7
                gripperTurnFinalPos.setPresent();//sysj\conveyor_plant.sysj line: 159, column: 9
                currsigs.addElement(gripperTurnFinalPos);
                S211452=9;
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
              S211452=9;
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
            S211452=9;
            gripperZAxisLifted.setPresent();//sysj\conveyor_plant.sysj line: 163, column: 9
            currsigs.addElement(gripperZAxisLifted);
            S211452=0;
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

  public void thread212541(int [] tdone, int [] ends){
        S211805=1;
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

  public void thread212540(int [] tdone, int [] ends){
        S211797=1;
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

  public void thread212539(int [] tdone, int [] ends){
        S211789=1;
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

  public void thread212538(int [] tdone, int [] ends){
        S211781=1;
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

  public void thread212537(int [] tdone, int [] ends){
        S211773=1;
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

  public void thread212536(int [] tdone, int [] ends){
        S211765=1;
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

  public void thread212535(int [] tdone, int [] ends){
        S211757=1;
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

  public void thread212534(int [] tdone, int [] ends){
        S211749=1;
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

  public void thread212533(int [] tdone, int [] ends){
        S211741=1;
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

  public void thread212532(int [] tdone, int [] ends){
        S211807=1;
    thread212533(tdone,ends);
    thread212534(tdone,ends);
    thread212535(tdone,ends);
    thread212536(tdone,ends);
    thread212537(tdone,ends);
    thread212538(tdone,ends);
    thread212539(tdone,ends);
    thread212540(tdone,ends);
    thread212541(tdone,ends);
    int biggest212542 = 0;
    if(ends[27]>=biggest212542){
      biggest212542=ends[27];
    }
    if(ends[28]>=biggest212542){
      biggest212542=ends[28];
    }
    if(ends[29]>=biggest212542){
      biggest212542=ends[29];
    }
    if(ends[30]>=biggest212542){
      biggest212542=ends[30];
    }
    if(ends[31]>=biggest212542){
      biggest212542=ends[31];
    }
    if(ends[32]>=biggest212542){
      biggest212542=ends[32];
    }
    if(ends[33]>=biggest212542){
      biggest212542=ends[33];
    }
    if(ends[34]>=biggest212542){
      biggest212542=ends[34];
    }
    if(ends[35]>=biggest212542){
      biggest212542=ends[35];
    }
    if(biggest212542 == 1){
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread212531(int [] tdone, int [] ends){
        active[25]=0;
    ends[25]=0;
    tdone[25]=1;
  }

  public void thread212530(int [] tdone, int [] ends){
        S211732=1;
    S211452=0;
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
      switch(S211809){
        case 0 : 
          S211809=0;
          break RUN;
        
        case 1 : 
          S211809=2;
          S211809=2;
          thread212530(tdone,ends);
          thread212531(tdone,ends);
          thread212532(tdone,ends);
          int biggest212543 = 0;
          if(ends[24]>=biggest212543){
            biggest212543=ends[24];
          }
          if(ends[25]>=biggest212543){
            biggest212543=ends[25];
          }
          if(ends[26]>=biggest212543){
            biggest212543=ends[26];
          }
          if(biggest212543 == 1){
            active[23]=1;
            ends[23]=1;
            break RUN;
          }
        
        case 2 : 
          thread212544(tdone,ends);
          thread212545(tdone,ends);
          thread212546(tdone,ends);
          int biggest212557 = 0;
          if(ends[24]>=biggest212557){
            biggest212557=ends[24];
          }
          if(ends[25]>=biggest212557){
            biggest212557=ends[25];
          }
          if(ends[26]>=biggest212557){
            biggest212557=ends[26];
          }
          if(biggest212557 == 1){
            active[23]=1;
            ends[23]=1;
            break RUN;
          }
          //FINXME code
          if(biggest212557 == 0){
            S211809=0;
            active[23]=0;
            ends[23]=0;
            S211809=0;
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
