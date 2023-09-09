import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.GUI;//sysj\Conveyor\conveyor_plant.sysj line: 1, column: 1
import run.socketListener;//sysj\Conveyor\conveyor_plant.sysj line: 2, column: 1

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
  public Signal atPos0 = new Signal("atPos0", Signal.OUTPUT);
  public Signal atPos1 = new Signal("atPos1", Signal.OUTPUT);
  public Signal atPos2 = new Signal("atPos2", Signal.OUTPUT);
  public Signal atPos4 = new Signal("atPos4", Signal.OUTPUT);
  public Signal atPos5 = new Signal("atPos5", Signal.OUTPUT);
  public Signal conveyorRunning = new Signal("conveyorRunning", Signal.OUTPUT);
  public Signal conveyorNotRunning = new Signal("conveyorNotRunning", Signal.OUTPUT);
  private Signal bottlePos_1;
  private Signal a_1;
  private long __start_thread_2;//sysj\Conveyor\conveyor_plant.sysj line: 41, column: 4
  private long __start_thread_3;//sysj\Conveyor\conveyor_plant.sysj line: 60, column: 6
  private long __start_thread_5;//sysj\Conveyor\conveyor_plant.sysj line: 92, column: 4
  private long __start_thread_6;//sysj\Conveyor\conveyor_plant.sysj line: 108, column: 6
  private long __start_thread_8;//sysj\Conveyor\conveyor_plant.sysj line: 137, column: 4
  private int S10383 = 1;
  private int S2977 = 1;
  private int S1585 = 1;
  private int S1558 = 1;
  private int S1686 = 1;
  private int S1618 = 1;
  private int S1697 = 1;
  private int S3621 = 1;
  private int S3007 = 1;
  private int S3064 = 1;
  private int S3028 = 1;
  private int S3072 = 1;
  private int S3725 = 1;
  private int S3651 = 1;
  private int S3733 = 1;
  private int S3753 = 1;
  private int S3761 = 1;
  
  private int[] ends = new int[12];
  private int[] tdone = new int[12];
  
  public void thread10409(int [] tdone, int [] ends){
        switch(S3761){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(controllerMotorOn.getprestatus()){//sysj\Conveyor\conveyor_plant.sysj line: 192, column: 12
          conveyorRunning.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 194, column: 4
          currsigs.addElement(conveyorRunning);
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        else {
          conveyorNotRunning.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 199, column: 4
          currsigs.addElement(conveyorNotRunning);
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        break;
      
    }
  }

  public void thread10408(int [] tdone, int [] ends){
        switch(S3753){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if((bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 0){//sysj\Conveyor\conveyor_plant.sysj line: 163, column: 7
          atPos0.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 165, column: 4
          currsigs.addElement(atPos0);
          active[10]=1;
          ends[10]=1;
          tdone[10]=1;
        }
        else {
          if((bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 1){//sysj\Conveyor\conveyor_plant.sysj line: 167, column: 12
            atPos1.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 169, column: 4
            currsigs.addElement(atPos1);
            active[10]=1;
            ends[10]=1;
            tdone[10]=1;
          }
          else {
            if((bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 2){//sysj\Conveyor\conveyor_plant.sysj line: 171, column: 12
              atPos2.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 173, column: 4
              currsigs.addElement(atPos2);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              if((bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 4){//sysj\Conveyor\conveyor_plant.sysj line: 175, column: 12
                atPos4.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 177, column: 4
                currsigs.addElement(atPos4);
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
                if((bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 5){//sysj\Conveyor\conveyor_plant.sysj line: 179, column: 12
                  atPos5.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 181, column: 4
                  currsigs.addElement(atPos5);
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
            }
          }
        }
        break;
      
    }
  }

  public void thread10407(int [] tdone, int [] ends){
        switch(S3733){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if((bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 2){//sysj\Conveyor\conveyor_plant.sysj line: 152, column: 8
          toControllerBottleAtRotaryStart.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 154, column: 5
          currsigs.addElement(toControllerBottleAtRotaryStart);
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

  public void thread10406(int [] tdone, int [] ends){
        switch(S3725){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S3651){
          case 0 : 
            if(removeBottle.getprestatus()){//sysj\Conveyor\conveyor_plant.sysj line: 139, column: 9
              S3651=1;
              __start_thread_8 = com.systemj.Timer.getMs();//sysj\Conveyor\conveyor_plant.sysj line: 137, column: 4
              if(com.systemj.Timer.getMs() - __start_thread_8 >= (1) * 1000){//sysj\Conveyor\conveyor_plant.sysj line: 137, column: 4
                ends[8]=2;
                ;//sysj\Conveyor\conveyor_plant.sysj line: 137, column: 4
                S3651=2;
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
            else {
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 1 : 
            if(com.systemj.Timer.getMs() - __start_thread_8 >= (1) * 1000){//sysj\Conveyor\conveyor_plant.sysj line: 137, column: 4
              ends[8]=2;
              ;//sysj\Conveyor\conveyor_plant.sysj line: 137, column: 4
              S3651=2;
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
          
          case 2 : 
            if(step.getprestatus()){//sysj\Conveyor\conveyor_plant.sysj line: 141, column: 9
              bottlePos_1.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 142, column: 3
              currsigs.addElement(bottlePos_1);
              bottlePos_1.setValue(0);//sysj\Conveyor\conveyor_plant.sysj line: 142, column: 3
              System.out.println("bottleGone");//sysj\Conveyor\conveyor_plant.sysj line: 143, column: 3
              S3651=3;
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
          
          case 3 : 
            S3651=3;
            S3651=0;
            active[8]=1;
            ends[8]=1;
            tdone[8]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread10404(int [] tdone, int [] ends){
        switch(S3072){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if((bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) != 1){//sysj\Conveyor\conveyor_plant.sysj line: 121, column: 10
          ends[7]=2;
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

  public void thread10403(int [] tdone, int [] ends){
        switch(S3064){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S3028){
          case 0 : 
            if(com.systemj.Timer.getMs() - __start_thread_6 >= (1) * 1000){//sysj\Conveyor\conveyor_plant.sysj line: 108, column: 6
              ends[6]=3;
              ;//sysj\Conveyor\conveyor_plant.sysj line: 108, column: 6
              System.out.println("steppedAtLeft");//sysj\Conveyor\conveyor_plant.sysj line: 111, column: 7
              bottlePos_1.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 112, column: 7
              currsigs.addElement(bottlePos_1);
              bottlePos_1.setValue(2);//sysj\Conveyor\conveyor_plant.sysj line: 112, column: 7
              S3028=1;
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
            S3028=1;
            S3028=0;
            if(controllerMotorOn.getprestatus()){//sysj\Conveyor\conveyor_plant.sysj line: 107, column: 14
              __start_thread_6 = com.systemj.Timer.getMs();//sysj\Conveyor\conveyor_plant.sysj line: 108, column: 6
              if(com.systemj.Timer.getMs() - __start_thread_6 >= (1) * 1000){//sysj\Conveyor\conveyor_plant.sysj line: 108, column: 6
                ends[6]=3;
                ;//sysj\Conveyor\conveyor_plant.sysj line: 108, column: 6
                System.out.println("steppedAtLeft");//sysj\Conveyor\conveyor_plant.sysj line: 111, column: 7
                bottlePos_1.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 112, column: 7
                currsigs.addElement(bottlePos_1);
                bottlePos_1.setValue(2);//sysj\Conveyor\conveyor_plant.sysj line: 112, column: 7
                S3028=1;
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
            else {
              S3028=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread10401(int [] tdone, int [] ends){
        S3072=1;
    if((bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) != 1){//sysj\Conveyor\conveyor_plant.sysj line: 121, column: 10
      ends[7]=2;
      tdone[7]=1;
    }
    else {
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread10400(int [] tdone, int [] ends){
        S3064=1;
    S3028=0;
    if(controllerMotorOn.getprestatus()){//sysj\Conveyor\conveyor_plant.sysj line: 107, column: 14
      __start_thread_6 = com.systemj.Timer.getMs();//sysj\Conveyor\conveyor_plant.sysj line: 108, column: 6
      if(com.systemj.Timer.getMs() - __start_thread_6 >= (1) * 1000){//sysj\Conveyor\conveyor_plant.sysj line: 108, column: 6
        ends[6]=3;
        ;//sysj\Conveyor\conveyor_plant.sysj line: 108, column: 6
        System.out.println("steppedAtLeft");//sysj\Conveyor\conveyor_plant.sysj line: 111, column: 7
        bottlePos_1.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 112, column: 7
        currsigs.addElement(bottlePos_1);
        bottlePos_1.setValue(2);//sysj\Conveyor\conveyor_plant.sysj line: 112, column: 7
        S3028=1;
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
    else {
      S3028=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread10399(int [] tdone, int [] ends){
        switch(S3621){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S3007){
          case 0 : 
            if(placedNewBottle.getprestatus()){//sysj\Conveyor\conveyor_plant.sysj line: 94, column: 9
              S3007=1;
              __start_thread_5 = com.systemj.Timer.getMs();//sysj\Conveyor\conveyor_plant.sysj line: 92, column: 4
              if(com.systemj.Timer.getMs() - __start_thread_5 >= (1) * 1000){//sysj\Conveyor\conveyor_plant.sysj line: 92, column: 4
                ends[5]=2;
                ;//sysj\Conveyor\conveyor_plant.sysj line: 92, column: 4
                System.out.println("NewBottleArrivedRight");//sysj\Conveyor\conveyor_plant.sysj line: 97, column: 3
                bottlePos_1.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 98, column: 3
                currsigs.addElement(bottlePos_1);
                bottlePos_1.setValue(1);//sysj\Conveyor\conveyor_plant.sysj line: 98, column: 3
                System.out.println("bottleAtPos1");//sysj\Conveyor\conveyor_plant.sysj line: 99, column: 3
                S3007=2;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
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
            if(com.systemj.Timer.getMs() - __start_thread_5 >= (1) * 1000){//sysj\Conveyor\conveyor_plant.sysj line: 92, column: 4
              ends[5]=2;
              ;//sysj\Conveyor\conveyor_plant.sysj line: 92, column: 4
              System.out.println("NewBottleArrivedRight");//sysj\Conveyor\conveyor_plant.sysj line: 97, column: 3
              bottlePos_1.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 98, column: 3
              currsigs.addElement(bottlePos_1);
              bottlePos_1.setValue(1);//sysj\Conveyor\conveyor_plant.sysj line: 98, column: 3
              System.out.println("bottleAtPos1");//sysj\Conveyor\conveyor_plant.sysj line: 99, column: 3
              S3007=2;
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
            if(!step.getprestatus()){//sysj\Conveyor\conveyor_plant.sysj line: 100, column: 9
              S3007=3;
              thread10400(tdone,ends);
              thread10401(tdone,ends);
              int biggest10402 = 0;
              if(ends[6]>=biggest10402){
                biggest10402=ends[6];
              }
              if(ends[7]>=biggest10402){
                biggest10402=ends[7];
              }
              if(biggest10402 == 1){
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              if(biggest10402 == 2){
                ends[5]=2;
                ;//sysj\Conveyor\conveyor_plant.sysj line: 102, column: 3
                S3007=4;
                __start_thread_5 = com.systemj.Timer.getMs();//sysj\Conveyor\conveyor_plant.sysj line: 92, column: 4
                if(com.systemj.Timer.getMs() - __start_thread_5 >= (1) * 1000){//sysj\Conveyor\conveyor_plant.sysj line: 92, column: 4
                  ends[5]=2;
                  ;//sysj\Conveyor\conveyor_plant.sysj line: 92, column: 4
                  a_1.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 130, column: 3
                  currsigs.addElement(a_1);
                  S3007=5;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
              }
            }
            else {
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 3 : 
            thread10403(tdone,ends);
            thread10404(tdone,ends);
            int biggest10405 = 0;
            if(ends[6]>=biggest10405){
              biggest10405=ends[6];
            }
            if(ends[7]>=biggest10405){
              biggest10405=ends[7];
            }
            if(biggest10405 == 1){
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            if(biggest10405 == 2){
              ends[5]=2;
              ;//sysj\Conveyor\conveyor_plant.sysj line: 102, column: 3
              S3007=4;
              __start_thread_5 = com.systemj.Timer.getMs();//sysj\Conveyor\conveyor_plant.sysj line: 92, column: 4
              if(com.systemj.Timer.getMs() - __start_thread_5 >= (1) * 1000){//sysj\Conveyor\conveyor_plant.sysj line: 92, column: 4
                ends[5]=2;
                ;//sysj\Conveyor\conveyor_plant.sysj line: 92, column: 4
                a_1.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 130, column: 3
                currsigs.addElement(a_1);
                S3007=5;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
            }
            //FINXME code
            if(biggest10405 == 0){
              S3007=4;
              __start_thread_5 = com.systemj.Timer.getMs();//sysj\Conveyor\conveyor_plant.sysj line: 92, column: 4
              if(com.systemj.Timer.getMs() - __start_thread_5 >= (1) * 1000){//sysj\Conveyor\conveyor_plant.sysj line: 92, column: 4
                ends[5]=2;
                ;//sysj\Conveyor\conveyor_plant.sysj line: 92, column: 4
                a_1.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 130, column: 3
                currsigs.addElement(a_1);
                S3007=5;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
            }
            break;
          
          case 4 : 
            if(com.systemj.Timer.getMs() - __start_thread_5 >= (1) * 1000){//sysj\Conveyor\conveyor_plant.sysj line: 92, column: 4
              ends[5]=2;
              ;//sysj\Conveyor\conveyor_plant.sysj line: 92, column: 4
              a_1.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 130, column: 3
              currsigs.addElement(a_1);
              S3007=5;
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
          
          case 5 : 
            S3007=5;
            S3007=0;
            active[5]=1;
            ends[5]=1;
            tdone[5]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread10397(int [] tdone, int [] ends){
        switch(S1697){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if((bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) != 4){//sysj\Conveyor\conveyor_plant.sysj line: 73, column: 10
          System.out.println("EXIT");//sysj\Conveyor\conveyor_plant.sysj line: 75, column: 7
          ends[4]=2;
          tdone[4]=1;
        }
        else {
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        break;
      
    }
  }

  public void thread10396(int [] tdone, int [] ends){
        switch(S1686){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S1618){
          case 0 : 
            if(com.systemj.Timer.getMs() - __start_thread_3 >= (1) * 1000){//sysj\Conveyor\conveyor_plant.sysj line: 60, column: 6
              ends[3]=3;
              ;//sysj\Conveyor\conveyor_plant.sysj line: 60, column: 6
              System.out.println("steppedAtLeft");//sysj\Conveyor\conveyor_plant.sysj line: 63, column: 7
              bottlePos_1.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 64, column: 7
              currsigs.addElement(bottlePos_1);
              bottlePos_1.setValue(5);//sysj\Conveyor\conveyor_plant.sysj line: 64, column: 7
              S1618=1;
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
            S1618=1;
            System.out.println("waiting");//sysj\Conveyor\conveyor_plant.sysj line: 58, column: 6
            S1618=0;
            if(controllerMotorOn.getprestatus()){//sysj\Conveyor\conveyor_plant.sysj line: 59, column: 14
              __start_thread_3 = com.systemj.Timer.getMs();//sysj\Conveyor\conveyor_plant.sysj line: 60, column: 6
              if(com.systemj.Timer.getMs() - __start_thread_3 >= (1) * 1000){//sysj\Conveyor\conveyor_plant.sysj line: 60, column: 6
                ends[3]=3;
                ;//sysj\Conveyor\conveyor_plant.sysj line: 60, column: 6
                System.out.println("steppedAtLeft");//sysj\Conveyor\conveyor_plant.sysj line: 63, column: 7
                bottlePos_1.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 64, column: 7
                currsigs.addElement(bottlePos_1);
                bottlePos_1.setValue(5);//sysj\Conveyor\conveyor_plant.sysj line: 64, column: 7
                S1618=1;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
            }
            else {
              S1618=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread10394(int [] tdone, int [] ends){
        S1697=1;
    if((bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) != 4){//sysj\Conveyor\conveyor_plant.sysj line: 73, column: 10
      System.out.println("EXIT");//sysj\Conveyor\conveyor_plant.sysj line: 75, column: 7
      ends[4]=2;
      tdone[4]=1;
    }
    else {
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread10393(int [] tdone, int [] ends){
        S1686=1;
    System.out.println("waiting");//sysj\Conveyor\conveyor_plant.sysj line: 58, column: 6
    S1618=0;
    if(controllerMotorOn.getprestatus()){//sysj\Conveyor\conveyor_plant.sysj line: 59, column: 14
      __start_thread_3 = com.systemj.Timer.getMs();//sysj\Conveyor\conveyor_plant.sysj line: 60, column: 6
      if(com.systemj.Timer.getMs() - __start_thread_3 >= (1) * 1000){//sysj\Conveyor\conveyor_plant.sysj line: 60, column: 6
        ends[3]=3;
        ;//sysj\Conveyor\conveyor_plant.sysj line: 60, column: 6
        System.out.println("steppedAtLeft");//sysj\Conveyor\conveyor_plant.sysj line: 63, column: 7
        bottlePos_1.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 64, column: 7
        currsigs.addElement(bottlePos_1);
        bottlePos_1.setValue(5);//sysj\Conveyor\conveyor_plant.sysj line: 64, column: 7
        S1618=1;
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
      }
      else {
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
      }
    }
    else {
      S1618=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread10392(int [] tdone, int [] ends){
        switch(S2977){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S1585){
          case 0 : 
            if(a_1.getprestatus()){//sysj\Conveyor\conveyor_plant.sysj line: 43, column: 9
              S1585=1;
              __start_thread_2 = com.systemj.Timer.getMs();//sysj\Conveyor\conveyor_plant.sysj line: 41, column: 4
              S1558=0;
              if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\Conveyor\conveyor_plant.sysj line: 41, column: 4
                ends[2]=2;
                ;//sysj\Conveyor\conveyor_plant.sysj line: 41, column: 4
                System.out.println("NewBottleArrived");//sysj\Conveyor\conveyor_plant.sysj line: 46, column: 3
                bottlePos_1.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 47, column: 3
                currsigs.addElement(bottlePos_1);
                bottlePos_1.setValue(4);//sysj\Conveyor\conveyor_plant.sysj line: 47, column: 3
                System.out.println("bottleAtPos4");//sysj\Conveyor\conveyor_plant.sysj line: 48, column: 3
                S1585=2;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S1558=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            switch(S1558){
              case 0 : 
                S1558=0;
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\Conveyor\conveyor_plant.sysj line: 41, column: 4
                  ends[2]=2;
                  ;//sysj\Conveyor\conveyor_plant.sysj line: 41, column: 4
                  System.out.println("NewBottleArrived");//sysj\Conveyor\conveyor_plant.sysj line: 46, column: 3
                  bottlePos_1.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 47, column: 3
                  currsigs.addElement(bottlePos_1);
                  bottlePos_1.setValue(4);//sysj\Conveyor\conveyor_plant.sysj line: 47, column: 3
                  System.out.println("bottleAtPos4");//sysj\Conveyor\conveyor_plant.sysj line: 48, column: 3
                  S1585=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S1558=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 1 : 
                S1558=1;
                S1558=0;
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\Conveyor\conveyor_plant.sysj line: 41, column: 4
                  ends[2]=2;
                  ;//sysj\Conveyor\conveyor_plant.sysj line: 41, column: 4
                  System.out.println("NewBottleArrived");//sysj\Conveyor\conveyor_plant.sysj line: 46, column: 3
                  bottlePos_1.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 47, column: 3
                  currsigs.addElement(bottlePos_1);
                  bottlePos_1.setValue(4);//sysj\Conveyor\conveyor_plant.sysj line: 47, column: 3
                  System.out.println("bottleAtPos4");//sysj\Conveyor\conveyor_plant.sysj line: 48, column: 3
                  S1585=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S1558=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
            }
            break;
          
          case 2 : 
            S1585=2;
            S1585=3;
            thread10393(tdone,ends);
            thread10394(tdone,ends);
            int biggest10395 = 0;
            if(ends[3]>=biggest10395){
              biggest10395=ends[3];
            }
            if(ends[4]>=biggest10395){
              biggest10395=ends[4];
            }
            if(biggest10395 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            if(biggest10395 == 2){
              ends[2]=2;
              ;//sysj\Conveyor\conveyor_plant.sysj line: 52, column: 3
              S1585=4;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 3 : 
            thread10396(tdone,ends);
            thread10397(tdone,ends);
            int biggest10398 = 0;
            if(ends[3]>=biggest10398){
              biggest10398=ends[3];
            }
            if(ends[4]>=biggest10398){
              biggest10398=ends[4];
            }
            if(biggest10398 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            if(biggest10398 == 2){
              ends[2]=2;
              ;//sysj\Conveyor\conveyor_plant.sysj line: 52, column: 3
              S1585=4;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            //FINXME code
            if(biggest10398 == 0){
              S1585=4;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 4 : 
            S1585=4;
            S1585=5;
            __start_thread_2 = com.systemj.Timer.getMs();//sysj\Conveyor\conveyor_plant.sysj line: 41, column: 4
            if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\Conveyor\conveyor_plant.sysj line: 41, column: 4
              ends[2]=2;
              ;//sysj\Conveyor\conveyor_plant.sysj line: 41, column: 4
              bottlePos_1.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 85, column: 3
              currsigs.addElement(bottlePos_1);
              bottlePos_1.setValue(0);//sysj\Conveyor\conveyor_plant.sysj line: 85, column: 3
              S1585=0;
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
          
          case 5 : 
            if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\Conveyor\conveyor_plant.sysj line: 41, column: 4
              ends[2]=2;
              ;//sysj\Conveyor\conveyor_plant.sysj line: 41, column: 4
              bottlePos_1.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 85, column: 3
              currsigs.addElement(bottlePos_1);
              bottlePos_1.setValue(0);//sysj\Conveyor\conveyor_plant.sysj line: 85, column: 3
              S1585=0;
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
          
        }
        break;
      
    }
  }

  public void thread10390(int [] tdone, int [] ends){
        S3761=1;
    if(controllerMotorOn.getprestatus()){//sysj\Conveyor\conveyor_plant.sysj line: 192, column: 12
      conveyorRunning.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 194, column: 4
      currsigs.addElement(conveyorRunning);
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
    else {
      conveyorNotRunning.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 199, column: 4
      currsigs.addElement(conveyorNotRunning);
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread10389(int [] tdone, int [] ends){
        S3753=1;
    if((bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 0){//sysj\Conveyor\conveyor_plant.sysj line: 163, column: 7
      atPos0.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 165, column: 4
      currsigs.addElement(atPos0);
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      if((bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 1){//sysj\Conveyor\conveyor_plant.sysj line: 167, column: 12
        atPos1.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 169, column: 4
        currsigs.addElement(atPos1);
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
      }
      else {
        if((bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 2){//sysj\Conveyor\conveyor_plant.sysj line: 171, column: 12
          atPos2.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 173, column: 4
          currsigs.addElement(atPos2);
          active[10]=1;
          ends[10]=1;
          tdone[10]=1;
        }
        else {
          if((bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 4){//sysj\Conveyor\conveyor_plant.sysj line: 175, column: 12
            atPos4.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 177, column: 4
            currsigs.addElement(atPos4);
            active[10]=1;
            ends[10]=1;
            tdone[10]=1;
          }
          else {
            if((bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 5){//sysj\Conveyor\conveyor_plant.sysj line: 179, column: 12
              atPos5.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 181, column: 4
              currsigs.addElement(atPos5);
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
        }
      }
    }
  }

  public void thread10388(int [] tdone, int [] ends){
        S3733=1;
    if((bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 2){//sysj\Conveyor\conveyor_plant.sysj line: 152, column: 8
      toControllerBottleAtRotaryStart.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 154, column: 5
      currsigs.addElement(toControllerBottleAtRotaryStart);
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

  public void thread10387(int [] tdone, int [] ends){
        S3725=1;
    S3651=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread10386(int [] tdone, int [] ends){
        S3621=1;
    S3007=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread10385(int [] tdone, int [] ends){
        S2977=1;
    S1585=0;
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
      switch(S10383){
        case 0 : 
          S10383=0;
          break RUN;
        
        case 1 : 
          S10383=2;
          S10383=2;
          new Thread(new GUI()).start();//sysj\Conveyor\conveyor_plant.sysj line: 31, column: 2
          new Thread(new socketListener()).start();//sysj\Conveyor\conveyor_plant.sysj line: 32, column: 2
          bottlePos_1.setClear();//sysj\Conveyor\conveyor_plant.sysj line: 33, column: 2
          a_1.setClear();//sysj\Conveyor\conveyor_plant.sysj line: 34, column: 2
          bottlePos_1.setPresent();//sysj\Conveyor\conveyor_plant.sysj line: 35, column: 2
          currsigs.addElement(bottlePos_1);
          bottlePos_1.setValue(0);//sysj\Conveyor\conveyor_plant.sysj line: 35, column: 2
          System.out.println("started the plant");//sysj\Conveyor\conveyor_plant.sysj line: 37, column: 2
          thread10385(tdone,ends);
          thread10386(tdone,ends);
          thread10387(tdone,ends);
          thread10388(tdone,ends);
          thread10389(tdone,ends);
          thread10390(tdone,ends);
          int biggest10391 = 0;
          if(ends[2]>=biggest10391){
            biggest10391=ends[2];
          }
          if(ends[5]>=biggest10391){
            biggest10391=ends[5];
          }
          if(ends[8]>=biggest10391){
            biggest10391=ends[8];
          }
          if(ends[9]>=biggest10391){
            biggest10391=ends[9];
          }
          if(ends[10]>=biggest10391){
            biggest10391=ends[10];
          }
          if(ends[11]>=biggest10391){
            biggest10391=ends[11];
          }
          if(biggest10391 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          bottlePos_1.setClear();//sysj\Conveyor\conveyor_plant.sysj line: 33, column: 2
          a_1.setClear();//sysj\Conveyor\conveyor_plant.sysj line: 34, column: 2
          thread10392(tdone,ends);
          thread10399(tdone,ends);
          thread10406(tdone,ends);
          thread10407(tdone,ends);
          thread10408(tdone,ends);
          thread10409(tdone,ends);
          int biggest10410 = 0;
          if(ends[2]>=biggest10410){
            biggest10410=ends[2];
          }
          if(ends[5]>=biggest10410){
            biggest10410=ends[5];
          }
          if(ends[8]>=biggest10410){
            biggest10410=ends[8];
          }
          if(ends[9]>=biggest10410){
            biggest10410=ends[9];
          }
          if(ends[10]>=biggest10410){
            biggest10410=ends[10];
          }
          if(ends[11]>=biggest10410){
            biggest10410=ends[11];
          }
          if(biggest10410 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest10410 == 0){
            S10383=0;
            active[1]=0;
            ends[1]=0;
            S10383=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    bottlePos_1 = new Signal();
    a_1 = new Signal();
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
      atPos0.setpreclear();
      atPos1.setpreclear();
      atPos2.setpreclear();
      atPos4.setpreclear();
      atPos5.setpreclear();
      conveyorRunning.setpreclear();
      conveyorNotRunning.setpreclear();
      bottlePos_1.setpreclear();
      a_1.setpreclear();
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
      a_1.setClear();
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
