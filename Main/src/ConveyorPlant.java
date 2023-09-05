import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.GUI;//sysj\Conveyor\conveyor_plant.sysj line: 1, column: 1

public class ConveyorPlant extends ClockDomain{
  public ConveyorPlant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal step = new Signal("step", Signal.INPUT);
  public Signal bottleStart = new Signal("bottleStart", Signal.INPUT);
  public Signal bottleLeft = new Signal("bottleLeft", Signal.INPUT);
  public Signal placedNewBottle = new Signal("placedNewBottle", Signal.INPUT);
  public Signal placedNewBottleRight = new Signal("placedNewBottleRight", Signal.INPUT);
  public Signal removeBottle = new Signal("removeBottle", Signal.INPUT);
  public Signal controllerMotorOn = new Signal("controllerMotorOn", Signal.INPUT);
  public Signal toControllerBottleAtRotaryStart = new Signal("toControllerBottleAtRotaryStart", Signal.OUTPUT);
  public Signal toControllerBottleLeftRotaryStart = new Signal("toControllerBottleLeftRotaryStart", Signal.OUTPUT);
  public Signal atPos0 = new Signal("atPos0", Signal.OUTPUT);
  public Signal atPos1 = new Signal("atPos1", Signal.OUTPUT);
  public Signal atPos2 = new Signal("atPos2", Signal.OUTPUT);
  public Signal atPos4 = new Signal("atPos4", Signal.OUTPUT);
  public Signal atPos5 = new Signal("atPos5", Signal.OUTPUT);
  public Signal conveyorRunning = new Signal("conveyorRunning", Signal.OUTPUT);
  public Signal conveyorNotRunning = new Signal("conveyorNotRunning", Signal.OUTPUT);
  private Signal bottlePos_1;
  private int S2173 = 1;
  private int S1574 = 1;
  private int S1558 = 1;
  private int S1594 = 1;
  private int S1578 = 1;
  private int S1626 = 1;
  private int S1604 = 1;
  private int S1658 = 1;
  private int S1636 = 1;
  private int S1672 = 1;
  private int S1662 = 1;
  private int S1680 = 1;
  private int S1674 = 1;
  private int S1700 = 1;
  private int S1708 = 1;
  
  private int[] ends = new int[10];
  private int[] tdone = new int[10];
  
