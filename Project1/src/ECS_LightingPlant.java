import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.ECS_GUI;//sysj\ECS_plant.sysj line: 1, column: 1

public class ECS_LightingPlant extends ClockDomain{
  public ECS_LightingPlant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal zoneOneLightONOFF = new Signal("zoneOneLightONOFF", Signal.INPUT);
  public Signal zoneTwoLightONOFF = new Signal("zoneTwoLightONOFF", Signal.INPUT);
  public Signal zoneThreeLightONOFF = new Signal("zoneThreeLightONOFF", Signal.INPUT);
  public Signal zoneFourLightONOFF = new Signal("zoneFourLightONOFF", Signal.INPUT);
  public Signal zoneFiveLightONOFF = new Signal("zoneFiveLightONOFF", Signal.INPUT);
  public Signal zoneSixLightONOFF = new Signal("zoneSixLightONOFF", Signal.INPUT);
  public Signal zoneSevenLightONOFF = new Signal("zoneSevenLightONOFF", Signal.INPUT);
  public Signal zoneOneWindowONOFF = new Signal("zoneOneWindowONOFF", Signal.INPUT);
  public Signal zoneTwoWindowONOFF = new Signal("zoneTwoWindowONOFF", Signal.INPUT);
  public Signal zoneThreeWindowONOFF = new Signal("zoneThreeWindowONOFF", Signal.INPUT);
  public Signal zoneFourWindowONOFF = new Signal("zoneFourWindowONOFF", Signal.INPUT);
  public Signal zoneFiveWindowONOFF = new Signal("zoneFiveWindowONOFF", Signal.INPUT);
  public Signal zoneSixWindowONOFF = new Signal("zoneSixWindowONOFF", Signal.INPUT);
  public Signal zoneSevenWindowONOFF = new Signal("zoneSevenWindowONOFF", Signal.INPUT);
  public Signal Zone1_Finished = new Signal("Zone1_Finished", Signal.OUTPUT);
  public Signal zoneOneFinished = new Signal("zoneOneFinished", Signal.OUTPUT);
  public Signal zoneTwoFinished = new Signal("zoneTwoFinished", Signal.OUTPUT);
  public Signal zoneThreeFinished = new Signal("zoneThreeFinished", Signal.OUTPUT);
  public Signal zoneFourFinished = new Signal("zoneFourFinished", Signal.OUTPUT);
  public Signal zoneFiveFinished = new Signal("zoneFiveFinished", Signal.OUTPUT);
  public Signal zoneSixFinished = new Signal("zoneSixFinished", Signal.OUTPUT);
  public Signal zoneSevenFinished = new Signal("zoneSevenFinished", Signal.OUTPUT);
  public Signal zoneOneLightONOFF_E = new Signal("zoneOneLightONOFF_E", Signal.OUTPUT);
  public Signal zoneTwoLightONOFF_E = new Signal("zoneTwoLightONOFF_E", Signal.OUTPUT);
  public Signal zoneThreeLightONOFF_E = new Signal("zoneThreeLightONOFF_E", Signal.OUTPUT);
  public Signal zoneFourLightONOFF_E = new Signal("zoneFourLightONOFF_E", Signal.OUTPUT);
  public Signal zoneFiveLightONOFF_E = new Signal("zoneFiveLightONOFF_E", Signal.OUTPUT);
  public Signal zoneSixLightONOFF_E = new Signal("zoneSixLightONOFF_E", Signal.OUTPUT);
  public Signal zoneSevenLightONOFF_E = new Signal("zoneSevenLightONOFF_E", Signal.OUTPUT);
  public Signal zoneOneWindowONOFF_E = new Signal("zoneOneWindowONOFF_E", Signal.OUTPUT);
  public Signal zoneTwoWindowONOFF_E = new Signal("zoneTwoWindowONOFF_E", Signal.OUTPUT);
  public Signal zoneThreeWindowONOFF_E = new Signal("zoneThreeWindowONOFF_E", Signal.OUTPUT);
  public Signal zoneFourWindowONOFF_E = new Signal("zoneFourWindowONOFF_E", Signal.OUTPUT);
  public Signal zoneFiveWindowONOFF_E = new Signal("zoneFiveWindowONOFF_E", Signal.OUTPUT);
  public Signal zoneSixWindowONOFF_E = new Signal("zoneSixWindowONOFF_E", Signal.OUTPUT);
  public Signal zoneSevenWindowONOFF_E = new Signal("zoneSevenWindowONOFF_E", Signal.OUTPUT);
  private int S227133 = 1;
  private int S226915 = 1;
  private int S226923 = 1;
  private int S226931 = 1;
  private int S226939 = 1;
  private int S226947 = 1;
  private int S226955 = 1;
  private int S226963 = 1;
  private int S226971 = 1;
  private int S226979 = 1;
  private int S226987 = 1;
  private int S226995 = 1;
  private int S227003 = 1;
  private int S227011 = 1;
  private int S227019 = 1;
  private int S227027 = 1;
  private int S227035 = 1;
  private int S227043 = 1;
  private int S227051 = 1;
  private int S227059 = 1;
  private int S227067 = 1;
  private int S227075 = 1;
  private int S227083 = 1;
  private int S227091 = 1;
  private int S227099 = 1;
  private int S227107 = 1;
  private int S227115 = 1;
  private int S227123 = 1;
  private int S227131 = 1;
  
