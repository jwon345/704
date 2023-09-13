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
  private int S183586 = 1;
  private int S183393 = 1;
  private int S183387 = 1;
  private int S183485 = 1;
  private int S183401 = 1;
  private int S183395 = 1;
  private int S183475 = 1;
  private int S183425 = 1;
  private int S183406 = 1;
  private int S183422 = 1;
  private int S183483 = 1;
  
  private int[] ends = new int[55];
  private int[] tdone = new int[55];
  
  public void thread185009(int [] tdone, int [] ends){
        switch(S183483){
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

  public void thread185007(int [] tdone, int [] ends){
        S183422=1;
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

  public void thread185006(int [] tdone, int [] ends){
        S183406=1;
    bottleAtPos1E.setPresent();//sysj\conveyor_plant.sysj line: 36, column: 30
    currsigs.addElement(bottleAtPos1E);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread185004(int [] tdone, int [] ends){
        switch(S183422){
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

  public void thread185003(int [] tdone, int [] ends){
        switch(S183406){
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

  public void thread185002(int [] tdone, int [] ends){
        switch(S183475){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S183425){
          case 0 : 
            thread185003(tdone,ends);
            thread185004(tdone,ends);
            int biggest185005 = 0;
            if(ends[6]>=biggest185005){
              biggest185005=ends[6];
            }
            if(ends[7]>=biggest185005){
              biggest185005=ends[7];
            }
            if(biggest185005 == 1){
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            if(biggest185005 == 2){
              ends[5]=2;
              ;//sysj\conveyor_plant.sysj line: 34, column: 22
              S183425=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            //FINXME code
            if(biggest185005 == 0){
              S183425=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            S183425=1;
            S183425=0;
            if(bottleAtPos1.getprestatus()){//sysj\conveyor_plant.sysj line: 33, column: 26
              thread185006(tdone,ends);
              thread185007(tdone,ends);
              int biggest185008 = 0;
              if(ends[6]>=biggest185008){
                biggest185008=ends[6];
              }
              if(ends[7]>=biggest185008){
                biggest185008=ends[7];
              }
              if(biggest185008 == 1){
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              if(biggest185008 == 2){
                ends[5]=2;
                ;//sysj\conveyor_plant.sysj line: 34, column: 22
                S183425=1;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
            }
            else {
              S183425=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread185001(int [] tdone, int [] ends){
        switch(S183401){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S183395){
          case 0 : 
            S183395=0;
            if(motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 29, column: 31
              motConveyorOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 29, column: 49
              currsigs.addElement(motConveyorOnOffE);
              S183395=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S183395=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            S183395=1;
            S183395=0;
            if(motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 29, column: 31
              motConveyorOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 29, column: 49
              currsigs.addElement(motConveyorOnOffE);
              S183395=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S183395=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread185000(int [] tdone, int [] ends){
        switch(S183485){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread185001(tdone,ends);
        thread185002(tdone,ends);
        thread185009(tdone,ends);
        int biggest185010 = 0;
        if(ends[4]>=biggest185010){
          biggest185010=ends[4];
        }
        if(ends[5]>=biggest185010){
          biggest185010=ends[5];
        }
        if(ends[8]>=biggest185010){
          biggest185010=ends[8];
        }
        if(biggest185010 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest185010 == 0){
          S183485=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread184999(int [] tdone, int [] ends){
        switch(S183393){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S183387){
          case 0 : 
            if(motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 16, column: 16
              bottleAtPos1.setPresent();//sysj\conveyor_plant.sysj line: 18, column: 10
              currsigs.addElement(bottleAtPos1);
              S183387=1;
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
            S183387=1;
            S183387=0;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread184996(int [] tdone, int [] ends){
        S183483=1;
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

  public void thread184994(int [] tdone, int [] ends){
        S183422=1;
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

  public void thread184993(int [] tdone, int [] ends){
        S183406=1;
    bottleAtPos1E.setPresent();//sysj\conveyor_plant.sysj line: 36, column: 30
    currsigs.addElement(bottleAtPos1E);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread184992(int [] tdone, int [] ends){
        S183475=1;
    S183425=0;
    if(bottleAtPos1.getprestatus()){//sysj\conveyor_plant.sysj line: 33, column: 26
      thread184993(tdone,ends);
      thread184994(tdone,ends);
      int biggest184995 = 0;
      if(ends[6]>=biggest184995){
        biggest184995=ends[6];
      }
      if(ends[7]>=biggest184995){
        biggest184995=ends[7];
      }
      if(biggest184995 == 1){
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
      if(biggest184995 == 2){
        ends[5]=2;
        ;//sysj\conveyor_plant.sysj line: 34, column: 22
        S183425=1;
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
    }
    else {
      S183425=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread184991(int [] tdone, int [] ends){
        S183401=1;
    S183395=0;
    if(motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 29, column: 31
      motConveyorOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 29, column: 49
      currsigs.addElement(motConveyorOnOffE);
      S183395=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S183395=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread184990(int [] tdone, int [] ends){
        S183485=1;
    thread184991(tdone,ends);
    thread184992(tdone,ends);
    thread184996(tdone,ends);
    int biggest184997 = 0;
    if(ends[4]>=biggest184997){
      biggest184997=ends[4];
    }
    if(ends[5]>=biggest184997){
      biggest184997=ends[5];
    }
    if(ends[8]>=biggest184997){
      biggest184997=ends[8];
    }
    if(biggest184997 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread184989(int [] tdone, int [] ends){
        S183393=1;
    S183387=0;
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
      switch(S183586){
        case 0 : 
          S183586=0;
          break RUN;
        
        case 1 : 
          S183586=2;
          S183586=2;
          new Thread(new GUI()).start();//sysj\conveyor_plant.sysj line: 11, column: 2
          new Thread(new socketListener()).start();//sysj\conveyor_plant.sysj line: 12, column: 2
          thread184989(tdone,ends);
          thread184990(tdone,ends);
          int biggest184998 = 0;
          if(ends[2]>=biggest184998){
            biggest184998=ends[2];
          }
          if(ends[3]>=biggest184998){
            biggest184998=ends[3];
          }
          if(biggest184998 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread184999(tdone,ends);
          thread185000(tdone,ends);
          int biggest185011 = 0;
          if(ends[2]>=biggest185011){
            biggest185011=ends[2];
          }
          if(ends[3]>=biggest185011){
            biggest185011=ends[3];
          }
          if(biggest185011 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest185011 == 0){
            S183586=0;
            active[1]=0;
            ends[1]=0;
            S183586=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
