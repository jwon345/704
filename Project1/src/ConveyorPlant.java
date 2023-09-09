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
  private int S30404 = 1;
  private int S30198 = 1;
  private int S30130 = 1;
  private int S30103 = 1;
  private int S30251 = 1;
  private int S30206 = 1;
  private int S30241 = 1;
  private int S30217 = 1;
  private int S30211 = 1;
  private int S30214 = 1;
  private int S30249 = 1;
  
  private int[] ends = new int[40];
  private int[] tdone = new int[40];
  
  public void thread31590(int [] tdone, int [] ends){
        switch(S30249){
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

  public void thread31588(int [] tdone, int [] ends){
        S30214=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread31587(int [] tdone, int [] ends){
        S30211=1;
    bottleAtPos1E.setPresent();//sysj\conveyor_plant.sysj line: 39, column: 30
    currsigs.addElement(bottleAtPos1E);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread31585(int [] tdone, int [] ends){
        switch(S30214){
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

  public void thread31584(int [] tdone, int [] ends){
        switch(S30211){
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

  public void thread31583(int [] tdone, int [] ends){
        switch(S30241){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S30217){
          case 0 : 
            thread31584(tdone,ends);
            thread31585(tdone,ends);
            int biggest31586 = 0;
            if(ends[6]>=biggest31586){
              biggest31586=ends[6];
            }
            if(ends[7]>=biggest31586){
              biggest31586=ends[7];
            }
            if(biggest31586 == 1){
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            if(biggest31586 == 2){
              ends[5]=2;
              ;//sysj\conveyor_plant.sysj line: 37, column: 22
              S30217=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            //FINXME code
            if(biggest31586 == 0){
              S30217=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            S30217=1;
            S30217=0;
            if(bottleAtPos1.getprestatus()){//sysj\conveyor_plant.sysj line: 36, column: 26
              thread31587(tdone,ends);
              thread31588(tdone,ends);
              int biggest31589 = 0;
              if(ends[6]>=biggest31589){
                biggest31589=ends[6];
              }
              if(ends[7]>=biggest31589){
                biggest31589=ends[7];
              }
              if(biggest31589 == 1){
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
            }
            else {
              S30217=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread31582(int [] tdone, int [] ends){
        switch(S30206){
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

  public void thread31581(int [] tdone, int [] ends){
        switch(S30251){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread31582(tdone,ends);
        thread31583(tdone,ends);
        thread31590(tdone,ends);
        int biggest31591 = 0;
        if(ends[4]>=biggest31591){
          biggest31591=ends[4];
        }
        if(ends[5]>=biggest31591){
          biggest31591=ends[5];
        }
        if(ends[8]>=biggest31591){
          biggest31591=ends[8];
        }
        if(biggest31591 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest31591 == 0){
          S30251=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread31580(int [] tdone, int [] ends){
        switch(S30198){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S30130){
          case 0 : 
            if(motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 15, column: 16
              S30130=1;
              __start_thread_2 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 13, column: 7
              S30103=0;
              if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 13, column: 7
                ends[2]=2;
                ;//sysj\conveyor_plant.sysj line: 13, column: 7
                bottleAtPos1.setPresent();//sysj\conveyor_plant.sysj line: 20, column: 10
                currsigs.addElement(bottleAtPos1);
                S30130=2;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S30103=1;
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
            switch(S30103){
              case 0 : 
                S30103=0;
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 13, column: 7
                  ends[2]=2;
                  ;//sysj\conveyor_plant.sysj line: 13, column: 7
                  bottleAtPos1.setPresent();//sysj\conveyor_plant.sysj line: 20, column: 10
                  currsigs.addElement(bottleAtPos1);
                  S30130=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S30103=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 1 : 
                S30103=1;
                S30103=0;
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 13, column: 7
                  ends[2]=2;
                  ;//sysj\conveyor_plant.sysj line: 13, column: 7
                  bottleAtPos1.setPresent();//sysj\conveyor_plant.sysj line: 20, column: 10
                  currsigs.addElement(bottleAtPos1);
                  S30130=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S30103=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
            }
            break;
          
          case 2 : 
            S30130=2;
            S30130=3;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
          case 3 : 
            if(!motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 22, column: 16
              S30130=0;
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

  public void thread31577(int [] tdone, int [] ends){
        S30249=1;
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

  public void thread31575(int [] tdone, int [] ends){
        S30214=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread31574(int [] tdone, int [] ends){
        S30211=1;
    bottleAtPos1E.setPresent();//sysj\conveyor_plant.sysj line: 39, column: 30
    currsigs.addElement(bottleAtPos1E);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread31573(int [] tdone, int [] ends){
        S30241=1;
    S30217=0;
    if(bottleAtPos1.getprestatus()){//sysj\conveyor_plant.sysj line: 36, column: 26
      thread31574(tdone,ends);
      thread31575(tdone,ends);
      int biggest31576 = 0;
      if(ends[6]>=biggest31576){
        biggest31576=ends[6];
      }
      if(ends[7]>=biggest31576){
        biggest31576=ends[7];
      }
      if(biggest31576 == 1){
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
    }
    else {
      S30217=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread31572(int [] tdone, int [] ends){
        S30206=1;
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

  public void thread31571(int [] tdone, int [] ends){
        S30251=1;
    thread31572(tdone,ends);
    thread31573(tdone,ends);
    thread31577(tdone,ends);
    int biggest31578 = 0;
    if(ends[4]>=biggest31578){
      biggest31578=ends[4];
    }
    if(ends[5]>=biggest31578){
      biggest31578=ends[5];
    }
    if(ends[8]>=biggest31578){
      biggest31578=ends[8];
    }
    if(biggest31578 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread31570(int [] tdone, int [] ends){
        S30198=1;
    S30130=0;
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
      switch(S30404){
        case 0 : 
          S30404=0;
          break RUN;
        
        case 1 : 
          S30404=2;
          S30404=2;
          new Thread(new GUI()).start();//sysj\conveyor_plant.sysj line: 11, column: 2
          thread31570(tdone,ends);
          thread31571(tdone,ends);
          int biggest31579 = 0;
          if(ends[2]>=biggest31579){
            biggest31579=ends[2];
          }
          if(ends[3]>=biggest31579){
            biggest31579=ends[3];
          }
          if(biggest31579 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread31580(tdone,ends);
          thread31581(tdone,ends);
          int biggest31592 = 0;
          if(ends[2]>=biggest31592){
            biggest31592=ends[2];
          }
          if(ends[3]>=biggest31592){
            biggest31592=ends[3];
          }
          if(biggest31592 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest31592 == 0){
            S30404=0;
            active[1]=0;
            ends[1]=0;
            S30404=0;
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
