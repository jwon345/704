import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class ConveyorController extends ClockDomain{
  public ConveyorController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal toControllerBottleAtRotaryStart = new Signal("toControllerBottleAtRotaryStart", Signal.INPUT);
  public Signal controllerMotorOn = new Signal("controllerMotorOn", Signal.OUTPUT);
  private int S1541 = 1;
  private int S1504 = 1;
  private int S1499 = 1;
  private int S1502 = 1;
  
  private int[] ends = new int[4];
  private int[] tdone = new int[4];
  
  public void thread1550(int [] tdone, int [] ends){
        S1502=1;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread1549(int [] tdone, int [] ends){
        S1499=1;
    System.out.println("Conveyor is on");//sysj\Conveyor\conveyor_controller.sysj line: 12, column: 9
    controllerMotorOn.setPresent();//sysj\Conveyor\conveyor_controller.sysj line: 13, column: 9
    currsigs.addElement(controllerMotorOn);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread1547(int [] tdone, int [] ends){
        switch(S1502){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        if(toControllerBottleAtRotaryStart.getprestatus()){//sysj\Conveyor\conveyor_controller.sysj line: 17, column: 15
          ends[3]=2;
          tdone[3]=1;
        }
        else {
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread1546(int [] tdone, int [] ends){
        switch(S1499){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        controllerMotorOn.setPresent();//sysj\Conveyor\conveyor_controller.sysj line: 13, column: 9
        currsigs.addElement(controllerMotorOn);
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
        break;
      
    }
  }

  public void thread1544(int [] tdone, int [] ends){
        S1502=1;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread1543(int [] tdone, int [] ends){
        S1499=1;
    System.out.println("Conveyor is on");//sysj\Conveyor\conveyor_controller.sysj line: 12, column: 9
    controllerMotorOn.setPresent();//sysj\Conveyor\conveyor_controller.sysj line: 13, column: 9
    currsigs.addElement(controllerMotorOn);
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
      switch(S1541){
        case 0 : 
          S1541=0;
          break RUN;
        
        case 1 : 
          S1541=2;
          S1541=2;
          S1504=0;
          thread1543(tdone,ends);
          thread1544(tdone,ends);
          int biggest1545 = 0;
          if(ends[2]>=biggest1545){
            biggest1545=ends[2];
          }
          if(ends[3]>=biggest1545){
            biggest1545=ends[3];
          }
          if(biggest1545 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          switch(S1504){
            case 0 : 
              thread1546(tdone,ends);
              thread1547(tdone,ends);
              int biggest1548 = 0;
              if(ends[2]>=biggest1548){
                biggest1548=ends[2];
              }
              if(ends[3]>=biggest1548){
                biggest1548=ends[3];
              }
              if(biggest1548 == 1){
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              if(biggest1548 == 2){
                ends[1]=2;
                ;//sysj\Conveyor\conveyor_controller.sysj line: 10, column: 5
                System.out.println("off and Waiting bottle to leave rotatory mouth");//sysj\Conveyor\conveyor_controller.sysj line: 21, column: 5
                S1504=1;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              //FINXME code
              if(biggest1548 == 0){
                System.out.println("off and Waiting bottle to leave rotatory mouth");//sysj\Conveyor\conveyor_controller.sysj line: 21, column: 5
                S1504=1;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 1 : 
              if(!toControllerBottleAtRotaryStart.getprestatus()){//sysj\Conveyor\conveyor_controller.sysj line: 22, column: 11
                S1504=2;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 2 : 
              S1504=2;
              S1504=0;
              thread1549(tdone,ends);
              thread1550(tdone,ends);
              int biggest1551 = 0;
              if(ends[2]>=biggest1551){
                biggest1551=ends[2];
              }
              if(ends[3]>=biggest1551){
                biggest1551=ends[3];
              }
              if(biggest1551 == 1){
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0};
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
          toControllerBottleAtRotaryStart.gethook();
          df = true;
        }
        runClockDomain();
      }
      toControllerBottleAtRotaryStart.setpreclear();
      controllerMotorOn.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = toControllerBottleAtRotaryStart.getStatus() ? toControllerBottleAtRotaryStart.setprepresent() : toControllerBottleAtRotaryStart.setpreclear();
      toControllerBottleAtRotaryStart.setpreval(toControllerBottleAtRotaryStart.getValue());
      toControllerBottleAtRotaryStart.setClear();
      controllerMotorOn.sethook();
      controllerMotorOn.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        toControllerBottleAtRotaryStart.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
