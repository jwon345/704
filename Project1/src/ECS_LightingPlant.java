import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.ECS_GUI;//sysj\ECS_plant.sysj line: 1, column: 1

public class ECS_LightingPlant extends ClockDomain{
  public ECS_LightingPlant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal zoneOneLightONOFF = new Signal("zoneOneLightONOFF", Signal.INPUT);
  public Signal zoneTwoLightONOFF = new Signal("zoneTwoLightONOFF", Signal.INPUT);
  public Signal zoneThreeLightONOFF = new Signal("zoneThreeLightONOFF", Signal.INPUT);
  public Signal zoneFourLightONOFF = new Signal("zoneFourLightONOFF", Signal.INPUT);
  public Signal zoneFiveLightONOFF = new Signal("zoneFiveLightONOFF", Signal.INPUT);
  public Signal zoneSixLightONOFF = new Signal("zoneSixLightONOFF", Signal.INPUT);
  public Signal zoneSevenLightONOFF = new Signal("zoneSevenLightONOFF", Signal.INPUT);
  public Signal zoneOneWindowONOFF = new Signal("zoneOneWindowONOFF", Signal.INPUT);
  public Signal zoneTwoWindowONOFF = new Signal("zoneTwoWindowONOFF", Signal.INPUT);
  public Signal zoneThreeWindowONOFF = new Signal("zoneThreeWindowONOFF", Signal.INPUT);
  public Signal zoneFourWindowONOFF = new Signal("zoneFourWindowONOFF", Signal.INPUT);
  public Signal zoneFiveWindowONOFF = new Signal("zoneFiveWindowONOFF", Signal.INPUT);
  public Signal zoneSixWindowONOFF = new Signal("zoneSixWindowONOFF", Signal.INPUT);
  public Signal zoneSevenWindowONOFF = new Signal("zoneSevenWindowONOFF", Signal.INPUT);
  private int S108382 = 1;
  private int S108276 = 1;
  private int S108284 = 1;
  private int S108292 = 1;
  private int S108300 = 1;
  private int S108308 = 1;
  private int S108316 = 1;
  private int S108324 = 1;
  private int S108332 = 1;
  private int S108340 = 1;
  private int S108348 = 1;
  private int S108356 = 1;
  private int S108364 = 1;
  private int S108372 = 1;
  private int S108380 = 1;
  
  private int[] ends = new int[23];
  private int[] tdone = new int[23];
  
