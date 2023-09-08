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
  private int S19595 = 1;
  private int S19221 = 1;
  private int S18985 = 1;
  private int S18958 = 1;
  private int S18990 = 1;
  private int S18993 = 1;
  private int S19274 = 1;
  private int S19229 = 1;
  private int S19264 = 1;
  private int S19240 = 1;
  private int S19234 = 1;
  private int S19237 = 1;
  private int S19272 = 1;
  
  private int[] ends = new int[27];
  private int[] tdone = new int[27];
  
  public void thread20049(int [] tdone, int [] ends){
        switch(S19272){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(bottleLeftPos5.getprestatus()){//sysj\conveyor_plant.sysj line: 58, column: 31
          bottleLeftPos5E.setPresent();//sysj\conveyor_plant.sysj line: 58, column: 47
          currsigs.addElement(bottleLeftPos5E);
          active[10]=1;
          ends[10]=1;
          tdone[10]=1;
        }
        else {
          active[10]=1;
          ends[10]=1;
          tdone[10]=1;
        }
        break;
      
    }
  }

  public void thread20047(int [] tdone, int [] ends){
        S19237=1;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread20046(int [] tdone, int [] ends){
        S19234=1;
    bottleAtPos1E.setPresent();//sysj\conveyor_plant.sysj line: 45, column: 30
    currsigs.addElement(bottleAtPos1E);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread20044(int [] tdone, int [] ends){
        switch(S19237){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 49, column: 34
          ends[9]=2;
          tdone[9]=1;
        }
        else {
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        break;
      
    }
  }

  public void thread20043(int [] tdone, int [] ends){
        switch(S19234){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        bottleAtPos1E.setPresent();//sysj\conveyor_plant.sysj line: 45, column: 30
        currsigs.addElement(bottleAtPos1E);
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
        break;
      
    }
  }

  public void thread20042(int [] tdone, int [] ends){
        switch(S19264){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S19240){
          case 0 : 
            thread20043(tdone,ends);
            thread20044(tdone,ends);
            int biggest20045 = 0;
            if(ends[8]>=biggest20045){
              biggest20045=ends[8];
            }
            if(ends[9]>=biggest20045){
              biggest20045=ends[9];
            }
            if(biggest20045 == 1){
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            if(biggest20045 == 2){
              ends[7]=2;
              ;//sysj\conveyor_plant.sysj line: 43, column: 22
              S19240=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            //FINXME code
            if(biggest20045 == 0){
              S19240=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            S19240=1;
            S19240=0;
            if(bottleAtPos1.getprestatus()){//sysj\conveyor_plant.sysj line: 42, column: 26
              thread20046(tdone,ends);
              thread20047(tdone,ends);
              int biggest20048 = 0;
              if(ends[8]>=biggest20048){
                biggest20048=ends[8];
              }
              if(ends[9]>=biggest20048){
                biggest20048=ends[9];
              }
              if(biggest20048 == 1){
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
            }
            else {
              S19240=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread20041(int [] tdone, int [] ends){
        switch(S19229){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 38, column: 31
          motConveyorOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 38, column: 49
          currsigs.addElement(motConveyorOnOffE);
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        else {
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread20040(int [] tdone, int [] ends){
        switch(S19274){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        thread20041(tdone,ends);
        thread20042(tdone,ends);
        thread20049(tdone,ends);
        int biggest20050 = 0;
        if(ends[6]>=biggest20050){
          biggest20050=ends[6];
        }
        if(ends[7]>=biggest20050){
          biggest20050=ends[7];
        }
        if(ends[10]>=biggest20050){
          biggest20050=ends[10];
        }
        if(biggest20050 == 1){
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        //FINXME code
        if(biggest20050 == 0){
          S19274=0;
          active[5]=0;
          ends[5]=0;
          tdone[5]=1;
        }
        break;
      
    }
  }

  public void thread20038(int [] tdone, int [] ends){
        switch(S18993){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(!motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 25, column: 24
          ends[4]=2;
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

  public void thread20037(int [] tdone, int [] ends){
        switch(S18990){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        bottleAtPos1.setPresent();//sysj\conveyor_plant.sysj line: 20, column: 18
        currsigs.addElement(bottleAtPos1);
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
        break;
      
    }
  }

  public void thread20035(int [] tdone, int [] ends){
        S18993=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread20034(int [] tdone, int [] ends){
        S18990=1;
    bottleAtPos1.setPresent();//sysj\conveyor_plant.sysj line: 20, column: 18
    currsigs.addElement(bottleAtPos1);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread20032(int [] tdone, int [] ends){
        S18993=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread20031(int [] tdone, int [] ends){
        S18990=1;
    bottleAtPos1.setPresent();//sysj\conveyor_plant.sysj line: 20, column: 18
    currsigs.addElement(bottleAtPos1);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread20029(int [] tdone, int [] ends){
        S18993=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread20028(int [] tdone, int [] ends){
        S18990=1;
    bottleAtPos1.setPresent();//sysj\conveyor_plant.sysj line: 20, column: 18
    currsigs.addElement(bottleAtPos1);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread20027(int [] tdone, int [] ends){
        switch(S19221){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S18985){
          case 0 : 
            if(motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 15, column: 16
              S18985=1;
              __start_thread_2 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 13, column: 7
              S18958=0;
              if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 13, column: 7
                ends[2]=2;
                ;//sysj\conveyor_plant.sysj line: 13, column: 7
                S18985=2;
                thread20028(tdone,ends);
                thread20029(tdone,ends);
                int biggest20030 = 0;
                if(ends[3]>=biggest20030){
                  biggest20030=ends[3];
                }
                if(ends[4]>=biggest20030){
                  biggest20030=ends[4];
                }
                if(biggest20030 == 1){
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
              else {
                S18958=1;
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
            switch(S18958){
              case 0 : 
                S18958=0;
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 13, column: 7
                  ends[2]=2;
                  ;//sysj\conveyor_plant.sysj line: 13, column: 7
                  S18985=2;
                  thread20031(tdone,ends);
                  thread20032(tdone,ends);
                  int biggest20033 = 0;
                  if(ends[3]>=biggest20033){
                    biggest20033=ends[3];
                  }
                  if(ends[4]>=biggest20033){
                    biggest20033=ends[4];
                  }
                  if(biggest20033 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  S18958=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 1 : 
                S18958=1;
                S18958=0;
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 13, column: 7
                  ends[2]=2;
                  ;//sysj\conveyor_plant.sysj line: 13, column: 7
                  S18985=2;
                  thread20034(tdone,ends);
                  thread20035(tdone,ends);
                  int biggest20036 = 0;
                  if(ends[3]>=biggest20036){
                    biggest20036=ends[3];
                  }
                  if(ends[4]>=biggest20036){
                    biggest20036=ends[4];
                  }
                  if(biggest20036 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  S18958=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
            }
            break;
          
          case 2 : 
            thread20037(tdone,ends);
            thread20038(tdone,ends);
            int biggest20039 = 0;
            if(ends[3]>=biggest20039){
              biggest20039=ends[3];
            }
            if(ends[4]>=biggest20039){
              biggest20039=ends[4];
            }
            if(biggest20039 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            if(biggest20039 == 2){
              ends[2]=2;
              ;//sysj\conveyor_plant.sysj line: 18, column: 10
              S18985=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            //FINXME code
            if(biggest20039 == 0){
              S18985=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread20024(int [] tdone, int [] ends){
        S19272=1;
    if(bottleLeftPos5.getprestatus()){//sysj\conveyor_plant.sysj line: 58, column: 31
      bottleLeftPos5E.setPresent();//sysj\conveyor_plant.sysj line: 58, column: 47
      currsigs.addElement(bottleLeftPos5E);
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread20022(int [] tdone, int [] ends){
        S19237=1;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread20021(int [] tdone, int [] ends){
        S19234=1;
    bottleAtPos1E.setPresent();//sysj\conveyor_plant.sysj line: 45, column: 30
    currsigs.addElement(bottleAtPos1E);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread20020(int [] tdone, int [] ends){
        S19264=1;
    S19240=0;
    if(bottleAtPos1.getprestatus()){//sysj\conveyor_plant.sysj line: 42, column: 26
      thread20021(tdone,ends);
      thread20022(tdone,ends);
      int biggest20023 = 0;
      if(ends[8]>=biggest20023){
        biggest20023=ends[8];
      }
      if(ends[9]>=biggest20023){
        biggest20023=ends[9];
      }
      if(biggest20023 == 1){
        active[7]=1;
        ends[7]=1;
        tdone[7]=1;
      }
    }
    else {
      S19240=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread20019(int [] tdone, int [] ends){
        S19229=1;
    if(motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 38, column: 31
      motConveyorOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 38, column: 49
      currsigs.addElement(motConveyorOnOffE);
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread20018(int [] tdone, int [] ends){
        S19274=1;
    thread20019(tdone,ends);
    thread20020(tdone,ends);
    thread20024(tdone,ends);
    int biggest20025 = 0;
    if(ends[6]>=biggest20025){
      biggest20025=ends[6];
    }
    if(ends[7]>=biggest20025){
      biggest20025=ends[7];
    }
    if(ends[10]>=biggest20025){
      biggest20025=ends[10];
    }
    if(biggest20025 == 1){
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread20017(int [] tdone, int [] ends){
        S19221=1;
    S18985=0;
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
      switch(S19595){
        case 0 : 
          S19595=0;
          break RUN;
        
        case 1 : 
          S19595=2;
          S19595=2;
          new Thread(new GUI()).start();//sysj\conveyor_plant.sysj line: 11, column: 2
          thread20017(tdone,ends);
          thread20018(tdone,ends);
          int biggest20026 = 0;
          if(ends[2]>=biggest20026){
            biggest20026=ends[2];
          }
          if(ends[5]>=biggest20026){
            biggest20026=ends[5];
          }
          if(biggest20026 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread20027(tdone,ends);
          thread20040(tdone,ends);
          int biggest20051 = 0;
          if(ends[2]>=biggest20051){
            biggest20051=ends[2];
          }
          if(ends[5]>=biggest20051){
            biggest20051=ends[5];
          }
          if(biggest20051 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest20051 == 0){
            S19595=0;
            active[1]=0;
            ends[1]=0;
            S19595=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
