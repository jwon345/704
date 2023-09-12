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
  private int S225792 = 1;
  private int S224500 = 1;
  private int S224450 = 1;
  private int S224454 = 1;
  private int S225790 = 1;
  private int S224592 = 1;
  private int S224512 = 1;
  private int S224503 = 1;
  private int S224515 = 1;
  private int S224523 = 1;
  private int S224684 = 1;
  private int S224604 = 1;
  private int S224595 = 1;
  private int S224607 = 1;
  private int S224615 = 1;
  private int S224776 = 1;
  private int S224696 = 1;
  private int S224687 = 1;
  private int S224699 = 1;
  private int S224707 = 1;
  private int S224868 = 1;
  private int S224788 = 1;
  private int S224779 = 1;
  private int S224791 = 1;
  private int S224799 = 1;
  private int S224960 = 1;
  private int S224880 = 1;
  private int S224871 = 1;
  private int S224883 = 1;
  private int S224891 = 1;
  private int S225052 = 1;
  private int S224972 = 1;
  private int S224963 = 1;
  private int S224975 = 1;
  private int S224983 = 1;
  private int S225144 = 1;
  private int S225064 = 1;
  private int S225055 = 1;
  private int S225067 = 1;
  private int S225075 = 1;
  private int S225236 = 1;
  private int S225156 = 1;
  private int S225147 = 1;
  private int S225159 = 1;
  private int S225167 = 1;
  private int S225328 = 1;
  private int S225248 = 1;
  private int S225239 = 1;
  private int S225251 = 1;
  private int S225259 = 1;
  private int S225420 = 1;
  private int S225340 = 1;
  private int S225331 = 1;
  private int S225343 = 1;
  private int S225351 = 1;
  private int S225512 = 1;
  private int S225432 = 1;
  private int S225423 = 1;
  private int S225435 = 1;
  private int S225443 = 1;
  private int S225604 = 1;
  private int S225524 = 1;
  private int S225515 = 1;
  private int S225527 = 1;
  private int S225535 = 1;
  private int S225696 = 1;
  private int S225616 = 1;
  private int S225607 = 1;
  private int S225619 = 1;
  private int S225627 = 1;
  private int S225788 = 1;
  private int S225708 = 1;
  private int S225699 = 1;
  private int S225711 = 1;
  private int S225719 = 1;
  
  private int[] ends = new int[66];
  private int[] tdone = new int[66];
  
  public void thread226071(int [] tdone, int [] ends){
        S225719=1;
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

  public void thread226070(int [] tdone, int [] ends){
        S225711=1;
    active[63]=1;
    ends[63]=1;
    tdone[63]=1;
  }

  public void thread226069(int [] tdone, int [] ends){
        S225708=1;
    zoneOcc_thread_62 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_62 = (Integer)(zoneSevenLightingI.getpreval() == null ? 0 : ((Integer)zoneSevenLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S225699=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_62 > 0 && zoneLightInt_thread_62 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneSevenLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneSevenLightONOFF);
      active[62]=1;
      ends[62]=1;
      tdone[62]=1;
    }
    else {
      S225699=1;
      active[62]=1;
      ends[62]=1;
      tdone[62]=1;
    }
  }

  public void thread226067(int [] tdone, int [] ends){
        S225719=1;
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

  public void thread226066(int [] tdone, int [] ends){
        S225711=1;
    active[63]=1;
    ends[63]=1;
    tdone[63]=1;
  }

  public void thread226065(int [] tdone, int [] ends){
        S225708=1;
    zoneOcc_thread_62 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_62 = (Integer)(zoneSevenLightingI.getpreval() == null ? 0 : ((Integer)zoneSevenLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S225699=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_62 > 0 && zoneLightInt_thread_62 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneSevenLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneSevenLightONOFF);
      active[62]=1;
      ends[62]=1;
      tdone[62]=1;
    }
    else {
      S225699=1;
      active[62]=1;
      ends[62]=1;
      tdone[62]=1;
    }
  }

  public void thread226063(int [] tdone, int [] ends){
        switch(S225719){
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

  public void thread226062(int [] tdone, int [] ends){
        switch(S225711){
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

  public void thread226061(int [] tdone, int [] ends){
        switch(S225708){
      case 0 : 
        active[62]=0;
        ends[62]=0;
        tdone[62]=1;
        break;
      
      case 1 : 
        switch(S225699){
          case 0 : 
            zoneSevenLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
            currsigs.addElement(zoneSevenLightONOFF);
            active[62]=1;
            ends[62]=1;
            tdone[62]=1;
            break;
          
          case 1 : 
            S225699=1;
            S225708=0;
            active[62]=0;
            ends[62]=0;
            tdone[62]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread226060(int [] tdone, int [] ends){
        switch(S225788){
      case 0 : 
        active[61]=0;
        ends[61]=0;
        tdone[61]=1;
        break;
      
      case 1 : 
        test_61.setClear();//sysj\ECS.sysj line: 37, column: 5
        thread226061(tdone,ends);
        thread226062(tdone,ends);
        thread226063(tdone,ends);
        int biggest226064 = 0;
        if(ends[62]>=biggest226064){
          biggest226064=ends[62];
        }
        if(ends[63]>=biggest226064){
          biggest226064=ends[63];
        }
        if(ends[64]>=biggest226064){
          biggest226064=ends[64];
        }
        if(biggest226064 == 1){
          active[61]=1;
          ends[61]=1;
          tdone[61]=1;
        }
        if(biggest226064 == 2){
          ends[61]=2;
          ;//sysj\ECS.sysj line: 39, column: 5
          thread226065(tdone,ends);
          thread226066(tdone,ends);
          thread226067(tdone,ends);
          int biggest226068 = 0;
          if(ends[62]>=biggest226068){
            biggest226068=ends[62];
          }
          if(ends[63]>=biggest226068){
            biggest226068=ends[63];
          }
          if(ends[64]>=biggest226068){
            biggest226068=ends[64];
          }
          if(biggest226068 == 1){
            active[61]=1;
            ends[61]=1;
            tdone[61]=1;
          }
        }
        //FINXME code
        if(biggest226064 == 0){
          thread226069(tdone,ends);
          thread226070(tdone,ends);
          thread226071(tdone,ends);
          int biggest226072 = 0;
          if(ends[62]>=biggest226072){
            biggest226072=ends[62];
          }
          if(ends[63]>=biggest226072){
            biggest226072=ends[63];
          }
          if(ends[64]>=biggest226072){
            biggest226072=ends[64];
          }
          if(biggest226072 == 1){
            active[61]=1;
            ends[61]=1;
            tdone[61]=1;
          }
        }
        break;
      
    }
  }

  public void thread226058(int [] tdone, int [] ends){
        S225627=1;
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

  public void thread226057(int [] tdone, int [] ends){
        S225619=1;
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread226056(int [] tdone, int [] ends){
        S225616=1;
    zoneOcc_thread_58 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_58 = (Integer)(zoneSixLightingI.getpreval() == null ? 0 : ((Integer)zoneSixLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S225607=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_58 > 0 && zoneLightInt_thread_58 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneSixLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneSixLightONOFF);
      active[58]=1;
      ends[58]=1;
      tdone[58]=1;
    }
    else {
      S225607=1;
      active[58]=1;
      ends[58]=1;
      tdone[58]=1;
    }
  }

  public void thread226054(int [] tdone, int [] ends){
        S225627=1;
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

  public void thread226053(int [] tdone, int [] ends){
        S225619=1;
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread226052(int [] tdone, int [] ends){
        S225616=1;
    zoneOcc_thread_58 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_58 = (Integer)(zoneSixLightingI.getpreval() == null ? 0 : ((Integer)zoneSixLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S225607=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_58 > 0 && zoneLightInt_thread_58 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneSixLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneSixLightONOFF);
      active[58]=1;
      ends[58]=1;
      tdone[58]=1;
    }
    else {
      S225607=1;
      active[58]=1;
      ends[58]=1;
      tdone[58]=1;
    }
  }

  public void thread226050(int [] tdone, int [] ends){
        switch(S225627){
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

  public void thread226049(int [] tdone, int [] ends){
        switch(S225619){
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

  public void thread226048(int [] tdone, int [] ends){
        switch(S225616){
      case 0 : 
        active[58]=0;
        ends[58]=0;
        tdone[58]=1;
        break;
      
      case 1 : 
        switch(S225607){
          case 0 : 
            zoneSixLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
            currsigs.addElement(zoneSixLightONOFF);
            active[58]=1;
            ends[58]=1;
            tdone[58]=1;
            break;
          
          case 1 : 
            S225607=1;
            S225616=0;
            active[58]=0;
            ends[58]=0;
            tdone[58]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread226047(int [] tdone, int [] ends){
        switch(S225696){
      case 0 : 
        active[57]=0;
        ends[57]=0;
        tdone[57]=1;
        break;
      
      case 1 : 
        test_57.setClear();//sysj\ECS.sysj line: 37, column: 5
        thread226048(tdone,ends);
        thread226049(tdone,ends);
        thread226050(tdone,ends);
        int biggest226051 = 0;
        if(ends[58]>=biggest226051){
          biggest226051=ends[58];
        }
        if(ends[59]>=biggest226051){
          biggest226051=ends[59];
        }
        if(ends[60]>=biggest226051){
          biggest226051=ends[60];
        }
        if(biggest226051 == 1){
          active[57]=1;
          ends[57]=1;
          tdone[57]=1;
        }
        if(biggest226051 == 2){
          ends[57]=2;
          ;//sysj\ECS.sysj line: 39, column: 5
          thread226052(tdone,ends);
          thread226053(tdone,ends);
          thread226054(tdone,ends);
          int biggest226055 = 0;
          if(ends[58]>=biggest226055){
            biggest226055=ends[58];
          }
          if(ends[59]>=biggest226055){
            biggest226055=ends[59];
          }
          if(ends[60]>=biggest226055){
            biggest226055=ends[60];
          }
          if(biggest226055 == 1){
            active[57]=1;
            ends[57]=1;
            tdone[57]=1;
          }
        }
        //FINXME code
        if(biggest226051 == 0){
          thread226056(tdone,ends);
          thread226057(tdone,ends);
          thread226058(tdone,ends);
          int biggest226059 = 0;
          if(ends[58]>=biggest226059){
            biggest226059=ends[58];
          }
          if(ends[59]>=biggest226059){
            biggest226059=ends[59];
          }
          if(ends[60]>=biggest226059){
            biggest226059=ends[60];
          }
          if(biggest226059 == 1){
            active[57]=1;
            ends[57]=1;
            tdone[57]=1;
          }
        }
        break;
      
    }
  }

  public void thread226045(int [] tdone, int [] ends){
        S225535=1;
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

  public void thread226044(int [] tdone, int [] ends){
        S225527=1;
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread226043(int [] tdone, int [] ends){
        S225524=1;
    zoneOcc_thread_54 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_54 = (Integer)(zoneFiveLightingI.getpreval() == null ? 0 : ((Integer)zoneFiveLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S225515=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_54 > 0 && zoneLightInt_thread_54 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneFiveLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneFiveLightONOFF);
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
    else {
      S225515=1;
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
  }

  public void thread226041(int [] tdone, int [] ends){
        S225535=1;
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

  public void thread226040(int [] tdone, int [] ends){
        S225527=1;
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread226039(int [] tdone, int [] ends){
        S225524=1;
    zoneOcc_thread_54 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_54 = (Integer)(zoneFiveLightingI.getpreval() == null ? 0 : ((Integer)zoneFiveLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S225515=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_54 > 0 && zoneLightInt_thread_54 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneFiveLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneFiveLightONOFF);
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
    else {
      S225515=1;
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
  }

  public void thread226037(int [] tdone, int [] ends){
        switch(S225535){
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

  public void thread226036(int [] tdone, int [] ends){
        switch(S225527){
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

  public void thread226035(int [] tdone, int [] ends){
        switch(S225524){
      case 0 : 
        active[54]=0;
        ends[54]=0;
        tdone[54]=1;
        break;
      
      case 1 : 
        switch(S225515){
          case 0 : 
            zoneFiveLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
            currsigs.addElement(zoneFiveLightONOFF);
            active[54]=1;
            ends[54]=1;
            tdone[54]=1;
            break;
          
          case 1 : 
            S225515=1;
            S225524=0;
            active[54]=0;
            ends[54]=0;
            tdone[54]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread226034(int [] tdone, int [] ends){
        switch(S225604){
      case 0 : 
        active[53]=0;
        ends[53]=0;
        tdone[53]=1;
        break;
      
      case 1 : 
        test_53.setClear();//sysj\ECS.sysj line: 37, column: 5
        thread226035(tdone,ends);
        thread226036(tdone,ends);
        thread226037(tdone,ends);
        int biggest226038 = 0;
        if(ends[54]>=biggest226038){
          biggest226038=ends[54];
        }
        if(ends[55]>=biggest226038){
          biggest226038=ends[55];
        }
        if(ends[56]>=biggest226038){
          biggest226038=ends[56];
        }
        if(biggest226038 == 1){
          active[53]=1;
          ends[53]=1;
          tdone[53]=1;
        }
        if(biggest226038 == 2){
          ends[53]=2;
          ;//sysj\ECS.sysj line: 39, column: 5
          thread226039(tdone,ends);
          thread226040(tdone,ends);
          thread226041(tdone,ends);
          int biggest226042 = 0;
          if(ends[54]>=biggest226042){
            biggest226042=ends[54];
          }
          if(ends[55]>=biggest226042){
            biggest226042=ends[55];
          }
          if(ends[56]>=biggest226042){
            biggest226042=ends[56];
          }
          if(biggest226042 == 1){
            active[53]=1;
            ends[53]=1;
            tdone[53]=1;
          }
        }
        //FINXME code
        if(biggest226038 == 0){
          thread226043(tdone,ends);
          thread226044(tdone,ends);
          thread226045(tdone,ends);
          int biggest226046 = 0;
          if(ends[54]>=biggest226046){
            biggest226046=ends[54];
          }
          if(ends[55]>=biggest226046){
            biggest226046=ends[55];
          }
          if(ends[56]>=biggest226046){
            biggest226046=ends[56];
          }
          if(biggest226046 == 1){
            active[53]=1;
            ends[53]=1;
            tdone[53]=1;
          }
        }
        break;
      
    }
  }

  public void thread226032(int [] tdone, int [] ends){
        S225443=1;
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

  public void thread226031(int [] tdone, int [] ends){
        S225435=1;
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread226030(int [] tdone, int [] ends){
        S225432=1;
    zoneOcc_thread_50 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_50 = (Integer)(zoneFourLightingI.getpreval() == null ? 0 : ((Integer)zoneFourLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S225423=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_50 > 0 && zoneLightInt_thread_50 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneFourLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneFourLightONOFF);
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
    else {
      S225423=1;
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
  }

  public void thread226028(int [] tdone, int [] ends){
        S225443=1;
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

  public void thread226027(int [] tdone, int [] ends){
        S225435=1;
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread226026(int [] tdone, int [] ends){
        S225432=1;
    zoneOcc_thread_50 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_50 = (Integer)(zoneFourLightingI.getpreval() == null ? 0 : ((Integer)zoneFourLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S225423=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_50 > 0 && zoneLightInt_thread_50 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneFourLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneFourLightONOFF);
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
    else {
      S225423=1;
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
  }

  public void thread226024(int [] tdone, int [] ends){
        switch(S225443){
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

  public void thread226023(int [] tdone, int [] ends){
        switch(S225435){
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

  public void thread226022(int [] tdone, int [] ends){
        switch(S225432){
      case 0 : 
        active[50]=0;
        ends[50]=0;
        tdone[50]=1;
        break;
      
      case 1 : 
        switch(S225423){
          case 0 : 
            zoneFourLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
            currsigs.addElement(zoneFourLightONOFF);
            active[50]=1;
            ends[50]=1;
            tdone[50]=1;
            break;
          
          case 1 : 
            S225423=1;
            S225432=0;
            active[50]=0;
            ends[50]=0;
            tdone[50]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread226021(int [] tdone, int [] ends){
        switch(S225512){
      case 0 : 
        active[49]=0;
        ends[49]=0;
        tdone[49]=1;
        break;
      
      case 1 : 
        test_49.setClear();//sysj\ECS.sysj line: 37, column: 5
        thread226022(tdone,ends);
        thread226023(tdone,ends);
        thread226024(tdone,ends);
        int biggest226025 = 0;
        if(ends[50]>=biggest226025){
          biggest226025=ends[50];
        }
        if(ends[51]>=biggest226025){
          biggest226025=ends[51];
        }
        if(ends[52]>=biggest226025){
          biggest226025=ends[52];
        }
        if(biggest226025 == 1){
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
        if(biggest226025 == 2){
          ends[49]=2;
          ;//sysj\ECS.sysj line: 39, column: 5
          thread226026(tdone,ends);
          thread226027(tdone,ends);
          thread226028(tdone,ends);
          int biggest226029 = 0;
          if(ends[50]>=biggest226029){
            biggest226029=ends[50];
          }
          if(ends[51]>=biggest226029){
            biggest226029=ends[51];
          }
          if(ends[52]>=biggest226029){
            biggest226029=ends[52];
          }
          if(biggest226029 == 1){
            active[49]=1;
            ends[49]=1;
            tdone[49]=1;
          }
        }
        //FINXME code
        if(biggest226025 == 0){
          thread226030(tdone,ends);
          thread226031(tdone,ends);
          thread226032(tdone,ends);
          int biggest226033 = 0;
          if(ends[50]>=biggest226033){
            biggest226033=ends[50];
          }
          if(ends[51]>=biggest226033){
            biggest226033=ends[51];
          }
          if(ends[52]>=biggest226033){
            biggest226033=ends[52];
          }
          if(biggest226033 == 1){
            active[49]=1;
            ends[49]=1;
            tdone[49]=1;
          }
        }
        break;
      
    }
  }

  public void thread226019(int [] tdone, int [] ends){
        S225351=1;
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

  public void thread226018(int [] tdone, int [] ends){
        S225343=1;
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread226017(int [] tdone, int [] ends){
        S225340=1;
    zoneOcc_thread_46 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_46 = (Integer)(zoneThreeLightingI.getpreval() == null ? 0 : ((Integer)zoneThreeLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S225331=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_46 > 0 && zoneLightInt_thread_46 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneThreeLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneThreeLightONOFF);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S225331=1;
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
  }

  public void thread226015(int [] tdone, int [] ends){
        S225351=1;
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

  public void thread226014(int [] tdone, int [] ends){
        S225343=1;
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread226013(int [] tdone, int [] ends){
        S225340=1;
    zoneOcc_thread_46 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_46 = (Integer)(zoneThreeLightingI.getpreval() == null ? 0 : ((Integer)zoneThreeLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S225331=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_46 > 0 && zoneLightInt_thread_46 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneThreeLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneThreeLightONOFF);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S225331=1;
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
  }

  public void thread226011(int [] tdone, int [] ends){
        switch(S225351){
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

  public void thread226010(int [] tdone, int [] ends){
        switch(S225343){
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

  public void thread226009(int [] tdone, int [] ends){
        switch(S225340){
      case 0 : 
        active[46]=0;
        ends[46]=0;
        tdone[46]=1;
        break;
      
      case 1 : 
        switch(S225331){
          case 0 : 
            zoneThreeLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
            currsigs.addElement(zoneThreeLightONOFF);
            active[46]=1;
            ends[46]=1;
            tdone[46]=1;
            break;
          
          case 1 : 
            S225331=1;
            S225340=0;
            active[46]=0;
            ends[46]=0;
            tdone[46]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread226008(int [] tdone, int [] ends){
        switch(S225420){
      case 0 : 
        active[45]=0;
        ends[45]=0;
        tdone[45]=1;
        break;
      
      case 1 : 
        test_45.setClear();//sysj\ECS.sysj line: 37, column: 5
        thread226009(tdone,ends);
        thread226010(tdone,ends);
        thread226011(tdone,ends);
        int biggest226012 = 0;
        if(ends[46]>=biggest226012){
          biggest226012=ends[46];
        }
        if(ends[47]>=biggest226012){
          biggest226012=ends[47];
        }
        if(ends[48]>=biggest226012){
          biggest226012=ends[48];
        }
        if(biggest226012 == 1){
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
        if(biggest226012 == 2){
          ends[45]=2;
          ;//sysj\ECS.sysj line: 39, column: 5
          thread226013(tdone,ends);
          thread226014(tdone,ends);
          thread226015(tdone,ends);
          int biggest226016 = 0;
          if(ends[46]>=biggest226016){
            biggest226016=ends[46];
          }
          if(ends[47]>=biggest226016){
            biggest226016=ends[47];
          }
          if(ends[48]>=biggest226016){
            biggest226016=ends[48];
          }
          if(biggest226016 == 1){
            active[45]=1;
            ends[45]=1;
            tdone[45]=1;
          }
        }
        //FINXME code
        if(biggest226012 == 0){
          thread226017(tdone,ends);
          thread226018(tdone,ends);
          thread226019(tdone,ends);
          int biggest226020 = 0;
          if(ends[46]>=biggest226020){
            biggest226020=ends[46];
          }
          if(ends[47]>=biggest226020){
            biggest226020=ends[47];
          }
          if(ends[48]>=biggest226020){
            biggest226020=ends[48];
          }
          if(biggest226020 == 1){
            active[45]=1;
            ends[45]=1;
            tdone[45]=1;
          }
        }
        break;
      
    }
  }

  public void thread226006(int [] tdone, int [] ends){
        S225259=1;
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

  public void thread226005(int [] tdone, int [] ends){
        S225251=1;
    active[43]=1;
    ends[43]=1;
    tdone[43]=1;
  }

  public void thread226004(int [] tdone, int [] ends){
        S225248=1;
    zoneOcc_thread_42 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_42 = (Integer)(zoneTwoLightingI.getpreval() == null ? 0 : ((Integer)zoneTwoLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S225239=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_42 > 0 && zoneLightInt_thread_42 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneTwoLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneTwoLightONOFF);
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S225239=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread226002(int [] tdone, int [] ends){
        S225259=1;
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

  public void thread226001(int [] tdone, int [] ends){
        S225251=1;
    active[43]=1;
    ends[43]=1;
    tdone[43]=1;
  }

  public void thread226000(int [] tdone, int [] ends){
        S225248=1;
    zoneOcc_thread_42 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_42 = (Integer)(zoneTwoLightingI.getpreval() == null ? 0 : ((Integer)zoneTwoLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S225239=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_42 > 0 && zoneLightInt_thread_42 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneTwoLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneTwoLightONOFF);
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S225239=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread225998(int [] tdone, int [] ends){
        switch(S225259){
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

  public void thread225997(int [] tdone, int [] ends){
        switch(S225251){
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

  public void thread225996(int [] tdone, int [] ends){
        switch(S225248){
      case 0 : 
        active[42]=0;
        ends[42]=0;
        tdone[42]=1;
        break;
      
      case 1 : 
        switch(S225239){
          case 0 : 
            zoneTwoLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
            currsigs.addElement(zoneTwoLightONOFF);
            active[42]=1;
            ends[42]=1;
            tdone[42]=1;
            break;
          
          case 1 : 
            S225239=1;
            S225248=0;
            active[42]=0;
            ends[42]=0;
            tdone[42]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread225995(int [] tdone, int [] ends){
        switch(S225328){
      case 0 : 
        active[41]=0;
        ends[41]=0;
        tdone[41]=1;
        break;
      
      case 1 : 
        test_41.setClear();//sysj\ECS.sysj line: 37, column: 5
        thread225996(tdone,ends);
        thread225997(tdone,ends);
        thread225998(tdone,ends);
        int biggest225999 = 0;
        if(ends[42]>=biggest225999){
          biggest225999=ends[42];
        }
        if(ends[43]>=biggest225999){
          biggest225999=ends[43];
        }
        if(ends[44]>=biggest225999){
          biggest225999=ends[44];
        }
        if(biggest225999 == 1){
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
        if(biggest225999 == 2){
          ends[41]=2;
          ;//sysj\ECS.sysj line: 39, column: 5
          thread226000(tdone,ends);
          thread226001(tdone,ends);
          thread226002(tdone,ends);
          int biggest226003 = 0;
          if(ends[42]>=biggest226003){
            biggest226003=ends[42];
          }
          if(ends[43]>=biggest226003){
            biggest226003=ends[43];
          }
          if(ends[44]>=biggest226003){
            biggest226003=ends[44];
          }
          if(biggest226003 == 1){
            active[41]=1;
            ends[41]=1;
            tdone[41]=1;
          }
        }
        //FINXME code
        if(biggest225999 == 0){
          thread226004(tdone,ends);
          thread226005(tdone,ends);
          thread226006(tdone,ends);
          int biggest226007 = 0;
          if(ends[42]>=biggest226007){
            biggest226007=ends[42];
          }
          if(ends[43]>=biggest226007){
            biggest226007=ends[43];
          }
          if(ends[44]>=biggest226007){
            biggest226007=ends[44];
          }
          if(biggest226007 == 1){
            active[41]=1;
            ends[41]=1;
            tdone[41]=1;
          }
        }
        break;
      
    }
  }

  public void thread225993(int [] tdone, int [] ends){
        S225167=1;
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

  public void thread225992(int [] tdone, int [] ends){
        S225159=1;
    active[39]=1;
    ends[39]=1;
    tdone[39]=1;
  }

  public void thread225991(int [] tdone, int [] ends){
        S225156=1;
    zoneOcc_thread_38 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_38 = (Integer)(zoneOneLightingI.getpreval() == null ? 0 : ((Integer)zoneOneLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S225147=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_38 > 0 && zoneLightInt_thread_38 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneOneLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneOneLightONOFF);
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      S225147=1;
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread225989(int [] tdone, int [] ends){
        S225167=1;
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

  public void thread225988(int [] tdone, int [] ends){
        S225159=1;
    active[39]=1;
    ends[39]=1;
    tdone[39]=1;
  }

  public void thread225987(int [] tdone, int [] ends){
        S225156=1;
    zoneOcc_thread_38 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_38 = (Integer)(zoneOneLightingI.getpreval() == null ? 0 : ((Integer)zoneOneLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S225147=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_38 > 0 && zoneLightInt_thread_38 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneOneLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneOneLightONOFF);
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      S225147=1;
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread225985(int [] tdone, int [] ends){
        switch(S225167){
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

  public void thread225984(int [] tdone, int [] ends){
        switch(S225159){
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

  public void thread225983(int [] tdone, int [] ends){
        switch(S225156){
      case 0 : 
        active[38]=0;
        ends[38]=0;
        tdone[38]=1;
        break;
      
      case 1 : 
        switch(S225147){
          case 0 : 
            zoneOneLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
            currsigs.addElement(zoneOneLightONOFF);
            active[38]=1;
            ends[38]=1;
            tdone[38]=1;
            break;
          
          case 1 : 
            S225147=1;
            S225156=0;
            active[38]=0;
            ends[38]=0;
            tdone[38]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread225982(int [] tdone, int [] ends){
        switch(S225236){
      case 0 : 
        active[37]=0;
        ends[37]=0;
        tdone[37]=1;
        break;
      
      case 1 : 
        test_37.setClear();//sysj\ECS.sysj line: 37, column: 5
        thread225983(tdone,ends);
        thread225984(tdone,ends);
        thread225985(tdone,ends);
        int biggest225986 = 0;
        if(ends[38]>=biggest225986){
          biggest225986=ends[38];
        }
        if(ends[39]>=biggest225986){
          biggest225986=ends[39];
        }
        if(ends[40]>=biggest225986){
          biggest225986=ends[40];
        }
        if(biggest225986 == 1){
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
        if(biggest225986 == 2){
          ends[37]=2;
          ;//sysj\ECS.sysj line: 39, column: 5
          thread225987(tdone,ends);
          thread225988(tdone,ends);
          thread225989(tdone,ends);
          int biggest225990 = 0;
          if(ends[38]>=biggest225990){
            biggest225990=ends[38];
          }
          if(ends[39]>=biggest225990){
            biggest225990=ends[39];
          }
          if(ends[40]>=biggest225990){
            biggest225990=ends[40];
          }
          if(biggest225990 == 1){
            active[37]=1;
            ends[37]=1;
            tdone[37]=1;
          }
        }
        //FINXME code
        if(biggest225986 == 0){
          thread225991(tdone,ends);
          thread225992(tdone,ends);
          thread225993(tdone,ends);
          int biggest225994 = 0;
          if(ends[38]>=biggest225994){
            biggest225994=ends[38];
          }
          if(ends[39]>=biggest225994){
            biggest225994=ends[39];
          }
          if(ends[40]>=biggest225994){
            biggest225994=ends[40];
          }
          if(biggest225994 == 1){
            active[37]=1;
            ends[37]=1;
            tdone[37]=1;
          }
        }
        break;
      
    }
  }

  public void thread225980(int [] tdone, int [] ends){
        S225075=1;
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

  public void thread225979(int [] tdone, int [] ends){
        S225067=1;
    active[35]=1;
    ends[35]=1;
    tdone[35]=1;
  }

  public void thread225978(int [] tdone, int [] ends){
        S225064=1;
    zoneOcc_thread_34 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_34 = (Integer)(zoneSevenLightingI.getpreval() == null ? 0 : ((Integer)zoneSevenLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S225055=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_34 > 0 && zoneLightInt_thread_34 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneSevenWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneSevenWindowONOFF);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S225055=1;
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread225976(int [] tdone, int [] ends){
        S225075=1;
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

  public void thread225975(int [] tdone, int [] ends){
        S225067=1;
    active[35]=1;
    ends[35]=1;
    tdone[35]=1;
  }

  public void thread225974(int [] tdone, int [] ends){
        S225064=1;
    zoneOcc_thread_34 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_34 = (Integer)(zoneSevenLightingI.getpreval() == null ? 0 : ((Integer)zoneSevenLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S225055=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_34 > 0 && zoneLightInt_thread_34 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneSevenWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneSevenWindowONOFF);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S225055=1;
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread225972(int [] tdone, int [] ends){
        switch(S225075){
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

  public void thread225971(int [] tdone, int [] ends){
        switch(S225067){
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

  public void thread225970(int [] tdone, int [] ends){
        switch(S225064){
      case 0 : 
        active[34]=0;
        ends[34]=0;
        tdone[34]=1;
        break;
      
      case 1 : 
        switch(S225055){
          case 0 : 
            zoneSevenWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
            currsigs.addElement(zoneSevenWindowONOFF);
            active[34]=1;
            ends[34]=1;
            tdone[34]=1;
            break;
          
          case 1 : 
            S225055=1;
            S225064=0;
            active[34]=0;
            ends[34]=0;
            tdone[34]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread225969(int [] tdone, int [] ends){
        switch(S225144){
      case 0 : 
        active[33]=0;
        ends[33]=0;
        tdone[33]=1;
        break;
      
      case 1 : 
        test_33.setClear();//sysj\ECS.sysj line: 3, column: 5
        thread225970(tdone,ends);
        thread225971(tdone,ends);
        thread225972(tdone,ends);
        int biggest225973 = 0;
        if(ends[34]>=biggest225973){
          biggest225973=ends[34];
        }
        if(ends[35]>=biggest225973){
          biggest225973=ends[35];
        }
        if(ends[36]>=biggest225973){
          biggest225973=ends[36];
        }
        if(biggest225973 == 1){
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
        if(biggest225973 == 2){
          ends[33]=2;
          ;//sysj\ECS.sysj line: 5, column: 5
          thread225974(tdone,ends);
          thread225975(tdone,ends);
          thread225976(tdone,ends);
          int biggest225977 = 0;
          if(ends[34]>=biggest225977){
            biggest225977=ends[34];
          }
          if(ends[35]>=biggest225977){
            biggest225977=ends[35];
          }
          if(ends[36]>=biggest225977){
            biggest225977=ends[36];
          }
          if(biggest225977 == 1){
            active[33]=1;
            ends[33]=1;
            tdone[33]=1;
          }
        }
        //FINXME code
        if(biggest225973 == 0){
          thread225978(tdone,ends);
          thread225979(tdone,ends);
          thread225980(tdone,ends);
          int biggest225981 = 0;
          if(ends[34]>=biggest225981){
            biggest225981=ends[34];
          }
          if(ends[35]>=biggest225981){
            biggest225981=ends[35];
          }
          if(ends[36]>=biggest225981){
            biggest225981=ends[36];
          }
          if(biggest225981 == 1){
            active[33]=1;
            ends[33]=1;
            tdone[33]=1;
          }
        }
        break;
      
    }
  }

  public void thread225967(int [] tdone, int [] ends){
        S224983=1;
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

  public void thread225966(int [] tdone, int [] ends){
        S224975=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread225965(int [] tdone, int [] ends){
        S224972=1;
    zoneOcc_thread_30 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_30 = (Integer)(zoneSixLightingI.getpreval() == null ? 0 : ((Integer)zoneSixLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S224963=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_30 > 0 && zoneLightInt_thread_30 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneSixWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneSixWindowONOFF);
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S224963=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
  }

  public void thread225963(int [] tdone, int [] ends){
        S224983=1;
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

  public void thread225962(int [] tdone, int [] ends){
        S224975=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread225961(int [] tdone, int [] ends){
        S224972=1;
    zoneOcc_thread_30 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_30 = (Integer)(zoneSixLightingI.getpreval() == null ? 0 : ((Integer)zoneSixLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S224963=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_30 > 0 && zoneLightInt_thread_30 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneSixWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneSixWindowONOFF);
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S224963=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
  }

  public void thread225959(int [] tdone, int [] ends){
        switch(S224983){
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

  public void thread225958(int [] tdone, int [] ends){
        switch(S224975){
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

  public void thread225957(int [] tdone, int [] ends){
        switch(S224972){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        switch(S224963){
          case 0 : 
            zoneSixWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
            currsigs.addElement(zoneSixWindowONOFF);
            active[30]=1;
            ends[30]=1;
            tdone[30]=1;
            break;
          
          case 1 : 
            S224963=1;
            S224972=0;
            active[30]=0;
            ends[30]=0;
            tdone[30]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread225956(int [] tdone, int [] ends){
        switch(S225052){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        test_29.setClear();//sysj\ECS.sysj line: 3, column: 5
        thread225957(tdone,ends);
        thread225958(tdone,ends);
        thread225959(tdone,ends);
        int biggest225960 = 0;
        if(ends[30]>=biggest225960){
          biggest225960=ends[30];
        }
        if(ends[31]>=biggest225960){
          biggest225960=ends[31];
        }
        if(ends[32]>=biggest225960){
          biggest225960=ends[32];
        }
        if(biggest225960 == 1){
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
        if(biggest225960 == 2){
          ends[29]=2;
          ;//sysj\ECS.sysj line: 5, column: 5
          thread225961(tdone,ends);
          thread225962(tdone,ends);
          thread225963(tdone,ends);
          int biggest225964 = 0;
          if(ends[30]>=biggest225964){
            biggest225964=ends[30];
          }
          if(ends[31]>=biggest225964){
            biggest225964=ends[31];
          }
          if(ends[32]>=biggest225964){
            biggest225964=ends[32];
          }
          if(biggest225964 == 1){
            active[29]=1;
            ends[29]=1;
            tdone[29]=1;
          }
        }
        //FINXME code
        if(biggest225960 == 0){
          thread225965(tdone,ends);
          thread225966(tdone,ends);
          thread225967(tdone,ends);
          int biggest225968 = 0;
          if(ends[30]>=biggest225968){
            biggest225968=ends[30];
          }
          if(ends[31]>=biggest225968){
            biggest225968=ends[31];
          }
          if(ends[32]>=biggest225968){
            biggest225968=ends[32];
          }
          if(biggest225968 == 1){
            active[29]=1;
            ends[29]=1;
            tdone[29]=1;
          }
        }
        break;
      
    }
  }

  public void thread225954(int [] tdone, int [] ends){
        S224891=1;
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

  public void thread225953(int [] tdone, int [] ends){
        S224883=1;
    active[27]=1;
    ends[27]=1;
    tdone[27]=1;
  }

  public void thread225952(int [] tdone, int [] ends){
        S224880=1;
    zoneOcc_thread_26 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_26 = (Integer)(zoneFiveLightingI.getpreval() == null ? 0 : ((Integer)zoneFiveLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S224871=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_26 > 0 && zoneLightInt_thread_26 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneFiveWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneFiveWindowONOFF);
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
    else {
      S224871=1;
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread225950(int [] tdone, int [] ends){
        S224891=1;
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

  public void thread225949(int [] tdone, int [] ends){
        S224883=1;
    active[27]=1;
    ends[27]=1;
    tdone[27]=1;
  }

  public void thread225948(int [] tdone, int [] ends){
        S224880=1;
    zoneOcc_thread_26 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_26 = (Integer)(zoneFiveLightingI.getpreval() == null ? 0 : ((Integer)zoneFiveLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S224871=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_26 > 0 && zoneLightInt_thread_26 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneFiveWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneFiveWindowONOFF);
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
    else {
      S224871=1;
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread225946(int [] tdone, int [] ends){
        switch(S224891){
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

  public void thread225945(int [] tdone, int [] ends){
        switch(S224883){
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

  public void thread225944(int [] tdone, int [] ends){
        switch(S224880){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        switch(S224871){
          case 0 : 
            zoneFiveWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
            currsigs.addElement(zoneFiveWindowONOFF);
            active[26]=1;
            ends[26]=1;
            tdone[26]=1;
            break;
          
          case 1 : 
            S224871=1;
            S224880=0;
            active[26]=0;
            ends[26]=0;
            tdone[26]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread225943(int [] tdone, int [] ends){
        switch(S224960){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        test_25.setClear();//sysj\ECS.sysj line: 3, column: 5
        thread225944(tdone,ends);
        thread225945(tdone,ends);
        thread225946(tdone,ends);
        int biggest225947 = 0;
        if(ends[26]>=biggest225947){
          biggest225947=ends[26];
        }
        if(ends[27]>=biggest225947){
          biggest225947=ends[27];
        }
        if(ends[28]>=biggest225947){
          biggest225947=ends[28];
        }
        if(biggest225947 == 1){
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
        if(biggest225947 == 2){
          ends[25]=2;
          ;//sysj\ECS.sysj line: 5, column: 5
          thread225948(tdone,ends);
          thread225949(tdone,ends);
          thread225950(tdone,ends);
          int biggest225951 = 0;
          if(ends[26]>=biggest225951){
            biggest225951=ends[26];
          }
          if(ends[27]>=biggest225951){
            biggest225951=ends[27];
          }
          if(ends[28]>=biggest225951){
            biggest225951=ends[28];
          }
          if(biggest225951 == 1){
            active[25]=1;
            ends[25]=1;
            tdone[25]=1;
          }
        }
        //FINXME code
        if(biggest225947 == 0){
          thread225952(tdone,ends);
          thread225953(tdone,ends);
          thread225954(tdone,ends);
          int biggest225955 = 0;
          if(ends[26]>=biggest225955){
            biggest225955=ends[26];
          }
          if(ends[27]>=biggest225955){
            biggest225955=ends[27];
          }
          if(ends[28]>=biggest225955){
            biggest225955=ends[28];
          }
          if(biggest225955 == 1){
            active[25]=1;
            ends[25]=1;
            tdone[25]=1;
          }
        }
        break;
      
    }
  }

  public void thread225941(int [] tdone, int [] ends){
        S224799=1;
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

  public void thread225940(int [] tdone, int [] ends){
        S224791=1;
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread225939(int [] tdone, int [] ends){
        S224788=1;
    zoneOcc_thread_22 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_22 = (Integer)(zoneFourLightingI.getpreval() == null ? 0 : ((Integer)zoneFourLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S224779=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_22 > 0 && zoneLightInt_thread_22 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneFourWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneFourWindowONOFF);
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S224779=1;
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread225937(int [] tdone, int [] ends){
        S224799=1;
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

  public void thread225936(int [] tdone, int [] ends){
        S224791=1;
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread225935(int [] tdone, int [] ends){
        S224788=1;
    zoneOcc_thread_22 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_22 = (Integer)(zoneFourLightingI.getpreval() == null ? 0 : ((Integer)zoneFourLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S224779=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_22 > 0 && zoneLightInt_thread_22 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneFourWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneFourWindowONOFF);
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S224779=1;
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread225933(int [] tdone, int [] ends){
        switch(S224799){
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

  public void thread225932(int [] tdone, int [] ends){
        switch(S224791){
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

  public void thread225931(int [] tdone, int [] ends){
        switch(S224788){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        switch(S224779){
          case 0 : 
            zoneFourWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
            currsigs.addElement(zoneFourWindowONOFF);
            active[22]=1;
            ends[22]=1;
            tdone[22]=1;
            break;
          
          case 1 : 
            S224779=1;
            S224788=0;
            active[22]=0;
            ends[22]=0;
            tdone[22]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread225930(int [] tdone, int [] ends){
        switch(S224868){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        test_21.setClear();//sysj\ECS.sysj line: 3, column: 5
        thread225931(tdone,ends);
        thread225932(tdone,ends);
        thread225933(tdone,ends);
        int biggest225934 = 0;
        if(ends[22]>=biggest225934){
          biggest225934=ends[22];
        }
        if(ends[23]>=biggest225934){
          biggest225934=ends[23];
        }
        if(ends[24]>=biggest225934){
          biggest225934=ends[24];
        }
        if(biggest225934 == 1){
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        if(biggest225934 == 2){
          ends[21]=2;
          ;//sysj\ECS.sysj line: 5, column: 5
          thread225935(tdone,ends);
          thread225936(tdone,ends);
          thread225937(tdone,ends);
          int biggest225938 = 0;
          if(ends[22]>=biggest225938){
            biggest225938=ends[22];
          }
          if(ends[23]>=biggest225938){
            biggest225938=ends[23];
          }
          if(ends[24]>=biggest225938){
            biggest225938=ends[24];
          }
          if(biggest225938 == 1){
            active[21]=1;
            ends[21]=1;
            tdone[21]=1;
          }
        }
        //FINXME code
        if(biggest225934 == 0){
          thread225939(tdone,ends);
          thread225940(tdone,ends);
          thread225941(tdone,ends);
          int biggest225942 = 0;
          if(ends[22]>=biggest225942){
            biggest225942=ends[22];
          }
          if(ends[23]>=biggest225942){
            biggest225942=ends[23];
          }
          if(ends[24]>=biggest225942){
            biggest225942=ends[24];
          }
          if(biggest225942 == 1){
            active[21]=1;
            ends[21]=1;
            tdone[21]=1;
          }
        }
        break;
      
    }
  }

  public void thread225928(int [] tdone, int [] ends){
        S224707=1;
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

  public void thread225927(int [] tdone, int [] ends){
        S224699=1;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread225926(int [] tdone, int [] ends){
        S224696=1;
    zoneOcc_thread_18 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_18 = (Integer)(zoneThreeLightingI.getpreval() == null ? 0 : ((Integer)zoneThreeLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S224687=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_18 > 0 && zoneLightInt_thread_18 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneThreeWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneThreeWindowONOFF);
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
    else {
      S224687=1;
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread225924(int [] tdone, int [] ends){
        S224707=1;
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

  public void thread225923(int [] tdone, int [] ends){
        S224699=1;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread225922(int [] tdone, int [] ends){
        S224696=1;
    zoneOcc_thread_18 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_18 = (Integer)(zoneThreeLightingI.getpreval() == null ? 0 : ((Integer)zoneThreeLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S224687=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_18 > 0 && zoneLightInt_thread_18 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneThreeWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneThreeWindowONOFF);
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
    else {
      S224687=1;
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread225920(int [] tdone, int [] ends){
        switch(S224707){
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

  public void thread225919(int [] tdone, int [] ends){
        switch(S224699){
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

  public void thread225918(int [] tdone, int [] ends){
        switch(S224696){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        switch(S224687){
          case 0 : 
            zoneThreeWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
            currsigs.addElement(zoneThreeWindowONOFF);
            active[18]=1;
            ends[18]=1;
            tdone[18]=1;
            break;
          
          case 1 : 
            S224687=1;
            S224696=0;
            active[18]=0;
            ends[18]=0;
            tdone[18]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread225917(int [] tdone, int [] ends){
        switch(S224776){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        test_17.setClear();//sysj\ECS.sysj line: 3, column: 5
        thread225918(tdone,ends);
        thread225919(tdone,ends);
        thread225920(tdone,ends);
        int biggest225921 = 0;
        if(ends[18]>=biggest225921){
          biggest225921=ends[18];
        }
        if(ends[19]>=biggest225921){
          biggest225921=ends[19];
        }
        if(ends[20]>=biggest225921){
          biggest225921=ends[20];
        }
        if(biggest225921 == 1){
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
        if(biggest225921 == 2){
          ends[17]=2;
          ;//sysj\ECS.sysj line: 5, column: 5
          thread225922(tdone,ends);
          thread225923(tdone,ends);
          thread225924(tdone,ends);
          int biggest225925 = 0;
          if(ends[18]>=biggest225925){
            biggest225925=ends[18];
          }
          if(ends[19]>=biggest225925){
            biggest225925=ends[19];
          }
          if(ends[20]>=biggest225925){
            biggest225925=ends[20];
          }
          if(biggest225925 == 1){
            active[17]=1;
            ends[17]=1;
            tdone[17]=1;
          }
        }
        //FINXME code
        if(biggest225921 == 0){
          thread225926(tdone,ends);
          thread225927(tdone,ends);
          thread225928(tdone,ends);
          int biggest225929 = 0;
          if(ends[18]>=biggest225929){
            biggest225929=ends[18];
          }
          if(ends[19]>=biggest225929){
            biggest225929=ends[19];
          }
          if(ends[20]>=biggest225929){
            biggest225929=ends[20];
          }
          if(biggest225929 == 1){
            active[17]=1;
            ends[17]=1;
            tdone[17]=1;
          }
        }
        break;
      
    }
  }

  public void thread225915(int [] tdone, int [] ends){
        S224615=1;
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

  public void thread225914(int [] tdone, int [] ends){
        S224607=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread225913(int [] tdone, int [] ends){
        S224604=1;
    zoneOcc_thread_14 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_14 = (Integer)(zoneTwoLightingI.getpreval() == null ? 0 : ((Integer)zoneTwoLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S224595=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_14 > 0 && zoneLightInt_thread_14 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneTwoWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneTwoWindowONOFF);
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      S224595=1;
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread225911(int [] tdone, int [] ends){
        S224615=1;
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

  public void thread225910(int [] tdone, int [] ends){
        S224607=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread225909(int [] tdone, int [] ends){
        S224604=1;
    zoneOcc_thread_14 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_14 = (Integer)(zoneTwoLightingI.getpreval() == null ? 0 : ((Integer)zoneTwoLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S224595=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_14 > 0 && zoneLightInt_thread_14 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneTwoWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneTwoWindowONOFF);
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      S224595=1;
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread225907(int [] tdone, int [] ends){
        switch(S224615){
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

  public void thread225906(int [] tdone, int [] ends){
        switch(S224607){
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

  public void thread225905(int [] tdone, int [] ends){
        switch(S224604){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        switch(S224595){
          case 0 : 
            zoneTwoWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
            currsigs.addElement(zoneTwoWindowONOFF);
            active[14]=1;
            ends[14]=1;
            tdone[14]=1;
            break;
          
          case 1 : 
            S224595=1;
            S224604=0;
            active[14]=0;
            ends[14]=0;
            tdone[14]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread225904(int [] tdone, int [] ends){
        switch(S224684){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        test_13.setClear();//sysj\ECS.sysj line: 3, column: 5
        thread225905(tdone,ends);
        thread225906(tdone,ends);
        thread225907(tdone,ends);
        int biggest225908 = 0;
        if(ends[14]>=biggest225908){
          biggest225908=ends[14];
        }
        if(ends[15]>=biggest225908){
          biggest225908=ends[15];
        }
        if(ends[16]>=biggest225908){
          biggest225908=ends[16];
        }
        if(biggest225908 == 1){
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        if(biggest225908 == 2){
          ends[13]=2;
          ;//sysj\ECS.sysj line: 5, column: 5
          thread225909(tdone,ends);
          thread225910(tdone,ends);
          thread225911(tdone,ends);
          int biggest225912 = 0;
          if(ends[14]>=biggest225912){
            biggest225912=ends[14];
          }
          if(ends[15]>=biggest225912){
            biggest225912=ends[15];
          }
          if(ends[16]>=biggest225912){
            biggest225912=ends[16];
          }
          if(biggest225912 == 1){
            active[13]=1;
            ends[13]=1;
            tdone[13]=1;
          }
        }
        //FINXME code
        if(biggest225908 == 0){
          thread225913(tdone,ends);
          thread225914(tdone,ends);
          thread225915(tdone,ends);
          int biggest225916 = 0;
          if(ends[14]>=biggest225916){
            biggest225916=ends[14];
          }
          if(ends[15]>=biggest225916){
            biggest225916=ends[15];
          }
          if(ends[16]>=biggest225916){
            biggest225916=ends[16];
          }
          if(biggest225916 == 1){
            active[13]=1;
            ends[13]=1;
            tdone[13]=1;
          }
        }
        break;
      
    }
  }

  public void thread225902(int [] tdone, int [] ends){
        S224523=1;
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

  public void thread225901(int [] tdone, int [] ends){
        S224515=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread225900(int [] tdone, int [] ends){
        S224512=1;
    zoneOcc_thread_10 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_10 = (Integer)(zoneOneLightingI.getpreval() == null ? 0 : ((Integer)zoneOneLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S224503=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_10 > 0 && zoneLightInt_thread_10 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneOneWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneOneWindowONOFF);
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      S224503=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread225898(int [] tdone, int [] ends){
        S224523=1;
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

  public void thread225897(int [] tdone, int [] ends){
        S224515=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread225896(int [] tdone, int [] ends){
        S224512=1;
    zoneOcc_thread_10 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_10 = (Integer)(zoneOneLightingI.getpreval() == null ? 0 : ((Integer)zoneOneLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S224503=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_10 > 0 && zoneLightInt_thread_10 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneOneWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneOneWindowONOFF);
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      S224503=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread225894(int [] tdone, int [] ends){
        switch(S224523){
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

  public void thread225893(int [] tdone, int [] ends){
        switch(S224515){
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

  public void thread225892(int [] tdone, int [] ends){
        switch(S224512){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S224503){
          case 0 : 
            zoneOneWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
            currsigs.addElement(zoneOneWindowONOFF);
            active[10]=1;
            ends[10]=1;
            tdone[10]=1;
            break;
          
          case 1 : 
            S224503=1;
            S224512=0;
            active[10]=0;
            ends[10]=0;
            tdone[10]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread225891(int [] tdone, int [] ends){
        switch(S224592){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        test_9.setClear();//sysj\ECS.sysj line: 3, column: 5
        thread225892(tdone,ends);
        thread225893(tdone,ends);
        thread225894(tdone,ends);
        int biggest225895 = 0;
        if(ends[10]>=biggest225895){
          biggest225895=ends[10];
        }
        if(ends[11]>=biggest225895){
          biggest225895=ends[11];
        }
        if(ends[12]>=biggest225895){
          biggest225895=ends[12];
        }
        if(biggest225895 == 1){
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        if(biggest225895 == 2){
          ends[9]=2;
          ;//sysj\ECS.sysj line: 5, column: 5
          thread225896(tdone,ends);
          thread225897(tdone,ends);
          thread225898(tdone,ends);
          int biggest225899 = 0;
          if(ends[10]>=biggest225899){
            biggest225899=ends[10];
          }
          if(ends[11]>=biggest225899){
            biggest225899=ends[11];
          }
          if(ends[12]>=biggest225899){
            biggest225899=ends[12];
          }
          if(biggest225899 == 1){
            active[9]=1;
            ends[9]=1;
            tdone[9]=1;
          }
        }
        //FINXME code
        if(biggest225895 == 0){
          thread225900(tdone,ends);
          thread225901(tdone,ends);
          thread225902(tdone,ends);
          int biggest225903 = 0;
          if(ends[10]>=biggest225903){
            biggest225903=ends[10];
          }
          if(ends[11]>=biggest225903){
            biggest225903=ends[11];
          }
          if(ends[12]>=biggest225903){
            biggest225903=ends[12];
          }
          if(biggest225903 == 1){
            active[9]=1;
            ends[9]=1;
            tdone[9]=1;
          }
        }
        break;
      
    }
  }

  public void thread225890(int [] tdone, int [] ends){
        switch(S225790){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        thread225891(tdone,ends);
        thread225904(tdone,ends);
        thread225917(tdone,ends);
        thread225930(tdone,ends);
        thread225943(tdone,ends);
        thread225956(tdone,ends);
        thread225969(tdone,ends);
        thread225982(tdone,ends);
        thread225995(tdone,ends);
        thread226008(tdone,ends);
        thread226021(tdone,ends);
        thread226034(tdone,ends);
        thread226047(tdone,ends);
        thread226060(tdone,ends);
        int biggest226073 = 0;
        if(ends[9]>=biggest226073){
          biggest226073=ends[9];
        }
        if(ends[13]>=biggest226073){
          biggest226073=ends[13];
        }
        if(ends[17]>=biggest226073){
          biggest226073=ends[17];
        }
        if(ends[21]>=biggest226073){
          biggest226073=ends[21];
        }
        if(ends[25]>=biggest226073){
          biggest226073=ends[25];
        }
        if(ends[29]>=biggest226073){
          biggest226073=ends[29];
        }
        if(ends[33]>=biggest226073){
          biggest226073=ends[33];
        }
        if(ends[37]>=biggest226073){
          biggest226073=ends[37];
        }
        if(ends[41]>=biggest226073){
          biggest226073=ends[41];
        }
        if(ends[45]>=biggest226073){
          biggest226073=ends[45];
        }
        if(ends[49]>=biggest226073){
          biggest226073=ends[49];
        }
        if(ends[53]>=biggest226073){
          biggest226073=ends[53];
        }
        if(ends[57]>=biggest226073){
          biggest226073=ends[57];
        }
        if(ends[61]>=biggest226073){
          biggest226073=ends[61];
        }
        if(biggest226073 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        //FINXME code
        if(biggest226073 == 0){
          S225790=0;
          active[8]=0;
          ends[8]=0;
          tdone[8]=1;
        }
        break;
      
    }
  }

  public void thread225889(int [] tdone, int [] ends){
        switch(S224500){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S224450){
          case 0 : 
            if(currentTime_2.getprestatus()){//sysj\ECS.sysj line: 351, column: 14
              currentHour_thread_7 = (Integer)(currentTime_2.getpreval() == null ? 0 : ((Integer)currentTime_2.getpreval()).intValue());//sysj\ECS.sysj line: 352, column: 8
              S224450=1;
              if(currentHour_thread_7 >= 9 && currentHour_thread_7 <= 17){//sysj\ECS.sysj line: 354, column: 16
                S224454=0;
                workhrs_6.setPresent();//sysj\ECS.sysj line: 355, column: 16
                currsigs.addElement(workhrs_6);
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
              else {
                S224454=1;
                if((currentHour_thread_7 >= 18 && currentHour_thread_7 <= 24) || (currentHour_thread_7 >= 0 && currentHour_thread_7 < 9)){//sysj\ECS.sysj line: 359, column: 23
                  afterhrs_6.setPresent();//sysj\ECS.sysj line: 360, column: 16
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

  public void thread225885(int [] tdone, int [] ends){
        S225719=1;
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

  public void thread225884(int [] tdone, int [] ends){
        S225711=1;
    active[63]=1;
    ends[63]=1;
    tdone[63]=1;
  }

  public void thread225883(int [] tdone, int [] ends){
        S225708=1;
    zoneOcc_thread_62 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_62 = (Integer)(zoneSevenLightingI.getpreval() == null ? 0 : ((Integer)zoneSevenLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S225699=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_62 > 0 && zoneLightInt_thread_62 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneSevenLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneSevenLightONOFF);
      active[62]=1;
      ends[62]=1;
      tdone[62]=1;
    }
    else {
      S225699=1;
      active[62]=1;
      ends[62]=1;
      tdone[62]=1;
    }
  }

  public void thread225882(int [] tdone, int [] ends){
        S225788=1;
    test_61.setClear();//sysj\ECS.sysj line: 37, column: 5
    thread225883(tdone,ends);
    thread225884(tdone,ends);
    thread225885(tdone,ends);
    int biggest225886 = 0;
    if(ends[62]>=biggest225886){
      biggest225886=ends[62];
    }
    if(ends[63]>=biggest225886){
      biggest225886=ends[63];
    }
    if(ends[64]>=biggest225886){
      biggest225886=ends[64];
    }
    if(biggest225886 == 1){
      active[61]=1;
      ends[61]=1;
      tdone[61]=1;
    }
  }

  public void thread225880(int [] tdone, int [] ends){
        S225627=1;
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

  public void thread225879(int [] tdone, int [] ends){
        S225619=1;
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread225878(int [] tdone, int [] ends){
        S225616=1;
    zoneOcc_thread_58 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_58 = (Integer)(zoneSixLightingI.getpreval() == null ? 0 : ((Integer)zoneSixLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S225607=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_58 > 0 && zoneLightInt_thread_58 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneSixLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneSixLightONOFF);
      active[58]=1;
      ends[58]=1;
      tdone[58]=1;
    }
    else {
      S225607=1;
      active[58]=1;
      ends[58]=1;
      tdone[58]=1;
    }
  }

  public void thread225877(int [] tdone, int [] ends){
        S225696=1;
    test_57.setClear();//sysj\ECS.sysj line: 37, column: 5
    thread225878(tdone,ends);
    thread225879(tdone,ends);
    thread225880(tdone,ends);
    int biggest225881 = 0;
    if(ends[58]>=biggest225881){
      biggest225881=ends[58];
    }
    if(ends[59]>=biggest225881){
      biggest225881=ends[59];
    }
    if(ends[60]>=biggest225881){
      biggest225881=ends[60];
    }
    if(biggest225881 == 1){
      active[57]=1;
      ends[57]=1;
      tdone[57]=1;
    }
  }

  public void thread225875(int [] tdone, int [] ends){
        S225535=1;
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

  public void thread225874(int [] tdone, int [] ends){
        S225527=1;
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread225873(int [] tdone, int [] ends){
        S225524=1;
    zoneOcc_thread_54 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_54 = (Integer)(zoneFiveLightingI.getpreval() == null ? 0 : ((Integer)zoneFiveLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S225515=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_54 > 0 && zoneLightInt_thread_54 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneFiveLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneFiveLightONOFF);
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
    else {
      S225515=1;
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
  }

  public void thread225872(int [] tdone, int [] ends){
        S225604=1;
    test_53.setClear();//sysj\ECS.sysj line: 37, column: 5
    thread225873(tdone,ends);
    thread225874(tdone,ends);
    thread225875(tdone,ends);
    int biggest225876 = 0;
    if(ends[54]>=biggest225876){
      biggest225876=ends[54];
    }
    if(ends[55]>=biggest225876){
      biggest225876=ends[55];
    }
    if(ends[56]>=biggest225876){
      biggest225876=ends[56];
    }
    if(biggest225876 == 1){
      active[53]=1;
      ends[53]=1;
      tdone[53]=1;
    }
  }

  public void thread225870(int [] tdone, int [] ends){
        S225443=1;
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

  public void thread225869(int [] tdone, int [] ends){
        S225435=1;
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread225868(int [] tdone, int [] ends){
        S225432=1;
    zoneOcc_thread_50 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_50 = (Integer)(zoneFourLightingI.getpreval() == null ? 0 : ((Integer)zoneFourLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S225423=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_50 > 0 && zoneLightInt_thread_50 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneFourLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneFourLightONOFF);
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
    else {
      S225423=1;
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
  }

  public void thread225867(int [] tdone, int [] ends){
        S225512=1;
    test_49.setClear();//sysj\ECS.sysj line: 37, column: 5
    thread225868(tdone,ends);
    thread225869(tdone,ends);
    thread225870(tdone,ends);
    int biggest225871 = 0;
    if(ends[50]>=biggest225871){
      biggest225871=ends[50];
    }
    if(ends[51]>=biggest225871){
      biggest225871=ends[51];
    }
    if(ends[52]>=biggest225871){
      biggest225871=ends[52];
    }
    if(biggest225871 == 1){
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
  }

  public void thread225865(int [] tdone, int [] ends){
        S225351=1;
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

  public void thread225864(int [] tdone, int [] ends){
        S225343=1;
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread225863(int [] tdone, int [] ends){
        S225340=1;
    zoneOcc_thread_46 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_46 = (Integer)(zoneThreeLightingI.getpreval() == null ? 0 : ((Integer)zoneThreeLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S225331=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_46 > 0 && zoneLightInt_thread_46 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneThreeLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneThreeLightONOFF);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S225331=1;
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
  }

  public void thread225862(int [] tdone, int [] ends){
        S225420=1;
    test_45.setClear();//sysj\ECS.sysj line: 37, column: 5
    thread225863(tdone,ends);
    thread225864(tdone,ends);
    thread225865(tdone,ends);
    int biggest225866 = 0;
    if(ends[46]>=biggest225866){
      biggest225866=ends[46];
    }
    if(ends[47]>=biggest225866){
      biggest225866=ends[47];
    }
    if(ends[48]>=biggest225866){
      biggest225866=ends[48];
    }
    if(biggest225866 == 1){
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
  }

  public void thread225860(int [] tdone, int [] ends){
        S225259=1;
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

  public void thread225859(int [] tdone, int [] ends){
        S225251=1;
    active[43]=1;
    ends[43]=1;
    tdone[43]=1;
  }

  public void thread225858(int [] tdone, int [] ends){
        S225248=1;
    zoneOcc_thread_42 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_42 = (Integer)(zoneTwoLightingI.getpreval() == null ? 0 : ((Integer)zoneTwoLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S225239=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_42 > 0 && zoneLightInt_thread_42 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneTwoLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneTwoLightONOFF);
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S225239=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread225857(int [] tdone, int [] ends){
        S225328=1;
    test_41.setClear();//sysj\ECS.sysj line: 37, column: 5
    thread225858(tdone,ends);
    thread225859(tdone,ends);
    thread225860(tdone,ends);
    int biggest225861 = 0;
    if(ends[42]>=biggest225861){
      biggest225861=ends[42];
    }
    if(ends[43]>=biggest225861){
      biggest225861=ends[43];
    }
    if(ends[44]>=biggest225861){
      biggest225861=ends[44];
    }
    if(biggest225861 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread225855(int [] tdone, int [] ends){
        S225167=1;
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

  public void thread225854(int [] tdone, int [] ends){
        S225159=1;
    active[39]=1;
    ends[39]=1;
    tdone[39]=1;
  }

  public void thread225853(int [] tdone, int [] ends){
        S225156=1;
    zoneOcc_thread_38 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 41, column: 13
    zoneLightInt_thread_38 = (Integer)(zoneOneLightingI.getpreval() == null ? 0 : ((Integer)zoneOneLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 42, column: 13
    S225147=0;
    if(afterhrs_6.getprestatus() && zoneOcc_thread_38 > 0 && zoneLightInt_thread_38 < 50){//sysj\ECS.sysj line: 44, column: 17
      zoneOneLightONOFF.setPresent();//sysj\ECS.sysj line: 45, column: 17
      currsigs.addElement(zoneOneLightONOFF);
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      S225147=1;
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread225852(int [] tdone, int [] ends){
        S225236=1;
    test_37.setClear();//sysj\ECS.sysj line: 37, column: 5
    thread225853(tdone,ends);
    thread225854(tdone,ends);
    thread225855(tdone,ends);
    int biggest225856 = 0;
    if(ends[38]>=biggest225856){
      biggest225856=ends[38];
    }
    if(ends[39]>=biggest225856){
      biggest225856=ends[39];
    }
    if(ends[40]>=biggest225856){
      biggest225856=ends[40];
    }
    if(biggest225856 == 1){
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
  }

  public void thread225850(int [] tdone, int [] ends){
        S225075=1;
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

  public void thread225849(int [] tdone, int [] ends){
        S225067=1;
    active[35]=1;
    ends[35]=1;
    tdone[35]=1;
  }

  public void thread225848(int [] tdone, int [] ends){
        S225064=1;
    zoneOcc_thread_34 = (Integer)(zoneSevenOccupancy.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_34 = (Integer)(zoneSevenLightingI.getpreval() == null ? 0 : ((Integer)zoneSevenLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S225055=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_34 > 0 && zoneLightInt_thread_34 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneSevenWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneSevenWindowONOFF);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S225055=1;
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread225847(int [] tdone, int [] ends){
        S225144=1;
    test_33.setClear();//sysj\ECS.sysj line: 3, column: 5
    thread225848(tdone,ends);
    thread225849(tdone,ends);
    thread225850(tdone,ends);
    int biggest225851 = 0;
    if(ends[34]>=biggest225851){
      biggest225851=ends[34];
    }
    if(ends[35]>=biggest225851){
      biggest225851=ends[35];
    }
    if(ends[36]>=biggest225851){
      biggest225851=ends[36];
    }
    if(biggest225851 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
  }

  public void thread225845(int [] tdone, int [] ends){
        S224983=1;
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

  public void thread225844(int [] tdone, int [] ends){
        S224975=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread225843(int [] tdone, int [] ends){
        S224972=1;
    zoneOcc_thread_30 = (Integer)(zoneSixOccupancy.getpreval() == null ? 0 : ((Integer)zoneSixOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_30 = (Integer)(zoneSixLightingI.getpreval() == null ? 0 : ((Integer)zoneSixLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S224963=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_30 > 0 && zoneLightInt_thread_30 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneSixWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneSixWindowONOFF);
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S224963=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
  }

  public void thread225842(int [] tdone, int [] ends){
        S225052=1;
    test_29.setClear();//sysj\ECS.sysj line: 3, column: 5
    thread225843(tdone,ends);
    thread225844(tdone,ends);
    thread225845(tdone,ends);
    int biggest225846 = 0;
    if(ends[30]>=biggest225846){
      biggest225846=ends[30];
    }
    if(ends[31]>=biggest225846){
      biggest225846=ends[31];
    }
    if(ends[32]>=biggest225846){
      biggest225846=ends[32];
    }
    if(biggest225846 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread225840(int [] tdone, int [] ends){
        S224891=1;
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

  public void thread225839(int [] tdone, int [] ends){
        S224883=1;
    active[27]=1;
    ends[27]=1;
    tdone[27]=1;
  }

  public void thread225838(int [] tdone, int [] ends){
        S224880=1;
    zoneOcc_thread_26 = (Integer)(zoneFiveOccupancy.getpreval() == null ? 0 : ((Integer)zoneFiveOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_26 = (Integer)(zoneFiveLightingI.getpreval() == null ? 0 : ((Integer)zoneFiveLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S224871=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_26 > 0 && zoneLightInt_thread_26 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneFiveWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneFiveWindowONOFF);
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
    else {
      S224871=1;
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread225837(int [] tdone, int [] ends){
        S224960=1;
    test_25.setClear();//sysj\ECS.sysj line: 3, column: 5
    thread225838(tdone,ends);
    thread225839(tdone,ends);
    thread225840(tdone,ends);
    int biggest225841 = 0;
    if(ends[26]>=biggest225841){
      biggest225841=ends[26];
    }
    if(ends[27]>=biggest225841){
      biggest225841=ends[27];
    }
    if(ends[28]>=biggest225841){
      biggest225841=ends[28];
    }
    if(biggest225841 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread225835(int [] tdone, int [] ends){
        S224799=1;
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

  public void thread225834(int [] tdone, int [] ends){
        S224791=1;
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread225833(int [] tdone, int [] ends){
        S224788=1;
    zoneOcc_thread_22 = (Integer)(zoneFourOccupancy.getpreval() == null ? 0 : ((Integer)zoneFourOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_22 = (Integer)(zoneFourLightingI.getpreval() == null ? 0 : ((Integer)zoneFourLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S224779=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_22 > 0 && zoneLightInt_thread_22 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneFourWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneFourWindowONOFF);
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S224779=1;
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread225832(int [] tdone, int [] ends){
        S224868=1;
    test_21.setClear();//sysj\ECS.sysj line: 3, column: 5
    thread225833(tdone,ends);
    thread225834(tdone,ends);
    thread225835(tdone,ends);
    int biggest225836 = 0;
    if(ends[22]>=biggest225836){
      biggest225836=ends[22];
    }
    if(ends[23]>=biggest225836){
      biggest225836=ends[23];
    }
    if(ends[24]>=biggest225836){
      biggest225836=ends[24];
    }
    if(biggest225836 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread225830(int [] tdone, int [] ends){
        S224707=1;
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

  public void thread225829(int [] tdone, int [] ends){
        S224699=1;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread225828(int [] tdone, int [] ends){
        S224696=1;
    zoneOcc_thread_18 = (Integer)(zoneThreeOccupancy.getpreval() == null ? 0 : ((Integer)zoneThreeOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_18 = (Integer)(zoneThreeLightingI.getpreval() == null ? 0 : ((Integer)zoneThreeLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S224687=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_18 > 0 && zoneLightInt_thread_18 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneThreeWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneThreeWindowONOFF);
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
    else {
      S224687=1;
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread225827(int [] tdone, int [] ends){
        S224776=1;
    test_17.setClear();//sysj\ECS.sysj line: 3, column: 5
    thread225828(tdone,ends);
    thread225829(tdone,ends);
    thread225830(tdone,ends);
    int biggest225831 = 0;
    if(ends[18]>=biggest225831){
      biggest225831=ends[18];
    }
    if(ends[19]>=biggest225831){
      biggest225831=ends[19];
    }
    if(ends[20]>=biggest225831){
      biggest225831=ends[20];
    }
    if(biggest225831 == 1){
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
  }

  public void thread225825(int [] tdone, int [] ends){
        S224615=1;
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

  public void thread225824(int [] tdone, int [] ends){
        S224607=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread225823(int [] tdone, int [] ends){
        S224604=1;
    zoneOcc_thread_14 = (Integer)(zoneTwoOccupancy.getpreval() == null ? 0 : ((Integer)zoneTwoOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_14 = (Integer)(zoneTwoLightingI.getpreval() == null ? 0 : ((Integer)zoneTwoLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S224595=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_14 > 0 && zoneLightInt_thread_14 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneTwoWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneTwoWindowONOFF);
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      S224595=1;
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread225822(int [] tdone, int [] ends){
        S224684=1;
    test_13.setClear();//sysj\ECS.sysj line: 3, column: 5
    thread225823(tdone,ends);
    thread225824(tdone,ends);
    thread225825(tdone,ends);
    int biggest225826 = 0;
    if(ends[14]>=biggest225826){
      biggest225826=ends[14];
    }
    if(ends[15]>=biggest225826){
      biggest225826=ends[15];
    }
    if(ends[16]>=biggest225826){
      biggest225826=ends[16];
    }
    if(biggest225826 == 1){
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread225820(int [] tdone, int [] ends){
        S224523=1;
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

  public void thread225819(int [] tdone, int [] ends){
        S224515=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread225818(int [] tdone, int [] ends){
        S224512=1;
    zoneOcc_thread_10 = (Integer)(zoneOneOccupancy.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy.getpreval()).intValue());//sysj\ECS.sysj line: 7, column: 13
    zoneLightInt_thread_10 = (Integer)(zoneOneLightingI.getpreval() == null ? 0 : ((Integer)zoneOneLightingI.getpreval()).intValue());//sysj\ECS.sysj line: 8, column: 13
    S224503=0;
    if(workhrs_6.getprestatus() && zoneOcc_thread_10 > 0 && zoneLightInt_thread_10 < 50){//sysj\ECS.sysj line: 10, column: 17
      zoneOneWindowONOFF.setPresent();//sysj\ECS.sysj line: 11, column: 17
      currsigs.addElement(zoneOneWindowONOFF);
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      S224503=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread225817(int [] tdone, int [] ends){
        S224592=1;
    test_9.setClear();//sysj\ECS.sysj line: 3, column: 5
    thread225818(tdone,ends);
    thread225819(tdone,ends);
    thread225820(tdone,ends);
    int biggest225821 = 0;
    if(ends[10]>=biggest225821){
      biggest225821=ends[10];
    }
    if(ends[11]>=biggest225821){
      biggest225821=ends[11];
    }
    if(ends[12]>=biggest225821){
      biggest225821=ends[12];
    }
    if(biggest225821 == 1){
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread225816(int [] tdone, int [] ends){
        S225790=1;
    thread225817(tdone,ends);
    thread225822(tdone,ends);
    thread225827(tdone,ends);
    thread225832(tdone,ends);
    thread225837(tdone,ends);
    thread225842(tdone,ends);
    thread225847(tdone,ends);
    thread225852(tdone,ends);
    thread225857(tdone,ends);
    thread225862(tdone,ends);
    thread225867(tdone,ends);
    thread225872(tdone,ends);
    thread225877(tdone,ends);
    thread225882(tdone,ends);
    int biggest225887 = 0;
    if(ends[9]>=biggest225887){
      biggest225887=ends[9];
    }
    if(ends[13]>=biggest225887){
      biggest225887=ends[13];
    }
    if(ends[17]>=biggest225887){
      biggest225887=ends[17];
    }
    if(ends[21]>=biggest225887){
      biggest225887=ends[21];
    }
    if(ends[25]>=biggest225887){
      biggest225887=ends[25];
    }
    if(ends[29]>=biggest225887){
      biggest225887=ends[29];
    }
    if(ends[33]>=biggest225887){
      biggest225887=ends[33];
    }
    if(ends[37]>=biggest225887){
      biggest225887=ends[37];
    }
    if(ends[41]>=biggest225887){
      biggest225887=ends[41];
    }
    if(ends[45]>=biggest225887){
      biggest225887=ends[45];
    }
    if(ends[49]>=biggest225887){
      biggest225887=ends[49];
    }
    if(ends[53]>=biggest225887){
      biggest225887=ends[53];
    }
    if(ends[57]>=biggest225887){
      biggest225887=ends[57];
    }
    if(ends[61]>=biggest225887){
      biggest225887=ends[61];
    }
    if(biggest225887 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest225887 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest225887 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest225887 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest225887 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest225887 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest225887 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest225887 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest225887 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest225887 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest225887 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest225887 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest225887 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    if(biggest225887 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread225815(int [] tdone, int [] ends){
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
      switch(S225792){
        case 0 : 
          S225792=0;
          break RUN;
        
        case 1 : 
          S225792=2;
          S225792=2;
          workhrs_6.setClear();//sysj\ECS.sysj line: 347, column: 4
          afterhrs_6.setClear();//sysj\ECS.sysj line: 347, column: 4
          thread225815(tdone,ends);
          thread225816(tdone,ends);
          int biggest225888 = 0;
          if(ends[7]>=biggest225888){
            biggest225888=ends[7];
          }
          if(ends[8]>=biggest225888){
            biggest225888=ends[8];
          }
          if(biggest225888 == 1){
            active[6]=1;
            ends[6]=1;
            break RUN;
          }
        
        case 2 : 
          workhrs_6.setClear();//sysj\ECS.sysj line: 347, column: 4
          afterhrs_6.setClear();//sysj\ECS.sysj line: 347, column: 4
          thread225889(tdone,ends);
          thread225890(tdone,ends);
          int biggest226074 = 0;
          if(ends[7]>=biggest226074){
            biggest226074=ends[7];
          }
          if(ends[8]>=biggest226074){
            biggest226074=ends[8];
          }
          if(biggest226074 == 1){
            active[6]=1;
            ends[6]=1;
            break RUN;
          }
          //FINXME code
          if(biggest226074 == 0){
            S225792=0;
            active[6]=0;
            ends[6]=0;
            S225792=0;
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
