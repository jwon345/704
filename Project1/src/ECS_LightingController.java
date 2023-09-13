import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class ECS_LightingController extends ClockDomain{
  public ECS_LightingController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal Zone1_Finished = new Signal("Zone1_Finished", Signal.INPUT);
  public Signal currentTime_2 = new Signal("currentTime_2", Signal.INPUT);
  public Signal zoneOneOccupancy = new Signal("zoneOneOccupancy", Signal.INPUT);
  public Signal zoneTwoOccupancy = new Signal("zoneTwoOccupancy", Signal.INPUT);
  public Signal zoneThreeOccupancy = new Signal("zoneThreeOccupancy", Signal.INPUT);
  public Signal zoneFourOccupancy = new Signal("zoneFourOccupancy", Signal.INPUT);
  public Signal zoneFiveOccupancy = new Signal("zoneFiveOccupancy", Signal.INPUT);
  public Signal zoneSixOccupancy = new Signal("zoneSixOccupancy", Signal.INPUT);
  public Signal zoneSevenOccupancy = new Signal("zoneSevenOccupancy", Signal.INPUT);
  public Signal zoneOneLightingI = new Signal("zoneOneLightingI", Signal.INPUT);
  public Signal zoneTwoLightingI = new Signal("zoneTwoLightingI", Signal.INPUT);
  public Signal zoneThreeLightingI = new Signal("zoneThreeLightingI", Signal.INPUT);
  public Signal zoneFourLightingI = new Signal("zoneFourLightingI", Signal.INPUT);
  public Signal zoneFiveLightingI = new Signal("zoneFiveLightingI", Signal.INPUT);
  public Signal zoneSixLightingI = new Signal("zoneSixLightingI", Signal.INPUT);
  public Signal zoneSevenLightingI = new Signal("zoneSevenLightingI", Signal.INPUT);
  public Signal zoneOneLightONOFF = new Signal("zoneOneLightONOFF", Signal.OUTPUT);
  public Signal zoneTwoLightONOFF = new Signal("zoneTwoLightONOFF", Signal.OUTPUT);
  public Signal zoneThreeLightONOFF = new Signal("zoneThreeLightONOFF", Signal.OUTPUT);
  public Signal zoneFourLightONOFF = new Signal("zoneFourLightONOFF", Signal.OUTPUT);
  public Signal zoneFiveLightONOFF = new Signal("zoneFiveLightONOFF", Signal.OUTPUT);
  public Signal zoneSixLightONOFF = new Signal("zoneSixLightONOFF", Signal.OUTPUT);
  public Signal zoneSevenLightONOFF = new Signal("zoneSevenLightONOFF", Signal.OUTPUT);
  public Signal zoneOneWindowONOFF = new Signal("zoneOneWindowONOFF", Signal.OUTPUT);
  public Signal zoneTwoWindowONOFF = new Signal("zoneTwoWindowONOFF", Signal.OUTPUT);
  public Signal zoneThreeWindowONOFF = new Signal("zoneThreeWindowONOFF", Signal.OUTPUT);
  public Signal zoneFourWindowONOFF = new Signal("zoneFourWindowONOFF", Signal.OUTPUT);
  public Signal zoneFiveWindowONOFF = new Signal("zoneFiveWindowONOFF", Signal.OUTPUT);
  public Signal zoneSixWindowONOFF = new Signal("zoneSixWindowONOFF", Signal.OUTPUT);
  public Signal zoneSevenWindowONOFF = new Signal("zoneSevenWindowONOFF", Signal.OUTPUT);
  private Signal workhrs_6;
  private Signal afterhrs_6;
  private Signal test_9;
  private Signal test_13;
  private Signal test_17;
  private Signal test_21;
  private Signal test_25;
  private Signal test_29;
  private Signal test_33;
  private Signal test_37;
  private Signal test_41;
  private Signal test_45;
  private Signal test_49;
  private Signal test_53;
  private Signal test_57;
  private Signal test_61;
  private int currentHour_thread_7;//sysj\ECS.sysj line: 352, column: 8
  private int zoneOcc_thread_10;//sysj\ECS.sysj line: 7, column: 13
  private int zoneLightInt_thread_10;//sysj\ECS.sysj line: 8, column: 13
  private int zoneOcc_thread_14;//sysj\ECS.sysj line: 7, column: 13
  private int zoneLightInt_thread_14;//sysj\ECS.sysj line: 8, column: 13
  private int zoneOcc_thread_18;//sysj\ECS.sysj line: 7, column: 13
  private int zoneLightInt_thread_18;//sysj\ECS.sysj line: 8, column: 13
  private int zoneOcc_thread_22;//sysj\ECS.sysj line: 7, column: 13
  private int zoneLightInt_thread_22;//sysj\ECS.sysj line: 8, column: 13
  private int zoneOcc_thread_26;//sysj\ECS.sysj line: 7, column: 13
  private int zoneLightInt_thread_26;//sysj\ECS.sysj line: 8, column: 13
  private int zoneOcc_thread_30;//sysj\ECS.sysj line: 7, column: 13
  private int zoneLightInt_thread_30;//sysj\ECS.sysj line: 8, column: 13
  private int zoneOcc_thread_34;//sysj\ECS.sysj line: 7, column: 13
  private int zoneLightInt_thread_34;//sysj\ECS.sysj line: 8, column: 13
  private int zoneOcc_thread_38;//sysj\ECS.sysj line: 41, column: 13
  private int zoneLightInt_thread_38;//sysj\ECS.sysj line: 42, column: 13
  private int zoneOcc_thread_42;//sysj\ECS.sysj line: 41, column: 13
  private int zoneLightInt_thread_42;//sysj\ECS.sysj line: 42, column: 13
  private int zoneOcc_thread_46;//sysj\ECS.sysj line: 41, column: 13
  private int zoneLightInt_thread_46;//sysj\ECS.sysj line: 42, column: 13
  private int zoneOcc_thread_50;//sysj\ECS.sysj line: 41, column: 13
  private int zoneLightInt_thread_50;//sysj\ECS.sysj line: 42, column: 13
  private int zoneOcc_thread_54;//sysj\ECS.sysj line: 41, column: 13
  private int zoneLightInt_thread_54;//sysj\ECS.sysj line: 42, column: 13
  private int zoneOcc_thread_58;//sysj\ECS.sysj line: 41, column: 13
  private int zoneLightInt_thread_58;//sysj\ECS.sysj line: 42, column: 13
  private int zoneOcc_thread_62;//sysj\ECS.sysj line: 41, column: 13
  private int zoneLightInt_thread_62;//sysj\ECS.sysj line: 42, column: 13
  private int S205150 = 1;
  private int S203858 = 1;
  private int S203808 = 1;
  private int S203812 = 1;
  private int S205148 = 1;
  private int S203950 = 1;
  private int S203870 = 1;
  private int S203861 = 1;
  private int S203873 = 1;
  private int S203881 = 1;
  private int S204042 = 1;
  private int S203962 = 1;
  private int S203953 = 1;
  private int S203965 = 1;
  private int S203973 = 1;
  private int S204134 = 1;
  private int S204054 = 1;
  private int S204045 = 1;
  private int S204057 = 1;
  private int S204065 = 1;
  private int S204226 = 1;
  private int S204146 = 1;
  private int S204137 = 1;
  private int S204149 = 1;
  private int S204157 = 1;
  private int S204318 = 1;
  private int S204238 = 1;
  private int S204229 = 1;
  private int S204241 = 1;
  private int S204249 = 1;
  private int S204410 = 1;
  private int S204330 = 1;
  private int S204321 = 1;
  private int S204333 = 1;
  private int S204341 = 1;
  private int S204502 = 1;
  private int S204422 = 1;
  private int S204413 = 1;
  private int S204425 = 1;
  private int S204433 = 1;
  private int S204594 = 1;
  private int S204514 = 1;
  private int S204505 = 1;
  private int S204517 = 1;
  private int S204525 = 1;
  private int S204686 = 1;
  private int S204606 = 1;
  private int S204597 = 1;
  private int S204609 = 1;
  private int S204617 = 1;
  private int S204778 = 1;
  private int S204698 = 1;
  private int S204689 = 1;
  private int S204701 = 1;
  private int S204709 = 1;
  private int S204870 = 1;
  private int S204790 = 1;
  private int S204781 = 1;
  private int S204793 = 1;
  private int S204801 = 1;
  private int S204962 = 1;
  private int S204882 = 1;
  private int S204873 = 1;
  private int S204885 = 1;
  private int S204893 = 1;
  private int S205054 = 1;
  private int S204974 = 1;
  private int S204965 = 1;
  private int S204977 = 1;
  private int S204985 = 1;
  private int S205146 = 1;
  private int S205066 = 1;
  private int S205057 = 1;
  private int S205069 = 1;
  private int S205077 = 1;
  
  private int[] ends = new int[69];
  private int[] tdone = new int[69];
  
  public void thread205471(int [] tdone, int [] ends){
        S205077=1;
    if((Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue()) == 0 || (Integer)(zoneSevenLightingI.getpreval() == null ? 0 : ((Integer)zoneSevenLightingI.getpreval()).intValue()) >= 50 || !afterhrs_6.getprestatus()){//sysj\ECS.sysj line: 59, column: 21
      test_61.setPresent();//sysj\ECS.sysj line: 60, column: 21
      currsigs.addElement(test_61);
      active[64]=1;
      ends[64]=1;
      tdone[64]=1;
    }
    else {
      active[64]=1;
      ends[64]=1;
      tdone[64]=1;
    }
  }

  public void thread205470(int [] tdone, int [] ends){
        S205069=1;
    active[63]=1;
    ends[63]=1;
    tdone[63]=1;
  }

  public void thread205469(int [] tdone, int [] ends){
        S205066=1;
    zoneOcc_thread_62 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_62 = (Integer)(zoneSevenLightingI.getpreval() == null ? 0 : ((Integer)zoneSevenLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S205057=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_62 > 0 && zoneLightInt_thread_62 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneSevenLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneSevenLightONOFF);
      active[62]=1;
      ends[62]=1;
      tdone[62]=1;
    }
    else {
      S205057=1;
      active[62]=1;
      ends[62]=1;
      tdone[62]=1;
    }
  }

  public void thread205467(int [] tdone, int [] ends){
        S205077=1;
    if((Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue()) == 0 || (Integer)(zoneSevenLightingI.getpreval() == null ? 0 : ((Integer)zoneSevenLightingI.getpreval()).intValue()) >= 50 || !afterhrs_6.getprestatus()){//sysj\ECS.sysj line: 59, column: 21
      test_61.setPresent();//sysj\ECS.sysj line: 60, column: 21
      currsigs.addElement(test_61);
      active[64]=1;
      ends[64]=1;
      tdone[64]=1;
    }
    else {
      active[64]=1;
      ends[64]=1;
      tdone[64]=1;
    }
  }

  public void thread205466(int [] tdone, int [] ends){
        S205069=1;
    active[63]=1;
    ends[63]=1;
    tdone[63]=1;
  }

  public void thread205465(int [] tdone, int [] ends){
        S205066=1;
    zoneOcc_thread_62 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_62 = (Integer)(zoneSevenLightingI.getpreval() == null ? 0 : ((Integer)zoneSevenLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S205057=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_62 > 0 && zoneLightInt_thread_62 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneSevenLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneSevenLightONOFF);
      active[62]=1;
      ends[62]=1;
      tdone[62]=1;
    }
    else {
      S205057=1;
      active[62]=1;
      ends[62]=1;
      tdone[62]=1;
    }
  }

  public void thread205463(int [] tdone, int [] ends){
        switch(S205077){
      case 0 : 
        active[64]=0;
        ends[64]=0;
        tdone[64]=1;
        break;
      
      case 1 : 
        if((Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue()) == 0 || (Integer)(zoneSevenLightingI.getpreval() == null ? 0 : ((Integer)zoneSevenLightingI.getpreval()).intValue()) >= 50 || !afterhrs_6.getprestatus()){//sysj\ECS.sysj line: 59, column: 21
          test_61.setPresent();//sysj\ECS.sysj line: 60, column: 21
          currsigs.addElement(test_61);
          active[64]=1;
          ends[64]=1;
          tdone[64]=1;
        }
        else {
          active[64]=1;
          ends[64]=1;
          tdone[64]=1;
        }
        break;
      
    }
  }

  public void thread205462(int [] tdone, int [] ends){
        switch(S205069){
      case 0 : 
        active[63]=0;
        ends[63]=0;
        tdone[63]=1;
        break;
      
      case 1 : 
        if(test_61.getprestatus()){//sysj\ECS.sysj line: 51, column: 19
          ends[63]=2;
          tdone[63]=1;
        }
        else {
          active[63]=1;
          ends[63]=1;
          tdone[63]=1;
        }
        break;
      
    }
  }

  public void thread205461(int [] tdone, int [] ends){
        switch(S205066){
      case 0 : 
        active[62]=0;
        ends[62]=0;
        tdone[62]=1;
        break;
      
      case 1 : 
        switch(S205057){
          case 0 : 
            zoneSevenLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
            currsigs.addElement(zoneSevenLightONOFF);
            active[62]=1;
            ends[62]=1;
            tdone[62]=1;
            break;
          
          case 1 : 
            S205057=1;
            S205066=0;
            active[62]=0;
            ends[62]=0;
            tdone[62]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread205460(int [] tdone, int [] ends){
        switch(S205146){
      case 0 : 
        active[61]=0;
        ends[61]=0;
        tdone[61]=1;
        break;
      
      case 1 : 
        test_61.setClear();//sysj\ECS.sysj line: 37, column: 5
        thread205461(tdone,ends);
        thread205462(tdone,ends);
        thread205463(tdone,ends);
        int biggest205464 = 0;
        if(ends[62]>=biggest205464){
          biggest205464=ends[62];
        }
        if(ends[63]>=biggest205464){
          biggest205464=ends[63];
        }
        if(ends[64]>=biggest205464){
          biggest205464=ends[64];
        }
        if(biggest205464 == 1){
          active[61]=1;
          ends[61]=1;
          tdone[61]=1;
        }
        if(biggest205464 == 2){
          ends[61]=2;
          ;//sysj\ECS.sysj line: 39, column: 5
          thread205465(tdone,ends);
          thread205466(tdone,ends);
          thread205467(tdone,ends);
          int biggest205468 = 0;
          if(ends[62]>=biggest205468){
            biggest205468=ends[62];
          }
          if(ends[63]>=biggest205468){
            biggest205468=ends[63];
          }
          if(ends[64]>=biggest205468){
            biggest205468=ends[64];
          }
          if(biggest205468 == 1){
            active[61]=1;
            ends[61]=1;
            tdone[61]=1;
          }
        }
        //FINXME code
        if(biggest205464 == 0){
          thread205469(tdone,ends);
          thread205470(tdone,ends);
          thread205471(tdone,ends);
          int biggest205472 = 0;
          if(ends[62]>=biggest205472){
            biggest205472=ends[62];
          }
          if(ends[63]>=biggest205472){
            biggest205472=ends[63];
          }
          if(ends[64]>=biggest205472){
            biggest205472=ends[64];
          }
          if(biggest205472 == 1){
            active[61]=1;
            ends[61]=1;
            tdone[61]=1;
          }
        }
        break;
      
    }
  }

  public void thread205458(int [] tdone, int [] ends){
        S204985=1;
    if((Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue()) == 0 || (Integer)(zoneSixLightingI.getpreval() == null ? 0 : ((Integer)zoneSixLightingI.getpreval()).intValue()) >= 50 || !afterhrs_6.getprestatus()){//sysj\ECS.sysj line: 59, column: 21
      test_57.setPresent();//sysj\ECS.sysj line: 60, column: 21
      currsigs.addElement(test_57);
      active[60]=1;
      ends[60]=1;
      tdone[60]=1;
    }
    else {
      active[60]=1;
      ends[60]=1;
      tdone[60]=1;
    }
  }

  public void thread205457(int [] tdone, int [] ends){
        S204977=1;
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread205456(int [] tdone, int [] ends){
        S204974=1;
    zoneOcc_thread_58 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_58 = (Integer)(zoneSixLightingI.getpreval() == null ? 0 : ((Integer)zoneSixLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204965=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_58 > 0 && zoneLightInt_thread_58 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneSixLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneSixLightONOFF);
      active[58]=1;
      ends[58]=1;
      tdone[58]=1;
    }
    else {
      S204965=1;
      active[58]=1;
      ends[58]=1;
      tdone[58]=1;
    }
  }

  public void thread205454(int [] tdone, int [] ends){
        S204985=1;
    if((Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue()) == 0 || (Integer)(zoneSixLightingI.getpreval() == null ? 0 : ((Integer)zoneSixLightingI.getpreval()).intValue()) >= 50 || !afterhrs_6.getprestatus()){//sysj\ECS.sysj line: 59, column: 21
      test_57.setPresent();//sysj\ECS.sysj line: 60, column: 21
      currsigs.addElement(test_57);
      active[60]=1;
      ends[60]=1;
      tdone[60]=1;
    }
    else {
      active[60]=1;
      ends[60]=1;
      tdone[60]=1;
    }
  }

  public void thread205453(int [] tdone, int [] ends){
        S204977=1;
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread205452(int [] tdone, int [] ends){
        S204974=1;
    zoneOcc_thread_58 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_58 = (Integer)(zoneSixLightingI.getpreval() == null ? 0 : ((Integer)zoneSixLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204965=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_58 > 0 && zoneLightInt_thread_58 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneSixLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneSixLightONOFF);
      active[58]=1;
      ends[58]=1;
      tdone[58]=1;
    }
    else {
      S204965=1;
      active[58]=1;
      ends[58]=1;
      tdone[58]=1;
    }
  }

  public void thread205450(int [] tdone, int [] ends){
        switch(S204985){
      case 0 : 
        active[60]=0;
        ends[60]=0;
        tdone[60]=1;
        break;
      
      case 1 : 
        if((Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue()) == 0 || (Integer)(zoneSixLightingI.getpreval() == null ? 0 : ((Integer)zoneSixLightingI.getpreval()).intValue()) >= 50 || !afterhrs_6.getprestatus()){//sysj\ECS.sysj line: 59, column: 21
          test_57.setPresent();//sysj\ECS.sysj line: 60, column: 21
          currsigs.addElement(test_57);
          active[60]=1;
          ends[60]=1;
          tdone[60]=1;
        }
        else {
          active[60]=1;
          ends[60]=1;
          tdone[60]=1;
        }
        break;
      
    }
  }

  public void thread205449(int [] tdone, int [] ends){
        switch(S204977){
      case 0 : 
        active[59]=0;
        ends[59]=0;
        tdone[59]=1;
        break;
      
      case 1 : 
        if(test_57.getprestatus()){//sysj\ECS.sysj line: 51, column: 19
          ends[59]=2;
          tdone[59]=1;
        }
        else {
          active[59]=1;
          ends[59]=1;
          tdone[59]=1;
        }
        break;
      
    }
  }

  public void thread205448(int [] tdone, int [] ends){
        switch(S204974){
      case 0 : 
        active[58]=0;
        ends[58]=0;
        tdone[58]=1;
        break;
      
      case 1 : 
        switch(S204965){
          case 0 : 
            zoneSixLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
            currsigs.addElement(zoneSixLightONOFF);
            active[58]=1;
            ends[58]=1;
            tdone[58]=1;
            break;
          
          case 1 : 
            S204965=1;
            S204974=0;
            active[58]=0;
            ends[58]=0;
            tdone[58]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread205447(int [] tdone, int [] ends){
        switch(S205054){
      case 0 : 
        active[57]=0;
        ends[57]=0;
        tdone[57]=1;
        break;
      
      case 1 : 
        test_57.setClear();//sysj\ECS.sysj line: 37, column: 5
        thread205448(tdone,ends);
        thread205449(tdone,ends);
        thread205450(tdone,ends);
        int biggest205451 = 0;
        if(ends[58]>=biggest205451){
          biggest205451=ends[58];
        }
        if(ends[59]>=biggest205451){
          biggest205451=ends[59];
        }
        if(ends[60]>=biggest205451){
          biggest205451=ends[60];
        }
        if(biggest205451 == 1){
          active[57]=1;
          ends[57]=1;
          tdone[57]=1;
        }
        if(biggest205451 == 2){
          ends[57]=2;
          ;//sysj\ECS.sysj line: 39, column: 5
          thread205452(tdone,ends);
          thread205453(tdone,ends);
          thread205454(tdone,ends);
          int biggest205455 = 0;
          if(ends[58]>=biggest205455){
            biggest205455=ends[58];
          }
          if(ends[59]>=biggest205455){
            biggest205455=ends[59];
          }
          if(ends[60]>=biggest205455){
            biggest205455=ends[60];
          }
          if(biggest205455 == 1){
            active[57]=1;
            ends[57]=1;
            tdone[57]=1;
          }
        }
        //FINXME code
        if(biggest205451 == 0){
          thread205456(tdone,ends);
          thread205457(tdone,ends);
          thread205458(tdone,ends);
          int biggest205459 = 0;
          if(ends[58]>=biggest205459){
            biggest205459=ends[58];
          }
          if(ends[59]>=biggest205459){
            biggest205459=ends[59];
          }
          if(ends[60]>=biggest205459){
            biggest205459=ends[60];
          }
          if(biggest205459 == 1){
            active[57]=1;
            ends[57]=1;
            tdone[57]=1;
          }
        }
        break;
      
    }
  }

  public void thread205445(int [] tdone, int [] ends){
        S204893=1;
    if((Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue()) == 0 || (Integer)(zoneFiveLightingI.getpreval() == null ? 0 : ((Integer)zoneFiveLightingI.getpreval()).intValue()) >= 50 || !afterhrs_6.getprestatus()){//sysj\ECS.sysj line: 59, column: 21
      test_53.setPresent();//sysj\ECS.sysj line: 60, column: 21
      currsigs.addElement(test_53);
      active[56]=1;
      ends[56]=1;
      tdone[56]=1;
    }
    else {
      active[56]=1;
      ends[56]=1;
      tdone[56]=1;
    }
  }

  public void thread205444(int [] tdone, int [] ends){
        S204885=1;
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread205443(int [] tdone, int [] ends){
        S204882=1;
    zoneOcc_thread_54 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_54 = (Integer)(zoneFiveLightingI.getpreval() == null ? 0 : ((Integer)zoneFiveLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204873=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_54 > 0 && zoneLightInt_thread_54 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneFiveLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneFiveLightONOFF);
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
    else {
      S204873=1;
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
  }

  public void thread205441(int [] tdone, int [] ends){
        S204893=1;
    if((Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue()) == 0 || (Integer)(zoneFiveLightingI.getpreval() == null ? 0 : ((Integer)zoneFiveLightingI.getpreval()).intValue()) >= 50 || !afterhrs_6.getprestatus()){//sysj\ECS.sysj line: 59, column: 21
      test_53.setPresent();//sysj\ECS.sysj line: 60, column: 21
      currsigs.addElement(test_53);
      active[56]=1;
      ends[56]=1;
      tdone[56]=1;
    }
    else {
      active[56]=1;
      ends[56]=1;
      tdone[56]=1;
    }
  }

  public void thread205440(int [] tdone, int [] ends){
        S204885=1;
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread205439(int [] tdone, int [] ends){
        S204882=1;
    zoneOcc_thread_54 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_54 = (Integer)(zoneFiveLightingI.getpreval() == null ? 0 : ((Integer)zoneFiveLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204873=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_54 > 0 && zoneLightInt_thread_54 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneFiveLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneFiveLightONOFF);
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
    else {
      S204873=1;
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
  }

  public void thread205437(int [] tdone, int [] ends){
        switch(S204893){
      case 0 : 
        active[56]=0;
        ends[56]=0;
        tdone[56]=1;
        break;
      
      case 1 : 
        if((Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue()) == 0 || (Integer)(zoneFiveLightingI.getpreval() == null ? 0 : ((Integer)zoneFiveLightingI.getpreval()).intValue()) >= 50 || !afterhrs_6.getprestatus()){//sysj\ECS.sysj line: 59, column: 21
          test_53.setPresent();//sysj\ECS.sysj line: 60, column: 21
          currsigs.addElement(test_53);
          active[56]=1;
          ends[56]=1;
          tdone[56]=1;
        }
        else {
          active[56]=1;
          ends[56]=1;
          tdone[56]=1;
        }
        break;
      
    }
  }

  public void thread205436(int [] tdone, int [] ends){
        switch(S204885){
      case 0 : 
        active[55]=0;
        ends[55]=0;
        tdone[55]=1;
        break;
      
      case 1 : 
        if(test_53.getprestatus()){//sysj\ECS.sysj line: 51, column: 19
          ends[55]=2;
          tdone[55]=1;
        }
        else {
          active[55]=1;
          ends[55]=1;
          tdone[55]=1;
        }
        break;
      
    }
  }

  public void thread205435(int [] tdone, int [] ends){
        switch(S204882){
      case 0 : 
        active[54]=0;
        ends[54]=0;
        tdone[54]=1;
        break;
      
      case 1 : 
        switch(S204873){
          case 0 : 
            zoneFiveLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
            currsigs.addElement(zoneFiveLightONOFF);
            active[54]=1;
            ends[54]=1;
            tdone[54]=1;
            break;
          
          case 1 : 
            S204873=1;
            S204882=0;
            active[54]=0;
            ends[54]=0;
            tdone[54]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread205434(int [] tdone, int [] ends){
        switch(S204962){
      case 0 : 
        active[53]=0;
        ends[53]=0;
        tdone[53]=1;
        break;
      
      case 1 : 
        test_53.setClear();//sysj\ECS.sysj line: 37, column: 5
        thread205435(tdone,ends);
        thread205436(tdone,ends);
        thread205437(tdone,ends);
        int biggest205438 = 0;
        if(ends[54]>=biggest205438){
          biggest205438=ends[54];
        }
        if(ends[55]>=biggest205438){
          biggest205438=ends[55];
        }
        if(ends[56]>=biggest205438){
          biggest205438=ends[56];
        }
        if(biggest205438 == 1){
          active[53]=1;
          ends[53]=1;
          tdone[53]=1;
        }
        if(biggest205438 == 2){
          ends[53]=2;
          ;//sysj\ECS.sysj line: 39, column: 5
          thread205439(tdone,ends);
          thread205440(tdone,ends);
          thread205441(tdone,ends);
          int biggest205442 = 0;
          if(ends[54]>=biggest205442){
            biggest205442=ends[54];
          }
          if(ends[55]>=biggest205442){
            biggest205442=ends[55];
          }
          if(ends[56]>=biggest205442){
            biggest205442=ends[56];
          }
          if(biggest205442 == 1){
            active[53]=1;
            ends[53]=1;
            tdone[53]=1;
          }
        }
        //FINXME code
        if(biggest205438 == 0){
          thread205443(tdone,ends);
          thread205444(tdone,ends);
          thread205445(tdone,ends);
          int biggest205446 = 0;
          if(ends[54]>=biggest205446){
            biggest205446=ends[54];
          }
          if(ends[55]>=biggest205446){
            biggest205446=ends[55];
          }
          if(ends[56]>=biggest205446){
            biggest205446=ends[56];
          }
          if(biggest205446 == 1){
            active[53]=1;
            ends[53]=1;
            tdone[53]=1;
          }
        }
        break;
      
    }
  }

  public void thread205432(int [] tdone, int [] ends){
        S204801=1;
    if((Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue()) == 0 || (Integer)(zoneFourLightingI.getpreval() == null ? 0 : ((Integer)zoneFourLightingI.getpreval()).intValue()) >= 50 || !afterhrs_6.getprestatus()){//sysj\ECS.sysj line: 59, column: 21
      test_49.setPresent();//sysj\ECS.sysj line: 60, column: 21
      currsigs.addElement(test_49);
      active[52]=1;
      ends[52]=1;
      tdone[52]=1;
    }
    else {
      active[52]=1;
      ends[52]=1;
      tdone[52]=1;
    }
  }

  public void thread205431(int [] tdone, int [] ends){
        S204793=1;
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread205430(int [] tdone, int [] ends){
        S204790=1;
    zoneOcc_thread_50 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_50 = (Integer)(zoneFourLightingI.getpreval() == null ? 0 : ((Integer)zoneFourLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204781=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_50 > 0 && zoneLightInt_thread_50 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneFourLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneFourLightONOFF);
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
    else {
      S204781=1;
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
  }

  public void thread205428(int [] tdone, int [] ends){
        S204801=1;
    if((Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue()) == 0 || (Integer)(zoneFourLightingI.getpreval() == null ? 0 : ((Integer)zoneFourLightingI.getpreval()).intValue()) >= 50 || !afterhrs_6.getprestatus()){//sysj\ECS.sysj line: 59, column: 21
      test_49.setPresent();//sysj\ECS.sysj line: 60, column: 21
      currsigs.addElement(test_49);
      active[52]=1;
      ends[52]=1;
      tdone[52]=1;
    }
    else {
      active[52]=1;
      ends[52]=1;
      tdone[52]=1;
    }
  }

  public void thread205427(int [] tdone, int [] ends){
        S204793=1;
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread205426(int [] tdone, int [] ends){
        S204790=1;
    zoneOcc_thread_50 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_50 = (Integer)(zoneFourLightingI.getpreval() == null ? 0 : ((Integer)zoneFourLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204781=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_50 > 0 && zoneLightInt_thread_50 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneFourLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneFourLightONOFF);
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
    else {
      S204781=1;
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
  }

  public void thread205424(int [] tdone, int [] ends){
        switch(S204801){
      case 0 : 
        active[52]=0;
        ends[52]=0;
        tdone[52]=1;
        break;
      
      case 1 : 
        if((Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue()) == 0 || (Integer)(zoneFourLightingI.getpreval() == null ? 0 : ((Integer)zoneFourLightingI.getpreval()).intValue()) >= 50 || !afterhrs_6.getprestatus()){//sysj\ECS.sysj line: 59, column: 21
          test_49.setPresent();//sysj\ECS.sysj line: 60, column: 21
          currsigs.addElement(test_49);
          active[52]=1;
          ends[52]=1;
          tdone[52]=1;
        }
        else {
          active[52]=1;
          ends[52]=1;
          tdone[52]=1;
        }
        break;
      
    }
  }

  public void thread205423(int [] tdone, int [] ends){
        switch(S204793){
      case 0 : 
        active[51]=0;
        ends[51]=0;
        tdone[51]=1;
        break;
      
      case 1 : 
        if(test_49.getprestatus()){//sysj\ECS.sysj line: 51, column: 19
          ends[51]=2;
          tdone[51]=1;
        }
        else {
          active[51]=1;
          ends[51]=1;
          tdone[51]=1;
        }
        break;
      
    }
  }

  public void thread205422(int [] tdone, int [] ends){
        switch(S204790){
      case 0 : 
        active[50]=0;
        ends[50]=0;
        tdone[50]=1;
        break;
      
      case 1 : 
        switch(S204781){
          case 0 : 
            zoneFourLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
            currsigs.addElement(zoneFourLightONOFF);
            active[50]=1;
            ends[50]=1;
            tdone[50]=1;
            break;
          
          case 1 : 
            S204781=1;
            S204790=0;
            active[50]=0;
            ends[50]=0;
            tdone[50]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread205421(int [] tdone, int [] ends){
        switch(S204870){
      case 0 : 
        active[49]=0;
        ends[49]=0;
        tdone[49]=1;
        break;
      
      case 1 : 
        test_49.setClear();//sysj\ECS.sysj line: 37, column: 5
        thread205422(tdone,ends);
        thread205423(tdone,ends);
        thread205424(tdone,ends);
        int biggest205425 = 0;
        if(ends[50]>=biggest205425){
          biggest205425=ends[50];
        }
        if(ends[51]>=biggest205425){
          biggest205425=ends[51];
        }
        if(ends[52]>=biggest205425){
          biggest205425=ends[52];
        }
        if(biggest205425 == 1){
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
        if(biggest205425 == 2){
          ends[49]=2;
          ;//sysj\ECS.sysj line: 39, column: 5
          thread205426(tdone,ends);
          thread205427(tdone,ends);
          thread205428(tdone,ends);
          int biggest205429 = 0;
          if(ends[50]>=biggest205429){
            biggest205429=ends[50];
          }
          if(ends[51]>=biggest205429){
            biggest205429=ends[51];
          }
          if(ends[52]>=biggest205429){
            biggest205429=ends[52];
          }
          if(biggest205429 == 1){
            active[49]=1;
            ends[49]=1;
            tdone[49]=1;
          }
        }
        //FINXME code
        if(biggest205425 == 0){
          thread205430(tdone,ends);
          thread205431(tdone,ends);
          thread205432(tdone,ends);
          int biggest205433 = 0;
          if(ends[50]>=biggest205433){
            biggest205433=ends[50];
          }
          if(ends[51]>=biggest205433){
            biggest205433=ends[51];
          }
          if(ends[52]>=biggest205433){
            biggest205433=ends[52];
          }
          if(biggest205433 == 1){
            active[49]=1;
            ends[49]=1;
            tdone[49]=1;
          }
        }
        break;
      
    }
  }

  public void thread205419(int [] tdone, int [] ends){
        S204709=1;
    if((Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue()) == 0 || (Integer)(zoneThreeLightingI.getpreval() == null ? 0 : ((Integer)zoneThreeLightingI.getpreval()).intValue()) >= 50 || !afterhrs_6.getprestatus()){//sysj\ECS.sysj line: 59, column: 21
      test_45.setPresent();//sysj\ECS.sysj line: 60, column: 21
      currsigs.addElement(test_45);
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
    else {
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
  }

  public void thread205418(int [] tdone, int [] ends){
        S204701=1;
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread205417(int [] tdone, int [] ends){
        S204698=1;
    zoneOcc_thread_46 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_46 = (Integer)(zoneThreeLightingI.getpreval() == null ? 0 : ((Integer)zoneThreeLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204689=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_46 > 0 && zoneLightInt_thread_46 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneThreeLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneThreeLightONOFF);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S204689=1;
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
  }

  public void thread205415(int [] tdone, int [] ends){
        S204709=1;
    if((Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue()) == 0 || (Integer)(zoneThreeLightingI.getpreval() == null ? 0 : ((Integer)zoneThreeLightingI.getpreval()).intValue()) >= 50 || !afterhrs_6.getprestatus()){//sysj\ECS.sysj line: 59, column: 21
      test_45.setPresent();//sysj\ECS.sysj line: 60, column: 21
      currsigs.addElement(test_45);
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
    else {
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
  }

  public void thread205414(int [] tdone, int [] ends){
        S204701=1;
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread205413(int [] tdone, int [] ends){
        S204698=1;
    zoneOcc_thread_46 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_46 = (Integer)(zoneThreeLightingI.getpreval() == null ? 0 : ((Integer)zoneThreeLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204689=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_46 > 0 && zoneLightInt_thread_46 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneThreeLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneThreeLightONOFF);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S204689=1;
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
  }

  public void thread205411(int [] tdone, int [] ends){
        switch(S204709){
      case 0 : 
        active[48]=0;
        ends[48]=0;
        tdone[48]=1;
        break;
      
      case 1 : 
        if((Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue()) == 0 || (Integer)(zoneThreeLightingI.getpreval() == null ? 0 : ((Integer)zoneThreeLightingI.getpreval()).intValue()) >= 50 || !afterhrs_6.getprestatus()){//sysj\ECS.sysj line: 59, column: 21
          test_45.setPresent();//sysj\ECS.sysj line: 60, column: 21
          currsigs.addElement(test_45);
          active[48]=1;
          ends[48]=1;
          tdone[48]=1;
        }
        else {
          active[48]=1;
          ends[48]=1;
          tdone[48]=1;
        }
        break;
      
    }
  }

  public void thread205410(int [] tdone, int [] ends){
        switch(S204701){
      case 0 : 
        active[47]=0;
        ends[47]=0;
        tdone[47]=1;
        break;
      
      case 1 : 
        if(test_45.getprestatus()){//sysj\ECS.sysj line: 51, column: 19
          ends[47]=2;
          tdone[47]=1;
        }
        else {
          active[47]=1;
          ends[47]=1;
          tdone[47]=1;
        }
        break;
      
    }
  }

  public void thread205409(int [] tdone, int [] ends){
        switch(S204698){
      case 0 : 
        active[46]=0;
        ends[46]=0;
        tdone[46]=1;
        break;
      
      case 1 : 
        switch(S204689){
          case 0 : 
            zoneThreeLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
            currsigs.addElement(zoneThreeLightONOFF);
            active[46]=1;
            ends[46]=1;
            tdone[46]=1;
            break;
          
          case 1 : 
            S204689=1;
            S204698=0;
            active[46]=0;
            ends[46]=0;
            tdone[46]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread205408(int [] tdone, int [] ends){
        switch(S204778){
      case 0 : 
        active[45]=0;
        ends[45]=0;
        tdone[45]=1;
        break;
      
      case 1 : 
        test_45.setClear();//sysj\ECS.sysj line: 37, column: 5
        thread205409(tdone,ends);
        thread205410(tdone,ends);
        thread205411(tdone,ends);
        int biggest205412 = 0;
        if(ends[46]>=biggest205412){
          biggest205412=ends[46];
        }
        if(ends[47]>=biggest205412){
          biggest205412=ends[47];
        }
        if(ends[48]>=biggest205412){
          biggest205412=ends[48];
        }
        if(biggest205412 == 1){
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
        if(biggest205412 == 2){
          ends[45]=2;
          ;//sysj\ECS.sysj line: 39, column: 5
          thread205413(tdone,ends);
          thread205414(tdone,ends);
          thread205415(tdone,ends);
          int biggest205416 = 0;
          if(ends[46]>=biggest205416){
            biggest205416=ends[46];
          }
          if(ends[47]>=biggest205416){
            biggest205416=ends[47];
          }
          if(ends[48]>=biggest205416){
            biggest205416=ends[48];
          }
          if(biggest205416 == 1){
            active[45]=1;
            ends[45]=1;
            tdone[45]=1;
          }
        }
        //FINXME code
        if(biggest205412 == 0){
          thread205417(tdone,ends);
          thread205418(tdone,ends);
          thread205419(tdone,ends);
          int biggest205420 = 0;
          if(ends[46]>=biggest205420){
            biggest205420=ends[46];
          }
          if(ends[47]>=biggest205420){
            biggest205420=ends[47];
          }
          if(ends[48]>=biggest205420){
            biggest205420=ends[48];
          }
          if(biggest205420 == 1){
            active[45]=1;
            ends[45]=1;
            tdone[45]=1;
          }
        }
        break;
      
    }
  }

  public void thread205406(int [] tdone, int [] ends){
        S204617=1;
    if((Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue()) == 0 || (Integer)(zoneTwoLightingI.getpreval() == null ? 0 : ((Integer)zoneTwoLightingI.getpreval()).intValue()) >= 50 || !afterhrs_6.getprestatus()){//sysj\ECS.sysj line: 59, column: 21
      test_41.setPresent();//sysj\ECS.sysj line: 60, column: 21
      currsigs.addElement(test_41);
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
    else {
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread205405(int [] tdone, int [] ends){
        S204609=1;
    active[43]=1;
    ends[43]=1;
    tdone[43]=1;
  }

  public void thread205404(int [] tdone, int [] ends){
        S204606=1;
    zoneOcc_thread_42 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_42 = (Integer)(zoneTwoLightingI.getpreval() == null ? 0 : ((Integer)zoneTwoLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204597=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_42 > 0 && zoneLightInt_thread_42 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneTwoLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneTwoLightONOFF);
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S204597=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread205402(int [] tdone, int [] ends){
        S204617=1;
    if((Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue()) == 0 || (Integer)(zoneTwoLightingI.getpreval() == null ? 0 : ((Integer)zoneTwoLightingI.getpreval()).intValue()) >= 50 || !afterhrs_6.getprestatus()){//sysj\ECS.sysj line: 59, column: 21
      test_41.setPresent();//sysj\ECS.sysj line: 60, column: 21
      currsigs.addElement(test_41);
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
    else {
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread205401(int [] tdone, int [] ends){
        S204609=1;
    active[43]=1;
    ends[43]=1;
    tdone[43]=1;
  }

  public void thread205400(int [] tdone, int [] ends){
        S204606=1;
    zoneOcc_thread_42 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_42 = (Integer)(zoneTwoLightingI.getpreval() == null ? 0 : ((Integer)zoneTwoLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204597=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_42 > 0 && zoneLightInt_thread_42 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneTwoLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneTwoLightONOFF);
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S204597=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread205398(int [] tdone, int [] ends){
        switch(S204617){
      case 0 : 
        active[44]=0;
        ends[44]=0;
        tdone[44]=1;
        break;
      
      case 1 : 
        if((Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue()) == 0 || (Integer)(zoneTwoLightingI.getpreval() == null ? 0 : ((Integer)zoneTwoLightingI.getpreval()).intValue()) >= 50 || !afterhrs_6.getprestatus()){//sysj\ECS.sysj line: 59, column: 21
          test_41.setPresent();//sysj\ECS.sysj line: 60, column: 21
          currsigs.addElement(test_41);
          active[44]=1;
          ends[44]=1;
          tdone[44]=1;
        }
        else {
          active[44]=1;
          ends[44]=1;
          tdone[44]=1;
        }
        break;
      
    }
  }

  public void thread205397(int [] tdone, int [] ends){
        switch(S204609){
      case 0 : 
        active[43]=0;
        ends[43]=0;
        tdone[43]=1;
        break;
      
      case 1 : 
        if(test_41.getprestatus()){//sysj\ECS.sysj line: 51, column: 19
          ends[43]=2;
          tdone[43]=1;
        }
        else {
          active[43]=1;
          ends[43]=1;
          tdone[43]=1;
        }
        break;
      
    }
  }

  public void thread205396(int [] tdone, int [] ends){
        switch(S204606){
      case 0 : 
        active[42]=0;
        ends[42]=0;
        tdone[42]=1;
        break;
      
      case 1 : 
        switch(S204597){
          case 0 : 
            zoneTwoLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
            currsigs.addElement(zoneTwoLightONOFF);
            active[42]=1;
            ends[42]=1;
            tdone[42]=1;
            break;
          
          case 1 : 
            S204597=1;
            S204606=0;
            active[42]=0;
            ends[42]=0;
            tdone[42]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread205395(int [] tdone, int [] ends){
        switch(S204686){
      case 0 : 
        active[41]=0;
        ends[41]=0;
        tdone[41]=1;
        break;
      
      case 1 : 
        test_41.setClear();//sysj\ECS.sysj line: 37, column: 5
        thread205396(tdone,ends);
        thread205397(tdone,ends);
        thread205398(tdone,ends);
        int biggest205399 = 0;
        if(ends[42]>=biggest205399){
          biggest205399=ends[42];
        }
        if(ends[43]>=biggest205399){
          biggest205399=ends[43];
        }
        if(ends[44]>=biggest205399){
          biggest205399=ends[44];
        }
        if(biggest205399 == 1){
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
        if(biggest205399 == 2){
          ends[41]=2;
          ;//sysj\ECS.sysj line: 39, column: 5
          thread205400(tdone,ends);
          thread205401(tdone,ends);
          thread205402(tdone,ends);
          int biggest205403 = 0;
          if(ends[42]>=biggest205403){
            biggest205403=ends[42];
          }
          if(ends[43]>=biggest205403){
            biggest205403=ends[43];
          }
          if(ends[44]>=biggest205403){
            biggest205403=ends[44];
          }
          if(biggest205403 == 1){
            active[41]=1;
            ends[41]=1;
            tdone[41]=1;
          }
        }
        //FINXME code
        if(biggest205399 == 0){
          thread205404(tdone,ends);
          thread205405(tdone,ends);
          thread205406(tdone,ends);
          int biggest205407 = 0;
          if(ends[42]>=biggest205407){
            biggest205407=ends[42];
          }
          if(ends[43]>=biggest205407){
            biggest205407=ends[43];
          }
          if(ends[44]>=biggest205407){
            biggest205407=ends[44];
          }
          if(biggest205407 == 1){
            active[41]=1;
            ends[41]=1;
            tdone[41]=1;
          }
        }
        break;
      
    }
  }

  public void thread205393(int [] tdone, int [] ends){
        S204525=1;
    if((Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue()) == 0 || (Integer)(zoneOneLightingI.getpreval() == null ? 0 : ((Integer)zoneOneLightingI.getpreval()).intValue()) >= 50 || !afterhrs_6.getprestatus()){//sysj\ECS.sysj line: 59, column: 21
      test_37.setPresent();//sysj\ECS.sysj line: 60, column: 21
      currsigs.addElement(test_37);
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
  }

  public void thread205392(int [] tdone, int [] ends){
        S204517=1;
    active[39]=1;
    ends[39]=1;
    tdone[39]=1;
  }

  public void thread205391(int [] tdone, int [] ends){
        S204514=1;
    zoneOcc_thread_38 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_38 = (Integer)(zoneOneLightingI.getpreval() == null ? 0 : ((Integer)zoneOneLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204505=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_38 > 0 && zoneLightInt_thread_38 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneOneLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneOneLightONOFF);
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      S204505=1;
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread205389(int [] tdone, int [] ends){
        S204525=1;
    if((Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue()) == 0 || (Integer)(zoneOneLightingI.getpreval() == null ? 0 : ((Integer)zoneOneLightingI.getpreval()).intValue()) >= 50 || !afterhrs_6.getprestatus()){//sysj\ECS.sysj line: 59, column: 21
      test_37.setPresent();//sysj\ECS.sysj line: 60, column: 21
      currsigs.addElement(test_37);
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
  }

  public void thread205388(int [] tdone, int [] ends){
        S204517=1;
    active[39]=1;
    ends[39]=1;
    tdone[39]=1;
  }

  public void thread205387(int [] tdone, int [] ends){
        S204514=1;
    zoneOcc_thread_38 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_38 = (Integer)(zoneOneLightingI.getpreval() == null ? 0 : ((Integer)zoneOneLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204505=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_38 > 0 && zoneLightInt_thread_38 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneOneLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneOneLightONOFF);
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      S204505=1;
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread205385(int [] tdone, int [] ends){
        switch(S204525){
      case 0 : 
        active[40]=0;
        ends[40]=0;
        tdone[40]=1;
        break;
      
      case 1 : 
        if((Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue()) == 0 || (Integer)(zoneOneLightingI.getpreval() == null ? 0 : ((Integer)zoneOneLightingI.getpreval()).intValue()) >= 50 || !afterhrs_6.getprestatus()){//sysj\ECS.sysj line: 59, column: 21
          test_37.setPresent();//sysj\ECS.sysj line: 60, column: 21
          currsigs.addElement(test_37);
          active[40]=1;
          ends[40]=1;
          tdone[40]=1;
        }
        else {
          active[40]=1;
          ends[40]=1;
          tdone[40]=1;
        }
        break;
      
    }
  }

  public void thread205384(int [] tdone, int [] ends){
        switch(S204517){
      case 0 : 
        active[39]=0;
        ends[39]=0;
        tdone[39]=1;
        break;
      
      case 1 : 
        if(test_37.getprestatus()){//sysj\ECS.sysj line: 51, column: 19
          ends[39]=2;
          tdone[39]=1;
        }
        else {
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
        break;
      
    }
  }

  public void thread205383(int [] tdone, int [] ends){
        switch(S204514){
      case 0 : 
        active[38]=0;
        ends[38]=0;
        tdone[38]=1;
        break;
      
      case 1 : 
        switch(S204505){
          case 0 : 
            zoneOneLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
            currsigs.addElement(zoneOneLightONOFF);
            active[38]=1;
            ends[38]=1;
            tdone[38]=1;
            break;
          
          case 1 : 
            S204505=1;
            S204514=0;
            active[38]=0;
            ends[38]=0;
            tdone[38]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread205382(int [] tdone, int [] ends){
        switch(S204594){
      case 0 : 
        active[37]=0;
        ends[37]=0;
        tdone[37]=1;
        break;
      
      case 1 : 
        test_37.setClear();//sysj\ECS.sysj line: 37, column: 5
        thread205383(tdone,ends);
        thread205384(tdone,ends);
        thread205385(tdone,ends);
        int biggest205386 = 0;
        if(ends[38]>=biggest205386){
          biggest205386=ends[38];
        }
        if(ends[39]>=biggest205386){
          biggest205386=ends[39];
        }
        if(ends[40]>=biggest205386){
          biggest205386=ends[40];
        }
        if(biggest205386 == 1){
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
        if(biggest205386 == 2){
          ends[37]=2;
          ;//sysj\ECS.sysj line: 39, column: 5
          thread205387(tdone,ends);
          thread205388(tdone,ends);
          thread205389(tdone,ends);
          int biggest205390 = 0;
          if(ends[38]>=biggest205390){
            biggest205390=ends[38];
          }
          if(ends[39]>=biggest205390){
            biggest205390=ends[39];
          }
          if(ends[40]>=biggest205390){
            biggest205390=ends[40];
          }
          if(biggest205390 == 1){
            active[37]=1;
            ends[37]=1;
            tdone[37]=1;
          }
        }
        //FINXME code
        if(biggest205386 == 0){
          thread205391(tdone,ends);
          thread205392(tdone,ends);
          thread205393(tdone,ends);
          int biggest205394 = 0;
          if(ends[38]>=biggest205394){
            biggest205394=ends[38];
          }
          if(ends[39]>=biggest205394){
            biggest205394=ends[39];
          }
          if(ends[40]>=biggest205394){
            biggest205394=ends[40];
          }
          if(biggest205394 == 1){
            active[37]=1;
            ends[37]=1;
            tdone[37]=1;
          }
        }
        break;
      
    }
  }

  public void thread205380(int [] tdone, int [] ends){
        S204433=1;
    if((Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue()) == 0 || (Integer)(zoneSevenLightingI.getpreval() == null ? 0 : ((Integer)zoneSevenLightingI.getpreval()).intValue()) >= 50 || !workhrs_6.getprestatus()){//sysj\ECS.sysj line: 25, column: 21
      test_33.setPresent();//sysj\ECS.sysj line: 26, column: 21
      currsigs.addElement(test_33);
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
  }

  public void thread205379(int [] tdone, int [] ends){
        S204425=1;
    active[35]=1;
    ends[35]=1;
    tdone[35]=1;
  }

  public void thread205378(int [] tdone, int [] ends){
        S204422=1;
    zoneOcc_thread_34 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_34 = (Integer)(zoneSevenLightingI.getpreval() == null ? 0 : ((Integer)zoneSevenLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S204413=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_34 > 0 && zoneLightInt_thread_34 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneSevenWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneSevenWindowONOFF);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S204413=1;
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread205376(int [] tdone, int [] ends){
        S204433=1;
    if((Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue()) == 0 || (Integer)(zoneSevenLightingI.getpreval() == null ? 0 : ((Integer)zoneSevenLightingI.getpreval()).intValue()) >= 50 || !workhrs_6.getprestatus()){//sysj\ECS.sysj line: 25, column: 21
      test_33.setPresent();//sysj\ECS.sysj line: 26, column: 21
      currsigs.addElement(test_33);
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
  }

  public void thread205375(int [] tdone, int [] ends){
        S204425=1;
    active[35]=1;
    ends[35]=1;
    tdone[35]=1;
  }

  public void thread205374(int [] tdone, int [] ends){
        S204422=1;
    zoneOcc_thread_34 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_34 = (Integer)(zoneSevenLightingI.getpreval() == null ? 0 : ((Integer)zoneSevenLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S204413=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_34 > 0 && zoneLightInt_thread_34 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneSevenWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneSevenWindowONOFF);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S204413=1;
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread205372(int [] tdone, int [] ends){
        switch(S204433){
      case 0 : 
        active[36]=0;
        ends[36]=0;
        tdone[36]=1;
        break;
      
      case 1 : 
        if((Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue()) == 0 || (Integer)(zoneSevenLightingI.getpreval() == null ? 0 : ((Integer)zoneSevenLightingI.getpreval()).intValue()) >= 50 || !workhrs_6.getprestatus()){//sysj\ECS.sysj line: 25, column: 21
          test_33.setPresent();//sysj\ECS.sysj line: 26, column: 21
          currsigs.addElement(test_33);
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        else {
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        break;
      
    }
  }

  public void thread205371(int [] tdone, int [] ends){
        switch(S204425){
      case 0 : 
        active[35]=0;
        ends[35]=0;
        tdone[35]=1;
        break;
      
      case 1 : 
        if(test_33.getprestatus()){//sysj\ECS.sysj line: 17, column: 19
          ends[35]=2;
          tdone[35]=1;
        }
        else {
          active[35]=1;
          ends[35]=1;
          tdone[35]=1;
        }
        break;
      
    }
  }

  public void thread205370(int [] tdone, int [] ends){
        switch(S204422){
      case 0 : 
        active[34]=0;
        ends[34]=0;
        tdone[34]=1;
        break;
      
      case 1 : 
        switch(S204413){
          case 0 : 
            zoneSevenWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
            currsigs.addElement(zoneSevenWindowONOFF);
            active[34]=1;
            ends[34]=1;
            tdone[34]=1;
            break;
          
          case 1 : 
            S204413=1;
            S204422=0;
            active[34]=0;
            ends[34]=0;
            tdone[34]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread205369(int [] tdone, int [] ends){
        switch(S204502){
      case 0 : 
        active[33]=0;
        ends[33]=0;
        tdone[33]=1;
        break;
      
      case 1 : 
        test_33.setClear();//sysj\ECS.sysj line: 3, column: 5
        thread205370(tdone,ends);
        thread205371(tdone,ends);
        thread205372(tdone,ends);
        int biggest205373 = 0;
        if(ends[34]>=biggest205373){
          biggest205373=ends[34];
        }
        if(ends[35]>=biggest205373){
          biggest205373=ends[35];
        }
        if(ends[36]>=biggest205373){
          biggest205373=ends[36];
        }
        if(biggest205373 == 1){
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
        if(biggest205373 == 2){
          ends[33]=2;
          ;//sysj\ECS.sysj line: 5, column: 5
          thread205374(tdone,ends);
          thread205375(tdone,ends);
          thread205376(tdone,ends);
          int biggest205377 = 0;
          if(ends[34]>=biggest205377){
            biggest205377=ends[34];
          }
          if(ends[35]>=biggest205377){
            biggest205377=ends[35];
          }
          if(ends[36]>=biggest205377){
            biggest205377=ends[36];
          }
          if(biggest205377 == 1){
            active[33]=1;
            ends[33]=1;
            tdone[33]=1;
          }
        }
        //FINXME code
        if(biggest205373 == 0){
          thread205378(tdone,ends);
          thread205379(tdone,ends);
          thread205380(tdone,ends);
          int biggest205381 = 0;
          if(ends[34]>=biggest205381){
            biggest205381=ends[34];
          }
          if(ends[35]>=biggest205381){
            biggest205381=ends[35];
          }
          if(ends[36]>=biggest205381){
            biggest205381=ends[36];
          }
          if(biggest205381 == 1){
            active[33]=1;
            ends[33]=1;
            tdone[33]=1;
          }
        }
        break;
      
    }
  }

  public void thread205367(int [] tdone, int [] ends){
        S204341=1;
    if((Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue()) == 0 || (Integer)(zoneSixLightingI.getpreval() == null ? 0 : ((Integer)zoneSixLightingI.getpreval()).intValue()) >= 50 || !workhrs_6.getprestatus()){//sysj\ECS.sysj line: 25, column: 21
      test_29.setPresent();//sysj\ECS.sysj line: 26, column: 21
      currsigs.addElement(test_29);
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

  public void thread205366(int [] tdone, int [] ends){
        S204333=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread205365(int [] tdone, int [] ends){
        S204330=1;
    zoneOcc_thread_30 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_30 = (Integer)(zoneSixLightingI.getpreval() == null ? 0 : ((Integer)zoneSixLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S204321=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_30 > 0 && zoneLightInt_thread_30 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneSixWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneSixWindowONOFF);
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S204321=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
  }

  public void thread205363(int [] tdone, int [] ends){
        S204341=1;
    if((Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue()) == 0 || (Integer)(zoneSixLightingI.getpreval() == null ? 0 : ((Integer)zoneSixLightingI.getpreval()).intValue()) >= 50 || !workhrs_6.getprestatus()){//sysj\ECS.sysj line: 25, column: 21
      test_29.setPresent();//sysj\ECS.sysj line: 26, column: 21
      currsigs.addElement(test_29);
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

  public void thread205362(int [] tdone, int [] ends){
        S204333=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread205361(int [] tdone, int [] ends){
        S204330=1;
    zoneOcc_thread_30 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_30 = (Integer)(zoneSixLightingI.getpreval() == null ? 0 : ((Integer)zoneSixLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S204321=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_30 > 0 && zoneLightInt_thread_30 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneSixWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneSixWindowONOFF);
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S204321=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
  }

  public void thread205359(int [] tdone, int [] ends){
        switch(S204341){
      case 0 : 
        active[32]=0;
        ends[32]=0;
        tdone[32]=1;
        break;
      
      case 1 : 
        if((Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue()) == 0 || (Integer)(zoneSixLightingI.getpreval() == null ? 0 : ((Integer)zoneSixLightingI.getpreval()).intValue()) >= 50 || !workhrs_6.getprestatus()){//sysj\ECS.sysj line: 25, column: 21
          test_29.setPresent();//sysj\ECS.sysj line: 26, column: 21
          currsigs.addElement(test_29);
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

  public void thread205358(int [] tdone, int [] ends){
        switch(S204333){
      case 0 : 
        active[31]=0;
        ends[31]=0;
        tdone[31]=1;
        break;
      
      case 1 : 
        if(test_29.getprestatus()){//sysj\ECS.sysj line: 17, column: 19
          ends[31]=2;
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

  public void thread205357(int [] tdone, int [] ends){
        switch(S204330){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        switch(S204321){
          case 0 : 
            zoneSixWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
            currsigs.addElement(zoneSixWindowONOFF);
            active[30]=1;
            ends[30]=1;
            tdone[30]=1;
            break;
          
          case 1 : 
            S204321=1;
            S204330=0;
            active[30]=0;
            ends[30]=0;
            tdone[30]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread205356(int [] tdone, int [] ends){
        switch(S204410){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        test_29.setClear();//sysj\ECS.sysj line: 3, column: 5
        thread205357(tdone,ends);
        thread205358(tdone,ends);
        thread205359(tdone,ends);
        int biggest205360 = 0;
        if(ends[30]>=biggest205360){
          biggest205360=ends[30];
        }
        if(ends[31]>=biggest205360){
          biggest205360=ends[31];
        }
        if(ends[32]>=biggest205360){
          biggest205360=ends[32];
        }
        if(biggest205360 == 1){
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
        if(biggest205360 == 2){
          ends[29]=2;
          ;//sysj\ECS.sysj line: 5, column: 5
          thread205361(tdone,ends);
          thread205362(tdone,ends);
          thread205363(tdone,ends);
          int biggest205364 = 0;
          if(ends[30]>=biggest205364){
            biggest205364=ends[30];
          }
          if(ends[31]>=biggest205364){
            biggest205364=ends[31];
          }
          if(ends[32]>=biggest205364){
            biggest205364=ends[32];
          }
          if(biggest205364 == 1){
            active[29]=1;
            ends[29]=1;
            tdone[29]=1;
          }
        }
        //FINXME code
        if(biggest205360 == 0){
          thread205365(tdone,ends);
          thread205366(tdone,ends);
          thread205367(tdone,ends);
          int biggest205368 = 0;
          if(ends[30]>=biggest205368){
            biggest205368=ends[30];
          }
          if(ends[31]>=biggest205368){
            biggest205368=ends[31];
          }
          if(ends[32]>=biggest205368){
            biggest205368=ends[32];
          }
          if(biggest205368 == 1){
            active[29]=1;
            ends[29]=1;
            tdone[29]=1;
          }
        }
        break;
      
    }
  }

  public void thread205354(int [] tdone, int [] ends){
        S204249=1;
    if((Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue()) == 0 || (Integer)(zoneFiveLightingI.getpreval() == null ? 0 : ((Integer)zoneFiveLightingI.getpreval()).intValue()) >= 50 || !workhrs_6.getprestatus()){//sysj\ECS.sysj line: 25, column: 21
      test_25.setPresent();//sysj\ECS.sysj line: 26, column: 21
      currsigs.addElement(test_25);
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    else {
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread205353(int [] tdone, int [] ends){
        S204241=1;
    active[27]=1;
    ends[27]=1;
    tdone[27]=1;
  }

  public void thread205352(int [] tdone, int [] ends){
        S204238=1;
    zoneOcc_thread_26 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_26 = (Integer)(zoneFiveLightingI.getpreval() == null ? 0 : ((Integer)zoneFiveLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S204229=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_26 > 0 && zoneLightInt_thread_26 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneFiveWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneFiveWindowONOFF);
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
    else {
      S204229=1;
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread205350(int [] tdone, int [] ends){
        S204249=1;
    if((Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue()) == 0 || (Integer)(zoneFiveLightingI.getpreval() == null ? 0 : ((Integer)zoneFiveLightingI.getpreval()).intValue()) >= 50 || !workhrs_6.getprestatus()){//sysj\ECS.sysj line: 25, column: 21
      test_25.setPresent();//sysj\ECS.sysj line: 26, column: 21
      currsigs.addElement(test_25);
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    else {
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread205349(int [] tdone, int [] ends){
        S204241=1;
    active[27]=1;
    ends[27]=1;
    tdone[27]=1;
  }

  public void thread205348(int [] tdone, int [] ends){
        S204238=1;
    zoneOcc_thread_26 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_26 = (Integer)(zoneFiveLightingI.getpreval() == null ? 0 : ((Integer)zoneFiveLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S204229=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_26 > 0 && zoneLightInt_thread_26 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneFiveWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneFiveWindowONOFF);
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
    else {
      S204229=1;
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread205346(int [] tdone, int [] ends){
        switch(S204249){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        if((Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue()) == 0 || (Integer)(zoneFiveLightingI.getpreval() == null ? 0 : ((Integer)zoneFiveLightingI.getpreval()).intValue()) >= 50 || !workhrs_6.getprestatus()){//sysj\ECS.sysj line: 25, column: 21
          test_25.setPresent();//sysj\ECS.sysj line: 26, column: 21
          currsigs.addElement(test_25);
          active[28]=1;
          ends[28]=1;
          tdone[28]=1;
        }
        else {
          active[28]=1;
          ends[28]=1;
          tdone[28]=1;
        }
        break;
      
    }
  }

  public void thread205345(int [] tdone, int [] ends){
        switch(S204241){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        if(test_25.getprestatus()){//sysj\ECS.sysj line: 17, column: 19
          ends[27]=2;
          tdone[27]=1;
        }
        else {
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
        break;
      
    }
  }

  public void thread205344(int [] tdone, int [] ends){
        switch(S204238){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        switch(S204229){
          case 0 : 
            zoneFiveWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
            currsigs.addElement(zoneFiveWindowONOFF);
            active[26]=1;
            ends[26]=1;
            tdone[26]=1;
            break;
          
          case 1 : 
            S204229=1;
            S204238=0;
            active[26]=0;
            ends[26]=0;
            tdone[26]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread205343(int [] tdone, int [] ends){
        switch(S204318){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        test_25.setClear();//sysj\ECS.sysj line: 3, column: 5
        thread205344(tdone,ends);
        thread205345(tdone,ends);
        thread205346(tdone,ends);
        int biggest205347 = 0;
        if(ends[26]>=biggest205347){
          biggest205347=ends[26];
        }
        if(ends[27]>=biggest205347){
          biggest205347=ends[27];
        }
        if(ends[28]>=biggest205347){
          biggest205347=ends[28];
        }
        if(biggest205347 == 1){
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
        if(biggest205347 == 2){
          ends[25]=2;
          ;//sysj\ECS.sysj line: 5, column: 5
          thread205348(tdone,ends);
          thread205349(tdone,ends);
          thread205350(tdone,ends);
          int biggest205351 = 0;
          if(ends[26]>=biggest205351){
            biggest205351=ends[26];
          }
          if(ends[27]>=biggest205351){
            biggest205351=ends[27];
          }
          if(ends[28]>=biggest205351){
            biggest205351=ends[28];
          }
          if(biggest205351 == 1){
            active[25]=1;
            ends[25]=1;
            tdone[25]=1;
          }
        }
        //FINXME code
        if(biggest205347 == 0){
          thread205352(tdone,ends);
          thread205353(tdone,ends);
          thread205354(tdone,ends);
          int biggest205355 = 0;
          if(ends[26]>=biggest205355){
            biggest205355=ends[26];
          }
          if(ends[27]>=biggest205355){
            biggest205355=ends[27];
          }
          if(ends[28]>=biggest205355){
            biggest205355=ends[28];
          }
          if(biggest205355 == 1){
            active[25]=1;
            ends[25]=1;
            tdone[25]=1;
          }
        }
        break;
      
    }
  }

  public void thread205341(int [] tdone, int [] ends){
        S204157=1;
    if((Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue()) == 0 || (Integer)(zoneFourLightingI.getpreval() == null ? 0 : ((Integer)zoneFourLightingI.getpreval()).intValue()) >= 50 || !workhrs_6.getprestatus()){//sysj\ECS.sysj line: 25, column: 21
      test_21.setPresent();//sysj\ECS.sysj line: 26, column: 21
      currsigs.addElement(test_21);
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

  public void thread205340(int [] tdone, int [] ends){
        S204149=1;
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread205339(int [] tdone, int [] ends){
        S204146=1;
    zoneOcc_thread_22 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_22 = (Integer)(zoneFourLightingI.getpreval() == null ? 0 : ((Integer)zoneFourLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S204137=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_22 > 0 && zoneLightInt_thread_22 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneFourWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneFourWindowONOFF);
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S204137=1;
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread205337(int [] tdone, int [] ends){
        S204157=1;
    if((Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue()) == 0 || (Integer)(zoneFourLightingI.getpreval() == null ? 0 : ((Integer)zoneFourLightingI.getpreval()).intValue()) >= 50 || !workhrs_6.getprestatus()){//sysj\ECS.sysj line: 25, column: 21
      test_21.setPresent();//sysj\ECS.sysj line: 26, column: 21
      currsigs.addElement(test_21);
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

  public void thread205336(int [] tdone, int [] ends){
        S204149=1;
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread205335(int [] tdone, int [] ends){
        S204146=1;
    zoneOcc_thread_22 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_22 = (Integer)(zoneFourLightingI.getpreval() == null ? 0 : ((Integer)zoneFourLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S204137=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_22 > 0 && zoneLightInt_thread_22 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneFourWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneFourWindowONOFF);
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S204137=1;
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread205333(int [] tdone, int [] ends){
        switch(S204157){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        if((Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue()) == 0 || (Integer)(zoneFourLightingI.getpreval() == null ? 0 : ((Integer)zoneFourLightingI.getpreval()).intValue()) >= 50 || !workhrs_6.getprestatus()){//sysj\ECS.sysj line: 25, column: 21
          test_21.setPresent();//sysj\ECS.sysj line: 26, column: 21
          currsigs.addElement(test_21);
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

  public void thread205332(int [] tdone, int [] ends){
        switch(S204149){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        if(test_21.getprestatus()){//sysj\ECS.sysj line: 17, column: 19
          ends[23]=2;
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

  public void thread205331(int [] tdone, int [] ends){
        switch(S204146){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        switch(S204137){
          case 0 : 
            zoneFourWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
            currsigs.addElement(zoneFourWindowONOFF);
            active[22]=1;
            ends[22]=1;
            tdone[22]=1;
            break;
          
          case 1 : 
            S204137=1;
            S204146=0;
            active[22]=0;
            ends[22]=0;
            tdone[22]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread205330(int [] tdone, int [] ends){
        switch(S204226){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        test_21.setClear();//sysj\ECS.sysj line: 3, column: 5
        thread205331(tdone,ends);
        thread205332(tdone,ends);
        thread205333(tdone,ends);
        int biggest205334 = 0;
        if(ends[22]>=biggest205334){
          biggest205334=ends[22];
        }
        if(ends[23]>=biggest205334){
          biggest205334=ends[23];
        }
        if(ends[24]>=biggest205334){
          biggest205334=ends[24];
        }
        if(biggest205334 == 1){
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        if(biggest205334 == 2){
          ends[21]=2;
          ;//sysj\ECS.sysj line: 5, column: 5
          thread205335(tdone,ends);
          thread205336(tdone,ends);
          thread205337(tdone,ends);
          int biggest205338 = 0;
          if(ends[22]>=biggest205338){
            biggest205338=ends[22];
          }
          if(ends[23]>=biggest205338){
            biggest205338=ends[23];
          }
          if(ends[24]>=biggest205338){
            biggest205338=ends[24];
          }
          if(biggest205338 == 1){
            active[21]=1;
            ends[21]=1;
            tdone[21]=1;
          }
        }
        //FINXME code
        if(biggest205334 == 0){
          thread205339(tdone,ends);
          thread205340(tdone,ends);
          thread205341(tdone,ends);
          int biggest205342 = 0;
          if(ends[22]>=biggest205342){
            biggest205342=ends[22];
          }
          if(ends[23]>=biggest205342){
            biggest205342=ends[23];
          }
          if(ends[24]>=biggest205342){
            biggest205342=ends[24];
          }
          if(biggest205342 == 1){
            active[21]=1;
            ends[21]=1;
            tdone[21]=1;
          }
        }
        break;
      
    }
  }

  public void thread205328(int [] tdone, int [] ends){
        S204065=1;
    if((Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue()) == 0 || (Integer)(zoneThreeLightingI.getpreval() == null ? 0 : ((Integer)zoneThreeLightingI.getpreval()).intValue()) >= 50 || !workhrs_6.getprestatus()){//sysj\ECS.sysj line: 25, column: 21
      test_17.setPresent();//sysj\ECS.sysj line: 26, column: 21
      currsigs.addElement(test_17);
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

  public void thread205327(int [] tdone, int [] ends){
        S204057=1;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread205326(int [] tdone, int [] ends){
        S204054=1;
    zoneOcc_thread_18 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_18 = (Integer)(zoneThreeLightingI.getpreval() == null ? 0 : ((Integer)zoneThreeLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S204045=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_18 > 0 && zoneLightInt_thread_18 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneThreeWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneThreeWindowONOFF);
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
    else {
      S204045=1;
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread205324(int [] tdone, int [] ends){
        S204065=1;
    if((Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue()) == 0 || (Integer)(zoneThreeLightingI.getpreval() == null ? 0 : ((Integer)zoneThreeLightingI.getpreval()).intValue()) >= 50 || !workhrs_6.getprestatus()){//sysj\ECS.sysj line: 25, column: 21
      test_17.setPresent();//sysj\ECS.sysj line: 26, column: 21
      currsigs.addElement(test_17);
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

  public void thread205323(int [] tdone, int [] ends){
        S204057=1;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread205322(int [] tdone, int [] ends){
        S204054=1;
    zoneOcc_thread_18 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_18 = (Integer)(zoneThreeLightingI.getpreval() == null ? 0 : ((Integer)zoneThreeLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S204045=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_18 > 0 && zoneLightInt_thread_18 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneThreeWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneThreeWindowONOFF);
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
    else {
      S204045=1;
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread205320(int [] tdone, int [] ends){
        switch(S204065){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        if((Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue()) == 0 || (Integer)(zoneThreeLightingI.getpreval() == null ? 0 : ((Integer)zoneThreeLightingI.getpreval()).intValue()) >= 50 || !workhrs_6.getprestatus()){//sysj\ECS.sysj line: 25, column: 21
          test_17.setPresent();//sysj\ECS.sysj line: 26, column: 21
          currsigs.addElement(test_17);
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

  public void thread205319(int [] tdone, int [] ends){
        switch(S204057){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        if(test_17.getprestatus()){//sysj\ECS.sysj line: 17, column: 19
          ends[19]=2;
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

  public void thread205318(int [] tdone, int [] ends){
        switch(S204054){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        switch(S204045){
          case 0 : 
            zoneThreeWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
            currsigs.addElement(zoneThreeWindowONOFF);
            active[18]=1;
            ends[18]=1;
            tdone[18]=1;
            break;
          
          case 1 : 
            S204045=1;
            S204054=0;
            active[18]=0;
            ends[18]=0;
            tdone[18]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread205317(int [] tdone, int [] ends){
        switch(S204134){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        test_17.setClear();//sysj\ECS.sysj line: 3, column: 5
        thread205318(tdone,ends);
        thread205319(tdone,ends);
        thread205320(tdone,ends);
        int biggest205321 = 0;
        if(ends[18]>=biggest205321){
          biggest205321=ends[18];
        }
        if(ends[19]>=biggest205321){
          biggest205321=ends[19];
        }
        if(ends[20]>=biggest205321){
          biggest205321=ends[20];
        }
        if(biggest205321 == 1){
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
        if(biggest205321 == 2){
          ends[17]=2;
          ;//sysj\ECS.sysj line: 5, column: 5
          thread205322(tdone,ends);
          thread205323(tdone,ends);
          thread205324(tdone,ends);
          int biggest205325 = 0;
          if(ends[18]>=biggest205325){
            biggest205325=ends[18];
          }
          if(ends[19]>=biggest205325){
            biggest205325=ends[19];
          }
          if(ends[20]>=biggest205325){
            biggest205325=ends[20];
          }
          if(biggest205325 == 1){
            active[17]=1;
            ends[17]=1;
            tdone[17]=1;
          }
        }
        //FINXME code
        if(biggest205321 == 0){
          thread205326(tdone,ends);
          thread205327(tdone,ends);
          thread205328(tdone,ends);
          int biggest205329 = 0;
          if(ends[18]>=biggest205329){
            biggest205329=ends[18];
          }
          if(ends[19]>=biggest205329){
            biggest205329=ends[19];
          }
          if(ends[20]>=biggest205329){
            biggest205329=ends[20];
          }
          if(biggest205329 == 1){
            active[17]=1;
            ends[17]=1;
            tdone[17]=1;
          }
        }
        break;
      
    }
  }

  public void thread205315(int [] tdone, int [] ends){
        S203973=1;
    if((Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue()) == 0 || (Integer)(zoneTwoLightingI.getpreval() == null ? 0 : ((Integer)zoneTwoLightingI.getpreval()).intValue()) >= 50 || !workhrs_6.getprestatus()){//sysj\ECS.sysj line: 25, column: 21
      test_13.setPresent();//sysj\ECS.sysj line: 26, column: 21
      currsigs.addElement(test_13);
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

  public void thread205314(int [] tdone, int [] ends){
        S203965=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread205313(int [] tdone, int [] ends){
        S203962=1;
    zoneOcc_thread_14 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_14 = (Integer)(zoneTwoLightingI.getpreval() == null ? 0 : ((Integer)zoneTwoLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S203953=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_14 > 0 && zoneLightInt_thread_14 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneTwoWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneTwoWindowONOFF);
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      S203953=1;
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread205311(int [] tdone, int [] ends){
        S203973=1;
    if((Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue()) == 0 || (Integer)(zoneTwoLightingI.getpreval() == null ? 0 : ((Integer)zoneTwoLightingI.getpreval()).intValue()) >= 50 || !workhrs_6.getprestatus()){//sysj\ECS.sysj line: 25, column: 21
      test_13.setPresent();//sysj\ECS.sysj line: 26, column: 21
      currsigs.addElement(test_13);
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

  public void thread205310(int [] tdone, int [] ends){
        S203965=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread205309(int [] tdone, int [] ends){
        S203962=1;
    zoneOcc_thread_14 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_14 = (Integer)(zoneTwoLightingI.getpreval() == null ? 0 : ((Integer)zoneTwoLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S203953=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_14 > 0 && zoneLightInt_thread_14 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneTwoWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneTwoWindowONOFF);
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      S203953=1;
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread205307(int [] tdone, int [] ends){
        switch(S203973){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if((Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue()) == 0 || (Integer)(zoneTwoLightingI.getpreval() == null ? 0 : ((Integer)zoneTwoLightingI.getpreval()).intValue()) >= 50 || !workhrs_6.getprestatus()){//sysj\ECS.sysj line: 25, column: 21
          test_13.setPresent();//sysj\ECS.sysj line: 26, column: 21
          currsigs.addElement(test_13);
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

  public void thread205306(int [] tdone, int [] ends){
        switch(S203965){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(test_13.getprestatus()){//sysj\ECS.sysj line: 17, column: 19
          ends[15]=2;
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

  public void thread205305(int [] tdone, int [] ends){
        switch(S203962){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        switch(S203953){
          case 0 : 
            zoneTwoWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
            currsigs.addElement(zoneTwoWindowONOFF);
            active[14]=1;
            ends[14]=1;
            tdone[14]=1;
            break;
          
          case 1 : 
            S203953=1;
            S203962=0;
            active[14]=0;
            ends[14]=0;
            tdone[14]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread205304(int [] tdone, int [] ends){
        switch(S204042){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        test_13.setClear();//sysj\ECS.sysj line: 3, column: 5
        thread205305(tdone,ends);
        thread205306(tdone,ends);
        thread205307(tdone,ends);
        int biggest205308 = 0;
        if(ends[14]>=biggest205308){
          biggest205308=ends[14];
        }
        if(ends[15]>=biggest205308){
          biggest205308=ends[15];
        }
        if(ends[16]>=biggest205308){
          biggest205308=ends[16];
        }
        if(biggest205308 == 1){
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        if(biggest205308 == 2){
          ends[13]=2;
          ;//sysj\ECS.sysj line: 5, column: 5
          thread205309(tdone,ends);
          thread205310(tdone,ends);
          thread205311(tdone,ends);
          int biggest205312 = 0;
          if(ends[14]>=biggest205312){
            biggest205312=ends[14];
          }
          if(ends[15]>=biggest205312){
            biggest205312=ends[15];
          }
          if(ends[16]>=biggest205312){
            biggest205312=ends[16];
          }
          if(biggest205312 == 1){
            active[13]=1;
            ends[13]=1;
            tdone[13]=1;
          }
        }
        //FINXME code
        if(biggest205308 == 0){
          thread205313(tdone,ends);
          thread205314(tdone,ends);
          thread205315(tdone,ends);
          int biggest205316 = 0;
          if(ends[14]>=biggest205316){
            biggest205316=ends[14];
          }
          if(ends[15]>=biggest205316){
            biggest205316=ends[15];
          }
          if(ends[16]>=biggest205316){
            biggest205316=ends[16];
          }
          if(biggest205316 == 1){
            active[13]=1;
            ends[13]=1;
            tdone[13]=1;
          }
        }
        break;
      
    }
  }

  public void thread205302(int [] tdone, int [] ends){
        S203881=1;
    if((Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue()) == 0 || (Integer)(zoneOneLightingI.getpreval() == null ? 0 : ((Integer)zoneOneLightingI.getpreval()).intValue()) >= 50 || !workhrs_6.getprestatus()){//sysj\ECS.sysj line: 25, column: 21
      test_9.setPresent();//sysj\ECS.sysj line: 26, column: 21
      currsigs.addElement(test_9);
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
    else {
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread205301(int [] tdone, int [] ends){
        S203873=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread205300(int [] tdone, int [] ends){
        S203870=1;
    zoneOcc_thread_10 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_10 = (Integer)(zoneOneLightingI.getpreval() == null ? 0 : ((Integer)zoneOneLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S203861=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_10 > 0 && zoneLightInt_thread_10 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneOneWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneOneWindowONOFF);
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      S203861=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread205298(int [] tdone, int [] ends){
        S203881=1;
    if((Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue()) == 0 || (Integer)(zoneOneLightingI.getpreval() == null ? 0 : ((Integer)zoneOneLightingI.getpreval()).intValue()) >= 50 || !workhrs_6.getprestatus()){//sysj\ECS.sysj line: 25, column: 21
      test_9.setPresent();//sysj\ECS.sysj line: 26, column: 21
      currsigs.addElement(test_9);
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
    else {
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread205297(int [] tdone, int [] ends){
        S203873=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread205296(int [] tdone, int [] ends){
        S203870=1;
    zoneOcc_thread_10 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_10 = (Integer)(zoneOneLightingI.getpreval() == null ? 0 : ((Integer)zoneOneLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S203861=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_10 > 0 && zoneLightInt_thread_10 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneOneWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneOneWindowONOFF);
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      S203861=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread205294(int [] tdone, int [] ends){
        switch(S203881){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if((Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue()) == 0 || (Integer)(zoneOneLightingI.getpreval() == null ? 0 : ((Integer)zoneOneLightingI.getpreval()).intValue()) >= 50 || !workhrs_6.getprestatus()){//sysj\ECS.sysj line: 25, column: 21
          test_9.setPresent();//sysj\ECS.sysj line: 26, column: 21
          currsigs.addElement(test_9);
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

  public void thread205293(int [] tdone, int [] ends){
        switch(S203873){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(test_9.getprestatus()){//sysj\ECS.sysj line: 17, column: 19
          ends[11]=2;
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

  public void thread205292(int [] tdone, int [] ends){
        switch(S203870){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S203861){
          case 0 : 
            zoneOneWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
            currsigs.addElement(zoneOneWindowONOFF);
            active[10]=1;
            ends[10]=1;
            tdone[10]=1;
            break;
          
          case 1 : 
            S203861=1;
            S203870=0;
            active[10]=0;
            ends[10]=0;
            tdone[10]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread205291(int [] tdone, int [] ends){
        switch(S203950){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        test_9.setClear();//sysj\ECS.sysj line: 3, column: 5
        thread205292(tdone,ends);
        thread205293(tdone,ends);
        thread205294(tdone,ends);
        int biggest205295 = 0;
        if(ends[10]>=biggest205295){
          biggest205295=ends[10];
        }
        if(ends[11]>=biggest205295){
          biggest205295=ends[11];
        }
        if(ends[12]>=biggest205295){
          biggest205295=ends[12];
        }
        if(biggest205295 == 1){
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        if(biggest205295 == 2){
          ends[9]=2;
          ;//sysj\ECS.sysj line: 5, column: 5
          thread205296(tdone,ends);
          thread205297(tdone,ends);
          thread205298(tdone,ends);
          int biggest205299 = 0;
          if(ends[10]>=biggest205299){
            biggest205299=ends[10];
          }
          if(ends[11]>=biggest205299){
            biggest205299=ends[11];
          }
          if(ends[12]>=biggest205299){
            biggest205299=ends[12];
          }
          if(biggest205299 == 1){
            active[9]=1;
            ends[9]=1;
            tdone[9]=1;
          }
        }
        //FINXME code
        if(biggest205295 == 0){
          thread205300(tdone,ends);
          thread205301(tdone,ends);
          thread205302(tdone,ends);
          int biggest205303 = 0;
          if(ends[10]>=biggest205303){
            biggest205303=ends[10];
          }
          if(ends[11]>=biggest205303){
            biggest205303=ends[11];
          }
          if(ends[12]>=biggest205303){
            biggest205303=ends[12];
          }
          if(biggest205303 == 1){
            active[9]=1;
            ends[9]=1;
            tdone[9]=1;
          }
        }
        break;
      
    }
  }

  public void thread205290(int [] tdone, int [] ends){
        switch(S205148){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        thread205291(tdone,ends);
        thread205304(tdone,ends);
        thread205317(tdone,ends);
        thread205330(tdone,ends);
        thread205343(tdone,ends);
        thread205356(tdone,ends);
        thread205369(tdone,ends);
        thread205382(tdone,ends);
        thread205395(tdone,ends);
        thread205408(tdone,ends);
        thread205421(tdone,ends);
        thread205434(tdone,ends);
        thread205447(tdone,ends);
        thread205460(tdone,ends);
        int biggest205473 = 0;
        if(ends[9]>=biggest205473){
          biggest205473=ends[9];
        }
        if(ends[13]>=biggest205473){
          biggest205473=ends[13];
        }
        if(ends[17]>=biggest205473){
          biggest205473=ends[17];
        }
        if(ends[21]>=biggest205473){
          biggest205473=ends[21];
        }
        if(ends[25]>=biggest205473){
          biggest205473=ends[25];
        }
        if(ends[29]>=biggest205473){
          biggest205473=ends[29];
        }
        if(ends[33]>=biggest205473){
          biggest205473=ends[33];
        }
        if(ends[37]>=biggest205473){
          biggest205473=ends[37];
        }
        if(ends[41]>=biggest205473){
          biggest205473=ends[41];
        }
        if(ends[45]>=biggest205473){
          biggest205473=ends[45];
        }
        if(ends[49]>=biggest205473){
          biggest205473=ends[49];
        }
        if(ends[53]>=biggest205473){
          biggest205473=ends[53];
        }
        if(ends[57]>=biggest205473){
          biggest205473=ends[57];
        }
        if(ends[61]>=biggest205473){
          biggest205473=ends[61];
        }
        if(biggest205473 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        //FINXME code
        if(biggest205473 == 0){
          S205148=0;
          active[8]=0;
          ends[8]=0;
          tdone[8]=1;
        }
        break;
      
    }
  }

  public void thread205289(int [] tdone, int [] ends){
        switch(S203858){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S203808){
          case 0 : 
            if(currentTime_2.getprestatus()){//sysj\ECS.sysj line: 351, column: 14
              currentHour_thread_7 = (Integer)(currentTime_2.getpreval() == null ? 0 : ((Integer)currentTime_2.getpreval()).intValue());//sysj\ECS.sysj line: 352, column: 8
              S203808=1;
              if(currentHour_thread_7 >= 9 && currentHour_thread_7 <= 17){//sysj\ECS.sysj line: 354, column: 16
                S203812=0;
                workhrs_6.setPresent();//sysj\ECS.sysj line: 355, column: 16
                currsigs.addElement(workhrs_6);
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
              else {
                S203812=1;
                if((currentHour_thread_7 >= 18 && currentHour_thread_7 <= 24) || (currentHour_thread_7 >= 0 && currentHour_thread_7 < 9)){//sysj\ECS.sysj line: 359, column: 23
                  afterhrs_6.setPresent();//sysj\ECS.sysj line: 360, column: 16
                  currsigs.addElement(afterhrs_6);
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  S203808=0;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
              }
            }
            else {
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            switch(S203812){
              case 0 : 
                S203808=0;
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
                break;
              
              case 1 : 
                S203808=0;
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread205285(int [] tdone, int [] ends){
        S205077=1;
    if((Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue()) == 0 || (Integer)(zoneSevenLightingI.getpreval() == null ? 0 : ((Integer)zoneSevenLightingI.getpreval()).intValue()) >= 50 || !afterhrs_6.getprestatus()){//sysj\ECS.sysj line: 59, column: 21
      test_61.setPresent();//sysj\ECS.sysj line: 60, column: 21
      currsigs.addElement(test_61);
      active[64]=1;
      ends[64]=1;
      tdone[64]=1;
    }
    else {
      active[64]=1;
      ends[64]=1;
      tdone[64]=1;
    }
  }

  public void thread205284(int [] tdone, int [] ends){
        S205069=1;
    active[63]=1;
    ends[63]=1;
    tdone[63]=1;
  }

  public void thread205283(int [] tdone, int [] ends){
        S205066=1;
    zoneOcc_thread_62 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_62 = (Integer)(zoneSevenLightingI.getpreval() == null ? 0 : ((Integer)zoneSevenLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S205057=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_62 > 0 && zoneLightInt_thread_62 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneSevenLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneSevenLightONOFF);
      active[62]=1;
      ends[62]=1;
      tdone[62]=1;
    }
    else {
      S205057=1;
      active[62]=1;
      ends[62]=1;
      tdone[62]=1;
    }
  }

  public void thread205282(int [] tdone, int [] ends){
        S205146=1;
    test_61.setClear();//sysj\ECS.sysj line: 37, column: 5
    thread205283(tdone,ends);
    thread205284(tdone,ends);
    thread205285(tdone,ends);
    int biggest205286 = 0;
    if(ends[62]>=biggest205286){
      biggest205286=ends[62];
    }
    if(ends[63]>=biggest205286){
      biggest205286=ends[63];
    }
    if(ends[64]>=biggest205286){
      biggest205286=ends[64];
    }
    if(biggest205286 == 1){
      active[61]=1;
      ends[61]=1;
      tdone[61]=1;
    }
  }

  public void thread205280(int [] tdone, int [] ends){
        S204985=1;
    if((Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue()) == 0 || (Integer)(zoneSixLightingI.getpreval() == null ? 0 : ((Integer)zoneSixLightingI.getpreval()).intValue()) >= 50 || !afterhrs_6.getprestatus()){//sysj\ECS.sysj line: 59, column: 21
      test_57.setPresent();//sysj\ECS.sysj line: 60, column: 21
      currsigs.addElement(test_57);
      active[60]=1;
      ends[60]=1;
      tdone[60]=1;
    }
    else {
      active[60]=1;
      ends[60]=1;
      tdone[60]=1;
    }
  }

  public void thread205279(int [] tdone, int [] ends){
        S204977=1;
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread205278(int [] tdone, int [] ends){
        S204974=1;
    zoneOcc_thread_58 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_58 = (Integer)(zoneSixLightingI.getpreval() == null ? 0 : ((Integer)zoneSixLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204965=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_58 > 0 && zoneLightInt_thread_58 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneSixLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneSixLightONOFF);
      active[58]=1;
      ends[58]=1;
      tdone[58]=1;
    }
    else {
      S204965=1;
      active[58]=1;
      ends[58]=1;
      tdone[58]=1;
    }
  }

  public void thread205277(int [] tdone, int [] ends){
        S205054=1;
    test_57.setClear();//sysj\ECS.sysj line: 37, column: 5
    thread205278(tdone,ends);
    thread205279(tdone,ends);
    thread205280(tdone,ends);
    int biggest205281 = 0;
    if(ends[58]>=biggest205281){
      biggest205281=ends[58];
    }
    if(ends[59]>=biggest205281){
      biggest205281=ends[59];
    }
    if(ends[60]>=biggest205281){
      biggest205281=ends[60];
    }
    if(biggest205281 == 1){
      active[57]=1;
      ends[57]=1;
      tdone[57]=1;
    }
  }

  public void thread205275(int [] tdone, int [] ends){
        S204893=1;
    if((Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue()) == 0 || (Integer)(zoneFiveLightingI.getpreval() == null ? 0 : ((Integer)zoneFiveLightingI.getpreval()).intValue()) >= 50 || !afterhrs_6.getprestatus()){//sysj\ECS.sysj line: 59, column: 21
      test_53.setPresent();//sysj\ECS.sysj line: 60, column: 21
      currsigs.addElement(test_53);
      active[56]=1;
      ends[56]=1;
      tdone[56]=1;
    }
    else {
      active[56]=1;
      ends[56]=1;
      tdone[56]=1;
    }
  }

  public void thread205274(int [] tdone, int [] ends){
        S204885=1;
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread205273(int [] tdone, int [] ends){
        S204882=1;
    zoneOcc_thread_54 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_54 = (Integer)(zoneFiveLightingI.getpreval() == null ? 0 : ((Integer)zoneFiveLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204873=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_54 > 0 && zoneLightInt_thread_54 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneFiveLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneFiveLightONOFF);
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
    else {
      S204873=1;
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
  }

  public void thread205272(int [] tdone, int [] ends){
        S204962=1;
    test_53.setClear();//sysj\ECS.sysj line: 37, column: 5
    thread205273(tdone,ends);
    thread205274(tdone,ends);
    thread205275(tdone,ends);
    int biggest205276 = 0;
    if(ends[54]>=biggest205276){
      biggest205276=ends[54];
    }
    if(ends[55]>=biggest205276){
      biggest205276=ends[55];
    }
    if(ends[56]>=biggest205276){
      biggest205276=ends[56];
    }
    if(biggest205276 == 1){
      active[53]=1;
      ends[53]=1;
      tdone[53]=1;
    }
  }

  public void thread205270(int [] tdone, int [] ends){
        S204801=1;
    if((Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue()) == 0 || (Integer)(zoneFourLightingI.getpreval() == null ? 0 : ((Integer)zoneFourLightingI.getpreval()).intValue()) >= 50 || !afterhrs_6.getprestatus()){//sysj\ECS.sysj line: 59, column: 21
      test_49.setPresent();//sysj\ECS.sysj line: 60, column: 21
      currsigs.addElement(test_49);
      active[52]=1;
      ends[52]=1;
      tdone[52]=1;
    }
    else {
      active[52]=1;
      ends[52]=1;
      tdone[52]=1;
    }
  }

  public void thread205269(int [] tdone, int [] ends){
        S204793=1;
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread205268(int [] tdone, int [] ends){
        S204790=1;
    zoneOcc_thread_50 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_50 = (Integer)(zoneFourLightingI.getpreval() == null ? 0 : ((Integer)zoneFourLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204781=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_50 > 0 && zoneLightInt_thread_50 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneFourLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneFourLightONOFF);
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
    else {
      S204781=1;
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
  }

  public void thread205267(int [] tdone, int [] ends){
        S204870=1;
    test_49.setClear();//sysj\ECS.sysj line: 37, column: 5
    thread205268(tdone,ends);
    thread205269(tdone,ends);
    thread205270(tdone,ends);
    int biggest205271 = 0;
    if(ends[50]>=biggest205271){
      biggest205271=ends[50];
    }
    if(ends[51]>=biggest205271){
      biggest205271=ends[51];
    }
    if(ends[52]>=biggest205271){
      biggest205271=ends[52];
    }
    if(biggest205271 == 1){
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
  }

  public void thread205265(int [] tdone, int [] ends){
        S204709=1;
    if((Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue()) == 0 || (Integer)(zoneThreeLightingI.getpreval() == null ? 0 : ((Integer)zoneThreeLightingI.getpreval()).intValue()) >= 50 || !afterhrs_6.getprestatus()){//sysj\ECS.sysj line: 59, column: 21
      test_45.setPresent();//sysj\ECS.sysj line: 60, column: 21
      currsigs.addElement(test_45);
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
    else {
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
  }

  public void thread205264(int [] tdone, int [] ends){
        S204701=1;
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread205263(int [] tdone, int [] ends){
        S204698=1;
    zoneOcc_thread_46 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_46 = (Integer)(zoneThreeLightingI.getpreval() == null ? 0 : ((Integer)zoneThreeLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204689=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_46 > 0 && zoneLightInt_thread_46 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneThreeLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneThreeLightONOFF);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S204689=1;
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
  }

  public void thread205262(int [] tdone, int [] ends){
        S204778=1;
    test_45.setClear();//sysj\ECS.sysj line: 37, column: 5
    thread205263(tdone,ends);
    thread205264(tdone,ends);
    thread205265(tdone,ends);
    int biggest205266 = 0;
    if(ends[46]>=biggest205266){
      biggest205266=ends[46];
    }
    if(ends[47]>=biggest205266){
      biggest205266=ends[47];
    }
    if(ends[48]>=biggest205266){
      biggest205266=ends[48];
    }
    if(biggest205266 == 1){
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
  }

  public void thread205260(int [] tdone, int [] ends){
        S204617=1;
    if((Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue()) == 0 || (Integer)(zoneTwoLightingI.getpreval() == null ? 0 : ((Integer)zoneTwoLightingI.getpreval()).intValue()) >= 50 || !afterhrs_6.getprestatus()){//sysj\ECS.sysj line: 59, column: 21
      test_41.setPresent();//sysj\ECS.sysj line: 60, column: 21
      currsigs.addElement(test_41);
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
    else {
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread205259(int [] tdone, int [] ends){
        S204609=1;
    active[43]=1;
    ends[43]=1;
    tdone[43]=1;
  }

  public void thread205258(int [] tdone, int [] ends){
        S204606=1;
    zoneOcc_thread_42 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_42 = (Integer)(zoneTwoLightingI.getpreval() == null ? 0 : ((Integer)zoneTwoLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204597=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_42 > 0 && zoneLightInt_thread_42 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneTwoLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneTwoLightONOFF);
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S204597=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread205257(int [] tdone, int [] ends){
        S204686=1;
    test_41.setClear();//sysj\ECS.sysj line: 37, column: 5
    thread205258(tdone,ends);
    thread205259(tdone,ends);
    thread205260(tdone,ends);
    int biggest205261 = 0;
    if(ends[42]>=biggest205261){
      biggest205261=ends[42];
    }
    if(ends[43]>=biggest205261){
      biggest205261=ends[43];
    }
    if(ends[44]>=biggest205261){
      biggest205261=ends[44];
    }
    if(biggest205261 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread205255(int [] tdone, int [] ends){
        S204525=1;
    if((Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue()) == 0 || (Integer)(zoneOneLightingI.getpreval() == null ? 0 : ((Integer)zoneOneLightingI.getpreval()).intValue()) >= 50 || !afterhrs_6.getprestatus()){//sysj\ECS.sysj line: 59, column: 21
      test_37.setPresent();//sysj\ECS.sysj line: 60, column: 21
      currsigs.addElement(test_37);
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
  }

  public void thread205254(int [] tdone, int [] ends){
        S204517=1;
    active[39]=1;
    ends[39]=1;
    tdone[39]=1;
  }

  public void thread205253(int [] tdone, int [] ends){
        S204514=1;
    zoneOcc_thread_38 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_38 = (Integer)(zoneOneLightingI.getpreval() == null ? 0 : ((Integer)zoneOneLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204505=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_38 > 0 && zoneLightInt_thread_38 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneOneLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneOneLightONOFF);
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      S204505=1;
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread205252(int [] tdone, int [] ends){
        S204594=1;
    test_37.setClear();//sysj\ECS.sysj line: 37, column: 5
    thread205253(tdone,ends);
    thread205254(tdone,ends);
    thread205255(tdone,ends);
    int biggest205256 = 0;
    if(ends[38]>=biggest205256){
      biggest205256=ends[38];
    }
    if(ends[39]>=biggest205256){
      biggest205256=ends[39];
    }
    if(ends[40]>=biggest205256){
      biggest205256=ends[40];
    }
    if(biggest205256 == 1){
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
  }

  public void thread205250(int [] tdone, int [] ends){
        S204433=1;
    if((Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue()) == 0 || (Integer)(zoneSevenLightingI.getpreval() == null ? 0 : ((Integer)zoneSevenLightingI.getpreval()).intValue()) >= 50 || !workhrs_6.getprestatus()){//sysj\ECS.sysj line: 25, column: 21
      test_33.setPresent();//sysj\ECS.sysj line: 26, column: 21
      currsigs.addElement(test_33);
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
  }

  public void thread205249(int [] tdone, int [] ends){
        S204425=1;
    active[35]=1;
    ends[35]=1;
    tdone[35]=1;
  }

  public void thread205248(int [] tdone, int [] ends){
        S204422=1;
    zoneOcc_thread_34 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_34 = (Integer)(zoneSevenLightingI.getpreval() == null ? 0 : ((Integer)zoneSevenLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S204413=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_34 > 0 && zoneLightInt_thread_34 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneSevenWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneSevenWindowONOFF);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S204413=1;
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread205247(int [] tdone, int [] ends){
        S204502=1;
    test_33.setClear();//sysj\ECS.sysj line: 3, column: 5
    thread205248(tdone,ends);
    thread205249(tdone,ends);
    thread205250(tdone,ends);
    int biggest205251 = 0;
    if(ends[34]>=biggest205251){
      biggest205251=ends[34];
    }
    if(ends[35]>=biggest205251){
      biggest205251=ends[35];
    }
    if(ends[36]>=biggest205251){
      biggest205251=ends[36];
    }
    if(biggest205251 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
  }

  public void thread205245(int [] tdone, int [] ends){
        S204341=1;
    if((Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue()) == 0 || (Integer)(zoneSixLightingI.getpreval() == null ? 0 : ((Integer)zoneSixLightingI.getpreval()).intValue()) >= 50 || !workhrs_6.getprestatus()){//sysj\ECS.sysj line: 25, column: 21
      test_29.setPresent();//sysj\ECS.sysj line: 26, column: 21
      currsigs.addElement(test_29);
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

  public void thread205244(int [] tdone, int [] ends){
        S204333=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread205243(int [] tdone, int [] ends){
        S204330=1;
    zoneOcc_thread_30 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_30 = (Integer)(zoneSixLightingI.getpreval() == null ? 0 : ((Integer)zoneSixLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S204321=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_30 > 0 && zoneLightInt_thread_30 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneSixWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneSixWindowONOFF);
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S204321=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
  }

  public void thread205242(int [] tdone, int [] ends){
        S204410=1;
    test_29.setClear();//sysj\ECS.sysj line: 3, column: 5
    thread205243(tdone,ends);
    thread205244(tdone,ends);
    thread205245(tdone,ends);
    int biggest205246 = 0;
    if(ends[30]>=biggest205246){
      biggest205246=ends[30];
    }
    if(ends[31]>=biggest205246){
      biggest205246=ends[31];
    }
    if(ends[32]>=biggest205246){
      biggest205246=ends[32];
    }
    if(biggest205246 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread205240(int [] tdone, int [] ends){
        S204249=1;
    if((Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue()) == 0 || (Integer)(zoneFiveLightingI.getpreval() == null ? 0 : ((Integer)zoneFiveLightingI.getpreval()).intValue()) >= 50 || !workhrs_6.getprestatus()){//sysj\ECS.sysj line: 25, column: 21
      test_25.setPresent();//sysj\ECS.sysj line: 26, column: 21
      currsigs.addElement(test_25);
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    else {
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread205239(int [] tdone, int [] ends){
        S204241=1;
    active[27]=1;
    ends[27]=1;
    tdone[27]=1;
  }

  public void thread205238(int [] tdone, int [] ends){
        S204238=1;
    zoneOcc_thread_26 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_26 = (Integer)(zoneFiveLightingI.getpreval() == null ? 0 : ((Integer)zoneFiveLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S204229=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_26 > 0 && zoneLightInt_thread_26 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneFiveWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneFiveWindowONOFF);
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
    else {
      S204229=1;
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread205237(int [] tdone, int [] ends){
        S204318=1;
    test_25.setClear();//sysj\ECS.sysj line: 3, column: 5
    thread205238(tdone,ends);
    thread205239(tdone,ends);
    thread205240(tdone,ends);
    int biggest205241 = 0;
    if(ends[26]>=biggest205241){
      biggest205241=ends[26];
    }
    if(ends[27]>=biggest205241){
      biggest205241=ends[27];
    }
    if(ends[28]>=biggest205241){
      biggest205241=ends[28];
    }
    if(biggest205241 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread205235(int [] tdone, int [] ends){
        S204157=1;
    if((Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue()) == 0 || (Integer)(zoneFourLightingI.getpreval() == null ? 0 : ((Integer)zoneFourLightingI.getpreval()).intValue()) >= 50 || !workhrs_6.getprestatus()){//sysj\ECS.sysj line: 25, column: 21
      test_21.setPresent();//sysj\ECS.sysj line: 26, column: 21
      currsigs.addElement(test_21);
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

  public void thread205234(int [] tdone, int [] ends){
        S204149=1;
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread205233(int [] tdone, int [] ends){
        S204146=1;
    zoneOcc_thread_22 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_22 = (Integer)(zoneFourLightingI.getpreval() == null ? 0 : ((Integer)zoneFourLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S204137=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_22 > 0 && zoneLightInt_thread_22 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneFourWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneFourWindowONOFF);
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S204137=1;
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread205232(int [] tdone, int [] ends){
        S204226=1;
    test_21.setClear();//sysj\ECS.sysj line: 3, column: 5
    thread205233(tdone,ends);
    thread205234(tdone,ends);
    thread205235(tdone,ends);
    int biggest205236 = 0;
    if(ends[22]>=biggest205236){
      biggest205236=ends[22];
    }
    if(ends[23]>=biggest205236){
      biggest205236=ends[23];
    }
    if(ends[24]>=biggest205236){
      biggest205236=ends[24];
    }
    if(biggest205236 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread205230(int [] tdone, int [] ends){
        S204065=1;
    if((Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue()) == 0 || (Integer)(zoneThreeLightingI.getpreval() == null ? 0 : ((Integer)zoneThreeLightingI.getpreval()).intValue()) >= 50 || !workhrs_6.getprestatus()){//sysj\ECS.sysj line: 25, column: 21
      test_17.setPresent();//sysj\ECS.sysj line: 26, column: 21
      currsigs.addElement(test_17);
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

  public void thread205229(int [] tdone, int [] ends){
        S204057=1;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread205228(int [] tdone, int [] ends){
        S204054=1;
    zoneOcc_thread_18 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_18 = (Integer)(zoneThreeLightingI.getpreval() == null ? 0 : ((Integer)zoneThreeLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S204045=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_18 > 0 && zoneLightInt_thread_18 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneThreeWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneThreeWindowONOFF);
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
    else {
      S204045=1;
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread205227(int [] tdone, int [] ends){
        S204134=1;
    test_17.setClear();//sysj\ECS.sysj line: 3, column: 5
    thread205228(tdone,ends);
    thread205229(tdone,ends);
    thread205230(tdone,ends);
    int biggest205231 = 0;
    if(ends[18]>=biggest205231){
      biggest205231=ends[18];
    }
    if(ends[19]>=biggest205231){
      biggest205231=ends[19];
    }
    if(ends[20]>=biggest205231){
      biggest205231=ends[20];
    }
    if(biggest205231 == 1){
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
  }

  public void thread205225(int [] tdone, int [] ends){
        S203973=1;
    if((Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue()) == 0 || (Integer)(zoneTwoLightingI.getpreval() == null ? 0 : ((Integer)zoneTwoLightingI.getpreval()).intValue()) >= 50 || !workhrs_6.getprestatus()){//sysj\ECS.sysj line: 25, column: 21
      test_13.setPresent();//sysj\ECS.sysj line: 26, column: 21
      currsigs.addElement(test_13);
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

  public void thread205224(int [] tdone, int [] ends){
        S203965=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread205223(int [] tdone, int [] ends){
        S203962=1;
    zoneOcc_thread_14 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_14 = (Integer)(zoneTwoLightingI.getpreval() == null ? 0 : ((Integer)zoneTwoLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S203953=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_14 > 0 && zoneLightInt_thread_14 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneTwoWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneTwoWindowONOFF);
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      S203953=1;
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread205222(int [] tdone, int [] ends){
        S204042=1;
    test_13.setClear();//sysj\ECS.sysj line: 3, column: 5
    thread205223(tdone,ends);
    thread205224(tdone,ends);
    thread205225(tdone,ends);
    int biggest205226 = 0;
    if(ends[14]>=biggest205226){
      biggest205226=ends[14];
    }
    if(ends[15]>=biggest205226){
      biggest205226=ends[15];
    }
    if(ends[16]>=biggest205226){
      biggest205226=ends[16];
    }
    if(biggest205226 == 1){
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread205220(int [] tdone, int [] ends){
        S203881=1;
    if((Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue()) == 0 || (Integer)(zoneOneLightingI.getpreval() == null ? 0 : ((Integer)zoneOneLightingI.getpreval()).intValue()) >= 50 || !workhrs_6.getprestatus()){//sysj\ECS.sysj line: 25, column: 21
      test_9.setPresent();//sysj\ECS.sysj line: 26, column: 21
      currsigs.addElement(test_9);
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
    else {
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread205219(int [] tdone, int [] ends){
        S203873=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread205218(int [] tdone, int [] ends){
        S203870=1;
    zoneOcc_thread_10 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_10 = (Integer)(zoneOneLightingI.getpreval() == null ? 0 : ((Integer)zoneOneLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S203861=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_10 > 0 && zoneLightInt_thread_10 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneOneWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneOneWindowONOFF);
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      S203861=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread205217(int [] tdone, int [] ends){
        S203950=1;
    test_9.setClear();//sysj\ECS.sysj line: 3, column: 5
    thread205218(tdone,ends);
    thread205219(tdone,ends);
    thread205220(tdone,ends);
    int biggest205221 = 0;
    if(ends[10]>=biggest205221){
      biggest205221=ends[10];
    }
    if(ends[11]>=biggest205221){
      biggest205221=ends[11];
    }
    if(ends[12]>=biggest205221){
      biggest205221=ends[12];
    }
    if(biggest205221 == 1){
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread205216(int [] tdone, int [] ends){
        S205148=1;
    thread205217(tdone,ends);
    thread205222(tdone,ends);
    thread205227(tdone,ends);
    thread205232(tdone,ends);
    thread205237(tdone,ends);
    thread205242(tdone,ends);
    thread205247(tdone,ends);
    thread205252(tdone,ends);
    thread205257(tdone,ends);
    thread205262(tdone,ends);
    thread205267(tdone,ends);
    thread205272(tdone,ends);
    thread205277(tdone,ends);
    thread205282(tdone,ends);
    int biggest205287 = 0;
    if(ends[9]>=biggest205287){
      biggest205287=ends[9];
    }
    if(ends[13]>=biggest205287){
      biggest205287=ends[13];
    }
    if(ends[17]>=biggest205287){
      biggest205287=ends[17];
    }
    if(ends[21]>=biggest205287){
      biggest205287=ends[21];
    }
    if(ends[25]>=biggest205287){
      biggest205287=ends[25];
    }
    if(ends[29]>=biggest205287){
      biggest205287=ends[29];
    }
    if(ends[33]>=biggest205287){
      biggest205287=ends[33];
    }
    if(ends[37]>=biggest205287){
      biggest205287=ends[37];
    }
    if(ends[41]>=biggest205287){
      biggest205287=ends[41];
    }
    if(ends[45]>=biggest205287){
      biggest205287=ends[45];
    }
    if(ends[49]>=biggest205287){
      biggest205287=ends[49];
    }
    if(ends[53]>=biggest205287){
      biggest205287=ends[53];
    }
    if(ends[57]>=biggest205287){
      biggest205287=ends[57];
    }
    if(ends[61]>=biggest205287){
      biggest205287=ends[61];
    }
    if(biggest205287 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest205287 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest205287 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest205287 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest205287 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest205287 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest205287 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest205287 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest205287 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest205287 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest205287 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest205287 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest205287 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest205287 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread205215(int [] tdone, int [] ends){
        S203858=1;
    S203808=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S205150){
        case 0 : 
          S205150=0;
          break RUN;
        
        case 1 : 
          S205150=2;
          S205150=2;
          workhrs_6.setClear();//sysj\ECS.sysj line: 347, column: 4
          afterhrs_6.setClear();//sysj\ECS.sysj line: 347, column: 4
          thread205215(tdone,ends);
          thread205216(tdone,ends);
          int biggest205288 = 0;
          if(ends[7]>=biggest205288){
            biggest205288=ends[7];
          }
          if(ends[8]>=biggest205288){
            biggest205288=ends[8];
          }
          if(biggest205288 == 1){
            active[6]=1;
            ends[6]=1;
            break RUN;
          }
        
        case 2 : 
          workhrs_6.setClear();//sysj\ECS.sysj line: 347, column: 4
          afterhrs_6.setClear();//sysj\ECS.sysj line: 347, column: 4
          thread205289(tdone,ends);
          thread205290(tdone,ends);
          int biggest205474 = 0;
          if(ends[7]>=biggest205474){
            biggest205474=ends[7];
          }
          if(ends[8]>=biggest205474){
            biggest205474=ends[8];
          }
          if(biggest205474 == 1){
            active[6]=1;
            ends[6]=1;
            break RUN;
          }
          //FINXME code
          if(biggest205474 == 0){
            S205150=0;
            active[6]=0;
            ends[6]=0;
            S205150=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    workhrs_6 = new Signal();
    afterhrs_6 = new Signal();
    test_9 = new Signal();
    test_13 = new Signal();
    test_17 = new Signal();
    test_21 = new Signal();
    test_25 = new Signal();
    test_29 = new Signal();
    test_33 = new Signal();
    test_37 = new Signal();
    test_41 = new Signal();
    test_45 = new Signal();
    test_49 = new Signal();
    test_53 = new Signal();
    test_57 = new Signal();
    test_61 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[6] != 0){
      int index = 6;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[6]!=0 || suspended[6]!=0 || active[6]!=1);
      else{
        if(!df){
          Zone1_Finished.gethook();
          currentTime_2.gethook();
          zoneOneOccupancy.gethook();
          zoneTwoOccupancy.gethook();
          zoneThreeOccupancy.gethook();
          zoneFourOccupancy.gethook();
          zoneFiveOccupancy.gethook();
          zoneSixOccupancy.gethook();
          zoneSevenOccupancy.gethook();
          zoneOneLightingI.gethook();
          zoneTwoLightingI.gethook();
          zoneThreeLightingI.gethook();
          zoneFourLightingI.gethook();
          zoneFiveLightingI.gethook();
          zoneSixLightingI.gethook();
          zoneSevenLightingI.gethook();
          df = true;
        }
        runClockDomain();
      }
      Zone1_Finished.setpreclear();
      currentTime_2.setpreclear();
      zoneOneOccupancy.setpreclear();
      zoneTwoOccupancy.setpreclear();
      zoneThreeOccupancy.setpreclear();
      zoneFourOccupancy.setpreclear();
      zoneFiveOccupancy.setpreclear();
      zoneSixOccupancy.setpreclear();
      zoneSevenOccupancy.setpreclear();
      zoneOneLightingI.setpreclear();
      zoneTwoLightingI.setpreclear();
      zoneThreeLightingI.setpreclear();
      zoneFourLightingI.setpreclear();
      zoneFiveLightingI.setpreclear();
      zoneSixLightingI.setpreclear();
      zoneSevenLightingI.setpreclear();
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
      workhrs_6.setpreclear();
      afterhrs_6.setpreclear();
      test_9.setpreclear();
      test_13.setpreclear();
      test_17.setpreclear();
      test_21.setpreclear();
      test_25.setpreclear();
      test_29.setpreclear();
      test_33.setpreclear();
      test_37.setpreclear();
      test_41.setpreclear();
      test_45.setpreclear();
      test_49.setpreclear();
      test_53.setpreclear();
      test_57.setpreclear();
      test_61.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = Zone1_Finished.getStatus() ? Zone1_Finished.setprepresent() : Zone1_Finished.setpreclear();
      Zone1_Finished.setpreval(Zone1_Finished.getValue());
      Zone1_Finished.setClear();
      dummyint = currentTime_2.getStatus() ? currentTime_2.setprepresent() : currentTime_2.setpreclear();
      currentTime_2.setpreval(currentTime_2.getValue());
      currentTime_2.setClear();
      dummyint = zoneOneOccupancy.getStatus() ? zoneOneOccupancy.setprepresent() : zoneOneOccupancy.setpreclear();
      zoneOneOccupancy.setpreval(zoneOneOccupancy.getValue());
      zoneOneOccupancy.setClear();
      dummyint = zoneTwoOccupancy.getStatus() ? zoneTwoOccupancy.setprepresent() : zoneTwoOccupancy.setpreclear();
      zoneTwoOccupancy.setpreval(zoneTwoOccupancy.getValue());
      zoneTwoOccupancy.setClear();
      dummyint = zoneThreeOccupancy.getStatus() ? zoneThreeOccupancy.setprepresent() : zoneThreeOccupancy.setpreclear();
      zoneThreeOccupancy.setpreval(zoneThreeOccupancy.getValue());
      zoneThreeOccupancy.setClear();
      dummyint = zoneFourOccupancy.getStatus() ? zoneFourOccupancy.setprepresent() : zoneFourOccupancy.setpreclear();
      zoneFourOccupancy.setpreval(zoneFourOccupancy.getValue());
      zoneFourOccupancy.setClear();
      dummyint = zoneFiveOccupancy.getStatus() ? zoneFiveOccupancy.setprepresent() : zoneFiveOccupancy.setpreclear();
      zoneFiveOccupancy.setpreval(zoneFiveOccupancy.getValue());
      zoneFiveOccupancy.setClear();
      dummyint = zoneSixOccupancy.getStatus() ? zoneSixOccupancy.setprepresent() : zoneSixOccupancy.setpreclear();
      zoneSixOccupancy.setpreval(zoneSixOccupancy.getValue());
      zoneSixOccupancy.setClear();
      dummyint = zoneSevenOccupancy.getStatus() ? zoneSevenOccupancy.setprepresent() : zoneSevenOccupancy.setpreclear();
      zoneSevenOccupancy.setpreval(zoneSevenOccupancy.getValue());
      zoneSevenOccupancy.setClear();
      dummyint = zoneOneLightingI.getStatus() ? zoneOneLightingI.setprepresent() : zoneOneLightingI.setpreclear();
      zoneOneLightingI.setpreval(zoneOneLightingI.getValue());
      zoneOneLightingI.setClear();
      dummyint = zoneTwoLightingI.getStatus() ? zoneTwoLightingI.setprepresent() : zoneTwoLightingI.setpreclear();
      zoneTwoLightingI.setpreval(zoneTwoLightingI.getValue());
      zoneTwoLightingI.setClear();
      dummyint = zoneThreeLightingI.getStatus() ? zoneThreeLightingI.setprepresent() : zoneThreeLightingI.setpreclear();
      zoneThreeLightingI.setpreval(zoneThreeLightingI.getValue());
      zoneThreeLightingI.setClear();
      dummyint = zoneFourLightingI.getStatus() ? zoneFourLightingI.setprepresent() : zoneFourLightingI.setpreclear();
      zoneFourLightingI.setpreval(zoneFourLightingI.getValue());
      zoneFourLightingI.setClear();
      dummyint = zoneFiveLightingI.getStatus() ? zoneFiveLightingI.setprepresent() : zoneFiveLightingI.setpreclear();
      zoneFiveLightingI.setpreval(zoneFiveLightingI.getValue());
      zoneFiveLightingI.setClear();
      dummyint = zoneSixLightingI.getStatus() ? zoneSixLightingI.setprepresent() : zoneSixLightingI.setpreclear();
      zoneSixLightingI.setpreval(zoneSixLightingI.getValue());
      zoneSixLightingI.setClear();
      dummyint = zoneSevenLightingI.getStatus() ? zoneSevenLightingI.setprepresent() : zoneSevenLightingI.setpreclear();
      zoneSevenLightingI.setpreval(zoneSevenLightingI.getValue());
      zoneSevenLightingI.setClear();
      zoneOneLightONOFF.sethook();
      zoneOneLightONOFF.setClear();
      zoneTwoLightONOFF.sethook();
      zoneTwoLightONOFF.setClear();
      zoneThreeLightONOFF.sethook();
      zoneThreeLightONOFF.setClear();
      zoneFourLightONOFF.sethook();
      zoneFourLightONOFF.setClear();
      zoneFiveLightONOFF.sethook();
      zoneFiveLightONOFF.setClear();
      zoneSixLightONOFF.sethook();
      zoneSixLightONOFF.setClear();
      zoneSevenLightONOFF.sethook();
      zoneSevenLightONOFF.setClear();
      zoneOneWindowONOFF.sethook();
      zoneOneWindowONOFF.setClear();
      zoneTwoWindowONOFF.sethook();
      zoneTwoWindowONOFF.setClear();
      zoneThreeWindowONOFF.sethook();
      zoneThreeWindowONOFF.setClear();
      zoneFourWindowONOFF.sethook();
      zoneFourWindowONOFF.setClear();
      zoneFiveWindowONOFF.sethook();
      zoneFiveWindowONOFF.setClear();
      zoneSixWindowONOFF.sethook();
      zoneSixWindowONOFF.setClear();
      zoneSevenWindowONOFF.sethook();
      zoneSevenWindowONOFF.setClear();
      workhrs_6.setClear();
      afterhrs_6.setClear();
      test_9.setClear();
      test_13.setClear();
      test_17.setClear();
      test_21.setClear();
      test_25.setClear();
      test_29.setClear();
      test_33.setClear();
      test_37.setClear();
      test_41.setClear();
      test_45.setClear();
      test_49.setClear();
      test_53.setClear();
      test_57.setClear();
      test_61.setClear();
      if(paused[6]!=0 || suspended[6]!=0 || active[6]!=1);
      else{
        Zone1_Finished.gethook();
        currentTime_2.gethook();
        zoneOneOccupancy.gethook();
        zoneTwoOccupancy.gethook();
        zoneThreeOccupancy.gethook();
        zoneFourOccupancy.gethook();
        zoneFiveOccupancy.gethook();
        zoneSixOccupancy.gethook();
        zoneSevenOccupancy.gethook();
        zoneOneLightingI.gethook();
        zoneTwoLightingI.gethook();
        zoneThreeLightingI.gethook();
        zoneFourLightingI.gethook();
        zoneFiveLightingI.gethook();
        zoneSixLightingI.gethook();
        zoneSevenLightingI.gethook();
      }
      runFinisher();
      if(active[6] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
