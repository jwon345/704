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
  private int S204837 = 1;
  private int S203545 = 1;
  private int S203495 = 1;
  private int S203499 = 1;
  private int S204835 = 1;
  private int S203637 = 1;
  private int S203557 = 1;
  private int S203548 = 1;
  private int S203560 = 1;
  private int S203568 = 1;
  private int S203729 = 1;
  private int S203649 = 1;
  private int S203640 = 1;
  private int S203652 = 1;
  private int S203660 = 1;
  private int S203821 = 1;
  private int S203741 = 1;
  private int S203732 = 1;
  private int S203744 = 1;
  private int S203752 = 1;
  private int S203913 = 1;
  private int S203833 = 1;
  private int S203824 = 1;
  private int S203836 = 1;
  private int S203844 = 1;
  private int S204005 = 1;
  private int S203925 = 1;
  private int S203916 = 1;
  private int S203928 = 1;
  private int S203936 = 1;
  private int S204097 = 1;
  private int S204017 = 1;
  private int S204008 = 1;
  private int S204020 = 1;
  private int S204028 = 1;
  private int S204189 = 1;
  private int S204109 = 1;
  private int S204100 = 1;
  private int S204112 = 1;
  private int S204120 = 1;
  private int S204281 = 1;
  private int S204201 = 1;
  private int S204192 = 1;
  private int S204204 = 1;
  private int S204212 = 1;
  private int S204373 = 1;
  private int S204293 = 1;
  private int S204284 = 1;
  private int S204296 = 1;
  private int S204304 = 1;
  private int S204465 = 1;
  private int S204385 = 1;
  private int S204376 = 1;
  private int S204388 = 1;
  private int S204396 = 1;
  private int S204557 = 1;
  private int S204477 = 1;
  private int S204468 = 1;
  private int S204480 = 1;
  private int S204488 = 1;
  private int S204649 = 1;
  private int S204569 = 1;
  private int S204560 = 1;
  private int S204572 = 1;
  private int S204580 = 1;
  private int S204741 = 1;
  private int S204661 = 1;
  private int S204652 = 1;
  private int S204664 = 1;
  private int S204672 = 1;
  private int S204833 = 1;
  private int S204753 = 1;
  private int S204744 = 1;
  private int S204756 = 1;
  private int S204764 = 1;
  
  private int[] ends = new int[66];
  private int[] tdone = new int[66];
  
  public void thread205116(int [] tdone, int [] ends){
        S204764=1;
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

  public void thread205115(int [] tdone, int [] ends){
        S204756=1;
    active[63]=1;
    ends[63]=1;
    tdone[63]=1;
  }

  public void thread205114(int [] tdone, int [] ends){
        S204753=1;
    zoneOcc_thread_62 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_62 = (Integer)(zoneSevenLightingI.getpreval() == null ? 0 : ((Integer)zoneSevenLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204744=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_62 > 0 && zoneLightInt_thread_62 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneSevenLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneSevenLightONOFF);
      active[62]=1;
      ends[62]=1;
      tdone[62]=1;
    }
    else {
      S204744=1;
      active[62]=1;
      ends[62]=1;
      tdone[62]=1;
    }
  }

  public void thread205112(int [] tdone, int [] ends){
        S204764=1;
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

  public void thread205111(int [] tdone, int [] ends){
        S204756=1;
    active[63]=1;
    ends[63]=1;
    tdone[63]=1;
  }

  public void thread205110(int [] tdone, int [] ends){
        S204753=1;
    zoneOcc_thread_62 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_62 = (Integer)(zoneSevenLightingI.getpreval() == null ? 0 : ((Integer)zoneSevenLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204744=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_62 > 0 && zoneLightInt_thread_62 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneSevenLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneSevenLightONOFF);
      active[62]=1;
      ends[62]=1;
      tdone[62]=1;
    }
    else {
      S204744=1;
      active[62]=1;
      ends[62]=1;
      tdone[62]=1;
    }
  }

  public void thread205108(int [] tdone, int [] ends){
        switch(S204764){
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

  public void thread205107(int [] tdone, int [] ends){
        switch(S204756){
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

  public void thread205106(int [] tdone, int [] ends){
        switch(S204753){
      case 0 : 
        active[62]=0;
        ends[62]=0;
        tdone[62]=1;
        break;
      
      case 1 : 
        switch(S204744){
          case 0 : 
            zoneSevenLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
            currsigs.addElement(zoneSevenLightONOFF);
            active[62]=1;
            ends[62]=1;
            tdone[62]=1;
            break;
          
          case 1 : 
            S204744=1;
            S204753=0;
            active[62]=0;
            ends[62]=0;
            tdone[62]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread205105(int [] tdone, int [] ends){
        switch(S204833){
      case 0 : 
        active[61]=0;
        ends[61]=0;
        tdone[61]=1;
        break;
      
      case 1 : 
        test_61.setClear();//sysj\ECS.sysj line: 37, column: 5
        thread205106(tdone,ends);
        thread205107(tdone,ends);
        thread205108(tdone,ends);
        int biggest205109 = 0;
        if(ends[62]>=biggest205109){
          biggest205109=ends[62];
        }
        if(ends[63]>=biggest205109){
          biggest205109=ends[63];
        }
        if(ends[64]>=biggest205109){
          biggest205109=ends[64];
        }
        if(biggest205109 == 1){
          active[61]=1;
          ends[61]=1;
          tdone[61]=1;
        }
        if(biggest205109 == 2){
          ends[61]=2;
          ;//sysj\ECS.sysj line: 39, column: 5
          thread205110(tdone,ends);
          thread205111(tdone,ends);
          thread205112(tdone,ends);
          int biggest205113 = 0;
          if(ends[62]>=biggest205113){
            biggest205113=ends[62];
          }
          if(ends[63]>=biggest205113){
            biggest205113=ends[63];
          }
          if(ends[64]>=biggest205113){
            biggest205113=ends[64];
          }
          if(biggest205113 == 1){
            active[61]=1;
            ends[61]=1;
            tdone[61]=1;
          }
        }
        //FINXME code
        if(biggest205109 == 0){
          thread205114(tdone,ends);
          thread205115(tdone,ends);
          thread205116(tdone,ends);
          int biggest205117 = 0;
          if(ends[62]>=biggest205117){
            biggest205117=ends[62];
          }
          if(ends[63]>=biggest205117){
            biggest205117=ends[63];
          }
          if(ends[64]>=biggest205117){
            biggest205117=ends[64];
          }
          if(biggest205117 == 1){
            active[61]=1;
            ends[61]=1;
            tdone[61]=1;
          }
        }
        break;
      
    }
  }

  public void thread205103(int [] tdone, int [] ends){
        S204672=1;
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

  public void thread205102(int [] tdone, int [] ends){
        S204664=1;
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread205101(int [] tdone, int [] ends){
        S204661=1;
    zoneOcc_thread_58 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_58 = (Integer)(zoneSixLightingI.getpreval() == null ? 0 : ((Integer)zoneSixLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204652=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_58 > 0 && zoneLightInt_thread_58 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneSixLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneSixLightONOFF);
      active[58]=1;
      ends[58]=1;
      tdone[58]=1;
    }
    else {
      S204652=1;
      active[58]=1;
      ends[58]=1;
      tdone[58]=1;
    }
  }

  public void thread205099(int [] tdone, int [] ends){
        S204672=1;
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

  public void thread205098(int [] tdone, int [] ends){
        S204664=1;
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread205097(int [] tdone, int [] ends){
        S204661=1;
    zoneOcc_thread_58 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_58 = (Integer)(zoneSixLightingI.getpreval() == null ? 0 : ((Integer)zoneSixLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204652=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_58 > 0 && zoneLightInt_thread_58 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneSixLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneSixLightONOFF);
      active[58]=1;
      ends[58]=1;
      tdone[58]=1;
    }
    else {
      S204652=1;
      active[58]=1;
      ends[58]=1;
      tdone[58]=1;
    }
  }

  public void thread205095(int [] tdone, int [] ends){
        switch(S204672){
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

  public void thread205094(int [] tdone, int [] ends){
        switch(S204664){
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

  public void thread205093(int [] tdone, int [] ends){
        switch(S204661){
      case 0 : 
        active[58]=0;
        ends[58]=0;
        tdone[58]=1;
        break;
      
      case 1 : 
        switch(S204652){
          case 0 : 
            zoneSixLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
            currsigs.addElement(zoneSixLightONOFF);
            active[58]=1;
            ends[58]=1;
            tdone[58]=1;
            break;
          
          case 1 : 
            S204652=1;
            S204661=0;
            active[58]=0;
            ends[58]=0;
            tdone[58]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread205092(int [] tdone, int [] ends){
        switch(S204741){
      case 0 : 
        active[57]=0;
        ends[57]=0;
        tdone[57]=1;
        break;
      
      case 1 : 
        test_57.setClear();//sysj\ECS.sysj line: 37, column: 5
        thread205093(tdone,ends);
        thread205094(tdone,ends);
        thread205095(tdone,ends);
        int biggest205096 = 0;
        if(ends[58]>=biggest205096){
          biggest205096=ends[58];
        }
        if(ends[59]>=biggest205096){
          biggest205096=ends[59];
        }
        if(ends[60]>=biggest205096){
          biggest205096=ends[60];
        }
        if(biggest205096 == 1){
          active[57]=1;
          ends[57]=1;
          tdone[57]=1;
        }
        if(biggest205096 == 2){
          ends[57]=2;
          ;//sysj\ECS.sysj line: 39, column: 5
          thread205097(tdone,ends);
          thread205098(tdone,ends);
          thread205099(tdone,ends);
          int biggest205100 = 0;
          if(ends[58]>=biggest205100){
            biggest205100=ends[58];
          }
          if(ends[59]>=biggest205100){
            biggest205100=ends[59];
          }
          if(ends[60]>=biggest205100){
            biggest205100=ends[60];
          }
          if(biggest205100 == 1){
            active[57]=1;
            ends[57]=1;
            tdone[57]=1;
          }
        }
        //FINXME code
        if(biggest205096 == 0){
          thread205101(tdone,ends);
          thread205102(tdone,ends);
          thread205103(tdone,ends);
          int biggest205104 = 0;
          if(ends[58]>=biggest205104){
            biggest205104=ends[58];
          }
          if(ends[59]>=biggest205104){
            biggest205104=ends[59];
          }
          if(ends[60]>=biggest205104){
            biggest205104=ends[60];
          }
          if(biggest205104 == 1){
            active[57]=1;
            ends[57]=1;
            tdone[57]=1;
          }
        }
        break;
      
    }
  }

  public void thread205090(int [] tdone, int [] ends){
        S204580=1;
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

  public void thread205089(int [] tdone, int [] ends){
        S204572=1;
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread205088(int [] tdone, int [] ends){
        S204569=1;
    zoneOcc_thread_54 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_54 = (Integer)(zoneFiveLightingI.getpreval() == null ? 0 : ((Integer)zoneFiveLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204560=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_54 > 0 && zoneLightInt_thread_54 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneFiveLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneFiveLightONOFF);
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
    else {
      S204560=1;
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
  }

  public void thread205086(int [] tdone, int [] ends){
        S204580=1;
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

  public void thread205085(int [] tdone, int [] ends){
        S204572=1;
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread205084(int [] tdone, int [] ends){
        S204569=1;
    zoneOcc_thread_54 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_54 = (Integer)(zoneFiveLightingI.getpreval() == null ? 0 : ((Integer)zoneFiveLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204560=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_54 > 0 && zoneLightInt_thread_54 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneFiveLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneFiveLightONOFF);
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
    else {
      S204560=1;
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
  }

  public void thread205082(int [] tdone, int [] ends){
        switch(S204580){
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

  public void thread205081(int [] tdone, int [] ends){
        switch(S204572){
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

  public void thread205080(int [] tdone, int [] ends){
        switch(S204569){
      case 0 : 
        active[54]=0;
        ends[54]=0;
        tdone[54]=1;
        break;
      
      case 1 : 
        switch(S204560){
          case 0 : 
            zoneFiveLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
            currsigs.addElement(zoneFiveLightONOFF);
            active[54]=1;
            ends[54]=1;
            tdone[54]=1;
            break;
          
          case 1 : 
            S204560=1;
            S204569=0;
            active[54]=0;
            ends[54]=0;
            tdone[54]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread205079(int [] tdone, int [] ends){
        switch(S204649){
      case 0 : 
        active[53]=0;
        ends[53]=0;
        tdone[53]=1;
        break;
      
      case 1 : 
        test_53.setClear();//sysj\ECS.sysj line: 37, column: 5
        thread205080(tdone,ends);
        thread205081(tdone,ends);
        thread205082(tdone,ends);
        int biggest205083 = 0;
        if(ends[54]>=biggest205083){
          biggest205083=ends[54];
        }
        if(ends[55]>=biggest205083){
          biggest205083=ends[55];
        }
        if(ends[56]>=biggest205083){
          biggest205083=ends[56];
        }
        if(biggest205083 == 1){
          active[53]=1;
          ends[53]=1;
          tdone[53]=1;
        }
        if(biggest205083 == 2){
          ends[53]=2;
          ;//sysj\ECS.sysj line: 39, column: 5
          thread205084(tdone,ends);
          thread205085(tdone,ends);
          thread205086(tdone,ends);
          int biggest205087 = 0;
          if(ends[54]>=biggest205087){
            biggest205087=ends[54];
          }
          if(ends[55]>=biggest205087){
            biggest205087=ends[55];
          }
          if(ends[56]>=biggest205087){
            biggest205087=ends[56];
          }
          if(biggest205087 == 1){
            active[53]=1;
            ends[53]=1;
            tdone[53]=1;
          }
        }
        //FINXME code
        if(biggest205083 == 0){
          thread205088(tdone,ends);
          thread205089(tdone,ends);
          thread205090(tdone,ends);
          int biggest205091 = 0;
          if(ends[54]>=biggest205091){
            biggest205091=ends[54];
          }
          if(ends[55]>=biggest205091){
            biggest205091=ends[55];
          }
          if(ends[56]>=biggest205091){
            biggest205091=ends[56];
          }
          if(biggest205091 == 1){
            active[53]=1;
            ends[53]=1;
            tdone[53]=1;
          }
        }
        break;
      
    }
  }

  public void thread205077(int [] tdone, int [] ends){
        S204488=1;
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

  public void thread205076(int [] tdone, int [] ends){
        S204480=1;
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread205075(int [] tdone, int [] ends){
        S204477=1;
    zoneOcc_thread_50 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_50 = (Integer)(zoneFourLightingI.getpreval() == null ? 0 : ((Integer)zoneFourLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204468=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_50 > 0 && zoneLightInt_thread_50 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneFourLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneFourLightONOFF);
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
    else {
      S204468=1;
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
  }

  public void thread205073(int [] tdone, int [] ends){
        S204488=1;
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

  public void thread205072(int [] tdone, int [] ends){
        S204480=1;
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread205071(int [] tdone, int [] ends){
        S204477=1;
    zoneOcc_thread_50 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_50 = (Integer)(zoneFourLightingI.getpreval() == null ? 0 : ((Integer)zoneFourLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204468=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_50 > 0 && zoneLightInt_thread_50 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneFourLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneFourLightONOFF);
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
    else {
      S204468=1;
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
  }

  public void thread205069(int [] tdone, int [] ends){
        switch(S204488){
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

  public void thread205068(int [] tdone, int [] ends){
        switch(S204480){
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

  public void thread205067(int [] tdone, int [] ends){
        switch(S204477){
      case 0 : 
        active[50]=0;
        ends[50]=0;
        tdone[50]=1;
        break;
      
      case 1 : 
        switch(S204468){
          case 0 : 
            zoneFourLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
            currsigs.addElement(zoneFourLightONOFF);
            active[50]=1;
            ends[50]=1;
            tdone[50]=1;
            break;
          
          case 1 : 
            S204468=1;
            S204477=0;
            active[50]=0;
            ends[50]=0;
            tdone[50]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread205066(int [] tdone, int [] ends){
        switch(S204557){
      case 0 : 
        active[49]=0;
        ends[49]=0;
        tdone[49]=1;
        break;
      
      case 1 : 
        test_49.setClear();//sysj\ECS.sysj line: 37, column: 5
        thread205067(tdone,ends);
        thread205068(tdone,ends);
        thread205069(tdone,ends);
        int biggest205070 = 0;
        if(ends[50]>=biggest205070){
          biggest205070=ends[50];
        }
        if(ends[51]>=biggest205070){
          biggest205070=ends[51];
        }
        if(ends[52]>=biggest205070){
          biggest205070=ends[52];
        }
        if(biggest205070 == 1){
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
        if(biggest205070 == 2){
          ends[49]=2;
          ;//sysj\ECS.sysj line: 39, column: 5
          thread205071(tdone,ends);
          thread205072(tdone,ends);
          thread205073(tdone,ends);
          int biggest205074 = 0;
          if(ends[50]>=biggest205074){
            biggest205074=ends[50];
          }
          if(ends[51]>=biggest205074){
            biggest205074=ends[51];
          }
          if(ends[52]>=biggest205074){
            biggest205074=ends[52];
          }
          if(biggest205074 == 1){
            active[49]=1;
            ends[49]=1;
            tdone[49]=1;
          }
        }
        //FINXME code
        if(biggest205070 == 0){
          thread205075(tdone,ends);
          thread205076(tdone,ends);
          thread205077(tdone,ends);
          int biggest205078 = 0;
          if(ends[50]>=biggest205078){
            biggest205078=ends[50];
          }
          if(ends[51]>=biggest205078){
            biggest205078=ends[51];
          }
          if(ends[52]>=biggest205078){
            biggest205078=ends[52];
          }
          if(biggest205078 == 1){
            active[49]=1;
            ends[49]=1;
            tdone[49]=1;
          }
        }
        break;
      
    }
  }

  public void thread205064(int [] tdone, int [] ends){
        S204396=1;
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

  public void thread205063(int [] tdone, int [] ends){
        S204388=1;
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread205062(int [] tdone, int [] ends){
        S204385=1;
    zoneOcc_thread_46 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_46 = (Integer)(zoneThreeLightingI.getpreval() == null ? 0 : ((Integer)zoneThreeLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204376=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_46 > 0 && zoneLightInt_thread_46 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneThreeLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneThreeLightONOFF);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S204376=1;
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
  }

  public void thread205060(int [] tdone, int [] ends){
        S204396=1;
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

  public void thread205059(int [] tdone, int [] ends){
        S204388=1;
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread205058(int [] tdone, int [] ends){
        S204385=1;
    zoneOcc_thread_46 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_46 = (Integer)(zoneThreeLightingI.getpreval() == null ? 0 : ((Integer)zoneThreeLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204376=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_46 > 0 && zoneLightInt_thread_46 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneThreeLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneThreeLightONOFF);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S204376=1;
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
  }

  public void thread205056(int [] tdone, int [] ends){
        switch(S204396){
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

  public void thread205055(int [] tdone, int [] ends){
        switch(S204388){
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

  public void thread205054(int [] tdone, int [] ends){
        switch(S204385){
      case 0 : 
        active[46]=0;
        ends[46]=0;
        tdone[46]=1;
        break;
      
      case 1 : 
        switch(S204376){
          case 0 : 
            zoneThreeLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
            currsigs.addElement(zoneThreeLightONOFF);
            active[46]=1;
            ends[46]=1;
            tdone[46]=1;
            break;
          
          case 1 : 
            S204376=1;
            S204385=0;
            active[46]=0;
            ends[46]=0;
            tdone[46]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread205053(int [] tdone, int [] ends){
        switch(S204465){
      case 0 : 
        active[45]=0;
        ends[45]=0;
        tdone[45]=1;
        break;
      
      case 1 : 
        test_45.setClear();//sysj\ECS.sysj line: 37, column: 5
        thread205054(tdone,ends);
        thread205055(tdone,ends);
        thread205056(tdone,ends);
        int biggest205057 = 0;
        if(ends[46]>=biggest205057){
          biggest205057=ends[46];
        }
        if(ends[47]>=biggest205057){
          biggest205057=ends[47];
        }
        if(ends[48]>=biggest205057){
          biggest205057=ends[48];
        }
        if(biggest205057 == 1){
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
        if(biggest205057 == 2){
          ends[45]=2;
          ;//sysj\ECS.sysj line: 39, column: 5
          thread205058(tdone,ends);
          thread205059(tdone,ends);
          thread205060(tdone,ends);
          int biggest205061 = 0;
          if(ends[46]>=biggest205061){
            biggest205061=ends[46];
          }
          if(ends[47]>=biggest205061){
            biggest205061=ends[47];
          }
          if(ends[48]>=biggest205061){
            biggest205061=ends[48];
          }
          if(biggest205061 == 1){
            active[45]=1;
            ends[45]=1;
            tdone[45]=1;
          }
        }
        //FINXME code
        if(biggest205057 == 0){
          thread205062(tdone,ends);
          thread205063(tdone,ends);
          thread205064(tdone,ends);
          int biggest205065 = 0;
          if(ends[46]>=biggest205065){
            biggest205065=ends[46];
          }
          if(ends[47]>=biggest205065){
            biggest205065=ends[47];
          }
          if(ends[48]>=biggest205065){
            biggest205065=ends[48];
          }
          if(biggest205065 == 1){
            active[45]=1;
            ends[45]=1;
            tdone[45]=1;
          }
        }
        break;
      
    }
  }

  public void thread205051(int [] tdone, int [] ends){
        S204304=1;
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

  public void thread205050(int [] tdone, int [] ends){
        S204296=1;
    active[43]=1;
    ends[43]=1;
    tdone[43]=1;
  }

  public void thread205049(int [] tdone, int [] ends){
        S204293=1;
    zoneOcc_thread_42 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_42 = (Integer)(zoneTwoLightingI.getpreval() == null ? 0 : ((Integer)zoneTwoLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204284=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_42 > 0 && zoneLightInt_thread_42 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneTwoLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneTwoLightONOFF);
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S204284=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread205047(int [] tdone, int [] ends){
        S204304=1;
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

  public void thread205046(int [] tdone, int [] ends){
        S204296=1;
    active[43]=1;
    ends[43]=1;
    tdone[43]=1;
  }

  public void thread205045(int [] tdone, int [] ends){
        S204293=1;
    zoneOcc_thread_42 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_42 = (Integer)(zoneTwoLightingI.getpreval() == null ? 0 : ((Integer)zoneTwoLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204284=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_42 > 0 && zoneLightInt_thread_42 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneTwoLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneTwoLightONOFF);
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S204284=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread205043(int [] tdone, int [] ends){
        switch(S204304){
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

  public void thread205042(int [] tdone, int [] ends){
        switch(S204296){
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

  public void thread205041(int [] tdone, int [] ends){
        switch(S204293){
      case 0 : 
        active[42]=0;
        ends[42]=0;
        tdone[42]=1;
        break;
      
      case 1 : 
        switch(S204284){
          case 0 : 
            zoneTwoLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
            currsigs.addElement(zoneTwoLightONOFF);
            active[42]=1;
            ends[42]=1;
            tdone[42]=1;
            break;
          
          case 1 : 
            S204284=1;
            S204293=0;
            active[42]=0;
            ends[42]=0;
            tdone[42]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread205040(int [] tdone, int [] ends){
        switch(S204373){
      case 0 : 
        active[41]=0;
        ends[41]=0;
        tdone[41]=1;
        break;
      
      case 1 : 
        test_41.setClear();//sysj\ECS.sysj line: 37, column: 5
        thread205041(tdone,ends);
        thread205042(tdone,ends);
        thread205043(tdone,ends);
        int biggest205044 = 0;
        if(ends[42]>=biggest205044){
          biggest205044=ends[42];
        }
        if(ends[43]>=biggest205044){
          biggest205044=ends[43];
        }
        if(ends[44]>=biggest205044){
          biggest205044=ends[44];
        }
        if(biggest205044 == 1){
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
        if(biggest205044 == 2){
          ends[41]=2;
          ;//sysj\ECS.sysj line: 39, column: 5
          thread205045(tdone,ends);
          thread205046(tdone,ends);
          thread205047(tdone,ends);
          int biggest205048 = 0;
          if(ends[42]>=biggest205048){
            biggest205048=ends[42];
          }
          if(ends[43]>=biggest205048){
            biggest205048=ends[43];
          }
          if(ends[44]>=biggest205048){
            biggest205048=ends[44];
          }
          if(biggest205048 == 1){
            active[41]=1;
            ends[41]=1;
            tdone[41]=1;
          }
        }
        //FINXME code
        if(biggest205044 == 0){
          thread205049(tdone,ends);
          thread205050(tdone,ends);
          thread205051(tdone,ends);
          int biggest205052 = 0;
          if(ends[42]>=biggest205052){
            biggest205052=ends[42];
          }
          if(ends[43]>=biggest205052){
            biggest205052=ends[43];
          }
          if(ends[44]>=biggest205052){
            biggest205052=ends[44];
          }
          if(biggest205052 == 1){
            active[41]=1;
            ends[41]=1;
            tdone[41]=1;
          }
        }
        break;
      
    }
  }

  public void thread205038(int [] tdone, int [] ends){
        S204212=1;
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

  public void thread205037(int [] tdone, int [] ends){
        S204204=1;
    active[39]=1;
    ends[39]=1;
    tdone[39]=1;
  }

  public void thread205036(int [] tdone, int [] ends){
        S204201=1;
    zoneOcc_thread_38 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_38 = (Integer)(zoneOneLightingI.getpreval() == null ? 0 : ((Integer)zoneOneLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204192=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_38 > 0 && zoneLightInt_thread_38 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneOneLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneOneLightONOFF);
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      S204192=1;
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread205034(int [] tdone, int [] ends){
        S204212=1;
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

  public void thread205033(int [] tdone, int [] ends){
        S204204=1;
    active[39]=1;
    ends[39]=1;
    tdone[39]=1;
  }

  public void thread205032(int [] tdone, int [] ends){
        S204201=1;
    zoneOcc_thread_38 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_38 = (Integer)(zoneOneLightingI.getpreval() == null ? 0 : ((Integer)zoneOneLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204192=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_38 > 0 && zoneLightInt_thread_38 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneOneLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneOneLightONOFF);
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      S204192=1;
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread205030(int [] tdone, int [] ends){
        switch(S204212){
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

  public void thread205029(int [] tdone, int [] ends){
        switch(S204204){
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

  public void thread205028(int [] tdone, int [] ends){
        switch(S204201){
      case 0 : 
        active[38]=0;
        ends[38]=0;
        tdone[38]=1;
        break;
      
      case 1 : 
        switch(S204192){
          case 0 : 
            zoneOneLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
            currsigs.addElement(zoneOneLightONOFF);
            active[38]=1;
            ends[38]=1;
            tdone[38]=1;
            break;
          
          case 1 : 
            S204192=1;
            S204201=0;
            active[38]=0;
            ends[38]=0;
            tdone[38]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread205027(int [] tdone, int [] ends){
        switch(S204281){
      case 0 : 
        active[37]=0;
        ends[37]=0;
        tdone[37]=1;
        break;
      
      case 1 : 
        test_37.setClear();//sysj\ECS.sysj line: 37, column: 5
        thread205028(tdone,ends);
        thread205029(tdone,ends);
        thread205030(tdone,ends);
        int biggest205031 = 0;
        if(ends[38]>=biggest205031){
          biggest205031=ends[38];
        }
        if(ends[39]>=biggest205031){
          biggest205031=ends[39];
        }
        if(ends[40]>=biggest205031){
          biggest205031=ends[40];
        }
        if(biggest205031 == 1){
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
        if(biggest205031 == 2){
          ends[37]=2;
          ;//sysj\ECS.sysj line: 39, column: 5
          thread205032(tdone,ends);
          thread205033(tdone,ends);
          thread205034(tdone,ends);
          int biggest205035 = 0;
          if(ends[38]>=biggest205035){
            biggest205035=ends[38];
          }
          if(ends[39]>=biggest205035){
            biggest205035=ends[39];
          }
          if(ends[40]>=biggest205035){
            biggest205035=ends[40];
          }
          if(biggest205035 == 1){
            active[37]=1;
            ends[37]=1;
            tdone[37]=1;
          }
        }
        //FINXME code
        if(biggest205031 == 0){
          thread205036(tdone,ends);
          thread205037(tdone,ends);
          thread205038(tdone,ends);
          int biggest205039 = 0;
          if(ends[38]>=biggest205039){
            biggest205039=ends[38];
          }
          if(ends[39]>=biggest205039){
            biggest205039=ends[39];
          }
          if(ends[40]>=biggest205039){
            biggest205039=ends[40];
          }
          if(biggest205039 == 1){
            active[37]=1;
            ends[37]=1;
            tdone[37]=1;
          }
        }
        break;
      
    }
  }

  public void thread205025(int [] tdone, int [] ends){
        S204120=1;
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

  public void thread205024(int [] tdone, int [] ends){
        S204112=1;
    active[35]=1;
    ends[35]=1;
    tdone[35]=1;
  }

  public void thread205023(int [] tdone, int [] ends){
        S204109=1;
    zoneOcc_thread_34 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_34 = (Integer)(zoneSevenLightingI.getpreval() == null ? 0 : ((Integer)zoneSevenLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S204100=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_34 > 0 && zoneLightInt_thread_34 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneSevenWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneSevenWindowONOFF);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S204100=1;
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread205021(int [] tdone, int [] ends){
        S204120=1;
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

  public void thread205020(int [] tdone, int [] ends){
        S204112=1;
    active[35]=1;
    ends[35]=1;
    tdone[35]=1;
  }

  public void thread205019(int [] tdone, int [] ends){
        S204109=1;
    zoneOcc_thread_34 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_34 = (Integer)(zoneSevenLightingI.getpreval() == null ? 0 : ((Integer)zoneSevenLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S204100=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_34 > 0 && zoneLightInt_thread_34 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneSevenWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneSevenWindowONOFF);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S204100=1;
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread205017(int [] tdone, int [] ends){
        switch(S204120){
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

  public void thread205016(int [] tdone, int [] ends){
        switch(S204112){
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

  public void thread205015(int [] tdone, int [] ends){
        switch(S204109){
      case 0 : 
        active[34]=0;
        ends[34]=0;
        tdone[34]=1;
        break;
      
      case 1 : 
        switch(S204100){
          case 0 : 
            zoneSevenWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
            currsigs.addElement(zoneSevenWindowONOFF);
            active[34]=1;
            ends[34]=1;
            tdone[34]=1;
            break;
          
          case 1 : 
            S204100=1;
            S204109=0;
            active[34]=0;
            ends[34]=0;
            tdone[34]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread205014(int [] tdone, int [] ends){
        switch(S204189){
      case 0 : 
        active[33]=0;
        ends[33]=0;
        tdone[33]=1;
        break;
      
      case 1 : 
        test_33.setClear();//sysj\ECS.sysj line: 3, column: 5
        thread205015(tdone,ends);
        thread205016(tdone,ends);
        thread205017(tdone,ends);
        int biggest205018 = 0;
        if(ends[34]>=biggest205018){
          biggest205018=ends[34];
        }
        if(ends[35]>=biggest205018){
          biggest205018=ends[35];
        }
        if(ends[36]>=biggest205018){
          biggest205018=ends[36];
        }
        if(biggest205018 == 1){
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
        if(biggest205018 == 2){
          ends[33]=2;
          ;//sysj\ECS.sysj line: 5, column: 5
          thread205019(tdone,ends);
          thread205020(tdone,ends);
          thread205021(tdone,ends);
          int biggest205022 = 0;
          if(ends[34]>=biggest205022){
            biggest205022=ends[34];
          }
          if(ends[35]>=biggest205022){
            biggest205022=ends[35];
          }
          if(ends[36]>=biggest205022){
            biggest205022=ends[36];
          }
          if(biggest205022 == 1){
            active[33]=1;
            ends[33]=1;
            tdone[33]=1;
          }
        }
        //FINXME code
        if(biggest205018 == 0){
          thread205023(tdone,ends);
          thread205024(tdone,ends);
          thread205025(tdone,ends);
          int biggest205026 = 0;
          if(ends[34]>=biggest205026){
            biggest205026=ends[34];
          }
          if(ends[35]>=biggest205026){
            biggest205026=ends[35];
          }
          if(ends[36]>=biggest205026){
            biggest205026=ends[36];
          }
          if(biggest205026 == 1){
            active[33]=1;
            ends[33]=1;
            tdone[33]=1;
          }
        }
        break;
      
    }
  }

  public void thread205012(int [] tdone, int [] ends){
        S204028=1;
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

  public void thread205011(int [] tdone, int [] ends){
        S204020=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread205010(int [] tdone, int [] ends){
        S204017=1;
    zoneOcc_thread_30 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_30 = (Integer)(zoneSixLightingI.getpreval() == null ? 0 : ((Integer)zoneSixLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S204008=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_30 > 0 && zoneLightInt_thread_30 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneSixWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneSixWindowONOFF);
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S204008=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
  }

  public void thread205008(int [] tdone, int [] ends){
        S204028=1;
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

  public void thread205007(int [] tdone, int [] ends){
        S204020=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread205006(int [] tdone, int [] ends){
        S204017=1;
    zoneOcc_thread_30 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_30 = (Integer)(zoneSixLightingI.getpreval() == null ? 0 : ((Integer)zoneSixLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S204008=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_30 > 0 && zoneLightInt_thread_30 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneSixWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneSixWindowONOFF);
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S204008=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
  }

  public void thread205004(int [] tdone, int [] ends){
        switch(S204028){
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

  public void thread205003(int [] tdone, int [] ends){
        switch(S204020){
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

  public void thread205002(int [] tdone, int [] ends){
        switch(S204017){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        switch(S204008){
          case 0 : 
            zoneSixWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
            currsigs.addElement(zoneSixWindowONOFF);
            active[30]=1;
            ends[30]=1;
            tdone[30]=1;
            break;
          
          case 1 : 
            S204008=1;
            S204017=0;
            active[30]=0;
            ends[30]=0;
            tdone[30]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread205001(int [] tdone, int [] ends){
        switch(S204097){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        test_29.setClear();//sysj\ECS.sysj line: 3, column: 5
        thread205002(tdone,ends);
        thread205003(tdone,ends);
        thread205004(tdone,ends);
        int biggest205005 = 0;
        if(ends[30]>=biggest205005){
          biggest205005=ends[30];
        }
        if(ends[31]>=biggest205005){
          biggest205005=ends[31];
        }
        if(ends[32]>=biggest205005){
          biggest205005=ends[32];
        }
        if(biggest205005 == 1){
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
        if(biggest205005 == 2){
          ends[29]=2;
          ;//sysj\ECS.sysj line: 5, column: 5
          thread205006(tdone,ends);
          thread205007(tdone,ends);
          thread205008(tdone,ends);
          int biggest205009 = 0;
          if(ends[30]>=biggest205009){
            biggest205009=ends[30];
          }
          if(ends[31]>=biggest205009){
            biggest205009=ends[31];
          }
          if(ends[32]>=biggest205009){
            biggest205009=ends[32];
          }
          if(biggest205009 == 1){
            active[29]=1;
            ends[29]=1;
            tdone[29]=1;
          }
        }
        //FINXME code
        if(biggest205005 == 0){
          thread205010(tdone,ends);
          thread205011(tdone,ends);
          thread205012(tdone,ends);
          int biggest205013 = 0;
          if(ends[30]>=biggest205013){
            biggest205013=ends[30];
          }
          if(ends[31]>=biggest205013){
            biggest205013=ends[31];
          }
          if(ends[32]>=biggest205013){
            biggest205013=ends[32];
          }
          if(biggest205013 == 1){
            active[29]=1;
            ends[29]=1;
            tdone[29]=1;
          }
        }
        break;
      
    }
  }

  public void thread204999(int [] tdone, int [] ends){
        S203936=1;
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

  public void thread204998(int [] tdone, int [] ends){
        S203928=1;
    active[27]=1;
    ends[27]=1;
    tdone[27]=1;
  }

  public void thread204997(int [] tdone, int [] ends){
        S203925=1;
    zoneOcc_thread_26 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_26 = (Integer)(zoneFiveLightingI.getpreval() == null ? 0 : ((Integer)zoneFiveLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S203916=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_26 > 0 && zoneLightInt_thread_26 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneFiveWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneFiveWindowONOFF);
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
    else {
      S203916=1;
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread204995(int [] tdone, int [] ends){
        S203936=1;
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

  public void thread204994(int [] tdone, int [] ends){
        S203928=1;
    active[27]=1;
    ends[27]=1;
    tdone[27]=1;
  }

  public void thread204993(int [] tdone, int [] ends){
        S203925=1;
    zoneOcc_thread_26 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_26 = (Integer)(zoneFiveLightingI.getpreval() == null ? 0 : ((Integer)zoneFiveLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S203916=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_26 > 0 && zoneLightInt_thread_26 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneFiveWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneFiveWindowONOFF);
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
    else {
      S203916=1;
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread204991(int [] tdone, int [] ends){
        switch(S203936){
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

  public void thread204990(int [] tdone, int [] ends){
        switch(S203928){
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

  public void thread204989(int [] tdone, int [] ends){
        switch(S203925){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        switch(S203916){
          case 0 : 
            zoneFiveWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
            currsigs.addElement(zoneFiveWindowONOFF);
            active[26]=1;
            ends[26]=1;
            tdone[26]=1;
            break;
          
          case 1 : 
            S203916=1;
            S203925=0;
            active[26]=0;
            ends[26]=0;
            tdone[26]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread204988(int [] tdone, int [] ends){
        switch(S204005){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        test_25.setClear();//sysj\ECS.sysj line: 3, column: 5
        thread204989(tdone,ends);
        thread204990(tdone,ends);
        thread204991(tdone,ends);
        int biggest204992 = 0;
        if(ends[26]>=biggest204992){
          biggest204992=ends[26];
        }
        if(ends[27]>=biggest204992){
          biggest204992=ends[27];
        }
        if(ends[28]>=biggest204992){
          biggest204992=ends[28];
        }
        if(biggest204992 == 1){
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
        if(biggest204992 == 2){
          ends[25]=2;
          ;//sysj\ECS.sysj line: 5, column: 5
          thread204993(tdone,ends);
          thread204994(tdone,ends);
          thread204995(tdone,ends);
          int biggest204996 = 0;
          if(ends[26]>=biggest204996){
            biggest204996=ends[26];
          }
          if(ends[27]>=biggest204996){
            biggest204996=ends[27];
          }
          if(ends[28]>=biggest204996){
            biggest204996=ends[28];
          }
          if(biggest204996 == 1){
            active[25]=1;
            ends[25]=1;
            tdone[25]=1;
          }
        }
        //FINXME code
        if(biggest204992 == 0){
          thread204997(tdone,ends);
          thread204998(tdone,ends);
          thread204999(tdone,ends);
          int biggest205000 = 0;
          if(ends[26]>=biggest205000){
            biggest205000=ends[26];
          }
          if(ends[27]>=biggest205000){
            biggest205000=ends[27];
          }
          if(ends[28]>=biggest205000){
            biggest205000=ends[28];
          }
          if(biggest205000 == 1){
            active[25]=1;
            ends[25]=1;
            tdone[25]=1;
          }
        }
        break;
      
    }
  }

  public void thread204986(int [] tdone, int [] ends){
        S203844=1;
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

  public void thread204985(int [] tdone, int [] ends){
        S203836=1;
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread204984(int [] tdone, int [] ends){
        S203833=1;
    zoneOcc_thread_22 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_22 = (Integer)(zoneFourLightingI.getpreval() == null ? 0 : ((Integer)zoneFourLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S203824=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_22 > 0 && zoneLightInt_thread_22 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneFourWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneFourWindowONOFF);
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S203824=1;
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread204982(int [] tdone, int [] ends){
        S203844=1;
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

  public void thread204981(int [] tdone, int [] ends){
        S203836=1;
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread204980(int [] tdone, int [] ends){
        S203833=1;
    zoneOcc_thread_22 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_22 = (Integer)(zoneFourLightingI.getpreval() == null ? 0 : ((Integer)zoneFourLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S203824=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_22 > 0 && zoneLightInt_thread_22 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneFourWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneFourWindowONOFF);
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S203824=1;
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread204978(int [] tdone, int [] ends){
        switch(S203844){
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

  public void thread204977(int [] tdone, int [] ends){
        switch(S203836){
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

  public void thread204976(int [] tdone, int [] ends){
        switch(S203833){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        switch(S203824){
          case 0 : 
            zoneFourWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
            currsigs.addElement(zoneFourWindowONOFF);
            active[22]=1;
            ends[22]=1;
            tdone[22]=1;
            break;
          
          case 1 : 
            S203824=1;
            S203833=0;
            active[22]=0;
            ends[22]=0;
            tdone[22]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread204975(int [] tdone, int [] ends){
        switch(S203913){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        test_21.setClear();//sysj\ECS.sysj line: 3, column: 5
        thread204976(tdone,ends);
        thread204977(tdone,ends);
        thread204978(tdone,ends);
        int biggest204979 = 0;
        if(ends[22]>=biggest204979){
          biggest204979=ends[22];
        }
        if(ends[23]>=biggest204979){
          biggest204979=ends[23];
        }
        if(ends[24]>=biggest204979){
          biggest204979=ends[24];
        }
        if(biggest204979 == 1){
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        if(biggest204979 == 2){
          ends[21]=2;
          ;//sysj\ECS.sysj line: 5, column: 5
          thread204980(tdone,ends);
          thread204981(tdone,ends);
          thread204982(tdone,ends);
          int biggest204983 = 0;
          if(ends[22]>=biggest204983){
            biggest204983=ends[22];
          }
          if(ends[23]>=biggest204983){
            biggest204983=ends[23];
          }
          if(ends[24]>=biggest204983){
            biggest204983=ends[24];
          }
          if(biggest204983 == 1){
            active[21]=1;
            ends[21]=1;
            tdone[21]=1;
          }
        }
        //FINXME code
        if(biggest204979 == 0){
          thread204984(tdone,ends);
          thread204985(tdone,ends);
          thread204986(tdone,ends);
          int biggest204987 = 0;
          if(ends[22]>=biggest204987){
            biggest204987=ends[22];
          }
          if(ends[23]>=biggest204987){
            biggest204987=ends[23];
          }
          if(ends[24]>=biggest204987){
            biggest204987=ends[24];
          }
          if(biggest204987 == 1){
            active[21]=1;
            ends[21]=1;
            tdone[21]=1;
          }
        }
        break;
      
    }
  }

  public void thread204973(int [] tdone, int [] ends){
        S203752=1;
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

  public void thread204972(int [] tdone, int [] ends){
        S203744=1;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread204971(int [] tdone, int [] ends){
        S203741=1;
    zoneOcc_thread_18 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_18 = (Integer)(zoneThreeLightingI.getpreval() == null ? 0 : ((Integer)zoneThreeLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S203732=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_18 > 0 && zoneLightInt_thread_18 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneThreeWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneThreeWindowONOFF);
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
    else {
      S203732=1;
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread204969(int [] tdone, int [] ends){
        S203752=1;
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

  public void thread204968(int [] tdone, int [] ends){
        S203744=1;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread204967(int [] tdone, int [] ends){
        S203741=1;
    zoneOcc_thread_18 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_18 = (Integer)(zoneThreeLightingI.getpreval() == null ? 0 : ((Integer)zoneThreeLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S203732=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_18 > 0 && zoneLightInt_thread_18 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneThreeWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneThreeWindowONOFF);
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
    else {
      S203732=1;
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread204965(int [] tdone, int [] ends){
        switch(S203752){
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

  public void thread204964(int [] tdone, int [] ends){
        switch(S203744){
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

  public void thread204963(int [] tdone, int [] ends){
        switch(S203741){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        switch(S203732){
          case 0 : 
            zoneThreeWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
            currsigs.addElement(zoneThreeWindowONOFF);
            active[18]=1;
            ends[18]=1;
            tdone[18]=1;
            break;
          
          case 1 : 
            S203732=1;
            S203741=0;
            active[18]=0;
            ends[18]=0;
            tdone[18]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread204962(int [] tdone, int [] ends){
        switch(S203821){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        test_17.setClear();//sysj\ECS.sysj line: 3, column: 5
        thread204963(tdone,ends);
        thread204964(tdone,ends);
        thread204965(tdone,ends);
        int biggest204966 = 0;
        if(ends[18]>=biggest204966){
          biggest204966=ends[18];
        }
        if(ends[19]>=biggest204966){
          biggest204966=ends[19];
        }
        if(ends[20]>=biggest204966){
          biggest204966=ends[20];
        }
        if(biggest204966 == 1){
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
        if(biggest204966 == 2){
          ends[17]=2;
          ;//sysj\ECS.sysj line: 5, column: 5
          thread204967(tdone,ends);
          thread204968(tdone,ends);
          thread204969(tdone,ends);
          int biggest204970 = 0;
          if(ends[18]>=biggest204970){
            biggest204970=ends[18];
          }
          if(ends[19]>=biggest204970){
            biggest204970=ends[19];
          }
          if(ends[20]>=biggest204970){
            biggest204970=ends[20];
          }
          if(biggest204970 == 1){
            active[17]=1;
            ends[17]=1;
            tdone[17]=1;
          }
        }
        //FINXME code
        if(biggest204966 == 0){
          thread204971(tdone,ends);
          thread204972(tdone,ends);
          thread204973(tdone,ends);
          int biggest204974 = 0;
          if(ends[18]>=biggest204974){
            biggest204974=ends[18];
          }
          if(ends[19]>=biggest204974){
            biggest204974=ends[19];
          }
          if(ends[20]>=biggest204974){
            biggest204974=ends[20];
          }
          if(biggest204974 == 1){
            active[17]=1;
            ends[17]=1;
            tdone[17]=1;
          }
        }
        break;
      
    }
  }

  public void thread204960(int [] tdone, int [] ends){
        S203660=1;
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

  public void thread204959(int [] tdone, int [] ends){
        S203652=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread204958(int [] tdone, int [] ends){
        S203649=1;
    zoneOcc_thread_14 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_14 = (Integer)(zoneTwoLightingI.getpreval() == null ? 0 : ((Integer)zoneTwoLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S203640=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_14 > 0 && zoneLightInt_thread_14 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneTwoWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneTwoWindowONOFF);
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      S203640=1;
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread204956(int [] tdone, int [] ends){
        S203660=1;
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

  public void thread204955(int [] tdone, int [] ends){
        S203652=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread204954(int [] tdone, int [] ends){
        S203649=1;
    zoneOcc_thread_14 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_14 = (Integer)(zoneTwoLightingI.getpreval() == null ? 0 : ((Integer)zoneTwoLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S203640=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_14 > 0 && zoneLightInt_thread_14 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneTwoWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneTwoWindowONOFF);
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      S203640=1;
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread204952(int [] tdone, int [] ends){
        switch(S203660){
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

  public void thread204951(int [] tdone, int [] ends){
        switch(S203652){
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

  public void thread204950(int [] tdone, int [] ends){
        switch(S203649){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        switch(S203640){
          case 0 : 
            zoneTwoWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
            currsigs.addElement(zoneTwoWindowONOFF);
            active[14]=1;
            ends[14]=1;
            tdone[14]=1;
            break;
          
          case 1 : 
            S203640=1;
            S203649=0;
            active[14]=0;
            ends[14]=0;
            tdone[14]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread204949(int [] tdone, int [] ends){
        switch(S203729){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        test_13.setClear();//sysj\ECS.sysj line: 3, column: 5
        thread204950(tdone,ends);
        thread204951(tdone,ends);
        thread204952(tdone,ends);
        int biggest204953 = 0;
        if(ends[14]>=biggest204953){
          biggest204953=ends[14];
        }
        if(ends[15]>=biggest204953){
          biggest204953=ends[15];
        }
        if(ends[16]>=biggest204953){
          biggest204953=ends[16];
        }
        if(biggest204953 == 1){
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        if(biggest204953 == 2){
          ends[13]=2;
          ;//sysj\ECS.sysj line: 5, column: 5
          thread204954(tdone,ends);
          thread204955(tdone,ends);
          thread204956(tdone,ends);
          int biggest204957 = 0;
          if(ends[14]>=biggest204957){
            biggest204957=ends[14];
          }
          if(ends[15]>=biggest204957){
            biggest204957=ends[15];
          }
          if(ends[16]>=biggest204957){
            biggest204957=ends[16];
          }
          if(biggest204957 == 1){
            active[13]=1;
            ends[13]=1;
            tdone[13]=1;
          }
        }
        //FINXME code
        if(biggest204953 == 0){
          thread204958(tdone,ends);
          thread204959(tdone,ends);
          thread204960(tdone,ends);
          int biggest204961 = 0;
          if(ends[14]>=biggest204961){
            biggest204961=ends[14];
          }
          if(ends[15]>=biggest204961){
            biggest204961=ends[15];
          }
          if(ends[16]>=biggest204961){
            biggest204961=ends[16];
          }
          if(biggest204961 == 1){
            active[13]=1;
            ends[13]=1;
            tdone[13]=1;
          }
        }
        break;
      
    }
  }

  public void thread204947(int [] tdone, int [] ends){
        S203568=1;
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

  public void thread204946(int [] tdone, int [] ends){
        S203560=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread204945(int [] tdone, int [] ends){
        S203557=1;
    zoneOcc_thread_10 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_10 = (Integer)(zoneOneLightingI.getpreval() == null ? 0 : ((Integer)zoneOneLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S203548=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_10 > 0 && zoneLightInt_thread_10 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneOneWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneOneWindowONOFF);
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      S203548=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread204943(int [] tdone, int [] ends){
        S203568=1;
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

  public void thread204942(int [] tdone, int [] ends){
        S203560=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread204941(int [] tdone, int [] ends){
        S203557=1;
    zoneOcc_thread_10 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_10 = (Integer)(zoneOneLightingI.getpreval() == null ? 0 : ((Integer)zoneOneLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S203548=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_10 > 0 && zoneLightInt_thread_10 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneOneWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneOneWindowONOFF);
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      S203548=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread204939(int [] tdone, int [] ends){
        switch(S203568){
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

  public void thread204938(int [] tdone, int [] ends){
        switch(S203560){
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

  public void thread204937(int [] tdone, int [] ends){
        switch(S203557){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S203548){
          case 0 : 
            zoneOneWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
            currsigs.addElement(zoneOneWindowONOFF);
            active[10]=1;
            ends[10]=1;
            tdone[10]=1;
            break;
          
          case 1 : 
            S203548=1;
            S203557=0;
            active[10]=0;
            ends[10]=0;
            tdone[10]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread204936(int [] tdone, int [] ends){
        switch(S203637){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        test_9.setClear();//sysj\ECS.sysj line: 3, column: 5
        thread204937(tdone,ends);
        thread204938(tdone,ends);
        thread204939(tdone,ends);
        int biggest204940 = 0;
        if(ends[10]>=biggest204940){
          biggest204940=ends[10];
        }
        if(ends[11]>=biggest204940){
          biggest204940=ends[11];
        }
        if(ends[12]>=biggest204940){
          biggest204940=ends[12];
        }
        if(biggest204940 == 1){
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        if(biggest204940 == 2){
          ends[9]=2;
          ;//sysj\ECS.sysj line: 5, column: 5
          thread204941(tdone,ends);
          thread204942(tdone,ends);
          thread204943(tdone,ends);
          int biggest204944 = 0;
          if(ends[10]>=biggest204944){
            biggest204944=ends[10];
          }
          if(ends[11]>=biggest204944){
            biggest204944=ends[11];
          }
          if(ends[12]>=biggest204944){
            biggest204944=ends[12];
          }
          if(biggest204944 == 1){
            active[9]=1;
            ends[9]=1;
            tdone[9]=1;
          }
        }
        //FINXME code
        if(biggest204940 == 0){
          thread204945(tdone,ends);
          thread204946(tdone,ends);
          thread204947(tdone,ends);
          int biggest204948 = 0;
          if(ends[10]>=biggest204948){
            biggest204948=ends[10];
          }
          if(ends[11]>=biggest204948){
            biggest204948=ends[11];
          }
          if(ends[12]>=biggest204948){
            biggest204948=ends[12];
          }
          if(biggest204948 == 1){
            active[9]=1;
            ends[9]=1;
            tdone[9]=1;
          }
        }
        break;
      
    }
  }

  public void thread204935(int [] tdone, int [] ends){
        switch(S204835){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        thread204936(tdone,ends);
        thread204949(tdone,ends);
        thread204962(tdone,ends);
        thread204975(tdone,ends);
        thread204988(tdone,ends);
        thread205001(tdone,ends);
        thread205014(tdone,ends);
        thread205027(tdone,ends);
        thread205040(tdone,ends);
        thread205053(tdone,ends);
        thread205066(tdone,ends);
        thread205079(tdone,ends);
        thread205092(tdone,ends);
        thread205105(tdone,ends);
        int biggest205118 = 0;
        if(ends[9]>=biggest205118){
          biggest205118=ends[9];
        }
        if(ends[13]>=biggest205118){
          biggest205118=ends[13];
        }
        if(ends[17]>=biggest205118){
          biggest205118=ends[17];
        }
        if(ends[21]>=biggest205118){
          biggest205118=ends[21];
        }
        if(ends[25]>=biggest205118){
          biggest205118=ends[25];
        }
        if(ends[29]>=biggest205118){
          biggest205118=ends[29];
        }
        if(ends[33]>=biggest205118){
          biggest205118=ends[33];
        }
        if(ends[37]>=biggest205118){
          biggest205118=ends[37];
        }
        if(ends[41]>=biggest205118){
          biggest205118=ends[41];
        }
        if(ends[45]>=biggest205118){
          biggest205118=ends[45];
        }
        if(ends[49]>=biggest205118){
          biggest205118=ends[49];
        }
        if(ends[53]>=biggest205118){
          biggest205118=ends[53];
        }
        if(ends[57]>=biggest205118){
          biggest205118=ends[57];
        }
        if(ends[61]>=biggest205118){
          biggest205118=ends[61];
        }
        if(biggest205118 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        //FINXME code
        if(biggest205118 == 0){
          S204835=0;
          active[8]=0;
          ends[8]=0;
          tdone[8]=1;
        }
        break;
      
    }
  }

  public void thread204934(int [] tdone, int [] ends){
        switch(S203545){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S203495){
          case 0 : 
            if(currentTime_2.getprestatus()){//sysj\ECS.sysj line: 351, column: 14
              currentHour_thread_7 = (Integer)(currentTime_2.getpreval() == null ? 0 : ((Integer)currentTime_2.getpreval()).intValue());//sysj\ECS.sysj line: 352, column: 8
              S203495=1;
              if(currentHour_thread_7 >= 9 && currentHour_thread_7 <= 17){//sysj\ECS.sysj line: 354, column: 16
                S203499=0;
                workhrs_6.setPresent();//sysj\ECS.sysj line: 355, column: 16
                currsigs.addElement(workhrs_6);
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
              else {
                S203499=1;
                if((currentHour_thread_7 >= 18 && currentHour_thread_7 <= 24) || (currentHour_thread_7 >= 0 && currentHour_thread_7 < 9)){//sysj\ECS.sysj line: 359, column: 23
                  afterhrs_6.setPresent();//sysj\ECS.sysj line: 360, column: 16
                  currsigs.addElement(afterhrs_6);
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  S203495=0;
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
            switch(S203499){
              case 0 : 
                S203495=0;
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
                break;
              
              case 1 : 
                S203495=0;
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

  public void thread204930(int [] tdone, int [] ends){
        S204764=1;
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

  public void thread204929(int [] tdone, int [] ends){
        S204756=1;
    active[63]=1;
    ends[63]=1;
    tdone[63]=1;
  }

  public void thread204928(int [] tdone, int [] ends){
        S204753=1;
    zoneOcc_thread_62 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_62 = (Integer)(zoneSevenLightingI.getpreval() == null ? 0 : ((Integer)zoneSevenLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204744=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_62 > 0 && zoneLightInt_thread_62 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneSevenLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneSevenLightONOFF);
      active[62]=1;
      ends[62]=1;
      tdone[62]=1;
    }
    else {
      S204744=1;
      active[62]=1;
      ends[62]=1;
      tdone[62]=1;
    }
  }

  public void thread204927(int [] tdone, int [] ends){
        S204833=1;
    test_61.setClear();//sysj\ECS.sysj line: 37, column: 5
    thread204928(tdone,ends);
    thread204929(tdone,ends);
    thread204930(tdone,ends);
    int biggest204931 = 0;
    if(ends[62]>=biggest204931){
      biggest204931=ends[62];
    }
    if(ends[63]>=biggest204931){
      biggest204931=ends[63];
    }
    if(ends[64]>=biggest204931){
      biggest204931=ends[64];
    }
    if(biggest204931 == 1){
      active[61]=1;
      ends[61]=1;
      tdone[61]=1;
    }
  }

  public void thread204925(int [] tdone, int [] ends){
        S204672=1;
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

  public void thread204924(int [] tdone, int [] ends){
        S204664=1;
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread204923(int [] tdone, int [] ends){
        S204661=1;
    zoneOcc_thread_58 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_58 = (Integer)(zoneSixLightingI.getpreval() == null ? 0 : ((Integer)zoneSixLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204652=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_58 > 0 && zoneLightInt_thread_58 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneSixLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneSixLightONOFF);
      active[58]=1;
      ends[58]=1;
      tdone[58]=1;
    }
    else {
      S204652=1;
      active[58]=1;
      ends[58]=1;
      tdone[58]=1;
    }
  }

  public void thread204922(int [] tdone, int [] ends){
        S204741=1;
    test_57.setClear();//sysj\ECS.sysj line: 37, column: 5
    thread204923(tdone,ends);
    thread204924(tdone,ends);
    thread204925(tdone,ends);
    int biggest204926 = 0;
    if(ends[58]>=biggest204926){
      biggest204926=ends[58];
    }
    if(ends[59]>=biggest204926){
      biggest204926=ends[59];
    }
    if(ends[60]>=biggest204926){
      biggest204926=ends[60];
    }
    if(biggest204926 == 1){
      active[57]=1;
      ends[57]=1;
      tdone[57]=1;
    }
  }

  public void thread204920(int [] tdone, int [] ends){
        S204580=1;
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

  public void thread204919(int [] tdone, int [] ends){
        S204572=1;
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread204918(int [] tdone, int [] ends){
        S204569=1;
    zoneOcc_thread_54 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_54 = (Integer)(zoneFiveLightingI.getpreval() == null ? 0 : ((Integer)zoneFiveLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204560=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_54 > 0 && zoneLightInt_thread_54 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneFiveLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneFiveLightONOFF);
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
    else {
      S204560=1;
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
  }

  public void thread204917(int [] tdone, int [] ends){
        S204649=1;
    test_53.setClear();//sysj\ECS.sysj line: 37, column: 5
    thread204918(tdone,ends);
    thread204919(tdone,ends);
    thread204920(tdone,ends);
    int biggest204921 = 0;
    if(ends[54]>=biggest204921){
      biggest204921=ends[54];
    }
    if(ends[55]>=biggest204921){
      biggest204921=ends[55];
    }
    if(ends[56]>=biggest204921){
      biggest204921=ends[56];
    }
    if(biggest204921 == 1){
      active[53]=1;
      ends[53]=1;
      tdone[53]=1;
    }
  }

  public void thread204915(int [] tdone, int [] ends){
        S204488=1;
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

  public void thread204914(int [] tdone, int [] ends){
        S204480=1;
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread204913(int [] tdone, int [] ends){
        S204477=1;
    zoneOcc_thread_50 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_50 = (Integer)(zoneFourLightingI.getpreval() == null ? 0 : ((Integer)zoneFourLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204468=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_50 > 0 && zoneLightInt_thread_50 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneFourLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneFourLightONOFF);
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
    else {
      S204468=1;
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
  }

  public void thread204912(int [] tdone, int [] ends){
        S204557=1;
    test_49.setClear();//sysj\ECS.sysj line: 37, column: 5
    thread204913(tdone,ends);
    thread204914(tdone,ends);
    thread204915(tdone,ends);
    int biggest204916 = 0;
    if(ends[50]>=biggest204916){
      biggest204916=ends[50];
    }
    if(ends[51]>=biggest204916){
      biggest204916=ends[51];
    }
    if(ends[52]>=biggest204916){
      biggest204916=ends[52];
    }
    if(biggest204916 == 1){
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
  }

  public void thread204910(int [] tdone, int [] ends){
        S204396=1;
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

  public void thread204909(int [] tdone, int [] ends){
        S204388=1;
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread204908(int [] tdone, int [] ends){
        S204385=1;
    zoneOcc_thread_46 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_46 = (Integer)(zoneThreeLightingI.getpreval() == null ? 0 : ((Integer)zoneThreeLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204376=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_46 > 0 && zoneLightInt_thread_46 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneThreeLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneThreeLightONOFF);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S204376=1;
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
  }

  public void thread204907(int [] tdone, int [] ends){
        S204465=1;
    test_45.setClear();//sysj\ECS.sysj line: 37, column: 5
    thread204908(tdone,ends);
    thread204909(tdone,ends);
    thread204910(tdone,ends);
    int biggest204911 = 0;
    if(ends[46]>=biggest204911){
      biggest204911=ends[46];
    }
    if(ends[47]>=biggest204911){
      biggest204911=ends[47];
    }
    if(ends[48]>=biggest204911){
      biggest204911=ends[48];
    }
    if(biggest204911 == 1){
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
  }

  public void thread204905(int [] tdone, int [] ends){
        S204304=1;
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

  public void thread204904(int [] tdone, int [] ends){
        S204296=1;
    active[43]=1;
    ends[43]=1;
    tdone[43]=1;
  }

  public void thread204903(int [] tdone, int [] ends){
        S204293=1;
    zoneOcc_thread_42 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_42 = (Integer)(zoneTwoLightingI.getpreval() == null ? 0 : ((Integer)zoneTwoLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204284=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_42 > 0 && zoneLightInt_thread_42 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneTwoLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneTwoLightONOFF);
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S204284=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread204902(int [] tdone, int [] ends){
        S204373=1;
    test_41.setClear();//sysj\ECS.sysj line: 37, column: 5
    thread204903(tdone,ends);
    thread204904(tdone,ends);
    thread204905(tdone,ends);
    int biggest204906 = 0;
    if(ends[42]>=biggest204906){
      biggest204906=ends[42];
    }
    if(ends[43]>=biggest204906){
      biggest204906=ends[43];
    }
    if(ends[44]>=biggest204906){
      biggest204906=ends[44];
    }
    if(biggest204906 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread204900(int [] tdone, int [] ends){
        S204212=1;
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

  public void thread204899(int [] tdone, int [] ends){
        S204204=1;
    active[39]=1;
    ends[39]=1;
    tdone[39]=1;
  }

  public void thread204898(int [] tdone, int [] ends){
        S204201=1;
    zoneOcc_thread_38 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_38 = (Integer)(zoneOneLightingI.getpreval() == null ? 0 : ((Integer)zoneOneLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204192=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_38 > 0 && zoneLightInt_thread_38 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneOneLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneOneLightONOFF);
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      S204192=1;
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread204897(int [] tdone, int [] ends){
        S204281=1;
    test_37.setClear();//sysj\ECS.sysj line: 37, column: 5
    thread204898(tdone,ends);
    thread204899(tdone,ends);
    thread204900(tdone,ends);
    int biggest204901 = 0;
    if(ends[38]>=biggest204901){
      biggest204901=ends[38];
    }
    if(ends[39]>=biggest204901){
      biggest204901=ends[39];
    }
    if(ends[40]>=biggest204901){
      biggest204901=ends[40];
    }
    if(biggest204901 == 1){
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
  }

  public void thread204895(int [] tdone, int [] ends){
        S204120=1;
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

  public void thread204894(int [] tdone, int [] ends){
        S204112=1;
    active[35]=1;
    ends[35]=1;
    tdone[35]=1;
  }

  public void thread204893(int [] tdone, int [] ends){
        S204109=1;
    zoneOcc_thread_34 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_34 = (Integer)(zoneSevenLightingI.getpreval() == null ? 0 : ((Integer)zoneSevenLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S204100=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_34 > 0 && zoneLightInt_thread_34 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneSevenWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneSevenWindowONOFF);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S204100=1;
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread204892(int [] tdone, int [] ends){
        S204189=1;
    test_33.setClear();//sysj\ECS.sysj line: 3, column: 5
    thread204893(tdone,ends);
    thread204894(tdone,ends);
    thread204895(tdone,ends);
    int biggest204896 = 0;
    if(ends[34]>=biggest204896){
      biggest204896=ends[34];
    }
    if(ends[35]>=biggest204896){
      biggest204896=ends[35];
    }
    if(ends[36]>=biggest204896){
      biggest204896=ends[36];
    }
    if(biggest204896 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
  }

  public void thread204890(int [] tdone, int [] ends){
        S204028=1;
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

  public void thread204889(int [] tdone, int [] ends){
        S204020=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread204888(int [] tdone, int [] ends){
        S204017=1;
    zoneOcc_thread_30 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_30 = (Integer)(zoneSixLightingI.getpreval() == null ? 0 : ((Integer)zoneSixLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S204008=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_30 > 0 && zoneLightInt_thread_30 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneSixWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneSixWindowONOFF);
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S204008=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
  }

  public void thread204887(int [] tdone, int [] ends){
        S204097=1;
    test_29.setClear();//sysj\ECS.sysj line: 3, column: 5
    thread204888(tdone,ends);
    thread204889(tdone,ends);
    thread204890(tdone,ends);
    int biggest204891 = 0;
    if(ends[30]>=biggest204891){
      biggest204891=ends[30];
    }
    if(ends[31]>=biggest204891){
      biggest204891=ends[31];
    }
    if(ends[32]>=biggest204891){
      biggest204891=ends[32];
    }
    if(biggest204891 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread204885(int [] tdone, int [] ends){
        S203936=1;
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

  public void thread204884(int [] tdone, int [] ends){
        S203928=1;
    active[27]=1;
    ends[27]=1;
    tdone[27]=1;
  }

  public void thread204883(int [] tdone, int [] ends){
        S203925=1;
    zoneOcc_thread_26 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_26 = (Integer)(zoneFiveLightingI.getpreval() == null ? 0 : ((Integer)zoneFiveLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S203916=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_26 > 0 && zoneLightInt_thread_26 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneFiveWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneFiveWindowONOFF);
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
    else {
      S203916=1;
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread204882(int [] tdone, int [] ends){
        S204005=1;
    test_25.setClear();//sysj\ECS.sysj line: 3, column: 5
    thread204883(tdone,ends);
    thread204884(tdone,ends);
    thread204885(tdone,ends);
    int biggest204886 = 0;
    if(ends[26]>=biggest204886){
      biggest204886=ends[26];
    }
    if(ends[27]>=biggest204886){
      biggest204886=ends[27];
    }
    if(ends[28]>=biggest204886){
      biggest204886=ends[28];
    }
    if(biggest204886 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread204880(int [] tdone, int [] ends){
        S203844=1;
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

  public void thread204879(int [] tdone, int [] ends){
        S203836=1;
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread204878(int [] tdone, int [] ends){
        S203833=1;
    zoneOcc_thread_22 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_22 = (Integer)(zoneFourLightingI.getpreval() == null ? 0 : ((Integer)zoneFourLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S203824=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_22 > 0 && zoneLightInt_thread_22 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneFourWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneFourWindowONOFF);
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S203824=1;
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread204877(int [] tdone, int [] ends){
        S203913=1;
    test_21.setClear();//sysj\ECS.sysj line: 3, column: 5
    thread204878(tdone,ends);
    thread204879(tdone,ends);
    thread204880(tdone,ends);
    int biggest204881 = 0;
    if(ends[22]>=biggest204881){
      biggest204881=ends[22];
    }
    if(ends[23]>=biggest204881){
      biggest204881=ends[23];
    }
    if(ends[24]>=biggest204881){
      biggest204881=ends[24];
    }
    if(biggest204881 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread204875(int [] tdone, int [] ends){
        S203752=1;
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

  public void thread204874(int [] tdone, int [] ends){
        S203744=1;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread204873(int [] tdone, int [] ends){
        S203741=1;
    zoneOcc_thread_18 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_18 = (Integer)(zoneThreeLightingI.getpreval() == null ? 0 : ((Integer)zoneThreeLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S203732=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_18 > 0 && zoneLightInt_thread_18 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneThreeWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneThreeWindowONOFF);
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
    else {
      S203732=1;
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread204872(int [] tdone, int [] ends){
        S203821=1;
    test_17.setClear();//sysj\ECS.sysj line: 3, column: 5
    thread204873(tdone,ends);
    thread204874(tdone,ends);
    thread204875(tdone,ends);
    int biggest204876 = 0;
    if(ends[18]>=biggest204876){
      biggest204876=ends[18];
    }
    if(ends[19]>=biggest204876){
      biggest204876=ends[19];
    }
    if(ends[20]>=biggest204876){
      biggest204876=ends[20];
    }
    if(biggest204876 == 1){
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
  }

  public void thread204870(int [] tdone, int [] ends){
        S203660=1;
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

  public void thread204869(int [] tdone, int [] ends){
        S203652=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread204868(int [] tdone, int [] ends){
        S203649=1;
    zoneOcc_thread_14 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_14 = (Integer)(zoneTwoLightingI.getpreval() == null ? 0 : ((Integer)zoneTwoLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S203640=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_14 > 0 && zoneLightInt_thread_14 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneTwoWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneTwoWindowONOFF);
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      S203640=1;
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread204867(int [] tdone, int [] ends){
        S203729=1;
    test_13.setClear();//sysj\ECS.sysj line: 3, column: 5
    thread204868(tdone,ends);
    thread204869(tdone,ends);
    thread204870(tdone,ends);
    int biggest204871 = 0;
    if(ends[14]>=biggest204871){
      biggest204871=ends[14];
    }
    if(ends[15]>=biggest204871){
      biggest204871=ends[15];
    }
    if(ends[16]>=biggest204871){
      biggest204871=ends[16];
    }
    if(biggest204871 == 1){
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread204865(int [] tdone, int [] ends){
        S203568=1;
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

  public void thread204864(int [] tdone, int [] ends){
        S203560=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread204863(int [] tdone, int [] ends){
        S203557=1;
    zoneOcc_thread_10 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_10 = (Integer)(zoneOneLightingI.getpreval() == null ? 0 : ((Integer)zoneOneLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S203548=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_10 > 0 && zoneLightInt_thread_10 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneOneWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneOneWindowONOFF);
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      S203548=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread204862(int [] tdone, int [] ends){
        S203637=1;
    test_9.setClear();//sysj\ECS.sysj line: 3, column: 5
    thread204863(tdone,ends);
    thread204864(tdone,ends);
    thread204865(tdone,ends);
    int biggest204866 = 0;
    if(ends[10]>=biggest204866){
      biggest204866=ends[10];
    }
    if(ends[11]>=biggest204866){
      biggest204866=ends[11];
    }
    if(ends[12]>=biggest204866){
      biggest204866=ends[12];
    }
    if(biggest204866 == 1){
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread204861(int [] tdone, int [] ends){
        S204835=1;
    thread204862(tdone,ends);
    thread204867(tdone,ends);
    thread204872(tdone,ends);
    thread204877(tdone,ends);
    thread204882(tdone,ends);
    thread204887(tdone,ends);
    thread204892(tdone,ends);
    thread204897(tdone,ends);
    thread204902(tdone,ends);
    thread204907(tdone,ends);
    thread204912(tdone,ends);
    thread204917(tdone,ends);
    thread204922(tdone,ends);
    thread204927(tdone,ends);
    int biggest204932 = 0;
    if(ends[9]>=biggest204932){
      biggest204932=ends[9];
    }
    if(ends[13]>=biggest204932){
      biggest204932=ends[13];
    }
    if(ends[17]>=biggest204932){
      biggest204932=ends[17];
    }
    if(ends[21]>=biggest204932){
      biggest204932=ends[21];
    }
    if(ends[25]>=biggest204932){
      biggest204932=ends[25];
    }
    if(ends[29]>=biggest204932){
      biggest204932=ends[29];
    }
    if(ends[33]>=biggest204932){
      biggest204932=ends[33];
    }
    if(ends[37]>=biggest204932){
      biggest204932=ends[37];
    }
    if(ends[41]>=biggest204932){
      biggest204932=ends[41];
    }
    if(ends[45]>=biggest204932){
      biggest204932=ends[45];
    }
    if(ends[49]>=biggest204932){
      biggest204932=ends[49];
    }
    if(ends[53]>=biggest204932){
      biggest204932=ends[53];
    }
    if(ends[57]>=biggest204932){
      biggest204932=ends[57];
    }
    if(ends[61]>=biggest204932){
      biggest204932=ends[61];
    }
    if(biggest204932 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest204932 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest204932 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest204932 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest204932 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest204932 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest204932 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest204932 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest204932 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest204932 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest204932 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest204932 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest204932 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest204932 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread204860(int [] tdone, int [] ends){
        S203545=1;
    S203495=0;
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
      switch(S204837){
        case 0 : 
          S204837=0;
          break RUN;
        
        case 1 : 
          S204837=2;
          S204837=2;
          workhrs_6.setClear();//sysj\ECS.sysj line: 347, column: 4
          afterhrs_6.setClear();//sysj\ECS.sysj line: 347, column: 4
          thread204860(tdone,ends);
          thread204861(tdone,ends);
          int biggest204933 = 0;
          if(ends[7]>=biggest204933){
            biggest204933=ends[7];
          }
          if(ends[8]>=biggest204933){
            biggest204933=ends[8];
          }
          if(biggest204933 == 1){
            active[6]=1;
            ends[6]=1;
            break RUN;
          }
        
        case 2 : 
          workhrs_6.setClear();//sysj\ECS.sysj line: 347, column: 4
          afterhrs_6.setClear();//sysj\ECS.sysj line: 347, column: 4
          thread204934(tdone,ends);
          thread204935(tdone,ends);
          int biggest205119 = 0;
          if(ends[7]>=biggest205119){
            biggest205119=ends[7];
          }
          if(ends[8]>=biggest205119){
            biggest205119=ends[8];
          }
          if(biggest205119 == 1){
            active[6]=1;
            ends[6]=1;
            break RUN;
          }
          //FINXME code
          if(biggest205119 == 0){
            S204837=0;
            active[6]=0;
            ends[6]=0;
            S204837=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