  public void thread2191(int [] tdone, int [] ends){
        switch(S1708){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(controllerMotorOn.getprestatus()){//sysj\Conveyor\conveyor_plant.sysj line: 160, column: 12
          conveyorRunning.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 162, column: 4
          currsigs.addElement(conveyorRunning);
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        else {
          conveyorNotRunning.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 167, column: 4
          currsigs.addElement(conveyorNotRunning);
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        break;
      
    }
  }

  public void thread2190(int [] tdone, int [] ends){
        switch(S1700){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if((bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 0){//sysj\Conveyor\conveyor_plant.sysj line: 131, column: 7
          atPos0.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 133, column: 4
          currsigs.addElement(atPos0);
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        else {
          if((bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 1){//sysj\Conveyor\conveyor_plant.sysj line: 135, column: 12
            atPos1.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 137, column: 4
            currsigs.addElement(atPos1);
            active[8]=1;
            ends[8]=1;
            tdone[8]=1;
          }
          else {
            if((bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 2){//sysj\Conveyor\conveyor_plant.sysj line: 139, column: 12
              atPos2.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 141, column: 4
              currsigs.addElement(atPos2);
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              if((bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 4){//sysj\Conveyor\conveyor_plant.sysj line: 143, column: 12
                atPos4.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 145, column: 4
                currsigs.addElement(atPos4);
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              else {
                if((bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 5){//sysj\Conveyor\conveyor_plant.sysj line: 147, column: 12
                  atPos5.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 149, column: 4
                  currsigs.addElement(atPos5);
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
            }
          }
        }
        break;
      
    }
  }

  public void thread2189(int [] tdone, int [] ends){
        switch(S1680){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S1674){
          case 0 : 
            S1674=0;
            if((bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 2){//sysj\Conveyor\conveyor_plant.sysj line: 120, column: 8
              toControllerBottleAtRotaryStart.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 122, column: 5
              currsigs.addElement(toControllerBottleAtRotaryStart);
              S1674=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S1674=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            S1674=1;
            S1674=0;
            if((bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 2){//sysj\Conveyor\conveyor_plant.sysj line: 120, column: 8
              toControllerBottleAtRotaryStart.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 122, column: 5
              currsigs.addElement(toControllerBottleAtRotaryStart);
              S1674=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S1674=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2188(int [] tdone, int [] ends){
        switch(S1672){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S1662){
          case 0 : 
            if(removeBottle.getprestatus()){//sysj\Conveyor\conveyor_plant.sysj line: 108, column: 9
              S1662=1;
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
          
          case 1 : 
            if(step.getprestatus()){//sysj\Conveyor\conveyor_plant.sysj line: 109, column: 9
              bottlePos_1.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 110, column: 3
              currsigs.addElement(bottlePos_1);
              bottlePos_1.setValue(0);//sysj\Conveyor\conveyor_plant.sysj line: 110, column: 3
              System.out.println("bottleGone");//sysj\Conveyor\conveyor_plant.sysj line: 111, column: 3
              S1662=2;
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
          
          case 2 : 
            S1662=2;
            S1662=0;
            active[6]=1;
            ends[6]=1;
            tdone[6]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread2187(int [] tdone, int [] ends){
        switch(S1658){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S1636){
          case 0 : 
            if(!step.getprestatus()){//sysj\Conveyor\conveyor_plant.sysj line: 90, column: 9
              S1636=1;
              if(controllerMotorOn.getprestatus()){//sysj\Conveyor\conveyor_plant.sysj line: 91, column: 11
                if((bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 4){//sysj\Conveyor\conveyor_plant.sysj line: 93, column: 8
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S1636=2;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
              }
              else {
                S1636=2;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
            }
            else {
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            if(step.getprestatus()){//sysj\Conveyor\conveyor_plant.sysj line: 95, column: 11
              System.out.println("steppedAtRight");//sysj\Conveyor\conveyor_plant.sysj line: 96, column: 5
              bottlePos_1.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 97, column: 5
              currsigs.addElement(bottlePos_1);
              bottlePos_1.setValue(5);//sysj\Conveyor\conveyor_plant.sysj line: 97, column: 5
              S1636=2;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 2 : 
            S1636=2;
            S1636=0;
            active[5]=1;
            ends[5]=1;
            tdone[5]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread2186(int [] tdone, int [] ends){
        switch(S1626){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S1604){
          case 0 : 
            if(!step.getprestatus()){//sysj\Conveyor\conveyor_plant.sysj line: 72, column: 9
              S1604=1;
              if(controllerMotorOn.getprestatus()){//sysj\Conveyor\conveyor_plant.sysj line: 73, column: 11
                if((bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 1){//sysj\Conveyor\conveyor_plant.sysj line: 75, column: 8
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S1604=2;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
              }
              else {
                S1604=2;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
            else {
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            if(step.getprestatus()){//sysj\Conveyor\conveyor_plant.sysj line: 77, column: 11
              System.out.println("steppedAtLeft");//sysj\Conveyor\conveyor_plant.sysj line: 78, column: 5
              bottlePos_1.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 79, column: 5
              currsigs.addElement(bottlePos_1);
              bottlePos_1.setValue(2);//sysj\Conveyor\conveyor_plant.sysj line: 79, column: 5
              S1604=2;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 2 : 
            S1604=2;
            S1604=0;
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread2185(int [] tdone, int [] ends){
        switch(S1594){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S1578){
          case 0 : 
            if(placedNewBottle.getprestatus()){//sysj\Conveyor\conveyor_plant.sysj line: 57, column: 9
              S1578=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            if(step.getprestatus()){//sysj\Conveyor\conveyor_plant.sysj line: 58, column: 9
              System.out.println("NewBottleArrivedRight");//sysj\Conveyor\conveyor_plant.sysj line: 59, column: 3
              bottlePos_1.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 60, column: 3
              currsigs.addElement(bottlePos_1);
              bottlePos_1.setValue(1);//sysj\Conveyor\conveyor_plant.sysj line: 60, column: 3
              System.out.println("bottleAtPos1");//sysj\Conveyor\conveyor_plant.sysj line: 61, column: 3
              S1578=2;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 2 : 
            if(!step.getprestatus()){//sysj\Conveyor\conveyor_plant.sysj line: 62, column: 9
              S1578=3;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 3 : 
            S1578=3;
            S1578=0;
            active[3]=1;
            ends[3]=1;
            tdone[3]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread2184(int [] tdone, int [] ends){
        switch(S1574){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S1558){
          case 0 : 
            if(placedNewBottleRight.getprestatus()){//sysj\Conveyor\conveyor_plant.sysj line: 42, column: 9
              S1558=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(step.getprestatus()){//sysj\Conveyor\conveyor_plant.sysj line: 43, column: 9
              System.out.println("NewBottleArrived");//sysj\Conveyor\conveyor_plant.sysj line: 44, column: 3
              bottlePos_1.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 45, column: 3
              currsigs.addElement(bottlePos_1);
              bottlePos_1.setValue(4);//sysj\Conveyor\conveyor_plant.sysj line: 45, column: 3
              System.out.println("bottleAtPos4");//sysj\Conveyor\conveyor_plant.sysj line: 46, column: 3
              S1558=2;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 2 : 
            if(!step.getprestatus()){//sysj\Conveyor\conveyor_plant.sysj line: 47, column: 9
              S1558=3;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 3 : 
            S1558=3;
            S1558=0;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread2182(int [] tdone, int [] ends){
        S1708=1;
    if(controllerMotorOn.getprestatus()){//sysj\Conveyor\conveyor_plant.sysj line: 160, column: 12
      conveyorRunning.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 162, column: 4
      currsigs.addElement(conveyorRunning);
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      conveyorNotRunning.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 167, column: 4
      currsigs.addElement(conveyorNotRunning);
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread2181(int [] tdone, int [] ends){
        S1700=1;
    if((bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 0){//sysj\Conveyor\conveyor_plant.sysj line: 131, column: 7
      atPos0.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 133, column: 4
      currsigs.addElement(atPos0);
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      if((bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 1){//sysj\Conveyor\conveyor_plant.sysj line: 135, column: 12
        atPos1.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 137, column: 4
        currsigs.addElement(atPos1);
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
      else {
        if((bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 2){//sysj\Conveyor\conveyor_plant.sysj line: 139, column: 12
          atPos2.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 141, column: 4
          currsigs.addElement(atPos2);
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        else {
          if((bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 4){//sysj\Conveyor\conveyor_plant.sysj line: 143, column: 12
            atPos4.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 145, column: 4
            currsigs.addElement(atPos4);
            active[8]=1;
            ends[8]=1;
            tdone[8]=1;
          }
          else {
            if((bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 5){//sysj\Conveyor\conveyor_plant.sysj line: 147, column: 12
              atPos5.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 149, column: 4
              currsigs.addElement(atPos5);
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
        }
      }
    }
  }

  public void thread2180(int [] tdone, int [] ends){
        S1680=1;
    S1674=0;
    if((bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 2){//sysj\Conveyor\conveyor_plant.sysj line: 120, column: 8
      toControllerBottleAtRotaryStart.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 122, column: 5
      currsigs.addElement(toControllerBottleAtRotaryStart);
      S1674=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S1674=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread2179(int [] tdone, int [] ends){
        S1672=1;
    S1662=0;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread2178(int [] tdone, int [] ends){
        S1658=1;
    S1636=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread2177(int [] tdone, int [] ends){
        S1626=1;
    S1604=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread2176(int [] tdone, int [] ends){
        S1594=1;
    S1578=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread2175(int [] tdone, int [] ends){
        S1574=1;
    S1558=0;
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
      switch(S2173){
        case 0 : 
          S2173=0;
          break RUN;
        
        case 1 : 
          S2173=2;
          S2173=2;
          new Thread(new GUI()).start();//sysj\Conveyor\conveyor_plant.sysj line: 31, column: 2
          System.out.println("preplant starting");//sysj\Conveyor\conveyor_plant.sysj line: 32, column: 2
          bottlePos_1.setClear();//sysj\Conveyor\conveyor_plant.sysj line: 33, column: 2
          bottlePos_1.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 34, column: 2
          currsigs.addElement(bottlePos_1);
          bottlePos_1.setValue(0);//sysj\Conveyor\conveyor_plant.sysj line: 34, column: 2
          System.out.println("started the plant");//sysj\Conveyor\conveyor_plant.sysj line: 36, column: 2
          thread2175(tdone,ends);
          thread2176(tdone,ends);
          thread2177(tdone,ends);
          thread2178(tdone,ends);
          thread2179(tdone,ends);
          thread2180(tdone,ends);
          thread2181(tdone,ends);
          thread2182(tdone,ends);
          int biggest2183 = 0;
          if(ends[2]>=biggest2183){
            biggest2183=ends[2];
          }
          if(ends[3]>=biggest2183){
            biggest2183=ends[3];
          }
          if(ends[4]>=biggest2183){
            biggest2183=ends[4];
          }
          if(ends[5]>=biggest2183){
            biggest2183=ends[5];
          }
          if(ends[6]>=biggest2183){
            biggest2183=ends[6];
          }
          if(ends[7]>=biggest2183){
            biggest2183=ends[7];
          }
          if(ends[8]>=biggest2183){
            biggest2183=ends[8];
          }
          if(ends[9]>=biggest2183){
            biggest2183=ends[9];
          }
          if(biggest2183 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          bottlePos_1.setClear();//sysj\Conveyor\conveyor_plant.sysj line: 33, column: 2
          thread2184(tdone,ends);
          thread2185(tdone,ends);
          thread2186(tdone,ends);
          thread2187(tdone,ends);
          thread2188(tdone,ends);
          thread2189(tdone,ends);
          thread2190(tdone,ends);
          thread2191(tdone,ends);
          int biggest2192 = 0;
          if(ends[2]>=biggest2192){
            biggest2192=ends[2];
          }
          if(ends[3]>=biggest2192){
            biggest2192=ends[3];
          }
          if(ends[4]>=biggest2192){
            biggest2192=ends[4];
          }
          if(ends[5]>=biggest2192){
            biggest2192=ends[5];
          }
          if(ends[6]>=biggest2192){
            biggest2192=ends[6];
          }
          if(ends[7]>=biggest2192){
            biggest2192=ends[7];
          }
          if(ends[8]>=biggest2192){
            biggest2192=ends[8];
          }
          if(ends[9]>=biggest2192){
            biggest2192=ends[9];
          }
          if(biggest2192 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest2192 == 0){
            S2173=0;
            active[1]=0;
            ends[1]=0;
            S2173=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    bottlePos_1 = new Signal();
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
          step.gethook();
          bottleStart.gethook();
          bottleLeft.gethook();
          placedNewBottle.gethook();
          placedNewBottleRight.gethook();
          removeBottle.gethook();
          controllerMotorOn.gethook();
          df = true;
        }
        runClockDomain();
      }
      step.setpreclear();
      bottleStart.setpreclear();
      bottleLeft.setpreclear();
      placedNewBottle.setpreclear();
      placedNewBottleRight.setpreclear();
      removeBottle.setpreclear();
      controllerMotorOn.setpreclear();
      toControllerBottleAtRotaryStart.setpreclear();
      toControllerBottleLeftRotaryStart.setpreclear();
      atPos0.setpreclear();
      atPos1.setpreclear();
      atPos2.setpreclear();
      atPos4.setpreclear();
      atPos5.setpreclear();
      conveyorRunning.setpreclear();
      conveyorNotRunning.setpreclear();
      bottlePos_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = step.getStatus() ? step.setprepresent() : step.setpreclear();
      step.setpreval(step.getValue());
      step.setClear();
      dummyint = bottleStart.getStatus() ? bottleStart.setprepresent() : bottleStart.setpreclear();
      bottleStart.setpreval(bottleStart.getValue());
      bottleStart.setClear();
      dummyint = bottleLeft.getStatus() ? bottleLeft.setprepresent() : bottleLeft.setpreclear();
      bottleLeft.setpreval(bottleLeft.getValue());
      bottleLeft.setClear();
      dummyint = placedNewBottle.getStatus() ? placedNewBottle.setprepresent() : placedNewBottle.setpreclear();
      placedNewBottle.setpreval(placedNewBottle.getValue());
      placedNewBottle.setClear();
      dummyint = placedNewBottleRight.getStatus() ? placedNewBottleRight.setprepresent() : placedNewBottleRight.setpreclear();
      placedNewBottleRight.setpreval(placedNewBottleRight.getValue());
      placedNewBottleRight.setClear();
      dummyint = removeBottle.getStatus() ? removeBottle.setprepresent() : removeBottle.setpreclear();
      removeBottle.setpreval(removeBottle.getValue());
      removeBottle.setClear();
      dummyint = controllerMotorOn.getStatus() ? controllerMotorOn.setprepresent() : controllerMotorOn.setpreclear();
      controllerMotorOn.setpreval(controllerMotorOn.getValue());
      controllerMotorOn.setClear();
      toControllerBottleAtRotaryStart.sethook();
      toControllerBottleAtRotaryStart.setClear();
      toControllerBottleLeftRotaryStart.sethook();
      toControllerBottleLeftRotaryStart.setClear();
      atPos0.sethook();
      atPos0.setClear();
      atPos1.sethook();
      atPos1.setClear();
      atPos2.sethook();
      atPos2.setClear();
      atPos4.sethook();
      atPos4.setClear();
      atPos5.sethook();
      atPos5.setClear();
      conveyorRunning.sethook();
      conveyorRunning.setClear();
      conveyorNotRunning.sethook();
      conveyorNotRunning.setClear();
      bottlePos_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        step.gethook();
        bottleStart.gethook();
        bottleLeft.gethook();
        placedNewBottle.gethook();
        placedNewBottleRight.gethook();
        removeBottle.gethook();
        controllerMotorOn.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
