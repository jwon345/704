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
  private int S2723 = 1;
  private int S2445 = 1;
  private int S2383 = 1;
  private int S2356 = 1;
  private int S2537 = 1;
  private int S2453 = 1;
  private int S2527 = 1;
  private int S2477 = 1;
  private int S2458 = 1;
  private int S2474 = 1;
  private int S2535 = 1;
  
  private int[] ends = new int[9];
  private int[] tdone = new int[9];
  
  public void thread2745(int [] tdone, int [] ends){
        switch(S2535){
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

  public void thread2743(int [] tdone, int [] ends){
        S2474=1;
    __start_thread_7 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 34, column: 26
    if(com.systemj.Timer.getMs() - __start_thread_7 >= 800){//sysj\conveyor_plant.sysj line: 34, column: 26
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

  public void thread2742(int [] tdone, int [] ends){
        S2458=1;
    bottleAtPos1E.setPresent();//sysj\conveyor_plant.sysj line: 31, column: 30
    currsigs.addElement(bottleAtPos1E);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread2740(int [] tdone, int [] ends){
        switch(S2474){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_7 >= 800){//sysj\conveyor_plant.sysj line: 34, column: 26
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

  public void thread2739(int [] tdone, int [] ends){
        switch(S2458){
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

  public void thread2738(int [] tdone, int [] ends){
        switch(S2527){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S2477){
          case 0 : 
            thread2739(tdone,ends);
            thread2740(tdone,ends);
            int biggest2741 = 0;
            if(ends[6]>=biggest2741){
              biggest2741=ends[6];
            }
            if(ends[7]>=biggest2741){
              biggest2741=ends[7];
            }
            if(biggest2741 == 1){
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            if(biggest2741 == 2){
              ends[5]=2;
              ;//sysj\conveyor_plant.sysj line: 29, column: 22
              S2477=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            //FINXME code
            if(biggest2741 == 0){
              S2477=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            S2477=1;
            S2477=0;
            if(bottleAtPos1.getprestatus()){//sysj\conveyor_plant.sysj line: 28, column: 26
              thread2742(tdone,ends);
              thread2743(tdone,ends);
              int biggest2744 = 0;
              if(ends[6]>=biggest2744){
                biggest2744=ends[6];
              }
              if(ends[7]>=biggest2744){
                biggest2744=ends[7];
              }
              if(biggest2744 == 1){
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              if(biggest2744 == 2){
                ends[5]=2;
                ;//sysj\conveyor_plant.sysj line: 29, column: 22
                S2477=1;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
            }
            else {
              S2477=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2737(int [] tdone, int [] ends){
        switch(S2453){
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

  public void thread2736(int [] tdone, int [] ends){
        switch(S2537){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread2737(tdone,ends);
        thread2738(tdone,ends);
        thread2745(tdone,ends);
        int biggest2746 = 0;
        if(ends[4]>=biggest2746){
          biggest2746=ends[4];
        }
        if(ends[5]>=biggest2746){
          biggest2746=ends[5];
        }
        if(ends[8]>=biggest2746){
          biggest2746=ends[8];
        }
        if(biggest2746 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest2746 == 0){
          S2537=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread2735(int [] tdone, int [] ends){
        switch(S2445){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S2383){
          case 0 : 
            if(motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 15, column: 16
              S2383=1;
              __start_thread_2 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 13, column: 7
              S2356=0;
              if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 13, column: 7
                ends[2]=2;
                ;//sysj\conveyor_plant.sysj line: 13, column: 7
                bottleAtPos1.setPresent();//sysj\conveyor_plant.sysj line: 17, column: 10
                currsigs.addElement(bottleAtPos1);
                System.out.println("*Bottle At Pos1*");//sysj\conveyor_plant.sysj line: 18, column: 10
                S2383=2;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S2356=1;
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
            switch(S2356){
              case 0 : 
                S2356=0;
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 13, column: 7
                  ends[2]=2;
                  ;//sysj\conveyor_plant.sysj line: 13, column: 7
                  bottleAtPos1.setPresent();//sysj\conveyor_plant.sysj line: 17, column: 10
                  currsigs.addElement(bottleAtPos1);
                  System.out.println("*Bottle At Pos1*");//sysj\conveyor_plant.sysj line: 18, column: 10
                  S2383=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S2356=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 1 : 
                S2356=1;
                S2356=0;
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 13, column: 7
                  ends[2]=2;
                  ;//sysj\conveyor_plant.sysj line: 13, column: 7
                  bottleAtPos1.setPresent();//sysj\conveyor_plant.sysj line: 17, column: 10
                  currsigs.addElement(bottleAtPos1);
                  System.out.println("*Bottle At Pos1*");//sysj\conveyor_plant.sysj line: 18, column: 10
                  S2383=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S2356=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
            }
            break;
          
          case 2 : 
            S2383=2;
            S2383=0;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread2732(int [] tdone, int [] ends){
        S2535=1;
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

  public void thread2730(int [] tdone, int [] ends){
        S2474=1;
    __start_thread_7 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 34, column: 26
    if(com.systemj.Timer.getMs() - __start_thread_7 >= 800){//sysj\conveyor_plant.sysj line: 34, column: 26
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

  public void thread2729(int [] tdone, int [] ends){
        S2458=1;
    bottleAtPos1E.setPresent();//sysj\conveyor_plant.sysj line: 31, column: 30
    currsigs.addElement(bottleAtPos1E);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread2728(int [] tdone, int [] ends){
        S2527=1;
    S2477=0;
    if(bottleAtPos1.getprestatus()){//sysj\conveyor_plant.sysj line: 28, column: 26
      thread2729(tdone,ends);
      thread2730(tdone,ends);
      int biggest2731 = 0;
      if(ends[6]>=biggest2731){
        biggest2731=ends[6];
      }
      if(ends[7]>=biggest2731){
        biggest2731=ends[7];
      }
      if(biggest2731 == 1){
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
      if(biggest2731 == 2){
        ends[5]=2;
        ;//sysj\conveyor_plant.sysj line: 29, column: 22
        S2477=1;
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
    }
    else {
      S2477=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread2727(int [] tdone, int [] ends){
        S2453=1;
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

  public void thread2726(int [] tdone, int [] ends){
        S2537=1;
    thread2727(tdone,ends);
    thread2728(tdone,ends);
    thread2732(tdone,ends);
    int biggest2733 = 0;
    if(ends[4]>=biggest2733){
      biggest2733=ends[4];
    }
    if(ends[5]>=biggest2733){
      biggest2733=ends[5];
    }
    if(ends[8]>=biggest2733){
      biggest2733=ends[8];
    }
    if(biggest2733 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread2725(int [] tdone, int [] ends){
        S2445=1;
    S2383=0;
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
      switch(S2723){
        case 0 : 
          S2723=0;
          break RUN;
        
        case 1 : 
          S2723=2;
          S2723=2;
          new Thread(new GUI()).start();//sysj\conveyor_plant.sysj line: 11, column: 2
          thread2725(tdone,ends);
          thread2726(tdone,ends);
          int biggest2734 = 0;
          if(ends[2]>=biggest2734){
            biggest2734=ends[2];
          }
          if(ends[3]>=biggest2734){
            biggest2734=ends[3];
          }
          if(biggest2734 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread2735(tdone,ends);
          thread2736(tdone,ends);
          int biggest2747 = 0;
          if(ends[2]>=biggest2747){
            biggest2747=ends[2];
          }
          if(ends[3]>=biggest2747){
            biggest2747=ends[3];
          }
          if(biggest2747 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest2747 == 0){
            S2723=0;
            active[1]=0;
            ends[1]=0;
            S2723=0;
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
