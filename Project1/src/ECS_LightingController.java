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
  private int S197662 = 1;
  private int S194242 = 1;
  private int S194192 = 1;
  private int S194196 = 1;
  private int S197660 = 1;
  private int S194486 = 1;
  private int S194280 = 1;
  private int S194279 = 1;
  private int S194260 = 1;
  private int S194283 = 1;
  private int S194303 = 1;
  private int S194286 = 1;
  private int S194730 = 1;
  private int S194524 = 1;
  private int S194523 = 1;
  private int S194504 = 1;
  private int S194527 = 1;
  private int S194547 = 1;
  private int S194974 = 1;
  private int S194768 = 1;
  private int S194767 = 1;
  private int S194748 = 1;
  private int S194771 = 1;
  private int S194791 = 1;
  private int S195218 = 1;
  private int S195012 = 1;
  private int S195011 = 1;
  private int S194992 = 1;
  private int S195015 = 1;
  private int S195035 = 1;
  private int S195462 = 1;
  private int S195256 = 1;
  private int S195255 = 1;
  private int S195236 = 1;
  private int S195259 = 1;
  private int S195279 = 1;
  private int S195706 = 1;
  private int S195500 = 1;
  private int S195499 = 1;
  private int S195480 = 1;
  private int S195503 = 1;
  private int S195523 = 1;
  private int S195950 = 1;
  private int S195744 = 1;
  private int S195743 = 1;
  private int S195724 = 1;
  private int S195747 = 1;
  private int S195767 = 1;
  private int S196194 = 1;
  private int S195988 = 1;
  private int S195987 = 1;
  private int S195968 = 1;
  private int S195991 = 1;
  private int S196011 = 1;
  private int S196438 = 1;
  private int S196232 = 1;
  private int S196231 = 1;
  private int S196212 = 1;
  private int S196235 = 1;
  private int S196255 = 1;
  private int S196682 = 1;
  private int S196476 = 1;
  private int S196475 = 1;
  private int S196456 = 1;
  private int S196479 = 1;
  private int S196499 = 1;
  private int S196926 = 1;
  private int S196720 = 1;
  private int S196719 = 1;
  private int S196700 = 1;
  private int S196723 = 1;
  private int S196743 = 1;
  private int S197170 = 1;
  private int S196964 = 1;
  private int S196963 = 1;
  private int S196944 = 1;
  private int S196967 = 1;
  private int S196987 = 1;
  private int S197414 = 1;
  private int S197208 = 1;
  private int S197207 = 1;
  private int S197188 = 1;
  private int S197211 = 1;
  private int S197231 = 1;
  private int S197658 = 1;
  private int S197452 = 1;
  private int S197451 = 1;
  private int S197432 = 1;
  private int S197455 = 1;
  private int S197475 = 1;
  
  private int[] ends = new int[69];
  private int[] tdone = new int[69];
  
  public void thread207589(int [] tdone, int [] ends){
        S197475=1;
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

  public void thread207588(int [] tdone, int [] ends){
        S197455=1;
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread207587(int [] tdone, int [] ends){
        S197452=1;
    zoneOcc_thread_57 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 53, column: 17
    S197451=0;
    if(afterhrs_1.getprestatus() && (zoneOcc_thread_57 == 0)){//sysj\ECS.sysj line: 55, column: 21
      zoneSevenLightingI.setPresent();//sysj\ECS.sysj line: 56, column: 18
      currsigs.addElement(zoneSevenLightingI);
      zoneSevenLightingI.setValue(0);//sysj\ECS.sysj line: 56, column: 18
      S197451=1;
      active[57]=1;
      ends[57]=1;
      tdone[57]=1;
    }
    else {
      if(afterhrs_1.getprestatus() && zoneOcc_thread_57 == 1){//sysj\ECS.sysj line: 57, column: 28
        S197432=0;
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
        S197432=1;
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
          S197451=1;
          active[57]=1;
          ends[57]=1;
          tdone[57]=1;
        }
      }
    }
  }

  public void thread207585(int [] tdone, int [] ends){
        S197475=1;
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

  public void thread207584(int [] tdone, int [] ends){
        S197455=1;
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread207583(int [] tdone, int [] ends){
        S197452=1;
    zoneOcc_thread_57 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 53, column: 17
    S197451=0;
    if(afterhrs_1.getprestatus() && (zoneOcc_thread_57 == 0)){//sysj\ECS.sysj line: 55, column: 21
      zoneSevenLightingI.setPresent();//sysj\ECS.sysj line: 56, column: 18
      currsigs.addElement(zoneSevenLightingI);
      zoneSevenLightingI.setValue(0);//sysj\ECS.sysj line: 56, column: 18
      S197451=1;
      active[57]=1;
      ends[57]=1;
      tdone[57]=1;
    }
    else {
      if(afterhrs_1.getprestatus() && zoneOcc_thread_57 == 1){//sysj\ECS.sysj line: 57, column: 28
        S197432=0;
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
        S197432=1;
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
          S197451=1;
          active[57]=1;
          ends[57]=1;
          tdone[57]=1;
        }
      }
    }
  }

  public void thread207581(int [] tdone, int [] ends){
        switch(S197475){
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

  public void thread207580(int [] tdone, int [] ends){
        switch(S197455){
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

  public void thread207579(int [] tdone, int [] ends){
        switch(S197452){
      case 0 : 
        active[57]=0;
        ends[57]=0;
        tdone[57]=1;
        break;
      
      case 1 : 
        switch(S197451){
          case 0 : 
            switch(S197432){
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
            S197451=1;
            S197452=0;
            active[57]=0;
            ends[57]=0;
            tdone[57]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread207578(int [] tdone, int [] ends){
        switch(S197658){
      case 0 : 
        active[56]=0;
        ends[56]=0;
        tdone[56]=1;
        break;
      
      case 1 : 
        test_56.setClear();//sysj\ECS.sysj line: 47, column: 5
        thread207579(tdone,ends);
        thread207580(tdone,ends);
        thread207581(tdone,ends);
        int biggest207582 = 0;
        if(ends[57]>=biggest207582){
          biggest207582=ends[57];
        }
        if(ends[58]>=biggest207582){
          biggest207582=ends[58];
        }
        if(ends[59]>=biggest207582){
          biggest207582=ends[59];
        }
        if(biggest207582 == 1){
          active[56]=1;
          ends[56]=1;
          tdone[56]=1;
        }
        if(biggest207582 == 2){
          ends[56]=2;
          ;//sysj\ECS.sysj line: 51, column: 9
          thread207583(tdone,ends);
          thread207584(tdone,ends);
          thread207585(tdone,ends);
          int biggest207586 = 0;
          if(ends[57]>=biggest207586){
            biggest207586=ends[57];
          }
          if(ends[58]>=biggest207586){
            biggest207586=ends[58];
          }
          if(ends[59]>=biggest207586){
            biggest207586=ends[59];
          }
          if(biggest207586 == 1){
            active[56]=1;
            ends[56]=1;
            tdone[56]=1;
          }
        }
        //FINXME code
        if(biggest207582 == 0){
          thread207587(tdone,ends);
          thread207588(tdone,ends);
          thread207589(tdone,ends);
          int biggest207590 = 0;
          if(ends[57]>=biggest207590){
            biggest207590=ends[57];
          }
          if(ends[58]>=biggest207590){
            biggest207590=ends[58];
          }
          if(ends[59]>=biggest207590){
            biggest207590=ends[59];
          }
          if(biggest207590 == 1){
            active[56]=1;
            ends[56]=1;
            tdone[56]=1;
          }
        }
        break;
      
    }
  }

  public void thread207576(int [] tdone, int [] ends){
        S197231=1;
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

  public void thread207575(int [] tdone, int [] ends){
        S197211=1;
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread207574(int [] tdone, int [] ends){
        S197208=1;
    zoneOcc_thread_53 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 53, column: 17
    S197207=0;
    if(afterhrs_1.getprestatus() && (zoneOcc_thread_53 == 0)){//sysj\ECS.sysj line: 55, column: 21
      zoneSixLightingI.setPresent();//sysj\ECS.sysj line: 56, column: 18
      currsigs.addElement(zoneSixLightingI);
      zoneSixLightingI.setValue(0);//sysj\ECS.sysj line: 56, column: 18
      S197207=1;
      active[53]=1;
      ends[53]=1;
      tdone[53]=1;
    }
    else {
      if(afterhrs_1.getprestatus() && zoneOcc_thread_53 == 1){//sysj\ECS.sysj line: 57, column: 28
        S197188=0;
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
        S197188=1;
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
          S197207=1;
          active[53]=1;
          ends[53]=1;
          tdone[53]=1;
        }
      }
    }
  }

  public void thread207572(int [] tdone, int [] ends){
        S197231=1;
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

  public void thread207571(int [] tdone, int [] ends){
        S197211=1;
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread207570(int [] tdone, int [] ends){
        S197208=1;
    zoneOcc_thread_53 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 53, column: 17
    S197207=0;
    if(afterhrs_1.getprestatus() && (zoneOcc_thread_53 == 0)){//sysj\ECS.sysj line: 55, column: 21
      zoneSixLightingI.setPresent();//sysj\ECS.sysj line: 56, column: 18
      currsigs.addElement(zoneSixLightingI);
      zoneSixLightingI.setValue(0);//sysj\ECS.sysj line: 56, column: 18
      S197207=1;
      active[53]=1;
      ends[53]=1;
      tdone[53]=1;
    }
    else {
      if(afterhrs_1.getprestatus() && zoneOcc_thread_53 == 1){//sysj\ECS.sysj line: 57, column: 28
        S197188=0;
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
        S197188=1;
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
          S197207=1;
          active[53]=1;
          ends[53]=1;
          tdone[53]=1;
        }
      }
    }
  }

  public void thread207568(int [] tdone, int [] ends){
        switch(S197231){
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

  public void thread207567(int [] tdone, int [] ends){
        switch(S197211){
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

  public void thread207566(int [] tdone, int [] ends){
        switch(S197208){
      case 0 : 
        active[53]=0;
        ends[53]=0;
        tdone[53]=1;
        break;
      
      case 1 : 
        switch(S197207){
          case 0 : 
            switch(S197188){
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
            S197207=1;
            S197208=0;
            active[53]=0;
            ends[53]=0;
            tdone[53]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread207565(int [] tdone, int [] ends){
        switch(S197414){
      case 0 : 
        active[52]=0;
        ends[52]=0;
        tdone[52]=1;
        break;
      
      case 1 : 
        test_52.setClear();//sysj\ECS.sysj line: 47, column: 5
        thread207566(tdone,ends);
        thread207567(tdone,ends);
        thread207568(tdone,ends);
        int biggest207569 = 0;
        if(ends[53]>=biggest207569){
          biggest207569=ends[53];
        }
        if(ends[54]>=biggest207569){
          biggest207569=ends[54];
        }
        if(ends[55]>=biggest207569){
          biggest207569=ends[55];
        }
        if(biggest207569 == 1){
          active[52]=1;
          ends[52]=1;
          tdone[52]=1;
        }
        if(biggest207569 == 2){
          ends[52]=2;
          ;//sysj\ECS.sysj line: 51, column: 9
          thread207570(tdone,ends);
          thread207571(tdone,ends);
          thread207572(tdone,ends);
          int biggest207573 = 0;
          if(ends[53]>=biggest207573){
            biggest207573=ends[53];
          }
          if(ends[54]>=biggest207573){
            biggest207573=ends[54];
          }
          if(ends[55]>=biggest207573){
            biggest207573=ends[55];
          }
          if(biggest207573 == 1){
            active[52]=1;
            ends[52]=1;
            tdone[52]=1;
          }
        }
        //FINXME code
        if(biggest207569 == 0){
          thread207574(tdone,ends);
          thread207575(tdone,ends);
          thread207576(tdone,ends);
          int biggest207577 = 0;
          if(ends[53]>=biggest207577){
            biggest207577=ends[53];
          }
          if(ends[54]>=biggest207577){
            biggest207577=ends[54];
          }
          if(ends[55]>=biggest207577){
            biggest207577=ends[55];
          }
          if(biggest207577 == 1){
            active[52]=1;
            ends[52]=1;
            tdone[52]=1;
          }
        }
        break;
      
    }
  }

  public void thread207563(int [] tdone, int [] ends){
        S196987=1;
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

  public void thread207562(int [] tdone, int [] ends){
        S196967=1;
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread207561(int [] tdone, int [] ends){
        S196964=1;
    zoneOcc_thread_49 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 53, column: 17
    S196963=0;
    if(afterhrs_1.getprestatus() && (zoneOcc_thread_49 == 0)){//sysj\ECS.sysj line: 55, column: 21
      zoneFiveLightingI.setPresent();//sysj\ECS.sysj line: 56, column: 18
      currsigs.addElement(zoneFiveLightingI);
      zoneFiveLightingI.setValue(0);//sysj\ECS.sysj line: 56, column: 18
      S196963=1;
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
    else {
      if(afterhrs_1.getprestatus() && zoneOcc_thread_49 == 1){//sysj\ECS.sysj line: 57, column: 28
        S196944=0;
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
        S196944=1;
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
          S196963=1;
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
      }
    }
  }

  public void thread207559(int [] tdone, int [] ends){
        S196987=1;
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

  public void thread207558(int [] tdone, int [] ends){
        S196967=1;
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread207557(int [] tdone, int [] ends){
        S196964=1;
    zoneOcc_thread_49 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 53, column: 17
    S196963=0;
    if(afterhrs_1.getprestatus() && (zoneOcc_thread_49 == 0)){//sysj\ECS.sysj line: 55, column: 21
      zoneFiveLightingI.setPresent();//sysj\ECS.sysj line: 56, column: 18
      currsigs.addElement(zoneFiveLightingI);
      zoneFiveLightingI.setValue(0);//sysj\ECS.sysj line: 56, column: 18
      S196963=1;
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
    else {
      if(afterhrs_1.getprestatus() && zoneOcc_thread_49 == 1){//sysj\ECS.sysj line: 57, column: 28
        S196944=0;
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
        S196944=1;
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
          S196963=1;
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
      }
    }
  }

  public void thread207555(int [] tdone, int [] ends){
        switch(S196987){
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

  public void thread207554(int [] tdone, int [] ends){
        switch(S196967){
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

  public void thread207553(int [] tdone, int [] ends){
        switch(S196964){
      case 0 : 
        active[49]=0;
        ends[49]=0;
        tdone[49]=1;
        break;
      
      case 1 : 
        switch(S196963){
          case 0 : 
            switch(S196944){
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
            S196963=1;
            S196964=0;
            active[49]=0;
            ends[49]=0;
            tdone[49]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread207552(int [] tdone, int [] ends){
        switch(S197170){
      case 0 : 
        active[48]=0;
        ends[48]=0;
        tdone[48]=1;
        break;
      
      case 1 : 
        test_48.setClear();//sysj\ECS.sysj line: 47, column: 5
        thread207553(tdone,ends);
        thread207554(tdone,ends);
        thread207555(tdone,ends);
        int biggest207556 = 0;
        if(ends[49]>=biggest207556){
          biggest207556=ends[49];
        }
        if(ends[50]>=biggest207556){
          biggest207556=ends[50];
        }
        if(ends[51]>=biggest207556){
          biggest207556=ends[51];
        }
        if(biggest207556 == 1){
          active[48]=1;
          ends[48]=1;
          tdone[48]=1;
        }
        if(biggest207556 == 2){
          ends[48]=2;
          ;//sysj\ECS.sysj line: 51, column: 9
          thread207557(tdone,ends);
          thread207558(tdone,ends);
          thread207559(tdone,ends);
          int biggest207560 = 0;
          if(ends[49]>=biggest207560){
            biggest207560=ends[49];
          }
          if(ends[50]>=biggest207560){
            biggest207560=ends[50];
          }
          if(ends[51]>=biggest207560){
            biggest207560=ends[51];
          }
          if(biggest207560 == 1){
            active[48]=1;
            ends[48]=1;
            tdone[48]=1;
          }
        }
        //FINXME code
        if(biggest207556 == 0){
          thread207561(tdone,ends);
          thread207562(tdone,ends);
          thread207563(tdone,ends);
          int biggest207564 = 0;
          if(ends[49]>=biggest207564){
            biggest207564=ends[49];
          }
          if(ends[50]>=biggest207564){
            biggest207564=ends[50];
          }
          if(ends[51]>=biggest207564){
            biggest207564=ends[51];
          }
          if(biggest207564 == 1){
            active[48]=1;
            ends[48]=1;
            tdone[48]=1;
          }
        }
        break;
      
    }
  }

  public void thread207550(int [] tdone, int [] ends){
        S196743=1;
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

  public void thread207549(int [] tdone, int [] ends){
        S196723=1;
    active[46]=1;
    ends[46]=1;
    tdone[46]=1;
  }

  public void thread207548(int [] tdone, int [] ends){
        S196720=1;
    zoneOcc_thread_45 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 53, column: 17
    S196719=0;
    if(afterhrs_1.getprestatus() && (zoneOcc_thread_45 == 0)){//sysj\ECS.sysj line: 55, column: 21
      zoneFourLightingI.setPresent();//sysj\ECS.sysj line: 56, column: 18
      currsigs.addElement(zoneFourLightingI);
      zoneFourLightingI.setValue(0);//sysj\ECS.sysj line: 56, column: 18
      S196719=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      if(afterhrs_1.getprestatus() && zoneOcc_thread_45 == 1){//sysj\ECS.sysj line: 57, column: 28
        S196700=0;
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
        S196700=1;
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
          S196719=1;
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
      }
    }
  }

  public void thread207546(int [] tdone, int [] ends){
        S196743=1;
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

  public void thread207545(int [] tdone, int [] ends){
        S196723=1;
    active[46]=1;
    ends[46]=1;
    tdone[46]=1;
  }

  public void thread207544(int [] tdone, int [] ends){
        S196720=1;
    zoneOcc_thread_45 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 53, column: 17
    S196719=0;
    if(afterhrs_1.getprestatus() && (zoneOcc_thread_45 == 0)){//sysj\ECS.sysj line: 55, column: 21
      zoneFourLightingI.setPresent();//sysj\ECS.sysj line: 56, column: 18
      currsigs.addElement(zoneFourLightingI);
      zoneFourLightingI.setValue(0);//sysj\ECS.sysj line: 56, column: 18
      S196719=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      if(afterhrs_1.getprestatus() && zoneOcc_thread_45 == 1){//sysj\ECS.sysj line: 57, column: 28
        S196700=0;
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
        S196700=1;
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
          S196719=1;
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
      }
    }
  }

  public void thread207542(int [] tdone, int [] ends){
        switch(S196743){
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

  public void thread207541(int [] tdone, int [] ends){
        switch(S196723){
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

  public void thread207540(int [] tdone, int [] ends){
        switch(S196720){
      case 0 : 
        active[45]=0;
        ends[45]=0;
        tdone[45]=1;
        break;
      
      case 1 : 
        switch(S196719){
          case 0 : 
            switch(S196700){
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
            S196719=1;
            S196720=0;
            active[45]=0;
            ends[45]=0;
            tdone[45]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread207539(int [] tdone, int [] ends){
        switch(S196926){
      case 0 : 
        active[44]=0;
        ends[44]=0;
        tdone[44]=1;
        break;
      
      case 1 : 
        test_44.setClear();//sysj\ECS.sysj line: 47, column: 5
        thread207540(tdone,ends);
        thread207541(tdone,ends);
        thread207542(tdone,ends);
        int biggest207543 = 0;
        if(ends[45]>=biggest207543){
          biggest207543=ends[45];
        }
        if(ends[46]>=biggest207543){
          biggest207543=ends[46];
        }
        if(ends[47]>=biggest207543){
          biggest207543=ends[47];
        }
        if(biggest207543 == 1){
          active[44]=1;
          ends[44]=1;
          tdone[44]=1;
        }
        if(biggest207543 == 2){
          ends[44]=2;
          ;//sysj\ECS.sysj line: 51, column: 9
          thread207544(tdone,ends);
          thread207545(tdone,ends);
          thread207546(tdone,ends);
          int biggest207547 = 0;
          if(ends[45]>=biggest207547){
            biggest207547=ends[45];
          }
          if(ends[46]>=biggest207547){
            biggest207547=ends[46];
          }
          if(ends[47]>=biggest207547){
            biggest207547=ends[47];
          }
          if(biggest207547 == 1){
            active[44]=1;
            ends[44]=1;
            tdone[44]=1;
          }
        }
        //FINXME code
        if(biggest207543 == 0){
          thread207548(tdone,ends);
          thread207549(tdone,ends);
          thread207550(tdone,ends);
          int biggest207551 = 0;
          if(ends[45]>=biggest207551){
            biggest207551=ends[45];
          }
          if(ends[46]>=biggest207551){
            biggest207551=ends[46];
          }
          if(ends[47]>=biggest207551){
            biggest207551=ends[47];
          }
          if(biggest207551 == 1){
            active[44]=1;
            ends[44]=1;
            tdone[44]=1;
          }
        }
        break;
      
    }
  }

  public void thread207537(int [] tdone, int [] ends){
        S196499=1;
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

  public void thread207536(int [] tdone, int [] ends){
        S196479=1;
    active[42]=1;
    ends[42]=1;
    tdone[42]=1;
  }

  public void thread207535(int [] tdone, int [] ends){
        S196476=1;
    zoneOcc_thread_41 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 53, column: 17
    S196475=0;
    if(afterhrs_1.getprestatus() && (zoneOcc_thread_41 == 0)){//sysj\ECS.sysj line: 55, column: 21
      zoneThreeLightingI.setPresent();//sysj\ECS.sysj line: 56, column: 18
      currsigs.addElement(zoneThreeLightingI);
      zoneThreeLightingI.setValue(0);//sysj\ECS.sysj line: 56, column: 18
      S196475=1;
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
    else {
      if(afterhrs_1.getprestatus() && zoneOcc_thread_41 == 1){//sysj\ECS.sysj line: 57, column: 28
        S196456=0;
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
        S196456=1;
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
          S196475=1;
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
      }
    }
  }

  public void thread207533(int [] tdone, int [] ends){
        S196499=1;
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

  public void thread207532(int [] tdone, int [] ends){
        S196479=1;
    active[42]=1;
    ends[42]=1;
    tdone[42]=1;
  }

  public void thread207531(int [] tdone, int [] ends){
        S196476=1;
    zoneOcc_thread_41 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 53, column: 17
    S196475=0;
    if(afterhrs_1.getprestatus() && (zoneOcc_thread_41 == 0)){//sysj\ECS.sysj line: 55, column: 21
      zoneThreeLightingI.setPresent();//sysj\ECS.sysj line: 56, column: 18
      currsigs.addElement(zoneThreeLightingI);
      zoneThreeLightingI.setValue(0);//sysj\ECS.sysj line: 56, column: 18
      S196475=1;
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
    else {
      if(afterhrs_1.getprestatus() && zoneOcc_thread_41 == 1){//sysj\ECS.sysj line: 57, column: 28
        S196456=0;
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
        S196456=1;
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
          S196475=1;
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
      }
    }
  }

  public void thread207529(int [] tdone, int [] ends){
        switch(S196499){
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

  public void thread207528(int [] tdone, int [] ends){
        switch(S196479){
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

  public void thread207527(int [] tdone, int [] ends){
        switch(S196476){
      case 0 : 
        active[41]=0;
        ends[41]=0;
        tdone[41]=1;
        break;
      
      case 1 : 
        switch(S196475){
          case 0 : 
            switch(S196456){
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
            S196475=1;
            S196476=0;
            active[41]=0;
            ends[41]=0;
            tdone[41]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread207526(int [] tdone, int [] ends){
        switch(S196682){
      case 0 : 
        active[40]=0;
        ends[40]=0;
        tdone[40]=1;
        break;
      
      case 1 : 
        test_40.setClear();//sysj\ECS.sysj line: 47, column: 5
        thread207527(tdone,ends);
        thread207528(tdone,ends);
        thread207529(tdone,ends);
        int biggest207530 = 0;
        if(ends[41]>=biggest207530){
          biggest207530=ends[41];
        }
        if(ends[42]>=biggest207530){
          biggest207530=ends[42];
        }
        if(ends[43]>=biggest207530){
          biggest207530=ends[43];
        }
        if(biggest207530 == 1){
          active[40]=1;
          ends[40]=1;
          tdone[40]=1;
        }
        if(biggest207530 == 2){
          ends[40]=2;
          ;//sysj\ECS.sysj line: 51, column: 9
          thread207531(tdone,ends);
          thread207532(tdone,ends);
          thread207533(tdone,ends);
          int biggest207534 = 0;
          if(ends[41]>=biggest207534){
            biggest207534=ends[41];
          }
          if(ends[42]>=biggest207534){
            biggest207534=ends[42];
          }
          if(ends[43]>=biggest207534){
            biggest207534=ends[43];
          }
          if(biggest207534 == 1){
            active[40]=1;
            ends[40]=1;
            tdone[40]=1;
          }
        }
        //FINXME code
        if(biggest207530 == 0){
          thread207535(tdone,ends);
          thread207536(tdone,ends);
          thread207537(tdone,ends);
          int biggest207538 = 0;
          if(ends[41]>=biggest207538){
            biggest207538=ends[41];
          }
          if(ends[42]>=biggest207538){
            biggest207538=ends[42];
          }
          if(ends[43]>=biggest207538){
            biggest207538=ends[43];
          }
          if(biggest207538 == 1){
            active[40]=1;
            ends[40]=1;
            tdone[40]=1;
          }
        }
        break;
      
    }
  }

  public void thread207524(int [] tdone, int [] ends){
        S196255=1;
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

  public void thread207523(int [] tdone, int [] ends){
        S196235=1;
    active[38]=1;
    ends[38]=1;
    tdone[38]=1;
  }

  public void thread207522(int [] tdone, int [] ends){
        S196232=1;
    zoneOcc_thread_37 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 53, column: 17
    S196231=0;
    if(afterhrs_1.getprestatus() && (zoneOcc_thread_37 == 0)){//sysj\ECS.sysj line: 55, column: 21
      zoneTwoLightingI.setPresent();//sysj\ECS.sysj line: 56, column: 18
      currsigs.addElement(zoneTwoLightingI);
      zoneTwoLightingI.setValue(0);//sysj\ECS.sysj line: 56, column: 18
      S196231=1;
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      if(afterhrs_1.getprestatus() && zoneOcc_thread_37 == 1){//sysj\ECS.sysj line: 57, column: 28
        S196212=0;
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
        S196212=1;
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
          S196231=1;
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
      }
    }
  }

  public void thread207520(int [] tdone, int [] ends){
        S196255=1;
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

  public void thread207519(int [] tdone, int [] ends){
        S196235=1;
    active[38]=1;
    ends[38]=1;
    tdone[38]=1;
  }

  public void thread207518(int [] tdone, int [] ends){
        S196232=1;
    zoneOcc_thread_37 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 53, column: 17
    S196231=0;
    if(afterhrs_1.getprestatus() && (zoneOcc_thread_37 == 0)){//sysj\ECS.sysj line: 55, column: 21
      zoneTwoLightingI.setPresent();//sysj\ECS.sysj line: 56, column: 18
      currsigs.addElement(zoneTwoLightingI);
      zoneTwoLightingI.setValue(0);//sysj\ECS.sysj line: 56, column: 18
      S196231=1;
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      if(afterhrs_1.getprestatus() && zoneOcc_thread_37 == 1){//sysj\ECS.sysj line: 57, column: 28
        S196212=0;
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
        S196212=1;
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
          S196231=1;
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
      }
    }
  }

  public void thread207516(int [] tdone, int [] ends){
        switch(S196255){
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

  public void thread207515(int [] tdone, int [] ends){
        switch(S196235){
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

  public void thread207514(int [] tdone, int [] ends){
        switch(S196232){
      case 0 : 
        active[37]=0;
        ends[37]=0;
        tdone[37]=1;
        break;
      
      case 1 : 
        switch(S196231){
          case 0 : 
            switch(S196212){
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
            S196231=1;
            S196232=0;
            active[37]=0;
            ends[37]=0;
            tdone[37]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread207513(int [] tdone, int [] ends){
        switch(S196438){
      case 0 : 
        active[36]=0;
        ends[36]=0;
        tdone[36]=1;
        break;
      
      case 1 : 
        test_36.setClear();//sysj\ECS.sysj line: 47, column: 5
        thread207514(tdone,ends);
        thread207515(tdone,ends);
        thread207516(tdone,ends);
        int biggest207517 = 0;
        if(ends[37]>=biggest207517){
          biggest207517=ends[37];
        }
        if(ends[38]>=biggest207517){
          biggest207517=ends[38];
        }
        if(ends[39]>=biggest207517){
          biggest207517=ends[39];
        }
        if(biggest207517 == 1){
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        if(biggest207517 == 2){
          ends[36]=2;
          ;//sysj\ECS.sysj line: 51, column: 9
          thread207518(tdone,ends);
          thread207519(tdone,ends);
          thread207520(tdone,ends);
          int biggest207521 = 0;
          if(ends[37]>=biggest207521){
            biggest207521=ends[37];
          }
          if(ends[38]>=biggest207521){
            biggest207521=ends[38];
          }
          if(ends[39]>=biggest207521){
            biggest207521=ends[39];
          }
          if(biggest207521 == 1){
            active[36]=1;
            ends[36]=1;
            tdone[36]=1;
          }
        }
        //FINXME code
        if(biggest207517 == 0){
          thread207522(tdone,ends);
          thread207523(tdone,ends);
          thread207524(tdone,ends);
          int biggest207525 = 0;
          if(ends[37]>=biggest207525){
            biggest207525=ends[37];
          }
          if(ends[38]>=biggest207525){
            biggest207525=ends[38];
          }
          if(ends[39]>=biggest207525){
            biggest207525=ends[39];
          }
          if(biggest207525 == 1){
            active[36]=1;
            ends[36]=1;
            tdone[36]=1;
          }
        }
        break;
      
    }
  }

  public void thread207511(int [] tdone, int [] ends){
        S196011=1;
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

  public void thread207510(int [] tdone, int [] ends){
        S195991=1;
    active[34]=1;
    ends[34]=1;
    tdone[34]=1;
  }

  public void thread207509(int [] tdone, int [] ends){
        S195988=1;
    zoneOcc_thread_33 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 53, column: 17
    S195987=0;
    if(afterhrs_1.getprestatus() && (zoneOcc_thread_33 == 0)){//sysj\ECS.sysj line: 55, column: 21
      zoneOneLightingI.setPresent();//sysj\ECS.sysj line: 56, column: 18
      currsigs.addElement(zoneOneLightingI);
      zoneOneLightingI.setValue(0);//sysj\ECS.sysj line: 56, column: 18
      S195987=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      if(afterhrs_1.getprestatus() && zoneOcc_thread_33 == 1){//sysj\ECS.sysj line: 57, column: 28
        S195968=0;
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
        S195968=1;
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
          S195987=1;
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
      }
    }
  }

  public void thread207507(int [] tdone, int [] ends){
        S196011=1;
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

  public void thread207506(int [] tdone, int [] ends){
        S195991=1;
    active[34]=1;
    ends[34]=1;
    tdone[34]=1;
  }

  public void thread207505(int [] tdone, int [] ends){
        S195988=1;
    zoneOcc_thread_33 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 53, column: 17
    S195987=0;
    if(afterhrs_1.getprestatus() && (zoneOcc_thread_33 == 0)){//sysj\ECS.sysj line: 55, column: 21
      zoneOneLightingI.setPresent();//sysj\ECS.sysj line: 56, column: 18
      currsigs.addElement(zoneOneLightingI);
      zoneOneLightingI.setValue(0);//sysj\ECS.sysj line: 56, column: 18
      S195987=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      if(afterhrs_1.getprestatus() && zoneOcc_thread_33 == 1){//sysj\ECS.sysj line: 57, column: 28
        S195968=0;
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
        S195968=1;
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
          S195987=1;
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
      }
    }
  }

  public void thread207503(int [] tdone, int [] ends){
        switch(S196011){
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

  public void thread207502(int [] tdone, int [] ends){
        switch(S195991){
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

  public void thread207501(int [] tdone, int [] ends){
        switch(S195988){
      case 0 : 
        active[33]=0;
        ends[33]=0;
        tdone[33]=1;
        break;
      
      case 1 : 
        switch(S195987){
          case 0 : 
            switch(S195968){
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
            S195987=1;
            S195988=0;
            active[33]=0;
            ends[33]=0;
            tdone[33]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread207500(int [] tdone, int [] ends){
        switch(S196194){
      case 0 : 
        active[32]=0;
        ends[32]=0;
        tdone[32]=1;
        break;
      
      case 1 : 
        test_32.setClear();//sysj\ECS.sysj line: 47, column: 5
        thread207501(tdone,ends);
        thread207502(tdone,ends);
        thread207503(tdone,ends);
        int biggest207504 = 0;
        if(ends[33]>=biggest207504){
          biggest207504=ends[33];
        }
        if(ends[34]>=biggest207504){
          biggest207504=ends[34];
        }
        if(ends[35]>=biggest207504){
          biggest207504=ends[35];
        }
        if(biggest207504 == 1){
          active[32]=1;
          ends[32]=1;
          tdone[32]=1;
        }
        if(biggest207504 == 2){
          ends[32]=2;
          ;//sysj\ECS.sysj line: 51, column: 9
          thread207505(tdone,ends);
          thread207506(tdone,ends);
          thread207507(tdone,ends);
          int biggest207508 = 0;
          if(ends[33]>=biggest207508){
            biggest207508=ends[33];
          }
          if(ends[34]>=biggest207508){
            biggest207508=ends[34];
          }
          if(ends[35]>=biggest207508){
            biggest207508=ends[35];
          }
          if(biggest207508 == 1){
            active[32]=1;
            ends[32]=1;
            tdone[32]=1;
          }
        }
        //FINXME code
        if(biggest207504 == 0){
          thread207509(tdone,ends);
          thread207510(tdone,ends);
          thread207511(tdone,ends);
          int biggest207512 = 0;
          if(ends[33]>=biggest207512){
            biggest207512=ends[33];
          }
          if(ends[34]>=biggest207512){
            biggest207512=ends[34];
          }
          if(ends[35]>=biggest207512){
            biggest207512=ends[35];
          }
          if(biggest207512 == 1){
            active[32]=1;
            ends[32]=1;
            tdone[32]=1;
          }
        }
        break;
      
    }
  }

  public void thread207498(int [] tdone, int [] ends){
        S195767=1;
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

  public void thread207497(int [] tdone, int [] ends){
        S195747=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread207496(int [] tdone, int [] ends){
        S195744=1;
    zoneOcc_thread_29 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 9, column: 17
    S195743=0;
    if(workhrs_1.getprestatus() && (zoneOcc_thread_29 == 0)){//sysj\ECS.sysj line: 11, column: 21
      zoneSevenLightingI.setPresent();//sysj\ECS.sysj line: 12, column: 18
      currsigs.addElement(zoneSevenLightingI);
      zoneSevenLightingI.setValue(0);//sysj\ECS.sysj line: 12, column: 18
      S195743=1;
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
    else {
      if(workhrs_1.getprestatus() && zoneOcc_thread_29 == 1){//sysj\ECS.sysj line: 13, column: 28
        S195724=0;
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
        S195724=1;
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
          S195743=1;
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
      }
    }
  }

  public void thread207494(int [] tdone, int [] ends){
        S195767=1;
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

  public void thread207493(int [] tdone, int [] ends){
        S195747=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread207492(int [] tdone, int [] ends){
        S195744=1;
    zoneOcc_thread_29 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 9, column: 17
    S195743=0;
    if(workhrs_1.getprestatus() && (zoneOcc_thread_29 == 0)){//sysj\ECS.sysj line: 11, column: 21
      zoneSevenLightingI.setPresent();//sysj\ECS.sysj line: 12, column: 18
      currsigs.addElement(zoneSevenLightingI);
      zoneSevenLightingI.setValue(0);//sysj\ECS.sysj line: 12, column: 18
      S195743=1;
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
    else {
      if(workhrs_1.getprestatus() && zoneOcc_thread_29 == 1){//sysj\ECS.sysj line: 13, column: 28
        S195724=0;
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
        S195724=1;
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
          S195743=1;
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
      }
    }
  }

  public void thread207490(int [] tdone, int [] ends){
        switch(S195767){
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

  public void thread207489(int [] tdone, int [] ends){
        switch(S195747){
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

  public void thread207488(int [] tdone, int [] ends){
        switch(S195744){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        switch(S195743){
          case 0 : 
            switch(S195724){
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
            S195743=1;
            S195744=0;
            active[29]=0;
            ends[29]=0;
            tdone[29]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread207487(int [] tdone, int [] ends){
        switch(S195950){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        test_28.setClear();//sysj\ECS.sysj line: 3, column: 5
        thread207488(tdone,ends);
        thread207489(tdone,ends);
        thread207490(tdone,ends);
        int biggest207491 = 0;
        if(ends[29]>=biggest207491){
          biggest207491=ends[29];
        }
        if(ends[30]>=biggest207491){
          biggest207491=ends[30];
        }
        if(ends[31]>=biggest207491){
          biggest207491=ends[31];
        }
        if(biggest207491 == 1){
          active[28]=1;
          ends[28]=1;
          tdone[28]=1;
        }
        if(biggest207491 == 2){
          ends[28]=2;
          ;//sysj\ECS.sysj line: 7, column: 9
          thread207492(tdone,ends);
          thread207493(tdone,ends);
          thread207494(tdone,ends);
          int biggest207495 = 0;
          if(ends[29]>=biggest207495){
            biggest207495=ends[29];
          }
          if(ends[30]>=biggest207495){
            biggest207495=ends[30];
          }
          if(ends[31]>=biggest207495){
            biggest207495=ends[31];
          }
          if(biggest207495 == 1){
            active[28]=1;
            ends[28]=1;
            tdone[28]=1;
          }
        }
        //FINXME code
        if(biggest207491 == 0){
          thread207496(tdone,ends);
          thread207497(tdone,ends);
          thread207498(tdone,ends);
          int biggest207499 = 0;
          if(ends[29]>=biggest207499){
            biggest207499=ends[29];
          }
          if(ends[30]>=biggest207499){
            biggest207499=ends[30];
          }
          if(ends[31]>=biggest207499){
            biggest207499=ends[31];
          }
          if(biggest207499 == 1){
            active[28]=1;
            ends[28]=1;
            tdone[28]=1;
          }
        }
        break;
      
    }
  }

  public void thread207485(int [] tdone, int [] ends){
        S195523=1;
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

  public void thread207484(int [] tdone, int [] ends){
        S195503=1;
    active[26]=1;
    ends[26]=1;
    tdone[26]=1;
  }

  public void thread207483(int [] tdone, int [] ends){
        S195500=1;
    zoneOcc_thread_25 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 9, column: 17
    S195499=0;
    if(workhrs_1.getprestatus() && (zoneOcc_thread_25 == 0)){//sysj\ECS.sysj line: 11, column: 21
      zoneSixLightingI.setPresent();//sysj\ECS.sysj line: 12, column: 18
      currsigs.addElement(zoneSixLightingI);
      zoneSixLightingI.setValue(0);//sysj\ECS.sysj line: 12, column: 18
      S195499=1;
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    else {
      if(workhrs_1.getprestatus() && zoneOcc_thread_25 == 1){//sysj\ECS.sysj line: 13, column: 28
        S195480=0;
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
        S195480=1;
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
          S195499=1;
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
      }
    }
  }

  public void thread207481(int [] tdone, int [] ends){
        S195523=1;
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

  public void thread207480(int [] tdone, int [] ends){
        S195503=1;
    active[26]=1;
    ends[26]=1;
    tdone[26]=1;
  }

  public void thread207479(int [] tdone, int [] ends){
        S195500=1;
    zoneOcc_thread_25 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 9, column: 17
    S195499=0;
    if(workhrs_1.getprestatus() && (zoneOcc_thread_25 == 0)){//sysj\ECS.sysj line: 11, column: 21
      zoneSixLightingI.setPresent();//sysj\ECS.sysj line: 12, column: 18
      currsigs.addElement(zoneSixLightingI);
      zoneSixLightingI.setValue(0);//sysj\ECS.sysj line: 12, column: 18
      S195499=1;
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    else {
      if(workhrs_1.getprestatus() && zoneOcc_thread_25 == 1){//sysj\ECS.sysj line: 13, column: 28
        S195480=0;
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
        S195480=1;
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
          S195499=1;
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
      }
    }
  }

  public void thread207477(int [] tdone, int [] ends){
        switch(S195523){
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

  public void thread207476(int [] tdone, int [] ends){
        switch(S195503){
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

  public void thread207475(int [] tdone, int [] ends){
        switch(S195500){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        switch(S195499){
          case 0 : 
            switch(S195480){
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
            S195499=1;
            S195500=0;
            active[25]=0;
            ends[25]=0;
            tdone[25]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread207474(int [] tdone, int [] ends){
        switch(S195706){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        test_24.setClear();//sysj\ECS.sysj line: 3, column: 5
        thread207475(tdone,ends);
        thread207476(tdone,ends);
        thread207477(tdone,ends);
        int biggest207478 = 0;
        if(ends[25]>=biggest207478){
          biggest207478=ends[25];
        }
        if(ends[26]>=biggest207478){
          biggest207478=ends[26];
        }
        if(ends[27]>=biggest207478){
          biggest207478=ends[27];
        }
        if(biggest207478 == 1){
          active[24]=1;
          ends[24]=1;
          tdone[24]=1;
        }
        if(biggest207478 == 2){
          ends[24]=2;
          ;//sysj\ECS.sysj line: 7, column: 9
          thread207479(tdone,ends);
          thread207480(tdone,ends);
          thread207481(tdone,ends);
          int biggest207482 = 0;
          if(ends[25]>=biggest207482){
            biggest207482=ends[25];
          }
          if(ends[26]>=biggest207482){
            biggest207482=ends[26];
          }
          if(ends[27]>=biggest207482){
            biggest207482=ends[27];
          }
          if(biggest207482 == 1){
            active[24]=1;
            ends[24]=1;
            tdone[24]=1;
          }
        }
        //FINXME code
        if(biggest207478 == 0){
          thread207483(tdone,ends);
          thread207484(tdone,ends);
          thread207485(tdone,ends);
          int biggest207486 = 0;
          if(ends[25]>=biggest207486){
            biggest207486=ends[25];
          }
          if(ends[26]>=biggest207486){
            biggest207486=ends[26];
          }
          if(ends[27]>=biggest207486){
            biggest207486=ends[27];
          }
          if(biggest207486 == 1){
            active[24]=1;
            ends[24]=1;
            tdone[24]=1;
          }
        }
        break;
      
    }
  }

  public void thread207472(int [] tdone, int [] ends){
        S195279=1;
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

  public void thread207471(int [] tdone, int [] ends){
        S195259=1;
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread207470(int [] tdone, int [] ends){
        S195256=1;
    zoneOcc_thread_21 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 9, column: 17
    S195255=0;
    if(workhrs_1.getprestatus() && (zoneOcc_thread_21 == 0)){//sysj\ECS.sysj line: 11, column: 21
      zoneFiveLightingI.setPresent();//sysj\ECS.sysj line: 12, column: 18
      currsigs.addElement(zoneFiveLightingI);
      zoneFiveLightingI.setValue(0);//sysj\ECS.sysj line: 12, column: 18
      S195255=1;
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    else {
      if(workhrs_1.getprestatus() && zoneOcc_thread_21 == 1){//sysj\ECS.sysj line: 13, column: 28
        S195236=0;
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
        S195236=1;
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
          S195255=1;
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
      }
    }
  }

  public void thread207468(int [] tdone, int [] ends){
        S195279=1;
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

  public void thread207467(int [] tdone, int [] ends){
        S195259=1;
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread207466(int [] tdone, int [] ends){
        S195256=1;
    zoneOcc_thread_21 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 9, column: 17
    S195255=0;
    if(workhrs_1.getprestatus() && (zoneOcc_thread_21 == 0)){//sysj\ECS.sysj line: 11, column: 21
      zoneFiveLightingI.setPresent();//sysj\ECS.sysj line: 12, column: 18
      currsigs.addElement(zoneFiveLightingI);
      zoneFiveLightingI.setValue(0);//sysj\ECS.sysj line: 12, column: 18
      S195255=1;
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    else {
      if(workhrs_1.getprestatus() && zoneOcc_thread_21 == 1){//sysj\ECS.sysj line: 13, column: 28
        S195236=0;
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
        S195236=1;
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
          S195255=1;
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
      }
    }
  }

  public void thread207464(int [] tdone, int [] ends){
        switch(S195279){
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

  public void thread207463(int [] tdone, int [] ends){
        switch(S195259){
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

  public void thread207462(int [] tdone, int [] ends){
        switch(S195256){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        switch(S195255){
          case 0 : 
            switch(S195236){
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
            S195255=1;
            S195256=0;
            active[21]=0;
            ends[21]=0;
            tdone[21]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread207461(int [] tdone, int [] ends){
        switch(S195462){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        test_20.setClear();//sysj\ECS.sysj line: 3, column: 5
        thread207462(tdone,ends);
        thread207463(tdone,ends);
        thread207464(tdone,ends);
        int biggest207465 = 0;
        if(ends[21]>=biggest207465){
          biggest207465=ends[21];
        }
        if(ends[22]>=biggest207465){
          biggest207465=ends[22];
        }
        if(ends[23]>=biggest207465){
          biggest207465=ends[23];
        }
        if(biggest207465 == 1){
          active[20]=1;
          ends[20]=1;
          tdone[20]=1;
        }
        if(biggest207465 == 2){
          ends[20]=2;
          ;//sysj\ECS.sysj line: 7, column: 9
          thread207466(tdone,ends);
          thread207467(tdone,ends);
          thread207468(tdone,ends);
          int biggest207469 = 0;
          if(ends[21]>=biggest207469){
            biggest207469=ends[21];
          }
          if(ends[22]>=biggest207469){
            biggest207469=ends[22];
          }
          if(ends[23]>=biggest207469){
            biggest207469=ends[23];
          }
          if(biggest207469 == 1){
            active[20]=1;
            ends[20]=1;
            tdone[20]=1;
          }
        }
        //FINXME code
        if(biggest207465 == 0){
          thread207470(tdone,ends);
          thread207471(tdone,ends);
          thread207472(tdone,ends);
          int biggest207473 = 0;
          if(ends[21]>=biggest207473){
            biggest207473=ends[21];
          }
          if(ends[22]>=biggest207473){
            biggest207473=ends[22];
          }
          if(ends[23]>=biggest207473){
            biggest207473=ends[23];
          }
          if(biggest207473 == 1){
            active[20]=1;
            ends[20]=1;
            tdone[20]=1;
          }
        }
        break;
      
    }
  }

  public void thread207459(int [] tdone, int [] ends){
        S195035=1;
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

  public void thread207458(int [] tdone, int [] ends){
        S195015=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread207457(int [] tdone, int [] ends){
        S195012=1;
    zoneOcc_thread_17 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 9, column: 17
    S195011=0;
    if(workhrs_1.getprestatus() && (zoneOcc_thread_17 == 0)){//sysj\ECS.sysj line: 11, column: 21
      zoneFourLightingI.setPresent();//sysj\ECS.sysj line: 12, column: 18
      currsigs.addElement(zoneFourLightingI);
      zoneFourLightingI.setValue(0);//sysj\ECS.sysj line: 12, column: 18
      S195011=1;
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
    else {
      if(workhrs_1.getprestatus() && zoneOcc_thread_17 == 1){//sysj\ECS.sysj line: 13, column: 28
        S194992=0;
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
        S194992=1;
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
          S195011=1;
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
      }
    }
  }

  public void thread207455(int [] tdone, int [] ends){
        S195035=1;
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

  public void thread207454(int [] tdone, int [] ends){
        S195015=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread207453(int [] tdone, int [] ends){
        S195012=1;
    zoneOcc_thread_17 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 9, column: 17
    S195011=0;
    if(workhrs_1.getprestatus() && (zoneOcc_thread_17 == 0)){//sysj\ECS.sysj line: 11, column: 21
      zoneFourLightingI.setPresent();//sysj\ECS.sysj line: 12, column: 18
      currsigs.addElement(zoneFourLightingI);
      zoneFourLightingI.setValue(0);//sysj\ECS.sysj line: 12, column: 18
      S195011=1;
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
    else {
      if(workhrs_1.getprestatus() && zoneOcc_thread_17 == 1){//sysj\ECS.sysj line: 13, column: 28
        S194992=0;
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
        S194992=1;
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
          S195011=1;
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
      }
    }
  }

  public void thread207451(int [] tdone, int [] ends){
        switch(S195035){
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

  public void thread207450(int [] tdone, int [] ends){
        switch(S195015){
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

  public void thread207449(int [] tdone, int [] ends){
        switch(S195012){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        switch(S195011){
          case 0 : 
            switch(S194992){
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
            S195011=1;
            S195012=0;
            active[17]=0;
            ends[17]=0;
            tdone[17]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread207448(int [] tdone, int [] ends){
        switch(S195218){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        test_16.setClear();//sysj\ECS.sysj line: 3, column: 5
        thread207449(tdone,ends);
        thread207450(tdone,ends);
        thread207451(tdone,ends);
        int biggest207452 = 0;
        if(ends[17]>=biggest207452){
          biggest207452=ends[17];
        }
        if(ends[18]>=biggest207452){
          biggest207452=ends[18];
        }
        if(ends[19]>=biggest207452){
          biggest207452=ends[19];
        }
        if(biggest207452 == 1){
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
        if(biggest207452 == 2){
          ends[16]=2;
          ;//sysj\ECS.sysj line: 7, column: 9
          thread207453(tdone,ends);
          thread207454(tdone,ends);
          thread207455(tdone,ends);
          int biggest207456 = 0;
          if(ends[17]>=biggest207456){
            biggest207456=ends[17];
          }
          if(ends[18]>=biggest207456){
            biggest207456=ends[18];
          }
          if(ends[19]>=biggest207456){
            biggest207456=ends[19];
          }
          if(biggest207456 == 1){
            active[16]=1;
            ends[16]=1;
            tdone[16]=1;
          }
        }
        //FINXME code
        if(biggest207452 == 0){
          thread207457(tdone,ends);
          thread207458(tdone,ends);
          thread207459(tdone,ends);
          int biggest207460 = 0;
          if(ends[17]>=biggest207460){
            biggest207460=ends[17];
          }
          if(ends[18]>=biggest207460){
            biggest207460=ends[18];
          }
          if(ends[19]>=biggest207460){
            biggest207460=ends[19];
          }
          if(biggest207460 == 1){
            active[16]=1;
            ends[16]=1;
            tdone[16]=1;
          }
        }
        break;
      
    }
  }

  public void thread207446(int [] tdone, int [] ends){
        S194791=1;
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

  public void thread207445(int [] tdone, int [] ends){
        S194771=1;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread207444(int [] tdone, int [] ends){
        S194768=1;
    zoneOcc_thread_13 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 9, column: 17
    S194767=0;
    if(workhrs_1.getprestatus() && (zoneOcc_thread_13 == 0)){//sysj\ECS.sysj line: 11, column: 21
      zoneThreeLightingI.setPresent();//sysj\ECS.sysj line: 12, column: 18
      currsigs.addElement(zoneThreeLightingI);
      zoneThreeLightingI.setValue(0);//sysj\ECS.sysj line: 12, column: 18
      S194767=1;
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
    else {
      if(workhrs_1.getprestatus() && zoneOcc_thread_13 == 1){//sysj\ECS.sysj line: 13, column: 28
        S194748=0;
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
        S194748=1;
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
          S194767=1;
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
      }
    }
  }

  public void thread207442(int [] tdone, int [] ends){
        S194791=1;
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

  public void thread207441(int [] tdone, int [] ends){
        S194771=1;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread207440(int [] tdone, int [] ends){
        S194768=1;
    zoneOcc_thread_13 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 9, column: 17
    S194767=0;
    if(workhrs_1.getprestatus() && (zoneOcc_thread_13 == 0)){//sysj\ECS.sysj line: 11, column: 21
      zoneThreeLightingI.setPresent();//sysj\ECS.sysj line: 12, column: 18
      currsigs.addElement(zoneThreeLightingI);
      zoneThreeLightingI.setValue(0);//sysj\ECS.sysj line: 12, column: 18
      S194767=1;
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
    else {
      if(workhrs_1.getprestatus() && zoneOcc_thread_13 == 1){//sysj\ECS.sysj line: 13, column: 28
        S194748=0;
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
        S194748=1;
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
          S194767=1;
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
      }
    }
  }

  public void thread207438(int [] tdone, int [] ends){
        switch(S194791){
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

  public void thread207437(int [] tdone, int [] ends){
        switch(S194771){
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

  public void thread207436(int [] tdone, int [] ends){
        switch(S194768){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S194767){
          case 0 : 
            switch(S194748){
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
            S194767=1;
            S194768=0;
            active[13]=0;
            ends[13]=0;
            tdone[13]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread207435(int [] tdone, int [] ends){
        switch(S194974){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        test_12.setClear();//sysj\ECS.sysj line: 3, column: 5
        thread207436(tdone,ends);
        thread207437(tdone,ends);
        thread207438(tdone,ends);
        int biggest207439 = 0;
        if(ends[13]>=biggest207439){
          biggest207439=ends[13];
        }
        if(ends[14]>=biggest207439){
          biggest207439=ends[14];
        }
        if(ends[15]>=biggest207439){
          biggest207439=ends[15];
        }
        if(biggest207439 == 1){
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        if(biggest207439 == 2){
          ends[12]=2;
          ;//sysj\ECS.sysj line: 7, column: 9
          thread207440(tdone,ends);
          thread207441(tdone,ends);
          thread207442(tdone,ends);
          int biggest207443 = 0;
          if(ends[13]>=biggest207443){
            biggest207443=ends[13];
          }
          if(ends[14]>=biggest207443){
            biggest207443=ends[14];
          }
          if(ends[15]>=biggest207443){
            biggest207443=ends[15];
          }
          if(biggest207443 == 1){
            active[12]=1;
            ends[12]=1;
            tdone[12]=1;
          }
        }
        //FINXME code
        if(biggest207439 == 0){
          thread207444(tdone,ends);
          thread207445(tdone,ends);
          thread207446(tdone,ends);
          int biggest207447 = 0;
          if(ends[13]>=biggest207447){
            biggest207447=ends[13];
          }
          if(ends[14]>=biggest207447){
            biggest207447=ends[14];
          }
          if(ends[15]>=biggest207447){
            biggest207447=ends[15];
          }
          if(biggest207447 == 1){
            active[12]=1;
            ends[12]=1;
            tdone[12]=1;
          }
        }
        break;
      
    }
  }

  public void thread207433(int [] tdone, int [] ends){
        S194547=1;
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

  public void thread207432(int [] tdone, int [] ends){
        S194527=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread207431(int [] tdone, int [] ends){
        S194524=1;
    zoneOcc_thread_9 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 9, column: 17
    S194523=0;
    if(workhrs_1.getprestatus() && (zoneOcc_thread_9 == 0)){//sysj\ECS.sysj line: 11, column: 21
      zoneTwoLightingI.setPresent();//sysj\ECS.sysj line: 12, column: 18
      currsigs.addElement(zoneTwoLightingI);
      zoneTwoLightingI.setValue(0);//sysj\ECS.sysj line: 12, column: 18
      S194523=1;
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      if(workhrs_1.getprestatus() && zoneOcc_thread_9 == 1){//sysj\ECS.sysj line: 13, column: 28
        S194504=0;
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
        S194504=1;
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
          S194523=1;
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
      }
    }
  }

  public void thread207429(int [] tdone, int [] ends){
        S194547=1;
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

  public void thread207428(int [] tdone, int [] ends){
        S194527=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread207427(int [] tdone, int [] ends){
        S194524=1;
    zoneOcc_thread_9 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 9, column: 17
    S194523=0;
    if(workhrs_1.getprestatus() && (zoneOcc_thread_9 == 0)){//sysj\ECS.sysj line: 11, column: 21
      zoneTwoLightingI.setPresent();//sysj\ECS.sysj line: 12, column: 18
      currsigs.addElement(zoneTwoLightingI);
      zoneTwoLightingI.setValue(0);//sysj\ECS.sysj line: 12, column: 18
      S194523=1;
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      if(workhrs_1.getprestatus() && zoneOcc_thread_9 == 1){//sysj\ECS.sysj line: 13, column: 28
        S194504=0;
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
        S194504=1;
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
          S194523=1;
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
      }
    }
  }

  public void thread207425(int [] tdone, int [] ends){
        switch(S194547){
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

  public void thread207424(int [] tdone, int [] ends){
        switch(S194527){
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

  public void thread207423(int [] tdone, int [] ends){
        switch(S194524){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S194523){
          case 0 : 
            switch(S194504){
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
            S194523=1;
            S194524=0;
            active[9]=0;
            ends[9]=0;
            tdone[9]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread207422(int [] tdone, int [] ends){
        switch(S194730){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        test_8.setClear();//sysj\ECS.sysj line: 3, column: 5
        thread207423(tdone,ends);
        thread207424(tdone,ends);
        thread207425(tdone,ends);
        int biggest207426 = 0;
        if(ends[9]>=biggest207426){
          biggest207426=ends[9];
        }
        if(ends[10]>=biggest207426){
          biggest207426=ends[10];
        }
        if(ends[11]>=biggest207426){
          biggest207426=ends[11];
        }
        if(biggest207426 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        if(biggest207426 == 2){
          ends[8]=2;
          ;//sysj\ECS.sysj line: 7, column: 9
          thread207427(tdone,ends);
          thread207428(tdone,ends);
          thread207429(tdone,ends);
          int biggest207430 = 0;
          if(ends[9]>=biggest207430){
            biggest207430=ends[9];
          }
          if(ends[10]>=biggest207430){
            biggest207430=ends[10];
          }
          if(ends[11]>=biggest207430){
            biggest207430=ends[11];
          }
          if(biggest207430 == 1){
            active[8]=1;
            ends[8]=1;
            tdone[8]=1;
          }
        }
        //FINXME code
        if(biggest207426 == 0){
          thread207431(tdone,ends);
          thread207432(tdone,ends);
          thread207433(tdone,ends);
          int biggest207434 = 0;
          if(ends[9]>=biggest207434){
            biggest207434=ends[9];
          }
          if(ends[10]>=biggest207434){
            biggest207434=ends[10];
          }
          if(ends[11]>=biggest207434){
            biggest207434=ends[11];
          }
          if(biggest207434 == 1){
            active[8]=1;
            ends[8]=1;
            tdone[8]=1;
          }
        }
        break;
      
    }
  }

  public void thread207420(int [] tdone, int [] ends){
        S194303=1;
    prevOccupancy_thread_7 = -1;//sysj\ECS.sysj line: 30, column: 14
    currentOccupancy_thread_7 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 33, column: 21
    S194286=0;
    if(currentOccupancy_thread_7 != prevOccupancy_thread_7 || currentOccupancy_thread_7 == 0 || !workhrs_1.getprestatus()){//sysj\ECS.sysj line: 34, column: 25
      test_4.setPresent();//sysj\ECS.sysj line: 35, column: 25
      currsigs.addElement(test_4);
      prevOccupancy_thread_7 = currentOccupancy_thread_7;//sysj\ECS.sysj line: 37, column: 21
      S194286=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      prevOccupancy_thread_7 = currentOccupancy_thread_7;//sysj\ECS.sysj line: 37, column: 21
      S194286=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread207419(int [] tdone, int [] ends){
        S194283=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread207418(int [] tdone, int [] ends){
        S194280=1;
    zoneOcc_thread_5 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 9, column: 17
    S194279=0;
    if(workhrs_1.getprestatus() && (zoneOcc_thread_5 == 0)){//sysj\ECS.sysj line: 11, column: 21
      zoneOneLightingI.setPresent();//sysj\ECS.sysj line: 12, column: 18
      currsigs.addElement(zoneOneLightingI);
      zoneOneLightingI.setValue(0);//sysj\ECS.sysj line: 12, column: 18
      S194279=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      if(workhrs_1.getprestatus() && zoneOcc_thread_5 == 1){//sysj\ECS.sysj line: 13, column: 28
        S194260=0;
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
        S194260=1;
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
          S194279=1;
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
      }
    }
  }

  public void thread207416(int [] tdone, int [] ends){
        S194303=1;
    prevOccupancy_thread_7 = -1;//sysj\ECS.sysj line: 30, column: 14
    currentOccupancy_thread_7 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 33, column: 21
    S194286=0;
    if(currentOccupancy_thread_7 != prevOccupancy_thread_7 || currentOccupancy_thread_7 == 0 || !workhrs_1.getprestatus()){//sysj\ECS.sysj line: 34, column: 25
      test_4.setPresent();//sysj\ECS.sysj line: 35, column: 25
      currsigs.addElement(test_4);
      prevOccupancy_thread_7 = currentOccupancy_thread_7;//sysj\ECS.sysj line: 37, column: 21
      S194286=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      prevOccupancy_thread_7 = currentOccupancy_thread_7;//sysj\ECS.sysj line: 37, column: 21
      S194286=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread207415(int [] tdone, int [] ends){
        S194283=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread207414(int [] tdone, int [] ends){
        S194280=1;
    zoneOcc_thread_5 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 9, column: 17
    S194279=0;
    if(workhrs_1.getprestatus() && (zoneOcc_thread_5 == 0)){//sysj\ECS.sysj line: 11, column: 21
      zoneOneLightingI.setPresent();//sysj\ECS.sysj line: 12, column: 18
      currsigs.addElement(zoneOneLightingI);
      zoneOneLightingI.setValue(0);//sysj\ECS.sysj line: 12, column: 18
      S194279=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      if(workhrs_1.getprestatus() && zoneOcc_thread_5 == 1){//sysj\ECS.sysj line: 13, column: 28
        S194260=0;
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
        S194260=1;
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
          S194279=1;
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
      }
    }
  }

  public void thread207412(int [] tdone, int [] ends){
        switch(S194303){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S194286){
          case 0 : 
            currentOccupancy_thread_7 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 33, column: 21
            S194286=0;
            if(currentOccupancy_thread_7 != prevOccupancy_thread_7 || currentOccupancy_thread_7 == 0 || !workhrs_1.getprestatus()){//sysj\ECS.sysj line: 34, column: 25
              test_4.setPresent();//sysj\ECS.sysj line: 35, column: 25
              currsigs.addElement(test_4);
              prevOccupancy_thread_7 = currentOccupancy_thread_7;//sysj\ECS.sysj line: 37, column: 21
              S194286=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              prevOccupancy_thread_7 = currentOccupancy_thread_7;//sysj\ECS.sysj line: 37, column: 21
              S194286=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            S194286=1;
            currentOccupancy_thread_7 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 33, column: 21
            S194286=0;
            if(currentOccupancy_thread_7 != prevOccupancy_thread_7 || currentOccupancy_thread_7 == 0 || !workhrs_1.getprestatus()){//sysj\ECS.sysj line: 34, column: 25
              test_4.setPresent();//sysj\ECS.sysj line: 35, column: 25
              currsigs.addElement(test_4);
              prevOccupancy_thread_7 = currentOccupancy_thread_7;//sysj\ECS.sysj line: 37, column: 21
              S194286=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              prevOccupancy_thread_7 = currentOccupancy_thread_7;//sysj\ECS.sysj line: 37, column: 21
              S194286=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread207411(int [] tdone, int [] ends){
        switch(S194283){
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

  public void thread207410(int [] tdone, int [] ends){
        switch(S194280){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S194279){
          case 0 : 
            switch(S194260){
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
            S194279=1;
            S194280=0;
            active[5]=0;
            ends[5]=0;
            tdone[5]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread207409(int [] tdone, int [] ends){
        switch(S194486){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        test_4.setClear();//sysj\ECS.sysj line: 3, column: 5
        thread207410(tdone,ends);
        thread207411(tdone,ends);
        thread207412(tdone,ends);
        int biggest207413 = 0;
        if(ends[5]>=biggest207413){
          biggest207413=ends[5];
        }
        if(ends[6]>=biggest207413){
          biggest207413=ends[6];
        }
        if(ends[7]>=biggest207413){
          biggest207413=ends[7];
        }
        if(biggest207413 == 1){
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        if(biggest207413 == 2){
          ends[4]=2;
          ;//sysj\ECS.sysj line: 7, column: 9
          thread207414(tdone,ends);
          thread207415(tdone,ends);
          thread207416(tdone,ends);
          int biggest207417 = 0;
          if(ends[5]>=biggest207417){
            biggest207417=ends[5];
          }
          if(ends[6]>=biggest207417){
            biggest207417=ends[6];
          }
          if(ends[7]>=biggest207417){
            biggest207417=ends[7];
          }
          if(biggest207417 == 1){
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
          }
        }
        //FINXME code
        if(biggest207413 == 0){
          thread207418(tdone,ends);
          thread207419(tdone,ends);
          thread207420(tdone,ends);
          int biggest207421 = 0;
          if(ends[5]>=biggest207421){
            biggest207421=ends[5];
          }
          if(ends[6]>=biggest207421){
            biggest207421=ends[6];
          }
          if(ends[7]>=biggest207421){
            biggest207421=ends[7];
          }
          if(biggest207421 == 1){
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
          }
        }
        break;
      
    }
  }

  public void thread207408(int [] tdone, int [] ends){
        switch(S197660){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread207409(tdone,ends);
        thread207422(tdone,ends);
        thread207435(tdone,ends);
        thread207448(tdone,ends);
        thread207461(tdone,ends);
        thread207474(tdone,ends);
        thread207487(tdone,ends);
        thread207500(tdone,ends);
        thread207513(tdone,ends);
        thread207526(tdone,ends);
        thread207539(tdone,ends);
        thread207552(tdone,ends);
        thread207565(tdone,ends);
        thread207578(tdone,ends);
        int biggest207591 = 0;
        if(ends[4]>=biggest207591){
          biggest207591=ends[4];
        }
        if(ends[8]>=biggest207591){
          biggest207591=ends[8];
        }
        if(ends[12]>=biggest207591){
          biggest207591=ends[12];
        }
        if(ends[16]>=biggest207591){
          biggest207591=ends[16];
        }
        if(ends[20]>=biggest207591){
          biggest207591=ends[20];
        }
        if(ends[24]>=biggest207591){
          biggest207591=ends[24];
        }
        if(ends[28]>=biggest207591){
          biggest207591=ends[28];
        }
        if(ends[32]>=biggest207591){
          biggest207591=ends[32];
        }
        if(ends[36]>=biggest207591){
          biggest207591=ends[36];
        }
        if(ends[40]>=biggest207591){
          biggest207591=ends[40];
        }
        if(ends[44]>=biggest207591){
          biggest207591=ends[44];
        }
        if(ends[48]>=biggest207591){
          biggest207591=ends[48];
        }
        if(ends[52]>=biggest207591){
          biggest207591=ends[52];
        }
        if(ends[56]>=biggest207591){
          biggest207591=ends[56];
        }
        if(biggest207591 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest207591 == 0){
          S197660=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread207407(int [] tdone, int [] ends){
        switch(S194242){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S194192){
          case 0 : 
            if(currentTime_2.getprestatus()){//sysj\ECS.sysj line: 115, column: 14
              currentHour_thread_2 = (Integer)(currentTime_2.getpreval() == null ? 0 : ((Integer)currentTime_2.getpreval()).intValue());//sysj\ECS.sysj line: 116, column: 8
              S194192=1;
              if(currentHour_thread_2 >= 9 && currentHour_thread_2 <= 17){//sysj\ECS.sysj line: 118, column: 16
                S194196=0;
                workhrs_1.setPresent();//sysj\ECS.sysj line: 119, column: 16
                currsigs.addElement(workhrs_1);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S194196=1;
                if((currentHour_thread_2 >= 18 && currentHour_thread_2 <= 24) || (currentHour_thread_2 >= 0 && currentHour_thread_2 < 9)){//sysj\ECS.sysj line: 123, column: 23
                  afterhrs_1.setPresent();//sysj\ECS.sysj line: 124, column: 16
                  currsigs.addElement(afterhrs_1);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S194192=0;
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
            switch(S194196){
              case 0 : 
                S194192=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
                break;
              
              case 1 : 
                S194192=0;
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

  public void thread207403(int [] tdone, int [] ends){
        S197475=1;
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

  public void thread207402(int [] tdone, int [] ends){
        S197455=1;
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread207401(int [] tdone, int [] ends){
        S197452=1;
    zoneOcc_thread_57 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 53, column: 17
    S197451=0;
    if(afterhrs_1.getprestatus() && (zoneOcc_thread_57 == 0)){//sysj\ECS.sysj line: 55, column: 21
      zoneSevenLightingI.setPresent();//sysj\ECS.sysj line: 56, column: 18
      currsigs.addElement(zoneSevenLightingI);
      zoneSevenLightingI.setValue(0);//sysj\ECS.sysj line: 56, column: 18
      S197451=1;
      active[57]=1;
      ends[57]=1;
      tdone[57]=1;
    }
    else {
      if(afterhrs_1.getprestatus() && zoneOcc_thread_57 == 1){//sysj\ECS.sysj line: 57, column: 28
        S197432=0;
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
        S197432=1;
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
          S197451=1;
          active[57]=1;
          ends[57]=1;
          tdone[57]=1;
        }
      }
    }
  }

  public void thread207400(int [] tdone, int [] ends){
        S197658=1;
    test_56.setClear();//sysj\ECS.sysj line: 47, column: 5
    thread207401(tdone,ends);
    thread207402(tdone,ends);
    thread207403(tdone,ends);
    int biggest207404 = 0;
    if(ends[57]>=biggest207404){
      biggest207404=ends[57];
    }
    if(ends[58]>=biggest207404){
      biggest207404=ends[58];
    }
    if(ends[59]>=biggest207404){
      biggest207404=ends[59];
    }
    if(biggest207404 == 1){
      active[56]=1;
      ends[56]=1;
      tdone[56]=1;
    }
  }

  public void thread207398(int [] tdone, int [] ends){
        S197231=1;
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

  public void thread207397(int [] tdone, int [] ends){
        S197211=1;
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread207396(int [] tdone, int [] ends){
        S197208=1;
    zoneOcc_thread_53 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 53, column: 17
    S197207=0;
    if(afterhrs_1.getprestatus() && (zoneOcc_thread_53 == 0)){//sysj\ECS.sysj line: 55, column: 21
      zoneSixLightingI.setPresent();//sysj\ECS.sysj line: 56, column: 18
      currsigs.addElement(zoneSixLightingI);
      zoneSixLightingI.setValue(0);//sysj\ECS.sysj line: 56, column: 18
      S197207=1;
      active[53]=1;
      ends[53]=1;
      tdone[53]=1;
    }
    else {
      if(afterhrs_1.getprestatus() && zoneOcc_thread_53 == 1){//sysj\ECS.sysj line: 57, column: 28
        S197188=0;
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
        S197188=1;
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
          S197207=1;
          active[53]=1;
          ends[53]=1;
          tdone[53]=1;
        }
      }
    }
  }

  public void thread207395(int [] tdone, int [] ends){
        S197414=1;
    test_52.setClear();//sysj\ECS.sysj line: 47, column: 5
    thread207396(tdone,ends);
    thread207397(tdone,ends);
    thread207398(tdone,ends);
    int biggest207399 = 0;
    if(ends[53]>=biggest207399){
      biggest207399=ends[53];
    }
    if(ends[54]>=biggest207399){
      biggest207399=ends[54];
    }
    if(ends[55]>=biggest207399){
      biggest207399=ends[55];
    }
    if(biggest207399 == 1){
      active[52]=1;
      ends[52]=1;
      tdone[52]=1;
    }
  }

  public void thread207393(int [] tdone, int [] ends){
        S196987=1;
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

  public void thread207392(int [] tdone, int [] ends){
        S196967=1;
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread207391(int [] tdone, int [] ends){
        S196964=1;
    zoneOcc_thread_49 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 53, column: 17
    S196963=0;
    if(afterhrs_1.getprestatus() && (zoneOcc_thread_49 == 0)){//sysj\ECS.sysj line: 55, column: 21
      zoneFiveLightingI.setPresent();//sysj\ECS.sysj line: 56, column: 18
      currsigs.addElement(zoneFiveLightingI);
      zoneFiveLightingI.setValue(0);//sysj\ECS.sysj line: 56, column: 18
      S196963=1;
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
    else {
      if(afterhrs_1.getprestatus() && zoneOcc_thread_49 == 1){//sysj\ECS.sysj line: 57, column: 28
        S196944=0;
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
        S196944=1;
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
          S196963=1;
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
      }
    }
  }

  public void thread207390(int [] tdone, int [] ends){
        S197170=1;
    test_48.setClear();//sysj\ECS.sysj line: 47, column: 5
    thread207391(tdone,ends);
    thread207392(tdone,ends);
    thread207393(tdone,ends);
    int biggest207394 = 0;
    if(ends[49]>=biggest207394){
      biggest207394=ends[49];
    }
    if(ends[50]>=biggest207394){
      biggest207394=ends[50];
    }
    if(ends[51]>=biggest207394){
      biggest207394=ends[51];
    }
    if(biggest207394 == 1){
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
  }

  public void thread207388(int [] tdone, int [] ends){
        S196743=1;
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

  public void thread207387(int [] tdone, int [] ends){
        S196723=1;
    active[46]=1;
    ends[46]=1;
    tdone[46]=1;
  }

  public void thread207386(int [] tdone, int [] ends){
        S196720=1;
    zoneOcc_thread_45 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 53, column: 17
    S196719=0;
    if(afterhrs_1.getprestatus() && (zoneOcc_thread_45 == 0)){//sysj\ECS.sysj line: 55, column: 21
      zoneFourLightingI.setPresent();//sysj\ECS.sysj line: 56, column: 18
      currsigs.addElement(zoneFourLightingI);
      zoneFourLightingI.setValue(0);//sysj\ECS.sysj line: 56, column: 18
      S196719=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      if(afterhrs_1.getprestatus() && zoneOcc_thread_45 == 1){//sysj\ECS.sysj line: 57, column: 28
        S196700=0;
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
        S196700=1;
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
          S196719=1;
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
      }
    }
  }

  public void thread207385(int [] tdone, int [] ends){
        S196926=1;
    test_44.setClear();//sysj\ECS.sysj line: 47, column: 5
    thread207386(tdone,ends);
    thread207387(tdone,ends);
    thread207388(tdone,ends);
    int biggest207389 = 0;
    if(ends[45]>=biggest207389){
      biggest207389=ends[45];
    }
    if(ends[46]>=biggest207389){
      biggest207389=ends[46];
    }
    if(ends[47]>=biggest207389){
      biggest207389=ends[47];
    }
    if(biggest207389 == 1){
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread207383(int [] tdone, int [] ends){
        S196499=1;
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

  public void thread207382(int [] tdone, int [] ends){
        S196479=1;
    active[42]=1;
    ends[42]=1;
    tdone[42]=1;
  }

  public void thread207381(int [] tdone, int [] ends){
        S196476=1;
    zoneOcc_thread_41 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 53, column: 17
    S196475=0;
    if(afterhrs_1.getprestatus() && (zoneOcc_thread_41 == 0)){//sysj\ECS.sysj line: 55, column: 21
      zoneThreeLightingI.setPresent();//sysj\ECS.sysj line: 56, column: 18
      currsigs.addElement(zoneThreeLightingI);
      zoneThreeLightingI.setValue(0);//sysj\ECS.sysj line: 56, column: 18
      S196475=1;
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
    else {
      if(afterhrs_1.getprestatus() && zoneOcc_thread_41 == 1){//sysj\ECS.sysj line: 57, column: 28
        S196456=0;
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
        S196456=1;
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
          S196475=1;
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
      }
    }
  }

  public void thread207380(int [] tdone, int [] ends){
        S196682=1;
    test_40.setClear();//sysj\ECS.sysj line: 47, column: 5
    thread207381(tdone,ends);
    thread207382(tdone,ends);
    thread207383(tdone,ends);
    int biggest207384 = 0;
    if(ends[41]>=biggest207384){
      biggest207384=ends[41];
    }
    if(ends[42]>=biggest207384){
      biggest207384=ends[42];
    }
    if(ends[43]>=biggest207384){
      biggest207384=ends[43];
    }
    if(biggest207384 == 1){
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
  }

  public void thread207378(int [] tdone, int [] ends){
        S196255=1;
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

  public void thread207377(int [] tdone, int [] ends){
        S196235=1;
    active[38]=1;
    ends[38]=1;
    tdone[38]=1;
  }

  public void thread207376(int [] tdone, int [] ends){
        S196232=1;
    zoneOcc_thread_37 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 53, column: 17
    S196231=0;
    if(afterhrs_1.getprestatus() && (zoneOcc_thread_37 == 0)){//sysj\ECS.sysj line: 55, column: 21
      zoneTwoLightingI.setPresent();//sysj\ECS.sysj line: 56, column: 18
      currsigs.addElement(zoneTwoLightingI);
      zoneTwoLightingI.setValue(0);//sysj\ECS.sysj line: 56, column: 18
      S196231=1;
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      if(afterhrs_1.getprestatus() && zoneOcc_thread_37 == 1){//sysj\ECS.sysj line: 57, column: 28
        S196212=0;
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
        S196212=1;
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
          S196231=1;
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
      }
    }
  }

  public void thread207375(int [] tdone, int [] ends){
        S196438=1;
    test_36.setClear();//sysj\ECS.sysj line: 47, column: 5
    thread207376(tdone,ends);
    thread207377(tdone,ends);
    thread207378(tdone,ends);
    int biggest207379 = 0;
    if(ends[37]>=biggest207379){
      biggest207379=ends[37];
    }
    if(ends[38]>=biggest207379){
      biggest207379=ends[38];
    }
    if(ends[39]>=biggest207379){
      biggest207379=ends[39];
    }
    if(biggest207379 == 1){
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
  }

  public void thread207373(int [] tdone, int [] ends){
        S196011=1;
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

  public void thread207372(int [] tdone, int [] ends){
        S195991=1;
    active[34]=1;
    ends[34]=1;
    tdone[34]=1;
  }

  public void thread207371(int [] tdone, int [] ends){
        S195988=1;
    zoneOcc_thread_33 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 53, column: 17
    S195987=0;
    if(afterhrs_1.getprestatus() && (zoneOcc_thread_33 == 0)){//sysj\ECS.sysj line: 55, column: 21
      zoneOneLightingI.setPresent();//sysj\ECS.sysj line: 56, column: 18
      currsigs.addElement(zoneOneLightingI);
      zoneOneLightingI.setValue(0);//sysj\ECS.sysj line: 56, column: 18
      S195987=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      if(afterhrs_1.getprestatus() && zoneOcc_thread_33 == 1){//sysj\ECS.sysj line: 57, column: 28
        S195968=0;
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
        S195968=1;
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
          S195987=1;
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
      }
    }
  }

  public void thread207370(int [] tdone, int [] ends){
        S196194=1;
    test_32.setClear();//sysj\ECS.sysj line: 47, column: 5
    thread207371(tdone,ends);
    thread207372(tdone,ends);
    thread207373(tdone,ends);
    int biggest207374 = 0;
    if(ends[33]>=biggest207374){
      biggest207374=ends[33];
    }
    if(ends[34]>=biggest207374){
      biggest207374=ends[34];
    }
    if(ends[35]>=biggest207374){
      biggest207374=ends[35];
    }
    if(biggest207374 == 1){
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread207368(int [] tdone, int [] ends){
        S195767=1;
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

  public void thread207367(int [] tdone, int [] ends){
        S195747=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread207366(int [] tdone, int [] ends){
        S195744=1;
    zoneOcc_thread_29 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 9, column: 17
    S195743=0;
    if(workhrs_1.getprestatus() && (zoneOcc_thread_29 == 0)){//sysj\ECS.sysj line: 11, column: 21
      zoneSevenLightingI.setPresent();//sysj\ECS.sysj line: 12, column: 18
      currsigs.addElement(zoneSevenLightingI);
      zoneSevenLightingI.setValue(0);//sysj\ECS.sysj line: 12, column: 18
      S195743=1;
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
    else {
      if(workhrs_1.getprestatus() && zoneOcc_thread_29 == 1){//sysj\ECS.sysj line: 13, column: 28
        S195724=0;
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
        S195724=1;
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
          S195743=1;
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
      }
    }
  }

  public void thread207365(int [] tdone, int [] ends){
        S195950=1;
    test_28.setClear();//sysj\ECS.sysj line: 3, column: 5
    thread207366(tdone,ends);
    thread207367(tdone,ends);
    thread207368(tdone,ends);
    int biggest207369 = 0;
    if(ends[29]>=biggest207369){
      biggest207369=ends[29];
    }
    if(ends[30]>=biggest207369){
      biggest207369=ends[30];
    }
    if(ends[31]>=biggest207369){
      biggest207369=ends[31];
    }
    if(biggest207369 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread207363(int [] tdone, int [] ends){
        S195523=1;
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

  public void thread207362(int [] tdone, int [] ends){
        S195503=1;
    active[26]=1;
    ends[26]=1;
    tdone[26]=1;
  }

  public void thread207361(int [] tdone, int [] ends){
        S195500=1;
    zoneOcc_thread_25 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 9, column: 17
    S195499=0;
    if(workhrs_1.getprestatus() && (zoneOcc_thread_25 == 0)){//sysj\ECS.sysj line: 11, column: 21
      zoneSixLightingI.setPresent();//sysj\ECS.sysj line: 12, column: 18
      currsigs.addElement(zoneSixLightingI);
      zoneSixLightingI.setValue(0);//sysj\ECS.sysj line: 12, column: 18
      S195499=1;
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    else {
      if(workhrs_1.getprestatus() && zoneOcc_thread_25 == 1){//sysj\ECS.sysj line: 13, column: 28
        S195480=0;
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
        S195480=1;
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
          S195499=1;
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
      }
    }
  }

  public void thread207360(int [] tdone, int [] ends){
        S195706=1;
    test_24.setClear();//sysj\ECS.sysj line: 3, column: 5
    thread207361(tdone,ends);
    thread207362(tdone,ends);
    thread207363(tdone,ends);
    int biggest207364 = 0;
    if(ends[25]>=biggest207364){
      biggest207364=ends[25];
    }
    if(ends[26]>=biggest207364){
      biggest207364=ends[26];
    }
    if(ends[27]>=biggest207364){
      biggest207364=ends[27];
    }
    if(biggest207364 == 1){
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread207358(int [] tdone, int [] ends){
        S195279=1;
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

  public void thread207357(int [] tdone, int [] ends){
        S195259=1;
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread207356(int [] tdone, int [] ends){
        S195256=1;
    zoneOcc_thread_21 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 9, column: 17
    S195255=0;
    if(workhrs_1.getprestatus() && (zoneOcc_thread_21 == 0)){//sysj\ECS.sysj line: 11, column: 21
      zoneFiveLightingI.setPresent();//sysj\ECS.sysj line: 12, column: 18
      currsigs.addElement(zoneFiveLightingI);
      zoneFiveLightingI.setValue(0);//sysj\ECS.sysj line: 12, column: 18
      S195255=1;
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    else {
      if(workhrs_1.getprestatus() && zoneOcc_thread_21 == 1){//sysj\ECS.sysj line: 13, column: 28
        S195236=0;
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
        S195236=1;
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
          S195255=1;
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
      }
    }
  }

  public void thread207355(int [] tdone, int [] ends){
        S195462=1;
    test_20.setClear();//sysj\ECS.sysj line: 3, column: 5
    thread207356(tdone,ends);
    thread207357(tdone,ends);
    thread207358(tdone,ends);
    int biggest207359 = 0;
    if(ends[21]>=biggest207359){
      biggest207359=ends[21];
    }
    if(ends[22]>=biggest207359){
      biggest207359=ends[22];
    }
    if(ends[23]>=biggest207359){
      biggest207359=ends[23];
    }
    if(biggest207359 == 1){
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread207353(int [] tdone, int [] ends){
        S195035=1;
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

  public void thread207352(int [] tdone, int [] ends){
        S195015=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread207351(int [] tdone, int [] ends){
        S195012=1;
    zoneOcc_thread_17 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 9, column: 17
    S195011=0;
    if(workhrs_1.getprestatus() && (zoneOcc_thread_17 == 0)){//sysj\ECS.sysj line: 11, column: 21
      zoneFourLightingI.setPresent();//sysj\ECS.sysj line: 12, column: 18
      currsigs.addElement(zoneFourLightingI);
      zoneFourLightingI.setValue(0);//sysj\ECS.sysj line: 12, column: 18
      S195011=1;
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
    else {
      if(workhrs_1.getprestatus() && zoneOcc_thread_17 == 1){//sysj\ECS.sysj line: 13, column: 28
        S194992=0;
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
        S194992=1;
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
          S195011=1;
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
      }
    }
  }

  public void thread207350(int [] tdone, int [] ends){
        S195218=1;
    test_16.setClear();//sysj\ECS.sysj line: 3, column: 5
    thread207351(tdone,ends);
    thread207352(tdone,ends);
    thread207353(tdone,ends);
    int biggest207354 = 0;
    if(ends[17]>=biggest207354){
      biggest207354=ends[17];
    }
    if(ends[18]>=biggest207354){
      biggest207354=ends[18];
    }
    if(ends[19]>=biggest207354){
      biggest207354=ends[19];
    }
    if(biggest207354 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread207348(int [] tdone, int [] ends){
        S194791=1;
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

  public void thread207347(int [] tdone, int [] ends){
        S194771=1;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread207346(int [] tdone, int [] ends){
        S194768=1;
    zoneOcc_thread_13 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 9, column: 17
    S194767=0;
    if(workhrs_1.getprestatus() && (zoneOcc_thread_13 == 0)){//sysj\ECS.sysj line: 11, column: 21
      zoneThreeLightingI.setPresent();//sysj\ECS.sysj line: 12, column: 18
      currsigs.addElement(zoneThreeLightingI);
      zoneThreeLightingI.setValue(0);//sysj\ECS.sysj line: 12, column: 18
      S194767=1;
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
    else {
      if(workhrs_1.getprestatus() && zoneOcc_thread_13 == 1){//sysj\ECS.sysj line: 13, column: 28
        S194748=0;
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
        S194748=1;
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
          S194767=1;
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
      }
    }
  }

  public void thread207345(int [] tdone, int [] ends){
        S194974=1;
    test_12.setClear();//sysj\ECS.sysj line: 3, column: 5
    thread207346(tdone,ends);
    thread207347(tdone,ends);
    thread207348(tdone,ends);
    int biggest207349 = 0;
    if(ends[13]>=biggest207349){
      biggest207349=ends[13];
    }
    if(ends[14]>=biggest207349){
      biggest207349=ends[14];
    }
    if(ends[15]>=biggest207349){
      biggest207349=ends[15];
    }
    if(biggest207349 == 1){
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread207343(int [] tdone, int [] ends){
        S194547=1;
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

  public void thread207342(int [] tdone, int [] ends){
        S194527=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread207341(int [] tdone, int [] ends){
        S194524=1;
    zoneOcc_thread_9 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 9, column: 17
    S194523=0;
    if(workhrs_1.getprestatus() && (zoneOcc_thread_9 == 0)){//sysj\ECS.sysj line: 11, column: 21
      zoneTwoLightingI.setPresent();//sysj\ECS.sysj line: 12, column: 18
      currsigs.addElement(zoneTwoLightingI);
      zoneTwoLightingI.setValue(0);//sysj\ECS.sysj line: 12, column: 18
      S194523=1;
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      if(workhrs_1.getprestatus() && zoneOcc_thread_9 == 1){//sysj\ECS.sysj line: 13, column: 28
        S194504=0;
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
        S194504=1;
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
          S194523=1;
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
      }
    }
  }

  public void thread207340(int [] tdone, int [] ends){
        S194730=1;
    test_8.setClear();//sysj\ECS.sysj line: 3, column: 5
    thread207341(tdone,ends);
    thread207342(tdone,ends);
    thread207343(tdone,ends);
    int biggest207344 = 0;
    if(ends[9]>=biggest207344){
      biggest207344=ends[9];
    }
    if(ends[10]>=biggest207344){
      biggest207344=ends[10];
    }
    if(ends[11]>=biggest207344){
      biggest207344=ends[11];
    }
    if(biggest207344 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread207338(int [] tdone, int [] ends){
        S194303=1;
    prevOccupancy_thread_7 = -1;//sysj\ECS.sysj line: 30, column: 14
    currentOccupancy_thread_7 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 33, column: 21
    S194286=0;
    if(currentOccupancy_thread_7 != prevOccupancy_thread_7 || currentOccupancy_thread_7 == 0 || !workhrs_1.getprestatus()){//sysj\ECS.sysj line: 34, column: 25
      test_4.setPresent();//sysj\ECS.sysj line: 35, column: 25
      currsigs.addElement(test_4);
      prevOccupancy_thread_7 = currentOccupancy_thread_7;//sysj\ECS.sysj line: 37, column: 21
      S194286=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      prevOccupancy_thread_7 = currentOccupancy_thread_7;//sysj\ECS.sysj line: 37, column: 21
      S194286=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread207337(int [] tdone, int [] ends){
        S194283=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread207336(int [] tdone, int [] ends){
        S194280=1;
    zoneOcc_thread_5 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 9, column: 17
    S194279=0;
    if(workhrs_1.getprestatus() && (zoneOcc_thread_5 == 0)){//sysj\ECS.sysj line: 11, column: 21
      zoneOneLightingI.setPresent();//sysj\ECS.sysj line: 12, column: 18
      currsigs.addElement(zoneOneLightingI);
      zoneOneLightingI.setValue(0);//sysj\ECS.sysj line: 12, column: 18
      S194279=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      if(workhrs_1.getprestatus() && zoneOcc_thread_5 == 1){//sysj\ECS.sysj line: 13, column: 28
        S194260=0;
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
        S194260=1;
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
          S194279=1;
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
      }
    }
  }

  public void thread207335(int [] tdone, int [] ends){
        S194486=1;
    test_4.setClear();//sysj\ECS.sysj line: 3, column: 5
    thread207336(tdone,ends);
    thread207337(tdone,ends);
    thread207338(tdone,ends);
    int biggest207339 = 0;
    if(ends[5]>=biggest207339){
      biggest207339=ends[5];
    }
    if(ends[6]>=biggest207339){
      biggest207339=ends[6];
    }
    if(ends[7]>=biggest207339){
      biggest207339=ends[7];
    }
    if(biggest207339 == 1){
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread207334(int [] tdone, int [] ends){
        S197660=1;
    thread207335(tdone,ends);
    thread207340(tdone,ends);
    thread207345(tdone,ends);
    thread207350(tdone,ends);
    thread207355(tdone,ends);
    thread207360(tdone,ends);
    thread207365(tdone,ends);
    thread207370(tdone,ends);
    thread207375(tdone,ends);
    thread207380(tdone,ends);
    thread207385(tdone,ends);
    thread207390(tdone,ends);
    thread207395(tdone,ends);
    thread207400(tdone,ends);
    int biggest207405 = 0;
    if(ends[4]>=biggest207405){
      biggest207405=ends[4];
    }
    if(ends[8]>=biggest207405){
      biggest207405=ends[8];
    }
    if(ends[12]>=biggest207405){
      biggest207405=ends[12];
    }
    if(ends[16]>=biggest207405){
      biggest207405=ends[16];
    }
    if(ends[20]>=biggest207405){
      biggest207405=ends[20];
    }
    if(ends[24]>=biggest207405){
      biggest207405=ends[24];
    }
    if(ends[28]>=biggest207405){
      biggest207405=ends[28];
    }
    if(ends[32]>=biggest207405){
      biggest207405=ends[32];
    }
    if(ends[36]>=biggest207405){
      biggest207405=ends[36];
    }
    if(ends[40]>=biggest207405){
      biggest207405=ends[40];
    }
    if(ends[44]>=biggest207405){
      biggest207405=ends[44];
    }
    if(ends[48]>=biggest207405){
      biggest207405=ends[48];
    }
    if(ends[52]>=biggest207405){
      biggest207405=ends[52];
    }
    if(ends[56]>=biggest207405){
      biggest207405=ends[56];
    }
    if(biggest207405 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    if(biggest207405 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    if(biggest207405 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    if(biggest207405 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    if(biggest207405 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    if(biggest207405 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    if(biggest207405 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    if(biggest207405 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    if(biggest207405 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    if(biggest207405 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    if(biggest207405 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    if(biggest207405 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    if(biggest207405 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    if(biggest207405 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread207333(int [] tdone, int [] ends){
        S194242=1;
    S194192=0;
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
      switch(S197662){
        case 0 : 
          S197662=0;
          break RUN;
        
        case 1 : 
          S197662=2;
          S197662=2;
          workhrs_1.setClear();//sysj\ECS.sysj line: 111, column: 4
          afterhrs_1.setClear();//sysj\ECS.sysj line: 111, column: 4
          thread207333(tdone,ends);
          thread207334(tdone,ends);
          int biggest207406 = 0;
          if(ends[2]>=biggest207406){
            biggest207406=ends[2];
          }
          if(ends[3]>=biggest207406){
            biggest207406=ends[3];
          }
          if(biggest207406 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          workhrs_1.setClear();//sysj\ECS.sysj line: 111, column: 4
          afterhrs_1.setClear();//sysj\ECS.sysj line: 111, column: 4
          thread207407(tdone,ends);
          thread207408(tdone,ends);
          int biggest207592 = 0;
          if(ends[2]>=biggest207592){
            biggest207592=ends[2];
          }
          if(ends[3]>=biggest207592){
            biggest207592=ends[3];
          }
          if(biggest207592 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest207592 == 0){
            S197662=0;
            active[1]=0;
            ends[1]=0;
            S197662=0;
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
