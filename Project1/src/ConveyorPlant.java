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
  private int S202116 = 1;
  private int S202071 = 1;
  private int S202065 = 1;
  private int S202089 = 1;
  private int S202079 = 1;
  private int S202073 = 1;
  private int S202087 = 1;
  
  private int[] ends = new int[52];
  private int[] tdone = new int[52];
  
  public void thread203444(int [] tdone, int [] ends){
        switch(S202087){
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

  public void thread203443(int [] tdone, int [] ends){
        switch(S202079){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S202073){
          case 0 : 
            S202073=0;
            if(motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 29, column: 31
              motConveyorOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 29, column: 49
              currsigs.addElement(motConveyorOnOffE);
              S202073=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S202073=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            S202073=1;
            S202073=0;
            if(motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 29, column: 31
              motConveyorOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 29, column: 49
              currsigs.addElement(motConveyorOnOffE);
              S202073=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S202073=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread203442(int [] tdone, int [] ends){
        switch(S202089){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread203443(tdone,ends);
        thread203444(tdone,ends);
        int biggest203445 = 0;
        if(ends[4]>=biggest203445){
          biggest203445=ends[4];
        }
        if(ends[5]>=biggest203445){
          biggest203445=ends[5];
        }
        if(biggest203445 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest203445 == 0){
          S202089=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread203441(int [] tdone, int [] ends){
        switch(S202071){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S202065){
          case 0 : 
            if(motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 16, column: 16
              bottleAtPos1.setPresent();//sysj\conveyor_plant.sysj line: 18, column: 10
              currsigs.addElement(bottleAtPos1);
              S202065=1;
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
            S202065=1;
            S202065=0;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread203438(int [] tdone, int [] ends){
        S202087=1;
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

  public void thread203437(int [] tdone, int [] ends){
        S202079=1;
    S202073=0;
    if(motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 29, column: 31
      motConveyorOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 29, column: 49
      currsigs.addElement(motConveyorOnOffE);
      S202073=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S202073=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread203436(int [] tdone, int [] ends){
        S202089=1;
    thread203437(tdone,ends);
    thread203438(tdone,ends);
    int biggest203439 = 0;
    if(ends[4]>=biggest203439){
      biggest203439=ends[4];
    }
    if(ends[5]>=biggest203439){
      biggest203439=ends[5];
    }
    if(biggest203439 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread203435(int [] tdone, int [] ends){
        S202071=1;
    S202065=0;
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
      switch(S202116){
        case 0 : 
          S202116=0;
          break RUN;
        
        case 1 : 
          S202116=2;
          S202116=2;
          new Thread(new GUI()).start();//sysj\conveyor_plant.sysj line: 11, column: 2
          new Thread(new socketListener()).start();//sysj\conveyor_plant.sysj line: 12, column: 2
          thread203435(tdone,ends);
          thread203436(tdone,ends);
          int biggest203440 = 0;
          if(ends[2]>=biggest203440){
            biggest203440=ends[2];
          }
          if(ends[3]>=biggest203440){
            biggest203440=ends[3];
          }
          if(biggest203440 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread203441(tdone,ends);
          thread203442(tdone,ends);
          int biggest203446 = 0;
          if(ends[2]>=biggest203446){
            biggest203446=ends[2];
          }
          if(ends[3]>=biggest203446){
            biggest203446=ends[3];
          }
          if(biggest203446 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest203446 == 0){
            S202116=0;
            active[1]=0;
            ends[1]=0;
            S202116=0;
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
