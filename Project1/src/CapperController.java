import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class CapperController extends ClockDomain{
  public CapperController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal bottleAtPos4 = new Signal("bottleAtPos4", Signal.INPUT);
  public Signal gripperZAxisLowered = new Signal("gripperZAxisLowered", Signal.INPUT);
  public Signal gripperZAxisLifted = new Signal("gripperZAxisLifted", Signal.INPUT);
  public Signal gripperTurnHomePos = new Signal("gripperTurnHomePos", Signal.INPUT);
  public Signal gripperTurnFinalPos = new Signal("gripperTurnFinalPos", Signal.INPUT);
  public Signal cylPos5ZaxisExtend = new Signal("cylPos5ZaxisExtend", Signal.OUTPUT);
  public Signal gripperTurnRetract = new Signal("gripperTurnRetract", Signal.OUTPUT);
  public Signal gripperTurnExtend = new Signal("gripperTurnExtend", Signal.OUTPUT);
  public Signal capGripperPos5Extend = new Signal("capGripperPos5Extend", Signal.OUTPUT);
  public Signal cylClampBottleExtend = new Signal("cylClampBottleExtend", Signal.OUTPUT);
  private int S262 = 1;
  private int S3 = 1;
  private int S16 = 1;
  private int S45 = 1;
  private int S44 = 1;
  private int S22 = 1;
  private int S27 = 1;
  private int S30 = 1;
  
  private int[] ends = new int[7];
  private int[] tdone = new int[7];
  
  public void thread275(int [] tdone, int [] ends){
        switch(S30){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\capper_controller.sysj line: 28, column: 15
          ends[6]=2;
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

  public void thread274(int [] tdone, int [] ends){
        switch(S27){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        gripperTurnExtend.setPresent();//sysj\capper_controller.sysj line: 25, column: 9
        currsigs.addElement(gripperTurnExtend);
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
        break;
      
    }
  }

  public void thread273(int [] tdone, int [] ends){
        switch(S22){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        capGripperPos5Extend.setPresent();//sysj\capper_controller.sysj line: 23, column: 9
        currsigs.addElement(capGripperPos5Extend);
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
        break;
      
    }
  }

  public void thread271(int [] tdone, int [] ends){
        S30=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread270(int [] tdone, int [] ends){
        S27=1;
    gripperTurnExtend.setPresent();//sysj\capper_controller.sysj line: 25, column: 9
    currsigs.addElement(gripperTurnExtend);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread269(int [] tdone, int [] ends){
        S22=1;
    capGripperPos5Extend.setPresent();//sysj\capper_controller.sysj line: 23, column: 9
    currsigs.addElement(capGripperPos5Extend);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread268(int [] tdone, int [] ends){
        switch(S45){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S44){
          case 0 : 
            if(gripperZAxisLowered.getprestatus()){//sysj\capper_controller.sysj line: 22, column: 14
              S44=1;
              thread269(tdone,ends);
              thread270(tdone,ends);
              thread271(tdone,ends);
              int biggest272 = 0;
              if(ends[4]>=biggest272){
                biggest272=ends[4];
              }
              if(ends[5]>=biggest272){
                biggest272=ends[5];
              }
              if(ends[6]>=biggest272){
                biggest272=ends[6];
              }
              if(biggest272 == 1){
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
            }
            else {
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            thread273(tdone,ends);
            thread274(tdone,ends);
            thread275(tdone,ends);
            int biggest276 = 0;
            if(ends[4]>=biggest276){
              biggest276=ends[4];
            }
            if(ends[5]>=biggest276){
              biggest276=ends[5];
            }
            if(ends[6]>=biggest276){
              biggest276=ends[6];
            }
            if(biggest276 == 1){
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            if(biggest276 == 2){
              ends[3]=2;
              tdone[3]=1;
            }
            //FINXME code
            if(biggest276 == 0){
              S45=0;
              active[3]=0;
              ends[3]=0;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread267(int [] tdone, int [] ends){
        switch(S16){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        cylPos5ZaxisExtend.setPresent();//sysj\capper_controller.sysj line: 19, column: 8
        currsigs.addElement(cylPos5ZaxisExtend);
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
        break;
      
    }
  }

  public void thread265(int [] tdone, int [] ends){
        S45=1;
    S44=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread264(int [] tdone, int [] ends){
        S16=1;
    cylPos5ZaxisExtend.setPresent();//sysj\capper_controller.sysj line: 19, column: 8
    currsigs.addElement(cylPos5ZaxisExtend);
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
      switch(S262){
        case 0 : 
          S262=0;
          break RUN;
        
        case 1 : 
          S262=2;
          S262=2;
          S3=0;
          active[1]=1;
          ends[1]=1;
          break RUN;
        
        case 2 : 
          switch(S3){
            case 0 : 
              if(bottleAtPos4.getprestatus()){//sysj\capper_controller.sysj line: 14, column: 12
                S3=1;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 1 : 
              if(gripperZAxisLifted.getprestatus()){//sysj\capper_controller.sysj line: 16, column: 12
                S3=2;
                gripperTurnRetract.setPresent();//sysj\capper_controller.sysj line: 17, column: 32
                currsigs.addElement(gripperTurnRetract);
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
              if(gripperTurnHomePos.getprestatus()){//sysj\capper_controller.sysj line: 17, column: 12
                S3=3;
                thread264(tdone,ends);
                thread265(tdone,ends);
                int biggest266 = 0;
                if(ends[2]>=biggest266){
                  biggest266=ends[2];
                }
                if(ends[3]>=biggest266){
                  biggest266=ends[3];
                }
                if(biggest266 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
              else {
                gripperTurnRetract.setPresent();//sysj\capper_controller.sysj line: 17, column: 32
                currsigs.addElement(gripperTurnRetract);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 3 : 
              thread267(tdone,ends);
              thread268(tdone,ends);
              int biggest277 = 0;
              if(ends[2]>=biggest277){
                biggest277=ends[2];
              }
              if(ends[3]>=biggest277){
                biggest277=ends[3];
              }
              if(biggest277 == 1){
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              if(biggest277 == 2){
                ends[1]=2;
                ;//sysj\capper_controller.sysj line: 18, column: 6
                S3=4;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              //FINXME code
              if(biggest277 == 0){
                S3=4;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 4 : 
              if(gripperZAxisLifted.getprestatus()){//sysj\capper_controller.sysj line: 33, column: 12
                S3=5;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 5 : 
              if(!bottleAtPos4.getprestatus()){//sysj\capper_controller.sysj line: 34, column: 12
                S3=0;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0};
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
          bottleAtPos4.gethook();
          gripperZAxisLowered.gethook();
          gripperZAxisLifted.gethook();
          gripperTurnHomePos.gethook();
          gripperTurnFinalPos.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottleAtPos4.setpreclear();
      gripperZAxisLowered.setpreclear();
      gripperZAxisLifted.setpreclear();
      gripperTurnHomePos.setpreclear();
      gripperTurnFinalPos.setpreclear();
      cylPos5ZaxisExtend.setpreclear();
      gripperTurnRetract.setpreclear();
      gripperTurnExtend.setpreclear();
      capGripperPos5Extend.setpreclear();
      cylClampBottleExtend.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = bottleAtPos4.getStatus() ? bottleAtPos4.setprepresent() : bottleAtPos4.setpreclear();
      bottleAtPos4.setpreval(bottleAtPos4.getValue());
      bottleAtPos4.setClear();
      dummyint = gripperZAxisLowered.getStatus() ? gripperZAxisLowered.setprepresent() : gripperZAxisLowered.setpreclear();
      gripperZAxisLowered.setpreval(gripperZAxisLowered.getValue());
      gripperZAxisLowered.setClear();
      dummyint = gripperZAxisLifted.getStatus() ? gripperZAxisLifted.setprepresent() : gripperZAxisLifted.setpreclear();
      gripperZAxisLifted.setpreval(gripperZAxisLifted.getValue());
      gripperZAxisLifted.setClear();
      dummyint = gripperTurnHomePos.getStatus() ? gripperTurnHomePos.setprepresent() : gripperTurnHomePos.setpreclear();
      gripperTurnHomePos.setpreval(gripperTurnHomePos.getValue());
      gripperTurnHomePos.setClear();
      dummyint = gripperTurnFinalPos.getStatus() ? gripperTurnFinalPos.setprepresent() : gripperTurnFinalPos.setpreclear();
      gripperTurnFinalPos.setpreval(gripperTurnFinalPos.getValue());
      gripperTurnFinalPos.setClear();
      cylPos5ZaxisExtend.sethook();
      cylPos5ZaxisExtend.setClear();
      gripperTurnRetract.sethook();
      gripperTurnRetract.setClear();
      gripperTurnExtend.sethook();
      gripperTurnExtend.setClear();
      capGripperPos5Extend.sethook();
      capGripperPos5Extend.setClear();
      cylClampBottleExtend.sethook();
      cylClampBottleExtend.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        bottleAtPos4.gethook();
        gripperZAxisLowered.gethook();
        gripperZAxisLifted.gethook();
        gripperTurnHomePos.gethook();
        gripperTurnFinalPos.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
