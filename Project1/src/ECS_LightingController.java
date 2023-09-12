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
  private int S224791 = 1;
  private int S224340 = 1;
  private int S224290 = 1;
  private int S224294 = 1;
  private int S224789 = 1;
  private int S224489 = 1;
  private int S224376 = 1;
  private int S224345 = 1;
  private int S224350 = 1;
  private int S224355 = 1;
  private int S224360 = 1;
  private int S224365 = 1;
  private int S224370 = 1;
  private int S224375 = 1;
  private int S224413 = 1;
  private int S224382 = 1;
  private int S224387 = 1;
  private int S224392 = 1;
  private int S224397 = 1;
  private int S224402 = 1;
  private int S224407 = 1;
  private int S224412 = 1;
  
  private int[] ends = new int[24];
  private int[] tdone = new int[24];
  
  public void thread224873(int [] tdone, int [] ends){
        S224412=1;
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

  public void thread224872(int [] tdone, int [] ends){
        S224407=1;
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

  public void thread224871(int [] tdone, int [] ends){
        S224402=1;
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

  public void thread224870(int [] tdone, int [] ends){
        S224397=1;
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

  public void thread224869(int [] tdone, int [] ends){
        S224392=1;
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

  public void thread224868(int [] tdone, int [] ends){
        S224387=1;
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

  public void thread224867(int [] tdone, int [] ends){
        S224382=1;
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

  public void thread224865(int [] tdone, int [] ends){
        S224375=1;
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

  public void thread224864(int [] tdone, int [] ends){
        S224370=1;
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

  public void thread224863(int [] tdone, int [] ends){
        S224365=1;
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

  public void thread224862(int [] tdone, int [] ends){
        S224360=1;
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

  public void thread224861(int [] tdone, int [] ends){
        S224355=1;
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

  public void thread224860(int [] tdone, int [] ends){
        S224350=1;
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

  public void thread224859(int [] tdone, int [] ends){
        S224345=1;
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

  public void thread224857(int [] tdone, int [] ends){
        switch(S224412){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        S224412=0;
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
    }
  }

  public void thread224856(int [] tdone, int [] ends){
        switch(S224407){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        S224407=0;
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
    }
  }

  public void thread224855(int [] tdone, int [] ends){
        switch(S224402){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        S224402=0;
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
    }
  }

  public void thread224854(int [] tdone, int [] ends){
        switch(S224397){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        S224397=0;
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
    }
  }

  public void thread224853(int [] tdone, int [] ends){
        switch(S224392){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        S224392=0;
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
    }
  }

  public void thread224852(int [] tdone, int [] ends){
        switch(S224387){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        S224387=0;
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
    }
  }

  public void thread224851(int [] tdone, int [] ends){
        switch(S224382){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        S224382=0;
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
    }
  }

  public void thread224849(int [] tdone, int [] ends){
        S224412=1;
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

  public void thread224848(int [] tdone, int [] ends){
        S224407=1;
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

  public void thread224847(int [] tdone, int [] ends){
        S224402=1;
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

  public void thread224846(int [] tdone, int [] ends){
        S224397=1;
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

  public void thread224845(int [] tdone, int [] ends){
        S224392=1;
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

  public void thread224844(int [] tdone, int [] ends){
        S224387=1;
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

  public void thread224843(int [] tdone, int [] ends){
        S224382=1;
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

  public void thread224841(int [] tdone, int [] ends){
        switch(S224375){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        S224375=0;
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
    }
  }

  public void thread224840(int [] tdone, int [] ends){
        switch(S224370){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        S224370=0;
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
    }
  }

  public void thread224839(int [] tdone, int [] ends){
        switch(S224365){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        S224365=0;
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
    }
  }

  public void thread224838(int [] tdone, int [] ends){
        switch(S224360){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        S224360=0;
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
    }
  }

  public void thread224837(int [] tdone, int [] ends){
        switch(S224355){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        S224355=0;
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
    }
  }

  public void thread224836(int [] tdone, int [] ends){
        switch(S224350){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        S224350=0;
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
    }
  }

  public void thread224835(int [] tdone, int [] ends){
        switch(S224345){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        S224345=0;
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
    }
  }

  public void thread224834(int [] tdone, int [] ends){
        switch(S224789){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S224489){
          case 0 : 
            switch(S224376){
              case 0 : 
                thread224835(tdone,ends);
                thread224836(tdone,ends);
                thread224837(tdone,ends);
                thread224838(tdone,ends);
                thread224839(tdone,ends);
                thread224840(tdone,ends);
                thread224841(tdone,ends);
                int biggest224842 = 0;
                if(ends[9]>=biggest224842){
                  biggest224842=ends[9];
                }
                if(ends[10]>=biggest224842){
                  biggest224842=ends[10];
                }
                if(ends[11]>=biggest224842){
                  biggest224842=ends[11];
                }
                if(ends[12]>=biggest224842){
                  biggest224842=ends[12];
                }
                if(ends[13]>=biggest224842){
                  biggest224842=ends[13];
                }
                if(ends[14]>=biggest224842){
                  biggest224842=ends[14];
                }
                if(ends[15]>=biggest224842){
                  biggest224842=ends[15];
                }
                //FINXME code
                if(biggest224842 == 0){
                  S224376=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                break;
              
              case 1 : 
                S224376=1;
                S224489=1;
                if(afterhrs_6.getprestatus()){//sysj\ECS.sysj line: 352, column: 17
                  S224413=0;
                  thread224843(tdone,ends);
                  thread224844(tdone,ends);
                  thread224845(tdone,ends);
                  thread224846(tdone,ends);
                  thread224847(tdone,ends);
                  thread224848(tdone,ends);
                  thread224849(tdone,ends);
                  int biggest224850 = 0;
                  if(ends[16]>=biggest224850){
                    biggest224850=ends[16];
                  }
                  if(ends[17]>=biggest224850){
                    biggest224850=ends[17];
                  }
                  if(ends[18]>=biggest224850){
                    biggest224850=ends[18];
                  }
                  if(ends[19]>=biggest224850){
                    biggest224850=ends[19];
                  }
                  if(ends[20]>=biggest224850){
                    biggest224850=ends[20];
                  }
                  if(ends[21]>=biggest224850){
                    biggest224850=ends[21];
                  }
                  if(ends[22]>=biggest224850){
                    biggest224850=ends[22];
                  }
                  if(biggest224850 == 1){
                    active[8]=1;
                    ends[8]=1;
                    tdone[8]=1;
                  }
                  if(biggest224850 == 1){
                    active[8]=1;
                    ends[8]=1;
                    tdone[8]=1;
                  }
                  if(biggest224850 == 1){
                    active[8]=1;
                    ends[8]=1;
                    tdone[8]=1;
                  }
                  if(biggest224850 == 1){
                    active[8]=1;
                    ends[8]=1;
                    tdone[8]=1;
                  }
                  if(biggest224850 == 1){
                    active[8]=1;
                    ends[8]=1;
                    tdone[8]=1;
                  }
                  if(biggest224850 == 1){
                    active[8]=1;
                    ends[8]=1;
                    tdone[8]=1;
                  }
                  if(biggest224850 == 1){
                    active[8]=1;
                    ends[8]=1;
                    tdone[8]=1;
                  }
                }
                else {
                  S224489=2;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            switch(S224413){
              case 0 : 
                thread224851(tdone,ends);
                thread224852(tdone,ends);
                thread224853(tdone,ends);
                thread224854(tdone,ends);
                thread224855(tdone,ends);
                thread224856(tdone,ends);
                thread224857(tdone,ends);
                int biggest224858 = 0;
                if(ends[16]>=biggest224858){
                  biggest224858=ends[16];
                }
                if(ends[17]>=biggest224858){
                  biggest224858=ends[17];
                }
                if(ends[18]>=biggest224858){
                  biggest224858=ends[18];
                }
                if(ends[19]>=biggest224858){
                  biggest224858=ends[19];
                }
                if(ends[20]>=biggest224858){
                  biggest224858=ends[20];
                }
                if(ends[21]>=biggest224858){
                  biggest224858=ends[21];
                }
                if(ends[22]>=biggest224858){
                  biggest224858=ends[22];
                }
                //FINXME code
                if(biggest224858 == 0){
                  S224413=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                break;
              
              case 1 : 
                S224413=1;
                S224489=2;
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
                break;
              
            }
            break;
          
          case 2 : 
            S224489=2;
            S224489=0;
            if(workhrs_6.getprestatus()){//sysj\ECS.sysj line: 332, column: 17
              S224376=0;
              thread224859(tdone,ends);
              thread224860(tdone,ends);
              thread224861(tdone,ends);
              thread224862(tdone,ends);
              thread224863(tdone,ends);
              thread224864(tdone,ends);
              thread224865(tdone,ends);
              int biggest224866 = 0;
              if(ends[9]>=biggest224866){
                biggest224866=ends[9];
              }
              if(ends[10]>=biggest224866){
                biggest224866=ends[10];
              }
              if(ends[11]>=biggest224866){
                biggest224866=ends[11];
              }
              if(ends[12]>=biggest224866){
                biggest224866=ends[12];
              }
              if(ends[13]>=biggest224866){
                biggest224866=ends[13];
              }
              if(ends[14]>=biggest224866){
                biggest224866=ends[14];
              }
              if(ends[15]>=biggest224866){
                biggest224866=ends[15];
              }
              if(biggest224866 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              if(biggest224866 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              if(biggest224866 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              if(biggest224866 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              if(biggest224866 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              if(biggest224866 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              if(biggest224866 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
            }
            else {
              S224489=1;
              if(afterhrs_6.getprestatus()){//sysj\ECS.sysj line: 352, column: 17
                S224413=0;
                thread224867(tdone,ends);
                thread224868(tdone,ends);
                thread224869(tdone,ends);
                thread224870(tdone,ends);
                thread224871(tdone,ends);
                thread224872(tdone,ends);
                thread224873(tdone,ends);
                int biggest224874 = 0;
                if(ends[16]>=biggest224874){
                  biggest224874=ends[16];
                }
                if(ends[17]>=biggest224874){
                  biggest224874=ends[17];
                }
                if(ends[18]>=biggest224874){
                  biggest224874=ends[18];
                }
                if(ends[19]>=biggest224874){
                  biggest224874=ends[19];
                }
                if(ends[20]>=biggest224874){
                  biggest224874=ends[20];
                }
                if(ends[21]>=biggest224874){
                  biggest224874=ends[21];
                }
                if(ends[22]>=biggest224874){
                  biggest224874=ends[22];
                }
                if(biggest224874 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                if(biggest224874 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                if(biggest224874 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                if(biggest224874 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                if(biggest224874 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                if(biggest224874 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                if(biggest224874 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
              }
              else {
                S224489=2;
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

  public void thread224833(int [] tdone, int [] ends){
        switch(S224340){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S224290){
          case 0 : 
            if(currentTime_2.getprestatus()){//sysj\ECS.sysj line: 308, column: 14
              currentHour_thread_7 = (Integer)(currentTime_2.getpreval() == null ? 0 : ((Integer)currentTime_2.getpreval()).intValue());//sysj\ECS.sysj line: 309, column: 8
              S224290=1;
              if(currentHour_thread_7 >= 9 && currentHour_thread_7 <= 17){//sysj\ECS.sysj line: 311, column: 16
                S224294=0;
                workhrs_6.setPresent();//sysj\ECS.sysj line: 312, column: 16
                currsigs.addElement(workhrs_6);
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
              else {
                S224294=1;
                if((currentHour_thread_7 >= 18 && currentHour_thread_7 <= 24) || (currentHour_thread_7 >= 0 && currentHour_thread_7 < 9)){//sysj\ECS.sysj line: 316, column: 23
                  afterhrs_6.setPresent();//sysj\ECS.sysj line: 317, column: 16
                  currsigs.addElement(afterhrs_6);
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  S224290=0;
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
            switch(S224294){
              case 0 : 
                S224290=0;
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
                break;
              
              case 1 : 
                S224290=0;
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

  public void thread224830(int [] tdone, int [] ends){
        S224412=1;
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

  public void thread224829(int [] tdone, int [] ends){
        S224407=1;
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

  public void thread224828(int [] tdone, int [] ends){
        S224402=1;
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

  public void thread224827(int [] tdone, int [] ends){
        S224397=1;
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

  public void thread224826(int [] tdone, int [] ends){
        S224392=1;
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

  public void thread224825(int [] tdone, int [] ends){
        S224387=1;
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

  public void thread224824(int [] tdone, int [] ends){
        S224382=1;
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

  public void thread224822(int [] tdone, int [] ends){
        S224375=1;
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

  public void thread224821(int [] tdone, int [] ends){
        S224370=1;
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

  public void thread224820(int [] tdone, int [] ends){
        S224365=1;
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

  public void thread224819(int [] tdone, int [] ends){
        S224360=1;
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

  public void thread224818(int [] tdone, int [] ends){
        S224355=1;
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

  public void thread224817(int [] tdone, int [] ends){
        S224350=1;
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

  public void thread224816(int [] tdone, int [] ends){
        S224345=1;
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

  public void thread224815(int [] tdone, int [] ends){
        S224789=1;
    S224489=0;
    if(workhrs_6.getprestatus()){//sysj\ECS.sysj line: 332, column: 17
      S224376=0;
      thread224816(tdone,ends);
      thread224817(tdone,ends);
      thread224818(tdone,ends);
      thread224819(tdone,ends);
      thread224820(tdone,ends);
      thread224821(tdone,ends);
      thread224822(tdone,ends);
      int biggest224823 = 0;
      if(ends[9]>=biggest224823){
        biggest224823=ends[9];
      }
      if(ends[10]>=biggest224823){
        biggest224823=ends[10];
      }
      if(ends[11]>=biggest224823){
        biggest224823=ends[11];
      }
      if(ends[12]>=biggest224823){
        biggest224823=ends[12];
      }
      if(ends[13]>=biggest224823){
        biggest224823=ends[13];
      }
      if(ends[14]>=biggest224823){
        biggest224823=ends[14];
      }
      if(ends[15]>=biggest224823){
        biggest224823=ends[15];
      }
      if(biggest224823 == 1){
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
      if(biggest224823 == 1){
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
      if(biggest224823 == 1){
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
      if(biggest224823 == 1){
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
      if(biggest224823 == 1){
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
      if(biggest224823 == 1){
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
      if(biggest224823 == 1){
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
    }
    else {
      S224489=1;
      if(afterhrs_6.getprestatus()){//sysj\ECS.sysj line: 352, column: 17
        S224413=0;
        thread224824(tdone,ends);
        thread224825(tdone,ends);
        thread224826(tdone,ends);
        thread224827(tdone,ends);
        thread224828(tdone,ends);
        thread224829(tdone,ends);
        thread224830(tdone,ends);
        int biggest224831 = 0;
        if(ends[16]>=biggest224831){
          biggest224831=ends[16];
        }
        if(ends[17]>=biggest224831){
          biggest224831=ends[17];
        }
        if(ends[18]>=biggest224831){
          biggest224831=ends[18];
        }
        if(ends[19]>=biggest224831){
          biggest224831=ends[19];
        }
        if(ends[20]>=biggest224831){
          biggest224831=ends[20];
        }
        if(ends[21]>=biggest224831){
          biggest224831=ends[21];
        }
        if(ends[22]>=biggest224831){
          biggest224831=ends[22];
        }
        if(biggest224831 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        if(biggest224831 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        if(biggest224831 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        if(biggest224831 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        if(biggest224831 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        if(biggest224831 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        if(biggest224831 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
      }
      else {
        S224489=2;
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
    }
  }

  public void thread224814(int [] tdone, int [] ends){
        S224340=1;
    S224290=0;
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
      switch(S224791){
        case 0 : 
          S224791=0;
          break RUN;
        
        case 1 : 
          S224791=2;
          S224791=2;
          workhrs_6.setClear();//sysj\ECS.sysj line: 304, column: 4
          afterhrs_6.setClear();//sysj\ECS.sysj line: 304, column: 4
          thread224814(tdone,ends);
          thread224815(tdone,ends);
          int biggest224832 = 0;
          if(ends[7]>=biggest224832){
            biggest224832=ends[7];
          }
          if(ends[8]>=biggest224832){
            biggest224832=ends[8];
          }
          if(biggest224832 == 1){
            active[6]=1;
            ends[6]=1;
            break RUN;
          }
        
        case 2 : 
          workhrs_6.setClear();//sysj\ECS.sysj line: 304, column: 4
          afterhrs_6.setClear();//sysj\ECS.sysj line: 304, column: 4
          thread224833(tdone,ends);
          thread224834(tdone,ends);
          int biggest224875 = 0;
          if(ends[7]>=biggest224875){
            biggest224875=ends[7];
          }
          if(ends[8]>=biggest224875){
            biggest224875=ends[8];
          }
          if(biggest224875 == 1){
            active[6]=1;
            ends[6]=1;
            break RUN;
          }
          //FINXME code
          if(biggest224875 == 0){
            S224791=0;
            active[6]=0;
            ends[6]=0;
            S224791=0;
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
