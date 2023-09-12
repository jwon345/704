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
  private int currentHour_thread_7;//sysj\ECS.sysj line: 316, column: 8
  private int zoneOcc_thread_9;//sysj\ECS.sysj line: 21, column: 4
  private int zoneLightInt_thread_9;//sysj\ECS.sysj line: 22, column: 7
  private int zoneOcc_thread_10;//sysj\ECS.sysj line: 21, column: 4
  private int zoneLightInt_thread_10;//sysj\ECS.sysj line: 22, column: 7
  private int zoneOcc_thread_11;//sysj\ECS.sysj line: 21, column: 4
  private int zoneLightInt_thread_11;//sysj\ECS.sysj line: 22, column: 7
  private int zoneOcc_thread_12;//sysj\ECS.sysj line: 21, column: 4
  private int zoneLightInt_thread_12;//sysj\ECS.sysj line: 22, column: 7
  private int zoneOcc_thread_13;//sysj\ECS.sysj line: 21, column: 4
  private int zoneLightInt_thread_13;//sysj\ECS.sysj line: 22, column: 7
  private int zoneOcc_thread_14;//sysj\ECS.sysj line: 21, column: 4
  private int zoneLightInt_thread_14;//sysj\ECS.sysj line: 22, column: 7
  private int zoneOcc_thread_15;//sysj\ECS.sysj line: 21, column: 4
  private int zoneLightInt_thread_15;//sysj\ECS.sysj line: 22, column: 7
  private int zoneOcc_thread_16;//sysj\ECS.sysj line: 7, column: 4
  private int zoneLightInt_thread_16;//sysj\ECS.sysj line: 8, column: 7
  private int zoneOcc_thread_17;//sysj\ECS.sysj line: 7, column: 4
  private int zoneLightInt_thread_17;//sysj\ECS.sysj line: 8, column: 7
  private int zoneOcc_thread_18;//sysj\ECS.sysj line: 7, column: 4
  private int zoneLightInt_thread_18;//sysj\ECS.sysj line: 8, column: 7
  private int zoneOcc_thread_19;//sysj\ECS.sysj line: 7, column: 4
  private int zoneLightInt_thread_19;//sysj\ECS.sysj line: 8, column: 7
  private int zoneOcc_thread_20;//sysj\ECS.sysj line: 7, column: 4
  private int zoneLightInt_thread_20;//sysj\ECS.sysj line: 8, column: 7
  private int zoneOcc_thread_21;//sysj\ECS.sysj line: 7, column: 4
  private int zoneLightInt_thread_21;//sysj\ECS.sysj line: 8, column: 7
  private int zoneOcc_thread_22;//sysj\ECS.sysj line: 7, column: 4
  private int zoneLightInt_thread_22;//sysj\ECS.sysj line: 8, column: 7
  private int S109490 = 1;
  private int S108463 = 1;
  private int S109488 = 1;
  private int S108804 = 1;
  private int S108475 = 1;
  private int S108487 = 1;
  private int S108499 = 1;
  private int S108511 = 1;
  private int S108523 = 1;
  private int S108535 = 1;
  private int S108547 = 1;
  private int S108560 = 1;
  private int S108572 = 1;
  private int S108584 = 1;
  private int S108596 = 1;
  private int S108608 = 1;
  private int S108620 = 1;
  private int S108632 = 1;
  
  private int[] ends = new int[24];
  private int[] tdone = new int[24];
  
  public void thread109572(int [] tdone, int [] ends){
        S108632=1;
    zoneOcc_thread_22 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 4
    zoneLightInt_thread_22 = (Integer)(zoneSevenLightingI.getpreval() == null ? 0 : ((Integer)zoneSevenLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 7
    if(zoneOcc_thread_22 > 0 && zoneLightInt_thread_22 < 50){//sysj\ECS.sysj line: 9, column: 11
      zoneSevenWindowONOFF.setPresent();//sysj\ECS.sysj line: 10, column: 14
      currsigs.addElement(zoneSevenWindowONOFF);
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

  public void thread109571(int [] tdone, int [] ends){
        S108620=1;
    zoneOcc_thread_21 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 4
    zoneLightInt_thread_21 = (Integer)(zoneSixLightingI.getpreval() == null ? 0 : ((Integer)zoneSixLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 7
    if(zoneOcc_thread_21 > 0 && zoneLightInt_thread_21 < 50){//sysj\ECS.sysj line: 9, column: 11
      zoneSixWindowONOFF.setPresent();//sysj\ECS.sysj line: 10, column: 14
      currsigs.addElement(zoneSixWindowONOFF);
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

  public void thread109570(int [] tdone, int [] ends){
        S108608=1;
    zoneOcc_thread_20 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 4
    zoneLightInt_thread_20 = (Integer)(zoneFiveLightingI.getpreval() == null ? 0 : ((Integer)zoneFiveLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 7
    if(zoneOcc_thread_20 > 0 && zoneLightInt_thread_20 < 50){//sysj\ECS.sysj line: 9, column: 11
      zoneFiveWindowONOFF.setPresent();//sysj\ECS.sysj line: 10, column: 14
      currsigs.addElement(zoneFiveWindowONOFF);
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

  public void thread109569(int [] tdone, int [] ends){
        S108596=1;
    zoneOcc_thread_19 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 4
    zoneLightInt_thread_19 = (Integer)(zoneFourLightingI.getpreval() == null ? 0 : ((Integer)zoneFourLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 7
    if(zoneOcc_thread_19 > 0 && zoneLightInt_thread_19 < 50){//sysj\ECS.sysj line: 9, column: 11
      zoneFourWindowONOFF.setPresent();//sysj\ECS.sysj line: 10, column: 14
      currsigs.addElement(zoneFourWindowONOFF);
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

  public void thread109568(int [] tdone, int [] ends){
        S108584=1;
    zoneOcc_thread_18 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 4
    zoneLightInt_thread_18 = (Integer)(zoneThreeLightingI.getpreval() == null ? 0 : ((Integer)zoneThreeLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 7
    if(zoneOcc_thread_18 > 0 && zoneLightInt_thread_18 < 50){//sysj\ECS.sysj line: 9, column: 11
      zoneThreeWindowONOFF.setPresent();//sysj\ECS.sysj line: 10, column: 14
      currsigs.addElement(zoneThreeWindowONOFF);
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
    else {
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread109567(int [] tdone, int [] ends){
        S108572=1;
    zoneOcc_thread_17 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 4
    zoneLightInt_thread_17 = (Integer)(zoneTwoLightingI.getpreval() == null ? 0 : ((Integer)zoneTwoLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 7
    if(zoneOcc_thread_17 > 0 && zoneLightInt_thread_17 < 50){//sysj\ECS.sysj line: 9, column: 11
      zoneTwoWindowONOFF.setPresent();//sysj\ECS.sysj line: 10, column: 14
      currsigs.addElement(zoneTwoWindowONOFF);
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

  public void thread109566(int [] tdone, int [] ends){
        S108560=1;
    zoneOcc_thread_16 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 4
    zoneLightInt_thread_16 = (Integer)(zoneOneLightingI.getpreval() == null ? 0 : ((Integer)zoneOneLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 7
    if(zoneOcc_thread_16 > 0 && zoneLightInt_thread_16 < 50){//sysj\ECS.sysj line: 9, column: 11
      zoneOneWindowONOFF.setPresent();//sysj\ECS.sysj line: 10, column: 14
      currsigs.addElement(zoneOneWindowONOFF);
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

  public void thread109564(int [] tdone, int [] ends){
        S108547=1;
    zoneOcc_thread_15 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 21, column: 4
    zoneLightInt_thread_15 = (Integer)(zoneSevenLightingI.getpreval() == null ? 0 : ((Integer)zoneSevenLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 22, column: 7
    if(zoneOcc_thread_15 > 0 && zoneLightInt_thread_15 < 50){//sysj\ECS.sysj line: 23, column: 11
      zoneSevenLightONOFF.setPresent();//sysj\ECS.sysj line: 24, column: 14
      currsigs.addElement(zoneSevenLightONOFF);
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    else {
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread109563(int [] tdone, int [] ends){
        S108535=1;
    zoneOcc_thread_14 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 21, column: 4
    zoneLightInt_thread_14 = (Integer)(zoneSixLightingI.getpreval() == null ? 0 : ((Integer)zoneSixLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 22, column: 7
    if(zoneOcc_thread_14 > 0 && zoneLightInt_thread_14 < 50){//sysj\ECS.sysj line: 23, column: 11
      zoneSixLightONOFF.setPresent();//sysj\ECS.sysj line: 24, column: 14
      currsigs.addElement(zoneSixLightONOFF);
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread109562(int [] tdone, int [] ends){
        S108523=1;
    zoneOcc_thread_13 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 21, column: 4
    zoneLightInt_thread_13 = (Integer)(zoneFiveLightingI.getpreval() == null ? 0 : ((Integer)zoneFiveLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 22, column: 7
    if(zoneOcc_thread_13 > 0 && zoneLightInt_thread_13 < 50){//sysj\ECS.sysj line: 23, column: 11
      zoneFiveLightONOFF.setPresent();//sysj\ECS.sysj line: 24, column: 14
      currsigs.addElement(zoneFiveLightONOFF);
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
    else {
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread109561(int [] tdone, int [] ends){
        S108511=1;
    zoneOcc_thread_12 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 21, column: 4
    zoneLightInt_thread_12 = (Integer)(zoneFourLightingI.getpreval() == null ? 0 : ((Integer)zoneFourLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 22, column: 7
    if(zoneOcc_thread_12 > 0 && zoneLightInt_thread_12 < 50){//sysj\ECS.sysj line: 23, column: 11
      zoneFourLightONOFF.setPresent();//sysj\ECS.sysj line: 24, column: 14
      currsigs.addElement(zoneFourLightONOFF);
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

  public void thread109560(int [] tdone, int [] ends){
        S108499=1;
    zoneOcc_thread_11 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 21, column: 4
    zoneLightInt_thread_11 = (Integer)(zoneThreeLightingI.getpreval() == null ? 0 : ((Integer)zoneThreeLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 22, column: 7
    if(zoneOcc_thread_11 > 0 && zoneLightInt_thread_11 < 50){//sysj\ECS.sysj line: 23, column: 11
      zoneThreeLightONOFF.setPresent();//sysj\ECS.sysj line: 24, column: 14
      currsigs.addElement(zoneThreeLightONOFF);
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
    else {
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread109559(int [] tdone, int [] ends){
        S108487=1;
    zoneOcc_thread_10 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 21, column: 4
    zoneLightInt_thread_10 = (Integer)(zoneTwoLightingI.getpreval() == null ? 0 : ((Integer)zoneTwoLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 22, column: 7
    if(zoneOcc_thread_10 > 0 && zoneLightInt_thread_10 < 50){//sysj\ECS.sysj line: 23, column: 11
      zoneTwoLightONOFF.setPresent();//sysj\ECS.sysj line: 24, column: 14
      currsigs.addElement(zoneTwoLightONOFF);
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

  public void thread109558(int [] tdone, int [] ends){
        S108475=1;
    zoneOcc_thread_9 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 21, column: 4
    zoneLightInt_thread_9 = (Integer)(zoneOneLightingI.getpreval() == null ? 0 : ((Integer)zoneOneLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 22, column: 7
    if(zoneOcc_thread_9 > 0 && zoneLightInt_thread_9 < 50){//sysj\ECS.sysj line: 23, column: 11
      zoneOneLightONOFF.setPresent();//sysj\ECS.sysj line: 24, column: 14
      currsigs.addElement(zoneOneLightONOFF);
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

  public void thread109556(int [] tdone, int [] ends){
        switch(S108632){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        zoneOcc_thread_22 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 4
        zoneLightInt_thread_22 = (Integer)(zoneSevenLightingI.getpreval() == null ? 0 : ((Integer)zoneSevenLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 7
        if(zoneOcc_thread_22 > 0 && zoneLightInt_thread_22 < 50){//sysj\ECS.sysj line: 9, column: 11
          zoneSevenWindowONOFF.setPresent();//sysj\ECS.sysj line: 10, column: 14
          currsigs.addElement(zoneSevenWindowONOFF);
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

  public void thread109555(int [] tdone, int [] ends){
        switch(S108620){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        zoneOcc_thread_21 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 4
        zoneLightInt_thread_21 = (Integer)(zoneSixLightingI.getpreval() == null ? 0 : ((Integer)zoneSixLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 7
        if(zoneOcc_thread_21 > 0 && zoneLightInt_thread_21 < 50){//sysj\ECS.sysj line: 9, column: 11
          zoneSixWindowONOFF.setPresent();//sysj\ECS.sysj line: 10, column: 14
          currsigs.addElement(zoneSixWindowONOFF);
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

  public void thread109554(int [] tdone, int [] ends){
        switch(S108608){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        zoneOcc_thread_20 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 4
        zoneLightInt_thread_20 = (Integer)(zoneFiveLightingI.getpreval() == null ? 0 : ((Integer)zoneFiveLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 7
        if(zoneOcc_thread_20 > 0 && zoneLightInt_thread_20 < 50){//sysj\ECS.sysj line: 9, column: 11
          zoneFiveWindowONOFF.setPresent();//sysj\ECS.sysj line: 10, column: 14
          currsigs.addElement(zoneFiveWindowONOFF);
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

  public void thread109553(int [] tdone, int [] ends){
        switch(S108596){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        zoneOcc_thread_19 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 4
        zoneLightInt_thread_19 = (Integer)(zoneFourLightingI.getpreval() == null ? 0 : ((Integer)zoneFourLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 7
        if(zoneOcc_thread_19 > 0 && zoneLightInt_thread_19 < 50){//sysj\ECS.sysj line: 9, column: 11
          zoneFourWindowONOFF.setPresent();//sysj\ECS.sysj line: 10, column: 14
          currsigs.addElement(zoneFourWindowONOFF);
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

  public void thread109552(int [] tdone, int [] ends){
        switch(S108584){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        zoneOcc_thread_18 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 4
        zoneLightInt_thread_18 = (Integer)(zoneThreeLightingI.getpreval() == null ? 0 : ((Integer)zoneThreeLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 7
        if(zoneOcc_thread_18 > 0 && zoneLightInt_thread_18 < 50){//sysj\ECS.sysj line: 9, column: 11
          zoneThreeWindowONOFF.setPresent();//sysj\ECS.sysj line: 10, column: 14
          currsigs.addElement(zoneThreeWindowONOFF);
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

  public void thread109551(int [] tdone, int [] ends){
        switch(S108572){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        zoneOcc_thread_17 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 4
        zoneLightInt_thread_17 = (Integer)(zoneTwoLightingI.getpreval() == null ? 0 : ((Integer)zoneTwoLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 7
        if(zoneOcc_thread_17 > 0 && zoneLightInt_thread_17 < 50){//sysj\ECS.sysj line: 9, column: 11
          zoneTwoWindowONOFF.setPresent();//sysj\ECS.sysj line: 10, column: 14
          currsigs.addElement(zoneTwoWindowONOFF);
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

  public void thread109550(int [] tdone, int [] ends){
        switch(S108560){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        zoneOcc_thread_16 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 4
        zoneLightInt_thread_16 = (Integer)(zoneOneLightingI.getpreval() == null ? 0 : ((Integer)zoneOneLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 7
        if(zoneOcc_thread_16 > 0 && zoneLightInt_thread_16 < 50){//sysj\ECS.sysj line: 9, column: 11
          zoneOneWindowONOFF.setPresent();//sysj\ECS.sysj line: 10, column: 14
          currsigs.addElement(zoneOneWindowONOFF);
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

  public void thread109548(int [] tdone, int [] ends){
        S108632=1;
    zoneOcc_thread_22 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 4
    zoneLightInt_thread_22 = (Integer)(zoneSevenLightingI.getpreval() == null ? 0 : ((Integer)zoneSevenLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 7
    if(zoneOcc_thread_22 > 0 && zoneLightInt_thread_22 < 50){//sysj\ECS.sysj line: 9, column: 11
      zoneSevenWindowONOFF.setPresent();//sysj\ECS.sysj line: 10, column: 14
      currsigs.addElement(zoneSevenWindowONOFF);
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

  public void thread109547(int [] tdone, int [] ends){
        S108620=1;
    zoneOcc_thread_21 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 4
    zoneLightInt_thread_21 = (Integer)(zoneSixLightingI.getpreval() == null ? 0 : ((Integer)zoneSixLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 7
    if(zoneOcc_thread_21 > 0 && zoneLightInt_thread_21 < 50){//sysj\ECS.sysj line: 9, column: 11
      zoneSixWindowONOFF.setPresent();//sysj\ECS.sysj line: 10, column: 14
      currsigs.addElement(zoneSixWindowONOFF);
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

  public void thread109546(int [] tdone, int [] ends){
        S108608=1;
    zoneOcc_thread_20 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 4
    zoneLightInt_thread_20 = (Integer)(zoneFiveLightingI.getpreval() == null ? 0 : ((Integer)zoneFiveLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 7
    if(zoneOcc_thread_20 > 0 && zoneLightInt_thread_20 < 50){//sysj\ECS.sysj line: 9, column: 11
      zoneFiveWindowONOFF.setPresent();//sysj\ECS.sysj line: 10, column: 14
      currsigs.addElement(zoneFiveWindowONOFF);
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

  public void thread109545(int [] tdone, int [] ends){
        S108596=1;
    zoneOcc_thread_19 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 4
    zoneLightInt_thread_19 = (Integer)(zoneFourLightingI.getpreval() == null ? 0 : ((Integer)zoneFourLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 7
    if(zoneOcc_thread_19 > 0 && zoneLightInt_thread_19 < 50){//sysj\ECS.sysj line: 9, column: 11
      zoneFourWindowONOFF.setPresent();//sysj\ECS.sysj line: 10, column: 14
      currsigs.addElement(zoneFourWindowONOFF);
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

  public void thread109544(int [] tdone, int [] ends){
        S108584=1;
    zoneOcc_thread_18 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 4
    zoneLightInt_thread_18 = (Integer)(zoneThreeLightingI.getpreval() == null ? 0 : ((Integer)zoneThreeLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 7
    if(zoneOcc_thread_18 > 0 && zoneLightInt_thread_18 < 50){//sysj\ECS.sysj line: 9, column: 11
      zoneThreeWindowONOFF.setPresent();//sysj\ECS.sysj line: 10, column: 14
      currsigs.addElement(zoneThreeWindowONOFF);
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
    else {
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread109543(int [] tdone, int [] ends){
        S108572=1;
    zoneOcc_thread_17 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 4
    zoneLightInt_thread_17 = (Integer)(zoneTwoLightingI.getpreval() == null ? 0 : ((Integer)zoneTwoLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 7
    if(zoneOcc_thread_17 > 0 && zoneLightInt_thread_17 < 50){//sysj\ECS.sysj line: 9, column: 11
      zoneTwoWindowONOFF.setPresent();//sysj\ECS.sysj line: 10, column: 14
      currsigs.addElement(zoneTwoWindowONOFF);
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

  public void thread109542(int [] tdone, int [] ends){
        S108560=1;
    zoneOcc_thread_16 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 4
    zoneLightInt_thread_16 = (Integer)(zoneOneLightingI.getpreval() == null ? 0 : ((Integer)zoneOneLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 7
    if(zoneOcc_thread_16 > 0 && zoneLightInt_thread_16 < 50){//sysj\ECS.sysj line: 9, column: 11
      zoneOneWindowONOFF.setPresent();//sysj\ECS.sysj line: 10, column: 14
      currsigs.addElement(zoneOneWindowONOFF);
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

  public void thread109540(int [] tdone, int [] ends){
        switch(S108547){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        zoneOcc_thread_15 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 21, column: 4
        zoneLightInt_thread_15 = (Integer)(zoneSevenLightingI.getpreval() == null ? 0 : ((Integer)zoneSevenLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 22, column: 7
        if(zoneOcc_thread_15 > 0 && zoneLightInt_thread_15 < 50){//sysj\ECS.sysj line: 23, column: 11
          zoneSevenLightONOFF.setPresent();//sysj\ECS.sysj line: 24, column: 14
          currsigs.addElement(zoneSevenLightONOFF);
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

  public void thread109539(int [] tdone, int [] ends){
        switch(S108535){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        zoneOcc_thread_14 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 21, column: 4
        zoneLightInt_thread_14 = (Integer)(zoneSixLightingI.getpreval() == null ? 0 : ((Integer)zoneSixLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 22, column: 7
        if(zoneOcc_thread_14 > 0 && zoneLightInt_thread_14 < 50){//sysj\ECS.sysj line: 23, column: 11
          zoneSixLightONOFF.setPresent();//sysj\ECS.sysj line: 24, column: 14
          currsigs.addElement(zoneSixLightONOFF);
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

  public void thread109538(int [] tdone, int [] ends){
        switch(S108523){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        zoneOcc_thread_13 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 21, column: 4
        zoneLightInt_thread_13 = (Integer)(zoneFiveLightingI.getpreval() == null ? 0 : ((Integer)zoneFiveLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 22, column: 7
        if(zoneOcc_thread_13 > 0 && zoneLightInt_thread_13 < 50){//sysj\ECS.sysj line: 23, column: 11
          zoneFiveLightONOFF.setPresent();//sysj\ECS.sysj line: 24, column: 14
          currsigs.addElement(zoneFiveLightONOFF);
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

  public void thread109537(int [] tdone, int [] ends){
        switch(S108511){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        zoneOcc_thread_12 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 21, column: 4
        zoneLightInt_thread_12 = (Integer)(zoneFourLightingI.getpreval() == null ? 0 : ((Integer)zoneFourLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 22, column: 7
        if(zoneOcc_thread_12 > 0 && zoneLightInt_thread_12 < 50){//sysj\ECS.sysj line: 23, column: 11
          zoneFourLightONOFF.setPresent();//sysj\ECS.sysj line: 24, column: 14
          currsigs.addElement(zoneFourLightONOFF);
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

  public void thread109536(int [] tdone, int [] ends){
        switch(S108499){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        zoneOcc_thread_11 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 21, column: 4
        zoneLightInt_thread_11 = (Integer)(zoneThreeLightingI.getpreval() == null ? 0 : ((Integer)zoneThreeLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 22, column: 7
        if(zoneOcc_thread_11 > 0 && zoneLightInt_thread_11 < 50){//sysj\ECS.sysj line: 23, column: 11
          zoneThreeLightONOFF.setPresent();//sysj\ECS.sysj line: 24, column: 14
          currsigs.addElement(zoneThreeLightONOFF);
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

  public void thread109535(int [] tdone, int [] ends){
        switch(S108487){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        zoneOcc_thread_10 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 21, column: 4
        zoneLightInt_thread_10 = (Integer)(zoneTwoLightingI.getpreval() == null ? 0 : ((Integer)zoneTwoLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 22, column: 7
        if(zoneOcc_thread_10 > 0 && zoneLightInt_thread_10 < 50){//sysj\ECS.sysj line: 23, column: 11
          zoneTwoLightONOFF.setPresent();//sysj\ECS.sysj line: 24, column: 14
          currsigs.addElement(zoneTwoLightONOFF);
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

  public void thread109534(int [] tdone, int [] ends){
        switch(S108475){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        zoneOcc_thread_9 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 21, column: 4
        zoneLightInt_thread_9 = (Integer)(zoneOneLightingI.getpreval() == null ? 0 : ((Integer)zoneOneLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 22, column: 7
        if(zoneOcc_thread_9 > 0 && zoneLightInt_thread_9 < 50){//sysj\ECS.sysj line: 23, column: 11
          zoneOneLightONOFF.setPresent();//sysj\ECS.sysj line: 24, column: 14
          currsigs.addElement(zoneOneLightONOFF);
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

  public void thread109533(int [] tdone, int [] ends){
        switch(S109488){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S108804){
          case 0 : 
            thread109534(tdone,ends);
            thread109535(tdone,ends);
            thread109536(tdone,ends);
            thread109537(tdone,ends);
            thread109538(tdone,ends);
            thread109539(tdone,ends);
            thread109540(tdone,ends);
            int biggest109541 = 0;
            if(ends[9]>=biggest109541){
              biggest109541=ends[9];
            }
            if(ends[10]>=biggest109541){
              biggest109541=ends[10];
            }
            if(ends[11]>=biggest109541){
              biggest109541=ends[11];
            }
            if(ends[12]>=biggest109541){
              biggest109541=ends[12];
            }
            if(ends[13]>=biggest109541){
              biggest109541=ends[13];
            }
            if(ends[14]>=biggest109541){
              biggest109541=ends[14];
            }
            if(ends[15]>=biggest109541){
              biggest109541=ends[15];
            }
            if(biggest109541 == 1){
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            //FINXME code
            if(biggest109541 == 0){
              S108804=1;
              if(workhrs_6.getprestatus()){//sysj\ECS.sysj line: 349, column: 16
                thread109542(tdone,ends);
                thread109543(tdone,ends);
                thread109544(tdone,ends);
                thread109545(tdone,ends);
                thread109546(tdone,ends);
                thread109547(tdone,ends);
                thread109548(tdone,ends);
                int biggest109549 = 0;
                if(ends[16]>=biggest109549){
                  biggest109549=ends[16];
                }
                if(ends[17]>=biggest109549){
                  biggest109549=ends[17];
                }
                if(ends[18]>=biggest109549){
                  biggest109549=ends[18];
                }
                if(ends[19]>=biggest109549){
                  biggest109549=ends[19];
                }
                if(ends[20]>=biggest109549){
                  biggest109549=ends[20];
                }
                if(ends[21]>=biggest109549){
                  biggest109549=ends[21];
                }
                if(ends[22]>=biggest109549){
                  biggest109549=ends[22];
                }
                if(biggest109549 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                if(biggest109549 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                if(biggest109549 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                if(biggest109549 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                if(biggest109549 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                if(biggest109549 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                if(biggest109549 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
              }
              else {
                S108804=2;
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
            }
            break;
          
          case 1 : 
            thread109550(tdone,ends);
            thread109551(tdone,ends);
            thread109552(tdone,ends);
            thread109553(tdone,ends);
            thread109554(tdone,ends);
            thread109555(tdone,ends);
            thread109556(tdone,ends);
            int biggest109557 = 0;
            if(ends[16]>=biggest109557){
              biggest109557=ends[16];
            }
            if(ends[17]>=biggest109557){
              biggest109557=ends[17];
            }
            if(ends[18]>=biggest109557){
              biggest109557=ends[18];
            }
            if(ends[19]>=biggest109557){
              biggest109557=ends[19];
            }
            if(ends[20]>=biggest109557){
              biggest109557=ends[20];
            }
            if(ends[21]>=biggest109557){
              biggest109557=ends[21];
            }
            if(ends[22]>=biggest109557){
              biggest109557=ends[22];
            }
            if(biggest109557 == 1){
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            //FINXME code
            if(biggest109557 == 0){
              S108804=2;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 2 : 
            S108804=2;
            S108804=0;
            if(afterhrs_6.getprestatus()){//sysj\ECS.sysj line: 333, column: 13
              thread109558(tdone,ends);
              thread109559(tdone,ends);
              thread109560(tdone,ends);
              thread109561(tdone,ends);
              thread109562(tdone,ends);
              thread109563(tdone,ends);
              thread109564(tdone,ends);
              int biggest109565 = 0;
              if(ends[9]>=biggest109565){
                biggest109565=ends[9];
              }
              if(ends[10]>=biggest109565){
                biggest109565=ends[10];
              }
              if(ends[11]>=biggest109565){
                biggest109565=ends[11];
              }
              if(ends[12]>=biggest109565){
                biggest109565=ends[12];
              }
              if(ends[13]>=biggest109565){
                biggest109565=ends[13];
              }
              if(ends[14]>=biggest109565){
                biggest109565=ends[14];
              }
              if(ends[15]>=biggest109565){
                biggest109565=ends[15];
              }
              if(biggest109565 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              if(biggest109565 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              if(biggest109565 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              if(biggest109565 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              if(biggest109565 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              if(biggest109565 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              if(biggest109565 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
            }
            else {
              S108804=1;
              if(workhrs_6.getprestatus()){//sysj\ECS.sysj line: 349, column: 16
                thread109566(tdone,ends);
                thread109567(tdone,ends);
                thread109568(tdone,ends);
                thread109569(tdone,ends);
                thread109570(tdone,ends);
                thread109571(tdone,ends);
                thread109572(tdone,ends);
                int biggest109573 = 0;
                if(ends[16]>=biggest109573){
                  biggest109573=ends[16];
                }
                if(ends[17]>=biggest109573){
                  biggest109573=ends[17];
                }
                if(ends[18]>=biggest109573){
                  biggest109573=ends[18];
                }
                if(ends[19]>=biggest109573){
                  biggest109573=ends[19];
                }
                if(ends[20]>=biggest109573){
                  biggest109573=ends[20];
                }
                if(ends[21]>=biggest109573){
                  biggest109573=ends[21];
                }
                if(ends[22]>=biggest109573){
                  biggest109573=ends[22];
                }
                if(biggest109573 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                if(biggest109573 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                if(biggest109573 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                if(biggest109573 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                if(biggest109573 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                if(biggest109573 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                if(biggest109573 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
              }
              else {
                S108804=2;
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread109532(int [] tdone, int [] ends){
        switch(S108463){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(currentTime_2.getprestatus()){//sysj\ECS.sysj line: 315, column: 14
          currentHour_thread_7 = (Integer)(currentTime_2.getpreval() == null ? 0 : ((Integer)currentTime_2.getpreval()).intValue());//sysj\ECS.sysj line: 316, column: 8
          if(currentHour_thread_7 >= 9 && currentHour_thread_7 <= 17){//sysj\ECS.sysj line: 318, column: 16
            workhrs_6.setPresent();//sysj\ECS.sysj line: 319, column: 16
            currsigs.addElement(workhrs_6);
            active[7]=1;
            ends[7]=1;
            tdone[7]=1;
          }
          else {
            afterhrs_6.setPresent();//sysj\ECS.sysj line: 321, column: 16
            currsigs.addElement(afterhrs_6);
            active[7]=1;
            ends[7]=1;
            tdone[7]=1;
          }
        }
        else {
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        break;
      
    }
  }

  public void thread109529(int [] tdone, int [] ends){
        S108632=1;
    zoneOcc_thread_22 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 4
    zoneLightInt_thread_22 = (Integer)(zoneSevenLightingI.getpreval() == null ? 0 : ((Integer)zoneSevenLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 7
    if(zoneOcc_thread_22 > 0 && zoneLightInt_thread_22 < 50){//sysj\ECS.sysj line: 9, column: 11
      zoneSevenWindowONOFF.setPresent();//sysj\ECS.sysj line: 10, column: 14
      currsigs.addElement(zoneSevenWindowONOFF);
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

  public void thread109528(int [] tdone, int [] ends){
        S108620=1;
    zoneOcc_thread_21 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 4
    zoneLightInt_thread_21 = (Integer)(zoneSixLightingI.getpreval() == null ? 0 : ((Integer)zoneSixLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 7
    if(zoneOcc_thread_21 > 0 && zoneLightInt_thread_21 < 50){//sysj\ECS.sysj line: 9, column: 11
      zoneSixWindowONOFF.setPresent();//sysj\ECS.sysj line: 10, column: 14
      currsigs.addElement(zoneSixWindowONOFF);
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

  public void thread109527(int [] tdone, int [] ends){
        S108608=1;
    zoneOcc_thread_20 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 4
    zoneLightInt_thread_20 = (Integer)(zoneFiveLightingI.getpreval() == null ? 0 : ((Integer)zoneFiveLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 7
    if(zoneOcc_thread_20 > 0 && zoneLightInt_thread_20 < 50){//sysj\ECS.sysj line: 9, column: 11
      zoneFiveWindowONOFF.setPresent();//sysj\ECS.sysj line: 10, column: 14
      currsigs.addElement(zoneFiveWindowONOFF);
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

  public void thread109526(int [] tdone, int [] ends){
        S108596=1;
    zoneOcc_thread_19 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 4
    zoneLightInt_thread_19 = (Integer)(zoneFourLightingI.getpreval() == null ? 0 : ((Integer)zoneFourLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 7
    if(zoneOcc_thread_19 > 0 && zoneLightInt_thread_19 < 50){//sysj\ECS.sysj line: 9, column: 11
      zoneFourWindowONOFF.setPresent();//sysj\ECS.sysj line: 10, column: 14
      currsigs.addElement(zoneFourWindowONOFF);
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

  public void thread109525(int [] tdone, int [] ends){
        S108584=1;
    zoneOcc_thread_18 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 4
    zoneLightInt_thread_18 = (Integer)(zoneThreeLightingI.getpreval() == null ? 0 : ((Integer)zoneThreeLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 7
    if(zoneOcc_thread_18 > 0 && zoneLightInt_thread_18 < 50){//sysj\ECS.sysj line: 9, column: 11
      zoneThreeWindowONOFF.setPresent();//sysj\ECS.sysj line: 10, column: 14
      currsigs.addElement(zoneThreeWindowONOFF);
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
    else {
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread109524(int [] tdone, int [] ends){
        S108572=1;
    zoneOcc_thread_17 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 4
    zoneLightInt_thread_17 = (Integer)(zoneTwoLightingI.getpreval() == null ? 0 : ((Integer)zoneTwoLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 7
    if(zoneOcc_thread_17 > 0 && zoneLightInt_thread_17 < 50){//sysj\ECS.sysj line: 9, column: 11
      zoneTwoWindowONOFF.setPresent();//sysj\ECS.sysj line: 10, column: 14
      currsigs.addElement(zoneTwoWindowONOFF);
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

  public void thread109523(int [] tdone, int [] ends){
        S108560=1;
    zoneOcc_thread_16 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 4
    zoneLightInt_thread_16 = (Integer)(zoneOneLightingI.getpreval() == null ? 0 : ((Integer)zoneOneLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 7
    if(zoneOcc_thread_16 > 0 && zoneLightInt_thread_16 < 50){//sysj\ECS.sysj line: 9, column: 11
      zoneOneWindowONOFF.setPresent();//sysj\ECS.sysj line: 10, column: 14
      currsigs.addElement(zoneOneWindowONOFF);
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

  public void thread109521(int [] tdone, int [] ends){
        S108547=1;
    zoneOcc_thread_15 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 21, column: 4
    zoneLightInt_thread_15 = (Integer)(zoneSevenLightingI.getpreval() == null ? 0 : ((Integer)zoneSevenLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 22, column: 7
    if(zoneOcc_thread_15 > 0 && zoneLightInt_thread_15 < 50){//sysj\ECS.sysj line: 23, column: 11
      zoneSevenLightONOFF.setPresent();//sysj\ECS.sysj line: 24, column: 14
      currsigs.addElement(zoneSevenLightONOFF);
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    else {
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread109520(int [] tdone, int [] ends){
        S108535=1;
    zoneOcc_thread_14 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 21, column: 4
    zoneLightInt_thread_14 = (Integer)(zoneSixLightingI.getpreval() == null ? 0 : ((Integer)zoneSixLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 22, column: 7
    if(zoneOcc_thread_14 > 0 && zoneLightInt_thread_14 < 50){//sysj\ECS.sysj line: 23, column: 11
      zoneSixLightONOFF.setPresent();//sysj\ECS.sysj line: 24, column: 14
      currsigs.addElement(zoneSixLightONOFF);
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread109519(int [] tdone, int [] ends){
        S108523=1;
    zoneOcc_thread_13 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 21, column: 4
    zoneLightInt_thread_13 = (Integer)(zoneFiveLightingI.getpreval() == null ? 0 : ((Integer)zoneFiveLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 22, column: 7
    if(zoneOcc_thread_13 > 0 && zoneLightInt_thread_13 < 50){//sysj\ECS.sysj line: 23, column: 11
      zoneFiveLightONOFF.setPresent();//sysj\ECS.sysj line: 24, column: 14
      currsigs.addElement(zoneFiveLightONOFF);
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
    else {
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread109518(int [] tdone, int [] ends){
        S108511=1;
    zoneOcc_thread_12 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 21, column: 4
    zoneLightInt_thread_12 = (Integer)(zoneFourLightingI.getpreval() == null ? 0 : ((Integer)zoneFourLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 22, column: 7
    if(zoneOcc_thread_12 > 0 && zoneLightInt_thread_12 < 50){//sysj\ECS.sysj line: 23, column: 11
      zoneFourLightONOFF.setPresent();//sysj\ECS.sysj line: 24, column: 14
      currsigs.addElement(zoneFourLightONOFF);
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

  public void thread109517(int [] tdone, int [] ends){
        S108499=1;
    zoneOcc_thread_11 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 21, column: 4
    zoneLightInt_thread_11 = (Integer)(zoneThreeLightingI.getpreval() == null ? 0 : ((Integer)zoneThreeLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 22, column: 7
    if(zoneOcc_thread_11 > 0 && zoneLightInt_thread_11 < 50){//sysj\ECS.sysj line: 23, column: 11
      zoneThreeLightONOFF.setPresent();//sysj\ECS.sysj line: 24, column: 14
      currsigs.addElement(zoneThreeLightONOFF);
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
    else {
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread109516(int [] tdone, int [] ends){
        S108487=1;
    zoneOcc_thread_10 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 21, column: 4
    zoneLightInt_thread_10 = (Integer)(zoneTwoLightingI.getpreval() == null ? 0 : ((Integer)zoneTwoLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 22, column: 7
    if(zoneOcc_thread_10 > 0 && zoneLightInt_thread_10 < 50){//sysj\ECS.sysj line: 23, column: 11
      zoneTwoLightONOFF.setPresent();//sysj\ECS.sysj line: 24, column: 14
      currsigs.addElement(zoneTwoLightONOFF);
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

  public void thread109515(int [] tdone, int [] ends){
        S108475=1;
    zoneOcc_thread_9 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 21, column: 4
    zoneLightInt_thread_9 = (Integer)(zoneOneLightingI.getpreval() == null ? 0 : ((Integer)zoneOneLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 22, column: 7
    if(zoneOcc_thread_9 > 0 && zoneLightInt_thread_9 < 50){//sysj\ECS.sysj line: 23, column: 11
      zoneOneLightONOFF.setPresent();//sysj\ECS.sysj line: 24, column: 14
      currsigs.addElement(zoneOneLightONOFF);
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

  public void thread109514(int [] tdone, int [] ends){
        S109488=1;
    S108804=0;
    if(afterhrs_6.getprestatus()){//sysj\ECS.sysj line: 333, column: 13
      thread109515(tdone,ends);
      thread109516(tdone,ends);
      thread109517(tdone,ends);
      thread109518(tdone,ends);
      thread109519(tdone,ends);
      thread109520(tdone,ends);
      thread109521(tdone,ends);
      int biggest109522 = 0;
      if(ends[9]>=biggest109522){
        biggest109522=ends[9];
      }
      if(ends[10]>=biggest109522){
        biggest109522=ends[10];
      }
      if(ends[11]>=biggest109522){
        biggest109522=ends[11];
      }
      if(ends[12]>=biggest109522){
        biggest109522=ends[12];
      }
      if(ends[13]>=biggest109522){
        biggest109522=ends[13];
      }
      if(ends[14]>=biggest109522){
        biggest109522=ends[14];
      }
      if(ends[15]>=biggest109522){
        biggest109522=ends[15];
      }
      if(biggest109522 == 1){
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
      if(biggest109522 == 1){
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
      if(biggest109522 == 1){
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
      if(biggest109522 == 1){
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
      if(biggest109522 == 1){
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
      if(biggest109522 == 1){
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
      if(biggest109522 == 1){
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
    }
    else {
      S108804=1;
      if(workhrs_6.getprestatus()){//sysj\ECS.sysj line: 349, column: 16
        thread109523(tdone,ends);
        thread109524(tdone,ends);
        thread109525(tdone,ends);
        thread109526(tdone,ends);
        thread109527(tdone,ends);
        thread109528(tdone,ends);
        thread109529(tdone,ends);
        int biggest109530 = 0;
        if(ends[16]>=biggest109530){
          biggest109530=ends[16];
        }
        if(ends[17]>=biggest109530){
          biggest109530=ends[17];
        }
        if(ends[18]>=biggest109530){
          biggest109530=ends[18];
        }
        if(ends[19]>=biggest109530){
          biggest109530=ends[19];
        }
        if(ends[20]>=biggest109530){
          biggest109530=ends[20];
        }
        if(ends[21]>=biggest109530){
          biggest109530=ends[21];
        }
        if(ends[22]>=biggest109530){
          biggest109530=ends[22];
        }
        if(biggest109530 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        if(biggest109530 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        if(biggest109530 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        if(biggest109530 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        if(biggest109530 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        if(biggest109530 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        if(biggest109530 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
      }
      else {
        S108804=2;
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
    }
  }

  public void thread109513(int [] tdone, int [] ends){
        S108463=1;
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
      switch(S109490){
        case 0 : 
          S109490=0;
          break RUN;
        
        case 1 : 
          S109490=2;
          S109490=2;
          workhrs_6.setClear();//sysj\ECS.sysj line: 308, column: 4
          afterhrs_6.setClear();//sysj\ECS.sysj line: 308, column: 4
          thread109513(tdone,ends);
          thread109514(tdone,ends);
          int biggest109531 = 0;
          if(ends[7]>=biggest109531){
            biggest109531=ends[7];
          }
          if(ends[8]>=biggest109531){
            biggest109531=ends[8];
          }
          if(biggest109531 == 1){
            active[6]=1;
            ends[6]=1;
            break RUN;
          }
        
        case 2 : 
          workhrs_6.setClear();//sysj\ECS.sysj line: 308, column: 4
          afterhrs_6.setClear();//sysj\ECS.sysj line: 308, column: 4
          thread109532(tdone,ends);
          thread109533(tdone,ends);
          int biggest109574 = 0;
          if(ends[7]>=biggest109574){
            biggest109574=ends[7];
          }
          if(ends[8]>=biggest109574){
            biggest109574=ends[8];
          }
          if(biggest109574 == 1){
            active[6]=1;
            ends[6]=1;
            break RUN;
          }
          //FINXME code
          if(biggest109574 == 0){
            S109490=0;
            active[6]=0;
            ends[6]=0;
            S109490=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    workhrs_6 = new Signal();
    afterhrs_6 = new Signal();
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
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
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
      if(paused[6]!=0 || suspended[6]!=0 || active[6]!=1);
      else{
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
