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
  private long __start_thread_7;//sysj\conveyor_plant.sysj line: 34, column: 26
  private int S2312 = 1;
  private int S2034 = 1;
  private int S1972 = 1;
  private int S1945 = 1;
  private int S2126 = 1;
  private int S2042 = 1;
  private int S2116 = 1;
  private int S2066 = 1;
  private int S2047 = 1;
  private int S2063 = 1;
  private int S2124 = 1;
  
  private int[] ends = new int[9];
  private int[] tdone = new int[9];
  
  public void thread2334(int [] tdone, int [] ends){
        switch(S2124){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(bottleLeftPos5.getprestatus()){//sysj\conveyor_plant.sysj line: 44, column: 31
          bottleLeftPos5E.setPresent();//sysj\conveyor_plant.sysj line: 44, column: 47
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

  public void thread2332(int [] tdone, int [] ends){
        S2063=1;
    __start_thread_7 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 34, column: 26
    if(com.systemj.Timer.getMs() - __start_thread_7 >= 1000){//sysj\conveyor_plant.sysj line: 34, column: 26
      ends[7]=3;
      ;//sysj\conveyor_plant.sysj line: 34, column: 26
      ends[7]=2;
      tdone[7]=1;
    }
    else {
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread2331(int [] tdone, int [] ends){
        S2047=1;
    bottleAtPos1E.setPresent();//sysj\conveyor_plant.sysj line: 31, column: 30
    currsigs.addElement(bottleAtPos1E);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread2329(int [] tdone, int [] ends){
        switch(S2063){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_7 >= 1000){//sysj\conveyor_plant.sysj line: 34, column: 26
          ends[7]=3;
          ;//sysj\conveyor_plant.sysj line: 34, column: 26
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

  public void thread2328(int [] tdone, int [] ends){
        switch(S2047){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        bottleAtPos1E.setPresent();//sysj\conveyor_plant.sysj line: 31, column: 30
        currsigs.addElement(bottleAtPos1E);
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
        break;
      
    }
  }

  public void thread2327(int [] tdone, int [] ends){
        switch(S2116){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S2066){
          case 0 : 
            thread2328(tdone,ends);
            thread2329(tdone,ends);
            int biggest2330 = 0;
            if(ends[6]>=biggest2330){
              biggest2330=ends[6];
            }
            if(ends[7]>=biggest2330){
              biggest2330=ends[7];
            }
            if(biggest2330 == 1){
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            if(biggest2330 == 2){
              ends[5]=2;
              ;//sysj\conveyor_plant.sysj line: 29, column: 22
              S2066=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            //FINXME code
            if(biggest2330 == 0){
              S2066=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            S2066=1;
            S2066=0;
            if(bottleAtPos1.getprestatus()){//sysj\conveyor_plant.sysj line: 28, column: 26
              thread2331(tdone,ends);
              thread2332(tdone,ends);
              int biggest2333 = 0;
              if(ends[6]>=biggest2333){
                biggest2333=ends[6];
              }
              if(ends[7]>=biggest2333){
                biggest2333=ends[7];
              }
              if(biggest2333 == 1){
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              if(biggest2333 == 2){
                ends[5]=2;
                ;//sysj\conveyor_plant.sysj line: 29, column: 22
                S2066=1;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
            }
            else {
              S2066=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2326(int [] tdone, int [] ends){
        switch(S2042){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 24, column: 31
          motConveyorOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 24, column: 49
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

  public void thread2325(int [] tdone, int [] ends){
        switch(S2126){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread2326(tdone,ends);
        thread2327(tdone,ends);
        thread2334(tdone,ends);
        int biggest2335 = 0;
        if(ends[4]>=biggest2335){
          biggest2335=ends[4];
        }
        if(ends[5]>=biggest2335){
          biggest2335=ends[5];
        }
        if(ends[8]>=biggest2335){
          biggest2335=ends[8];
        }
        if(biggest2335 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest2335 == 0){
          S2126=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread2324(int [] tdone, int [] ends){
        switch(S2034){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S1972){
          case 0 : 
            if(motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 15, column: 16
              S1972=1;
              __start_thread_2 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 13, column: 7
              S1945=0;
              if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 13, column: 7
                ends[2]=2;
                ;//sysj\conveyor_plant.sysj line: 13, column: 7
                bottleAtPos1.setPresent();//sysj\conveyor_plant.sysj line: 17, column: 10
                currsigs.addElement(bottleAtPos1);
                System.out.println("*Bottle At Pos1*");//sysj\conveyor_plant.sysj line: 18, column: 10
                S1972=2;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S1945=1;
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
            switch(S1945){
              case 0 : 
                S1945=0;
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 13, column: 7
                  ends[2]=2;
                  ;//sysj\conveyor_plant.sysj line: 13, column: 7
                  bottleAtPos1.setPresent();//sysj\conveyor_plant.sysj line: 17, column: 10
                  currsigs.addElement(bottleAtPos1);
                  System.out.println("*Bottle At Pos1*");//sysj\conveyor_plant.sysj line: 18, column: 10
                  S1972=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S1945=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 1 : 
                S1945=1;
                S1945=0;
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 13, column: 7
                  ends[2]=2;
                  ;//sysj\conveyor_plant.sysj line: 13, column: 7
                  bottleAtPos1.setPresent();//sysj\conveyor_plant.sysj line: 17, column: 10
                  currsigs.addElement(bottleAtPos1);
                  System.out.println("*Bottle At Pos1*");//sysj\conveyor_plant.sysj line: 18, column: 10
                  S1972=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S1945=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
            }
            break;
          
          case 2 : 
            S1972=2;
            S1972=0;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread2321(int [] tdone, int [] ends){
        S2124=1;
    if(bottleLeftPos5.getprestatus()){//sysj\conveyor_plant.sysj line: 44, column: 31
      bottleLeftPos5E.setPresent();//sysj\conveyor_plant.sysj line: 44, column: 47
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

  public void thread2319(int [] tdone, int [] ends){
        S2063=1;
    __start_thread_7 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 34, column: 26
    if(com.systemj.Timer.getMs() - __start_thread_7 >= 1000){//sysj\conveyor_plant.sysj line: 34, column: 26
      ends[7]=3;
      ;//sysj\conveyor_plant.sysj line: 34, column: 26
      ends[7]=2;
      tdone[7]=1;
    }
    else {
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread2318(int [] tdone, int [] ends){
        S2047=1;
    bottleAtPos1E.setPresent();//sysj\conveyor_plant.sysj line: 31, column: 30
    currsigs.addElement(bottleAtPos1E);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread2317(int [] tdone, int [] ends){
        S2116=1;
    S2066=0;
    if(bottleAtPos1.getprestatus()){//sysj\conveyor_plant.sysj line: 28, column: 26
      thread2318(tdone,ends);
      thread2319(tdone,ends);
      int biggest2320 = 0;
      if(ends[6]>=biggest2320){
        biggest2320=ends[6];
      }
      if(ends[7]>=biggest2320){
        biggest2320=ends[7];
      }
      if(biggest2320 == 1){
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
      if(biggest2320 == 2){
        ends[5]=2;
        ;//sysj\conveyor_plant.sysj line: 29, column: 22
        S2066=1;
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
    }
    else {
      S2066=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread2316(int [] tdone, int [] ends){
        S2042=1;
    if(motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 24, column: 31
      motConveyorOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 24, column: 49
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

  public void thread2315(int [] tdone, int [] ends){
        S2126=1;
    thread2316(tdone,ends);
    thread2317(tdone,ends);
    thread2321(tdone,ends);
    int biggest2322 = 0;
    if(ends[4]>=biggest2322){
      biggest2322=ends[4];
    }
    if(ends[5]>=biggest2322){
      biggest2322=ends[5];
    }
    if(ends[8]>=biggest2322){
      biggest2322=ends[8];
    }
    if(biggest2322 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread2314(int [] tdone, int [] ends){
        S2034=1;
    S1972=0;
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
      switch(S2312){
        case 0 : 
          S2312=0;
          break RUN;
        
        case 1 : 
          S2312=2;
          S2312=2;
          new Thread(new GUI()).start();//sysj\conveyor_plant.sysj line: 11, column: 2
          thread2314(tdone,ends);
          thread2315(tdone,ends);
          int biggest2323 = 0;
          if(ends[2]>=biggest2323){
            biggest2323=ends[2];
          }
          if(ends[3]>=biggest2323){
            biggest2323=ends[3];
          }
          if(biggest2323 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread2324(tdone,ends);
          thread2325(tdone,ends);
          int biggest2336 = 0;
          if(ends[2]>=biggest2336){
            biggest2336=ends[2];
          }
          if(ends[3]>=biggest2336){
            biggest2336=ends[3];
          }
          if(biggest2336 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest2336 == 0){
            S2312=0;
            active[1]=0;
            ends[1]=0;
            S2312=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0};
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
