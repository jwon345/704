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
  private int S19347 = 1;
  private int S18973 = 1;
  private int S18737 = 1;
  private int S18710 = 1;
  private int S18742 = 1;
  private int S18745 = 1;
  private int S19026 = 1;
  private int S18981 = 1;
  private int S19016 = 1;
  private int S18992 = 1;
  private int S18986 = 1;
  private int S18989 = 1;
  private int S19024 = 1;
  
  private int[] ends = new int[27];
  private int[] tdone = new int[27];
  
  public void thread19801(int [] tdone, int [] ends){
        switch(S19024){
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

  public void thread19799(int [] tdone, int [] ends){
        S18989=1;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread19798(int [] tdone, int [] ends){
        S18986=1;
    bottleAtPos1E.setPresent();//sysj\conveyor_plant.sysj line: 45, column: 30
    currsigs.addElement(bottleAtPos1E);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread19796(int [] tdone, int [] ends){
        switch(S18989){
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

  public void thread19795(int [] tdone, int [] ends){
        switch(S18986){
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

  public void thread19794(int [] tdone, int [] ends){
        switch(S19016){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S18992){
          case 0 : 
            thread19795(tdone,ends);
            thread19796(tdone,ends);
            int biggest19797 = 0;
            if(ends[8]>=biggest19797){
              biggest19797=ends[8];
            }
            if(ends[9]>=biggest19797){
              biggest19797=ends[9];
            }
            if(biggest19797 == 1){
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            if(biggest19797 == 2){
              ends[7]=2;
              ;//sysj\conveyor_plant.sysj line: 43, column: 22
              S18992=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            //FINXME code
            if(biggest19797 == 0){
              S18992=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            S18992=1;
            S18992=0;
            if(bottleAtPos1.getprestatus()){//sysj\conveyor_plant.sysj line: 42, column: 26
              thread19798(tdone,ends);
              thread19799(tdone,ends);
              int biggest19800 = 0;
              if(ends[8]>=biggest19800){
                biggest19800=ends[8];
              }
              if(ends[9]>=biggest19800){
                biggest19800=ends[9];
              }
              if(biggest19800 == 1){
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
            }
            else {
              S18992=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread19793(int [] tdone, int [] ends){
        switch(S18981){
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

  public void thread19792(int [] tdone, int [] ends){
        switch(S19026){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        thread19793(tdone,ends);
        thread19794(tdone,ends);
        thread19801(tdone,ends);
        int biggest19802 = 0;
        if(ends[6]>=biggest19802){
          biggest19802=ends[6];
        }
        if(ends[7]>=biggest19802){
          biggest19802=ends[7];
        }
        if(ends[10]>=biggest19802){
          biggest19802=ends[10];
        }
        if(biggest19802 == 1){
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        //FINXME code
        if(biggest19802 == 0){
          S19026=0;
          active[5]=0;
          ends[5]=0;
          tdone[5]=1;
        }
        break;
      
    }
  }

  public void thread19790(int [] tdone, int [] ends){
        switch(S18745){
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

  public void thread19789(int [] tdone, int [] ends){
        switch(S18742){
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

  public void thread19787(int [] tdone, int [] ends){
        S18745=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread19786(int [] tdone, int [] ends){
        S18742=1;
    bottleAtPos1.setPresent();//sysj\conveyor_plant.sysj line: 20, column: 18
    currsigs.addElement(bottleAtPos1);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread19784(int [] tdone, int [] ends){
        S18745=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread19783(int [] tdone, int [] ends){
        S18742=1;
    bottleAtPos1.setPresent();//sysj\conveyor_plant.sysj line: 20, column: 18
    currsigs.addElement(bottleAtPos1);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread19781(int [] tdone, int [] ends){
        S18745=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread19780(int [] tdone, int [] ends){
        S18742=1;
    bottleAtPos1.setPresent();//sysj\conveyor_plant.sysj line: 20, column: 18
    currsigs.addElement(bottleAtPos1);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread19779(int [] tdone, int [] ends){
        switch(S18973){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S18737){
          case 0 : 
            if(motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 15, column: 16
              S18737=1;
              __start_thread_2 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 13, column: 7
              S18710=0;
              if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 13, column: 7
                ends[2]=2;
                ;//sysj\conveyor_plant.sysj line: 13, column: 7
                S18737=2;
                thread19780(tdone,ends);
                thread19781(tdone,ends);
                int biggest19782 = 0;
                if(ends[3]>=biggest19782){
                  biggest19782=ends[3];
                }
                if(ends[4]>=biggest19782){
                  biggest19782=ends[4];
                }
                if(biggest19782 == 1){
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
              else {
                S18710=1;
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
            switch(S18710){
              case 0 : 
                S18710=0;
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 13, column: 7
                  ends[2]=2;
                  ;//sysj\conveyor_plant.sysj line: 13, column: 7
                  S18737=2;
                  thread19783(tdone,ends);
                  thread19784(tdone,ends);
                  int biggest19785 = 0;
                  if(ends[3]>=biggest19785){
                    biggest19785=ends[3];
                  }
                  if(ends[4]>=biggest19785){
                    biggest19785=ends[4];
                  }
                  if(biggest19785 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  S18710=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 1 : 
                S18710=1;
                S18710=0;
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 13, column: 7
                  ends[2]=2;
                  ;//sysj\conveyor_plant.sysj line: 13, column: 7
                  S18737=2;
                  thread19786(tdone,ends);
                  thread19787(tdone,ends);
                  int biggest19788 = 0;
                  if(ends[3]>=biggest19788){
                    biggest19788=ends[3];
                  }
                  if(ends[4]>=biggest19788){
                    biggest19788=ends[4];
                  }
                  if(biggest19788 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  S18710=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
            }
            break;
          
          case 2 : 
            thread19789(tdone,ends);
            thread19790(tdone,ends);
            int biggest19791 = 0;
            if(ends[3]>=biggest19791){
              biggest19791=ends[3];
            }
            if(ends[4]>=biggest19791){
              biggest19791=ends[4];
            }
            if(biggest19791 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            if(biggest19791 == 2){
              ends[2]=2;
              ;//sysj\conveyor_plant.sysj line: 18, column: 10
              S18737=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            //FINXME code
            if(biggest19791 == 0){
              S18737=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread19776(int [] tdone, int [] ends){
        S19024=1;
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

  public void thread19774(int [] tdone, int [] ends){
        S18989=1;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread19773(int [] tdone, int [] ends){
        S18986=1;
    bottleAtPos1E.setPresent();//sysj\conveyor_plant.sysj line: 45, column: 30
    currsigs.addElement(bottleAtPos1E);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread19772(int [] tdone, int [] ends){
        S19016=1;
    S18992=0;
    if(bottleAtPos1.getprestatus()){//sysj\conveyor_plant.sysj line: 42, column: 26
      thread19773(tdone,ends);
      thread19774(tdone,ends);
      int biggest19775 = 0;
      if(ends[8]>=biggest19775){
        biggest19775=ends[8];
      }
      if(ends[9]>=biggest19775){
        biggest19775=ends[9];
      }
      if(biggest19775 == 1){
        active[7]=1;
        ends[7]=1;
        tdone[7]=1;
      }
    }
    else {
      S18992=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread19771(int [] tdone, int [] ends){
        S18981=1;
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

  public void thread19770(int [] tdone, int [] ends){
        S19026=1;
    thread19771(tdone,ends);
    thread19772(tdone,ends);
    thread19776(tdone,ends);
    int biggest19777 = 0;
    if(ends[6]>=biggest19777){
      biggest19777=ends[6];
    }
    if(ends[7]>=biggest19777){
      biggest19777=ends[7];
    }
    if(ends[10]>=biggest19777){
      biggest19777=ends[10];
    }
    if(biggest19777 == 1){
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread19769(int [] tdone, int [] ends){
        S18973=1;
    S18737=0;
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
      switch(S19347){
        case 0 : 
          S19347=0;
          break RUN;
        
        case 1 : 
          S19347=2;
          S19347=2;
          new Thread(new GUI()).start();//sysj\conveyor_plant.sysj line: 11, column: 2
          thread19769(tdone,ends);
          thread19770(tdone,ends);
          int biggest19778 = 0;
          if(ends[2]>=biggest19778){
            biggest19778=ends[2];
          }
          if(ends[5]>=biggest19778){
            biggest19778=ends[5];
          }
          if(biggest19778 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread19779(tdone,ends);
          thread19792(tdone,ends);
          int biggest19803 = 0;
          if(ends[2]>=biggest19803){
            biggest19803=ends[2];
          }
          if(ends[5]>=biggest19803){
            biggest19803=ends[5];
          }
          if(biggest19803 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest19803 == 0){
            S19347=0;
            active[1]=0;
            ends[1]=0;
            S19347=0;
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
