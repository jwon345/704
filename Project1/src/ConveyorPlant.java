import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.GUI;//sysj\conveyor.sysj line: 1, column: 1
import run.socketListener;//sysj\conveyor.sysj line: 2, column: 1

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
  private int S9984 = 1;
  private int S9939 = 1;
  private int S9933 = 1;
  private int S9957 = 1;
  private int S9947 = 1;
  private int S9955 = 1;
  
  private int[] ends = new int[31];
  private int[] tdone = new int[31];
  
  public void thread10074(int [] tdone, int [] ends){
        switch(S9955){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        if(bottleLeftPos5.getprestatus()){//sysj\conveyor.sysj line: 188, column: 32
          bottleLeftPos5E.setPresent();//sysj\conveyor.sysj line: 188, column: 48
          currsigs.addElement(bottleLeftPos5E);
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

  public void thread10073(int [] tdone, int [] ends){
        switch(S9947){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        if(motConveyorOnOff.getprestatus()){//sysj\conveyor.sysj line: 186, column: 32
          motConveyorOnOffE.setPresent();//sysj\conveyor.sysj line: 186, column: 50
          currsigs.addElement(motConveyorOnOffE);
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

  public void thread10072(int [] tdone, int [] ends){
        switch(S9957){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        thread10073(tdone,ends);
        thread10074(tdone,ends);
        int biggest10075 = 0;
        if(ends[29]>=biggest10075){
          biggest10075=ends[29];
        }
        if(ends[30]>=biggest10075){
          biggest10075=ends[30];
        }
        if(biggest10075 == 1){
          active[28]=1;
          ends[28]=1;
          tdone[28]=1;
        }
        //FINXME code
        if(biggest10075 == 0){
          S9957=0;
          active[28]=0;
          ends[28]=0;
          tdone[28]=1;
        }
        break;
      
    }
  }

  public void thread10071(int [] tdone, int [] ends){
        switch(S9939){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        switch(S9933){
          case 0 : 
            if(motConveyorOnOff.getprestatus()){//sysj\conveyor.sysj line: 173, column: 17
              bottleAtPos1.setPresent();//sysj\conveyor.sysj line: 175, column: 11
              currsigs.addElement(bottleAtPos1);
              S9933=1;
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
          
          case 1 : 
            S9933=1;
            S9933=0;
            active[27]=1;
            ends[27]=1;
            tdone[27]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread10068(int [] tdone, int [] ends){
        S9955=1;
    if(bottleLeftPos5.getprestatus()){//sysj\conveyor.sysj line: 188, column: 32
      bottleLeftPos5E.setPresent();//sysj\conveyor.sysj line: 188, column: 48
      currsigs.addElement(bottleLeftPos5E);
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

  public void thread10067(int [] tdone, int [] ends){
        S9947=1;
    if(motConveyorOnOff.getprestatus()){//sysj\conveyor.sysj line: 186, column: 32
      motConveyorOnOffE.setPresent();//sysj\conveyor.sysj line: 186, column: 50
      currsigs.addElement(motConveyorOnOffE);
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

  public void thread10066(int [] tdone, int [] ends){
        S9957=1;
    thread10067(tdone,ends);
    thread10068(tdone,ends);
    int biggest10069 = 0;
    if(ends[29]>=biggest10069){
      biggest10069=ends[29];
    }
    if(ends[30]>=biggest10069){
      biggest10069=ends[30];
    }
    if(biggest10069 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread10065(int [] tdone, int [] ends){
        S9939=1;
    S9933=0;
    active[27]=1;
    ends[27]=1;
    tdone[27]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S9984){
        case 0 : 
          S9984=0;
          break RUN;
        
        case 1 : 
          S9984=2;
          S9984=2;
          new Thread(new GUI()).start();//sysj\conveyor.sysj line: 168, column: 3
          new Thread(new socketListener()).start();//sysj\conveyor.sysj line: 169, column: 3
          thread10065(tdone,ends);
          thread10066(tdone,ends);
          int biggest10070 = 0;
          if(ends[27]>=biggest10070){
            biggest10070=ends[27];
          }
          if(ends[28]>=biggest10070){
            biggest10070=ends[28];
          }
          if(biggest10070 == 1){
            active[26]=1;
            ends[26]=1;
            break RUN;
          }
        
        case 2 : 
          thread10071(tdone,ends);
          thread10072(tdone,ends);
          int biggest10076 = 0;
          if(ends[27]>=biggest10076){
            biggest10076=ends[27];
          }
          if(ends[28]>=biggest10076){
            biggest10076=ends[28];
          }
          if(biggest10076 == 1){
            active[26]=1;
            ends[26]=1;
            break RUN;
          }
          //FINXME code
          if(biggest10076 == 0){
            S9984=0;
            active[26]=0;
            ends[26]=0;
            S9984=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[26] != 0){
      int index = 26;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[26]!=0 || suspended[26]!=0 || active[26]!=1);
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
      if(paused[26]!=0 || suspended[26]!=0 || active[26]!=1);
      else{
        motConveyorOnOff.gethook();
      }
      runFinisher();
      if(active[26] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
