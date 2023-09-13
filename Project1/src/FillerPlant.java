import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.GUI;//sysj\conveyor_plant.sysj line: 1, column: 1
import run.socketListener;//sysj\conveyor_plant.sysj line: 2, column: 1

public class FillerPlant extends ClockDomain{
  public FillerPlant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal valveInjectorOnOff = new Signal("valveInjectorOnOff", Signal.INPUT);
  public Signal valveInletOnOff = new Signal("valveInletOnOff", Signal.INPUT);
  public Signal dosUnitValveRetract = new Signal("dosUnitValveRetract", Signal.INPUT);
  public Signal dosUnitValveExtend = new Signal("dosUnitValveExtend", Signal.INPUT);
  public Signal bottleAtPos2 = new Signal("bottleAtPos2", Signal.OUTPUT);
  public Signal dosUnitEvac = new Signal("dosUnitEvac", Signal.OUTPUT);
  public Signal dosUnitFilled = new Signal("dosUnitFilled", Signal.OUTPUT);
  public Signal valveInjectorOnOffE = new Signal("valveInjectorOnOffE", Signal.OUTPUT);
  public Signal valveInletOnOffE = new Signal("valveInletOnOffE", Signal.OUTPUT);
  public Signal dosUnitValveRetractE = new Signal("dosUnitValveRetractE", Signal.OUTPUT);
  public Signal dosUnitValveExtendE = new Signal("dosUnitValveExtendE", Signal.OUTPUT);
  public Signal bottleAtPos2E = new Signal("bottleAtPos2E", Signal.OUTPUT);
  public Signal dosUnitEvacE = new Signal("dosUnitEvacE", Signal.OUTPUT);
  public Signal dosUnitFilledE = new Signal("dosUnitFilledE", Signal.OUTPUT);
  private long __start_thread_13;//sysj\conveyor_plant.sysj line: 71, column: 7
  private long __start_thread_14;//sysj\conveyor_plant.sysj line: 81, column: 7
  private int S192710 = 1;
  private int S192649 = 1;
  private int S192492 = 1;
  private int S192491 = 1;
  private int S192523 = 1;
  private int S192522 = 1;
  private int S192708 = 1;
  private int S192657 = 1;
  private int S192665 = 1;
  private int S192673 = 1;
  private int S192684 = 1;
  private int S192695 = 1;
  private int S192706 = 1;
  
  private int[] ends = new int[52];
  private int[] tdone = new int[52];
  
