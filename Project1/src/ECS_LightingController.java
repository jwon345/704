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
  private int S214520 = 1;
  private int S213228 = 1;
  private int S213178 = 1;
  private int S213182 = 1;
  private int S214518 = 1;
  private int S213320 = 1;
  private int S213240 = 1;
  private int S213231 = 1;
  private int S213243 = 1;
  private int S213251 = 1;
  private int S213412 = 1;
  private int S213332 = 1;
  private int S213323 = 1;
  private int S213335 = 1;
  private int S213343 = 1;
  private int S213504 = 1;
  private int S213424 = 1;
  private int S213415 = 1;
  private int S213427 = 1;
  private int S213435 = 1;
  private int S213596 = 1;
  private int S213516 = 1;
  private int S213507 = 1;
  private int S213519 = 1;
  private int S213527 = 1;
  private int S213688 = 1;
  private int S213608 = 1;
  private int S213599 = 1;
  private int S213611 = 1;
  private int S213619 = 1;
  private int S213780 = 1;
  private int S213700 = 1;
  private int S213691 = 1;
  private int S213703 = 1;
  private int S213711 = 1;
  private int S213872 = 1;
  private int S213792 = 1;
  private int S213783 = 1;
  private int S213795 = 1;
  private int S213803 = 1;
  private int S213964 = 1;
  private int S213884 = 1;
  private int S213875 = 1;
  private int S213887 = 1;
  private int S213895 = 1;
  private int S214056 = 1;
  private int S213976 = 1;
  private int S213967 = 1;
  private int S213979 = 1;
  private int S213987 = 1;
  private int S214148 = 1;
  private int S214068 = 1;
  private int S214059 = 1;
  private int S214071 = 1;
  private int S214079 = 1;
  private int S214240 = 1;
  private int S214160 = 1;
  private int S214151 = 1;
  private int S214163 = 1;
  private int S214171 = 1;
  private int S214332 = 1;
  private int S214252 = 1;
  private int S214243 = 1;
  private int S214255 = 1;
  private int S214263 = 1;
  private int S214424 = 1;
  private int S214344 = 1;
  private int S214335 = 1;
  private int S214347 = 1;
  private int S214355 = 1;
  private int S214516 = 1;
  private int S214436 = 1;
  private int S214427 = 1;
  private int S214439 = 1;
  private int S214447 = 1;
  
  private int[] ends = new int[68];
  private int[] tdone = new int[68];
  
  public void thread215279(int [] tdone, int [] ends){
        S214447=1;
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

  public void thread215278(int [] tdone, int [] ends){
        S214439=1;
    active[63]=1;
    ends[63]=1;
    tdone[63]=1;
  }

  public void thread215277(int [] tdone, int [] ends){
        S214436=1;
    zoneOcc_thread_62 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_62 = (Integer)(zoneSevenLightingI.getpreval() == null ? 0 : ((Integer)zoneSevenLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S214427=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_62 > 0 && zoneLightInt_thread_62 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneSevenLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneSevenLightONOFF);
      active[62]=1;
      ends[62]=1;
      tdone[62]=1;
    }
    else {
      S214427=1;
      active[62]=1;
      ends[62]=1;
      tdone[62]=1;
    }
  }

  public void thread215275(int [] tdone, int [] ends){
        S214447=1;
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

  public void thread215274(int [] tdone, int [] ends){
        S214439=1;
    active[63]=1;
    ends[63]=1;
    tdone[63]=1;
  }

  public void thread215273(int [] tdone, int [] ends){
        S214436=1;
    zoneOcc_thread_62 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_62 = (Integer)(zoneSevenLightingI.getpreval() == null ? 0 : ((Integer)zoneSevenLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S214427=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_62 > 0 && zoneLightInt_thread_62 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneSevenLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneSevenLightONOFF);
      active[62]=1;
      ends[62]=1;
      tdone[62]=1;
    }
    else {
      S214427=1;
      active[62]=1;
      ends[62]=1;
      tdone[62]=1;
    }
  }

  public void thread215271(int [] tdone, int [] ends){
        switch(S214447){
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

  public void thread215270(int [] tdone, int [] ends){
        switch(S214439){
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

  public void thread215269(int [] tdone, int [] ends){
        switch(S214436){
      case 0 : 
        active[62]=0;
        ends[62]=0;
        tdone[62]=1;
        break;
      
      case 1 : 
        switch(S214427){
          case 0 : 
            zoneSevenLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
            currsigs.addElement(zoneSevenLightONOFF);
            active[62]=1;
            ends[62]=1;
            tdone[62]=1;
            break;
          
          case 1 : 
            S214427=1;
            S214436=0;
            active[62]=0;
            ends[62]=0;
            tdone[62]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread215268(int [] tdone, int [] ends){
        switch(S214516){
      case 0 : 
        active[61]=0;
        ends[61]=0;
        tdone[61]=1;
        break;
      
      case 1 : 
        test_61.setClear();//sysj\ECS.sysj line: 37, column: 5
        thread215269(tdone,ends);
        thread215270(tdone,ends);
        thread215271(tdone,ends);
        int biggest215272 = 0;
        if(ends[62]>=biggest215272){
          biggest215272=ends[62];
        }
        if(ends[63]>=biggest215272){
          biggest215272=ends[63];
        }
        if(ends[64]>=biggest215272){
          biggest215272=ends[64];
        }
        if(biggest215272 == 1){
          active[61]=1;
          ends[61]=1;
          tdone[61]=1;
        }
        if(biggest215272 == 2){
          ends[61]=2;
          ;//sysj\ECS.sysj line: 39, column: 5
          thread215273(tdone,ends);
          thread215274(tdone,ends);
          thread215275(tdone,ends);
          int biggest215276 = 0;
          if(ends[62]>=biggest215276){
            biggest215276=ends[62];
          }
          if(ends[63]>=biggest215276){
            biggest215276=ends[63];
          }
          if(ends[64]>=biggest215276){
            biggest215276=ends[64];
          }
          if(biggest215276 == 1){
            active[61]=1;
            ends[61]=1;
            tdone[61]=1;
          }
        }
        //FINXME code
        if(biggest215272 == 0){
          thread215277(tdone,ends);
          thread215278(tdone,ends);
          thread215279(tdone,ends);
          int biggest215280 = 0;
          if(ends[62]>=biggest215280){
            biggest215280=ends[62];
          }
          if(ends[63]>=biggest215280){
            biggest215280=ends[63];
          }
          if(ends[64]>=biggest215280){
            biggest215280=ends[64];
          }
          if(biggest215280 == 1){
            active[61]=1;
            ends[61]=1;
            tdone[61]=1;
          }
        }
        break;
      
    }
  }

  public void thread215266(int [] tdone, int [] ends){
        S214355=1;
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

  public void thread215265(int [] tdone, int [] ends){
        S214347=1;
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread215264(int [] tdone, int [] ends){
        S214344=1;
    zoneOcc_thread_58 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_58 = (Integer)(zoneSixLightingI.getpreval() == null ? 0 : ((Integer)zoneSixLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S214335=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_58 > 0 && zoneLightInt_thread_58 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneSixLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneSixLightONOFF);
      active[58]=1;
      ends[58]=1;
      tdone[58]=1;
    }
    else {
      S214335=1;
      active[58]=1;
      ends[58]=1;
      tdone[58]=1;
    }
  }

  public void thread215262(int [] tdone, int [] ends){
        S214355=1;
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

  public void thread215261(int [] tdone, int [] ends){
        S214347=1;
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread215260(int [] tdone, int [] ends){
        S214344=1;
    zoneOcc_thread_58 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_58 = (Integer)(zoneSixLightingI.getpreval() == null ? 0 : ((Integer)zoneSixLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S214335=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_58 > 0 && zoneLightInt_thread_58 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneSixLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneSixLightONOFF);
      active[58]=1;
      ends[58]=1;
      tdone[58]=1;
    }
    else {
      S214335=1;
      active[58]=1;
      ends[58]=1;
      tdone[58]=1;
    }
  }

  public void thread215258(int [] tdone, int [] ends){
        switch(S214355){
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

  public void thread215257(int [] tdone, int [] ends){
        switch(S214347){
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

  public void thread215256(int [] tdone, int [] ends){
        switch(S214344){
      case 0 : 
        active[58]=0;
        ends[58]=0;
        tdone[58]=1;
        break;
      
      case 1 : 
        switch(S214335){
          case 0 : 
            zoneSixLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
            currsigs.addElement(zoneSixLightONOFF);
            active[58]=1;
            ends[58]=1;
            tdone[58]=1;
            break;
          
          case 1 : 
            S214335=1;
            S214344=0;
            active[58]=0;
            ends[58]=0;
            tdone[58]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread215255(int [] tdone, int [] ends){
        switch(S214424){
      case 0 : 
        active[57]=0;
        ends[57]=0;
        tdone[57]=1;
        break;
      
      case 1 : 
        test_57.setClear();//sysj\ECS.sysj line: 37, column: 5
        thread215256(tdone,ends);
        thread215257(tdone,ends);
        thread215258(tdone,ends);
        int biggest215259 = 0;
        if(ends[58]>=biggest215259){
          biggest215259=ends[58];
        }
        if(ends[59]>=biggest215259){
          biggest215259=ends[59];
        }
        if(ends[60]>=biggest215259){
          biggest215259=ends[60];
        }
        if(biggest215259 == 1){
          active[57]=1;
          ends[57]=1;
          tdone[57]=1;
        }
        if(biggest215259 == 2){
          ends[57]=2;
          ;//sysj\ECS.sysj line: 39, column: 5
          thread215260(tdone,ends);
          thread215261(tdone,ends);
          thread215262(tdone,ends);
          int biggest215263 = 0;
          if(ends[58]>=biggest215263){
            biggest215263=ends[58];
          }
          if(ends[59]>=biggest215263){
            biggest215263=ends[59];
          }
          if(ends[60]>=biggest215263){
            biggest215263=ends[60];
          }
          if(biggest215263 == 1){
            active[57]=1;
            ends[57]=1;
            tdone[57]=1;
          }
        }
        //FINXME code
        if(biggest215259 == 0){
          thread215264(tdone,ends);
          thread215265(tdone,ends);
          thread215266(tdone,ends);
          int biggest215267 = 0;
          if(ends[58]>=biggest215267){
            biggest215267=ends[58];
          }
          if(ends[59]>=biggest215267){
            biggest215267=ends[59];
          }
          if(ends[60]>=biggest215267){
            biggest215267=ends[60];
          }
          if(biggest215267 == 1){
            active[57]=1;
            ends[57]=1;
            tdone[57]=1;
          }
        }
        break;
      
    }
  }

  public void thread215253(int [] tdone, int [] ends){
        S214263=1;
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

  public void thread215252(int [] tdone, int [] ends){
        S214255=1;
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread215251(int [] tdone, int [] ends){
        S214252=1;
    zoneOcc_thread_54 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_54 = (Integer)(zoneFiveLightingI.getpreval() == null ? 0 : ((Integer)zoneFiveLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S214243=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_54 > 0 && zoneLightInt_thread_54 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneFiveLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneFiveLightONOFF);
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
    else {
      S214243=1;
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
  }

  public void thread215249(int [] tdone, int [] ends){
        S214263=1;
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

  public void thread215248(int [] tdone, int [] ends){
        S214255=1;
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread215247(int [] tdone, int [] ends){
        S214252=1;
    zoneOcc_thread_54 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_54 = (Integer)(zoneFiveLightingI.getpreval() == null ? 0 : ((Integer)zoneFiveLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S214243=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_54 > 0 && zoneLightInt_thread_54 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneFiveLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneFiveLightONOFF);
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
    else {
      S214243=1;
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
  }

  public void thread215245(int [] tdone, int [] ends){
        switch(S214263){
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

  public void thread215244(int [] tdone, int [] ends){
        switch(S214255){
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

  public void thread215243(int [] tdone, int [] ends){
        switch(S214252){
      case 0 : 
        active[54]=0;
        ends[54]=0;
        tdone[54]=1;
        break;
      
      case 1 : 
        switch(S214243){
          case 0 : 
            zoneFiveLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
            currsigs.addElement(zoneFiveLightONOFF);
            active[54]=1;
            ends[54]=1;
            tdone[54]=1;
            break;
          
          case 1 : 
            S214243=1;
            S214252=0;
            active[54]=0;
            ends[54]=0;
            tdone[54]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread215242(int [] tdone, int [] ends){
        switch(S214332){
      case 0 : 
        active[53]=0;
        ends[53]=0;
        tdone[53]=1;
        break;
      
      case 1 : 
        test_53.setClear();//sysj\ECS.sysj line: 37, column: 5
        thread215243(tdone,ends);
        thread215244(tdone,ends);
        thread215245(tdone,ends);
        int biggest215246 = 0;
        if(ends[54]>=biggest215246){
          biggest215246=ends[54];
        }
        if(ends[55]>=biggest215246){
          biggest215246=ends[55];
        }
        if(ends[56]>=biggest215246){
          biggest215246=ends[56];
        }
        if(biggest215246 == 1){
          active[53]=1;
          ends[53]=1;
          tdone[53]=1;
        }
        if(biggest215246 == 2){
          ends[53]=2;
          ;//sysj\ECS.sysj line: 39, column: 5
          thread215247(tdone,ends);
          thread215248(tdone,ends);
          thread215249(tdone,ends);
          int biggest215250 = 0;
          if(ends[54]>=biggest215250){
            biggest215250=ends[54];
          }
          if(ends[55]>=biggest215250){
            biggest215250=ends[55];
          }
          if(ends[56]>=biggest215250){
            biggest215250=ends[56];
          }
          if(biggest215250 == 1){
            active[53]=1;
            ends[53]=1;
            tdone[53]=1;
          }
        }
        //FINXME code
        if(biggest215246 == 0){
          thread215251(tdone,ends);
          thread215252(tdone,ends);
          thread215253(tdone,ends);
          int biggest215254 = 0;
          if(ends[54]>=biggest215254){
            biggest215254=ends[54];
          }
          if(ends[55]>=biggest215254){
            biggest215254=ends[55];
          }
          if(ends[56]>=biggest215254){
            biggest215254=ends[56];
          }
          if(biggest215254 == 1){
            active[53]=1;
            ends[53]=1;
            tdone[53]=1;
          }
        }
        break;
      
    }
  }

  public void thread215240(int [] tdone, int [] ends){
        S214171=1;
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

  public void thread215239(int [] tdone, int [] ends){
        S214163=1;
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread215238(int [] tdone, int [] ends){
        S214160=1;
    zoneOcc_thread_50 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_50 = (Integer)(zoneFourLightingI.getpreval() == null ? 0 : ((Integer)zoneFourLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S214151=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_50 > 0 && zoneLightInt_thread_50 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneFourLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneFourLightONOFF);
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
    else {
      S214151=1;
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
  }

  public void thread215236(int [] tdone, int [] ends){
        S214171=1;
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

  public void thread215235(int [] tdone, int [] ends){
        S214163=1;
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread215234(int [] tdone, int [] ends){
        S214160=1;
    zoneOcc_thread_50 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_50 = (Integer)(zoneFourLightingI.getpreval() == null ? 0 : ((Integer)zoneFourLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S214151=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_50 > 0 && zoneLightInt_thread_50 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneFourLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneFourLightONOFF);
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
    else {
      S214151=1;
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
  }

  public void thread215232(int [] tdone, int [] ends){
        switch(S214171){
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

  public void thread215231(int [] tdone, int [] ends){
        switch(S214163){
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

  public void thread215230(int [] tdone, int [] ends){
        switch(S214160){
      case 0 : 
        active[50]=0;
        ends[50]=0;
        tdone[50]=1;
        break;
      
      case 1 : 
        switch(S214151){
          case 0 : 
            zoneFourLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
            currsigs.addElement(zoneFourLightONOFF);
            active[50]=1;
            ends[50]=1;
            tdone[50]=1;
            break;
          
          case 1 : 
            S214151=1;
            S214160=0;
            active[50]=0;
            ends[50]=0;
            tdone[50]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread215229(int [] tdone, int [] ends){
        switch(S214240){
      case 0 : 
        active[49]=0;
        ends[49]=0;
        tdone[49]=1;
        break;
      
      case 1 : 
        test_49.setClear();//sysj\ECS.sysj line: 37, column: 5
        thread215230(tdone,ends);
        thread215231(tdone,ends);
        thread215232(tdone,ends);
        int biggest215233 = 0;
        if(ends[50]>=biggest215233){
          biggest215233=ends[50];
        }
        if(ends[51]>=biggest215233){
          biggest215233=ends[51];
        }
        if(ends[52]>=biggest215233){
          biggest215233=ends[52];
        }
        if(biggest215233 == 1){
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
        if(biggest215233 == 2){
          ends[49]=2;
          ;//sysj\ECS.sysj line: 39, column: 5
          thread215234(tdone,ends);
          thread215235(tdone,ends);
          thread215236(tdone,ends);
          int biggest215237 = 0;
          if(ends[50]>=biggest215237){
            biggest215237=ends[50];
          }
          if(ends[51]>=biggest215237){
            biggest215237=ends[51];
          }
          if(ends[52]>=biggest215237){
            biggest215237=ends[52];
          }
          if(biggest215237 == 1){
            active[49]=1;
            ends[49]=1;
            tdone[49]=1;
          }
        }
        //FINXME code
        if(biggest215233 == 0){
          thread215238(tdone,ends);
          thread215239(tdone,ends);
          thread215240(tdone,ends);
          int biggest215241 = 0;
          if(ends[50]>=biggest215241){
            biggest215241=ends[50];
          }
          if(ends[51]>=biggest215241){
            biggest215241=ends[51];
          }
          if(ends[52]>=biggest215241){
            biggest215241=ends[52];
          }
          if(biggest215241 == 1){
            active[49]=1;
            ends[49]=1;
            tdone[49]=1;
          }
        }
        break;
      
    }
  }

  public void thread215227(int [] tdone, int [] ends){
        S214079=1;
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

  public void thread215226(int [] tdone, int [] ends){
        S214071=1;
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread215225(int [] tdone, int [] ends){
        S214068=1;
    zoneOcc_thread_46 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_46 = (Integer)(zoneThreeLightingI.getpreval() == null ? 0 : ((Integer)zoneThreeLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S214059=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_46 > 0 && zoneLightInt_thread_46 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneThreeLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneThreeLightONOFF);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S214059=1;
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
  }

  public void thread215223(int [] tdone, int [] ends){
        S214079=1;
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

  public void thread215222(int [] tdone, int [] ends){
        S214071=1;
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread215221(int [] tdone, int [] ends){
        S214068=1;
    zoneOcc_thread_46 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_46 = (Integer)(zoneThreeLightingI.getpreval() == null ? 0 : ((Integer)zoneThreeLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S214059=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_46 > 0 && zoneLightInt_thread_46 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneThreeLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneThreeLightONOFF);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S214059=1;
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
  }

  public void thread215219(int [] tdone, int [] ends){
        switch(S214079){
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

  public void thread215218(int [] tdone, int [] ends){
        switch(S214071){
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

  public void thread215217(int [] tdone, int [] ends){
        switch(S214068){
      case 0 : 
        active[46]=0;
        ends[46]=0;
        tdone[46]=1;
        break;
      
      case 1 : 
        switch(S214059){
          case 0 : 
            zoneThreeLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
            currsigs.addElement(zoneThreeLightONOFF);
            active[46]=1;
            ends[46]=1;
            tdone[46]=1;
            break;
          
          case 1 : 
            S214059=1;
            S214068=0;
            active[46]=0;
            ends[46]=0;
            tdone[46]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread215216(int [] tdone, int [] ends){
        switch(S214148){
      case 0 : 
        active[45]=0;
        ends[45]=0;
        tdone[45]=1;
        break;
      
      case 1 : 
        test_45.setClear();//sysj\ECS.sysj line: 37, column: 5
        thread215217(tdone,ends);
        thread215218(tdone,ends);
        thread215219(tdone,ends);
        int biggest215220 = 0;
        if(ends[46]>=biggest215220){
          biggest215220=ends[46];
        }
        if(ends[47]>=biggest215220){
          biggest215220=ends[47];
        }
        if(ends[48]>=biggest215220){
          biggest215220=ends[48];
        }
        if(biggest215220 == 1){
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
        if(biggest215220 == 2){
          ends[45]=2;
          ;//sysj\ECS.sysj line: 39, column: 5
          thread215221(tdone,ends);
          thread215222(tdone,ends);
          thread215223(tdone,ends);
          int biggest215224 = 0;
          if(ends[46]>=biggest215224){
            biggest215224=ends[46];
          }
          if(ends[47]>=biggest215224){
            biggest215224=ends[47];
          }
          if(ends[48]>=biggest215224){
            biggest215224=ends[48];
          }
          if(biggest215224 == 1){
            active[45]=1;
            ends[45]=1;
            tdone[45]=1;
          }
        }
        //FINXME code
        if(biggest215220 == 0){
          thread215225(tdone,ends);
          thread215226(tdone,ends);
          thread215227(tdone,ends);
          int biggest215228 = 0;
          if(ends[46]>=biggest215228){
            biggest215228=ends[46];
          }
          if(ends[47]>=biggest215228){
            biggest215228=ends[47];
          }
          if(ends[48]>=biggest215228){
            biggest215228=ends[48];
          }
          if(biggest215228 == 1){
            active[45]=1;
            ends[45]=1;
            tdone[45]=1;
          }
        }
        break;
      
    }
  }

  public void thread215214(int [] tdone, int [] ends){
        S213987=1;
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

  public void thread215213(int [] tdone, int [] ends){
        S213979=1;
    active[43]=1;
    ends[43]=1;
    tdone[43]=1;
  }

  public void thread215212(int [] tdone, int [] ends){
        S213976=1;
    zoneOcc_thread_42 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_42 = (Integer)(zoneTwoLightingI.getpreval() == null ? 0 : ((Integer)zoneTwoLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S213967=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_42 > 0 && zoneLightInt_thread_42 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneTwoLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneTwoLightONOFF);
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S213967=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread215210(int [] tdone, int [] ends){
        S213987=1;
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

  public void thread215209(int [] tdone, int [] ends){
        S213979=1;
    active[43]=1;
    ends[43]=1;
    tdone[43]=1;
  }

  public void thread215208(int [] tdone, int [] ends){
        S213976=1;
    zoneOcc_thread_42 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_42 = (Integer)(zoneTwoLightingI.getpreval() == null ? 0 : ((Integer)zoneTwoLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S213967=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_42 > 0 && zoneLightInt_thread_42 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneTwoLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneTwoLightONOFF);
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S213967=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread215206(int [] tdone, int [] ends){
        switch(S213987){
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

  public void thread215205(int [] tdone, int [] ends){
        switch(S213979){
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

  public void thread215204(int [] tdone, int [] ends){
        switch(S213976){
      case 0 : 
        active[42]=0;
        ends[42]=0;
        tdone[42]=1;
        break;
      
      case 1 : 
        switch(S213967){
          case 0 : 
            zoneTwoLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
            currsigs.addElement(zoneTwoLightONOFF);
            active[42]=1;
            ends[42]=1;
            tdone[42]=1;
            break;
          
          case 1 : 
            S213967=1;
            S213976=0;
            active[42]=0;
            ends[42]=0;
            tdone[42]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread215203(int [] tdone, int [] ends){
        switch(S214056){
      case 0 : 
        active[41]=0;
        ends[41]=0;
        tdone[41]=1;
        break;
      
      case 1 : 
        test_41.setClear();//sysj\ECS.sysj line: 37, column: 5
        thread215204(tdone,ends);
        thread215205(tdone,ends);
        thread215206(tdone,ends);
        int biggest215207 = 0;
        if(ends[42]>=biggest215207){
          biggest215207=ends[42];
        }
        if(ends[43]>=biggest215207){
          biggest215207=ends[43];
        }
        if(ends[44]>=biggest215207){
          biggest215207=ends[44];
        }
        if(biggest215207 == 1){
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
        if(biggest215207 == 2){
          ends[41]=2;
          ;//sysj\ECS.sysj line: 39, column: 5
          thread215208(tdone,ends);
          thread215209(tdone,ends);
          thread215210(tdone,ends);
          int biggest215211 = 0;
          if(ends[42]>=biggest215211){
            biggest215211=ends[42];
          }
          if(ends[43]>=biggest215211){
            biggest215211=ends[43];
          }
          if(ends[44]>=biggest215211){
            biggest215211=ends[44];
          }
          if(biggest215211 == 1){
            active[41]=1;
            ends[41]=1;
            tdone[41]=1;
          }
        }
        //FINXME code
        if(biggest215207 == 0){
          thread215212(tdone,ends);
          thread215213(tdone,ends);
          thread215214(tdone,ends);
          int biggest215215 = 0;
          if(ends[42]>=biggest215215){
            biggest215215=ends[42];
          }
          if(ends[43]>=biggest215215){
            biggest215215=ends[43];
          }
          if(ends[44]>=biggest215215){
            biggest215215=ends[44];
          }
          if(biggest215215 == 1){
            active[41]=1;
            ends[41]=1;
            tdone[41]=1;
          }
        }
        break;
      
    }
  }

  public void thread215201(int [] tdone, int [] ends){
        S213895=1;
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

  public void thread215200(int [] tdone, int [] ends){
        S213887=1;
    active[39]=1;
    ends[39]=1;
    tdone[39]=1;
  }

  public void thread215199(int [] tdone, int [] ends){
        S213884=1;
    zoneOcc_thread_38 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_38 = (Integer)(zoneOneLightingI.getpreval() == null ? 0 : ((Integer)zoneOneLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S213875=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_38 > 0 && zoneLightInt_thread_38 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneOneLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneOneLightONOFF);
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      S213875=1;
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread215197(int [] tdone, int [] ends){
        S213895=1;
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

  public void thread215196(int [] tdone, int [] ends){
        S213887=1;
    active[39]=1;
    ends[39]=1;
    tdone[39]=1;
  }

  public void thread215195(int [] tdone, int [] ends){
        S213884=1;
    zoneOcc_thread_38 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_38 = (Integer)(zoneOneLightingI.getpreval() == null ? 0 : ((Integer)zoneOneLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S213875=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_38 > 0 && zoneLightInt_thread_38 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneOneLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneOneLightONOFF);
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      S213875=1;
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread215193(int [] tdone, int [] ends){
        switch(S213895){
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

  public void thread215192(int [] tdone, int [] ends){
        switch(S213887){
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

  public void thread215191(int [] tdone, int [] ends){
        switch(S213884){
      case 0 : 
        active[38]=0;
        ends[38]=0;
        tdone[38]=1;
        break;
      
      case 1 : 
        switch(S213875){
          case 0 : 
            zoneOneLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
            currsigs.addElement(zoneOneLightONOFF);
            active[38]=1;
            ends[38]=1;
            tdone[38]=1;
            break;
          
          case 1 : 
            S213875=1;
            S213884=0;
            active[38]=0;
            ends[38]=0;
            tdone[38]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread215190(int [] tdone, int [] ends){
        switch(S213964){
      case 0 : 
        active[37]=0;
        ends[37]=0;
        tdone[37]=1;
        break;
      
      case 1 : 
        test_37.setClear();//sysj\ECS.sysj line: 37, column: 5
        thread215191(tdone,ends);
        thread215192(tdone,ends);
        thread215193(tdone,ends);
        int biggest215194 = 0;
        if(ends[38]>=biggest215194){
          biggest215194=ends[38];
        }
        if(ends[39]>=biggest215194){
          biggest215194=ends[39];
        }
        if(ends[40]>=biggest215194){
          biggest215194=ends[40];
        }
        if(biggest215194 == 1){
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
        if(biggest215194 == 2){
          ends[37]=2;
          ;//sysj\ECS.sysj line: 39, column: 5
          thread215195(tdone,ends);
          thread215196(tdone,ends);
          thread215197(tdone,ends);
          int biggest215198 = 0;
          if(ends[38]>=biggest215198){
            biggest215198=ends[38];
          }
          if(ends[39]>=biggest215198){
            biggest215198=ends[39];
          }
          if(ends[40]>=biggest215198){
            biggest215198=ends[40];
          }
          if(biggest215198 == 1){
            active[37]=1;
            ends[37]=1;
            tdone[37]=1;
          }
        }
        //FINXME code
        if(biggest215194 == 0){
          thread215199(tdone,ends);
          thread215200(tdone,ends);
          thread215201(tdone,ends);
          int biggest215202 = 0;
          if(ends[38]>=biggest215202){
            biggest215202=ends[38];
          }
          if(ends[39]>=biggest215202){
            biggest215202=ends[39];
          }
          if(ends[40]>=biggest215202){
            biggest215202=ends[40];
          }
          if(biggest215202 == 1){
            active[37]=1;
            ends[37]=1;
            tdone[37]=1;
          }
        }
        break;
      
    }
  }

  public void thread215188(int [] tdone, int [] ends){
        S213803=1;
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

  public void thread215187(int [] tdone, int [] ends){
        S213795=1;
    active[35]=1;
    ends[35]=1;
    tdone[35]=1;
  }

  public void thread215186(int [] tdone, int [] ends){
        S213792=1;
    zoneOcc_thread_34 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_34 = (Integer)(zoneSevenLightingI.getpreval() == null ? 0 : ((Integer)zoneSevenLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S213783=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_34 > 0 && zoneLightInt_thread_34 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneSevenWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneSevenWindowONOFF);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S213783=1;
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread215184(int [] tdone, int [] ends){
        S213803=1;
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

  public void thread215183(int [] tdone, int [] ends){
        S213795=1;
    active[35]=1;
    ends[35]=1;
    tdone[35]=1;
  }

  public void thread215182(int [] tdone, int [] ends){
        S213792=1;
    zoneOcc_thread_34 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_34 = (Integer)(zoneSevenLightingI.getpreval() == null ? 0 : ((Integer)zoneSevenLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S213783=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_34 > 0 && zoneLightInt_thread_34 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneSevenWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneSevenWindowONOFF);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S213783=1;
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread215180(int [] tdone, int [] ends){
        switch(S213803){
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

  public void thread215179(int [] tdone, int [] ends){
        switch(S213795){
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

  public void thread215178(int [] tdone, int [] ends){
        switch(S213792){
      case 0 : 
        active[34]=0;
        ends[34]=0;
        tdone[34]=1;
        break;
      
      case 1 : 
        switch(S213783){
          case 0 : 
            zoneSevenWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
            currsigs.addElement(zoneSevenWindowONOFF);
            active[34]=1;
            ends[34]=1;
            tdone[34]=1;
            break;
          
          case 1 : 
            S213783=1;
            S213792=0;
            active[34]=0;
            ends[34]=0;
            tdone[34]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread215177(int [] tdone, int [] ends){
        switch(S213872){
      case 0 : 
        active[33]=0;
        ends[33]=0;
        tdone[33]=1;
        break;
      
      case 1 : 
        test_33.setClear();//sysj\ECS.sysj line: 3, column: 5
        thread215178(tdone,ends);
        thread215179(tdone,ends);
        thread215180(tdone,ends);
        int biggest215181 = 0;
        if(ends[34]>=biggest215181){
          biggest215181=ends[34];
        }
        if(ends[35]>=biggest215181){
          biggest215181=ends[35];
        }
        if(ends[36]>=biggest215181){
          biggest215181=ends[36];
        }
        if(biggest215181 == 1){
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
        if(biggest215181 == 2){
          ends[33]=2;
          ;//sysj\ECS.sysj line: 5, column: 5
          thread215182(tdone,ends);
          thread215183(tdone,ends);
          thread215184(tdone,ends);
          int biggest215185 = 0;
          if(ends[34]>=biggest215185){
            biggest215185=ends[34];
          }
          if(ends[35]>=biggest215185){
            biggest215185=ends[35];
          }
          if(ends[36]>=biggest215185){
            biggest215185=ends[36];
          }
          if(biggest215185 == 1){
            active[33]=1;
            ends[33]=1;
            tdone[33]=1;
          }
        }
        //FINXME code
        if(biggest215181 == 0){
          thread215186(tdone,ends);
          thread215187(tdone,ends);
          thread215188(tdone,ends);
          int biggest215189 = 0;
          if(ends[34]>=biggest215189){
            biggest215189=ends[34];
          }
          if(ends[35]>=biggest215189){
            biggest215189=ends[35];
          }
          if(ends[36]>=biggest215189){
            biggest215189=ends[36];
          }
          if(biggest215189 == 1){
            active[33]=1;
            ends[33]=1;
            tdone[33]=1;
          }
        }
        break;
      
    }
  }

  public void thread215175(int [] tdone, int [] ends){
        S213711=1;
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

  public void thread215174(int [] tdone, int [] ends){
        S213703=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread215173(int [] tdone, int [] ends){
        S213700=1;
    zoneOcc_thread_30 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_30 = (Integer)(zoneSixLightingI.getpreval() == null ? 0 : ((Integer)zoneSixLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S213691=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_30 > 0 && zoneLightInt_thread_30 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneSixWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneSixWindowONOFF);
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S213691=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
  }

  public void thread215171(int [] tdone, int [] ends){
        S213711=1;
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

  public void thread215170(int [] tdone, int [] ends){
        S213703=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread215169(int [] tdone, int [] ends){
        S213700=1;
    zoneOcc_thread_30 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_30 = (Integer)(zoneSixLightingI.getpreval() == null ? 0 : ((Integer)zoneSixLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S213691=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_30 > 0 && zoneLightInt_thread_30 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneSixWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneSixWindowONOFF);
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S213691=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
  }

  public void thread215167(int [] tdone, int [] ends){
        switch(S213711){
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

  public void thread215166(int [] tdone, int [] ends){
        switch(S213703){
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

  public void thread215165(int [] tdone, int [] ends){
        switch(S213700){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        switch(S213691){
          case 0 : 
            zoneSixWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
            currsigs.addElement(zoneSixWindowONOFF);
            active[30]=1;
            ends[30]=1;
            tdone[30]=1;
            break;
          
          case 1 : 
            S213691=1;
            S213700=0;
            active[30]=0;
            ends[30]=0;
            tdone[30]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread215164(int [] tdone, int [] ends){
        switch(S213780){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        test_29.setClear();//sysj\ECS.sysj line: 3, column: 5
        thread215165(tdone,ends);
        thread215166(tdone,ends);
        thread215167(tdone,ends);
        int biggest215168 = 0;
        if(ends[30]>=biggest215168){
          biggest215168=ends[30];
        }
        if(ends[31]>=biggest215168){
          biggest215168=ends[31];
        }
        if(ends[32]>=biggest215168){
          biggest215168=ends[32];
        }
        if(biggest215168 == 1){
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
        if(biggest215168 == 2){
          ends[29]=2;
          ;//sysj\ECS.sysj line: 5, column: 5
          thread215169(tdone,ends);
          thread215170(tdone,ends);
          thread215171(tdone,ends);
          int biggest215172 = 0;
          if(ends[30]>=biggest215172){
            biggest215172=ends[30];
          }
          if(ends[31]>=biggest215172){
            biggest215172=ends[31];
          }
          if(ends[32]>=biggest215172){
            biggest215172=ends[32];
          }
          if(biggest215172 == 1){
            active[29]=1;
            ends[29]=1;
            tdone[29]=1;
          }
        }
        //FINXME code
        if(biggest215168 == 0){
          thread215173(tdone,ends);
          thread215174(tdone,ends);
          thread215175(tdone,ends);
          int biggest215176 = 0;
          if(ends[30]>=biggest215176){
            biggest215176=ends[30];
          }
          if(ends[31]>=biggest215176){
            biggest215176=ends[31];
          }
          if(ends[32]>=biggest215176){
            biggest215176=ends[32];
          }
          if(biggest215176 == 1){
            active[29]=1;
            ends[29]=1;
            tdone[29]=1;
          }
        }
        break;
      
    }
  }

  public void thread215162(int [] tdone, int [] ends){
        S213619=1;
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

  public void thread215161(int [] tdone, int [] ends){
        S213611=1;
    active[27]=1;
    ends[27]=1;
    tdone[27]=1;
  }

  public void thread215160(int [] tdone, int [] ends){
        S213608=1;
    zoneOcc_thread_26 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_26 = (Integer)(zoneFiveLightingI.getpreval() == null ? 0 : ((Integer)zoneFiveLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S213599=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_26 > 0 && zoneLightInt_thread_26 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneFiveWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneFiveWindowONOFF);
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
    else {
      S213599=1;
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread215158(int [] tdone, int [] ends){
        S213619=1;
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

  public void thread215157(int [] tdone, int [] ends){
        S213611=1;
    active[27]=1;
    ends[27]=1;
    tdone[27]=1;
  }

  public void thread215156(int [] tdone, int [] ends){
        S213608=1;
    zoneOcc_thread_26 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_26 = (Integer)(zoneFiveLightingI.getpreval() == null ? 0 : ((Integer)zoneFiveLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S213599=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_26 > 0 && zoneLightInt_thread_26 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneFiveWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneFiveWindowONOFF);
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
    else {
      S213599=1;
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread215154(int [] tdone, int [] ends){
        switch(S213619){
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

  public void thread215153(int [] tdone, int [] ends){
        switch(S213611){
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

  public void thread215152(int [] tdone, int [] ends){
        switch(S213608){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        switch(S213599){
          case 0 : 
            zoneFiveWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
            currsigs.addElement(zoneFiveWindowONOFF);
            active[26]=1;
            ends[26]=1;
            tdone[26]=1;
            break;
          
          case 1 : 
            S213599=1;
            S213608=0;
            active[26]=0;
            ends[26]=0;
            tdone[26]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread215151(int [] tdone, int [] ends){
        switch(S213688){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        test_25.setClear();//sysj\ECS.sysj line: 3, column: 5
        thread215152(tdone,ends);
        thread215153(tdone,ends);
        thread215154(tdone,ends);
        int biggest215155 = 0;
        if(ends[26]>=biggest215155){
          biggest215155=ends[26];
        }
        if(ends[27]>=biggest215155){
          biggest215155=ends[27];
        }
        if(ends[28]>=biggest215155){
          biggest215155=ends[28];
        }
        if(biggest215155 == 1){
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
        if(biggest215155 == 2){
          ends[25]=2;
          ;//sysj\ECS.sysj line: 5, column: 5
          thread215156(tdone,ends);
          thread215157(tdone,ends);
          thread215158(tdone,ends);
          int biggest215159 = 0;
          if(ends[26]>=biggest215159){
            biggest215159=ends[26];
          }
          if(ends[27]>=biggest215159){
            biggest215159=ends[27];
          }
          if(ends[28]>=biggest215159){
            biggest215159=ends[28];
          }
          if(biggest215159 == 1){
            active[25]=1;
            ends[25]=1;
            tdone[25]=1;
          }
        }
        //FINXME code
        if(biggest215155 == 0){
          thread215160(tdone,ends);
          thread215161(tdone,ends);
          thread215162(tdone,ends);
          int biggest215163 = 0;
          if(ends[26]>=biggest215163){
            biggest215163=ends[26];
          }
          if(ends[27]>=biggest215163){
            biggest215163=ends[27];
          }
          if(ends[28]>=biggest215163){
            biggest215163=ends[28];
          }
          if(biggest215163 == 1){
            active[25]=1;
            ends[25]=1;
            tdone[25]=1;
          }
        }
        break;
      
    }
  }

  public void thread215149(int [] tdone, int [] ends){
        S213527=1;
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

  public void thread215148(int [] tdone, int [] ends){
        S213519=1;
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread215147(int [] tdone, int [] ends){
        S213516=1;
    zoneOcc_thread_22 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_22 = (Integer)(zoneFourLightingI.getpreval() == null ? 0 : ((Integer)zoneFourLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S213507=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_22 > 0 && zoneLightInt_thread_22 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneFourWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneFourWindowONOFF);
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S213507=1;
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread215145(int [] tdone, int [] ends){
        S213527=1;
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

  public void thread215144(int [] tdone, int [] ends){
        S213519=1;
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread215143(int [] tdone, int [] ends){
        S213516=1;
    zoneOcc_thread_22 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_22 = (Integer)(zoneFourLightingI.getpreval() == null ? 0 : ((Integer)zoneFourLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S213507=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_22 > 0 && zoneLightInt_thread_22 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneFourWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneFourWindowONOFF);
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S213507=1;
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread215141(int [] tdone, int [] ends){
        switch(S213527){
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

  public void thread215140(int [] tdone, int [] ends){
        switch(S213519){
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

  public void thread215139(int [] tdone, int [] ends){
        switch(S213516){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        switch(S213507){
          case 0 : 
            zoneFourWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
            currsigs.addElement(zoneFourWindowONOFF);
            active[22]=1;
            ends[22]=1;
            tdone[22]=1;
            break;
          
          case 1 : 
            S213507=1;
            S213516=0;
            active[22]=0;
            ends[22]=0;
            tdone[22]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread215138(int [] tdone, int [] ends){
        switch(S213596){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        test_21.setClear();//sysj\ECS.sysj line: 3, column: 5
        thread215139(tdone,ends);
        thread215140(tdone,ends);
        thread215141(tdone,ends);
        int biggest215142 = 0;
        if(ends[22]>=biggest215142){
          biggest215142=ends[22];
        }
        if(ends[23]>=biggest215142){
          biggest215142=ends[23];
        }
        if(ends[24]>=biggest215142){
          biggest215142=ends[24];
        }
        if(biggest215142 == 1){
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        if(biggest215142 == 2){
          ends[21]=2;
          ;//sysj\ECS.sysj line: 5, column: 5
          thread215143(tdone,ends);
          thread215144(tdone,ends);
          thread215145(tdone,ends);
          int biggest215146 = 0;
          if(ends[22]>=biggest215146){
            biggest215146=ends[22];
          }
          if(ends[23]>=biggest215146){
            biggest215146=ends[23];
          }
          if(ends[24]>=biggest215146){
            biggest215146=ends[24];
          }
          if(biggest215146 == 1){
            active[21]=1;
            ends[21]=1;
            tdone[21]=1;
          }
        }
        //FINXME code
        if(biggest215142 == 0){
          thread215147(tdone,ends);
          thread215148(tdone,ends);
          thread215149(tdone,ends);
          int biggest215150 = 0;
          if(ends[22]>=biggest215150){
            biggest215150=ends[22];
          }
          if(ends[23]>=biggest215150){
            biggest215150=ends[23];
          }
          if(ends[24]>=biggest215150){
            biggest215150=ends[24];
          }
          if(biggest215150 == 1){
            active[21]=1;
            ends[21]=1;
            tdone[21]=1;
          }
        }
        break;
      
    }
  }

  public void thread215136(int [] tdone, int [] ends){
        S213435=1;
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

  public void thread215135(int [] tdone, int [] ends){
        S213427=1;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread215134(int [] tdone, int [] ends){
        S213424=1;
    zoneOcc_thread_18 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_18 = (Integer)(zoneThreeLightingI.getpreval() == null ? 0 : ((Integer)zoneThreeLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S213415=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_18 > 0 && zoneLightInt_thread_18 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneThreeWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneThreeWindowONOFF);
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
    else {
      S213415=1;
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread215132(int [] tdone, int [] ends){
        S213435=1;
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

  public void thread215131(int [] tdone, int [] ends){
        S213427=1;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread215130(int [] tdone, int [] ends){
        S213424=1;
    zoneOcc_thread_18 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_18 = (Integer)(zoneThreeLightingI.getpreval() == null ? 0 : ((Integer)zoneThreeLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S213415=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_18 > 0 && zoneLightInt_thread_18 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneThreeWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneThreeWindowONOFF);
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
    else {
      S213415=1;
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread215128(int [] tdone, int [] ends){
        switch(S213435){
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

  public void thread215127(int [] tdone, int [] ends){
        switch(S213427){
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

  public void thread215126(int [] tdone, int [] ends){
        switch(S213424){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        switch(S213415){
          case 0 : 
            zoneThreeWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
            currsigs.addElement(zoneThreeWindowONOFF);
            active[18]=1;
            ends[18]=1;
            tdone[18]=1;
            break;
          
          case 1 : 
            S213415=1;
            S213424=0;
            active[18]=0;
            ends[18]=0;
            tdone[18]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread215125(int [] tdone, int [] ends){
        switch(S213504){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        test_17.setClear();//sysj\ECS.sysj line: 3, column: 5
        thread215126(tdone,ends);
        thread215127(tdone,ends);
        thread215128(tdone,ends);
        int biggest215129 = 0;
        if(ends[18]>=biggest215129){
          biggest215129=ends[18];
        }
        if(ends[19]>=biggest215129){
          biggest215129=ends[19];
        }
        if(ends[20]>=biggest215129){
          biggest215129=ends[20];
        }
        if(biggest215129 == 1){
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
        if(biggest215129 == 2){
          ends[17]=2;
          ;//sysj\ECS.sysj line: 5, column: 5
          thread215130(tdone,ends);
          thread215131(tdone,ends);
          thread215132(tdone,ends);
          int biggest215133 = 0;
          if(ends[18]>=biggest215133){
            biggest215133=ends[18];
          }
          if(ends[19]>=biggest215133){
            biggest215133=ends[19];
          }
          if(ends[20]>=biggest215133){
            biggest215133=ends[20];
          }
          if(biggest215133 == 1){
            active[17]=1;
            ends[17]=1;
            tdone[17]=1;
          }
        }
        //FINXME code
        if(biggest215129 == 0){
          thread215134(tdone,ends);
          thread215135(tdone,ends);
          thread215136(tdone,ends);
          int biggest215137 = 0;
          if(ends[18]>=biggest215137){
            biggest215137=ends[18];
          }
          if(ends[19]>=biggest215137){
            biggest215137=ends[19];
          }
          if(ends[20]>=biggest215137){
            biggest215137=ends[20];
          }
          if(biggest215137 == 1){
            active[17]=1;
            ends[17]=1;
            tdone[17]=1;
          }
        }
        break;
      
    }
  }

  public void thread215123(int [] tdone, int [] ends){
        S213343=1;
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

  public void thread215122(int [] tdone, int [] ends){
        S213335=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread215121(int [] tdone, int [] ends){
        S213332=1;
    zoneOcc_thread_14 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_14 = (Integer)(zoneTwoLightingI.getpreval() == null ? 0 : ((Integer)zoneTwoLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S213323=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_14 > 0 && zoneLightInt_thread_14 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneTwoWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneTwoWindowONOFF);
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      S213323=1;
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread215119(int [] tdone, int [] ends){
        S213343=1;
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

  public void thread215118(int [] tdone, int [] ends){
        S213335=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread215117(int [] tdone, int [] ends){
        S213332=1;
    zoneOcc_thread_14 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_14 = (Integer)(zoneTwoLightingI.getpreval() == null ? 0 : ((Integer)zoneTwoLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S213323=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_14 > 0 && zoneLightInt_thread_14 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneTwoWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneTwoWindowONOFF);
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      S213323=1;
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread215115(int [] tdone, int [] ends){
        switch(S213343){
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

  public void thread215114(int [] tdone, int [] ends){
        switch(S213335){
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

  public void thread215113(int [] tdone, int [] ends){
        switch(S213332){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        switch(S213323){
          case 0 : 
            zoneTwoWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
            currsigs.addElement(zoneTwoWindowONOFF);
            active[14]=1;
            ends[14]=1;
            tdone[14]=1;
            break;
          
          case 1 : 
            S213323=1;
            S213332=0;
            active[14]=0;
            ends[14]=0;
            tdone[14]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread215112(int [] tdone, int [] ends){
        switch(S213412){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        test_13.setClear();//sysj\ECS.sysj line: 3, column: 5
        thread215113(tdone,ends);
        thread215114(tdone,ends);
        thread215115(tdone,ends);
        int biggest215116 = 0;
        if(ends[14]>=biggest215116){
          biggest215116=ends[14];
        }
        if(ends[15]>=biggest215116){
          biggest215116=ends[15];
        }
        if(ends[16]>=biggest215116){
          biggest215116=ends[16];
        }
        if(biggest215116 == 1){
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        if(biggest215116 == 2){
          ends[13]=2;
          ;//sysj\ECS.sysj line: 5, column: 5
          thread215117(tdone,ends);
          thread215118(tdone,ends);
          thread215119(tdone,ends);
          int biggest215120 = 0;
          if(ends[14]>=biggest215120){
            biggest215120=ends[14];
          }
          if(ends[15]>=biggest215120){
            biggest215120=ends[15];
          }
          if(ends[16]>=biggest215120){
            biggest215120=ends[16];
          }
          if(biggest215120 == 1){
            active[13]=1;
            ends[13]=1;
            tdone[13]=1;
          }
        }
        //FINXME code
        if(biggest215116 == 0){
          thread215121(tdone,ends);
          thread215122(tdone,ends);
          thread215123(tdone,ends);
          int biggest215124 = 0;
          if(ends[14]>=biggest215124){
            biggest215124=ends[14];
          }
          if(ends[15]>=biggest215124){
            biggest215124=ends[15];
          }
          if(ends[16]>=biggest215124){
            biggest215124=ends[16];
          }
          if(biggest215124 == 1){
            active[13]=1;
            ends[13]=1;
            tdone[13]=1;
          }
        }
        break;
      
    }
  }

  public void thread215110(int [] tdone, int [] ends){
        S213251=1;
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

  public void thread215109(int [] tdone, int [] ends){
        S213243=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread215108(int [] tdone, int [] ends){
        S213240=1;
    zoneOcc_thread_10 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_10 = (Integer)(zoneOneLightingI.getpreval() == null ? 0 : ((Integer)zoneOneLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S213231=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_10 > 0 && zoneLightInt_thread_10 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneOneWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneOneWindowONOFF);
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      S213231=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread215106(int [] tdone, int [] ends){
        S213251=1;
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

  public void thread215105(int [] tdone, int [] ends){
        S213243=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread215104(int [] tdone, int [] ends){
        S213240=1;
    zoneOcc_thread_10 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_10 = (Integer)(zoneOneLightingI.getpreval() == null ? 0 : ((Integer)zoneOneLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S213231=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_10 > 0 && zoneLightInt_thread_10 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneOneWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneOneWindowONOFF);
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      S213231=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread215102(int [] tdone, int [] ends){
        switch(S213251){
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

  public void thread215101(int [] tdone, int [] ends){
        switch(S213243){
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

  public void thread215100(int [] tdone, int [] ends){
        switch(S213240){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S213231){
          case 0 : 
            zoneOneWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
            currsigs.addElement(zoneOneWindowONOFF);
            active[10]=1;
            ends[10]=1;
            tdone[10]=1;
            break;
          
          case 1 : 
            S213231=1;
            S213240=0;
            active[10]=0;
            ends[10]=0;
            tdone[10]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread215099(int [] tdone, int [] ends){
        switch(S213320){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        test_9.setClear();//sysj\ECS.sysj line: 3, column: 5
        thread215100(tdone,ends);
        thread215101(tdone,ends);
        thread215102(tdone,ends);
        int biggest215103 = 0;
        if(ends[10]>=biggest215103){
          biggest215103=ends[10];
        }
        if(ends[11]>=biggest215103){
          biggest215103=ends[11];
        }
        if(ends[12]>=biggest215103){
          biggest215103=ends[12];
        }
        if(biggest215103 == 1){
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        if(biggest215103 == 2){
          ends[9]=2;
          ;//sysj\ECS.sysj line: 5, column: 5
          thread215104(tdone,ends);
          thread215105(tdone,ends);
          thread215106(tdone,ends);
          int biggest215107 = 0;
          if(ends[10]>=biggest215107){
            biggest215107=ends[10];
          }
          if(ends[11]>=biggest215107){
            biggest215107=ends[11];
          }
          if(ends[12]>=biggest215107){
            biggest215107=ends[12];
          }
          if(biggest215107 == 1){
            active[9]=1;
            ends[9]=1;
            tdone[9]=1;
          }
        }
        //FINXME code
        if(biggest215103 == 0){
          thread215108(tdone,ends);
          thread215109(tdone,ends);
          thread215110(tdone,ends);
          int biggest215111 = 0;
          if(ends[10]>=biggest215111){
            biggest215111=ends[10];
          }
          if(ends[11]>=biggest215111){
            biggest215111=ends[11];
          }
          if(ends[12]>=biggest215111){
            biggest215111=ends[12];
          }
          if(biggest215111 == 1){
            active[9]=1;
            ends[9]=1;
            tdone[9]=1;
          }
        }
        break;
      
    }
  }

  public void thread215098(int [] tdone, int [] ends){
        switch(S214518){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        thread215099(tdone,ends);
        thread215112(tdone,ends);
        thread215125(tdone,ends);
        thread215138(tdone,ends);
        thread215151(tdone,ends);
        thread215164(tdone,ends);
        thread215177(tdone,ends);
        thread215190(tdone,ends);
        thread215203(tdone,ends);
        thread215216(tdone,ends);
        thread215229(tdone,ends);
        thread215242(tdone,ends);
        thread215255(tdone,ends);
        thread215268(tdone,ends);
        int biggest215281 = 0;
        if(ends[9]>=biggest215281){
          biggest215281=ends[9];
        }
        if(ends[13]>=biggest215281){
          biggest215281=ends[13];
        }
        if(ends[17]>=biggest215281){
          biggest215281=ends[17];
        }
        if(ends[21]>=biggest215281){
          biggest215281=ends[21];
        }
        if(ends[25]>=biggest215281){
          biggest215281=ends[25];
        }
        if(ends[29]>=biggest215281){
          biggest215281=ends[29];
        }
        if(ends[33]>=biggest215281){
          biggest215281=ends[33];
        }
        if(ends[37]>=biggest215281){
          biggest215281=ends[37];
        }
        if(ends[41]>=biggest215281){
          biggest215281=ends[41];
        }
        if(ends[45]>=biggest215281){
          biggest215281=ends[45];
        }
        if(ends[49]>=biggest215281){
          biggest215281=ends[49];
        }
        if(ends[53]>=biggest215281){
          biggest215281=ends[53];
        }
        if(ends[57]>=biggest215281){
          biggest215281=ends[57];
        }
        if(ends[61]>=biggest215281){
          biggest215281=ends[61];
        }
        if(biggest215281 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        //FINXME code
        if(biggest215281 == 0){
          S214518=0;
          active[8]=0;
          ends[8]=0;
          tdone[8]=1;
        }
        break;
      
    }
  }

  public void thread215097(int [] tdone, int [] ends){
        switch(S213228){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S213178){
          case 0 : 
            if(currentTime_2.getprestatus()){//sysj\ECS.sysj line: 351, column: 14
              currentHour_thread_7 = (Integer)(currentTime_2.getpreval() == null ? 0 : ((Integer)currentTime_2.getpreval()).intValue());//sysj\ECS.sysj line: 352, column: 8
              S213178=1;
              if(currentHour_thread_7 >= 9 && currentHour_thread_7 <= 17){//sysj\ECS.sysj line: 354, column: 16
                S213182=0;
                workhrs_6.setPresent();//sysj\ECS.sysj line: 355, column: 16
                currsigs.addElement(workhrs_6);
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
              else {
                S213182=1;
                if((currentHour_thread_7 >= 18 && currentHour_thread_7 <= 24) || (currentHour_thread_7 >= 0 && currentHour_thread_7 < 9)){//sysj\ECS.sysj line: 359, column: 23
                  afterhrs_6.setPresent();//sysj\ECS.sysj line: 360, column: 16
                  currsigs.addElement(afterhrs_6);
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  S213178=0;
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
            switch(S213182){
              case 0 : 
                S213178=0;
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
                break;
              
              case 1 : 
                S213178=0;
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

  public void thread215093(int [] tdone, int [] ends){
        S214447=1;
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

  public void thread215092(int [] tdone, int [] ends){
        S214439=1;
    active[63]=1;
    ends[63]=1;
    tdone[63]=1;
  }

  public void thread215091(int [] tdone, int [] ends){
        S214436=1;
    zoneOcc_thread_62 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_62 = (Integer)(zoneSevenLightingI.getpreval() == null ? 0 : ((Integer)zoneSevenLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S214427=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_62 > 0 && zoneLightInt_thread_62 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneSevenLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneSevenLightONOFF);
      active[62]=1;
      ends[62]=1;
      tdone[62]=1;
    }
    else {
      S214427=1;
      active[62]=1;
      ends[62]=1;
      tdone[62]=1;
    }
  }

  public void thread215090(int [] tdone, int [] ends){
        S214516=1;
    test_61.setClear();//sysj\ECS.sysj line: 37, column: 5
    thread215091(tdone,ends);
    thread215092(tdone,ends);
    thread215093(tdone,ends);
    int biggest215094 = 0;
    if(ends[62]>=biggest215094){
      biggest215094=ends[62];
    }
    if(ends[63]>=biggest215094){
      biggest215094=ends[63];
    }
    if(ends[64]>=biggest215094){
      biggest215094=ends[64];
    }
    if(biggest215094 == 1){
      active[61]=1;
      ends[61]=1;
      tdone[61]=1;
    }
  }

  public void thread215088(int [] tdone, int [] ends){
        S214355=1;
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

  public void thread215087(int [] tdone, int [] ends){
        S214347=1;
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread215086(int [] tdone, int [] ends){
        S214344=1;
    zoneOcc_thread_58 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_58 = (Integer)(zoneSixLightingI.getpreval() == null ? 0 : ((Integer)zoneSixLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S214335=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_58 > 0 && zoneLightInt_thread_58 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneSixLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneSixLightONOFF);
      active[58]=1;
      ends[58]=1;
      tdone[58]=1;
    }
    else {
      S214335=1;
      active[58]=1;
      ends[58]=1;
      tdone[58]=1;
    }
  }

  public void thread215085(int [] tdone, int [] ends){
        S214424=1;
    test_57.setClear();//sysj\ECS.sysj line: 37, column: 5
    thread215086(tdone,ends);
    thread215087(tdone,ends);
    thread215088(tdone,ends);
    int biggest215089 = 0;
    if(ends[58]>=biggest215089){
      biggest215089=ends[58];
    }
    if(ends[59]>=biggest215089){
      biggest215089=ends[59];
    }
    if(ends[60]>=biggest215089){
      biggest215089=ends[60];
    }
    if(biggest215089 == 1){
      active[57]=1;
      ends[57]=1;
      tdone[57]=1;
    }
  }

  public void thread215083(int [] tdone, int [] ends){
        S214263=1;
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

  public void thread215082(int [] tdone, int [] ends){
        S214255=1;
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread215081(int [] tdone, int [] ends){
        S214252=1;
    zoneOcc_thread_54 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_54 = (Integer)(zoneFiveLightingI.getpreval() == null ? 0 : ((Integer)zoneFiveLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S214243=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_54 > 0 && zoneLightInt_thread_54 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneFiveLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneFiveLightONOFF);
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
    else {
      S214243=1;
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
  }

  public void thread215080(int [] tdone, int [] ends){
        S214332=1;
    test_53.setClear();//sysj\ECS.sysj line: 37, column: 5
    thread215081(tdone,ends);
    thread215082(tdone,ends);
    thread215083(tdone,ends);
    int biggest215084 = 0;
    if(ends[54]>=biggest215084){
      biggest215084=ends[54];
    }
    if(ends[55]>=biggest215084){
      biggest215084=ends[55];
    }
    if(ends[56]>=biggest215084){
      biggest215084=ends[56];
    }
    if(biggest215084 == 1){
      active[53]=1;
      ends[53]=1;
      tdone[53]=1;
    }
  }

  public void thread215078(int [] tdone, int [] ends){
        S214171=1;
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

  public void thread215077(int [] tdone, int [] ends){
        S214163=1;
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread215076(int [] tdone, int [] ends){
        S214160=1;
    zoneOcc_thread_50 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_50 = (Integer)(zoneFourLightingI.getpreval() == null ? 0 : ((Integer)zoneFourLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S214151=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_50 > 0 && zoneLightInt_thread_50 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneFourLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneFourLightONOFF);
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
    else {
      S214151=1;
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
  }

  public void thread215075(int [] tdone, int [] ends){
        S214240=1;
    test_49.setClear();//sysj\ECS.sysj line: 37, column: 5
    thread215076(tdone,ends);
    thread215077(tdone,ends);
    thread215078(tdone,ends);
    int biggest215079 = 0;
    if(ends[50]>=biggest215079){
      biggest215079=ends[50];
    }
    if(ends[51]>=biggest215079){
      biggest215079=ends[51];
    }
    if(ends[52]>=biggest215079){
      biggest215079=ends[52];
    }
    if(biggest215079 == 1){
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
  }

  public void thread215073(int [] tdone, int [] ends){
        S214079=1;
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

  public void thread215072(int [] tdone, int [] ends){
        S214071=1;
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread215071(int [] tdone, int [] ends){
        S214068=1;
    zoneOcc_thread_46 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_46 = (Integer)(zoneThreeLightingI.getpreval() == null ? 0 : ((Integer)zoneThreeLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S214059=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_46 > 0 && zoneLightInt_thread_46 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneThreeLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneThreeLightONOFF);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S214059=1;
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
  }

  public void thread215070(int [] tdone, int [] ends){
        S214148=1;
    test_45.setClear();//sysj\ECS.sysj line: 37, column: 5
    thread215071(tdone,ends);
    thread215072(tdone,ends);
    thread215073(tdone,ends);
    int biggest215074 = 0;
    if(ends[46]>=biggest215074){
      biggest215074=ends[46];
    }
    if(ends[47]>=biggest215074){
      biggest215074=ends[47];
    }
    if(ends[48]>=biggest215074){
      biggest215074=ends[48];
    }
    if(biggest215074 == 1){
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
  }

  public void thread215068(int [] tdone, int [] ends){
        S213987=1;
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

  public void thread215067(int [] tdone, int [] ends){
        S213979=1;
    active[43]=1;
    ends[43]=1;
    tdone[43]=1;
  }

  public void thread215066(int [] tdone, int [] ends){
        S213976=1;
    zoneOcc_thread_42 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_42 = (Integer)(zoneTwoLightingI.getpreval() == null ? 0 : ((Integer)zoneTwoLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S213967=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_42 > 0 && zoneLightInt_thread_42 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneTwoLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneTwoLightONOFF);
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S213967=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread215065(int [] tdone, int [] ends){
        S214056=1;
    test_41.setClear();//sysj\ECS.sysj line: 37, column: 5
    thread215066(tdone,ends);
    thread215067(tdone,ends);
    thread215068(tdone,ends);
    int biggest215069 = 0;
    if(ends[42]>=biggest215069){
      biggest215069=ends[42];
    }
    if(ends[43]>=biggest215069){
      biggest215069=ends[43];
    }
    if(ends[44]>=biggest215069){
      biggest215069=ends[44];
    }
    if(biggest215069 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread215063(int [] tdone, int [] ends){
        S213895=1;
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

  public void thread215062(int [] tdone, int [] ends){
        S213887=1;
    active[39]=1;
    ends[39]=1;
    tdone[39]=1;
  }

  public void thread215061(int [] tdone, int [] ends){
        S213884=1;
    zoneOcc_thread_38 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_38 = (Integer)(zoneOneLightingI.getpreval() == null ? 0 : ((Integer)zoneOneLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S213875=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_38 > 0 && zoneLightInt_thread_38 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneOneLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneOneLightONOFF);
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      S213875=1;
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread215060(int [] tdone, int [] ends){
        S213964=1;
    test_37.setClear();//sysj\ECS.sysj line: 37, column: 5
    thread215061(tdone,ends);
    thread215062(tdone,ends);
    thread215063(tdone,ends);
    int biggest215064 = 0;
    if(ends[38]>=biggest215064){
      biggest215064=ends[38];
    }
    if(ends[39]>=biggest215064){
      biggest215064=ends[39];
    }
    if(ends[40]>=biggest215064){
      biggest215064=ends[40];
    }
    if(biggest215064 == 1){
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
  }

  public void thread215058(int [] tdone, int [] ends){
        S213803=1;
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

  public void thread215057(int [] tdone, int [] ends){
        S213795=1;
    active[35]=1;
    ends[35]=1;
    tdone[35]=1;
  }

  public void thread215056(int [] tdone, int [] ends){
        S213792=1;
    zoneOcc_thread_34 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_34 = (Integer)(zoneSevenLightingI.getpreval() == null ? 0 : ((Integer)zoneSevenLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S213783=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_34 > 0 && zoneLightInt_thread_34 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneSevenWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneSevenWindowONOFF);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S213783=1;
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread215055(int [] tdone, int [] ends){
        S213872=1;
    test_33.setClear();//sysj\ECS.sysj line: 3, column: 5
    thread215056(tdone,ends);
    thread215057(tdone,ends);
    thread215058(tdone,ends);
    int biggest215059 = 0;
    if(ends[34]>=biggest215059){
      biggest215059=ends[34];
    }
    if(ends[35]>=biggest215059){
      biggest215059=ends[35];
    }
    if(ends[36]>=biggest215059){
      biggest215059=ends[36];
    }
    if(biggest215059 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
  }

  public void thread215053(int [] tdone, int [] ends){
        S213711=1;
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

  public void thread215052(int [] tdone, int [] ends){
        S213703=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread215051(int [] tdone, int [] ends){
        S213700=1;
    zoneOcc_thread_30 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_30 = (Integer)(zoneSixLightingI.getpreval() == null ? 0 : ((Integer)zoneSixLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S213691=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_30 > 0 && zoneLightInt_thread_30 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneSixWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneSixWindowONOFF);
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S213691=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
  }

  public void thread215050(int [] tdone, int [] ends){
        S213780=1;
    test_29.setClear();//sysj\ECS.sysj line: 3, column: 5
    thread215051(tdone,ends);
    thread215052(tdone,ends);
    thread215053(tdone,ends);
    int biggest215054 = 0;
    if(ends[30]>=biggest215054){
      biggest215054=ends[30];
    }
    if(ends[31]>=biggest215054){
      biggest215054=ends[31];
    }
    if(ends[32]>=biggest215054){
      biggest215054=ends[32];
    }
    if(biggest215054 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread215048(int [] tdone, int [] ends){
        S213619=1;
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

  public void thread215047(int [] tdone, int [] ends){
        S213611=1;
    active[27]=1;
    ends[27]=1;
    tdone[27]=1;
  }

  public void thread215046(int [] tdone, int [] ends){
        S213608=1;
    zoneOcc_thread_26 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_26 = (Integer)(zoneFiveLightingI.getpreval() == null ? 0 : ((Integer)zoneFiveLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S213599=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_26 > 0 && zoneLightInt_thread_26 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneFiveWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneFiveWindowONOFF);
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
    else {
      S213599=1;
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread215045(int [] tdone, int [] ends){
        S213688=1;
    test_25.setClear();//sysj\ECS.sysj line: 3, column: 5
    thread215046(tdone,ends);
    thread215047(tdone,ends);
    thread215048(tdone,ends);
    int biggest215049 = 0;
    if(ends[26]>=biggest215049){
      biggest215049=ends[26];
    }
    if(ends[27]>=biggest215049){
      biggest215049=ends[27];
    }
    if(ends[28]>=biggest215049){
      biggest215049=ends[28];
    }
    if(biggest215049 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread215043(int [] tdone, int [] ends){
        S213527=1;
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

  public void thread215042(int [] tdone, int [] ends){
        S213519=1;
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread215041(int [] tdone, int [] ends){
        S213516=1;
    zoneOcc_thread_22 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_22 = (Integer)(zoneFourLightingI.getpreval() == null ? 0 : ((Integer)zoneFourLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S213507=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_22 > 0 && zoneLightInt_thread_22 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneFourWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneFourWindowONOFF);
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S213507=1;
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread215040(int [] tdone, int [] ends){
        S213596=1;
    test_21.setClear();//sysj\ECS.sysj line: 3, column: 5
    thread215041(tdone,ends);
    thread215042(tdone,ends);
    thread215043(tdone,ends);
    int biggest215044 = 0;
    if(ends[22]>=biggest215044){
      biggest215044=ends[22];
    }
    if(ends[23]>=biggest215044){
      biggest215044=ends[23];
    }
    if(ends[24]>=biggest215044){
      biggest215044=ends[24];
    }
    if(biggest215044 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread215038(int [] tdone, int [] ends){
        S213435=1;
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

  public void thread215037(int [] tdone, int [] ends){
        S213427=1;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread215036(int [] tdone, int [] ends){
        S213424=1;
    zoneOcc_thread_18 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_18 = (Integer)(zoneThreeLightingI.getpreval() == null ? 0 : ((Integer)zoneThreeLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S213415=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_18 > 0 && zoneLightInt_thread_18 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneThreeWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneThreeWindowONOFF);
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
    else {
      S213415=1;
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread215035(int [] tdone, int [] ends){
        S213504=1;
    test_17.setClear();//sysj\ECS.sysj line: 3, column: 5
    thread215036(tdone,ends);
    thread215037(tdone,ends);
    thread215038(tdone,ends);
    int biggest215039 = 0;
    if(ends[18]>=biggest215039){
      biggest215039=ends[18];
    }
    if(ends[19]>=biggest215039){
      biggest215039=ends[19];
    }
    if(ends[20]>=biggest215039){
      biggest215039=ends[20];
    }
    if(biggest215039 == 1){
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
  }

  public void thread215033(int [] tdone, int [] ends){
        S213343=1;
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

  public void thread215032(int [] tdone, int [] ends){
        S213335=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread215031(int [] tdone, int [] ends){
        S213332=1;
    zoneOcc_thread_14 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_14 = (Integer)(zoneTwoLightingI.getpreval() == null ? 0 : ((Integer)zoneTwoLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S213323=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_14 > 0 && zoneLightInt_thread_14 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneTwoWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneTwoWindowONOFF);
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      S213323=1;
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread215030(int [] tdone, int [] ends){
        S213412=1;
    test_13.setClear();//sysj\ECS.sysj line: 3, column: 5
    thread215031(tdone,ends);
    thread215032(tdone,ends);
    thread215033(tdone,ends);
    int biggest215034 = 0;
    if(ends[14]>=biggest215034){
      biggest215034=ends[14];
    }
    if(ends[15]>=biggest215034){
      biggest215034=ends[15];
    }
    if(ends[16]>=biggest215034){
      biggest215034=ends[16];
    }
    if(biggest215034 == 1){
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread215028(int [] tdone, int [] ends){
        S213251=1;
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

  public void thread215027(int [] tdone, int [] ends){
        S213243=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread215026(int [] tdone, int [] ends){
        S213240=1;
    zoneOcc_thread_10 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_10 = (Integer)(zoneOneLightingI.getpreval() == null ? 0 : ((Integer)zoneOneLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S213231=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_10 > 0 && zoneLightInt_thread_10 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneOneWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneOneWindowONOFF);
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      S213231=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread215025(int [] tdone, int [] ends){
        S213320=1;
    test_9.setClear();//sysj\ECS.sysj line: 3, column: 5
    thread215026(tdone,ends);
    thread215027(tdone,ends);
    thread215028(tdone,ends);
    int biggest215029 = 0;
    if(ends[10]>=biggest215029){
      biggest215029=ends[10];
    }
    if(ends[11]>=biggest215029){
      biggest215029=ends[11];
    }
    if(ends[12]>=biggest215029){
      biggest215029=ends[12];
    }
    if(biggest215029 == 1){
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread215024(int [] tdone, int [] ends){
        S214518=1;
    thread215025(tdone,ends);
    thread215030(tdone,ends);
    thread215035(tdone,ends);
    thread215040(tdone,ends);
    thread215045(tdone,ends);
    thread215050(tdone,ends);
    thread215055(tdone,ends);
    thread215060(tdone,ends);
    thread215065(tdone,ends);
    thread215070(tdone,ends);
    thread215075(tdone,ends);
    thread215080(tdone,ends);
    thread215085(tdone,ends);
    thread215090(tdone,ends);
    int biggest215095 = 0;
    if(ends[9]>=biggest215095){
      biggest215095=ends[9];
    }
    if(ends[13]>=biggest215095){
      biggest215095=ends[13];
    }
    if(ends[17]>=biggest215095){
      biggest215095=ends[17];
    }
    if(ends[21]>=biggest215095){
      biggest215095=ends[21];
    }
    if(ends[25]>=biggest215095){
      biggest215095=ends[25];
    }
    if(ends[29]>=biggest215095){
      biggest215095=ends[29];
    }
    if(ends[33]>=biggest215095){
      biggest215095=ends[33];
    }
    if(ends[37]>=biggest215095){
      biggest215095=ends[37];
    }
    if(ends[41]>=biggest215095){
      biggest215095=ends[41];
    }
    if(ends[45]>=biggest215095){
      biggest215095=ends[45];
    }
    if(ends[49]>=biggest215095){
      biggest215095=ends[49];
    }
    if(ends[53]>=biggest215095){
      biggest215095=ends[53];
    }
    if(ends[57]>=biggest215095){
      biggest215095=ends[57];
    }
    if(ends[61]>=biggest215095){
      biggest215095=ends[61];
    }
    if(biggest215095 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest215095 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest215095 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest215095 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest215095 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest215095 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest215095 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest215095 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest215095 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest215095 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest215095 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest215095 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest215095 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest215095 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread215023(int [] tdone, int [] ends){
        S213228=1;
    S213178=0;
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
      switch(S214520){
        case 0 : 
          S214520=0;
          break RUN;
        
        case 1 : 
          S214520=2;
          S214520=2;
          workhrs_6.setClear();//sysj\ECS.sysj line: 347, column: 4
          afterhrs_6.setClear();//sysj\ECS.sysj line: 347, column: 4
          thread215023(tdone,ends);
          thread215024(tdone,ends);
          int biggest215096 = 0;
          if(ends[7]>=biggest215096){
            biggest215096=ends[7];
          }
          if(ends[8]>=biggest215096){
            biggest215096=ends[8];
          }
          if(biggest215096 == 1){
            active[6]=1;
            ends[6]=1;
            break RUN;
          }
        
        case 2 : 
          workhrs_6.setClear();//sysj\ECS.sysj line: 347, column: 4
          afterhrs_6.setClear();//sysj\ECS.sysj line: 347, column: 4
          thread215097(tdone,ends);
          thread215098(tdone,ends);
          int biggest215282 = 0;
          if(ends[7]>=biggest215282){
            biggest215282=ends[7];
          }
          if(ends[8]>=biggest215282){
            biggest215282=ends[8];
          }
          if(biggest215282 == 1){
            active[6]=1;
            ends[6]=1;
            break RUN;
          }
          //FINXME code
          if(biggest215282 == 0){
            S214520=0;
            active[6]=0;
            ends[6]=0;
            S214520=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
