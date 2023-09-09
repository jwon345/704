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
  private int S31692 = 1;
  private int S31486 = 1;
  private int S31418 = 1;
  private int S31391 = 1;
  private int S31539 = 1;
  private int S31494 = 1;
  private int S31529 = 1;
  private int S31505 = 1;
  private int S31499 = 1;
  private int S31502 = 1;
  private int S31537 = 1;
  
  private int[] ends = new int[40];
  private int[] tdone = new int[40];
  
  public void thread32878(int [] tdone, int [] ends){
        switch(S31537){
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

  public void thread32876(int [] tdone, int [] ends){
        S31502=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread32875(int [] tdone, int [] ends){
        S31499=1;
    bottleAtPos1E.setPresent();//sysj\conveyor_plant.sysj line: 39, column: 30
    currsigs.addElement(bottleAtPos1E);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread32873(int [] tdone, int [] ends){
        switch(S31502){
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

  public void thread32872(int [] tdone, int [] ends){
        switch(S31499){
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

  public void thread32871(int [] tdone, int [] ends){
        switch(S31529){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S31505){
          case 0 : 
            thread32872(tdone,ends);
            thread32873(tdone,ends);
            int biggest32874 = 0;
            if(ends[6]>=biggest32874){
              biggest32874=ends[6];
            }
            if(ends[7]>=biggest32874){
              biggest32874=ends[7];
            }
            if(biggest32874 == 1){
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            if(biggest32874 == 2){
              ends[5]=2;
              ;//sysj\conveyor_plant.sysj line: 37, column: 22
              S31505=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            //FINXME code
            if(biggest32874 == 0){
              S31505=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            S31505=1;
            S31505=0;
            if(bottleAtPos1.getprestatus()){//sysj\conveyor_plant.sysj line: 36, column: 26
              thread32875(tdone,ends);
              thread32876(tdone,ends);
              int biggest32877 = 0;
              if(ends[6]>=biggest32877){
                biggest32877=ends[6];
              }
              if(ends[7]>=biggest32877){
                biggest32877=ends[7];
              }
              if(biggest32877 == 1){
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
            }
            else {
              S31505=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread32870(int [] tdone, int [] ends){
        switch(S31494){
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

  public void thread32869(int [] tdone, int [] ends){
        switch(S31539){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread32870(tdone,ends);
        thread32871(tdone,ends);
        thread32878(tdone,ends);
        int biggest32879 = 0;
        if(ends[4]>=biggest32879){
          biggest32879=ends[4];
        }
        if(ends[5]>=biggest32879){
          biggest32879=ends[5];
        }
        if(ends[8]>=biggest32879){
          biggest32879=ends[8];
        }
        if(biggest32879 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest32879 == 0){
          S31539=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread32868(int [] tdone, int [] ends){
        switch(S31486){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S31418){
          case 0 : 
            if(motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 15, column: 16
              S31418=1;
              __start_thread_2 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 13, column: 7
              S31391=0;
              if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 13, column: 7
                ends[2]=2;
                ;//sysj\conveyor_plant.sysj line: 13, column: 7
                bottleAtPos1.setPresent();//sysj\conveyor_plant.sysj line: 20, column: 10
                currsigs.addElement(bottleAtPos1);
                S31418=2;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S31391=1;
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
            switch(S31391){
              case 0 : 
                S31391=0;
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 13, column: 7
                  ends[2]=2;
                  ;//sysj\conveyor_plant.sysj line: 13, column: 7
                  bottleAtPos1.setPresent();//sysj\conveyor_plant.sysj line: 20, column: 10
                  currsigs.addElement(bottleAtPos1);
                  S31418=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S31391=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 1 : 
                S31391=1;
                S31391=0;
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 13, column: 7
                  ends[2]=2;
                  ;//sysj\conveyor_plant.sysj line: 13, column: 7
                  bottleAtPos1.setPresent();//sysj\conveyor_plant.sysj line: 20, column: 10
                  currsigs.addElement(bottleAtPos1);
                  S31418=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S31391=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
            }
            break;
          
          case 2 : 
            S31418=2;
            S31418=3;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
          case 3 : 
            if(!motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 22, column: 16
              S31418=0;
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

  public void thread32865(int [] tdone, int [] ends){
        S31537=1;
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

  public void thread32863(int [] tdone, int [] ends){
        S31502=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread32862(int [] tdone, int [] ends){
        S31499=1;
    bottleAtPos1E.setPresent();//sysj\conveyor_plant.sysj line: 39, column: 30
    currsigs.addElement(bottleAtPos1E);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread32861(int [] tdone, int [] ends){
        S31529=1;
    S31505=0;
    if(bottleAtPos1.getprestatus()){//sysj\conveyor_plant.sysj line: 36, column: 26
      thread32862(tdone,ends);
      thread32863(tdone,ends);
      int biggest32864 = 0;
      if(ends[6]>=biggest32864){
        biggest32864=ends[6];
      }
      if(ends[7]>=biggest32864){
        biggest32864=ends[7];
      }
      if(biggest32864 == 1){
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
    }
    else {
      S31505=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread32860(int [] tdone, int [] ends){
        S31494=1;
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

  public void thread32859(int [] tdone, int [] ends){
        S31539=1;
    thread32860(tdone,ends);
    thread32861(tdone,ends);
    thread32865(tdone,ends);
    int biggest32866 = 0;
    if(ends[4]>=biggest32866){
      biggest32866=ends[4];
    }
    if(ends[5]>=biggest32866){
      biggest32866=ends[5];
    }
    if(ends[8]>=biggest32866){
      biggest32866=ends[8];
    }
    if(biggest32866 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread32858(int [] tdone, int [] ends){
        S31486=1;
    S31418=0;
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
      switch(S31692){
        case 0 : 
          S31692=0;
          break RUN;
        
        case 1 : 
          S31692=2;
          S31692=2;
          new Thread(new GUI()).start();//sysj\conveyor_plant.sysj line: 11, column: 2
          thread32858(tdone,ends);
          thread32859(tdone,ends);
          int biggest32867 = 0;
          if(ends[2]>=biggest32867){
            biggest32867=ends[2];
          }
          if(ends[3]>=biggest32867){
            biggest32867=ends[3];
          }
          if(biggest32867 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread32868(tdone,ends);
          thread32869(tdone,ends);
          int biggest32880 = 0;
          if(ends[2]>=biggest32880){
            biggest32880=ends[2];
          }
          if(ends[3]>=biggest32880){
            biggest32880=ends[3];
          }
          if(biggest32880 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest32880 == 0){
            S31692=0;
            active[1]=0;
            ends[1]=0;
            S31692=0;
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