  public void thread108435(int [] tdone, int [] ends){
        switch(S108380){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        if(zoneSevenLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 199, column: 21
          System.out.println("After Hours - Zone 7 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 200, column: 15
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

  public void thread108434(int [] tdone, int [] ends){
        switch(S108372){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        if(zoneSixLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 190, column: 21
          System.out.println("After Hours - Zone 6 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 191, column: 15
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

  public void thread108433(int [] tdone, int [] ends){
        switch(S108364){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        if(zoneFiveLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 181, column: 21
          System.out.println("After Hours - Zone 5 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 182, column: 15
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

  public void thread108432(int [] tdone, int [] ends){
        switch(S108356){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        if(zoneFourLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 172, column: 21
          System.out.println("After Hours - Zone 4 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 173, column: 15
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

  public void thread108431(int [] tdone, int [] ends){
        switch(S108348){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(zoneThreeLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 163, column: 21
          System.out.println("After Hours - Zone 3 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 164, column: 15
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

  public void thread108430(int [] tdone, int [] ends){
        switch(S108340){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(zoneTwoLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 154, column: 21
          System.out.println("After Hours - Zone 2 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 155, column: 15
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

  public void thread108429(int [] tdone, int [] ends){
        switch(S108332){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(zoneOneLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 146, column: 21
          System.out.println("After Hours - Zone 1 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 147, column: 15
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        else {
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        break;
      
    }
  }

  public void thread108428(int [] tdone, int [] ends){
        switch(S108324){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(zoneSevenWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 133, column: 21
          System.out.println("Work Hours - Zone 7 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 134, column: 15
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        else {
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        break;
      
    }
  }

  public void thread108427(int [] tdone, int [] ends){
        switch(S108316){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(zoneSixWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 125, column: 21
          System.out.println("Work Hours - Zone 6 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 126, column: 15
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        else {
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        break;
      
    }
  }

  public void thread108426(int [] tdone, int [] ends){
        switch(S108308){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(zoneFiveWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 117, column: 21
          System.out.println("Work Hours - Zone 5 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 118, column: 15
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        else {
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        break;
      
    }
  }

  public void thread108425(int [] tdone, int [] ends){
        switch(S108300){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(zoneFourWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 109, column: 21
          System.out.println("Work Hours - Zone 4 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 110, column: 15
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        else {
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        break;
      
    }
  }

  public void thread108424(int [] tdone, int [] ends){
        switch(S108292){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(zoneThreeWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 101, column: 21
          System.out.println("Work Hours - Zone 3 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 102, column: 15
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

  public void thread108423(int [] tdone, int [] ends){
        switch(S108284){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(zoneTwoWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 93, column: 21
          System.out.println("Work Hours - Zone 2 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 94, column: 15
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

  public void thread108422(int [] tdone, int [] ends){
        switch(S108276){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(zoneOneWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 86, column: 21
          System.out.println("Work Hours - Zone 1 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 87, column: 15
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

  public void thread108420(int [] tdone, int [] ends){
        S108380=1;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread108419(int [] tdone, int [] ends){
        S108372=1;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread108418(int [] tdone, int [] ends){
        S108364=1;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread108417(int [] tdone, int [] ends){
        S108356=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread108416(int [] tdone, int [] ends){
        S108348=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread108415(int [] tdone, int [] ends){
        S108340=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread108414(int [] tdone, int [] ends){
        S108332=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread108413(int [] tdone, int [] ends){
        S108324=1;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread108412(int [] tdone, int [] ends){
        S108316=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread108411(int [] tdone, int [] ends){
        S108308=1;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread108410(int [] tdone, int [] ends){
        S108300=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread108409(int [] tdone, int [] ends){
        S108292=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread108408(int [] tdone, int [] ends){
        S108284=1;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread108407(int [] tdone, int [] ends){
        S108276=1;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S108382){
        case 0 : 
          S108382=0;
          break RUN;
        
        case 1 : 
          S108382=2;
          S108382=2;
          thread108407(tdone,ends);
          thread108408(tdone,ends);
          thread108409(tdone,ends);
          thread108410(tdone,ends);
          thread108411(tdone,ends);
          thread108412(tdone,ends);
          thread108413(tdone,ends);
          thread108414(tdone,ends);
          thread108415(tdone,ends);
          thread108416(tdone,ends);
          thread108417(tdone,ends);
          thread108418(tdone,ends);
          thread108419(tdone,ends);
          thread108420(tdone,ends);
          int biggest108421 = 0;
          if(ends[8]>=biggest108421){
            biggest108421=ends[8];
          }
          if(ends[9]>=biggest108421){
            biggest108421=ends[9];
          }
          if(ends[10]>=biggest108421){
            biggest108421=ends[10];
          }
          if(ends[11]>=biggest108421){
            biggest108421=ends[11];
          }
          if(ends[12]>=biggest108421){
            biggest108421=ends[12];
          }
          if(ends[13]>=biggest108421){
            biggest108421=ends[13];
          }
          if(ends[14]>=biggest108421){
            biggest108421=ends[14];
          }
          if(ends[15]>=biggest108421){
            biggest108421=ends[15];
          }
          if(ends[16]>=biggest108421){
            biggest108421=ends[16];
          }
          if(ends[17]>=biggest108421){
            biggest108421=ends[17];
          }
          if(ends[18]>=biggest108421){
            biggest108421=ends[18];
          }
          if(ends[19]>=biggest108421){
            biggest108421=ends[19];
          }
          if(ends[20]>=biggest108421){
            biggest108421=ends[20];
          }
          if(ends[21]>=biggest108421){
            biggest108421=ends[21];
          }
          if(biggest108421 == 1){
            active[7]=1;
            ends[7]=1;
            break RUN;
          }
        
        case 2 : 
          thread108422(tdone,ends);
          thread108423(tdone,ends);
          thread108424(tdone,ends);
          thread108425(tdone,ends);
          thread108426(tdone,ends);
          thread108427(tdone,ends);
          thread108428(tdone,ends);
          thread108429(tdone,ends);
          thread108430(tdone,ends);
          thread108431(tdone,ends);
          thread108432(tdone,ends);
          thread108433(tdone,ends);
          thread108434(tdone,ends);
          thread108435(tdone,ends);
          int biggest108436 = 0;
          if(ends[8]>=biggest108436){
            biggest108436=ends[8];
          }
          if(ends[9]>=biggest108436){
            biggest108436=ends[9];
          }
          if(ends[10]>=biggest108436){
            biggest108436=ends[10];
          }
          if(ends[11]>=biggest108436){
            biggest108436=ends[11];
          }
          if(ends[12]>=biggest108436){
            biggest108436=ends[12];
          }
          if(ends[13]>=biggest108436){
            biggest108436=ends[13];
          }
          if(ends[14]>=biggest108436){
            biggest108436=ends[14];
          }
          if(ends[15]>=biggest108436){
            biggest108436=ends[15];
          }
          if(ends[16]>=biggest108436){
            biggest108436=ends[16];
          }
          if(ends[17]>=biggest108436){
            biggest108436=ends[17];
          }
          if(ends[18]>=biggest108436){
            biggest108436=ends[18];
          }
          if(ends[19]>=biggest108436){
            biggest108436=ends[19];
          }
          if(ends[20]>=biggest108436){
            biggest108436=ends[20];
          }
          if(ends[21]>=biggest108436){
            biggest108436=ends[21];
          }
          if(biggest108436 == 1){
            active[7]=1;
            ends[7]=1;
            break RUN;
          }
          //FINXME code
          if(biggest108436 == 0){
            S108382=0;
            active[7]=0;
            ends[7]=0;
            S108382=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[7] != 0){
      int index = 7;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[7]!=0 || suspended[7]!=0 || active[7]!=1);
      else{
        if(!df){
          zoneOneLightONOFF.gethook();
          zoneTwoLightONOFF.gethook();
          zoneThreeLightONOFF.gethook();
          zoneFourLightONOFF.gethook();
          zoneFiveLightONOFF.gethook();
          zoneSixLightONOFF.gethook();
          zoneSevenLightONOFF.gethook();
          zoneOneWindowONOFF.gethook();
          zoneTwoWindowONOFF.gethook();
          zoneThreeWindowONOFF.gethook();
          zoneFourWindowONOFF.gethook();
          zoneFiveWindowONOFF.gethook();
          zoneSixWindowONOFF.gethook();
          zoneSevenWindowONOFF.gethook();
          df = true;
        }
        runClockDomain();
      }
      zoneOneLightONOFF.setpreclear();
      zoneTwoLightONOFF.setpreclear();
      zoneThreeLightONOFF.setpreclear();
      zoneFourLightONOFF.setpreclear();
      zoneFiveLightONOFF.setpreclear();
      zoneSixLightONOFF.setpreclear();
      zoneSevenLightONOFF.setpreclear();
      zoneOneWindowONOFF.setpreclear();
      zoneTwoWindowONOFF.setpreclear();
      zoneThreeWindowONOFF.setpreclear();
      zoneFourWindowONOFF.setpreclear();
      zoneFiveWindowONOFF.setpreclear();
      zoneSixWindowONOFF.setpreclear();
      zoneSevenWindowONOFF.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = zoneOneLightONOFF.getStatus() ? zoneOneLightONOFF.setprepresent() : zoneOneLightONOFF.setpreclear();
      zoneOneLightONOFF.setpreval(zoneOneLightONOFF.getValue());
      zoneOneLightONOFF.setClear();
      dummyint = zoneTwoLightONOFF.getStatus() ? zoneTwoLightONOFF.setprepresent() : zoneTwoLightONOFF.setpreclear();
      zoneTwoLightONOFF.setpreval(zoneTwoLightONOFF.getValue());
      zoneTwoLightONOFF.setClear();
      dummyint = zoneThreeLightONOFF.getStatus() ? zoneThreeLightONOFF.setprepresent() : zoneThreeLightONOFF.setpreclear();
      zoneThreeLightONOFF.setpreval(zoneThreeLightONOFF.getValue());
      zoneThreeLightONOFF.setClear();
      dummyint = zoneFourLightONOFF.getStatus() ? zoneFourLightONOFF.setprepresent() : zoneFourLightONOFF.setpreclear();
      zoneFourLightONOFF.setpreval(zoneFourLightONOFF.getValue());
      zoneFourLightONOFF.setClear();
      dummyint = zoneFiveLightONOFF.getStatus() ? zoneFiveLightONOFF.setprepresent() : zoneFiveLightONOFF.setpreclear();
      zoneFiveLightONOFF.setpreval(zoneFiveLightONOFF.getValue());
      zoneFiveLightONOFF.setClear();
      dummyint = zoneSixLightONOFF.getStatus() ? zoneSixLightONOFF.setprepresent() : zoneSixLightONOFF.setpreclear();
      zoneSixLightONOFF.setpreval(zoneSixLightONOFF.getValue());
      zoneSixLightONOFF.setClear();
      dummyint = zoneSevenLightONOFF.getStatus() ? zoneSevenLightONOFF.setprepresent() : zoneSevenLightONOFF.setpreclear();
      zoneSevenLightONOFF.setpreval(zoneSevenLightONOFF.getValue());
      zoneSevenLightONOFF.setClear();
      dummyint = zoneOneWindowONOFF.getStatus() ? zoneOneWindowONOFF.setprepresent() : zoneOneWindowONOFF.setpreclear();
      zoneOneWindowONOFF.setpreval(zoneOneWindowONOFF.getValue());
      zoneOneWindowONOFF.setClear();
      dummyint = zoneTwoWindowONOFF.getStatus() ? zoneTwoWindowONOFF.setprepresent() : zoneTwoWindowONOFF.setpreclear();
      zoneTwoWindowONOFF.setpreval(zoneTwoWindowONOFF.getValue());
      zoneTwoWindowONOFF.setClear();
      dummyint = zoneThreeWindowONOFF.getStatus() ? zoneThreeWindowONOFF.setprepresent() : zoneThreeWindowONOFF.setpreclear();
      zoneThreeWindowONOFF.setpreval(zoneThreeWindowONOFF.getValue());
      zoneThreeWindowONOFF.setClear();
      dummyint = zoneFourWindowONOFF.getStatus() ? zoneFourWindowONOFF.setprepresent() : zoneFourWindowONOFF.setpreclear();
      zoneFourWindowONOFF.setpreval(zoneFourWindowONOFF.getValue());
      zoneFourWindowONOFF.setClear();
      dummyint = zoneFiveWindowONOFF.getStatus() ? zoneFiveWindowONOFF.setprepresent() : zoneFiveWindowONOFF.setpreclear();
      zoneFiveWindowONOFF.setpreval(zoneFiveWindowONOFF.getValue());
      zoneFiveWindowONOFF.setClear();
      dummyint = zoneSixWindowONOFF.getStatus() ? zoneSixWindowONOFF.setprepresent() : zoneSixWindowONOFF.setpreclear();
      zoneSixWindowONOFF.setpreval(zoneSixWindowONOFF.getValue());
      zoneSixWindowONOFF.setClear();
      dummyint = zoneSevenWindowONOFF.getStatus() ? zoneSevenWindowONOFF.setprepresent() : zoneSevenWindowONOFF.setpreclear();
      zoneSevenWindowONOFF.setpreval(zoneSevenWindowONOFF.getValue());
      zoneSevenWindowONOFF.setClear();
      if(paused[7]!=0 || suspended[7]!=0 || active[7]!=1);
      else{
        zoneOneLightONOFF.gethook();
        zoneTwoLightONOFF.gethook();
        zoneThreeLightONOFF.gethook();
        zoneFourLightONOFF.gethook();
        zoneFiveLightONOFF.gethook();
        zoneSixLightONOFF.gethook();
        zoneSevenLightONOFF.gethook();
        zoneOneWindowONOFF.gethook();
        zoneTwoWindowONOFF.gethook();
        zoneThreeWindowONOFF.gethook();
        zoneFourWindowONOFF.gethook();
        zoneFiveWindowONOFF.gethook();
        zoneSixWindowONOFF.gethook();
        zoneSevenWindowONOFF.gethook();
      }
      runFinisher();
      if(active[7] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
