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
  private int S16609 = 1;
  private int S16235 = 1;
  private int S15999 = 1;
  private int S15972 = 1;
  private int S16004 = 1;
  private int S16007 = 1;
  private int S16288 = 1;
  private int S16243 = 1;
  private int S16278 = 1;
  private int S16254 = 1;
  private int S16248 = 1;
  private int S16251 = 1;
  private int S16286 = 1;
  
  private int[] ends = new int[28];
  private int[] tdone = new int[28];
  
  public void thread16776(int [] tdone, int [] ends){
        switch(S16286){
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

  public void thread16774(int [] tdone, int [] ends){
        S16251=1;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread16773(int [] tdone, int [] ends){
        S16248=1;
    bottleAtPos1E.setPresent();//sysj\conveyor_plant.sysj line: 45, column: 30
    currsigs.addElement(bottleAtPos1E);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread16771(int [] tdone, int [] ends){
        switch(S16251){
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

  public void thread16770(int [] tdone, int [] ends){
        switch(S16248){
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

  public void thread16769(int [] tdone, int [] ends){
        switch(S16278){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S16254){
          case 0 : 
            thread16770(tdone,ends);
            thread16771(tdone,ends);
            int biggest16772 = 0;
            if(ends[8]>=biggest16772){
              biggest16772=ends[8];
            }
            if(ends[9]>=biggest16772){
              biggest16772=ends[9];
            }
            if(biggest16772 == 1){
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            if(biggest16772 == 2){
              ends[7]=2;
              ;//sysj\conveyor_plant.sysj line: 43, column: 22
              S16254=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            //FINXME code
            if(biggest16772 == 0){
              S16254=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            S16254=1;
            S16254=0;
            if(bottleAtPos1.getprestatus()){//sysj\conveyor_plant.sysj line: 42, column: 26
              thread16773(tdone,ends);
              thread16774(tdone,ends);
              int biggest16775 = 0;
              if(ends[8]>=biggest16775){
                biggest16775=ends[8];
              }
              if(ends[9]>=biggest16775){
                biggest16775=ends[9];
              }
              if(biggest16775 == 1){
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
            }
            else {
              S16254=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread16768(int [] tdone, int [] ends){
        switch(S16243){
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

  public void thread16767(int [] tdone, int [] ends){
        switch(S16288){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        thread16768(tdone,ends);
        thread16769(tdone,ends);
        thread16776(tdone,ends);
        int biggest16777 = 0;
        if(ends[6]>=biggest16777){
          biggest16777=ends[6];
        }
        if(ends[7]>=biggest16777){
          biggest16777=ends[7];
        }
        if(ends[10]>=biggest16777){
          biggest16777=ends[10];
        }
        if(biggest16777 == 1){
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        //FINXME code
        if(biggest16777 == 0){
          S16288=0;
          active[5]=0;
          ends[5]=0;
          tdone[5]=1;
        }
        break;
      
    }
  }

  public void thread16765(int [] tdone, int [] ends){
        switch(S16007){
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

  public void thread16764(int [] tdone, int [] ends){
        switch(S16004){
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

  public void thread16762(int [] tdone, int [] ends){
        S16007=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread16761(int [] tdone, int [] ends){
        S16004=1;
    bottleAtPos1.setPresent();//sysj\conveyor_plant.sysj line: 20, column: 18
    currsigs.addElement(bottleAtPos1);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread16759(int [] tdone, int [] ends){
        S16007=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread16758(int [] tdone, int [] ends){
        S16004=1;
    bottleAtPos1.setPresent();//sysj\conveyor_plant.sysj line: 20, column: 18
    currsigs.addElement(bottleAtPos1);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread16756(int [] tdone, int [] ends){
        S16007=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread16755(int [] tdone, int [] ends){
        S16004=1;
    bottleAtPos1.setPresent();//sysj\conveyor_plant.sysj line: 20, column: 18
    currsigs.addElement(bottleAtPos1);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread16754(int [] tdone, int [] ends){
        switch(S16235){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S15999){
          case 0 : 
            if(motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 15, column: 16
              S15999=1;
              __start_thread_2 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 13, column: 7
              S15972=0;
              if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 13, column: 7
                ends[2]=2;
                ;//sysj\conveyor_plant.sysj line: 13, column: 7
                S15999=2;
                thread16755(tdone,ends);
                thread16756(tdone,ends);
                int biggest16757 = 0;
                if(ends[3]>=biggest16757){
                  biggest16757=ends[3];
                }
                if(ends[4]>=biggest16757){
                  biggest16757=ends[4];
                }
                if(biggest16757 == 1){
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
              else {
                S15972=1;
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
            switch(S15972){
              case 0 : 
                S15972=0;
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 13, column: 7
                  ends[2]=2;
                  ;//sysj\conveyor_plant.sysj line: 13, column: 7
                  S15999=2;
                  thread16758(tdone,ends);
                  thread16759(tdone,ends);
                  int biggest16760 = 0;
                  if(ends[3]>=biggest16760){
                    biggest16760=ends[3];
                  }
                  if(ends[4]>=biggest16760){
                    biggest16760=ends[4];
                  }
                  if(biggest16760 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  S15972=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 1 : 
                S15972=1;
                S15972=0;
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 13, column: 7
                  ends[2]=2;
                  ;//sysj\conveyor_plant.sysj line: 13, column: 7
                  S15999=2;
                  thread16761(tdone,ends);
                  thread16762(tdone,ends);
                  int biggest16763 = 0;
                  if(ends[3]>=biggest16763){
                    biggest16763=ends[3];
                  }
                  if(ends[4]>=biggest16763){
                    biggest16763=ends[4];
                  }
                  if(biggest16763 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  S15972=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
            }
            break;
          
          case 2 : 
            thread16764(tdone,ends);
            thread16765(tdone,ends);
            int biggest16766 = 0;
            if(ends[3]>=biggest16766){
              biggest16766=ends[3];
            }
            if(ends[4]>=biggest16766){
              biggest16766=ends[4];
            }
            if(biggest16766 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            if(biggest16766 == 2){
              ends[2]=2;
              ;//sysj\conveyor_plant.sysj line: 18, column: 10
              S15999=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            //FINXME code
            if(biggest16766 == 0){
              S15999=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread16751(int [] tdone, int [] ends){
        S16286=1;
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

  public void thread16749(int [] tdone, int [] ends){
        S16251=1;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread16748(int [] tdone, int [] ends){
        S16248=1;
    bottleAtPos1E.setPresent();//sysj\conveyor_plant.sysj line: 45, column: 30
    currsigs.addElement(bottleAtPos1E);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread16747(int [] tdone, int [] ends){
        S16278=1;
    S16254=0;
    if(bottleAtPos1.getprestatus()){//sysj\conveyor_plant.sysj line: 42, column: 26
      thread16748(tdone,ends);
      thread16749(tdone,ends);
      int biggest16750 = 0;
      if(ends[8]>=biggest16750){
        biggest16750=ends[8];
      }
      if(ends[9]>=biggest16750){
        biggest16750=ends[9];
      }
      if(biggest16750 == 1){
        active[7]=1;
        ends[7]=1;
        tdone[7]=1;
      }
    }
    else {
      S16254=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread16746(int [] tdone, int [] ends){
        S16243=1;
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

  public void thread16745(int [] tdone, int [] ends){
        S16288=1;
    thread16746(tdone,ends);
    thread16747(tdone,ends);
    thread16751(tdone,ends);
    int biggest16752 = 0;
    if(ends[6]>=biggest16752){
      biggest16752=ends[6];
    }
    if(ends[7]>=biggest16752){
      biggest16752=ends[7];
    }
    if(ends[10]>=biggest16752){
      biggest16752=ends[10];
    }
    if(biggest16752 == 1){
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread16744(int [] tdone, int [] ends){
        S16235=1;
    S15999=0;
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
      switch(S16609){
        case 0 : 
          S16609=0;
          break RUN;
        
        case 1 : 
          S16609=2;
          S16609=2;
          new Thread(new GUI()).start();//sysj\conveyor_plant.sysj line: 11, column: 2
          thread16744(tdone,ends);
          thread16745(tdone,ends);
          int biggest16753 = 0;
          if(ends[2]>=biggest16753){
            biggest16753=ends[2];
          }
          if(ends[5]>=biggest16753){
            biggest16753=ends[5];
          }
          if(biggest16753 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread16754(tdone,ends);
          thread16767(tdone,ends);
          int biggest16778 = 0;
          if(ends[2]>=biggest16778){
            biggest16778=ends[2];
          }
          if(ends[5]>=biggest16778){
            biggest16778=ends[5];
          }
          if(biggest16778 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest16778 == 0){
            S16609=0;
            active[1]=0;
            ends[1]=0;
            S16609=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
