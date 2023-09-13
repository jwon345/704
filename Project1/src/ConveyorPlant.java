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
  public Signal bottleAtPos1E = new Signal("bottleAtPos1E", Signal.OUTPUT);
  public Signal bottleLeftPos5E = new Signal("bottleLeftPos5E", Signal.OUTPUT);
  private long __start_thread_7;//sysj\conveyor_plant.sysj line: 39, column: 26
  private int S202614 = 1;
  private int S202421 = 1;
  private int S202415 = 1;
  private int S202513 = 1;
  private int S202429 = 1;
  private int S202423 = 1;
  private int S202503 = 1;
  private int S202453 = 1;
  private int S202434 = 1;
  private int S202450 = 1;
  private int S202511 = 1;
  
  private int[] ends = new int[49];
  private int[] tdone = new int[49];
  
  public void thread203935(int [] tdone, int [] ends){
        switch(S202511){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(bottleLeftPos5.getprestatus()){//sysj\conveyor_plant.sysj line: 49, column: 31
          bottleLeftPos5E.setPresent();//sysj\conveyor_plant.sysj line: 49, column: 47
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

  public void thread203933(int [] tdone, int [] ends){
        S202450=1;
    __start_thread_7 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 39, column: 26
    if(com.systemj.Timer.getMs() - __start_thread_7 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 39, column: 26
      ends[7]=3;
      ;//sysj\conveyor_plant.sysj line: 39, column: 26
      ends[7]=2;
      tdone[7]=1;
    }
    else {
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread203932(int [] tdone, int [] ends){
        S202434=1;
    bottleAtPos1E.setPresent();//sysj\conveyor_plant.sysj line: 36, column: 30
    currsigs.addElement(bottleAtPos1E);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread203930(int [] tdone, int [] ends){
        switch(S202450){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_7 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 39, column: 26
          ends[7]=3;
          ;//sysj\conveyor_plant.sysj line: 39, column: 26
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

  public void thread203929(int [] tdone, int [] ends){
        switch(S202434){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        bottleAtPos1E.setPresent();//sysj\conveyor_plant.sysj line: 36, column: 30
        currsigs.addElement(bottleAtPos1E);
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
        break;
      
    }
  }

  public void thread203928(int [] tdone, int [] ends){
        switch(S202503){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S202453){
          case 0 : 
            thread203929(tdone,ends);
            thread203930(tdone,ends);
            int biggest203931 = 0;
            if(ends[6]>=biggest203931){
              biggest203931=ends[6];
            }
            if(ends[7]>=biggest203931){
              biggest203931=ends[7];
            }
            if(biggest203931 == 1){
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            if(biggest203931 == 2){
              ends[5]=2;
              ;//sysj\conveyor_plant.sysj line: 34, column: 22
              S202453=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            //FINXME code
            if(biggest203931 == 0){
              S202453=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            S202453=1;
            S202453=0;
            if(bottleAtPos1.getprestatus()){//sysj\conveyor_plant.sysj line: 33, column: 26
              thread203932(tdone,ends);
              thread203933(tdone,ends);
              int biggest203934 = 0;
              if(ends[6]>=biggest203934){
                biggest203934=ends[6];
              }
              if(ends[7]>=biggest203934){
                biggest203934=ends[7];
              }
              if(biggest203934 == 1){
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              if(biggest203934 == 2){
                ends[5]=2;
                ;//sysj\conveyor_plant.sysj line: 34, column: 22
                S202453=1;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
            }
            else {
              S202453=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread203927(int [] tdone, int [] ends){
        switch(S202429){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S202423){
          case 0 : 
            S202423=0;
            if(motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 29, column: 31
              motConveyorOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 29, column: 49
              currsigs.addElement(motConveyorOnOffE);
              S202423=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S202423=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            S202423=1;
            S202423=0;
            if(motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 29, column: 31
              motConveyorOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 29, column: 49
              currsigs.addElement(motConveyorOnOffE);
              S202423=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S202423=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread203926(int [] tdone, int [] ends){
        switch(S202513){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread203927(tdone,ends);
        thread203928(tdone,ends);
        thread203935(tdone,ends);
        int biggest203936 = 0;
        if(ends[4]>=biggest203936){
          biggest203936=ends[4];
        }
        if(ends[5]>=biggest203936){
          biggest203936=ends[5];
        }
        if(ends[8]>=biggest203936){
          biggest203936=ends[8];
        }
        if(biggest203936 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest203936 == 0){
          S202513=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread203925(int [] tdone, int [] ends){
        switch(S202421){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S202415){
          case 0 : 
            if(motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 16, column: 16
              bottleAtPos1.setPresent();//sysj\conveyor_plant.sysj line: 18, column: 10
              currsigs.addElement(bottleAtPos1);
              S202415=1;
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
            S202415=1;
            S202415=0;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread203922(int [] tdone, int [] ends){
        S202511=1;
    if(bottleLeftPos5.getprestatus()){//sysj\conveyor_plant.sysj line: 49, column: 31
      bottleLeftPos5E.setPresent();//sysj\conveyor_plant.sysj line: 49, column: 47
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

  public void thread203920(int [] tdone, int [] ends){
        S202450=1;
    __start_thread_7 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 39, column: 26
    if(com.systemj.Timer.getMs() - __start_thread_7 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 39, column: 26
      ends[7]=3;
      ;//sysj\conveyor_plant.sysj line: 39, column: 26
      ends[7]=2;
      tdone[7]=1;
    }
    else {
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread203919(int [] tdone, int [] ends){
        S202434=1;
    bottleAtPos1E.setPresent();//sysj\conveyor_plant.sysj line: 36, column: 30
    currsigs.addElement(bottleAtPos1E);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread203918(int [] tdone, int [] ends){
        S202503=1;
    S202453=0;
    if(bottleAtPos1.getprestatus()){//sysj\conveyor_plant.sysj line: 33, column: 26
      thread203919(tdone,ends);
      thread203920(tdone,ends);
      int biggest203921 = 0;
      if(ends[6]>=biggest203921){
        biggest203921=ends[6];
      }
      if(ends[7]>=biggest203921){
        biggest203921=ends[7];
      }
      if(biggest203921 == 1){
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
      if(biggest203921 == 2){
        ends[5]=2;
        ;//sysj\conveyor_plant.sysj line: 34, column: 22
        S202453=1;
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
    }
    else {
      S202453=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread203917(int [] tdone, int [] ends){
        S202429=1;
    S202423=0;
    if(motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 29, column: 31
      motConveyorOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 29, column: 49
      currsigs.addElement(motConveyorOnOffE);
      S202423=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S202423=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread203916(int [] tdone, int [] ends){
        S202513=1;
    thread203917(tdone,ends);
    thread203918(tdone,ends);
    thread203922(tdone,ends);
    int biggest203923 = 0;
    if(ends[4]>=biggest203923){
      biggest203923=ends[4];
    }
    if(ends[5]>=biggest203923){
      biggest203923=ends[5];
    }
    if(ends[8]>=biggest203923){
      biggest203923=ends[8];
    }
    if(biggest203923 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread203915(int [] tdone, int [] ends){
        S202421=1;
    S202415=0;
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
      switch(S202614){
        case 0 : 
          S202614=0;
          break RUN;
        
        case 1 : 
          S202614=2;
          S202614=2;
          new Thread(new GUI()).start();//sysj\conveyor_plant.sysj line: 11, column: 2
          new Thread(new socketListener()).start();//sysj\conveyor_plant.sysj line: 12, column: 2
          thread203915(tdone,ends);
          thread203916(tdone,ends);
          int biggest203924 = 0;
          if(ends[2]>=biggest203924){
            biggest203924=ends[2];
          }
          if(ends[3]>=biggest203924){
            biggest203924=ends[3];
          }
          if(biggest203924 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread203925(tdone,ends);
          thread203926(tdone,ends);
          int biggest203937 = 0;
          if(ends[2]>=biggest203937){
            biggest203937=ends[2];
          }
          if(ends[3]>=biggest203937){
            biggest203937=ends[3];
          }
          if(biggest203937 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest203937 == 0){
            S202614=0;
            active[1]=0;
            ends[1]=0;
            S202614=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
