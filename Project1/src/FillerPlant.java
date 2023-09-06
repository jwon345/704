import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.GUI;//sysj\filler_plant.sysj line: 1, column: 1

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
  private int S3227 = 1;
  private int S3071 = 1;
  private int S3059 = 1;
  private int S3141 = 1;
  private int S3079 = 1;
  private int S3073 = 1;
  private int S3087 = 1;
  private int S3095 = 1;
  private int S3106 = 1;
  private int S3117 = 1;
  private int S3128 = 1;
  private int S3139 = 1;
  
  private int[] ends = new int[11];
  private int[] tdone = new int[11];
  
  public void thread3248(int [] tdone, int [] ends){
        switch(S3139){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(dosUnitFilled.getprestatus()){//sysj\filler_plant.sysj line: 37, column: 33
          ;//sysj\filler_plant.sysj line: 37, column: 48
          dosUnitFilledE.setPresent();//sysj\filler_plant.sysj line: 37, column: 49
          currsigs.addElement(dosUnitFilledE);
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

  public void thread3247(int [] tdone, int [] ends){
        switch(S3128){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(dosUnitEvac.getprestatus()){//sysj\filler_plant.sysj line: 35, column: 33
          ;//sysj\filler_plant.sysj line: 35, column: 46
          dosUnitEvacE.setPresent();//sysj\filler_plant.sysj line: 35, column: 47
          currsigs.addElement(dosUnitEvacE);
          active[9]=1;
          ends[9]=1;
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

  public void thread3246(int [] tdone, int [] ends){
        switch(S3117){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(bottleAtPos2.getprestatus()){//sysj\filler_plant.sysj line: 33, column: 33
          ;//sysj\filler_plant.sysj line: 33, column: 47
          bottleAtPos2E.setPresent();//sysj\filler_plant.sysj line: 33, column: 48
          currsigs.addElement(bottleAtPos2E);
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

  public void thread3245(int [] tdone, int [] ends){
        switch(S3106){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 31, column: 33
          ;//sysj\filler_plant.sysj line: 31, column: 53
          dosUnitValveExtendE.setPresent();//sysj\filler_plant.sysj line: 31, column: 54
          currsigs.addElement(dosUnitValveExtendE);
          active[7]=1;
          ends[7]=1;
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

  public void thread3244(int [] tdone, int [] ends){
        switch(S3095){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 29, column: 33
          dosUnitValveRetractE.setPresent();//sysj\filler_plant.sysj line: 29, column: 54
          currsigs.addElement(dosUnitValveRetractE);
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

  public void thread3243(int [] tdone, int [] ends){
        switch(S3087){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 27, column: 33
          valveInletOnOffE.setPresent();//sysj\filler_plant.sysj line: 27, column: 50
          currsigs.addElement(valveInletOnOffE);
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        else {
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        break;
      
    }
  }

  public void thread3242(int [] tdone, int [] ends){
        switch(S3079){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S3073){
          case 0 : 
            S3073=0;
            if(valveInjectorOnOff.getprestatus()){//sysj\filler_plant.sysj line: 25, column: 33
              valveInjectorOnOffE.setPresent();//sysj\filler_plant.sysj line: 25, column: 53
              currsigs.addElement(valveInjectorOnOffE);
              S3073=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S3073=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            S3073=1;
            S3073=0;
            if(valveInjectorOnOff.getprestatus()){//sysj\filler_plant.sysj line: 25, column: 33
              valveInjectorOnOffE.setPresent();//sysj\filler_plant.sysj line: 25, column: 53
              currsigs.addElement(valveInjectorOnOffE);
              S3073=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S3073=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread3241(int [] tdone, int [] ends){
        switch(S3141){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread3242(tdone,ends);
        thread3243(tdone,ends);
        thread3244(tdone,ends);
        thread3245(tdone,ends);
        thread3246(tdone,ends);
        thread3247(tdone,ends);
        thread3248(tdone,ends);
        int biggest3249 = 0;
        if(ends[4]>=biggest3249){
          biggest3249=ends[4];
        }
        if(ends[5]>=biggest3249){
          biggest3249=ends[5];
        }
        if(ends[6]>=biggest3249){
          biggest3249=ends[6];
        }
        if(ends[7]>=biggest3249){
          biggest3249=ends[7];
        }
        if(ends[8]>=biggest3249){
          biggest3249=ends[8];
        }
        if(ends[9]>=biggest3249){
          biggest3249=ends[9];
        }
        if(ends[10]>=biggest3249){
          biggest3249=ends[10];
        }
        if(biggest3249 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest3249 == 0){
          S3141=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread3240(int [] tdone, int [] ends){
        switch(S3071){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S3059){
          case 0 : 
            if(valveInjectorOnOff.getprestatus()){//sysj\filler_plant.sysj line: 12, column: 12
              dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 13, column: 6
              currsigs.addElement(dosUnitFilled);
              System.out.println("*Filler - Bottle Filled (Pressure Can At Top) *");//sysj\filler_plant.sysj line: 14, column: 6
              S3059=1;
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
            if(valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 15, column: 12
              dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 16, column: 6
              currsigs.addElement(dosUnitEvac);
              System.out.println("*Filler - Inlet Open Pressure Can At Bottem*");//sysj\filler_plant.sysj line: 17, column: 6
              S3059=0;
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
          
        }
        break;
      
    }
  }

  public void thread3237(int [] tdone, int [] ends){
        S3139=1;
    if(dosUnitFilled.getprestatus()){//sysj\filler_plant.sysj line: 37, column: 33
      ;//sysj\filler_plant.sysj line: 37, column: 48
      dosUnitFilledE.setPresent();//sysj\filler_plant.sysj line: 37, column: 49
      currsigs.addElement(dosUnitFilledE);
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

  public void thread3236(int [] tdone, int [] ends){
        S3128=1;
    if(dosUnitEvac.getprestatus()){//sysj\filler_plant.sysj line: 35, column: 33
      ;//sysj\filler_plant.sysj line: 35, column: 46
      dosUnitEvacE.setPresent();//sysj\filler_plant.sysj line: 35, column: 47
      currsigs.addElement(dosUnitEvacE);
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread3235(int [] tdone, int [] ends){
        S3117=1;
    if(bottleAtPos2.getprestatus()){//sysj\filler_plant.sysj line: 33, column: 33
      ;//sysj\filler_plant.sysj line: 33, column: 47
      bottleAtPos2E.setPresent();//sysj\filler_plant.sysj line: 33, column: 48
      currsigs.addElement(bottleAtPos2E);
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

  public void thread3234(int [] tdone, int [] ends){
        S3106=1;
    if(dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 31, column: 33
      ;//sysj\filler_plant.sysj line: 31, column: 53
      dosUnitValveExtendE.setPresent();//sysj\filler_plant.sysj line: 31, column: 54
      currsigs.addElement(dosUnitValveExtendE);
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread3233(int [] tdone, int [] ends){
        S3095=1;
    if(dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 29, column: 33
      dosUnitValveRetractE.setPresent();//sysj\filler_plant.sysj line: 29, column: 54
      currsigs.addElement(dosUnitValveRetractE);
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

  public void thread3232(int [] tdone, int [] ends){
        S3087=1;
    if(valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 27, column: 33
      valveInletOnOffE.setPresent();//sysj\filler_plant.sysj line: 27, column: 50
      currsigs.addElement(valveInletOnOffE);
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread3231(int [] tdone, int [] ends){
        S3079=1;
    S3073=0;
    if(valveInjectorOnOff.getprestatus()){//sysj\filler_plant.sysj line: 25, column: 33
      valveInjectorOnOffE.setPresent();//sysj\filler_plant.sysj line: 25, column: 53
      currsigs.addElement(valveInjectorOnOffE);
      S3073=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S3073=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread3230(int [] tdone, int [] ends){
        S3141=1;
    thread3231(tdone,ends);
    thread3232(tdone,ends);
    thread3233(tdone,ends);
    thread3234(tdone,ends);
    thread3235(tdone,ends);
    thread3236(tdone,ends);
    thread3237(tdone,ends);
    int biggest3238 = 0;
    if(ends[4]>=biggest3238){
      biggest3238=ends[4];
    }
    if(ends[5]>=biggest3238){
      biggest3238=ends[5];
    }
    if(ends[6]>=biggest3238){
      biggest3238=ends[6];
    }
    if(ends[7]>=biggest3238){
      biggest3238=ends[7];
    }
    if(ends[8]>=biggest3238){
      biggest3238=ends[8];
    }
    if(ends[9]>=biggest3238){
      biggest3238=ends[9];
    }
    if(ends[10]>=biggest3238){
      biggest3238=ends[10];
    }
    if(biggest3238 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread3229(int [] tdone, int [] ends){
        S3071=1;
    S3059=0;
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
      switch(S3227){
        case 0 : 
          S3227=0;
          break RUN;
        
        case 1 : 
          S3227=2;
          S3227=2;
          new Thread(new GUI()).start();//sysj\filler_plant.sysj line: 9, column: 4
          thread3229(tdone,ends);
          thread3230(tdone,ends);
          int biggest3239 = 0;
          if(ends[2]>=biggest3239){
            biggest3239=ends[2];
          }
          if(ends[3]>=biggest3239){
            biggest3239=ends[3];
          }
          if(biggest3239 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread3240(tdone,ends);
          thread3241(tdone,ends);
          int biggest3250 = 0;
          if(ends[2]>=biggest3250){
            biggest3250=ends[2];
          }
          if(ends[3]>=biggest3250){
            biggest3250=ends[3];
          }
          if(biggest3250 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest3250 == 0){
            S3227=0;
            active[1]=0;
            ends[1]=0;
            S3227=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        valveInjectorOnOff.gethook();
        valveInletOnOff.gethook();
        dosUnitValveRetract.gethook();
        dosUnitValveExtend.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
