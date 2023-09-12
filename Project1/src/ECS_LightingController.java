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
  private int currentHour_thread_7;//sysj\ECS.sysj line: 309, column: 8
  private int prevLightInt_thread_9;//sysj\ECS.sysj line: 2, column: 5
  private int zoneOcc_thread_9;//sysj\ECS.sysj line: 4, column: 9
  private int zoneLightInt_thread_9;//sysj\ECS.sysj line: 5, column: 9
  private int prevLightInt_thread_10;//sysj\ECS.sysj line: 2, column: 5
  private int zoneOcc_thread_10;//sysj\ECS.sysj line: 4, column: 9
  private int zoneLightInt_thread_10;//sysj\ECS.sysj line: 5, column: 9
  private int prevLightInt_thread_11;//sysj\ECS.sysj line: 2, column: 5
  private int zoneOcc_thread_11;//sysj\ECS.sysj line: 4, column: 9
  private int zoneLightInt_thread_11;//sysj\ECS.sysj line: 5, column: 9
  private int prevLightInt_thread_12;//sysj\ECS.sysj line: 2, column: 5
  private int zoneOcc_thread_12;//sysj\ECS.sysj line: 4, column: 9
  private int zoneLightInt_thread_12;//sysj\ECS.sysj line: 5, column: 9
  private int prevLightInt_thread_13;//sysj\ECS.sysj line: 2, column: 5
  private int zoneOcc_thread_13;//sysj\ECS.sysj line: 4, column: 9
  private int zoneLightInt_thread_13;//sysj\ECS.sysj line: 5, column: 9
  private int prevLightInt_thread_14;//sysj\ECS.sysj line: 2, column: 5
  private int zoneOcc_thread_14;//sysj\ECS.sysj line: 4, column: 9
  private int zoneLightInt_thread_14;//sysj\ECS.sysj line: 5, column: 9
  private int prevLightInt_thread_15;//sysj\ECS.sysj line: 2, column: 5
  private int zoneOcc_thread_15;//sysj\ECS.sysj line: 4, column: 9
  private int zoneLightInt_thread_15;//sysj\ECS.sysj line: 5, column: 9
  private int prevLightInt_thread_16;//sysj\ECS.sysj line: 15, column: 3
  private int zoneOcc_thread_16;//sysj\ECS.sysj line: 18, column: 4
  private int zoneLightInt_thread_16;//sysj\ECS.sysj line: 19, column: 7
  private int prevLightInt_thread_17;//sysj\ECS.sysj line: 15, column: 3
  private int zoneOcc_thread_17;//sysj\ECS.sysj line: 18, column: 4
  private int zoneLightInt_thread_17;//sysj\ECS.sysj line: 19, column: 7
  private int prevLightInt_thread_18;//sysj\ECS.sysj line: 15, column: 3
  private int zoneOcc_thread_18;//sysj\ECS.sysj line: 18, column: 4
  private int zoneLightInt_thread_18;//sysj\ECS.sysj line: 19, column: 7
  private int prevLightInt_thread_19;//sysj\ECS.sysj line: 15, column: 3
  private int zoneOcc_thread_19;//sysj\ECS.sysj line: 18, column: 4
  private int zoneLightInt_thread_19;//sysj\ECS.sysj line: 19, column: 7
  private int prevLightInt_thread_20;//sysj\ECS.sysj line: 15, column: 3
  private int zoneOcc_thread_20;//sysj\ECS.sysj line: 18, column: 4
  private int zoneLightInt_thread_20;//sysj\ECS.sysj line: 19, column: 7
  private int prevLightInt_thread_21;//sysj\ECS.sysj line: 15, column: 3
  private int zoneOcc_thread_21;//sysj\ECS.sysj line: 18, column: 4
  private int zoneLightInt_thread_21;//sysj\ECS.sysj line: 19, column: 7
  private int prevLightInt_thread_22;//sysj\ECS.sysj line: 15, column: 3
  private int zoneOcc_thread_22;//sysj\ECS.sysj line: 18, column: 4
  private int zoneLightInt_thread_22;//sysj\ECS.sysj line: 19, column: 7
  private int S107604 = 1;
  private int S107153 = 1;
  private int S107103 = 1;
  private int S107107 = 1;
  private int S107602 = 1;
  private int S107302 = 1;
  private int S107189 = 1;
  private int S107158 = 1;
  private int S107163 = 1;
  private int S107168 = 1;
  private int S107173 = 1;
  private int S107178 = 1;
  private int S107183 = 1;
  private int S107188 = 1;
  private int S107226 = 1;
  private int S107195 = 1;
  private int S107200 = 1;
  private int S107205 = 1;
  private int S107210 = 1;
  private int S107215 = 1;
  private int S107220 = 1;
  private int S107225 = 1;
  
  private int[] ends = new int[24];
  private int[] tdone = new int[24];
  
  public void thread107686(int [] tdone, int [] ends){
        S107225=1;
    prevLightInt_thread_22 = -1;//sysj\ECS.sysj line: 15, column: 3
    zoneOcc_thread_22 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 18, column: 4
    zoneLightInt_thread_22 = (Integer)(zoneSevenLightingI.getpreval() == null ? 0 : ((Integer)zoneSevenLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 19, column: 7
    if(zoneOcc_thread_22 > 0 && zoneLightInt_thread_22 < 50 && (zoneLightInt_thread_22 != prevLightInt_thread_22)){//sysj\ECS.sysj line: 20, column: 11
      zoneSevenLightONOFF.setPresent();//sysj\ECS.sysj line: 21, column: 14
      currsigs.addElement(zoneSevenLightONOFF);
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

  public void thread107685(int [] tdone, int [] ends){
        S107220=1;
    prevLightInt_thread_21 = -1;//sysj\ECS.sysj line: 15, column: 3
    zoneOcc_thread_21 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 18, column: 4
    zoneLightInt_thread_21 = (Integer)(zoneSixLightingI.getpreval() == null ? 0 : ((Integer)zoneSixLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 19, column: 7
    if(zoneOcc_thread_21 > 0 && zoneLightInt_thread_21 < 50 && (zoneLightInt_thread_21 != prevLightInt_thread_21)){//sysj\ECS.sysj line: 20, column: 11
      zoneSixLightONOFF.setPresent();//sysj\ECS.sysj line: 21, column: 14
      currsigs.addElement(zoneSixLightONOFF);
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

  public void thread107684(int [] tdone, int [] ends){
        S107215=1;
    prevLightInt_thread_20 = -1;//sysj\ECS.sysj line: 15, column: 3
    zoneOcc_thread_20 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 18, column: 4
    zoneLightInt_thread_20 = (Integer)(zoneFiveLightingI.getpreval() == null ? 0 : ((Integer)zoneFiveLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 19, column: 7
    if(zoneOcc_thread_20 > 0 && zoneLightInt_thread_20 < 50 && (zoneLightInt_thread_20 != prevLightInt_thread_20)){//sysj\ECS.sysj line: 20, column: 11
      zoneFiveLightONOFF.setPresent();//sysj\ECS.sysj line: 21, column: 14
      currsigs.addElement(zoneFiveLightONOFF);
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

  public void thread107683(int [] tdone, int [] ends){
        S107210=1;
    prevLightInt_thread_19 = -1;//sysj\ECS.sysj line: 15, column: 3
    zoneOcc_thread_19 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 18, column: 4
    zoneLightInt_thread_19 = (Integer)(zoneFourLightingI.getpreval() == null ? 0 : ((Integer)zoneFourLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 19, column: 7
    if(zoneOcc_thread_19 > 0 && zoneLightInt_thread_19 < 50 && (zoneLightInt_thread_19 != prevLightInt_thread_19)){//sysj\ECS.sysj line: 20, column: 11
      zoneFourLightONOFF.setPresent();//sysj\ECS.sysj line: 21, column: 14
      currsigs.addElement(zoneFourLightONOFF);
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

  public void thread107682(int [] tdone, int [] ends){
        S107205=1;
    prevLightInt_thread_18 = -1;//sysj\ECS.sysj line: 15, column: 3
    zoneOcc_thread_18 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 18, column: 4
    zoneLightInt_thread_18 = (Integer)(zoneThreeLightingI.getpreval() == null ? 0 : ((Integer)zoneThreeLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 19, column: 7
    if(zoneOcc_thread_18 > 0 && zoneLightInt_thread_18 < 50 && (zoneLightInt_thread_18 != prevLightInt_thread_18)){//sysj\ECS.sysj line: 20, column: 11
      zoneThreeLightONOFF.setPresent();//sysj\ECS.sysj line: 21, column: 14
      currsigs.addElement(zoneThreeLightONOFF);
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

  public void thread107681(int [] tdone, int [] ends){
        S107200=1;
    prevLightInt_thread_17 = -1;//sysj\ECS.sysj line: 15, column: 3
    zoneOcc_thread_17 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 18, column: 4
    zoneLightInt_thread_17 = (Integer)(zoneTwoLightingI.getpreval() == null ? 0 : ((Integer)zoneTwoLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 19, column: 7
    if(zoneOcc_thread_17 > 0 && zoneLightInt_thread_17 < 50 && (zoneLightInt_thread_17 != prevLightInt_thread_17)){//sysj\ECS.sysj line: 20, column: 11
      zoneTwoLightONOFF.setPresent();//sysj\ECS.sysj line: 21, column: 14
      currsigs.addElement(zoneTwoLightONOFF);
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

  public void thread107680(int [] tdone, int [] ends){
        S107195=1;
    prevLightInt_thread_16 = -1;//sysj\ECS.sysj line: 15, column: 3
    zoneOcc_thread_16 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 18, column: 4
    zoneLightInt_thread_16 = (Integer)(zoneOneLightingI.getpreval() == null ? 0 : ((Integer)zoneOneLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 19, column: 7
    if(zoneOcc_thread_16 > 0 && zoneLightInt_thread_16 < 50 && (zoneLightInt_thread_16 != prevLightInt_thread_16)){//sysj\ECS.sysj line: 20, column: 11
      zoneOneLightONOFF.setPresent();//sysj\ECS.sysj line: 21, column: 14
      currsigs.addElement(zoneOneLightONOFF);
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

  public void thread107678(int [] tdone, int [] ends){
        S107188=1;
    prevLightInt_thread_15 = -1;//sysj\ECS.sysj line: 2, column: 5
    zoneOcc_thread_15 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 4, column: 9
    zoneLightInt_thread_15 = (Integer)(zoneSevenLightingI.getpreval() == null ? 0 : ((Integer)zoneSevenLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 5, column: 9
    if(zoneOcc_thread_15 > 0 && zoneLightInt_thread_15 < 50 && (zoneLightInt_thread_15 != prevLightInt_thread_15)){//sysj\ECS.sysj line: 7, column: 13
      zoneSevenWindowONOFF.setPresent();//sysj\ECS.sysj line: 8, column: 13
      currsigs.addElement(zoneSevenWindowONOFF);
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

  public void thread107677(int [] tdone, int [] ends){
        S107183=1;
    prevLightInt_thread_14 = -1;//sysj\ECS.sysj line: 2, column: 5
    zoneOcc_thread_14 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 4, column: 9
    zoneLightInt_thread_14 = (Integer)(zoneSixLightingI.getpreval() == null ? 0 : ((Integer)zoneSixLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 5, column: 9
    if(zoneOcc_thread_14 > 0 && zoneLightInt_thread_14 < 50 && (zoneLightInt_thread_14 != prevLightInt_thread_14)){//sysj\ECS.sysj line: 7, column: 13
      zoneSixWindowONOFF.setPresent();//sysj\ECS.sysj line: 8, column: 13
      currsigs.addElement(zoneSixWindowONOFF);
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

  public void thread107676(int [] tdone, int [] ends){
        S107178=1;
    prevLightInt_thread_13 = -1;//sysj\ECS.sysj line: 2, column: 5
    zoneOcc_thread_13 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 4, column: 9
    zoneLightInt_thread_13 = (Integer)(zoneFiveLightingI.getpreval() == null ? 0 : ((Integer)zoneFiveLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 5, column: 9
    if(zoneOcc_thread_13 > 0 && zoneLightInt_thread_13 < 50 && (zoneLightInt_thread_13 != prevLightInt_thread_13)){//sysj\ECS.sysj line: 7, column: 13
      zoneFiveWindowONOFF.setPresent();//sysj\ECS.sysj line: 8, column: 13
      currsigs.addElement(zoneFiveWindowONOFF);
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

  public void thread107675(int [] tdone, int [] ends){
        S107173=1;
    prevLightInt_thread_12 = -1;//sysj\ECS.sysj line: 2, column: 5
    zoneOcc_thread_12 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 4, column: 9
    zoneLightInt_thread_12 = (Integer)(zoneFourLightingI.getpreval() == null ? 0 : ((Integer)zoneFourLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 5, column: 9
    if(zoneOcc_thread_12 > 0 && zoneLightInt_thread_12 < 50 && (zoneLightInt_thread_12 != prevLightInt_thread_12)){//sysj\ECS.sysj line: 7, column: 13
      zoneFourWindowONOFF.setPresent();//sysj\ECS.sysj line: 8, column: 13
      currsigs.addElement(zoneFourWindowONOFF);
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

  public void thread107674(int [] tdone, int [] ends){
        S107168=1;
    prevLightInt_thread_11 = -1;//sysj\ECS.sysj line: 2, column: 5
    zoneOcc_thread_11 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 4, column: 9
    zoneLightInt_thread_11 = (Integer)(zoneThreeLightingI.getpreval() == null ? 0 : ((Integer)zoneThreeLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 5, column: 9
    if(zoneOcc_thread_11 > 0 && zoneLightInt_thread_11 < 50 && (zoneLightInt_thread_11 != prevLightInt_thread_11)){//sysj\ECS.sysj line: 7, column: 13
      zoneThreeWindowONOFF.setPresent();//sysj\ECS.sysj line: 8, column: 13
      currsigs.addElement(zoneThreeWindowONOFF);
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

  public void thread107673(int [] tdone, int [] ends){
        S107163=1;
    prevLightInt_thread_10 = -1;//sysj\ECS.sysj line: 2, column: 5
    zoneOcc_thread_10 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 4, column: 9
    zoneLightInt_thread_10 = (Integer)(zoneTwoLightingI.getpreval() == null ? 0 : ((Integer)zoneTwoLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 5, column: 9
    if(zoneOcc_thread_10 > 0 && zoneLightInt_thread_10 < 50 && (zoneLightInt_thread_10 != prevLightInt_thread_10)){//sysj\ECS.sysj line: 7, column: 13
      zoneTwoWindowONOFF.setPresent();//sysj\ECS.sysj line: 8, column: 13
      currsigs.addElement(zoneTwoWindowONOFF);
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

  public void thread107672(int [] tdone, int [] ends){
        S107158=1;
    prevLightInt_thread_9 = -1;//sysj\ECS.sysj line: 2, column: 5
    zoneOcc_thread_9 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 4, column: 9
    zoneLightInt_thread_9 = (Integer)(zoneOneLightingI.getpreval() == null ? 0 : ((Integer)zoneOneLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 5, column: 9
    if(zoneOcc_thread_9 > 0 && zoneLightInt_thread_9 < 50 && (zoneLightInt_thread_9 != prevLightInt_thread_9)){//sysj\ECS.sysj line: 7, column: 13
      zoneOneWindowONOFF.setPresent();//sysj\ECS.sysj line: 8, column: 13
      currsigs.addElement(zoneOneWindowONOFF);
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

  public void thread107670(int [] tdone, int [] ends){
        switch(S107225){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        S107225=0;
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
    }
  }

  public void thread107669(int [] tdone, int [] ends){
        switch(S107220){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        S107220=0;
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
    }
  }

  public void thread107668(int [] tdone, int [] ends){
        switch(S107215){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        S107215=0;
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
    }
  }

  public void thread107667(int [] tdone, int [] ends){
        switch(S107210){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        S107210=0;
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
    }
  }

  public void thread107666(int [] tdone, int [] ends){
        switch(S107205){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        S107205=0;
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
    }
  }

  public void thread107665(int [] tdone, int [] ends){
        switch(S107200){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        S107200=0;
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
    }
  }

  public void thread107664(int [] tdone, int [] ends){
        switch(S107195){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        S107195=0;
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
    }
  }

  public void thread107662(int [] tdone, int [] ends){
        S107225=1;
    prevLightInt_thread_22 = -1;//sysj\ECS.sysj line: 15, column: 3
    zoneOcc_thread_22 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 18, column: 4
    zoneLightInt_thread_22 = (Integer)(zoneSevenLightingI.getpreval() == null ? 0 : ((Integer)zoneSevenLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 19, column: 7
    if(zoneOcc_thread_22 > 0 && zoneLightInt_thread_22 < 50 && (zoneLightInt_thread_22 != prevLightInt_thread_22)){//sysj\ECS.sysj line: 20, column: 11
      zoneSevenLightONOFF.setPresent();//sysj\ECS.sysj line: 21, column: 14
      currsigs.addElement(zoneSevenLightONOFF);
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

  public void thread107661(int [] tdone, int [] ends){
        S107220=1;
    prevLightInt_thread_21 = -1;//sysj\ECS.sysj line: 15, column: 3
    zoneOcc_thread_21 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 18, column: 4
    zoneLightInt_thread_21 = (Integer)(zoneSixLightingI.getpreval() == null ? 0 : ((Integer)zoneSixLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 19, column: 7
    if(zoneOcc_thread_21 > 0 && zoneLightInt_thread_21 < 50 && (zoneLightInt_thread_21 != prevLightInt_thread_21)){//sysj\ECS.sysj line: 20, column: 11
      zoneSixLightONOFF.setPresent();//sysj\ECS.sysj line: 21, column: 14
      currsigs.addElement(zoneSixLightONOFF);
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

  public void thread107660(int [] tdone, int [] ends){
        S107215=1;
    prevLightInt_thread_20 = -1;//sysj\ECS.sysj line: 15, column: 3
    zoneOcc_thread_20 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 18, column: 4
    zoneLightInt_thread_20 = (Integer)(zoneFiveLightingI.getpreval() == null ? 0 : ((Integer)zoneFiveLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 19, column: 7
    if(zoneOcc_thread_20 > 0 && zoneLightInt_thread_20 < 50 && (zoneLightInt_thread_20 != prevLightInt_thread_20)){//sysj\ECS.sysj line: 20, column: 11
      zoneFiveLightONOFF.setPresent();//sysj\ECS.sysj line: 21, column: 14
      currsigs.addElement(zoneFiveLightONOFF);
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

  public void thread107659(int [] tdone, int [] ends){
        S107210=1;
    prevLightInt_thread_19 = -1;//sysj\ECS.sysj line: 15, column: 3
    zoneOcc_thread_19 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 18, column: 4
    zoneLightInt_thread_19 = (Integer)(zoneFourLightingI.getpreval() == null ? 0 : ((Integer)zoneFourLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 19, column: 7
    if(zoneOcc_thread_19 > 0 && zoneLightInt_thread_19 < 50 && (zoneLightInt_thread_19 != prevLightInt_thread_19)){//sysj\ECS.sysj line: 20, column: 11
      zoneFourLightONOFF.setPresent();//sysj\ECS.sysj line: 21, column: 14
      currsigs.addElement(zoneFourLightONOFF);
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

  public void thread107658(int [] tdone, int [] ends){
        S107205=1;
    prevLightInt_thread_18 = -1;//sysj\ECS.sysj line: 15, column: 3
    zoneOcc_thread_18 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 18, column: 4
    zoneLightInt_thread_18 = (Integer)(zoneThreeLightingI.getpreval() == null ? 0 : ((Integer)zoneThreeLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 19, column: 7
    if(zoneOcc_thread_18 > 0 && zoneLightInt_thread_18 < 50 && (zoneLightInt_thread_18 != prevLightInt_thread_18)){//sysj\ECS.sysj line: 20, column: 11
      zoneThreeLightONOFF.setPresent();//sysj\ECS.sysj line: 21, column: 14
      currsigs.addElement(zoneThreeLightONOFF);
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

  public void thread107657(int [] tdone, int [] ends){
        S107200=1;
    prevLightInt_thread_17 = -1;//sysj\ECS.sysj line: 15, column: 3
    zoneOcc_thread_17 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 18, column: 4
    zoneLightInt_thread_17 = (Integer)(zoneTwoLightingI.getpreval() == null ? 0 : ((Integer)zoneTwoLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 19, column: 7
    if(zoneOcc_thread_17 > 0 && zoneLightInt_thread_17 < 50 && (zoneLightInt_thread_17 != prevLightInt_thread_17)){//sysj\ECS.sysj line: 20, column: 11
      zoneTwoLightONOFF.setPresent();//sysj\ECS.sysj line: 21, column: 14
      currsigs.addElement(zoneTwoLightONOFF);
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

  public void thread107656(int [] tdone, int [] ends){
        S107195=1;
    prevLightInt_thread_16 = -1;//sysj\ECS.sysj line: 15, column: 3
    zoneOcc_thread_16 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 18, column: 4
    zoneLightInt_thread_16 = (Integer)(zoneOneLightingI.getpreval() == null ? 0 : ((Integer)zoneOneLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 19, column: 7
    if(zoneOcc_thread_16 > 0 && zoneLightInt_thread_16 < 50 && (zoneLightInt_thread_16 != prevLightInt_thread_16)){//sysj\ECS.sysj line: 20, column: 11
      zoneOneLightONOFF.setPresent();//sysj\ECS.sysj line: 21, column: 14
      currsigs.addElement(zoneOneLightONOFF);
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

  public void thread107654(int [] tdone, int [] ends){
        switch(S107188){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        S107188=0;
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
    }
  }

  public void thread107653(int [] tdone, int [] ends){
        switch(S107183){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        S107183=0;
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
    }
  }

  public void thread107652(int [] tdone, int [] ends){
        switch(S107178){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        S107178=0;
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
    }
  }

  public void thread107651(int [] tdone, int [] ends){
        switch(S107173){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        S107173=0;
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
    }
  }

  public void thread107650(int [] tdone, int [] ends){
        switch(S107168){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        S107168=0;
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
    }
  }

  public void thread107649(int [] tdone, int [] ends){
        switch(S107163){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        S107163=0;
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
    }
  }

  public void thread107648(int [] tdone, int [] ends){
        switch(S107158){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        S107158=0;
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
    }
  }

  public void thread107647(int [] tdone, int [] ends){
        switch(S107602){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S107302){
          case 0 : 
            switch(S107189){
              case 0 : 
                thread107648(tdone,ends);
                thread107649(tdone,ends);
                thread107650(tdone,ends);
                thread107651(tdone,ends);
                thread107652(tdone,ends);
                thread107653(tdone,ends);
                thread107654(tdone,ends);
                int biggest107655 = 0;
                if(ends[9]>=biggest107655){
                  biggest107655=ends[9];
                }
                if(ends[10]>=biggest107655){
                  biggest107655=ends[10];
                }
                if(ends[11]>=biggest107655){
                  biggest107655=ends[11];
                }
                if(ends[12]>=biggest107655){
                  biggest107655=ends[12];
                }
                if(ends[13]>=biggest107655){
                  biggest107655=ends[13];
                }
                if(ends[14]>=biggest107655){
                  biggest107655=ends[14];
                }
                if(ends[15]>=biggest107655){
                  biggest107655=ends[15];
                }
                //FINXME code
                if(biggest107655 == 0){
                  S107189=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                break;
              
              case 1 : 
                S107189=1;
                S107302=1;
                if(afterhrs_6.getprestatus()){//sysj\ECS.sysj line: 352, column: 17
                  S107226=0;
                  thread107656(tdone,ends);
                  thread107657(tdone,ends);
                  thread107658(tdone,ends);
                  thread107659(tdone,ends);
                  thread107660(tdone,ends);
                  thread107661(tdone,ends);
                  thread107662(tdone,ends);
                  int biggest107663 = 0;
                  if(ends[16]>=biggest107663){
                    biggest107663=ends[16];
                  }
                  if(ends[17]>=biggest107663){
                    biggest107663=ends[17];
                  }
                  if(ends[18]>=biggest107663){
                    biggest107663=ends[18];
                  }
                  if(ends[19]>=biggest107663){
                    biggest107663=ends[19];
                  }
                  if(ends[20]>=biggest107663){
                    biggest107663=ends[20];
                  }
                  if(ends[21]>=biggest107663){
                    biggest107663=ends[21];
                  }
                  if(ends[22]>=biggest107663){
                    biggest107663=ends[22];
                  }
                  if(biggest107663 == 1){
                    active[8]=1;
                    ends[8]=1;
                    tdone[8]=1;
                  }
                  if(biggest107663 == 1){
                    active[8]=1;
                    ends[8]=1;
                    tdone[8]=1;
                  }
                  if(biggest107663 == 1){
                    active[8]=1;
                    ends[8]=1;
                    tdone[8]=1;
                  }
                  if(biggest107663 == 1){
                    active[8]=1;
                    ends[8]=1;
                    tdone[8]=1;
                  }
                  if(biggest107663 == 1){
                    active[8]=1;
                    ends[8]=1;
                    tdone[8]=1;
                  }
                  if(biggest107663 == 1){
                    active[8]=1;
                    ends[8]=1;
                    tdone[8]=1;
                  }
                  if(biggest107663 == 1){
                    active[8]=1;
                    ends[8]=1;
                    tdone[8]=1;
                  }
                }
                else {
                  S107302=2;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            switch(S107226){
              case 0 : 
                thread107664(tdone,ends);
                thread107665(tdone,ends);
                thread107666(tdone,ends);
                thread107667(tdone,ends);
                thread107668(tdone,ends);
                thread107669(tdone,ends);
                thread107670(tdone,ends);
                int biggest107671 = 0;
                if(ends[16]>=biggest107671){
                  biggest107671=ends[16];
                }
                if(ends[17]>=biggest107671){
                  biggest107671=ends[17];
                }
                if(ends[18]>=biggest107671){
                  biggest107671=ends[18];
                }
                if(ends[19]>=biggest107671){
                  biggest107671=ends[19];
                }
                if(ends[20]>=biggest107671){
                  biggest107671=ends[20];
                }
                if(ends[21]>=biggest107671){
                  biggest107671=ends[21];
                }
                if(ends[22]>=biggest107671){
                  biggest107671=ends[22];
                }
                //FINXME code
                if(biggest107671 == 0){
                  S107226=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                break;
              
              case 1 : 
                S107226=1;
                S107302=2;
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
                break;
              
            }
            break;
          
          case 2 : 
            S107302=2;
            S107302=0;
            if(workhrs_6.getprestatus()){//sysj\ECS.sysj line: 332, column: 17
              S107189=0;
              thread107672(tdone,ends);
              thread107673(tdone,ends);
              thread107674(tdone,ends);
              thread107675(tdone,ends);
              thread107676(tdone,ends);
              thread107677(tdone,ends);
              thread107678(tdone,ends);
              int biggest107679 = 0;
              if(ends[9]>=biggest107679){
                biggest107679=ends[9];
              }
              if(ends[10]>=biggest107679){
                biggest107679=ends[10];
              }
              if(ends[11]>=biggest107679){
                biggest107679=ends[11];
              }
              if(ends[12]>=biggest107679){
                biggest107679=ends[12];
              }
              if(ends[13]>=biggest107679){
                biggest107679=ends[13];
              }
              if(ends[14]>=biggest107679){
                biggest107679=ends[14];
              }
              if(ends[15]>=biggest107679){
                biggest107679=ends[15];
              }
              if(biggest107679 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              if(biggest107679 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              if(biggest107679 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              if(biggest107679 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              if(biggest107679 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              if(biggest107679 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              if(biggest107679 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
            }
            else {
              S107302=1;
              if(afterhrs_6.getprestatus()){//sysj\ECS.sysj line: 352, column: 17
                S107226=0;
                thread107680(tdone,ends);
                thread107681(tdone,ends);
                thread107682(tdone,ends);
                thread107683(tdone,ends);
                thread107684(tdone,ends);
                thread107685(tdone,ends);
                thread107686(tdone,ends);
                int biggest107687 = 0;
                if(ends[16]>=biggest107687){
                  biggest107687=ends[16];
                }
                if(ends[17]>=biggest107687){
                  biggest107687=ends[17];
                }
                if(ends[18]>=biggest107687){
                  biggest107687=ends[18];
                }
                if(ends[19]>=biggest107687){
                  biggest107687=ends[19];
                }
                if(ends[20]>=biggest107687){
                  biggest107687=ends[20];
                }
                if(ends[21]>=biggest107687){
                  biggest107687=ends[21];
                }
                if(ends[22]>=biggest107687){
                  biggest107687=ends[22];
                }
                if(biggest107687 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                if(biggest107687 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                if(biggest107687 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                if(biggest107687 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                if(biggest107687 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                if(biggest107687 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                if(biggest107687 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
              }
              else {
                S107302=2;
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

  public void thread107646(int [] tdone, int [] ends){
        switch(S107153){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S107103){
          case 0 : 
            if(currentTime_2.getprestatus()){//sysj\ECS.sysj line: 308, column: 14
              currentHour_thread_7 = (Integer)(currentTime_2.getpreval() == null ? 0 : ((Integer)currentTime_2.getpreval()).intValue());//sysj\ECS.sysj line: 309, column: 8
              S107103=1;
              if(currentHour_thread_7 >= 9 && currentHour_thread_7 <= 17){//sysj\ECS.sysj line: 311, column: 16
                S107107=0;
                workhrs_6.setPresent();//sysj\ECS.sysj line: 312, column: 16
                currsigs.addElement(workhrs_6);
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
              else {
                S107107=1;
                if((currentHour_thread_7 >= 18 && currentHour_thread_7 <= 24) || (currentHour_thread_7 >= 0 && currentHour_thread_7 < 9)){//sysj\ECS.sysj line: 316, column: 23
                  afterhrs_6.setPresent();//sysj\ECS.sysj line: 317, column: 16
                  currsigs.addElement(afterhrs_6);
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  S107103=0;
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
            switch(S107107){
              case 0 : 
                S107103=0;
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
                break;
              
              case 1 : 
                S107103=0;
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

  public void thread107643(int [] tdone, int [] ends){
        S107225=1;
    prevLightInt_thread_22 = -1;//sysj\ECS.sysj line: 15, column: 3
    zoneOcc_thread_22 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 18, column: 4
    zoneLightInt_thread_22 = (Integer)(zoneSevenLightingI.getpreval() == null ? 0 : ((Integer)zoneSevenLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 19, column: 7
    if(zoneOcc_thread_22 > 0 && zoneLightInt_thread_22 < 50 && (zoneLightInt_thread_22 != prevLightInt_thread_22)){//sysj\ECS.sysj line: 20, column: 11
      zoneSevenLightONOFF.setPresent();//sysj\ECS.sysj line: 21, column: 14
      currsigs.addElement(zoneSevenLightONOFF);
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

  public void thread107642(int [] tdone, int [] ends){
        S107220=1;
    prevLightInt_thread_21 = -1;//sysj\ECS.sysj line: 15, column: 3
    zoneOcc_thread_21 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 18, column: 4
    zoneLightInt_thread_21 = (Integer)(zoneSixLightingI.getpreval() == null ? 0 : ((Integer)zoneSixLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 19, column: 7
    if(zoneOcc_thread_21 > 0 && zoneLightInt_thread_21 < 50 && (zoneLightInt_thread_21 != prevLightInt_thread_21)){//sysj\ECS.sysj line: 20, column: 11
      zoneSixLightONOFF.setPresent();//sysj\ECS.sysj line: 21, column: 14
      currsigs.addElement(zoneSixLightONOFF);
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

  public void thread107641(int [] tdone, int [] ends){
        S107215=1;
    prevLightInt_thread_20 = -1;//sysj\ECS.sysj line: 15, column: 3
    zoneOcc_thread_20 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 18, column: 4
    zoneLightInt_thread_20 = (Integer)(zoneFiveLightingI.getpreval() == null ? 0 : ((Integer)zoneFiveLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 19, column: 7
    if(zoneOcc_thread_20 > 0 && zoneLightInt_thread_20 < 50 && (zoneLightInt_thread_20 != prevLightInt_thread_20)){//sysj\ECS.sysj line: 20, column: 11
      zoneFiveLightONOFF.setPresent();//sysj\ECS.sysj line: 21, column: 14
      currsigs.addElement(zoneFiveLightONOFF);
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

  public void thread107640(int [] tdone, int [] ends){
        S107210=1;
    prevLightInt_thread_19 = -1;//sysj\ECS.sysj line: 15, column: 3
    zoneOcc_thread_19 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 18, column: 4
    zoneLightInt_thread_19 = (Integer)(zoneFourLightingI.getpreval() == null ? 0 : ((Integer)zoneFourLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 19, column: 7
    if(zoneOcc_thread_19 > 0 && zoneLightInt_thread_19 < 50 && (zoneLightInt_thread_19 != prevLightInt_thread_19)){//sysj\ECS.sysj line: 20, column: 11
      zoneFourLightONOFF.setPresent();//sysj\ECS.sysj line: 21, column: 14
      currsigs.addElement(zoneFourLightONOFF);
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

  public void thread107639(int [] tdone, int [] ends){
        S107205=1;
    prevLightInt_thread_18 = -1;//sysj\ECS.sysj line: 15, column: 3
    zoneOcc_thread_18 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 18, column: 4
    zoneLightInt_thread_18 = (Integer)(zoneThreeLightingI.getpreval() == null ? 0 : ((Integer)zoneThreeLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 19, column: 7
    if(zoneOcc_thread_18 > 0 && zoneLightInt_thread_18 < 50 && (zoneLightInt_thread_18 != prevLightInt_thread_18)){//sysj\ECS.sysj line: 20, column: 11
      zoneThreeLightONOFF.setPresent();//sysj\ECS.sysj line: 21, column: 14
      currsigs.addElement(zoneThreeLightONOFF);
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

  public void thread107638(int [] tdone, int [] ends){
        S107200=1;
    prevLightInt_thread_17 = -1;//sysj\ECS.sysj line: 15, column: 3
    zoneOcc_thread_17 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 18, column: 4
    zoneLightInt_thread_17 = (Integer)(zoneTwoLightingI.getpreval() == null ? 0 : ((Integer)zoneTwoLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 19, column: 7
    if(zoneOcc_thread_17 > 0 && zoneLightInt_thread_17 < 50 && (zoneLightInt_thread_17 != prevLightInt_thread_17)){//sysj\ECS.sysj line: 20, column: 11
      zoneTwoLightONOFF.setPresent();//sysj\ECS.sysj line: 21, column: 14
      currsigs.addElement(zoneTwoLightONOFF);
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

  public void thread107637(int [] tdone, int [] ends){
        S107195=1;
    prevLightInt_thread_16 = -1;//sysj\ECS.sysj line: 15, column: 3
    zoneOcc_thread_16 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 18, column: 4
    zoneLightInt_thread_16 = (Integer)(zoneOneLightingI.getpreval() == null ? 0 : ((Integer)zoneOneLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 19, column: 7
    if(zoneOcc_thread_16 > 0 && zoneLightInt_thread_16 < 50 && (zoneLightInt_thread_16 != prevLightInt_thread_16)){//sysj\ECS.sysj line: 20, column: 11
      zoneOneLightONOFF.setPresent();//sysj\ECS.sysj line: 21, column: 14
      currsigs.addElement(zoneOneLightONOFF);
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

  public void thread107635(int [] tdone, int [] ends){
        S107188=1;
    prevLightInt_thread_15 = -1;//sysj\ECS.sysj line: 2, column: 5
    zoneOcc_thread_15 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 4, column: 9
    zoneLightInt_thread_15 = (Integer)(zoneSevenLightingI.getpreval() == null ? 0 : ((Integer)zoneSevenLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 5, column: 9
    if(zoneOcc_thread_15 > 0 && zoneLightInt_thread_15 < 50 && (zoneLightInt_thread_15 != prevLightInt_thread_15)){//sysj\ECS.sysj line: 7, column: 13
      zoneSevenWindowONOFF.setPresent();//sysj\ECS.sysj line: 8, column: 13
      currsigs.addElement(zoneSevenWindowONOFF);
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

  public void thread107634(int [] tdone, int [] ends){
        S107183=1;
    prevLightInt_thread_14 = -1;//sysj\ECS.sysj line: 2, column: 5
    zoneOcc_thread_14 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 4, column: 9
    zoneLightInt_thread_14 = (Integer)(zoneSixLightingI.getpreval() == null ? 0 : ((Integer)zoneSixLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 5, column: 9
    if(zoneOcc_thread_14 > 0 && zoneLightInt_thread_14 < 50 && (zoneLightInt_thread_14 != prevLightInt_thread_14)){//sysj\ECS.sysj line: 7, column: 13
      zoneSixWindowONOFF.setPresent();//sysj\ECS.sysj line: 8, column: 13
      currsigs.addElement(zoneSixWindowONOFF);
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

  public void thread107633(int [] tdone, int [] ends){
        S107178=1;
    prevLightInt_thread_13 = -1;//sysj\ECS.sysj line: 2, column: 5
    zoneOcc_thread_13 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 4, column: 9
    zoneLightInt_thread_13 = (Integer)(zoneFiveLightingI.getpreval() == null ? 0 : ((Integer)zoneFiveLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 5, column: 9
    if(zoneOcc_thread_13 > 0 && zoneLightInt_thread_13 < 50 && (zoneLightInt_thread_13 != prevLightInt_thread_13)){//sysj\ECS.sysj line: 7, column: 13
      zoneFiveWindowONOFF.setPresent();//sysj\ECS.sysj line: 8, column: 13
      currsigs.addElement(zoneFiveWindowONOFF);
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

  public void thread107632(int [] tdone, int [] ends){
        S107173=1;
    prevLightInt_thread_12 = -1;//sysj\ECS.sysj line: 2, column: 5
    zoneOcc_thread_12 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 4, column: 9
    zoneLightInt_thread_12 = (Integer)(zoneFourLightingI.getpreval() == null ? 0 : ((Integer)zoneFourLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 5, column: 9
    if(zoneOcc_thread_12 > 0 && zoneLightInt_thread_12 < 50 && (zoneLightInt_thread_12 != prevLightInt_thread_12)){//sysj\ECS.sysj line: 7, column: 13
      zoneFourWindowONOFF.setPresent();//sysj\ECS.sysj line: 8, column: 13
      currsigs.addElement(zoneFourWindowONOFF);
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

  public void thread107631(int [] tdone, int [] ends){
        S107168=1;
    prevLightInt_thread_11 = -1;//sysj\ECS.sysj line: 2, column: 5
    zoneOcc_thread_11 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 4, column: 9
    zoneLightInt_thread_11 = (Integer)(zoneThreeLightingI.getpreval() == null ? 0 : ((Integer)zoneThreeLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 5, column: 9
    if(zoneOcc_thread_11 > 0 && zoneLightInt_thread_11 < 50 && (zoneLightInt_thread_11 != prevLightInt_thread_11)){//sysj\ECS.sysj line: 7, column: 13
      zoneThreeWindowONOFF.setPresent();//sysj\ECS.sysj line: 8, column: 13
      currsigs.addElement(zoneThreeWindowONOFF);
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

  public void thread107630(int [] tdone, int [] ends){
        S107163=1;
    prevLightInt_thread_10 = -1;//sysj\ECS.sysj line: 2, column: 5
    zoneOcc_thread_10 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 4, column: 9
    zoneLightInt_thread_10 = (Integer)(zoneTwoLightingI.getpreval() == null ? 0 : ((Integer)zoneTwoLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 5, column: 9
    if(zoneOcc_thread_10 > 0 && zoneLightInt_thread_10 < 50 && (zoneLightInt_thread_10 != prevLightInt_thread_10)){//sysj\ECS.sysj line: 7, column: 13
      zoneTwoWindowONOFF.setPresent();//sysj\ECS.sysj line: 8, column: 13
      currsigs.addElement(zoneTwoWindowONOFF);
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

  public void thread107629(int [] tdone, int [] ends){
        S107158=1;
    prevLightInt_thread_9 = -1;//sysj\ECS.sysj line: 2, column: 5
    zoneOcc_thread_9 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 4, column: 9
    zoneLightInt_thread_9 = (Integer)(zoneOneLightingI.getpreval() == null ? 0 : ((Integer)zoneOneLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 5, column: 9
    if(zoneOcc_thread_9 > 0 && zoneLightInt_thread_9 < 50 && (zoneLightInt_thread_9 != prevLightInt_thread_9)){//sysj\ECS.sysj line: 7, column: 13
      zoneOneWindowONOFF.setPresent();//sysj\ECS.sysj line: 8, column: 13
      currsigs.addElement(zoneOneWindowONOFF);
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

  public void thread107628(int [] tdone, int [] ends){
        S107602=1;
    S107302=0;
    if(workhrs_6.getprestatus()){//sysj\ECS.sysj line: 332, column: 17
      S107189=0;
      thread107629(tdone,ends);
      thread107630(tdone,ends);
      thread107631(tdone,ends);
      thread107632(tdone,ends);
      thread107633(tdone,ends);
      thread107634(tdone,ends);
      thread107635(tdone,ends);
      int biggest107636 = 0;
      if(ends[9]>=biggest107636){
        biggest107636=ends[9];
      }
      if(ends[10]>=biggest107636){
        biggest107636=ends[10];
      }
      if(ends[11]>=biggest107636){
        biggest107636=ends[11];
      }
      if(ends[12]>=biggest107636){
        biggest107636=ends[12];
      }
      if(ends[13]>=biggest107636){
        biggest107636=ends[13];
      }
      if(ends[14]>=biggest107636){
        biggest107636=ends[14];
      }
      if(ends[15]>=biggest107636){
        biggest107636=ends[15];
      }
      if(biggest107636 == 1){
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
      if(biggest107636 == 1){
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
      if(biggest107636 == 1){
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
      if(biggest107636 == 1){
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
      if(biggest107636 == 1){
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
      if(biggest107636 == 1){
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
      if(biggest107636 == 1){
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
    }
    else {
      S107302=1;
      if(afterhrs_6.getprestatus()){//sysj\ECS.sysj line: 352, column: 17
        S107226=0;
        thread107637(tdone,ends);
        thread107638(tdone,ends);
        thread107639(tdone,ends);
        thread107640(tdone,ends);
        thread107641(tdone,ends);
        thread107642(tdone,ends);
        thread107643(tdone,ends);
        int biggest107644 = 0;
        if(ends[16]>=biggest107644){
          biggest107644=ends[16];
        }
        if(ends[17]>=biggest107644){
          biggest107644=ends[17];
        }
        if(ends[18]>=biggest107644){
          biggest107644=ends[18];
        }
        if(ends[19]>=biggest107644){
          biggest107644=ends[19];
        }
        if(ends[20]>=biggest107644){
          biggest107644=ends[20];
        }
        if(ends[21]>=biggest107644){
          biggest107644=ends[21];
        }
        if(ends[22]>=biggest107644){
          biggest107644=ends[22];
        }
        if(biggest107644 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        if(biggest107644 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        if(biggest107644 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        if(biggest107644 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        if(biggest107644 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        if(biggest107644 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        if(biggest107644 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
      }
      else {
        S107302=2;
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
    }
  }

  public void thread107627(int [] tdone, int [] ends){
        S107153=1;
    S107103=0;
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
      switch(S107604){
        case 0 : 
          S107604=0;
          break RUN;
        
        case 1 : 
          S107604=2;
          S107604=2;
          workhrs_6.setClear();//sysj\ECS.sysj line: 304, column: 4
          afterhrs_6.setClear();//sysj\ECS.sysj line: 304, column: 4
          thread107627(tdone,ends);
          thread107628(tdone,ends);
          int biggest107645 = 0;
          if(ends[7]>=biggest107645){
            biggest107645=ends[7];
          }
          if(ends[8]>=biggest107645){
            biggest107645=ends[8];
          }
          if(biggest107645 == 1){
            active[6]=1;
            ends[6]=1;
            break RUN;
          }
        
        case 2 : 
          workhrs_6.setClear();//sysj\ECS.sysj line: 304, column: 4
          afterhrs_6.setClear();//sysj\ECS.sysj line: 304, column: 4
          thread107646(tdone,ends);
          thread107647(tdone,ends);
          int biggest107688 = 0;
          if(ends[7]>=biggest107688){
            biggest107688=ends[7];
          }
          if(ends[8]>=biggest107688){
            biggest107688=ends[8];
          }
          if(biggest107688 == 1){
            active[6]=1;
            ends[6]=1;
            break RUN;
          }
          //FINXME code
          if(biggest107688 == 0){
            S107604=0;
            active[6]=0;
            ends[6]=0;
            S107604=0;
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
