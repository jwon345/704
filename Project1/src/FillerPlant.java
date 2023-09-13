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
  private long __start_thread_13;//sysj\conveyor_plant.sysj line: 70, column: 7
  private long __start_thread_14;//sysj\conveyor_plant.sysj line: 80, column: 7
  private int S202393 = 1;
  private int S202332 = 1;
  private int S202175 = 1;
  private int S202174 = 1;
  private int S202206 = 1;
  private int S202205 = 1;
  private int S202391 = 1;
  private int S202340 = 1;
  private int S202348 = 1;
  private int S202356 = 1;
  private int S202367 = 1;
  private int S202378 = 1;
  private int S202389 = 1;
  
  private int[] ends = new int[52];
  private int[] tdone = new int[52];
  
  public void thread203485(int [] tdone, int [] ends){
        switch(S202389){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        if(dosUnitFilled.getprestatus()){//sysj\conveyor_plant.sysj line: 105, column: 34
          ;//sysj\conveyor_plant.sysj line: 105, column: 49
          dosUnitFilledE.setPresent();//sysj\conveyor_plant.sysj line: 105, column: 50
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

  public void thread203484(int [] tdone, int [] ends){
        switch(S202378){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        if(dosUnitEvac.getprestatus()){//sysj\conveyor_plant.sysj line: 103, column: 34
          ;//sysj\conveyor_plant.sysj line: 103, column: 47
          dosUnitEvacE.setPresent();//sysj\conveyor_plant.sysj line: 103, column: 48
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

  public void thread203483(int [] tdone, int [] ends){
        switch(S202367){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        if(dosUnitValveExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 101, column: 34
          ;//sysj\conveyor_plant.sysj line: 101, column: 54
          dosUnitValveExtendE.setPresent();//sysj\conveyor_plant.sysj line: 101, column: 55
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

  public void thread203482(int [] tdone, int [] ends){
        switch(S202356){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        if(dosUnitValveRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 99, column: 34
          dosUnitValveRetractE.setPresent();//sysj\conveyor_plant.sysj line: 99, column: 55
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

  public void thread203481(int [] tdone, int [] ends){
        switch(S202348){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(valveInletOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 97, column: 34
          valveInletOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 97, column: 51
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

  public void thread203480(int [] tdone, int [] ends){
        switch(S202340){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(valveInjectorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 95, column: 34
          valveInjectorOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 95, column: 54
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

  public void thread203479(int [] tdone, int [] ends){
        switch(S202391){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        thread203480(tdone,ends);
        thread203481(tdone,ends);
        thread203482(tdone,ends);
        thread203483(tdone,ends);
        thread203484(tdone,ends);
        thread203485(tdone,ends);
        int biggest203486 = 0;
        if(ends[16]>=biggest203486){
          biggest203486=ends[16];
        }
        if(ends[17]>=biggest203486){
          biggest203486=ends[17];
        }
        if(ends[18]>=biggest203486){
          biggest203486=ends[18];
        }
        if(ends[19]>=biggest203486){
          biggest203486=ends[19];
        }
        if(ends[20]>=biggest203486){
          biggest203486=ends[20];
        }
        if(ends[21]>=biggest203486){
          biggest203486=ends[21];
        }
        if(biggest203486 == 1){
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        //FINXME code
        if(biggest203486 == 0){
          S202391=0;
          active[15]=0;
          ends[15]=0;
          tdone[15]=1;
        }
        break;
      
    }
  }

  public void thread203477(int [] tdone, int [] ends){
        S202206=1;
    S202205=0;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread203476(int [] tdone, int [] ends){
        S202175=1;
    S202174=0;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread203474(int [] tdone, int [] ends){
        switch(S202206){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        switch(S202205){
          case 0 : 
            if(valveInletOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 81, column: 13
              S202205=1;
              __start_thread_14 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 80, column: 7
              if(com.systemj.Timer.getMs() - __start_thread_14 >= 100){//sysj\conveyor_plant.sysj line: 80, column: 7
                ends[14]=2;
                ;//sysj\conveyor_plant.sysj line: 80, column: 7
                dosUnitEvac.setPresent();//sysj\conveyor_plant.sysj line: 83, column: 7
                currsigs.addElement(dosUnitEvac);
                System.out.println("*Filler - Inlet Open (Pressure Can At Bottem) *");//sysj\conveyor_plant.sysj line: 85, column: 7
                S202206=0;
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
            if(com.systemj.Timer.getMs() - __start_thread_14 >= 100){//sysj\conveyor_plant.sysj line: 80, column: 7
              ends[14]=2;
              ;//sysj\conveyor_plant.sysj line: 80, column: 7
              dosUnitEvac.setPresent();//sysj\conveyor_plant.sysj line: 83, column: 7
              currsigs.addElement(dosUnitEvac);
              System.out.println("*Filler - Inlet Open (Pressure Can At Bottem) *");//sysj\conveyor_plant.sysj line: 85, column: 7
              S202206=0;
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

  public void thread203473(int [] tdone, int [] ends){
        switch(S202175){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S202174){
          case 0 : 
            if(valveInjectorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 71, column: 13
              S202174=1;
              __start_thread_13 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 70, column: 7
              if(com.systemj.Timer.getMs() - __start_thread_13 >= 100){//sysj\conveyor_plant.sysj line: 70, column: 7
                ends[13]=2;
                ;//sysj\conveyor_plant.sysj line: 70, column: 7
                dosUnitFilled.setPresent();//sysj\conveyor_plant.sysj line: 73, column: 7
                currsigs.addElement(dosUnitFilled);
                System.out.println("*Filler - Bottle Filled (Pressure Can At Top) *");//sysj\conveyor_plant.sysj line: 75, column: 7
                S202175=0;
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
            if(com.systemj.Timer.getMs() - __start_thread_13 >= 100){//sysj\conveyor_plant.sysj line: 70, column: 7
              ends[13]=2;
              ;//sysj\conveyor_plant.sysj line: 70, column: 7
              dosUnitFilled.setPresent();//sysj\conveyor_plant.sysj line: 73, column: 7
              currsigs.addElement(dosUnitFilled);
              System.out.println("*Filler - Bottle Filled (Pressure Can At Top) *");//sysj\conveyor_plant.sysj line: 75, column: 7
              S202175=0;
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

  public void thread203472(int [] tdone, int [] ends){
        switch(S202332){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        thread203473(tdone,ends);
        thread203474(tdone,ends);
        int biggest203475 = 0;
        if(ends[13]>=biggest203475){
          biggest203475=ends[13];
        }
        if(ends[14]>=biggest203475){
          biggest203475=ends[14];
        }
        if(biggest203475 == 1){
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        //FINXME code
        if(biggest203475 == 0){
          thread203476(tdone,ends);
          thread203477(tdone,ends);
          int biggest203478 = 0;
          if(ends[13]>=biggest203478){
            biggest203478=ends[13];
          }
          if(ends[14]>=biggest203478){
            biggest203478=ends[14];
          }
          if(biggest203478 == 1){
            active[12]=1;
            ends[12]=1;
            tdone[12]=1;
          }
        }
        break;
      
    }
  }

  public void thread203469(int [] tdone, int [] ends){
        S202389=1;
    if(dosUnitFilled.getprestatus()){//sysj\conveyor_plant.sysj line: 105, column: 34
      ;//sysj\conveyor_plant.sysj line: 105, column: 49
      dosUnitFilledE.setPresent();//sysj\conveyor_plant.sysj line: 105, column: 50
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

  public void thread203468(int [] tdone, int [] ends){
        S202378=1;
    if(dosUnitEvac.getprestatus()){//sysj\conveyor_plant.sysj line: 103, column: 34
      ;//sysj\conveyor_plant.sysj line: 103, column: 47
      dosUnitEvacE.setPresent();//sysj\conveyor_plant.sysj line: 103, column: 48
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

  public void thread203467(int [] tdone, int [] ends){
        S202367=1;
    if(dosUnitValveExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 101, column: 34
      ;//sysj\conveyor_plant.sysj line: 101, column: 54
      dosUnitValveExtendE.setPresent();//sysj\conveyor_plant.sysj line: 101, column: 55
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

  public void thread203466(int [] tdone, int [] ends){
        S202356=1;
    if(dosUnitValveRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 99, column: 34
      dosUnitValveRetractE.setPresent();//sysj\conveyor_plant.sysj line: 99, column: 55
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

  public void thread203465(int [] tdone, int [] ends){
        S202348=1;
    if(valveInletOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 97, column: 34
      valveInletOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 97, column: 51
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

  public void thread203464(int [] tdone, int [] ends){
        S202340=1;
    if(valveInjectorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 95, column: 34
      valveInjectorOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 95, column: 54
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

  public void thread203463(int [] tdone, int [] ends){
        S202391=1;
    thread203464(tdone,ends);
    thread203465(tdone,ends);
    thread203466(tdone,ends);
    thread203467(tdone,ends);
    thread203468(tdone,ends);
    thread203469(tdone,ends);
    int biggest203470 = 0;
    if(ends[16]>=biggest203470){
      biggest203470=ends[16];
    }
    if(ends[17]>=biggest203470){
      biggest203470=ends[17];
    }
    if(ends[18]>=biggest203470){
      biggest203470=ends[18];
    }
    if(ends[19]>=biggest203470){
      biggest203470=ends[19];
    }
    if(ends[20]>=biggest203470){
      biggest203470=ends[20];
    }
    if(ends[21]>=biggest203470){
      biggest203470=ends[21];
    }
    if(biggest203470 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread203461(int [] tdone, int [] ends){
        S202206=1;
    S202205=0;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread203460(int [] tdone, int [] ends){
        S202175=1;
    S202174=0;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread203459(int [] tdone, int [] ends){
        S202332=1;
    thread203460(tdone,ends);
    thread203461(tdone,ends);
    int biggest203462 = 0;
    if(ends[13]>=biggest203462){
      biggest203462=ends[13];
    }
    if(ends[14]>=biggest203462){
      biggest203462=ends[14];
    }
    if(biggest203462 == 1){
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
      switch(S202393){
        case 0 : 
          S202393=0;
          break RUN;
        
        case 1 : 
          S202393=2;
          S202393=2;
          thread203459(tdone,ends);
          thread203463(tdone,ends);
          int biggest203471 = 0;
          if(ends[12]>=biggest203471){
            biggest203471=ends[12];
          }
          if(ends[15]>=biggest203471){
            biggest203471=ends[15];
          }
          if(biggest203471 == 1){
            active[11]=1;
            ends[11]=1;
            break RUN;
          }
        
        case 2 : 
          thread203472(tdone,ends);
          thread203479(tdone,ends);
          int biggest203487 = 0;
          if(ends[12]>=biggest203487){
            biggest203487=ends[12];
          }
          if(ends[15]>=biggest203487){
            biggest203487=ends[15];
          }
          if(biggest203487 == 1){
            active[11]=1;
            ends[11]=1;
            break RUN;
          }
          //FINXME code
          if(biggest203487 == 0){
            S202393=0;
            active[11]=0;
            ends[11]=0;
            S202393=0;
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
