import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.GUI;//sysj\conveyor_plant.sysj line: 1, column: 1

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
  private long __start_thread_17;//sysj\conveyor_plant.sysj line: 94, column: 5
  private int S32112 = 1;
  private int S32051 = 1;
  private int S31769 = 1;
  private int S32110 = 1;
  private int S32059 = 1;
  private int S32067 = 1;
  private int S32075 = 1;
  private int S32086 = 1;
  private int S32097 = 1;
  private int S32108 = 1;
  
  private int[] ends = new int[40];
  private int[] tdone = new int[40];
  
  public void thread32914(int [] tdone, int [] ends){
        switch(S32108){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        if(dosUnitFilled.getprestatus()){//sysj\conveyor_plant.sysj line: 122, column: 34
          ;//sysj\conveyor_plant.sysj line: 122, column: 49
          dosUnitFilledE.setPresent();//sysj\conveyor_plant.sysj line: 122, column: 50
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

  public void thread32913(int [] tdone, int [] ends){
        switch(S32097){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        if(dosUnitEvac.getprestatus()){//sysj\conveyor_plant.sysj line: 120, column: 34
          ;//sysj\conveyor_plant.sysj line: 120, column: 47
          dosUnitEvacE.setPresent();//sysj\conveyor_plant.sysj line: 120, column: 48
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

  public void thread32912(int [] tdone, int [] ends){
        switch(S32086){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        if(dosUnitValveExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 118, column: 34
          ;//sysj\conveyor_plant.sysj line: 118, column: 54
          dosUnitValveExtendE.setPresent();//sysj\conveyor_plant.sysj line: 118, column: 55
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

  public void thread32911(int [] tdone, int [] ends){
        switch(S32075){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        if(dosUnitValveRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 116, column: 34
          dosUnitValveRetractE.setPresent();//sysj\conveyor_plant.sysj line: 116, column: 55
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

  public void thread32910(int [] tdone, int [] ends){
        switch(S32067){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        if(valveInletOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 114, column: 34
          valveInletOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 114, column: 51
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

  public void thread32909(int [] tdone, int [] ends){
        switch(S32059){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        if(valveInjectorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 112, column: 34
          valveInjectorOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 112, column: 54
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

  public void thread32908(int [] tdone, int [] ends){
        switch(S32110){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        thread32909(tdone,ends);
        thread32910(tdone,ends);
        thread32911(tdone,ends);
        thread32912(tdone,ends);
        thread32913(tdone,ends);
        thread32914(tdone,ends);
        int biggest32915 = 0;
        if(ends[19]>=biggest32915){
          biggest32915=ends[19];
        }
        if(ends[20]>=biggest32915){
          biggest32915=ends[20];
        }
        if(ends[21]>=biggest32915){
          biggest32915=ends[21];
        }
        if(ends[22]>=biggest32915){
          biggest32915=ends[22];
        }
        if(ends[23]>=biggest32915){
          biggest32915=ends[23];
        }
        if(ends[24]>=biggest32915){
          biggest32915=ends[24];
        }
        if(biggest32915 == 1){
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
        //FINXME code
        if(biggest32915 == 0){
          S32110=0;
          active[18]=0;
          ends[18]=0;
          tdone[18]=1;
        }
        break;
      
    }
  }

  public void thread32907(int [] tdone, int [] ends){
        switch(S32051){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        switch(S31769){
          case 0 : 
            if(valveInjectorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 96, column: 13
              S31769=1;
              __start_thread_17 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 94, column: 5
              if(com.systemj.Timer.getMs() - __start_thread_17 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 94, column: 5
                ends[17]=2;
                ;//sysj\conveyor_plant.sysj line: 94, column: 5
                dosUnitFilled.setPresent();//sysj\conveyor_plant.sysj line: 98, column: 7
                currsigs.addElement(dosUnitFilled);
                System.out.println("*Filler - Bottle Filled (Pressure Can At Top) *");//sysj\conveyor_plant.sysj line: 99, column: 7
                S31769=2;
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
            else {
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            break;
          
          case 1 : 
            if(com.systemj.Timer.getMs() - __start_thread_17 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 94, column: 5
              ends[17]=2;
              ;//sysj\conveyor_plant.sysj line: 94, column: 5
              dosUnitFilled.setPresent();//sysj\conveyor_plant.sysj line: 98, column: 7
              currsigs.addElement(dosUnitFilled);
              System.out.println("*Filler - Bottle Filled (Pressure Can At Top) *");//sysj\conveyor_plant.sysj line: 99, column: 7
              S31769=2;
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
          
          case 2 : 
            if(valveInletOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 100, column: 13
              S31769=3;
              __start_thread_17 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 94, column: 5
              if(com.systemj.Timer.getMs() - __start_thread_17 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 94, column: 5
                ends[17]=2;
                ;//sysj\conveyor_plant.sysj line: 94, column: 5
                dosUnitEvac.setPresent();//sysj\conveyor_plant.sysj line: 102, column: 7
                currsigs.addElement(dosUnitEvac);
                System.out.println("*Filler - Inlet Open (Pressure Can At Bottem) *");//sysj\conveyor_plant.sysj line: 103, column: 7
                S31769=0;
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
            else {
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            break;
          
          case 3 : 
            if(com.systemj.Timer.getMs() - __start_thread_17 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 94, column: 5
              ends[17]=2;
              ;//sysj\conveyor_plant.sysj line: 94, column: 5
              dosUnitEvac.setPresent();//sysj\conveyor_plant.sysj line: 102, column: 7
              currsigs.addElement(dosUnitEvac);
              System.out.println("*Filler - Inlet Open (Pressure Can At Bottem) *");//sysj\conveyor_plant.sysj line: 103, column: 7
              S31769=0;
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
        break;
      
    }
  }

  public void thread32904(int [] tdone, int [] ends){
        S32108=1;
    if(dosUnitFilled.getprestatus()){//sysj\conveyor_plant.sysj line: 122, column: 34
      ;//sysj\conveyor_plant.sysj line: 122, column: 49
      dosUnitFilledE.setPresent();//sysj\conveyor_plant.sysj line: 122, column: 50
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

  public void thread32903(int [] tdone, int [] ends){
        S32097=1;
    if(dosUnitEvac.getprestatus()){//sysj\conveyor_plant.sysj line: 120, column: 34
      ;//sysj\conveyor_plant.sysj line: 120, column: 47
      dosUnitEvacE.setPresent();//sysj\conveyor_plant.sysj line: 120, column: 48
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

  public void thread32902(int [] tdone, int [] ends){
        S32086=1;
    if(dosUnitValveExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 118, column: 34
      ;//sysj\conveyor_plant.sysj line: 118, column: 54
      dosUnitValveExtendE.setPresent();//sysj\conveyor_plant.sysj line: 118, column: 55
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

  public void thread32901(int [] tdone, int [] ends){
        S32075=1;
    if(dosUnitValveRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 116, column: 34
      dosUnitValveRetractE.setPresent();//sysj\conveyor_plant.sysj line: 116, column: 55
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

  public void thread32900(int [] tdone, int [] ends){
        S32067=1;
    if(valveInletOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 114, column: 34
      valveInletOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 114, column: 51
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

  public void thread32899(int [] tdone, int [] ends){
        S32059=1;
    if(valveInjectorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 112, column: 34
      valveInjectorOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 112, column: 54
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

  public void thread32898(int [] tdone, int [] ends){
        S32110=1;
    thread32899(tdone,ends);
    thread32900(tdone,ends);
    thread32901(tdone,ends);
    thread32902(tdone,ends);
    thread32903(tdone,ends);
    thread32904(tdone,ends);
    int biggest32905 = 0;
    if(ends[19]>=biggest32905){
      biggest32905=ends[19];
    }
    if(ends[20]>=biggest32905){
      biggest32905=ends[20];
    }
    if(ends[21]>=biggest32905){
      biggest32905=ends[21];
    }
    if(ends[22]>=biggest32905){
      biggest32905=ends[22];
    }
    if(ends[23]>=biggest32905){
      biggest32905=ends[23];
    }
    if(ends[24]>=biggest32905){
      biggest32905=ends[24];
    }
    if(biggest32905 == 1){
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread32897(int [] tdone, int [] ends){
        S32051=1;
    S31769=0;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S32112){
        case 0 : 
          S32112=0;
          break RUN;
        
        case 1 : 
          S32112=2;
          S32112=2;
          thread32897(tdone,ends);
          thread32898(tdone,ends);
          int biggest32906 = 0;
          if(ends[17]>=biggest32906){
            biggest32906=ends[17];
          }
          if(ends[18]>=biggest32906){
            biggest32906=ends[18];
          }
          if(biggest32906 == 1){
            active[16]=1;
            ends[16]=1;
            break RUN;
          }
        
        case 2 : 
          thread32907(tdone,ends);
          thread32908(tdone,ends);
          int biggest32916 = 0;
          if(ends[17]>=biggest32916){
            biggest32916=ends[17];
          }
          if(ends[18]>=biggest32916){
            biggest32916=ends[18];
          }
          if(biggest32916 == 1){
            active[16]=1;
            ends[16]=1;
            break RUN;
          }
          //FINXME code
          if(biggest32916 == 0){
            S32112=0;
            active[16]=0;
            ends[16]=0;
            S32112=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[16] != 0){
      int index = 16;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[16]!=0 || suspended[16]!=0 || active[16]!=1);
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
      if(paused[16]!=0 || suspended[16]!=0 || active[16]!=1);
      else{
        valveInjectorOnOff.gethook();
        valveInletOnOff.gethook();
        dosUnitValveRetract.gethook();
        dosUnitValveExtend.gethook();
      }
      runFinisher();
      if(active[16] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
