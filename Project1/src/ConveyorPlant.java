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
  private int S39380 = 1;
  private int S39186 = 1;
  private int S39180 = 1;
  private int S39278 = 1;
  private int S39194 = 1;
  private int S39188 = 1;
  private int S39268 = 1;
  private int S39218 = 1;
  private int S39199 = 1;
  private int S39215 = 1;
  private int S39276 = 1;
  
  private int[] ends = new int[38];
  private int[] tdone = new int[38];
  
  public void thread40547(int [] tdone, int [] ends){
        switch(S39276){
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

  public void thread40545(int [] tdone, int [] ends){
        S39215=1;
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

  public void thread40544(int [] tdone, int [] ends){
        S39199=1;
    bottleAtPos1E.setPresent();//sysj\conveyor_plant.sysj line: 35, column: 30
    currsigs.addElement(bottleAtPos1E);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread40542(int [] tdone, int [] ends){
        switch(S39215){
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

  public void thread40541(int [] tdone, int [] ends){
        switch(S39199){
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

  public void thread40540(int [] tdone, int [] ends){
        switch(S39268){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S39218){
          case 0 : 
            thread40541(tdone,ends);
            thread40542(tdone,ends);
            int biggest40543 = 0;
            if(ends[6]>=biggest40543){
              biggest40543=ends[6];
            }
            if(ends[7]>=biggest40543){
              biggest40543=ends[7];
            }
            if(biggest40543 == 1){
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            if(biggest40543 == 2){
              ends[5]=2;
              ;//sysj\conveyor_plant.sysj line: 33, column: 22
              S39218=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            //FINXME code
            if(biggest40543 == 0){
              S39218=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            S39218=1;
            S39218=0;
            if(bottleAtPos1.getprestatus()){//sysj\conveyor_plant.sysj line: 32, column: 26
              thread40544(tdone,ends);
              thread40545(tdone,ends);
              int biggest40546 = 0;
              if(ends[6]>=biggest40546){
                biggest40546=ends[6];
              }
              if(ends[7]>=biggest40546){
                biggest40546=ends[7];
              }
              if(biggest40546 == 1){
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              if(biggest40546 == 2){
                ends[5]=2;
                ;//sysj\conveyor_plant.sysj line: 33, column: 22
                S39218=1;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
            }
            else {
              S39218=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread40539(int [] tdone, int [] ends){
        switch(S39194){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S39188){
          case 0 : 
            S39188=0;
            if(motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 28, column: 31
              motConveyorOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 28, column: 49
              currsigs.addElement(motConveyorOnOffE);
              S39188=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S39188=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            S39188=1;
            S39188=0;
            if(motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 28, column: 31
              motConveyorOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 28, column: 49
              currsigs.addElement(motConveyorOnOffE);
              S39188=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S39188=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread40538(int [] tdone, int [] ends){
        switch(S39278){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread40539(tdone,ends);
        thread40540(tdone,ends);
        thread40547(tdone,ends);
        int biggest40548 = 0;
        if(ends[4]>=biggest40548){
          biggest40548=ends[4];
        }
        if(ends[5]>=biggest40548){
          biggest40548=ends[5];
        }
        if(ends[8]>=biggest40548){
          biggest40548=ends[8];
        }
        if(biggest40548 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest40548 == 0){
          S39278=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread40537(int [] tdone, int [] ends){
        switch(S39186){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S39180){
          case 0 : 
            if(motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 15, column: 16
              bottleAtPos1.setPresent();//sysj\conveyor_plant.sysj line: 17, column: 10
              currsigs.addElement(bottleAtPos1);
              S39180=1;
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
            S39180=1;
            S39180=0;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread40534(int [] tdone, int [] ends){
        S39276=1;
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

  public void thread40532(int [] tdone, int [] ends){
        S39215=1;
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

  public void thread40531(int [] tdone, int [] ends){
        S39199=1;
    bottleAtPos1E.setPresent();//sysj\conveyor_plant.sysj line: 35, column: 30
    currsigs.addElement(bottleAtPos1E);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread40530(int [] tdone, int [] ends){
        S39268=1;
    S39218=0;
    if(bottleAtPos1.getprestatus()){//sysj\conveyor_plant.sysj line: 32, column: 26
      thread40531(tdone,ends);
      thread40532(tdone,ends);
      int biggest40533 = 0;
      if(ends[6]>=biggest40533){
        biggest40533=ends[6];
      }
      if(ends[7]>=biggest40533){
        biggest40533=ends[7];
      }
      if(biggest40533 == 1){
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
      if(biggest40533 == 2){
        ends[5]=2;
        ;//sysj\conveyor_plant.sysj line: 33, column: 22
        S39218=1;
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
    }
    else {
      S39218=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread40529(int [] tdone, int [] ends){
        S39194=1;
    S39188=0;
    if(motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 28, column: 31
      motConveyorOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 28, column: 49
      currsigs.addElement(motConveyorOnOffE);
      S39188=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S39188=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread40528(int [] tdone, int [] ends){
        S39278=1;
    thread40529(tdone,ends);
    thread40530(tdone,ends);
    thread40534(tdone,ends);
    int biggest40535 = 0;
    if(ends[4]>=biggest40535){
      biggest40535=ends[4];
    }
    if(ends[5]>=biggest40535){
      biggest40535=ends[5];
    }
    if(ends[8]>=biggest40535){
      biggest40535=ends[8];
    }
    if(biggest40535 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread40527(int [] tdone, int [] ends){
        S39186=1;
    S39180=0;
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
      switch(S39380){
        case 0 : 
          S39380=0;
          break RUN;
        
        case 1 : 
          S39380=2;
          S39380=2;
          new Thread(new GUI()).start();//sysj\conveyor_plant.sysj line: 11, column: 2
          thread40527(tdone,ends);
          thread40528(tdone,ends);
          int biggest40536 = 0;
          if(ends[2]>=biggest40536){
            biggest40536=ends[2];
          }
          if(ends[3]>=biggest40536){
            biggest40536=ends[3];
          }
          if(biggest40536 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread40537(tdone,ends);
          thread40538(tdone,ends);
          int biggest40549 = 0;
          if(ends[2]>=biggest40549){
            biggest40549=ends[2];
          }
          if(ends[3]>=biggest40549){
            biggest40549=ends[3];
          }
          if(biggest40549 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest40549 == 0){
            S39380=0;
            active[1]=0;
            ends[1]=0;
            S39380=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
