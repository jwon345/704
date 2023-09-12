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
  private int S213259 = 1;
  private int S213065 = 1;
  private int S213059 = 1;
  private int S213157 = 1;
  private int S213073 = 1;
  private int S213067 = 1;
  private int S213147 = 1;
  private int S213097 = 1;
  private int S213078 = 1;
  private int S213094 = 1;
  private int S213155 = 1;
  
  private int[] ends = new int[49];
  private int[] tdone = new int[49];
  
  public void thread214580(int [] tdone, int [] ends){
        switch(S213155){
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

  public void thread214578(int [] tdone, int [] ends){
        S213094=1;
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

  public void thread214577(int [] tdone, int [] ends){
        S213078=1;
    bottleAtPos1E.setPresent();//sysj\conveyor_plant.sysj line: 35, column: 30
    currsigs.addElement(bottleAtPos1E);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread214575(int [] tdone, int [] ends){
        switch(S213094){
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

  public void thread214574(int [] tdone, int [] ends){
        switch(S213078){
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

  public void thread214573(int [] tdone, int [] ends){
        switch(S213147){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S213097){
          case 0 : 
            thread214574(tdone,ends);
            thread214575(tdone,ends);
            int biggest214576 = 0;
            if(ends[6]>=biggest214576){
              biggest214576=ends[6];
            }
            if(ends[7]>=biggest214576){
              biggest214576=ends[7];
            }
            if(biggest214576 == 1){
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            if(biggest214576 == 2){
              ends[5]=2;
              ;//sysj\conveyor_plant.sysj line: 33, column: 22
              S213097=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            //FINXME code
            if(biggest214576 == 0){
              S213097=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            S213097=1;
            S213097=0;
            if(bottleAtPos1.getprestatus()){//sysj\conveyor_plant.sysj line: 32, column: 26
              thread214577(tdone,ends);
              thread214578(tdone,ends);
              int biggest214579 = 0;
              if(ends[6]>=biggest214579){
                biggest214579=ends[6];
              }
              if(ends[7]>=biggest214579){
                biggest214579=ends[7];
              }
              if(biggest214579 == 1){
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              if(biggest214579 == 2){
                ends[5]=2;
                ;//sysj\conveyor_plant.sysj line: 33, column: 22
                S213097=1;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
            }
            else {
              S213097=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread214572(int [] tdone, int [] ends){
        switch(S213073){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S213067){
          case 0 : 
            S213067=0;
            if(motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 28, column: 31
              motConveyorOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 28, column: 49
              currsigs.addElement(motConveyorOnOffE);
              S213067=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S213067=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            S213067=1;
            S213067=0;
            if(motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 28, column: 31
              motConveyorOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 28, column: 49
              currsigs.addElement(motConveyorOnOffE);
              S213067=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S213067=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread214571(int [] tdone, int [] ends){
        switch(S213157){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread214572(tdone,ends);
        thread214573(tdone,ends);
        thread214580(tdone,ends);
        int biggest214581 = 0;
        if(ends[4]>=biggest214581){
          biggest214581=ends[4];
        }
        if(ends[5]>=biggest214581){
          biggest214581=ends[5];
        }
        if(ends[8]>=biggest214581){
          biggest214581=ends[8];
        }
        if(biggest214581 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest214581 == 0){
          S213157=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread214570(int [] tdone, int [] ends){
        switch(S213065){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S213059){
          case 0 : 
            if(motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 15, column: 16
              bottleAtPos1.setPresent();//sysj\conveyor_plant.sysj line: 17, column: 10
              currsigs.addElement(bottleAtPos1);
              S213059=1;
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
            S213059=1;
            S213059=0;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread214567(int [] tdone, int [] ends){
        S213155=1;
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

  public void thread214565(int [] tdone, int [] ends){
        S213094=1;
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

  public void thread214564(int [] tdone, int [] ends){
        S213078=1;
    bottleAtPos1E.setPresent();//sysj\conveyor_plant.sysj line: 35, column: 30
    currsigs.addElement(bottleAtPos1E);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread214563(int [] tdone, int [] ends){
        S213147=1;
    S213097=0;
    if(bottleAtPos1.getprestatus()){//sysj\conveyor_plant.sysj line: 32, column: 26
      thread214564(tdone,ends);
      thread214565(tdone,ends);
      int biggest214566 = 0;
      if(ends[6]>=biggest214566){
        biggest214566=ends[6];
      }
      if(ends[7]>=biggest214566){
        biggest214566=ends[7];
      }
      if(biggest214566 == 1){
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
      if(biggest214566 == 2){
        ends[5]=2;
        ;//sysj\conveyor_plant.sysj line: 33, column: 22
        S213097=1;
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
    }
    else {
      S213097=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread214562(int [] tdone, int [] ends){
        S213073=1;
    S213067=0;
    if(motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 28, column: 31
      motConveyorOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 28, column: 49
      currsigs.addElement(motConveyorOnOffE);
      S213067=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S213067=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread214561(int [] tdone, int [] ends){
        S213157=1;
    thread214562(tdone,ends);
    thread214563(tdone,ends);
    thread214567(tdone,ends);
    int biggest214568 = 0;
    if(ends[4]>=biggest214568){
      biggest214568=ends[4];
    }
    if(ends[5]>=biggest214568){
      biggest214568=ends[5];
    }
    if(ends[8]>=biggest214568){
      biggest214568=ends[8];
    }
    if(biggest214568 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread214560(int [] tdone, int [] ends){
        S213065=1;
    S213059=0;
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
      switch(S213259){
        case 0 : 
          S213259=0;
          break RUN;
        
        case 1 : 
          S213259=2;
          S213259=2;
          new Thread(new GUI()).start();//sysj\conveyor_plant.sysj line: 11, column: 2
          thread214560(tdone,ends);
          thread214561(tdone,ends);
          int biggest214569 = 0;
          if(ends[2]>=biggest214569){
            biggest214569=ends[2];
          }
          if(ends[3]>=biggest214569){
            biggest214569=ends[3];
          }
          if(biggest214569 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread214570(tdone,ends);
          thread214571(tdone,ends);
          int biggest214582 = 0;
          if(ends[2]>=biggest214582){
            biggest214582=ends[2];
          }
          if(ends[3]>=biggest214582){
            biggest214582=ends[3];
          }
          if(biggest214582 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest214582 == 0){
            S213259=0;
            active[1]=0;
            ends[1]=0;
            S213259=0;
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
