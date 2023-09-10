import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.GUI;//sysj\conveyor_plant.sysj line: 1, column: 1

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
  public Signal bottleAtPos1E = new Signal("bottleAtPos1E", Signal.OUTPUT);
  public Signal bottleLeftPos5E = new Signal("bottleLeftPos5E", Signal.OUTPUT);
  private long __start_thread_7;//sysj\conveyor_plant.sysj line: 38, column: 26
  private int S36105 = 1;
  private int S35911 = 1;
  private int S35905 = 1;
  private int S36003 = 1;
  private int S35919 = 1;
  private int S35913 = 1;
  private int S35993 = 1;
  private int S35943 = 1;
  private int S35924 = 1;
  private int S35940 = 1;
  private int S36001 = 1;
  
  private int[] ends = new int[36];
  private int[] tdone = new int[36];
  
  public void thread36886(int [] tdone, int [] ends){
        switch(S36001){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(bottleLeftPos5.getprestatus()){//sysj\conveyor_plant.sysj line: 48, column: 31
          bottleLeftPos5E.setPresent();//sysj\conveyor_plant.sysj line: 48, column: 47
          currsigs.addElement(bottleLeftPos5E);
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
      
    }
  }

  public void thread36884(int [] tdone, int [] ends){
        S35940=1;
    __start_thread_7 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 38, column: 26
    if(com.systemj.Timer.getMs() - __start_thread_7 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 38, column: 26
      ends[7]=3;
      ;//sysj\conveyor_plant.sysj line: 38, column: 26
      ends[7]=2;
      tdone[7]=1;
    }
    else {
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread36883(int [] tdone, int [] ends){
        S35924=1;
    bottleAtPos1E.setPresent();//sysj\conveyor_plant.sysj line: 35, column: 30
    currsigs.addElement(bottleAtPos1E);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread36881(int [] tdone, int [] ends){
        switch(S35940){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_7 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 38, column: 26
          ends[7]=3;
          ;//sysj\conveyor_plant.sysj line: 38, column: 26
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

  public void thread36880(int [] tdone, int [] ends){
        switch(S35924){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        bottleAtPos1E.setPresent();//sysj\conveyor_plant.sysj line: 35, column: 30
        currsigs.addElement(bottleAtPos1E);
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
        break;
      
    }
  }

  public void thread36879(int [] tdone, int [] ends){
        switch(S35993){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S35943){
          case 0 : 
            thread36880(tdone,ends);
            thread36881(tdone,ends);
            int biggest36882 = 0;
            if(ends[6]>=biggest36882){
              biggest36882=ends[6];
            }
            if(ends[7]>=biggest36882){
              biggest36882=ends[7];
            }
            if(biggest36882 == 1){
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            if(biggest36882 == 2){
              ends[5]=2;
              ;//sysj\conveyor_plant.sysj line: 33, column: 22
              S35943=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            //FINXME code
            if(biggest36882 == 0){
              S35943=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            S35943=1;
            S35943=0;
            if(bottleAtPos1.getprestatus()){//sysj\conveyor_plant.sysj line: 32, column: 26
              thread36883(tdone,ends);
              thread36884(tdone,ends);
              int biggest36885 = 0;
              if(ends[6]>=biggest36885){
                biggest36885=ends[6];
              }
              if(ends[7]>=biggest36885){
                biggest36885=ends[7];
              }
              if(biggest36885 == 1){
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              if(biggest36885 == 2){
                ends[5]=2;
                ;//sysj\conveyor_plant.sysj line: 33, column: 22
                S35943=1;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
            }
            else {
              S35943=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread36878(int [] tdone, int [] ends){
        switch(S35919){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S35913){
          case 0 : 
            S35913=0;
            if(motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 28, column: 31
              motConveyorOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 28, column: 49
              currsigs.addElement(motConveyorOnOffE);
              S35913=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S35913=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            S35913=1;
            S35913=0;
            if(motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 28, column: 31
              motConveyorOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 28, column: 49
              currsigs.addElement(motConveyorOnOffE);
              S35913=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S35913=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread36877(int [] tdone, int [] ends){
        switch(S36003){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread36878(tdone,ends);
        thread36879(tdone,ends);
        thread36886(tdone,ends);
        int biggest36887 = 0;
        if(ends[4]>=biggest36887){
          biggest36887=ends[4];
        }
        if(ends[5]>=biggest36887){
          biggest36887=ends[5];
        }
        if(ends[8]>=biggest36887){
          biggest36887=ends[8];
        }
        if(biggest36887 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest36887 == 0){
          S36003=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread36876(int [] tdone, int [] ends){
        switch(S35911){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S35905){
          case 0 : 
            if(motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 15, column: 16
              bottleAtPos1.setPresent();//sysj\conveyor_plant.sysj line: 17, column: 10
              currsigs.addElement(bottleAtPos1);
              S35905=1;
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
            S35905=1;
            S35905=0;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread36873(int [] tdone, int [] ends){
        S36001=1;
    if(bottleLeftPos5.getprestatus()){//sysj\conveyor_plant.sysj line: 48, column: 31
      bottleLeftPos5E.setPresent();//sysj\conveyor_plant.sysj line: 48, column: 47
      currsigs.addElement(bottleLeftPos5E);
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

  public void thread36871(int [] tdone, int [] ends){
        S35940=1;
    __start_thread_7 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 38, column: 26
    if(com.systemj.Timer.getMs() - __start_thread_7 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 38, column: 26
      ends[7]=3;
      ;//sysj\conveyor_plant.sysj line: 38, column: 26
      ends[7]=2;
      tdone[7]=1;
    }
    else {
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread36870(int [] tdone, int [] ends){
        S35924=1;
    bottleAtPos1E.setPresent();//sysj\conveyor_plant.sysj line: 35, column: 30
    currsigs.addElement(bottleAtPos1E);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread36869(int [] tdone, int [] ends){
        S35993=1;
    S35943=0;
    if(bottleAtPos1.getprestatus()){//sysj\conveyor_plant.sysj line: 32, column: 26
      thread36870(tdone,ends);
      thread36871(tdone,ends);
      int biggest36872 = 0;
      if(ends[6]>=biggest36872){
        biggest36872=ends[6];
      }
      if(ends[7]>=biggest36872){
        biggest36872=ends[7];
      }
      if(biggest36872 == 1){
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
      if(biggest36872 == 2){
        ends[5]=2;
        ;//sysj\conveyor_plant.sysj line: 33, column: 22
        S35943=1;
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
    }
    else {
      S35943=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread36868(int [] tdone, int [] ends){
        S35919=1;
    S35913=0;
    if(motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 28, column: 31
      motConveyorOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 28, column: 49
      currsigs.addElement(motConveyorOnOffE);
      S35913=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S35913=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread36867(int [] tdone, int [] ends){
        S36003=1;
    thread36868(tdone,ends);
    thread36869(tdone,ends);
    thread36873(tdone,ends);
    int biggest36874 = 0;
    if(ends[4]>=biggest36874){
      biggest36874=ends[4];
    }
    if(ends[5]>=biggest36874){
      biggest36874=ends[5];
    }
    if(ends[8]>=biggest36874){
      biggest36874=ends[8];
    }
    if(biggest36874 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread36866(int [] tdone, int [] ends){
        S35911=1;
    S35905=0;
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
      switch(S36105){
        case 0 : 
          S36105=0;
          break RUN;
        
        case 1 : 
          S36105=2;
          S36105=2;
          new Thread(new GUI()).start();//sysj\conveyor_plant.sysj line: 11, column: 2
          thread36866(tdone,ends);
          thread36867(tdone,ends);
          int biggest36875 = 0;
          if(ends[2]>=biggest36875){
            biggest36875=ends[2];
          }
          if(ends[3]>=biggest36875){
            biggest36875=ends[3];
          }
          if(biggest36875 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread36876(tdone,ends);
          thread36877(tdone,ends);
          int biggest36888 = 0;
          if(ends[2]>=biggest36888){
            biggest36888=ends[2];
          }
          if(ends[3]>=biggest36888){
            biggest36888=ends[3];
          }
          if(biggest36888 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest36888 == 0){
            S36105=0;
            active[1]=0;
            ends[1]=0;
            S36105=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
      bottleAtPos1E.setpreclear();
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
      bottleAtPos1E.sethook();
      bottleAtPos1E.setClear();
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
