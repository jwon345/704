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
  private int S25453 = 1;
  private int S25079 = 1;
  private int S24843 = 1;
  private int S24816 = 1;
  private int S24848 = 1;
  private int S24851 = 1;
  private int S25132 = 1;
  private int S25087 = 1;
  private int S25122 = 1;
  private int S25098 = 1;
  private int S25092 = 1;
  private int S25095 = 1;
  private int S25130 = 1;
  
  private int[] ends = new int[42];
  private int[] tdone = new int[42];
  
  public void thread26049(int [] tdone, int [] ends){
        switch(S25130){
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

  public void thread26047(int [] tdone, int [] ends){
        S25095=1;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread26046(int [] tdone, int [] ends){
        S25092=1;
    bottleAtPos1E.setPresent();//sysj\conveyor_plant.sysj line: 45, column: 30
    currsigs.addElement(bottleAtPos1E);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread26044(int [] tdone, int [] ends){
        switch(S25095){
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

  public void thread26043(int [] tdone, int [] ends){
        switch(S25092){
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

  public void thread26042(int [] tdone, int [] ends){
        switch(S25122){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S25098){
          case 0 : 
            thread26043(tdone,ends);
            thread26044(tdone,ends);
            int biggest26045 = 0;
            if(ends[8]>=biggest26045){
              biggest26045=ends[8];
            }
            if(ends[9]>=biggest26045){
              biggest26045=ends[9];
            }
            if(biggest26045 == 1){
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            if(biggest26045 == 2){
              ends[7]=2;
              ;//sysj\conveyor_plant.sysj line: 43, column: 22
              S25098=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            //FINXME code
            if(biggest26045 == 0){
              S25098=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            S25098=1;
            S25098=0;
            if(bottleAtPos1.getprestatus()){//sysj\conveyor_plant.sysj line: 42, column: 26
              thread26046(tdone,ends);
              thread26047(tdone,ends);
              int biggest26048 = 0;
              if(ends[8]>=biggest26048){
                biggest26048=ends[8];
              }
              if(ends[9]>=biggest26048){
                biggest26048=ends[9];
              }
              if(biggest26048 == 1){
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
            }
            else {
              S25098=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread26041(int [] tdone, int [] ends){
        switch(S25087){
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

  public void thread26040(int [] tdone, int [] ends){
        switch(S25132){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        thread26041(tdone,ends);
        thread26042(tdone,ends);
        thread26049(tdone,ends);
        int biggest26050 = 0;
        if(ends[6]>=biggest26050){
          biggest26050=ends[6];
        }
        if(ends[7]>=biggest26050){
          biggest26050=ends[7];
        }
        if(ends[10]>=biggest26050){
          biggest26050=ends[10];
        }
        if(biggest26050 == 1){
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        //FINXME code
        if(biggest26050 == 0){
          S25132=0;
          active[5]=0;
          ends[5]=0;
          tdone[5]=1;
        }
        break;
      
    }
  }

  public void thread26038(int [] tdone, int [] ends){
        switch(S24851){
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

  public void thread26037(int [] tdone, int [] ends){
        switch(S24848){
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

  public void thread26035(int [] tdone, int [] ends){
        S24851=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread26034(int [] tdone, int [] ends){
        S24848=1;
    bottleAtPos1.setPresent();//sysj\conveyor_plant.sysj line: 20, column: 18
    currsigs.addElement(bottleAtPos1);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread26032(int [] tdone, int [] ends){
        S24851=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread26031(int [] tdone, int [] ends){
        S24848=1;
    bottleAtPos1.setPresent();//sysj\conveyor_plant.sysj line: 20, column: 18
    currsigs.addElement(bottleAtPos1);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread26029(int [] tdone, int [] ends){
        S24851=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread26028(int [] tdone, int [] ends){
        S24848=1;
    bottleAtPos1.setPresent();//sysj\conveyor_plant.sysj line: 20, column: 18
    currsigs.addElement(bottleAtPos1);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread26027(int [] tdone, int [] ends){
        switch(S25079){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S24843){
          case 0 : 
            if(motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 15, column: 16
              S24843=1;
              __start_thread_2 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 13, column: 7
              S24816=0;
              if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 13, column: 7
                ends[2]=2;
                ;//sysj\conveyor_plant.sysj line: 13, column: 7
                S24843=2;
                thread26028(tdone,ends);
                thread26029(tdone,ends);
                int biggest26030 = 0;
                if(ends[3]>=biggest26030){
                  biggest26030=ends[3];
                }
                if(ends[4]>=biggest26030){
                  biggest26030=ends[4];
                }
                if(biggest26030 == 1){
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
              else {
                S24816=1;
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
            switch(S24816){
              case 0 : 
                S24816=0;
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 13, column: 7
                  ends[2]=2;
                  ;//sysj\conveyor_plant.sysj line: 13, column: 7
                  S24843=2;
                  thread26031(tdone,ends);
                  thread26032(tdone,ends);
                  int biggest26033 = 0;
                  if(ends[3]>=biggest26033){
                    biggest26033=ends[3];
                  }
                  if(ends[4]>=biggest26033){
                    biggest26033=ends[4];
                  }
                  if(biggest26033 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  S24816=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 1 : 
                S24816=1;
                S24816=0;
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 13, column: 7
                  ends[2]=2;
                  ;//sysj\conveyor_plant.sysj line: 13, column: 7
                  S24843=2;
                  thread26034(tdone,ends);
                  thread26035(tdone,ends);
                  int biggest26036 = 0;
                  if(ends[3]>=biggest26036){
                    biggest26036=ends[3];
                  }
                  if(ends[4]>=biggest26036){
                    biggest26036=ends[4];
                  }
                  if(biggest26036 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  S24816=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
            }
            break;
          
          case 2 : 
            thread26037(tdone,ends);
            thread26038(tdone,ends);
            int biggest26039 = 0;
            if(ends[3]>=biggest26039){
              biggest26039=ends[3];
            }
            if(ends[4]>=biggest26039){
              biggest26039=ends[4];
            }
            if(biggest26039 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            if(biggest26039 == 2){
              ends[2]=2;
              ;//sysj\conveyor_plant.sysj line: 18, column: 10
              S24843=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            //FINXME code
            if(biggest26039 == 0){
              S24843=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread26024(int [] tdone, int [] ends){
        S25130=1;
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

  public void thread26022(int [] tdone, int [] ends){
        S25095=1;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread26021(int [] tdone, int [] ends){
        S25092=1;
    bottleAtPos1E.setPresent();//sysj\conveyor_plant.sysj line: 45, column: 30
    currsigs.addElement(bottleAtPos1E);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread26020(int [] tdone, int [] ends){
        S25122=1;
    S25098=0;
    if(bottleAtPos1.getprestatus()){//sysj\conveyor_plant.sysj line: 42, column: 26
      thread26021(tdone,ends);
      thread26022(tdone,ends);
      int biggest26023 = 0;
      if(ends[8]>=biggest26023){
        biggest26023=ends[8];
      }
      if(ends[9]>=biggest26023){
        biggest26023=ends[9];
      }
      if(biggest26023 == 1){
        active[7]=1;
        ends[7]=1;
        tdone[7]=1;
      }
    }
    else {
      S25098=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread26019(int [] tdone, int [] ends){
        S25087=1;
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

  public void thread26018(int [] tdone, int [] ends){
        S25132=1;
    thread26019(tdone,ends);
    thread26020(tdone,ends);
    thread26024(tdone,ends);
    int biggest26025 = 0;
    if(ends[6]>=biggest26025){
      biggest26025=ends[6];
    }
    if(ends[7]>=biggest26025){
      biggest26025=ends[7];
    }
    if(ends[10]>=biggest26025){
      biggest26025=ends[10];
    }
    if(biggest26025 == 1){
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread26017(int [] tdone, int [] ends){
        S25079=1;
    S24843=0;
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
      switch(S25453){
        case 0 : 
          S25453=0;
          break RUN;
        
        case 1 : 
          S25453=2;
          S25453=2;
          new Thread(new GUI()).start();//sysj\conveyor_plant.sysj line: 11, column: 2
          thread26017(tdone,ends);
          thread26018(tdone,ends);
          int biggest26026 = 0;
          if(ends[2]>=biggest26026){
            biggest26026=ends[2];
          }
          if(ends[5]>=biggest26026){
            biggest26026=ends[5];
          }
          if(biggest26026 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread26027(tdone,ends);
          thread26040(tdone,ends);
          int biggest26051 = 0;
          if(ends[2]>=biggest26051){
            biggest26051=ends[2];
          }
          if(ends[5]>=biggest26051){
            biggest26051=ends[5];
          }
          if(biggest26051 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest26051 == 0){
            S25453=0;
            active[1]=0;
            ends[1]=0;
            S25453=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
