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
  private int S204862 = 1;
  private int S203570 = 1;
  private int S203520 = 1;
  private int S203524 = 1;
  private int S204860 = 1;
  private int S203662 = 1;
  private int S203582 = 1;
  private int S203573 = 1;
  private int S203585 = 1;
  private int S203593 = 1;
  private int S203754 = 1;
  private int S203674 = 1;
  private int S203665 = 1;
  private int S203677 = 1;
  private int S203685 = 1;
  private int S203846 = 1;
  private int S203766 = 1;
  private int S203757 = 1;
  private int S203769 = 1;
  private int S203777 = 1;
  private int S203938 = 1;
  private int S203858 = 1;
  private int S203849 = 1;
  private int S203861 = 1;
  private int S203869 = 1;
  private int S204030 = 1;
  private int S203950 = 1;
  private int S203941 = 1;
  private int S203953 = 1;
  private int S203961 = 1;
  private int S204122 = 1;
  private int S204042 = 1;
  private int S204033 = 1;
  private int S204045 = 1;
  private int S204053 = 1;
  private int S204214 = 1;
  private int S204134 = 1;
  private int S204125 = 1;
  private int S204137 = 1;
  private int S204145 = 1;
  private int S204306 = 1;
  private int S204226 = 1;
  private int S204217 = 1;
  private int S204229 = 1;
  private int S204237 = 1;
  private int S204398 = 1;
  private int S204318 = 1;
  private int S204309 = 1;
  private int S204321 = 1;
  private int S204329 = 1;
  private int S204490 = 1;
  private int S204410 = 1;
  private int S204401 = 1;
  private int S204413 = 1;
  private int S204421 = 1;
  private int S204582 = 1;
  private int S204502 = 1;
  private int S204493 = 1;
  private int S204505 = 1;
  private int S204513 = 1;
  private int S204674 = 1;
  private int S204594 = 1;
  private int S204585 = 1;
  private int S204597 = 1;
  private int S204605 = 1;
  private int S204766 = 1;
  private int S204686 = 1;
  private int S204677 = 1;
  private int S204689 = 1;
  private int S204697 = 1;
  private int S204858 = 1;
  private int S204778 = 1;
  private int S204769 = 1;
  private int S204781 = 1;
  private int S204789 = 1;
  
  private int[] ends = new int[66];
  private int[] tdone = new int[66];
  
  public void thread205141(int [] tdone, int [] ends){
        S204789=1;
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

  public void thread205140(int [] tdone, int [] ends){
        S204781=1;
    active[63]=1;
    ends[63]=1;
    tdone[63]=1;
  }

  public void thread205139(int [] tdone, int [] ends){
        S204778=1;
    zoneOcc_thread_62 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_62 = (Integer)(zoneSevenLightingI.getpreval() == null ? 0 : ((Integer)zoneSevenLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204769=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_62 > 0 && zoneLightInt_thread_62 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneSevenLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneSevenLightONOFF);
      active[62]=1;
      ends[62]=1;
      tdone[62]=1;
    }
    else {
      S204769=1;
      active[62]=1;
      ends[62]=1;
      tdone[62]=1;
    }
  }

  public void thread205137(int [] tdone, int [] ends){
        S204789=1;
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

  public void thread205136(int [] tdone, int [] ends){
        S204781=1;
    active[63]=1;
    ends[63]=1;
    tdone[63]=1;
  }

  public void thread205135(int [] tdone, int [] ends){
        S204778=1;
    zoneOcc_thread_62 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_62 = (Integer)(zoneSevenLightingI.getpreval() == null ? 0 : ((Integer)zoneSevenLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204769=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_62 > 0 && zoneLightInt_thread_62 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneSevenLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneSevenLightONOFF);
      active[62]=1;
      ends[62]=1;
      tdone[62]=1;
    }
    else {
      S204769=1;
      active[62]=1;
      ends[62]=1;
      tdone[62]=1;
    }
  }

  public void thread205133(int [] tdone, int [] ends){
        switch(S204789){
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

  public void thread205132(int [] tdone, int [] ends){
        switch(S204781){
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

  public void thread205131(int [] tdone, int [] ends){
        switch(S204778){
      case 0 : 
        active[62]=0;
        ends[62]=0;
        tdone[62]=1;
        break;
      
      case 1 : 
        switch(S204769){
          case 0 : 
            zoneSevenLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
            currsigs.addElement(zoneSevenLightONOFF);
            active[62]=1;
            ends[62]=1;
            tdone[62]=1;
            break;
          
          case 1 : 
            S204769=1;
            S204778=0;
            active[62]=0;
            ends[62]=0;
            tdone[62]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread205130(int [] tdone, int [] ends){
        switch(S204858){
      case 0 : 
        active[61]=0;
        ends[61]=0;
        tdone[61]=1;
        break;
      
      case 1 : 
        test_61.setClear();//sysj\ECS.sysj line: 37, column: 5
        thread205131(tdone,ends);
        thread205132(tdone,ends);
        thread205133(tdone,ends);
        int biggest205134 = 0;
        if(ends[62]>=biggest205134){
          biggest205134=ends[62];
        }
        if(ends[63]>=biggest205134){
          biggest205134=ends[63];
        }
        if(ends[64]>=biggest205134){
          biggest205134=ends[64];
        }
        if(biggest205134 == 1){
          active[61]=1;
          ends[61]=1;
          tdone[61]=1;
        }
        if(biggest205134 == 2){
          ends[61]=2;
          ;//sysj\ECS.sysj line: 39, column: 5
          thread205135(tdone,ends);
          thread205136(tdone,ends);
          thread205137(tdone,ends);
          int biggest205138 = 0;
          if(ends[62]>=biggest205138){
            biggest205138=ends[62];
          }
          if(ends[63]>=biggest205138){
            biggest205138=ends[63];
          }
          if(ends[64]>=biggest205138){
            biggest205138=ends[64];
          }
          if(biggest205138 == 1){
            active[61]=1;
            ends[61]=1;
            tdone[61]=1;
          }
        }
        //FINXME code
        if(biggest205134 == 0){
          thread205139(tdone,ends);
          thread205140(tdone,ends);
          thread205141(tdone,ends);
          int biggest205142 = 0;
          if(ends[62]>=biggest205142){
            biggest205142=ends[62];
          }
          if(ends[63]>=biggest205142){
            biggest205142=ends[63];
          }
          if(ends[64]>=biggest205142){
            biggest205142=ends[64];
          }
          if(biggest205142 == 1){
            active[61]=1;
            ends[61]=1;
            tdone[61]=1;
          }
        }
        break;
      
    }
  }

  public void thread205128(int [] tdone, int [] ends){
        S204697=1;
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

  public void thread205127(int [] tdone, int [] ends){
        S204689=1;
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread205126(int [] tdone, int [] ends){
        S204686=1;
    zoneOcc_thread_58 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_58 = (Integer)(zoneSixLightingI.getpreval() == null ? 0 : ((Integer)zoneSixLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204677=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_58 > 0 && zoneLightInt_thread_58 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneSixLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneSixLightONOFF);
      active[58]=1;
      ends[58]=1;
      tdone[58]=1;
    }
    else {
      S204677=1;
      active[58]=1;
      ends[58]=1;
      tdone[58]=1;
    }
  }

  public void thread205124(int [] tdone, int [] ends){
        S204697=1;
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

  public void thread205123(int [] tdone, int [] ends){
        S204689=1;
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread205122(int [] tdone, int [] ends){
        S204686=1;
    zoneOcc_thread_58 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_58 = (Integer)(zoneSixLightingI.getpreval() == null ? 0 : ((Integer)zoneSixLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204677=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_58 > 0 && zoneLightInt_thread_58 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneSixLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneSixLightONOFF);
      active[58]=1;
      ends[58]=1;
      tdone[58]=1;
    }
    else {
      S204677=1;
      active[58]=1;
      ends[58]=1;
      tdone[58]=1;
    }
  }

  public void thread205120(int [] tdone, int [] ends){
        switch(S204697){
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

  public void thread205119(int [] tdone, int [] ends){
        switch(S204689){
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

  public void thread205118(int [] tdone, int [] ends){
        switch(S204686){
      case 0 : 
        active[58]=0;
        ends[58]=0;
        tdone[58]=1;
        break;
      
      case 1 : 
        switch(S204677){
          case 0 : 
            zoneSixLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
            currsigs.addElement(zoneSixLightONOFF);
            active[58]=1;
            ends[58]=1;
            tdone[58]=1;
            break;
          
          case 1 : 
            S204677=1;
            S204686=0;
            active[58]=0;
            ends[58]=0;
            tdone[58]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread205117(int [] tdone, int [] ends){
        switch(S204766){
      case 0 : 
        active[57]=0;
        ends[57]=0;
        tdone[57]=1;
        break;
      
      case 1 : 
        test_57.setClear();//sysj\ECS.sysj line: 37, column: 5
        thread205118(tdone,ends);
        thread205119(tdone,ends);
        thread205120(tdone,ends);
        int biggest205121 = 0;
        if(ends[58]>=biggest205121){
          biggest205121=ends[58];
        }
        if(ends[59]>=biggest205121){
          biggest205121=ends[59];
        }
        if(ends[60]>=biggest205121){
          biggest205121=ends[60];
        }
        if(biggest205121 == 1){
          active[57]=1;
          ends[57]=1;
          tdone[57]=1;
        }
        if(biggest205121 == 2){
          ends[57]=2;
          ;//sysj\ECS.sysj line: 39, column: 5
          thread205122(tdone,ends);
          thread205123(tdone,ends);
          thread205124(tdone,ends);
          int biggest205125 = 0;
          if(ends[58]>=biggest205125){
            biggest205125=ends[58];
          }
          if(ends[59]>=biggest205125){
            biggest205125=ends[59];
          }
          if(ends[60]>=biggest205125){
            biggest205125=ends[60];
          }
          if(biggest205125 == 1){
            active[57]=1;
            ends[57]=1;
            tdone[57]=1;
          }
        }
        //FINXME code
        if(biggest205121 == 0){
          thread205126(tdone,ends);
          thread205127(tdone,ends);
          thread205128(tdone,ends);
          int biggest205129 = 0;
          if(ends[58]>=biggest205129){
            biggest205129=ends[58];
          }
          if(ends[59]>=biggest205129){
            biggest205129=ends[59];
          }
          if(ends[60]>=biggest205129){
            biggest205129=ends[60];
          }
          if(biggest205129 == 1){
            active[57]=1;
            ends[57]=1;
            tdone[57]=1;
          }
        }
        break;
      
    }
  }

  public void thread205115(int [] tdone, int [] ends){
        S204605=1;
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

  public void thread205114(int [] tdone, int [] ends){
        S204597=1;
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread205113(int [] tdone, int [] ends){
        S204594=1;
    zoneOcc_thread_54 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_54 = (Integer)(zoneFiveLightingI.getpreval() == null ? 0 : ((Integer)zoneFiveLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204585=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_54 > 0 && zoneLightInt_thread_54 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneFiveLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneFiveLightONOFF);
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
    else {
      S204585=1;
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
  }

  public void thread205111(int [] tdone, int [] ends){
        S204605=1;
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

  public void thread205110(int [] tdone, int [] ends){
        S204597=1;
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread205109(int [] tdone, int [] ends){
        S204594=1;
    zoneOcc_thread_54 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_54 = (Integer)(zoneFiveLightingI.getpreval() == null ? 0 : ((Integer)zoneFiveLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204585=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_54 > 0 && zoneLightInt_thread_54 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneFiveLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneFiveLightONOFF);
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
    else {
      S204585=1;
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
  }

  public void thread205107(int [] tdone, int [] ends){
        switch(S204605){
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

  public void thread205106(int [] tdone, int [] ends){
        switch(S204597){
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

  public void thread205105(int [] tdone, int [] ends){
        switch(S204594){
      case 0 : 
        active[54]=0;
        ends[54]=0;
        tdone[54]=1;
        break;
      
      case 1 : 
        switch(S204585){
          case 0 : 
            zoneFiveLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
            currsigs.addElement(zoneFiveLightONOFF);
            active[54]=1;
            ends[54]=1;
            tdone[54]=1;
            break;
          
          case 1 : 
            S204585=1;
            S204594=0;
            active[54]=0;
            ends[54]=0;
            tdone[54]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread205104(int [] tdone, int [] ends){
        switch(S204674){
      case 0 : 
        active[53]=0;
        ends[53]=0;
        tdone[53]=1;
        break;
      
      case 1 : 
        test_53.setClear();//sysj\ECS.sysj line: 37, column: 5
        thread205105(tdone,ends);
        thread205106(tdone,ends);
        thread205107(tdone,ends);
        int biggest205108 = 0;
        if(ends[54]>=biggest205108){
          biggest205108=ends[54];
        }
        if(ends[55]>=biggest205108){
          biggest205108=ends[55];
        }
        if(ends[56]>=biggest205108){
          biggest205108=ends[56];
        }
        if(biggest205108 == 1){
          active[53]=1;
          ends[53]=1;
          tdone[53]=1;
        }
        if(biggest205108 == 2){
          ends[53]=2;
          ;//sysj\ECS.sysj line: 39, column: 5
          thread205109(tdone,ends);
          thread205110(tdone,ends);
          thread205111(tdone,ends);
          int biggest205112 = 0;
          if(ends[54]>=biggest205112){
            biggest205112=ends[54];
          }
          if(ends[55]>=biggest205112){
            biggest205112=ends[55];
          }
          if(ends[56]>=biggest205112){
            biggest205112=ends[56];
          }
          if(biggest205112 == 1){
            active[53]=1;
            ends[53]=1;
            tdone[53]=1;
          }
        }
        //FINXME code
        if(biggest205108 == 0){
          thread205113(tdone,ends);
          thread205114(tdone,ends);
          thread205115(tdone,ends);
          int biggest205116 = 0;
          if(ends[54]>=biggest205116){
            biggest205116=ends[54];
          }
          if(ends[55]>=biggest205116){
            biggest205116=ends[55];
          }
          if(ends[56]>=biggest205116){
            biggest205116=ends[56];
          }
          if(biggest205116 == 1){
            active[53]=1;
            ends[53]=1;
            tdone[53]=1;
          }
        }
        break;
      
    }
  }

  public void thread205102(int [] tdone, int [] ends){
        S204513=1;
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

  public void thread205101(int [] tdone, int [] ends){
        S204505=1;
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread205100(int [] tdone, int [] ends){
        S204502=1;
    zoneOcc_thread_50 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_50 = (Integer)(zoneFourLightingI.getpreval() == null ? 0 : ((Integer)zoneFourLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204493=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_50 > 0 && zoneLightInt_thread_50 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneFourLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneFourLightONOFF);
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
    else {
      S204493=1;
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
  }

  public void thread205098(int [] tdone, int [] ends){
        S204513=1;
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

  public void thread205097(int [] tdone, int [] ends){
        S204505=1;
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread205096(int [] tdone, int [] ends){
        S204502=1;
    zoneOcc_thread_50 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_50 = (Integer)(zoneFourLightingI.getpreval() == null ? 0 : ((Integer)zoneFourLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204493=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_50 > 0 && zoneLightInt_thread_50 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneFourLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneFourLightONOFF);
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
    else {
      S204493=1;
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
  }

  public void thread205094(int [] tdone, int [] ends){
        switch(S204513){
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

  public void thread205093(int [] tdone, int [] ends){
        switch(S204505){
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

  public void thread205092(int [] tdone, int [] ends){
        switch(S204502){
      case 0 : 
        active[50]=0;
        ends[50]=0;
        tdone[50]=1;
        break;
      
      case 1 : 
        switch(S204493){
          case 0 : 
            zoneFourLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
            currsigs.addElement(zoneFourLightONOFF);
            active[50]=1;
            ends[50]=1;
            tdone[50]=1;
            break;
          
          case 1 : 
            S204493=1;
            S204502=0;
            active[50]=0;
            ends[50]=0;
            tdone[50]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread205091(int [] tdone, int [] ends){
        switch(S204582){
      case 0 : 
        active[49]=0;
        ends[49]=0;
        tdone[49]=1;
        break;
      
      case 1 : 
        test_49.setClear();//sysj\ECS.sysj line: 37, column: 5
        thread205092(tdone,ends);
        thread205093(tdone,ends);
        thread205094(tdone,ends);
        int biggest205095 = 0;
        if(ends[50]>=biggest205095){
          biggest205095=ends[50];
        }
        if(ends[51]>=biggest205095){
          biggest205095=ends[51];
        }
        if(ends[52]>=biggest205095){
          biggest205095=ends[52];
        }
        if(biggest205095 == 1){
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
        if(biggest205095 == 2){
          ends[49]=2;
          ;//sysj\ECS.sysj line: 39, column: 5
          thread205096(tdone,ends);
          thread205097(tdone,ends);
          thread205098(tdone,ends);
          int biggest205099 = 0;
          if(ends[50]>=biggest205099){
            biggest205099=ends[50];
          }
          if(ends[51]>=biggest205099){
            biggest205099=ends[51];
          }
          if(ends[52]>=biggest205099){
            biggest205099=ends[52];
          }
          if(biggest205099 == 1){
            active[49]=1;
            ends[49]=1;
            tdone[49]=1;
          }
        }
        //FINXME code
        if(biggest205095 == 0){
          thread205100(tdone,ends);
          thread205101(tdone,ends);
          thread205102(tdone,ends);
          int biggest205103 = 0;
          if(ends[50]>=biggest205103){
            biggest205103=ends[50];
          }
          if(ends[51]>=biggest205103){
            biggest205103=ends[51];
          }
          if(ends[52]>=biggest205103){
            biggest205103=ends[52];
          }
          if(biggest205103 == 1){
            active[49]=1;
            ends[49]=1;
            tdone[49]=1;
          }
        }
        break;
      
    }
  }

  public void thread205089(int [] tdone, int [] ends){
        S204421=1;
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

  public void thread205088(int [] tdone, int [] ends){
        S204413=1;
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread205087(int [] tdone, int [] ends){
        S204410=1;
    zoneOcc_thread_46 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_46 = (Integer)(zoneThreeLightingI.getpreval() == null ? 0 : ((Integer)zoneThreeLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204401=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_46 > 0 && zoneLightInt_thread_46 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneThreeLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneThreeLightONOFF);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S204401=1;
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
  }

  public void thread205085(int [] tdone, int [] ends){
        S204421=1;
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

  public void thread205084(int [] tdone, int [] ends){
        S204413=1;
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread205083(int [] tdone, int [] ends){
        S204410=1;
    zoneOcc_thread_46 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_46 = (Integer)(zoneThreeLightingI.getpreval() == null ? 0 : ((Integer)zoneThreeLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204401=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_46 > 0 && zoneLightInt_thread_46 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneThreeLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneThreeLightONOFF);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S204401=1;
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
  }

  public void thread205081(int [] tdone, int [] ends){
        switch(S204421){
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

  public void thread205080(int [] tdone, int [] ends){
        switch(S204413){
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

  public void thread205079(int [] tdone, int [] ends){
        switch(S204410){
      case 0 : 
        active[46]=0;
        ends[46]=0;
        tdone[46]=1;
        break;
      
      case 1 : 
        switch(S204401){
          case 0 : 
            zoneThreeLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
            currsigs.addElement(zoneThreeLightONOFF);
            active[46]=1;
            ends[46]=1;
            tdone[46]=1;
            break;
          
          case 1 : 
            S204401=1;
            S204410=0;
            active[46]=0;
            ends[46]=0;
            tdone[46]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread205078(int [] tdone, int [] ends){
        switch(S204490){
      case 0 : 
        active[45]=0;
        ends[45]=0;
        tdone[45]=1;
        break;
      
      case 1 : 
        test_45.setClear();//sysj\ECS.sysj line: 37, column: 5
        thread205079(tdone,ends);
        thread205080(tdone,ends);
        thread205081(tdone,ends);
        int biggest205082 = 0;
        if(ends[46]>=biggest205082){
          biggest205082=ends[46];
        }
        if(ends[47]>=biggest205082){
          biggest205082=ends[47];
        }
        if(ends[48]>=biggest205082){
          biggest205082=ends[48];
        }
        if(biggest205082 == 1){
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
        if(biggest205082 == 2){
          ends[45]=2;
          ;//sysj\ECS.sysj line: 39, column: 5
          thread205083(tdone,ends);
          thread205084(tdone,ends);
          thread205085(tdone,ends);
          int biggest205086 = 0;
          if(ends[46]>=biggest205086){
            biggest205086=ends[46];
          }
          if(ends[47]>=biggest205086){
            biggest205086=ends[47];
          }
          if(ends[48]>=biggest205086){
            biggest205086=ends[48];
          }
          if(biggest205086 == 1){
            active[45]=1;
            ends[45]=1;
            tdone[45]=1;
          }
        }
        //FINXME code
        if(biggest205082 == 0){
          thread205087(tdone,ends);
          thread205088(tdone,ends);
          thread205089(tdone,ends);
          int biggest205090 = 0;
          if(ends[46]>=biggest205090){
            biggest205090=ends[46];
          }
          if(ends[47]>=biggest205090){
            biggest205090=ends[47];
          }
          if(ends[48]>=biggest205090){
            biggest205090=ends[48];
          }
          if(biggest205090 == 1){
            active[45]=1;
            ends[45]=1;
            tdone[45]=1;
          }
        }
        break;
      
    }
  }

  public void thread205076(int [] tdone, int [] ends){
        S204329=1;
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

  public void thread205075(int [] tdone, int [] ends){
        S204321=1;
    active[43]=1;
    ends[43]=1;
    tdone[43]=1;
  }

  public void thread205074(int [] tdone, int [] ends){
        S204318=1;
    zoneOcc_thread_42 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_42 = (Integer)(zoneTwoLightingI.getpreval() == null ? 0 : ((Integer)zoneTwoLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204309=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_42 > 0 && zoneLightInt_thread_42 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneTwoLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneTwoLightONOFF);
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S204309=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread205072(int [] tdone, int [] ends){
        S204329=1;
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

  public void thread205071(int [] tdone, int [] ends){
        S204321=1;
    active[43]=1;
    ends[43]=1;
    tdone[43]=1;
  }

  public void thread205070(int [] tdone, int [] ends){
        S204318=1;
    zoneOcc_thread_42 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_42 = (Integer)(zoneTwoLightingI.getpreval() == null ? 0 : ((Integer)zoneTwoLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204309=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_42 > 0 && zoneLightInt_thread_42 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneTwoLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneTwoLightONOFF);
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S204309=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread205068(int [] tdone, int [] ends){
        switch(S204329){
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

  public void thread205067(int [] tdone, int [] ends){
        switch(S204321){
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

  public void thread205066(int [] tdone, int [] ends){
        switch(S204318){
      case 0 : 
        active[42]=0;
        ends[42]=0;
        tdone[42]=1;
        break;
      
      case 1 : 
        switch(S204309){
          case 0 : 
            zoneTwoLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
            currsigs.addElement(zoneTwoLightONOFF);
            active[42]=1;
            ends[42]=1;
            tdone[42]=1;
            break;
          
          case 1 : 
            S204309=1;
            S204318=0;
            active[42]=0;
            ends[42]=0;
            tdone[42]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread205065(int [] tdone, int [] ends){
        switch(S204398){
      case 0 : 
        active[41]=0;
        ends[41]=0;
        tdone[41]=1;
        break;
      
      case 1 : 
        test_41.setClear();//sysj\ECS.sysj line: 37, column: 5
        thread205066(tdone,ends);
        thread205067(tdone,ends);
        thread205068(tdone,ends);
        int biggest205069 = 0;
        if(ends[42]>=biggest205069){
          biggest205069=ends[42];
        }
        if(ends[43]>=biggest205069){
          biggest205069=ends[43];
        }
        if(ends[44]>=biggest205069){
          biggest205069=ends[44];
        }
        if(biggest205069 == 1){
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
        if(biggest205069 == 2){
          ends[41]=2;
          ;//sysj\ECS.sysj line: 39, column: 5
          thread205070(tdone,ends);
          thread205071(tdone,ends);
          thread205072(tdone,ends);
          int biggest205073 = 0;
          if(ends[42]>=biggest205073){
            biggest205073=ends[42];
          }
          if(ends[43]>=biggest205073){
            biggest205073=ends[43];
          }
          if(ends[44]>=biggest205073){
            biggest205073=ends[44];
          }
          if(biggest205073 == 1){
            active[41]=1;
            ends[41]=1;
            tdone[41]=1;
          }
        }
        //FINXME code
        if(biggest205069 == 0){
          thread205074(tdone,ends);
          thread205075(tdone,ends);
          thread205076(tdone,ends);
          int biggest205077 = 0;
          if(ends[42]>=biggest205077){
            biggest205077=ends[42];
          }
          if(ends[43]>=biggest205077){
            biggest205077=ends[43];
          }
          if(ends[44]>=biggest205077){
            biggest205077=ends[44];
          }
          if(biggest205077 == 1){
            active[41]=1;
            ends[41]=1;
            tdone[41]=1;
          }
        }
        break;
      
    }
  }

  public void thread205063(int [] tdone, int [] ends){
        S204237=1;
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

  public void thread205062(int [] tdone, int [] ends){
        S204229=1;
    active[39]=1;
    ends[39]=1;
    tdone[39]=1;
  }

  public void thread205061(int [] tdone, int [] ends){
        S204226=1;
    zoneOcc_thread_38 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_38 = (Integer)(zoneOneLightingI.getpreval() == null ? 0 : ((Integer)zoneOneLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204217=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_38 > 0 && zoneLightInt_thread_38 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneOneLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneOneLightONOFF);
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      S204217=1;
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread205059(int [] tdone, int [] ends){
        S204237=1;
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

  public void thread205058(int [] tdone, int [] ends){
        S204229=1;
    active[39]=1;
    ends[39]=1;
    tdone[39]=1;
  }

  public void thread205057(int [] tdone, int [] ends){
        S204226=1;
    zoneOcc_thread_38 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_38 = (Integer)(zoneOneLightingI.getpreval() == null ? 0 : ((Integer)zoneOneLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204217=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_38 > 0 && zoneLightInt_thread_38 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneOneLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneOneLightONOFF);
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      S204217=1;
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread205055(int [] tdone, int [] ends){
        switch(S204237){
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

  public void thread205054(int [] tdone, int [] ends){
        switch(S204229){
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

  public void thread205053(int [] tdone, int [] ends){
        switch(S204226){
      case 0 : 
        active[38]=0;
        ends[38]=0;
        tdone[38]=1;
        break;
      
      case 1 : 
        switch(S204217){
          case 0 : 
            zoneOneLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
            currsigs.addElement(zoneOneLightONOFF);
            active[38]=1;
            ends[38]=1;
            tdone[38]=1;
            break;
          
          case 1 : 
            S204217=1;
            S204226=0;
            active[38]=0;
            ends[38]=0;
            tdone[38]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread205052(int [] tdone, int [] ends){
        switch(S204306){
      case 0 : 
        active[37]=0;
        ends[37]=0;
        tdone[37]=1;
        break;
      
      case 1 : 
        test_37.setClear();//sysj\ECS.sysj line: 37, column: 5
        thread205053(tdone,ends);
        thread205054(tdone,ends);
        thread205055(tdone,ends);
        int biggest205056 = 0;
        if(ends[38]>=biggest205056){
          biggest205056=ends[38];
        }
        if(ends[39]>=biggest205056){
          biggest205056=ends[39];
        }
        if(ends[40]>=biggest205056){
          biggest205056=ends[40];
        }
        if(biggest205056 == 1){
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
        if(biggest205056 == 2){
          ends[37]=2;
          ;//sysj\ECS.sysj line: 39, column: 5
          thread205057(tdone,ends);
          thread205058(tdone,ends);
          thread205059(tdone,ends);
          int biggest205060 = 0;
          if(ends[38]>=biggest205060){
            biggest205060=ends[38];
          }
          if(ends[39]>=biggest205060){
            biggest205060=ends[39];
          }
          if(ends[40]>=biggest205060){
            biggest205060=ends[40];
          }
          if(biggest205060 == 1){
            active[37]=1;
            ends[37]=1;
            tdone[37]=1;
          }
        }
        //FINXME code
        if(biggest205056 == 0){
          thread205061(tdone,ends);
          thread205062(tdone,ends);
          thread205063(tdone,ends);
          int biggest205064 = 0;
          if(ends[38]>=biggest205064){
            biggest205064=ends[38];
          }
          if(ends[39]>=biggest205064){
            biggest205064=ends[39];
          }
          if(ends[40]>=biggest205064){
            biggest205064=ends[40];
          }
          if(biggest205064 == 1){
            active[37]=1;
            ends[37]=1;
            tdone[37]=1;
          }
        }
        break;
      
    }
  }

  public void thread205050(int [] tdone, int [] ends){
        S204145=1;
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

  public void thread205049(int [] tdone, int [] ends){
        S204137=1;
    active[35]=1;
    ends[35]=1;
    tdone[35]=1;
  }

  public void thread205048(int [] tdone, int [] ends){
        S204134=1;
    zoneOcc_thread_34 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_34 = (Integer)(zoneSevenLightingI.getpreval() == null ? 0 : ((Integer)zoneSevenLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S204125=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_34 > 0 && zoneLightInt_thread_34 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneSevenWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneSevenWindowONOFF);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S204125=1;
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread205046(int [] tdone, int [] ends){
        S204145=1;
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

  public void thread205045(int [] tdone, int [] ends){
        S204137=1;
    active[35]=1;
    ends[35]=1;
    tdone[35]=1;
  }

  public void thread205044(int [] tdone, int [] ends){
        S204134=1;
    zoneOcc_thread_34 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_34 = (Integer)(zoneSevenLightingI.getpreval() == null ? 0 : ((Integer)zoneSevenLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S204125=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_34 > 0 && zoneLightInt_thread_34 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneSevenWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneSevenWindowONOFF);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S204125=1;
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread205042(int [] tdone, int [] ends){
        switch(S204145){
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

  public void thread205041(int [] tdone, int [] ends){
        switch(S204137){
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

  public void thread205040(int [] tdone, int [] ends){
        switch(S204134){
      case 0 : 
        active[34]=0;
        ends[34]=0;
        tdone[34]=1;
        break;
      
      case 1 : 
        switch(S204125){
          case 0 : 
            zoneSevenWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
            currsigs.addElement(zoneSevenWindowONOFF);
            active[34]=1;
            ends[34]=1;
            tdone[34]=1;
            break;
          
          case 1 : 
            S204125=1;
            S204134=0;
            active[34]=0;
            ends[34]=0;
            tdone[34]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread205039(int [] tdone, int [] ends){
        switch(S204214){
      case 0 : 
        active[33]=0;
        ends[33]=0;
        tdone[33]=1;
        break;
      
      case 1 : 
        test_33.setClear();//sysj\ECS.sysj line: 3, column: 5
        thread205040(tdone,ends);
        thread205041(tdone,ends);
        thread205042(tdone,ends);
        int biggest205043 = 0;
        if(ends[34]>=biggest205043){
          biggest205043=ends[34];
        }
        if(ends[35]>=biggest205043){
          biggest205043=ends[35];
        }
        if(ends[36]>=biggest205043){
          biggest205043=ends[36];
        }
        if(biggest205043 == 1){
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
        if(biggest205043 == 2){
          ends[33]=2;
          ;//sysj\ECS.sysj line: 5, column: 5
          thread205044(tdone,ends);
          thread205045(tdone,ends);
          thread205046(tdone,ends);
          int biggest205047 = 0;
          if(ends[34]>=biggest205047){
            biggest205047=ends[34];
          }
          if(ends[35]>=biggest205047){
            biggest205047=ends[35];
          }
          if(ends[36]>=biggest205047){
            biggest205047=ends[36];
          }
          if(biggest205047 == 1){
            active[33]=1;
            ends[33]=1;
            tdone[33]=1;
          }
        }
        //FINXME code
        if(biggest205043 == 0){
          thread205048(tdone,ends);
          thread205049(tdone,ends);
          thread205050(tdone,ends);
          int biggest205051 = 0;
          if(ends[34]>=biggest205051){
            biggest205051=ends[34];
          }
          if(ends[35]>=biggest205051){
            biggest205051=ends[35];
          }
          if(ends[36]>=biggest205051){
            biggest205051=ends[36];
          }
          if(biggest205051 == 1){
            active[33]=1;
            ends[33]=1;
            tdone[33]=1;
          }
        }
        break;
      
    }
  }

  public void thread205037(int [] tdone, int [] ends){
        S204053=1;
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

  public void thread205036(int [] tdone, int [] ends){
        S204045=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread205035(int [] tdone, int [] ends){
        S204042=1;
    zoneOcc_thread_30 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_30 = (Integer)(zoneSixLightingI.getpreval() == null ? 0 : ((Integer)zoneSixLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S204033=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_30 > 0 && zoneLightInt_thread_30 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneSixWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneSixWindowONOFF);
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S204033=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
  }

  public void thread205033(int [] tdone, int [] ends){
        S204053=1;
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

  public void thread205032(int [] tdone, int [] ends){
        S204045=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread205031(int [] tdone, int [] ends){
        S204042=1;
    zoneOcc_thread_30 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_30 = (Integer)(zoneSixLightingI.getpreval() == null ? 0 : ((Integer)zoneSixLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S204033=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_30 > 0 && zoneLightInt_thread_30 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneSixWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneSixWindowONOFF);
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S204033=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
  }

  public void thread205029(int [] tdone, int [] ends){
        switch(S204053){
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

  public void thread205028(int [] tdone, int [] ends){
        switch(S204045){
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

  public void thread205027(int [] tdone, int [] ends){
        switch(S204042){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        switch(S204033){
          case 0 : 
            zoneSixWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
            currsigs.addElement(zoneSixWindowONOFF);
            active[30]=1;
            ends[30]=1;
            tdone[30]=1;
            break;
          
          case 1 : 
            S204033=1;
            S204042=0;
            active[30]=0;
            ends[30]=0;
            tdone[30]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread205026(int [] tdone, int [] ends){
        switch(S204122){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        test_29.setClear();//sysj\ECS.sysj line: 3, column: 5
        thread205027(tdone,ends);
        thread205028(tdone,ends);
        thread205029(tdone,ends);
        int biggest205030 = 0;
        if(ends[30]>=biggest205030){
          biggest205030=ends[30];
        }
        if(ends[31]>=biggest205030){
          biggest205030=ends[31];
        }
        if(ends[32]>=biggest205030){
          biggest205030=ends[32];
        }
        if(biggest205030 == 1){
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
        if(biggest205030 == 2){
          ends[29]=2;
          ;//sysj\ECS.sysj line: 5, column: 5
          thread205031(tdone,ends);
          thread205032(tdone,ends);
          thread205033(tdone,ends);
          int biggest205034 = 0;
          if(ends[30]>=biggest205034){
            biggest205034=ends[30];
          }
          if(ends[31]>=biggest205034){
            biggest205034=ends[31];
          }
          if(ends[32]>=biggest205034){
            biggest205034=ends[32];
          }
          if(biggest205034 == 1){
            active[29]=1;
            ends[29]=1;
            tdone[29]=1;
          }
        }
        //FINXME code
        if(biggest205030 == 0){
          thread205035(tdone,ends);
          thread205036(tdone,ends);
          thread205037(tdone,ends);
          int biggest205038 = 0;
          if(ends[30]>=biggest205038){
            biggest205038=ends[30];
          }
          if(ends[31]>=biggest205038){
            biggest205038=ends[31];
          }
          if(ends[32]>=biggest205038){
            biggest205038=ends[32];
          }
          if(biggest205038 == 1){
            active[29]=1;
            ends[29]=1;
            tdone[29]=1;
          }
        }
        break;
      
    }
  }

  public void thread205024(int [] tdone, int [] ends){
        S203961=1;
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

  public void thread205023(int [] tdone, int [] ends){
        S203953=1;
    active[27]=1;
    ends[27]=1;
    tdone[27]=1;
  }

  public void thread205022(int [] tdone, int [] ends){
        S203950=1;
    zoneOcc_thread_26 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_26 = (Integer)(zoneFiveLightingI.getpreval() == null ? 0 : ((Integer)zoneFiveLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S203941=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_26 > 0 && zoneLightInt_thread_26 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneFiveWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneFiveWindowONOFF);
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
    else {
      S203941=1;
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread205020(int [] tdone, int [] ends){
        S203961=1;
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

  public void thread205019(int [] tdone, int [] ends){
        S203953=1;
    active[27]=1;
    ends[27]=1;
    tdone[27]=1;
  }

  public void thread205018(int [] tdone, int [] ends){
        S203950=1;
    zoneOcc_thread_26 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_26 = (Integer)(zoneFiveLightingI.getpreval() == null ? 0 : ((Integer)zoneFiveLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S203941=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_26 > 0 && zoneLightInt_thread_26 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneFiveWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneFiveWindowONOFF);
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
    else {
      S203941=1;
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread205016(int [] tdone, int [] ends){
        switch(S203961){
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

  public void thread205015(int [] tdone, int [] ends){
        switch(S203953){
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

  public void thread205014(int [] tdone, int [] ends){
        switch(S203950){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        switch(S203941){
          case 0 : 
            zoneFiveWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
            currsigs.addElement(zoneFiveWindowONOFF);
            active[26]=1;
            ends[26]=1;
            tdone[26]=1;
            break;
          
          case 1 : 
            S203941=1;
            S203950=0;
            active[26]=0;
            ends[26]=0;
            tdone[26]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread205013(int [] tdone, int [] ends){
        switch(S204030){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        test_25.setClear();//sysj\ECS.sysj line: 3, column: 5
        thread205014(tdone,ends);
        thread205015(tdone,ends);
        thread205016(tdone,ends);
        int biggest205017 = 0;
        if(ends[26]>=biggest205017){
          biggest205017=ends[26];
        }
        if(ends[27]>=biggest205017){
          biggest205017=ends[27];
        }
        if(ends[28]>=biggest205017){
          biggest205017=ends[28];
        }
        if(biggest205017 == 1){
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
        if(biggest205017 == 2){
          ends[25]=2;
          ;//sysj\ECS.sysj line: 5, column: 5
          thread205018(tdone,ends);
          thread205019(tdone,ends);
          thread205020(tdone,ends);
          int biggest205021 = 0;
          if(ends[26]>=biggest205021){
            biggest205021=ends[26];
          }
          if(ends[27]>=biggest205021){
            biggest205021=ends[27];
          }
          if(ends[28]>=biggest205021){
            biggest205021=ends[28];
          }
          if(biggest205021 == 1){
            active[25]=1;
            ends[25]=1;
            tdone[25]=1;
          }
        }
        //FINXME code
        if(biggest205017 == 0){
          thread205022(tdone,ends);
          thread205023(tdone,ends);
          thread205024(tdone,ends);
          int biggest205025 = 0;
          if(ends[26]>=biggest205025){
            biggest205025=ends[26];
          }
          if(ends[27]>=biggest205025){
            biggest205025=ends[27];
          }
          if(ends[28]>=biggest205025){
            biggest205025=ends[28];
          }
          if(biggest205025 == 1){
            active[25]=1;
            ends[25]=1;
            tdone[25]=1;
          }
        }
        break;
      
    }
  }

  public void thread205011(int [] tdone, int [] ends){
        S203869=1;
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

  public void thread205010(int [] tdone, int [] ends){
        S203861=1;
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread205009(int [] tdone, int [] ends){
        S203858=1;
    zoneOcc_thread_22 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_22 = (Integer)(zoneFourLightingI.getpreval() == null ? 0 : ((Integer)zoneFourLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S203849=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_22 > 0 && zoneLightInt_thread_22 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneFourWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneFourWindowONOFF);
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S203849=1;
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread205007(int [] tdone, int [] ends){
        S203869=1;
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

  public void thread205006(int [] tdone, int [] ends){
        S203861=1;
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread205005(int [] tdone, int [] ends){
        S203858=1;
    zoneOcc_thread_22 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_22 = (Integer)(zoneFourLightingI.getpreval() == null ? 0 : ((Integer)zoneFourLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S203849=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_22 > 0 && zoneLightInt_thread_22 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneFourWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneFourWindowONOFF);
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S203849=1;
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread205003(int [] tdone, int [] ends){
        switch(S203869){
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

  public void thread205002(int [] tdone, int [] ends){
        switch(S203861){
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

  public void thread205001(int [] tdone, int [] ends){
        switch(S203858){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        switch(S203849){
          case 0 : 
            zoneFourWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
            currsigs.addElement(zoneFourWindowONOFF);
            active[22]=1;
            ends[22]=1;
            tdone[22]=1;
            break;
          
          case 1 : 
            S203849=1;
            S203858=0;
            active[22]=0;
            ends[22]=0;
            tdone[22]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread205000(int [] tdone, int [] ends){
        switch(S203938){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        test_21.setClear();//sysj\ECS.sysj line: 3, column: 5
        thread205001(tdone,ends);
        thread205002(tdone,ends);
        thread205003(tdone,ends);
        int biggest205004 = 0;
        if(ends[22]>=biggest205004){
          biggest205004=ends[22];
        }
        if(ends[23]>=biggest205004){
          biggest205004=ends[23];
        }
        if(ends[24]>=biggest205004){
          biggest205004=ends[24];
        }
        if(biggest205004 == 1){
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        if(biggest205004 == 2){
          ends[21]=2;
          ;//sysj\ECS.sysj line: 5, column: 5
          thread205005(tdone,ends);
          thread205006(tdone,ends);
          thread205007(tdone,ends);
          int biggest205008 = 0;
          if(ends[22]>=biggest205008){
            biggest205008=ends[22];
          }
          if(ends[23]>=biggest205008){
            biggest205008=ends[23];
          }
          if(ends[24]>=biggest205008){
            biggest205008=ends[24];
          }
          if(biggest205008 == 1){
            active[21]=1;
            ends[21]=1;
            tdone[21]=1;
          }
        }
        //FINXME code
        if(biggest205004 == 0){
          thread205009(tdone,ends);
          thread205010(tdone,ends);
          thread205011(tdone,ends);
          int biggest205012 = 0;
          if(ends[22]>=biggest205012){
            biggest205012=ends[22];
          }
          if(ends[23]>=biggest205012){
            biggest205012=ends[23];
          }
          if(ends[24]>=biggest205012){
            biggest205012=ends[24];
          }
          if(biggest205012 == 1){
            active[21]=1;
            ends[21]=1;
            tdone[21]=1;
          }
        }
        break;
      
    }
  }

  public void thread204998(int [] tdone, int [] ends){
        S203777=1;
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

  public void thread204997(int [] tdone, int [] ends){
        S203769=1;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread204996(int [] tdone, int [] ends){
        S203766=1;
    zoneOcc_thread_18 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_18 = (Integer)(zoneThreeLightingI.getpreval() == null ? 0 : ((Integer)zoneThreeLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S203757=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_18 > 0 && zoneLightInt_thread_18 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneThreeWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneThreeWindowONOFF);
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
    else {
      S203757=1;
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread204994(int [] tdone, int [] ends){
        S203777=1;
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

  public void thread204993(int [] tdone, int [] ends){
        S203769=1;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread204992(int [] tdone, int [] ends){
        S203766=1;
    zoneOcc_thread_18 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_18 = (Integer)(zoneThreeLightingI.getpreval() == null ? 0 : ((Integer)zoneThreeLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S203757=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_18 > 0 && zoneLightInt_thread_18 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneThreeWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneThreeWindowONOFF);
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
    else {
      S203757=1;
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread204990(int [] tdone, int [] ends){
        switch(S203777){
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

  public void thread204989(int [] tdone, int [] ends){
        switch(S203769){
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

  public void thread204988(int [] tdone, int [] ends){
        switch(S203766){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        switch(S203757){
          case 0 : 
            zoneThreeWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
            currsigs.addElement(zoneThreeWindowONOFF);
            active[18]=1;
            ends[18]=1;
            tdone[18]=1;
            break;
          
          case 1 : 
            S203757=1;
            S203766=0;
            active[18]=0;
            ends[18]=0;
            tdone[18]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread204987(int [] tdone, int [] ends){
        switch(S203846){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        test_17.setClear();//sysj\ECS.sysj line: 3, column: 5
        thread204988(tdone,ends);
        thread204989(tdone,ends);
        thread204990(tdone,ends);
        int biggest204991 = 0;
        if(ends[18]>=biggest204991){
          biggest204991=ends[18];
        }
        if(ends[19]>=biggest204991){
          biggest204991=ends[19];
        }
        if(ends[20]>=biggest204991){
          biggest204991=ends[20];
        }
        if(biggest204991 == 1){
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
        if(biggest204991 == 2){
          ends[17]=2;
          ;//sysj\ECS.sysj line: 5, column: 5
          thread204992(tdone,ends);
          thread204993(tdone,ends);
          thread204994(tdone,ends);
          int biggest204995 = 0;
          if(ends[18]>=biggest204995){
            biggest204995=ends[18];
          }
          if(ends[19]>=biggest204995){
            biggest204995=ends[19];
          }
          if(ends[20]>=biggest204995){
            biggest204995=ends[20];
          }
          if(biggest204995 == 1){
            active[17]=1;
            ends[17]=1;
            tdone[17]=1;
          }
        }
        //FINXME code
        if(biggest204991 == 0){
          thread204996(tdone,ends);
          thread204997(tdone,ends);
          thread204998(tdone,ends);
          int biggest204999 = 0;
          if(ends[18]>=biggest204999){
            biggest204999=ends[18];
          }
          if(ends[19]>=biggest204999){
            biggest204999=ends[19];
          }
          if(ends[20]>=biggest204999){
            biggest204999=ends[20];
          }
          if(biggest204999 == 1){
            active[17]=1;
            ends[17]=1;
            tdone[17]=1;
          }
        }
        break;
      
    }
  }

  public void thread204985(int [] tdone, int [] ends){
        S203685=1;
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

  public void thread204984(int [] tdone, int [] ends){
        S203677=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread204983(int [] tdone, int [] ends){
        S203674=1;
    zoneOcc_thread_14 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_14 = (Integer)(zoneTwoLightingI.getpreval() == null ? 0 : ((Integer)zoneTwoLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S203665=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_14 > 0 && zoneLightInt_thread_14 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneTwoWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneTwoWindowONOFF);
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      S203665=1;
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread204981(int [] tdone, int [] ends){
        S203685=1;
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

  public void thread204980(int [] tdone, int [] ends){
        S203677=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread204979(int [] tdone, int [] ends){
        S203674=1;
    zoneOcc_thread_14 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_14 = (Integer)(zoneTwoLightingI.getpreval() == null ? 0 : ((Integer)zoneTwoLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S203665=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_14 > 0 && zoneLightInt_thread_14 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneTwoWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneTwoWindowONOFF);
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      S203665=1;
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread204977(int [] tdone, int [] ends){
        switch(S203685){
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

  public void thread204976(int [] tdone, int [] ends){
        switch(S203677){
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

  public void thread204975(int [] tdone, int [] ends){
        switch(S203674){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        switch(S203665){
          case 0 : 
            zoneTwoWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
            currsigs.addElement(zoneTwoWindowONOFF);
            active[14]=1;
            ends[14]=1;
            tdone[14]=1;
            break;
          
          case 1 : 
            S203665=1;
            S203674=0;
            active[14]=0;
            ends[14]=0;
            tdone[14]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread204974(int [] tdone, int [] ends){
        switch(S203754){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        test_13.setClear();//sysj\ECS.sysj line: 3, column: 5
        thread204975(tdone,ends);
        thread204976(tdone,ends);
        thread204977(tdone,ends);
        int biggest204978 = 0;
        if(ends[14]>=biggest204978){
          biggest204978=ends[14];
        }
        if(ends[15]>=biggest204978){
          biggest204978=ends[15];
        }
        if(ends[16]>=biggest204978){
          biggest204978=ends[16];
        }
        if(biggest204978 == 1){
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        if(biggest204978 == 2){
          ends[13]=2;
          ;//sysj\ECS.sysj line: 5, column: 5
          thread204979(tdone,ends);
          thread204980(tdone,ends);
          thread204981(tdone,ends);
          int biggest204982 = 0;
          if(ends[14]>=biggest204982){
            biggest204982=ends[14];
          }
          if(ends[15]>=biggest204982){
            biggest204982=ends[15];
          }
          if(ends[16]>=biggest204982){
            biggest204982=ends[16];
          }
          if(biggest204982 == 1){
            active[13]=1;
            ends[13]=1;
            tdone[13]=1;
          }
        }
        //FINXME code
        if(biggest204978 == 0){
          thread204983(tdone,ends);
          thread204984(tdone,ends);
          thread204985(tdone,ends);
          int biggest204986 = 0;
          if(ends[14]>=biggest204986){
            biggest204986=ends[14];
          }
          if(ends[15]>=biggest204986){
            biggest204986=ends[15];
          }
          if(ends[16]>=biggest204986){
            biggest204986=ends[16];
          }
          if(biggest204986 == 1){
            active[13]=1;
            ends[13]=1;
            tdone[13]=1;
          }
        }
        break;
      
    }
  }

  public void thread204972(int [] tdone, int [] ends){
        S203593=1;
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

  public void thread204971(int [] tdone, int [] ends){
        S203585=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread204970(int [] tdone, int [] ends){
        S203582=1;
    zoneOcc_thread_10 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_10 = (Integer)(zoneOneLightingI.getpreval() == null ? 0 : ((Integer)zoneOneLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S203573=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_10 > 0 && zoneLightInt_thread_10 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneOneWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneOneWindowONOFF);
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      S203573=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread204968(int [] tdone, int [] ends){
        S203593=1;
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

  public void thread204967(int [] tdone, int [] ends){
        S203585=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread204966(int [] tdone, int [] ends){
        S203582=1;
    zoneOcc_thread_10 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_10 = (Integer)(zoneOneLightingI.getpreval() == null ? 0 : ((Integer)zoneOneLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S203573=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_10 > 0 && zoneLightInt_thread_10 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneOneWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneOneWindowONOFF);
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      S203573=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread204964(int [] tdone, int [] ends){
        switch(S203593){
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

  public void thread204963(int [] tdone, int [] ends){
        switch(S203585){
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

  public void thread204962(int [] tdone, int [] ends){
        switch(S203582){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S203573){
          case 0 : 
            zoneOneWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
            currsigs.addElement(zoneOneWindowONOFF);
            active[10]=1;
            ends[10]=1;
            tdone[10]=1;
            break;
          
          case 1 : 
            S203573=1;
            S203582=0;
            active[10]=0;
            ends[10]=0;
            tdone[10]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread204961(int [] tdone, int [] ends){
        switch(S203662){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        test_9.setClear();//sysj\ECS.sysj line: 3, column: 5
        thread204962(tdone,ends);
        thread204963(tdone,ends);
        thread204964(tdone,ends);
        int biggest204965 = 0;
        if(ends[10]>=biggest204965){
          biggest204965=ends[10];
        }
        if(ends[11]>=biggest204965){
          biggest204965=ends[11];
        }
        if(ends[12]>=biggest204965){
          biggest204965=ends[12];
        }
        if(biggest204965 == 1){
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        if(biggest204965 == 2){
          ends[9]=2;
          ;//sysj\ECS.sysj line: 5, column: 5
          thread204966(tdone,ends);
          thread204967(tdone,ends);
          thread204968(tdone,ends);
          int biggest204969 = 0;
          if(ends[10]>=biggest204969){
            biggest204969=ends[10];
          }
          if(ends[11]>=biggest204969){
            biggest204969=ends[11];
          }
          if(ends[12]>=biggest204969){
            biggest204969=ends[12];
          }
          if(biggest204969 == 1){
            active[9]=1;
            ends[9]=1;
            tdone[9]=1;
          }
        }
        //FINXME code
        if(biggest204965 == 0){
          thread204970(tdone,ends);
          thread204971(tdone,ends);
          thread204972(tdone,ends);
          int biggest204973 = 0;
          if(ends[10]>=biggest204973){
            biggest204973=ends[10];
          }
          if(ends[11]>=biggest204973){
            biggest204973=ends[11];
          }
          if(ends[12]>=biggest204973){
            biggest204973=ends[12];
          }
          if(biggest204973 == 1){
            active[9]=1;
            ends[9]=1;
            tdone[9]=1;
          }
        }
        break;
      
    }
  }

  public void thread204960(int [] tdone, int [] ends){
        switch(S204860){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        thread204961(tdone,ends);
        thread204974(tdone,ends);
        thread204987(tdone,ends);
        thread205000(tdone,ends);
        thread205013(tdone,ends);
        thread205026(tdone,ends);
        thread205039(tdone,ends);
        thread205052(tdone,ends);
        thread205065(tdone,ends);
        thread205078(tdone,ends);
        thread205091(tdone,ends);
        thread205104(tdone,ends);
        thread205117(tdone,ends);
        thread205130(tdone,ends);
        int biggest205143 = 0;
        if(ends[9]>=biggest205143){
          biggest205143=ends[9];
        }
        if(ends[13]>=biggest205143){
          biggest205143=ends[13];
        }
        if(ends[17]>=biggest205143){
          biggest205143=ends[17];
        }
        if(ends[21]>=biggest205143){
          biggest205143=ends[21];
        }
        if(ends[25]>=biggest205143){
          biggest205143=ends[25];
        }
        if(ends[29]>=biggest205143){
          biggest205143=ends[29];
        }
        if(ends[33]>=biggest205143){
          biggest205143=ends[33];
        }
        if(ends[37]>=biggest205143){
          biggest205143=ends[37];
        }
        if(ends[41]>=biggest205143){
          biggest205143=ends[41];
        }
        if(ends[45]>=biggest205143){
          biggest205143=ends[45];
        }
        if(ends[49]>=biggest205143){
          biggest205143=ends[49];
        }
        if(ends[53]>=biggest205143){
          biggest205143=ends[53];
        }
        if(ends[57]>=biggest205143){
          biggest205143=ends[57];
        }
        if(ends[61]>=biggest205143){
          biggest205143=ends[61];
        }
        if(biggest205143 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        //FINXME code
        if(biggest205143 == 0){
          S204860=0;
          active[8]=0;
          ends[8]=0;
          tdone[8]=1;
        }
        break;
      
    }
  }

  public void thread204959(int [] tdone, int [] ends){
        switch(S203570){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S203520){
          case 0 : 
            if(currentTime_2.getprestatus()){//sysj\ECS.sysj line: 351, column: 14
              currentHour_thread_7 = (Integer)(currentTime_2.getpreval() == null ? 0 : ((Integer)currentTime_2.getpreval()).intValue());//sysj\ECS.sysj line: 352, column: 8
              S203520=1;
              if(currentHour_thread_7 >= 9 && currentHour_thread_7 <= 17){//sysj\ECS.sysj line: 354, column: 16
                S203524=0;
                workhrs_6.setPresent();//sysj\ECS.sysj line: 355, column: 16
                currsigs.addElement(workhrs_6);
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
              else {
                S203524=1;
                if((currentHour_thread_7 >= 18 && currentHour_thread_7 <= 24) || (currentHour_thread_7 >= 0 && currentHour_thread_7 < 9)){//sysj\ECS.sysj line: 359, column: 23
                  afterhrs_6.setPresent();//sysj\ECS.sysj line: 360, column: 16
                  currsigs.addElement(afterhrs_6);
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  S203520=0;
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
            switch(S203524){
              case 0 : 
                S203520=0;
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
                break;
              
              case 1 : 
                S203520=0;
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

  public void thread204955(int [] tdone, int [] ends){
        S204789=1;
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

  public void thread204954(int [] tdone, int [] ends){
        S204781=1;
    active[63]=1;
    ends[63]=1;
    tdone[63]=1;
  }

  public void thread204953(int [] tdone, int [] ends){
        S204778=1;
    zoneOcc_thread_62 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_62 = (Integer)(zoneSevenLightingI.getpreval() == null ? 0 : ((Integer)zoneSevenLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204769=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_62 > 0 && zoneLightInt_thread_62 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneSevenLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneSevenLightONOFF);
      active[62]=1;
      ends[62]=1;
      tdone[62]=1;
    }
    else {
      S204769=1;
      active[62]=1;
      ends[62]=1;
      tdone[62]=1;
    }
  }

  public void thread204952(int [] tdone, int [] ends){
        S204858=1;
    test_61.setClear();//sysj\ECS.sysj line: 37, column: 5
    thread204953(tdone,ends);
    thread204954(tdone,ends);
    thread204955(tdone,ends);
    int biggest204956 = 0;
    if(ends[62]>=biggest204956){
      biggest204956=ends[62];
    }
    if(ends[63]>=biggest204956){
      biggest204956=ends[63];
    }
    if(ends[64]>=biggest204956){
      biggest204956=ends[64];
    }
    if(biggest204956 == 1){
      active[61]=1;
      ends[61]=1;
      tdone[61]=1;
    }
  }

  public void thread204950(int [] tdone, int [] ends){
        S204697=1;
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

  public void thread204949(int [] tdone, int [] ends){
        S204689=1;
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread204948(int [] tdone, int [] ends){
        S204686=1;
    zoneOcc_thread_58 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_58 = (Integer)(zoneSixLightingI.getpreval() == null ? 0 : ((Integer)zoneSixLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204677=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_58 > 0 && zoneLightInt_thread_58 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneSixLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneSixLightONOFF);
      active[58]=1;
      ends[58]=1;
      tdone[58]=1;
    }
    else {
      S204677=1;
      active[58]=1;
      ends[58]=1;
      tdone[58]=1;
    }
  }

  public void thread204947(int [] tdone, int [] ends){
        S204766=1;
    test_57.setClear();//sysj\ECS.sysj line: 37, column: 5
    thread204948(tdone,ends);
    thread204949(tdone,ends);
    thread204950(tdone,ends);
    int biggest204951 = 0;
    if(ends[58]>=biggest204951){
      biggest204951=ends[58];
    }
    if(ends[59]>=biggest204951){
      biggest204951=ends[59];
    }
    if(ends[60]>=biggest204951){
      biggest204951=ends[60];
    }
    if(biggest204951 == 1){
      active[57]=1;
      ends[57]=1;
      tdone[57]=1;
    }
  }

  public void thread204945(int [] tdone, int [] ends){
        S204605=1;
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

  public void thread204944(int [] tdone, int [] ends){
        S204597=1;
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread204943(int [] tdone, int [] ends){
        S204594=1;
    zoneOcc_thread_54 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_54 = (Integer)(zoneFiveLightingI.getpreval() == null ? 0 : ((Integer)zoneFiveLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204585=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_54 > 0 && zoneLightInt_thread_54 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneFiveLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneFiveLightONOFF);
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
    else {
      S204585=1;
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
  }

  public void thread204942(int [] tdone, int [] ends){
        S204674=1;
    test_53.setClear();//sysj\ECS.sysj line: 37, column: 5
    thread204943(tdone,ends);
    thread204944(tdone,ends);
    thread204945(tdone,ends);
    int biggest204946 = 0;
    if(ends[54]>=biggest204946){
      biggest204946=ends[54];
    }
    if(ends[55]>=biggest204946){
      biggest204946=ends[55];
    }
    if(ends[56]>=biggest204946){
      biggest204946=ends[56];
    }
    if(biggest204946 == 1){
      active[53]=1;
      ends[53]=1;
      tdone[53]=1;
    }
  }

  public void thread204940(int [] tdone, int [] ends){
        S204513=1;
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

  public void thread204939(int [] tdone, int [] ends){
        S204505=1;
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread204938(int [] tdone, int [] ends){
        S204502=1;
    zoneOcc_thread_50 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_50 = (Integer)(zoneFourLightingI.getpreval() == null ? 0 : ((Integer)zoneFourLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204493=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_50 > 0 && zoneLightInt_thread_50 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneFourLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneFourLightONOFF);
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
    else {
      S204493=1;
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
  }

  public void thread204937(int [] tdone, int [] ends){
        S204582=1;
    test_49.setClear();//sysj\ECS.sysj line: 37, column: 5
    thread204938(tdone,ends);
    thread204939(tdone,ends);
    thread204940(tdone,ends);
    int biggest204941 = 0;
    if(ends[50]>=biggest204941){
      biggest204941=ends[50];
    }
    if(ends[51]>=biggest204941){
      biggest204941=ends[51];
    }
    if(ends[52]>=biggest204941){
      biggest204941=ends[52];
    }
    if(biggest204941 == 1){
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
  }

  public void thread204935(int [] tdone, int [] ends){
        S204421=1;
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

  public void thread204934(int [] tdone, int [] ends){
        S204413=1;
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread204933(int [] tdone, int [] ends){
        S204410=1;
    zoneOcc_thread_46 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_46 = (Integer)(zoneThreeLightingI.getpreval() == null ? 0 : ((Integer)zoneThreeLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204401=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_46 > 0 && zoneLightInt_thread_46 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneThreeLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneThreeLightONOFF);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S204401=1;
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
  }

  public void thread204932(int [] tdone, int [] ends){
        S204490=1;
    test_45.setClear();//sysj\ECS.sysj line: 37, column: 5
    thread204933(tdone,ends);
    thread204934(tdone,ends);
    thread204935(tdone,ends);
    int biggest204936 = 0;
    if(ends[46]>=biggest204936){
      biggest204936=ends[46];
    }
    if(ends[47]>=biggest204936){
      biggest204936=ends[47];
    }
    if(ends[48]>=biggest204936){
      biggest204936=ends[48];
    }
    if(biggest204936 == 1){
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
  }

  public void thread204930(int [] tdone, int [] ends){
        S204329=1;
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

  public void thread204929(int [] tdone, int [] ends){
        S204321=1;
    active[43]=1;
    ends[43]=1;
    tdone[43]=1;
  }

  public void thread204928(int [] tdone, int [] ends){
        S204318=1;
    zoneOcc_thread_42 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_42 = (Integer)(zoneTwoLightingI.getpreval() == null ? 0 : ((Integer)zoneTwoLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204309=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_42 > 0 && zoneLightInt_thread_42 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneTwoLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneTwoLightONOFF);
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S204309=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread204927(int [] tdone, int [] ends){
        S204398=1;
    test_41.setClear();//sysj\ECS.sysj line: 37, column: 5
    thread204928(tdone,ends);
    thread204929(tdone,ends);
    thread204930(tdone,ends);
    int biggest204931 = 0;
    if(ends[42]>=biggest204931){
      biggest204931=ends[42];
    }
    if(ends[43]>=biggest204931){
      biggest204931=ends[43];
    }
    if(ends[44]>=biggest204931){
      biggest204931=ends[44];
    }
    if(biggest204931 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread204925(int [] tdone, int [] ends){
        S204237=1;
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

  public void thread204924(int [] tdone, int [] ends){
        S204229=1;
    active[39]=1;
    ends[39]=1;
    tdone[39]=1;
  }

  public void thread204923(int [] tdone, int [] ends){
        S204226=1;
    zoneOcc_thread_38 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_38 = (Integer)(zoneOneLightingI.getpreval() == null ? 0 : ((Integer)zoneOneLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S204217=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_38 > 0 && zoneLightInt_thread_38 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneOneLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneOneLightONOFF);
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      S204217=1;
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread204922(int [] tdone, int [] ends){
        S204306=1;
    test_37.setClear();//sysj\ECS.sysj line: 37, column: 5
    thread204923(tdone,ends);
    thread204924(tdone,ends);
    thread204925(tdone,ends);
    int biggest204926 = 0;
    if(ends[38]>=biggest204926){
      biggest204926=ends[38];
    }
    if(ends[39]>=biggest204926){
      biggest204926=ends[39];
    }
    if(ends[40]>=biggest204926){
      biggest204926=ends[40];
    }
    if(biggest204926 == 1){
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
  }

  public void thread204920(int [] tdone, int [] ends){
        S204145=1;
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

  public void thread204919(int [] tdone, int [] ends){
        S204137=1;
    active[35]=1;
    ends[35]=1;
    tdone[35]=1;
  }

  public void thread204918(int [] tdone, int [] ends){
        S204134=1;
    zoneOcc_thread_34 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_34 = (Integer)(zoneSevenLightingI.getpreval() == null ? 0 : ((Integer)zoneSevenLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S204125=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_34 > 0 && zoneLightInt_thread_34 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneSevenWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneSevenWindowONOFF);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S204125=1;
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread204917(int [] tdone, int [] ends){
        S204214=1;
    test_33.setClear();//sysj\ECS.sysj line: 3, column: 5
    thread204918(tdone,ends);
    thread204919(tdone,ends);
    thread204920(tdone,ends);
    int biggest204921 = 0;
    if(ends[34]>=biggest204921){
      biggest204921=ends[34];
    }
    if(ends[35]>=biggest204921){
      biggest204921=ends[35];
    }
    if(ends[36]>=biggest204921){
      biggest204921=ends[36];
    }
    if(biggest204921 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
  }

  public void thread204915(int [] tdone, int [] ends){
        S204053=1;
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

  public void thread204914(int [] tdone, int [] ends){
        S204045=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread204913(int [] tdone, int [] ends){
        S204042=1;
    zoneOcc_thread_30 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_30 = (Integer)(zoneSixLightingI.getpreval() == null ? 0 : ((Integer)zoneSixLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S204033=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_30 > 0 && zoneLightInt_thread_30 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneSixWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneSixWindowONOFF);
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S204033=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
  }

  public void thread204912(int [] tdone, int [] ends){
        S204122=1;
    test_29.setClear();//sysj\ECS.sysj line: 3, column: 5
    thread204913(tdone,ends);
    thread204914(tdone,ends);
    thread204915(tdone,ends);
    int biggest204916 = 0;
    if(ends[30]>=biggest204916){
      biggest204916=ends[30];
    }
    if(ends[31]>=biggest204916){
      biggest204916=ends[31];
    }
    if(ends[32]>=biggest204916){
      biggest204916=ends[32];
    }
    if(biggest204916 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread204910(int [] tdone, int [] ends){
        S203961=1;
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

  public void thread204909(int [] tdone, int [] ends){
        S203953=1;
    active[27]=1;
    ends[27]=1;
    tdone[27]=1;
  }

  public void thread204908(int [] tdone, int [] ends){
        S203950=1;
    zoneOcc_thread_26 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_26 = (Integer)(zoneFiveLightingI.getpreval() == null ? 0 : ((Integer)zoneFiveLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S203941=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_26 > 0 && zoneLightInt_thread_26 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneFiveWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneFiveWindowONOFF);
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
    else {
      S203941=1;
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread204907(int [] tdone, int [] ends){
        S204030=1;
    test_25.setClear();//sysj\ECS.sysj line: 3, column: 5
    thread204908(tdone,ends);
    thread204909(tdone,ends);
    thread204910(tdone,ends);
    int biggest204911 = 0;
    if(ends[26]>=biggest204911){
      biggest204911=ends[26];
    }
    if(ends[27]>=biggest204911){
      biggest204911=ends[27];
    }
    if(ends[28]>=biggest204911){
      biggest204911=ends[28];
    }
    if(biggest204911 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread204905(int [] tdone, int [] ends){
        S203869=1;
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

  public void thread204904(int [] tdone, int [] ends){
        S203861=1;
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread204903(int [] tdone, int [] ends){
        S203858=1;
    zoneOcc_thread_22 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_22 = (Integer)(zoneFourLightingI.getpreval() == null ? 0 : ((Integer)zoneFourLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S203849=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_22 > 0 && zoneLightInt_thread_22 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneFourWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneFourWindowONOFF);
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S203849=1;
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread204902(int [] tdone, int [] ends){
        S203938=1;
    test_21.setClear();//sysj\ECS.sysj line: 3, column: 5
    thread204903(tdone,ends);
    thread204904(tdone,ends);
    thread204905(tdone,ends);
    int biggest204906 = 0;
    if(ends[22]>=biggest204906){
      biggest204906=ends[22];
    }
    if(ends[23]>=biggest204906){
      biggest204906=ends[23];
    }
    if(ends[24]>=biggest204906){
      biggest204906=ends[24];
    }
    if(biggest204906 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread204900(int [] tdone, int [] ends){
        S203777=1;
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

  public void thread204899(int [] tdone, int [] ends){
        S203769=1;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread204898(int [] tdone, int [] ends){
        S203766=1;
    zoneOcc_thread_18 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_18 = (Integer)(zoneThreeLightingI.getpreval() == null ? 0 : ((Integer)zoneThreeLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S203757=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_18 > 0 && zoneLightInt_thread_18 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneThreeWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneThreeWindowONOFF);
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
    else {
      S203757=1;
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread204897(int [] tdone, int [] ends){
        S203846=1;
    test_17.setClear();//sysj\ECS.sysj line: 3, column: 5
    thread204898(tdone,ends);
    thread204899(tdone,ends);
    thread204900(tdone,ends);
    int biggest204901 = 0;
    if(ends[18]>=biggest204901){
      biggest204901=ends[18];
    }
    if(ends[19]>=biggest204901){
      biggest204901=ends[19];
    }
    if(ends[20]>=biggest204901){
      biggest204901=ends[20];
    }
    if(biggest204901 == 1){
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
  }

  public void thread204895(int [] tdone, int [] ends){
        S203685=1;
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

  public void thread204894(int [] tdone, int [] ends){
        S203677=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread204893(int [] tdone, int [] ends){
        S203674=1;
    zoneOcc_thread_14 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_14 = (Integer)(zoneTwoLightingI.getpreval() == null ? 0 : ((Integer)zoneTwoLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S203665=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_14 > 0 && zoneLightInt_thread_14 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneTwoWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneTwoWindowONOFF);
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      S203665=1;
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread204892(int [] tdone, int [] ends){
        S203754=1;
    test_13.setClear();//sysj\ECS.sysj line: 3, column: 5
    thread204893(tdone,ends);
    thread204894(tdone,ends);
    thread204895(tdone,ends);
    int biggest204896 = 0;
    if(ends[14]>=biggest204896){
      biggest204896=ends[14];
    }
    if(ends[15]>=biggest204896){
      biggest204896=ends[15];
    }
    if(ends[16]>=biggest204896){
      biggest204896=ends[16];
    }
    if(biggest204896 == 1){
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread204890(int [] tdone, int [] ends){
        S203593=1;
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

  public void thread204889(int [] tdone, int [] ends){
        S203585=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread204888(int [] tdone, int [] ends){
        S203582=1;
    zoneOcc_thread_10 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_10 = (Integer)(zoneOneLightingI.getpreval() == null ? 0 : ((Integer)zoneOneLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S203573=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_10 > 0 && zoneLightInt_thread_10 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneOneWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneOneWindowONOFF);
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      S203573=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread204887(int [] tdone, int [] ends){
        S203662=1;
    test_9.setClear();//sysj\ECS.sysj line: 3, column: 5
    thread204888(tdone,ends);
    thread204889(tdone,ends);
    thread204890(tdone,ends);
    int biggest204891 = 0;
    if(ends[10]>=biggest204891){
      biggest204891=ends[10];
    }
    if(ends[11]>=biggest204891){
      biggest204891=ends[11];
    }
    if(ends[12]>=biggest204891){
      biggest204891=ends[12];
    }
    if(biggest204891 == 1){
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread204886(int [] tdone, int [] ends){
        S204860=1;
    thread204887(tdone,ends);
    thread204892(tdone,ends);
    thread204897(tdone,ends);
    thread204902(tdone,ends);
    thread204907(tdone,ends);
    thread204912(tdone,ends);
    thread204917(tdone,ends);
    thread204922(tdone,ends);
    thread204927(tdone,ends);
    thread204932(tdone,ends);
    thread204937(tdone,ends);
    thread204942(tdone,ends);
    thread204947(tdone,ends);
    thread204952(tdone,ends);
    int biggest204957 = 0;
    if(ends[9]>=biggest204957){
      biggest204957=ends[9];
    }
    if(ends[13]>=biggest204957){
      biggest204957=ends[13];
    }
    if(ends[17]>=biggest204957){
      biggest204957=ends[17];
    }
    if(ends[21]>=biggest204957){
      biggest204957=ends[21];
    }
    if(ends[25]>=biggest204957){
      biggest204957=ends[25];
    }
    if(ends[29]>=biggest204957){
      biggest204957=ends[29];
    }
    if(ends[33]>=biggest204957){
      biggest204957=ends[33];
    }
    if(ends[37]>=biggest204957){
      biggest204957=ends[37];
    }
    if(ends[41]>=biggest204957){
      biggest204957=ends[41];
    }
    if(ends[45]>=biggest204957){
      biggest204957=ends[45];
    }
    if(ends[49]>=biggest204957){
      biggest204957=ends[49];
    }
    if(ends[53]>=biggest204957){
      biggest204957=ends[53];
    }
    if(ends[57]>=biggest204957){
      biggest204957=ends[57];
    }
    if(ends[61]>=biggest204957){
      biggest204957=ends[61];
    }
    if(biggest204957 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest204957 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest204957 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest204957 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest204957 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest204957 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest204957 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest204957 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest204957 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest204957 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest204957 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest204957 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest204957 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest204957 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread204885(int [] tdone, int [] ends){
        S203570=1;
    S203520=0;
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
      switch(S204862){
        case 0 : 
          S204862=0;
          break RUN;
        
        case 1 : 
          S204862=2;
          S204862=2;
          workhrs_6.setClear();//sysj\ECS.sysj line: 347, column: 4
          afterhrs_6.setClear();//sysj\ECS.sysj line: 347, column: 4
          thread204885(tdone,ends);
          thread204886(tdone,ends);
          int biggest204958 = 0;
          if(ends[7]>=biggest204958){
            biggest204958=ends[7];
          }
          if(ends[8]>=biggest204958){
            biggest204958=ends[8];
          }
          if(biggest204958 == 1){
            active[6]=1;
            ends[6]=1;
            break RUN;
          }
        
        case 2 : 
          workhrs_6.setClear();//sysj\ECS.sysj line: 347, column: 4
          afterhrs_6.setClear();//sysj\ECS.sysj line: 347, column: 4
          thread204959(tdone,ends);
          thread204960(tdone,ends);
          int biggest205144 = 0;
          if(ends[7]>=biggest205144){
            biggest205144=ends[7];
          }
          if(ends[8]>=biggest205144){
            biggest205144=ends[8];
          }
          if(biggest205144 == 1){
            active[6]=1;
            ends[6]=1;
            break RUN;
          }
          //FINXME code
          if(biggest205144 == 0){
            S204862=0;
            active[6]=0;
            ends[6]=0;
            S204862=0;
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
