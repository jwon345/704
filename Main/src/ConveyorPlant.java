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
  public Signal motConveyorOnOff = new Signal("motConveyorOnOff", Signal.OUTPUT);
  public Signal bottleAtPos5 = new Signal("bottleAtPos5", Signal.OUTPUT);
  public Signal newBottle = new Signal("newBottle", Signal.OUTPUT);
  public Signal toControllerBottleAtRotaryStart = new Signal("toControllerBottleAtRotaryStart", Signal.OUTPUT);
  public Signal toControllerBottleLeftRotaryStart = new Signal("toControllerBottleLeftRotaryStart", Signal.OUTPUT);
  public Signal atPos0 = new Signal("atPos0", Signal.OUTPUT);
  public Signal atPos1 = new Signal("atPos1", Signal.OUTPUT);
  public Signal atPos2 = new Signal("atPos2", Signal.OUTPUT);
  public Signal atPos4 = new Signal("atPos4", Signal.OUTPUT);
  public Signal atPos5 = new Signal("atPos5", Signal.OUTPUT);
  public Signal conveyorRunning = new Signal("conveyorRunning", Signal.OUTPUT);
  public Signal conveyorNotRunning = new Signal("conveyorNotRunning", Signal.OUTPUT);
  private Signal stage1done_1;
  private Signal stage2done_1;
  private Signal theMotorIsOn_1;
  private Signal bottlePos_1;
  private int S2343 = 1;
  private int S1595 = 1;
  private int S1562 = 1;
  private int S1615 = 1;
  private int S1599 = 1;
  private int S1647 = 1;
  private int S1619 = 1;
  private int S1679 = 1;
  private int S1651 = 1;
  private int S1693 = 1;
  private int S1683 = 1;
  private int S1701 = 1;
  private int S1695 = 1;
  private int S1721 = 1;
  private int S1729 = 1;
  private int S1752 = 1;
  private int S1733 = 1;
  
  private int[] ends = new int[11];
  private int[] tdone = new int[11];
  
  public void thread2363(int [] tdone, int [] ends){
        switch(S1752){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S1733){
          case 0 : 
            if(step.getprestatus()){//sysj\Conveyor\conveyor_plant.sysj line: 231, column: 10
              if(step.getprestatus()){//sysj\Conveyor\conveyor_plant.sysj line: 232, column: 12
                System.out.println("Step Triggered");//sysj\Conveyor\conveyor_plant.sysj line: 234, column: 5
                S1733=1;
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
                S1733=1;
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
            }
            else {
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 1 : 
            if(!step.getprestatus()){//sysj\Conveyor\conveyor_plant.sysj line: 236, column: 10
              S1733=0;
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
        break;
      
    }
  }

  public void thread2362(int [] tdone, int [] ends){
        switch(S1729){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(controllerMotorOn.getprestatus()){//sysj\Conveyor\conveyor_plant.sysj line: 213, column: 12
          conveyorRunning.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 215, column: 4
          currsigs.addElement(conveyorRunning);
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        else {
          conveyorNotRunning.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 220, column: 4
          currsigs.addElement(conveyorNotRunning);
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        break;
      
    }
  }

  public void thread2361(int [] tdone, int [] ends){
        switch(S1721){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if((bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 0){//sysj\Conveyor\conveyor_plant.sysj line: 184, column: 7
          atPos0.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 186, column: 4
          currsigs.addElement(atPos0);
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        else {
          if((bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 1){//sysj\Conveyor\conveyor_plant.sysj line: 188, column: 12
            atPos1.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 190, column: 4
            currsigs.addElement(atPos1);
            active[8]=1;
            ends[8]=1;
            tdone[8]=1;
          }
          else {
            if((bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 2){//sysj\Conveyor\conveyor_plant.sysj line: 192, column: 12
              atPos2.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 194, column: 4
              currsigs.addElement(atPos2);
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              if((bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 4){//sysj\Conveyor\conveyor_plant.sysj line: 196, column: 12
                atPos4.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 198, column: 4
                currsigs.addElement(atPos4);
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              else {
                if((bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 5){//sysj\Conveyor\conveyor_plant.sysj line: 200, column: 12
                  atPos5.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 202, column: 4
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

  public void thread2360(int [] tdone, int [] ends){
        switch(S1701){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S1695){
          case 0 : 
            S1695=0;
            if((bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 2){//sysj\Conveyor\conveyor_plant.sysj line: 173, column: 8
              toControllerBottleAtRotaryStart.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 175, column: 5
              currsigs.addElement(toControllerBottleAtRotaryStart);
              S1695=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S1695=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            S1695=1;
            S1695=0;
            if((bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 2){//sysj\Conveyor\conveyor_plant.sysj line: 173, column: 8
              toControllerBottleAtRotaryStart.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 175, column: 5
              currsigs.addElement(toControllerBottleAtRotaryStart);
              S1695=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S1695=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2359(int [] tdone, int [] ends){
        switch(S1693){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S1683){
          case 0 : 
            if(removeBottle.getprestatus()){//sysj\Conveyor\conveyor_plant.sysj line: 158, column: 9
              S1683=1;
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
            if(step.getprestatus()){//sysj\Conveyor\conveyor_plant.sysj line: 159, column: 9
              bottlePos_1.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 162, column: 3
              currsigs.addElement(bottlePos_1);
              bottlePos_1.setValue(0);//sysj\Conveyor\conveyor_plant.sysj line: 162, column: 3
              toControllerBottleLeftRotaryStart.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 163, column: 3
              currsigs.addElement(toControllerBottleLeftRotaryStart);
              System.out.println("bottleGone");//sysj\Conveyor\conveyor_plant.sysj line: 165, column: 3
              S1683=2;
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
            S1683=2;
            S1683=0;
            active[6]=1;
            ends[6]=1;
            tdone[6]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread2358(int [] tdone, int [] ends){
        switch(S1679){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S1651){
          case 0 : 
            if(stage2done_1.getprestatus()){//sysj\Conveyor\conveyor_plant.sysj line: 131, column: 9
              S1651=1;
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
          
          case 1 : 
            if(!step.getprestatus()){//sysj\Conveyor\conveyor_plant.sysj line: 132, column: 9
              System.out.println("steppedAtRight");//sysj\Conveyor\conveyor_plant.sysj line: 133, column: 3
              S1651=2;
              if((bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 4){//sysj\Conveyor\conveyor_plant.sysj line: 134, column: 7
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                S1651=3;
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
          
          case 2 : 
            if(step.getprestatus()){//sysj\Conveyor\conveyor_plant.sysj line: 137, column: 10
              bottlePos_1.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 139, column: 4
              currsigs.addElement(bottlePos_1);
              bottlePos_1.setValue(5);//sysj\Conveyor\conveyor_plant.sysj line: 139, column: 4
              S1651=3;
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
          
          case 3 : 
            S1651=3;
            S1651=0;
            active[5]=1;
            ends[5]=1;
            tdone[5]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread2357(int [] tdone, int [] ends){
        switch(S1647){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S1619){
          case 0 : 
            if(stage1done_1.getprestatus()){//sysj\Conveyor\conveyor_plant.sysj line: 105, column: 9
              S1619=1;
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
          
          case 1 : 
            if(!step.getprestatus()){//sysj\Conveyor\conveyor_plant.sysj line: 106, column: 9
              System.out.println("steppedAtLeft");//sysj\Conveyor\conveyor_plant.sysj line: 107, column: 3
              S1619=2;
              if((bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 1){//sysj\Conveyor\conveyor_plant.sysj line: 108, column: 7
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S1619=3;
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
          
          case 2 : 
            if(step.getprestatus()){//sysj\Conveyor\conveyor_plant.sysj line: 111, column: 10
              bottlePos_1.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 112, column: 4
              currsigs.addElement(bottlePos_1);
              bottlePos_1.setValue(2);//sysj\Conveyor\conveyor_plant.sysj line: 112, column: 4
              S1619=3;
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
          
          case 3 : 
            S1619=3;
            S1619=0;
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread2356(int [] tdone, int [] ends){
        switch(S1615){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S1599){
          case 0 : 
            if(placedNewBottle.getprestatus()){//sysj\Conveyor\conveyor_plant.sysj line: 77, column: 9
              S1599=1;
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
            if(step.getprestatus()){//sysj\Conveyor\conveyor_plant.sysj line: 78, column: 9
              System.out.println("NewBottleArrivedRight");//sysj\Conveyor\conveyor_plant.sysj line: 79, column: 3
              bottlePos_1.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 80, column: 3
              currsigs.addElement(bottlePos_1);
              bottlePos_1.setValue(1);//sysj\Conveyor\conveyor_plant.sysj line: 80, column: 3
              System.out.println("bottleAtPos1");//sysj\Conveyor\conveyor_plant.sysj line: 81, column: 3
              newBottle.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 82, column: 3
              currsigs.addElement(newBottle);
              S1599=2;
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
            if(!step.getprestatus()){//sysj\Conveyor\conveyor_plant.sysj line: 83, column: 9
              stage1done_1.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 97, column: 3
              currsigs.addElement(stage1done_1);
              S1599=0;
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
          
        }
        break;
      
    }
  }

  public void thread2355(int [] tdone, int [] ends){
        switch(S1595){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S1562){
          case 0 : 
            if(placedNewBottleRight.getprestatus()){//sysj\Conveyor\conveyor_plant.sysj line: 49, column: 9
              S1562=1;
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
            if(step.getprestatus()){//sysj\Conveyor\conveyor_plant.sysj line: 50, column: 9
              System.out.println("NewBottleArrived");//sysj\Conveyor\conveyor_plant.sysj line: 51, column: 3
              bottlePos_1.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 52, column: 3
              currsigs.addElement(bottlePos_1);
              bottlePos_1.setValue(4);//sysj\Conveyor\conveyor_plant.sysj line: 52, column: 3
              System.out.println("bottleAtPos4");//sysj\Conveyor\conveyor_plant.sysj line: 53, column: 3
              newBottle.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 54, column: 3
              currsigs.addElement(newBottle);
              S1562=2;
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
            if(!step.getprestatus()){//sysj\Conveyor\conveyor_plant.sysj line: 55, column: 9
              S1562=3;
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
            S1562=3;
            stage2done_1.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 69, column: 3
            currsigs.addElement(stage2done_1);
            S1562=0;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread2353(int [] tdone, int [] ends){
        S1752=1;
    S1733=0;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread2352(int [] tdone, int [] ends){
        S1729=1;
    if(controllerMotorOn.getprestatus()){//sysj\Conveyor\conveyor_plant.sysj line: 213, column: 12
      conveyorRunning.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 215, column: 4
      currsigs.addElement(conveyorRunning);
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      conveyorNotRunning.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 220, column: 4
      currsigs.addElement(conveyorNotRunning);
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread2351(int [] tdone, int [] ends){
        S1721=1;
    if((bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 0){//sysj\Conveyor\conveyor_plant.sysj line: 184, column: 7
      atPos0.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 186, column: 4
      currsigs.addElement(atPos0);
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      if((bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 1){//sysj\Conveyor\conveyor_plant.sysj line: 188, column: 12
        atPos1.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 190, column: 4
        currsigs.addElement(atPos1);
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
      else {
        if((bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 2){//sysj\Conveyor\conveyor_plant.sysj line: 192, column: 12
          atPos2.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 194, column: 4
          currsigs.addElement(atPos2);
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        else {
          if((bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 4){//sysj\Conveyor\conveyor_plant.sysj line: 196, column: 12
            atPos4.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 198, column: 4
            currsigs.addElement(atPos4);
            active[8]=1;
            ends[8]=1;
            tdone[8]=1;
          }
          else {
            if((bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 5){//sysj\Conveyor\conveyor_plant.sysj line: 200, column: 12
              atPos5.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 202, column: 4
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

  public void thread2350(int [] tdone, int [] ends){
        S1701=1;
    S1695=0;
    if((bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 2){//sysj\Conveyor\conveyor_plant.sysj line: 173, column: 8
      toControllerBottleAtRotaryStart.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 175, column: 5
      currsigs.addElement(toControllerBottleAtRotaryStart);
      S1695=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S1695=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread2349(int [] tdone, int [] ends){
        S1693=1;
    S1683=0;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread2348(int [] tdone, int [] ends){
        S1679=1;
    S1651=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread2347(int [] tdone, int [] ends){
        S1647=1;
    S1619=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread2346(int [] tdone, int [] ends){
        S1615=1;
    S1599=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread2345(int [] tdone, int [] ends){
        S1595=1;
    System.out.println("started the plant");//sysj\Conveyor\conveyor_plant.sysj line: 45, column: 3
    bottlePos_1.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 46, column: 3
    currsigs.addElement(bottlePos_1);
    bottlePos_1.setValue(0);//sysj\Conveyor\conveyor_plant.sysj line: 46, column: 3
    S1562=0;
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
      switch(S2343){
        case 0 : 
          S2343=0;
          break RUN;
        
        case 1 : 
          S2343=2;
          S2343=2;
          new Thread(new GUI()).start();//sysj\Conveyor\conveyor_plant.sysj line: 34, column: 2
          System.out.println("preplant starting");//sysj\Conveyor\conveyor_plant.sysj line: 35, column: 2
          stage1done_1.setClear();//sysj\Conveyor\conveyor_plant.sysj line: 36, column: 2
          stage2done_1.setClear();//sysj\Conveyor\conveyor_plant.sysj line: 37, column: 2
          theMotorIsOn_1.setClear();//sysj\Conveyor\conveyor_plant.sysj line: 38, column: 2
          bottlePos_1.setClear();//sysj\Conveyor\conveyor_plant.sysj line: 39, column: 2
          theMotorIsOn_1.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 40, column: 2
          currsigs.addElement(theMotorIsOn_1);
          theMotorIsOn_1.setValue(0);//sysj\Conveyor\conveyor_plant.sysj line: 40, column: 2
          bottlePos_1.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 41, column: 2
          currsigs.addElement(bottlePos_1);
          bottlePos_1.setValue(0);//sysj\Conveyor\conveyor_plant.sysj line: 41, column: 2
          thread2345(tdone,ends);
          thread2346(tdone,ends);
          thread2347(tdone,ends);
          thread2348(tdone,ends);
          thread2349(tdone,ends);
          thread2350(tdone,ends);
          thread2351(tdone,ends);
          thread2352(tdone,ends);
          thread2353(tdone,ends);
          int biggest2354 = 0;
          if(ends[2]>=biggest2354){
            biggest2354=ends[2];
          }
          if(ends[3]>=biggest2354){
            biggest2354=ends[3];
          }
          if(ends[4]>=biggest2354){
            biggest2354=ends[4];
          }
          if(ends[5]>=biggest2354){
            biggest2354=ends[5];
          }
          if(ends[6]>=biggest2354){
            biggest2354=ends[6];
          }
          if(ends[7]>=biggest2354){
            biggest2354=ends[7];
          }
          if(ends[8]>=biggest2354){
            biggest2354=ends[8];
          }
          if(ends[9]>=biggest2354){
            biggest2354=ends[9];
          }
          if(ends[10]>=biggest2354){
            biggest2354=ends[10];
          }
          if(biggest2354 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          stage1done_1.setClear();//sysj\Conveyor\conveyor_plant.sysj line: 36, column: 2
          stage2done_1.setClear();//sysj\Conveyor\conveyor_plant.sysj line: 37, column: 2
          theMotorIsOn_1.setClear();//sysj\Conveyor\conveyor_plant.sysj line: 38, column: 2
          bottlePos_1.setClear();//sysj\Conveyor\conveyor_plant.sysj line: 39, column: 2
          thread2355(tdone,ends);
          thread2356(tdone,ends);
          thread2357(tdone,ends);
          thread2358(tdone,ends);
          thread2359(tdone,ends);
          thread2360(tdone,ends);
          thread2361(tdone,ends);
          thread2362(tdone,ends);
          thread2363(tdone,ends);
          int biggest2364 = 0;
          if(ends[2]>=biggest2364){
            biggest2364=ends[2];
          }
          if(ends[3]>=biggest2364){
            biggest2364=ends[3];
          }
          if(ends[4]>=biggest2364){
            biggest2364=ends[4];
          }
          if(ends[5]>=biggest2364){
            biggest2364=ends[5];
          }
          if(ends[6]>=biggest2364){
            biggest2364=ends[6];
          }
          if(ends[7]>=biggest2364){
            biggest2364=ends[7];
          }
          if(ends[8]>=biggest2364){
            biggest2364=ends[8];
          }
          if(ends[9]>=biggest2364){
            biggest2364=ends[9];
          }
          if(ends[10]>=biggest2364){
            biggest2364=ends[10];
          }
          if(biggest2364 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest2364 == 0){
            S2343=0;
            active[1]=0;
            ends[1]=0;
            S2343=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    stage1done_1 = new Signal();
    stage2done_1 = new Signal();
    theMotorIsOn_1 = new Signal();
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
      motConveyorOnOff.setpreclear();
      bottleAtPos5.setpreclear();
      newBottle.setpreclear();
      toControllerBottleAtRotaryStart.setpreclear();
      toControllerBottleLeftRotaryStart.setpreclear();
      atPos0.setpreclear();
      atPos1.setpreclear();
      atPos2.setpreclear();
      atPos4.setpreclear();
      atPos5.setpreclear();
      conveyorRunning.setpreclear();
      conveyorNotRunning.setpreclear();
      stage1done_1.setpreclear();
      stage2done_1.setpreclear();
      theMotorIsOn_1.setpreclear();
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
      motConveyorOnOff.sethook();
      motConveyorOnOff.setClear();
      bottleAtPos5.sethook();
      bottleAtPos5.setClear();
      newBottle.sethook();
      newBottle.setClear();
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
      stage1done_1.setClear();
      stage2done_1.setClear();
      theMotorIsOn_1.setClear();
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
