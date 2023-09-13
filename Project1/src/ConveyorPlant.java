import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.GUI;//sysj\conveyor_plant.sysj line: 1, column: 1
import run.socketListener;//sysj\conveyor_plant.sysj line: 2, column: 1

public class ConveyorPlant extends ClockDomain{
  public ConveyorPlant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal motConveyorOnOff = new Signal("motConveyorOnOff", Signal.INPUT);
  public Signal bottleAtPos1 = new Signal("bottleAtPos1", Signal.OUTPUT);
  public Signal bottleLeftPos5 = new Signal("bottleLeftPos5", Signal.OUTPUT);
  public Signal motConveyorOnOffE = new Signal("motConveyorOnOffE", Signal.OUTPUT);
  public Signal bottleLeftPos5E = new Signal("bottleLeftPos5E", Signal.OUTPUT);
  private int S192433 = 1;
  private int S192388 = 1;
  private int S192382 = 1;
  private int S192406 = 1;
  private int S192396 = 1;
  private int S192390 = 1;
  private int S192404 = 1;
  
  private int[] ends = new int[52];
  private int[] tdone = new int[52];
  
  public void thread193761(int [] tdone, int [] ends){
        switch(S192404){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(bottleLeftPos5.getprestatus()){//sysj\conveyor_plant.sysj line: 31, column: 31
          bottleLeftPos5E.setPresent();//sysj\conveyor_plant.sysj line: 31, column: 47
          currsigs.addElement(bottleLeftPos5E);
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
      
    }
  }

  public void thread193760(int [] tdone, int [] ends){
        switch(S192396){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S192390){
          case 0 : 
            S192390=0;
            if(motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 29, column: 31
              motConveyorOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 29, column: 49
              currsigs.addElement(motConveyorOnOffE);
              S192390=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S192390=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            S192390=1;
            S192390=0;
            if(motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 29, column: 31
              motConveyorOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 29, column: 49
              currsigs.addElement(motConveyorOnOffE);
              S192390=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S192390=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread193759(int [] tdone, int [] ends){
        switch(S192406){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread193760(tdone,ends);
        thread193761(tdone,ends);
        int biggest193762 = 0;
        if(ends[4]>=biggest193762){
          biggest193762=ends[4];
        }
        if(ends[5]>=biggest193762){
          biggest193762=ends[5];
        }
        if(biggest193762 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest193762 == 0){
          S192406=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread193758(int [] tdone, int [] ends){
        switch(S192388){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S192382){
          case 0 : 
            if(motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 16, column: 16
              bottleAtPos1.setPresent();//sysj\conveyor_plant.sysj line: 18, column: 10
              currsigs.addElement(bottleAtPos1);
              S192382=1;
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
            S192382=1;
            S192382=0;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread193755(int [] tdone, int [] ends){
        S192404=1;
    if(bottleLeftPos5.getprestatus()){//sysj\conveyor_plant.sysj line: 31, column: 31
      bottleLeftPos5E.setPresent();//sysj\conveyor_plant.sysj line: 31, column: 47
      currsigs.addElement(bottleLeftPos5E);
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

  public void thread193754(int [] tdone, int [] ends){
        S192396=1;
    S192390=0;
    if(motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 29, column: 31
      motConveyorOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 29, column: 49
      currsigs.addElement(motConveyorOnOffE);
      S192390=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S192390=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread193753(int [] tdone, int [] ends){
        S192406=1;
    thread193754(tdone,ends);
    thread193755(tdone,ends);
    int biggest193756 = 0;
    if(ends[4]>=biggest193756){
      biggest193756=ends[4];
    }
    if(ends[5]>=biggest193756){
      biggest193756=ends[5];
    }
    if(biggest193756 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread193752(int [] tdone, int [] ends){
        S192388=1;
    S192382=0;
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
      switch(S192433){
        case 0 : 
          S192433=0;
          break RUN;
        
        case 1 : 
          S192433=2;
          S192433=2;
          new Thread(new GUI()).start();//sysj\conveyor_plant.sysj line: 11, column: 2
          new Thread(new socketListener()).start();//sysj\conveyor_plant.sysj line: 12, column: 2
          thread193752(tdone,ends);
          thread193753(tdone,ends);
          int biggest193757 = 0;
          if(ends[2]>=biggest193757){
            biggest193757=ends[2];
          }
          if(ends[3]>=biggest193757){
            biggest193757=ends[3];
          }
          if(biggest193757 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread193758(tdone,ends);
          thread193759(tdone,ends);
          int biggest193763 = 0;
          if(ends[2]>=biggest193763){
            biggest193763=ends[2];
          }
          if(ends[3]>=biggest193763){
            biggest193763=ends[3];
          }
          if(biggest193763 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest193763 == 0){
            S192433=0;
            active[1]=0;
            ends[1]=0;
            S192433=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
          motConveyorOnOff.gethook();
          df = true;
        }
        runClockDomain();
      }
      motConveyorOnOff.setpreclear();
      bottleAtPos1.setpreclear();
      bottleLeftPos5.setpreclear();
      motConveyorOnOffE.setpreclear();
      bottleLeftPos5E.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = motConveyorOnOff.getStatus() ? motConveyorOnOff.setprepresent() : motConveyorOnOff.setpreclear();
      motConveyorOnOff.setpreval(motConveyorOnOff.getValue());
      motConveyorOnOff.setClear();
      bottleAtPos1.sethook();
      bottleAtPos1.setClear();
      bottleLeftPos5.sethook();
      bottleLeftPos5.setClear();
      motConveyorOnOffE.sethook();
      motConveyorOnOffE.setClear();
      bottleLeftPos5E.sethook();
      bottleLeftPos5E.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        motConveyorOnOff.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
