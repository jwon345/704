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
  private int S193023 = 1;
  private int S192962 = 1;
  private int S192805 = 1;
  private int S192804 = 1;
  private int S192836 = 1;
  private int S192835 = 1;
  private int S193021 = 1;
  private int S192970 = 1;
  private int S192978 = 1;
  private int S192986 = 1;
  private int S192997 = 1;
  private int S193008 = 1;
  private int S193019 = 1;
  
  private int[] ends = new int[52];
  private int[] tdone = new int[52];
  
  public void thread194115(int [] tdone, int [] ends){
        switch(S193019){
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

  public void thread194114(int [] tdone, int [] ends){
        switch(S193008){
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

  public void thread194113(int [] tdone, int [] ends){
        switch(S192997){
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

  public void thread194112(int [] tdone, int [] ends){
        switch(S192986){
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

  public void thread194111(int [] tdone, int [] ends){
        switch(S192978){
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

  public void thread194110(int [] tdone, int [] ends){
        switch(S192970){
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

  public void thread194109(int [] tdone, int [] ends){
        switch(S193021){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        thread194110(tdone,ends);
        thread194111(tdone,ends);
        thread194112(tdone,ends);
        thread194113(tdone,ends);
        thread194114(tdone,ends);
        thread194115(tdone,ends);
        int biggest194116 = 0;
        if(ends[16]>=biggest194116){
          biggest194116=ends[16];
        }
        if(ends[17]>=biggest194116){
          biggest194116=ends[17];
        }
        if(ends[18]>=biggest194116){
          biggest194116=ends[18];
        }
        if(ends[19]>=biggest194116){
          biggest194116=ends[19];
        }
        if(ends[20]>=biggest194116){
          biggest194116=ends[20];
        }
        if(ends[21]>=biggest194116){
          biggest194116=ends[21];
        }
        if(biggest194116 == 1){
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        //FINXME code
        if(biggest194116 == 0){
          S193021=0;
          active[15]=0;
          ends[15]=0;
          tdone[15]=1;
        }
        break;
      
    }
  }

  public void thread194107(int [] tdone, int [] ends){
        S192836=1;
    S192835=0;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread194106(int [] tdone, int [] ends){
        S192805=1;
    S192804=0;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread194104(int [] tdone, int [] ends){
        switch(S192836){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        switch(S192835){
          case 0 : 
            if(valveInletOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 81, column: 13
              S192835=1;
              __start_thread_14 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 80, column: 7
              if(com.systemj.Timer.getMs() - __start_thread_14 >= 100){//sysj\conveyor_plant.sysj line: 80, column: 7
                ends[14]=2;
                ;//sysj\conveyor_plant.sysj line: 80, column: 7
                dosUnitEvac.setPresent();//sysj\conveyor_plant.sysj line: 83, column: 7
                currsigs.addElement(dosUnitEvac);
                System.out.println("*Filler - Inlet Open (Pressure Can At Bottem) *");//sysj\conveyor_plant.sysj line: 85, column: 7
                S192836=0;
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
              S192836=0;
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

  public void thread194103(int [] tdone, int [] ends){
        switch(S192805){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S192804){
          case 0 : 
            if(valveInjectorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 71, column: 13
              S192804=1;
              __start_thread_13 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 70, column: 7
              if(com.systemj.Timer.getMs() - __start_thread_13 >= 100){//sysj\conveyor_plant.sysj line: 70, column: 7
                ends[13]=2;
                ;//sysj\conveyor_plant.sysj line: 70, column: 7
                dosUnitFilled.setPresent();//sysj\conveyor_plant.sysj line: 73, column: 7
                currsigs.addElement(dosUnitFilled);
                System.out.println("*Filler - Bottle Filled (Pressure Can At Top) *");//sysj\conveyor_plant.sysj line: 75, column: 7
                S192805=0;
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
              S192805=0;
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

  public void thread194102(int [] tdone, int [] ends){
        switch(S192962){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        thread194103(tdone,ends);
        thread194104(tdone,ends);
        int biggest194105 = 0;
        if(ends[13]>=biggest194105){
          biggest194105=ends[13];
        }
        if(ends[14]>=biggest194105){
          biggest194105=ends[14];
        }
        if(biggest194105 == 1){
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        //FINXME code
        if(biggest194105 == 0){
          thread194106(tdone,ends);
          thread194107(tdone,ends);
          int biggest194108 = 0;
          if(ends[13]>=biggest194108){
            biggest194108=ends[13];
          }
          if(ends[14]>=biggest194108){
            biggest194108=ends[14];
          }
          if(biggest194108 == 1){
            active[12]=1;
            ends[12]=1;
            tdone[12]=1;
          }
        }
        break;
      
    }
  }

  public void thread194099(int [] tdone, int [] ends){
        S193019=1;
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

  public void thread194098(int [] tdone, int [] ends){
        S193008=1;
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

  public void thread194097(int [] tdone, int [] ends){
        S192997=1;
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

  public void thread194096(int [] tdone, int [] ends){
        S192986=1;
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

  public void thread194095(int [] tdone, int [] ends){
        S192978=1;
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

  public void thread194094(int [] tdone, int [] ends){
        S192970=1;
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

  public void thread194093(int [] tdone, int [] ends){
        S193021=1;
    thread194094(tdone,ends);
    thread194095(tdone,ends);
    thread194096(tdone,ends);
    thread194097(tdone,ends);
    thread194098(tdone,ends);
    thread194099(tdone,ends);
    int biggest194100 = 0;
    if(ends[16]>=biggest194100){
      biggest194100=ends[16];
    }
    if(ends[17]>=biggest194100){
      biggest194100=ends[17];
    }
    if(ends[18]>=biggest194100){
      biggest194100=ends[18];
    }
    if(ends[19]>=biggest194100){
      biggest194100=ends[19];
    }
    if(ends[20]>=biggest194100){
      biggest194100=ends[20];
    }
    if(ends[21]>=biggest194100){
      biggest194100=ends[21];
    }
    if(biggest194100 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread194091(int [] tdone, int [] ends){
        S192836=1;
    S192835=0;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread194090(int [] tdone, int [] ends){
        S192805=1;
    S192804=0;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread194089(int [] tdone, int [] ends){
        S192962=1;
    thread194090(tdone,ends);
    thread194091(tdone,ends);
    int biggest194092 = 0;
    if(ends[13]>=biggest194092){
      biggest194092=ends[13];
    }
    if(ends[14]>=biggest194092){
      biggest194092=ends[14];
    }
    if(biggest194092 == 1){
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
      switch(S193023){
        case 0 : 
          S193023=0;
          break RUN;
        
        case 1 : 
          S193023=2;
          S193023=2;
          thread194089(tdone,ends);
          thread194093(tdone,ends);
          int biggest194101 = 0;
          if(ends[12]>=biggest194101){
            biggest194101=ends[12];
          }
          if(ends[15]>=biggest194101){
            biggest194101=ends[15];
          }
          if(biggest194101 == 1){
            active[11]=1;
            ends[11]=1;
            break RUN;
          }
        
        case 2 : 
          thread194102(tdone,ends);
          thread194109(tdone,ends);
          int biggest194117 = 0;
          if(ends[12]>=biggest194117){
            biggest194117=ends[12];
          }
          if(ends[15]>=biggest194117){
            biggest194117=ends[15];
          }
          if(biggest194117 == 1){
            active[11]=1;
            ends[11]=1;
            break RUN;
          }
          //FINXME code
          if(biggest194117 == 0){
            S193023=0;
            active[11]=0;
            ends[11]=0;
            S193023=0;
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
