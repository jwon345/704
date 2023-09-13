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
  private int S211174 = 1;
  private int S210980 = 1;
  private int S210974 = 1;
  private int S211072 = 1;
  private int S210988 = 1;
  private int S210982 = 1;
  private int S211062 = 1;
  private int S211012 = 1;
  private int S210993 = 1;
  private int S211009 = 1;
  private int S211070 = 1;
  
  private int[] ends = new int[49];
  private int[] tdone = new int[49];
  
  public void thread212495(int [] tdone, int [] ends){
        switch(S211070){
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

  public void thread212493(int [] tdone, int [] ends){
        S211009=1;
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

  public void thread212492(int [] tdone, int [] ends){
        S210993=1;
    bottleAtPos1E.setPresent();//sysj\conveyor_plant.sysj line: 35, column: 30
    currsigs.addElement(bottleAtPos1E);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread212490(int [] tdone, int [] ends){
        switch(S211009){
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

  public void thread212489(int [] tdone, int [] ends){
        switch(S210993){
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

  public void thread212488(int [] tdone, int [] ends){
        switch(S211062){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S211012){
          case 0 : 
            thread212489(tdone,ends);
            thread212490(tdone,ends);
            int biggest212491 = 0;
            if(ends[6]>=biggest212491){
              biggest212491=ends[6];
            }
            if(ends[7]>=biggest212491){
              biggest212491=ends[7];
            }
            if(biggest212491 == 1){
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            if(biggest212491 == 2){
              ends[5]=2;
              ;//sysj\conveyor_plant.sysj line: 33, column: 22
              S211012=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            //FINXME code
            if(biggest212491 == 0){
              S211012=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            S211012=1;
            S211012=0;
            if(bottleAtPos1.getprestatus()){//sysj\conveyor_plant.sysj line: 32, column: 26
              thread212492(tdone,ends);
              thread212493(tdone,ends);
              int biggest212494 = 0;
              if(ends[6]>=biggest212494){
                biggest212494=ends[6];
              }
              if(ends[7]>=biggest212494){
                biggest212494=ends[7];
              }
              if(biggest212494 == 1){
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              if(biggest212494 == 2){
                ends[5]=2;
                ;//sysj\conveyor_plant.sysj line: 33, column: 22
                S211012=1;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
            }
            else {
              S211012=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread212487(int [] tdone, int [] ends){
        switch(S210988){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S210982){
          case 0 : 
            S210982=0;
            if(motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 28, column: 31
              motConveyorOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 28, column: 49
              currsigs.addElement(motConveyorOnOffE);
              S210982=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S210982=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            S210982=1;
            S210982=0;
            if(motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 28, column: 31
              motConveyorOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 28, column: 49
              currsigs.addElement(motConveyorOnOffE);
              S210982=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S210982=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread212486(int [] tdone, int [] ends){
        switch(S211072){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread212487(tdone,ends);
        thread212488(tdone,ends);
        thread212495(tdone,ends);
        int biggest212496 = 0;
        if(ends[4]>=biggest212496){
          biggest212496=ends[4];
        }
        if(ends[5]>=biggest212496){
          biggest212496=ends[5];
        }
        if(ends[8]>=biggest212496){
          biggest212496=ends[8];
        }
        if(biggest212496 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest212496 == 0){
          S211072=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread212485(int [] tdone, int [] ends){
        switch(S210980){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S210974){
          case 0 : 
            if(motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 15, column: 16
              bottleAtPos1.setPresent();//sysj\conveyor_plant.sysj line: 17, column: 10
              currsigs.addElement(bottleAtPos1);
              S210974=1;
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
            S210974=1;
            S210974=0;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread212482(int [] tdone, int [] ends){
        S211070=1;
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

  public void thread212480(int [] tdone, int [] ends){
        S211009=1;
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

  public void thread212479(int [] tdone, int [] ends){
        S210993=1;
    bottleAtPos1E.setPresent();//sysj\conveyor_plant.sysj line: 35, column: 30
    currsigs.addElement(bottleAtPos1E);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread212478(int [] tdone, int [] ends){
        S211062=1;
    S211012=0;
    if(bottleAtPos1.getprestatus()){//sysj\conveyor_plant.sysj line: 32, column: 26
      thread212479(tdone,ends);
      thread212480(tdone,ends);
      int biggest212481 = 0;
      if(ends[6]>=biggest212481){
        biggest212481=ends[6];
      }
      if(ends[7]>=biggest212481){
        biggest212481=ends[7];
      }
      if(biggest212481 == 1){
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
      if(biggest212481 == 2){
        ends[5]=2;
        ;//sysj\conveyor_plant.sysj line: 33, column: 22
        S211012=1;
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
    }
    else {
      S211012=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread212477(int [] tdone, int [] ends){
        S210988=1;
    S210982=0;
    if(motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 28, column: 31
      motConveyorOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 28, column: 49
      currsigs.addElement(motConveyorOnOffE);
      S210982=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S210982=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread212476(int [] tdone, int [] ends){
        S211072=1;
    thread212477(tdone,ends);
    thread212478(tdone,ends);
    thread212482(tdone,ends);
    int biggest212483 = 0;
    if(ends[4]>=biggest212483){
      biggest212483=ends[4];
    }
    if(ends[5]>=biggest212483){
      biggest212483=ends[5];
    }
    if(ends[8]>=biggest212483){
      biggest212483=ends[8];
    }
    if(biggest212483 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread212475(int [] tdone, int [] ends){
        S210980=1;
    S210974=0;
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
      switch(S211174){
        case 0 : 
          S211174=0;
          break RUN;
        
        case 1 : 
          S211174=2;
          S211174=2;
          new Thread(new GUI()).start();//sysj\conveyor_plant.sysj line: 11, column: 2
          thread212475(tdone,ends);
          thread212476(tdone,ends);
          int biggest212484 = 0;
          if(ends[2]>=biggest212484){
            biggest212484=ends[2];
          }
          if(ends[3]>=biggest212484){
            biggest212484=ends[3];
          }
          if(biggest212484 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread212485(tdone,ends);
          thread212486(tdone,ends);
          int biggest212497 = 0;
          if(ends[2]>=biggest212497){
            biggest212497=ends[2];
          }
          if(ends[3]>=biggest212497){
            biggest212497=ends[3];
          }
          if(biggest212497 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest212497 == 0){
            S211174=0;
            active[1]=0;
            ends[1]=0;
            S211174=0;
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
