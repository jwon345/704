import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class FillerController extends ClockDomain{
  public FillerController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal bottleAtPos2 = new Signal("bottleAtPos2", Signal.INPUT);
  public Signal dosUnitEvac = new Signal("dosUnitEvac", Signal.INPUT);
  public Signal dosUnitFilled = new Signal("dosUnitFilled", Signal.INPUT);
  public Signal valveInjectorOnOff = new Signal("valveInjectorOnOff", Signal.OUTPUT);
  public Signal valveInletOnOff = new Signal("valveInletOnOff", Signal.OUTPUT);
  public Signal dosUnitValveRetract = new Signal("dosUnitValveRetract", Signal.OUTPUT);
  public Signal dosUnitValveExtend = new Signal("dosUnitValveExtend", Signal.OUTPUT);
  private int S3041 = 1;
  private int S2750 = 1;
  private int S2758 = 1;
  private int S2763 = 1;
  private int S2786 = 1;
  private int S2791 = 1;
  
  private int[] ends = new int[6];
  private int[] tdone = new int[6];
  
  public void thread3056(int [] tdone, int [] ends){
        switch(S2791){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\filler_controller.sysj line: 31, column: 8
        currsigs.addElement(dosUnitValveExtend);
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
        break;
      
    }
  }

  public void thread3055(int [] tdone, int [] ends){
        switch(S2786){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\filler_controller.sysj line: 27, column: 8
        currsigs.addElement(valveInletOnOff);
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
        break;
      
    }
  }

  public void thread3053(int [] tdone, int [] ends){
        S2791=1;
    dosUnitValveExtend.setPresent();//sysj\filler_controller.sysj line: 31, column: 8
    currsigs.addElement(dosUnitValveExtend);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread3052(int [] tdone, int [] ends){
        S2786=1;
    System.out.println("*Filler - Valve Inlet On*");//sysj\filler_controller.sysj line: 26, column: 8
    valveInletOnOff.setPresent();//sysj\filler_controller.sysj line: 27, column: 8
    currsigs.addElement(valveInletOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread3050(int [] tdone, int [] ends){
        switch(S2763){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\filler_controller.sysj line: 20, column: 8
        currsigs.addElement(dosUnitValveRetract);
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
        break;
      
    }
  }

  public void thread3049(int [] tdone, int [] ends){
        switch(S2758){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\filler_controller.sysj line: 16, column: 8
        currsigs.addElement(valveInjectorOnOff);
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
        break;
      
    }
  }

  public void thread3047(int [] tdone, int [] ends){
        S2791=1;
    dosUnitValveExtend.setPresent();//sysj\filler_controller.sysj line: 31, column: 8
    currsigs.addElement(dosUnitValveExtend);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread3046(int [] tdone, int [] ends){
        S2786=1;
    System.out.println("*Filler - Valve Inlet On*");//sysj\filler_controller.sysj line: 26, column: 8
    valveInletOnOff.setPresent();//sysj\filler_controller.sysj line: 27, column: 8
    currsigs.addElement(valveInletOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread3044(int [] tdone, int [] ends){
        S2763=1;
    dosUnitValveRetract.setPresent();//sysj\filler_controller.sysj line: 20, column: 8
    currsigs.addElement(dosUnitValveRetract);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread3043(int [] tdone, int [] ends){
        S2758=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\filler_controller.sysj line: 15, column: 8
    valveInjectorOnOff.setPresent();//sysj\filler_controller.sysj line: 16, column: 8
    currsigs.addElement(valveInjectorOnOff);
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
      switch(S3041){
        case 0 : 
          S3041=0;
          break RUN;
        
        case 1 : 
          S3041=2;
          S3041=2;
          System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\filler_controller.sysj line: 8, column: 9
          S2750=0;
          active[1]=1;
          ends[1]=1;
          break RUN;
        
        case 2 : 
          switch(S2750){
            case 0 : 
              if(bottleAtPos2.getprestatus()){//sysj\filler_controller.sysj line: 9, column: 12
                System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\filler_controller.sysj line: 11, column: 6
                S2750=1;
                thread3043(tdone,ends);
                thread3044(tdone,ends);
                int biggest3045 = 0;
                if(ends[2]>=biggest3045){
                  biggest3045=ends[2];
                }
                if(ends[3]>=biggest3045){
                  biggest3045=ends[3];
                }
                if(biggest3045 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 1 : 
              if(dosUnitFilled.getprestatus()){//sysj\filler_controller.sysj line: 13, column: 12
                S2750=2;
                thread3046(tdone,ends);
                thread3047(tdone,ends);
                int biggest3048 = 0;
                if(ends[4]>=biggest3048){
                  biggest3048=ends[4];
                }
                if(ends[5]>=biggest3048){
                  biggest3048=ends[5];
                }
                if(biggest3048 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
              else {
                thread3049(tdone,ends);
                thread3050(tdone,ends);
                int biggest3051 = 0;
                if(ends[2]>=biggest3051){
                  biggest3051=ends[2];
                }
                if(ends[3]>=biggest3051){
                  biggest3051=ends[3];
                }
                if(biggest3051 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                //FINXME code
                if(biggest3051 == 0){
                  S2750=2;
                  thread3052(tdone,ends);
                  thread3053(tdone,ends);
                  int biggest3054 = 0;
                  if(ends[4]>=biggest3054){
                    biggest3054=ends[4];
                  }
                  if(ends[5]>=biggest3054){
                    biggest3054=ends[5];
                  }
                  if(biggest3054 == 1){
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
              }
            
            case 2 : 
              if(dosUnitEvac.getprestatus()){//sysj\filler_controller.sysj line: 24, column: 12
                System.out.println("* Filler operation done");//sysj\filler_controller.sysj line: 34, column: 6
                System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\filler_controller.sysj line: 8, column: 9
                S2750=0;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                thread3055(tdone,ends);
                thread3056(tdone,ends);
                int biggest3057 = 0;
                if(ends[4]>=biggest3057){
                  biggest3057=ends[4];
                }
                if(ends[5]>=biggest3057){
                  biggest3057=ends[5];
                }
                if(biggest3057 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                //FINXME code
                if(biggest3057 == 0){
                  System.out.println("* Filler operation done");//sysj\filler_controller.sysj line: 34, column: 6
                  System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\filler_controller.sysj line: 8, column: 9
                  S2750=0;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0};
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
          bottleAtPos2.gethook();
          dosUnitEvac.gethook();
          dosUnitFilled.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottleAtPos2.setpreclear();
      dosUnitEvac.setpreclear();
      dosUnitFilled.setpreclear();
      valveInjectorOnOff.setpreclear();
      valveInletOnOff.setpreclear();
      dosUnitValveRetract.setpreclear();
      dosUnitValveExtend.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = bottleAtPos2.getStatus() ? bottleAtPos2.setprepresent() : bottleAtPos2.setpreclear();
      bottleAtPos2.setpreval(bottleAtPos2.getValue());
      bottleAtPos2.setClear();
      dummyint = dosUnitEvac.getStatus() ? dosUnitEvac.setprepresent() : dosUnitEvac.setpreclear();
      dosUnitEvac.setpreval(dosUnitEvac.getValue());
      dosUnitEvac.setClear();
      dummyint = dosUnitFilled.getStatus() ? dosUnitFilled.setprepresent() : dosUnitFilled.setpreclear();
      dosUnitFilled.setpreval(dosUnitFilled.getValue());
      dosUnitFilled.setClear();
      valveInjectorOnOff.sethook();
      valveInjectorOnOff.setClear();
      valveInletOnOff.sethook();
      valveInletOnOff.setClear();
      dosUnitValveRetract.sethook();
      dosUnitValveRetract.setClear();
      dosUnitValveExtend.sethook();
      dosUnitValveExtend.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        bottleAtPos2.gethook();
        dosUnitEvac.gethook();
        dosUnitFilled.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