  public void thread193802(int [] tdone, int [] ends){
        switch(S192706){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        if(dosUnitFilled.getprestatus()){//sysj\conveyor_plant.sysj line: 106, column: 34
          ;//sysj\conveyor_plant.sysj line: 106, column: 49
          dosUnitFilledE.setPresent();//sysj\conveyor_plant.sysj line: 106, column: 50
          currsigs.addElement(dosUnitFilledE);
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        else {
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        break;
      
    }
  }

  public void thread193801(int [] tdone, int [] ends){
        switch(S192695){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        if(dosUnitEvac.getprestatus()){//sysj\conveyor_plant.sysj line: 104, column: 34
          ;//sysj\conveyor_plant.sysj line: 104, column: 47
          dosUnitEvacE.setPresent();//sysj\conveyor_plant.sysj line: 104, column: 48
          currsigs.addElement(dosUnitEvacE);
          active[20]=1;
          ends[20]=1;
          tdone[20]=1;
        }
        else {
          active[20]=1;
          ends[20]=1;
          tdone[20]=1;
        }
        break;
      
    }
  }

  public void thread193800(int [] tdone, int [] ends){
        switch(S192684){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        if(dosUnitValveExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 102, column: 34
          ;//sysj\conveyor_plant.sysj line: 102, column: 54
          dosUnitValveExtendE.setPresent();//sysj\conveyor_plant.sysj line: 102, column: 55
          currsigs.addElement(dosUnitValveExtendE);
          active[19]=1;
          ends[19]=1;
          tdone[19]=1;
        }
        else {
          active[19]=1;
          ends[19]=1;
          tdone[19]=1;
        }
        break;
      
    }
  }

  public void thread193799(int [] tdone, int [] ends){
        switch(S192673){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        if(dosUnitValveRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 100, column: 34
          dosUnitValveRetractE.setPresent();//sysj\conveyor_plant.sysj line: 100, column: 55
          currsigs.addElement(dosUnitValveRetractE);
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
        else {
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
        break;
      
    }
  }

  public void thread193798(int [] tdone, int [] ends){
        switch(S192665){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(valveInletOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 98, column: 34
          valveInletOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 98, column: 51
          currsigs.addElement(valveInletOnOffE);
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
        else {
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
        break;
      
    }
  }

  public void thread193797(int [] tdone, int [] ends){
        switch(S192657){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(valveInjectorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 96, column: 34
          valveInjectorOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 96, column: 54
          currsigs.addElement(valveInjectorOnOffE);
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
        else {
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
        break;
      
    }
  }

  public void thread193796(int [] tdone, int [] ends){
        switch(S192708){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        thread193797(tdone,ends);
        thread193798(tdone,ends);
        thread193799(tdone,ends);
        thread193800(tdone,ends);
        thread193801(tdone,ends);
        thread193802(tdone,ends);
        int biggest193803 = 0;
        if(ends[16]>=biggest193803){
          biggest193803=ends[16];
        }
        if(ends[17]>=biggest193803){
          biggest193803=ends[17];
        }
        if(ends[18]>=biggest193803){
          biggest193803=ends[18];
        }
        if(ends[19]>=biggest193803){
          biggest193803=ends[19];
        }
        if(ends[20]>=biggest193803){
          biggest193803=ends[20];
        }
        if(ends[21]>=biggest193803){
          biggest193803=ends[21];
        }
        if(biggest193803 == 1){
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        //FINXME code
        if(biggest193803 == 0){
          S192708=0;
          active[15]=0;
          ends[15]=0;
          tdone[15]=1;
        }
        break;
      
    }
  }

  public void thread193794(int [] tdone, int [] ends){
        S192523=1;
    S192522=0;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread193793(int [] tdone, int [] ends){
        S192492=1;
    S192491=0;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread193791(int [] tdone, int [] ends){
        switch(S192523){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        switch(S192522){
          case 0 : 
            if(valveInletOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 82, column: 13
              S192522=1;
              __start_thread_14 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 81, column: 7
              if(com.systemj.Timer.getMs() - __start_thread_14 >= 100){//sysj\conveyor_plant.sysj line: 81, column: 7
                ends[14]=2;
                ;//sysj\conveyor_plant.sysj line: 81, column: 7
                dosUnitEvac.setPresent();//sysj\conveyor_plant.sysj line: 84, column: 7
                currsigs.addElement(dosUnitEvac);
                System.out.println("*Filler - Inlet Open (Pressure Can At Bottem) *");//sysj\conveyor_plant.sysj line: 86, column: 7
                S192523=0;
                active[14]=0;
                ends[14]=0;
                tdone[14]=1;
              }
              else {
                active[14]=1;
                ends[14]=1;
                tdone[14]=1;
              }
            }
            else {
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            break;
          
          case 1 : 
            if(com.systemj.Timer.getMs() - __start_thread_14 >= 100){//sysj\conveyor_plant.sysj line: 81, column: 7
              ends[14]=2;
              ;//sysj\conveyor_plant.sysj line: 81, column: 7
              dosUnitEvac.setPresent();//sysj\conveyor_plant.sysj line: 84, column: 7
              currsigs.addElement(dosUnitEvac);
              System.out.println("*Filler - Inlet Open (Pressure Can At Bottem) *");//sysj\conveyor_plant.sysj line: 86, column: 7
              S192523=0;
              active[14]=0;
              ends[14]=0;
              tdone[14]=1;
            }
            else {
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread193790(int [] tdone, int [] ends){
        switch(S192492){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S192491){
          case 0 : 
            if(valveInjectorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 72, column: 13
              S192491=1;
              __start_thread_13 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 71, column: 7
              if(com.systemj.Timer.getMs() - __start_thread_13 >= 100){//sysj\conveyor_plant.sysj line: 71, column: 7
                ends[13]=2;
                ;//sysj\conveyor_plant.sysj line: 71, column: 7
                dosUnitFilled.setPresent();//sysj\conveyor_plant.sysj line: 74, column: 7
                currsigs.addElement(dosUnitFilled);
                System.out.println("*Filler - Bottle Filled (Pressure Can At Top) *");//sysj\conveyor_plant.sysj line: 76, column: 7
                S192492=0;
                active[13]=0;
                ends[13]=0;
                tdone[13]=1;
              }
              else {
                active[13]=1;
                ends[13]=1;
                tdone[13]=1;
              }
            }
            else {
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
          case 1 : 
            if(com.systemj.Timer.getMs() - __start_thread_13 >= 100){//sysj\conveyor_plant.sysj line: 71, column: 7
              ends[13]=2;
              ;//sysj\conveyor_plant.sysj line: 71, column: 7
              dosUnitFilled.setPresent();//sysj\conveyor_plant.sysj line: 74, column: 7
              currsigs.addElement(dosUnitFilled);
              System.out.println("*Filler - Bottle Filled (Pressure Can At Top) *");//sysj\conveyor_plant.sysj line: 76, column: 7
              S192492=0;
              active[13]=0;
              ends[13]=0;
              tdone[13]=1;
            }
            else {
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread193789(int [] tdone, int [] ends){
        switch(S192649){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        thread193790(tdone,ends);
        thread193791(tdone,ends);
        int biggest193792 = 0;
        if(ends[13]>=biggest193792){
          biggest193792=ends[13];
        }
        if(ends[14]>=biggest193792){
          biggest193792=ends[14];
        }
        if(biggest193792 == 1){
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        //FINXME code
        if(biggest193792 == 0){
          thread193793(tdone,ends);
          thread193794(tdone,ends);
          int biggest193795 = 0;
          if(ends[13]>=biggest193795){
            biggest193795=ends[13];
          }
          if(ends[14]>=biggest193795){
            biggest193795=ends[14];
          }
          if(biggest193795 == 1){
            active[12]=1;
            ends[12]=1;
            tdone[12]=1;
          }
        }
        break;
      
    }
  }

  public void thread193786(int [] tdone, int [] ends){
        S192706=1;
    if(dosUnitFilled.getprestatus()){//sysj\conveyor_plant.sysj line: 106, column: 34
      ;//sysj\conveyor_plant.sysj line: 106, column: 49
      dosUnitFilledE.setPresent();//sysj\conveyor_plant.sysj line: 106, column: 50
      currsigs.addElement(dosUnitFilledE);
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    else {
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread193785(int [] tdone, int [] ends){
        S192695=1;
    if(dosUnitEvac.getprestatus()){//sysj\conveyor_plant.sysj line: 104, column: 34
      ;//sysj\conveyor_plant.sysj line: 104, column: 47
      dosUnitEvacE.setPresent();//sysj\conveyor_plant.sysj line: 104, column: 48
      currsigs.addElement(dosUnitEvacE);
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
    else {
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread193784(int [] tdone, int [] ends){
        S192684=1;
    if(dosUnitValveExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 102, column: 34
      ;//sysj\conveyor_plant.sysj line: 102, column: 54
      dosUnitValveExtendE.setPresent();//sysj\conveyor_plant.sysj line: 102, column: 55
      currsigs.addElement(dosUnitValveExtendE);
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread193783(int [] tdone, int [] ends){
        S192673=1;
    if(dosUnitValveRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 100, column: 34
      dosUnitValveRetractE.setPresent();//sysj\conveyor_plant.sysj line: 100, column: 55
      currsigs.addElement(dosUnitValveRetractE);
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
    else {
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread193782(int [] tdone, int [] ends){
        S192665=1;
    if(valveInletOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 98, column: 34
      valveInletOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 98, column: 51
      currsigs.addElement(valveInletOnOffE);
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
    else {
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
  }

  public void thread193781(int [] tdone, int [] ends){
        S192657=1;
    if(valveInjectorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 96, column: 34
      valveInjectorOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 96, column: 54
      currsigs.addElement(valveInjectorOnOffE);
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
    else {
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread193780(int [] tdone, int [] ends){
        S192708=1;
    thread193781(tdone,ends);
    thread193782(tdone,ends);
    thread193783(tdone,ends);
    thread193784(tdone,ends);
    thread193785(tdone,ends);
    thread193786(tdone,ends);
    int biggest193787 = 0;
    if(ends[16]>=biggest193787){
      biggest193787=ends[16];
    }
    if(ends[17]>=biggest193787){
      biggest193787=ends[17];
    }
    if(ends[18]>=biggest193787){
      biggest193787=ends[18];
    }
    if(ends[19]>=biggest193787){
      biggest193787=ends[19];
    }
    if(ends[20]>=biggest193787){
      biggest193787=ends[20];
    }
    if(ends[21]>=biggest193787){
      biggest193787=ends[21];
    }
    if(biggest193787 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread193778(int [] tdone, int [] ends){
        S192523=1;
    S192522=0;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread193777(int [] tdone, int [] ends){
        S192492=1;
    S192491=0;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread193776(int [] tdone, int [] ends){
        S192649=1;
    thread193777(tdone,ends);
    thread193778(tdone,ends);
    int biggest193779 = 0;
    if(ends[13]>=biggest193779){
      biggest193779=ends[13];
    }
    if(ends[14]>=biggest193779){
      biggest193779=ends[14];
    }
    if(biggest193779 == 1){
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S192710){
        case 0 : 
          S192710=0;
          break RUN;
        
        case 1 : 
          S192710=2;
          S192710=2;
          thread193776(tdone,ends);
          thread193780(tdone,ends);
          int biggest193788 = 0;
          if(ends[12]>=biggest193788){
            biggest193788=ends[12];
          }
          if(ends[15]>=biggest193788){
            biggest193788=ends[15];
          }
          if(biggest193788 == 1){
            active[11]=1;
            ends[11]=1;
            break RUN;
          }
        
        case 2 : 
          thread193789(tdone,ends);
          thread193796(tdone,ends);
          int biggest193804 = 0;
          if(ends[12]>=biggest193804){
            biggest193804=ends[12];
          }
          if(ends[15]>=biggest193804){
            biggest193804=ends[15];
          }
          if(biggest193804 == 1){
            active[11]=1;
            ends[11]=1;
            break RUN;
          }
          //FINXME code
          if(biggest193804 == 0){
            S192710=0;
            active[11]=0;
            ends[11]=0;
            S192710=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[11] != 0){
      int index = 11;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[11]!=0 || suspended[11]!=0 || active[11]!=1);
      else{
        if(!df){
          valveInjectorOnOff.gethook();
          valveInletOnOff.gethook();
          dosUnitValveRetract.gethook();
          dosUnitValveExtend.gethook();
          df = true;
        }
        runClockDomain();
      }
      valveInjectorOnOff.setpreclear();
      valveInletOnOff.setpreclear();
      dosUnitValveRetract.setpreclear();
      dosUnitValveExtend.setpreclear();
      bottleAtPos2.setpreclear();
      dosUnitEvac.setpreclear();
      dosUnitFilled.setpreclear();
      valveInjectorOnOffE.setpreclear();
      valveInletOnOffE.setpreclear();
      dosUnitValveRetractE.setpreclear();
      dosUnitValveExtendE.setpreclear();
      bottleAtPos2E.setpreclear();
      dosUnitEvacE.setpreclear();
      dosUnitFilledE.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = valveInjectorOnOff.getStatus() ? valveInjectorOnOff.setprepresent() : valveInjectorOnOff.setpreclear();
      valveInjectorOnOff.setpreval(valveInjectorOnOff.getValue());
      valveInjectorOnOff.setClear();
      dummyint = valveInletOnOff.getStatus() ? valveInletOnOff.setprepresent() : valveInletOnOff.setpreclear();
      valveInletOnOff.setpreval(valveInletOnOff.getValue());
      valveInletOnOff.setClear();
      dummyint = dosUnitValveRetract.getStatus() ? dosUnitValveRetract.setprepresent() : dosUnitValveRetract.setpreclear();
      dosUnitValveRetract.setpreval(dosUnitValveRetract.getValue());
      dosUnitValveRetract.setClear();
      dummyint = dosUnitValveExtend.getStatus() ? dosUnitValveExtend.setprepresent() : dosUnitValveExtend.setpreclear();
      dosUnitValveExtend.setpreval(dosUnitValveExtend.getValue());
      dosUnitValveExtend.setClear();
      bottleAtPos2.sethook();
      bottleAtPos2.setClear();
      dosUnitEvac.sethook();
      dosUnitEvac.setClear();
      dosUnitFilled.sethook();
      dosUnitFilled.setClear();
      valveInjectorOnOffE.sethook();
      valveInjectorOnOffE.setClear();
      valveInletOnOffE.sethook();
      valveInletOnOffE.setClear();
      dosUnitValveRetractE.sethook();
      dosUnitValveRetractE.setClear();
      dosUnitValveExtendE.sethook();
      dosUnitValveExtendE.setClear();
      bottleAtPos2E.sethook();
      bottleAtPos2E.setClear();
      dosUnitEvacE.sethook();
      dosUnitEvacE.setClear();
      dosUnitFilledE.sethook();
      dosUnitFilledE.setClear();
      if(paused[11]!=0 || suspended[11]!=0 || active[11]!=1);
      else{
        valveInjectorOnOff.gethook();
        valveInletOnOff.gethook();
        dosUnitValveRetract.gethook();
        dosUnitValveExtend.gethook();
      }
      runFinisher();
      if(active[11] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
