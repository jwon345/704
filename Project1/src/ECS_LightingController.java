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
  private int currentHour_thread_7;//sysj\ECS.sysj line: 319, column: 8
  private int zoneOcc_thread_9;//sysj\ECS.sysj line: 3, column: 9
  private int zoneLightInt_thread_9;//sysj\ECS.sysj line: 4, column: 9
  private int zoneOcc_thread_10;//sysj\ECS.sysj line: 3, column: 9
  private int zoneLightInt_thread_10;//sysj\ECS.sysj line: 4, column: 9
  private int zoneOcc_thread_11;//sysj\ECS.sysj line: 3, column: 9
  private int zoneLightInt_thread_11;//sysj\ECS.sysj line: 4, column: 9
  private int zoneOcc_thread_12;//sysj\ECS.sysj line: 3, column: 9
  private int zoneLightInt_thread_12;//sysj\ECS.sysj line: 4, column: 9
  private int zoneOcc_thread_13;//sysj\ECS.sysj line: 3, column: 9
  private int zoneLightInt_thread_13;//sysj\ECS.sysj line: 4, column: 9
  private int zoneOcc_thread_14;//sysj\ECS.sysj line: 3, column: 9
  private int zoneLightInt_thread_14;//sysj\ECS.sysj line: 4, column: 9
  private int zoneOcc_thread_15;//sysj\ECS.sysj line: 3, column: 9
  private int zoneLightInt_thread_15;//sysj\ECS.sysj line: 4, column: 9
  private int zoneOcc_thread_16;//sysj\ECS.sysj line: 20, column: 4
  private int zoneLightInt_thread_16;//sysj\ECS.sysj line: 21, column: 7
  private int zoneOcc_thread_17;//sysj\ECS.sysj line: 20, column: 4
  private int zoneLightInt_thread_17;//sysj\ECS.sysj line: 21, column: 7
  private int zoneOcc_thread_18;//sysj\ECS.sysj line: 20, column: 4
  private int zoneLightInt_thread_18;//sysj\ECS.sysj line: 21, column: 7
  private int zoneOcc_thread_19;//sysj\ECS.sysj line: 20, column: 4
  private int zoneLightInt_thread_19;//sysj\ECS.sysj line: 21, column: 7
  private int zoneOcc_thread_20;//sysj\ECS.sysj line: 20, column: 4
  private int zoneLightInt_thread_20;//sysj\ECS.sysj line: 21, column: 7
  private int zoneOcc_thread_21;//sysj\ECS.sysj line: 20, column: 4
  private int zoneLightInt_thread_21;//sysj\ECS.sysj line: 21, column: 7
  private int zoneOcc_thread_22;//sysj\ECS.sysj line: 20, column: 4
  private int zoneLightInt_thread_22;//sysj\ECS.sysj line: 21, column: 7
  private int S224951 = 1;
  private int S224500 = 1;
  private int S224450 = 1;
  private int S224454 = 1;
  private int S224949 = 1;
  private int S224649 = 1;
  private int S224536 = 1;
  private int S224505 = 1;
  private int S224510 = 1;
  private int S224515 = 1;
  private int S224520 = 1;
  private int S224525 = 1;
  private int S224530 = 1;
  private int S224535 = 1;
  private int S224573 = 1;
  private int S224542 = 1;
  private int S224547 = 1;
  private int S224552 = 1;
  private int S224557 = 1;
  private int S224562 = 1;
  private int S224567 = 1;
  private int S224572 = 1;
  
  private int[] ends = new int[24];
  private int[] tdone = new int[24];
  
  public void thread225033(int [] tdone, int [] ends){
        S224572=1;
    zoneOcc_thread_22 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 20, column: 4
    zoneLightInt_thread_22 = (Integer)(zoneSevenLightingI.getpreval() == null ? 0 : ((Integer)zoneSevenLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 21, column: 7
    if(zoneOcc_thread_22 > 0 && zoneLightInt_thread_22 < 50){//sysj\ECS.sysj line: 22, column: 11
      zoneSevenLightONOFF.setPresent();//sysj\ECS.sysj line: 23, column: 14
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

  public void thread225032(int [] tdone, int [] ends){
        S224567=1;
    zoneOcc_thread_21 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 20, column: 4
    zoneLightInt_thread_21 = (Integer)(zoneSixLightingI.getpreval() == null ? 0 : ((Integer)zoneSixLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 21, column: 7
    if(zoneOcc_thread_21 > 0 && zoneLightInt_thread_21 < 50){//sysj\ECS.sysj line: 22, column: 11
      zoneSixLightONOFF.setPresent();//sysj\ECS.sysj line: 23, column: 14
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

  public void thread225031(int [] tdone, int [] ends){
        S224562=1;
    zoneOcc_thread_20 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 20, column: 4
    zoneLightInt_thread_20 = (Integer)(zoneFiveLightingI.getpreval() == null ? 0 : ((Integer)zoneFiveLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 21, column: 7
    if(zoneOcc_thread_20 > 0 && zoneLightInt_thread_20 < 50){//sysj\ECS.sysj line: 22, column: 11
      zoneFiveLightONOFF.setPresent();//sysj\ECS.sysj line: 23, column: 14
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

  public void thread225030(int [] tdone, int [] ends){
        S224557=1;
    zoneOcc_thread_19 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 20, column: 4
    zoneLightInt_thread_19 = (Integer)(zoneFourLightingI.getpreval() == null ? 0 : ((Integer)zoneFourLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 21, column: 7
    if(zoneOcc_thread_19 > 0 && zoneLightInt_thread_19 < 50){//sysj\ECS.sysj line: 22, column: 11
      zoneFourLightONOFF.setPresent();//sysj\ECS.sysj line: 23, column: 14
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

  public void thread225029(int [] tdone, int [] ends){
        S224552=1;
    zoneOcc_thread_18 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 20, column: 4
    zoneLightInt_thread_18 = (Integer)(zoneThreeLightingI.getpreval() == null ? 0 : ((Integer)zoneThreeLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 21, column: 7
    if(zoneOcc_thread_18 > 0 && zoneLightInt_thread_18 < 50){//sysj\ECS.sysj line: 22, column: 11
      zoneThreeLightONOFF.setPresent();//sysj\ECS.sysj line: 23, column: 14
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

  public void thread225028(int [] tdone, int [] ends){
        S224547=1;
    zoneOcc_thread_17 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 20, column: 4
    zoneLightInt_thread_17 = (Integer)(zoneTwoLightingI.getpreval() == null ? 0 : ((Integer)zoneTwoLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 21, column: 7
    if(zoneOcc_thread_17 > 0 && zoneLightInt_thread_17 < 50){//sysj\ECS.sysj line: 22, column: 11
      zoneTwoLightONOFF.setPresent();//sysj\ECS.sysj line: 23, column: 14
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

  public void thread225027(int [] tdone, int [] ends){
        S224542=1;
    zoneOcc_thread_16 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 20, column: 4
    zoneLightInt_thread_16 = (Integer)(zoneOneLightingI.getpreval() == null ? 0 : ((Integer)zoneOneLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 21, column: 7
    if(zoneOcc_thread_16 > 0 && zoneLightInt_thread_16 < 50){//sysj\ECS.sysj line: 22, column: 11
      zoneOneLightONOFF.setPresent();//sysj\ECS.sysj line: 23, column: 14
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

  public void thread225025(int [] tdone, int [] ends){
        S224535=1;
    zoneOcc_thread_15 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 3, column: 9
    zoneLightInt_thread_15 = (Integer)(zoneSevenLightingI.getpreval() == null ? 0 : ((Integer)zoneSevenLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 4, column: 9
    if(zoneOcc_thread_15 > 0 && zoneLightInt_thread_15 < 50){//sysj\ECS.sysj line: 6, column: 13
      zoneSevenWindowONOFF.setPresent();//sysj\ECS.sysj line: 7, column: 13
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

  public void thread225024(int [] tdone, int [] ends){
        S224530=1;
    zoneOcc_thread_14 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 3, column: 9
    zoneLightInt_thread_14 = (Integer)(zoneSixLightingI.getpreval() == null ? 0 : ((Integer)zoneSixLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 4, column: 9
    if(zoneOcc_thread_14 > 0 && zoneLightInt_thread_14 < 50){//sysj\ECS.sysj line: 6, column: 13
      zoneSixWindowONOFF.setPresent();//sysj\ECS.sysj line: 7, column: 13
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

  public void thread225023(int [] tdone, int [] ends){
        S224525=1;
    zoneOcc_thread_13 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 3, column: 9
    zoneLightInt_thread_13 = (Integer)(zoneFiveLightingI.getpreval() == null ? 0 : ((Integer)zoneFiveLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 4, column: 9
    if(zoneOcc_thread_13 > 0 && zoneLightInt_thread_13 < 50){//sysj\ECS.sysj line: 6, column: 13
      zoneFiveWindowONOFF.setPresent();//sysj\ECS.sysj line: 7, column: 13
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

  public void thread225022(int [] tdone, int [] ends){
        S224520=1;
    zoneOcc_thread_12 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 3, column: 9
    zoneLightInt_thread_12 = (Integer)(zoneFourLightingI.getpreval() == null ? 0 : ((Integer)zoneFourLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 4, column: 9
    if(zoneOcc_thread_12 > 0 && zoneLightInt_thread_12 < 50){//sysj\ECS.sysj line: 6, column: 13
      zoneFourWindowONOFF.setPresent();//sysj\ECS.sysj line: 7, column: 13
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

  public void thread225021(int [] tdone, int [] ends){
        S224515=1;
    zoneOcc_thread_11 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 3, column: 9
    zoneLightInt_thread_11 = (Integer)(zoneThreeLightingI.getpreval() == null ? 0 : ((Integer)zoneThreeLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 4, column: 9
    if(zoneOcc_thread_11 > 0 && zoneLightInt_thread_11 < 50){//sysj\ECS.sysj line: 6, column: 13
      zoneThreeWindowONOFF.setPresent();//sysj\ECS.sysj line: 7, column: 13
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

  public void thread225020(int [] tdone, int [] ends){
        S224510=1;
    zoneOcc_thread_10 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 3, column: 9
    zoneLightInt_thread_10 = (Integer)(zoneTwoLightingI.getpreval() == null ? 0 : ((Integer)zoneTwoLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 4, column: 9
    if(zoneOcc_thread_10 > 0 && zoneLightInt_thread_10 < 50){//sysj\ECS.sysj line: 6, column: 13
      zoneTwoWindowONOFF.setPresent();//sysj\ECS.sysj line: 7, column: 13
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

  public void thread225019(int [] tdone, int [] ends){
        S224505=1;
    zoneOcc_thread_9 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 3, column: 9
    zoneLightInt_thread_9 = (Integer)(zoneOneLightingI.getpreval() == null ? 0 : ((Integer)zoneOneLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 4, column: 9
    if(zoneOcc_thread_9 > 0 && zoneLightInt_thread_9 < 50){//sysj\ECS.sysj line: 6, column: 13
      zoneOneWindowONOFF.setPresent();//sysj\ECS.sysj line: 7, column: 13
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

  public void thread225017(int [] tdone, int [] ends){
        switch(S224572){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        S224572=0;
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
    }
  }

  public void thread225016(int [] tdone, int [] ends){
        switch(S224567){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        S224567=0;
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
    }
  }

  public void thread225015(int [] tdone, int [] ends){
        switch(S224562){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        S224562=0;
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
    }
  }

  public void thread225014(int [] tdone, int [] ends){
        switch(S224557){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        S224557=0;
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
    }
  }

  public void thread225013(int [] tdone, int [] ends){
        switch(S224552){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        S224552=0;
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
    }
  }

  public void thread225012(int [] tdone, int [] ends){
        switch(S224547){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        S224547=0;
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
    }
  }

  public void thread225011(int [] tdone, int [] ends){
        switch(S224542){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        S224542=0;
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
    }
  }

  public void thread225009(int [] tdone, int [] ends){
        S224572=1;
    zoneOcc_thread_22 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 20, column: 4
    zoneLightInt_thread_22 = (Integer)(zoneSevenLightingI.getpreval() == null ? 0 : ((Integer)zoneSevenLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 21, column: 7
    if(zoneOcc_thread_22 > 0 && zoneLightInt_thread_22 < 50){//sysj\ECS.sysj line: 22, column: 11
      zoneSevenLightONOFF.setPresent();//sysj\ECS.sysj line: 23, column: 14
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

  public void thread225008(int [] tdone, int [] ends){
        S224567=1;
    zoneOcc_thread_21 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 20, column: 4
    zoneLightInt_thread_21 = (Integer)(zoneSixLightingI.getpreval() == null ? 0 : ((Integer)zoneSixLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 21, column: 7
    if(zoneOcc_thread_21 > 0 && zoneLightInt_thread_21 < 50){//sysj\ECS.sysj line: 22, column: 11
      zoneSixLightONOFF.setPresent();//sysj\ECS.sysj line: 23, column: 14
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

  public void thread225007(int [] tdone, int [] ends){
        S224562=1;
    zoneOcc_thread_20 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 20, column: 4
    zoneLightInt_thread_20 = (Integer)(zoneFiveLightingI.getpreval() == null ? 0 : ((Integer)zoneFiveLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 21, column: 7
    if(zoneOcc_thread_20 > 0 && zoneLightInt_thread_20 < 50){//sysj\ECS.sysj line: 22, column: 11
      zoneFiveLightONOFF.setPresent();//sysj\ECS.sysj line: 23, column: 14
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

  public void thread225006(int [] tdone, int [] ends){
        S224557=1;
    zoneOcc_thread_19 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 20, column: 4
    zoneLightInt_thread_19 = (Integer)(zoneFourLightingI.getpreval() == null ? 0 : ((Integer)zoneFourLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 21, column: 7
    if(zoneOcc_thread_19 > 0 && zoneLightInt_thread_19 < 50){//sysj\ECS.sysj line: 22, column: 11
      zoneFourLightONOFF.setPresent();//sysj\ECS.sysj line: 23, column: 14
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

  public void thread225005(int [] tdone, int [] ends){
        S224552=1;
    zoneOcc_thread_18 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 20, column: 4
    zoneLightInt_thread_18 = (Integer)(zoneThreeLightingI.getpreval() == null ? 0 : ((Integer)zoneThreeLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 21, column: 7
    if(zoneOcc_thread_18 > 0 && zoneLightInt_thread_18 < 50){//sysj\ECS.sysj line: 22, column: 11
      zoneThreeLightONOFF.setPresent();//sysj\ECS.sysj line: 23, column: 14
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

  public void thread225004(int [] tdone, int [] ends){
        S224547=1;
    zoneOcc_thread_17 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 20, column: 4
    zoneLightInt_thread_17 = (Integer)(zoneTwoLightingI.getpreval() == null ? 0 : ((Integer)zoneTwoLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 21, column: 7
    if(zoneOcc_thread_17 > 0 && zoneLightInt_thread_17 < 50){//sysj\ECS.sysj line: 22, column: 11
      zoneTwoLightONOFF.setPresent();//sysj\ECS.sysj line: 23, column: 14
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

  public void thread225003(int [] tdone, int [] ends){
        S224542=1;
    zoneOcc_thread_16 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 20, column: 4
    zoneLightInt_thread_16 = (Integer)(zoneOneLightingI.getpreval() == null ? 0 : ((Integer)zoneOneLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 21, column: 7
    if(zoneOcc_thread_16 > 0 && zoneLightInt_thread_16 < 50){//sysj\ECS.sysj line: 22, column: 11
      zoneOneLightONOFF.setPresent();//sysj\ECS.sysj line: 23, column: 14
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

  public void thread225001(int [] tdone, int [] ends){
        switch(S224535){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        S224535=0;
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
    }
  }

  public void thread225000(int [] tdone, int [] ends){
        switch(S224530){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        S224530=0;
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
    }
  }

  public void thread224999(int [] tdone, int [] ends){
        switch(S224525){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        S224525=0;
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
    }
  }

  public void thread224998(int [] tdone, int [] ends){
        switch(S224520){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        S224520=0;
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
    }
  }

  public void thread224997(int [] tdone, int [] ends){
        switch(S224515){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        S224515=0;
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
    }
  }

  public void thread224996(int [] tdone, int [] ends){
        switch(S224510){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        S224510=0;
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
    }
  }

  public void thread224995(int [] tdone, int [] ends){
        switch(S224505){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        S224505=0;
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
    }
  }

  public void thread224994(int [] tdone, int [] ends){
        switch(S224949){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S224649){
          case 0 : 
            switch(S224536){
              case 0 : 
                thread224995(tdone,ends);
                thread224996(tdone,ends);
                thread224997(tdone,ends);
                thread224998(tdone,ends);
                thread224999(tdone,ends);
                thread225000(tdone,ends);
                thread225001(tdone,ends);
                int biggest225002 = 0;
                if(ends[9]>=biggest225002){
                  biggest225002=ends[9];
                }
                if(ends[10]>=biggest225002){
                  biggest225002=ends[10];
                }
                if(ends[11]>=biggest225002){
                  biggest225002=ends[11];
                }
                if(ends[12]>=biggest225002){
                  biggest225002=ends[12];
                }
                if(ends[13]>=biggest225002){
                  biggest225002=ends[13];
                }
                if(ends[14]>=biggest225002){
                  biggest225002=ends[14];
                }
                if(ends[15]>=biggest225002){
                  biggest225002=ends[15];
                }
                //FINXME code
                if(biggest225002 == 0){
                  S224536=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                break;
              
              case 1 : 
                S224536=1;
                S224649=1;
                if(afterhrs_6.getprestatus()){//sysj\ECS.sysj line: 362, column: 17
                  S224573=0;
                  thread225003(tdone,ends);
                  thread225004(tdone,ends);
                  thread225005(tdone,ends);
                  thread225006(tdone,ends);
                  thread225007(tdone,ends);
                  thread225008(tdone,ends);
                  thread225009(tdone,ends);
                  int biggest225010 = 0;
                  if(ends[16]>=biggest225010){
                    biggest225010=ends[16];
                  }
                  if(ends[17]>=biggest225010){
                    biggest225010=ends[17];
                  }
                  if(ends[18]>=biggest225010){
                    biggest225010=ends[18];
                  }
                  if(ends[19]>=biggest225010){
                    biggest225010=ends[19];
                  }
                  if(ends[20]>=biggest225010){
                    biggest225010=ends[20];
                  }
                  if(ends[21]>=biggest225010){
                    biggest225010=ends[21];
                  }
                  if(ends[22]>=biggest225010){
                    biggest225010=ends[22];
                  }
                  if(biggest225010 == 1){
                    active[8]=1;
                    ends[8]=1;
                    tdone[8]=1;
                  }
                  if(biggest225010 == 1){
                    active[8]=1;
                    ends[8]=1;
                    tdone[8]=1;
                  }
                  if(biggest225010 == 1){
                    active[8]=1;
                    ends[8]=1;
                    tdone[8]=1;
                  }
                  if(biggest225010 == 1){
                    active[8]=1;
                    ends[8]=1;
                    tdone[8]=1;
                  }
                  if(biggest225010 == 1){
                    active[8]=1;
                    ends[8]=1;
                    tdone[8]=1;
                  }
                  if(biggest225010 == 1){
                    active[8]=1;
                    ends[8]=1;
                    tdone[8]=1;
                  }
                  if(biggest225010 == 1){
                    active[8]=1;
                    ends[8]=1;
                    tdone[8]=1;
                  }
                }
                else {
                  S224649=2;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            switch(S224573){
              case 0 : 
                thread225011(tdone,ends);
                thread225012(tdone,ends);
                thread225013(tdone,ends);
                thread225014(tdone,ends);
                thread225015(tdone,ends);
                thread225016(tdone,ends);
                thread225017(tdone,ends);
                int biggest225018 = 0;
                if(ends[16]>=biggest225018){
                  biggest225018=ends[16];
                }
                if(ends[17]>=biggest225018){
                  biggest225018=ends[17];
                }
                if(ends[18]>=biggest225018){
                  biggest225018=ends[18];
                }
                if(ends[19]>=biggest225018){
                  biggest225018=ends[19];
                }
                if(ends[20]>=biggest225018){
                  biggest225018=ends[20];
                }
                if(ends[21]>=biggest225018){
                  biggest225018=ends[21];
                }
                if(ends[22]>=biggest225018){
                  biggest225018=ends[22];
                }
                //FINXME code
                if(biggest225018 == 0){
                  S224573=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                break;
              
              case 1 : 
                S224573=1;
                S224649=2;
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
                break;
              
            }
            break;
          
          case 2 : 
            S224649=2;
            S224649=0;
            if(workhrs_6.getprestatus()){//sysj\ECS.sysj line: 342, column: 17
              S224536=0;
              thread225019(tdone,ends);
              thread225020(tdone,ends);
              thread225021(tdone,ends);
              thread225022(tdone,ends);
              thread225023(tdone,ends);
              thread225024(tdone,ends);
              thread225025(tdone,ends);
              int biggest225026 = 0;
              if(ends[9]>=biggest225026){
                biggest225026=ends[9];
              }
              if(ends[10]>=biggest225026){
                biggest225026=ends[10];
              }
              if(ends[11]>=biggest225026){
                biggest225026=ends[11];
              }
              if(ends[12]>=biggest225026){
                biggest225026=ends[12];
              }
              if(ends[13]>=biggest225026){
                biggest225026=ends[13];
              }
              if(ends[14]>=biggest225026){
                biggest225026=ends[14];
              }
              if(ends[15]>=biggest225026){
                biggest225026=ends[15];
              }
              if(biggest225026 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              if(biggest225026 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              if(biggest225026 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              if(biggest225026 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              if(biggest225026 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              if(biggest225026 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              if(biggest225026 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
            }
            else {
              S224649=1;
              if(afterhrs_6.getprestatus()){//sysj\ECS.sysj line: 362, column: 17
                S224573=0;
                thread225027(tdone,ends);
                thread225028(tdone,ends);
                thread225029(tdone,ends);
                thread225030(tdone,ends);
                thread225031(tdone,ends);
                thread225032(tdone,ends);
                thread225033(tdone,ends);
                int biggest225034 = 0;
                if(ends[16]>=biggest225034){
                  biggest225034=ends[16];
                }
                if(ends[17]>=biggest225034){
                  biggest225034=ends[17];
                }
                if(ends[18]>=biggest225034){
                  biggest225034=ends[18];
                }
                if(ends[19]>=biggest225034){
                  biggest225034=ends[19];
                }
                if(ends[20]>=biggest225034){
                  biggest225034=ends[20];
                }
                if(ends[21]>=biggest225034){
                  biggest225034=ends[21];
                }
                if(ends[22]>=biggest225034){
                  biggest225034=ends[22];
                }
                if(biggest225034 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                if(biggest225034 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                if(biggest225034 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                if(biggest225034 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                if(biggest225034 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                if(biggest225034 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                if(biggest225034 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
              }
              else {
                S224649=2;
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

  public void thread224993(int [] tdone, int [] ends){
        switch(S224500){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S224450){
          case 0 : 
            if(currentTime_2.getprestatus()){//sysj\ECS.sysj line: 318, column: 14
              currentHour_thread_7 = (Integer)(currentTime_2.getpreval() == null ? 0 : ((Integer)currentTime_2.getpreval()).intValue());//sysj\ECS.sysj line: 319, column: 8
              S224450=1;
              if(currentHour_thread_7 >= 9 && currentHour_thread_7 <= 17){//sysj\ECS.sysj line: 321, column: 16
                S224454=0;
                workhrs_6.setPresent();//sysj\ECS.sysj line: 322, column: 16
                currsigs.addElement(workhrs_6);
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
              else {
                S224454=1;
                if((currentHour_thread_7 >= 18 && currentHour_thread_7 <= 24) || (currentHour_thread_7 >= 0 && currentHour_thread_7 < 9)){//sysj\ECS.sysj line: 326, column: 23
                  afterhrs_6.setPresent();//sysj\ECS.sysj line: 327, column: 16
                  currsigs.addElement(afterhrs_6);
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  S224450=0;
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
            switch(S224454){
              case 0 : 
                S224450=0;
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
                break;
              
              case 1 : 
                S224450=0;
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

  public void thread224990(int [] tdone, int [] ends){
        S224572=1;
    zoneOcc_thread_22 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 20, column: 4
    zoneLightInt_thread_22 = (Integer)(zoneSevenLightingI.getpreval() == null ? 0 : ((Integer)zoneSevenLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 21, column: 7
    if(zoneOcc_thread_22 > 0 && zoneLightInt_thread_22 < 50){//sysj\ECS.sysj line: 22, column: 11
      zoneSevenLightONOFF.setPresent();//sysj\ECS.sysj line: 23, column: 14
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

  public void thread224989(int [] tdone, int [] ends){
        S224567=1;
    zoneOcc_thread_21 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 20, column: 4
    zoneLightInt_thread_21 = (Integer)(zoneSixLightingI.getpreval() == null ? 0 : ((Integer)zoneSixLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 21, column: 7
    if(zoneOcc_thread_21 > 0 && zoneLightInt_thread_21 < 50){//sysj\ECS.sysj line: 22, column: 11
      zoneSixLightONOFF.setPresent();//sysj\ECS.sysj line: 23, column: 14
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

  public void thread224988(int [] tdone, int [] ends){
        S224562=1;
    zoneOcc_thread_20 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 20, column: 4
    zoneLightInt_thread_20 = (Integer)(zoneFiveLightingI.getpreval() == null ? 0 : ((Integer)zoneFiveLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 21, column: 7
    if(zoneOcc_thread_20 > 0 && zoneLightInt_thread_20 < 50){//sysj\ECS.sysj line: 22, column: 11
      zoneFiveLightONOFF.setPresent();//sysj\ECS.sysj line: 23, column: 14
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

  public void thread224987(int [] tdone, int [] ends){
        S224557=1;
    zoneOcc_thread_19 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 20, column: 4
    zoneLightInt_thread_19 = (Integer)(zoneFourLightingI.getpreval() == null ? 0 : ((Integer)zoneFourLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 21, column: 7
    if(zoneOcc_thread_19 > 0 && zoneLightInt_thread_19 < 50){//sysj\ECS.sysj line: 22, column: 11
      zoneFourLightONOFF.setPresent();//sysj\ECS.sysj line: 23, column: 14
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

  public void thread224986(int [] tdone, int [] ends){
        S224552=1;
    zoneOcc_thread_18 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 20, column: 4
    zoneLightInt_thread_18 = (Integer)(zoneThreeLightingI.getpreval() == null ? 0 : ((Integer)zoneThreeLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 21, column: 7
    if(zoneOcc_thread_18 > 0 && zoneLightInt_thread_18 < 50){//sysj\ECS.sysj line: 22, column: 11
      zoneThreeLightONOFF.setPresent();//sysj\ECS.sysj line: 23, column: 14
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

  public void thread224985(int [] tdone, int [] ends){
        S224547=1;
    zoneOcc_thread_17 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 20, column: 4
    zoneLightInt_thread_17 = (Integer)(zoneTwoLightingI.getpreval() == null ? 0 : ((Integer)zoneTwoLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 21, column: 7
    if(zoneOcc_thread_17 > 0 && zoneLightInt_thread_17 < 50){//sysj\ECS.sysj line: 22, column: 11
      zoneTwoLightONOFF.setPresent();//sysj\ECS.sysj line: 23, column: 14
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

  public void thread224984(int [] tdone, int [] ends){
        S224542=1;
    zoneOcc_thread_16 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 20, column: 4
    zoneLightInt_thread_16 = (Integer)(zoneOneLightingI.getpreval() == null ? 0 : ((Integer)zoneOneLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 21, column: 7
    if(zoneOcc_thread_16 > 0 && zoneLightInt_thread_16 < 50){//sysj\ECS.sysj line: 22, column: 11
      zoneOneLightONOFF.setPresent();//sysj\ECS.sysj line: 23, column: 14
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

  public void thread224982(int [] tdone, int [] ends){
        S224535=1;
    zoneOcc_thread_15 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 3, column: 9
    zoneLightInt_thread_15 = (Integer)(zoneSevenLightingI.getpreval() == null ? 0 : ((Integer)zoneSevenLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 4, column: 9
    if(zoneOcc_thread_15 > 0 && zoneLightInt_thread_15 < 50){//sysj\ECS.sysj line: 6, column: 13
      zoneSevenWindowONOFF.setPresent();//sysj\ECS.sysj line: 7, column: 13
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

  public void thread224981(int [] tdone, int [] ends){
        S224530=1;
    zoneOcc_thread_14 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 3, column: 9
    zoneLightInt_thread_14 = (Integer)(zoneSixLightingI.getpreval() == null ? 0 : ((Integer)zoneSixLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 4, column: 9
    if(zoneOcc_thread_14 > 0 && zoneLightInt_thread_14 < 50){//sysj\ECS.sysj line: 6, column: 13
      zoneSixWindowONOFF.setPresent();//sysj\ECS.sysj line: 7, column: 13
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

  public void thread224980(int [] tdone, int [] ends){
        S224525=1;
    zoneOcc_thread_13 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 3, column: 9
    zoneLightInt_thread_13 = (Integer)(zoneFiveLightingI.getpreval() == null ? 0 : ((Integer)zoneFiveLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 4, column: 9
    if(zoneOcc_thread_13 > 0 && zoneLightInt_thread_13 < 50){//sysj\ECS.sysj line: 6, column: 13
      zoneFiveWindowONOFF.setPresent();//sysj\ECS.sysj line: 7, column: 13
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

  public void thread224979(int [] tdone, int [] ends){
        S224520=1;
    zoneOcc_thread_12 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 3, column: 9
    zoneLightInt_thread_12 = (Integer)(zoneFourLightingI.getpreval() == null ? 0 : ((Integer)zoneFourLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 4, column: 9
    if(zoneOcc_thread_12 > 0 && zoneLightInt_thread_12 < 50){//sysj\ECS.sysj line: 6, column: 13
      zoneFourWindowONOFF.setPresent();//sysj\ECS.sysj line: 7, column: 13
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

  public void thread224978(int [] tdone, int [] ends){
        S224515=1;
    zoneOcc_thread_11 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 3, column: 9
    zoneLightInt_thread_11 = (Integer)(zoneThreeLightingI.getpreval() == null ? 0 : ((Integer)zoneThreeLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 4, column: 9
    if(zoneOcc_thread_11 > 0 && zoneLightInt_thread_11 < 50){//sysj\ECS.sysj line: 6, column: 13
      zoneThreeWindowONOFF.setPresent();//sysj\ECS.sysj line: 7, column: 13
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

  public void thread224977(int [] tdone, int [] ends){
        S224510=1;
    zoneOcc_thread_10 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 3, column: 9
    zoneLightInt_thread_10 = (Integer)(zoneTwoLightingI.getpreval() == null ? 0 : ((Integer)zoneTwoLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 4, column: 9
    if(zoneOcc_thread_10 > 0 && zoneLightInt_thread_10 < 50){//sysj\ECS.sysj line: 6, column: 13
      zoneTwoWindowONOFF.setPresent();//sysj\ECS.sysj line: 7, column: 13
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

  public void thread224976(int [] tdone, int [] ends){
        S224505=1;
    zoneOcc_thread_9 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 3, column: 9
    zoneLightInt_thread_9 = (Integer)(zoneOneLightingI.getpreval() == null ? 0 : ((Integer)zoneOneLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 4, column: 9
    if(zoneOcc_thread_9 > 0 && zoneLightInt_thread_9 < 50){//sysj\ECS.sysj line: 6, column: 13
      zoneOneWindowONOFF.setPresent();//sysj\ECS.sysj line: 7, column: 13
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

  public void thread224975(int [] tdone, int [] ends){
        S224949=1;
    S224649=0;
    if(workhrs_6.getprestatus()){//sysj\ECS.sysj line: 342, column: 17
      S224536=0;
      thread224976(tdone,ends);
      thread224977(tdone,ends);
      thread224978(tdone,ends);
      thread224979(tdone,ends);
      thread224980(tdone,ends);
      thread224981(tdone,ends);
      thread224982(tdone,ends);
      int biggest224983 = 0;
      if(ends[9]>=biggest224983){
        biggest224983=ends[9];
      }
      if(ends[10]>=biggest224983){
        biggest224983=ends[10];
      }
      if(ends[11]>=biggest224983){
        biggest224983=ends[11];
      }
      if(ends[12]>=biggest224983){
        biggest224983=ends[12];
      }
      if(ends[13]>=biggest224983){
        biggest224983=ends[13];
      }
      if(ends[14]>=biggest224983){
        biggest224983=ends[14];
      }
      if(ends[15]>=biggest224983){
        biggest224983=ends[15];
      }
      if(biggest224983 == 1){
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
      if(biggest224983 == 1){
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
      if(biggest224983 == 1){
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
      if(biggest224983 == 1){
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
      if(biggest224983 == 1){
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
      if(biggest224983 == 1){
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
      if(biggest224983 == 1){
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
    }
    else {
      S224649=1;
      if(afterhrs_6.getprestatus()){//sysj\ECS.sysj line: 362, column: 17
        S224573=0;
        thread224984(tdone,ends);
        thread224985(tdone,ends);
        thread224986(tdone,ends);
        thread224987(tdone,ends);
        thread224988(tdone,ends);
        thread224989(tdone,ends);
        thread224990(tdone,ends);
        int biggest224991 = 0;
        if(ends[16]>=biggest224991){
          biggest224991=ends[16];
        }
        if(ends[17]>=biggest224991){
          biggest224991=ends[17];
        }
        if(ends[18]>=biggest224991){
          biggest224991=ends[18];
        }
        if(ends[19]>=biggest224991){
          biggest224991=ends[19];
        }
        if(ends[20]>=biggest224991){
          biggest224991=ends[20];
        }
        if(ends[21]>=biggest224991){
          biggest224991=ends[21];
        }
        if(ends[22]>=biggest224991){
          biggest224991=ends[22];
        }
        if(biggest224991 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        if(biggest224991 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        if(biggest224991 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        if(biggest224991 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        if(biggest224991 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        if(biggest224991 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        if(biggest224991 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
      }
      else {
        S224649=2;
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
    }
  }

  public void thread224974(int [] tdone, int [] ends){
        S224500=1;
    S224450=0;
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
      switch(S224951){
        case 0 : 
          S224951=0;
          break RUN;
        
        case 1 : 
          S224951=2;
          S224951=2;
          workhrs_6.setClear();//sysj\ECS.sysj line: 314, column: 4
          afterhrs_6.setClear();//sysj\ECS.sysj line: 314, column: 4
          thread224974(tdone,ends);
          thread224975(tdone,ends);
          int biggest224992 = 0;
          if(ends[7]>=biggest224992){
            biggest224992=ends[7];
          }
          if(ends[8]>=biggest224992){
            biggest224992=ends[8];
          }
          if(biggest224992 == 1){
            active[6]=1;
            ends[6]=1;
            break RUN;
          }
        
        case 2 : 
          workhrs_6.setClear();//sysj\ECS.sysj line: 314, column: 4
          afterhrs_6.setClear();//sysj\ECS.sysj line: 314, column: 4
          thread224993(tdone,ends);
          thread224994(tdone,ends);
          int biggest225035 = 0;
          if(ends[7]>=biggest225035){
            biggest225035=ends[7];
          }
          if(ends[8]>=biggest225035){
            biggest225035=ends[8];
          }
          if(biggest225035 == 1){
            active[6]=1;
            ends[6]=1;
            break RUN;
          }
          //FINXME code
          if(biggest225035 == 0){
            S224951=0;
            active[6]=0;
            ends[6]=0;
            S224951=0;
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
