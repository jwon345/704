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
  private long __start_thread_16;//sysj\conveyor_plant.sysj line: 89, column: 7
  private long __start_thread_17;//sysj\conveyor_plant.sysj line: 99, column: 7
  private int S183863 = 1;
  private int S183802 = 1;
  private int S183645 = 1;
  private int S183644 = 1;
  private int S183676 = 1;
  private int S183675 = 1;
  private int S183861 = 1;
  private int S183810 = 1;
  private int S183818 = 1;
  private int S183826 = 1;
  private int S183837 = 1;
  private int S183848 = 1;
  private int S183859 = 1;
  
  private int[] ends = new int[55];
  private int[] tdone = new int[55];
  
  public void thread185050(int [] tdone, int [] ends){
        switch(S183859){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        if(dosUnitFilled.getprestatus()){//sysj\conveyor_plant.sysj line: 124, column: 34
          ;//sysj\conveyor_plant.sysj line: 124, column: 49
          dosUnitFilledE.setPresent();//sysj\conveyor_plant.sysj line: 124, column: 50
          currsigs.addElement(dosUnitFilledE);
          active[24]=1;
          ends[24]=1;
          tdone[24]=1;
        }
        else {
          active[24]=1;
          ends[24]=1;
          tdone[24]=1;
        }
        break;
      
    }
  }

  public void thread185049(int [] tdone, int [] ends){
        switch(S183848){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        if(dosUnitEvac.getprestatus()){//sysj\conveyor_plant.sysj line: 122, column: 34
          ;//sysj\conveyor_plant.sysj line: 122, column: 47
          dosUnitEvacE.setPresent();//sysj\conveyor_plant.sysj line: 122, column: 48
          currsigs.addElement(dosUnitEvacE);
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
        else {
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
        break;
      
    }
  }

  public void thread185048(int [] tdone, int [] ends){
        switch(S183837){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        if(dosUnitValveExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 120, column: 34
          ;//sysj\conveyor_plant.sysj line: 120, column: 54
          dosUnitValveExtendE.setPresent();//sysj\conveyor_plant.sysj line: 120, column: 55
          currsigs.addElement(dosUnitValveExtendE);
          active[22]=1;
          ends[22]=1;
          tdone[22]=1;
        }
        else {
          active[22]=1;
          ends[22]=1;
          tdone[22]=1;
        }
        break;
      
    }
  }

  public void thread185047(int [] tdone, int [] ends){
        switch(S183826){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        if(dosUnitValveRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 118, column: 34
          dosUnitValveRetractE.setPresent();//sysj\conveyor_plant.sysj line: 118, column: 55
          currsigs.addElement(dosUnitValveRetractE);
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

  public void thread185046(int [] tdone, int [] ends){
        switch(S183818){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        if(valveInletOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 116, column: 34
          valveInletOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 116, column: 51
          currsigs.addElement(valveInletOnOffE);
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

  public void thread185045(int [] tdone, int [] ends){
        switch(S183810){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        if(valveInjectorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 114, column: 34
          valveInjectorOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 114, column: 54
          currsigs.addElement(valveInjectorOnOffE);
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

  public void thread185044(int [] tdone, int [] ends){
        switch(S183861){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        thread185045(tdone,ends);
        thread185046(tdone,ends);
        thread185047(tdone,ends);
        thread185048(tdone,ends);
        thread185049(tdone,ends);
        thread185050(tdone,ends);
        int biggest185051 = 0;
        if(ends[19]>=biggest185051){
          biggest185051=ends[19];
        }
        if(ends[20]>=biggest185051){
          biggest185051=ends[20];
        }
        if(ends[21]>=biggest185051){
          biggest185051=ends[21];
        }
        if(ends[22]>=biggest185051){
          biggest185051=ends[22];
        }
        if(ends[23]>=biggest185051){
          biggest185051=ends[23];
        }
        if(ends[24]>=biggest185051){
          biggest185051=ends[24];
        }
        if(biggest185051 == 1){
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
        //FINXME code
        if(biggest185051 == 0){
          S183861=0;
          active[18]=0;
          ends[18]=0;
          tdone[18]=1;
        }
        break;
      
    }
  }

  public void thread185042(int [] tdone, int [] ends){
        S183676=1;
    S183675=0;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread185041(int [] tdone, int [] ends){
        S183645=1;
    S183644=0;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread185039(int [] tdone, int [] ends){
        switch(S183676){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        switch(S183675){
          case 0 : 
            if(valveInletOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 100, column: 13
              S183675=1;
              __start_thread_17 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 99, column: 7
              if(com.systemj.Timer.getMs() - __start_thread_17 >= 100){//sysj\conveyor_plant.sysj line: 99, column: 7
                ends[17]=2;
                ;//sysj\conveyor_plant.sysj line: 99, column: 7
                dosUnitEvac.setPresent();//sysj\conveyor_plant.sysj line: 102, column: 7
                currsigs.addElement(dosUnitEvac);
                System.out.println("*Filler - Inlet Open (Pressure Can At Bottem) *");//sysj\conveyor_plant.sysj line: 104, column: 7
                S183676=0;
                active[17]=0;
                ends[17]=0;
                tdone[17]=1;
              }
              else {
                active[17]=1;
                ends[17]=1;
                tdone[17]=1;
              }
            }
            else {
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            break;
          
          case 1 : 
            if(com.systemj.Timer.getMs() - __start_thread_17 >= 100){//sysj\conveyor_plant.sysj line: 99, column: 7
              ends[17]=2;
              ;//sysj\conveyor_plant.sysj line: 99, column: 7
              dosUnitEvac.setPresent();//sysj\conveyor_plant.sysj line: 102, column: 7
              currsigs.addElement(dosUnitEvac);
              System.out.println("*Filler - Inlet Open (Pressure Can At Bottem) *");//sysj\conveyor_plant.sysj line: 104, column: 7
              S183676=0;
              active[17]=0;
              ends[17]=0;
              tdone[17]=1;
            }
            else {
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread185038(int [] tdone, int [] ends){
        switch(S183645){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        switch(S183644){
          case 0 : 
            if(valveInjectorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 90, column: 13
              S183644=1;
              __start_thread_16 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 89, column: 7
              if(com.systemj.Timer.getMs() - __start_thread_16 >= 100){//sysj\conveyor_plant.sysj line: 89, column: 7
                ends[16]=2;
                ;//sysj\conveyor_plant.sysj line: 89, column: 7
                dosUnitFilled.setPresent();//sysj\conveyor_plant.sysj line: 92, column: 7
                currsigs.addElement(dosUnitFilled);
                System.out.println("*Filler - Bottle Filled (Pressure Can At Top) *");//sysj\conveyor_plant.sysj line: 94, column: 7
                S183645=0;
                active[16]=0;
                ends[16]=0;
                tdone[16]=1;
              }
              else {
                active[16]=1;
                ends[16]=1;
                tdone[16]=1;
              }
            }
            else {
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
          case 1 : 
            if(com.systemj.Timer.getMs() - __start_thread_16 >= 100){//sysj\conveyor_plant.sysj line: 89, column: 7
              ends[16]=2;
              ;//sysj\conveyor_plant.sysj line: 89, column: 7
              dosUnitFilled.setPresent();//sysj\conveyor_plant.sysj line: 92, column: 7
              currsigs.addElement(dosUnitFilled);
              System.out.println("*Filler - Bottle Filled (Pressure Can At Top) *");//sysj\conveyor_plant.sysj line: 94, column: 7
              S183645=0;
              active[16]=0;
              ends[16]=0;
              tdone[16]=1;
            }
            else {
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread185037(int [] tdone, int [] ends){
        switch(S183802){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        thread185038(tdone,ends);
        thread185039(tdone,ends);
        int biggest185040 = 0;
        if(ends[16]>=biggest185040){
          biggest185040=ends[16];
        }
        if(ends[17]>=biggest185040){
          biggest185040=ends[17];
        }
        if(biggest185040 == 1){
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        //FINXME code
        if(biggest185040 == 0){
          thread185041(tdone,ends);
          thread185042(tdone,ends);
          int biggest185043 = 0;
          if(ends[16]>=biggest185043){
            biggest185043=ends[16];
          }
          if(ends[17]>=biggest185043){
            biggest185043=ends[17];
          }
          if(biggest185043 == 1){
            active[15]=1;
            ends[15]=1;
            tdone[15]=1;
          }
        }
        break;
      
    }
  }

  public void thread185034(int [] tdone, int [] ends){
        S183859=1;
    if(dosUnitFilled.getprestatus()){//sysj\conveyor_plant.sysj line: 124, column: 34
      ;//sysj\conveyor_plant.sysj line: 124, column: 49
      dosUnitFilledE.setPresent();//sysj\conveyor_plant.sysj line: 124, column: 50
      currsigs.addElement(dosUnitFilledE);
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
    else {
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread185033(int [] tdone, int [] ends){
        S183848=1;
    if(dosUnitEvac.getprestatus()){//sysj\conveyor_plant.sysj line: 122, column: 34
      ;//sysj\conveyor_plant.sysj line: 122, column: 47
      dosUnitEvacE.setPresent();//sysj\conveyor_plant.sysj line: 122, column: 48
      currsigs.addElement(dosUnitEvacE);
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
  }

  public void thread185032(int [] tdone, int [] ends){
        S183837=1;
    if(dosUnitValveExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 120, column: 34
      ;//sysj\conveyor_plant.sysj line: 120, column: 54
      dosUnitValveExtendE.setPresent();//sysj\conveyor_plant.sysj line: 120, column: 55
      currsigs.addElement(dosUnitValveExtendE);
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread185031(int [] tdone, int [] ends){
        S183826=1;
    if(dosUnitValveRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 118, column: 34
      dosUnitValveRetractE.setPresent();//sysj\conveyor_plant.sysj line: 118, column: 55
      currsigs.addElement(dosUnitValveRetractE);
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

  public void thread185030(int [] tdone, int [] ends){
        S183818=1;
    if(valveInletOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 116, column: 34
      valveInletOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 116, column: 51
      currsigs.addElement(valveInletOnOffE);
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

  public void thread185029(int [] tdone, int [] ends){
        S183810=1;
    if(valveInjectorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 114, column: 34
      valveInjectorOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 114, column: 54
      currsigs.addElement(valveInjectorOnOffE);
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

  public void thread185028(int [] tdone, int [] ends){
        S183861=1;
    thread185029(tdone,ends);
    thread185030(tdone,ends);
    thread185031(tdone,ends);
    thread185032(tdone,ends);
    thread185033(tdone,ends);
    thread185034(tdone,ends);
    int biggest185035 = 0;
    if(ends[19]>=biggest185035){
      biggest185035=ends[19];
    }
    if(ends[20]>=biggest185035){
      biggest185035=ends[20];
    }
    if(ends[21]>=biggest185035){
      biggest185035=ends[21];
    }
    if(ends[22]>=biggest185035){
      biggest185035=ends[22];
    }
    if(ends[23]>=biggest185035){
      biggest185035=ends[23];
    }
    if(ends[24]>=biggest185035){
      biggest185035=ends[24];
    }
    if(biggest185035 == 1){
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread185026(int [] tdone, int [] ends){
        S183676=1;
    S183675=0;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread185025(int [] tdone, int [] ends){
        S183645=1;
    S183644=0;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread185024(int [] tdone, int [] ends){
        S183802=1;
    thread185025(tdone,ends);
    thread185026(tdone,ends);
    int biggest185027 = 0;
    if(ends[16]>=biggest185027){
      biggest185027=ends[16];
    }
    if(ends[17]>=biggest185027){
      biggest185027=ends[17];
    }
    if(biggest185027 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S183863){
        case 0 : 
          S183863=0;
          break RUN;
        
        case 1 : 
          S183863=2;
          S183863=2;
          thread185024(tdone,ends);
          thread185028(tdone,ends);
          int biggest185036 = 0;
          if(ends[15]>=biggest185036){
            biggest185036=ends[15];
          }
          if(ends[18]>=biggest185036){
            biggest185036=ends[18];
          }
          if(biggest185036 == 1){
            active[14]=1;
            ends[14]=1;
            break RUN;
          }
        
        case 2 : 
          thread185037(tdone,ends);
          thread185044(tdone,ends);
          int biggest185052 = 0;
          if(ends[15]>=biggest185052){
            biggest185052=ends[15];
          }
          if(ends[18]>=biggest185052){
            biggest185052=ends[18];
          }
          if(biggest185052 == 1){
            active[14]=1;
            ends[14]=1;
            break RUN;
          }
          //FINXME code
          if(biggest185052 == 0){
            S183863=0;
            active[14]=0;
            ends[14]=0;
            S183863=0;
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
    while(active[14] != 0){
      int index = 14;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[14]!=0 || suspended[14]!=0 || active[14]!=1);
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
      if(paused[14]!=0 || suspended[14]!=0 || active[14]!=1);
      else{
        valveInjectorOnOff.gethook();
        valveInletOnOff.gethook();
        dosUnitValveRetract.gethook();
        dosUnitValveExtend.gethook();
      }
      runFinisher();
      if(active[14] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