  private int[] ends = new int[54];
  private int[] tdone = new int[54];
  
  public void thread227279(int [] tdone, int [] ends){
        switch(S227131){
      case 0 : 
        active[50]=0;
        ends[50]=0;
        tdone[50]=1;
        break;
      
      case 1 : 
        if(zoneSevenWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 288, column: 31
          zoneSevenWindowONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 288, column: 53
          currsigs.addElement(zoneSevenWindowONOFF_E);
          active[50]=1;
          ends[50]=1;
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

  public void thread227278(int [] tdone, int [] ends){
        switch(S227123){
      case 0 : 
        active[49]=0;
        ends[49]=0;
        tdone[49]=1;
        break;
      
      case 1 : 
        if(zoneSixWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 286, column: 31
          zoneSixWindowONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 286, column: 51
          currsigs.addElement(zoneSixWindowONOFF_E);
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
        else {
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
        break;
      
    }
  }

  public void thread227277(int [] tdone, int [] ends){
        switch(S227115){
      case 0 : 
        active[48]=0;
        ends[48]=0;
        tdone[48]=1;
        break;
      
      case 1 : 
        if(zoneFiveWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 284, column: 31
          zoneFiveWindowONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 284, column: 52
          currsigs.addElement(zoneFiveWindowONOFF_E);
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

  public void thread227276(int [] tdone, int [] ends){
        switch(S227107){
      case 0 : 
        active[47]=0;
        ends[47]=0;
        tdone[47]=1;
        break;
      
      case 1 : 
        if(zoneFourWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 282, column: 31
          zoneFourWindowONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 282, column: 52
          currsigs.addElement(zoneFourWindowONOFF_E);
          active[47]=1;
          ends[47]=1;
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

  public void thread227275(int [] tdone, int [] ends){
        switch(S227099){
      case 0 : 
        active[46]=0;
        ends[46]=0;
        tdone[46]=1;
        break;
      
      case 1 : 
        if(zoneThreeWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 280, column: 31
          zoneThreeWindowONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 280, column: 53
          currsigs.addElement(zoneThreeWindowONOFF_E);
          active[46]=1;
          ends[46]=1;
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

  public void thread227274(int [] tdone, int [] ends){
        switch(S227091){
      case 0 : 
        active[45]=0;
        ends[45]=0;
        tdone[45]=1;
        break;
      
      case 1 : 
        if(zoneTwoWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 278, column: 31
          zoneTwoWindowONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 278, column: 51
          currsigs.addElement(zoneTwoWindowONOFF_E);
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
        else {
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
        break;
      
    }
  }

  public void thread227273(int [] tdone, int [] ends){
        switch(S227083){
      case 0 : 
        active[44]=0;
        ends[44]=0;
        tdone[44]=1;
        break;
      
      case 1 : 
        if(zoneOneWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 276, column: 31
          zoneOneWindowONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 276, column: 51
          currsigs.addElement(zoneOneWindowONOFF_E);
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

  public void thread227272(int [] tdone, int [] ends){
        switch(S227075){
      case 0 : 
        active[43]=0;
        ends[43]=0;
        tdone[43]=1;
        break;
      
      case 1 : 
        if(zoneSevenLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 270, column: 31
          zoneSevenLightONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 270, column: 52
          currsigs.addElement(zoneSevenLightONOFF_E);
          active[43]=1;
          ends[43]=1;
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

  public void thread227271(int [] tdone, int [] ends){
        switch(S227067){
      case 0 : 
        active[42]=0;
        ends[42]=0;
        tdone[42]=1;
        break;
      
      case 1 : 
        if(zoneSixLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 268, column: 31
          zoneSixLightONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 268, column: 50
          currsigs.addElement(zoneSixLightONOFF_E);
          active[42]=1;
          ends[42]=1;
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

  public void thread227270(int [] tdone, int [] ends){
        switch(S227059){
      case 0 : 
        active[41]=0;
        ends[41]=0;
        tdone[41]=1;
        break;
      
      case 1 : 
        if(zoneFiveLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 266, column: 31
          zoneFiveLightONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 266, column: 51
          currsigs.addElement(zoneFiveLightONOFF_E);
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
        else {
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
        break;
      
    }
  }

  public void thread227269(int [] tdone, int [] ends){
        switch(S227051){
      case 0 : 
        active[40]=0;
        ends[40]=0;
        tdone[40]=1;
        break;
      
      case 1 : 
        if(zoneFourLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 264, column: 31
          zoneFourLightONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 264, column: 51
          currsigs.addElement(zoneFourLightONOFF_E);
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

  public void thread227268(int [] tdone, int [] ends){
        switch(S227043){
      case 0 : 
        active[39]=0;
        ends[39]=0;
        tdone[39]=1;
        break;
      
      case 1 : 
        if(zoneThreeLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 262, column: 31
          zoneThreeLightONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 262, column: 52
          currsigs.addElement(zoneThreeLightONOFF_E);
          active[39]=1;
          ends[39]=1;
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

  public void thread227267(int [] tdone, int [] ends){
        switch(S227035){
      case 0 : 
        active[38]=0;
        ends[38]=0;
        tdone[38]=1;
        break;
      
      case 1 : 
        if(zoneTwoLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 260, column: 31
          zoneTwoLightONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 260, column: 50
          currsigs.addElement(zoneTwoLightONOFF_E);
          active[38]=1;
          ends[38]=1;
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

  public void thread227266(int [] tdone, int [] ends){
        switch(S227027){
      case 0 : 
        active[37]=0;
        ends[37]=0;
        tdone[37]=1;
        break;
      
      case 1 : 
        if(zoneOneLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 258, column: 31
          zoneOneLightONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 258, column: 50
          currsigs.addElement(zoneOneLightONOFF_E);
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
        else {
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
        break;
      
    }
  }

  public void thread227265(int [] tdone, int [] ends){
        switch(S227019){
      case 0 : 
        active[36]=0;
        ends[36]=0;
        tdone[36]=1;
        break;
      
      case 1 : 
        if(zoneSevenLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 252, column: 21
          System.out.println("After Hours - Zone 7 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 253, column: 15
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

  public void thread227264(int [] tdone, int [] ends){
        switch(S227011){
      case 0 : 
        active[35]=0;
        ends[35]=0;
        tdone[35]=1;
        break;
      
      case 1 : 
        if(zoneSixLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 243, column: 21
          System.out.println("After Hours - Zone 6 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 244, column: 15
          active[35]=1;
          ends[35]=1;
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

  public void thread227263(int [] tdone, int [] ends){
        switch(S227003){
      case 0 : 
        active[34]=0;
        ends[34]=0;
        tdone[34]=1;
        break;
      
      case 1 : 
        if(zoneFiveLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 234, column: 21
          System.out.println("After Hours - Zone 5 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 235, column: 15
          active[34]=1;
          ends[34]=1;
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

  public void thread227262(int [] tdone, int [] ends){
        switch(S226995){
      case 0 : 
        active[33]=0;
        ends[33]=0;
        tdone[33]=1;
        break;
      
      case 1 : 
        if(zoneFourLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 225, column: 21
          System.out.println("After Hours - Zone 4 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 226, column: 15
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
        else {
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
        break;
      
    }
  }

  public void thread227261(int [] tdone, int [] ends){
        switch(S226987){
      case 0 : 
        active[32]=0;
        ends[32]=0;
        tdone[32]=1;
        break;
      
      case 1 : 
        if(zoneThreeLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 216, column: 21
          System.out.println("After Hours - Zone 3 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 217, column: 15
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

  public void thread227260(int [] tdone, int [] ends){
        switch(S226979){
      case 0 : 
        active[31]=0;
        ends[31]=0;
        tdone[31]=1;
        break;
      
      case 1 : 
        if(zoneTwoLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 207, column: 21
          System.out.println("After Hours - Zone 2 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 208, column: 15
          active[31]=1;
          ends[31]=1;
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

  public void thread227259(int [] tdone, int [] ends){
        switch(S226971){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        if(zoneOneLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 199, column: 21
          System.out.println("After Hours - Zone 1 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 200, column: 15
          active[30]=1;
          ends[30]=1;
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

  public void thread227258(int [] tdone, int [] ends){
        switch(S226963){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        if(zoneSevenWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 186, column: 21
          System.out.println("Work Hours - Zone 7 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 187, column: 15
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
        else {
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
        break;
      
    }
  }

  public void thread227257(int [] tdone, int [] ends){
        switch(S226955){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        if(zoneSixWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 178, column: 21
          System.out.println("Work Hours - Zone 6 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 179, column: 15
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

  public void thread227256(int [] tdone, int [] ends){
        switch(S226947){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        if(zoneFiveWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 170, column: 21
          System.out.println("Work Hours - Zone 5 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 171, column: 15
          active[27]=1;
          ends[27]=1;
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

  public void thread227255(int [] tdone, int [] ends){
        switch(S226939){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        if(zoneFourWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 162, column: 21
          System.out.println("Work Hours - Zone 4 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 163, column: 15
          active[26]=1;
          ends[26]=1;
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

  public void thread227254(int [] tdone, int [] ends){
        switch(S226931){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        if(zoneThreeWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 154, column: 21
          System.out.println("Work Hours - Zone 3 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 155, column: 15
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
        else {
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
        break;
      
    }
  }

  public void thread227253(int [] tdone, int [] ends){
        switch(S226923){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        if(zoneTwoWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 146, column: 21
          System.out.println("Work Hours - Zone 2 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 147, column: 15
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

  public void thread227252(int [] tdone, int [] ends){
        switch(S226915){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        if(zoneOneWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 139, column: 21
          System.out.println("Work Hours - Zone 1 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 140, column: 15
          active[23]=1;
          ends[23]=1;
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

  public void thread227250(int [] tdone, int [] ends){
        S227131=1;
    if(zoneSevenWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 288, column: 31
      zoneSevenWindowONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 288, column: 53
      currsigs.addElement(zoneSevenWindowONOFF_E);
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
    else {
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
  }

  public void thread227249(int [] tdone, int [] ends){
        S227123=1;
    if(zoneSixWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 286, column: 31
      zoneSixWindowONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 286, column: 51
      currsigs.addElement(zoneSixWindowONOFF_E);
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
    else {
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
  }

  public void thread227248(int [] tdone, int [] ends){
        S227115=1;
    if(zoneFiveWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 284, column: 31
      zoneFiveWindowONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 284, column: 52
      currsigs.addElement(zoneFiveWindowONOFF_E);
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

  public void thread227247(int [] tdone, int [] ends){
        S227107=1;
    if(zoneFourWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 282, column: 31
      zoneFourWindowONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 282, column: 52
      currsigs.addElement(zoneFourWindowONOFF_E);
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
    else {
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
  }

  public void thread227246(int [] tdone, int [] ends){
        S227099=1;
    if(zoneThreeWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 280, column: 31
      zoneThreeWindowONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 280, column: 53
      currsigs.addElement(zoneThreeWindowONOFF_E);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
  }

  public void thread227245(int [] tdone, int [] ends){
        S227091=1;
    if(zoneTwoWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 278, column: 31
      zoneTwoWindowONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 278, column: 51
      currsigs.addElement(zoneTwoWindowONOFF_E);
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
  }

  public void thread227244(int [] tdone, int [] ends){
        S227083=1;
    if(zoneOneWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 276, column: 31
      zoneOneWindowONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 276, column: 51
      currsigs.addElement(zoneOneWindowONOFF_E);
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

  public void thread227243(int [] tdone, int [] ends){
        S227075=1;
    if(zoneSevenLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 270, column: 31
      zoneSevenLightONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 270, column: 52
      currsigs.addElement(zoneSevenLightONOFF_E);
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
  }

  public void thread227242(int [] tdone, int [] ends){
        S227067=1;
    if(zoneSixLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 268, column: 31
      zoneSixLightONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 268, column: 50
      currsigs.addElement(zoneSixLightONOFF_E);
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread227241(int [] tdone, int [] ends){
        S227059=1;
    if(zoneFiveLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 266, column: 31
      zoneFiveLightONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 266, column: 51
      currsigs.addElement(zoneFiveLightONOFF_E);
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
    else {
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread227240(int [] tdone, int [] ends){
        S227051=1;
    if(zoneFourLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 264, column: 31
      zoneFourLightONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 264, column: 51
      currsigs.addElement(zoneFourLightONOFF_E);
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

  public void thread227239(int [] tdone, int [] ends){
        S227043=1;
    if(zoneThreeLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 262, column: 31
      zoneThreeLightONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 262, column: 52
      currsigs.addElement(zoneThreeLightONOFF_E);
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
  }

  public void thread227238(int [] tdone, int [] ends){
        S227035=1;
    if(zoneTwoLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 260, column: 31
      zoneTwoLightONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 260, column: 50
      currsigs.addElement(zoneTwoLightONOFF_E);
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread227237(int [] tdone, int [] ends){
        S227027=1;
    if(zoneOneLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 258, column: 31
      zoneOneLightONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 258, column: 50
      currsigs.addElement(zoneOneLightONOFF_E);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
  }

  public void thread227236(int [] tdone, int [] ends){
        S227019=1;
    active[36]=1;
    ends[36]=1;
    tdone[36]=1;
  }

  public void thread227235(int [] tdone, int [] ends){
        S227011=1;
    active[35]=1;
    ends[35]=1;
    tdone[35]=1;
  }

  public void thread227234(int [] tdone, int [] ends){
        S227003=1;
    active[34]=1;
    ends[34]=1;
    tdone[34]=1;
  }

  public void thread227233(int [] tdone, int [] ends){
        S226995=1;
    active[33]=1;
    ends[33]=1;
    tdone[33]=1;
  }

  public void thread227232(int [] tdone, int [] ends){
        S226987=1;
    active[32]=1;
    ends[32]=1;
    tdone[32]=1;
  }

  public void thread227231(int [] tdone, int [] ends){
        S226979=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread227230(int [] tdone, int [] ends){
        S226971=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread227229(int [] tdone, int [] ends){
        S226963=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread227228(int [] tdone, int [] ends){
        S226955=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread227227(int [] tdone, int [] ends){
        S226947=1;
    active[27]=1;
    ends[27]=1;
    tdone[27]=1;
  }

  public void thread227226(int [] tdone, int [] ends){
        S226939=1;
    active[26]=1;
    ends[26]=1;
    tdone[26]=1;
  }

  public void thread227225(int [] tdone, int [] ends){
        S226931=1;
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread227224(int [] tdone, int [] ends){
        S226923=1;
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread227223(int [] tdone, int [] ends){
        S226915=1;
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S227133){
        case 0 : 
          S227133=0;
          break RUN;
        
        case 1 : 
          S227133=2;
          S227133=2;
          thread227223(tdone,ends);
          thread227224(tdone,ends);
          thread227225(tdone,ends);
          thread227226(tdone,ends);
          thread227227(tdone,ends);
          thread227228(tdone,ends);
          thread227229(tdone,ends);
          thread227230(tdone,ends);
          thread227231(tdone,ends);
          thread227232(tdone,ends);
          thread227233(tdone,ends);
          thread227234(tdone,ends);
          thread227235(tdone,ends);
          thread227236(tdone,ends);
          thread227237(tdone,ends);
          thread227238(tdone,ends);
          thread227239(tdone,ends);
          thread227240(tdone,ends);
          thread227241(tdone,ends);
          thread227242(tdone,ends);
          thread227243(tdone,ends);
          thread227244(tdone,ends);
          thread227245(tdone,ends);
          thread227246(tdone,ends);
          thread227247(tdone,ends);
          thread227248(tdone,ends);
          thread227249(tdone,ends);
          thread227250(tdone,ends);
          int biggest227251 = 0;
          if(ends[23]>=biggest227251){
            biggest227251=ends[23];
          }
          if(ends[24]>=biggest227251){
            biggest227251=ends[24];
          }
          if(ends[25]>=biggest227251){
            biggest227251=ends[25];
          }
          if(ends[26]>=biggest227251){
            biggest227251=ends[26];
          }
          if(ends[27]>=biggest227251){
            biggest227251=ends[27];
          }
          if(ends[28]>=biggest227251){
            biggest227251=ends[28];
          }
          if(ends[29]>=biggest227251){
            biggest227251=ends[29];
          }
          if(ends[30]>=biggest227251){
            biggest227251=ends[30];
          }
          if(ends[31]>=biggest227251){
            biggest227251=ends[31];
          }
          if(ends[32]>=biggest227251){
            biggest227251=ends[32];
          }
          if(ends[33]>=biggest227251){
            biggest227251=ends[33];
          }
          if(ends[34]>=biggest227251){
            biggest227251=ends[34];
          }
          if(ends[35]>=biggest227251){
            biggest227251=ends[35];
          }
          if(ends[36]>=biggest227251){
            biggest227251=ends[36];
          }
          if(ends[37]>=biggest227251){
            biggest227251=ends[37];
          }
          if(ends[38]>=biggest227251){
            biggest227251=ends[38];
          }
          if(ends[39]>=biggest227251){
            biggest227251=ends[39];
          }
          if(ends[40]>=biggest227251){
            biggest227251=ends[40];
          }
          if(ends[41]>=biggest227251){
            biggest227251=ends[41];
          }
          if(ends[42]>=biggest227251){
            biggest227251=ends[42];
          }
          if(ends[43]>=biggest227251){
            biggest227251=ends[43];
          }
          if(ends[44]>=biggest227251){
            biggest227251=ends[44];
          }
          if(ends[45]>=biggest227251){
            biggest227251=ends[45];
          }
          if(ends[46]>=biggest227251){
            biggest227251=ends[46];
          }
          if(ends[47]>=biggest227251){
            biggest227251=ends[47];
          }
          if(ends[48]>=biggest227251){
            biggest227251=ends[48];
          }
          if(ends[49]>=biggest227251){
            biggest227251=ends[49];
          }
          if(ends[50]>=biggest227251){
            biggest227251=ends[50];
          }
          if(biggest227251 == 1){
            active[22]=1;
            ends[22]=1;
            break RUN;
          }
        
        case 2 : 
          thread227252(tdone,ends);
          thread227253(tdone,ends);
          thread227254(tdone,ends);
          thread227255(tdone,ends);
          thread227256(tdone,ends);
          thread227257(tdone,ends);
          thread227258(tdone,ends);
          thread227259(tdone,ends);
          thread227260(tdone,ends);
          thread227261(tdone,ends);
          thread227262(tdone,ends);
          thread227263(tdone,ends);
          thread227264(tdone,ends);
          thread227265(tdone,ends);
          thread227266(tdone,ends);
          thread227267(tdone,ends);
          thread227268(tdone,ends);
          thread227269(tdone,ends);
          thread227270(tdone,ends);
          thread227271(tdone,ends);
          thread227272(tdone,ends);
          thread227273(tdone,ends);
          thread227274(tdone,ends);
          thread227275(tdone,ends);
          thread227276(tdone,ends);
          thread227277(tdone,ends);
          thread227278(tdone,ends);
          thread227279(tdone,ends);
          int biggest227280 = 0;
          if(ends[23]>=biggest227280){
            biggest227280=ends[23];
          }
          if(ends[24]>=biggest227280){
            biggest227280=ends[24];
          }
          if(ends[25]>=biggest227280){
            biggest227280=ends[25];
          }
          if(ends[26]>=biggest227280){
            biggest227280=ends[26];
          }
          if(ends[27]>=biggest227280){
            biggest227280=ends[27];
          }
          if(ends[28]>=biggest227280){
            biggest227280=ends[28];
          }
          if(ends[29]>=biggest227280){
            biggest227280=ends[29];
          }
          if(ends[30]>=biggest227280){
            biggest227280=ends[30];
          }
          if(ends[31]>=biggest227280){
            biggest227280=ends[31];
          }
          if(ends[32]>=biggest227280){
            biggest227280=ends[32];
          }
          if(ends[33]>=biggest227280){
            biggest227280=ends[33];
          }
          if(ends[34]>=biggest227280){
            biggest227280=ends[34];
          }
          if(ends[35]>=biggest227280){
            biggest227280=ends[35];
          }
          if(ends[36]>=biggest227280){
            biggest227280=ends[36];
          }
          if(ends[37]>=biggest227280){
            biggest227280=ends[37];
          }
          if(ends[38]>=biggest227280){
            biggest227280=ends[38];
          }
          if(ends[39]>=biggest227280){
            biggest227280=ends[39];
          }
          if(ends[40]>=biggest227280){
            biggest227280=ends[40];
          }
          if(ends[41]>=biggest227280){
            biggest227280=ends[41];
          }
          if(ends[42]>=biggest227280){
            biggest227280=ends[42];
          }
          if(ends[43]>=biggest227280){
            biggest227280=ends[43];
          }
          if(ends[44]>=biggest227280){
            biggest227280=ends[44];
          }
          if(ends[45]>=biggest227280){
            biggest227280=ends[45];
          }
          if(ends[46]>=biggest227280){
            biggest227280=ends[46];
          }
          if(ends[47]>=biggest227280){
            biggest227280=ends[47];
          }
          if(ends[48]>=biggest227280){
            biggest227280=ends[48];
          }
          if(ends[49]>=biggest227280){
            biggest227280=ends[49];
          }
          if(ends[50]>=biggest227280){
            biggest227280=ends[50];
          }
          if(biggest227280 == 1){
            active[22]=1;
            ends[22]=1;
            break RUN;
          }
          //FINXME code
          if(biggest227280 == 0){
            S227133=0;
            active[22]=0;
            ends[22]=0;
            S227133=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[22] != 0){
      int index = 22;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[22]!=0 || suspended[22]!=0 || active[22]!=1);
      else{
        if(!df){
          zoneOneLightONOFF.gethook();
          zoneTwoLightONOFF.gethook();
          zoneThreeLightONOFF.gethook();
          zoneFourLightONOFF.gethook();
          zoneFiveLightONOFF.gethook();
          zoneSixLightONOFF.gethook();
          zoneSevenLightONOFF.gethook();
          zoneOneWindowONOFF.gethook();
          zoneTwoWindowONOFF.gethook();
          zoneThreeWindowONOFF.gethook();
          zoneFourWindowONOFF.gethook();
          zoneFiveWindowONOFF.gethook();
          zoneSixWindowONOFF.gethook();
          zoneSevenWindowONOFF.gethook();
          df = true;
        }
        runClockDomain();
      }
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
      Zone1_Finished.setpreclear();
      zoneOneFinished.setpreclear();
      zoneTwoFinished.setpreclear();
      zoneThreeFinished.setpreclear();
      zoneFourFinished.setpreclear();
      zoneFiveFinished.setpreclear();
      zoneSixFinished.setpreclear();
      zoneSevenFinished.setpreclear();
      zoneOneLightONOFF_E.setpreclear();
      zoneTwoLightONOFF_E.setpreclear();
      zoneThreeLightONOFF_E.setpreclear();
      zoneFourLightONOFF_E.setpreclear();
      zoneFiveLightONOFF_E.setpreclear();
      zoneSixLightONOFF_E.setpreclear();
      zoneSevenLightONOFF_E.setpreclear();
      zoneOneWindowONOFF_E.setpreclear();
      zoneTwoWindowONOFF_E.setpreclear();
      zoneThreeWindowONOFF_E.setpreclear();
      zoneFourWindowONOFF_E.setpreclear();
      zoneFiveWindowONOFF_E.setpreclear();
      zoneSixWindowONOFF_E.setpreclear();
      zoneSevenWindowONOFF_E.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = zoneOneLightONOFF.getStatus() ? zoneOneLightONOFF.setprepresent() : zoneOneLightONOFF.setpreclear();
      zoneOneLightONOFF.setpreval(zoneOneLightONOFF.getValue());
      zoneOneLightONOFF.setClear();
      dummyint = zoneTwoLightONOFF.getStatus() ? zoneTwoLightONOFF.setprepresent() : zoneTwoLightONOFF.setpreclear();
      zoneTwoLightONOFF.setpreval(zoneTwoLightONOFF.getValue());
      zoneTwoLightONOFF.setClear();
      dummyint = zoneThreeLightONOFF.getStatus() ? zoneThreeLightONOFF.setprepresent() : zoneThreeLightONOFF.setpreclear();
      zoneThreeLightONOFF.setpreval(zoneThreeLightONOFF.getValue());
      zoneThreeLightONOFF.setClear();
      dummyint = zoneFourLightONOFF.getStatus() ? zoneFourLightONOFF.setprepresent() : zoneFourLightONOFF.setpreclear();
      zoneFourLightONOFF.setpreval(zoneFourLightONOFF.getValue());
      zoneFourLightONOFF.setClear();
      dummyint = zoneFiveLightONOFF.getStatus() ? zoneFiveLightONOFF.setprepresent() : zoneFiveLightONOFF.setpreclear();
      zoneFiveLightONOFF.setpreval(zoneFiveLightONOFF.getValue());
      zoneFiveLightONOFF.setClear();
      dummyint = zoneSixLightONOFF.getStatus() ? zoneSixLightONOFF.setprepresent() : zoneSixLightONOFF.setpreclear();
      zoneSixLightONOFF.setpreval(zoneSixLightONOFF.getValue());
      zoneSixLightONOFF.setClear();
      dummyint = zoneSevenLightONOFF.getStatus() ? zoneSevenLightONOFF.setprepresent() : zoneSevenLightONOFF.setpreclear();
      zoneSevenLightONOFF.setpreval(zoneSevenLightONOFF.getValue());
      zoneSevenLightONOFF.setClear();
      dummyint = zoneOneWindowONOFF.getStatus() ? zoneOneWindowONOFF.setprepresent() : zoneOneWindowONOFF.setpreclear();
      zoneOneWindowONOFF.setpreval(zoneOneWindowONOFF.getValue());
      zoneOneWindowONOFF.setClear();
      dummyint = zoneTwoWindowONOFF.getStatus() ? zoneTwoWindowONOFF.setprepresent() : zoneTwoWindowONOFF.setpreclear();
      zoneTwoWindowONOFF.setpreval(zoneTwoWindowONOFF.getValue());
      zoneTwoWindowONOFF.setClear();
      dummyint = zoneThreeWindowONOFF.getStatus() ? zoneThreeWindowONOFF.setprepresent() : zoneThreeWindowONOFF.setpreclear();
      zoneThreeWindowONOFF.setpreval(zoneThreeWindowONOFF.getValue());
      zoneThreeWindowONOFF.setClear();
      dummyint = zoneFourWindowONOFF.getStatus() ? zoneFourWindowONOFF.setprepresent() : zoneFourWindowONOFF.setpreclear();
      zoneFourWindowONOFF.setpreval(zoneFourWindowONOFF.getValue());
      zoneFourWindowONOFF.setClear();
      dummyint = zoneFiveWindowONOFF.getStatus() ? zoneFiveWindowONOFF.setprepresent() : zoneFiveWindowONOFF.setpreclear();
      zoneFiveWindowONOFF.setpreval(zoneFiveWindowONOFF.getValue());
      zoneFiveWindowONOFF.setClear();
      dummyint = zoneSixWindowONOFF.getStatus() ? zoneSixWindowONOFF.setprepresent() : zoneSixWindowONOFF.setpreclear();
      zoneSixWindowONOFF.setpreval(zoneSixWindowONOFF.getValue());
      zoneSixWindowONOFF.setClear();
      dummyint = zoneSevenWindowONOFF.getStatus() ? zoneSevenWindowONOFF.setprepresent() : zoneSevenWindowONOFF.setpreclear();
      zoneSevenWindowONOFF.setpreval(zoneSevenWindowONOFF.getValue());
      zoneSevenWindowONOFF.setClear();
      Zone1_Finished.sethook();
      Zone1_Finished.setClear();
      zoneOneFinished.sethook();
      zoneOneFinished.setClear();
      zoneTwoFinished.sethook();
      zoneTwoFinished.setClear();
      zoneThreeFinished.sethook();
      zoneThreeFinished.setClear();
      zoneFourFinished.sethook();
      zoneFourFinished.setClear();
      zoneFiveFinished.sethook();
      zoneFiveFinished.setClear();
      zoneSixFinished.sethook();
      zoneSixFinished.setClear();
      zoneSevenFinished.sethook();
      zoneSevenFinished.setClear();
      zoneOneLightONOFF_E.sethook();
      zoneOneLightONOFF_E.setClear();
      zoneTwoLightONOFF_E.sethook();
      zoneTwoLightONOFF_E.setClear();
      zoneThreeLightONOFF_E.sethook();
      zoneThreeLightONOFF_E.setClear();
      zoneFourLightONOFF_E.sethook();
      zoneFourLightONOFF_E.setClear();
      zoneFiveLightONOFF_E.sethook();
      zoneFiveLightONOFF_E.setClear();
      zoneSixLightONOFF_E.sethook();
      zoneSixLightONOFF_E.setClear();
      zoneSevenLightONOFF_E.sethook();
      zoneSevenLightONOFF_E.setClear();
      zoneOneWindowONOFF_E.sethook();
      zoneOneWindowONOFF_E.setClear();
      zoneTwoWindowONOFF_E.sethook();
      zoneTwoWindowONOFF_E.setClear();
      zoneThreeWindowONOFF_E.sethook();
      zoneThreeWindowONOFF_E.setClear();
      zoneFourWindowONOFF_E.sethook();
      zoneFourWindowONOFF_E.setClear();
      zoneFiveWindowONOFF_E.sethook();
      zoneFiveWindowONOFF_E.setClear();
      zoneSixWindowONOFF_E.sethook();
      zoneSixWindowONOFF_E.setClear();
      zoneSevenWindowONOFF_E.sethook();
      zoneSevenWindowONOFF_E.setClear();
      if(paused[22]!=0 || suspended[22]!=0 || active[22]!=1);
      else{
        zoneOneLightONOFF.gethook();
        zoneTwoLightONOFF.gethook();
        zoneThreeLightONOFF.gethook();
        zoneFourLightONOFF.gethook();
        zoneFiveLightONOFF.gethook();
        zoneSixLightONOFF.gethook();
        zoneSevenLightONOFF.gethook();
        zoneOneWindowONOFF.gethook();
        zoneTwoWindowONOFF.gethook();
        zoneThreeWindowONOFF.gethook();
        zoneFourWindowONOFF.gethook();
        zoneFiveWindowONOFF.gethook();
        zoneSixWindowONOFF.gethook();
        zoneSevenWindowONOFF.gethook();
      }
      runFinisher();
      if(active[22] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
