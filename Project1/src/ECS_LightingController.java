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
  private int S113253 = 1;
  private int S112802 = 1;
  private int S112752 = 1;
  private int S112756 = 1;
  private int S113251 = 1;
  private int S112951 = 1;
  private int S112838 = 1;
  private int S112807 = 1;
  private int S112812 = 1;
  private int S112817 = 1;
  private int S112822 = 1;
  private int S112827 = 1;
  private int S112832 = 1;
  private int S112837 = 1;
  private int S112875 = 1;
  private int S112844 = 1;
  private int S112849 = 1;
  private int S112854 = 1;
  private int S112859 = 1;
  private int S112864 = 1;
  private int S112869 = 1;
  private int S112874 = 1;
  
  private int[] ends = new int[24];
  private int[] tdone = new int[24];
  
  public void thread113335(int [] tdone, int [] ends){
        S112874=1;
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

  public void thread113334(int [] tdone, int [] ends){
        S112869=1;
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

  public void thread113333(int [] tdone, int [] ends){
        S112864=1;
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

  public void thread113332(int [] tdone, int [] ends){
        S112859=1;
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

  public void thread113331(int [] tdone, int [] ends){
        S112854=1;
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

  public void thread113330(int [] tdone, int [] ends){
        S112849=1;
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

  public void thread113329(int [] tdone, int [] ends){
        S112844=1;
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

  public void thread113327(int [] tdone, int [] ends){
        S112837=1;
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

  public void thread113326(int [] tdone, int [] ends){
        S112832=1;
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

  public void thread113325(int [] tdone, int [] ends){
        S112827=1;
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

  public void thread113324(int [] tdone, int [] ends){
        S112822=1;
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

  public void thread113323(int [] tdone, int [] ends){
        S112817=1;
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

  public void thread113322(int [] tdone, int [] ends){
        S112812=1;
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

  public void thread113321(int [] tdone, int [] ends){
        S112807=1;
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

  public void thread113319(int [] tdone, int [] ends){
        switch(S112874){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        S112874=0;
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
    }
  }

  public void thread113318(int [] tdone, int [] ends){
        switch(S112869){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        S112869=0;
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
    }
  }

  public void thread113317(int [] tdone, int [] ends){
        switch(S112864){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        S112864=0;
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
    }
  }

  public void thread113316(int [] tdone, int [] ends){
        switch(S112859){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        S112859=0;
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
    }
  }

  public void thread113315(int [] tdone, int [] ends){
        switch(S112854){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        S112854=0;
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
    }
  }

  public void thread113314(int [] tdone, int [] ends){
        switch(S112849){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        S112849=0;
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
    }
  }

  public void thread113313(int [] tdone, int [] ends){
        switch(S112844){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        S112844=0;
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
    }
  }

  public void thread113311(int [] tdone, int [] ends){
        S112874=1;
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

  public void thread113310(int [] tdone, int [] ends){
        S112869=1;
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

  public void thread113309(int [] tdone, int [] ends){
        S112864=1;
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

  public void thread113308(int [] tdone, int [] ends){
        S112859=1;
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

  public void thread113307(int [] tdone, int [] ends){
        S112854=1;
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

  public void thread113306(int [] tdone, int [] ends){
        S112849=1;
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

  public void thread113305(int [] tdone, int [] ends){
        S112844=1;
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

  public void thread113303(int [] tdone, int [] ends){
        switch(S112837){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        S112837=0;
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
    }
  }

  public void thread113302(int [] tdone, int [] ends){
        switch(S112832){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        S112832=0;
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
    }
  }

  public void thread113301(int [] tdone, int [] ends){
        switch(S112827){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        S112827=0;
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
    }
  }

  public void thread113300(int [] tdone, int [] ends){
        switch(S112822){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        S112822=0;
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
    }
  }

  public void thread113299(int [] tdone, int [] ends){
        switch(S112817){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        S112817=0;
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
    }
  }

  public void thread113298(int [] tdone, int [] ends){
        switch(S112812){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        S112812=0;
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
    }
  }

  public void thread113297(int [] tdone, int [] ends){
        switch(S112807){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        S112807=0;
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
    }
  }

  public void thread113296(int [] tdone, int [] ends){
        switch(S113251){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S112951){
          case 0 : 
            switch(S112838){
              case 0 : 
                thread113297(tdone,ends);
                thread113298(tdone,ends);
                thread113299(tdone,ends);
                thread113300(tdone,ends);
                thread113301(tdone,ends);
                thread113302(tdone,ends);
                thread113303(tdone,ends);
                int biggest113304 = 0;
                if(ends[9]>=biggest113304){
                  biggest113304=ends[9];
                }
                if(ends[10]>=biggest113304){
                  biggest113304=ends[10];
                }
                if(ends[11]>=biggest113304){
                  biggest113304=ends[11];
                }
                if(ends[12]>=biggest113304){
                  biggest113304=ends[12];
                }
                if(ends[13]>=biggest113304){
                  biggest113304=ends[13];
                }
                if(ends[14]>=biggest113304){
                  biggest113304=ends[14];
                }
                if(ends[15]>=biggest113304){
                  biggest113304=ends[15];
                }
                //FINXME code
                if(biggest113304 == 0){
                  S112838=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                break;
              
              case 1 : 
                S112838=1;
                S112951=1;
                if(afterhrs_6.getprestatus()){//sysj\ECS.sysj line: 352, column: 17
                  S112875=0;
                  thread113305(tdone,ends);
                  thread113306(tdone,ends);
                  thread113307(tdone,ends);
                  thread113308(tdone,ends);
                  thread113309(tdone,ends);
                  thread113310(tdone,ends);
                  thread113311(tdone,ends);
                  int biggest113312 = 0;
                  if(ends[16]>=biggest113312){
                    biggest113312=ends[16];
                  }
                  if(ends[17]>=biggest113312){
                    biggest113312=ends[17];
                  }
                  if(ends[18]>=biggest113312){
                    biggest113312=ends[18];
                  }
                  if(ends[19]>=biggest113312){
                    biggest113312=ends[19];
                  }
                  if(ends[20]>=biggest113312){
                    biggest113312=ends[20];
                  }
                  if(ends[21]>=biggest113312){
                    biggest113312=ends[21];
                  }
                  if(ends[22]>=biggest113312){
                    biggest113312=ends[22];
                  }
                  if(biggest113312 == 1){
                    active[8]=1;
                    ends[8]=1;
                    tdone[8]=1;
                  }
                  if(biggest113312 == 1){
                    active[8]=1;
                    ends[8]=1;
                    tdone[8]=1;
                  }
                  if(biggest113312 == 1){
                    active[8]=1;
                    ends[8]=1;
                    tdone[8]=1;
                  }
                  if(biggest113312 == 1){
                    active[8]=1;
                    ends[8]=1;
                    tdone[8]=1;
                  }
                  if(biggest113312 == 1){
                    active[8]=1;
                    ends[8]=1;
                    tdone[8]=1;
                  }
                  if(biggest113312 == 1){
                    active[8]=1;
                    ends[8]=1;
                    tdone[8]=1;
                  }
                  if(biggest113312 == 1){
                    active[8]=1;
                    ends[8]=1;
                    tdone[8]=1;
                  }
                }
                else {
                  S112951=2;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            switch(S112875){
              case 0 : 
                thread113313(tdone,ends);
                thread113314(tdone,ends);
                thread113315(tdone,ends);
                thread113316(tdone,ends);
                thread113317(tdone,ends);
                thread113318(tdone,ends);
                thread113319(tdone,ends);
                int biggest113320 = 0;
                if(ends[16]>=biggest113320){
                  biggest113320=ends[16];
                }
                if(ends[17]>=biggest113320){
                  biggest113320=ends[17];
                }
                if(ends[18]>=biggest113320){
                  biggest113320=ends[18];
                }
                if(ends[19]>=biggest113320){
                  biggest113320=ends[19];
                }
                if(ends[20]>=biggest113320){
                  biggest113320=ends[20];
                }
                if(ends[21]>=biggest113320){
                  biggest113320=ends[21];
                }
                if(ends[22]>=biggest113320){
                  biggest113320=ends[22];
                }
                //FINXME code
                if(biggest113320 == 0){
                  S112875=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                break;
              
              case 1 : 
                S112875=1;
                S112951=2;
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
                break;
              
            }
            break;
          
          case 2 : 
            S112951=2;
            S112951=0;
            if(workhrs_6.getprestatus()){//sysj\ECS.sysj line: 332, column: 17
              S112838=0;
              thread113321(tdone,ends);
              thread113322(tdone,ends);
              thread113323(tdone,ends);
              thread113324(tdone,ends);
              thread113325(tdone,ends);
              thread113326(tdone,ends);
              thread113327(tdone,ends);
              int biggest113328 = 0;
              if(ends[9]>=biggest113328){
                biggest113328=ends[9];
              }
              if(ends[10]>=biggest113328){
                biggest113328=ends[10];
              }
              if(ends[11]>=biggest113328){
                biggest113328=ends[11];
              }
              if(ends[12]>=biggest113328){
                biggest113328=ends[12];
              }
              if(ends[13]>=biggest113328){
                biggest113328=ends[13];
              }
              if(ends[14]>=biggest113328){
                biggest113328=ends[14];
              }
              if(ends[15]>=biggest113328){
                biggest113328=ends[15];
              }
              if(biggest113328 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              if(biggest113328 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              if(biggest113328 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              if(biggest113328 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              if(biggest113328 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              if(biggest113328 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              if(biggest113328 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
            }
            else {
              S112951=1;
              if(afterhrs_6.getprestatus()){//sysj\ECS.sysj line: 352, column: 17
                S112875=0;
                thread113329(tdone,ends);
                thread113330(tdone,ends);
                thread113331(tdone,ends);
                thread113332(tdone,ends);
                thread113333(tdone,ends);
                thread113334(tdone,ends);
                thread113335(tdone,ends);
                int biggest113336 = 0;
                if(ends[16]>=biggest113336){
                  biggest113336=ends[16];
                }
                if(ends[17]>=biggest113336){
                  biggest113336=ends[17];
                }
                if(ends[18]>=biggest113336){
                  biggest113336=ends[18];
                }
                if(ends[19]>=biggest113336){
                  biggest113336=ends[19];
                }
                if(ends[20]>=biggest113336){
                  biggest113336=ends[20];
                }
                if(ends[21]>=biggest113336){
                  biggest113336=ends[21];
                }
                if(ends[22]>=biggest113336){
                  biggest113336=ends[22];
                }
                if(biggest113336 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                if(biggest113336 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                if(biggest113336 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                if(biggest113336 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                if(biggest113336 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                if(biggest113336 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                if(biggest113336 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
              }
              else {
                S112951=2;
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

  public void thread113295(int [] tdone, int [] ends){
        switch(S112802){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S112752){
          case 0 : 
            if(currentTime_2.getprestatus()){//sysj\ECS.sysj line: 308, column: 14
              currentHour_thread_7 = (Integer)(currentTime_2.getpreval() == null ? 0 : ((Integer)currentTime_2.getpreval()).intValue());//sysj\ECS.sysj line: 309, column: 8
              S112752=1;
              if(currentHour_thread_7 >= 9 && currentHour_thread_7 <= 17){//sysj\ECS.sysj line: 311, column: 16
                S112756=0;
                workhrs_6.setPresent();//sysj\ECS.sysj line: 312, column: 16
                currsigs.addElement(workhrs_6);
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
              else {
                S112756=1;
                if((currentHour_thread_7 >= 18 && currentHour_thread_7 <= 24) || (currentHour_thread_7 >= 0 && currentHour_thread_7 < 9)){//sysj\ECS.sysj line: 316, column: 23
                  afterhrs_6.setPresent();//sysj\ECS.sysj line: 317, column: 16
                  currsigs.addElement(afterhrs_6);
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  S112752=0;
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
            switch(S112756){
              case 0 : 
                S112752=0;
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
                break;
              
              case 1 : 
                S112752=0;
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

  public void thread113292(int [] tdone, int [] ends){
        S112874=1;
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

  public void thread113291(int [] tdone, int [] ends){
        S112869=1;
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

  public void thread113290(int [] tdone, int [] ends){
        S112864=1;
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

  public void thread113289(int [] tdone, int [] ends){
        S112859=1;
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

  public void thread113288(int [] tdone, int [] ends){
        S112854=1;
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

  public void thread113287(int [] tdone, int [] ends){
        S112849=1;
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

  public void thread113286(int [] tdone, int [] ends){
        S112844=1;
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

  public void thread113284(int [] tdone, int [] ends){
        S112837=1;
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

  public void thread113283(int [] tdone, int [] ends){
        S112832=1;
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

  public void thread113282(int [] tdone, int [] ends){
        S112827=1;
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

  public void thread113281(int [] tdone, int [] ends){
        S112822=1;
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

  public void thread113280(int [] tdone, int [] ends){
        S112817=1;
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

  public void thread113279(int [] tdone, int [] ends){
        S112812=1;
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

  public void thread113278(int [] tdone, int [] ends){
        S112807=1;
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

  public void thread113277(int [] tdone, int [] ends){
        S113251=1;
    S112951=0;
    if(workhrs_6.getprestatus()){//sysj\ECS.sysj line: 332, column: 17
      S112838=0;
      thread113278(tdone,ends);
      thread113279(tdone,ends);
      thread113280(tdone,ends);
      thread113281(tdone,ends);
      thread113282(tdone,ends);
      thread113283(tdone,ends);
      thread113284(tdone,ends);
      int biggest113285 = 0;
      if(ends[9]>=biggest113285){
        biggest113285=ends[9];
      }
      if(ends[10]>=biggest113285){
        biggest113285=ends[10];
      }
      if(ends[11]>=biggest113285){
        biggest113285=ends[11];
      }
      if(ends[12]>=biggest113285){
        biggest113285=ends[12];
      }
      if(ends[13]>=biggest113285){
        biggest113285=ends[13];
      }
      if(ends[14]>=biggest113285){
        biggest113285=ends[14];
      }
      if(ends[15]>=biggest113285){
        biggest113285=ends[15];
      }
      if(biggest113285 == 1){
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
      if(biggest113285 == 1){
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
      if(biggest113285 == 1){
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
      if(biggest113285 == 1){
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
      if(biggest113285 == 1){
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
      if(biggest113285 == 1){
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
      if(biggest113285 == 1){
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
    }
    else {
      S112951=1;
      if(afterhrs_6.getprestatus()){//sysj\ECS.sysj line: 352, column: 17
        S112875=0;
        thread113286(tdone,ends);
        thread113287(tdone,ends);
        thread113288(tdone,ends);
        thread113289(tdone,ends);
        thread113290(tdone,ends);
        thread113291(tdone,ends);
        thread113292(tdone,ends);
        int biggest113293 = 0;
        if(ends[16]>=biggest113293){
          biggest113293=ends[16];
        }
        if(ends[17]>=biggest113293){
          biggest113293=ends[17];
        }
        if(ends[18]>=biggest113293){
          biggest113293=ends[18];
        }
        if(ends[19]>=biggest113293){
          biggest113293=ends[19];
        }
        if(ends[20]>=biggest113293){
          biggest113293=ends[20];
        }
        if(ends[21]>=biggest113293){
          biggest113293=ends[21];
        }
        if(ends[22]>=biggest113293){
          biggest113293=ends[22];
        }
        if(biggest113293 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        if(biggest113293 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        if(biggest113293 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        if(biggest113293 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        if(biggest113293 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        if(biggest113293 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        if(biggest113293 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
      }
      else {
        S112951=2;
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
    }
  }

  public void thread113276(int [] tdone, int [] ends){
        S112802=1;
    S112752=0;
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
      switch(S113253){
        case 0 : 
          S113253=0;
          break RUN;
        
        case 1 : 
          S113253=2;
          S113253=2;
          workhrs_6.setClear();//sysj\ECS.sysj line: 304, column: 4
          afterhrs_6.setClear();//sysj\ECS.sysj line: 304, column: 4
          thread113276(tdone,ends);
          thread113277(tdone,ends);
          int biggest113294 = 0;
          if(ends[7]>=biggest113294){
            biggest113294=ends[7];
          }
          if(ends[8]>=biggest113294){
            biggest113294=ends[8];
          }
          if(biggest113294 == 1){
            active[6]=1;
            ends[6]=1;
            break RUN;
          }
        
        case 2 : 
          workhrs_6.setClear();//sysj\ECS.sysj line: 304, column: 4
          afterhrs_6.setClear();//sysj\ECS.sysj line: 304, column: 4
          thread113295(tdone,ends);
          thread113296(tdone,ends);
          int biggest113337 = 0;
          if(ends[7]>=biggest113337){
            biggest113337=ends[7];
          }
          if(ends[8]>=biggest113337){
            biggest113337=ends[8];
          }
          if(biggest113337 == 1){
            active[6]=1;
            ends[6]=1;
            break RUN;
          }
          //FINXME code
          if(biggest113337 == 0){
            S113253=0;
            active[6]=0;
            ends[6]=0;
            S113253=0;
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
