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
  private int currentHour_thread_7;//sysj\ECS.sysj line: 256, column: 8
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
  private int S108102 = 1;
  private int S107075 = 1;
  private int S108100 = 1;
  private int S107416 = 1;
  private int S107087 = 1;
  private int S107099 = 1;
  private int S107111 = 1;
  private int S107123 = 1;
  private int S107135 = 1;
  private int S107147 = 1;
  private int S107159 = 1;
  private int S107172 = 1;
  private int S107184 = 1;
  private int S107196 = 1;
  private int S107208 = 1;
  private int S107220 = 1;
  private int S107232 = 1;
  private int S107244 = 1;
  
  private int[] ends = new int[24];
  private int[] tdone = new int[24];
  
  public void thread108184(int [] tdone, int [] ends){
        S107244=1;
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

  public void thread108183(int [] tdone, int [] ends){
        S107232=1;
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

  public void thread108182(int [] tdone, int [] ends){
        S107220=1;
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

  public void thread108181(int [] tdone, int [] ends){
        S107208=1;
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

  public void thread108180(int [] tdone, int [] ends){
        S107196=1;
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

  public void thread108179(int [] tdone, int [] ends){
        S107184=1;
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

  public void thread108178(int [] tdone, int [] ends){
        S107172=1;
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

  public void thread108176(int [] tdone, int [] ends){
        S107159=1;
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

  public void thread108175(int [] tdone, int [] ends){
        S107147=1;
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

  public void thread108174(int [] tdone, int [] ends){
        S107135=1;
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

  public void thread108173(int [] tdone, int [] ends){
        S107123=1;
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

  public void thread108172(int [] tdone, int [] ends){
        S107111=1;
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

  public void thread108171(int [] tdone, int [] ends){
        S107099=1;
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

  public void thread108170(int [] tdone, int [] ends){
        S107087=1;
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

  public void thread108168(int [] tdone, int [] ends){
        switch(S107244){
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

  public void thread108167(int [] tdone, int [] ends){
        switch(S107232){
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

  public void thread108166(int [] tdone, int [] ends){
        switch(S107220){
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

  public void thread108165(int [] tdone, int [] ends){
        switch(S107208){
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

  public void thread108164(int [] tdone, int [] ends){
        switch(S107196){
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

  public void thread108163(int [] tdone, int [] ends){
        switch(S107184){
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

  public void thread108162(int [] tdone, int [] ends){
        switch(S107172){
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

  public void thread108160(int [] tdone, int [] ends){
        S107244=1;
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

  public void thread108159(int [] tdone, int [] ends){
        S107232=1;
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

  public void thread108158(int [] tdone, int [] ends){
        S107220=1;
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

  public void thread108157(int [] tdone, int [] ends){
        S107208=1;
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

  public void thread108156(int [] tdone, int [] ends){
        S107196=1;
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

  public void thread108155(int [] tdone, int [] ends){
        S107184=1;
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

  public void thread108154(int [] tdone, int [] ends){
        S107172=1;
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

  public void thread108152(int [] tdone, int [] ends){
        switch(S107159){
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

  public void thread108151(int [] tdone, int [] ends){
        switch(S107147){
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

  public void thread108150(int [] tdone, int [] ends){
        switch(S107135){
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

  public void thread108149(int [] tdone, int [] ends){
        switch(S107123){
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

  public void thread108148(int [] tdone, int [] ends){
        switch(S107111){
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

  public void thread108147(int [] tdone, int [] ends){
        switch(S107099){
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

  public void thread108146(int [] tdone, int [] ends){
        switch(S107087){
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

  public void thread108145(int [] tdone, int [] ends){
        switch(S108100){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S107416){
          case 0 : 
            thread108146(tdone,ends);
            thread108147(tdone,ends);
            thread108148(tdone,ends);
            thread108149(tdone,ends);
            thread108150(tdone,ends);
            thread108151(tdone,ends);
            thread108152(tdone,ends);
            int biggest108153 = 0;
            if(ends[9]>=biggest108153){
              biggest108153=ends[9];
            }
            if(ends[10]>=biggest108153){
              biggest108153=ends[10];
            }
            if(ends[11]>=biggest108153){
              biggest108153=ends[11];
            }
            if(ends[12]>=biggest108153){
              biggest108153=ends[12];
            }
            if(ends[13]>=biggest108153){
              biggest108153=ends[13];
            }
            if(ends[14]>=biggest108153){
              biggest108153=ends[14];
            }
            if(ends[15]>=biggest108153){
              biggest108153=ends[15];
            }
            if(biggest108153 == 1){
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            //FINXME code
            if(biggest108153 == 0){
              S107416=1;
              if(workhrs_6.getprestatus()){//sysj\ECS.sysj line: 289, column: 16
                thread108154(tdone,ends);
                thread108155(tdone,ends);
                thread108156(tdone,ends);
                thread108157(tdone,ends);
                thread108158(tdone,ends);
                thread108159(tdone,ends);
                thread108160(tdone,ends);
                int biggest108161 = 0;
                if(ends[16]>=biggest108161){
                  biggest108161=ends[16];
                }
                if(ends[17]>=biggest108161){
                  biggest108161=ends[17];
                }
                if(ends[18]>=biggest108161){
                  biggest108161=ends[18];
                }
                if(ends[19]>=biggest108161){
                  biggest108161=ends[19];
                }
                if(ends[20]>=biggest108161){
                  biggest108161=ends[20];
                }
                if(ends[21]>=biggest108161){
                  biggest108161=ends[21];
                }
                if(ends[22]>=biggest108161){
                  biggest108161=ends[22];
                }
                if(biggest108161 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                if(biggest108161 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                if(biggest108161 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                if(biggest108161 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                if(biggest108161 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                if(biggest108161 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                if(biggest108161 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
              }
              else {
                S107416=2;
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
            }
            break;
          
          case 1 : 
            thread108162(tdone,ends);
            thread108163(tdone,ends);
            thread108164(tdone,ends);
            thread108165(tdone,ends);
            thread108166(tdone,ends);
            thread108167(tdone,ends);
            thread108168(tdone,ends);
            int biggest108169 = 0;
            if(ends[16]>=biggest108169){
              biggest108169=ends[16];
            }
            if(ends[17]>=biggest108169){
              biggest108169=ends[17];
            }
            if(ends[18]>=biggest108169){
              biggest108169=ends[18];
            }
            if(ends[19]>=biggest108169){
              biggest108169=ends[19];
            }
            if(ends[20]>=biggest108169){
              biggest108169=ends[20];
            }
            if(ends[21]>=biggest108169){
              biggest108169=ends[21];
            }
            if(ends[22]>=biggest108169){
              biggest108169=ends[22];
            }
            if(biggest108169 == 1){
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            //FINXME code
            if(biggest108169 == 0){
              S107416=2;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 2 : 
            S107416=2;
            S107416=0;
            if(afterhrs_6.getprestatus()){//sysj\ECS.sysj line: 273, column: 13
              thread108170(tdone,ends);
              thread108171(tdone,ends);
              thread108172(tdone,ends);
              thread108173(tdone,ends);
              thread108174(tdone,ends);
              thread108175(tdone,ends);
              thread108176(tdone,ends);
              int biggest108177 = 0;
              if(ends[9]>=biggest108177){
                biggest108177=ends[9];
              }
              if(ends[10]>=biggest108177){
                biggest108177=ends[10];
              }
              if(ends[11]>=biggest108177){
                biggest108177=ends[11];
              }
              if(ends[12]>=biggest108177){
                biggest108177=ends[12];
              }
              if(ends[13]>=biggest108177){
                biggest108177=ends[13];
              }
              if(ends[14]>=biggest108177){
                biggest108177=ends[14];
              }
              if(ends[15]>=biggest108177){
                biggest108177=ends[15];
              }
              if(biggest108177 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              if(biggest108177 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              if(biggest108177 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              if(biggest108177 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              if(biggest108177 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              if(biggest108177 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              if(biggest108177 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
            }
            else {
              S107416=1;
              if(workhrs_6.getprestatus()){//sysj\ECS.sysj line: 289, column: 16
                thread108178(tdone,ends);
                thread108179(tdone,ends);
                thread108180(tdone,ends);
                thread108181(tdone,ends);
                thread108182(tdone,ends);
                thread108183(tdone,ends);
                thread108184(tdone,ends);
                int biggest108185 = 0;
                if(ends[16]>=biggest108185){
                  biggest108185=ends[16];
                }
                if(ends[17]>=biggest108185){
                  biggest108185=ends[17];
                }
                if(ends[18]>=biggest108185){
                  biggest108185=ends[18];
                }
                if(ends[19]>=biggest108185){
                  biggest108185=ends[19];
                }
                if(ends[20]>=biggest108185){
                  biggest108185=ends[20];
                }
                if(ends[21]>=biggest108185){
                  biggest108185=ends[21];
                }
                if(ends[22]>=biggest108185){
                  biggest108185=ends[22];
                }
                if(biggest108185 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                if(biggest108185 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                if(biggest108185 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                if(biggest108185 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                if(biggest108185 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                if(biggest108185 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                if(biggest108185 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
              }
              else {
                S107416=2;
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

  public void thread108144(int [] tdone, int [] ends){
        switch(S107075){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(currentTime_2.getprestatus()){//sysj\ECS.sysj line: 255, column: 14
          currentHour_thread_7 = (Integer)(currentTime_2.getpreval() == null ? 0 : ((Integer)currentTime_2.getpreval()).intValue());//sysj\ECS.sysj line: 256, column: 8
          if(currentHour_thread_7 >= 9 && currentHour_thread_7 <= 17){//sysj\ECS.sysj line: 258, column: 16
            workhrs_6.setPresent();//sysj\ECS.sysj line: 259, column: 16
            currsigs.addElement(workhrs_6);
            active[7]=1;
            ends[7]=1;
            tdone[7]=1;
          }
          else {
            afterhrs_6.setPresent();//sysj\ECS.sysj line: 261, column: 16
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

  public void thread108141(int [] tdone, int [] ends){
        S107244=1;
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

  public void thread108140(int [] tdone, int [] ends){
        S107232=1;
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

  public void thread108139(int [] tdone, int [] ends){
        S107220=1;
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

  public void thread108138(int [] tdone, int [] ends){
        S107208=1;
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

  public void thread108137(int [] tdone, int [] ends){
        S107196=1;
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

  public void thread108136(int [] tdone, int [] ends){
        S107184=1;
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

  public void thread108135(int [] tdone, int [] ends){
        S107172=1;
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

  public void thread108133(int [] tdone, int [] ends){
        S107159=1;
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

  public void thread108132(int [] tdone, int [] ends){
        S107147=1;
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

  public void thread108131(int [] tdone, int [] ends){
        S107135=1;
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

  public void thread108130(int [] tdone, int [] ends){
        S107123=1;
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

  public void thread108129(int [] tdone, int [] ends){
        S107111=1;
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

  public void thread108128(int [] tdone, int [] ends){
        S107099=1;
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

  public void thread108127(int [] tdone, int [] ends){
        S107087=1;
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

  public void thread108126(int [] tdone, int [] ends){
        S108100=1;
    S107416=0;
    if(afterhrs_6.getprestatus()){//sysj\ECS.sysj line: 273, column: 13
      thread108127(tdone,ends);
      thread108128(tdone,ends);
      thread108129(tdone,ends);
      thread108130(tdone,ends);
      thread108131(tdone,ends);
      thread108132(tdone,ends);
      thread108133(tdone,ends);
      int biggest108134 = 0;
      if(ends[9]>=biggest108134){
        biggest108134=ends[9];
      }
      if(ends[10]>=biggest108134){
        biggest108134=ends[10];
      }
      if(ends[11]>=biggest108134){
        biggest108134=ends[11];
      }
      if(ends[12]>=biggest108134){
        biggest108134=ends[12];
      }
      if(ends[13]>=biggest108134){
        biggest108134=ends[13];
      }
      if(ends[14]>=biggest108134){
        biggest108134=ends[14];
      }
      if(ends[15]>=biggest108134){
        biggest108134=ends[15];
      }
      if(biggest108134 == 1){
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
      if(biggest108134 == 1){
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
      if(biggest108134 == 1){
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
      if(biggest108134 == 1){
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
      if(biggest108134 == 1){
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
      if(biggest108134 == 1){
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
      if(biggest108134 == 1){
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
    }
    else {
      S107416=1;
      if(workhrs_6.getprestatus()){//sysj\ECS.sysj line: 289, column: 16
        thread108135(tdone,ends);
        thread108136(tdone,ends);
        thread108137(tdone,ends);
        thread108138(tdone,ends);
        thread108139(tdone,ends);
        thread108140(tdone,ends);
        thread108141(tdone,ends);
        int biggest108142 = 0;
        if(ends[16]>=biggest108142){
          biggest108142=ends[16];
        }
        if(ends[17]>=biggest108142){
          biggest108142=ends[17];
        }
        if(ends[18]>=biggest108142){
          biggest108142=ends[18];
        }
        if(ends[19]>=biggest108142){
          biggest108142=ends[19];
        }
        if(ends[20]>=biggest108142){
          biggest108142=ends[20];
        }
        if(ends[21]>=biggest108142){
          biggest108142=ends[21];
        }
        if(ends[22]>=biggest108142){
          biggest108142=ends[22];
        }
        if(biggest108142 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        if(biggest108142 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        if(biggest108142 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        if(biggest108142 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        if(biggest108142 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        if(biggest108142 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        if(biggest108142 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
      }
      else {
        S107416=2;
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
    }
  }

  public void thread108125(int [] tdone, int [] ends){
        S107075=1;
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
      switch(S108102){
        case 0 : 
          S108102=0;
          break RUN;
        
        case 1 : 
          S108102=2;
          S108102=2;
          workhrs_6.setClear();//sysj\ECS.sysj line: 248, column: 4
          afterhrs_6.setClear();//sysj\ECS.sysj line: 248, column: 4
          thread108125(tdone,ends);
          thread108126(tdone,ends);
          int biggest108143 = 0;
          if(ends[7]>=biggest108143){
            biggest108143=ends[7];
          }
          if(ends[8]>=biggest108143){
            biggest108143=ends[8];
          }
          if(biggest108143 == 1){
            active[6]=1;
            ends[6]=1;
            break RUN;
          }
        
        case 2 : 
          workhrs_6.setClear();//sysj\ECS.sysj line: 248, column: 4
          afterhrs_6.setClear();//sysj\ECS.sysj line: 248, column: 4
          thread108144(tdone,ends);
          thread108145(tdone,ends);
          int biggest108186 = 0;
          if(ends[7]>=biggest108186){
            biggest108186=ends[7];
          }
          if(ends[8]>=biggest108186){
            biggest108186=ends[8];
          }
          if(biggest108186 == 1){
            active[6]=1;
            ends[6]=1;
            break RUN;
          }
          //FINXME code
          if(biggest108186 == 0){
            S108102=0;
            active[6]=0;
            ends[6]=0;
            S108102=0;
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
