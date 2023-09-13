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
  private long __start_thread_28;//sysj\conveyor_plant.sysj line: 158, column: 11
  private long __start_thread_29;//sysj\conveyor_plant.sysj line: 165, column: 13
  private long __start_thread_30;//sysj\conveyor_plant.sysj line: 172, column: 13
  private int S184323 = 1;
  private int S184246 = 1;
  private int S183869 = 1;
  private int S183900 = 1;
  private int S183899 = 1;
  private int S183931 = 1;
  private int S183930 = 1;
  private int S183990 = 1;
  private int S183961 = 1;
  private int S184321 = 1;
  private int S184255 = 1;
  private int S184263 = 1;
  private int S184271 = 1;
  private int S184279 = 1;
  private int S184287 = 1;
  private int S184295 = 1;
  private int S184303 = 1;
  private int S184311 = 1;
  private int S184319 = 1;
  
  private int[] ends = new int[55];
  private int[] tdone = new int[55];
  
  public void thread185093(int [] tdone, int [] ends){
        switch(S184319){
      case 0 : 
        active[41]=0;
        ends[41]=0;
        tdone[41]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_plant.sysj line: 207, column: 35
          gripperTurnFinalPosE.setPresent();//sysj\conveyor_plant.sysj line: 207, column: 56
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

  public void thread185092(int [] tdone, int [] ends){
        switch(S184311){
      case 0 : 
        active[40]=0;
        ends[40]=0;
        tdone[40]=1;
        break;
      
      case 1 : 
        if(gripperTurnHomePos.getprestatus()){//sysj\conveyor_plant.sysj line: 205, column: 35
          gripperTurnHomePosE.setPresent();//sysj\conveyor_plant.sysj line: 205, column: 55
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

  public void thread185091(int [] tdone, int [] ends){
        switch(S184303){
      case 0 : 
        active[39]=0;
        ends[39]=0;
        tdone[39]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_plant.sysj line: 203, column: 35
          gripperZAxisLiftedE.setPresent();//sysj\conveyor_plant.sysj line: 203, column: 55
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

  public void thread185090(int [] tdone, int [] ends){
        switch(S184295){
      case 0 : 
        active[38]=0;
        ends[38]=0;
        tdone[38]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLowered.getprestatus()){//sysj\conveyor_plant.sysj line: 201, column: 35
          gripperZAxisLoweredE.setPresent();//sysj\conveyor_plant.sysj line: 201, column: 56
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

  public void thread185089(int [] tdone, int [] ends){
        switch(S184287){
      case 0 : 
        active[37]=0;
        ends[37]=0;
        tdone[37]=1;
        break;
      
      case 1 : 
        if(cylClampBottleExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 199, column: 35
          cylClampBottleExtendE.setPresent();//sysj\conveyor_plant.sysj line: 199, column: 57
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

  public void thread185088(int [] tdone, int [] ends){
        switch(S184279){
      case 0 : 
        active[36]=0;
        ends[36]=0;
        tdone[36]=1;
        break;
      
      case 1 : 
        if(capGripperPos5Extend.getprestatus()){//sysj\conveyor_plant.sysj line: 197, column: 35
          capGripperPos5ExtendE.setPresent();//sysj\conveyor_plant.sysj line: 197, column: 57
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

  public void thread185087(int [] tdone, int [] ends){
        switch(S184271){
      case 0 : 
        active[35]=0;
        ends[35]=0;
        tdone[35]=1;
        break;
      
      case 1 : 
        if(gripperTurnExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 195, column: 35
          gripperTurnExtendE.setPresent();//sysj\conveyor_plant.sysj line: 195, column: 54
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

  public void thread185086(int [] tdone, int [] ends){
        switch(S184263){
      case 0 : 
        active[34]=0;
        ends[34]=0;
        tdone[34]=1;
        break;
      
      case 1 : 
        if(gripperTurnRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 193, column: 35
          gripperTurnRetractE.setPresent();//sysj\conveyor_plant.sysj line: 193, column: 55
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

  public void thread185085(int [] tdone, int [] ends){
        switch(S184255){
      case 0 : 
        active[33]=0;
        ends[33]=0;
        tdone[33]=1;
        break;
      
      case 1 : 
        if(cylPos5ZaxisExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 191, column: 35
          cylPos5ZaxisExtendE.setPresent();//sysj\conveyor_plant.sysj line: 191, column: 55
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

  public void thread185084(int [] tdone, int [] ends){
        switch(S184321){
      case 0 : 
        active[32]=0;
        ends[32]=0;
        tdone[32]=1;
        break;
      
      case 1 : 
        thread185085(tdone,ends);
        thread185086(tdone,ends);
        thread185087(tdone,ends);
        thread185088(tdone,ends);
        thread185089(tdone,ends);
        thread185090(tdone,ends);
        thread185091(tdone,ends);
        thread185092(tdone,ends);
        thread185093(tdone,ends);
        int biggest185094 = 0;
        if(ends[33]>=biggest185094){
          biggest185094=ends[33];
        }
        if(ends[34]>=biggest185094){
          biggest185094=ends[34];
        }
        if(ends[35]>=biggest185094){
          biggest185094=ends[35];
        }
        if(ends[36]>=biggest185094){
          biggest185094=ends[36];
        }
        if(ends[37]>=biggest185094){
          biggest185094=ends[37];
        }
        if(ends[38]>=biggest185094){
          biggest185094=ends[38];
        }
        if(ends[39]>=biggest185094){
          biggest185094=ends[39];
        }
        if(ends[40]>=biggest185094){
          biggest185094=ends[40];
        }
        if(ends[41]>=biggest185094){
          biggest185094=ends[41];
        }
        if(biggest185094 == 1){
          active[32]=1;
          ends[32]=1;
          tdone[32]=1;
        }
        //FINXME code
        if(biggest185094 == 0){
          S184321=0;
          active[32]=0;
          ends[32]=0;
          tdone[32]=1;
        }
        break;
      
    }
  }

  public void thread185083(int [] tdone, int [] ends){
        active[31]=0;
    ends[31]=0;
    tdone[31]=1;
  }

  public void thread185081(int [] tdone, int [] ends){
        S183990=1;
    S183961=0;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread185080(int [] tdone, int [] ends){
        S183931=1;
    S183930=0;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread185079(int [] tdone, int [] ends){
        S183900=1;
    S183899=0;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread185078(int [] tdone, int [] ends){
        S183869=1;
    gripperZAxisLifted.setPresent();//sysj\conveyor_plant.sysj line: 153, column: 21
    currsigs.addElement(gripperZAxisLifted);
    active[27]=1;
    ends[27]=1;
    tdone[27]=1;
  }

  public void thread185076(int [] tdone, int [] ends){
        switch(S183990){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        switch(S183961){
          case 0 : 
            if(gripperTurnExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 173, column: 24
              S183961=1;
              __start_thread_30 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 172, column: 13
              if(com.systemj.Timer.getMs() - __start_thread_30 >= 300){//sysj\conveyor_plant.sysj line: 172, column: 13
                ends[30]=2;
                ;//sysj\conveyor_plant.sysj line: 172, column: 13
                gripperTurnFinalPos.setPresent();//sysj\conveyor_plant.sysj line: 175, column: 17
                currsigs.addElement(gripperTurnFinalPos);
                S183961=2;
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
            else {
              active[30]=1;
              ends[30]=1;
              tdone[30]=1;
            }
            break;
          
          case 1 : 
            if(com.systemj.Timer.getMs() - __start_thread_30 >= 300){//sysj\conveyor_plant.sysj line: 172, column: 13
              ends[30]=2;
              ;//sysj\conveyor_plant.sysj line: 172, column: 13
              gripperTurnFinalPos.setPresent();//sysj\conveyor_plant.sysj line: 175, column: 17
              currsigs.addElement(gripperTurnFinalPos);
              S183961=2;
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
          
          case 2 : 
            S183961=2;
            S183961=3;
            __start_thread_30 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 172, column: 13
            if(com.systemj.Timer.getMs() - __start_thread_30 >= 300){//sysj\conveyor_plant.sysj line: 172, column: 13
              ends[30]=2;
              ;//sysj\conveyor_plant.sysj line: 172, column: 13
              gripperZAxisLifted.setPresent();//sysj\conveyor_plant.sysj line: 178, column: 17
              currsigs.addElement(gripperZAxisLifted);
              S183961=4;
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
          
          case 3 : 
            if(com.systemj.Timer.getMs() - __start_thread_30 >= 300){//sysj\conveyor_plant.sysj line: 172, column: 13
              ends[30]=2;
              ;//sysj\conveyor_plant.sysj line: 172, column: 13
              gripperZAxisLifted.setPresent();//sysj\conveyor_plant.sysj line: 178, column: 17
              currsigs.addElement(gripperZAxisLifted);
              S183961=4;
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
          
          case 4 : 
            S183961=4;
            S183990=0;
            active[30]=0;
            ends[30]=0;
            tdone[30]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread185075(int [] tdone, int [] ends){
        switch(S183931){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        switch(S183930){
          case 0 : 
            if(cylPos5ZaxisExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 166, column: 24
              S183930=1;
              __start_thread_29 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 165, column: 13
              if(com.systemj.Timer.getMs() - __start_thread_29 >= 300){//sysj\conveyor_plant.sysj line: 165, column: 13
                ends[29]=2;
                ;//sysj\conveyor_plant.sysj line: 165, column: 13
                gripperZAxisLowered.setPresent();//sysj\conveyor_plant.sysj line: 168, column: 17
                currsigs.addElement(gripperZAxisLowered);
                S183930=2;
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
            else {
              active[29]=1;
              ends[29]=1;
              tdone[29]=1;
            }
            break;
          
          case 1 : 
            if(com.systemj.Timer.getMs() - __start_thread_29 >= 300){//sysj\conveyor_plant.sysj line: 165, column: 13
              ends[29]=2;
              ;//sysj\conveyor_plant.sysj line: 165, column: 13
              gripperZAxisLowered.setPresent();//sysj\conveyor_plant.sysj line: 168, column: 17
              currsigs.addElement(gripperZAxisLowered);
              S183930=2;
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
          
          case 2 : 
            S183930=2;
            S183931=0;
            active[29]=0;
            ends[29]=0;
            tdone[29]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread185074(int [] tdone, int [] ends){
        switch(S183900){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        switch(S183899){
          case 0 : 
            if(gripperTurnRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 159, column: 24
              S183899=1;
              __start_thread_28 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 158, column: 11
              if(com.systemj.Timer.getMs() - __start_thread_28 >= 300){//sysj\conveyor_plant.sysj line: 158, column: 11
                ends[28]=2;
                ;//sysj\conveyor_plant.sysj line: 158, column: 11
                gripperTurnHomePos.setPresent();//sysj\conveyor_plant.sysj line: 161, column: 17
                currsigs.addElement(gripperTurnHomePos);
                S183899=2;
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
            else {
              active[28]=1;
              ends[28]=1;
              tdone[28]=1;
            }
            break;
          
          case 1 : 
            if(com.systemj.Timer.getMs() - __start_thread_28 >= 300){//sysj\conveyor_plant.sysj line: 158, column: 11
              ends[28]=2;
              ;//sysj\conveyor_plant.sysj line: 158, column: 11
              gripperTurnHomePos.setPresent();//sysj\conveyor_plant.sysj line: 161, column: 17
              currsigs.addElement(gripperTurnHomePos);
              S183899=2;
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
            S183899=2;
            S183900=0;
            active[28]=0;
            ends[28]=0;
            tdone[28]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread185073(int [] tdone, int [] ends){
        switch(S183869){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        if(gripperTurnRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 152, column: 23
          S183869=0;
          active[27]=0;
          ends[27]=0;
          tdone[27]=1;
        }
        else {
          gripperZAxisLifted.setPresent();//sysj\conveyor_plant.sysj line: 153, column: 21
          currsigs.addElement(gripperZAxisLifted);
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
        break;
      
    }
  }

  public void thread185072(int [] tdone, int [] ends){
        switch(S184246){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        thread185073(tdone,ends);
        thread185074(tdone,ends);
        thread185075(tdone,ends);
        thread185076(tdone,ends);
        int biggest185077 = 0;
        if(ends[27]>=biggest185077){
          biggest185077=ends[27];
        }
        if(ends[28]>=biggest185077){
          biggest185077=ends[28];
        }
        if(ends[29]>=biggest185077){
          biggest185077=ends[29];
        }
        if(ends[30]>=biggest185077){
          biggest185077=ends[30];
        }
        if(biggest185077 == 1){
          active[26]=1;
          ends[26]=1;
          tdone[26]=1;
        }
        //FINXME code
        if(biggest185077 == 0){
          thread185078(tdone,ends);
          thread185079(tdone,ends);
          thread185080(tdone,ends);
          thread185081(tdone,ends);
          int biggest185082 = 0;
          if(ends[27]>=biggest185082){
            biggest185082=ends[27];
          }
          if(ends[28]>=biggest185082){
            biggest185082=ends[28];
          }
          if(ends[29]>=biggest185082){
            biggest185082=ends[29];
          }
          if(ends[30]>=biggest185082){
            biggest185082=ends[30];
          }
          if(biggest185082 == 1){
            active[26]=1;
            ends[26]=1;
            tdone[26]=1;
          }
        }
        break;
      
    }
  }

  public void thread185069(int [] tdone, int [] ends){
        S184319=1;
    if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_plant.sysj line: 207, column: 35
      gripperTurnFinalPosE.setPresent();//sysj\conveyor_plant.sysj line: 207, column: 56
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

  public void thread185068(int [] tdone, int [] ends){
        S184311=1;
    if(gripperTurnHomePos.getprestatus()){//sysj\conveyor_plant.sysj line: 205, column: 35
      gripperTurnHomePosE.setPresent();//sysj\conveyor_plant.sysj line: 205, column: 55
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

  public void thread185067(int [] tdone, int [] ends){
        S184303=1;
    if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_plant.sysj line: 203, column: 35
      gripperZAxisLiftedE.setPresent();//sysj\conveyor_plant.sysj line: 203, column: 55
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

  public void thread185066(int [] tdone, int [] ends){
        S184295=1;
    if(gripperZAxisLowered.getprestatus()){//sysj\conveyor_plant.sysj line: 201, column: 35
      gripperZAxisLoweredE.setPresent();//sysj\conveyor_plant.sysj line: 201, column: 56
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

  public void thread185065(int [] tdone, int [] ends){
        S184287=1;
    if(cylClampBottleExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 199, column: 35
      cylClampBottleExtendE.setPresent();//sysj\conveyor_plant.sysj line: 199, column: 57
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

  public void thread185064(int [] tdone, int [] ends){
        S184279=1;
    if(capGripperPos5Extend.getprestatus()){//sysj\conveyor_plant.sysj line: 197, column: 35
      capGripperPos5ExtendE.setPresent();//sysj\conveyor_plant.sysj line: 197, column: 57
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

  public void thread185063(int [] tdone, int [] ends){
        S184271=1;
    if(gripperTurnExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 195, column: 35
      gripperTurnExtendE.setPresent();//sysj\conveyor_plant.sysj line: 195, column: 54
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

  public void thread185062(int [] tdone, int [] ends){
        S184263=1;
    if(gripperTurnRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 193, column: 35
      gripperTurnRetractE.setPresent();//sysj\conveyor_plant.sysj line: 193, column: 55
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

  public void thread185061(int [] tdone, int [] ends){
        S184255=1;
    if(cylPos5ZaxisExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 191, column: 35
      cylPos5ZaxisExtendE.setPresent();//sysj\conveyor_plant.sysj line: 191, column: 55
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

  public void thread185060(int [] tdone, int [] ends){
        S184321=1;
    thread185061(tdone,ends);
    thread185062(tdone,ends);
    thread185063(tdone,ends);
    thread185064(tdone,ends);
    thread185065(tdone,ends);
    thread185066(tdone,ends);
    thread185067(tdone,ends);
    thread185068(tdone,ends);
    thread185069(tdone,ends);
    int biggest185070 = 0;
    if(ends[33]>=biggest185070){
      biggest185070=ends[33];
    }
    if(ends[34]>=biggest185070){
      biggest185070=ends[34];
    }
    if(ends[35]>=biggest185070){
      biggest185070=ends[35];
    }
    if(ends[36]>=biggest185070){
      biggest185070=ends[36];
    }
    if(ends[37]>=biggest185070){
      biggest185070=ends[37];
    }
    if(ends[38]>=biggest185070){
      biggest185070=ends[38];
    }
    if(ends[39]>=biggest185070){
      biggest185070=ends[39];
    }
    if(ends[40]>=biggest185070){
      biggest185070=ends[40];
    }
    if(ends[41]>=biggest185070){
      biggest185070=ends[41];
    }
    if(biggest185070 == 1){
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread185059(int [] tdone, int [] ends){
        active[31]=0;
    ends[31]=0;
    tdone[31]=1;
  }

  public void thread185057(int [] tdone, int [] ends){
        S183990=1;
    S183961=0;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread185056(int [] tdone, int [] ends){
        S183931=1;
    S183930=0;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread185055(int [] tdone, int [] ends){
        S183900=1;
    S183899=0;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread185054(int [] tdone, int [] ends){
        S183869=1;
    gripperZAxisLifted.setPresent();//sysj\conveyor_plant.sysj line: 153, column: 21
    currsigs.addElement(gripperZAxisLifted);
    active[27]=1;
    ends[27]=1;
    tdone[27]=1;
  }

  public void thread185053(int [] tdone, int [] ends){
        S184246=1;
    thread185054(tdone,ends);
    thread185055(tdone,ends);
    thread185056(tdone,ends);
    thread185057(tdone,ends);
    int biggest185058 = 0;
    if(ends[27]>=biggest185058){
      biggest185058=ends[27];
    }
    if(ends[28]>=biggest185058){
      biggest185058=ends[28];
    }
    if(ends[29]>=biggest185058){
      biggest185058=ends[29];
    }
    if(ends[30]>=biggest185058){
      biggest185058=ends[30];
    }
    if(biggest185058 == 1){
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S184323){
        case 0 : 
          S184323=0;
          break RUN;
        
        case 1 : 
          S184323=2;
          S184323=2;
          thread185053(tdone,ends);
          thread185059(tdone,ends);
          thread185060(tdone,ends);
          int biggest185071 = 0;
          if(ends[26]>=biggest185071){
            biggest185071=ends[26];
          }
          if(ends[31]>=biggest185071){
            biggest185071=ends[31];
          }
          if(ends[32]>=biggest185071){
            biggest185071=ends[32];
          }
          if(biggest185071 == 1){
            active[25]=1;
            ends[25]=1;
            break RUN;
          }
        
        case 2 : 
          thread185072(tdone,ends);
          thread185083(tdone,ends);
          thread185084(tdone,ends);
          int biggest185095 = 0;
          if(ends[26]>=biggest185095){
            biggest185095=ends[26];
          }
          if(ends[31]>=biggest185095){
            biggest185095=ends[31];
          }
          if(ends[32]>=biggest185095){
            biggest185095=ends[32];
          }
          if(biggest185095 == 1){
            active[25]=1;
            ends[25]=1;
            break RUN;
          }
          //FINXME code
          if(biggest185095 == 0){
            S184323=0;
            active[25]=0;
            ends[25]=0;
            S184323=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
