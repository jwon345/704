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
  public Signal zoneOneLightingI = new Signal("zoneOneLightingI", Signal.OUTPUT);
  public Signal zoneTwoLightingI = new Signal("zoneTwoLightingI", Signal.OUTPUT);
  public Signal zoneThreeLightingI = new Signal("zoneThreeLightingI", Signal.OUTPUT);
  public Signal zoneFourLightingI = new Signal("zoneFourLightingI", Signal.OUTPUT);
  public Signal zoneFiveLightingI = new Signal("zoneFiveLightingI", Signal.OUTPUT);
  public Signal zoneSixLightingI = new Signal("zoneSixLightingI", Signal.OUTPUT);
  public Signal zoneSevenLightingI = new Signal("zoneSevenLightingI", Signal.OUTPUT);
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
  private Signal workhrs_1;
  private Signal afterhrs_1;
  private Signal test_4;
  private Signal test_8;
  private Signal test_12;
  private Signal test_16;
  private Signal test_20;
  private Signal test_24;
  private Signal test_28;
  private Signal test_32;
  private Signal test_36;
  private Signal test_40;
  private Signal test_44;
  private Signal test_48;
  private Signal test_52;
  private Signal test_56;
  private int currentHour_thread_2;//sysj\ECS.sysj line: 116, column: 8
  private int zoneOcc_thread_5;//sysj\ECS.sysj line: 9, column: 17
  private int prevOccupancy_thread_7;//sysj\ECS.sysj line: 30, column: 14
  private int currentOccupancy_thread_7;//sysj\ECS.sysj line: 33, column: 21
  private int zoneOcc_thread_9;//sysj\ECS.sysj line: 9, column: 17
  private int prevOccupancy_thread_11;//sysj\ECS.sysj line: 30, column: 14
  private int currentOccupancy_thread_11;//sysj\ECS.sysj line: 33, column: 21
  private int zoneOcc_thread_13;//sysj\ECS.sysj line: 9, column: 17
  private int prevOccupancy_thread_15;//sysj\ECS.sysj line: 30, column: 14
  private int currentOccupancy_thread_15;//sysj\ECS.sysj line: 33, column: 21
  private int zoneOcc_thread_17;//sysj\ECS.sysj line: 9, column: 17
  private int prevOccupancy_thread_19;//sysj\ECS.sysj line: 30, column: 14
  private int currentOccupancy_thread_19;//sysj\ECS.sysj line: 33, column: 21
  private int zoneOcc_thread_21;//sysj\ECS.sysj line: 9, column: 17
  private int prevOccupancy_thread_23;//sysj\ECS.sysj line: 30, column: 14
  private int currentOccupancy_thread_23;//sysj\ECS.sysj line: 33, column: 21
  private int zoneOcc_thread_25;//sysj\ECS.sysj line: 9, column: 17
  private int prevOccupancy_thread_27;//sysj\ECS.sysj line: 30, column: 14
  private int currentOccupancy_thread_27;//sysj\ECS.sysj line: 33, column: 21
  private int zoneOcc_thread_29;//sysj\ECS.sysj line: 9, column: 17
  private int prevOccupancy_thread_31;//sysj\ECS.sysj line: 30, column: 14
  private int currentOccupancy_thread_31;//sysj\ECS.sysj line: 33, column: 21
  private int zoneOcc_thread_33;//sysj\ECS.sysj line: 53, column: 17
  private int prevOccupancy_thread_35;//sysj\ECS.sysj line: 74, column: 14
  private int currentOccupancy_thread_35;//sysj\ECS.sysj line: 77, column: 21
  private int zoneOcc_thread_37;//sysj\ECS.sysj line: 53, column: 17
  private int prevOccupancy_thread_39;//sysj\ECS.sysj line: 74, column: 14
  private int currentOccupancy_thread_39;//sysj\ECS.sysj line: 77, column: 21
  private int zoneOcc_thread_41;//sysj\ECS.sysj line: 53, column: 17
  private int prevOccupancy_thread_43;//sysj\ECS.sysj line: 74, column: 14
  private int currentOccupancy_thread_43;//sysj\ECS.sysj line: 77, column: 21
  private int zoneOcc_thread_45;//sysj\ECS.sysj line: 53, column: 17
  private int prevOccupancy_thread_47;//sysj\ECS.sysj line: 74, column: 14
  private int currentOccupancy_thread_47;//sysj\ECS.sysj line: 77, column: 21
  private int zoneOcc_thread_49;//sysj\ECS.sysj line: 53, column: 17
  private int prevOccupancy_thread_51;//sysj\ECS.sysj line: 74, column: 14
  private int currentOccupancy_thread_51;//sysj\ECS.sysj line: 77, column: 21
  private int zoneOcc_thread_53;//sysj\ECS.sysj line: 53, column: 17
  private int prevOccupancy_thread_55;//sysj\ECS.sysj line: 74, column: 14
  private int currentOccupancy_thread_55;//sysj\ECS.sysj line: 77, column: 21
  private int zoneOcc_thread_57;//sysj\ECS.sysj line: 53, column: 17
  private int prevOccupancy_thread_59;//sysj\ECS.sysj line: 74, column: 14
  private int currentOccupancy_thread_59;//sysj\ECS.sysj line: 77, column: 21
  private int S13550 = 1;
  private int S10130 = 1;
  private int S10080 = 1;
  private int S10084 = 1;
  private int S13548 = 1;
  private int S10374 = 1;
  private int S10168 = 1;
  private int S10167 = 1;
  private int S10148 = 1;
  private int S10171 = 1;
  private int S10191 = 1;
  private int S10174 = 1;
  private int S10618 = 1;
  private int S10412 = 1;
  private int S10411 = 1;
  private int S10392 = 1;
  private int S10415 = 1;
  private int S10435 = 1;
  private int S10862 = 1;
  private int S10656 = 1;
  private int S10655 = 1;
  private int S10636 = 1;
  private int S10659 = 1;
  private int S10679 = 1;
  private int S11106 = 1;
  private int S10900 = 1;
  private int S10899 = 1;
  private int S10880 = 1;
  private int S10903 = 1;
  private int S10923 = 1;
  private int S11350 = 1;
  private int S11144 = 1;
  private int S11143 = 1;
  private int S11124 = 1;
  private int S11147 = 1;
  private int S11167 = 1;
  private int S11594 = 1;
  private int S11388 = 1;
  private int S11387 = 1;
  private int S11368 = 1;
  private int S11391 = 1;
  private int S11411 = 1;
  private int S11838 = 1;
  private int S11632 = 1;
  private int S11631 = 1;
  private int S11612 = 1;
  private int S11635 = 1;
  private int S11655 = 1;
  private int S12082 = 1;
  private int S11876 = 1;
  private int S11875 = 1;
  private int S11856 = 1;
  private int S11879 = 1;
  private int S11899 = 1;
  private int S12326 = 1;
  private int S12120 = 1;
  private int S12119 = 1;
  private int S12100 = 1;
  private int S12123 = 1;
  private int S12143 = 1;
  private int S12570 = 1;
  private int S12364 = 1;
  private int S12363 = 1;
  private int S12344 = 1;
  private int S12367 = 1;
  private int S12387 = 1;
  private int S12814 = 1;
  private int S12608 = 1;
  private int S12607 = 1;
  private int S12588 = 1;
  private int S12611 = 1;
  private int S12631 = 1;
  private int S13058 = 1;
  private int S12852 = 1;
  private int S12851 = 1;
  private int S12832 = 1;
  private int S12855 = 1;
  private int S12875 = 1;
  private int S13302 = 1;
  private int S13096 = 1;
  private int S13095 = 1;
  private int S13076 = 1;
  private int S13099 = 1;
  private int S13119 = 1;
  private int S13546 = 1;
  private int S13340 = 1;
  private int S13339 = 1;
  private int S13320 = 1;
  private int S13343 = 1;
  private int S13363 = 1;
  
  private int[] ends = new int[69];
  private int[] tdone = new int[69];
  
  public void thread23477(int [] tdone, int [] ends){
        S13363=1;
    prevOccupancy_thread_59 = -1;//sysj\ECS.sysj line: 74, column: 14
    currentOccupancy_thread_59 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 77, column: 21
    if(currentOccupancy_thread_59 != prevOccupancy_thread_59 || currentOccupancy_thread_59 == 0 || !afterhrs_1.getprestatus()){//sysj\ECS.sysj line: 78, column: 25
      test_56.setPresent();//sysj\ECS.sysj line: 79, column: 25
      currsigs.addElement(test_56);
      prevOccupancy_thread_59 = currentOccupancy_thread_59;//sysj\ECS.sysj line: 81, column: 21
      active[59]=1;
      ends[59]=1;
      tdone[59]=1;
    }
    else {
      prevOccupancy_thread_59 = currentOccupancy_thread_59;//sysj\ECS.sysj line: 81, column: 21
      active[59]=1;
      ends[59]=1;
      tdone[59]=1;
    }
  }

  public void thread23476(int [] tdone, int [] ends){
        S13343=1;
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread23475(int [] tdone, int [] ends){
        S13340=1;
    zoneOcc_thread_57 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 53, column: 17
    S13339=0;
    if(afterhrs_1.getprestatus() && (zoneOcc_thread_57 == 0)){//sysj\ECS.sysj line: 55, column: 21
      zoneSevenLightingI.setPresent();//sysj\ECS.sysj line: 56, column: 18
      currsigs.addElement(zoneSevenLightingI);
      zoneSevenLightingI.setValue(0);//sysj\ECS.sysj line: 56, column: 18
      S13339=1;
      active[57]=1;
      ends[57]=1;
      tdone[57]=1;
    }
    else {
      if(afterhrs_1.getprestatus() && zoneOcc_thread_57 == 1){//sysj\ECS.sysj line: 57, column: 28
        S13320=0;
        zoneSevenLightingI.setPresent();//sysj\ECS.sysj line: 58, column: 18
        currsigs.addElement(zoneSevenLightingI);
        zoneSevenLightingI.setValue(50);//sysj\ECS.sysj line: 58, column: 18
        zoneSevenLightONOFF.setPresent();//sysj\ECS.sysj line: 59, column: 21
        currsigs.addElement(zoneSevenLightONOFF);
        active[57]=1;
        ends[57]=1;
        tdone[57]=1;
      }
      else {
        S13320=1;
        if(afterhrs_1.getprestatus() && zoneOcc_thread_57 > 1){//sysj\ECS.sysj line: 60, column: 28
          zoneSevenLightingI.setPresent();//sysj\ECS.sysj line: 61, column: 21
          currsigs.addElement(zoneSevenLightingI);
          zoneSevenLightingI.setValue(100);//sysj\ECS.sysj line: 61, column: 21
          zoneSevenLightONOFF.setPresent();//sysj\ECS.sysj line: 62, column: 21
          currsigs.addElement(zoneSevenLightONOFF);
          active[57]=1;
          ends[57]=1;
          tdone[57]=1;
        }
        else {
          S13339=1;
          active[57]=1;
          ends[57]=1;
          tdone[57]=1;
        }
      }
    }
  }

  public void thread23473(int [] tdone, int [] ends){
        S13363=1;
    prevOccupancy_thread_59 = -1;//sysj\ECS.sysj line: 74, column: 14
    currentOccupancy_thread_59 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 77, column: 21
    if(currentOccupancy_thread_59 != prevOccupancy_thread_59 || currentOccupancy_thread_59 == 0 || !afterhrs_1.getprestatus()){//sysj\ECS.sysj line: 78, column: 25
      test_56.setPresent();//sysj\ECS.sysj line: 79, column: 25
      currsigs.addElement(test_56);
      prevOccupancy_thread_59 = currentOccupancy_thread_59;//sysj\ECS.sysj line: 81, column: 21
      active[59]=1;
      ends[59]=1;
      tdone[59]=1;
    }
    else {
      prevOccupancy_thread_59 = currentOccupancy_thread_59;//sysj\ECS.sysj line: 81, column: 21
      active[59]=1;
      ends[59]=1;
      tdone[59]=1;
    }
  }

  public void thread23472(int [] tdone, int [] ends){
        S13343=1;
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread23471(int [] tdone, int [] ends){
        S13340=1;
    zoneOcc_thread_57 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 53, column: 17
    S13339=0;
    if(afterhrs_1.getprestatus() && (zoneOcc_thread_57 == 0)){//sysj\ECS.sysj line: 55, column: 21
      zoneSevenLightingI.setPresent();//sysj\ECS.sysj line: 56, column: 18
      currsigs.addElement(zoneSevenLightingI);
      zoneSevenLightingI.setValue(0);//sysj\ECS.sysj line: 56, column: 18
      S13339=1;
      active[57]=1;
      ends[57]=1;
      tdone[57]=1;
    }
    else {
      if(afterhrs_1.getprestatus() && zoneOcc_thread_57 == 1){//sysj\ECS.sysj line: 57, column: 28
        S13320=0;
        zoneSevenLightingI.setPresent();//sysj\ECS.sysj line: 58, column: 18
        currsigs.addElement(zoneSevenLightingI);
        zoneSevenLightingI.setValue(50);//sysj\ECS.sysj line: 58, column: 18
        zoneSevenLightONOFF.setPresent();//sysj\ECS.sysj line: 59, column: 21
        currsigs.addElement(zoneSevenLightONOFF);
        active[57]=1;
        ends[57]=1;
        tdone[57]=1;
      }
      else {
        S13320=1;
        if(afterhrs_1.getprestatus() && zoneOcc_thread_57 > 1){//sysj\ECS.sysj line: 60, column: 28
          zoneSevenLightingI.setPresent();//sysj\ECS.sysj line: 61, column: 21
          currsigs.addElement(zoneSevenLightingI);
          zoneSevenLightingI.setValue(100);//sysj\ECS.sysj line: 61, column: 21
          zoneSevenLightONOFF.setPresent();//sysj\ECS.sysj line: 62, column: 21
          currsigs.addElement(zoneSevenLightONOFF);
          active[57]=1;
          ends[57]=1;
          tdone[57]=1;
        }
        else {
          S13339=1;
          active[57]=1;
          ends[57]=1;
          tdone[57]=1;
        }
      }
    }
  }

  public void thread23469(int [] tdone, int [] ends){
        switch(S13363){
      case 0 : 
        active[59]=0;
        ends[59]=0;
        tdone[59]=1;
        break;
      
      case 1 : 
        currentOccupancy_thread_59 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 77, column: 21
        if(currentOccupancy_thread_59 != prevOccupancy_thread_59 || currentOccupancy_thread_59 == 0 || !afterhrs_1.getprestatus()){//sysj\ECS.sysj line: 78, column: 25
          test_56.setPresent();//sysj\ECS.sysj line: 79, column: 25
          currsigs.addElement(test_56);
          prevOccupancy_thread_59 = currentOccupancy_thread_59;//sysj\ECS.sysj line: 81, column: 21
          active[59]=1;
          ends[59]=1;
          tdone[59]=1;
        }
        else {
          prevOccupancy_thread_59 = currentOccupancy_thread_59;//sysj\ECS.sysj line: 81, column: 21
          active[59]=1;
          ends[59]=1;
          tdone[59]=1;
        }
        break;
      
    }
  }

  public void thread23468(int [] tdone, int [] ends){
        switch(S13343){
      case 0 : 
        active[58]=0;
        ends[58]=0;
        tdone[58]=1;
        break;
      
      case 1 : 
        if(test_56.getprestatus()){//sysj\ECS.sysj line: 69, column: 23
          ends[58]=2;
          tdone[58]=1;
        }
        else {
          active[58]=1;
          ends[58]=1;
          tdone[58]=1;
        }
        break;
      
    }
  }

  public void thread23467(int [] tdone, int [] ends){
        switch(S13340){
      case 0 : 
        active[57]=0;
        ends[57]=0;
        tdone[57]=1;
        break;
      
      case 1 : 
        switch(S13339){
          case 0 : 
            switch(S13320){
              case 0 : 
                zoneSevenLightONOFF.setPresent();//sysj\ECS.sysj line: 59, column: 21
                currsigs.addElement(zoneSevenLightONOFF);
                active[57]=1;
                ends[57]=1;
                tdone[57]=1;
                break;
              
              case 1 : 
                zoneSevenLightONOFF.setPresent();//sysj\ECS.sysj line: 62, column: 21
                currsigs.addElement(zoneSevenLightONOFF);
                active[57]=1;
                ends[57]=1;
                tdone[57]=1;
                break;
              
            }
            break;
          
          case 1 : 
            S13339=1;
            S13340=0;
            active[57]=0;
            ends[57]=0;
            tdone[57]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread23466(int [] tdone, int [] ends){
        switch(S13546){
      case 0 : 
        active[56]=0;
        ends[56]=0;
        tdone[56]=1;
        break;
      
      case 1 : 
        test_56.setClear();//sysj\ECS.sysj line: 47, column: 5
        thread23467(tdone,ends);
        thread23468(tdone,ends);
        thread23469(tdone,ends);
        int biggest23470 = 0;
        if(ends[57]>=biggest23470){
          biggest23470=ends[57];
        }
        if(ends[58]>=biggest23470){
          biggest23470=ends[58];
        }
        if(ends[59]>=biggest23470){
          biggest23470=ends[59];
        }
        if(biggest23470 == 1){
          active[56]=1;
          ends[56]=1;
          tdone[56]=1;
        }
        if(biggest23470 == 2){
          ends[56]=2;
          ;//sysj\ECS.sysj line: 51, column: 9
          thread23471(tdone,ends);
          thread23472(tdone,ends);
          thread23473(tdone,ends);
          int biggest23474 = 0;
          if(ends[57]>=biggest23474){
            biggest23474=ends[57];
          }
          if(ends[58]>=biggest23474){
            biggest23474=ends[58];
          }
          if(ends[59]>=biggest23474){
            biggest23474=ends[59];
          }
          if(biggest23474 == 1){
            active[56]=1;
            ends[56]=1;
            tdone[56]=1;
          }
        }
        //FINXME code
        if(biggest23470 == 0){
          thread23475(tdone,ends);
          thread23476(tdone,ends);
          thread23477(tdone,ends);
          int biggest23478 = 0;
          if(ends[57]>=biggest23478){
            biggest23478=ends[57];
          }
          if(ends[58]>=biggest23478){
            biggest23478=ends[58];
          }
          if(ends[59]>=biggest23478){
            biggest23478=ends[59];
          }
          if(biggest23478 == 1){
            active[56]=1;
            ends[56]=1;
            tdone[56]=1;
          }
        }
        break;
      
    }
  }

  public void thread23464(int [] tdone, int [] ends){
        S13119=1;
    prevOccupancy_thread_55 = -1;//sysj\ECS.sysj line: 74, column: 14
    currentOccupancy_thread_55 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 77, column: 21
    if(currentOccupancy_thread_55 != prevOccupancy_thread_55 || currentOccupancy_thread_55 == 0 || !afterhrs_1.getprestatus()){//sysj\ECS.sysj line: 78, column: 25
      test_52.setPresent();//sysj\ECS.sysj line: 79, column: 25
      currsigs.addElement(test_52);
      prevOccupancy_thread_55 = currentOccupancy_thread_55;//sysj\ECS.sysj line: 81, column: 21
      active[55]=1;
      ends[55]=1;
      tdone[55]=1;
    }
    else {
      prevOccupancy_thread_55 = currentOccupancy_thread_55;//sysj\ECS.sysj line: 81, column: 21
      active[55]=1;
      ends[55]=1;
      tdone[55]=1;
    }
  }

  public void thread23463(int [] tdone, int [] ends){
        S13099=1;
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread23462(int [] tdone, int [] ends){
        S13096=1;
    zoneOcc_thread_53 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 53, column: 17
    S13095=0;
    if(afterhrs_1.getprestatus() && (zoneOcc_thread_53 == 0)){//sysj\ECS.sysj line: 55, column: 21
      zoneSixLightingI.setPresent();//sysj\ECS.sysj line: 56, column: 18
      currsigs.addElement(zoneSixLightingI);
      zoneSixLightingI.setValue(0);//sysj\ECS.sysj line: 56, column: 18
      S13095=1;
      active[53]=1;
      ends[53]=1;
      tdone[53]=1;
    }
    else {
      if(afterhrs_1.getprestatus() && zoneOcc_thread_53 == 1){//sysj\ECS.sysj line: 57, column: 28
        S13076=0;
        zoneSixLightingI.setPresent();//sysj\ECS.sysj line: 58, column: 18
        currsigs.addElement(zoneSixLightingI);
        zoneSixLightingI.setValue(50);//sysj\ECS.sysj line: 58, column: 18
        zoneSixLightONOFF.setPresent();//sysj\ECS.sysj line: 59, column: 21
        currsigs.addElement(zoneSixLightONOFF);
        active[53]=1;
        ends[53]=1;
        tdone[53]=1;
      }
      else {
        S13076=1;
        if(afterhrs_1.getprestatus() && zoneOcc_thread_53 > 1){//sysj\ECS.sysj line: 60, column: 28
          zoneSixLightingI.setPresent();//sysj\ECS.sysj line: 61, column: 21
          currsigs.addElement(zoneSixLightingI);
          zoneSixLightingI.setValue(100);//sysj\ECS.sysj line: 61, column: 21
          zoneSixLightONOFF.setPresent();//sysj\ECS.sysj line: 62, column: 21
          currsigs.addElement(zoneSixLightONOFF);
          active[53]=1;
          ends[53]=1;
          tdone[53]=1;
        }
        else {
          S13095=1;
          active[53]=1;
          ends[53]=1;
          tdone[53]=1;
        }
      }
    }
  }

  public void thread23460(int [] tdone, int [] ends){
        S13119=1;
    prevOccupancy_thread_55 = -1;//sysj\ECS.sysj line: 74, column: 14
    currentOccupancy_thread_55 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 77, column: 21
    if(currentOccupancy_thread_55 != prevOccupancy_thread_55 || currentOccupancy_thread_55 == 0 || !afterhrs_1.getprestatus()){//sysj\ECS.sysj line: 78, column: 25
      test_52.setPresent();//sysj\ECS.sysj line: 79, column: 25
      currsigs.addElement(test_52);
      prevOccupancy_thread_55 = currentOccupancy_thread_55;//sysj\ECS.sysj line: 81, column: 21
      active[55]=1;
      ends[55]=1;
      tdone[55]=1;
    }
    else {
      prevOccupancy_thread_55 = currentOccupancy_thread_55;//sysj\ECS.sysj line: 81, column: 21
      active[55]=1;
      ends[55]=1;
      tdone[55]=1;
    }
  }

  public void thread23459(int [] tdone, int [] ends){
        S13099=1;
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread23458(int [] tdone, int [] ends){
        S13096=1;
    zoneOcc_thread_53 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 53, column: 17
    S13095=0;
    if(afterhrs_1.getprestatus() && (zoneOcc_thread_53 == 0)){//sysj\ECS.sysj line: 55, column: 21
      zoneSixLightingI.setPresent();//sysj\ECS.sysj line: 56, column: 18
      currsigs.addElement(zoneSixLightingI);
      zoneSixLightingI.setValue(0);//sysj\ECS.sysj line: 56, column: 18
      S13095=1;
      active[53]=1;
      ends[53]=1;
      tdone[53]=1;
    }
    else {
      if(afterhrs_1.getprestatus() && zoneOcc_thread_53 == 1){//sysj\ECS.sysj line: 57, column: 28
        S13076=0;
        zoneSixLightingI.setPresent();//sysj\ECS.sysj line: 58, column: 18
        currsigs.addElement(zoneSixLightingI);
        zoneSixLightingI.setValue(50);//sysj\ECS.sysj line: 58, column: 18
        zoneSixLightONOFF.setPresent();//sysj\ECS.sysj line: 59, column: 21
        currsigs.addElement(zoneSixLightONOFF);
        active[53]=1;
        ends[53]=1;
        tdone[53]=1;
      }
      else {
        S13076=1;
        if(afterhrs_1.getprestatus() && zoneOcc_thread_53 > 1){//sysj\ECS.sysj line: 60, column: 28
          zoneSixLightingI.setPresent();//sysj\ECS.sysj line: 61, column: 21
          currsigs.addElement(zoneSixLightingI);
          zoneSixLightingI.setValue(100);//sysj\ECS.sysj line: 61, column: 21
          zoneSixLightONOFF.setPresent();//sysj\ECS.sysj line: 62, column: 21
          currsigs.addElement(zoneSixLightONOFF);
          active[53]=1;
          ends[53]=1;
          tdone[53]=1;
        }
        else {
          S13095=1;
          active[53]=1;
          ends[53]=1;
          tdone[53]=1;
        }
      }
    }
  }

  public void thread23456(int [] tdone, int [] ends){
        switch(S13119){
      case 0 : 
        active[55]=0;
        ends[55]=0;
        tdone[55]=1;
        break;
      
      case 1 : 
        currentOccupancy_thread_55 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 77, column: 21
        if(currentOccupancy_thread_55 != prevOccupancy_thread_55 || currentOccupancy_thread_55 == 0 || !afterhrs_1.getprestatus()){//sysj\ECS.sysj line: 78, column: 25
          test_52.setPresent();//sysj\ECS.sysj line: 79, column: 25
          currsigs.addElement(test_52);
          prevOccupancy_thread_55 = currentOccupancy_thread_55;//sysj\ECS.sysj line: 81, column: 21
          active[55]=1;
          ends[55]=1;
          tdone[55]=1;
        }
        else {
          prevOccupancy_thread_55 = currentOccupancy_thread_55;//sysj\ECS.sysj line: 81, column: 21
          active[55]=1;
          ends[55]=1;
          tdone[55]=1;
        }
        break;
      
    }
  }

  public void thread23455(int [] tdone, int [] ends){
        switch(S13099){
      case 0 : 
        active[54]=0;
        ends[54]=0;
        tdone[54]=1;
        break;
      
      case 1 : 
        if(test_52.getprestatus()){//sysj\ECS.sysj line: 69, column: 23
          ends[54]=2;
          tdone[54]=1;
        }
        else {
          active[54]=1;
          ends[54]=1;
          tdone[54]=1;
        }
        break;
      
    }
  }

  public void thread23454(int [] tdone, int [] ends){
        switch(S13096){
      case 0 : 
        active[53]=0;
        ends[53]=0;
        tdone[53]=1;
        break;
      
      case 1 : 
        switch(S13095){
          case 0 : 
            switch(S13076){
              case 0 : 
                zoneSixLightONOFF.setPresent();//sysj\ECS.sysj line: 59, column: 21
                currsigs.addElement(zoneSixLightONOFF);
                active[53]=1;
                ends[53]=1;
                tdone[53]=1;
                break;
              
              case 1 : 
                zoneSixLightONOFF.setPresent();//sysj\ECS.sysj line: 62, column: 21
                currsigs.addElement(zoneSixLightONOFF);
                active[53]=1;
                ends[53]=1;
                tdone[53]=1;
                break;
              
            }
            break;
          
          case 1 : 
            S13095=1;
            S13096=0;
            active[53]=0;
            ends[53]=0;
            tdone[53]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread23453(int [] tdone, int [] ends){
        switch(S13302){
      case 0 : 
        active[52]=0;
        ends[52]=0;
        tdone[52]=1;
        break;
      
      case 1 : 
        test_52.setClear();//sysj\ECS.sysj line: 47, column: 5
        thread23454(tdone,ends);
        thread23455(tdone,ends);
        thread23456(tdone,ends);
        int biggest23457 = 0;
        if(ends[53]>=biggest23457){
          biggest23457=ends[53];
        }
        if(ends[54]>=biggest23457){
          biggest23457=ends[54];
        }
        if(ends[55]>=biggest23457){
          biggest23457=ends[55];
        }
        if(biggest23457 == 1){
          active[52]=1;
          ends[52]=1;
          tdone[52]=1;
        }
        if(biggest23457 == 2){
          ends[52]=2;
          ;//sysj\ECS.sysj line: 51, column: 9
          thread23458(tdone,ends);
          thread23459(tdone,ends);
          thread23460(tdone,ends);
          int biggest23461 = 0;
          if(ends[53]>=biggest23461){
            biggest23461=ends[53];
          }
          if(ends[54]>=biggest23461){
            biggest23461=ends[54];
          }
          if(ends[55]>=biggest23461){
            biggest23461=ends[55];
          }
          if(biggest23461 == 1){
            active[52]=1;
            ends[52]=1;
            tdone[52]=1;
          }
        }
        //FINXME code
        if(biggest23457 == 0){
          thread23462(tdone,ends);
          thread23463(tdone,ends);
          thread23464(tdone,ends);
          int biggest23465 = 0;
          if(ends[53]>=biggest23465){
            biggest23465=ends[53];
          }
          if(ends[54]>=biggest23465){
            biggest23465=ends[54];
          }
          if(ends[55]>=biggest23465){
            biggest23465=ends[55];
          }
          if(biggest23465 == 1){
            active[52]=1;
            ends[52]=1;
            tdone[52]=1;
          }
        }
        break;
      
    }
  }

  public void thread23451(int [] tdone, int [] ends){
        S12875=1;
    prevOccupancy_thread_51 = -1;//sysj\ECS.sysj line: 74, column: 14
    currentOccupancy_thread_51 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 77, column: 21
    if(currentOccupancy_thread_51 != prevOccupancy_thread_51 || currentOccupancy_thread_51 == 0 || !afterhrs_1.getprestatus()){//sysj\ECS.sysj line: 78, column: 25
      test_48.setPresent();//sysj\ECS.sysj line: 79, column: 25
      currsigs.addElement(test_48);
      prevOccupancy_thread_51 = currentOccupancy_thread_51;//sysj\ECS.sysj line: 81, column: 21
      active[51]=1;
      ends[51]=1;
      tdone[51]=1;
    }
    else {
      prevOccupancy_thread_51 = currentOccupancy_thread_51;//sysj\ECS.sysj line: 81, column: 21
      active[51]=1;
      ends[51]=1;
      tdone[51]=1;
    }
  }

  public void thread23450(int [] tdone, int [] ends){
        S12855=1;
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread23449(int [] tdone, int [] ends){
        S12852=1;
    zoneOcc_thread_49 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 53, column: 17
    S12851=0;
    if(afterhrs_1.getprestatus() && (zoneOcc_thread_49 == 0)){//sysj\ECS.sysj line: 55, column: 21
      zoneFiveLightingI.setPresent();//sysj\ECS.sysj line: 56, column: 18
      currsigs.addElement(zoneFiveLightingI);
      zoneFiveLightingI.setValue(0);//sysj\ECS.sysj line: 56, column: 18
      S12851=1;
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
    else {
      if(afterhrs_1.getprestatus() && zoneOcc_thread_49 == 1){//sysj\ECS.sysj line: 57, column: 28
        S12832=0;
        zoneFiveLightingI.setPresent();//sysj\ECS.sysj line: 58, column: 18
        currsigs.addElement(zoneFiveLightingI);
        zoneFiveLightingI.setValue(50);//sysj\ECS.sysj line: 58, column: 18
        zoneFiveLightONOFF.setPresent();//sysj\ECS.sysj line: 59, column: 21
        currsigs.addElement(zoneFiveLightONOFF);
        active[49]=1;
        ends[49]=1;
        tdone[49]=1;
      }
      else {
        S12832=1;
        if(afterhrs_1.getprestatus() && zoneOcc_thread_49 > 1){//sysj\ECS.sysj line: 60, column: 28
          zoneFiveLightingI.setPresent();//sysj\ECS.sysj line: 61, column: 21
          currsigs.addElement(zoneFiveLightingI);
          zoneFiveLightingI.setValue(100);//sysj\ECS.sysj line: 61, column: 21
          zoneFiveLightONOFF.setPresent();//sysj\ECS.sysj line: 62, column: 21
          currsigs.addElement(zoneFiveLightONOFF);
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
        else {
          S12851=1;
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
      }
    }
  }

  public void thread23447(int [] tdone, int [] ends){
        S12875=1;
    prevOccupancy_thread_51 = -1;//sysj\ECS.sysj line: 74, column: 14
    currentOccupancy_thread_51 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 77, column: 21
    if(currentOccupancy_thread_51 != prevOccupancy_thread_51 || currentOccupancy_thread_51 == 0 || !afterhrs_1.getprestatus()){//sysj\ECS.sysj line: 78, column: 25
      test_48.setPresent();//sysj\ECS.sysj line: 79, column: 25
      currsigs.addElement(test_48);
      prevOccupancy_thread_51 = currentOccupancy_thread_51;//sysj\ECS.sysj line: 81, column: 21
      active[51]=1;
      ends[51]=1;
      tdone[51]=1;
    }
    else {
      prevOccupancy_thread_51 = currentOccupancy_thread_51;//sysj\ECS.sysj line: 81, column: 21
      active[51]=1;
      ends[51]=1;
      tdone[51]=1;
    }
  }

  public void thread23446(int [] tdone, int [] ends){
        S12855=1;
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread23445(int [] tdone, int [] ends){
        S12852=1;
    zoneOcc_thread_49 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 53, column: 17
    S12851=0;
    if(afterhrs_1.getprestatus() && (zoneOcc_thread_49 == 0)){//sysj\ECS.sysj line: 55, column: 21
      zoneFiveLightingI.setPresent();//sysj\ECS.sysj line: 56, column: 18
      currsigs.addElement(zoneFiveLightingI);
      zoneFiveLightingI.setValue(0);//sysj\ECS.sysj line: 56, column: 18
      S12851=1;
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
    else {
      if(afterhrs_1.getprestatus() && zoneOcc_thread_49 == 1){//sysj\ECS.sysj line: 57, column: 28
        S12832=0;
        zoneFiveLightingI.setPresent();//sysj\ECS.sysj line: 58, column: 18
        currsigs.addElement(zoneFiveLightingI);
        zoneFiveLightingI.setValue(50);//sysj\ECS.sysj line: 58, column: 18
        zoneFiveLightONOFF.setPresent();//sysj\ECS.sysj line: 59, column: 21
        currsigs.addElement(zoneFiveLightONOFF);
        active[49]=1;
        ends[49]=1;
        tdone[49]=1;
      }
      else {
        S12832=1;
        if(afterhrs_1.getprestatus() && zoneOcc_thread_49 > 1){//sysj\ECS.sysj line: 60, column: 28
          zoneFiveLightingI.setPresent();//sysj\ECS.sysj line: 61, column: 21
          currsigs.addElement(zoneFiveLightingI);
          zoneFiveLightingI.setValue(100);//sysj\ECS.sysj line: 61, column: 21
          zoneFiveLightONOFF.setPresent();//sysj\ECS.sysj line: 62, column: 21
          currsigs.addElement(zoneFiveLightONOFF);
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
        else {
          S12851=1;
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
      }
    }
  }

  public void thread23443(int [] tdone, int [] ends){
        switch(S12875){
      case 0 : 
        active[51]=0;
        ends[51]=0;
        tdone[51]=1;
        break;
      
      case 1 : 
        currentOccupancy_thread_51 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 77, column: 21
        if(currentOccupancy_thread_51 != prevOccupancy_thread_51 || currentOccupancy_thread_51 == 0 || !afterhrs_1.getprestatus()){//sysj\ECS.sysj line: 78, column: 25
          test_48.setPresent();//sysj\ECS.sysj line: 79, column: 25
          currsigs.addElement(test_48);
          prevOccupancy_thread_51 = currentOccupancy_thread_51;//sysj\ECS.sysj line: 81, column: 21
          active[51]=1;
          ends[51]=1;
          tdone[51]=1;
        }
        else {
          prevOccupancy_thread_51 = currentOccupancy_thread_51;//sysj\ECS.sysj line: 81, column: 21
          active[51]=1;
          ends[51]=1;
          tdone[51]=1;
        }
        break;
      
    }
  }

  public void thread23442(int [] tdone, int [] ends){
        switch(S12855){
      case 0 : 
        active[50]=0;
        ends[50]=0;
        tdone[50]=1;
        break;
      
      case 1 : 
        if(test_48.getprestatus()){//sysj\ECS.sysj line: 69, column: 23
          ends[50]=2;
          tdone[50]=1;
        }
        else {
          active[50]=1;
          ends[50]=1;
          tdone[50]=1;
        }
        break;
      
    }
  }

  public void thread23441(int [] tdone, int [] ends){
        switch(S12852){
      case 0 : 
        active[49]=0;
        ends[49]=0;
        tdone[49]=1;
        break;
      
      case 1 : 
        switch(S12851){
          case 0 : 
            switch(S12832){
              case 0 : 
                zoneFiveLightONOFF.setPresent();//sysj\ECS.sysj line: 59, column: 21
                currsigs.addElement(zoneFiveLightONOFF);
                active[49]=1;
                ends[49]=1;
                tdone[49]=1;
                break;
              
              case 1 : 
                zoneFiveLightONOFF.setPresent();//sysj\ECS.sysj line: 62, column: 21
                currsigs.addElement(zoneFiveLightONOFF);
                active[49]=1;
                ends[49]=1;
                tdone[49]=1;
                break;
              
            }
            break;
          
          case 1 : 
            S12851=1;
            S12852=0;
            active[49]=0;
            ends[49]=0;
            tdone[49]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread23440(int [] tdone, int [] ends){
        switch(S13058){
      case 0 : 
        active[48]=0;
        ends[48]=0;
        tdone[48]=1;
        break;
      
      case 1 : 
        test_48.setClear();//sysj\ECS.sysj line: 47, column: 5
        thread23441(tdone,ends);
        thread23442(tdone,ends);
        thread23443(tdone,ends);
        int biggest23444 = 0;
        if(ends[49]>=biggest23444){
          biggest23444=ends[49];
        }
        if(ends[50]>=biggest23444){
          biggest23444=ends[50];
        }
        if(ends[51]>=biggest23444){
          biggest23444=ends[51];
        }
        if(biggest23444 == 1){
          active[48]=1;
          ends[48]=1;
          tdone[48]=1;
        }
        if(biggest23444 == 2){
          ends[48]=2;
          ;//sysj\ECS.sysj line: 51, column: 9
          thread23445(tdone,ends);
          thread23446(tdone,ends);
          thread23447(tdone,ends);
          int biggest23448 = 0;
          if(ends[49]>=biggest23448){
            biggest23448=ends[49];
          }
          if(ends[50]>=biggest23448){
            biggest23448=ends[50];
          }
          if(ends[51]>=biggest23448){
            biggest23448=ends[51];
          }
          if(biggest23448 == 1){
            active[48]=1;
            ends[48]=1;
            tdone[48]=1;
          }
        }
        //FINXME code
        if(biggest23444 == 0){
          thread23449(tdone,ends);
          thread23450(tdone,ends);
          thread23451(tdone,ends);
          int biggest23452 = 0;
          if(ends[49]>=biggest23452){
            biggest23452=ends[49];
          }
          if(ends[50]>=biggest23452){
            biggest23452=ends[50];
          }
          if(ends[51]>=biggest23452){
            biggest23452=ends[51];
          }
          if(biggest23452 == 1){
            active[48]=1;
            ends[48]=1;
            tdone[48]=1;
          }
        }
        break;
      
    }
  }

  public void thread23438(int [] tdone, int [] ends){
        S12631=1;
    prevOccupancy_thread_47 = -1;//sysj\ECS.sysj line: 74, column: 14
    currentOccupancy_thread_47 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 77, column: 21
    if(currentOccupancy_thread_47 != prevOccupancy_thread_47 || currentOccupancy_thread_47 == 0 || !afterhrs_1.getprestatus()){//sysj\ECS.sysj line: 78, column: 25
      test_44.setPresent();//sysj\ECS.sysj line: 79, column: 25
      currsigs.addElement(test_44);
      prevOccupancy_thread_47 = currentOccupancy_thread_47;//sysj\ECS.sysj line: 81, column: 21
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
    else {
      prevOccupancy_thread_47 = currentOccupancy_thread_47;//sysj\ECS.sysj line: 81, column: 21
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
  }

  public void thread23437(int [] tdone, int [] ends){
        S12611=1;
    active[46]=1;
    ends[46]=1;
    tdone[46]=1;
  }

  public void thread23436(int [] tdone, int [] ends){
        S12608=1;
    zoneOcc_thread_45 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 53, column: 17
    S12607=0;
    if(afterhrs_1.getprestatus() && (zoneOcc_thread_45 == 0)){//sysj\ECS.sysj line: 55, column: 21
      zoneFourLightingI.setPresent();//sysj\ECS.sysj line: 56, column: 18
      currsigs.addElement(zoneFourLightingI);
      zoneFourLightingI.setValue(0);//sysj\ECS.sysj line: 56, column: 18
      S12607=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      if(afterhrs_1.getprestatus() && zoneOcc_thread_45 == 1){//sysj\ECS.sysj line: 57, column: 28
        S12588=0;
        zoneFourLightingI.setPresent();//sysj\ECS.sysj line: 58, column: 18
        currsigs.addElement(zoneFourLightingI);
        zoneFourLightingI.setValue(50);//sysj\ECS.sysj line: 58, column: 18
        zoneFourLightONOFF.setPresent();//sysj\ECS.sysj line: 59, column: 21
        currsigs.addElement(zoneFourLightONOFF);
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
      else {
        S12588=1;
        if(afterhrs_1.getprestatus() && zoneOcc_thread_45 > 1){//sysj\ECS.sysj line: 60, column: 28
          zoneFourLightingI.setPresent();//sysj\ECS.sysj line: 61, column: 21
          currsigs.addElement(zoneFourLightingI);
          zoneFourLightingI.setValue(100);//sysj\ECS.sysj line: 61, column: 21
          zoneFourLightONOFF.setPresent();//sysj\ECS.sysj line: 62, column: 21
          currsigs.addElement(zoneFourLightONOFF);
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
        else {
          S12607=1;
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
      }
    }
  }

  public void thread23434(int [] tdone, int [] ends){
        S12631=1;
    prevOccupancy_thread_47 = -1;//sysj\ECS.sysj line: 74, column: 14
    currentOccupancy_thread_47 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 77, column: 21
    if(currentOccupancy_thread_47 != prevOccupancy_thread_47 || currentOccupancy_thread_47 == 0 || !afterhrs_1.getprestatus()){//sysj\ECS.sysj line: 78, column: 25
      test_44.setPresent();//sysj\ECS.sysj line: 79, column: 25
      currsigs.addElement(test_44);
      prevOccupancy_thread_47 = currentOccupancy_thread_47;//sysj\ECS.sysj line: 81, column: 21
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
    else {
      prevOccupancy_thread_47 = currentOccupancy_thread_47;//sysj\ECS.sysj line: 81, column: 21
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
  }

  public void thread23433(int [] tdone, int [] ends){
        S12611=1;
    active[46]=1;
    ends[46]=1;
    tdone[46]=1;
  }

  public void thread23432(int [] tdone, int [] ends){
        S12608=1;
    zoneOcc_thread_45 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 53, column: 17
    S12607=0;
    if(afterhrs_1.getprestatus() && (zoneOcc_thread_45 == 0)){//sysj\ECS.sysj line: 55, column: 21
      zoneFourLightingI.setPresent();//sysj\ECS.sysj line: 56, column: 18
      currsigs.addElement(zoneFourLightingI);
      zoneFourLightingI.setValue(0);//sysj\ECS.sysj line: 56, column: 18
      S12607=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      if(afterhrs_1.getprestatus() && zoneOcc_thread_45 == 1){//sysj\ECS.sysj line: 57, column: 28
        S12588=0;
        zoneFourLightingI.setPresent();//sysj\ECS.sysj line: 58, column: 18
        currsigs.addElement(zoneFourLightingI);
        zoneFourLightingI.setValue(50);//sysj\ECS.sysj line: 58, column: 18
        zoneFourLightONOFF.setPresent();//sysj\ECS.sysj line: 59, column: 21
        currsigs.addElement(zoneFourLightONOFF);
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
      else {
        S12588=1;
        if(afterhrs_1.getprestatus() && zoneOcc_thread_45 > 1){//sysj\ECS.sysj line: 60, column: 28
          zoneFourLightingI.setPresent();//sysj\ECS.sysj line: 61, column: 21
          currsigs.addElement(zoneFourLightingI);
          zoneFourLightingI.setValue(100);//sysj\ECS.sysj line: 61, column: 21
          zoneFourLightONOFF.setPresent();//sysj\ECS.sysj line: 62, column: 21
          currsigs.addElement(zoneFourLightONOFF);
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
        else {
          S12607=1;
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
      }
    }
  }

  public void thread23430(int [] tdone, int [] ends){
        switch(S12631){
      case 0 : 
        active[47]=0;
        ends[47]=0;
        tdone[47]=1;
        break;
      
      case 1 : 
        currentOccupancy_thread_47 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 77, column: 21
        if(currentOccupancy_thread_47 != prevOccupancy_thread_47 || currentOccupancy_thread_47 == 0 || !afterhrs_1.getprestatus()){//sysj\ECS.sysj line: 78, column: 25
          test_44.setPresent();//sysj\ECS.sysj line: 79, column: 25
          currsigs.addElement(test_44);
          prevOccupancy_thread_47 = currentOccupancy_thread_47;//sysj\ECS.sysj line: 81, column: 21
          active[47]=1;
          ends[47]=1;
          tdone[47]=1;
        }
        else {
          prevOccupancy_thread_47 = currentOccupancy_thread_47;//sysj\ECS.sysj line: 81, column: 21
          active[47]=1;
          ends[47]=1;
          tdone[47]=1;
        }
        break;
      
    }
  }

  public void thread23429(int [] tdone, int [] ends){
        switch(S12611){
      case 0 : 
        active[46]=0;
        ends[46]=0;
        tdone[46]=1;
        break;
      
      case 1 : 
        if(test_44.getprestatus()){//sysj\ECS.sysj line: 69, column: 23
          ends[46]=2;
          tdone[46]=1;
        }
        else {
          active[46]=1;
          ends[46]=1;
          tdone[46]=1;
        }
        break;
      
    }
  }

  public void thread23428(int [] tdone, int [] ends){
        switch(S12608){
      case 0 : 
        active[45]=0;
        ends[45]=0;
        tdone[45]=1;
        break;
      
      case 1 : 
        switch(S12607){
          case 0 : 
            switch(S12588){
              case 0 : 
                zoneFourLightONOFF.setPresent();//sysj\ECS.sysj line: 59, column: 21
                currsigs.addElement(zoneFourLightONOFF);
                active[45]=1;
                ends[45]=1;
                tdone[45]=1;
                break;
              
              case 1 : 
                zoneFourLightONOFF.setPresent();//sysj\ECS.sysj line: 62, column: 21
                currsigs.addElement(zoneFourLightONOFF);
                active[45]=1;
                ends[45]=1;
                tdone[45]=1;
                break;
              
            }
            break;
          
          case 1 : 
            S12607=1;
            S12608=0;
            active[45]=0;
            ends[45]=0;
            tdone[45]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread23427(int [] tdone, int [] ends){
        switch(S12814){
      case 0 : 
        active[44]=0;
        ends[44]=0;
        tdone[44]=1;
        break;
      
      case 1 : 
        test_44.setClear();//sysj\ECS.sysj line: 47, column: 5
        thread23428(tdone,ends);
        thread23429(tdone,ends);
        thread23430(tdone,ends);
        int biggest23431 = 0;
        if(ends[45]>=biggest23431){
          biggest23431=ends[45];
        }
        if(ends[46]>=biggest23431){
          biggest23431=ends[46];
        }
        if(ends[47]>=biggest23431){
          biggest23431=ends[47];
        }
        if(biggest23431 == 1){
          active[44]=1;
          ends[44]=1;
          tdone[44]=1;
        }
        if(biggest23431 == 2){
          ends[44]=2;
          ;//sysj\ECS.sysj line: 51, column: 9
          thread23432(tdone,ends);
          thread23433(tdone,ends);
          thread23434(tdone,ends);
          int biggest23435 = 0;
          if(ends[45]>=biggest23435){
            biggest23435=ends[45];
          }
          if(ends[46]>=biggest23435){
            biggest23435=ends[46];
          }
          if(ends[47]>=biggest23435){
            biggest23435=ends[47];
          }
          if(biggest23435 == 1){
            active[44]=1;
            ends[44]=1;
            tdone[44]=1;
          }
        }
        //FINXME code
        if(biggest23431 == 0){
          thread23436(tdone,ends);
          thread23437(tdone,ends);
          thread23438(tdone,ends);
          int biggest23439 = 0;
          if(ends[45]>=biggest23439){
            biggest23439=ends[45];
          }
          if(ends[46]>=biggest23439){
            biggest23439=ends[46];
          }
          if(ends[47]>=biggest23439){
            biggest23439=ends[47];
          }
          if(biggest23439 == 1){
            active[44]=1;
            ends[44]=1;
            tdone[44]=1;
          }
        }
        break;
      
    }
  }

  public void thread23425(int [] tdone, int [] ends){
        S12387=1;
    prevOccupancy_thread_43 = -1;//sysj\ECS.sysj line: 74, column: 14
    currentOccupancy_thread_43 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 77, column: 21
    if(currentOccupancy_thread_43 != prevOccupancy_thread_43 || currentOccupancy_thread_43 == 0 || !afterhrs_1.getprestatus()){//sysj\ECS.sysj line: 78, column: 25
      test_40.setPresent();//sysj\ECS.sysj line: 79, column: 25
      currsigs.addElement(test_40);
      prevOccupancy_thread_43 = currentOccupancy_thread_43;//sysj\ECS.sysj line: 81, column: 21
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      prevOccupancy_thread_43 = currentOccupancy_thread_43;//sysj\ECS.sysj line: 81, column: 21
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
  }

  public void thread23424(int [] tdone, int [] ends){
        S12367=1;
    active[42]=1;
    ends[42]=1;
    tdone[42]=1;
  }

  public void thread23423(int [] tdone, int [] ends){
        S12364=1;
    zoneOcc_thread_41 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 53, column: 17
    S12363=0;
    if(afterhrs_1.getprestatus() && (zoneOcc_thread_41 == 0)){//sysj\ECS.sysj line: 55, column: 21
      zoneThreeLightingI.setPresent();//sysj\ECS.sysj line: 56, column: 18
      currsigs.addElement(zoneThreeLightingI);
      zoneThreeLightingI.setValue(0);//sysj\ECS.sysj line: 56, column: 18
      S12363=1;
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
    else {
      if(afterhrs_1.getprestatus() && zoneOcc_thread_41 == 1){//sysj\ECS.sysj line: 57, column: 28
        S12344=0;
        zoneThreeLightingI.setPresent();//sysj\ECS.sysj line: 58, column: 18
        currsigs.addElement(zoneThreeLightingI);
        zoneThreeLightingI.setValue(50);//sysj\ECS.sysj line: 58, column: 18
        zoneThreeLightONOFF.setPresent();//sysj\ECS.sysj line: 59, column: 21
        currsigs.addElement(zoneThreeLightONOFF);
        active[41]=1;
        ends[41]=1;
        tdone[41]=1;
      }
      else {
        S12344=1;
        if(afterhrs_1.getprestatus() && zoneOcc_thread_41 > 1){//sysj\ECS.sysj line: 60, column: 28
          zoneThreeLightingI.setPresent();//sysj\ECS.sysj line: 61, column: 21
          currsigs.addElement(zoneThreeLightingI);
          zoneThreeLightingI.setValue(100);//sysj\ECS.sysj line: 61, column: 21
          zoneThreeLightONOFF.setPresent();//sysj\ECS.sysj line: 62, column: 21
          currsigs.addElement(zoneThreeLightONOFF);
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
        else {
          S12363=1;
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
      }
    }
  }

  public void thread23421(int [] tdone, int [] ends){
        S12387=1;
    prevOccupancy_thread_43 = -1;//sysj\ECS.sysj line: 74, column: 14
    currentOccupancy_thread_43 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 77, column: 21
    if(currentOccupancy_thread_43 != prevOccupancy_thread_43 || currentOccupancy_thread_43 == 0 || !afterhrs_1.getprestatus()){//sysj\ECS.sysj line: 78, column: 25
      test_40.setPresent();//sysj\ECS.sysj line: 79, column: 25
      currsigs.addElement(test_40);
      prevOccupancy_thread_43 = currentOccupancy_thread_43;//sysj\ECS.sysj line: 81, column: 21
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      prevOccupancy_thread_43 = currentOccupancy_thread_43;//sysj\ECS.sysj line: 81, column: 21
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
  }

  public void thread23420(int [] tdone, int [] ends){
        S12367=1;
    active[42]=1;
    ends[42]=1;
    tdone[42]=1;
  }

  public void thread23419(int [] tdone, int [] ends){
        S12364=1;
    zoneOcc_thread_41 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 53, column: 17
    S12363=0;
    if(afterhrs_1.getprestatus() && (zoneOcc_thread_41 == 0)){//sysj\ECS.sysj line: 55, column: 21
      zoneThreeLightingI.setPresent();//sysj\ECS.sysj line: 56, column: 18
      currsigs.addElement(zoneThreeLightingI);
      zoneThreeLightingI.setValue(0);//sysj\ECS.sysj line: 56, column: 18
      S12363=1;
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
    else {
      if(afterhrs_1.getprestatus() && zoneOcc_thread_41 == 1){//sysj\ECS.sysj line: 57, column: 28
        S12344=0;
        zoneThreeLightingI.setPresent();//sysj\ECS.sysj line: 58, column: 18
        currsigs.addElement(zoneThreeLightingI);
        zoneThreeLightingI.setValue(50);//sysj\ECS.sysj line: 58, column: 18
        zoneThreeLightONOFF.setPresent();//sysj\ECS.sysj line: 59, column: 21
        currsigs.addElement(zoneThreeLightONOFF);
        active[41]=1;
        ends[41]=1;
        tdone[41]=1;
      }
      else {
        S12344=1;
        if(afterhrs_1.getprestatus() && zoneOcc_thread_41 > 1){//sysj\ECS.sysj line: 60, column: 28
          zoneThreeLightingI.setPresent();//sysj\ECS.sysj line: 61, column: 21
          currsigs.addElement(zoneThreeLightingI);
          zoneThreeLightingI.setValue(100);//sysj\ECS.sysj line: 61, column: 21
          zoneThreeLightONOFF.setPresent();//sysj\ECS.sysj line: 62, column: 21
          currsigs.addElement(zoneThreeLightONOFF);
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
        else {
          S12363=1;
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
      }
    }
  }

  public void thread23417(int [] tdone, int [] ends){
        switch(S12387){
      case 0 : 
        active[43]=0;
        ends[43]=0;
        tdone[43]=1;
        break;
      
      case 1 : 
        currentOccupancy_thread_43 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 77, column: 21
        if(currentOccupancy_thread_43 != prevOccupancy_thread_43 || currentOccupancy_thread_43 == 0 || !afterhrs_1.getprestatus()){//sysj\ECS.sysj line: 78, column: 25
          test_40.setPresent();//sysj\ECS.sysj line: 79, column: 25
          currsigs.addElement(test_40);
          prevOccupancy_thread_43 = currentOccupancy_thread_43;//sysj\ECS.sysj line: 81, column: 21
          active[43]=1;
          ends[43]=1;
          tdone[43]=1;
        }
        else {
          prevOccupancy_thread_43 = currentOccupancy_thread_43;//sysj\ECS.sysj line: 81, column: 21
          active[43]=1;
          ends[43]=1;
          tdone[43]=1;
        }
        break;
      
    }
  }

  public void thread23416(int [] tdone, int [] ends){
        switch(S12367){
      case 0 : 
        active[42]=0;
        ends[42]=0;
        tdone[42]=1;
        break;
      
      case 1 : 
        if(test_40.getprestatus()){//sysj\ECS.sysj line: 69, column: 23
          ends[42]=2;
          tdone[42]=1;
        }
        else {
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
        break;
      
    }
  }

  public void thread23415(int [] tdone, int [] ends){
        switch(S12364){
      case 0 : 
        active[41]=0;
        ends[41]=0;
        tdone[41]=1;
        break;
      
      case 1 : 
        switch(S12363){
          case 0 : 
            switch(S12344){
              case 0 : 
                zoneThreeLightONOFF.setPresent();//sysj\ECS.sysj line: 59, column: 21
                currsigs.addElement(zoneThreeLightONOFF);
                active[41]=1;
                ends[41]=1;
                tdone[41]=1;
                break;
              
              case 1 : 
                zoneThreeLightONOFF.setPresent();//sysj\ECS.sysj line: 62, column: 21
                currsigs.addElement(zoneThreeLightONOFF);
                active[41]=1;
                ends[41]=1;
                tdone[41]=1;
                break;
              
            }
            break;
          
          case 1 : 
            S12363=1;
            S12364=0;
            active[41]=0;
            ends[41]=0;
            tdone[41]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread23414(int [] tdone, int [] ends){
        switch(S12570){
      case 0 : 
        active[40]=0;
        ends[40]=0;
        tdone[40]=1;
        break;
      
      case 1 : 
        test_40.setClear();//sysj\ECS.sysj line: 47, column: 5
        thread23415(tdone,ends);
        thread23416(tdone,ends);
        thread23417(tdone,ends);
        int biggest23418 = 0;
        if(ends[41]>=biggest23418){
          biggest23418=ends[41];
        }
        if(ends[42]>=biggest23418){
          biggest23418=ends[42];
        }
        if(ends[43]>=biggest23418){
          biggest23418=ends[43];
        }
        if(biggest23418 == 1){
          active[40]=1;
          ends[40]=1;
          tdone[40]=1;
        }
        if(biggest23418 == 2){
          ends[40]=2;
          ;//sysj\ECS.sysj line: 51, column: 9
          thread23419(tdone,ends);
          thread23420(tdone,ends);
          thread23421(tdone,ends);
          int biggest23422 = 0;
          if(ends[41]>=biggest23422){
            biggest23422=ends[41];
          }
          if(ends[42]>=biggest23422){
            biggest23422=ends[42];
          }
          if(ends[43]>=biggest23422){
            biggest23422=ends[43];
          }
          if(biggest23422 == 1){
            active[40]=1;
            ends[40]=1;
            tdone[40]=1;
          }
        }
        //FINXME code
        if(biggest23418 == 0){
          thread23423(tdone,ends);
          thread23424(tdone,ends);
          thread23425(tdone,ends);
          int biggest23426 = 0;
          if(ends[41]>=biggest23426){
            biggest23426=ends[41];
          }
          if(ends[42]>=biggest23426){
            biggest23426=ends[42];
          }
          if(ends[43]>=biggest23426){
            biggest23426=ends[43];
          }
          if(biggest23426 == 1){
            active[40]=1;
            ends[40]=1;
            tdone[40]=1;
          }
        }
        break;
      
    }
  }

  public void thread23412(int [] tdone, int [] ends){
        S12143=1;
    prevOccupancy_thread_39 = -1;//sysj\ECS.sysj line: 74, column: 14
    currentOccupancy_thread_39 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 77, column: 21
    if(currentOccupancy_thread_39 != prevOccupancy_thread_39 || currentOccupancy_thread_39 == 0 || !afterhrs_1.getprestatus()){//sysj\ECS.sysj line: 78, column: 25
      test_36.setPresent();//sysj\ECS.sysj line: 79, column: 25
      currsigs.addElement(test_36);
      prevOccupancy_thread_39 = currentOccupancy_thread_39;//sysj\ECS.sysj line: 81, column: 21
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      prevOccupancy_thread_39 = currentOccupancy_thread_39;//sysj\ECS.sysj line: 81, column: 21
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
  }

  public void thread23411(int [] tdone, int [] ends){
        S12123=1;
    active[38]=1;
    ends[38]=1;
    tdone[38]=1;
  }

  public void thread23410(int [] tdone, int [] ends){
        S12120=1;
    zoneOcc_thread_37 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 53, column: 17
    S12119=0;
    if(afterhrs_1.getprestatus() && (zoneOcc_thread_37 == 0)){//sysj\ECS.sysj line: 55, column: 21
      zoneTwoLightingI.setPresent();//sysj\ECS.sysj line: 56, column: 18
      currsigs.addElement(zoneTwoLightingI);
      zoneTwoLightingI.setValue(0);//sysj\ECS.sysj line: 56, column: 18
      S12119=1;
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      if(afterhrs_1.getprestatus() && zoneOcc_thread_37 == 1){//sysj\ECS.sysj line: 57, column: 28
        S12100=0;
        zoneTwoLightingI.setPresent();//sysj\ECS.sysj line: 58, column: 18
        currsigs.addElement(zoneTwoLightingI);
        zoneTwoLightingI.setValue(50);//sysj\ECS.sysj line: 58, column: 18
        zoneTwoLightONOFF.setPresent();//sysj\ECS.sysj line: 59, column: 21
        currsigs.addElement(zoneTwoLightONOFF);
        active[37]=1;
        ends[37]=1;
        tdone[37]=1;
      }
      else {
        S12100=1;
        if(afterhrs_1.getprestatus() && zoneOcc_thread_37 > 1){//sysj\ECS.sysj line: 60, column: 28
          zoneTwoLightingI.setPresent();//sysj\ECS.sysj line: 61, column: 21
          currsigs.addElement(zoneTwoLightingI);
          zoneTwoLightingI.setValue(100);//sysj\ECS.sysj line: 61, column: 21
          zoneTwoLightONOFF.setPresent();//sysj\ECS.sysj line: 62, column: 21
          currsigs.addElement(zoneTwoLightONOFF);
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
        else {
          S12119=1;
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
      }
    }
  }

  public void thread23408(int [] tdone, int [] ends){
        S12143=1;
    prevOccupancy_thread_39 = -1;//sysj\ECS.sysj line: 74, column: 14
    currentOccupancy_thread_39 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 77, column: 21
    if(currentOccupancy_thread_39 != prevOccupancy_thread_39 || currentOccupancy_thread_39 == 0 || !afterhrs_1.getprestatus()){//sysj\ECS.sysj line: 78, column: 25
      test_36.setPresent();//sysj\ECS.sysj line: 79, column: 25
      currsigs.addElement(test_36);
      prevOccupancy_thread_39 = currentOccupancy_thread_39;//sysj\ECS.sysj line: 81, column: 21
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      prevOccupancy_thread_39 = currentOccupancy_thread_39;//sysj\ECS.sysj line: 81, column: 21
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
  }

  public void thread23407(int [] tdone, int [] ends){
        S12123=1;
    active[38]=1;
    ends[38]=1;
    tdone[38]=1;
  }

  public void thread23406(int [] tdone, int [] ends){
        S12120=1;
    zoneOcc_thread_37 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 53, column: 17
    S12119=0;
    if(afterhrs_1.getprestatus() && (zoneOcc_thread_37 == 0)){//sysj\ECS.sysj line: 55, column: 21
      zoneTwoLightingI.setPresent();//sysj\ECS.sysj line: 56, column: 18
      currsigs.addElement(zoneTwoLightingI);
      zoneTwoLightingI.setValue(0);//sysj\ECS.sysj line: 56, column: 18
      S12119=1;
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      if(afterhrs_1.getprestatus() && zoneOcc_thread_37 == 1){//sysj\ECS.sysj line: 57, column: 28
        S12100=0;
        zoneTwoLightingI.setPresent();//sysj\ECS.sysj line: 58, column: 18
        currsigs.addElement(zoneTwoLightingI);
        zoneTwoLightingI.setValue(50);//sysj\ECS.sysj line: 58, column: 18
        zoneTwoLightONOFF.setPresent();//sysj\ECS.sysj line: 59, column: 21
        currsigs.addElement(zoneTwoLightONOFF);
        active[37]=1;
        ends[37]=1;
        tdone[37]=1;
      }
      else {
        S12100=1;
        if(afterhrs_1.getprestatus() && zoneOcc_thread_37 > 1){//sysj\ECS.sysj line: 60, column: 28
          zoneTwoLightingI.setPresent();//sysj\ECS.sysj line: 61, column: 21
          currsigs.addElement(zoneTwoLightingI);
          zoneTwoLightingI.setValue(100);//sysj\ECS.sysj line: 61, column: 21
          zoneTwoLightONOFF.setPresent();//sysj\ECS.sysj line: 62, column: 21
          currsigs.addElement(zoneTwoLightONOFF);
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
        else {
          S12119=1;
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
      }
    }
  }

  public void thread23404(int [] tdone, int [] ends){
        switch(S12143){
      case 0 : 
        active[39]=0;
        ends[39]=0;
        tdone[39]=1;
        break;
      
      case 1 : 
        currentOccupancy_thread_39 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 77, column: 21
        if(currentOccupancy_thread_39 != prevOccupancy_thread_39 || currentOccupancy_thread_39 == 0 || !afterhrs_1.getprestatus()){//sysj\ECS.sysj line: 78, column: 25
          test_36.setPresent();//sysj\ECS.sysj line: 79, column: 25
          currsigs.addElement(test_36);
          prevOccupancy_thread_39 = currentOccupancy_thread_39;//sysj\ECS.sysj line: 81, column: 21
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
        else {
          prevOccupancy_thread_39 = currentOccupancy_thread_39;//sysj\ECS.sysj line: 81, column: 21
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
        break;
      
    }
  }

  public void thread23403(int [] tdone, int [] ends){
        switch(S12123){
      case 0 : 
        active[38]=0;
        ends[38]=0;
        tdone[38]=1;
        break;
      
      case 1 : 
        if(test_36.getprestatus()){//sysj\ECS.sysj line: 69, column: 23
          ends[38]=2;
          tdone[38]=1;
        }
        else {
          active[38]=1;
          ends[38]=1;
          tdone[38]=1;
        }
        break;
      
    }
  }

  public void thread23402(int [] tdone, int [] ends){
        switch(S12120){
      case 0 : 
        active[37]=0;
        ends[37]=0;
        tdone[37]=1;
        break;
      
      case 1 : 
        switch(S12119){
          case 0 : 
            switch(S12100){
              case 0 : 
                zoneTwoLightONOFF.setPresent();//sysj\ECS.sysj line: 59, column: 21
                currsigs.addElement(zoneTwoLightONOFF);
                active[37]=1;
                ends[37]=1;
                tdone[37]=1;
                break;
              
              case 1 : 
                zoneTwoLightONOFF.setPresent();//sysj\ECS.sysj line: 62, column: 21
                currsigs.addElement(zoneTwoLightONOFF);
                active[37]=1;
                ends[37]=1;
                tdone[37]=1;
                break;
              
            }
            break;
          
          case 1 : 
            S12119=1;
            S12120=0;
            active[37]=0;
            ends[37]=0;
            tdone[37]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread23401(int [] tdone, int [] ends){
        switch(S12326){
      case 0 : 
        active[36]=0;
        ends[36]=0;
        tdone[36]=1;
        break;
      
      case 1 : 
        test_36.setClear();//sysj\ECS.sysj line: 47, column: 5
        thread23402(tdone,ends);
        thread23403(tdone,ends);
        thread23404(tdone,ends);
        int biggest23405 = 0;
        if(ends[37]>=biggest23405){
          biggest23405=ends[37];
        }
        if(ends[38]>=biggest23405){
          biggest23405=ends[38];
        }
        if(ends[39]>=biggest23405){
          biggest23405=ends[39];
        }
        if(biggest23405 == 1){
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        if(biggest23405 == 2){
          ends[36]=2;
          ;//sysj\ECS.sysj line: 51, column: 9
          thread23406(tdone,ends);
          thread23407(tdone,ends);
          thread23408(tdone,ends);
          int biggest23409 = 0;
          if(ends[37]>=biggest23409){
            biggest23409=ends[37];
          }
          if(ends[38]>=biggest23409){
            biggest23409=ends[38];
          }
          if(ends[39]>=biggest23409){
            biggest23409=ends[39];
          }
          if(biggest23409 == 1){
            active[36]=1;
            ends[36]=1;
            tdone[36]=1;
          }
        }
        //FINXME code
        if(biggest23405 == 0){
          thread23410(tdone,ends);
          thread23411(tdone,ends);
          thread23412(tdone,ends);
          int biggest23413 = 0;
          if(ends[37]>=biggest23413){
            biggest23413=ends[37];
          }
          if(ends[38]>=biggest23413){
            biggest23413=ends[38];
          }
          if(ends[39]>=biggest23413){
            biggest23413=ends[39];
          }
          if(biggest23413 == 1){
            active[36]=1;
            ends[36]=1;
            tdone[36]=1;
          }
        }
        break;
      
    }
  }

  public void thread23399(int [] tdone, int [] ends){
        S11899=1;
    prevOccupancy_thread_35 = -1;//sysj\ECS.sysj line: 74, column: 14
    currentOccupancy_thread_35 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 77, column: 21
    if(currentOccupancy_thread_35 != prevOccupancy_thread_35 || currentOccupancy_thread_35 == 0 || !afterhrs_1.getprestatus()){//sysj\ECS.sysj line: 78, column: 25
      test_32.setPresent();//sysj\ECS.sysj line: 79, column: 25
      currsigs.addElement(test_32);
      prevOccupancy_thread_35 = currentOccupancy_thread_35;//sysj\ECS.sysj line: 81, column: 21
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    else {
      prevOccupancy_thread_35 = currentOccupancy_thread_35;//sysj\ECS.sysj line: 81, column: 21
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread23398(int [] tdone, int [] ends){
        S11879=1;
    active[34]=1;
    ends[34]=1;
    tdone[34]=1;
  }

  public void thread23397(int [] tdone, int [] ends){
        S11876=1;
    zoneOcc_thread_33 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 53, column: 17
    S11875=0;
    if(afterhrs_1.getprestatus() && (zoneOcc_thread_33 == 0)){//sysj\ECS.sysj line: 55, column: 21
      zoneOneLightingI.setPresent();//sysj\ECS.sysj line: 56, column: 18
      currsigs.addElement(zoneOneLightingI);
      zoneOneLightingI.setValue(0);//sysj\ECS.sysj line: 56, column: 18
      S11875=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      if(afterhrs_1.getprestatus() && zoneOcc_thread_33 == 1){//sysj\ECS.sysj line: 57, column: 28
        S11856=0;
        zoneOneLightingI.setPresent();//sysj\ECS.sysj line: 58, column: 18
        currsigs.addElement(zoneOneLightingI);
        zoneOneLightingI.setValue(50);//sysj\ECS.sysj line: 58, column: 18
        zoneOneLightONOFF.setPresent();//sysj\ECS.sysj line: 59, column: 21
        currsigs.addElement(zoneOneLightONOFF);
        active[33]=1;
        ends[33]=1;
        tdone[33]=1;
      }
      else {
        S11856=1;
        if(afterhrs_1.getprestatus() && zoneOcc_thread_33 > 1){//sysj\ECS.sysj line: 60, column: 28
          zoneOneLightingI.setPresent();//sysj\ECS.sysj line: 61, column: 21
          currsigs.addElement(zoneOneLightingI);
          zoneOneLightingI.setValue(100);//sysj\ECS.sysj line: 61, column: 21
          zoneOneLightONOFF.setPresent();//sysj\ECS.sysj line: 62, column: 21
          currsigs.addElement(zoneOneLightONOFF);
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
        else {
          S11875=1;
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
      }
    }
  }

  public void thread23395(int [] tdone, int [] ends){
        S11899=1;
    prevOccupancy_thread_35 = -1;//sysj\ECS.sysj line: 74, column: 14
    currentOccupancy_thread_35 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 77, column: 21
    if(currentOccupancy_thread_35 != prevOccupancy_thread_35 || currentOccupancy_thread_35 == 0 || !afterhrs_1.getprestatus()){//sysj\ECS.sysj line: 78, column: 25
      test_32.setPresent();//sysj\ECS.sysj line: 79, column: 25
      currsigs.addElement(test_32);
      prevOccupancy_thread_35 = currentOccupancy_thread_35;//sysj\ECS.sysj line: 81, column: 21
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    else {
      prevOccupancy_thread_35 = currentOccupancy_thread_35;//sysj\ECS.sysj line: 81, column: 21
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread23394(int [] tdone, int [] ends){
        S11879=1;
    active[34]=1;
    ends[34]=1;
    tdone[34]=1;
  }

  public void thread23393(int [] tdone, int [] ends){
        S11876=1;
    zoneOcc_thread_33 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 53, column: 17
    S11875=0;
    if(afterhrs_1.getprestatus() && (zoneOcc_thread_33 == 0)){//sysj\ECS.sysj line: 55, column: 21
      zoneOneLightingI.setPresent();//sysj\ECS.sysj line: 56, column: 18
      currsigs.addElement(zoneOneLightingI);
      zoneOneLightingI.setValue(0);//sysj\ECS.sysj line: 56, column: 18
      S11875=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      if(afterhrs_1.getprestatus() && zoneOcc_thread_33 == 1){//sysj\ECS.sysj line: 57, column: 28
        S11856=0;
        zoneOneLightingI.setPresent();//sysj\ECS.sysj line: 58, column: 18
        currsigs.addElement(zoneOneLightingI);
        zoneOneLightingI.setValue(50);//sysj\ECS.sysj line: 58, column: 18
        zoneOneLightONOFF.setPresent();//sysj\ECS.sysj line: 59, column: 21
        currsigs.addElement(zoneOneLightONOFF);
        active[33]=1;
        ends[33]=1;
        tdone[33]=1;
      }
      else {
        S11856=1;
        if(afterhrs_1.getprestatus() && zoneOcc_thread_33 > 1){//sysj\ECS.sysj line: 60, column: 28
          zoneOneLightingI.setPresent();//sysj\ECS.sysj line: 61, column: 21
          currsigs.addElement(zoneOneLightingI);
          zoneOneLightingI.setValue(100);//sysj\ECS.sysj line: 61, column: 21
          zoneOneLightONOFF.setPresent();//sysj\ECS.sysj line: 62, column: 21
          currsigs.addElement(zoneOneLightONOFF);
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
        else {
          S11875=1;
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
      }
    }
  }

  public void thread23391(int [] tdone, int [] ends){
        switch(S11899){
      case 0 : 
        active[35]=0;
        ends[35]=0;
        tdone[35]=1;
        break;
      
      case 1 : 
        currentOccupancy_thread_35 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 77, column: 21
        if(currentOccupancy_thread_35 != prevOccupancy_thread_35 || currentOccupancy_thread_35 == 0 || !afterhrs_1.getprestatus()){//sysj\ECS.sysj line: 78, column: 25
          test_32.setPresent();//sysj\ECS.sysj line: 79, column: 25
          currsigs.addElement(test_32);
          prevOccupancy_thread_35 = currentOccupancy_thread_35;//sysj\ECS.sysj line: 81, column: 21
          active[35]=1;
          ends[35]=1;
          tdone[35]=1;
        }
        else {
          prevOccupancy_thread_35 = currentOccupancy_thread_35;//sysj\ECS.sysj line: 81, column: 21
          active[35]=1;
          ends[35]=1;
          tdone[35]=1;
        }
        break;
      
    }
  }

  public void thread23390(int [] tdone, int [] ends){
        switch(S11879){
      case 0 : 
        active[34]=0;
        ends[34]=0;
        tdone[34]=1;
        break;
      
      case 1 : 
        if(test_32.getprestatus()){//sysj\ECS.sysj line: 69, column: 23
          ends[34]=2;
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

  public void thread23389(int [] tdone, int [] ends){
        switch(S11876){
      case 0 : 
        active[33]=0;
        ends[33]=0;
        tdone[33]=1;
        break;
      
      case 1 : 
        switch(S11875){
          case 0 : 
            switch(S11856){
              case 0 : 
                zoneOneLightONOFF.setPresent();//sysj\ECS.sysj line: 59, column: 21
                currsigs.addElement(zoneOneLightONOFF);
                active[33]=1;
                ends[33]=1;
                tdone[33]=1;
                break;
              
              case 1 : 
                zoneOneLightONOFF.setPresent();//sysj\ECS.sysj line: 62, column: 21
                currsigs.addElement(zoneOneLightONOFF);
                active[33]=1;
                ends[33]=1;
                tdone[33]=1;
                break;
              
            }
            break;
          
          case 1 : 
            S11875=1;
            S11876=0;
            active[33]=0;
            ends[33]=0;
            tdone[33]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread23388(int [] tdone, int [] ends){
        switch(S12082){
      case 0 : 
        active[32]=0;
        ends[32]=0;
        tdone[32]=1;
        break;
      
      case 1 : 
        test_32.setClear();//sysj\ECS.sysj line: 47, column: 5
        thread23389(tdone,ends);
        thread23390(tdone,ends);
        thread23391(tdone,ends);
        int biggest23392 = 0;
        if(ends[33]>=biggest23392){
          biggest23392=ends[33];
        }
        if(ends[34]>=biggest23392){
          biggest23392=ends[34];
        }
        if(ends[35]>=biggest23392){
          biggest23392=ends[35];
        }
        if(biggest23392 == 1){
          active[32]=1;
          ends[32]=1;
          tdone[32]=1;
        }
        if(biggest23392 == 2){
          ends[32]=2;
          ;//sysj\ECS.sysj line: 51, column: 9
          thread23393(tdone,ends);
          thread23394(tdone,ends);
          thread23395(tdone,ends);
          int biggest23396 = 0;
          if(ends[33]>=biggest23396){
            biggest23396=ends[33];
          }
          if(ends[34]>=biggest23396){
            biggest23396=ends[34];
          }
          if(ends[35]>=biggest23396){
            biggest23396=ends[35];
          }
          if(biggest23396 == 1){
            active[32]=1;
            ends[32]=1;
            tdone[32]=1;
          }
        }
        //FINXME code
        if(biggest23392 == 0){
          thread23397(tdone,ends);
          thread23398(tdone,ends);
          thread23399(tdone,ends);
          int biggest23400 = 0;
          if(ends[33]>=biggest23400){
            biggest23400=ends[33];
          }
          if(ends[34]>=biggest23400){
            biggest23400=ends[34];
          }
          if(ends[35]>=biggest23400){
            biggest23400=ends[35];
          }
          if(biggest23400 == 1){
            active[32]=1;
            ends[32]=1;
            tdone[32]=1;
          }
        }
        break;
      
    }
  }

  public void thread23386(int [] tdone, int [] ends){
        S11655=1;
    prevOccupancy_thread_31 = -1;//sysj\ECS.sysj line: 30, column: 14
    currentOccupancy_thread_31 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 33, column: 21
    if(currentOccupancy_thread_31 != prevOccupancy_thread_31 || currentOccupancy_thread_31 == 0 || !workhrs_1.getprestatus()){//sysj\ECS.sysj line: 34, column: 25
      test_28.setPresent();//sysj\ECS.sysj line: 35, column: 25
      currsigs.addElement(test_28);
      prevOccupancy_thread_31 = currentOccupancy_thread_31;//sysj\ECS.sysj line: 37, column: 21
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
    else {
      prevOccupancy_thread_31 = currentOccupancy_thread_31;//sysj\ECS.sysj line: 37, column: 21
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
  }

  public void thread23385(int [] tdone, int [] ends){
        S11635=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread23384(int [] tdone, int [] ends){
        S11632=1;
    zoneOcc_thread_29 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 9, column: 17
    S11631=0;
    if(workhrs_1.getprestatus() && (zoneOcc_thread_29 == 0)){//sysj\ECS.sysj line: 11, column: 21
      zoneSevenLightingI.setPresent();//sysj\ECS.sysj line: 12, column: 18
      currsigs.addElement(zoneSevenLightingI);
      zoneSevenLightingI.setValue(0);//sysj\ECS.sysj line: 12, column: 18
      S11631=1;
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
    else {
      if(workhrs_1.getprestatus() && zoneOcc_thread_29 == 1){//sysj\ECS.sysj line: 13, column: 28
        S11612=0;
        zoneSevenLightingI.setPresent();//sysj\ECS.sysj line: 14, column: 18
        currsigs.addElement(zoneSevenLightingI);
        zoneSevenLightingI.setValue(50);//sysj\ECS.sysj line: 14, column: 18
        zoneSevenWindowONOFF.setPresent();//sysj\ECS.sysj line: 15, column: 21
        currsigs.addElement(zoneSevenWindowONOFF);
        active[29]=1;
        ends[29]=1;
        tdone[29]=1;
      }
      else {
        S11612=1;
        if(workhrs_1.getprestatus() && zoneOcc_thread_29 > 1){//sysj\ECS.sysj line: 16, column: 28
          zoneSevenLightingI.setPresent();//sysj\ECS.sysj line: 17, column: 21
          currsigs.addElement(zoneSevenLightingI);
          zoneSevenLightingI.setValue(100);//sysj\ECS.sysj line: 17, column: 21
          zoneSevenWindowONOFF.setPresent();//sysj\ECS.sysj line: 18, column: 21
          currsigs.addElement(zoneSevenWindowONOFF);
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
        else {
          S11631=1;
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
      }
    }
  }

  public void thread23382(int [] tdone, int [] ends){
        S11655=1;
    prevOccupancy_thread_31 = -1;//sysj\ECS.sysj line: 30, column: 14
    currentOccupancy_thread_31 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 33, column: 21
    if(currentOccupancy_thread_31 != prevOccupancy_thread_31 || currentOccupancy_thread_31 == 0 || !workhrs_1.getprestatus()){//sysj\ECS.sysj line: 34, column: 25
      test_28.setPresent();//sysj\ECS.sysj line: 35, column: 25
      currsigs.addElement(test_28);
      prevOccupancy_thread_31 = currentOccupancy_thread_31;//sysj\ECS.sysj line: 37, column: 21
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
    else {
      prevOccupancy_thread_31 = currentOccupancy_thread_31;//sysj\ECS.sysj line: 37, column: 21
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
  }

  public void thread23381(int [] tdone, int [] ends){
        S11635=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread23380(int [] tdone, int [] ends){
        S11632=1;
    zoneOcc_thread_29 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 9, column: 17
    S11631=0;
    if(workhrs_1.getprestatus() && (zoneOcc_thread_29 == 0)){//sysj\ECS.sysj line: 11, column: 21
      zoneSevenLightingI.setPresent();//sysj\ECS.sysj line: 12, column: 18
      currsigs.addElement(zoneSevenLightingI);
      zoneSevenLightingI.setValue(0);//sysj\ECS.sysj line: 12, column: 18
      S11631=1;
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
    else {
      if(workhrs_1.getprestatus() && zoneOcc_thread_29 == 1){//sysj\ECS.sysj line: 13, column: 28
        S11612=0;
        zoneSevenLightingI.setPresent();//sysj\ECS.sysj line: 14, column: 18
        currsigs.addElement(zoneSevenLightingI);
        zoneSevenLightingI.setValue(50);//sysj\ECS.sysj line: 14, column: 18
        zoneSevenWindowONOFF.setPresent();//sysj\ECS.sysj line: 15, column: 21
        currsigs.addElement(zoneSevenWindowONOFF);
        active[29]=1;
        ends[29]=1;
        tdone[29]=1;
      }
      else {
        S11612=1;
        if(workhrs_1.getprestatus() && zoneOcc_thread_29 > 1){//sysj\ECS.sysj line: 16, column: 28
          zoneSevenLightingI.setPresent();//sysj\ECS.sysj line: 17, column: 21
          currsigs.addElement(zoneSevenLightingI);
          zoneSevenLightingI.setValue(100);//sysj\ECS.sysj line: 17, column: 21
          zoneSevenWindowONOFF.setPresent();//sysj\ECS.sysj line: 18, column: 21
          currsigs.addElement(zoneSevenWindowONOFF);
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
        else {
          S11631=1;
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
      }
    }
  }

  public void thread23378(int [] tdone, int [] ends){
        switch(S11655){
      case 0 : 
        active[31]=0;
        ends[31]=0;
        tdone[31]=1;
        break;
      
      case 1 : 
        currentOccupancy_thread_31 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 33, column: 21
        if(currentOccupancy_thread_31 != prevOccupancy_thread_31 || currentOccupancy_thread_31 == 0 || !workhrs_1.getprestatus()){//sysj\ECS.sysj line: 34, column: 25
          test_28.setPresent();//sysj\ECS.sysj line: 35, column: 25
          currsigs.addElement(test_28);
          prevOccupancy_thread_31 = currentOccupancy_thread_31;//sysj\ECS.sysj line: 37, column: 21
          active[31]=1;
          ends[31]=1;
          tdone[31]=1;
        }
        else {
          prevOccupancy_thread_31 = currentOccupancy_thread_31;//sysj\ECS.sysj line: 37, column: 21
          active[31]=1;
          ends[31]=1;
          tdone[31]=1;
        }
        break;
      
    }
  }

  public void thread23377(int [] tdone, int [] ends){
        switch(S11635){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        if(test_28.getprestatus()){//sysj\ECS.sysj line: 25, column: 23
          ends[30]=2;
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

  public void thread23376(int [] tdone, int [] ends){
        switch(S11632){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        switch(S11631){
          case 0 : 
            switch(S11612){
              case 0 : 
                zoneSevenWindowONOFF.setPresent();//sysj\ECS.sysj line: 15, column: 21
                currsigs.addElement(zoneSevenWindowONOFF);
                active[29]=1;
                ends[29]=1;
                tdone[29]=1;
                break;
              
              case 1 : 
                zoneSevenWindowONOFF.setPresent();//sysj\ECS.sysj line: 18, column: 21
                currsigs.addElement(zoneSevenWindowONOFF);
                active[29]=1;
                ends[29]=1;
                tdone[29]=1;
                break;
              
            }
            break;
          
          case 1 : 
            S11631=1;
            S11632=0;
            active[29]=0;
            ends[29]=0;
            tdone[29]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread23375(int [] tdone, int [] ends){
        switch(S11838){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        test_28.setClear();//sysj\ECS.sysj line: 3, column: 5
        thread23376(tdone,ends);
        thread23377(tdone,ends);
        thread23378(tdone,ends);
        int biggest23379 = 0;
        if(ends[29]>=biggest23379){
          biggest23379=ends[29];
        }
        if(ends[30]>=biggest23379){
          biggest23379=ends[30];
        }
        if(ends[31]>=biggest23379){
          biggest23379=ends[31];
        }
        if(biggest23379 == 1){
          active[28]=1;
          ends[28]=1;
          tdone[28]=1;
        }
        if(biggest23379 == 2){
          ends[28]=2;
          ;//sysj\ECS.sysj line: 7, column: 9
          thread23380(tdone,ends);
          thread23381(tdone,ends);
          thread23382(tdone,ends);
          int biggest23383 = 0;
          if(ends[29]>=biggest23383){
            biggest23383=ends[29];
          }
          if(ends[30]>=biggest23383){
            biggest23383=ends[30];
          }
          if(ends[31]>=biggest23383){
            biggest23383=ends[31];
          }
          if(biggest23383 == 1){
            active[28]=1;
            ends[28]=1;
            tdone[28]=1;
          }
        }
        //FINXME code
        if(biggest23379 == 0){
          thread23384(tdone,ends);
          thread23385(tdone,ends);
          thread23386(tdone,ends);
          int biggest23387 = 0;
          if(ends[29]>=biggest23387){
            biggest23387=ends[29];
          }
          if(ends[30]>=biggest23387){
            biggest23387=ends[30];
          }
          if(ends[31]>=biggest23387){
            biggest23387=ends[31];
          }
          if(biggest23387 == 1){
            active[28]=1;
            ends[28]=1;
            tdone[28]=1;
          }
        }
        break;
      
    }
  }

  public void thread23373(int [] tdone, int [] ends){
        S11411=1;
    prevOccupancy_thread_27 = -1;//sysj\ECS.sysj line: 30, column: 14
    currentOccupancy_thread_27 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 33, column: 21
    if(currentOccupancy_thread_27 != prevOccupancy_thread_27 || currentOccupancy_thread_27 == 0 || !workhrs_1.getprestatus()){//sysj\ECS.sysj line: 34, column: 25
      test_24.setPresent();//sysj\ECS.sysj line: 35, column: 25
      currsigs.addElement(test_24);
      prevOccupancy_thread_27 = currentOccupancy_thread_27;//sysj\ECS.sysj line: 37, column: 21
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
    else {
      prevOccupancy_thread_27 = currentOccupancy_thread_27;//sysj\ECS.sysj line: 37, column: 21
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread23372(int [] tdone, int [] ends){
        S11391=1;
    active[26]=1;
    ends[26]=1;
    tdone[26]=1;
  }

  public void thread23371(int [] tdone, int [] ends){
        S11388=1;
    zoneOcc_thread_25 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 9, column: 17
    S11387=0;
    if(workhrs_1.getprestatus() && (zoneOcc_thread_25 == 0)){//sysj\ECS.sysj line: 11, column: 21
      zoneSixLightingI.setPresent();//sysj\ECS.sysj line: 12, column: 18
      currsigs.addElement(zoneSixLightingI);
      zoneSixLightingI.setValue(0);//sysj\ECS.sysj line: 12, column: 18
      S11387=1;
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    else {
      if(workhrs_1.getprestatus() && zoneOcc_thread_25 == 1){//sysj\ECS.sysj line: 13, column: 28
        S11368=0;
        zoneSixLightingI.setPresent();//sysj\ECS.sysj line: 14, column: 18
        currsigs.addElement(zoneSixLightingI);
        zoneSixLightingI.setValue(50);//sysj\ECS.sysj line: 14, column: 18
        zoneSixWindowONOFF.setPresent();//sysj\ECS.sysj line: 15, column: 21
        currsigs.addElement(zoneSixWindowONOFF);
        active[25]=1;
        ends[25]=1;
        tdone[25]=1;
      }
      else {
        S11368=1;
        if(workhrs_1.getprestatus() && zoneOcc_thread_25 > 1){//sysj\ECS.sysj line: 16, column: 28
          zoneSixLightingI.setPresent();//sysj\ECS.sysj line: 17, column: 21
          currsigs.addElement(zoneSixLightingI);
          zoneSixLightingI.setValue(100);//sysj\ECS.sysj line: 17, column: 21
          zoneSixWindowONOFF.setPresent();//sysj\ECS.sysj line: 18, column: 21
          currsigs.addElement(zoneSixWindowONOFF);
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
        else {
          S11387=1;
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
      }
    }
  }

  public void thread23369(int [] tdone, int [] ends){
        S11411=1;
    prevOccupancy_thread_27 = -1;//sysj\ECS.sysj line: 30, column: 14
    currentOccupancy_thread_27 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 33, column: 21
    if(currentOccupancy_thread_27 != prevOccupancy_thread_27 || currentOccupancy_thread_27 == 0 || !workhrs_1.getprestatus()){//sysj\ECS.sysj line: 34, column: 25
      test_24.setPresent();//sysj\ECS.sysj line: 35, column: 25
      currsigs.addElement(test_24);
      prevOccupancy_thread_27 = currentOccupancy_thread_27;//sysj\ECS.sysj line: 37, column: 21
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
    else {
      prevOccupancy_thread_27 = currentOccupancy_thread_27;//sysj\ECS.sysj line: 37, column: 21
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread23368(int [] tdone, int [] ends){
        S11391=1;
    active[26]=1;
    ends[26]=1;
    tdone[26]=1;
  }

  public void thread23367(int [] tdone, int [] ends){
        S11388=1;
    zoneOcc_thread_25 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 9, column: 17
    S11387=0;
    if(workhrs_1.getprestatus() && (zoneOcc_thread_25 == 0)){//sysj\ECS.sysj line: 11, column: 21
      zoneSixLightingI.setPresent();//sysj\ECS.sysj line: 12, column: 18
      currsigs.addElement(zoneSixLightingI);
      zoneSixLightingI.setValue(0);//sysj\ECS.sysj line: 12, column: 18
      S11387=1;
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    else {
      if(workhrs_1.getprestatus() && zoneOcc_thread_25 == 1){//sysj\ECS.sysj line: 13, column: 28
        S11368=0;
        zoneSixLightingI.setPresent();//sysj\ECS.sysj line: 14, column: 18
        currsigs.addElement(zoneSixLightingI);
        zoneSixLightingI.setValue(50);//sysj\ECS.sysj line: 14, column: 18
        zoneSixWindowONOFF.setPresent();//sysj\ECS.sysj line: 15, column: 21
        currsigs.addElement(zoneSixWindowONOFF);
        active[25]=1;
        ends[25]=1;
        tdone[25]=1;
      }
      else {
        S11368=1;
        if(workhrs_1.getprestatus() && zoneOcc_thread_25 > 1){//sysj\ECS.sysj line: 16, column: 28
          zoneSixLightingI.setPresent();//sysj\ECS.sysj line: 17, column: 21
          currsigs.addElement(zoneSixLightingI);
          zoneSixLightingI.setValue(100);//sysj\ECS.sysj line: 17, column: 21
          zoneSixWindowONOFF.setPresent();//sysj\ECS.sysj line: 18, column: 21
          currsigs.addElement(zoneSixWindowONOFF);
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
        else {
          S11387=1;
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
      }
    }
  }

  public void thread23365(int [] tdone, int [] ends){
        switch(S11411){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        currentOccupancy_thread_27 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 33, column: 21
        if(currentOccupancy_thread_27 != prevOccupancy_thread_27 || currentOccupancy_thread_27 == 0 || !workhrs_1.getprestatus()){//sysj\ECS.sysj line: 34, column: 25
          test_24.setPresent();//sysj\ECS.sysj line: 35, column: 25
          currsigs.addElement(test_24);
          prevOccupancy_thread_27 = currentOccupancy_thread_27;//sysj\ECS.sysj line: 37, column: 21
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
        else {
          prevOccupancy_thread_27 = currentOccupancy_thread_27;//sysj\ECS.sysj line: 37, column: 21
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
        break;
      
    }
  }

  public void thread23364(int [] tdone, int [] ends){
        switch(S11391){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        if(test_24.getprestatus()){//sysj\ECS.sysj line: 25, column: 23
          ends[26]=2;
          tdone[26]=1;
        }
        else {
          active[26]=1;
          ends[26]=1;
          tdone[26]=1;
        }
        break;
      
    }
  }

  public void thread23363(int [] tdone, int [] ends){
        switch(S11388){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        switch(S11387){
          case 0 : 
            switch(S11368){
              case 0 : 
                zoneSixWindowONOFF.setPresent();//sysj\ECS.sysj line: 15, column: 21
                currsigs.addElement(zoneSixWindowONOFF);
                active[25]=1;
                ends[25]=1;
                tdone[25]=1;
                break;
              
              case 1 : 
                zoneSixWindowONOFF.setPresent();//sysj\ECS.sysj line: 18, column: 21
                currsigs.addElement(zoneSixWindowONOFF);
                active[25]=1;
                ends[25]=1;
                tdone[25]=1;
                break;
              
            }
            break;
          
          case 1 : 
            S11387=1;
            S11388=0;
            active[25]=0;
            ends[25]=0;
            tdone[25]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread23362(int [] tdone, int [] ends){
        switch(S11594){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        test_24.setClear();//sysj\ECS.sysj line: 3, column: 5
        thread23363(tdone,ends);
        thread23364(tdone,ends);
        thread23365(tdone,ends);
        int biggest23366 = 0;
        if(ends[25]>=biggest23366){
          biggest23366=ends[25];
        }
        if(ends[26]>=biggest23366){
          biggest23366=ends[26];
        }
        if(ends[27]>=biggest23366){
          biggest23366=ends[27];
        }
        if(biggest23366 == 1){
          active[24]=1;
          ends[24]=1;
          tdone[24]=1;
        }
        if(biggest23366 == 2){
          ends[24]=2;
          ;//sysj\ECS.sysj line: 7, column: 9
          thread23367(tdone,ends);
          thread23368(tdone,ends);
          thread23369(tdone,ends);
          int biggest23370 = 0;
          if(ends[25]>=biggest23370){
            biggest23370=ends[25];
          }
          if(ends[26]>=biggest23370){
            biggest23370=ends[26];
          }
          if(ends[27]>=biggest23370){
            biggest23370=ends[27];
          }
          if(biggest23370 == 1){
            active[24]=1;
            ends[24]=1;
            tdone[24]=1;
          }
        }
        //FINXME code
        if(biggest23366 == 0){
          thread23371(tdone,ends);
          thread23372(tdone,ends);
          thread23373(tdone,ends);
          int biggest23374 = 0;
          if(ends[25]>=biggest23374){
            biggest23374=ends[25];
          }
          if(ends[26]>=biggest23374){
            biggest23374=ends[26];
          }
          if(ends[27]>=biggest23374){
            biggest23374=ends[27];
          }
          if(biggest23374 == 1){
            active[24]=1;
            ends[24]=1;
            tdone[24]=1;
          }
        }
        break;
      
    }
  }

  public void thread23360(int [] tdone, int [] ends){
        S11167=1;
    prevOccupancy_thread_23 = -1;//sysj\ECS.sysj line: 30, column: 14
    currentOccupancy_thread_23 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 33, column: 21
    if(currentOccupancy_thread_23 != prevOccupancy_thread_23 || currentOccupancy_thread_23 == 0 || !workhrs_1.getprestatus()){//sysj\ECS.sysj line: 34, column: 25
      test_20.setPresent();//sysj\ECS.sysj line: 35, column: 25
      currsigs.addElement(test_20);
      prevOccupancy_thread_23 = currentOccupancy_thread_23;//sysj\ECS.sysj line: 37, column: 21
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      prevOccupancy_thread_23 = currentOccupancy_thread_23;//sysj\ECS.sysj line: 37, column: 21
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
  }

  public void thread23359(int [] tdone, int [] ends){
        S11147=1;
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread23358(int [] tdone, int [] ends){
        S11144=1;
    zoneOcc_thread_21 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 9, column: 17
    S11143=0;
    if(workhrs_1.getprestatus() && (zoneOcc_thread_21 == 0)){//sysj\ECS.sysj line: 11, column: 21
      zoneFiveLightingI.setPresent();//sysj\ECS.sysj line: 12, column: 18
      currsigs.addElement(zoneFiveLightingI);
      zoneFiveLightingI.setValue(0);//sysj\ECS.sysj line: 12, column: 18
      S11143=1;
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    else {
      if(workhrs_1.getprestatus() && zoneOcc_thread_21 == 1){//sysj\ECS.sysj line: 13, column: 28
        S11124=0;
        zoneFiveLightingI.setPresent();//sysj\ECS.sysj line: 14, column: 18
        currsigs.addElement(zoneFiveLightingI);
        zoneFiveLightingI.setValue(50);//sysj\ECS.sysj line: 14, column: 18
        zoneFiveWindowONOFF.setPresent();//sysj\ECS.sysj line: 15, column: 21
        currsigs.addElement(zoneFiveWindowONOFF);
        active[21]=1;
        ends[21]=1;
        tdone[21]=1;
      }
      else {
        S11124=1;
        if(workhrs_1.getprestatus() && zoneOcc_thread_21 > 1){//sysj\ECS.sysj line: 16, column: 28
          zoneFiveLightingI.setPresent();//sysj\ECS.sysj line: 17, column: 21
          currsigs.addElement(zoneFiveLightingI);
          zoneFiveLightingI.setValue(100);//sysj\ECS.sysj line: 17, column: 21
          zoneFiveWindowONOFF.setPresent();//sysj\ECS.sysj line: 18, column: 21
          currsigs.addElement(zoneFiveWindowONOFF);
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        else {
          S11143=1;
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
      }
    }
  }

  public void thread23356(int [] tdone, int [] ends){
        S11167=1;
    prevOccupancy_thread_23 = -1;//sysj\ECS.sysj line: 30, column: 14
    currentOccupancy_thread_23 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 33, column: 21
    if(currentOccupancy_thread_23 != prevOccupancy_thread_23 || currentOccupancy_thread_23 == 0 || !workhrs_1.getprestatus()){//sysj\ECS.sysj line: 34, column: 25
      test_20.setPresent();//sysj\ECS.sysj line: 35, column: 25
      currsigs.addElement(test_20);
      prevOccupancy_thread_23 = currentOccupancy_thread_23;//sysj\ECS.sysj line: 37, column: 21
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      prevOccupancy_thread_23 = currentOccupancy_thread_23;//sysj\ECS.sysj line: 37, column: 21
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
  }

  public void thread23355(int [] tdone, int [] ends){
        S11147=1;
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread23354(int [] tdone, int [] ends){
        S11144=1;
    zoneOcc_thread_21 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 9, column: 17
    S11143=0;
    if(workhrs_1.getprestatus() && (zoneOcc_thread_21 == 0)){//sysj\ECS.sysj line: 11, column: 21
      zoneFiveLightingI.setPresent();//sysj\ECS.sysj line: 12, column: 18
      currsigs.addElement(zoneFiveLightingI);
      zoneFiveLightingI.setValue(0);//sysj\ECS.sysj line: 12, column: 18
      S11143=1;
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    else {
      if(workhrs_1.getprestatus() && zoneOcc_thread_21 == 1){//sysj\ECS.sysj line: 13, column: 28
        S11124=0;
        zoneFiveLightingI.setPresent();//sysj\ECS.sysj line: 14, column: 18
        currsigs.addElement(zoneFiveLightingI);
        zoneFiveLightingI.setValue(50);//sysj\ECS.sysj line: 14, column: 18
        zoneFiveWindowONOFF.setPresent();//sysj\ECS.sysj line: 15, column: 21
        currsigs.addElement(zoneFiveWindowONOFF);
        active[21]=1;
        ends[21]=1;
        tdone[21]=1;
      }
      else {
        S11124=1;
        if(workhrs_1.getprestatus() && zoneOcc_thread_21 > 1){//sysj\ECS.sysj line: 16, column: 28
          zoneFiveLightingI.setPresent();//sysj\ECS.sysj line: 17, column: 21
          currsigs.addElement(zoneFiveLightingI);
          zoneFiveLightingI.setValue(100);//sysj\ECS.sysj line: 17, column: 21
          zoneFiveWindowONOFF.setPresent();//sysj\ECS.sysj line: 18, column: 21
          currsigs.addElement(zoneFiveWindowONOFF);
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        else {
          S11143=1;
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
      }
    }
  }

  public void thread23352(int [] tdone, int [] ends){
        switch(S11167){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        currentOccupancy_thread_23 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 33, column: 21
        if(currentOccupancy_thread_23 != prevOccupancy_thread_23 || currentOccupancy_thread_23 == 0 || !workhrs_1.getprestatus()){//sysj\ECS.sysj line: 34, column: 25
          test_20.setPresent();//sysj\ECS.sysj line: 35, column: 25
          currsigs.addElement(test_20);
          prevOccupancy_thread_23 = currentOccupancy_thread_23;//sysj\ECS.sysj line: 37, column: 21
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
        else {
          prevOccupancy_thread_23 = currentOccupancy_thread_23;//sysj\ECS.sysj line: 37, column: 21
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
        break;
      
    }
  }

  public void thread23351(int [] tdone, int [] ends){
        switch(S11147){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        if(test_20.getprestatus()){//sysj\ECS.sysj line: 25, column: 23
          ends[22]=2;
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

  public void thread23350(int [] tdone, int [] ends){
        switch(S11144){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        switch(S11143){
          case 0 : 
            switch(S11124){
              case 0 : 
                zoneFiveWindowONOFF.setPresent();//sysj\ECS.sysj line: 15, column: 21
                currsigs.addElement(zoneFiveWindowONOFF);
                active[21]=1;
                ends[21]=1;
                tdone[21]=1;
                break;
              
              case 1 : 
                zoneFiveWindowONOFF.setPresent();//sysj\ECS.sysj line: 18, column: 21
                currsigs.addElement(zoneFiveWindowONOFF);
                active[21]=1;
                ends[21]=1;
                tdone[21]=1;
                break;
              
            }
            break;
          
          case 1 : 
            S11143=1;
            S11144=0;
            active[21]=0;
            ends[21]=0;
            tdone[21]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread23349(int [] tdone, int [] ends){
        switch(S11350){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        test_20.setClear();//sysj\ECS.sysj line: 3, column: 5
        thread23350(tdone,ends);
        thread23351(tdone,ends);
        thread23352(tdone,ends);
        int biggest23353 = 0;
        if(ends[21]>=biggest23353){
          biggest23353=ends[21];
        }
        if(ends[22]>=biggest23353){
          biggest23353=ends[22];
        }
        if(ends[23]>=biggest23353){
          biggest23353=ends[23];
        }
        if(biggest23353 == 1){
          active[20]=1;
          ends[20]=1;
          tdone[20]=1;
        }
        if(biggest23353 == 2){
          ends[20]=2;
          ;//sysj\ECS.sysj line: 7, column: 9
          thread23354(tdone,ends);
          thread23355(tdone,ends);
          thread23356(tdone,ends);
          int biggest23357 = 0;
          if(ends[21]>=biggest23357){
            biggest23357=ends[21];
          }
          if(ends[22]>=biggest23357){
            biggest23357=ends[22];
          }
          if(ends[23]>=biggest23357){
            biggest23357=ends[23];
          }
          if(biggest23357 == 1){
            active[20]=1;
            ends[20]=1;
            tdone[20]=1;
          }
        }
        //FINXME code
        if(biggest23353 == 0){
          thread23358(tdone,ends);
          thread23359(tdone,ends);
          thread23360(tdone,ends);
          int biggest23361 = 0;
          if(ends[21]>=biggest23361){
            biggest23361=ends[21];
          }
          if(ends[22]>=biggest23361){
            biggest23361=ends[22];
          }
          if(ends[23]>=biggest23361){
            biggest23361=ends[23];
          }
          if(biggest23361 == 1){
            active[20]=1;
            ends[20]=1;
            tdone[20]=1;
          }
        }
        break;
      
    }
  }

  public void thread23347(int [] tdone, int [] ends){
        S10923=1;
    prevOccupancy_thread_19 = -1;//sysj\ECS.sysj line: 30, column: 14
    currentOccupancy_thread_19 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 33, column: 21
    if(currentOccupancy_thread_19 != prevOccupancy_thread_19 || currentOccupancy_thread_19 == 0 || !workhrs_1.getprestatus()){//sysj\ECS.sysj line: 34, column: 25
      test_16.setPresent();//sysj\ECS.sysj line: 35, column: 25
      currsigs.addElement(test_16);
      prevOccupancy_thread_19 = currentOccupancy_thread_19;//sysj\ECS.sysj line: 37, column: 21
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      prevOccupancy_thread_19 = currentOccupancy_thread_19;//sysj\ECS.sysj line: 37, column: 21
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread23346(int [] tdone, int [] ends){
        S10903=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread23345(int [] tdone, int [] ends){
        S10900=1;
    zoneOcc_thread_17 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 9, column: 17
    S10899=0;
    if(workhrs_1.getprestatus() && (zoneOcc_thread_17 == 0)){//sysj\ECS.sysj line: 11, column: 21
      zoneFourLightingI.setPresent();//sysj\ECS.sysj line: 12, column: 18
      currsigs.addElement(zoneFourLightingI);
      zoneFourLightingI.setValue(0);//sysj\ECS.sysj line: 12, column: 18
      S10899=1;
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
    else {
      if(workhrs_1.getprestatus() && zoneOcc_thread_17 == 1){//sysj\ECS.sysj line: 13, column: 28
        S10880=0;
        zoneFourLightingI.setPresent();//sysj\ECS.sysj line: 14, column: 18
        currsigs.addElement(zoneFourLightingI);
        zoneFourLightingI.setValue(50);//sysj\ECS.sysj line: 14, column: 18
        zoneFourWindowONOFF.setPresent();//sysj\ECS.sysj line: 15, column: 21
        currsigs.addElement(zoneFourWindowONOFF);
        active[17]=1;
        ends[17]=1;
        tdone[17]=1;
      }
      else {
        S10880=1;
        if(workhrs_1.getprestatus() && zoneOcc_thread_17 > 1){//sysj\ECS.sysj line: 16, column: 28
          zoneFourLightingI.setPresent();//sysj\ECS.sysj line: 17, column: 21
          currsigs.addElement(zoneFourLightingI);
          zoneFourLightingI.setValue(100);//sysj\ECS.sysj line: 17, column: 21
          zoneFourWindowONOFF.setPresent();//sysj\ECS.sysj line: 18, column: 21
          currsigs.addElement(zoneFourWindowONOFF);
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
        else {
          S10899=1;
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
      }
    }
  }

  public void thread23343(int [] tdone, int [] ends){
        S10923=1;
    prevOccupancy_thread_19 = -1;//sysj\ECS.sysj line: 30, column: 14
    currentOccupancy_thread_19 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 33, column: 21
    if(currentOccupancy_thread_19 != prevOccupancy_thread_19 || currentOccupancy_thread_19 == 0 || !workhrs_1.getprestatus()){//sysj\ECS.sysj line: 34, column: 25
      test_16.setPresent();//sysj\ECS.sysj line: 35, column: 25
      currsigs.addElement(test_16);
      prevOccupancy_thread_19 = currentOccupancy_thread_19;//sysj\ECS.sysj line: 37, column: 21
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      prevOccupancy_thread_19 = currentOccupancy_thread_19;//sysj\ECS.sysj line: 37, column: 21
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread23342(int [] tdone, int [] ends){
        S10903=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread23341(int [] tdone, int [] ends){
        S10900=1;
    zoneOcc_thread_17 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 9, column: 17
    S10899=0;
    if(workhrs_1.getprestatus() && (zoneOcc_thread_17 == 0)){//sysj\ECS.sysj line: 11, column: 21
      zoneFourLightingI.setPresent();//sysj\ECS.sysj line: 12, column: 18
      currsigs.addElement(zoneFourLightingI);
      zoneFourLightingI.setValue(0);//sysj\ECS.sysj line: 12, column: 18
      S10899=1;
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
    else {
      if(workhrs_1.getprestatus() && zoneOcc_thread_17 == 1){//sysj\ECS.sysj line: 13, column: 28
        S10880=0;
        zoneFourLightingI.setPresent();//sysj\ECS.sysj line: 14, column: 18
        currsigs.addElement(zoneFourLightingI);
        zoneFourLightingI.setValue(50);//sysj\ECS.sysj line: 14, column: 18
        zoneFourWindowONOFF.setPresent();//sysj\ECS.sysj line: 15, column: 21
        currsigs.addElement(zoneFourWindowONOFF);
        active[17]=1;
        ends[17]=1;
        tdone[17]=1;
      }
      else {
        S10880=1;
        if(workhrs_1.getprestatus() && zoneOcc_thread_17 > 1){//sysj\ECS.sysj line: 16, column: 28
          zoneFourLightingI.setPresent();//sysj\ECS.sysj line: 17, column: 21
          currsigs.addElement(zoneFourLightingI);
          zoneFourLightingI.setValue(100);//sysj\ECS.sysj line: 17, column: 21
          zoneFourWindowONOFF.setPresent();//sysj\ECS.sysj line: 18, column: 21
          currsigs.addElement(zoneFourWindowONOFF);
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
        else {
          S10899=1;
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
      }
    }
  }

  public void thread23339(int [] tdone, int [] ends){
        switch(S10923){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        currentOccupancy_thread_19 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 33, column: 21
        if(currentOccupancy_thread_19 != prevOccupancy_thread_19 || currentOccupancy_thread_19 == 0 || !workhrs_1.getprestatus()){//sysj\ECS.sysj line: 34, column: 25
          test_16.setPresent();//sysj\ECS.sysj line: 35, column: 25
          currsigs.addElement(test_16);
          prevOccupancy_thread_19 = currentOccupancy_thread_19;//sysj\ECS.sysj line: 37, column: 21
          active[19]=1;
          ends[19]=1;
          tdone[19]=1;
        }
        else {
          prevOccupancy_thread_19 = currentOccupancy_thread_19;//sysj\ECS.sysj line: 37, column: 21
          active[19]=1;
          ends[19]=1;
          tdone[19]=1;
        }
        break;
      
    }
  }

  public void thread23338(int [] tdone, int [] ends){
        switch(S10903){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        if(test_16.getprestatus()){//sysj\ECS.sysj line: 25, column: 23
          ends[18]=2;
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

  public void thread23337(int [] tdone, int [] ends){
        switch(S10900){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        switch(S10899){
          case 0 : 
            switch(S10880){
              case 0 : 
                zoneFourWindowONOFF.setPresent();//sysj\ECS.sysj line: 15, column: 21
                currsigs.addElement(zoneFourWindowONOFF);
                active[17]=1;
                ends[17]=1;
                tdone[17]=1;
                break;
              
              case 1 : 
                zoneFourWindowONOFF.setPresent();//sysj\ECS.sysj line: 18, column: 21
                currsigs.addElement(zoneFourWindowONOFF);
                active[17]=1;
                ends[17]=1;
                tdone[17]=1;
                break;
              
            }
            break;
          
          case 1 : 
            S10899=1;
            S10900=0;
            active[17]=0;
            ends[17]=0;
            tdone[17]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread23336(int [] tdone, int [] ends){
        switch(S11106){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        test_16.setClear();//sysj\ECS.sysj line: 3, column: 5
        thread23337(tdone,ends);
        thread23338(tdone,ends);
        thread23339(tdone,ends);
        int biggest23340 = 0;
        if(ends[17]>=biggest23340){
          biggest23340=ends[17];
        }
        if(ends[18]>=biggest23340){
          biggest23340=ends[18];
        }
        if(ends[19]>=biggest23340){
          biggest23340=ends[19];
        }
        if(biggest23340 == 1){
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
        if(biggest23340 == 2){
          ends[16]=2;
          ;//sysj\ECS.sysj line: 7, column: 9
          thread23341(tdone,ends);
          thread23342(tdone,ends);
          thread23343(tdone,ends);
          int biggest23344 = 0;
          if(ends[17]>=biggest23344){
            biggest23344=ends[17];
          }
          if(ends[18]>=biggest23344){
            biggest23344=ends[18];
          }
          if(ends[19]>=biggest23344){
            biggest23344=ends[19];
          }
          if(biggest23344 == 1){
            active[16]=1;
            ends[16]=1;
            tdone[16]=1;
          }
        }
        //FINXME code
        if(biggest23340 == 0){
          thread23345(tdone,ends);
          thread23346(tdone,ends);
          thread23347(tdone,ends);
          int biggest23348 = 0;
          if(ends[17]>=biggest23348){
            biggest23348=ends[17];
          }
          if(ends[18]>=biggest23348){
            biggest23348=ends[18];
          }
          if(ends[19]>=biggest23348){
            biggest23348=ends[19];
          }
          if(biggest23348 == 1){
            active[16]=1;
            ends[16]=1;
            tdone[16]=1;
          }
        }
        break;
      
    }
  }

  public void thread23334(int [] tdone, int [] ends){
        S10679=1;
    prevOccupancy_thread_15 = -1;//sysj\ECS.sysj line: 30, column: 14
    currentOccupancy_thread_15 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 33, column: 21
    if(currentOccupancy_thread_15 != prevOccupancy_thread_15 || currentOccupancy_thread_15 == 0 || !workhrs_1.getprestatus()){//sysj\ECS.sysj line: 34, column: 25
      test_12.setPresent();//sysj\ECS.sysj line: 35, column: 25
      currsigs.addElement(test_12);
      prevOccupancy_thread_15 = currentOccupancy_thread_15;//sysj\ECS.sysj line: 37, column: 21
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    else {
      prevOccupancy_thread_15 = currentOccupancy_thread_15;//sysj\ECS.sysj line: 37, column: 21
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread23333(int [] tdone, int [] ends){
        S10659=1;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread23332(int [] tdone, int [] ends){
        S10656=1;
    zoneOcc_thread_13 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 9, column: 17
    S10655=0;
    if(workhrs_1.getprestatus() && (zoneOcc_thread_13 == 0)){//sysj\ECS.sysj line: 11, column: 21
      zoneThreeLightingI.setPresent();//sysj\ECS.sysj line: 12, column: 18
      currsigs.addElement(zoneThreeLightingI);
      zoneThreeLightingI.setValue(0);//sysj\ECS.sysj line: 12, column: 18
      S10655=1;
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
    else {
      if(workhrs_1.getprestatus() && zoneOcc_thread_13 == 1){//sysj\ECS.sysj line: 13, column: 28
        S10636=0;
        zoneThreeLightingI.setPresent();//sysj\ECS.sysj line: 14, column: 18
        currsigs.addElement(zoneThreeLightingI);
        zoneThreeLightingI.setValue(50);//sysj\ECS.sysj line: 14, column: 18
        zoneThreeWindowONOFF.setPresent();//sysj\ECS.sysj line: 15, column: 21
        currsigs.addElement(zoneThreeWindowONOFF);
        active[13]=1;
        ends[13]=1;
        tdone[13]=1;
      }
      else {
        S10636=1;
        if(workhrs_1.getprestatus() && zoneOcc_thread_13 > 1){//sysj\ECS.sysj line: 16, column: 28
          zoneThreeLightingI.setPresent();//sysj\ECS.sysj line: 17, column: 21
          currsigs.addElement(zoneThreeLightingI);
          zoneThreeLightingI.setValue(100);//sysj\ECS.sysj line: 17, column: 21
          zoneThreeWindowONOFF.setPresent();//sysj\ECS.sysj line: 18, column: 21
          currsigs.addElement(zoneThreeWindowONOFF);
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        else {
          S10655=1;
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
      }
    }
  }

  public void thread23330(int [] tdone, int [] ends){
        S10679=1;
    prevOccupancy_thread_15 = -1;//sysj\ECS.sysj line: 30, column: 14
    currentOccupancy_thread_15 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 33, column: 21
    if(currentOccupancy_thread_15 != prevOccupancy_thread_15 || currentOccupancy_thread_15 == 0 || !workhrs_1.getprestatus()){//sysj\ECS.sysj line: 34, column: 25
      test_12.setPresent();//sysj\ECS.sysj line: 35, column: 25
      currsigs.addElement(test_12);
      prevOccupancy_thread_15 = currentOccupancy_thread_15;//sysj\ECS.sysj line: 37, column: 21
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    else {
      prevOccupancy_thread_15 = currentOccupancy_thread_15;//sysj\ECS.sysj line: 37, column: 21
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread23329(int [] tdone, int [] ends){
        S10659=1;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread23328(int [] tdone, int [] ends){
        S10656=1;
    zoneOcc_thread_13 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 9, column: 17
    S10655=0;
    if(workhrs_1.getprestatus() && (zoneOcc_thread_13 == 0)){//sysj\ECS.sysj line: 11, column: 21
      zoneThreeLightingI.setPresent();//sysj\ECS.sysj line: 12, column: 18
      currsigs.addElement(zoneThreeLightingI);
      zoneThreeLightingI.setValue(0);//sysj\ECS.sysj line: 12, column: 18
      S10655=1;
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
    else {
      if(workhrs_1.getprestatus() && zoneOcc_thread_13 == 1){//sysj\ECS.sysj line: 13, column: 28
        S10636=0;
        zoneThreeLightingI.setPresent();//sysj\ECS.sysj line: 14, column: 18
        currsigs.addElement(zoneThreeLightingI);
        zoneThreeLightingI.setValue(50);//sysj\ECS.sysj line: 14, column: 18
        zoneThreeWindowONOFF.setPresent();//sysj\ECS.sysj line: 15, column: 21
        currsigs.addElement(zoneThreeWindowONOFF);
        active[13]=1;
        ends[13]=1;
        tdone[13]=1;
      }
      else {
        S10636=1;
        if(workhrs_1.getprestatus() && zoneOcc_thread_13 > 1){//sysj\ECS.sysj line: 16, column: 28
          zoneThreeLightingI.setPresent();//sysj\ECS.sysj line: 17, column: 21
          currsigs.addElement(zoneThreeLightingI);
          zoneThreeLightingI.setValue(100);//sysj\ECS.sysj line: 17, column: 21
          zoneThreeWindowONOFF.setPresent();//sysj\ECS.sysj line: 18, column: 21
          currsigs.addElement(zoneThreeWindowONOFF);
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        else {
          S10655=1;
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
      }
    }
  }

  public void thread23326(int [] tdone, int [] ends){
        switch(S10679){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        currentOccupancy_thread_15 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 33, column: 21
        if(currentOccupancy_thread_15 != prevOccupancy_thread_15 || currentOccupancy_thread_15 == 0 || !workhrs_1.getprestatus()){//sysj\ECS.sysj line: 34, column: 25
          test_12.setPresent();//sysj\ECS.sysj line: 35, column: 25
          currsigs.addElement(test_12);
          prevOccupancy_thread_15 = currentOccupancy_thread_15;//sysj\ECS.sysj line: 37, column: 21
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        else {
          prevOccupancy_thread_15 = currentOccupancy_thread_15;//sysj\ECS.sysj line: 37, column: 21
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        break;
      
    }
  }

  public void thread23325(int [] tdone, int [] ends){
        switch(S10659){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(test_12.getprestatus()){//sysj\ECS.sysj line: 25, column: 23
          ends[14]=2;
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

  public void thread23324(int [] tdone, int [] ends){
        switch(S10656){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S10655){
          case 0 : 
            switch(S10636){
              case 0 : 
                zoneThreeWindowONOFF.setPresent();//sysj\ECS.sysj line: 15, column: 21
                currsigs.addElement(zoneThreeWindowONOFF);
                active[13]=1;
                ends[13]=1;
                tdone[13]=1;
                break;
              
              case 1 : 
                zoneThreeWindowONOFF.setPresent();//sysj\ECS.sysj line: 18, column: 21
                currsigs.addElement(zoneThreeWindowONOFF);
                active[13]=1;
                ends[13]=1;
                tdone[13]=1;
                break;
              
            }
            break;
          
          case 1 : 
            S10655=1;
            S10656=0;
            active[13]=0;
            ends[13]=0;
            tdone[13]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread23323(int [] tdone, int [] ends){
        switch(S10862){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        test_12.setClear();//sysj\ECS.sysj line: 3, column: 5
        thread23324(tdone,ends);
        thread23325(tdone,ends);
        thread23326(tdone,ends);
        int biggest23327 = 0;
        if(ends[13]>=biggest23327){
          biggest23327=ends[13];
        }
        if(ends[14]>=biggest23327){
          biggest23327=ends[14];
        }
        if(ends[15]>=biggest23327){
          biggest23327=ends[15];
        }
        if(biggest23327 == 1){
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        if(biggest23327 == 2){
          ends[12]=2;
          ;//sysj\ECS.sysj line: 7, column: 9
          thread23328(tdone,ends);
          thread23329(tdone,ends);
          thread23330(tdone,ends);
          int biggest23331 = 0;
          if(ends[13]>=biggest23331){
            biggest23331=ends[13];
          }
          if(ends[14]>=biggest23331){
            biggest23331=ends[14];
          }
          if(ends[15]>=biggest23331){
            biggest23331=ends[15];
          }
          if(biggest23331 == 1){
            active[12]=1;
            ends[12]=1;
            tdone[12]=1;
          }
        }
        //FINXME code
        if(biggest23327 == 0){
          thread23332(tdone,ends);
          thread23333(tdone,ends);
          thread23334(tdone,ends);
          int biggest23335 = 0;
          if(ends[13]>=biggest23335){
            biggest23335=ends[13];
          }
          if(ends[14]>=biggest23335){
            biggest23335=ends[14];
          }
          if(ends[15]>=biggest23335){
            biggest23335=ends[15];
          }
          if(biggest23335 == 1){
            active[12]=1;
            ends[12]=1;
            tdone[12]=1;
          }
        }
        break;
      
    }
  }

  public void thread23321(int [] tdone, int [] ends){
        S10435=1;
    prevOccupancy_thread_11 = -1;//sysj\ECS.sysj line: 30, column: 14
    currentOccupancy_thread_11 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 33, column: 21
    if(currentOccupancy_thread_11 != prevOccupancy_thread_11 || currentOccupancy_thread_11 == 0 || !workhrs_1.getprestatus()){//sysj\ECS.sysj line: 34, column: 25
      test_8.setPresent();//sysj\ECS.sysj line: 35, column: 25
      currsigs.addElement(test_8);
      prevOccupancy_thread_11 = currentOccupancy_thread_11;//sysj\ECS.sysj line: 37, column: 21
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
    else {
      prevOccupancy_thread_11 = currentOccupancy_thread_11;//sysj\ECS.sysj line: 37, column: 21
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread23320(int [] tdone, int [] ends){
        S10415=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread23319(int [] tdone, int [] ends){
        S10412=1;
    zoneOcc_thread_9 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 9, column: 17
    S10411=0;
    if(workhrs_1.getprestatus() && (zoneOcc_thread_9 == 0)){//sysj\ECS.sysj line: 11, column: 21
      zoneTwoLightingI.setPresent();//sysj\ECS.sysj line: 12, column: 18
      currsigs.addElement(zoneTwoLightingI);
      zoneTwoLightingI.setValue(0);//sysj\ECS.sysj line: 12, column: 18
      S10411=1;
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      if(workhrs_1.getprestatus() && zoneOcc_thread_9 == 1){//sysj\ECS.sysj line: 13, column: 28
        S10392=0;
        zoneTwoLightingI.setPresent();//sysj\ECS.sysj line: 14, column: 18
        currsigs.addElement(zoneTwoLightingI);
        zoneTwoLightingI.setValue(50);//sysj\ECS.sysj line: 14, column: 18
        zoneTwoWindowONOFF.setPresent();//sysj\ECS.sysj line: 15, column: 21
        currsigs.addElement(zoneTwoWindowONOFF);
        active[9]=1;
        ends[9]=1;
        tdone[9]=1;
      }
      else {
        S10392=1;
        if(workhrs_1.getprestatus() && zoneOcc_thread_9 > 1){//sysj\ECS.sysj line: 16, column: 28
          zoneTwoLightingI.setPresent();//sysj\ECS.sysj line: 17, column: 21
          currsigs.addElement(zoneTwoLightingI);
          zoneTwoLightingI.setValue(100);//sysj\ECS.sysj line: 17, column: 21
          zoneTwoWindowONOFF.setPresent();//sysj\ECS.sysj line: 18, column: 21
          currsigs.addElement(zoneTwoWindowONOFF);
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        else {
          S10411=1;
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
      }
    }
  }

  public void thread23317(int [] tdone, int [] ends){
        S10435=1;
    prevOccupancy_thread_11 = -1;//sysj\ECS.sysj line: 30, column: 14
    currentOccupancy_thread_11 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 33, column: 21
    if(currentOccupancy_thread_11 != prevOccupancy_thread_11 || currentOccupancy_thread_11 == 0 || !workhrs_1.getprestatus()){//sysj\ECS.sysj line: 34, column: 25
      test_8.setPresent();//sysj\ECS.sysj line: 35, column: 25
      currsigs.addElement(test_8);
      prevOccupancy_thread_11 = currentOccupancy_thread_11;//sysj\ECS.sysj line: 37, column: 21
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
    else {
      prevOccupancy_thread_11 = currentOccupancy_thread_11;//sysj\ECS.sysj line: 37, column: 21
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread23316(int [] tdone, int [] ends){
        S10415=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread23315(int [] tdone, int [] ends){
        S10412=1;
    zoneOcc_thread_9 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 9, column: 17
    S10411=0;
    if(workhrs_1.getprestatus() && (zoneOcc_thread_9 == 0)){//sysj\ECS.sysj line: 11, column: 21
      zoneTwoLightingI.setPresent();//sysj\ECS.sysj line: 12, column: 18
      currsigs.addElement(zoneTwoLightingI);
      zoneTwoLightingI.setValue(0);//sysj\ECS.sysj line: 12, column: 18
      S10411=1;
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      if(workhrs_1.getprestatus() && zoneOcc_thread_9 == 1){//sysj\ECS.sysj line: 13, column: 28
        S10392=0;
        zoneTwoLightingI.setPresent();//sysj\ECS.sysj line: 14, column: 18
        currsigs.addElement(zoneTwoLightingI);
        zoneTwoLightingI.setValue(50);//sysj\ECS.sysj line: 14, column: 18
        zoneTwoWindowONOFF.setPresent();//sysj\ECS.sysj line: 15, column: 21
        currsigs.addElement(zoneTwoWindowONOFF);
        active[9]=1;
        ends[9]=1;
        tdone[9]=1;
      }
      else {
        S10392=1;
        if(workhrs_1.getprestatus() && zoneOcc_thread_9 > 1){//sysj\ECS.sysj line: 16, column: 28
          zoneTwoLightingI.setPresent();//sysj\ECS.sysj line: 17, column: 21
          currsigs.addElement(zoneTwoLightingI);
          zoneTwoLightingI.setValue(100);//sysj\ECS.sysj line: 17, column: 21
          zoneTwoWindowONOFF.setPresent();//sysj\ECS.sysj line: 18, column: 21
          currsigs.addElement(zoneTwoWindowONOFF);
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        else {
          S10411=1;
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
      }
    }
  }

  public void thread23313(int [] tdone, int [] ends){
        switch(S10435){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        currentOccupancy_thread_11 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 33, column: 21
        if(currentOccupancy_thread_11 != prevOccupancy_thread_11 || currentOccupancy_thread_11 == 0 || !workhrs_1.getprestatus()){//sysj\ECS.sysj line: 34, column: 25
          test_8.setPresent();//sysj\ECS.sysj line: 35, column: 25
          currsigs.addElement(test_8);
          prevOccupancy_thread_11 = currentOccupancy_thread_11;//sysj\ECS.sysj line: 37, column: 21
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        else {
          prevOccupancy_thread_11 = currentOccupancy_thread_11;//sysj\ECS.sysj line: 37, column: 21
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        break;
      
    }
  }

  public void thread23312(int [] tdone, int [] ends){
        switch(S10415){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(test_8.getprestatus()){//sysj\ECS.sysj line: 25, column: 23
          ends[10]=2;
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

  public void thread23311(int [] tdone, int [] ends){
        switch(S10412){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S10411){
          case 0 : 
            switch(S10392){
              case 0 : 
                zoneTwoWindowONOFF.setPresent();//sysj\ECS.sysj line: 15, column: 21
                currsigs.addElement(zoneTwoWindowONOFF);
                active[9]=1;
                ends[9]=1;
                tdone[9]=1;
                break;
              
              case 1 : 
                zoneTwoWindowONOFF.setPresent();//sysj\ECS.sysj line: 18, column: 21
                currsigs.addElement(zoneTwoWindowONOFF);
                active[9]=1;
                ends[9]=1;
                tdone[9]=1;
                break;
              
            }
            break;
          
          case 1 : 
            S10411=1;
            S10412=0;
            active[9]=0;
            ends[9]=0;
            tdone[9]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread23310(int [] tdone, int [] ends){
        switch(S10618){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        test_8.setClear();//sysj\ECS.sysj line: 3, column: 5
        thread23311(tdone,ends);
        thread23312(tdone,ends);
        thread23313(tdone,ends);
        int biggest23314 = 0;
        if(ends[9]>=biggest23314){
          biggest23314=ends[9];
        }
        if(ends[10]>=biggest23314){
          biggest23314=ends[10];
        }
        if(ends[11]>=biggest23314){
          biggest23314=ends[11];
        }
        if(biggest23314 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        if(biggest23314 == 2){
          ends[8]=2;
          ;//sysj\ECS.sysj line: 7, column: 9
          thread23315(tdone,ends);
          thread23316(tdone,ends);
          thread23317(tdone,ends);
          int biggest23318 = 0;
          if(ends[9]>=biggest23318){
            biggest23318=ends[9];
          }
          if(ends[10]>=biggest23318){
            biggest23318=ends[10];
          }
          if(ends[11]>=biggest23318){
            biggest23318=ends[11];
          }
          if(biggest23318 == 1){
            active[8]=1;
            ends[8]=1;
            tdone[8]=1;
          }
        }
        //FINXME code
        if(biggest23314 == 0){
          thread23319(tdone,ends);
          thread23320(tdone,ends);
          thread23321(tdone,ends);
          int biggest23322 = 0;
          if(ends[9]>=biggest23322){
            biggest23322=ends[9];
          }
          if(ends[10]>=biggest23322){
            biggest23322=ends[10];
          }
          if(ends[11]>=biggest23322){
            biggest23322=ends[11];
          }
          if(biggest23322 == 1){
            active[8]=1;
            ends[8]=1;
            tdone[8]=1;
          }
        }
        break;
      
    }
  }

  public void thread23308(int [] tdone, int [] ends){
        S10191=1;
    prevOccupancy_thread_7 = -1;//sysj\ECS.sysj line: 30, column: 14
    currentOccupancy_thread_7 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 33, column: 21
    S10174=0;
    if(currentOccupancy_thread_7 != prevOccupancy_thread_7 || currentOccupancy_thread_7 == 0 || !workhrs_1.getprestatus()){//sysj\ECS.sysj line: 34, column: 25
      test_4.setPresent();//sysj\ECS.sysj line: 35, column: 25
      currsigs.addElement(test_4);
      prevOccupancy_thread_7 = currentOccupancy_thread_7;//sysj\ECS.sysj line: 37, column: 21
      S10174=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      prevOccupancy_thread_7 = currentOccupancy_thread_7;//sysj\ECS.sysj line: 37, column: 21
      S10174=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread23307(int [] tdone, int [] ends){
        S10171=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread23306(int [] tdone, int [] ends){
        S10168=1;
    zoneOcc_thread_5 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 9, column: 17
    S10167=0;
    if(workhrs_1.getprestatus() && (zoneOcc_thread_5 == 0)){//sysj\ECS.sysj line: 11, column: 21
      zoneOneLightingI.setPresent();//sysj\ECS.sysj line: 12, column: 18
      currsigs.addElement(zoneOneLightingI);
      zoneOneLightingI.setValue(0);//sysj\ECS.sysj line: 12, column: 18
      S10167=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      if(workhrs_1.getprestatus() && zoneOcc_thread_5 == 1){//sysj\ECS.sysj line: 13, column: 28
        S10148=0;
        zoneOneLightingI.setPresent();//sysj\ECS.sysj line: 14, column: 18
        currsigs.addElement(zoneOneLightingI);
        zoneOneLightingI.setValue(50);//sysj\ECS.sysj line: 14, column: 18
        zoneOneWindowONOFF.setPresent();//sysj\ECS.sysj line: 15, column: 21
        currsigs.addElement(zoneOneWindowONOFF);
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
      else {
        S10148=1;
        if(workhrs_1.getprestatus() && zoneOcc_thread_5 > 1){//sysj\ECS.sysj line: 16, column: 28
          zoneOneLightingI.setPresent();//sysj\ECS.sysj line: 17, column: 21
          currsigs.addElement(zoneOneLightingI);
          zoneOneLightingI.setValue(100);//sysj\ECS.sysj line: 17, column: 21
          zoneOneWindowONOFF.setPresent();//sysj\ECS.sysj line: 18, column: 21
          currsigs.addElement(zoneOneWindowONOFF);
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        else {
          S10167=1;
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
      }
    }
  }

  public void thread23304(int [] tdone, int [] ends){
        S10191=1;
    prevOccupancy_thread_7 = -1;//sysj\ECS.sysj line: 30, column: 14
    currentOccupancy_thread_7 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 33, column: 21
    S10174=0;
    if(currentOccupancy_thread_7 != prevOccupancy_thread_7 || currentOccupancy_thread_7 == 0 || !workhrs_1.getprestatus()){//sysj\ECS.sysj line: 34, column: 25
      test_4.setPresent();//sysj\ECS.sysj line: 35, column: 25
      currsigs.addElement(test_4);
      prevOccupancy_thread_7 = currentOccupancy_thread_7;//sysj\ECS.sysj line: 37, column: 21
      S10174=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      prevOccupancy_thread_7 = currentOccupancy_thread_7;//sysj\ECS.sysj line: 37, column: 21
      S10174=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread23303(int [] tdone, int [] ends){
        S10171=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread23302(int [] tdone, int [] ends){
        S10168=1;
    zoneOcc_thread_5 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 9, column: 17
    S10167=0;
    if(workhrs_1.getprestatus() && (zoneOcc_thread_5 == 0)){//sysj\ECS.sysj line: 11, column: 21
      zoneOneLightingI.setPresent();//sysj\ECS.sysj line: 12, column: 18
      currsigs.addElement(zoneOneLightingI);
      zoneOneLightingI.setValue(0);//sysj\ECS.sysj line: 12, column: 18
      S10167=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      if(workhrs_1.getprestatus() && zoneOcc_thread_5 == 1){//sysj\ECS.sysj line: 13, column: 28
        S10148=0;
        zoneOneLightingI.setPresent();//sysj\ECS.sysj line: 14, column: 18
        currsigs.addElement(zoneOneLightingI);
        zoneOneLightingI.setValue(50);//sysj\ECS.sysj line: 14, column: 18
        zoneOneWindowONOFF.setPresent();//sysj\ECS.sysj line: 15, column: 21
        currsigs.addElement(zoneOneWindowONOFF);
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
      else {
        S10148=1;
        if(workhrs_1.getprestatus() && zoneOcc_thread_5 > 1){//sysj\ECS.sysj line: 16, column: 28
          zoneOneLightingI.setPresent();//sysj\ECS.sysj line: 17, column: 21
          currsigs.addElement(zoneOneLightingI);
          zoneOneLightingI.setValue(100);//sysj\ECS.sysj line: 17, column: 21
          zoneOneWindowONOFF.setPresent();//sysj\ECS.sysj line: 18, column: 21
          currsigs.addElement(zoneOneWindowONOFF);
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        else {
          S10167=1;
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
      }
    }
  }

  public void thread23300(int [] tdone, int [] ends){
        switch(S10191){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S10174){
          case 0 : 
            currentOccupancy_thread_7 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 33, column: 21
            S10174=0;
            if(currentOccupancy_thread_7 != prevOccupancy_thread_7 || currentOccupancy_thread_7 == 0 || !workhrs_1.getprestatus()){//sysj\ECS.sysj line: 34, column: 25
              test_4.setPresent();//sysj\ECS.sysj line: 35, column: 25
              currsigs.addElement(test_4);
              prevOccupancy_thread_7 = currentOccupancy_thread_7;//sysj\ECS.sysj line: 37, column: 21
              S10174=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              prevOccupancy_thread_7 = currentOccupancy_thread_7;//sysj\ECS.sysj line: 37, column: 21
              S10174=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            S10174=1;
            currentOccupancy_thread_7 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 33, column: 21
            S10174=0;
            if(currentOccupancy_thread_7 != prevOccupancy_thread_7 || currentOccupancy_thread_7 == 0 || !workhrs_1.getprestatus()){//sysj\ECS.sysj line: 34, column: 25
              test_4.setPresent();//sysj\ECS.sysj line: 35, column: 25
              currsigs.addElement(test_4);
              prevOccupancy_thread_7 = currentOccupancy_thread_7;//sysj\ECS.sysj line: 37, column: 21
              S10174=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              prevOccupancy_thread_7 = currentOccupancy_thread_7;//sysj\ECS.sysj line: 37, column: 21
              S10174=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread23299(int [] tdone, int [] ends){
        switch(S10171){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(test_4.getprestatus()){//sysj\ECS.sysj line: 25, column: 23
          ends[6]=2;
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

  public void thread23298(int [] tdone, int [] ends){
        switch(S10168){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S10167){
          case 0 : 
            switch(S10148){
              case 0 : 
                zoneOneWindowONOFF.setPresent();//sysj\ECS.sysj line: 15, column: 21
                currsigs.addElement(zoneOneWindowONOFF);
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
                break;
              
              case 1 : 
                zoneOneWindowONOFF.setPresent();//sysj\ECS.sysj line: 18, column: 21
                currsigs.addElement(zoneOneWindowONOFF);
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
                break;
              
            }
            break;
          
          case 1 : 
            S10167=1;
            S10168=0;
            active[5]=0;
            ends[5]=0;
            tdone[5]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread23297(int [] tdone, int [] ends){
        switch(S10374){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        test_4.setClear();//sysj\ECS.sysj line: 3, column: 5
        thread23298(tdone,ends);
        thread23299(tdone,ends);
        thread23300(tdone,ends);
        int biggest23301 = 0;
        if(ends[5]>=biggest23301){
          biggest23301=ends[5];
        }
        if(ends[6]>=biggest23301){
          biggest23301=ends[6];
        }
        if(ends[7]>=biggest23301){
          biggest23301=ends[7];
        }
        if(biggest23301 == 1){
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        if(biggest23301 == 2){
          ends[4]=2;
          ;//sysj\ECS.sysj line: 7, column: 9
          thread23302(tdone,ends);
          thread23303(tdone,ends);
          thread23304(tdone,ends);
          int biggest23305 = 0;
          if(ends[5]>=biggest23305){
            biggest23305=ends[5];
          }
          if(ends[6]>=biggest23305){
            biggest23305=ends[6];
          }
          if(ends[7]>=biggest23305){
            biggest23305=ends[7];
          }
          if(biggest23305 == 1){
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
          }
        }
        //FINXME code
        if(biggest23301 == 0){
          thread23306(tdone,ends);
          thread23307(tdone,ends);
          thread23308(tdone,ends);
          int biggest23309 = 0;
          if(ends[5]>=biggest23309){
            biggest23309=ends[5];
          }
          if(ends[6]>=biggest23309){
            biggest23309=ends[6];
          }
          if(ends[7]>=biggest23309){
            biggest23309=ends[7];
          }
          if(biggest23309 == 1){
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
          }
        }
        break;
      
    }
  }

  public void thread23296(int [] tdone, int [] ends){
        switch(S13548){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread23297(tdone,ends);
        thread23310(tdone,ends);
        thread23323(tdone,ends);
        thread23336(tdone,ends);
        thread23349(tdone,ends);
        thread23362(tdone,ends);
        thread23375(tdone,ends);
        thread23388(tdone,ends);
        thread23401(tdone,ends);
        thread23414(tdone,ends);
        thread23427(tdone,ends);
        thread23440(tdone,ends);
        thread23453(tdone,ends);
        thread23466(tdone,ends);
        int biggest23479 = 0;
        if(ends[4]>=biggest23479){
          biggest23479=ends[4];
        }
        if(ends[8]>=biggest23479){
          biggest23479=ends[8];
        }
        if(ends[12]>=biggest23479){
          biggest23479=ends[12];
        }
        if(ends[16]>=biggest23479){
          biggest23479=ends[16];
        }
        if(ends[20]>=biggest23479){
          biggest23479=ends[20];
        }
        if(ends[24]>=biggest23479){
          biggest23479=ends[24];
        }
        if(ends[28]>=biggest23479){
          biggest23479=ends[28];
        }
        if(ends[32]>=biggest23479){
          biggest23479=ends[32];
        }
        if(ends[36]>=biggest23479){
          biggest23479=ends[36];
        }
        if(ends[40]>=biggest23479){
          biggest23479=ends[40];
        }
        if(ends[44]>=biggest23479){
          biggest23479=ends[44];
        }
        if(ends[48]>=biggest23479){
          biggest23479=ends[48];
        }
        if(ends[52]>=biggest23479){
          biggest23479=ends[52];
        }
        if(ends[56]>=biggest23479){
          biggest23479=ends[56];
        }
        if(biggest23479 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest23479 == 0){
          S13548=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread23295(int [] tdone, int [] ends){
        switch(S10130){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S10080){
          case 0 : 
            if(currentTime_2.getprestatus()){//sysj\ECS.sysj line: 115, column: 14
              currentHour_thread_2 = (Integer)(currentTime_2.getpreval() == null ? 0 : ((Integer)currentTime_2.getpreval()).intValue());//sysj\ECS.sysj line: 116, column: 8
              S10080=1;
              if(currentHour_thread_2 >= 9 && currentHour_thread_2 <= 17){//sysj\ECS.sysj line: 118, column: 16
                S10084=0;
                workhrs_1.setPresent();//sysj\ECS.sysj line: 119, column: 16
                currsigs.addElement(workhrs_1);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S10084=1;
                if((currentHour_thread_2 >= 18 && currentHour_thread_2 <= 24) || (currentHour_thread_2 >= 0 && currentHour_thread_2 < 9)){//sysj\ECS.sysj line: 123, column: 23
                  afterhrs_1.setPresent();//sysj\ECS.sysj line: 124, column: 16
                  currsigs.addElement(afterhrs_1);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S10080=0;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            switch(S10084){
              case 0 : 
                S10080=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
                break;
              
              case 1 : 
                S10080=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread23291(int [] tdone, int [] ends){
        S13363=1;
    prevOccupancy_thread_59 = -1;//sysj\ECS.sysj line: 74, column: 14
    currentOccupancy_thread_59 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 77, column: 21
    if(currentOccupancy_thread_59 != prevOccupancy_thread_59 || currentOccupancy_thread_59 == 0 || !afterhrs_1.getprestatus()){//sysj\ECS.sysj line: 78, column: 25
      test_56.setPresent();//sysj\ECS.sysj line: 79, column: 25
      currsigs.addElement(test_56);
      prevOccupancy_thread_59 = currentOccupancy_thread_59;//sysj\ECS.sysj line: 81, column: 21
      active[59]=1;
      ends[59]=1;
      tdone[59]=1;
    }
    else {
      prevOccupancy_thread_59 = currentOccupancy_thread_59;//sysj\ECS.sysj line: 81, column: 21
      active[59]=1;
      ends[59]=1;
      tdone[59]=1;
    }
  }

  public void thread23290(int [] tdone, int [] ends){
        S13343=1;
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread23289(int [] tdone, int [] ends){
        S13340=1;
    zoneOcc_thread_57 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 53, column: 17
    S13339=0;
    if(afterhrs_1.getprestatus() && (zoneOcc_thread_57 == 0)){//sysj\ECS.sysj line: 55, column: 21
      zoneSevenLightingI.setPresent();//sysj\ECS.sysj line: 56, column: 18
      currsigs.addElement(zoneSevenLightingI);
      zoneSevenLightingI.setValue(0);//sysj\ECS.sysj line: 56, column: 18
      S13339=1;
      active[57]=1;
      ends[57]=1;
      tdone[57]=1;
    }
    else {
      if(afterhrs_1.getprestatus() && zoneOcc_thread_57 == 1){//sysj\ECS.sysj line: 57, column: 28
        S13320=0;
        zoneSevenLightingI.setPresent();//sysj\ECS.sysj line: 58, column: 18
        currsigs.addElement(zoneSevenLightingI);
        zoneSevenLightingI.setValue(50);//sysj\ECS.sysj line: 58, column: 18
        zoneSevenLightONOFF.setPresent();//sysj\ECS.sysj line: 59, column: 21
        currsigs.addElement(zoneSevenLightONOFF);
        active[57]=1;
        ends[57]=1;
        tdone[57]=1;
      }
      else {
        S13320=1;
        if(afterhrs_1.getprestatus() && zoneOcc_thread_57 > 1){//sysj\ECS.sysj line: 60, column: 28
          zoneSevenLightingI.setPresent();//sysj\ECS.sysj line: 61, column: 21
          currsigs.addElement(zoneSevenLightingI);
          zoneSevenLightingI.setValue(100);//sysj\ECS.sysj line: 61, column: 21
          zoneSevenLightONOFF.setPresent();//sysj\ECS.sysj line: 62, column: 21
          currsigs.addElement(zoneSevenLightONOFF);
          active[57]=1;
          ends[57]=1;
          tdone[57]=1;
        }
        else {
          S13339=1;
          active[57]=1;
          ends[57]=1;
          tdone[57]=1;
        }
      }
    }
  }

  public void thread23288(int [] tdone, int [] ends){
        S13546=1;
    test_56.setClear();//sysj\ECS.sysj line: 47, column: 5
    thread23289(tdone,ends);
    thread23290(tdone,ends);
    thread23291(tdone,ends);
    int biggest23292 = 0;
    if(ends[57]>=biggest23292){
      biggest23292=ends[57];
    }
    if(ends[58]>=biggest23292){
      biggest23292=ends[58];
    }
    if(ends[59]>=biggest23292){
      biggest23292=ends[59];
    }
    if(biggest23292 == 1){
      active[56]=1;
      ends[56]=1;
      tdone[56]=1;
    }
  }

  public void thread23286(int [] tdone, int [] ends){
        S13119=1;
    prevOccupancy_thread_55 = -1;//sysj\ECS.sysj line: 74, column: 14
    currentOccupancy_thread_55 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 77, column: 21
    if(currentOccupancy_thread_55 != prevOccupancy_thread_55 || currentOccupancy_thread_55 == 0 || !afterhrs_1.getprestatus()){//sysj\ECS.sysj line: 78, column: 25
      test_52.setPresent();//sysj\ECS.sysj line: 79, column: 25
      currsigs.addElement(test_52);
      prevOccupancy_thread_55 = currentOccupancy_thread_55;//sysj\ECS.sysj line: 81, column: 21
      active[55]=1;
      ends[55]=1;
      tdone[55]=1;
    }
    else {
      prevOccupancy_thread_55 = currentOccupancy_thread_55;//sysj\ECS.sysj line: 81, column: 21
      active[55]=1;
      ends[55]=1;
      tdone[55]=1;
    }
  }

  public void thread23285(int [] tdone, int [] ends){
        S13099=1;
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread23284(int [] tdone, int [] ends){
        S13096=1;
    zoneOcc_thread_53 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 53, column: 17
    S13095=0;
    if(afterhrs_1.getprestatus() && (zoneOcc_thread_53 == 0)){//sysj\ECS.sysj line: 55, column: 21
      zoneSixLightingI.setPresent();//sysj\ECS.sysj line: 56, column: 18
      currsigs.addElement(zoneSixLightingI);
      zoneSixLightingI.setValue(0);//sysj\ECS.sysj line: 56, column: 18
      S13095=1;
      active[53]=1;
      ends[53]=1;
      tdone[53]=1;
    }
    else {
      if(afterhrs_1.getprestatus() && zoneOcc_thread_53 == 1){//sysj\ECS.sysj line: 57, column: 28
        S13076=0;
        zoneSixLightingI.setPresent();//sysj\ECS.sysj line: 58, column: 18
        currsigs.addElement(zoneSixLightingI);
        zoneSixLightingI.setValue(50);//sysj\ECS.sysj line: 58, column: 18
        zoneSixLightONOFF.setPresent();//sysj\ECS.sysj line: 59, column: 21
        currsigs.addElement(zoneSixLightONOFF);
        active[53]=1;
        ends[53]=1;
        tdone[53]=1;
      }
      else {
        S13076=1;
        if(afterhrs_1.getprestatus() && zoneOcc_thread_53 > 1){//sysj\ECS.sysj line: 60, column: 28
          zoneSixLightingI.setPresent();//sysj\ECS.sysj line: 61, column: 21
          currsigs.addElement(zoneSixLightingI);
          zoneSixLightingI.setValue(100);//sysj\ECS.sysj line: 61, column: 21
          zoneSixLightONOFF.setPresent();//sysj\ECS.sysj line: 62, column: 21
          currsigs.addElement(zoneSixLightONOFF);
          active[53]=1;
          ends[53]=1;
          tdone[53]=1;
        }
        else {
          S13095=1;
          active[53]=1;
          ends[53]=1;
          tdone[53]=1;
        }
      }
    }
  }

  public void thread23283(int [] tdone, int [] ends){
        S13302=1;
    test_52.setClear();//sysj\ECS.sysj line: 47, column: 5
    thread23284(tdone,ends);
    thread23285(tdone,ends);
    thread23286(tdone,ends);
    int biggest23287 = 0;
    if(ends[53]>=biggest23287){
      biggest23287=ends[53];
    }
    if(ends[54]>=biggest23287){
      biggest23287=ends[54];
    }
    if(ends[55]>=biggest23287){
      biggest23287=ends[55];
    }
    if(biggest23287 == 1){
      active[52]=1;
      ends[52]=1;
      tdone[52]=1;
    }
  }

  public void thread23281(int [] tdone, int [] ends){
        S12875=1;
    prevOccupancy_thread_51 = -1;//sysj\ECS.sysj line: 74, column: 14
    currentOccupancy_thread_51 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 77, column: 21
    if(currentOccupancy_thread_51 != prevOccupancy_thread_51 || currentOccupancy_thread_51 == 0 || !afterhrs_1.getprestatus()){//sysj\ECS.sysj line: 78, column: 25
      test_48.setPresent();//sysj\ECS.sysj line: 79, column: 25
      currsigs.addElement(test_48);
      prevOccupancy_thread_51 = currentOccupancy_thread_51;//sysj\ECS.sysj line: 81, column: 21
      active[51]=1;
      ends[51]=1;
      tdone[51]=1;
    }
    else {
      prevOccupancy_thread_51 = currentOccupancy_thread_51;//sysj\ECS.sysj line: 81, column: 21
      active[51]=1;
      ends[51]=1;
      tdone[51]=1;
    }
  }

  public void thread23280(int [] tdone, int [] ends){
        S12855=1;
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread23279(int [] tdone, int [] ends){
        S12852=1;
    zoneOcc_thread_49 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 53, column: 17
    S12851=0;
    if(afterhrs_1.getprestatus() && (zoneOcc_thread_49 == 0)){//sysj\ECS.sysj line: 55, column: 21
      zoneFiveLightingI.setPresent();//sysj\ECS.sysj line: 56, column: 18
      currsigs.addElement(zoneFiveLightingI);
      zoneFiveLightingI.setValue(0);//sysj\ECS.sysj line: 56, column: 18
      S12851=1;
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
    else {
      if(afterhrs_1.getprestatus() && zoneOcc_thread_49 == 1){//sysj\ECS.sysj line: 57, column: 28
        S12832=0;
        zoneFiveLightingI.setPresent();//sysj\ECS.sysj line: 58, column: 18
        currsigs.addElement(zoneFiveLightingI);
        zoneFiveLightingI.setValue(50);//sysj\ECS.sysj line: 58, column: 18
        zoneFiveLightONOFF.setPresent();//sysj\ECS.sysj line: 59, column: 21
        currsigs.addElement(zoneFiveLightONOFF);
        active[49]=1;
        ends[49]=1;
        tdone[49]=1;
      }
      else {
        S12832=1;
        if(afterhrs_1.getprestatus() && zoneOcc_thread_49 > 1){//sysj\ECS.sysj line: 60, column: 28
          zoneFiveLightingI.setPresent();//sysj\ECS.sysj line: 61, column: 21
          currsigs.addElement(zoneFiveLightingI);
          zoneFiveLightingI.setValue(100);//sysj\ECS.sysj line: 61, column: 21
          zoneFiveLightONOFF.setPresent();//sysj\ECS.sysj line: 62, column: 21
          currsigs.addElement(zoneFiveLightONOFF);
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
        else {
          S12851=1;
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
      }
    }
  }

  public void thread23278(int [] tdone, int [] ends){
        S13058=1;
    test_48.setClear();//sysj\ECS.sysj line: 47, column: 5
    thread23279(tdone,ends);
    thread23280(tdone,ends);
    thread23281(tdone,ends);
    int biggest23282 = 0;
    if(ends[49]>=biggest23282){
      biggest23282=ends[49];
    }
    if(ends[50]>=biggest23282){
      biggest23282=ends[50];
    }
    if(ends[51]>=biggest23282){
      biggest23282=ends[51];
    }
    if(biggest23282 == 1){
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
  }

  public void thread23276(int [] tdone, int [] ends){
        S12631=1;
    prevOccupancy_thread_47 = -1;//sysj\ECS.sysj line: 74, column: 14
    currentOccupancy_thread_47 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 77, column: 21
    if(currentOccupancy_thread_47 != prevOccupancy_thread_47 || currentOccupancy_thread_47 == 0 || !afterhrs_1.getprestatus()){//sysj\ECS.sysj line: 78, column: 25
      test_44.setPresent();//sysj\ECS.sysj line: 79, column: 25
      currsigs.addElement(test_44);
      prevOccupancy_thread_47 = currentOccupancy_thread_47;//sysj\ECS.sysj line: 81, column: 21
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
    else {
      prevOccupancy_thread_47 = currentOccupancy_thread_47;//sysj\ECS.sysj line: 81, column: 21
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
  }

  public void thread23275(int [] tdone, int [] ends){
        S12611=1;
    active[46]=1;
    ends[46]=1;
    tdone[46]=1;
  }

  public void thread23274(int [] tdone, int [] ends){
        S12608=1;
    zoneOcc_thread_45 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 53, column: 17
    S12607=0;
    if(afterhrs_1.getprestatus() && (zoneOcc_thread_45 == 0)){//sysj\ECS.sysj line: 55, column: 21
      zoneFourLightingI.setPresent();//sysj\ECS.sysj line: 56, column: 18
      currsigs.addElement(zoneFourLightingI);
      zoneFourLightingI.setValue(0);//sysj\ECS.sysj line: 56, column: 18
      S12607=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      if(afterhrs_1.getprestatus() && zoneOcc_thread_45 == 1){//sysj\ECS.sysj line: 57, column: 28
        S12588=0;
        zoneFourLightingI.setPresent();//sysj\ECS.sysj line: 58, column: 18
        currsigs.addElement(zoneFourLightingI);
        zoneFourLightingI.setValue(50);//sysj\ECS.sysj line: 58, column: 18
        zoneFourLightONOFF.setPresent();//sysj\ECS.sysj line: 59, column: 21
        currsigs.addElement(zoneFourLightONOFF);
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
      else {
        S12588=1;
        if(afterhrs_1.getprestatus() && zoneOcc_thread_45 > 1){//sysj\ECS.sysj line: 60, column: 28
          zoneFourLightingI.setPresent();//sysj\ECS.sysj line: 61, column: 21
          currsigs.addElement(zoneFourLightingI);
          zoneFourLightingI.setValue(100);//sysj\ECS.sysj line: 61, column: 21
          zoneFourLightONOFF.setPresent();//sysj\ECS.sysj line: 62, column: 21
          currsigs.addElement(zoneFourLightONOFF);
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
        else {
          S12607=1;
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
      }
    }
  }

  public void thread23273(int [] tdone, int [] ends){
        S12814=1;
    test_44.setClear();//sysj\ECS.sysj line: 47, column: 5
    thread23274(tdone,ends);
    thread23275(tdone,ends);
    thread23276(tdone,ends);
    int biggest23277 = 0;
    if(ends[45]>=biggest23277){
      biggest23277=ends[45];
    }
    if(ends[46]>=biggest23277){
      biggest23277=ends[46];
    }
    if(ends[47]>=biggest23277){
      biggest23277=ends[47];
    }
    if(biggest23277 == 1){
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread23271(int [] tdone, int [] ends){
        S12387=1;
    prevOccupancy_thread_43 = -1;//sysj\ECS.sysj line: 74, column: 14
    currentOccupancy_thread_43 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 77, column: 21
    if(currentOccupancy_thread_43 != prevOccupancy_thread_43 || currentOccupancy_thread_43 == 0 || !afterhrs_1.getprestatus()){//sysj\ECS.sysj line: 78, column: 25
      test_40.setPresent();//sysj\ECS.sysj line: 79, column: 25
      currsigs.addElement(test_40);
      prevOccupancy_thread_43 = currentOccupancy_thread_43;//sysj\ECS.sysj line: 81, column: 21
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      prevOccupancy_thread_43 = currentOccupancy_thread_43;//sysj\ECS.sysj line: 81, column: 21
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
  }

  public void thread23270(int [] tdone, int [] ends){
        S12367=1;
    active[42]=1;
    ends[42]=1;
    tdone[42]=1;
  }

  public void thread23269(int [] tdone, int [] ends){
        S12364=1;
    zoneOcc_thread_41 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 53, column: 17
    S12363=0;
    if(afterhrs_1.getprestatus() && (zoneOcc_thread_41 == 0)){//sysj\ECS.sysj line: 55, column: 21
      zoneThreeLightingI.setPresent();//sysj\ECS.sysj line: 56, column: 18
      currsigs.addElement(zoneThreeLightingI);
      zoneThreeLightingI.setValue(0);//sysj\ECS.sysj line: 56, column: 18
      S12363=1;
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
    else {
      if(afterhrs_1.getprestatus() && zoneOcc_thread_41 == 1){//sysj\ECS.sysj line: 57, column: 28
        S12344=0;
        zoneThreeLightingI.setPresent();//sysj\ECS.sysj line: 58, column: 18
        currsigs.addElement(zoneThreeLightingI);
        zoneThreeLightingI.setValue(50);//sysj\ECS.sysj line: 58, column: 18
        zoneThreeLightONOFF.setPresent();//sysj\ECS.sysj line: 59, column: 21
        currsigs.addElement(zoneThreeLightONOFF);
        active[41]=1;
        ends[41]=1;
        tdone[41]=1;
      }
      else {
        S12344=1;
        if(afterhrs_1.getprestatus() && zoneOcc_thread_41 > 1){//sysj\ECS.sysj line: 60, column: 28
          zoneThreeLightingI.setPresent();//sysj\ECS.sysj line: 61, column: 21
          currsigs.addElement(zoneThreeLightingI);
          zoneThreeLightingI.setValue(100);//sysj\ECS.sysj line: 61, column: 21
          zoneThreeLightONOFF.setPresent();//sysj\ECS.sysj line: 62, column: 21
          currsigs.addElement(zoneThreeLightONOFF);
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
        else {
          S12363=1;
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
      }
    }
  }

  public void thread23268(int [] tdone, int [] ends){
        S12570=1;
    test_40.setClear();//sysj\ECS.sysj line: 47, column: 5
    thread23269(tdone,ends);
    thread23270(tdone,ends);
    thread23271(tdone,ends);
    int biggest23272 = 0;
    if(ends[41]>=biggest23272){
      biggest23272=ends[41];
    }
    if(ends[42]>=biggest23272){
      biggest23272=ends[42];
    }
    if(ends[43]>=biggest23272){
      biggest23272=ends[43];
    }
    if(biggest23272 == 1){
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
  }

  public void thread23266(int [] tdone, int [] ends){
        S12143=1;
    prevOccupancy_thread_39 = -1;//sysj\ECS.sysj line: 74, column: 14
    currentOccupancy_thread_39 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 77, column: 21
    if(currentOccupancy_thread_39 != prevOccupancy_thread_39 || currentOccupancy_thread_39 == 0 || !afterhrs_1.getprestatus()){//sysj\ECS.sysj line: 78, column: 25
      test_36.setPresent();//sysj\ECS.sysj line: 79, column: 25
      currsigs.addElement(test_36);
      prevOccupancy_thread_39 = currentOccupancy_thread_39;//sysj\ECS.sysj line: 81, column: 21
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      prevOccupancy_thread_39 = currentOccupancy_thread_39;//sysj\ECS.sysj line: 81, column: 21
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
  }

  public void thread23265(int [] tdone, int [] ends){
        S12123=1;
    active[38]=1;
    ends[38]=1;
    tdone[38]=1;
  }

  public void thread23264(int [] tdone, int [] ends){
        S12120=1;
    zoneOcc_thread_37 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 53, column: 17
    S12119=0;
    if(afterhrs_1.getprestatus() && (zoneOcc_thread_37 == 0)){//sysj\ECS.sysj line: 55, column: 21
      zoneTwoLightingI.setPresent();//sysj\ECS.sysj line: 56, column: 18
      currsigs.addElement(zoneTwoLightingI);
      zoneTwoLightingI.setValue(0);//sysj\ECS.sysj line: 56, column: 18
      S12119=1;
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      if(afterhrs_1.getprestatus() && zoneOcc_thread_37 == 1){//sysj\ECS.sysj line: 57, column: 28
        S12100=0;
        zoneTwoLightingI.setPresent();//sysj\ECS.sysj line: 58, column: 18
        currsigs.addElement(zoneTwoLightingI);
        zoneTwoLightingI.setValue(50);//sysj\ECS.sysj line: 58, column: 18
        zoneTwoLightONOFF.setPresent();//sysj\ECS.sysj line: 59, column: 21
        currsigs.addElement(zoneTwoLightONOFF);
        active[37]=1;
        ends[37]=1;
        tdone[37]=1;
      }
      else {
        S12100=1;
        if(afterhrs_1.getprestatus() && zoneOcc_thread_37 > 1){//sysj\ECS.sysj line: 60, column: 28
          zoneTwoLightingI.setPresent();//sysj\ECS.sysj line: 61, column: 21
          currsigs.addElement(zoneTwoLightingI);
          zoneTwoLightingI.setValue(100);//sysj\ECS.sysj line: 61, column: 21
          zoneTwoLightONOFF.setPresent();//sysj\ECS.sysj line: 62, column: 21
          currsigs.addElement(zoneTwoLightONOFF);
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
        else {
          S12119=1;
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
      }
    }
  }

  public void thread23263(int [] tdone, int [] ends){
        S12326=1;
    test_36.setClear();//sysj\ECS.sysj line: 47, column: 5
    thread23264(tdone,ends);
    thread23265(tdone,ends);
    thread23266(tdone,ends);
    int biggest23267 = 0;
    if(ends[37]>=biggest23267){
      biggest23267=ends[37];
    }
    if(ends[38]>=biggest23267){
      biggest23267=ends[38];
    }
    if(ends[39]>=biggest23267){
      biggest23267=ends[39];
    }
    if(biggest23267 == 1){
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
  }

  public void thread23261(int [] tdone, int [] ends){
        S11899=1;
    prevOccupancy_thread_35 = -1;//sysj\ECS.sysj line: 74, column: 14
    currentOccupancy_thread_35 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 77, column: 21
    if(currentOccupancy_thread_35 != prevOccupancy_thread_35 || currentOccupancy_thread_35 == 0 || !afterhrs_1.getprestatus()){//sysj\ECS.sysj line: 78, column: 25
      test_32.setPresent();//sysj\ECS.sysj line: 79, column: 25
      currsigs.addElement(test_32);
      prevOccupancy_thread_35 = currentOccupancy_thread_35;//sysj\ECS.sysj line: 81, column: 21
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    else {
      prevOccupancy_thread_35 = currentOccupancy_thread_35;//sysj\ECS.sysj line: 81, column: 21
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread23260(int [] tdone, int [] ends){
        S11879=1;
    active[34]=1;
    ends[34]=1;
    tdone[34]=1;
  }

  public void thread23259(int [] tdone, int [] ends){
        S11876=1;
    zoneOcc_thread_33 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 53, column: 17
    S11875=0;
    if(afterhrs_1.getprestatus() && (zoneOcc_thread_33 == 0)){//sysj\ECS.sysj line: 55, column: 21
      zoneOneLightingI.setPresent();//sysj\ECS.sysj line: 56, column: 18
      currsigs.addElement(zoneOneLightingI);
      zoneOneLightingI.setValue(0);//sysj\ECS.sysj line: 56, column: 18
      S11875=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      if(afterhrs_1.getprestatus() && zoneOcc_thread_33 == 1){//sysj\ECS.sysj line: 57, column: 28
        S11856=0;
        zoneOneLightingI.setPresent();//sysj\ECS.sysj line: 58, column: 18
        currsigs.addElement(zoneOneLightingI);
        zoneOneLightingI.setValue(50);//sysj\ECS.sysj line: 58, column: 18
        zoneOneLightONOFF.setPresent();//sysj\ECS.sysj line: 59, column: 21
        currsigs.addElement(zoneOneLightONOFF);
        active[33]=1;
        ends[33]=1;
        tdone[33]=1;
      }
      else {
        S11856=1;
        if(afterhrs_1.getprestatus() && zoneOcc_thread_33 > 1){//sysj\ECS.sysj line: 60, column: 28
          zoneOneLightingI.setPresent();//sysj\ECS.sysj line: 61, column: 21
          currsigs.addElement(zoneOneLightingI);
          zoneOneLightingI.setValue(100);//sysj\ECS.sysj line: 61, column: 21
          zoneOneLightONOFF.setPresent();//sysj\ECS.sysj line: 62, column: 21
          currsigs.addElement(zoneOneLightONOFF);
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
        else {
          S11875=1;
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
      }
    }
  }

  public void thread23258(int [] tdone, int [] ends){
        S12082=1;
    test_32.setClear();//sysj\ECS.sysj line: 47, column: 5
    thread23259(tdone,ends);
    thread23260(tdone,ends);
    thread23261(tdone,ends);
    int biggest23262 = 0;
    if(ends[33]>=biggest23262){
      biggest23262=ends[33];
    }
    if(ends[34]>=biggest23262){
      biggest23262=ends[34];
    }
    if(ends[35]>=biggest23262){
      biggest23262=ends[35];
    }
    if(biggest23262 == 1){
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread23256(int [] tdone, int [] ends){
        S11655=1;
    prevOccupancy_thread_31 = -1;//sysj\ECS.sysj line: 30, column: 14
    currentOccupancy_thread_31 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 33, column: 21
    if(currentOccupancy_thread_31 != prevOccupancy_thread_31 || currentOccupancy_thread_31 == 0 || !workhrs_1.getprestatus()){//sysj\ECS.sysj line: 34, column: 25
      test_28.setPresent();//sysj\ECS.sysj line: 35, column: 25
      currsigs.addElement(test_28);
      prevOccupancy_thread_31 = currentOccupancy_thread_31;//sysj\ECS.sysj line: 37, column: 21
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
    else {
      prevOccupancy_thread_31 = currentOccupancy_thread_31;//sysj\ECS.sysj line: 37, column: 21
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
  }

  public void thread23255(int [] tdone, int [] ends){
        S11635=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread23254(int [] tdone, int [] ends){
        S11632=1;
    zoneOcc_thread_29 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 9, column: 17
    S11631=0;
    if(workhrs_1.getprestatus() && (zoneOcc_thread_29 == 0)){//sysj\ECS.sysj line: 11, column: 21
      zoneSevenLightingI.setPresent();//sysj\ECS.sysj line: 12, column: 18
      currsigs.addElement(zoneSevenLightingI);
      zoneSevenLightingI.setValue(0);//sysj\ECS.sysj line: 12, column: 18
      S11631=1;
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
    else {
      if(workhrs_1.getprestatus() && zoneOcc_thread_29 == 1){//sysj\ECS.sysj line: 13, column: 28
        S11612=0;
        zoneSevenLightingI.setPresent();//sysj\ECS.sysj line: 14, column: 18
        currsigs.addElement(zoneSevenLightingI);
        zoneSevenLightingI.setValue(50);//sysj\ECS.sysj line: 14, column: 18
        zoneSevenWindowONOFF.setPresent();//sysj\ECS.sysj line: 15, column: 21
        currsigs.addElement(zoneSevenWindowONOFF);
        active[29]=1;
        ends[29]=1;
        tdone[29]=1;
      }
      else {
        S11612=1;
        if(workhrs_1.getprestatus() && zoneOcc_thread_29 > 1){//sysj\ECS.sysj line: 16, column: 28
          zoneSevenLightingI.setPresent();//sysj\ECS.sysj line: 17, column: 21
          currsigs.addElement(zoneSevenLightingI);
          zoneSevenLightingI.setValue(100);//sysj\ECS.sysj line: 17, column: 21
          zoneSevenWindowONOFF.setPresent();//sysj\ECS.sysj line: 18, column: 21
          currsigs.addElement(zoneSevenWindowONOFF);
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
        else {
          S11631=1;
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
      }
    }
  }

  public void thread23253(int [] tdone, int [] ends){
        S11838=1;
    test_28.setClear();//sysj\ECS.sysj line: 3, column: 5
    thread23254(tdone,ends);
    thread23255(tdone,ends);
    thread23256(tdone,ends);
    int biggest23257 = 0;
    if(ends[29]>=biggest23257){
      biggest23257=ends[29];
    }
    if(ends[30]>=biggest23257){
      biggest23257=ends[30];
    }
    if(ends[31]>=biggest23257){
      biggest23257=ends[31];
    }
    if(biggest23257 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread23251(int [] tdone, int [] ends){
        S11411=1;
    prevOccupancy_thread_27 = -1;//sysj\ECS.sysj line: 30, column: 14
    currentOccupancy_thread_27 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 33, column: 21
    if(currentOccupancy_thread_27 != prevOccupancy_thread_27 || currentOccupancy_thread_27 == 0 || !workhrs_1.getprestatus()){//sysj\ECS.sysj line: 34, column: 25
      test_24.setPresent();//sysj\ECS.sysj line: 35, column: 25
      currsigs.addElement(test_24);
      prevOccupancy_thread_27 = currentOccupancy_thread_27;//sysj\ECS.sysj line: 37, column: 21
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
    else {
      prevOccupancy_thread_27 = currentOccupancy_thread_27;//sysj\ECS.sysj line: 37, column: 21
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread23250(int [] tdone, int [] ends){
        S11391=1;
    active[26]=1;
    ends[26]=1;
    tdone[26]=1;
  }

  public void thread23249(int [] tdone, int [] ends){
        S11388=1;
    zoneOcc_thread_25 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 9, column: 17
    S11387=0;
    if(workhrs_1.getprestatus() && (zoneOcc_thread_25 == 0)){//sysj\ECS.sysj line: 11, column: 21
      zoneSixLightingI.setPresent();//sysj\ECS.sysj line: 12, column: 18
      currsigs.addElement(zoneSixLightingI);
      zoneSixLightingI.setValue(0);//sysj\ECS.sysj line: 12, column: 18
      S11387=1;
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    else {
      if(workhrs_1.getprestatus() && zoneOcc_thread_25 == 1){//sysj\ECS.sysj line: 13, column: 28
        S11368=0;
        zoneSixLightingI.setPresent();//sysj\ECS.sysj line: 14, column: 18
        currsigs.addElement(zoneSixLightingI);
        zoneSixLightingI.setValue(50);//sysj\ECS.sysj line: 14, column: 18
        zoneSixWindowONOFF.setPresent();//sysj\ECS.sysj line: 15, column: 21
        currsigs.addElement(zoneSixWindowONOFF);
        active[25]=1;
        ends[25]=1;
        tdone[25]=1;
      }
      else {
        S11368=1;
        if(workhrs_1.getprestatus() && zoneOcc_thread_25 > 1){//sysj\ECS.sysj line: 16, column: 28
          zoneSixLightingI.setPresent();//sysj\ECS.sysj line: 17, column: 21
          currsigs.addElement(zoneSixLightingI);
          zoneSixLightingI.setValue(100);//sysj\ECS.sysj line: 17, column: 21
          zoneSixWindowONOFF.setPresent();//sysj\ECS.sysj line: 18, column: 21
          currsigs.addElement(zoneSixWindowONOFF);
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
        else {
          S11387=1;
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
      }
    }
  }

  public void thread23248(int [] tdone, int [] ends){
        S11594=1;
    test_24.setClear();//sysj\ECS.sysj line: 3, column: 5
    thread23249(tdone,ends);
    thread23250(tdone,ends);
    thread23251(tdone,ends);
    int biggest23252 = 0;
    if(ends[25]>=biggest23252){
      biggest23252=ends[25];
    }
    if(ends[26]>=biggest23252){
      biggest23252=ends[26];
    }
    if(ends[27]>=biggest23252){
      biggest23252=ends[27];
    }
    if(biggest23252 == 1){
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread23246(int [] tdone, int [] ends){
        S11167=1;
    prevOccupancy_thread_23 = -1;//sysj\ECS.sysj line: 30, column: 14
    currentOccupancy_thread_23 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 33, column: 21
    if(currentOccupancy_thread_23 != prevOccupancy_thread_23 || currentOccupancy_thread_23 == 0 || !workhrs_1.getprestatus()){//sysj\ECS.sysj line: 34, column: 25
      test_20.setPresent();//sysj\ECS.sysj line: 35, column: 25
      currsigs.addElement(test_20);
      prevOccupancy_thread_23 = currentOccupancy_thread_23;//sysj\ECS.sysj line: 37, column: 21
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      prevOccupancy_thread_23 = currentOccupancy_thread_23;//sysj\ECS.sysj line: 37, column: 21
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
  }

  public void thread23245(int [] tdone, int [] ends){
        S11147=1;
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread23244(int [] tdone, int [] ends){
        S11144=1;
    zoneOcc_thread_21 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 9, column: 17
    S11143=0;
    if(workhrs_1.getprestatus() && (zoneOcc_thread_21 == 0)){//sysj\ECS.sysj line: 11, column: 21
      zoneFiveLightingI.setPresent();//sysj\ECS.sysj line: 12, column: 18
      currsigs.addElement(zoneFiveLightingI);
      zoneFiveLightingI.setValue(0);//sysj\ECS.sysj line: 12, column: 18
      S11143=1;
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    else {
      if(workhrs_1.getprestatus() && zoneOcc_thread_21 == 1){//sysj\ECS.sysj line: 13, column: 28
        S11124=0;
        zoneFiveLightingI.setPresent();//sysj\ECS.sysj line: 14, column: 18
        currsigs.addElement(zoneFiveLightingI);
        zoneFiveLightingI.setValue(50);//sysj\ECS.sysj line: 14, column: 18
        zoneFiveWindowONOFF.setPresent();//sysj\ECS.sysj line: 15, column: 21
        currsigs.addElement(zoneFiveWindowONOFF);
        active[21]=1;
        ends[21]=1;
        tdone[21]=1;
      }
      else {
        S11124=1;
        if(workhrs_1.getprestatus() && zoneOcc_thread_21 > 1){//sysj\ECS.sysj line: 16, column: 28
          zoneFiveLightingI.setPresent();//sysj\ECS.sysj line: 17, column: 21
          currsigs.addElement(zoneFiveLightingI);
          zoneFiveLightingI.setValue(100);//sysj\ECS.sysj line: 17, column: 21
          zoneFiveWindowONOFF.setPresent();//sysj\ECS.sysj line: 18, column: 21
          currsigs.addElement(zoneFiveWindowONOFF);
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        else {
          S11143=1;
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
      }
    }
  }

  public void thread23243(int [] tdone, int [] ends){
        S11350=1;
    test_20.setClear();//sysj\ECS.sysj line: 3, column: 5
    thread23244(tdone,ends);
    thread23245(tdone,ends);
    thread23246(tdone,ends);
    int biggest23247 = 0;
    if(ends[21]>=biggest23247){
      biggest23247=ends[21];
    }
    if(ends[22]>=biggest23247){
      biggest23247=ends[22];
    }
    if(ends[23]>=biggest23247){
      biggest23247=ends[23];
    }
    if(biggest23247 == 1){
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread23241(int [] tdone, int [] ends){
        S10923=1;
    prevOccupancy_thread_19 = -1;//sysj\ECS.sysj line: 30, column: 14
    currentOccupancy_thread_19 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 33, column: 21
    if(currentOccupancy_thread_19 != prevOccupancy_thread_19 || currentOccupancy_thread_19 == 0 || !workhrs_1.getprestatus()){//sysj\ECS.sysj line: 34, column: 25
      test_16.setPresent();//sysj\ECS.sysj line: 35, column: 25
      currsigs.addElement(test_16);
      prevOccupancy_thread_19 = currentOccupancy_thread_19;//sysj\ECS.sysj line: 37, column: 21
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      prevOccupancy_thread_19 = currentOccupancy_thread_19;//sysj\ECS.sysj line: 37, column: 21
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread23240(int [] tdone, int [] ends){
        S10903=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread23239(int [] tdone, int [] ends){
        S10900=1;
    zoneOcc_thread_17 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 9, column: 17
    S10899=0;
    if(workhrs_1.getprestatus() && (zoneOcc_thread_17 == 0)){//sysj\ECS.sysj line: 11, column: 21
      zoneFourLightingI.setPresent();//sysj\ECS.sysj line: 12, column: 18
      currsigs.addElement(zoneFourLightingI);
      zoneFourLightingI.setValue(0);//sysj\ECS.sysj line: 12, column: 18
      S10899=1;
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
    else {
      if(workhrs_1.getprestatus() && zoneOcc_thread_17 == 1){//sysj\ECS.sysj line: 13, column: 28
        S10880=0;
        zoneFourLightingI.setPresent();//sysj\ECS.sysj line: 14, column: 18
        currsigs.addElement(zoneFourLightingI);
        zoneFourLightingI.setValue(50);//sysj\ECS.sysj line: 14, column: 18
        zoneFourWindowONOFF.setPresent();//sysj\ECS.sysj line: 15, column: 21
        currsigs.addElement(zoneFourWindowONOFF);
        active[17]=1;
        ends[17]=1;
        tdone[17]=1;
      }
      else {
        S10880=1;
        if(workhrs_1.getprestatus() && zoneOcc_thread_17 > 1){//sysj\ECS.sysj line: 16, column: 28
          zoneFourLightingI.setPresent();//sysj\ECS.sysj line: 17, column: 21
          currsigs.addElement(zoneFourLightingI);
          zoneFourLightingI.setValue(100);//sysj\ECS.sysj line: 17, column: 21
          zoneFourWindowONOFF.setPresent();//sysj\ECS.sysj line: 18, column: 21
          currsigs.addElement(zoneFourWindowONOFF);
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
        else {
          S10899=1;
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
      }
    }
  }

  public void thread23238(int [] tdone, int [] ends){
        S11106=1;
    test_16.setClear();//sysj\ECS.sysj line: 3, column: 5
    thread23239(tdone,ends);
    thread23240(tdone,ends);
    thread23241(tdone,ends);
    int biggest23242 = 0;
    if(ends[17]>=biggest23242){
      biggest23242=ends[17];
    }
    if(ends[18]>=biggest23242){
      biggest23242=ends[18];
    }
    if(ends[19]>=biggest23242){
      biggest23242=ends[19];
    }
    if(biggest23242 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread23236(int [] tdone, int [] ends){
        S10679=1;
    prevOccupancy_thread_15 = -1;//sysj\ECS.sysj line: 30, column: 14
    currentOccupancy_thread_15 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 33, column: 21
    if(currentOccupancy_thread_15 != prevOccupancy_thread_15 || currentOccupancy_thread_15 == 0 || !workhrs_1.getprestatus()){//sysj\ECS.sysj line: 34, column: 25
      test_12.setPresent();//sysj\ECS.sysj line: 35, column: 25
      currsigs.addElement(test_12);
      prevOccupancy_thread_15 = currentOccupancy_thread_15;//sysj\ECS.sysj line: 37, column: 21
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    else {
      prevOccupancy_thread_15 = currentOccupancy_thread_15;//sysj\ECS.sysj line: 37, column: 21
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread23235(int [] tdone, int [] ends){
        S10659=1;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread23234(int [] tdone, int [] ends){
        S10656=1;
    zoneOcc_thread_13 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 9, column: 17
    S10655=0;
    if(workhrs_1.getprestatus() && (zoneOcc_thread_13 == 0)){//sysj\ECS.sysj line: 11, column: 21
      zoneThreeLightingI.setPresent();//sysj\ECS.sysj line: 12, column: 18
      currsigs.addElement(zoneThreeLightingI);
      zoneThreeLightingI.setValue(0);//sysj\ECS.sysj line: 12, column: 18
      S10655=1;
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
    else {
      if(workhrs_1.getprestatus() && zoneOcc_thread_13 == 1){//sysj\ECS.sysj line: 13, column: 28
        S10636=0;
        zoneThreeLightingI.setPresent();//sysj\ECS.sysj line: 14, column: 18
        currsigs.addElement(zoneThreeLightingI);
        zoneThreeLightingI.setValue(50);//sysj\ECS.sysj line: 14, column: 18
        zoneThreeWindowONOFF.setPresent();//sysj\ECS.sysj line: 15, column: 21
        currsigs.addElement(zoneThreeWindowONOFF);
        active[13]=1;
        ends[13]=1;
        tdone[13]=1;
      }
      else {
        S10636=1;
        if(workhrs_1.getprestatus() && zoneOcc_thread_13 > 1){//sysj\ECS.sysj line: 16, column: 28
          zoneThreeLightingI.setPresent();//sysj\ECS.sysj line: 17, column: 21
          currsigs.addElement(zoneThreeLightingI);
          zoneThreeLightingI.setValue(100);//sysj\ECS.sysj line: 17, column: 21
          zoneThreeWindowONOFF.setPresent();//sysj\ECS.sysj line: 18, column: 21
          currsigs.addElement(zoneThreeWindowONOFF);
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        else {
          S10655=1;
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
      }
    }
  }

  public void thread23233(int [] tdone, int [] ends){
        S10862=1;
    test_12.setClear();//sysj\ECS.sysj line: 3, column: 5
    thread23234(tdone,ends);
    thread23235(tdone,ends);
    thread23236(tdone,ends);
    int biggest23237 = 0;
    if(ends[13]>=biggest23237){
      biggest23237=ends[13];
    }
    if(ends[14]>=biggest23237){
      biggest23237=ends[14];
    }
    if(ends[15]>=biggest23237){
      biggest23237=ends[15];
    }
    if(biggest23237 == 1){
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread23231(int [] tdone, int [] ends){
        S10435=1;
    prevOccupancy_thread_11 = -1;//sysj\ECS.sysj line: 30, column: 14
    currentOccupancy_thread_11 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 33, column: 21
    if(currentOccupancy_thread_11 != prevOccupancy_thread_11 || currentOccupancy_thread_11 == 0 || !workhrs_1.getprestatus()){//sysj\ECS.sysj line: 34, column: 25
      test_8.setPresent();//sysj\ECS.sysj line: 35, column: 25
      currsigs.addElement(test_8);
      prevOccupancy_thread_11 = currentOccupancy_thread_11;//sysj\ECS.sysj line: 37, column: 21
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
    else {
      prevOccupancy_thread_11 = currentOccupancy_thread_11;//sysj\ECS.sysj line: 37, column: 21
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread23230(int [] tdone, int [] ends){
        S10415=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread23229(int [] tdone, int [] ends){
        S10412=1;
    zoneOcc_thread_9 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 9, column: 17
    S10411=0;
    if(workhrs_1.getprestatus() && (zoneOcc_thread_9 == 0)){//sysj\ECS.sysj line: 11, column: 21
      zoneTwoLightingI.setPresent();//sysj\ECS.sysj line: 12, column: 18
      currsigs.addElement(zoneTwoLightingI);
      zoneTwoLightingI.setValue(0);//sysj\ECS.sysj line: 12, column: 18
      S10411=1;
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      if(workhrs_1.getprestatus() && zoneOcc_thread_9 == 1){//sysj\ECS.sysj line: 13, column: 28
        S10392=0;
        zoneTwoLightingI.setPresent();//sysj\ECS.sysj line: 14, column: 18
        currsigs.addElement(zoneTwoLightingI);
        zoneTwoLightingI.setValue(50);//sysj\ECS.sysj line: 14, column: 18
        zoneTwoWindowONOFF.setPresent();//sysj\ECS.sysj line: 15, column: 21
        currsigs.addElement(zoneTwoWindowONOFF);
        active[9]=1;
        ends[9]=1;
        tdone[9]=1;
      }
      else {
        S10392=1;
        if(workhrs_1.getprestatus() && zoneOcc_thread_9 > 1){//sysj\ECS.sysj line: 16, column: 28
          zoneTwoLightingI.setPresent();//sysj\ECS.sysj line: 17, column: 21
          currsigs.addElement(zoneTwoLightingI);
          zoneTwoLightingI.setValue(100);//sysj\ECS.sysj line: 17, column: 21
          zoneTwoWindowONOFF.setPresent();//sysj\ECS.sysj line: 18, column: 21
          currsigs.addElement(zoneTwoWindowONOFF);
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        else {
          S10411=1;
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
      }
    }
  }

  public void thread23228(int [] tdone, int [] ends){
        S10618=1;
    test_8.setClear();//sysj\ECS.sysj line: 3, column: 5
    thread23229(tdone,ends);
    thread23230(tdone,ends);
    thread23231(tdone,ends);
    int biggest23232 = 0;
    if(ends[9]>=biggest23232){
      biggest23232=ends[9];
    }
    if(ends[10]>=biggest23232){
      biggest23232=ends[10];
    }
    if(ends[11]>=biggest23232){
      biggest23232=ends[11];
    }
    if(biggest23232 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread23226(int [] tdone, int [] ends){
        S10191=1;
    prevOccupancy_thread_7 = -1;//sysj\ECS.sysj line: 30, column: 14
    currentOccupancy_thread_7 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 33, column: 21
    S10174=0;
    if(currentOccupancy_thread_7 != prevOccupancy_thread_7 || currentOccupancy_thread_7 == 0 || !workhrs_1.getprestatus()){//sysj\ECS.sysj line: 34, column: 25
      test_4.setPresent();//sysj\ECS.sysj line: 35, column: 25
      currsigs.addElement(test_4);
      prevOccupancy_thread_7 = currentOccupancy_thread_7;//sysj\ECS.sysj line: 37, column: 21
      S10174=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      prevOccupancy_thread_7 = currentOccupancy_thread_7;//sysj\ECS.sysj line: 37, column: 21
      S10174=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread23225(int [] tdone, int [] ends){
        S10171=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread23224(int [] tdone, int [] ends){
        S10168=1;
    zoneOcc_thread_5 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 9, column: 17
    S10167=0;
    if(workhrs_1.getprestatus() && (zoneOcc_thread_5 == 0)){//sysj\ECS.sysj line: 11, column: 21
      zoneOneLightingI.setPresent();//sysj\ECS.sysj line: 12, column: 18
      currsigs.addElement(zoneOneLightingI);
      zoneOneLightingI.setValue(0);//sysj\ECS.sysj line: 12, column: 18
      S10167=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      if(workhrs_1.getprestatus() && zoneOcc_thread_5 == 1){//sysj\ECS.sysj line: 13, column: 28
        S10148=0;
        zoneOneLightingI.setPresent();//sysj\ECS.sysj line: 14, column: 18
        currsigs.addElement(zoneOneLightingI);
        zoneOneLightingI.setValue(50);//sysj\ECS.sysj line: 14, column: 18
        zoneOneWindowONOFF.setPresent();//sysj\ECS.sysj line: 15, column: 21
        currsigs.addElement(zoneOneWindowONOFF);
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
      else {
        S10148=1;
        if(workhrs_1.getprestatus() && zoneOcc_thread_5 > 1){//sysj\ECS.sysj line: 16, column: 28
          zoneOneLightingI.setPresent();//sysj\ECS.sysj line: 17, column: 21
          currsigs.addElement(zoneOneLightingI);
          zoneOneLightingI.setValue(100);//sysj\ECS.sysj line: 17, column: 21
          zoneOneWindowONOFF.setPresent();//sysj\ECS.sysj line: 18, column: 21
          currsigs.addElement(zoneOneWindowONOFF);
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        else {
          S10167=1;
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
      }
    }
  }

  public void thread23223(int [] tdone, int [] ends){
        S10374=1;
    test_4.setClear();//sysj\ECS.sysj line: 3, column: 5
    thread23224(tdone,ends);
    thread23225(tdone,ends);
    thread23226(tdone,ends);
    int biggest23227 = 0;
    if(ends[5]>=biggest23227){
      biggest23227=ends[5];
    }
    if(ends[6]>=biggest23227){
      biggest23227=ends[6];
    }
    if(ends[7]>=biggest23227){
      biggest23227=ends[7];
    }
    if(biggest23227 == 1){
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread23222(int [] tdone, int [] ends){
        S13548=1;
    thread23223(tdone,ends);
    thread23228(tdone,ends);
    thread23233(tdone,ends);
    thread23238(tdone,ends);
    thread23243(tdone,ends);
    thread23248(tdone,ends);
    thread23253(tdone,ends);
    thread23258(tdone,ends);
    thread23263(tdone,ends);
    thread23268(tdone,ends);
    thread23273(tdone,ends);
    thread23278(tdone,ends);
    thread23283(tdone,ends);
    thread23288(tdone,ends);
    int biggest23293 = 0;
    if(ends[4]>=biggest23293){
      biggest23293=ends[4];
    }
    if(ends[8]>=biggest23293){
      biggest23293=ends[8];
    }
    if(ends[12]>=biggest23293){
      biggest23293=ends[12];
    }
    if(ends[16]>=biggest23293){
      biggest23293=ends[16];
    }
    if(ends[20]>=biggest23293){
      biggest23293=ends[20];
    }
    if(ends[24]>=biggest23293){
      biggest23293=ends[24];
    }
    if(ends[28]>=biggest23293){
      biggest23293=ends[28];
    }
    if(ends[32]>=biggest23293){
      biggest23293=ends[32];
    }
    if(ends[36]>=biggest23293){
      biggest23293=ends[36];
    }
    if(ends[40]>=biggest23293){
      biggest23293=ends[40];
    }
    if(ends[44]>=biggest23293){
      biggest23293=ends[44];
    }
    if(ends[48]>=biggest23293){
      biggest23293=ends[48];
    }
    if(ends[52]>=biggest23293){
      biggest23293=ends[52];
    }
    if(ends[56]>=biggest23293){
      biggest23293=ends[56];
    }
    if(biggest23293 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    if(biggest23293 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    if(biggest23293 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    if(biggest23293 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    if(biggest23293 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    if(biggest23293 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    if(biggest23293 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    if(biggest23293 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    if(biggest23293 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    if(biggest23293 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    if(biggest23293 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    if(biggest23293 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    if(biggest23293 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    if(biggest23293 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread23221(int [] tdone, int [] ends){
        S10130=1;
    S10080=0;
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
      switch(S13550){
        case 0 : 
          S13550=0;
          break RUN;
        
        case 1 : 
          S13550=2;
          S13550=2;
          workhrs_1.setClear();//sysj\ECS.sysj line: 111, column: 4
          afterhrs_1.setClear();//sysj\ECS.sysj line: 111, column: 4
          thread23221(tdone,ends);
          thread23222(tdone,ends);
          int biggest23294 = 0;
          if(ends[2]>=biggest23294){
            biggest23294=ends[2];
          }
          if(ends[3]>=biggest23294){
            biggest23294=ends[3];
          }
          if(biggest23294 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          workhrs_1.setClear();//sysj\ECS.sysj line: 111, column: 4
          afterhrs_1.setClear();//sysj\ECS.sysj line: 111, column: 4
          thread23295(tdone,ends);
          thread23296(tdone,ends);
          int biggest23480 = 0;
          if(ends[2]>=biggest23480){
            biggest23480=ends[2];
          }
          if(ends[3]>=biggest23480){
            biggest23480=ends[3];
          }
          if(biggest23480 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest23480 == 0){
            S13550=0;
            active[1]=0;
            ends[1]=0;
            S13550=0;
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
    workhrs_1 = new Signal();
    afterhrs_1 = new Signal();
    test_4 = new Signal();
    test_8 = new Signal();
    test_12 = new Signal();
    test_16 = new Signal();
    test_20 = new Signal();
    test_24 = new Signal();
    test_28 = new Signal();
    test_32 = new Signal();
    test_36 = new Signal();
    test_40 = new Signal();
    test_44 = new Signal();
    test_48 = new Signal();
    test_52 = new Signal();
    test_56 = new Signal();
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
          Zone1_Finished.gethook();
          currentTime_2.gethook();
          zoneOneOccupancy.gethook();
          zoneTwoOccupancy.gethook();
          zoneThreeOccupancy.gethook();
          zoneFourOccupancy.gethook();
          zoneFiveOccupancy.gethook();
          zoneSixOccupancy.gethook();
          zoneSevenOccupancy.gethook();
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
      workhrs_1.setpreclear();
      afterhrs_1.setpreclear();
      test_4.setpreclear();
      test_8.setpreclear();
      test_12.setpreclear();
      test_16.setpreclear();
      test_20.setpreclear();
      test_24.setpreclear();
      test_28.setpreclear();
      test_32.setpreclear();
      test_36.setpreclear();
      test_40.setpreclear();
      test_44.setpreclear();
      test_48.setpreclear();
      test_52.setpreclear();
      test_56.setpreclear();
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
      zoneOneLightingI.sethook();
      zoneOneLightingI.setClear();
      zoneTwoLightingI.sethook();
      zoneTwoLightingI.setClear();
      zoneThreeLightingI.sethook();
      zoneThreeLightingI.setClear();
      zoneFourLightingI.sethook();
      zoneFourLightingI.setClear();
      zoneFiveLightingI.sethook();
      zoneFiveLightingI.setClear();
      zoneSixLightingI.sethook();
      zoneSixLightingI.setClear();
      zoneSevenLightingI.sethook();
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
      workhrs_1.setClear();
      afterhrs_1.setClear();
      test_4.setClear();
      test_8.setClear();
      test_12.setClear();
      test_16.setClear();
      test_20.setClear();
      test_24.setClear();
      test_28.setClear();
      test_32.setClear();
      test_36.setClear();
      test_40.setClear();
      test_44.setClear();
      test_48.setClear();
      test_52.setClear();
      test_56.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
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
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
