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
  private long __start_thread_2;//sysj\conveyor_plant.sysj line: 13, column: 7
  private int S32012 = 1;
  private int S31806 = 1;
  private int S31738 = 1;
  private int S31711 = 1;
  private int S31859 = 1;
  private int S31814 = 1;
  private int S31849 = 1;
  private int S31825 = 1;
  private int S31819 = 1;
  private int S31822 = 1;
  private int S31857 = 1;
  
  private int[] ends = new int[40];
  private int[] tdone = new int[40];
  
  public void thread32596(int [] tdone, int [] ends){
        switch(S31857){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(bottleLeftPos5.getprestatus()){//sysj\conveyor_plant.sysj line: 52, column: 31
          bottleLeftPos5E.setPresent();//sysj\conveyor_plant.sysj line: 52, column: 47
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

  public void thread32594(int [] tdone, int [] ends){
        S31822=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread32593(int [] tdone, int [] ends){
        S31819=1;
    bottleAtPos1E.setPresent();//sysj\conveyor_plant.sysj line: 39, column: 30
    currsigs.addElement(bottleAtPos1E);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread32591(int [] tdone, int [] ends){
        switch(S31822){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 43, column: 34
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

  public void thread32590(int [] tdone, int [] ends){
        switch(S31819){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        bottleAtPos1E.setPresent();//sysj\conveyor_plant.sysj line: 39, column: 30
        currsigs.addElement(bottleAtPos1E);
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
        break;
      
    }
  }

  public void thread32589(int [] tdone, int [] ends){
        switch(S31849){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S31825){
          case 0 : 
            thread32590(tdone,ends);
            thread32591(tdone,ends);
            int biggest32592 = 0;
            if(ends[6]>=biggest32592){
              biggest32592=ends[6];
            }
            if(ends[7]>=biggest32592){
              biggest32592=ends[7];
            }
            if(biggest32592 == 1){
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            if(biggest32592 == 2){
              ends[5]=2;
              ;//sysj\conveyor_plant.sysj line: 37, column: 22
              S31825=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            //FINXME code
            if(biggest32592 == 0){
              S31825=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            S31825=1;
            S31825=0;
            if(bottleAtPos1.getprestatus()){//sysj\conveyor_plant.sysj line: 36, column: 26
              thread32593(tdone,ends);
              thread32594(tdone,ends);
              int biggest32595 = 0;
              if(ends[6]>=biggest32595){
                biggest32595=ends[6];
              }
              if(ends[7]>=biggest32595){
                biggest32595=ends[7];
              }
              if(biggest32595 == 1){
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
            }
            else {
              S31825=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread32588(int [] tdone, int [] ends){
        switch(S31814){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 32, column: 31
          motConveyorOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 32, column: 49
          currsigs.addElement(motConveyorOnOffE);
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
      
    }
  }

  public void thread32587(int [] tdone, int [] ends){
        switch(S31859){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread32588(tdone,ends);
        thread32589(tdone,ends);
        thread32596(tdone,ends);
        int biggest32597 = 0;
        if(ends[4]>=biggest32597){
          biggest32597=ends[4];
        }
        if(ends[5]>=biggest32597){
          biggest32597=ends[5];
        }
        if(ends[8]>=biggest32597){
          biggest32597=ends[8];
        }
        if(biggest32597 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest32597 == 0){
          S31859=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread32586(int [] tdone, int [] ends){
        switch(S31806){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S31738){
          case 0 : 
            if(motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 15, column: 16
              S31738=1;
              __start_thread_2 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 13, column: 7
              S31711=0;
              if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 13, column: 7
                ends[2]=2;
                ;//sysj\conveyor_plant.sysj line: 13, column: 7
                bottleAtPos1.setPresent();//sysj\conveyor_plant.sysj line: 20, column: 10
                currsigs.addElement(bottleAtPos1);
                S31738=2;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S31711=1;
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
            switch(S31711){
              case 0 : 
                S31711=0;
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 13, column: 7
                  ends[2]=2;
                  ;//sysj\conveyor_plant.sysj line: 13, column: 7
                  bottleAtPos1.setPresent();//sysj\conveyor_plant.sysj line: 20, column: 10
                  currsigs.addElement(bottleAtPos1);
                  S31738=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S31711=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 1 : 
                S31711=1;
                S31711=0;
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 13, column: 7
                  ends[2]=2;
                  ;//sysj\conveyor_plant.sysj line: 13, column: 7
                  bottleAtPos1.setPresent();//sysj\conveyor_plant.sysj line: 20, column: 10
                  currsigs.addElement(bottleAtPos1);
                  S31738=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S31711=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
            }
            break;
          
          case 2 : 
            S31738=2;
            S31738=3;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
          case 3 : 
            if(!motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 22, column: 16
              S31738=0;
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

  public void thread32583(int [] tdone, int [] ends){
        S31857=1;
    if(bottleLeftPos5.getprestatus()){//sysj\conveyor_plant.sysj line: 52, column: 31
      bottleLeftPos5E.setPresent();//sysj\conveyor_plant.sysj line: 52, column: 47
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

  public void thread32581(int [] tdone, int [] ends){
        S31822=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread32580(int [] tdone, int [] ends){
        S31819=1;
    bottleAtPos1E.setPresent();//sysj\conveyor_plant.sysj line: 39, column: 30
    currsigs.addElement(bottleAtPos1E);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread32579(int [] tdone, int [] ends){
        S31849=1;
    S31825=0;
    if(bottleAtPos1.getprestatus()){//sysj\conveyor_plant.sysj line: 36, column: 26
      thread32580(tdone,ends);
      thread32581(tdone,ends);
      int biggest32582 = 0;
      if(ends[6]>=biggest32582){
        biggest32582=ends[6];
      }
      if(ends[7]>=biggest32582){
        biggest32582=ends[7];
      }
      if(biggest32582 == 1){
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
    }
    else {
      S31825=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread32578(int [] tdone, int [] ends){
        S31814=1;
    if(motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 32, column: 31
      motConveyorOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 32, column: 49
      currsigs.addElement(motConveyorOnOffE);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread32577(int [] tdone, int [] ends){
        S31859=1;
    thread32578(tdone,ends);
    thread32579(tdone,ends);
    thread32583(tdone,ends);
    int biggest32584 = 0;
    if(ends[4]>=biggest32584){
      biggest32584=ends[4];
    }
    if(ends[5]>=biggest32584){
      biggest32584=ends[5];
    }
    if(ends[8]>=biggest32584){
      biggest32584=ends[8];
    }
    if(biggest32584 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread32576(int [] tdone, int [] ends){
        S31806=1;
    S31738=0;
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
      switch(S32012){
        case 0 : 
          S32012=0;
          break RUN;
        
        case 1 : 
          S32012=2;
          S32012=2;
          new Thread(new GUI()).start();//sysj\conveyor_plant.sysj line: 11, column: 2
          thread32576(tdone,ends);
          thread32577(tdone,ends);
          int biggest32585 = 0;
          if(ends[2]>=biggest32585){
            biggest32585=ends[2];
          }
          if(ends[3]>=biggest32585){
            biggest32585=ends[3];
          }
          if(biggest32585 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread32586(tdone,ends);
          thread32587(tdone,ends);
          int biggest32598 = 0;
          if(ends[2]>=biggest32598){
            biggest32598=ends[2];
          }
          if(ends[3]>=biggest32598){
            biggest32598=ends[3];
          }
          if(biggest32598 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest32598 == 0){
            S32012=0;
            active[1]=0;
            ends[1]=0;
            S32012=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
