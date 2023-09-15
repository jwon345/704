import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

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
  private long __start_thread_26;//sysj\filler.sysj line: 244, column: 7
  private long __start_thread_27;//sysj\filler.sysj line: 254, column: 7
  private int S116236 = 1;
  private int S116175 = 1;
  private int S116018 = 1;
  private int S116017 = 1;
  private int S116049 = 1;
  private int S116048 = 1;
  private int S116234 = 1;
  private int S116183 = 1;
  private int S116191 = 1;
  private int S116199 = 1;
  private int S116210 = 1;
  private int S116221 = 1;
  private int S116232 = 1;
  
  private int[] ends = new int[35];
  private int[] tdone = new int[35];
  
  public void thread116445(int [] tdone, int [] ends){
        switch(S116232){
      case 0 : 
        active[34]=0;
        ends[34]=0;
        tdone[34]=1;
        break;
      
      case 1 : 
        if(dosUnitFilled.getprestatus()){//sysj\filler.sysj line: 279, column: 34
          ;//sysj\filler.sysj line: 279, column: 49
          dosUnitFilledE.setPresent();//sysj\filler.sysj line: 279, column: 50
          currsigs.addElement(dosUnitFilledE);
          active[34]=1;
          ends[34]=1;
          tdone[34]=1;
        }
        else {
          active[34]=1;
          ends[34]=1;
          tdone[34]=1;
        }
        break;
      
    }
  }

  public void thread116444(int [] tdone, int [] ends){
        switch(S116221){
      case 0 : 
        active[33]=0;
        ends[33]=0;
        tdone[33]=1;
        break;
      
      case 1 : 
        if(dosUnitEvac.getprestatus()){//sysj\filler.sysj line: 277, column: 34
          ;//sysj\filler.sysj line: 277, column: 47
          dosUnitEvacE.setPresent();//sysj\filler.sysj line: 277, column: 48
          currsigs.addElement(dosUnitEvacE);
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
        else {
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
        break;
      
    }
  }

  public void thread116443(int [] tdone, int [] ends){
        switch(S116210){
      case 0 : 
        active[32]=0;
        ends[32]=0;
        tdone[32]=1;
        break;
      
      case 1 : 
        if(dosUnitValveExtend.getprestatus()){//sysj\filler.sysj line: 275, column: 34
          ;//sysj\filler.sysj line: 275, column: 54
          dosUnitValveExtendE.setPresent();//sysj\filler.sysj line: 275, column: 55
          currsigs.addElement(dosUnitValveExtendE);
          active[32]=1;
          ends[32]=1;
          tdone[32]=1;
        }
        else {
          active[32]=1;
          ends[32]=1;
          tdone[32]=1;
        }
        break;
      
    }
  }

  public void thread116442(int [] tdone, int [] ends){
        switch(S116199){
      case 0 : 
        active[31]=0;
        ends[31]=0;
        tdone[31]=1;
        break;
      
      case 1 : 
        if(dosUnitValveRetract.getprestatus()){//sysj\filler.sysj line: 273, column: 34
          dosUnitValveRetractE.setPresent();//sysj\filler.sysj line: 273, column: 55
          currsigs.addElement(dosUnitValveRetractE);
          active[31]=1;
          ends[31]=1;
          tdone[31]=1;
        }
        else {
          active[31]=1;
          ends[31]=1;
          tdone[31]=1;
        }
        break;
      
    }
  }

  public void thread116441(int [] tdone, int [] ends){
        switch(S116191){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        if(valveInletOnOff.getprestatus()){//sysj\filler.sysj line: 271, column: 34
          valveInletOnOffE.setPresent();//sysj\filler.sysj line: 271, column: 51
          currsigs.addElement(valveInletOnOffE);
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
        else {
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
        break;
      
    }
  }

  public void thread116440(int [] tdone, int [] ends){
        switch(S116183){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        if(valveInjectorOnOff.getprestatus()){//sysj\filler.sysj line: 269, column: 34
          valveInjectorOnOffE.setPresent();//sysj\filler.sysj line: 269, column: 54
          currsigs.addElement(valveInjectorOnOffE);
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
        else {
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
        break;
      
    }
  }

  public void thread116439(int [] tdone, int [] ends){
        switch(S116234){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        thread116440(tdone,ends);
        thread116441(tdone,ends);
        thread116442(tdone,ends);
        thread116443(tdone,ends);
        thread116444(tdone,ends);
        thread116445(tdone,ends);
        int biggest116446 = 0;
        if(ends[29]>=biggest116446){
          biggest116446=ends[29];
        }
        if(ends[30]>=biggest116446){
          biggest116446=ends[30];
        }
        if(ends[31]>=biggest116446){
          biggest116446=ends[31];
        }
        if(ends[32]>=biggest116446){
          biggest116446=ends[32];
        }
        if(ends[33]>=biggest116446){
          biggest116446=ends[33];
        }
        if(ends[34]>=biggest116446){
          biggest116446=ends[34];
        }
        if(biggest116446 == 1){
          active[28]=1;
          ends[28]=1;
          tdone[28]=1;
        }
        //FINXME code
        if(biggest116446 == 0){
          S116234=0;
          active[28]=0;
          ends[28]=0;
          tdone[28]=1;
        }
        break;
      
    }
  }

  public void thread116437(int [] tdone, int [] ends){
        S116049=1;
    S116048=0;
    active[27]=1;
    ends[27]=1;
    tdone[27]=1;
  }

  public void thread116436(int [] tdone, int [] ends){
        S116018=1;
    S116017=0;
    active[26]=1;
    ends[26]=1;
    tdone[26]=1;
  }

  public void thread116434(int [] tdone, int [] ends){
        switch(S116049){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        switch(S116048){
          case 0 : 
            if(valveInletOnOff.getprestatus()){//sysj\filler.sysj line: 255, column: 13
              S116048=1;
              __start_thread_27 = com.systemj.Timer.getMs();//sysj\filler.sysj line: 254, column: 7
              if(com.systemj.Timer.getMs() - __start_thread_27 >= 100){//sysj\filler.sysj line: 254, column: 7
                ends[27]=2;
                ;//sysj\filler.sysj line: 254, column: 7
                dosUnitEvac.setPresent();//sysj\filler.sysj line: 257, column: 7
                currsigs.addElement(dosUnitEvac);
                System.out.println("*Filler - Inlet Open (Pressure Can At Bottem) *");//sysj\filler.sysj line: 259, column: 7
                S116049=0;
                active[27]=0;
                ends[27]=0;
                tdone[27]=1;
              }
              else {
                active[27]=1;
                ends[27]=1;
                tdone[27]=1;
              }
            }
            else {
              active[27]=1;
              ends[27]=1;
              tdone[27]=1;
            }
            break;
          
          case 1 : 
            if(com.systemj.Timer.getMs() - __start_thread_27 >= 100){//sysj\filler.sysj line: 254, column: 7
              ends[27]=2;
              ;//sysj\filler.sysj line: 254, column: 7
              dosUnitEvac.setPresent();//sysj\filler.sysj line: 257, column: 7
              currsigs.addElement(dosUnitEvac);
              System.out.println("*Filler - Inlet Open (Pressure Can At Bottem) *");//sysj\filler.sysj line: 259, column: 7
              S116049=0;
              active[27]=0;
              ends[27]=0;
              tdone[27]=1;
            }
            else {
              active[27]=1;
              ends[27]=1;
              tdone[27]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread116433(int [] tdone, int [] ends){
        switch(S116018){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        switch(S116017){
          case 0 : 
            if(valveInjectorOnOff.getprestatus()){//sysj\filler.sysj line: 245, column: 13
              S116017=1;
              __start_thread_26 = com.systemj.Timer.getMs();//sysj\filler.sysj line: 244, column: 7
              if(com.systemj.Timer.getMs() - __start_thread_26 >= 100){//sysj\filler.sysj line: 244, column: 7
                ends[26]=2;
                ;//sysj\filler.sysj line: 244, column: 7
                dosUnitFilled.setPresent();//sysj\filler.sysj line: 247, column: 7
                currsigs.addElement(dosUnitFilled);
                System.out.println("*Filler - Bottle Filled (Pressure Can At Top) *");//sysj\filler.sysj line: 249, column: 7
                S116018=0;
                active[26]=0;
                ends[26]=0;
                tdone[26]=1;
              }
              else {
                active[26]=1;
                ends[26]=1;
                tdone[26]=1;
              }
            }
            else {
              active[26]=1;
              ends[26]=1;
              tdone[26]=1;
            }
            break;
          
          case 1 : 
            if(com.systemj.Timer.getMs() - __start_thread_26 >= 100){//sysj\filler.sysj line: 244, column: 7
              ends[26]=2;
              ;//sysj\filler.sysj line: 244, column: 7
              dosUnitFilled.setPresent();//sysj\filler.sysj line: 247, column: 7
              currsigs.addElement(dosUnitFilled);
              System.out.println("*Filler - Bottle Filled (Pressure Can At Top) *");//sysj\filler.sysj line: 249, column: 7
              S116018=0;
              active[26]=0;
              ends[26]=0;
              tdone[26]=1;
            }
            else {
              active[26]=1;
              ends[26]=1;
              tdone[26]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread116432(int [] tdone, int [] ends){
        switch(S116175){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        thread116433(tdone,ends);
        thread116434(tdone,ends);
        int biggest116435 = 0;
        if(ends[26]>=biggest116435){
          biggest116435=ends[26];
        }
        if(ends[27]>=biggest116435){
          biggest116435=ends[27];
        }
        if(biggest116435 == 1){
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
        //FINXME code
        if(biggest116435 == 0){
          thread116436(tdone,ends);
          thread116437(tdone,ends);
          int biggest116438 = 0;
          if(ends[26]>=biggest116438){
            biggest116438=ends[26];
          }
          if(ends[27]>=biggest116438){
            biggest116438=ends[27];
          }
          if(biggest116438 == 1){
            active[25]=1;
            ends[25]=1;
            tdone[25]=1;
          }
        }
        break;
      
    }
  }

  public void thread116429(int [] tdone, int [] ends){
        S116232=1;
    if(dosUnitFilled.getprestatus()){//sysj\filler.sysj line: 279, column: 34
      ;//sysj\filler.sysj line: 279, column: 49
      dosUnitFilledE.setPresent();//sysj\filler.sysj line: 279, column: 50
      currsigs.addElement(dosUnitFilledE);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread116428(int [] tdone, int [] ends){
        S116221=1;
    if(dosUnitEvac.getprestatus()){//sysj\filler.sysj line: 277, column: 34
      ;//sysj\filler.sysj line: 277, column: 47
      dosUnitEvacE.setPresent();//sysj\filler.sysj line: 277, column: 48
      currsigs.addElement(dosUnitEvacE);
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
  }

  public void thread116427(int [] tdone, int [] ends){
        S116210=1;
    if(dosUnitValveExtend.getprestatus()){//sysj\filler.sysj line: 275, column: 34
      ;//sysj\filler.sysj line: 275, column: 54
      dosUnitValveExtendE.setPresent();//sysj\filler.sysj line: 275, column: 55
      currsigs.addElement(dosUnitValveExtendE);
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
    else {
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread116426(int [] tdone, int [] ends){
        S116199=1;
    if(dosUnitValveRetract.getprestatus()){//sysj\filler.sysj line: 273, column: 34
      dosUnitValveRetractE.setPresent();//sysj\filler.sysj line: 273, column: 55
      currsigs.addElement(dosUnitValveRetractE);
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
    else {
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
  }

  public void thread116425(int [] tdone, int [] ends){
        S116191=1;
    if(valveInletOnOff.getprestatus()){//sysj\filler.sysj line: 271, column: 34
      valveInletOnOffE.setPresent();//sysj\filler.sysj line: 271, column: 51
      currsigs.addElement(valveInletOnOffE);
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
  }

  public void thread116424(int [] tdone, int [] ends){
        S116183=1;
    if(valveInjectorOnOff.getprestatus()){//sysj\filler.sysj line: 269, column: 34
      valveInjectorOnOffE.setPresent();//sysj\filler.sysj line: 269, column: 54
      currsigs.addElement(valveInjectorOnOffE);
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
    else {
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread116423(int [] tdone, int [] ends){
        S116234=1;
    thread116424(tdone,ends);
    thread116425(tdone,ends);
    thread116426(tdone,ends);
    thread116427(tdone,ends);
    thread116428(tdone,ends);
    thread116429(tdone,ends);
    int biggest116430 = 0;
    if(ends[29]>=biggest116430){
      biggest116430=ends[29];
    }
    if(ends[30]>=biggest116430){
      biggest116430=ends[30];
    }
    if(ends[31]>=biggest116430){
      biggest116430=ends[31];
    }
    if(ends[32]>=biggest116430){
      biggest116430=ends[32];
    }
    if(ends[33]>=biggest116430){
      biggest116430=ends[33];
    }
    if(ends[34]>=biggest116430){
      biggest116430=ends[34];
    }
    if(biggest116430 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread116421(int [] tdone, int [] ends){
        S116049=1;
    S116048=0;
    active[27]=1;
    ends[27]=1;
    tdone[27]=1;
  }

  public void thread116420(int [] tdone, int [] ends){
        S116018=1;
    S116017=0;
    active[26]=1;
    ends[26]=1;
    tdone[26]=1;
  }

  public void thread116419(int [] tdone, int [] ends){
        S116175=1;
    thread116420(tdone,ends);
    thread116421(tdone,ends);
    int biggest116422 = 0;
    if(ends[26]>=biggest116422){
      biggest116422=ends[26];
    }
    if(ends[27]>=biggest116422){
      biggest116422=ends[27];
    }
    if(biggest116422 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S116236){
        case 0 : 
          S116236=0;
          break RUN;
        
        case 1 : 
          S116236=2;
          S116236=2;
          thread116419(tdone,ends);
          thread116423(tdone,ends);
          int biggest116431 = 0;
          if(ends[25]>=biggest116431){
            biggest116431=ends[25];
          }
          if(ends[28]>=biggest116431){
            biggest116431=ends[28];
          }
          if(biggest116431 == 1){
            active[24]=1;
            ends[24]=1;
            break RUN;
          }
        
        case 2 : 
          thread116432(tdone,ends);
          thread116439(tdone,ends);
          int biggest116447 = 0;
          if(ends[25]>=biggest116447){
            biggest116447=ends[25];
          }
          if(ends[28]>=biggest116447){
            biggest116447=ends[28];
          }
          if(biggest116447 == 1){
            active[24]=1;
            ends[24]=1;
            break RUN;
          }
          //FINXME code
          if(biggest116447 == 0){
            S116236=0;
            active[24]=0;
            ends[24]=0;
            S116236=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[24] != 0){
      int index = 24;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[24]!=0 || suspended[24]!=0 || active[24]!=1);
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
      if(paused[24]!=0 || suspended[24]!=0 || active[24]!=1);
      else{
        valveInjectorOnOff.gethook();
        valveInletOnOff.gethook();
        dosUnitValveRetract.gethook();
        dosUnitValveExtend.gethook();
      }
      runFinisher();
      if(active[24] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
